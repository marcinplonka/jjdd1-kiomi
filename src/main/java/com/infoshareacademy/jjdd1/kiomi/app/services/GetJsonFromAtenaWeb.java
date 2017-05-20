package com.infoshareacademy.jjdd1.kiomi.app.services;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.infoshareacademy.jjdd1.kiomi.app.model.cars.CarFromAztecJson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


/**
 * Created by arek50 on 2017-04-27.
 */
public class GetJsonFromAtenaWeb {
    private static final Logger LOGGER = LoggerFactory.getLogger(GetJsonFromAtenaWeb.class);
//    private static String aztecJson = "AztecCodeResult.json";

    private String JSON_DATA_TAG = "Dane";

    private final static String USER_KEY = "qY2?0Pw!";

    public CarFromAztecJson getJsonFile(String code) throws IOException {
        String aztecCode = (code.length() > 5) ? code : "";

        Gson gson = new Gson();
        InputStream is = new URL("https://aztec.atena.pl/PWM2/rest/aztec/getbysession?sessionKey=" + code + "&userKey=" + USER_KEY).openStream();
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
//
//        JsonObject response = gson.fromJson(bufferedReader, JsonObject.class);
//        JsonElement data = response.get(JSON_DATA_TAG);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(

                this.getClass().getResourceAsStream("/" + aztecCode)));

        AztecConfiguration aztecConfiguration = new AztecConfiguration();
        BufferedReader bReader = aztecConfiguration.replaceFromMap(bufferedReader);

        JsonObject response = gson.fromJson(bReader, JsonObject.class);

        JsonElement data = response.get(JSON_DATA_TAG);

        return gson.fromJson(data, new TypeToken<CarFromAztecJson>() {
        }.getType());

//        return null;
    }
}
