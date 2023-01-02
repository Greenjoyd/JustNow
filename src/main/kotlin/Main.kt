import java.util.Scanner

fun main(args: Array<String>) {
   println("Введите время в секундах")
   val time = readln()
   val timeToInt = time.toInt()
   val minutes = timeToInt/60
   val hours = minutes/60


   fun wordForMinutes(): String {
      if (minutes==11){
         return "минут"
      }
      when (minutes%10){
         1 -> return "минуту"
         in 2..4-> return "минуты"
         in 5..10 -> return "минут"
      }
      return "минут"
   }
   fun wordForHours():String{
      when(hours){
         1-> return "час"
         21-> return "час"
         in 2..4-> return "часа"
         in 22..24->return "часа"
      }
      return "часов"
   }

   fun agoToText() {
      when (timeToInt){
         in 0..60-> println("Был только что")
         in 61..60*60-> println("Был $minutes ${wordForMinutes()} назад")
         in 60*60+1..24*60*60-> println("Был $hours ${wordForHours()} назад")
         in 24*60*60+1..48*60*60-> println("Был вчера")
         in 48*60*60+1..72*60*60-> println("Был позавчера")
         else -> println("Был давно")

      }

   }

   println(agoToText())
}