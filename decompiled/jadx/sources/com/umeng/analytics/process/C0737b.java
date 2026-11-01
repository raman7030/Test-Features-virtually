package com.umeng.analytics.process;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.umeng.analytics.pro.C0712h;
import java.io.File;
import p067l.C17588;

/* JADX INFO: renamed from: com.umeng.analytics.process.b */
/* JADX INFO: compiled from: 8BLD */
/* JADX INFO: loaded from: classes.dex */
public class C0737b extends SQLiteOpenHelper {
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C0737b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }

    /* JADX INFO: renamed from: a */
    public static C0737b m2686a(Context context, String str) {
        String strM2689b = m2689b(context, str);
        InterfaceC0736a.f3002h.equals(str);
        return new C0737b(context, strM2689b, null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m2688a(sQLiteDatabase);
    }

    /* JADX INFO: renamed from: a */
    private void m2688a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("create table if not exists __et_p(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __pn TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m2687a(Context context) {
        return C0712h.m2476b(context) + "subprocess/";
    }

    /* JADX INFO: renamed from: b */
    public static String m2689b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = InterfaceC0736a.f3002h;
        }
        String strM2476b = C0712h.m2476b(context) + "subprocess/";
        if (InterfaceC0736a.f3002h.equals(str)) {
            strM2476b = C0712h.m2476b(context);
        }
        File file = new File(strM2476b);
        if (!file.exists()) {
            file.mkdirs();
        }
        return String.format(C17588.m40053(strM2476b, InterfaceC0736a.f2999e), str);
    }
}
