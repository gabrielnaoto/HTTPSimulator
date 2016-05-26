/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import modelo.HTTPHeader;
import modelo.Method;
import modelo.cliente.Response;
import modelo.cliente.Status;
import modelo.servidor.Request;
import modelo.servidor.RequestHeader;
import modelo.servidor.Servidor;
import visao.Browser;

/**
 *
 * @author ignoi
 */
public class BrowserControler {
    
    private Browser navegador;
    private Servidor server;
    private boolean ok = false;
    private boolean auth = false;
    private boolean sr = false;
    private boolean conection = false;
    
    public BrowserControler() {
        navegador = new Browser();
        server = new Servidor();
        carregarHistorico();
        init();
        
    }
    
    public void init() {
        navegador.jrOK.setSelected(true);
        
        navegador.botaoIr.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = (String) navegador.caixaHistorico.getSelectedItem();
                if (navegador.jrBAD_GATEWAY.isSelected()) {
                    sr = true;
                    auth = conection = ok = false;
                } else {
                    if (navegador.jrTIMED_OUT.isSelected()) {
                        conection = true;
                        auth = sr = ok = false;
                    } else {
                        if (navegador.jrbUNAUTHORIZED.isSelected()) {
                            auth = true;
                            sr = conection = ok = false;
                        } else {
                            ok = true;
                            auth = conection = sr = false;
                        }
                    }
                }
                Response r = getRequest(texto);
                if (r.getS().equals(Status.OK)) {
                    navegador.labelConteudo.setText(null);
                    navegador.labelConteudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + texto + ".png")));
                } else {
                    navegador.labelConteudo.setIcon(null);
                    navegador.labelConteudo.setText(r.getS().toString());
                    
                }
                
                popUpText("RESPONSE", r.toString());
            }
        });
    }
    
    public void carregarHistorico() {
        String[] hosts = server.getH();
        for (String host : hosts) {
            navegador.caixaHistorico.addItem(host);
        }
        navegador.caixaHistorico.addItem("www.orkut.com");
    }
    
    public void run() {
        navegador.setVisible(true);
    }
    
    public void popUpText(String title, String text) {
        JTextArea textArea = new JTextArea(text);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Courier New", Font.PLAIN, 14));
        scrollPane.setPreferredSize(new Dimension(600, 320));
        JOptionPane.showMessageDialog(null, scrollPane, title,
                JOptionPane.YES_NO_OPTION);
    }
    
    public Response getRequest(String url) {
        RequestHeader rh = new RequestHeader(); //exemplos de cabeçalhos
        rh.setAccept("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        rh.setAccept_encoding("gzip, deflate, br");
        rh.setAccept_language("pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3");
        rh.setUser_agent("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:46.0) Firefox/46.0");
        Request r = new Request(new HTTPHeader(Method.GET), rh);
        r.setHost(url);
        popUpText("REQUEST", r.toString());
        return server.postResponse(r, ok, conection, sr, auth);
    }
    
}
