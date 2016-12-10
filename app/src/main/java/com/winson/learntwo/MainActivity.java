package com.winson.learntwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.winson.learntwo.char_project.CharAct;

public class MainActivity extends AppCompatActivity {
    Button buttonOne ;
    Button buttonTwo ;
    Button buttonThree ;
    Button buttonFour ;
    Button buttonFive ;
    Button buttonSix ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        buttonOne = (Button)findViewById(R.id.btnProjectOne);
        buttonTwo = (Button)findViewById(R.id.btnProjectTwo);
        buttonThree = (Button)findViewById(R.id.btnProjectThree);
        buttonFour = (Button)findViewById(R.id.btnProjectFour);
        buttonFive = (Button)findViewById(R.id.btnProjectFive);
        buttonSix = (Button)findViewById(R.id.btnProjectFive);

    }

    public void goToOtherAct(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.btnProjectOne:
                intent = new Intent(this , CharAct.class);
                break;
            case R.id.btnProjectTwo:
                break;
            case R.id.btnProjectThree:
                break;
            case R.id.btnProjectFour:
                break;
            case R.id.btnProjectFive:
                break;
            default:
                break;
        }
        startActivity(intent);
    }
}
