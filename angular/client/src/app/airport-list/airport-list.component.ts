import { Component, OnInit } from '@angular/core';

import { AirportService } from "../airport.service";
import {PlaneService} from "../plane.service";

@Component({
  selector: 'app-airport-list',
  templateUrl: './airport-list.component.html',
  styleUrls: ['./airport-list.component.css']
})
export class AirportListComponent implements OnInit {
  airports: Array<any>;
  planes: Array<any>;

  constructor(private airportService : AirportService, private planeService: PlaneService) { }

  ngOnInit(): void {
    this.airportService.getAll().subscribe(data => {
      this.airports = data;
    });

    this.planeService.getAll().subscribe(data => {
      this.planes = data;
    })
  }
}
