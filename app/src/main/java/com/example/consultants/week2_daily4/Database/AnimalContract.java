package com.example.consultants.week2_daily4.Database;

import android.provider.BaseColumns;

public class AnimalContract {

    public static final String NAME = "Animal.db";
    public static int VERSION = 1;

    public static final String CREATE_TABLE = "CREATE TABLE " + FeedEntry.TABLE_NAME + "(" +
            FeedEntry.COL_NAME + " Text, " +
            FeedEntry.COL_CATEGORY + " Text, " +
            FeedEntry.COL_WEIGHT + " Text, " +
            FeedEntry.COL_SOUND + " Text, " +
            FeedEntry.COL_DESCRIPTION + " Text, " +
            FeedEntry.COL_IMAGE + " Text)";

    public static final  String GET_ALL = "SELECT * FROM " + FeedEntry.TABLE_NAME;

    public static final String GET_CATEGORIES = "SELECT DISTINCT Category FROM " + FeedEntry.TABLE_NAME;

    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "Animal";
        public static final String COL_NAME = "Name";
        public static final String COL_CATEGORY = "Category";
        public static final String COL_WEIGHT = "Weight";
        public static final String COL_SOUND = "Sound";
        public static final String COL_DESCRIPTION = "Description";
        public static final String COL_IMAGE = "Image";

    }

}
