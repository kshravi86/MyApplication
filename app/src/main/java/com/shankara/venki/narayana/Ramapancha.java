package com.shankara.venki.narayana;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Ramapancha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvKannada = (TextView) findViewById(R.id.tvKannada);
        tvKannada.setMovementMethod(new ScrollingMovementMethod());


        Typeface faceAkshar = Typeface.createFromAsset(getAssets(),
                "akshar.ttf");

        tvKannada.setTypeface(faceAkshar);

        tvKannada.setText("ಕಂಜಾತಪತ್ರಾಯತ ಲೋಚನಾಯ ಕರ್ಣಾವತಂಸೋಜ್ಜ್ವಲ ಕುಂಡಲಾಯ\n" +
                "ಕಾರುಣ್ಯಪಾತ್ರಾಯ ಸುವಂಶಜಾಯ ನಮೋಸ್ತು ರಾಮಾಯಸಲಕ್ಷ್ಮಣಾಯ || 1 ||\n" +
                "ವಿದ್ಯುನ್ನಿಭಾಂಭೋದ ಸುವಿಗ್ರಹಾಯ ವಿದ್ಯಾಧರೈಸ್ಸಂಸ್ತುತ ಸದ್ಗುಣಾಯ\n" +
                "ವೀರಾವತಾರಯ ವಿರೋಧಿಹರ್ತ್ರೇ ನಮೋಸ್ತು ರಾಮಾಯಸಲಕ್ಷ್ಮಣಾಯ || 2 ||\n" +
                "ಸಂಸಕ್ತ ದಿವ್ಯಾಯುಧ ಕಾರ್ಮುಕಾಯ ಸಮುದ್ರ ಗರ್ವಾಪಹರಾಯುಧಾಯ\n" +
                "ಸುಗ್ರೀವಮಿತ್ರಾಯ ಸುರಾರಿಹಂತ್ರೇ ನಮೋಸ್ತು ರಾಮಾಯಸಲಕ್ಷ್ಮಣಾಯ || 3 ||\n" +
                "ಪೀತಾಂಬರಾಲಂಕೃತ ಮಧ್ಯಕಾಯ ಪಿತಾಮಹೇಂದ್ರಾಮರ ವಂದಿತಾಯ\n" +
                "ಪಿತ್ರೇ ಸ್ವಭಕ್ತಸ್ಯ ಜನಸ್ಯ ಮಾತ್ರೇ ನಮೋಸ್ತು ರಾಮಾಯಸಲಕ್ಷ್ಮಣಾಯ || 4 ||\n" +
                "ನಮೋ ನಮಸ್ತೇ ಖಿಲ ಪೂಜಿತಾಯ ನಮೋ ನಮಸ್ತೇಂದುನಿಭಾನನಾಯ\n" +
                "ನಮೋ ನಮಸ್ತೇ ರಘುವಂಶಜಾಯ ನಮೋಸ್ತು ರಾಮಾಯಸಲಕ್ಷ್ಮಣಾಯ || 5 ||\n" +
                "ಇಮಾನಿ ಪಂಚರತ್ನಾನಿ ತ್ರಿಸಂಧ್ಯಂ ಯಃ ಪಠೇನ್ನರಃ\n" +
                "ಸರ್ವಪಾಪ ವಿನಿರ್ಮುಕ್ತಃ ಸ ಯಾತಿ ಪರಮಾಂ ಗತಿಮ್ ||\n" +
                "ಇತಿ ಶ್ರೀಶಂಕರಾಚಾರ್ಯ ವಿರಚಿತ ಶ್ರೀರಾಮಪಂಚರತ್ನಂ ಸಂಪೂರ್ಣಂ\n");
    }
}
