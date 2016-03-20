package com.vhz.sesion02.dominio;

public class LineaPedido {

	private int cantidad;
	
	//ASOCIACION: Agregación
	private Producto producto;

	public LineaPedido(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}
	
}
