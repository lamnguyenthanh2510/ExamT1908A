package com.example.NguyenThanhLam.Activity;

import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.example.NguyenThanhLam.Database.AppDao;
import com.example.NguyenThanhLam.Database.AppDatabase;
import com.example.NguyenThanhLam.R;

public class ListUserAct extends AppCompatActivity {

    private AppDatabase db;
    private Cursor c;
    private SimpleCursorAdapter adapter;

    protected void onCreate(Bundle savedInstanceStace) {

        super.onCreate(savedInstanceStace);
        setContentView(R.layout.activity_load_product);

        db = new AppDatabase() {
            @Override
            public AppDao appDao() {



                return null;
            }

            @NonNull
            @Override
            protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
                return null;
            }

            @NonNull
            @Override
            protected InvalidationTracker createInvalidationTracker() {
                return null;
            }

            @Override
            public void clearAllTables() {

            }
        };
    }
}
