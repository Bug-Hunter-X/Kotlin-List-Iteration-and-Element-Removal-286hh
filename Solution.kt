fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    // Correct way to remove even numbers using removeIf
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    // Correct way to remove elements using iterator
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    val iterator = list2.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println(list2) // Output: [1, 3, 5]
    
    // Incorrect way to remove elements from list using for loop
    val list3 = mutableListOf<Int>(1,2,3,4,5)
    for (i in list3.size -1 downTo 0){
        if(list3[i]%2 == 0){
            list3.removeAt(i)
        }
    }
    println(list3)// Output: [1,3,5]
} 