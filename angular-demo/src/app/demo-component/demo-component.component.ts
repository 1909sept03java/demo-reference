import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo-component',
  templateUrl: './demo-component.component.html',
  styleUrls: ['./demo-component.component.css']
})
export class DemoComponentComponent implements OnInit {

  constructor() { }

  user = {
    firstname: 'Merlin',
    lastname: 'Higgins',
    email: 'wizardcat@gmail.com'
  };

  counter = 0; // relying on inferred type

  objectStyle = {
    color: 'red',
    border: '4px solid black',
    cursor: 'pointer',
    margin: '2px'
  };

  incrementCounter(): void {
    this.counter++;
  }

  toggleStyles(): void {
    if (this.objectStyle.color === 'red') {
      this.objectStyle.color = 'blue';
      this.objectStyle.border = '4px groove purple';
    } else {
      this.objectStyle.color = 'red';
      this.objectStyle.border = '4px solid black';
    }
  }

  ngOnInit() {
  }

}
