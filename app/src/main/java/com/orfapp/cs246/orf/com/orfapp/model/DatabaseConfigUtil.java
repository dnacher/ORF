package com.orfapp.cs246.orf.com.orfapp.model;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

import java.io.IOException;
import java.sql.SQLException;

import static com.j256.ormlite.android.apptools.OrmLiteConfigUtil.writeConfigFile;
import static com.orfapp.cs246.orf.com.orfapp.model.Teacher.*;

/**
 * Created by Nacher on 13/07/2017.
 */

public class DatabaseConfigUtil extends OrmLiteConfigUtil{

    private static final Class<?> [] classes = new Class[]{Teacher.class, Read.class, Read.class, Student.class,User.class};

    public static void main(String[] args) throws IOException, SQLException {
        writeConfigFile("ormlite_config.txt",classes);
    }
}
