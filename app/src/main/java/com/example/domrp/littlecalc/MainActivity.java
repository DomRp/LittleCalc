package com.example.domrp.littlecalc;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de ser destruida.
    }

    public void llamarPrestamoPersonalActivity(View view) {
        Intent i = new Intent(this, PrestamoPersonalActivity.class);
        startActivity(i);
    }

    public void llamarPrestamoHipotecarioActivity(View view) {
        Intent i = new Intent(this, PrestamoHipotecarioActivity.class);
        startActivity(i);
    }

    public void llamarPrestamoVehiculoActivity(View view) {
        Intent i = new Intent(this, PrestamoVehiculoActivity.class);
        startActivity(i);
    }

    public void llamarCierrePrestamoActivity(View view) {
        Intent i = new Intent(this, CierrePrestamoActivity.class);
        startActivity(i);
    }
}
