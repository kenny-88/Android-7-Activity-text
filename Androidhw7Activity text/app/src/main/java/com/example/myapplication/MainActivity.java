package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textb();
    }

    public void a(View v){
        EditText editText = (EditText)findViewById(R.id.edit1);

        Intent intent = new Intent(this, MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("name",editText.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);

    }
    private void textb(){
        int c;

        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            c  = Integer.parseInt(bundle.getString("name"));
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(Integer.toString(c));
        }
    }

}
