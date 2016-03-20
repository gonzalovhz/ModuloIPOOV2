package com.vhz.sesion02.dominio;

public class Producto {
	private int codigo;
	private String nombre;
	private double precio;
	private TipoProducto tipoProd;
	
	public Producto(int codigo, String nombre, double precio, TipoProducto tipoProd) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.tipoProd = tipoProd;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public TipoProducto getTipoProd() {
		return tipoProd;
	}
	public void setTipoProd(TipoProducto tipoProd) {
		this.tipoProd = tipoProd;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", tipoProd=" + tipoProd
				+ "]";
	}
	
	
}
