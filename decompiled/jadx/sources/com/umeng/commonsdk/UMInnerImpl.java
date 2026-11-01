package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.internal.C0775d;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.utils.C0778c;
import com.umeng.commonsdk.internal.utils.C0786k;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.C0832d;

/* JADX INFO: loaded from: classes.dex */
public class UMInnerImpl {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static boolean isInternal;

    public static synchronized void initAndSendInternal(final Context context) {
        if (context != null) {
            try {
                if (!isInternal) {
                    new Thread(new Runnable() { // from class: com.umeng.commonsdk.UMInnerImpl.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                                String packageName = context.getPackageName();
                                if (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName) || !currentProcessName.equals(packageName)) {
                                    return;
                                }
                                try {
                                    if (FieldManager.allow(C0832d.f3628ao) && !C0778c.m2847a(context).m2849a()) {
                                        C0778c.m2847a(context).m2850b();
                                    }
                                } catch (Throwable th) {
                                    ULog.m2980e(UMModuleRegister.INNER, "e is " + th);
                                }
                                try {
                                    C0786k.m2872b(context);
                                } catch (Throwable th2) {
                                    ULog.m2980e(UMModuleRegister.INNER, "e is " + th2);
                                }
                            } catch (Throwable th3) {
                                UMCrashManager.reportCrash(context, th3);
                            }
                        }
                    }).start();
                    isInternal = true;
                    sendInternal(context);
                }
            } catch (Throwable th) {
                ULog.m2980e(UMModuleRegister.INNER, "e is " + th.getMessage());
                UMCrashManager.reportCrash(context, th);
            }
        }
    }

    public static synchronized void sendInternal(final Context context) {
        if (context != null) {
            try {
                new Thread(new Runnable() { // from class: com.umeng.commonsdk.UMInnerImpl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                            String packageName = context.getPackageName();
                            if (TextUtils.isEmpty(currentProcessName) || TextUtils.isEmpty(packageName) || !currentProcessName.equals(packageName)) {
                                return;
                            }
                            try {
                                C0775d.m2816b(context);
                            } catch (Throwable th) {
                                ULog.m2980e(UMModuleRegister.INNER, "e is " + th);
                            }
                        } catch (Throwable th2) {
                            UMCrashManager.reportCrash(context, th2);
                        }
                    }
                }).start();
                isInternal = true;
            } catch (Throwable th) {
                ULog.m2980e(UMModuleRegister.INNER, "e is " + th.getMessage());
                UMCrashManager.reportCrash(context, th);
            }
        }
    }
}
