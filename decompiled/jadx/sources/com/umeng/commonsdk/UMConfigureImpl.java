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
    public static String a = "delayed_transmission_flag_new";
    public static final int e = 1000;
    public static ScheduledExecutorService f;
    public static Context g;
    public static CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public static int c = 0;
    public static boolean d = false;
    public static int h = 0;
    public static Runnable i = new Runnable() { // from class: com.umeng.commonsdk.UMConfigureImpl.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (UMConfigureImpl.c == 0 || UMConfigureImpl.h >= 10) {
                    if (!UMConfigureImpl.d) {
                        boolean unused = UMConfigureImpl.d = true;
                        UMConfigureImpl.b(UMConfigureImpl.g);
                    }
                    if (UMConfigureImpl.f != null) {
                        UMConfigureImpl.f.shutdown();
                        ScheduledExecutorService unused2 = UMConfigureImpl.f = null;
                    }
                }
                UMConfigureImpl.f();
            } catch (Exception unused3) {
            }
        }
    };

    public static synchronized void registerInterruptFlag() {
        try {
            c++;
        } catch (Exception unused) {
        }
    }

    public static synchronized void registerMessageSendListener(onMessageSendListener onmessagesendlistener) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        try {
            CopyOnWriteArrayList copyOnWriteArrayList2 = b;
            if (copyOnWriteArrayList2 != null) {
                copyOnWriteArrayList2.add(onmessagesendlistener);
            }
            if (UMEnvelopeBuild.getTransmissionSendFlag() && (copyOnWriteArrayList = b) != null && copyOnWriteArrayList.size() > 0) {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    ((onMessageSendListener) it.next()).onMessageSend();
                }
            }
        } catch (Exception unused) {
        }
    }

    public static synchronized void removeInterruptFlag() {
        try {
            c--;
        } catch (Exception unused) {
        }
    }

    public static synchronized void removeMessageSendListener(onMessageSendListener onmessagesendlistener) {
        try {
            CopyOnWriteArrayList copyOnWriteArrayList = b;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(onmessagesendlistener);
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ int f() {
        int i2 = h;
        h = i2 + 1;
        return i2;
    }

    public static void init(Context context) {
        if (context == null) {
            return;
        }
        g = context;
        try {
            if (c >= 1) {
                if (!d(context)) {
                    UMEnvelopeBuild.setTransmissionSendFlag(false);
                    c(context);
                    if (f == null) {
                        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
                        f = scheduledExecutorServiceNewScheduledThreadPool;
                        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(i, 0L, 100L, TimeUnit.MILLISECONDS);
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

    public static synchronized void b(Context context) {
        try {
            UMEnvelopeBuild.setTransmissionSendFlag(true);
            CopyOnWriteArrayList copyOnWriteArrayList = b;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    ((onMessageSendListener) it.next()).onMessageSend();
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void c(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(a, 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean(a, true);
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean d(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getBoolean(a, false);
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
