package employee_skills

class Employee {

    int id
    String name

    static hasMany = [skills:Skill]


    static constraints = {
        name blank:false
    }

}
