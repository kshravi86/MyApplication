package com.shankara.venki.narayana;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ShivaPanchakshari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvKannada = (TextView) findViewById(R.id.tvKannada);
        tvKannada.setMovementMethod(new ScrollingMovementMethod());


        Typeface faceAkshar = Typeface.createFromAsset(getAssets(),
                "akshar.ttf");

        tvKannada.setTypeface(faceAkshar);

        tvKannada.setText("ಓಂ ನಮಃ ಶಿವಾಯ ಶಿವಾಯ ನಮಃ ಓಂ\n" +
                "ಓಂ ನಮಃ ಶಿವಾಯ ಶಿವಾಯ ನಮಃ ಓಂ\n" +
                "ನಾಗೇಂದ್ರಹಾರಾಯ ತ್ರಿಲೋಚನಾಯ\n" +
                "ಭಸ್ಮಾಂಗರಾಗಾಯ ಮಹೇಶ್ವರಾಯ |\n" +
                "ನಿತ್ಯಾಯ ಶುದ್ಧಾಯ ದಿಗಂಬರಾಯ\n" +
                "ತಸ್ಮೈ “ನ” ಕಾರಾಯ ನಮಃ ಶಿವಾಯ || 1 ||\n" +
                "ಮಂದಾಕಿನೀ ಸಲಿಲ ಚಂದನ ಚರ್ಚಿತಾಯ\n" +
                "ನಂದೀಶ್ವರ ಪ್ರಮಥನಾಥ ಮಹೇಶ್ವರಾಯ |\n" +
                "ಮಂದಾರ ಮುಖ್ಯ ಬಹುಪುಷ್ಪ ಸುಪೂಜಿತಾಯ \n" +
                "ತಸ್ಮೈ “ಮ” ಕಾರಾಯ ನಮಃ ಶಿವಾಯ || 2 ||\n" +
                "ಶಿವಾಯ ಗೌರೀ ವದನಾಬ್ಜ ಬೃಂದ\n" +
                "ಸೂರ್ಯಾಯ ದಕ್ಷಾಧ್ವರ ನಾಶಕಾಯ |\n" +
                "ಶ್ರೀ ನೀಲಕಂಠಾಯ ವೃಷಭಧ್ವಜಾಯ\n" +
                "ತಸ್ಮೈ “ಶಿ” ಕಾರಾಯ ನಮಃ ಶಿವಾಯ || 3 ||\n" +
                "ವಶಿಷ್ಠ ಕುಂಭೋದ್ಭವ ಗೌತಮಾರ್ಯ\n" +
                "ಮುನೀಂದ್ರ ದೇವಾರ್ಚಿತ ಶೇಖರಾಯ |\n" +
                "ಚಂದ್ರಾರ್ಕ ವೈಶ್ವಾನರ ಲೋಚನಾಯ\n" +
                "ತಸ್ಮೈ “ವ” ಕಾರಾಯ ನಮಃ ಶಿವಾಯ || 4 ||\n" +
                "ಯಙ್ಞ ಸ್ವರೂಪಾಯ ಜಟಾಧರಾಯ\n" +
                "ಪಿನಾಕ ಹಸ್ತಾಯ ಸನಾತನಾಯ |\n" +
                "ದಿವ್ಯಾಯ ದೇವಾಯ ದಿಗಂಬರಾಯ\n" +
                "ತಸ್ಮೈ “ಯ” ಕಾರಾಯ ನಮಃ ಶಿವಾಯ || 5 ||\n" +
                "ಪಂಚಾಕ್ಷರಮಿದಂ ಪುಣ್ಯಂ ಯಃ ಪಠೇಚ್ಛಿವ ಸನ್ನಿಧೌ |\n" +
                "ಶಿವಲೋಕಮವಾಪ್ನೋತಿ ಶಿವೇನ ಸಹ ಮೋದತೇ ||");
    }
}
