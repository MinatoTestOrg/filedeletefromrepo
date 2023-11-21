import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { Filedeletefromrepotable1masterRoutingModule } from './filedeletefromrepotable1master-routing.module';
import { Filedeletefromrepotable1masterBaseModule } from '@baseapp/filedeletefromrepotable1master/filedeletefromrepotable1master.base.module';
@NgModule({
  declarations: [
  ],
  imports: [
    CommonModule,
    Filedeletefromrepotable1masterBaseModule,
    Filedeletefromrepotable1masterRoutingModule
    
  ],
  exports: [
      Filedeletefromrepotable1masterBaseModule,
  ]

})
export class Filedeletefromrepotable1masterModule  { }