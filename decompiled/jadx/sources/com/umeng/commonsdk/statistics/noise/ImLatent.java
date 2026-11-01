package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;
import com.umeng.analytics.pro.C0655am;
import com.umeng.commonsdk.statistics.C0794a;
import com.umeng.commonsdk.statistics.common.C0800d;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.InterfaceC0817d;
import com.umeng.commonsdk.statistics.internal.StatTracer;

/* JADX INFO: loaded from: classes.dex */
public class ImLatent implements InterfaceC0817d {
    public static ImLatent instanse;
    public Context context;
    public StatTracer statTracer;
    public C0800d storeHelper;
    public final int _DEFAULT_HOURS = 360;
    public final int _DEFAULT_MIN_HOURS = 36;
    public final int _DEFAULT_MIN_LATENT = 1;
    public final int _DEFAULT_MAX_LATENT = LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS;
    public final long _ONE_HOURS_IN_MS = 3600000;
    public final long _360HOURS_IN_MS = 1296000000;
    public final long _36HOURS_IN_MS = 129600000;
    public final int LATENT_MAX = 1800000;
    public final int LATENT_WINDOW = 10;
    public long latentHour = 1296000000;
    public int latentWindow = 10;
    public long mDelay = 0;
    public long mElapsed = 0;
    public boolean mLatentActivite = false;
    public Object mLatentLock = new Object();

    public static synchronized ImLatent getService(Context context, StatTracer statTracer) {
        if (instanse == null) {
            ImLatent imLatent = new ImLatent(context, statTracer);
            instanse = imLatent;
            imLatent.onImprintChanged(ImprintHandler.getImprintService(context).m3050c());
        }
        return instanse;
    }

    public ImLatent(Context context, StatTracer statTracer) {
        this.context = context;
        this.storeHelper = C0800d.m3016a(context);
        this.statTracer = statTracer;
    }

    public boolean shouldStartLatency() {
        if (this.storeHelper.m3023c() || this.statTracer.isFirstRequest()) {
            return false;
        }
        synchronized (this.mLatentLock) {
            if (this.mLatentActivite) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.statTracer.getLastReqTime();
            if (jCurrentTimeMillis > this.latentHour) {
                String signature = Envelope.getSignature(this.context);
                synchronized (this.mLatentLock) {
                    this.mDelay = DataHelper.random(this.latentWindow, signature);
                    this.mElapsed = jCurrentTimeMillis;
                    this.mLatentActivite = true;
                }
                return true;
            }
            if (jCurrentTimeMillis <= 129600000) {
                return false;
            }
            synchronized (this.mLatentLock) {
                this.mDelay = 0L;
                this.mElapsed = jCurrentTimeMillis;
                this.mLatentActivite = true;
            }
            return true;
        }
    }

    public boolean isLatentActivite() {
        boolean z;
        synchronized (this.mLatentLock) {
            z = this.mLatentActivite;
        }
        return z;
    }

    public void latentDeactivite() {
        synchronized (this.mLatentLock) {
            this.mLatentActivite = false;
        }
    }

    public long getDelayTime() {
        long j;
        synchronized (this.mLatentLock) {
            j = this.mDelay;
        }
        return j;
    }

    public long getElapsedTime() {
        return this.mElapsed;
    }

    @Override // com.umeng.commonsdk.statistics.internal.InterfaceC0817d
    public void onImprintChanged(ImprintHandler.C0801a c0801a) {
        int iIntValue = Integer.valueOf(c0801a.m3053a("latent_hours", String.valueOf(360))).intValue();
        this.latentHour = ((long) (iIntValue > 36 ? iIntValue : 360)) * 3600000;
        int iIntValue2 = Integer.valueOf(c0801a.m3053a(C0655am.f2291aS, "0")).intValue();
        if (iIntValue2 < 1 || iIntValue2 > 1800) {
            iIntValue2 = 0;
        }
        if (iIntValue2 == 0) {
            int i = C0794a.f3341c;
            if (i <= 0 || i > 1800000) {
                this.latentWindow = 10;
                return;
            } else {
                this.latentWindow = i;
                return;
            }
        }
        this.latentWindow = iIntValue2;
    }
}
