package com.shankara.venki.narayana;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Nirvana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvKannada = (TextView) findViewById(R.id.tvKannada);
        tvKannada.setMovementMethod(new ScrollingMovementMethod());


        Typeface faceAkshar = Typeface.createFromAsset(getAssets(),
                "akshar.ttf");

        tvKannada.setTypeface(faceAkshar);

        tvKannada.setText("ಶಿವೋಹಂ ಶಿವೋಹಂ, ಶಿವೋಹಂ ಶಿವೋಹಂ, ಶಿವೋಹಂ ಶಿವೋಹಂ\n" +
                "ಮನೋ ಬುಧ್ಯಹಂಕಾರ ಚಿತ್ತಾನಿ ನಾಹಂ\n" +
                "ನ ಚ ಶ್ರೋತ್ರ ಜಿಹ್ವಾ ನ ಚ ಘ್ರಾಣನೇತ್ರಮ್ |\n" +
                "ನ ಚ ವ್ಯೋಮ ಭೂಮಿರ್-ನ ತೇಜೋ ನ ವಾಯುಃ\n" +
                "ಚಿದಾನಂದ ರೂಪಃ ಶಿವೋಹಂ ಶಿವೋಹಮ್ || 1 ||\n" +
                "ಅಹಂ ಪ್ರಾಣ ಸಂಙ್ಞೋ ನ ವೈಪಂಚ ವಾಯುಃ\n" +
                "ನ ವಾ ಸಪ್ತಧಾತುರ್-ನ ವಾ ಪಂಚ ಕೋಶಾಃ |\n" +
                "ನವಾಕ್ಪಾಣಿ ಪಾದೌ ನ ಚೋಪಸ್ಥ ಪಾಯೂ\n" +
                "ಚಿದಾನಂದ ರೂಪಃ ಶಿವೋಹಂ ಶಿವೋಹಮ್ || 2 ||\n" +
                "ನ ಮೇ ದ್ವೇಷರಾಗೌ ನ ಮೇ ಲೋಭಮೋಹೋ\n" +
                "ಮದೋ ನೈವ ಮೇ ನೈವ ಮಾತ್ಸರ್ಯಭಾವಃ |\n" +
                "ನ ಧರ್ಮೋ ನ ಚಾರ್ಧೋ ನ ಕಾಮೋ ನ ಮೋಕ್ಷಃ\n" +
                "ಚಿದಾನಂದ ರೂಪಃ ಶಿವೋಹಂ ಶಿವೋಹಮ್ || 3 ||\n" +
                "ನ ಪುಣ್ಯಂ ನ ಪಾಪಂ ನ ಸೌಖ್ಯಂ ನ ದುಃಖಂ\n" +
                "ನ ಮಂತ್ರೋ ನ ತೀರ್ಧಂ ನ ವೇದಾ ನ ಯಙ್ಞಃ |\n" +
                "ಅಹಂ ಭೋಜನಂ ನೈವ ಭೋಜ್ಯಂ ನ ಭೋಕ್ತಾ\n" +
                "ಚಿದಾನಂದ ರೂಪಃ ಶಿವೋಹಂ ಶಿವೋಹಮ್ || 4 ||\n" +
                "ಅಹಂ ನಿರ್ವಿಕಲ್ಪೋ ನಿರಾಕಾರ ರೂಪೋ\n" +
                "ವಿಭೂತ್ವಾಚ್ಚ ಸರ್ವತ್ರ ಸರ್ವೇಂದ್ರಿಯಾಣಾಮ್ |\n" +
                "ನ ವಾ ಬಂಧನಂ ನೈವ ಮುಕ್ತಿ ನ ಬಂಧಃ |\n" +
                "ಚಿದಾನಂದ ರೂಪಃ ಶಿವೋಹಂ ಶಿವೋಹಮ್ || 5 ||\n" +
                "ನ ಮೃತ್ಯುರ್-ನ ಶಂಕಾ ನ ಮೇ ಜಾತಿ ಭೇದಃ\n" +
                "ಪಿತಾ ನೈವ ಮೇ ನೈವ ಮಾತಾ ನ ಜನ್ಮ |\n" +
                "ನ ಬಂಧುರ್-ನ ಮಿತ್ರಂ ಗುರುರ್ನೈವ ಶಿಷ್ಯಃ\n" +
                "ಚಿದಾನಂದ ರೂಪಃ ಶಿವೋಹಂ ಶಿವೋಹಮ್ || 6 ||\n" +
                "ಶಿವೋಹಂ ಶಿವೋಹಂ, ಶಿವೋಹಂ ಶಿವೋಹಂ, ಶಿವೋಹಂ ಶಿವೋಹಂ\n");
    }
}
