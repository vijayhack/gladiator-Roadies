object Roadies {

  def checkContain (main_str:String, sub_str:String): Boolean ={

    val digits = main_str.length
    var flag_contain :Boolean = false

    for (n <- 0 until digits ) {
      if (sub_str.contains(main_str(n))) {
        flag_contain = true
      }
    }

    flag_contain
  }

  def main ( args: Array[String] ): Unit = {

    import scala.util.control.Breaks._

    var records: Int = 0
    records = scala.io.StdIn.readLine().toInt

    val test_case = new Array[String](records * 2)

    var record_ins_cnt: Int = 0

    for (i <- 1 to records) {
      test_case(record_ins_cnt) = scala.io.StdIn.readLine()
      record_ins_cnt += 1
      test_case(record_ins_cnt) = scala.io.StdIn.readLine()
      record_ins_cnt += 1
    }

    var j = 0
    var columns: Int = 0

    var str:String =""
    var digits = 0
    var sums = "0"

      while (j < record_ins_cnt) {
        columns = test_case(j).toInt
        j += 1
        val box_nums = test_case(j).split(" +").sorted.reverse
        j += 1
        box_nums.foreach(print(_))
        println()
        val box_len = box_nums.length
        for (i <- 0 until box_len) {
          val main_str = box_nums(i)
          for (m <- i + 1 until (box_len - i)) {
            checkContain(main_str,box_nums(m))
              str = box_nums(m)
              println("Main :" + main_str + " Com :" + str)

                for (n <- 0 until main_str.length) {
                  if (str.contains(main_str(n))) {
                    flag_contain = true
                  }
                }

              println("Out of for")
              if (flag_contain) {
                println(main_str + " Contains " + str)
              }
            }
       }



    }



    /*
      //for ( vu <- newTickets_1){ print(vu+" ")}
      //println()
      val tickets_0 = box_nums.sorted.reverse

      //for( vu <- newTickets){ print(vu+" ")}
      j += 1

      val tickets = for ( x <- tickets_0  if x != 0  ) yield x
      //val t_distinct = tickets.distinct
      //  t_distinct.foreach(print(_+" " ))
      //   println()
      val len = tickets.length
      //println("length:"+len)
      breakable {
        if ( len == 0 ){ println(0);break}
        if ( len <= 2 ) {
          println(tickets(0)); break
        }

        var t_index = 0
        val count_0 = tickets.count(_ == tickets(t_index))
        t_index += count_0

        if ( count_0 > 1 &&  count_0 == len ){
          println(tickets(0)); break
        }

        if (count_0 > 1  ) {
          if ( (t_index+2) <= len) {
            if (tickets(0) > (tickets(t_index) + tickets(t_index + 1))) {
              println(tickets(0));
              break
            } else {
              println(tickets(t_index) + "" + tickets(0));
              break
            }
          }else {
            println(tickets(0)); break
          }

        }

        if (tickets(0) > (tickets(t_index) + tickets(t_index + 1))) {
          println(tickets(0));  break
        }

        val count_1 = tickets.count(_ == tickets(t_index))
        if (count_1 > 1) {
          println(tickets(t_index) + "" + tickets(t_index));  break
        }

        println(tickets(2) + "" + tickets(0))

      }
    */
  }
}
