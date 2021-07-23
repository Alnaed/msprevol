package com.mspr.msprV9;

import javax.naming.*;
import javax.sql.*;

public class DataBase {

    private static DataSource Database = null;
    private static Context context = null;

    public static DataSource DbConn() throws Exception {

        if (Database != null){
            return Database;
        }

        try {
            if (context == null){
                context = new InitialContext();
            }
            Database = (DataSource) context.lookup("api_mspr");
        } catch (Exception e) {

        }
        return Database;
    }
}
