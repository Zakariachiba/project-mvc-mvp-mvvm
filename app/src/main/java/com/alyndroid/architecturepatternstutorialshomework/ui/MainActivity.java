package com.alyndroid.architecturepatternstutorialshomework.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alyndroid.architecturepatternstutorialshomework.Pojo.MathCalc;
import com.alyndroid.architecturepatternstutorialshomework.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ModeView {

    Button btnplus,btndiv,btnmul;
    TextView txtplus,txtdiv,txtmul;
    Presenter presenter;
    Viewmodel viewmodel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnplus = findViewById(R.id.plus_button);
        btndiv = findViewById(R.id.div_button);
        btnmul = findViewById(R.id.mul_button);
        txtplus = findViewById(R.id.plus_result_textView);
        txtdiv = findViewById(R.id.div_result_textView);
        txtmul = findViewById(R.id.mul_result_textView);

        viewmodel  = new ViewModelProvider(this).get(Viewmodel.class);
        viewmodel.mutableLiveData.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                txtmul.setText(integer+"");
            }
        });

        btnplus.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnmul.setOnClickListener(this);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.plus_button){
            txtplus.setText(MathCalc.getMathCalc().AddِِNumbers());
        } else if (v.getId()==R.id.div_button) {
            presenter = new Presenter(MainActivity.this);
            presenter.getData();
        } else if (v.getId()==R.id.mul_button) {
            viewmodel.getData();
        }

    }


    @SuppressLint("SetTextI18n")
    @Override
    public void getData(int i) {
        txtdiv.setText(i);
    }

}
