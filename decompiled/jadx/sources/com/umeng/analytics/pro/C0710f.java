package com.umeng.analytics.pro;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.umeng.analytics.pro.f */
/* JADX INFO: compiled from: D59P */
/* JADX INFO: loaded from: classes.dex */
public class C0710f extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: b */
    public static Context f2738b;

    /* JADX INFO: renamed from: a */
    public String f2739a;

    /* JADX INFO: renamed from: com.umeng.analytics.pro.f$a */
    /* JADX INFO: compiled from: D59P */
    public class a {

        /* JADX INFO: renamed from: a */
        public static final C0710f f2740a = new C0710f(C0710f.f2738b, C0712h.m2476b(C0710f.f2738b), C0709e.f2672b, null, 2);
    }

    /* JADX INFO: renamed from: a */
    public static C0710f m2455a(Context context) {
        if (f2738b == null) {
            f2738b = context.getApplicationContext();
        }
        return a.f2740a;
    }

    public C0710f(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(new C0696c(context, str), str2, cursorFactory, i);
    }

    public C0710f(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, TextUtils.isEmpty(str) ? C0709e.f2672b : str, cursorFactory, i);
        this.f2739a = null;
        m2464a();
    }

    /* JADX INFO: renamed from: a */
    public void m2464a() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!C0712h.m2475a(C0709e.d.f2713a, writableDatabase)) {
                m2460c(writableDatabase);
            }
            if (!C0712h.m2475a(C0709e.c.f2700a, writableDatabase)) {
                m2461d(writableDatabase);
            }
            if (!C0712h.m2475a(C0709e.b.f2687a, writableDatabase)) {
                m2459b(writableDatabase);
            }
            if (C0712h.m2475a(C0709e.a.f2676a, writableDatabase)) {
                return;
            }
            m2456a(writableDatabase);
        } catch (Exception unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                try {
                    sQLiteDatabase.beginTransaction();
                    m2460c(sQLiteDatabase);
                    m2461d(sQLiteDatabase);
                    m2459b(sQLiteDatabase);
                    m2456a(sQLiteDatabase);
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused3) {
            C0712h.m2472a(f2738b);
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        } catch (Throwable unused4) {
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2456a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f2739a = "create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2459b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f2739a = "create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private void m2460c(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f2739a = "create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    private void m2461d(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f2739a = "create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 <= i || i != 1) {
            return;
        }
        try {
            try {
                m2462e(sQLiteDatabase);
            } catch (Exception unused) {
                m2463f(sQLiteDatabase);
            }
        } catch (Exception unused2) {
            m2462e(sQLiteDatabase);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m2462e(SQLiteDatabase sQLiteDatabase) {
        if (!C0712h.m2474a(sQLiteDatabase, C0709e.d.f2713a, "__av")) {
            C0712h.m2473a(sQLiteDatabase, C0709e.d.f2713a, "__sp", "TEXT");
            C0712h.m2473a(sQLiteDatabase, C0709e.d.f2713a, "__pp", "TEXT");
            C0712h.m2473a(sQLiteDatabase, C0709e.d.f2713a, "__av", "TEXT");
            C0712h.m2473a(sQLiteDatabase, C0709e.d.f2713a, "__vc", "TEXT");
        }
        if (!C0712h.m2474a(sQLiteDatabase, C0709e.b.f2687a, "__av")) {
            C0712h.m2473a(sQLiteDatabase, C0709e.b.f2687a, "__av", "TEXT");
            C0712h.m2473a(sQLiteDatabase, C0709e.b.f2687a, "__vc", "TEXT");
        }
        if (C0712h.m2474a(sQLiteDatabase, C0709e.a.f2676a, "__av")) {
            return;
        }
        C0712h.m2473a(sQLiteDatabase, C0709e.a.f2676a, "__av", "TEXT");
        C0712h.m2473a(sQLiteDatabase, C0709e.a.f2676a, "__vc", "TEXT");
    }

    /* JADX INFO: renamed from: f */
    private void m2463f(SQLiteDatabase sQLiteDatabase) {
        m2457a(sQLiteDatabase, C0709e.d.f2713a);
        m2457a(sQLiteDatabase, C0709e.b.f2687a);
        m2457a(sQLiteDatabase, C0709e.a.f2676a);
        m2464a();
    }

    /* JADX INFO: renamed from: a */
    private void m2457a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        } catch (SQLException unused) {
        }
    }
}
