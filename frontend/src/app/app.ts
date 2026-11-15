import { Component } from '@angular/core';
import {Header} from '@shared/components/common/header/header'
import {Footer} from '@shared/components/common/footer/footer'

@Component({
  selector: 'app-root',
  imports: [Header, Footer],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
}
