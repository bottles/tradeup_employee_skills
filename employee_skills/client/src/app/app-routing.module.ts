import { NgModule } from '@angular/core';
import {RouterModule,Routes} from '@angular/router';
import {IndexComponent} from "./index/index.component";
import { EmployeeSkillComponent } from "./employee-skill/employee-skill.component";


const routes: Routes = [
  {path: '', redirectTo: 'index', pathMatch: 'full'},
  {path: 'index', component: IndexComponent},
  {path: 'employee-skill', component: EmployeeSkillComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}