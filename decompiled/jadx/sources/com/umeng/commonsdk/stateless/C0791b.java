package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.content.IntentFilter;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.C0655am;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.C0771a;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.vchannel.C0833a;
import java.io.File;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.umeng.commonsdk.stateless.b */
/* JADX INFO: compiled from: G47B */
/* JADX INFO: loaded from: classes.dex */
public class C0791b {

    /* JADX INFO: renamed from: a */
    public static final int f3319a = 273;

    /* JADX INFO: renamed from: b */
    public static Context f3320b = null;

    /* JADX INFO: renamed from: c */
    public static HandlerThread f3321c = null;

    /* JADX INFO: renamed from: d */
    public static Handler f3322d = null;

    /* JADX INFO: renamed from: f */
    public static final int f3324f = 274;

    /* JADX INFO: renamed from: g */
    public static final int f3325g = 275;

    /* JADX INFO: renamed from: h */
    public static final int f3326h = 512;

    /* JADX INFO: renamed from: i */
    public static a f3327i;

    /* JADX INFO: renamed from: j */
    public static IntentFilter f3328j;

    /* JADX INFO: renamed from: k */
    public static volatile boolean f3329k;

    /* JADX INFO: renamed from: e */
    public static Object f3323e = new Object();

    /* JADX INFO: renamed from: l */
    public static LinkedList f3330l = new LinkedList();

    /* JADX INFO: renamed from: q */
    public static void m2896q() {
    }

