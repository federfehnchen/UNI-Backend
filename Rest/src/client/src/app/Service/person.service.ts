import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Person} from "../Model/person";

@Injectable({
  providedIn: 'root'
})
//In dieser Klasse sollen sich alle Methoden befinden,
// welche für die Kommunikation mit dem Server zuständig sind.
export class PersonService
{
  personURL:string;
  constructor(private http:HttpClient) {this.personURL='http://localhost:8080/'}

  findAll(): Observable<Person[]> {return this.http.get<Person[]>(this.personURL+"findAll")};

  findByAge(lower: number, higher: number): Observable<Person[]> {return this.http.get<Person[]>(this.personURL+"findByAge?lower="+lower+"&higher="+higher)}

  findByCity(stadt: String): Observable<Person[]> {return this.http.get<Person[]>(this.personURL+"findByCity?city="+stadt)}
}


