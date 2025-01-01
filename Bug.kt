fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val list2 = mutableListOf<Int>(1,2,3,4,5)
    val iterator = list2.iterator()
    while (iterator.hasNext()){
        if(iterator.next()%2 == 0){
            iterator.remove()
        }
    }
    println(list2) // Output: [1,3,5]
}