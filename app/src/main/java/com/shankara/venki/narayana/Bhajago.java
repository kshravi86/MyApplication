package com.shankara.venki.narayana;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Bhajago extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvKannada = (TextView) findViewById(R.id.tvKannada);
        tvKannada.setMovementMethod(new ScrollingMovementMethod());


        Typeface faceAkshar = Typeface.createFromAsset(getAssets(),
                "akshar.ttf");

        tvKannada.setTypeface(faceAkshar);

        tvKannada.setText("ಭಜ ಗೋವಿಂದಂ ಭಜ ಗೋವಿಂದಂ\n" +
                "ಗೋವಿಂದಂ ಭಜ ಮೂಢಮತೇ |\n" +
                "ಸಂಪ್ರಾಪ್ತೇ ಸನ್ನಿಹಿತೇ ಕಾಲೇ\n" +
                "ನಹಿ ನಹಿ ರಕ್ಷತಿ ಡುಕ್ರಿಂಕರಣೇ || 1 ||\n" +
                "ಮೂಢ ಜಹೀಹಿ ಧನಾಗಮತೃಷ್ಣಾಂ\n" +
                "ಕುರು ಸದ್ಬುದ್ಧಿಮ್ ಮನಸಿ ವಿತೃಷ್ಣಾಮ್ |\n" +
                "ಯಲ್ಲಭಸೇ ನಿಜ ಕರ್ಮೋಪಾತ್ತಂ\n" +
                "ವಿತ್ತಂ ತೇನ ವಿನೋದಯ ಚಿತ್ತಮ್ || 2 ||\n" +
                "ನಾರೀ ಸ್ತನಭರ ನಾಭೀದೇಶಂ\n" +
                "ದೃಷ್ಟ್ವಾ ಮಾ ಗಾ ಮೋಹಾವೇಶಮ್ |\n" +
                "ಏತನ್ಮಾಂಸ ವಸಾದಿ ವಿಕಾರಂ\n" +
                "ಮನಸಿ ವಿಚಿಂತಯಾ ವಾರಂ ವಾರಮ್ || 3 ||\n" +
                "ನಳಿನೀ ದಳಗತ ಜಲಮತಿ ತರಳಂ\n" +
                "ತದ್ವಜ್ಜೀವಿತ ಮತಿಶಯ ಚಪಲಮ್ |\n" +
                "ವಿದ್ಧಿ ವ್ಯಾಧ್ಯಭಿಮಾನ ಗ್ರಸ್ತಂ\n" +
                "ಲೋಕಂ ಶೋಕಹತಂ ಚ ಸಮಸ್ತಮ್ || 4 ||\n" +
                "ಯಾವದ್-ವಿತ್ತೋಪಾರ್ಜನ ಸಕ್ತಃ\n" +
                "ತಾವನ್-ನಿಜಪರಿವಾರೋ ರಕ್ತಃ |\n" +
                "ಪಶ್ಚಾಜ್ಜೀವತಿ ಜರ್ಜರ ದೇಹೇ\n" +
                "ವಾರ್ತಾಂ ಕೋ\uFEFF\u200Cஉಪಿ ನ ಪೃಚ್ಛತಿ ಗೇಹೇ || 5 ||\n" +
                "ಯಾವತ್-ಪವನೋ ನಿವಸತಿ ದೇಹೇ\n" +
                "ತಾವತ್-ಪೃಚ್ಛತಿ ಕುಶಲಂ ಗೇಹೇ |\n" +
                "ಗತವತಿ ವಾಯೌ ದೇಹಾಪಾಯೇ\n" +
                "ಭಾರ್ಯಾ ಬಿಭ್ಯತಿ ತಸ್ಮಿನ್ ಕಾಯೇ || 6 ||\n" +
                "ಬಾಲ ಸ್ತಾವತ್ ಕ್ರೀಡಾಸಕ್ತಃ\n" +
                "ತರುಣ ಸ್ತಾವತ್ ತರುಣೀಸಕ್ತಃ |\n" +
                "ವೃದ್ಧ ಸ್ತಾವತ್-ಚಿಂತಾಮಗ್ನಃ\n" +
                "ಪರಮೇ ಬ್ರಹ್ಮಣಿ ಕೋ\uFEFF\u200Cஉಪಿ ನ ಲಗ್ನಃ || 7 ||\n" +
                "ಕಾ ತೇ ಕಾಂತಾ ಕಸ್ತೇ ಪುತ್ರಃ\n" +
                "ಸಂಸಾರೋ\uFEFF\u200Cஉಯಮತೀವ ವಿಚಿತ್ರಃ |\n" +
                "ಕಸ್ಯ ತ್ವಂ ವಾ ಕುತ ಆಯಾತಃ\n" +
                "ತತ್ವಂ ಚಿಂತಯ ತದಿಹ ಭ್ರಾತಃ || 8 ||\n" +
                "ಸತ್ಸಂಗತ್ವೇ ನಿಸ್ಸಂಗತ್ವಂ\n" +
                "ನಿಸ್ಸಂಗತ್ವೇ ನಿರ್ಮೋಹತ್ವಮ್ |\n" +
                "ನಿರ್ಮೋಹತ್ವೇ ನಿಶ್ಚಲತತ್ತ್ವಂ\n" +
                "ನಿಶ್ಚಲತತ್ತ್ವೇ ಜೀವನ್ಮುಕ್ತಿಃ || 9 ||\n" +
                "ವಯಸಿ ಗತೇ ಕಃ ಕಾಮವಿಕಾರಃ\n" +
                "ಶುಷ್ಕೇ ನೀರೇ ಕಃ ಕಾಸಾರಃ |\n" +
                "ಕ್ಷೀಣೇ ವಿತ್ತೇ ಕಃ ಪರಿವಾರಃ\n" +
                "ಙ್ಞಾತೇ ತತ್ತ್ವೇ ಕಃ ಸಂಸಾರಃ || 10 ||\n" +
                "ಮಾ ಕುರು ಧನಜನ ಯೌವನ ಗರ್ವಂ\n" +
                "ಹರತಿ ನಿಮೇಷಾತ್-ಕಾಲಃ ಸರ್ವಮ್ |\n" +
                "ಮಾಯಾಮಯಮಿದಮ್-ಅಖಿಲಂ ಹಿತ್ವಾ\n" +
                "ಬ್ರಹ್ಮಪದಂ ತ್ವಂ ಪ್ರವಿಶ ವಿದಿತ್ವಾ || 11 ||\n" +
                "ದಿನ ಯಾಮಿನ್ಯೌ ಸಾಯಂ ಪ್ರಾತಃ\n" +
                "ಶಿಶಿರ ವಸಂತೌ ಪುನರಾಯಾತಃ |\n" +
                "ಕಾಲಃ ಕ್ರೀಡತಿ ಗಚ್ಛತ್ಯಾಯುಃ\n" +
                "ತದಪಿ ನ ಮುಂಚತ್ಯಾಶಾವಾಯುಃ || 12 ||\n" +
                "ದ್ವಾದಶ ಮಂಜರಿಕಾಭಿರ ಶೇಷಃ\n" +
                "ಕಥಿತೋ ವೈಯಾ ಕರಣಸ್ಯೈಷಃ |\n" +
                "ಉಪದೇಶೋ ಭೂದ್-ವಿದ್ಯಾ ನಿಪುಣೈಃ\n" +
                "ಶ್ರೀಮಚ್ಛಂಕರ ಭಗವಚ್ಛರಣೈಃ || 13 ||\n" +
                "ಕಾ ತೇ ಕಾಂತಾ ಧನ ಗತ ಚಿಂತಾ\n" +
                "ವಾತುಲ ಕಿಂ ತವ ನಾಸ್ತಿ ನಿಯಂತಾ |\n" +
                "ತ್ರಿಜಗತಿ ಸಜ್ಜನ ಸಂಗತಿರೇಕಾ\n" +
                "ಭವತಿ ಭವಾರ್ಣವ ತರಣೇ ನೌಕಾ || 14 ||\n" +
                "ಜಟಿಲೋ ಮುಂಡೀ ಲುಂಜಿತ ಕೇಶಃ\n" +
                "ಕಾಷಾಯಾನ್ಬರ ಬಹುಕೃತ ವೇಷಃ |\n" +
                "ಪಶ್ಯನ್ನಪಿ ಚ ನ ಪಶ್ಯತಿ ಮೂಢಃ\n" +
                "ಉದರ ನಿಮಿತ್ತಂ ಬಹುಕೃತ ವೇಷಃ || 15 ||\n" +
                "ಅಂಗಂ ಗಲಿತಂ ಪಲಿತಂ ಮುಂಡಂ\n" +
                "ದಶನ ವಿಹೀನಂ ಜಾತಂ ತುಂಡಮ್ |\n" +
                "ವೃದ್ಧೋ ಯಾತಿ ಗೃಹೀತ್ವಾ ದಂಡಂ\n" +
                "ತದಪಿ ನ ಮುಂಚತ್ಯಾಶಾ ಪಿಂಡಮ್ || 16 ||\n" +
                "ಅಗ್ರೇ ವಹ್ನಿಃ ಪೃಷ್ಠೇ ಭಾನುಃ\n" +
                "ರಾತ್ರೌ ಚುಬುಕ ಸಮರ್ಪಿತ ಜಾನುಃ |\n" +
                "ಕರತಲ ಭಿಕ್ಷಸ್-ತರುತಲ ವಾಸಃ\n" +
                "ತದಪಿ ನ ಮುಂಚತ್ಯಾಶಾ ಪಾಶಃ || 17 ||\n" +
                "ಕುರುತೇ ಗಂಗಾ ಸಾಗರ ಗಮನಂ\n" +
                "ವ್ರತ ಪರಿಪಾಲನಮ್-ಅಥವಾ ದಾನಮ್ |\n" +
                "ಙ್ಞಾನ ವಿಹೀನಃ ಸರ್ವಮತೇನ\n" +
                "ಭಜತಿ ನ ಮುಕ್ತಿಂ ಜನ್ಮ ಶತೇನ || 18 ||\n" +
                "ಸುರಮಂದಿರ ತರು ಮೂಲ ನಿವಾಸಃ\n" +
                "ಶಯ್ಯಾ ಭೂತಲಮ್-ಅಜಿನಂ ವಾಸಃ |\n" +
                "ಸರ್ವ ಪರಿಗ್ರಹ ಭೋಗತ್ಯಾಗಃ\n" +
                "ಕಸ್ಯ ಸುಖಂ ನ ಕರೋತಿ ವಿರಾಗಃ || 19 ||\n" +
                "ಯೋಗರತೋ ವಾ ಭೋಗರತೋ ವಾ\n" +
                "ಸಂಗರತೋ ವಾ ಸಂಗವಿಹೀನಃ |\n" +
                "ಯಸ್ಯ ಬ್ರಹ್ಮಣಿ ರಮತೇ ಚಿತ್ತಂ\n" +
                "ನಂದತಿ ನಂದತಿ ನಂದತ್ಯೇವ || 20 ||\n" +
                "ಭಗವದ್ಗೀತಾ ಕಿಂಚಿದಧೀತಾ\n" +
                "ಗಂಗಾ ಜಲಲವ ಕಣಿಕಾ ಪೀತಾ |\n" +
                "ಸಕೃದಪಿ ಯೇನ ಮುರಾರೀ ಸಮರ್ಚಾ\n" +
                "ಕ್ರಿಯತೇ ತಸ್ಯ ಯಮೇನ ನ ಚರ್ಚಾ || 21 ||\n" +
                "ಪುನರಪಿ ಜನನಂ ಪುನರಪಿ ಮರಣಂ\n" +
                "ಪುನರಪಿ ಜನನೀ ಜಠರೇ ಶಯನಮ್ |\n" +
                "ಇಹ ಸಂಸಾರೇ ಬಹು ದುಸ್ತಾರೇ\n" +
                "ಕೃಪಯಾ\uFEFF\u200Cஉಪಾರೇ ಪಾಹಿ ಮುರಾರೇ || 22 ||\n" +
                "ರಥ್ಯಾ ಚರ್ಪಟ ವಿರಚಿತ ಕಂಥಃ\n" +
                "ಪುಣ್ಯಾಪುಣ್ಯ ವಿವರ್ಜಿತ ಪಂಥಃ |\n" +
                "ಯೋಗೀ ಯೋಗ ನಿಯೋಜಿತ ಚಿತ್ತಃ\n" +
                "ರಮತೇ ಬಾಲೋನ್ಮತ್ತವದೇವ || 23 ||\n" +
                "ಕಸ್ತ್ವಂ ಕೋ\uFEFF\u200Cஉಹಂ ಕುತ ಆಯಾತಃ\n" +
                "ಕಾ ಮೇ ಜನನೀ ಕೋ ಮೇ ತಾತಃ |\n" +
                "ಇತಿ ಪರಿಭಾವಯ ನಿಜ ಸಂಸಾರಂ\n" +
                "ಸರ್ವಂ ತ್ಯಕ್ತ್ವಾ ಸ್ವಪ್ನ ವಿಚಾರಮ್ || 24 ||\n" +
                "ತ್ವಯಿ ಮಯಿ ಸರ್ವತ್ರೈಕೋ ವಿಷ್ಣುಃ\n" +
                "ವ್ಯರ್ಥಂ ಕುಪ್ಯಸಿ ಮಯ್ಯಸಹಿಷ್ಣುಃ |\n" +
                "ಭವ ಸಮಚಿತ್ತಃ ಸರ್ವತ್ರ ತ್ವಂ\n" +
                "ವಾಞ್ಛಸ್ಯಚಿರಾದ್-ಯದಿ ವಿಷ್ಣುತ್ವಮ್ || 25 ||\n" +
                "ಶತ್ರೌ ಮಿತ್ರೇ ಪುತ್ರೇ ಬಂಧೌ\n" +
                "ಮಾ ಕುರು ಯತ್ನಂ ವಿಗ್ರಹ ಸಂಧೌ |\n" +
                "ಸರ್ವಸ್ಮಿನ್ನಪಿ ಪಶ್ಯಾತ್ಮಾನಂ\n" +
                "ಸರ್ವತ್ರೋತ್-ಸೃಜ ಭೇದಾಙ್ಞಾನಮ್ || 26 ||\n" +
                "ಕಾಮಂ ಕ್ರೋಧಂ ಲೋಭಂ ಮೋಹಂ\n" +
                "ತ್ಯಕ್ತ್ವಾ\uFEFF\u200Cஉ\uFEFF\u200Cஉತ್ಮಾನಂ ಪಶ್ಯತಿ ಸೋ\uFEFF\u200Cஉಹಮ್ |\n" +
                "ಆತ್ಮಙ್ಞ್ನಾನ ವಿಹೀನಾ ಮೂಢಾಃ\n" +
                "ತೇ ಪಚ್ಯಂತೇ ನರಕ ನಿಗೂಢಾಃ || 27 ||\n" +
                "ಗೇಯಂ ಗೀತಾ ನಾಮ ಸಹಸ್ರಂ\n" +
                "ಧ್ಯೇಯಂ ಶ್ರೀಪತಿ ರೂಪಮ್-ಅಜಸ್ರಮ್ |\n" +
                "ನೇಯಂ ಸಜ್ಜನ ಸಂಗೇ ಚಿತ್ತಂ\n" +
                "ದೇಯಂ ದೀನಜನಾಯ ಚ ವಿತ್ತಮ್ || 28 ||\n" +
                "ಸುಖತಃ ಕ್ರಿಯತೇ ರಾಮಾಭೋಗಃ\n" +
                "ಪಶ್ಚಾದ್ಧಂತ ಶರೀರೇ ರೋಗಃ |\n" +
                "ಯದ್ಯಪಿ ಲೋಕೇ ಮರಣಂ ಶರಣಂ\n" +
                "ತದಪಿ ನ ಮುಂಚತಿ ಪಾಪಾಚರಣಮ್ || 29 ||\n" +
                "ಅರ್ಥಮನರ್ಥಂ ಭಾವಯ ನಿತ್ಯಂ\n" +
                "ನಾಸ್ತಿ ತತಃ ಸುಖ ಲೇಶಃ ಸತ್ಯಮ್ |\n" +
                "ಪುತ್ರಾದಪಿ ಧನಭಾಜಾಂ ಭೀತಿಃ\n" +
                "ಸರ್ವತ್ರೈಷಾ ವಿಹಿತಾ ರೀತಿಃ || 30 ||\n" +
                "ಪ್ರಾಣಾಯಾಮಂ ಪ್ರತ್ಯಾಹಾರಂ\n" +
                "ನಿತ್ಯಾನಿತ್ಯ ವಿವೇಕ ವಿಚಾರಮ್ |\n" +
                "ಜಾಪ್ಯಸಮೇತ ಸಮಾಧಿ ವಿಧಾನಂ\n" +
                "ಕುರ್ವ ವಧಾನಂ ಮಹದ್-ಅವಧಾನಮ್ || 31 ||\n" +
                "ಗುರು ಚರಣಾಂಭುಜ ನಿರ್ಭರಭಕ್ತಃ\n" +
                "ಸಂಸಾರಾದ್-ಅಚಿರಾದ್-ಭವ ಮುಕ್ತಃ |\n" +
                "ಸೇಂದಿಯ ಮಾನಸ ನಿಯಮಾದೇವಂ\n" +
                "ದ್ರಕ್ಷ್ಯಸಿ ನಿಜ ಹೃದಯಸ್ಥಂ ದೇವಮ್ || 32 ||\n" +
                "ಮೂಢಃ ಕಶ್ಚಿನ ವೈಯಾಕರಣೋ\n" +
                "ಡುಕೃಣ್ಕರಣಾಧ್ಯಯನ ಧುರೀಣಃ |\n" +
                "ಶ್ರೀಮಚ್ಛಂಕರ ಭಗವಚ್ಚಿಷ್ಯೈಃ\n" +
                "ಬೋಧಿತ ಆಸೀಚ್ಛೋದಿತ ಕರಣೈಃ || 33 ||");
    }
}
