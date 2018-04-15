package employee_skills

import grails.persistence.Entity

@Entity
class Skill {
    String name

    static belongsTo = [employees: Employee]

    static constraints = {
        name blank: false, unique: true
    }

    static mapping = {
        employees cascade: "all"
    }

    @Override
    String toString() {
        return '{"id": ' + String.valueOf(id) + ', "name": "' + name + '" }'
    }
}
