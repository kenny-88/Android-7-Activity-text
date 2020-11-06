package com.example.android_7_activity_text;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        texta();
    }
    public void b(View v){
        EditText editText = (EditText)findViewById(R.id.ed2);

        Intent intent = new Intent(this, MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("name",editText.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);

    }
    private void texta(){
        int c;

        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            c  = Integer.parseInt(bundle.getString("name"));
            TextView textView = (TextView)findViewById(R.id.textView2);
            textView.setText(Integer.toString(c));
        }
    }
}