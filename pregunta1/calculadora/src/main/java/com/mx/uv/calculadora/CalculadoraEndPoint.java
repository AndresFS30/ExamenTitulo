package com.mx.uv.calculadora;

import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.com_mx_uv_calculadora.calculadora.DivisionRequest;
import https.com_mx_uv_calculadora.calculadora.DivisionResponse;
import https.com_mx_uv_calculadora.calculadora.MultiplicacionRequest;
import https.com_mx_uv_calculadora.calculadora.MultiplicacionResponse;
import https.com_mx_uv_calculadora.calculadora.RestaRequest;
import https.com_mx_uv_calculadora.calculadora.RestaResponse;
import https.com_mx_uv_calculadora.calculadora.SumaRequest;
import https.com_mx_uv_calculadora.calculadora.SumaResponse;

public class CalculadoraEndPoint {
    @PayloadRoot(localPart = "SumaRequest", namespace = "https://com.mx.uv/calculadora")
    @ResponsePayload
    public SumaResponse sumar(@RequestPayload SumaRequest peticion){

        SumaResponse respuesta = new SumaResponse();
        respuesta.setRespuesta(peticion.getValora() + peticion.getValorb());

        return respuesta;
    }

    @PayloadRoot(localPart = "RestaRequest", namespace = "https://com.mx.uv/calculadora")
    @ResponsePayload
    public RestaResponse restar(@RequestPayload RestaRequest peticion){

        RestaResponse respuesta = new RestaResponse();
        respuesta.setRespuesta(peticion.getValora() - peticion.getValorb());

        return respuesta;
    }

    @PayloadRoot(localPart = "MultiplicacionRequest", namespace = "https://com.mx.uv/calculadora")
    @ResponsePayload
    public MultiplicacionResponse multiplicar(@RequestPayload MultiplicacionRequest peticion){

        MultiplicacionResponse respuesta = new MultiplicacionResponse();
        respuesta.setRespuesta(peticion.getValora() * peticion.getValorb());

        return respuesta;
    }
    
    @PayloadRoot(localPart = "DivisionRequest", namespace = "https://com.mx.uv/calculadora")
    @ResponsePayload
    public DivisionResponse dividir(@RequestPayload DivisionRequest peticion){

        DivisionResponse respuesta = new DivisionResponse();
        respuesta.setRespuesta(peticion.getValora() / peticion.getValorb());

        return respuesta;
    }
}
