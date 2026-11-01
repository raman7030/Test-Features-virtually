package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.umeng.analytics.pro.g */
/* JADX INFO: compiled from: V59J */
/* JADX INFO: loaded from: classes.dex */
public class C0711g {

    /* JADX INFO: renamed from: b */
    public static SQLiteOpenHelper f2741b;

    /* JADX INFO: renamed from: d */
    public static Context f2742d;

    /* JADX INFO: renamed from: a */
    public AtomicInteger f2743a;

    /* JADX INFO: renamed from: c */
    public SQLiteDatabase f2744c;

    /* JADX INFO: renamed from: b */
    public synchronized void m2468b() {
        try {
            if (this.f2743a.decrementAndGet() == 0) {
                this.f2744c.close();
            }
        } catch (Throwable unused) {
        }
    }

    public C0711g() {
        this.f2743a = new AtomicInteger();
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.g$a */
    /* JADX INFO: compiled from: V59J */
    public class a {

        /* JADX INFO: renamed from: a */
        public static final C0711g f2745a = new C0711g();
    }

    /* JADX INFO: renamed from: a */
    public static C0711g m2466a(Context context) {
        if (f2742d == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            f2742d = applicationContext;
            f2741b = C0710f.m2455a(applicationContext);
        }
        return a.f2745a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized SQLiteDatabase m2467a() {
        if (this.f2743a.incrementAndGet() == 1) {
            this.f2744c = f2741b.getWritableDatabase();
        }
        return this.f2744c;
    }
}
