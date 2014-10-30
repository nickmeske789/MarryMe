package rynj.marryme;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;


public class LoginScreen extends Activity {

    private int validation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void VerifyCreds(View view)
    {
        String user = "nick";
        String pass = "1234";
        EditText editTextUser = (EditText)findViewById(R.id.username);
        EditText editTextPass = (EditText)findViewById(R.id.password);
        String inputUser = editTextUser.getText().toString();
        String inputPass = editTextPass.getText().toString();
        TextView textViewValid = (TextView)findViewById(R.id.validation);

        if(user.equals(inputUser))
        {
             if(pass.equals(inputPass))
             {

                 textViewValid.setText("Correct Username and Password!");
             }
            else
             {
                 textViewValid.setText("Incorrect Password!");
             }
        }
        else
        {
            textViewValid.setText("Incorrect Username!");
        }

    }

}
