import React from "react";
import { useEffect, useState } from "react";
import './Pokemon.css';

const Pokemons = (currentPage, currentFilter) => {
  const [pokemons, setPokemons] = useState([]);

  const [pokemonsImg, setPokemonsImg] = useState({});

  async function fetchPokemons() {
    if (currentFilter === "all" ) {
      const response = await fetch(
        "https://pokeapi.co/api/v2/pokemon?limit=20&offset=" + currentPage * 20
      );
      const data = await response.json();
      setPokemons(data.results);
      return data.results;
      
    } else {
      const response = await fetch(
        "https://pokeapi.co/api/v2/type/" + currentFilter
      );
      const data = await response.json();
      const numberPage = currentPage * 20;
      setPokemons(
        data.pokemon.slice(
          numberPage,
          numberPage + 20 
        )
      );
      return data.pokemon;
    }
  };

  async function fetchImg(name,url) {
    const responseImg = await fetch(url);
    const dataImg = await responseImg.json();
    var temp = pokemonsImg;
    temp[name] = dataImg.sprites.front_default;
    setPokemonsImg(temp);
    return temp;
};

  function fetchData() {
    fetchPokemons().then((response)=>{
      response.map((object) => {
        const obj = currentFilter==="all" ? { name : object.name, url : object.url} :  { name : object.pokemon.name, url : object.pokemon.url};
        fetchImg(obj.name,obj.url).then( (dataImg)=> {
          setPokemonsImg(dataImg);
        });
        return object;
      });
    })
  }

  useEffect(() => {
    fetchData();  
  }, [currentFilter,currentPage]);

  function showPokemons() {
    if(currentFilter=== "all" ){
      return pokemons.map(({ name, url }, index) => {
        return (
          <div className="pokemon-container" key={index}>
            <img className="pokemon-image" src={pokemonsImg[name]} alt=""></img>
            <p>{name}</p>
          </div>
        );
      });
    } else {
      return pokemons.map((obj, index) => {
      if(obj.pokemon){
        const name = obj.pokemon.name;
        return (
          <div className="pokemon-container" key={index}>
            <img className="pokemon-image" src={pokemonsImg[name]} alt=""></img>
            <p>{name}</p>
          </div>
        );
      }
      });
    }

  }

  return (
    <div className="content">
      {showPokemons()}
    </div>
  );
};

export default Pokemons;
