interface IDictionary {
    companion object {
        val filename="dictionary.txt"
    }
    fun add( str : String) : Boolean;
    fun find( str : String) : Boolean;
    fun size() : Int;
}