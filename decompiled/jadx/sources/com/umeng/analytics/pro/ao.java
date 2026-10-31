package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.debug.UMRTLog;

/* JADX INFO: compiled from: HBLO */
/* JADX INFO: loaded from: classes.dex */
public class ao extends SQLiteOpenHelper {
    public static final Object b = new Object();
    public static ao c = null;
    public static final String d = "CREATE TABLE IF NOT EXISTS stf(_id INTEGER PRIMARY KEY AUTOINCREMENT, _tp TEXT, _hd TEXT, _bd TEXT, _ts TEXT, _uuid TEXT, _re1 TEXT, _re2 TEXT)";
    public static final String e = "DROP TABLE IF EXISTS stf";
    public static final String f = "DELETE FROM stf WHERE _id IN( SELECT _id FROM stf ORDER BY _id LIMIT 1)";
    public final Context a;

    public static final int a() {
        return 1;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public static ao a(Context context) {
        ao aoVar;
        synchronized (b) {
            if (c == null) {
                c = new ao(context, aq.b, null, 1);
            }
            aoVar = c;
        }
        return aoVar;
    }

    public ao(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.a = context;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(e);
            sQLiteDatabase.execSQL(d);
        } catch (SQLException unused) {
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(d);
        } catch (SQLiteDatabaseCorruptException unused) {
            a(sQLiteDatabase);
        } catch (Throwable th) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]创建二级缓存数据库失败: " + th.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
    }

    public void b() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            writableDatabase.close();
        } catch (Throwable unused) {
        }
    }

    public void a(String str, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.beginTransaction();
                writableDatabase.insert(str, null, contentValues);
                writableDatabase.setTransactionSuccessful();
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> [有状态]插入二级缓存数据记录 成功。");
            } catch (Throwable unused) {
            }
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    public void a(String str, String str2, String[] strArr) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.beginTransaction();
                writableDatabase.delete(str, str2, strArr);
                writableDatabase.setTransactionSuccessful();
            } catch (Throwable unused) {
            }
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    private void d() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.execSQL(f);
            } catch (Throwable unused) {
            }
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    public ap a(String str) {
        Cursor cursorA;
        ap apVar = null;
        try {
            cursorA = a(str, new String[]{aq.i, aq.e, aq.f, aq.g, aq.j, aq.k}, null, null, null, null, null, "1");
            if (cursorA != null) {
                try {
                    if (cursorA.moveToFirst()) {
                        ap apVar2 = new ap();
                        try {
                            apVar2.a = cursorA.getString(0);
                            apVar2.b = cursorA.getString(1);
                            String string = cursorA.getString(2);
                            String string2 = cursorA.getString(3);
                            apVar2.c = i.a(this.a).d(string);
                            apVar2.d = i.a(this.a).d(string2);
                            apVar2.e = cursorA.getString(4);
                            apVar2.f = cursorA.getString(5);
                            apVar = apVar2;
                        } catch (Throwable unused) {
                            apVar = apVar2;
                            try {
                                d();
                                return apVar;
                            } finally {
                                if (cursorA != null) {
                                    cursorA.close();
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (cursorA != null) {
                cursorA.close();
            }
            return apVar;
        } catch (Throwable unused3) {
            cursorA = null;
        }
    }

    public void a(String str, String str2) {
        a(str, "_uuid=?", new String[]{str2});
    }

    public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return null;
            }
            return writableDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean b(String str) {
        SQLiteDatabase writableDatabase;
        Cursor cursorQuery = null;
        try {
            writableDatabase = getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    if (writableDatabase.isOpen()) {
                        cursorQuery = writableDatabase.query(str, null, null, null, null, null, null, null);
                    }
                } catch (Throwable unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (writableDatabase == null) {
                        return false;
                    }
                }
            }
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                cursorQuery.close();
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
                return true;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (writableDatabase == null) {
                return false;
            }
            writableDatabase.close();
            return false;
        } catch (Throwable unused2) {
            writableDatabase = null;
        }
    }

    public boolean c() {
        return !b(aq.c);
    }
}
