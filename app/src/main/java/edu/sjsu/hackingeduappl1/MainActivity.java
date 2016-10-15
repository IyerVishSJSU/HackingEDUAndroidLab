package edu.sjsu.hackingeduappl1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    //EditText editText;
    Button button;
    CheckBox chkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textView);
        //editText=(EditText)findViewById(R.id.editText);
        button= (Button)findViewById(R.id.button);

        button.setOnClickListener(new textView.OnClickListener(){
            public void OnClick(View v){
                System.out.println("button was pressed");
            }
        };

    };
}
