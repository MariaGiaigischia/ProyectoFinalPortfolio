import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogoArproComponent } from './logo-arpro.component';

describe('LogoArproComponent', () => {
  let component: LogoArproComponent;
  let fixture: ComponentFixture<LogoArproComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LogoArproComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LogoArproComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
