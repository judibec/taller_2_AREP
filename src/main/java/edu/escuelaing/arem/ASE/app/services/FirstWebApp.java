package edu.escuelaing.arem.ASE.app.services;

import edu.escuelaing.arem.ASE.app.HttpServer;

import java.io.IOException;

public class FirstWebApp {

    public static void main(String[] args) throws IOException{
        HttpServer server = HttpServer.getInstance();
        server.addServices("/index", new RestServiceHtml());
        server.addServices("/script", new RestServiceJs());
        server.addServices("/style", new RestServiceCss());
        server.addServices("/imagen", new RestServiceJpg());
        server.run(args);
    }
}
