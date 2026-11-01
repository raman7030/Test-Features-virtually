package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.֡ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47G1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2661 {

    /* JADX INFO: renamed from: ֫ */
    public float f4451;

    /* JADX INFO: renamed from: ۜ */
    public final int f4452;

    /* JADX INFO: renamed from: ۧ */
    public float f4453;

    /* JADX INFO: renamed from: ܳ */
    public int f4454 = -1;

    /* JADX INFO: renamed from: ܽ */
    public boolean f4455;

    /* JADX INFO: renamed from: ܿ */
    public Object f4456;

    /* JADX INFO: renamed from: ᩳ */
    public final int f4457;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f4458;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f4459;

    public C2661(int i, int i2) {
        this.f4457 = i;
        this.f4452 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4118(View view, int i, float f, float f2, boolean z) {
        m4117();
        if (!z || view == null) {
            return;
        }
        this.f4456 = view;
        this.f4454 = i;
        this.f4451 = f;
        this.f4453 = f2;
        this.f4459 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC20768 m4116(View view, float f, float f2, int i) {
        if (!this.f4459 || this.f4458) {
            return EnumC20768.NONE;
        }
        if (view == null || view != this.f4456 || i != this.f4454) {
            m4117();
            return EnumC20768.NONE;
        }
        float f3 = f - this.f4451;
        float f4 = f2 - this.f4453;
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        int i2 = this.f4457;
        if (f3 < 0.0f && fAbs > i2 && fAbs > fAbs2) {
            m4117();
            return EnumC20768.NONE;
        }
        float f5 = i2;
        if (fAbs2 > f5 && fAbs2 > fAbs) {
            m4117();
            return EnumC20768.NONE;
        }
        boolean z = f3 > f5 && f3 > fAbs2;
        if (f3 >= this.f4452 && f3 > fAbs2) {
            this.f4455 = true;
            this.f4458 = true;
            return EnumC20768.TRIGGER_LONG_CLICK;
        }
        if (z && !this.f4455) {
            this.f4455 = true;
            return EnumC20768.REQUEST_DISALLOW_INTERCEPT;
        }
        return EnumC20768.NONE;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4117() {
        this.f4456 = null;
        this.f4454 = -1;
        this.f4451 = 0.0f;
        this.f4453 = 0.0f;
        this.f4459 = false;
        this.f4455 = false;
        this.f4458 = false;
    }
}
