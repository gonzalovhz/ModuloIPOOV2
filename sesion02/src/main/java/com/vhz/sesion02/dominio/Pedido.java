package com.vhz.sesion02.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private String nroPedido;
	private Fecha fechaPedido;
	
	//ASOCIACIÓN: Composición
	private List<LineaPedido> lineaPedido;

	public Pedido() {
		this.lineaPedido = new ArrayList<LineaPedido>();
	}

	public String getNroPedido() {
		return nroPedido;
	}

	public void setNroPedido(String nroPedido) {
		this.nroPedido = nroPedido;
	}

	public Fecha getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Fecha fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public List<LineaPedido> getLineaPedido() {
		return lineaPedido;
	}

	public void setLineaPedido(List<LineaPedido> lineaPedido) {
		this.lineaPedido = lineaPedido;
	}
	
	
}
