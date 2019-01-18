package com.cws.ormroomapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

import static android.content.ContentValues.TAG;

public class AddService extends Service {

    @Override
    public void onCreate() {

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new IAddService.Stub() {
            /**
             * In the AIDL file we just add the declaration of the function
             * here is the real implementation of the add() function below
             */
            public int add(int ValueFirst, int valueSecond) throws RemoteException {
                 return (ValueFirst + valueSecond);
            }
        };
    }

}
