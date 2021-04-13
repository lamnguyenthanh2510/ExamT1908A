package com.example.NguyenThanhLam.Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface AppDao {
    @Insert(onConflict = REPLACE)
    void insertProduct(AppEntity product);
    @Update
    void updateProduct(AppEntity product);
    @Delete
    void deleteProduct(AppEntity product);

    @Query("SELECT * FROM Product WHERE id = :id")
    AppEntity getProduct(int id);

    @Query("SELECT *FROM Product")
    List<AppEntity> getAllProduct();

    @Query("DELETE FROM product")
    void deleteall();
}
