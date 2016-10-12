package com.example.coolweather.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper{
	/**
	 * Province表建表语句
	 */
	public static final String CREAT_PROVINCE ="creat table Province("
			+"id interger primary key autoincrement,"
			+"province_name text,"
			+"province_code text)";
	/**
	 * City建表语句
	 */
	public static final String CREAT_CITY ="creat table City("
			+"id interger primary key autoincrement,"
			+"province_name text,"
			+"province_code text,"
			+"province_id interger)";
	
	/**
	 * Country表建表语句
	 */
	public static final String CREAT_COUNTRY ="creat table Country("
			+"id interger primary key autoincrement,"
			+"country_name text,"
			+"country_code text)"
			+"city_id interger)";

	public CoolWeatherOpenHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREAT_PROVINCE);//创建Province表
		db.execSQL(CREAT_CITY);//创建City表
		db.execSQL(CREAT_CITY);//创建Country表
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}
}
