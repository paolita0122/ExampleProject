package com.myappcompany.rob.exampleproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
    public void clickFunction(View view)
    {
        EditText namedEditText = (EditText) findViewById(R.id._namedEditText);

        Log.i("Info","Button pressed!!");
        Log.i("Values", namedEditText.getText().toString());


    }
*/

    public void clickButtonUsername(View view)
    {
        EditText userNameText = (EditText) findViewById(R.id._userNameText);
        EditText userPassword =(EditText) findViewById(R.id._userPassword);

        Log.i("Info","Clicked Button!!!!");
        Log.i("ValueUsername", userNameText.getText().toString());
        Log.i("ValueUserPassword",userPassword.getText().toString());

        String Username= userNameText.getText().toString();
        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.images);
        Toast.makeText(this,"Hi There "+Username+"!", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
