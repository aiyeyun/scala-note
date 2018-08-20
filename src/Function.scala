/**
  * 函数 与 方法
  * Scala 方法与函数
  *
  * Scala 有方法与函数，二者在语义上的区别很小。Scala 方法是类的一部分，而函数是一个对象可以赋值给一个变量。换句话来说在类中定义的函数即是方法。
  * Scala 中的方法跟 Java 的类似，方法是组成类的一部分。
  * Scala 中的函数则是一个完整的对象，Scala 中的函数其实就是继承了 Trait 的类的对象。
  * Scala 中使用 val 语句可以定义函数，def 语句定义方法。
  *
  */
object Function {
    
    
    def main(args: Array[String]): Unit = {
        // 有返回值的方法
        println(returnString("这是字符串"))
        // 无返回值的方法
        printlnString("打印字符串吧")
        
        delayed(time())
        
        // 指定函数参数名 不需要按照顺序传值
        printlnInt(b = 123, a = 321)
        
        // 可变参数
        printlnString("字符串1", "字符串2", "字符串3")
    }
    
    /**
      * 方法声明
      * @param str
      * @return
      */
    def returnString(str: String): String = {
        return str
    }
    
    /**
      * 方法声明 无返回值
      * @param str
      */
    def printlnString(str: String): Unit = {
        println(str)
    }
    
    /**
      * 获取时间
      * @return
      */
    def time() = {
        println("获取时间，单位为纳秒")
        System.nanoTime()
    }
    
    def delayed(t: Long) = {
        println("在 delayed 方法内")
        println("参数： " + t)
        t
    }
    
    /**
      * Scala 指定函数参数名 不需要按照顺序
      * @param a
      * @param b
      */
    def printlnInt(a: Int, b: Int) = {
        println("Value of a : " + a)
        println("Value of b : " + b)
    }
    
    /**
      * 可变参数
      * @param args
      */
    def printlnString(args: String*) = {
        for (arg <- args) {
            println(arg)
        }
    }
}
