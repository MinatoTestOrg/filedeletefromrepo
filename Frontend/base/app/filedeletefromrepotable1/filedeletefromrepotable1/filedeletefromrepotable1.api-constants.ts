import { Filedeletefromrepotable1Base} from '@baseapp/filedeletefromrepotable1/filedeletefromrepotable1/filedeletefromrepotable1.base.model';

export class Filedeletefromrepotable1ApiConstants {
    public static readonly delete: any = {
        url: '/rest/filedeletefromrepotable1s/{ids}',
        method: 'DELETE',
        showloading: true
    };
    public static readonly autoSuggestService: any = {
        url: '/rest/filedeletefromrepotable1s/autosuggest',
        method: 'GET',
        showloading: true
    };
    public static readonly getById: any = {
        url: '/rest/filedeletefromrepotable1s/{sid}',
        method: 'GET',
        showloading: true
    };
    public static readonly update: any = {
        url: '/rest/filedeletefromrepotable1s/',
        method: 'PUT',
        showloading: true
    };
    public static readonly create: any = {
        url: '/rest/filedeletefromrepotable1s/',
        method: 'POST',
        showloading: true
    };
    public static readonly getDatatableData: any = {
        url: '/rest/filedeletefromrepotable1s/datatable',
        method: 'POST',
        showloading: true
    };
}