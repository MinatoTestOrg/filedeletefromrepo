import { Injectable,inject } from '@angular/core';
import { Observable, of } from 'rxjs';
import { BaseService } from '@baseapp/base.service';
import { Filedeletefromrepotable1masterBase} from './filedeletefromrepotable1master.base.model';
import { Filedeletefromrepotable1masterApiConstants } from './filedeletefromrepotable1master.api-constants';


@Injectable({
  providedIn: 'root'
})
export class Filedeletefromrepotable1masterService {

public baseService = inject(BaseService);

  
	  getProtoTypingData(): Observable<any> {
	      const subject:Observable<Filedeletefromrepotable1masterBase> = new Observable(observer => {
	        const data =  require('base/assets/sample-data/filedeletefromrepotable1master.json');
	        observer.next(data as Filedeletefromrepotable1masterBase);
	      });
	      return subject;
	  }
	 
		getProtoTypingDataById(...args: any): Observable<any> {
	    const params = args[0];
	    const key = Object.keys(params);
	    let foundData: boolean = false;
	    let data: any = {};
	    const subject: Observable<Filedeletefromrepotable1masterBase> = new Observable(observer => {
	      const response = require('base/assets/sample-data/filedeletefromrepotable1master.json');
	      response.map((o: any) => {
	        foundData = key.every((d: string) => {
	          return o[d] == params[d];
	        })
	        if (foundData) {
	          data = o;
	        }
	      })
	      observer.next(data as Filedeletefromrepotable1masterBase);
	    });
	    return subject;
	  }

    delete(...args: any):Observable<any>{
        const serviceOpts = Filedeletefromrepotable1masterApiConstants.delete;
        const params= args[0];
        
        const subject = new Observable(observer => {
          this.baseService.delete(serviceOpts,params).subscribe((response: any) => {
            observer.next(response);
          },
          (err:any) => {
            observer.error(err);
          });
        });
    
        return subject;
    }
    autoSuggestService(...args: any):Observable<any>{
        const serviceOpts = Filedeletefromrepotable1masterApiConstants.autoSuggestService;
        const params= args[0];
        
        const subject = new Observable(observer => {
          this.baseService.get(serviceOpts,params).subscribe((response: any) => {
            observer.next(response);
          },
          (err:any) => {
            observer.error(err);
          });
        });
    
        return subject;
    }
    getById(...args: any):Observable<any>{
        const serviceOpts = Filedeletefromrepotable1masterApiConstants.getById;
        const params= args[0];
        
        const subject = new Observable(observer => {
          this.baseService.get(serviceOpts,params).subscribe((response: any) => {
            observer.next(response);
          },
          (err:any) => {
            observer.error(err);
          });
        });
    
        return subject;
    }
    update(...args: any):Observable<any>{
        const serviceOpts = Filedeletefromrepotable1masterApiConstants.update;
        const params= args[0];
        
        const subject = new Observable(observer => {
          this.baseService.put(serviceOpts,params).subscribe((response: any) => {
            observer.next(response);
          },
          (err:any) => {
            observer.error(err);
          });
        });
    
        return subject;
    }
    create(...args: any):Observable<any>{
        const serviceOpts = Filedeletefromrepotable1masterApiConstants.create;
        const params= args[0];
        
        const subject = new Observable(observer => {
          this.baseService.post(serviceOpts,params).subscribe((response: any) => {
            observer.next(response);
          },
          (err:any) => {
            observer.error(err);
          });
        });
    
        return subject;
    }
    getDatatableData(...args: any):Observable<any>{
        const serviceOpts = Filedeletefromrepotable1masterApiConstants.getDatatableData;
        const params= args[0];
        
        const subject = new Observable(observer => {
          this.baseService.post(serviceOpts,params).subscribe((response: any) => {
            observer.next(response);
          },
          (err:any) => {
            observer.error(err);
          });
        });
    
        return subject;
    }
}
