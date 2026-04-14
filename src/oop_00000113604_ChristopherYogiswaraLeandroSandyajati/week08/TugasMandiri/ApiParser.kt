package oop_00000113604_ChristopherYogiswaraLeandroSandyajati.week08.TugasMandiri

class ApiParser(){
    fun parseProduct(rawJson: Map<String, Any?>): Product?{
        val id = requireNotNull(rawJson["id"]){"API invalid: ID!"}.toString()
        val name = requireNotNull(rawJson["name"]){"API invalid: Name!"}.toString()

        val type = rawJson["type"] as? String

        return when (type){
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }

            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }
}