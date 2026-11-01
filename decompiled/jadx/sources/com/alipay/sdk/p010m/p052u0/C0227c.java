package com.alipay.sdk.p010m.p052u0;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.alipay.sdk.m.u0.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0227c {

    /* JADX INFO: renamed from: A */
    public static String f1021A = null;

    /* JADX INFO: renamed from: B */
    public static volatile C0227c f1022B = null;

    /* JADX INFO: renamed from: C */
    public static volatile C0226b f1023C = null;

    /* JADX INFO: renamed from: a */
    public static final String f1024a = "VMS_IDLG_SDK_Client";

    /* JADX INFO: renamed from: b */
    public static final String f1025b = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* JADX INFO: renamed from: c */
    public static final String f1026c = "persist.sys.identifierid.supported";

    /* JADX INFO: renamed from: d */
    public static final String f1027d = "appid";

    /* JADX INFO: renamed from: e */
    public static final String f1028e = "type";

    /* JADX INFO: renamed from: f */
    public static final String f1029f = "OAID";

    /* JADX INFO: renamed from: g */
    public static final String f1030g = "VAID";

    /* JADX INFO: renamed from: h */
    public static final String f1031h = "AAID";

    /* JADX INFO: renamed from: i */
    public static final int f1032i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f1033j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f1034k = 2;

    /* JADX INFO: renamed from: l */
    public static final int f1035l = 4;

    /* JADX INFO: renamed from: m */
    public static final int f1036m = 11;

    /* JADX INFO: renamed from: n */
    public static final int f1037n = 2000;

    /* JADX INFO: renamed from: o */
    public static Context f1038o;

    /* JADX INFO: renamed from: p */
    public static boolean f1039p;

    /* JADX INFO: renamed from: q */
    public static C0228d f1040q;

    /* JADX INFO: renamed from: r */
    public static C0228d f1041r;

    /* JADX INFO: renamed from: s */
    public static C0228d f1042s;

    /* JADX INFO: renamed from: t */
    public static Object f1043t = new Object();

    /* JADX INFO: renamed from: u */
    public static HandlerThread f1044u;

    /* JADX INFO: renamed from: v */
    public static Handler f1045v;

    /* JADX INFO: renamed from: w */
    public static String f1046w;

    /* JADX INFO: renamed from: x */
    public static String f1047x;

    /* JADX INFO: renamed from: y */
    public static String f1048y;

    /* JADX INFO: renamed from: z */
    public static String f1049z;

    /* JADX INFO: renamed from: com.alipay.sdk.m.u0.c$a */
    /* JADX INFO: compiled from: N673 */
    public final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 11) {
                String unused = C0227c.f1046w = C0227c.f1023C.m1053a(message.getData().getInt("type"), message.getData().getString(C0227c.f1027d));
                synchronized (C0227c.f1043t) {
                    C0227c.f1043t.notify();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1061f() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        f1044u = handlerThread;
        handlerThread.start();
        f1045v = new a(f1044u.getLooper());
    }

    /* JADX INFO: renamed from: c */
    public String m1065c(String str) {
        if (!m1068g()) {
            return null;
        }
        String str2 = f1048y;
        if (str2 != null) {
            return str2;
        }
        m1062a(1, str);
        if (f1041r == null && f1048y != null) {
            m1058a(f1038o, 1, str);
        }
        return f1048y;
    }

    /* JADX INFO: renamed from: d */
    public String m1066d() {
        if (!m1068g()) {
            return null;
        }
        String str = f1047x;
        if (str != null) {
            return str;
        }
        m1062a(0, (String) null);
        if (f1040q == null) {
            m1058a(f1038o, 0, null);
        }
        return f1047x;
    }

    /* JADX INFO: renamed from: e */
    public String m1067e() {
        if (!m1068g()) {
            return null;
        }
        m1062a(4, (String) null);
        return f1021A;
    }

    /* JADX INFO: renamed from: g */
    public boolean m1068g() {
        return f1039p;
    }

    /* JADX INFO: renamed from: b */
    public String m1063b(String str) {
        if (!m1068g()) {
            return null;
        }
        String str2 = f1049z;
        if (str2 != null) {
            return str2;
        }
        m1062a(2, str);
        if (f1042s == null && f1049z != null) {
            m1058a(f1038o, 2, str);
        }
        return f1049z;
    }

    /* JADX INFO: renamed from: a */
    public static C0227c m1055a(Context context) {
        if (f1022B == null) {
            synchronized (C0227c.class) {
                f1038o = context.getApplicationContext();
                f1022B = new C0227c();
            }
        }
        if (f1023C == null) {
            synchronized (C0227c.class) {
                f1038o = context.getApplicationContext();
                m1061f();
                f1023C = new C0226b(f1038o);
                m1060c();
            }
        }
        return f1022B;
    }

    /* JADX INFO: renamed from: c */
    public static void m1060c() {
        f1039p = "1".equals(m1057a(f1026c, "0"));
    }

    /* JADX INFO: renamed from: b */
    public final void m1064b(int i, String str) {
        Message messageObtainMessage = f1045v.obtainMessage();
        messageObtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        if (i == 1 || i == 2) {
            bundle.putString(f1027d, str);
        }
        messageObtainMessage.setData(bundle);
        f1045v.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: a */
    public void m1062a(int i, String str) {
        synchronized (f1043t) {
            m1064b(i, str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                f1043t.wait(2000L);
            } catch (InterruptedException unused) {
            }
            if (SystemClock.uptimeMillis() - jUptimeMillis < 2000) {
                if (i == 0) {
                    f1047x = f1046w;
                    f1046w = null;
                } else if (i != 1) {
                    if (i == 2) {
                        String str2 = f1046w;
                        if (str2 != null) {
                            f1049z = str2;
                            f1046w = null;
                        }
                    } else if (i != 4) {
                    }
                    f1021A = f1046w;
                    f1046w = null;
                } else {
                    String str3 = f1046w;
                    if (str3 != null) {
                        f1048y = str3;
                        f1046w = null;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1057a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1058a(Context context, int i, String str) {
        if (i == 0) {
            f1040q = new C0228d(f1022B, 0, null);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f1040q);
            return;
        }
        if (i == 1) {
            f1041r = new C0228d(f1022B, 1, str);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, f1041r);
            return;
        }
        if (i != 2) {
            return;
        }
        f1042s = new C0228d(f1022B, 2, str);
        context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str), false, f1042s);
    }
}
