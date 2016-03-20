package com.vhz.sesion02.test;

import java.util.ArrayList;
import java.util.List;

import com.vhz.sesion02.dominio.Fecha;
import com.vhz.sesion02.dominio.LineaPedido;
import com.vhz.sesion02.dominio.Pedido;
import com.vhz.sesion02.dominio.Producto;
import com.vhz.sesion02.dominio.TipoProducto;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha fpedido1 = new Fecha(20, 03, 2016);
		Fecha fpedido2 = new Fecha(19, 03, 2016);

		Producto prod1 = new Producto(1, "Prod1", 12.3, TipoProducto.BEBIDAS);
		Producto prod2 = new Producto(2, "Prod2", 2.5, TipoProducto.OTROS);
		
		LineaPedido lin1 = new LineaPedido(2, prod1);
		LineaPedido lin2 = new LineaPedido(3, prod2);
		
		Pedido ped1 = new Pedido();
		ped1.setNroPedido("PED-TRUJ-0023");
		ped1.setFechaPedido(fpedido1);
		ped1.getLineaPedido().add(lin1);
		ped1.getLineaPedido().add(lin2);
		
		//CESTA PEDIDOS
		List<Pedido> cestaPedidos = new ArrayList<Pedido>();
		cestaPedidos.add(ped1);
		
		//Reporte
		cestaPedidos.stream().forEach((c)->{System.out.println("PEDIDO 1: " + c.toString());});
	}
}
