package com.shankara.venki.narayana;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Mahaganesha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvKannada = (TextView) findViewById(R.id.tvKannada);
        tvKannada.setMovementMethod(new ScrollingMovementMethod());


        Typeface faceAkshar = Typeface.createFromAsset(getAssets(),
                "akshar.ttf");

        tvKannada.setTypeface(faceAkshar);

        tvKannada.setText("ಮುದಾ ಕರಾತ್ತ ಮೋದಕಂ ಸದಾ ವಿಮುಕ್ತಿ ಸಾಧಕಮ್ |\n" +
                "ಕಳಾಧರಾವತಂಸಕಂ ವಿಲಾಸಿಲೋಕ ರಕ್ಷಕಮ್ |\n" +
                "ಅನಾಯಕೈಕ ನಾಯಕಂ ವಿನಾಶಿತೇಭ ದೈತ್ಯಕಮ್ |\n" +
                "ನತಾಶುಭಾಶು ನಾಶಕಂ ನಮಾಮಿ ತಂ ವಿನಾಯಕಮ್ || 1 ||\n" +
                "ನತೇತರಾತಿ ಭೀಕರಂ ನವೋದಿತಾರ್ಕ ಭಾಸ್ವರಮ್ |\n" +
                "ನಮತ್ಸುರಾರಿ ನಿರ್ಜರಂ ನತಾಧಿಕಾಪದುದ್ಢರಮ್ |\n" +
                "ಸುರೇಶ್ವರಂ ನಿಧೀಶ್ವರಂ ಗಜೇಶ್ವರಂ ಗಣೇಶ್ವರಮ್ |\n" +
                "ಮಹೇಶ್ವರಂ ತಮಾಶ್ರಯೇ ಪರಾತ್ಪರಂ ನಿರಂತರಮ್ || 2 ||\n" +
                "ಸಮಸ್ತ ಲೋಕ ಶಂಕರಂ ನಿರಸ್ತ ದೈತ್ಯ ಕುಂಜರಮ್ |\n" +
                "ದರೇತರೋದರಂ ವರಂ ವರೇಭ ವಕ್ತ್ರಮಕ್ಷರಮ್ |\n" +
                "ಕೃಪಾಕರಂ ಕ್ಷಮಾಕರಂ ಮುದಾಕರಂ ಯಶಸ್ಕರಮ್ |\n" +
                "ಮನಸ್ಕರಂ ನಮಸ್ಕೃತಾಂ ನಮಸ್ಕರೋಮಿ ಭಾಸ್ವರಮ್ || 3 ||\n" +
                "ಅಕಿಂಚನಾರ್ತಿ ಮಾರ್ಜನಂ ಚಿರಂತನೋಕ್ತಿ ಭಾಜನಮ್ |\n" +
                "ಪುರಾರಿ ಪೂರ್ವ ನಂದನಂ ಸುರಾರಿ ಗರ್ವ ಚರ್ವಣಮ್ |\n" +
                "ಪ್ರಪಂಚ ನಾಶ ಭೀಷಣಂ ಧನಂಜಯಾದಿ ಭೂಷಣಮ್ |\n" +
                "ಕಪೋಲ ದಾನವಾರಣಂ ಭಜೇ ಪುರಾಣ ವಾರಣಮ್ || 4 ||\n" +
                "ನಿತಾಂತ ಕಾಂತಿ ದಂತ ಕಾಂತಿ ಮಂತ ಕಾಂತಿ ಕಾತ್ಮಜಮ್ |\n" +
                "ಅಚಿಂತ್ಯ ರೂಪಮಂತ ಹೀನ ಮಂತರಾಯ ಕೃಂತನಮ್ |\n" +
                "ಹೃದಂತರೇ ನಿರಂತರಂ ವಸಂತಮೇವ ಯೋಗಿನಾಮ್ |\n" +
                "ತಮೇಕದಂತಮೇವ ತಂ ವಿಚಿಂತಯಾಮಿ ಸಂತತಮ್ || 5 ||\n" +
                "ಮಹಾಗಣೇಶ ಪಂಚರತ್ನಮಾದರೇಣ ಯೋ\uFEFF\u200Cஉನ್ವಹಮ್ |\n" +
                "ಪ್ರಜಲ್ಪತಿ ಪ್ರಭಾತಕೇ ಹೃದಿ ಸ್ಮರನ್ ಗಣೇಶ್ವರಮ್ |\n" +
                "ಅರೋಗತಾಮದೋಷತಾಂ ಸುಸಾಹಿತೀಂ ಸುಪುತ್ರತಾಮ್ |\n" +
                "ಸಮಾಹಿತಾಯು ರಷ್ಟಭೂತಿ ಮಭ್ಯುಪೈತಿ ಸೋ\uFEFF\u200Cஉಚಿರಾತ್ ||");
    }
}
