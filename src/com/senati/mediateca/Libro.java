package com.senati.mediateca;

public class Libro extends Soporte{
	//Para heredar atributos de una clase superior
	//extends SuperClase
	int nropag;
	int nroisbn;
	//Constructores llenos
	public Libro(int id, String titulo, String autor, float precio, int nropag, int nroisbn) {
		super(id, titulo, autor, precio);
		this.nropag = nropag;
		this.nroisbn = nroisbn;
	}

	
	//Constructores vacios
	public Libro() {
		super();
	}
	//	gETTERS Y SETTERS


	public int getNropag() {
		return nropag;
	}


	public void setNropag(int nropag) {
		this.nropag = nropag;
	}


	public int getNroisbn() {
		return nroisbn;
	}


	public void setNroisbn(int nroisbn) {
		this.nroisbn = nroisbn;
	}
	//TOSTRING


	@Override
	public String toString() {
		return "Libro [nropag=" + nropag + ", nroisbn=" + nroisbn + ", id=" + id + ", titulo=" + titulo + ", autor="
				+ autor + ", precio=" + precio + "]";
	}

	
	
}
