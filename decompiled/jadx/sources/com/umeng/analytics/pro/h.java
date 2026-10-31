package com.umeng.analytics.pro;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l.C3435;

/* JADX INFO: compiled from: E4L5 */
/* JADX INFO: loaded from: classes.dex */
public class h {
    public static boolean a(String str, SQLiteDatabase sQLiteDatabase) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("sqlite_master", new String[]{"count(*)"}, "type=? and name=?", new String[]{"table", str.trim()}, null, null, null, null);
            if (cursorQuery.moveToNext() && cursorQuery.getInt(0) > 0) {
                z = true;
            }
            cursorQuery.close();
            return z;
        } catch (Exception unused) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            File databasePath = context.getDatabasePath(e.b);
            if (databasePath != null && databasePath.exists()) {
                databasePath.delete();
            }
            f.a(context).a();
        } catch (Throwable unused) {
        }
    }

    public static String b(Context context) {
        return context.getDatabasePath(e.b).getParent() + File.separator;
    }

    public static String c(Context context) {
        return b(context) + "subprocess/";
    }

    public static String a(List list) {
        return TextUtils.join("!", list);
    }

    public static List a(String str) {
        return new ArrayList(Arrays.asList(str.split("!")));
    }

    public static List b(List list) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (Collections.frequency(arrayList, str) < 1) {
                    arrayList.add(str);
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        boolean z = false;
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query(str, null, null, null, null, null, "LIMIT 0");
            if (cursorQuery != null && cursorQuery.getColumnIndex(str2) != -1) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            return false;
        } finally {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        StringBuilder sbM10501 = C3435.m10501("alter table ", str, " add ", str2, " ");
        sbM10501.append(str3);
        sQLiteDatabase.execSQL(sbM10501.toString());
    }
}
