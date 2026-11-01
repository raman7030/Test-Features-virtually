package p067l;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.֫ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes2.dex */
public final class C4240 {

    /* JADX INFO: renamed from: ֫ */
    public final Handler f9382;

    /* JADX INFO: renamed from: ۧ */
    public final Spatializer.OnSpatializerStateChangedListener f9383;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f9384;

    /* JADX INFO: renamed from: ᩳ */
    public final Spatializer f9385;

    public C4240(Context context, C8934 c8934, Boolean bool) {
        AudioManager audioManagerM9260 = context == null ? null : C4431.m9260(context);
        if (audioManagerM9260 == null || (bool != null && bool.booleanValue())) {
            this.f9385 = null;
            this.f9384 = false;
            this.f9382 = null;
            this.f9383 = null;
            return;
        }
        Spatializer spatializer = audioManagerM9260.getSpatializer();
        this.f9385 = spatializer;
        this.f9384 = spatializer.getImmersiveAudioLevel() != 0;
        C9624 c9624 = new C9624(c8934);
        this.f9383 = c9624;
        Looper looperMyLooper = Looper.myLooper();
        C23877.m52958(looperMyLooper);
        Handler handler = new Handler(looperMyLooper);
        this.f9382 = handler;
        spatializer.addOnSpatializerStateChangedListener(new ExecutorC2695(handler), c9624);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m8621() {
        return this.f9384;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m8618() {
        Spatializer spatializer = this.f9385;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m8620() {
        Spatializer spatializer = this.f9385;
        spatializer.getClass();
        return spatializer.isEnabled();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m8619(C19695 c19695, C10307 c10307) {
        String str = c10307.f28528;
        String str2 = c10307.f28528;
        int i = c10307.f28539;
        if (C12826.equals(str, "audio/eac3-joc")) {
            if (i == 16) {
                i = 12;
            }
        } else if (C12826.equals(str2, "audio/iamf")) {
            if (i == -1) {
                i = 6;
            }
        } else if (C12826.equals(str2, "audio/ac4") && (i == 18 || i == 21)) {
            i = 24;
        }
        int iM13011 = C5792.m13011(i);
        if (iM13011 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM13011);
        int i2 = c10307.f28538;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.f9385;
        spatializer.getClass();
        return spatializer.canBeSpatialized(c19695.m44733().f54801, channelMask.build());
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m8622() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.f9385;
        if (spatializer == null || (onSpatializerStateChangedListener = this.f9383) == null || (handler = this.f9382) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }
}
