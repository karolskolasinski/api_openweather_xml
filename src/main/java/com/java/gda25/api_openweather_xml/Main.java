package com.java.gda25.api_openweather_xml;

import com.java.gda25.api_openweather_xml.model.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final String URL = "http://api.openweathermap.org/data/2.5/weather?q={city}&appid=b1b9ff4b53591e70e67fd8c4ca0c08f3&mode=xml";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w konsolowej aplikacji do pobierania pogody z api_openweather_xml API.");

        String city = loadCityFromUser(scanner).toString();
        String requestURL = URL.replace("{city}", city.toLowerCase());

        System.out.println("Your request url is: " + requestURL);

        przetwarzanieXML(scanner, requestURL);

    }

    private static void przetwarzanieXML(Scanner scanner, String requestURL) {
        String content = loadContentFromURL(requestURL);
        if (content == null) {
            System.err.println("Brak danych");
            System.exit(1);
        }

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Current.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Current current = (Current) unmarshaller.unmarshal(new URL(requestURL));


            String choice = loadParamFromUser(scanner).toString();
            switch (choice) {
                case "TEMPERATURA":
                    if (current.getTemperature() != null) {
                        System.out.println("Temperature: " + current.getTemperature());
                    }
                    break;
                case "WILGOTNOSC":
                    if (current.getHumidity() != null) {
                        System.out.println("Humidity: " + current.getHumidity());
                    }
                    break;
                case "CISNIENIE":
                    if (current.getPressure() != null) {
                        System.out.println("Pressure: " + current.getPressure());
                    }
                    break;
                case "WIATR":
                    if (current.getWind() != null) {
                        System.out.println("Wind: " + current.getWind());
                    }
                    break;
                case "CHMURY":
                    if (current.getClouds() != null) {
                        System.out.println("Clouds: " + current.getClouds());
                    }
                    break;
                case "SLONCE":
                    if (current.getClouds() != null) {
                        System.out.println("Sun: " + current.getSun());
                    }
                    break;
            }
        } catch (UnmarshalException ue) {
            System.err.println("Brak danych!");
            System.exit(2);
        } catch (JAXBException | MalformedURLException e) {
            e.printStackTrace();
        }
    }


    private static String loadContentFromURL(String requestURL) {
        String apiWeatherContent = null;
        try {
            URL url = new URL(requestURL);
            InputStream inputStream = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder builder = new StringBuilder();
            String liniaTekstuZReadera;
            while ((liniaTekstuZReadera = bufferedReader.readLine()) != null) {
                builder.append(liniaTekstuZReadera);
            }
            bufferedReader.close();
            apiWeatherContent = builder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return apiWeatherContent;
    }


    private static Cities loadCityFromUser(Scanner scanner) {
        Cities citiesEnum = null;
        do {
            try {
                System.out.println("podaj miasto: " + Arrays.toString(Cities.values()));
                String city = scanner.nextLine();
                citiesEnum = Cities.valueOf(city.toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.err.println("Niepoprawne miasto, podaj je ponownie.");
            }
        } while (citiesEnum == null);
        return citiesEnum;
    }


    private static ForecastParam loadParamFromUser(Scanner scanner) {
        ForecastParam forecastParamEnum = null;
        do {
            try {
                System.out.println("podaj parametry: " + Arrays.toString(ForecastParam.values()).toLowerCase());
                String params = scanner.nextLine();
                forecastParamEnum = ForecastParam.valueOf(params.toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.err.println("Niepoprawny parametr, podaj go ponownie.");
            }
        } while (forecastParamEnum == null);
        return forecastParamEnum;
    }


    private static ForecastType loadForecastTypeFromUser(Scanner scanner) {
        ForecastType forecastTypeEnum = null;
        do {
            try {
                System.out.println("wybierz typ pogody: " + Arrays.toString(ForecastType.values()));
                String typPogody = scanner.nextLine();
                forecastTypeEnum = ForecastType.valueOf(typPogody.toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.err.println("Niepoprawny typ pogody, podaj go ponownie.");
            }
        } while (forecastTypeEnum == null);
        return forecastTypeEnum;
    }
}
