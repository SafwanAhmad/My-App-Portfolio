package com.example.android.myappportfolio;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void startProject(View view) {

        int buttonId = view.getId();
        String information = "This button will launch ";

        switch (buttonId)
        {
            case R.id.first_project:
                information += getString(R.string.nano_degree_first_project);
                break;
            case R.id.second_project:
                information += getString(R.string.nano_degree_second_project);
                break;
            case R.id.third_project:
                information += getString(R.string.nano_degree_third_project);
                break;
            case R.id.fourth_project:
                information += getString(R.string.nano_degree_fourth_project);
                break;
            case R.id.fifth_project:
                information += getString(R.string.nano_degree_fifth_project);
                break;
            case R.id.sixth_project:
                information += getString(R.string.nano_degree_sixth_project);
                break;
            default:
                information += "Invalid Id!";
        }

        Toast toast = Toast.makeText(this,
                information.toUpperCase(),
                Toast.LENGTH_SHORT);
        toast.show();
    }
}
