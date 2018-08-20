/**
  * 变量
  */
object Var {
    
    def main(args: Array[String]): Unit = {
        
        // 字符串变量类型 申明变量类型
        var str1 : String = "字符串类型 变量1"
        println("字符串变量: " + str1)
        // 改变 str1 变量的值
        str1 = "字符串类型 变量2"
        println("改变后的 字符串变量: " + str1)
        
        // int变量类型 未申明类型
        var int1 = 1
        println("int变量: " + int1)
        // 改变 int1 变量的值
        int1 = 2
        println("改变后的 int变量: " + int1)
        
    }
    
}
