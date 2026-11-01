package com.umeng.commonsdk.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.C0771a;
import com.umeng.commonsdk.internal.C0772b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.C0796c;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p067l.EnumC4453;

/* JADX INFO: renamed from: com.umeng.commonsdk.framework.a */
/* JADX INFO: compiled from: 747B */
/* JADX INFO: loaded from: classes.dex */
public class C0770a implements UMImprintChangeCallback {

    /* JADX INFO: renamed from: a */
    public static HandlerThread f3179a = null;

    /* JADX INFO: renamed from: b */
    public static Handler f3180b = null;

    /* JADX INFO: renamed from: c */
    public static Handler f3181c = null;

    /* JADX INFO: renamed from: d */
    public static final int f3182d = 200;

    /* JADX INFO: renamed from: e */
    public static final int f3183e = 273;

    /* JADX INFO: renamed from: f */
    public static final int f3184f = 274;

    /* JADX INFO: renamed from: g */
    public static final int f3185g = 512;

    /* JADX INFO: renamed from: h */
    public static final int f3186h = 769;

    /* JADX INFO: renamed from: i */
    public static a f3187i = null;

    /* JADX INFO: renamed from: j */
    public static ConnectivityManager f3188j = null;

    /* JADX INFO: renamed from: k */
    public static IntentFilter f3189k = null;

    /* JADX INFO: renamed from: l */
    public static volatile boolean f3190l = false;

    /* JADX INFO: renamed from: m */
    public static ArrayList f3191m = null;

    /* JADX INFO: renamed from: p */
    public static final String f3194p = "report_policy";

    /* JADX INFO: renamed from: q */
    public static final String f3195q = "report_interval";

    /* JADX INFO: renamed from: s */
    public static final int f3197s = 15;

    /* JADX INFO: renamed from: t */
    public static final int f3198t = 3;

    /* JADX INFO: renamed from: u */
    public static final int f3199u = 90;

    /* JADX INFO: renamed from: x */
    public static BroadcastReceiver f3202x;

    /* JADX INFO: renamed from: n */
    public static Object f3192n = new Object();

    /* JADX INFO: renamed from: o */
    public static ReentrantLock f3193o = new ReentrantLock();

    /* JADX INFO: renamed from: r */
    public static boolean f3196r = false;

    /* JADX INFO: renamed from: v */
    public static int f3200v = 15;

    /* JADX INFO: renamed from: w */
    public static Object f3201w = new Object();

    /* JADX INFO: renamed from: c */
    public static void m2777c() {
    }

    /* JADX INFO: renamed from: m */
    public static void m2788m() {
    }

