package com.shankara.venki.narayana;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Lalitapancha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvKannada = (TextView) findViewById(R.id.tvKannada);
        tvKannada.setMovementMethod(new ScrollingMovementMethod());


        Typeface faceAkshar = Typeface.createFromAsset(getAssets(),
                "akshar.ttf");

        tvKannada.setTypeface(faceAkshar);

        tvKannada.setText("ಪ್ರಾತಃ ಸ್ಮರಾಮಿ ಲಲಿತಾವದನಾರವಿಂದಂ\n" +
                "ಬಿಂಬಾಧರಂ ಪೃಥುಲಮೌಕ್ತಿಕಶೋಭಿನಾಸಮ್ |\n" +
                "ಆಕರ್ಣದೀರ್ಘನಯನಂ ಮಣಿಕುಂಡಲಾಢ್ಯಂ\n" +
                "ಮಂದಸ್ಮಿತಂ ಮೃಗಮದೋಜ್ಜ್ವಲಫಾಲದೇಶಮ್ || 1 ||\n" +
                "ಪ್ರಾತರ್ಭಜಾಮಿ ಲಲಿತಾಭುಜಕಲ್ಪವಲ್ಲೀಂ\n" +
                "ರಕ್ತಾಂಗುಳೀಯಲಸದಂಗುಳಿಪಲ್ಲವಾಢ್ಯಾಮ್ |\n" +
                "ಮಾಣಿಕ್ಯಹೇಮವಲಯಾಂಗದಶೋಭಮಾನಾಂ\n" +
                "ಪುಂಡ್ರೇಕ್ಷುಚಾಪಕುಸುಮೇಷುಸೃಣೀರ್ದಧಾನಾಮ್ || 2 ||\n" +
                "ಪ್ರಾತರ್ನಮಾಮಿ ಲಲಿತಾಚರಣಾರವಿಂದಂ\n" +
                "ಭಕ್ತೇಷ್ಟದಾನನಿರತಂ ಭವಸಿಂಧುಪೋತಮ್ |\n" +
                "ಪದ್ಮಾಸನಾದಿಸುರನಾಯಕಪೂಜನೀಯಂ\n" +
                "ಪದ್ಮಾಂಕುಶಧ್ವಜಸುದರ್ಶನಲಾಂಛನಾಢ್ಯಮ್ || 3 ||\n" +
                "ಪ್ರಾತಃ ಸ್ತುವೇ ಪರಶಿವಾಂ ಲಲಿತಾಂ ಭವಾನೀಂ\n" +
                "ತ್ರಯ್ಯಂತವೇದ್ಯವಿಭವಾಂ ಕರುಣಾನವದ್ಯಾಮ್ |\n" +
                "ವಿಶ್ವಸ್ಯ ಸೃಷ್ಟವಿಲಯಸ್ಥಿತಿಹೇತುಭೂತಾಂ\n" +
                "ವಿದ್ಯೇಶ್ವರೀಂ ನಿಗಮವಾಙ್ಮಮನಸಾತಿದೂರಾಮ್ || 4 ||\n" +
                "ಪ್ರಾತರ್ವದಾಮಿ ಲಲಿತೇ ತವ ಪುಣ್ಯನಾಮ\n" +
                "ಕಾಮೇಶ್ವರೀತಿ ಕಮಲೇತಿ ಮಹೇಶ್ವರೀತಿ |\n" +
                "ಶ್ರೀಶಾಂಭವೀತಿ ಜಗತಾಂ ಜನನೀ ಪರೇತಿ\n" +
                "ವಾಗ್ದೇವತೇತಿ ವಚಸಾ ತ್ರಿಪುರೇಶ್ವರೀತಿ || 5 ||\n" +
                "ಯಃ ಶ್ಲೋಕಪಂಚಕಮಿದಂ ಲಲಿತಾಂಬಿಕಾಯಾಃ\n" +
                "ಸೌಭಾಗ್ಯದಂ ಸುಲಲಿತಂ ಪಠತಿ ಪ್ರಭಾತೇ |\n" +
                "ತಸ್ಮೈ ದದಾತಿ ಲಲಿತಾ ಝಟಿತಿ ಪ್ರಸನ್ನಾ\n" +
                "ವಿದ್ಯಾಂ ಶ್ರಿಯಂ ವಿಮಲಸೌಖ್ಯಮನಂತಕೀರ್ತಿಮ್ ||");
    }
}
