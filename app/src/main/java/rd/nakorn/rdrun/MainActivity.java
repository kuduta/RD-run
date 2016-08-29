package rd.nakorn.rdrun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // Main Method

    // Get Event from Click button SignUp

    public void ClickSignUpMain(View view){
        startActivity(new Intent(MainActivity.this, SignUpActivity.class));
    }
    // Get Event from Click button SignIn
    public  void ClickSignInMain(View view){

    }

}   // Main Class นี่คือ คลาสหลัก
