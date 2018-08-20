/**
  * 数组
  */
object ArrayNote {
    
    def main(args: Array[String]): Unit = {
        // 声明数组
        var ary:Array[String] = new Array[String](3)
        // 或者 这样声明
        var ary2 = new Array[String](3)
        
        // 给数组设定值
        ary(0) = "数组下标0"
        ary(1) = "数组下标1"
        ary(2) = "数组下标2"
        
        // 或者 也可以这样声明
        var ary3 = Array("下标0", "下标1", "下标2")
        
        // 遍历数组
        for (x <- ary3) {
            println(x)
        }
    
        // 计算数组长度
        println("数组长度 " + ary3.length)
    
        // 遍历数组 0 到 数组长度
        var total = 0
        for ( i <- 0 to (ary3.length - 1)) {
            println(ary3(i))
        }
    }
    
    
}
