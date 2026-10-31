package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.content.IntentFilter;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.am;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.File;
import java.util.LinkedList;

/* JADX INFO: compiled from: G47B */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public static final int a = 273;
    public static Context b = null;
    public static HandlerThread c = null;
    public static Handler d = null;
    public static final int f = 274;
    public static final int g = 275;
    public static final int h = 512;
    public static a i;
    public static IntentFilter j;
    public static volatile boolean k;
    public static Object e = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static LinkedList f77950l = new LinkedList();

    public static void q() {
    }

    public static void a(boolean z) {
        k = z;
        if (z) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>网络可用： 触发2号数据仓信封消费动作。");
            b(274);
        } else {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>网络断连： 2号数据仓");
        }
    }

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
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
            b.a(274);
        }
    }

    public static boolean a() {
        synchronized (e) {
            return i != null;
        }
    }

    public b(Context context) {
        synchronized (e) {
            if (context != null) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    b = applicationContext;
                    if (applicationContext != null && c == null) {
                        HandlerThread handlerThread = new HandlerThread("SL-NetWorkSender");
                        c = handlerThread;
                        handlerThread.start();
                        if (i == null) {
                            String str = b.getFilesDir() + File.separator + com.umeng.commonsdk.stateless.a.f;
                            File file = new File(str);
                            if (!file.exists()) {
                                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓目录不存在，创建之。");
                                file.mkdir();
                            }
                            a aVar = new a(str);
                            i = aVar;
                            aVar.startWatching();
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓File Monitor启动.");
                        }
                        if (d == null) {
                            d = new Handler(c.getLooper()) { // from class: com.umeng.commonsdk.stateless.b.1
                                @Override // android.os.Handler
                                public void handleMessage(Message message) {
                                    int i2 = message.what;
                                    if (i2 != 512) {
                                        switch (i2) {
                                            case 273:
                                                b.l();
                                                return;
                                            case 274:
                                                b.n();
                                                return;
                                            case b.g /* 275 */:
                                                b.p();
                                                break;
                                            default:
                                                return;
                                        }
                                    }
                                    b.q();
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

    public static void a(int i2) {
        Handler handler;
        if (!k || (handler = d) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i2;
        d.sendMessage(messageObtainMessage);
    }

    public static void b(int i2) {
        Handler handler;
        try {
            if (!k || (handler = d) == null || handler.hasMessages(i2)) {
                return;
            }
            Message messageObtainMessage = d.obtainMessage();
            messageObtainMessage.what = i2;
            d.sendMessage(messageObtainMessage);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(b, th);
        }
    }

    public static void i() {
        File[] fileArrC = d.c(b);
        if (fileArrC != null) {
            if (f77950l.size() > 0) {
                f77950l.clear();
            }
            for (File file : fileArrC) {
                f77950l.add(file.getAbsolutePath());
            }
        }
    }

    public static String j() {
        try {
            String str = (String) f77950l.peek();
            if (str == null) {
                return str;
            }
            try {
                f77950l.removeFirst();
                return str;
            } catch (Throwable unused) {
                return str;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void k() {
        String str;
        byte[] bArrA;
        if (f77950l.size() <= 0) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> todoList无内容，无需处理。");
            return;
        }
        do {
            str = (String) f77950l.pollFirst();
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (!file.exists()) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 信封文件不存在，处理下一个文件。");
                } else {
                    c cVar = new c(b);
                    try {
                        bArrA = d.a(str);
                    } catch (Exception unused) {
                        bArrA = null;
                    }
                    String name = file.getName();
                    String strSubstring = !TextUtils.isEmpty(name) ? name.substring(0, 1) : am.aH;
                    String strC = d.c(d.d(name));
                    if (cVar.a(bArrA, strC, com.umeng.commonsdk.vchannel.a.c.equalsIgnoreCase(strC) ? com.umeng.commonsdk.vchannel.a.a : "", strSubstring) && !file.delete()) {
                        file.delete();
                    }
                }
            }
        } while (str != null);
        f77950l.clear();
    }

    public static void l() {
        File fileA;
        byte[] bArrA;
        if (!k || b == null) {
            return;
        }
        do {
            try {
                fileA = d.a(b);
                if (fileA != null && fileA.getParentFile() != null && !TextUtils.isEmpty(fileA.getParentFile().getName())) {
                    c cVar = new c(b);
                    String str = new String(Base64.decode(fileA.getParentFile().getName(), 0));
                    if (com.umeng.commonsdk.internal.a.a.equalsIgnoreCase(str) || com.umeng.commonsdk.internal.a.b.equalsIgnoreCase(str) || com.umeng.commonsdk.internal.a.G.equalsIgnoreCase(str)) {
                        new File(fileA.getAbsolutePath()).delete();
                    } else {
                        ULog.i("walle", "[stateless] handleProcessNext, pathUrl is " + str);
                        try {
                            bArrA = d.a(fileA.getAbsolutePath());
                        } catch (Exception unused) {
                            bArrA = null;
                        }
                        String str2 = com.umeng.commonsdk.vchannel.a.c.equalsIgnoreCase(str) ? com.umeng.commonsdk.vchannel.a.a : "";
                        String str3 = am.aH;
                        if (UMServerURL.PATH_SHARE.equalsIgnoreCase(str)) {
                            str3 = am.aB;
                        }
                        if (UMServerURL.PATH_PUSH_LAUNCH.equalsIgnoreCase(str) || UMServerURL.PATH_PUSH_REGIST.equalsIgnoreCase(str) || UMServerURL.PATH_PUSH_LOG.equalsIgnoreCase(str)) {
                            str3 = am.ax;
                        }
                        if (cVar.a(bArrA, str, str2, str3)) {
                            ULog.i("walle", "[stateless] Send envelope file success, delete it.");
                            File file = new File(fileA.getAbsolutePath());
                            if (!file.delete()) {
                                ULog.i("walle", "[stateless] Failed to delete already processed file. We try again after delete failed.");
                                file.delete();
                            }
                        } else {
                            ULog.i("walle", "[stateless] Send envelope file failed, abandon and wait next trigger!");
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(b, th);
            }
        } while (fileA != null);
        m();
    }

    public static void m() {
        try {
            File file = new File(b.getFilesDir() + File.separator + com.umeng.commonsdk.stateless.a.e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 2号数据仓：删除stateless目录。");
                d.a(file);
            }
        } catch (Throwable unused) {
        }
    }

    public static void n() {
        if (!k || b == null) {
            return;
        }
        i();
        k();
        c();
    }

    public static void o() {
        try {
            File file = new File(b.getFilesDir() + File.separator + com.umeng.commonsdk.stateless.a.e);
            if (file.exists() && file.isDirectory()) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>2号数据仓：检测到stateless目录。");
                b(273);
            }
        } catch (Throwable unused) {
        }
    }

    public static void p() {
        o();
    }

    public static void b() {
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>信封构建成功： 触发2号数据仓信封消费动作。");
        b(274);
    }

    public static void c() {
        b(g);
    }

    public static void d() {
        b(512);
    }
}
