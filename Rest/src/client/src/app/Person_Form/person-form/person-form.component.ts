import { Component, OnInit } from '@angular/core';
import {Person} from "../../Model/person";
import {PersonService} from "../../Service/person.service";

@Component({
  selector: 'app-person-form',
  templateUrl: './person-form.component.html',
  styleUrls: ['./person-form.component.scss']
})
export class PersonFormComponent implements OnInit {

  person:Person;
  constructor(private personService:PersonService) {this.person=new Person()}

  ngOnInit(): void {
  }

  //Todo
  // Diese Methode wird aufgerufen wenn der "Submit" Button Gedrückt wird.
  // Diese Methode soll dann die person an den Server schicken.
  // Nutze dazu den personService.
  onSubmit()
  {

  }

  private reloadPage()
  {
    window.location.reload();
  }
}
