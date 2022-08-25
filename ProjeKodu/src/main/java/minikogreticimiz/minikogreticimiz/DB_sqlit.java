package minikogreticimiz.minikogreticimiz;

/**
 * Created by IREM on 14.04.2018.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by IREM on 5.04.2018.
 */

public class DB_sqlit extends SQLiteOpenHelper {
    public static final String BDname ="data.db";
    public DB_sqlit(Context context) {
        super(context, BDname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table mytable (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT , surname TEXT,email TEXT,password TEXT )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS mytable");
        onCreate(db);
    }
    public boolean insertdata (String name,String surname,String password, String email){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name",name);
        contentValues.put("surname",surname);
        contentValues.put("email",email);
        contentValues.put("password",password);



        long result=db.insert("mytable",null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }



    public boolean getRecord(String email,String password){
        ArrayList arrayList=new ArrayList();
        SQLiteDatabase db =this.getReadableDatabase();
        Cursor res=db.rawQuery("select * from mytable",null);
        res.moveToFirst();

        while(res.isAfterLast()==false){

            String t3=res.getString(3);

            String t4=res.getString(4);

            if(t3.equals(email) && t4.equals(password))
            {
                return true;
            }
            res.moveToNext();
        }
        return false;
    }




}
