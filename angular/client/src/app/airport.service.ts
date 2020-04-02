import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";

@Injectable()
export class AirportService {
  public API = '//localhost:8080';
  public AIRPORT_API = this.API + '/airports';

  constructor(private http: HttpClient) { }

  getAll(): Observable<any> {
    return this.http.get(this.AIRPORT_API);
  }
}

