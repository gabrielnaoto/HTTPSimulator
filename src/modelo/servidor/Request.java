/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.servidor;

import modelo.HTTPHeader;

/**
 *
 * @author ignoi
 */
public class Request {

    private HTTPHeader cabecalho;
    private String URI;
    private String host;
    private RequestHeader req;

    public Request() {
    }

    public String getURI() {
        return URI;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public RequestHeader getReq() {
        return req;
    }

    public void setReq(RequestHeader req) {
        this.req = req;
    }

    public HTTPHeader getCabecalho() {
        return cabecalho;
    }

    public void setCabecalho(HTTPHeader cabecalho) {
        this.cabecalho = cabecalho;
    }

    public Request(HTTPHeader cabecalho, RequestHeader req) {
        this.cabecalho = cabecalho;
        this.req = req;
    }

    @Override
    public String toString() {
        if (URI == null){
            URI = "index.html";
        }
        return cabecalho.getMetodo() + " " + URI + " " + cabecalho.getVersao() + "\n"
                + "host: " + host + "\n" + req;
    }

}
