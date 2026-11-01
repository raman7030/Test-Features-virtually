package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.C0667ay;
import com.umeng.analytics.pro.C0683bn;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C0771a;
import com.umeng.commonsdk.internal.C0772b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.stateless.C0793d;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.idtracking.C0806e;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.C0814a;
import com.umeng.commonsdk.statistics.internal.C0816c;
import com.umeng.commonsdk.statistics.internal.InterfaceC0817d;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.statistics.proto.Response;
import com.umeng.commonsdk.utils.C0831c;
import java.io.File;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.c */
/* JADX INFO: compiled from: Y45E */
/* JADX INFO: loaded from: classes.dex */
public class C0796c {

    /* JADX INFO: renamed from: b */
    public static final int f3354b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f3355c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f3356d = 3;

    /* JADX INFO: renamed from: o */
    public static final String f3357o = "thtstart";

    /* JADX INFO: renamed from: p */
    public static final String f3358p = "gkvc";

    /* JADX INFO: renamed from: q */
    public static final String f3359q = "ekvc";

    /* JADX INFO: renamed from: a */
    public String f3360a;

    /* JADX INFO: renamed from: f */
    public C0816c f3362f;

    /* JADX INFO: renamed from: g */
    public ImprintHandler f3363g;

    /* JADX INFO: renamed from: h */
    public C0806e f3364h;

    /* JADX INFO: renamed from: i */
    public ImprintHandler.C0801a f3365i;

    /* JADX INFO: renamed from: k */
    public Defcon f3367k;

    /* JADX INFO: renamed from: l */
    public long f3368l;

    /* JADX INFO: renamed from: m */
    public int f3369m;

    /* JADX INFO: renamed from: n */
    public int f3370n;

    /* JADX INFO: renamed from: r */
    public Context f3371r;

    /* JADX INFO: renamed from: e */
    public final int f3361e = 1;

    /* JADX INFO: renamed from: j */
    public ABTest f3366j = null;

    public C0796c(Context context) {
        this.f3364h = null;
        this.f3365i = null;
        this.f3367k = null;
        this.f3368l = 0L;
        this.f3369m = 0;
        this.f3370n = 0;
        this.f3360a = null;
        this.f3371r = context;
        this.f3365i = ImprintHandler.getImprintService(context).m3050c();
        this.f3367k = Defcon.getService(this.f3371r);
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.f3371r);
        this.f3368l = sharedPreferences.getLong("thtstart", 0L);
        this.f3369m = sharedPreferences.getInt("gkvc", 0);
        this.f3370n = sharedPreferences.getInt("ekvc", 0);
        this.f3360a = UMEnvelopeBuild.imprintProperty(this.f3371r, "track_list", null);
        ImprintHandler imprintService = ImprintHandler.getImprintService(this.f3371r);
        this.f3363g = imprintService;
        imprintService.m3044a(new InterfaceC0817d() { // from class: com.umeng.commonsdk.statistics.c.1
            @Override // com.umeng.commonsdk.statistics.internal.InterfaceC0817d
            public void onImprintChanged(ImprintHandler.C0801a c0801a) {
                C0796c.this.f3367k.onImprintChanged(c0801a);
                C0796c c0796c = C0796c.this;
                c0796c.f3360a = UMEnvelopeBuild.imprintProperty(c0796c.f3371r, "track_list", null);
            }
        });
        if (!UMConfigure.needSendZcfgEnv(this.f3371r)) {
            this.f3364h = C0806e.m3067a(this.f3371r);
        }
        C0816c c0816c = new C0816c(this.f3371r);
        this.f3362f = c0816c;
        c0816c.m3104a(StatTracer.getInstance(this.f3371r));
    }

    /* JADX INFO: renamed from: a */
    public boolean m2940a(File file) {
        String strM2914c;
        if (file == null) {
            return false;
        }
        try {
            byte[] byteArray = UMFrUtils.toByteArray(file.getPath());
            if (byteArray == null) {
                return false;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name)) {
                return false;
            }
            C0814a c0814aM3088a = C0814a.m3088a(this.f3371r);
            c0814aM3088a.m3097e(name);
            boolean zM3092a = c0814aM3088a.m3092a(name);
            boolean zM3094b = c0814aM3088a.m3094b(name);
            boolean zM3095c = c0814aM3088a.m3095c(name);
            boolean zM3096d = c0814aM3088a.m3096d(name);
            String strM2917d = C0793d.m2917d(name);
            if (!TextUtils.isEmpty(strM2917d)) {
                strM2914c = C0793d.m2914c(strM2917d);
            } else if (zM3096d) {
                strM2914c = UMServerURL.SILENT_HEART_BEAT;
            } else if (zM3095c) {
                strM2914c = UMServerURL.ZCFG_PATH;
            } else {
                strM2914c = UMServerURL.PATH_ANALYTICS;
            }
            byte[] bArrM3106a = this.f3362f.m3106a(byteArray, zM3092a, zM3095c, strM2914c);
            int iM2937a = bArrM3106a == null ? 1 : m2937a(bArrM3106a);
            if (UMConfigure.isDebugLog()) {
                if (zM3096d && iM2937a == 2) {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "heart beat req: succeed.");
                } else if (zM3095c && iM2937a == 2) {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "Zero req: succeed.");
                } else if (zM3094b && iM2937a == 2) {
                    MLog.m2941d("本次启动数据: 发送成功!");
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "Send instant data: succeed.");
                } else if (zM3092a && iM2937a == 2) {
                    MLog.m2941d("普通统计数据: 发送成功!");
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "Send analytics data: succeed.");
                } else if (iM2937a == 2) {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "Inner req: succeed.");
                }
            }
            if (iM2937a == 2) {
                C0806e c0806e = this.f3364h;
                if (c0806e != null) {
                    c0806e.m3078e();
                }
                StatTracer.getInstance(this.f3371r).saveSate();
                if (zM3096d) {
                    String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f3371r, C0831c.f3581f, "");
                    if (!TextUtils.isEmpty(strImprintProperty)) {
                        if ("1".equalsIgnoreCase(strImprintProperty)) {
                            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 更新静默心跳最后一次成功请求时间.");
                            C0831c.m3309a(this.f3371r, System.currentTimeMillis());
                        } else if ("0".equalsIgnoreCase(strImprintProperty)) {
                            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 静默模式 -> 正常模式。重置 last req time");
                            C0831c.m3309a(this.f3371r, 0L);
                            C0831c.m3314d(this.f3371r);
                        }
                    }
                }
            } else if (iM2937a == 3) {
                StatTracer.getInstance(this.f3371r).saveSate();
                if (zM3095c) {
                    FieldManager.m2730a().m2732a(this.f3371r);
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 零号报文应答内容报错!!! ，特殊处理!，继续正常流程。");
                    Context context = this.f3371r;
                    UMWorkDispatch.sendEvent(context, C0771a.f3234s, C0772b.m2790a(context).m2791a(), null);
                    return true;
                }
            }
            return iM2937a == 2;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f3371r, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private int m2937a(byte[] bArr) {
        Response response = new Response();
        try {
            new C0667ay(new C0683bn.a()).m2304a(response, bArr);
            if (response.resp_code == 1) {
                this.f3363g.m3049b(response.getImprint());
                this.f3363g.m3051d();
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f3371r, th);
        }
        return response.resp_code == 1 ? 2 : 3;
    }
}
