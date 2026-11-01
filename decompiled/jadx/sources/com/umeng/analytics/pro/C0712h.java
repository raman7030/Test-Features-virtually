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
import p067l.C5633;

/* JADX INFO: renamed from: com.umeng.analytics.pro.h */
/* JADX INFO: compiled from: E4L5 */
/* JADX INFO: loaded from: classes.dex */
public class C0712h {
    /* JADX INFO: renamed from: a */
    public static boolean m2475a(String str, SQLiteDatabase sQLiteDatabase) {
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

    /* JADX INFO: renamed from: a */
    public static void m2472a(Context context) {
        if (context == null) {
            return;
        }
        try {
            File databasePath = context.getDatabasePath(C0709e.f2672b);
            if (databasePath != null && databasePath.exists()) {
                databasePath.delete();
            }
            C0710f.m2455a(context).m2464a();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m2476b(Context context) {
        return context.getDatabasePath(C0709e.f2672b).getParent() + File.separator;
    }

    /* JADX INFO: renamed from: c */
    public static String m2478c(Context context) {
        return m2476b(context) + "subprocess/";
    }

    /* JADX INFO: renamed from: a */
    public static String m2470a(List list) {
        return TextUtils.join("!", list);
    }

    /* JADX INFO: renamed from: a */
    public static List m2471a(String str) {
        return new ArrayList(Arrays.asList(str.split("!")));
    }

    /* JADX INFO: renamed from: b */
    public static List m2477b(List list) {
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

    /* JADX INFO: renamed from: a */
    public static boolean m2474a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
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

    /* JADX INFO: renamed from: a */
    public static void m2473a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        StringBuilder sbM12525 = C5633.m12525("alter table ", str, " add ", str2, " ");
        sbM12525.append(str3);
        sQLiteDatabase.execSQL(sbM12525.toString());
    }
}
