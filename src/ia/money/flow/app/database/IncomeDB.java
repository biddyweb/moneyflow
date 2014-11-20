package ia.money.flow.app.database;

import java.util.ArrayList;
import java.util.List;

import ia.money.flow.app.model.Income;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class IncomeDB extends SQLiteOpenHelper {
	
	private static final String KEY_DATE = "date";

	private static final String KEY_CATEGORY = "category";

	private static final String KEY_INCOME_COMMENT = "income_comment";

	private static final String KEY_INCOME_SUM = "income_sum";

	private static final String KEY_ID = "id";

	private static final String TABLE_INCOME = "income";

	// Database Version
    private static final int DATABASE_VERSION = 1;
 
    // Database Name
    private static final String DATABASE_NAME = "moneyflow";
	 
	public IncomeDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

	@Override
	public void onCreate(SQLiteDatabase arg0) {
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
	}
	
	public Income getIncome(int id){
		SQLiteDatabase db = this.getReadableDatabase();
		 
	    Cursor cursor = db.query(TABLE_INCOME, new String[] { KEY_ID,
	    		KEY_INCOME_SUM, KEY_INCOME_COMMENT, KEY_CATEGORY, KEY_DATE}, KEY_ID + "=?",
	            new String[] { String.valueOf(id) }, null, null, null, null);
	    if (cursor != null)
	        cursor.moveToFirst();
	 
	    Income income = new Income(Integer.parseInt(cursor.getString(0)),
	            cursor.getDouble(1), cursor.getString(2), cursor.getInt(3), cursor.getString(4));
	   
	    return income;
		
	}
	
	public List<Income> getIncomes(){
		List<Income> incomeList = new ArrayList<Income>();
	    // Select All Query
	    String selectQuery = "SELECT  * FROM " + TABLE_INCOME;
	 
	    SQLiteDatabase db = this.getWritableDatabase();
	    Cursor cursor = db.rawQuery(selectQuery, null);
	 
	    // looping through all rows and adding to list
	    if (cursor.moveToFirst()) {
	        do {
	            Income income = new Income();
	            income.setId(Integer.parseInt(cursor.getString(0)));
	            income.setIncomeSum(cursor.getDouble(1));
	            income.setIncomeComment(cursor.getString(2));
	            income.setCategoryIncomeId(cursor.getInt(3));
	            income.setDate(cursor.getString(4));
	            
	            incomeList.add(income);
	        } while (cursor.moveToNext());
	    }
	 
	    // return contact list
	    return incomeList;
	}
	
	public void insertIncome(Income income){
		SQLiteDatabase db = this.getWritableDatabase();
		 
	    ContentValues values = new ContentValues();
	    values.put(KEY_ID, income.getId()); 
	    values.put(KEY_INCOME_COMMENT, income.getIncomeComment()); 
	    values.put(KEY_CATEGORY, income.getCategoryIncomeId());
	    values.put(KEY_INCOME_SUM, income.getIncomeSum()); 
	    values.put(KEY_DATE, income.getDate()); 
	 
	    // Inserting Row
	    db.insert(TABLE_INCOME, null, values);
	    db.close(); 
	    
	}
	
	public int updateIncome(Income income){
		SQLiteDatabase db = this.getWritableDatabase();
		 
	    ContentValues values = new ContentValues();
	    values.put(KEY_INCOME_COMMENT, income.getIncomeComment());
	    values.put(KEY_CATEGORY, income.getCategoryIncomeId());
	    values.put(KEY_INCOME_SUM, income.getIncomeSum());
	    values.put(KEY_DATE, income.getDate());
	 
	    // updating row
	    return db.update(TABLE_INCOME, values, KEY_ID + " = ?",
	            new String[] { String.valueOf(income.getId()) });
	}
	
	public void deleteIncome(Income income){
		SQLiteDatabase db = this.getWritableDatabase();
	    db.delete(TABLE_INCOME, KEY_ID + " = ?",
	            new String[] { String.valueOf(income.getId()) });
	    db.close();
	}

}
