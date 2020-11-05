package Peticiones;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class peticion {

    public static void main(String[] args) {

        try {

            String url = "https://api.openbrewerydb.org/breweries";
            URL endPoint = new URL(url);
            HttpsURLConnection connection = (HttpsURLConnection) endPoint.openConnection();

            System.out.println("Listado de Cervecerias : " );
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null){
                response.append(inputLine);
            }
            in.close();

            System.out.println(response.toString());



        } catch (IOException ignored) {
        }


    }

}

