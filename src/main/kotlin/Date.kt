import java.util.*
import kotlin.Comparator

data class Date(val year : Int= Calendar.getInstance().get(Calendar.YEAR),
                val month : Int =Calendar.getInstance().get(Calendar.MONTH),
                val day : Int =Calendar.getInstance().get(Calendar.DAY_OF_MONTH)): Comparable<Date>, Comparator<Date> {
    //comparable
    override  operator fun compareTo(date: Date): Int {
        if (this.year > date.year) return 1
        if (this.year < date.year) return -1
        if (this.month > date.month) return 1
        if (this.month < date.month) return -1
        if (this.day > date.day) return 1
        if (this.day < date.day) return -1
        return 0
    }
    //comparator
    override fun compare(o1: Date, o2: Date): Int {
        if(o1 == null || o2 == null){
            return 0;
        }
        if (o1.year > o2.year) return 1
        if (o1.year < o2.year) return -1
        if (o1.month > o2.month) return 1
        if (o1.month < o2.month) return -1
        if (o1.day > o2.day) return 1
        if (o1.day < o2.day) return -1
        return 0
    }
}

fun Date.isLeapYear():Boolean{
    if(this.year % 100 ==0 ){
        return false
    }
    if(this.year % 4 ==0 || this.year % 400==0){
        return true
    }
    return false
}

fun Date.isValid():Boolean{
    if(this.year>2021){
        return false;
    }
    if(this.month <=0 || this.month >12 || this.day <=0){
        return false
    }
    when(this.month){
        1,3,5,7,8,10,12 -> { if (this.day >31) {return false} }
        2 -> { if (this.day >28) {return false} }
        4,6,9,11 -> { if (this.day >30) {return false} }
    }
    return true;
}



