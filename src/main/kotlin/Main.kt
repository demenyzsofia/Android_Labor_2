

fun main(args: Array<String>) {
    val dict: IDictionary = ListDictionary
    println("Number of words: ${dict.size()}")
    var word: String?
    while(true){
        print("What to find? ")
        word = readLine()
        if( word.equals("quit")){
            break
        }
        println("Result: ${word?.let { dict.find(it) }}")
    }

    println("\n\nTest the TreeSetDictionary class using the given main function")
    val dict2:IDictionary  = TreeSetDictionary
    println("Number of words: ${dict2.size()}")
    var word2: String?
    while(true){
        print("What to find? ")
        word2 = readLine()
        if( word2.equals("quit")){
            break
        }
        println("Result: ${word2?.let { dict2.find(it) }}")
    }

    println("\n\nTest HashSetDictionary through the DictionaryProvider class\n")
    val dictprovider = DictionaryProvider()
    val dict3=dictprovider.createDictionary(DictionaryType.HASH_SET)
    println("Number of words: ${dict3.size()}")
    var word3: String?
    while(true){
        print("What to find? ")
        word3 = readLine()
        if( word3.equals("quit")){
            break
        }
        println("Result: ${word3?.let { dict3.find(it) }}")
    }
    println("add 'hash' ? -> ${dict3.add("hash")}")
    println("size: ${dict3.size()}")


    println("\nProblem2\n")
    println("2.1 prints the monogram of a String containing the firstname and lastname.")
    val name="John Smith"
    println(name.Monogram())

    println("\n2.2 returns the elements of a strings’ list joined by a given separator")
    val list= arrayListOf<String>("apple", "pear","strawberry", "melon")
    val separator= '#'
    println(list.listWithSeparator(separator))

    println("\n2.3 returns the the longest string")
    println(list.theLondestStr())

    println("\n\nProblem3\n")
    println("Leap year?")
    val date1=Date(1900,5,5)
    println("1900  ${date1.isLeapYear()}")

    println("the bad dates:")
    val dateList= arrayListOf<Date>()
    while(dateList.size<10){
        val date = Date((1..2021).random(),(1..12).random(),(1..31).random())
        if (date.isValid() ){
            dateList.add(date)
        }
        else{
            println(date)
        }
    }
    println("\nPrint the dateList with forEach")
    dateList.forEach({ println("${it.year}-${it.month}-${it.day}")})
    dateList.sort()
    println("\nthe sorted list with comparable:")
    dateList.forEach({ println("${it.year}-${it.month}-${it.day}")})
    println("\nthe reserved list:")
    dateList.asReversed().forEach({ println("${it.year}-${it.month}-${it.day}")})
    val comparator = CompareDate()
    println("\nList sorted with comparator")
    dateList.sortedWith(comparator).forEach({ println("${it.year}-${it.month}-${it.day}")})

}
fun String.Monogram()= this.split(" ").map{ it.first() }.joinToString(separator = "")

fun List<String>.listWithSeparator(separator : Char)= this.map{it}.joinToString(separator = "$separator")

fun List<String>.theLondestStr() = this.maxByOrNull { it.length}



