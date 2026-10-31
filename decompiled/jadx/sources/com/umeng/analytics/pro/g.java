package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: V59J */
/* JADX INFO: loaded from: classes.dex */
public class g {
    public static SQLiteOpenHelper b;
    public static Context d;
    public AtomicInteger a;
    public SQLiteDatabase c;

    public synchronized void b() {
        try {
            if (this.a.decrementAndGet() == 0) {
                this.c.close();
            }
        } catch (Throwable unused) {
        }
    }

    public g() {
        this.a = new AtomicInteger();
    }

    /* JADX INFO: compiled from: V59J */
    public class a {
        public static final g a = new g();
    }

    public static g a(Context context) {
        if (d == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            d = applicationContext;
            b = f.a(applicationContext);
        }
        return a.a;
    }

    public synchronized SQLiteDatabase a() {
        if (this.a.incrementAndGet() == 1) {
            this.c = b.getWritableDatabase();
        }
        return this.c;
    }
}
