package com.senati.mediateca;

import java.util.HashSet;
import java.util.Set;

public class Implementa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//añadir nuevos socios
		//clase objeto = new clase()
		Socio socio1 = new Socio();
		socio1.id = 100;
		socio1.nombre="Marissé";
		socio1.apellido="Gonzáles Palomino";
		socio1.distrito="San Martin ";

		Socio socio2 = new Socio();//constructor vacio
		socio2.id = 102;
		socio2.nombre="Esther";
		socio2.apellido="Aquino Olivares";
		socio2.distrito="Los Olivos";
		
		
		Socio socio3 = new Socio(103,"Maria","Alvarez Perez","Ventanilla");

		
		System.out.println(socio1.toString());
		System.out.println(socio2.toString());
		System.out.println(socio3.toString());
		
		Libro libro1 = new Libro(11,"Matalache","Mario Vargas LLosa",50f,300,123);
		System.out.println(libro1.toString());
		Libro libro2 = new Libro(24,"Abzurdah","Cielo Latini",35f,263,110);
		System.out.println(libro2.toString());
		
		
		Cintaaudio cintaaudio1 = new Cintaaudio(13,"Quantum Leap","X1",80f,"America",36f);
		System.out.println( cintaaudio1.toString());
		Cintaaudio cintaaudio2 = new Cintaaudio(25,"Palette","IU",45f,"Francia",25f);
		System.out.println( cintaaudio2.toString());
		
		Cintavideo cintavideo1 = new Cintavideo(13,"The Blind Side","Pedro Morn",80f,"Luil Phon, Lyly Collins",120);
		System.out.println( cintavideo1.toString());
		Cintavideo cintavideo2 = new Cintavideo(33,"Sweeney Todd","Hall Utyn",160f,"Luil Phon, Lyly Collins",140);
		System.out.println( cintavideo2.toString());
		
		System.out.println();
		System.out.println();
		System.out.println("Lista de socios:");
		Socio soc1 = new Socio(104,"Jorge", "Luque","Comas");
		Socio soc2 = new Socio(105,"Maria" ,"Luna","Comas");
		Socio soc3 = new Socio(106,"Gerardo", "Luque","Comas");
		Socio soc4 = new Socio(107,"Alex", "Lopez","Comas");
		Socio soc5 = new Socio(108,"Alex", "Lopez","Comas");
		Set <Socio> sociosinscritos = new HashSet<Socio>();
		
		sociosinscritos.add(soc1);
		sociosinscritos.add(soc2);
		sociosinscritos.add(soc3);
		sociosinscritos.add(soc4);
		sociosinscritos.add(soc5);

		
		for (Socio socio : sociosinscritos) {
			System.out.println(socio.id + " " + socio.nombre + " " + socio.apellido + " " + socio.distrito);
		}
		System.out.println();
		System.out.println();
		//Lista de libros
		System.out.println("Lista de Libros:");
		Libro lib1 = new Libro(11,"Matalache","Mario Vargas LLosa",50f,300,123);
		Libro lib2 = new Libro(24,"Abzurdah","Cielo Latini",35f,263,110);
		Libro lib3 = new Libro(25,"Cien años de soledad","Gabriel García Márquez",25f,63,117);
		Libro lib4 = new Libro(26,"El señor de las moscas","William Golding",30f,23,130);
		Libro lib5 = new Libro(27,"Viaje al centro de la tierra","Julio Verne",15f,90,90);
		Set <Libro> librosregistrados = new HashSet<Libro>();
		
		librosregistrados.add(lib1);
		librosregistrados.add(lib2);
		librosregistrados.add(lib3);
		librosregistrados.add(lib4);
		librosregistrados.add(lib5);

		
		for (Libro libro : librosregistrados) {
			System.out.println(libro.id + " " + libro.titulo + " " + libro.autor + " " + libro.precio + " " + libro.nropag + " "  + libro.nroisbn );
		}
		
		System.out.println();
		System.out.println();
		//Lista de audios
		System.out.println("Lista de Audios:");
		Cintaaudio cintaaudio01 = new Cintaaudio(13,"Quantum Leap","X1",80f,"USA",36f);
		Cintaaudio cintaaudio02 = new Cintaaudio(25,"Palette","IU",45f,"Francia",20f);
		Cintaaudio cintaaudio03= new Cintaaudio(26,"Teenage Dream","Katy Perry",80f,"USA",55f);
		Cintaaudio cintaaudio04 = new Cintaaudio(27,"The Fame Monster","Lady GaGa",75f,"Inglaterra",25f);
		Cintaaudio cintaaudio05 = new Cintaaudio(28,"21 ","Adele",60f,"Reino Unido",45f);
		Set <Cintaaudio> audioslista = new HashSet<Cintaaudio>();
		
		audioslista.add(cintaaudio01);
		audioslista.add(cintaaudio02);
		audioslista.add(cintaaudio03);
		audioslista.add(cintaaudio04);
		audioslista.add(cintaaudio05);

		
		for (Cintaaudio cintaaudio : audioslista) {
			System.out.println(cintaaudio.id + " " + cintaaudio.titulo + " " + cintaaudio.autor + " " + cintaaudio.precio + " " + cintaaudio.lugar + " "  + cintaaudio.duracion );
		}
		
		System.out.println();
		System.out.println();
		//Lista de videos
		System.out.println("Lista de Videos:");
		Cintavideo cvideo1 = new Cintavideo(34,"The Blind Side","Alfred Hitchcok",80f,"Luil Phon, Lyly Collins",120);
		Cintavideo cvideo2 = new Cintavideo(35,"El Señor de los Anillos","Pedro Morn",50f,"Honny, Dep Bruce",130);
		Cintavideo cvideo3= new Cintavideo(36,"La mirada de Ulises ","Orson Welles",60f,"Will Smith , Adam Sandler",145);
		Cintavideo cvideo4 = new Cintavideo(37,"Pulp Fiction","Yasujirô Ozu",185f,"Vin Diesel, Jackie chan",126);
		Cintavideo cvideo5 = new Cintavideo(38,"El cielo sobre Berlín","Jean Renoir",89.6f,"Morgan Freeman, Brad Pitt",138);
		Set <Cintavideo> videoslista = new HashSet<Cintavideo>();
		
		videoslista.add(cvideo1);
		videoslista.add(cvideo2);
		videoslista.add(cvideo3);
		videoslista.add(cvideo4);
		videoslista.add(cvideo5);

		
		for (Cintavideo cintavideo : videoslista) {
			System.out.println(cintavideo.id + " " + cintavideo.titulo + " " + cintavideo.autor + " " + cintavideo.precio + " " + cintavideo.actores + " "  + cintavideo.duracion );
		}
		
		
		




		
	}

}
