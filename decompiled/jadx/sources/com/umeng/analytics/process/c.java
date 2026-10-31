package com.umeng.analytics.process;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.concurrent.atomic.AtomicInteger;
import l.ConcurrentMapC10942;

/* JADX INFO: compiled from: EBML */
/* JADX INFO: loaded from: classes.dex */
public class c {
    public static c a;
    public ConcurrentMapC10942 b = new ConcurrentMapC10942();
    public Context c;

    public synchronized void b(String str) {
        c(str).b();
    }

    public static c a(Context context) {
        if (a == null) {
            synchronized (c.class) {
                if (a == null) {
                    a = new c();
                }
            }
        }
        c cVar = a;
        cVar.c = context;
        return cVar;
    }

    public synchronized SQLiteDatabase a(String str) {
        return c(str).a();
    }

    private a c(String str) {
        if (this.b.get(str) == null) {
            a aVarA = a.a(this.c, str);
            this.b.put(str, aVarA);
            return aVarA;
        }
        return (a) this.b.get(str);
    }

    /* JADX INFO: compiled from: EBML */
    public class a {
        public AtomicInteger a = new AtomicInteger();
        public SQLiteOpenHelper b;
        public SQLiteDatabase c;

        public synchronized void b() {
            try {
                if (this.a.decrementAndGet() == 0) {
                    this.c.close();
                }
            } catch (Throwable unused) {
            }
        }

        public static a a(Context context, String str) {
            Context appContext = UMGlobalContext.getAppContext(context);
            a aVar = new a();
            aVar.b = b.a(appContext, str);
            return aVar;
        }

        public synchronized SQLiteDatabase a() {
            if (this.a.incrementAndGet() == 1) {
                this.c = this.b.getWritableDatabase();
            }
            return this.c;
        }
    }
}
