package com.example.startapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.startapp.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Toast toast = Toast.makeText(getApplicationContext(), "onCreate Toast", Toast.LENGTH_LONG);
        toast.show();
        String Tag;
        Log.d(TAG, "onCreate Toast");

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    protected void onStart()  {
        super.onStart();
        Toast toast = Toast.makeText(getApplicationContext() , "onStart Toast" , Toast.LENGTH_LONG);
        toast.show();
        Log.d(TAG, "onStart Toast");
    }

    @Override
    protected void onResume()  {
        super.onResume();
        Toast toast = Toast.makeText(getApplicationContext() , "onResume Toast" , Toast.LENGTH_LONG);
        toast.show();
        Log.d(TAG, "onResume Toast");
    }

    @Override
    protected void onPause()  {
        super.onPause();
        Toast toast = Toast.makeText(getApplicationContext() , "onPause Toast" , Toast.LENGTH_LONG);
        toast.show();
        Log.d(TAG, "onPause Toast");
    }

    @Override
    protected void onStop()  {
        super.onStop();
        Toast toast = Toast.makeText(getApplicationContext() , "onStop Toast" , Toast.LENGTH_LONG);
        toast.show();
        Log.d(TAG, "onStop Toast");
    }

    @Override
    protected void onRestart()  {
        super.onRestart();
        Toast toast = Toast.makeText(getApplicationContext() , "onRestart Toast" , Toast.LENGTH_LONG);
        toast.show();
        Log.d(TAG, "onRestart Toast");
    }

    @Override
    protected void onDestroy()  {
        super.onDestroy();
        Toast toast = Toast.makeText(getApplicationContext() , "onDestroy Toast" , Toast.LENGTH_LONG);
        toast.show();
        Log.d(TAG, "onDestroy Toast");
    }

}