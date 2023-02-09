package edu.escuelaing.arem.ASE.app.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RestServiceJpg implements RestService{
    @Override
    public String getHeader() {
        return "HTTP/1.1 200 OK\r\n" +
                "Content-type: image/png\r\n" +
                "\r\n";
    }

    @Override
    public String getResponse() {
        String content = null;
//        String answer;
        try {
            Path file = new File("src/main/resources/imagen2.png").toPath();
            content = Files.probeContentType(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
