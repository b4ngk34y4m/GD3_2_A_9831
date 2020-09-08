package com.gd3_2_a_9831;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.gd3_2_a_9831.databinding.ActivityMainBinding;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    Mahasiswa mhs;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mhs = new Mahasiswa();
        binding.setMhs(mhs);
        binding.setActivity(this);
    }

    public View.OnClickListener btnSaveMahasiswa = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent detailActivity = new Intent(MainActivity.this, DetailActivity.class);

            Gson gson= new Gson();
            String strMhs = gson.toJson(mhs);
            detailActivity.putExtra("objMhs", strMhs);

            startActivity(detailActivity);
        }
    };

}