/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ignoi
 */
public class HTTPHeader {

    private Method metodo;
    private String versao;

    public HTTPHeader() {
    }

    public HTTPHeader(Method metodo) {
        this.metodo = metodo;
        this.versao = "HTTP/1.1";
    }

    public Method getMetodo() {
        return metodo;
    }

    public void setMetodo(Method metodo) {
        this.metodo = metodo;
    }

    public String getVersao() {
        return versao;
    }

}
