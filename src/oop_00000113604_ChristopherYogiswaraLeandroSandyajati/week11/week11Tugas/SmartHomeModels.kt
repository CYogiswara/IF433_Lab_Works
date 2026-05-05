package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week11.week11Tugas

data class SmartDevice(var name: String? = "", var category: String? = "", var isOnline: Boolean = false, var powerLoad: Int? = 0)

fun SmartDevice.diagnose(): String {
    return "[DIAGNOSTIK] $name | Category:\n $category | Status: ${if (isOnline) "Online" else "Offline"} | Daya: $powerLoad Watt"
}