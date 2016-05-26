/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.cliente;

import modelo.HTTPHeader;

/**
 *
 * @author ignoi
 */
public class Response {

    private HTTPHeader cabecalho;
    private Status s;
    private ResponseHeader rh;
    private String content;

    public Response() {
        this.rh = new ResponseHeader();
    }

    public Response(Status s) {
        this.s = s;
        this.rh = new ResponseHeader();
    }

    public Response(HTTPHeader cabecalho, Status s) {
        this.cabecalho = cabecalho;
        this.s = s;
        this.rh = new ResponseHeader();
    }

    public ResponseHeader getRh() {
        return rh;
    }

    public void setRh(ResponseHeader rh) {
        this.rh = rh;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public HTTPHeader getCabecalho() {
        return cabecalho;
    }

    public void setCabecalho(HTTPHeader cabecalho) {
        this.cabecalho = cabecalho;
    }

    public Status getS() {
        return s;
    }

    @Override
    public String toString() {
        return cabecalho.getVersao() + " " + s.getStatus().toUpperCase() + "\n"
                + "date: " + rh.getData() + "\n"
                + rh.toString();
    }

}
