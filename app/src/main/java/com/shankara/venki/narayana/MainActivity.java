package com.shankara.venki.narayana;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button shivapancha=(Button)findViewById(R.id.shivapancha);
        Button bhajago=(Button)findViewById(R.id.bhajago);
        Button mahaganesha=(Button)findViewById(R.id.mahaganesha);
        Button nirvana=(Button)findViewById(R.id.nirvana);
        Button kanaka=(Button)findViewById(R.id.kanaka);
        Button annapurna=(Button)findViewById(R.id.annapurna);
        Button jyotir=(Button)findViewById(R.id.jyotir);
        Button actyuta=(Button)findViewById(R.id.actyuta);
        Button narayana=(Button)findViewById(R.id.narayana);
        Button govinda=(Button)findViewById(R.id.govinda);
        Button lalitapancha=(Button)findViewById(R.id.lalitapancha);
        Button ramapancha=(Button)findViewById(R.id.ramapancha);

        Typeface faceAkshar = Typeface.createFromAsset(getAssets(),"akshar.ttf");
        shivapancha.setTypeface(faceAkshar);
        bhajago.setTypeface(faceAkshar);
        mahaganesha.setTypeface(faceAkshar);
        nirvana.setTypeface(faceAkshar);
        kanaka.setTypeface(faceAkshar);
        annapurna.setTypeface(faceAkshar);
        jyotir.setTypeface(faceAkshar);
        actyuta.setTypeface(faceAkshar);
        narayana.setTypeface(faceAkshar);
        govinda.setTypeface(faceAkshar);
        lalitapancha.setTypeface(faceAkshar);
        ramapancha.setTypeface(faceAkshar);

        shivapancha.setText("ಶಿವ ಪಂಚಾಕ್ಷರಿ ಸ್ತೋತ್ರ");
        bhajago.setText("ಭಜ ಗೋವಿಂದಮ್");
        mahaganesha.setText("ಮಹಾ ಗಣೇಶ ಪಂಚರತ್ನ ");
        nirvana.setText("ನಿರ್ವಾಣ ಶತಕಮ್");
        kanaka.setText("ಕನಕ ಧಾರಾ ಸ್ತೋತ್ರ");
        annapurna.setText("ಅನ್ನಪೂರ್ಣಸ್ತೋತ್ರ");
        jyotir.setText("ದ್ವಾದಶ ಜ್ಯೋತಿರ್ಲಿಂಗ ಸ್ತೋತ್ರ");
        actyuta.setText("ಅಚ್ಯುತಾಷ್ಟಕಮ್");
        narayana.setText("ನಾರಾಯಣ ಸ್ತೋತ್ರ");
        govinda.setText("ಗೋವಿಂದಾಷ್ಟಕಮ್");
        lalitapancha.setText("ಲಲಿತಾ ಪಂಚರತ್ನ");
        ramapancha.setText("ಶ್ರೀ ರಾಮ ಪಂಚರತ್ನ");

        shivapancha.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                Intent activityChangeIntent = new Intent(MainActivity.this, ShivaPanchakshari.class);

                // currentContext.startActivity(activityChangeIntent);

                startActivity(activityChangeIntent);
            }
        });

        bhajago.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Bhajago.class);


                startActivity(activityChangeIntent);
            }
        });

        mahaganesha.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Mahaganesha.class);


                startActivity(activityChangeIntent);
            }
        });

        kanaka.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Kanaka.class);


                startActivity(activityChangeIntent);
            }
        });


        annapurna.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Annapurna.class);


                startActivity(activityChangeIntent);
            }
        });


        jyotir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Jyotir.class);


                startActivity(activityChangeIntent);
            }
        });


        actyuta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Actyuta.class);


                startActivity(activityChangeIntent);
            }
        });




        narayana.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Narayana.class);


                startActivity(activityChangeIntent);
            }
        });



        govinda.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Govinda.class);


                startActivity(activityChangeIntent);
            }
        });



        lalitapancha.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Lalitapancha.class);


                startActivity(activityChangeIntent);
            }
        });


        ramapancha.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent activityChangeIntent = new Intent(MainActivity.this, Ramapancha.class);


                startActivity(activityChangeIntent);
            }
        });

        nirvana.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                Intent activityChangeIntent = new Intent(MainActivity.this, Nirvana.class);

                // currentContext.startActivity(activityChangeIntent);

                startActivity(activityChangeIntent);
            }
        });










    }
}
