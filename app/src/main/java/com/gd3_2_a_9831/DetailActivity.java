package com.gd3_2_a_9831;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.gd3_2_a_9831.databinding.ActivityDetailBinding;
import com.google.gson.Gson;

public class DetailActivity extends AppCompatActivity {
    Mahasiswa mhs;
    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        String strMhs = getIntent().getStringExtra("objMhs");
        Gson gson = new Gson();
        mhs = gson.fromJson(strMhs, Mahasiswa.class);

        binding.setMhs(mhs);
        binding.setActivity(this);
    }

    public View.OnClickListener btnBackClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent mainActivity = new Intent(DetailActivity.this, MainActivity.class);
            mainActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(mainActivity);
        }
    };
}