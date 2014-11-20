package ia.money.flow.app.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 
 * @author Adnan Kukuljac
 *
 */
public class DatabaseClient extends SQLiteOpenHelper {

	// Logcat tag
    private static final String LOG = "DatabaseClient";
 
    // Database Version
    private static final int DATABASE_VERSION = 1;
 
    // Database Name
    private static final String DATABASE_NAME = "moneyflow";
 
    // Table Names
    private static final String TABLE_CATEGORY_INCOME = "categories_income";
    private static final String TABLE_INCOME = "income";
    private static final String TABLE_CATEGORY_OUTCOME = "categories_outcome";
    private static final String TABLE_OUTCOME = "outcome";
 
    // Column names
    private static final String KEY_ID = "id";
    private static final String KEY_DATE = "date";
    private static final String KEY_NAME = "name";
    private static final String KEY_INCOME_SUM = "income_sum";
    private static final String KEY_INCOME_COMMENT = "income_comment";
    private static final String KEY_INCOME_CATEGORY_ID = "category_id";
    private static final String KEY_OUTCOME_SUM = "outcome_sum";
    private static final String KEY_OUTCOME_COMMENT = "outcome_comment";
    private static final String KEY_OUTCOME_CATEGORY_ID = "category_id";
	
    /* Table Create Statements */
    // category_income table create statement
    private static final String CREATE_TABLE_CATEGORY_INCOME = "CREATE TABLE "
            + TABLE_CATEGORY_INCOME + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME
            + " TEXT )";
 
    // category_outcome table create statement
    private static final String CREATE_TABLE_CATEGORY_OUTCOME = "CREATE TABLE " + TABLE_CATEGORY_OUTCOME
            + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT )";
 
    // income table create statement
    private static final String CREATE_TABLE_INCOME = "CREATE TABLE " + TABLE_INCOME
            + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_INCOME_SUM + " REAL, " + KEY_INCOME_COMMENT + " TEXT," +
    		KEY_INCOME_CATEGORY_ID + "INTEGER, " + KEY_DATE + " DATETIME )";
    
    // outcome table create statement
    private static final String CREATE_TABLE_OUTCOME = "CREATE TABLE " + TABLE_OUTCOME
            + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_OUTCOME_SUM + " REAL, " + KEY_OUTCOME_COMMENT + " TEXT," +
            KEY_OUTCOME_CATEGORY_ID + "INTEGER, " + KEY_DATE + " DATETIME )";
 
    
    public DatabaseClient(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
 
    @Override
    public void onCreate(SQLiteDatabase db) {
 
        // creating required tables
        db.execSQL(CREATE_TABLE_CATEGORY_INCOME);
        db.execSQL(CREATE_TABLE_CATEGORY_OUTCOME);
        db.execSQL(CREATE_TABLE_INCOME);
        db.execSQL(CREATE_TABLE_OUTCOME);
        
    }
 
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CATEGORY_INCOME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CATEGORY_OUTCOME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_INCOME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_OUTCOME);
 
        // create new tables
        onCreate(db);
    }
    
    
}
