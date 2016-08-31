package rd.nakorn.rdrun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    //Expilcit
    private ImageView imageView;
    private EditText useEditText, passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind widget
        imageView = (ImageView) findViewById(R.id.imageView6);
        useEditText = (EditText) findViewById(R.id.editText5);
        passwordEditText = (EditText) findViewById(R.id.editText6);

        //Load Image from Server
        Picasso.with(this).load("http://swiftcodingthai.com/rd/Image/rd_logo.png")
                .resize(150,150).into(imageView);
    } // Main Method

    public void clickSignInMain(View view) {



    }

    // Get Event from Click button SignUp

    public void ClickSignUpMain(View view){
        startActivity(new Intent(MainActivity.this, SignUpActivity.class));
    }

}   // Main Class นี่คือ คลาสหลัก
