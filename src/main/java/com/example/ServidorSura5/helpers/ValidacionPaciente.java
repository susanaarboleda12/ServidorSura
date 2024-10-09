package com.example.ServidorSura5.helpers;

import com.example.ServidorSura5.modelos.Paciente;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionPaciente {

    //1. Inyectar un objeto de la clase MODELO
    //Inyectar = traer una clase y usarla dentro de otra

    private Paciente paciente = new Paciente();

    //2. Creamos un metodo para cada campo que quiero validar
    public boolean validarNombres(String nombres){
        //PASO 1: se consulta una expresion regular
        //almacenandola en una variable de tipo String
        String expresionRegular="^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ ]+$";

        //PASO 2: Activar el patron
        Pattern patron = Pattern.compile(expresionRegular);

        //PASO 3: Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia = patron.matcher(nombres);

        //PASO 4: Indico si hubo o no hubo coincidencia
        if(coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }


    public boolean validarFechaNacimiento(LocalDate fecha){}

    public boolean validarciudad(String ciudad){
        //PASO 1: se consulta una expresion regular
        //almacenandola en una variable de tipo String
        String expresionRegular="^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ ]+$";

        //PASO 2: Activar el patron
        Pattern patron = Pattern.compile(expresionRegular);

        //PASO 3: Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia = patron.matcher(validarciudad());

        //PASO 4: Indico si hubo o no hubo coincidencia
        if(coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }

    public boolean validarcorreo(String correo){
        //PASO 1: se consulta una expresion regular
        //almacenandola en una variable de tipo String
        String expresionRegular="ejemplo@sura.com";

        //PASO 2: Activar el patron
        Pattern patron = Pattern.compile(expresionRegular);

        //PASO 3: Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia = patron.matcher(validarcorreo());

        //PASO 4: Indico si hubo o no hubo coincidencia
        if(coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }

    public boolean validartelefono(String telefono){
        //PASO 1: se consulta una expresion regular
        //almacenandola en una variable de tipo String
        String expresionRegular="^\\+?[0-9]{1,3}?[-.\\s]?([0-9]{2,3})[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";

        //PASO 2: Activar el patron
        Pattern patron = Pattern.compile(expresionRegular);

        //PASO 3: Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia = patron.matcher(validartelefono());

        //PASO 4: Indico si hubo o no hubo coincidencia
        if(coincidencia.find()){
            return true;
        }else{
            return false;
        }
    }

    public boolean validarips(String ips){//PASO 1: se consulta una expresion regular
        //almacenandola en una variable de tipo String
        String expresionRegular="^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ ]+$";

        //PASO 2: Activar el patron
        Pattern patron = Pattern.compile(expresionRegular);

        //PASO 3: Se busca coincidencia entre la cadena y el patron
        Matcher coincidencia = patron.matcher(validarips());

        //PASO 4: Indico si hubo o no hubo coincidencia
        if(coincidencia.find()){
            return true;
        }else{
            return false;
        }}

    public boolean validargrupoIngreso(String grupoIngreso){}

    public boolean validar(LocalDate fechaAfiliacion){}

}
