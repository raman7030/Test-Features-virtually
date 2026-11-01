package p067l;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.alipay.sdk.p010m.p052u0.C0227c;

/* JADX INFO: renamed from: l.۬ܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OBMG */
/* JADX INFO: loaded from: classes3.dex */
public final class C14879 {

    /* JADX INFO: renamed from: ֫ */
    public static volatile C14879 f42425;

    /* JADX INFO: renamed from: ۜ */
    public static Handler f42426;

    /* JADX INFO: renamed from: ۢ */
    public static String f42427;

    /* JADX INFO: renamed from: ۧ */
    public static volatile C24906 f42428;

    /* JADX INFO: renamed from: ܳ */
    public static Object f42429 = new Object();

    /* JADX INFO: renamed from: ܽ */
    public static Context f42430;

    /* JADX INFO: renamed from: ܿ */
    public static C14209 f42431;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f42432;

    /* JADX INFO: renamed from: ᩷ */
    public static String f42433;

    /* JADX INFO: renamed from: ᩻ */
    public static HandlerThread f42434;

    /* JADX INFO: renamed from: ֫ */
    public static C14879 m33994(Context context) {
        if (f42425 == null) {
            synchronized (C14879.class) {
                f42430 = context.getApplicationContext();
                f42425 = new C14879();
            }
        }
        if (f42428 == null) {
            synchronized (C14879.class) {
                f42430 = context.getApplicationContext();
                HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
                f42434 = handlerThread;
                handlerThread.start();
                f42426 = new HandlerC5492(f42434.getLooper());
                f42428 = new C24906(f42430);
                m33999();
            }
        }
        return f42425;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m33997() {
        return f42432;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m33998() {
        if (!f42432) {
            return null;
        }
        String str = f42427;
        if (str != null) {
            return str;
        }
        m33995(0);
        if (f42431 == null) {
            Context context = f42430;
            f42431 = new C14209(f42425, 0);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f42431);
        }
        return f42427;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33995(int i) {
        Object obj = f42429;
        synchronized (obj) {
            Message messageObtainMessage = f42426.obtainMessage();
            messageObtainMessage.what = 11;
            Bundle bundle = new Bundle();
            bundle.putInt("type", i);
            if (i == 1 || i == 2) {
                bundle.putString(C0227c.f1027d, null);
            }
            messageObtainMessage.setData(bundle);
            f42426.sendMessage(messageObtainMessage);
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                obj.wait(2000L);
            } catch (InterruptedException unused) {
            }
            if (SystemClock.uptimeMillis() - jUptimeMillis < 2000) {
                if (i == 0) {
                    f42427 = f42433;
                    f42433 = null;
                } else if (i == 1) {
                    if (f42433 != null) {
                        f42433 = null;
                    }
                } else {
                    if (i != 2) {
                        if (i != 4) {
                        }
                    } else if (f42433 != null) {
                        f42433 = null;
                    }
                    f42433 = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m33999() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, C0227c.f1026c, "unknown");
        } catch (Throwable unused) {
            str = "0";
        }
        f42432 = "1".equals(str);
    }
}
