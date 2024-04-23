package com.viewnext.gestionbiblioteca;

import java.util.Arrays;

public class Socio extends Usuario{
	private int contadorDocumentos;
	
	private static final int NUMERO_DIAS_PRESTAMO_LIBRO = 30 ;
	private static final int NUMERO_DIAS_PRESTAMO_REVISTA= 10 ;
	
	public Socio(String dniUsuario, String nombreUsuario) {
		super(dniUsuario, nombreUsuario);
		vectorDocumentos= new Documento[20];
		contadorDocumentos= 0;

	}


	@Override
	public String toString() {
		return "Socio [Documentos prestados=" + contadorDocumentos + ", dniUsuario=" + dniUsuario + ", nombreUsuario="
				+ nombreUsuario + ", Capacidad de documentos total="+ vectorDocumentos.length + "]";
	}
	public String documentosEnPrestamo() {
		String cadena= "";
		if(contadorDocumentos== 0) {
			cadena =  "Este Socio no tiene ningun documento";
		}
		else {
			for( int posVector = 0; posVector < contadorDocumentos ; posVector++) {
				Documento docu = vectorDocumentos[posVector];
				cadena = cadena + "(" + posVector + ")"+ docu.toString()+ "\n";
			}
		}
		return  cadena;
	}

	@Override
	boolean prestamoLibro(int diasPrestamo,Documento docu) {
		if(diasPrestamo > 0 && diasPrestamo <= NUMERO_DIAS_PRESTAMO_LIBRO ) {
			if (contadorDocumentos < vectorDocumentos.length) {
				vectorDocumentos[contadorDocumentos] = docu;
				contadorDocumentos++;
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	@Override
	boolean prestamoRevista(int diasPrestamo, Documento docu) {
		if(diasPrestamo > 0 && diasPrestamo <= NUMERO_DIAS_PRESTAMO_REVISTA ) {
			if (contadorDocumentos < vectorDocumentos.length) {
				vectorDocumentos[contadorDocumentos] = docu;
				contadorDocumentos++;
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

}