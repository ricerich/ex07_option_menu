package com.example.option_menu_jeju;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    EditText edt1;
    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edtAngle);
        iv1 = findViewById(R.id.iv1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu1,menu);

        return super.onCreateOptionsMenu(menu);
    }

    float fAngle = 0.0f;
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.itemRotate:
                String str1 = edt1.getText().toString();
                fAngle = fAngle + Float.parseFloat(str1);
                iv1.setRotation(fAngle);

                return false;
            case R.id.item1:
                item.setChecked(true);
                iv1.setImageResource(R.drawable.jeju2);
                return false;
            case R.id.item2:
                item.setChecked(true);
                iv1.setImageResource(R.drawable.jeju12);
                return false;
            case R.id.item3:
                item.setChecked(true);
                iv1.setImageResource(R.drawable.jeju14);
                return false;

        }

        return super.onOptionsItemSelected(item);
    }
}