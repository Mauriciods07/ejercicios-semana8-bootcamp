package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {

	public static void main(String[] args) {
		
		// Las colecciones nos sirven para almacenar un conjunto
		// de objetos
		// La diferencia de las colecciones y los objetos
		// es que las colecciones son dinamicas, pueden cambiar
		// el numero de objeto agregados
				
		// Set tiene 3 tipos de implementaciones, 
		// no puede cotener elementos repetidos
				
		// 1.- HashSet
		// los elementos no mantienen un orden
		Set<String> frutas = new HashSet<String>();
		frutas.add("mamey");
		frutas.add("granda");
		frutas.add("sandia");
		frutas.add("fresa");
		frutas.add("mango");
		frutas.add("piña");
		
		
		// foreach, puede recorrer una coleccion y en cada
		// recorrido recupera el valor y lo podemos almacenar
		// en una variable
		// Sintaxis
		// for(tipoDeDatoElemento variable : elementoARecorrer)
		
		for (String fruta : frutas) {
			System.out.println(fruta + " de HashSet");		
		}
		
		System.out.println("-----------------------\n");
		
		// 2.- TreeSet
		// Esta implementacion ordena los elementos en funcion de sus valores
		// es la implementacion mas lenta
		
		Set<String> frutas2 = new TreeSet<String>();
		frutas2.add("mango");
		frutas2.add("granda");
		frutas2.add("piña");
		frutas2.add("sandia");
		frutas2.add("mamey");
		frutas2.add("fresa");
		
		for (String fruta : frutas2) {
			System.out.println(fruta + " de TreeSet");		
	    }
		
		System.out.println("-----------------------\n");
		
		
		// 3.- LinkeHashSet
		// Ordena los elementos en oren de insercion
		// es mas costoso que HashSet
		
		Set<String> frutas3 = new LinkedHashSet<String>();
		frutas3.add("mango");
		frutas3.add("granda");
		frutas3.add("piña");
		frutas3.add("sandia");
		frutas3.add("mamey");
		frutas3.add("fresa");
		
		for (String fruta : frutas3) {
			System.out.println(fruta + " de LinkedHashSet");		
	    }
		
		System.out.println("-----------------------\n");
		
		// List
		// se permiten elementos duplicados
		// acceder a elementos especificos
		// buscar elementos
		
		
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("Charmander");
		pokemones.add("Gengar");
		pokemones.add("Psyduck");
		pokemones.add("Eevee");
		pokemones.add("Dragonite");
		pokemones.add("Meowth");
		pokemones.add("Charizard");
		pokemones.add("Pikachu");
		pokemones.add("Gengar");
		pokemones.add(2, "Bulbasaur");
		
		// add si agregamos un índice y un elemento, posiciona
		// el elemento en el índice y realiza un desplazamiento
		// es decir no borra el elemnto en la posicion sino 
		// que lo desplaza
		
		
		pokemones.add(2,"Flygon");
		
		//remove remueve el elemento de la posición específica
		pokemones.remove(6);
		
		// set reemplaza el elemento en la posición específica
		pokemones.set(0,"Lugia");
		
		for (String pokemon : pokemones) {
			System.out.println(pokemon + " de Lista");		
		}
		
		System.out.println("-----------------------\n");
		System.out.print(pokemones.get(5) + "\n");
		
		// indexof, nos va devolver la posicion del elemento
		//y si el elemento no se encuentra nos devuelve -1
		
		System.out.println("*******");
		System.out.println(pokemones.indexOf("Gengar"));
		/*System.out.println(pokemones.lastIndexOf("Gengar"));*/
		System.out.println(pokemones.indexOf("Togepi")); // no existe en la lista
		
		
		//LinkedList
		
		List<String> digimones = new LinkedList<String>();
		
		digimones.add("Agemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
		String digimon = digimones.get(0);
		System.out.println(digimon);
		
		// Map
		// Asocia claves a valores
		// No puede contener claves duplicadas
		// Sólo puede tener un valor asociado
		
		// HashMap
		// Tiene mejor rendimiento, pero no garantiza un orden
		// a la hora de hacer iteraciones
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1,  "Carlos Eduardo");
		usuarios.put(2, "Raul");
		usuarios.put(3,  "Ro");
		
		// para buscar un elemento, se usa la clave
		System.out.println("**************");
		System.out.println(usuarios.get(2));
		
		// keySet
		// Nos permite recuperar el nombre de la clave
		System.out.println(usuarios.keySet());
		// values
		// nos permite recuperar el valor directamente
		System.out.println(usuarios.values());
		System.out.println("-----------------------\n");
		
		// TreeMap
		Map<String, String> tamales = new TreeMap<String, String>();
		tamales.put("Oaxaqueño", "Mole Rojo");
		tamales.put("Torta", "Mole Verde");
		tamales.put("Dulces", "Gansito");
		tamales.put("Salado", "Cochinita");
		
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		
		System.out.println(tamales);
		System.out.println("-----------------------\n");
		System.out.println("Imprimir, con un forEach, la clave y llave de cada elemento");
		
		tamales.entrySet().forEach(clave -> {
			System.out.println(clave.getKey().toString() + " " + 
					clave.getValue().toString());
		});

		System.out.println("-----------------------\n");
		
		// LinkedHashMap
		Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
		carros.put(1, "Volvo");
		carros.put(567,  "Pointer");
		carros.put(8,  "Mustang");
		
		System.out.println("-----------------------\n");
		System.out.println(carros.keySet());
		System.out.println(carros.values());
		
		
		
		
//		for(String pokemon : pokemones) {
//			System.out.println(pokemon);
//		}
//		
//		pokemones.remove(3);
//		System.out.println("-----------------");
//		System.out.println(pokemones.get(4));
//		System.out.println(pokemones.indexOf("Gengar"));
//		
//		//Orden de velocidad 
//			//1.HashSet
//			//2.LinkedHashSet
//			//3.TreeSet
//		//Set<String> frutas = new HashSet<String>();
//				Set<String> frutas = new LinkedHashSet<String>();
	}
}
