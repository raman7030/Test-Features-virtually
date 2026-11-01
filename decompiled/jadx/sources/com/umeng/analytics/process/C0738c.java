package com.umeng.analytics.process;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.concurrent.atomic.AtomicInteger;
import p067l.ConcurrentMapC12768;

/* JADX INFO: renamed from: com.umeng.analytics.process.c */
/* JADX INFO: compiled from: EBML */
/* JADX INFO: loaded from: classes.dex */
public class C0738c {

    /* JADX INFO: renamed from: a */
    public static C0738c f3011a;

    /* JADX INFO: renamed from: b */
    public ConcurrentMapC12768 f3012b = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: c */
    public Context f3013c;

    /* JADX INFO: renamed from: b */
    public synchronized void m2693b(String str) {
        m2691c(str).m2696b();
    }

    /* JADX INFO: renamed from: a */
    public static C0738c m2690a(Context context) {
        if (f3011a == null) {
            synchronized (C0738c.class) {
                if (f3011a == null) {
                    f3011a = new C0738c();
                }
            }
        }
        C0738c c0738c = f3011a;
        c0738c.f3013c = context;
        return c0738c;
    }

    /* JADX INFO: renamed from: a */
    public synchronized SQLiteDatabase m2692a(String str) {
        return m2691c(str).m2695a();
    }

    /* JADX INFO: renamed from: c */
    private a m2691c(String str) {
        if (this.f3012b.get(str) == null) {
            a aVarM2694a = a.m2694a(this.f3013c, str);
            this.f3012b.put(str, aVarM2694a);
            return aVarM2694a;
        }
        return (a) this.f3012b.get(str);
    }

    /* JADX INFO: renamed from: com.umeng.analytics.process.c$a */
    /* JADX INFO: compiled from: EBML */
    public class a {

        /* JADX INFO: renamed from: a */
        public AtomicInteger f3014a = new AtomicInteger();

        /* JADX INFO: renamed from: b */
        public SQLiteOpenHelper f3015b;

        /* JADX INFO: renamed from: c */
        public SQLiteDatabase f3016c;

        /* JADX INFO: renamed from: b */
        public synchronized void m2696b() {
            try {
                if (this.f3014a.decrementAndGet() == 0) {
                    this.f3016c.close();
                }
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: renamed from: a */
        public static a m2694a(Context context, String str) {
            Context appContext = UMGlobalContext.getAppContext(context);
            a aVar = new a();
            aVar.f3015b = C0737b.m2686a(appContext, str);
            return aVar;
        }

        /* JADX INFO: renamed from: a */
        public synchronized SQLiteDatabase m2695a() {
            if (this.f3014a.incrementAndGet() == 1) {
                this.f3016c = this.f3015b.getWritableDatabase();
            }
            return this.f3016c;
        }
    }
}
