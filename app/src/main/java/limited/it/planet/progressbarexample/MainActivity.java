package limited.it.planet.progressbarexample;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {

                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                    ActivityCompat.finishAffinity(MainActivity.this);

            }
        }, 5000);

    }
}
