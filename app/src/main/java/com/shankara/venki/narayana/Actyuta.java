package com.shankara.venki.narayana;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Actyuta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvKannada = (TextView) findViewById(R.id.tvKannada);
        tvKannada.setMovementMethod(new ScrollingMovementMethod());


        Typeface faceAkshar = Typeface.createFromAsset(getAssets(),
                "akshar.ttf");

        tvKannada.setTypeface(faceAkshar);

        tvKannada.setText("ಅಚ್ಯುತಂ ಕೇಶವಂ ರಾಮನಾರಾಯಣಂ \n" +
                "ಕೃಷ್ಣದಾಮೋದರಂ ವಾಸುದೇವಂ ಹರಿಮ್ |\n" +
                "ಶ್ರೀಧರಂ ಮಾಧವಂ ಗೋಪಿಕಾ ವಲ್ಲಭಂ\n" +
                "ಜಾನಕೀನಾಯಕಂ ರಾಮಚಂದ್ರಂ ಭಜೇ || 1 ||\n" +
                "ಅಚ್ಯುತಂ ಕೇಶವಂ ಸತ್ಯಭಾಮಾಧವಂ\n" +
                "ಮಾಧವಂ ಶ್ರೀಧರಂ ರಾಧಿಕಾ ರಾಧಿತಮ್ |\n" +
                "ಇಂದಿರಾಮಂದಿರಂ ಚೇತಸಾ ಸುಂದರಂ\n" +
                "ದೇವಕೀನಂದನಂ ನಂದಜಂ ಸಂದಧೇ || 2 ||\n" +
                "ವಿಷ್ಣವೇ ಜಿಷ್ಣವೇ ಶಂಕನೇ ಚಕ್ರಿಣೇ\n" +
                "ರುಕ್ಮಿಣೀ ರಾಹಿಣೇ ಜಾನಕೀ ಜಾನಯೇ |\n" +
                "ವಲ್ಲವೀ ವಲ್ಲಭಾಯಾರ್ಚಿತಾ ಯಾತ್ಮನೇ\n" +
                "ಕಂಸ ವಿಧ್ವಂಸಿನೇ ವಂಶಿನೇ ತೇ ನಮಃ || 3 ||\n" +
                "ಕೃಷ್ಣ ಗೋವಿಂದ ಹೇ ರಾಮ ನಾರಾಯಣ\n" +
                "ಶ್ರೀಪತೇ ವಾಸುದೇವಾಜಿತ ಶ್ರೀನಿಧೇ |\n" +
                "ಅಚ್ಯುತಾನಂತ ಹೇ ಮಾಧವಾಧೋಕ್ಷಜ\n" +
                "ದ್ವಾರಕಾನಾಯಕ ದ್ರೌಪದೀರಕ್ಷಕ || 4 ||\n" +
                "ರಾಕ್ಷಸ ಕ್ಷೋಭಿತಃ ಸೀತಯಾ ಶೋಭಿತೋ\n" +
                "ದಂಡಕಾರಣ್ಯಭೂ ಪುಣ್ಯತಾಕಾರಣಃ |\n" +
                "ಲಕ್ಷ್ಮಣೋನಾನ್ವಿತೋ ವಾನರೈಃ ಸೇವಿತೋ\n" +
                "ಅಗಸ್ತ್ಯ ಸಂಪೂಜಿತೋ ರಾಘವಃ ಪಾತು ಮಾಮ್ || 5 ||\n" +
                "ಧೇನುಕಾರಿಷ್ಟಕಾ\uFEFF\u200Cஉನಿಷ್ಟಿಕೃದ್-ದ್ವೇಷಿಹಾ\n" +
                "ಕೇಶಿಹಾ ಕಂಸಹೃದ್-ವಂಶಿಕಾವಾದಕಃ |\n" +
                "ಪೂತನಾಕೋಪಕಃ ಸೂರಜಾಖೇಲನೋ\n" +
                "ಬಾಲಹೋಪಾಲಕಃ ಪಾತು ಮಾಂ ಸರ್ವದಾ || 6 ||\n" +
                "ಬಿದ್ಯುದುದ್-ಯೋತವತ್-ಪ್ರಸ್ಫುರದ್-ವಾಸಸಂ\n" +
                "ಪ್ರಾವೃಡಮ್-ಭೋದವತ್-ಪ್ರೋಲ್ಲಸದ್-ವಿಗ್ರಹಮ್ |\n" +
                "ವಾನ್ಯಯಾ ಮಾಲಯಾ ಶೋಭಿತೋರಃ ಸ್ಥಲಂ\n" +
                "ಲೋಹಿತಾಙ್-ಘಿದ್ವಯಂ ವಾರಿಜಾಕ್ಷಂ ಭಜೇ || 7 ||\n" +
                "ಕುಂಚಿತೈಃ ಕುಂತಲೈ ಭ್ರಾಜಮಾನಾನನಂ\n" +
                "ರತ್ನಮೌಳಿಂ ಲಸತ್-ಕುಂಡಲಂ ಗಂಡಯೋಃ |\n" +
                "ಹಾರಕೇಯೂರಕಂ ಕಂಕಣ ಪ್ರೋಜ್ಜ್ವಲಂ\n" +
                "ಕಿಂಕಿಣೀ ಮಂಜುಲಂ ಶ್ಯಾಮಲಂ ತಂ ಭಜೇ || 8 ||\n" +
                "ಅಚ್ಯುತಸ್ಯಾಷ್ಟಕಂ ಯಃ ಪಠೇದಿಷ್ಟದಂ \n" +
                "ಪ್ರೇಮತಃ ಪ್ರತ್ಯಹಂ ಪೂರುಷಃ ಸಸ್ಪೃಹಮ್ |\n" +
                "ವೃತ್ತತಃ ಸುಂದರಂ ಕರ್ತೃ ವಿಶ್ವಂಭರಃ \n" +
                "ತಸ್ಯ ವಶ್ಯೋ ಹರಿ ರ್ಜಾಯತೇ ಸತ್ವರಮ್ ||");
    }
}
