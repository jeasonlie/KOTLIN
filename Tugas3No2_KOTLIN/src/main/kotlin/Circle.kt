class Circle (val radius: Double) : Shape {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }
}