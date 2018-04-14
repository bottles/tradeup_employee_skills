package employee_skills

class Skill {
    String name

    static belongsTo = Employee
    static hasMany = [employees: Employee]

    static constraints = {
    }

}
