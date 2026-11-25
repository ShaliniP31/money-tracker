import { Component, signal } from '@angular/core';
import { Drawer } from '../drawer/drawer'
@Component({
  selector: 'app-header',
  imports: [Drawer],
  templateUrl: './header.html',
  styleUrl: './header.css',
  host : {
    'class': 'header'
  }
})
export class Header {
  isLeftDrawerOpen = signal(false);
  isRightDrawerOpen = signal(false);
}
