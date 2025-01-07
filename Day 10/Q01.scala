object  Rational{

class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")

    private val gcd = greatestCommonDivisor(n.abs, d.abs)
    val numer: Int = n / gcd
    val denom: Int = d / gcd

    def neg: Rational = new Rational(-numer, denom)

    override def toString: String = s"$numer/$denom"

    private def greatestCommonDivisor(a: Int, b: Int): Int = {
        if (b == 0) a else greatestCommonDivisor(b, a % b)
    }
}

def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = x.neg
    println(s"Original: $x, Negated: $y")
}

}