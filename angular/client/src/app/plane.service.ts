import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable()
export class PlaneService {
  public API = "//localhost:8080";
  public PLANE_API = this.API + "/planes";

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<any> {
    return this.http.get(this.PLANE_API);
  }

}
