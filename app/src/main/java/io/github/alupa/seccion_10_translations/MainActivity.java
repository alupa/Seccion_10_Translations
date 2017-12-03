package io.github.alupa.seccion_10_translations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, getString(R.string.welcome), Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, Util.getWelcome(this), Toast.LENGTH_SHORT).show();
    }
}
