class Kvant {
    var name: String? = null
    var groups: MutableList<Group> = mutableListOf()
    var desc: String? = null
    var space: Int? = null
    var teachers: Array<Teacher>? = null

    fun make_Group(name: String, teacher: Teacher): Group{
        var t: Group = Group(name)
        for (i in 1..space!!)
            t.students.add(Student())
        t.teacher = teacher
        groups.add(t)
        return t
    }
}