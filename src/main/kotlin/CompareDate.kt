class CompareDate : Comparator<Date>{
    //descending
    override fun compare(o1: Date, o2: Date): Int {
        if(o1 == null || o2 == null){
            return 0;
        }
        if (o1.year < o2.year) return 1
        if (o1.year > o2.year) return -1
        if (o1.month < o2.month) return 1
        if (o1.month > o2.month) return -1
        if (o1.day < o2.day) return 1
        if (o1.day > o2.day) return -1
        return 0
    }

}