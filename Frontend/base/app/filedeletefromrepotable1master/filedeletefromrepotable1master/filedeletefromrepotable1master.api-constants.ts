import { Filedeletefromrepotable1masterBase} from '@baseapp/filedeletefromrepotable1master/filedeletefromrepotable1master/filedeletefromrepotable1master.base.model';

export class Filedeletefromrepotable1masterApiConstants {
    public static readonly delete: any = {
        url: '/rest/filedeletefromrepotable1masters/{ids}',
        method: 'DELETE',
        showloading: true
    };
    public static readonly autoSuggestService: any = {
        url: '/rest/filedeletefromrepotable1masters/autosuggest',
        method: 'GET',
        showloading: true
    };
    public static readonly getById: any = {
        url: '/rest/filedeletefromrepotable1masters/{sid}',
        method: 'GET',
        showloading: true
    };
    public static readonly update: any = {
        url: '/rest/filedeletefromrepotable1masters/',
        method: 'PUT',
        showloading: true
    };
    public static readonly create: any = {
        url: '/rest/filedeletefromrepotable1masters/',
        method: 'POST',
        showloading: true
    };
    public static readonly getDatatableData: any = {
        url: '/rest/filedeletefromrepotable1masters/datatable',
        method: 'POST',
        showloading: true
    };
}