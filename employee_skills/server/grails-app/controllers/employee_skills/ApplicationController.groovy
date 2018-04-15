package employee_skills

import grails.core.GrailsApplication
import grails.plugins.*

class ApplicationController implements PluginManagerAware {

    GrailsApplication grailsApplication
    GrailsPluginManager pluginManager

    def index() {

        //new Employee(name: "Jack").addToSkills(id: 5,  name: "English").save()

        //log.error(employee.toString())
        //employee.delete(flush: true)

        /*new Employee(name: "Jack")
                .addToSkills(new Skill(name: "C++"))
                .addToSkills(new Skill(name: "French"))
                .addToSkills(new Skill(name: "Sleep"))
                .save()

        new Employee(name: "John")
                .addToSkills(new Skill(name: "Java"))
                .addToSkills(new Skill(name: "Drink Beer"))
                .save()*/
        //def employee = Employee.findAllWhere(name: "Marry3")
        //log.error(employee.toString())

        //def airport = Skill.findAllWhere(name: "Marry3")
        //airport.delete(name: "Marry3")
        //airport.delete()

        //def employee = Employee.where {name=="Marry3"}.deleteAll()

        //log.error(Employee.get(1).toString())

        [grailsApplication: grailsApplication, pluginManager: pluginManager]
    }
}
