package p067l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.alipay.sdk.app.H5PayActivity$$ExternalSyntheticLambda0;

/* JADX INFO: renamed from: l.᩷۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C22201 {

    /* JADX INFO: renamed from: ֫ */
    public C19695 f70215;

    /* JADX INFO: renamed from: ۜ */
    public final H5PayActivity$$ExternalSyntheticLambda0 f70216;

    /* JADX INFO: renamed from: ۢ */
    public C11472 f70217;

    /* JADX INFO: renamed from: ۧ */
    public C19518 f70218;

    /* JADX INFO: renamed from: ܳ */
    public final Handler f70219;

    /* JADX INFO: renamed from: ܽ */
    public final C16164 f70220;

    /* JADX INFO: renamed from: ܿ */
    public final C24882 f70221;

    /* JADX INFO: renamed from: ᩳ */
    public final Context f70222;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f70223;

    /* JADX INFO: renamed from: ᩻ */
    public final BroadcastReceiver f70224;

    public C22201(Context context, H5PayActivity$$ExternalSyntheticLambda0 h5PayActivity$$ExternalSyntheticLambda0, C19695 c19695, C11472 c11472) {
        Context applicationContext = context.getApplicationContext();
        this.f70222 = applicationContext;
        this.f70216 = h5PayActivity$$ExternalSyntheticLambda0;
        this.f70215 = c19695;
        this.f70217 = c11472;
        String str = C5792.f14228;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f70219 = handler;
        this.f70220 = Build.VERSION.SDK_INT >= 23 ? new C16164(this) : null;
        this.f70224 = new C8789(this);
        C19518 c19518 = C19518.f59441;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f70221 = uriFor != null ? new C24882(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50021(C19518 c19518) {
        m50016(c19518);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50022(C19695 c19695) {
        this.f70215 = c19695;
        m50016(C19518.m44352(this.f70222, c19695, this.f70217));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50020(AudioDeviceInfo audioDeviceInfo) {
        C11472 c11472 = this.f70217;
        if (C12826.equals(audioDeviceInfo, c11472 == null ? null : c11472.f31988)) {
            return;
        }
        C11472 c11473 = audioDeviceInfo != null ? new C11472(audioDeviceInfo) : null;
        this.f70217 = c11473;
        m50016(C19518.m44352(this.f70222, this.f70215, c11473));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19518 m50019() {
        C16164 c16164;
        if (this.f70223) {
            C19518 c19518 = this.f70218;
            c19518.getClass();
            return c19518;
        }
        this.f70223 = true;
        C24882 c24882 = this.f70221;
        if (c24882 != null) {
            c24882.m54630();
        }
        int i = Build.VERSION.SDK_INT;
        Handler handler = this.f70219;
        Context context = this.f70222;
        if (i >= 23 && (c16164 = this.f70220) != null) {
            C18847.m42921(context, c16164, handler);
        }
        C19518 c19518M44351 = C19518.m44351(context, context.registerReceiver(this.f70224, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.f70215, this.f70217);
        this.f70218 = c19518M44351;
        return c19518M44351;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50023() {
        C16164 c16164;
        if (this.f70223) {
            this.f70218 = null;
            int i = Build.VERSION.SDK_INT;
            Context context = this.f70222;
            if (i >= 23 && (c16164 = this.f70220) != null) {
                C18847.m42920(context, c16164);
            }
            context.unregisterReceiver(this.f70224);
            C24882 c24882 = this.f70221;
            if (c24882 != null) {
                c24882.m54631();
            }
            this.f70223 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m50016(C19518 c19518) {
        if (!this.f70223 || c19518.equals(this.f70218)) {
            return;
        }
        this.f70218 = c19518;
        ((C10072) this.f70216.f$0).m23532(c19518);
    }
}
