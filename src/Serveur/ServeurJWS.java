package Serveur;

import javax.xml.ws.Endpoint;
import Service.CalculatriceWS;

public class ServeurJWS {
    public static void main(String[] args) {

        CalculatriceWS calculatrice = new CalculatriceWS();

        String url = "http://localhost:8084/";
        Endpoint.publish(url, new CalculatriceWS());

        System.out.println("Service web CalculatriceWS publié à l'URL : " + url);


    }
}
