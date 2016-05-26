/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools  Templates
 * and open the template in the editor
 */
package modelo.cliente;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ignoi
 */
public class ResponseHeader {

    private Date data;
    private String content_type;
    private String transfer_encoding;
    private String connection;
    private String x_seen_by;
    private String server;
    private String content_encoding;

    public ResponseHeader() {
        data = Calendar.getInstance().getTime();
        content_type = "text/html; charset=UTF-8"; //exemplos de parametros
        connection = "close";
        server = " Microsoft-IIS/4.0";
        content_encoding = "gzip";
        transfer_encoding = "chunked";
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    public String getTransfer_encoding() {
        return transfer_encoding;
    }

    public void setTransfer_encoding(String transfer_encoding) {
        this.transfer_encoding = transfer_encoding;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getX_seen_by() {
        return x_seen_by;
    }

    public void setX_seen_by(String x_seen_by) {
        this.x_seen_by = x_seen_by;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getContent_encoding() {
        return content_encoding;
    }

    public void setContent_encoding(String content_encoding) {
        this.content_encoding = content_encoding;
    }

    @Override
    public String toString() {
        return "content-type: " + content_type + "\n"
                + "transfer-encoding: " + transfer_encoding + "\n"
                + "connection: " + connection + "\n"
                + "server: " + server + "\n"
                + "content-encoding: " + content_encoding;
    }

}
