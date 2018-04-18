import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-employee-skill',
  templateUrl: './employee-skill.component.html',
  styleUrls: ['./employee-skill.component.css']
})
export class EmployeeSkillComponent implements OnInit {

  employee: any;
  title: any;
  selectedEmployee: any;

  constructor(private http: HttpClient) {
      this.title = "Employee Skill Profile"
  }

  ngOnInit() {
      this.http.get('http://localhost:8080/employee').subscribe(data => {
          this.employee = data;
      });
      console.warn("hello");
      //console.warn(this.employees.toLocaleString());
  }

  onSelect(e): void {
      this.selectedEmployee = e;
  }

}
