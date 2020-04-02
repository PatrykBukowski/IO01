import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AirportService } from "./airport.service";

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AirportListComponent } from './airport-list/airport-list.component';
import {HttpClientModule} from "@angular/common/http";
import {PlaneService} from "./plane.service";

@NgModule({
  declarations: [
    AppComponent,
    AirportListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [AirportService, PlaneService],
  bootstrap: [AirportListComponent]
})
export class AppModule { }
