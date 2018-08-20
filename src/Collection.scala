import scala.collection.immutable

/**
  * 集合
  */
object Collection {
    
    def main(args: Array[String]): Unit = {
        // list 类型
        ListNote()
    }
    
    def ListNote() = {
        // 字符串列表
        val site: List[String] = List("val1", "val2")
        
        // 整型列表
        val nums: List[Int] = List(1,2,3)
        
        // 空列表
        val empty: List[Nothing] = List()
        
        // 二维列表
        val dim: List[List[Int]] = List(
            List(1,2,3),
            List(4,5,6),
            List(7,8,9)
        )
        
        dim.foreach(println)
    }
    
}
