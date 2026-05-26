package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week14.TugasMandiri14
import java.io.File
import java.io.FileWriter

interface OrderRepository{
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository(): OrderRepository{
    private val file = File("Orders.csv")
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String){
        FileWriter(file, true).use { writer ->
            writer.write("$itemName,$finalPrice,$customerType\n")
        }
    }
}

interface NotificationService{
    fun sendNotification(itemName: String)
}

class emailNotifier: NotificationService{
    override fun sendNotification(itemName: String) {
        println("email terkirim: $itemName")
    }
}

class safeOrderProcessor(
    private val repo: OrderRepository,
    private val notifer: NotificationService
){
    fun processOrder(itemName: String, basePrice: Double, customerType: String){
        val finalPrice = when (customerType) {
            "REGULER" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }
        println("memperose pesanan $itemName, seharga: $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifer.sendNotification(itemName)
    }
}

class BadOrderProcessor {
    // VIOLATION: Hardcoded File I/O (DIP), Melakukan kalkulasi + I/O + Notifikasi sekaligus
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {

        // VIOLATION: Kaku jika ada tipe customer/diskon baru di masa depan (OCP)
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90 // Diskon 10%
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        // VIOLATION SRP/DIP: Menulis file langsung di class bisnis
        file.appendText("$itemName,$finalPrice,$customerType\n")

        // VIOLATION SRP/DIP: Notifikasi terikat kuat dengan sistem order
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}