    static {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            f3188j = (ConnectivityManager) appContext.getSystemService("connectivity");
        }
        f3202x = new BroadcastReceiver() { // from class: com.umeng.commonsdk.framework.a.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    UMWorkDispatch.sendEvent(context, C0771a.f3208E, C0772b.m2790a(context).m2791a(), null);
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m2770a(Context context) {
        if (f3188j != null || context == null) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        f3188j = connectivityManager;
        if (connectivityManager != null) {
            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> createCMIfNeeded:注册网络状态监听器。");
            m2776b(context);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2771a(UMSenderStateNotify uMSenderStateNotify) {
        synchronized (f3192n) {
            try {
                if (f3191m == null) {
                    f3191m = new ArrayList();
                }
                if (uMSenderStateNotify != null) {
                    for (int i = 0; i < f3191m.size(); i++) {
                        if (uMSenderStateNotify == f3191m.get(i)) {
                            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> addConnStateObserver: input item has exist.");
                            return;
                        }
                    }
                    f3191m.add(uMSenderStateNotify);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2773a() {
        boolean z;
        synchronized (f3201w) {
            z = f3196r;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public static int m2774b() {
        int i;
        synchronized (f3201w) {
            i = f3200v;
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    private void m2785j() {
        synchronized (f3201w) {
            if ("11".equals(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f3194p, ""))) {
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                f3196r = true;
                f3200v = 15;
                int iIntValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(UMModuleRegister.getAppContext(), f3195q, "15")).intValue();
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> set report_interval value to: " + iIntValue);
                if (iIntValue < 3 || iIntValue > 90) {
                    f3200v = 15;
                } else {
                    f3200v = iIntValue * 1000;
                }
            } else {
                f3196r = false;
            }
        }
    }

    @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
    public void onImprintValueChanged(String str, String str2) {
        synchronized (f3201w) {
            if (f3194p.equals(str)) {
                if ("11".equals(str2)) {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> switch to report_policy 11");
                    f3196r = true;
                } else {
                    f3196r = false;
                }
            }
            if (f3195q.equals(str)) {
                int iIntValue = Integer.valueOf(str2).intValue();
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> set report_interval value to: " + iIntValue);
                if (iIntValue < 3 || iIntValue > 90) {
                    f3200v = 15000;
                } else {
                    f3200v = iIntValue * 1000;
                }
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> really set report_interval value to: " + f3200v);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2776b(Context context) {
        if (DeviceConfig.checkPermission(context, "android.permission.ACCESS_NETWORK_STATE") && f3188j != null && f3189k == null) {
            IntentFilter intentFilter = new IntentFilter();
            f3189k = intentFilter;
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            if (f3202x != null) {
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> 注册网络状态监听器。");
                context.registerReceiver(f3202x, f3189k);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2772a(boolean z) {
        int size;
        f3190l = z;
        if (z) {
            synchronized (f3192n) {
                ArrayList arrayList = f3191m;
                if (arrayList != null && (size = arrayList.size()) > 0) {
                    for (int i = 0; i < size; i++) {
                        ((UMSenderStateNotify) f3191m.get(i)).onConnectionAvailable();
                    }
                }
            }
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "网络状态通知：尝试发送 MSG_PROCESS_NEXT");
            m2779d();
            return;
        }
        ULog.m2983i("--->>> network disconnected.");
        f3190l = false;
    }

    public C0770a(Context context, Handler handler) {
        if (f3188j == null) {
            Context appContext = UMGlobalContext.getAppContext();
            if (f3188j != null) {
                f3188j = (ConnectivityManager) appContext.getSystemService("connectivity");
            }
        }
        f3181c = handler;
        try {
            if (f3179a == null) {
                HandlerThread handlerThread = new HandlerThread("NetWorkSender");
                f3179a = handlerThread;
                handlerThread.start();
                if (f3187i == null) {
                    a aVar = new a(UMFrUtils.getEnvelopeDirPath(context));
                    f3187i = aVar;
                    aVar.startWatching();
                    ULog.m2971d("--->>> FileMonitor has already started!");
                }
                m2785j();
                if (f3180b == null) {
                    f3180b = new Handler(f3179a.getLooper()) { // from class: com.umeng.commonsdk.framework.a.2
                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            int i = message.what;
                            if (i == 273) {
                                ULog.m2971d("--->>> handleMessage: recv MSG_PROCESS_NEXT msg.");
                                try {
                                    C0770a.f3193o.tryLock(1L, TimeUnit.SECONDS);
                                    try {
                                        C0770a.m2789n();
                                    } catch (Throwable unused) {
                                    }
                                    C0770a.f3193o.unlock();
                                    return;
                                } catch (Throwable unused2) {
                                    return;
                                }
                            }
                            if (i == 274) {
                                C0770a.m2787l();
                            } else {
                                if (i != 512) {
                                    return;
                                }
                                C0770a.m2788m();
                            }
                        }
                    };
                }
                ImprintHandler.getImprintService(context).registImprintCallback(f3194p, this);
                ImprintHandler.getImprintService(context).registImprintCallback(f3195q, this);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m2786k() {
        if (f3179a != null) {
            f3179a = null;
        }
        if (f3180b != null) {
            f3180b = null;
        }
        if (f3181c != null) {
            f3181c = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m2787l() {
        int size;
        synchronized (f3192n) {
            ArrayList arrayList = f3191m;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                for (int i = 0; i < size; i++) {
                    ((UMSenderStateNotify) f3191m.get(i)).onSenderIdle();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2775b(int i) {
        Handler handler;
        if (!f3190l || (handler = f3180b) == null || handler.hasMessages(i)) {
            return;
        }
        Message messageObtainMessage = f3180b.obtainMessage();
        messageObtainMessage.what = i;
        f3180b.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: c */
    public static void m2778c(int i) {
        Handler handler;
        if (!f3190l || (handler = f3180b) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i;
        f3180b.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: a */
    public static void m2769a(int i, long j) {
        Handler handler;
        if (!f3190l || (handler = f3180b) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i;
        UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> sendMsgDelayed: " + j);
        f3180b.sendMessageDelayed(messageObtainMessage, j);
    }

    /* JADX INFO: renamed from: d */
    public static void m2779d() {
        if (f3193o.tryLock()) {
            try {
                m2775b(273);
            } finally {
                f3193o.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2768a(int i, int i2) {
        Handler handler;
        if (!f3190l || (handler = f3180b) == null) {
            return;
        }
        handler.removeMessages(i);
        Message messageObtainMessage = f3180b.obtainMessage();
        messageObtainMessage.what = i;
        f3180b.sendMessageDelayed(messageObtainMessage, i2);
    }

    /* JADX INFO: renamed from: e */
    public static void m2780e() {
        m2768a(274, EnumC4453.f9987);
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.framework.a$a */
    /* JADX INFO: compiled from: 747B */
    public class a extends FileObserver {
        public a(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            if ((i & 8) != 8) {
                return;
            }
            ULog.m2971d("--->>> envelope file created >>> " + str);
            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> envelope file created >>> " + str);
            C0770a.m2778c(273);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m2789n() {
        ULog.m2971d("--->>> handleProcessNext: Enter...");
        if (f3190l) {
            Context appContext = UMModuleRegister.getAppContext();
            try {
                if (UMFrUtils.envelopeFileNumber(appContext) > 0) {
                    ULog.m2971d("--->>> The envelope file exists.");
                    if (UMFrUtils.envelopeFileNumber(appContext) > 200) {
                        ULog.m2971d("--->>> Number of envelope files is greater than 200, remove old files first.");
                        UMFrUtils.removeRedundantEnvelopeFiles(appContext, 200);
                    }
                    File envelopeFile = UMFrUtils.getEnvelopeFile(appContext);
                    if (envelopeFile != null) {
                        String path = envelopeFile.getPath();
                        ULog.m2971d("--->>> Ready to send envelope file [" + path + "].");
                        UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> send envelope file [ " + path + "].");
                        if (new C0796c(appContext).m2940a(envelopeFile)) {
                            ULog.m2971d("--->>> Send envelope file success, delete it.");
                            if (!UMFrUtils.removeEnvelopeFile(envelopeFile)) {
                                ULog.m2971d("--->>> Failed to delete already processed file. We try again after delete failed.");
                                UMFrUtils.removeEnvelopeFile(envelopeFile);
                            }
                            m2778c(273);
                            return;
                        }
                        ULog.m2971d("--->>> Send envelope file failed, abandon and wait next trigger!");
                        return;
                    }
                }
                m2780e();
            } catch (Throwable th) {
                UMCrashManager.reportCrash(appContext, th);
            }
        }
    }
}
