import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { FormoneComponent } from './formone/formone.component';
import { FormtwoComponent } from './formtwo/formtwo.component';


const routes: Routes = [
  { path:'', component: FormoneComponent },
  { path:'two', component: FormtwoComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
