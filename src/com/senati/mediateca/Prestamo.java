package com.senati.mediateca;

public class Prestamo extends Soporte {
	int id;
	float monto;
	float cantidad;
	int idsocio;
	int idsoporte;
	
	public Prestamo(int id, String titulo, String autor, float precio, int id2, float monto, float cantidad,
			int idsocio, int idsoporte) {
		super(id, titulo, autor, precio);
		id = id2;
		this.monto = monto;
		this.cantidad = cantidad;
		this.idsocio = idsocio;
		this.idsoporte = idsoporte;
	}

	public Prestamo() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public int getIdsocio() {
		return idsocio;
	}

	public void setIdsocio(int idsocio) {
		this.idsocio = idsocio;
	}

	public int getIdsoporte() {
		return idsoporte;
	}

	public void setIdsoporte(int idsoporte) {
		this.idsoporte = idsoporte;
	}

	@Override
	public String toString() {
		return "Prestamo [id=" + id + ", monto=" + monto + ", cantidad=" + cantidad + ", idsocio=" + idsocio
				+ ", idsoporte=" + idsoporte + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
	
	
	
}

