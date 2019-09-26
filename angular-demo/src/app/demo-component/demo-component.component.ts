import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo-component',
  templateUrl: './demo-component.component.html',
  styleUrls: ['./demo-component.component.css']
})
export class DemoComponentComponent implements OnInit {

  constructor() { }

  // property of DemoComponentComponent
  user = {
    firstname: 'Merlin',
    lastname: 'Higgins',
    email: 'wizardcat@gmail.com'
  };

  // property being incremented for event binding demo
  counter = 0; // relying on inferred type

  // property being bound to ngStyle in property binding demo
  objectStyle = {
    color: 'red',
    border: '4px solid black',
    cursor: 'pointer',
    margin: '2px'
  };

  // function invoked in event binding demo
  incrementCounter(): void {
    this.counter++;
  }

  // function invoked in property binding demo
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
