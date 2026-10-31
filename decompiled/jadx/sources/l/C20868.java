package l;

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
public final class C20868 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18231 f67529;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final H5PayActivity$$ExternalSyntheticLambda0 f67530;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C9579 f67531;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18045 f67532;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Handler f67533;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14516 f67534;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C23689 f67535;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Context f67536;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f67537;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f67538;

    public C20868(Context context, H5PayActivity$$ExternalSyntheticLambda0 h5PayActivity$$ExternalSyntheticLambda0, C18231 c18231, C9579 c9579) {
        Context applicationContext = context.getApplicationContext();
        this.f67536 = applicationContext;
        this.f67530 = h5PayActivity$$ExternalSyntheticLambda0;
        this.f67529 = c18231;
        this.f67531 = c9579;
        String str = C3603.f11424;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f67533 = handler;
        this.f67534 = Build.VERSION.SDK_INT >= 23 ? new C14516(this) : null;
        this.f67538 = new C6756(this);
        C18045 c18045 = C18045.f56239;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f67535 = uriFor != null ? new C23689(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47691(C18045 c18045) {
        m47686(c18045);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47692(C18231 c18231) {
        this.f67529 = c18231;
        m47686(C18045.m42101(this.f67536, c18231, this.f67531));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47690(AudioDeviceInfo audioDeviceInfo) {
        C9579 c9579 = this.f67531;
        if (C11003.equals(audioDeviceInfo, c9579 == null ? null : c9579.f29041)) {
            return;
        }
        C9579 c95710 = audioDeviceInfo != null ? new C9579(audioDeviceInfo) : null;
        this.f67531 = c95710;
        m47686(C18045.m42101(this.f67536, this.f67529, c95710));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18045 m47689() {
        C14516 c14516;
        if (this.f67537) {
            C18045 c18045 = this.f67532;
            c18045.getClass();
            return c18045;
        }
        this.f67537 = true;
        C23689 c23689 = this.f67535;
        if (c23689 != null) {
            c23689.m52227();
        }
        int i = Build.VERSION.SDK_INT;
        Handler handler = this.f67533;
        Context context = this.f67536;
        if (i >= 23 && (c14516 = this.f67534) != null) {
            C17339.m40670(context, c14516, handler);
        }
        C18045 c18045M42100 = C18045.m42100(context, context.registerReceiver(this.f67538, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.f67529, this.f67531);
        this.f67532 = c18045M42100;
        return c18045M42100;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47693() {
        C14516 c14516;
        if (this.f67537) {
            this.f67532 = null;
            int i = Build.VERSION.SDK_INT;
            Context context = this.f67536;
            if (i >= 23 && (c14516 = this.f67534) != null) {
                C17339.m40669(context, c14516);
            }
            context.unregisterReceiver(this.f67538);
            C23689 c23689 = this.f67535;
            if (c23689 != null) {
                c23689.m52228();
            }
            this.f67537 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m47686(C18045 c18045) {
        if (!this.f67537 || c18045.equals(this.f67532)) {
            return;
        }
        this.f67532 = c18045;
        ((C8106) this.f67530.f$0).m21564(c18045);
    }
}
