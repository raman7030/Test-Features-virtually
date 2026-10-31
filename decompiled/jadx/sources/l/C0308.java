package l;

import android.view.View;

/* JADX INFO: renamed from: l.֡ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47G1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0308 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f1674;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f1675;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f1676;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f1677 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f1678;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f1679;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f1680;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f1681;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f1682;

    public C0308(int i, int i2) {
        this.f1680 = i;
        this.f1675 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1720(View view, int i, float f, float f2, boolean z) {
        m1719();
        if (!z || view == null) {
            return;
        }
        this.f1679 = view;
        this.f1677 = i;
        this.f1674 = f;
        this.f1676 = f2;
        this.f1682 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC19360 m1718(View view, float f, float f2, int i) {
        if (!this.f1682 || this.f1681) {
            return EnumC19360.NONE;
        }
        if (view == null || view != this.f1679 || i != this.f1677) {
            m1719();
            return EnumC19360.NONE;
        }
        float f3 = f - this.f1674;
        float f4 = f2 - this.f1676;
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        int i2 = this.f1680;
        if (f3 < 0.0f && fAbs > i2 && fAbs > fAbs2) {
            m1719();
            return EnumC19360.NONE;
        }
        float f5 = i2;
        if (fAbs2 > f5 && fAbs2 > fAbs) {
            m1719();
            return EnumC19360.NONE;
        }
        boolean z = f3 > f5 && f3 > fAbs2;
        if (f3 >= this.f1675 && f3 > fAbs2) {
            this.f1678 = true;
            this.f1681 = true;
            return EnumC19360.TRIGGER_LONG_CLICK;
        }
        if (z && !this.f1678) {
            this.f1678 = true;
            return EnumC19360.REQUEST_DISALLOW_INTERCEPT;
        }
        return EnumC19360.NONE;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1719() {
        this.f1679 = null;
        this.f1677 = -1;
        this.f1674 = 0.0f;
        this.f1676 = 0.0f;
        this.f1682 = false;
        this.f1678 = false;
        this.f1681 = false;
    }
}
