package employee_skills

import grails.validation.ValidationException
import groovy.json.JsonSlurper

import static org.springframework.http.HttpStatus.*

class EmployeeController {

    EmployeeService employeeService

    static responseFormats = ['json', 'xml']
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        def jsonSlurper = new JsonSlurper()
        respond jsonSlurper.parseText(employeeService.list(params).toString()), model:[employeeCount: employeeService.count()]
    }

    def show(Long id) {
        Employee e = employeeService.get(id)
        def jsonSlurper = new JsonSlurper()
        respond jsonSlurper.parseText(e.toString())
    }

    def save(Employee employee) {
        if (employee == null) {
            render status: NOT_FOUND
            return
        }

        try {
            employeeService.save(employee)
        } catch (ValidationException e) {
            respond employee.errors, view:'create'
            return
        }

        respond employee, [status: CREATED, view:"show"]
    }

    def update(Employee employee) {
        if (employee == null) {
            render status: NOT_FOUND
            return
        }

        try {
            employeeService.save(employee)
        } catch (ValidationException e) {
            respond employee.errors, view:'edit'
            return
        }

        respond employee, [status: OK, view:"show"]
    }

    def delete(Long id) {
        if (id == null) {
            render status: NOT_FOUND
            return
        }

        employeeService.delete(id)

        render status: NO_CONTENT
    }
}
