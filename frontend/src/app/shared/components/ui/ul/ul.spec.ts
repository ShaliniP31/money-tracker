import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ul } from './ul';

describe('Ul', () => {
  let component: Ul;
  let fixture: ComponentFixture<Ul>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ul],
    }).compileComponents();

    fixture = TestBed.createComponent(Ul);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
