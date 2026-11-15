import { Component, input } from '@angular/core';

@Component({
  selector: 'app-drawer',
  imports: [],
  templateUrl: './drawer.html',
  styleUrl: './drawer.css',
  host : {
    'class': 'drawer',
    '[class.left]': "position() === 'left'",
    '[class.right]': "position() === 'right'",
    '[class.open]': 'isOpen()'
  }
})
export class Drawer {
  isOpen = input<boolean>(false);
  position = input<'left' | 'right'>('left');
}
