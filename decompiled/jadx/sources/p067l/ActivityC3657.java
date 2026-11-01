package p067l;

import android.media.projection.MediaProjectionManager;

/* JADX INFO: renamed from: l.֨᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O945 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC3657 extends AbstractActivityC2986 implements InterfaceC10317 {

    /* JADX INFO: renamed from: ܳۧ */
    public static final /* synthetic */ int f7683 = 0;

    /* JADX INFO: renamed from: ܿۧ */
    public C7741 f7684;

    /* JADX INFO: renamed from: ᩳۧ */
    public boolean f7685 = true;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "ColorPickerActivity";
    }

    @Override // p067l.AbstractActivityC2986
    /* JADX INFO: renamed from: ۨ */
    public final void mo5002() {
        this.f7684 = C10423.m24117(this, new C7681(this));
        if (ServiceC5428.m11932()) {
            ServiceC5428.m11924(this);
        } else {
            m6955();
        }
    }

    /* JADX INFO: renamed from: ܰ */
    public final void m6955() {
        if (C11164.m25765(this)) {
            this.f7684.m17868(((MediaProjectionManager) getSystemService("media_projection")).createScreenCaptureIntent());
            this.f7685 = false;
        } else {
            try {
                C23058.m51450(this, null);
            } catch (Throwable th) {
                m12260(th, true);
            }
        }
    }

    @Override // p067l.AbstractActivityC2986
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo5003() {
        return this.f7685;
    }
}
