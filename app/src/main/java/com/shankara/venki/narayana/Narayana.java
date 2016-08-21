package com.shankara.venki.narayana;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Narayana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvKannada = (TextView) findViewById(R.id.tvKannada);
        tvKannada.setMovementMethod(new ScrollingMovementMethod());


        Typeface faceAkshar = Typeface.createFromAsset(getAssets(),
                "akshar.ttf");

        tvKannada.setTypeface(faceAkshar);

        tvKannada.setText("ನಾರಾಯಣ ನಾರಾಯಣ ಜಯ ಗೋವಿಂದ ಹರೇ ||\n" +
                "ನಾರಾಯಣ ನಾರಾಯಣ ಜಯ ಗೋಪಾಲ ಹರೇ ||\n" +
                "ಕರುಣಾಪಾರಾವಾರ ವರುಣಾಲಯಗಂಭೀರ ನಾರಾಯಣ || 1 ||\n" +
                "ಘನನೀರದಸಂಕಾಶ ಕೃತಕಲಿಕಲ್ಮಷನಾಶನ ನಾರಾಯಣ || 2 ||\n" +
                "ಯಮುನಾತೀರವಿಹಾರ ಧೃತಕೌಸ್ತುಭಮಣಿಹಾರ ನಾರಾಯಣ || 3 ||\n" +
                "ಪೀತಾಂಬರಪರಿಧಾನ ಸುರಕಳ್ಯಾಣನಿಧಾನ ನಾರಾಯಣ || 4 ||\n" +
                "ಮಂಜುಲಗುಂಜಾಭೂಷ ಮಾಯಾಮಾನುಷವೇಷ ನಾರಾಯಣ || 5 ||\n" +
                "ರಾಧಾಧರಮಧುರಸಿಕ ರಜನೀಕರಕುಲತಿಲಕ ನಾರಾಯಣ || 6 ||\n" +
                "ಮುರಳೀಗಾನವಿನೋದ ವೇದಸ್ತುತಭೂಪಾದ ನಾರಾಯಣ || 7 ||\n" +
                "ಬರ್ಹಿನಿಬರ್ಹಾಪೀಡ ನಟನಾಟಕಫಣಿಕ್ರೀಡ ನಾರಾಯಣ || 8 ||\n" +
                "ವಾರಿಜಭೂಷಾಭರಣ ರಾಜೀವರುಕ್ಮಿಣೀರಮಣ ನಾರಾಯಣ || 9 ||\n" +
                "ಜಲರುಹದಳನಿಭನೇತ್ರ ಜಗದಾರಂಭಕಸೂತ್ರ ನಾರಾಯಣ || 10 ||\n" +
                "ಪಾತಕರಜನೀಸಂಹಾರ ಕರುಣಾಲಯ ಮಾಮುದ್ಧರ ನಾರಾಯಣ || 11 ||\n" +
                "ಅಘ ಬಕಹಯಕಂಸಾರೇ ಕೇಶವ ಕೃಷ್ಣ ಮುರಾರೇ ನಾರಾಯಣ || 12 ||\n" +
                "ಹಾಟಕನಿಭಪೀತಾಂಬರ ಅಭಯಂ ಕುರು ಮೇ ಮಾವರ ನಾರಾಯಣ || 13 ||\n" +
                "ದಶರಥರಾಜಕುಮಾರ ದಾನವಮದಸಂಹಾರ ನಾರಾಯಣ || 14 ||\n" +
                "ಗೋವರ್ಧನಗಿರಿ ರಮಣ ಗೋಪೀಮಾನಸಹರಣ ನಾರಾಯಣ || 15 ||\n" +
                "ಸರಯುತೀರವಿಹಾರ ಸಜ್ಜನ\u200Cಋಷಿಮಂದಾರ ನಾರಾಯಣ || 16 ||\n" +
                "ವಿಶ್ವಾಮಿತ್ರಮಖತ್ರ ವಿವಿಧವರಾನುಚರಿತ್ರ ನಾರಾಯಣ || 17 ||\n" +
                "ಧ್ವಜವಜ್ರಾಂಕುಶಪಾದ ಧರಣೀಸುತಸಹಮೋದ ನಾರಾಯಣ || 18 ||\n" +
                "ಜನಕಸುತಾಪ್ರತಿಪಾಲ ಜಯ ಜಯ ಸಂಸ್ಮೃತಿಲೀಲ ನಾರಾಯಣ || 19 ||\n" +
                "ದಶರಥವಾಗ್ಧೃತಿಭಾರ ದಂಡಕ ವನಸಂಚಾರ ನಾರಾಯಣ || 20 ||\n" +
                "ಮುಷ್ಟಿಕಚಾಣೂರಸಂಹಾರ ಮುನಿಮಾನಸವಿಹಾರ ನಾರಾಯಣ || 21 ||\n" +
                "ವಾಲಿವಿನಿಗ್ರಹಶೌರ್ಯ ವರಸುಗ್ರೀವಹಿತಾರ್ಯ ನಾರಾಯಣ || 22 ||\n" +
                "ಮಾಂ ಮುರಳೀಕರ ಧೀವರ ಪಾಲಯ ಪಾಲಯ ಶ್ರೀಧರ ನಾರಾಯಣ || 23 ||\n" +
                "ಜಲನಿಧಿ ಬಂಧನ ಧೀರ ರಾವಣಕಂಠವಿದಾರ ನಾರಾಯಣ || 24 ||\n" +
                "ತಾಟಕಮರ್ದನ ರಾಮ ನಟಗುಣವಿವಿಧ ಸುರಾಮ ನಾರಾಯಣ || 25 ||\n" +
                "ಗೌತಮಪತ್ನೀಪೂಜನ ಕರುಣಾಘನಾವಲೋಕನ ನಾರಾಯಣ || 26 ||\n" +
                "ಸಂಭ್ರಮಸೀತಾಹಾರ ಸಾಕೇತಪುರವಿಹಾರ ನಾರಾಯಣ || 27 ||\n" +
                "ಅಚಲೋದ್ಧೃತಚಂಚತ್ಕರ ಭಕ್ತಾನುಗ್ರಹತತ್ಪರ ನಾರಾಯಣ || 28 ||\n" +
                "ನೈಗಮಗಾನವಿನೋದ ರಕ್ಷಿತ ಸುಪ್ರಹ್ಲಾದ ನಾರಾಯಣ || 29 ||\n" +
                "ಭಾರತ ಯತವರಶಂಕರ ನಾಮಾಮೃತಮಖಿಲಾಂತರ ನಾರಾಯಣ || 30 ||");
    }
}