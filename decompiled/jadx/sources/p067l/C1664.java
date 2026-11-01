package p067l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import com.alipay.sdk.p010m.p039o.C0180b;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ܽۤ */
/* JADX INFO: compiled from: 2B21 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1664 {

    /* JADX INFO: renamed from: ֫ */
    public static final ThreadPoolExecutor f54109;

    /* JADX INFO: renamed from: ۧ */
    public static final Object f54110;

    /* JADX INFO: renamed from: ܽ */
    public static final C1012 f54111;

    /* JADX INFO: renamed from: ᩳ */
    public static final C0907 f54112 = new C0907(16);

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1874());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f54109 = threadPoolExecutor;
        f54110 = new Object();
        f54111 = new C1012();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Typeface m41300(Context context, C1422 c1422, int i, C1597 c1597) {
        Handler handler;
        String str = c1422.m30632() + "-" + i;
        Typeface typeface = (Typeface) f54112.m6785(str);
        if (typeface != null) {
            c1597.m38174(new C1384(typeface));
            return typeface;
        }
        C1527 c1527 = new C1527(c1597);
        synchronized (f54110) {
            C1012 c1012 = f54111;
            ArrayList arrayList = (ArrayList) c1012.getOrDefault(str, null);
            if (arrayList != null) {
                arrayList.add(c1527);
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c1527);
            c1012.put(str, arrayList2);
            CallableC1212 callableC1212 = new CallableC1212(str, context, c1422, i);
            ThreadPoolExecutor threadPoolExecutor = f54109;
            C0929 c0929 = new C0929(str);
            if (Looper.myLooper() == null) {
                handler = new Handler(Looper.getMainLooper());
            } else {
                handler = new Handler();
            }
            threadPoolExecutor.execute(new RunnableC1279(handler, callableC1212, c0929));
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Typeface m41301(Context context, C1422 c1422, C1597 c1597, int i, int i2) {
        String str = c1422.m30632() + "-" + i;
        Typeface typeface = (Typeface) f54112.m6785(str);
        if (typeface != null) {
            c1597.m38174(new C1384(typeface));
            return typeface;
        }
        if (i2 == -1) {
            C1384 c1384M41302 = m41302(str, context, c1422, i);
            c1597.m38174(c1384M41302);
            return c1384M41302.f35813;
        }
        try {
            try {
                try {
                    try {
                        C1384 c1384 = (C1384) f54109.submit(new CallableC1982(str, context, c1422, i)).get(i2, TimeUnit.MILLISECONDS);
                        c1597.m38174(c1384);
                        return c1384.f35813;
                    } catch (TimeoutException unused) {
                        throw new InterruptedException(C0180b.f794n0);
                    }
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            } catch (InterruptedException e2) {
                throw e2;
            }
        } catch (InterruptedException unused2) {
            c1597.m38174(new C1384(-3));
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d A[EDGE_INSN: B:23:0x003d->B:27:0x0045 BREAK  A[LOOP:0: B:19:0x0031->B:25:0x0041]] */
    /* JADX INFO: renamed from: ֫ */
    public static C1384 m41302(String str, Context context, C1422 c1422, int i) {
        C0907 c0907 = f54112;
        Typeface typeface = (Typeface) c0907.m6785(str);
        if (typeface != null) {
            return new C1384(typeface);
        }
        try {
            C1734 c1734M18806 = C1142.m18806(context, c1422);
            int i2 = 1;
            if (c1734M18806.m44271() != 0) {
                if (c1734M18806.m44271() != 1) {
                    i2 = -3;
                    break;
                }
                i2 = -2;
            } else {
                C1699[] c1699ArrM44270 = c1734M18806.m44270();
                if (c1699ArrM44270 != null && c1699ArrM44270.length != 0) {
                    int length = c1699ArrM44270.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i2 = 0;
                            break;
                        }
                        int iM42812 = c1699ArrM44270[i3].m42812();
                        if (iM42812 != 0) {
                            if (iM42812 >= 0) {
                                i2 = iM42812;
                                break;
                            }
                            i2 = -3;
                            break;
                        }
                        i3++;
                    }
                }
            }
            if (i2 != 0) {
                return new C1384(i2);
            }
            Typeface typefaceM20366 = C1178.m20366(context, c1734M18806.m44270(), i);
            if (typefaceM20366 != null) {
                c0907.m6786(str, typefaceM20366);
                return new C1384(typefaceM20366);
            }
            return new C1384(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C1384(-1);
        }
    }
}
