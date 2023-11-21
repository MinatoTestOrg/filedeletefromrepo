import { NgModule } from '@angular/core';
import { BsModalService } from 'ngx-bootstrap/modal';
import { SharedModule } from '@app/shared/shared.module';

@NgModule({
  declarations: [
  ],
  imports: [
    SharedModule,
    WidgetsBaseModule,
  ],
  exports: [
    SharedModule,
	WidgetsBaseModule,
  ],
  providers: [
  	BsModalService,
  ],
  
})
export class Filedeletefromrepotable1masterBaseModule { }