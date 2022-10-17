package com.example.databinding.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviderGetKt;
import androidx.lifecycle.ViewModelProviders;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.databinding.R;
import com.example.databinding.databinding.ActivityMainBinding;
import com.example.databinding.viewmodels.ViewModelData;

public class MainActivity extends AppCompatActivity {
    ViewModelData viewModelData;
    Button permission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //setContentView(R.layout.activity_main);
        viewModelData = ViewModelProviders.of(this).get(ViewModelData.class);
        mainBinding.setEmployee(viewModelData.getEmployee());
        permission=findViewById(R.id.permission);

        permission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,PermissionActivity.class);
                startActivity(i);
            }
        });
    }

}