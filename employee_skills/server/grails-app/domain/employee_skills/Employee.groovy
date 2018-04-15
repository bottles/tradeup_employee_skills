package employee_skills

import grails.persistence.Entity

@Entity
class Employee {

    String name

    static hasMany = [skills:Skill]


    static constraints = {
        name blank: false, unique: true
    }

    static mapping = {
        skills cascade: "all"
    }


    @Override
    String toString() {
        return '{"id": ' + String.valueOf(id) + ', "name": "' + \
                name + '", "skills": ' + skills.toString() + ' }'
    }
}
