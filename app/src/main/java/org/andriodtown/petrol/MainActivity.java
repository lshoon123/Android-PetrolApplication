package org.andriodtown.petrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Fillup(View view)
    {
        intent = new Intent(this, fillup.class);
        startActivity(intent);
    }
    public void Mystats(View view)
    {
        intent = new Intent(this, mystats.class);
        startActivity(intent);
    }
    public void Changevehicle(View view)
    {
        intent = new Intent(this, changevehicle.class);
        startActivity(intent);
    }
    public void Setting(View view)
    {
        intent = new Intent(this, setting.class);
        startActivity(intent);
    }
    public void Login(View view)
    {
        intent = new Intent(this, login.class);
        startActivity(intent);
    }
}
