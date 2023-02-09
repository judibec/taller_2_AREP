package edu.escuelaing.arem.ASE.app.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RestServiceJs implements RestService{
    @Override
    public String getHeader() {
        return "HTTP/1.1 200 OK\r\n" +
                "Content-type: text/javascript\r\n" +
                "\r\n";
    }

    @Override
    public String getResponse() {
        byte[] content = new byte[0];
//        String answer;
        try {
            Path file = Paths.get("src/main/resources/script.js");
            content = Files.readAllBytes(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(content);
    }
}
