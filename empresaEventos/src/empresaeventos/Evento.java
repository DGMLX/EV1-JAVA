/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaeventos;

import java.time.LocalDate;

/**
 *
 * @author DIEGO ALTAMIRANO
 */
public class Evento {
    //atributos
    private int valor;
    private String nombreEvento,direccion;
    private LocalDate fechaInicio,fechaFin;

    public Evento() {
    }

    public Evento(int valor, String nombreEvento, String direccion, LocalDate fechaInicio, LocalDate fechaFin) {
        setValor(valor);
        setNombreEvento(nombreEvento);
        this.direccion = direccion;
        this.fechaInicio = fechaInicio;
        setFechaFin(fechaFin);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if(valor>150000){
            this.valor = valor;
        }else{
            System.out.println("El valor del evento debe ser mayor a $150.000");
        }
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        if(nombreEvento.isEmpty()){
            System.out.println("El nombre del evento no puede estar vacio.");
        }else{
            this.nombreEvento = nombreEvento;
        }
        
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        if(fechaFin.isAfter(this.fechaInicio) || fechaFin.isEqual(this.fechaInicio)){
            this.fechaFin = fechaFin;
        }else{
            System.out.println("ERROR DE FECHA. Fecha de fin de evento debe ser mayor a fecha de inicio.");
        }
        
    }

    @Override
    public String toString() {
        return "Evento{" + "valor=" + valor + ", nombreEvento=" + nombreEvento + ", direccion=" + direccion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }
    
    public void mostrarInfoEvento(){
        System.out.println("   EVENTO "+ this.nombreEvento);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Valor: " + this.valor);
        System.out.println("Fecha Inicio: " + this.fechaInicio);
        System.out.println("Fecha Fin: " + this.fechaFin);
    
    }
    
    public int total(){
        return getValor();
    }
    
    
    
    
    
}

    

