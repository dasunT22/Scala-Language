object Q2 {
    def main(args:Array[String]):Unit={
    var a:Int = 2
    var b:Int = 3
    var c:Int = 4
    var d:Int = 5
    var k:Float = 4.3f
    var g:Float=4.0f
    

    def funcone() :Unit={
        b-=1
        println(b * a + c * d)
        d-=1
    }

    def functwo() :Unit={
        println(a)
        a += 1
    }

    def functhree() :Unit={
      println(-2 * (g - k) + c)
    }

    def funcfour() :Unit={
      println(c)
      c += 1
    }

    def funcfive() :Unit={
      c += 1
      c=c*a
      println(c)
      a+=1
    }

    funcone()
    functwo()
    functhree()
    funcfour()
    funcfive()
    }
}
