package com.umeng.commonsdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.utils.onMessageSendListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class UMConfigureImpl {

    /* JADX INFO: renamed from: a */
    public static String f3038a = "delayed_transmission_flag_new";

    /* JADX INFO: renamed from: e */
    public static final int f3042e = 1000;

    /* JADX INFO: renamed from: f */
    public static ScheduledExecutorService f3043f;

    /* JADX INFO: renamed from: g */
    public static Context f3044g;

    /* JADX INFO: renamed from: b */
    public static CopyOnWriteArrayList f3039b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public static int f3040c = 0;

    /* JADX INFO: renamed from: d */
    public static boolean f3041d = false;

    /* JADX INFO: renamed from: h */
    public static int f3045h = 0;

    /* JADX INFO: renamed from: i */
    public static Runnable f3046i = new Runnable() { // from class: com.umeng.commonsdk.UMConfigureImpl.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (UMConfigureImpl.f3040c == 0 || UMConfigureImpl.f3045h >= 10) {
                    if (!UMConfigureImpl.f3041d) {
                        boolean unused = UMConfigureImpl.f3041d = true;
                        UMConfigureImpl.m2721b(UMConfigureImpl.f3044g);
                    }
                    if (UMConfigureImpl.f3043f != null) {
                        UMConfigureImpl.f3043f.shutdown();
                        ScheduledExecutorService unused2 = UMConfigureImpl.f3043f = null;
                    }
                }
                UMConfigureImpl.m2727f();
            } catch (Exception unused3) {
            }
        }
    };

    public static synchronized void registerInterruptFlag() {
        try {
            f3040c++;
        } catch (Exception unused) {
        }
    }

    public static synchronized void registerMessageSendListener(onMessageSendListener onmessagesendlistener) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        try {
            CopyOnWriteArrayList copyOnWriteArrayList2 = f3039b;
            if (copyOnWriteArrayList2 != null) {
                copyOnWriteArrayList2.add(onmessagesendlistener);
            }
            if (UMEnvelopeBuild.getTransmissionSendFlag() && (copyOnWriteArrayList = f3039b) != null && copyOnWriteArrayList.size() > 0) {
                Iterator it = f3039b.iterator();
                while (it.hasNext()) {
                    ((onMessageSendListener) it.next()).onMessageSend();
                }
            }
        } catch (Exception unused) {
        }
    }

    public static synchronized void removeInterruptFlag() {
        try {
            f3040c--;
        } catch (Exception unused) {
        }
    }

    public static synchronized void removeMessageSendListener(onMessageSendListener onmessagesendlistener) {
        try {
            CopyOnWriteArrayList copyOnWriteArrayList = f3039b;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(onmessagesendlistener);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m2727f() {
        int i = f3045h;
        f3045h = i + 1;
        return i;
    }

    public static void init(Context context) {
        if (context == null) {
            return;
        }
        f3044g = context;
        try {
            if (f3040c >= 1) {
                if (!m2725d(context)) {
                    UMEnvelopeBuild.setTransmissionSendFlag(false);
                    m2722c(context);
                    if (f3043f == null) {
                        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
                        f3043f = scheduledExecutorServiceNewScheduledThreadPool;
                        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(f3046i, 0L, 100L, TimeUnit.MILLISECONDS);
                        return;
                    }
                    return;
                }
                UMEnvelopeBuild.setTransmissionSendFlag(true);
                return;
            }
            UMEnvelopeBuild.setTransmissionSendFlag(true);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m2721b(Context context) {
        try {
            UMEnvelopeBuild.setTransmissionSendFlag(true);
            CopyOnWriteArrayList copyOnWriteArrayList = f3039b;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                Iterator it = f3039b.iterator();
                while (it.hasNext()) {
                    ((onMessageSendListener) it.next()).onMessageSend();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2722c(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f3038a, 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean(f3038a, true);
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2725d(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f3038a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getBoolean(f3038a, false);
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
