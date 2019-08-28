package com.senati.mediateca;

public class Cintaaudio extends Soporte{
	//Atributos de la clase cintaaudio
		public String lugar;
		public float duracion;
		//Constructor con atributos
		public Cintaaudio(int id, String titulo, String autor, float precio, String lugar, float duracion) {
			super(id, titulo, autor, precio);
			this.lugar = lugar;
			this.duracion = duracion;
		}
		//Constructor sin atributos
		public Cintaaudio() {
			super();
		}
		//Getters y Setters -- para obtener y modificar
		public String getLugar() {
			return lugar;
		}
		public void setLugar(String lugar) {
			this.lugar = lugar;
		}
		public float getDuracion() {
			return duracion;
		}
		public void setDuracion(float duracion) {
			this.duracion = duracion;
		}
		//Tostring
		@Override
		public String toString() {
			return "Cintaaudio [lugar=" + lugar + ", duracion=" + duracion + ", id=" + id + ", titulo=" + titulo
					+ ", autor=" + autor + ", precio=" + precio + "]";
		}
		
		
		
}
