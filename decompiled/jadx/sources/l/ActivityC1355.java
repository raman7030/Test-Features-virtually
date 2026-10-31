package l;

import android.media.projection.MediaProjectionManager;

/* JADX INFO: renamed from: l.֨᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O945 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC1355 extends AbstractActivityC0649 implements InterfaceC8363 {

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f4911 = 0;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C5652 f4912;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public boolean f4913 = true;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "ColorPickerActivity";
    }

    @Override // l.AbstractActivityC0649
    /* JADX INFO: renamed from: ۨ */
    public final void mo2662() {
        this.f4912 = C8474.m22148(this, new C5589(this));
        if (ServiceC3219.m9885()) {
            ServiceC3219.m9877(this);
        } else {
            m4717();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m4717() {
        if (C9255.m23764(this)) {
            this.f4912.m15940(((MediaProjectionManager) getSystemService("media_projection")).createScreenCaptureIntent());
            this.f4913 = false;
        } else {
            try {
                C21769.m49100(this, null);
            } catch (Throwable th) {
                m10224(th, true);
            }
        }
    }

    @Override // l.AbstractActivityC0649
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo2663() {
        return this.f4913;
    }
}