    /* JADX INFO: renamed from: a */
    public static void m2878a(boolean z) {
        f3329k = z;
        if (z) {
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>>网络可用： 触发2号数据仓信封消费动作。");
            m2881b(274);
        } else {
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>>网络断连： 2号数据仓");
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.stateless.b$a */
    /* JADX INFO: compiled from: G47B */
    public class a extends FileObserver {
        public a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            if ((i & 8) != 8) {
                return;
            }
            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
            C0791b.m2877a(274);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2879a() {
        synchronized (f3323e) {
            return f3327i != null;
        }
    }

    public C0791b(Context context) {
        synchronized (f3323e) {
            if (context != null) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    f3320b = applicationContext;
                    if (applicationContext != null && f3321c == null) {
                        HandlerThread handlerThread = new HandlerThread("SL-NetWorkSender");
                        f3321c = handlerThread;
                        handlerThread.start();
                        if (f3327i == null) {
                            String str = f3320b.getFilesDir() + File.separator + C0790a.f3313f;
                            File file = new File(str);
                            if (!file.exists()) {
                                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓目录不存在，创建之。");
                                file.mkdir();
                            }
                            a aVar = new a(str);
                            f3327i = aVar;
                            aVar.startWatching();
                            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓File Monitor启动.");
                        }
                        if (f3322d == null) {
                            f3322d = new Handler(f3321c.getLooper()) { // from class: com.umeng.commonsdk.stateless.b.1
                                @Override // android.os.Handler
                                public void handleMessage(Message message) {
                                    int i = message.what;
                                    if (i != 512) {
                                        switch (i) {
                                            case 273:
                                                C0791b.m2891l();
                                                return;
                                            case 274:
                                                C0791b.m2893n();
                                                return;
                                            case C0791b.f3325g /* 275 */:
                                                C0791b.m2895p();
                                                break;
                                            default:
                                                return;
                                        }
                                    }
                                    C0791b.m2896q();
                                }
                            };
                        }
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2877a(int i) {
        Handler handler;
        if (!f3329k || (handler = f3322d) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i;
        f3322d.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: b */
    public static void m2881b(int i) {
        Handler handler;
        try {
            if (!f3329k || (handler = f3322d) == null || handler.hasMessages(i)) {
                return;
            }
            Message messageObtainMessage = f3322d.obtainMessage();
            messageObtainMessage.what = i;
            f3322d.sendMessage(messageObtainMessage);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f3320b, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m2888i() {
        File[] fileArrM2916c = C0793d.m2916c(f3320b);
        if (fileArrM2916c != null) {
            if (f3330l.size() > 0) {
                f3330l.clear();
            }
            for (File file : fileArrM2916c) {
                f3330l.add(file.getAbsolutePath());
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m2889j() {
        try {
            String str = (String) f3330l.peek();
            if (str == null) {
                return str;
            }
            try {
                f3330l.removeFirst();
                return str;
            } catch (Throwable unused) {
                return str;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m2890k() {
        String str;
        byte[] bArrM2907a;
        if (f3330l.size() <= 0) {
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> todoList无内容，无需处理。");
            return;
        }
        do {
            str = (String) f3330l.pollFirst();
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (!file.exists()) {
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 信封文件不存在，处理下一个文件。");
                } else {
                    C0792c c0792c = new C0792c(f3320b);
                    try {
                        bArrM2907a = C0793d.m2907a(str);
                    } catch (Exception unused) {
                        bArrM2907a = null;
                    }
                    String name = file.getName();
                    String strSubstring = !TextUtils.isEmpty(name) ? name.substring(0, 1) : C0655am.f2280aH;
                    String strM2914c = C0793d.m2914c(C0793d.m2917d(name));
                    if (c0792c.m2899a(bArrM2907a, strM2914c, C0833a.f3658c.equalsIgnoreCase(strM2914c) ? C0833a.f3656a : "", strSubstring) && !file.delete()) {
                        file.delete();
                    }
                }
            }
        } while (str != null);
        f3330l.clear();
    }

    /* JADX INFO: renamed from: l */
    public static void m2891l() {
        File fileM2901a;
        byte[] bArrM2907a;
        if (!f3329k || f3320b == null) {
            return;
        }
        do {
            try {
                fileM2901a = C0793d.m2901a(f3320b);
                if (fileM2901a != null && fileM2901a.getParentFile() != null && !TextUtils.isEmpty(fileM2901a.getParentFile().getName())) {
                    C0792c c0792c = new C0792c(f3320b);
                    String str = new String(Base64.decode(fileM2901a.getParentFile().getName(), 0));
                    if (C0771a.f3216a.equalsIgnoreCase(str) || C0771a.f3217b.equalsIgnoreCase(str) || C0771a.f3210G.equalsIgnoreCase(str)) {
                        new File(fileM2901a.getAbsolutePath()).delete();
                    } else {
                        ULog.m2986i("walle", "[stateless] handleProcessNext, pathUrl is " + str);
                        try {
                            bArrM2907a = C0793d.m2907a(fileM2901a.getAbsolutePath());
                        } catch (Exception unused) {
                            bArrM2907a = null;
                        }
                        String str2 = C0833a.f3658c.equalsIgnoreCase(str) ? C0833a.f3656a : "";
                        String str3 = C0655am.f2280aH;
                        if (UMServerURL.PATH_SHARE.equalsIgnoreCase(str)) {
                            str3 = C0655am.f2274aB;
                        }
                        if (UMServerURL.PATH_PUSH_LAUNCH.equalsIgnoreCase(str) || UMServerURL.PATH_PUSH_REGIST.equalsIgnoreCase(str) || UMServerURL.PATH_PUSH_LOG.equalsIgnoreCase(str)) {
                            str3 = C0655am.f2322ax;
                        }
                        if (c0792c.m2899a(bArrM2907a, str, str2, str3)) {
                            ULog.m2986i("walle", "[stateless] Send envelope file success, delete it.");
                            File file = new File(fileM2901a.getAbsolutePath());
                            if (!file.delete()) {
                                ULog.m2986i("walle", "[stateless] Failed to delete already processed file. We try again after delete failed.");
                                file.delete();
                            }
                        } else {
                            ULog.m2986i("walle", "[stateless] Send envelope file failed, abandon and wait next trigger!");
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(f3320b, th);
            }
        } while (fileM2901a != null);
        m2892m();
    }

    /* JADX INFO: renamed from: m */
    public static void m2892m() {
        try {
            File file = new File(f3320b.getFilesDir() + File.separator + C0790a.f3312e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓：删除stateless目录。");
                C0793d.m2906a(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m2893n() {
        if (!f3329k || f3320b == null) {
            return;
        }
        m2888i();
        m2890k();
        m2882c();
    }

    /* JADX INFO: renamed from: o */
    public static void m2894o() {
        try {
            File file = new File(f3320b.getFilesDir() + File.separator + C0790a.f3312e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>>2号数据仓：检测到stateless目录。");
                m2881b(273);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m2895p() {
        m2894o();
    }

    /* JADX INFO: renamed from: b */
    public static void m2880b() {
        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>>信封构建成功： 触发2号数据仓信封消费动作。");
        m2881b(274);
    }

    /* JADX INFO: renamed from: c */
    public static void m2882c() {
        m2881b(f3325g);
    }

    /* JADX INFO: renamed from: d */
    public static void m2883d() {
        m2881b(512);
    }
}
