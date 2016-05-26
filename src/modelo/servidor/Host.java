/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.servidor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ignoi
 */
public class Host {

    private String ip;
    private List<String> pages;

    public Host() {
    }

    public Host(String ip) {
        this.ip = ip;
        this.pages = new ArrayList<>();
        pages.add("index.html");
    }

    public Host(String ip, List<String> pages) {
        this.ip = ip;
        this.pages = pages;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<String> getPages() {
        return pages;
    }

    public void setPages(List<String> pages) {
        this.pages = pages;
    }

}
