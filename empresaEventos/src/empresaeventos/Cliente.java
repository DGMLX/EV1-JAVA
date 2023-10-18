/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaeventos;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author DIEGO ALTAMIRANO
 */
public class Cliente {
    // atributos
    private char tipoCliente;
    private String correo,nombreCliente;
    private Evento evento;
    private int rut;

    public Cliente() {
    }

    public Cliente(char tipoCliente, String correo, String nombreCliente, Evento evento, int rut) {
        setTipoCliente(tipoCliente);
        this.correo = correo;
        setNombreCliente(nombreCliente);
        this.evento = evento;
        this.rut = rut;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
        if(tipoCliente=='N' || tipoCliente=='A'){
            this.tipoCliente = tipoCliente;
        }else{
            System.out.println("Debes ingresar el caracter N(cliente Nuevo) o A(cliente antiguo)");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        if(nombreCliente.isEmpty()){
            System.out.println("El nombre del cliente no puede ir vacio.");
        }else{
            this.nombreCliente = nombreCliente;
        }
        
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Cliente{" + "tipoCliente=" + tipoCliente + ", correo=" + correo + ", nombreCliente=" + nombreCliente + ", evento=" + evento + ", rut=" + rut + '}';
    }
    
    
    public void correoRecordatorio(LocalDate fecha){
        LocalDate fechaAviso = LocalDate.of(2023,Month.SEPTEMBER,24);
        LocalDate fech = LocalDate.of(2023,Month.SEPTEMBER,23);
        if(fechaAviso.isBefore(fecha) && fechaAviso.isAfter(fech)){
            System.out.println("Estimado cliente le enviamos este correo recordatorio para avisarle que mañana es el día del evento ");
        }     
    }
    
    /*
    Debe existir un método que permita realizar un descuento al evento,
    dependiendo del cliente y del valor. Si el cliente es nuevo o el evento
    tiene un costo de $1.000.000 mínimo, se aplicará un descuento de x%.
    */
    
    public void realizarDescuento(float descuento,int total){
        if(tipoCliente=='N' || total>=1000000){
            System.out.println("Se ha aplicado un descuento al total a pagar.");
            System.out.println("Total a pagar: " + "$"+total);
            System.out.println("Descuento aplicado: " + descuento + "%");

            descuento = descuento/100;
            descuento = total*descuento;
            total = total - (int)descuento;
            System.out.println("Total a pagar con descuento: " + "$"+total);
        }else{
            System.out.println("No se puede agregar descuento al total a pagar.");
        }
        
        
    }
    
    public void crearEventoCliente(String direccion,LocalDate fechaFin, LocalDate fechaInicio,String nombreEvento,int valor){
        this.evento.setDireccion(direccion);
        this.evento.setFechaFin(fechaFin);
        this.evento.setFechaInicio(fechaInicio);
        this.evento.setNombreEvento(nombreEvento);
        this.evento.setValor(valor);
    }
    
}
