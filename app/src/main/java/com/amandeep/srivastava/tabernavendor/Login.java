package com.amandeep.srivastava.tabernavendor;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.method.PasswordTransformationMethod;
        import android.util.Log;
        import android.view.KeyEvent;
        import android.view.View;
        import android.view.inputmethod.InputMethodManager;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.RelativeLayout;
        import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {


    EditText username;
    EditText password;
    ImageView eye;
    ImageView logo;
    RelativeLayout relativeLayout;
    boolean showPass = true;
    SharedPreferences preferences;


    public void logIn(View view){

        if((username.getText().toString().equalsIgnoreCase("hackfest"))&&(password.getText().toString().equals("hackfest"))){

            preferences.edit().putInt("LoggedIn",1).apply();
            Intent ii = new Intent(Login.this,MainActivity.class);
            finish();
            startActivity(ii);

        }

        else {

            Toast.makeText(getApplicationContext(),"Incorrect username or password",Toast.LENGTH_LONG).show();

        }

    }

    public void showPassword(View view){

        if(showPass) {
            password.setTransformationMethod(null);
            eye.setImageResource(R.drawable.cross_eye);
            showPass = false;
        }
        else{
            showPass = true;
            eye.setImageResource(R.drawable.eye);
            password.setTransformationMethod(new PasswordTransformationMethod());
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences = this.getSharedPreferences(getPackageName(), Context.MODE_PRIVATE);
        int logValue = preferences.getInt("LoggedIn",0);
        if(logValue == 1){
            Intent ii = new Intent(Login.this,MainActivity.class);
            finish();
            startActivity(ii);
        }
            setContentView(R.layout.activity_login);

        relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        eye = (ImageView)findViewById(R.id.eye);
        logo = (ImageView)findViewById(R.id.logo);

        logo.setOnClickListener(this);
        relativeLayout.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        InputMethodManager mgr = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),0);

    }
}

