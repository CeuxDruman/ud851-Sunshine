/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
    private TextView weatherDisplayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView
        weatherDisplayTextView = (TextView) findViewById(R.id.tv_weather_data);

        // TODO (3) Create an array of Strings that contain fake weather data
        String[] fakeWeatherData = new String[]{
                "A Coruña \t16 \t7\n",
                "Albacete \t14 \t6\n",
                "Alicante/Alacant \t20 \t10\n",
                "Almería \t19 \t8\n",
                "Ávila \t9 \t1\n",
                "Badajoz \t14 \t7\n",
                "Barcelona \t18 \t10\n",
                "Bilbao \t16 \t6\n",
                "Burgos \t9 \t1\n",
                "Cáceres \t11 \t7\n",
                "Cádiz \t17 \t12\n",
                "Castellón de la Plana/Castelló de la Plana \t21 \t8\n",
                "Ceuta \t21 \t13\n",
                "Ciudad Real \t13 \t6\n",
                "Córdoba \t15 \t12\n",
                "Cuenca \t9 \t5\n",
                "Donostia/San Sebastián \t16 \t9\n",
                "Girona \t20 \t5\n",
                "Granada \t15 \t2\n",
                "Guadalajara \t10 \t6\n",
                "Huelva \t18 \t7\n",
                "Huesca \t14 \t3\n",
                "Jaén \t14 \t8\n",
                "León \t8 \t2\n",
                "Lleida \t15 \t4\n",
                "Logroño \t12 \t5\n",
                "Lugo \t12 \t2\n",
                "Madrid \t11 \t6\n",
                "Málaga \t19 \t12\n",
                "Melilla \t19 \t15\n",
                "Murcia \t22 \t8\n",
                "Ourense \t15 \t4\n",
                "Oviedo \t15 \t6\n",
                "Palencia \t10 \t2\n",
                "Palma de Mallorca \t19 \t8\n",
                "Palmas de Gran Canaria. Las \t22 \t15\n",
                "Pamplona/Iruña \t12 \t5\n",
                "Pontevedra \t15 \t6\n",
                "Salamanca \t9 \t3\n",
                "Santa Cruz de Tenerife \t21 \t15\n",
                "Santander \t16 \t8\n",
                "Segovia \t8 \t2\n",
                "Sevilla \t16 \t10\n",
                "Soria \t9 \t3\n",
                "Tarragona \t19 \t9\n",
                "Teruel \t13 \t3\n",
                "Toledo \t13 \t6\n",
                "Valencia \t21 \t9\n",
                "Valladolid \t9 \t4\n",
                "Vitoria-Gasteiz \t12 \t4\n",
                "Zamora \t10 \t4\n",
                "Zaragoza \t18 \t8"
        };

        // TODO (4) Append each String from the fake weather data array to the TextView
        for (String fakeWeatherFact : fakeWeatherData) {
            weatherDisplayTextView.append(fakeWeatherFact + "\n");
        }

        // Using setText to replace full text from View
//        String fullText = "";
//        for (String fakeWeatherFact : fakeWeatherData) {
//            fullText += fakeWeatherFact + "\n";
//        }
//        weatherDisplayTextView.setText(fullText);

        // Improving Java String concatenation
//        StringBuilder fullTextStringBuilder = new StringBuilder();
//        for (String fakeWeatherFact : fakeWeatherData) {
//            fullTextStringBuilder.append(fakeWeatherFact + "\n");
//        }
//        String fullText = fullTextStringBuilder.toString();
//        weatherDisplayTextView.setText(fullText);
    }
}