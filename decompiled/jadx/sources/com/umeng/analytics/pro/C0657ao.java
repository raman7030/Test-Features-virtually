package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.debug.UMRTLog;

/* JADX INFO: renamed from: com.umeng.analytics.pro.ao */
/* JADX INFO: compiled from: HBLO */
/* JADX INFO: loaded from: classes.dex */
public class C0657ao extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b */
    public static final Object f2410b = new Object();

    /* JADX INFO: renamed from: c */
    public static C0657ao f2411c = null;

    /* JADX INFO: renamed from: d */
    public static final String f2412d = "CREATE TABLE IF NOT EXISTS stf(_id INTEGER PRIMARY KEY AUTOINCREMENT, _tp TEXT, _hd TEXT, _bd TEXT, _ts TEXT, _uuid TEXT, _re1 TEXT, _re2 TEXT)";

    /* JADX INFO: renamed from: e */
    public static final String f2413e = "DROP TABLE IF EXISTS stf";

    /* JADX INFO: renamed from: f */
    public static final String f2414f = "DELETE FROM stf WHERE _id IN( SELECT _id FROM stf ORDER BY _id LIMIT 1)";

    /* JADX INFO: renamed from: a */
    public final Context f2415a;

    /* JADX INFO: renamed from: a */
    public static final int m2229a() {
        return 1;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: renamed from: a */
    public static C0657ao m2230a(Context context) {
        C0657ao c0657ao;
        synchronized (f2410b) {
            if (f2411c == null) {
                f2411c = new C0657ao(context, C0659aq.f2423b, null, 1);
            }
            c0657ao = f2411c;
        }
        return c0657ao;
    }

    public C0657ao(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        this.f2415a = context;
    }

    /* JADX INFO: renamed from: a */
    private void m2231a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(f2413e);
            sQLiteDatabase.execSQL(f2412d);
        } catch (SQLException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2232b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(f2412d);
        } catch (SQLiteDatabaseCorruptException unused) {
            m2231a(sQLiteDatabase);
        } catch (Throwable th) {
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]创建二级缓存数据库失败: " + th.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m2232b(sQLiteDatabase);
    }

    /* JADX INFO: renamed from: b */
    public void m2239b() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            writableDatabase.close();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2236a(String str, ContentValues contentValues) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.beginTransaction();
                writableDatabase.insert(str, null, contentValues);
                writableDatabase.setTransactionSuccessful();
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]插入二级缓存数据记录 成功。");
            } catch (Throwable unused) {
            }
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2238a(String str, String str2, String[] strArr) {
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

    /* JADX INFO: renamed from: d */
    private void m2233d() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null || !writableDatabase.isOpen()) {
                return;
            }
            try {
                writableDatabase.execSQL(f2414f);
            } catch (Throwable unused) {
            }
            writableDatabase.close();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public C0658ap m2235a(String str) {
        Cursor cursorM2234a;
        C0658ap c0658ap = null;
        try {
            cursorM2234a = m2234a(str, new String[]{C0659aq.f2430i, C0659aq.f2426e, C0659aq.f2427f, C0659aq.f2428g, C0659aq.f2431j, C0659aq.f2432k}, null, null, null, null, null, "1");
            if (cursorM2234a != null) {
                try {
                    if (cursorM2234a.moveToFirst()) {
                        C0658ap c0658ap2 = new C0658ap();
                        try {
                            c0658ap2.f2416a = cursorM2234a.getString(0);
                            c0658ap2.f2417b = cursorM2234a.getString(1);
                            String string = cursorM2234a.getString(2);
                            String string2 = cursorM2234a.getString(3);
                            c0658ap2.f2418c = C0713i.m2480a(this.f2415a).m2506d(string);
                            c0658ap2.f2419d = C0713i.m2480a(this.f2415a).m2506d(string2);
                            c0658ap2.f2420e = cursorM2234a.getString(4);
                            c0658ap2.f2421f = cursorM2234a.getString(5);
                            c0658ap = c0658ap2;
                        } catch (Throwable unused) {
                            c0658ap = c0658ap2;
                            try {
                                m2233d();
                                return c0658ap;
                            } finally {
                                if (cursorM2234a != null) {
                                    cursorM2234a.close();
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (cursorM2234a != null) {
                cursorM2234a.close();
            }
            return c0658ap;
        } catch (Throwable unused3) {
            cursorM2234a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2237a(String str, String str2) {
        m2238a(str, "_uuid=?", new String[]{str2});
    }

    /* JADX INFO: renamed from: a */
    public Cursor m2234a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
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

    /* JADX INFO: renamed from: b */
    public boolean m2240b(String str) {
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

    /* JADX INFO: renamed from: c */
    public boolean m2241c() {
        return !m2240b(C0659aq.f2424c);
    }
}
