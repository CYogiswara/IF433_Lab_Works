package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week08

class NotificationService {
    fun sendEmail(emailAddress: String){
        println("Mengirim email ke $emailAddress")
    }

    fun processUser(user: UserProfile){
        if(user.email != null){
            sendEmail(user.email)
        }else{
            println("USer ${user.nama}")
        }
    }
}