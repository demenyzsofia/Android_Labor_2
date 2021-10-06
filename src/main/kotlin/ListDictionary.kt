import java.io.File

object ListDictionary : IDictionary{
    val words = arrayListOf<String>()

    init{
        File(IDictionary.filename).readLines().forEach{add(it)}
    }

    override fun add(str : String) : Boolean{
        if(!find(str)) {
            return true
        }
        return false
    }
    override  fun find( str : String) : Boolean{
        return words.contains(str)
    }

    override  fun size() : Int{
        return words.size
    }
}