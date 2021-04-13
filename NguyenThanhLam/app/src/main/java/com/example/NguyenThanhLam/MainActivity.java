package com.example.NguyenThanhLam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.NguyenThanhLam.Database.AppDatabase;
import com.example.NguyenThanhLam.Database.AppEntity;


public class MainActivity extends AppCompatActivity {

    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = AppDatabase.getAppDatabase(this);
        insertProduct();

    }

    private void insertProduct(){
        AppEntity bm = new AppEntity();
        bm.name = "Thit Ga";
        bm.quantity = 12000;
        db.appDao().insertProduct(bm);
    }

    private void updateProduct(){
        AppEntity bm = new AppEntity();
        bm.name = "Uc Ga sach";
        bm.quantity = 15000;
        db.appDao().updateProduct(bm);
    }

//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.lvUser:
//                addProduct();
//                break;
//            case R.id.lvUser:
//                viewProduct();
//                break;
//            default:
//                break;
//        }
//    }
//    public void viewProduct(){
//        Intent view = new Intent(MainActivity.this,ListActivity.class);
//        startActivity(view);    }
//
//    EditText edName,edQuantity;
//    Button btAdd,btView;
//    AppDatabase db;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        db = AppDatabase.getAppDatabase(this);
//
//        edName = findViewById(R.id.edName);
//        edQuantity = findViewById(R.id.edQuantity);
//        btAdd = findViewById(R.id.btAdd);
//        btView = findViewById(R.id.btView);
//
//        InitView();
//
//    }

//    private void InitView(){
//        btAdd.setOnClickListener(this);
//        btView.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.lvUser:
//                addProduct();
//                break;
//            case R.id.lvUser:
//                viewProduct();
//                break;
//            default:
//                break;
//        }
//    }
//
//    public void addProduct(){
//        Product product = new Product();
//        product.setName(edName.getText().toString());
//        product.setQuantity(Integer.valueOf(edQuantity.getText().toString()));
//        db.AppDao().Insert(product);
//    }
//
//
//    public void viewProduct(){
//        Intent view = new Intent(MainActivity.this,ListActivity.class);
//        startActivity(view);    }


