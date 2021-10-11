import java.io.File
import java.util.*

object HashSetDictionary: IDictionary {
    val words = HashSet<String>()

    init{
        File(IDictionary.filename).readLines().forEach{add(it)}
    }

    override fun add(str : String) : Boolean{
        if(words.contains(str) == false) {
            words.add(str)
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