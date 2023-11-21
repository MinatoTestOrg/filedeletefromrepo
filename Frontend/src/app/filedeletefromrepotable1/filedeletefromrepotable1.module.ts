import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { Filedeletefromrepotable1RoutingModule } from './filedeletefromrepotable1-routing.module';
import { Filedeletefromrepotable1BaseModule } from '@baseapp/filedeletefromrepotable1/filedeletefromrepotable1.base.module';
@NgModule({
  declarations: [
  ],
  imports: [
    CommonModule,
    Filedeletefromrepotable1BaseModule,
    Filedeletefromrepotable1RoutingModule
    
  ],
  exports: [
      Filedeletefromrepotable1BaseModule,
  ]

})
export class Filedeletefromrepotable1Module  { }