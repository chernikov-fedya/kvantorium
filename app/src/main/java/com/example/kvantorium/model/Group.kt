import java.util.*

class Group(n: String) {
    var name: String = n
    var teacher: Teacher? = null
    var students: MutableList<Student> = MutableList(0, { Student() })
}



