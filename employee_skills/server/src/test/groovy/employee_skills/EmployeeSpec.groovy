package employee_skills

import grails.testing.gorm.DomainUnitTest
import org.apache.commons.lang.ObjectUtils
import spock.lang.Specification

import javax.validation.constraints.Null

class EmployeeSpec extends Specification implements DomainUnitTest<Employee> {

    def setup() {
    }

    def cleanup() {
    }

    void "test name length validation"() {
        expect:
        new Employee(name: ename).validate(['ename']) == shouldBeValid

        where:
        ename            | shouldBeValid
        "Jack"           | true
        "Marry"          | true
    }
}
