package com.cws.ormroomapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cws.ormroomapp.swipemenulistviewsample.DifferentMenuActivity;
import com.cws.ormroomapp.swipemenulistviewsample.SimpleActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                startActivity(new Intent(this, SimpleActivity.class));
                break;
            case R.id.button2:
                Intent i = new Intent(this, SimpleActivity.class);
                i.putExtra("stick_mode", true);
                startActivity(i);
                break;
            case R.id.button3:
                startActivity(new Intent(this, DifferentMenuActivity.class));
                break;
            case R.id.button4:
                Intent j = new Intent(this, DifferentMenuActivity.class);
                j.putExtra("stick_mode", true);
                startActivity(j);
                break;
        }
    }


   /* IAddService service;
    AddServiceConnection connection;
    *//**
     * This is the class which represents the actual service-connection.
     * It type casts the bound-stub implementation of the service class to our AIDL interface.
     *//*
    class AddServiceConnection implements ServiceConnection {
        public void onServiceConnected(ComponentName name, IBinder boundService) {
            service = IAddService.Stub.asInterface((IBinder) boundService);
            Log.i("TAG","onServiceConnected(): Connected");
            Toast.makeText(MainActivity1.this, "AIDLExample Service connected", Toast.LENGTH_LONG).show();
        }
        public void onServiceDisconnected(ComponentName name) {
            service = null;
            Log.i("TAG", "onServiceDisconnected(): Disconnected");
            Toast.makeText(MainActivity1.this, "AIDLExample Service Connected", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initService();
    }
    public void onClickButtonResult(View v)
    {
        TextView value1 = (TextView) findViewById(R.id.editTextValue1);
        EditText value2  = (EditText) findViewById(R.id.editTextValue2);
        EditText result = (EditText) findViewById(R.id.editTextResult);
        int n1 =0, n2 =0, res = -1;
        n1 = Integer.parseInt(value1.getText().toString());
        n2 = Integer.parseInt(value2.getText().toString());
        try {
            res = service.add(n1, n2);
        } catch (RemoteException e) {
            Log.i("TAG", "Data fetch failed with: "+ e);
            e.printStackTrace();
        }
        result.setText(new Integer(res).toString());
    }
    *//** This is our function which binds our activity(MainActivity1) to our service(AddService). *//*
    private void initService() {
        Log.i("TAG", "initService()" );
        connection = new AddServiceConnection();
        Intent i = new Intent();
        i.setClassName("com.cws.ormroomapp", com.cws.ormroomapp.AddService.class.getName());
        boolean ret = bindService(i, connection, Context.BIND_AUTO_CREATE);
        Log.i("TAG", "initService() bound value:"+ ret);
    }

    *//** This is our function to un-binds this activity from our service. *//*
    private void releaseService() {
        unbindService(connection);
        connection = null;
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        releaseService();
    }*/
}
