package th.ac.su.ict.foodlovers.data

data class Food(
    val imageFile: String,
    val foodName: String,
    val caption: String,
    val description: String,
    val price: Double,
    val scariness: Int
)