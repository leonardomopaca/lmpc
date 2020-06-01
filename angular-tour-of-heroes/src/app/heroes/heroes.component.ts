import { Component, OnInit } from '@angular/core';
import { Hero } from '../hero';
import { HeroService } from '../hero.service';

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})
export class HeroesComponent implements OnInit {

  /*
  hero: Hero = {
    id: 0,
    name: 'Windstorm'
  };*/

  selectedHero: Hero;
  heroes: Hero[];

  constructor(private heroService: HeroService) { }

  ngOnInit(){
    this.getHeroes();
  }

  getHeroes(): void{
    this.heroes = this.heroService.getHeroes();
  }

  onSelect(hero: Hero): void{
    this.selectedHero = hero;
  }

}

/** @ Component é uma função decoradora que especifica os metadados Angular para o componente. 
 * A CLI gerou três propriedades de metadados:

    seletor - o seletor de elemento CSS do componente
    templateUrl - o local do arquivo de modelo do componente.
    styleUrls - a localização dos estilos CSS privados do componente.
*/
