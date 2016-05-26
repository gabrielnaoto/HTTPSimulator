/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.servidor;

import java.util.ArrayList;
import java.util.List;
import modelo.HTTPHeader;
import modelo.Method;
import modelo.cliente.Response;
import modelo.cliente.Status;

/**
 *
 * @author ignoi
 */
public class Servidor {

    private List<Host> hosts = new ArrayList<>();
    private String[] h = {"www.facebook.com", "www.google.com", "www.udesc.br", "www.wikipedia.com", "www.apple.com", "www.microsoft.com", "www.ubuntu.com"};

    public Servidor() {
        for (String h1 : h) {
            hosts.add(new Host(h1));
        }

    }

    public Response postResponse(Request r, boolean ok, boolean conection, boolean server, boolean auth) {
        Response response = new Response(new HTTPHeader(Method.POST), Status.INTERNAL_SERVER_ERROR);
        if (ok) {
            for (Host host : hosts) {
                if (host.getIp().equals(r.getHost())) {
                    return new Response(new HTTPHeader(Method.POST), Status.OK);
                }
            }
        } else {
            if (conection) {
                return new Response(new HTTPHeader(Method.POST), Status.REQUEST_TIMED_OUT);
            } else {
                if (server) {
                    return new Response(new HTTPHeader(Method.POST), Status.BAD_GATEWAY);
                } else {
                    if (auth) {
                        return new Response(new HTTPHeader(Method.POST), Status.UNAUTHORIZED);
                    }
                }
            }
        }

        return response;
    }

    public String[] getH() {
        return h;
    }

}
