package com.example.shreyanshsingh.todo.db;

import android.provider.BaseColumns;

/**
 * Created by Shreyansh Singh on 31-03-2017.
 */

public class TaskContract {

        public static final String DB_NAME = "com.example.shreyanshsingh.todo.db";
        public static final int DB_VERSION = 1;

        public class TaskEntry implements BaseColumns {
            public static final String TABLE = "tasks";

            public static final String COL_TASK_TITLE = "title";
        }
}

