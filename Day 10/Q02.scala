object  Rational{

class Rational(n: Int, d: Int) {

require(d != 0, "Denominator cannot be zero")
    val numer: Int = n
    val denom: Int = d


def sub(that: Rational): Rational = {
    val newNumer = this.numer * that.denom - that.numer * this.denom
    val newDenom = this.denom * that.denom
    new Rational(newNumer, newDenom)
}

override def toString: String = s"$numer/$denom"

}

def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    val result = x.sub(y).sub(z)
    print(s"Result of x - y - z: $result")
}

}