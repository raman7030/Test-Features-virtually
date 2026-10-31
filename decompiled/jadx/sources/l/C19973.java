package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩶ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9QS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19973 implements InterfaceC8559 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f64687 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4450 f64688;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f64689;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f64690;

    public C19973(C4450 c4450, C13621 c13621) {
        this.f64688 = c4450;
        this.f64689 = c13621.m32741();
    }

    @Override // l.InterfaceC8559
    /* JADX INFO: renamed from: ֫ */
    public final void mo17795(int i) {
        this.f64687 += (long) i;
        C4450 c4450 = this.f64688;
        boolean z = c4450.f14205;
        long j = this.f64689;
        if (z) {
            c4450.m11541(this.f64687, j);
        } else {
            c4450.m50130(this.f64687, j);
            c4450.m11541(c4450.f14207.m47713() + this.f64687, c4450.f14207.m47709());
        }
    }

    @Override // l.InterfaceC8559
    /* JADX INFO: renamed from: ۧ */
    public final void mo17796(int i) {
        boolean z = this.f64690;
        C4450 c4450 = this.f64688;
        if (!z) {
            this.f64690 = true;
            if (c4450.f14207.m47716() > 1) {
                c4450.mo11546(C4925.m14327(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c4450.f14207.m47714() + "/" + c4450.f14207.m47716() + MotionUtils.EASING_TYPE_FORMAT_END);
            } else {
                c4450.m11536(R.string.MT_Protector);
            }
        }
        if (c4450.f14205) {
            c4450.mo11538(i);
        } else {
            c4450.m50129(i);
        }
    }

    @Override // l.InterfaceC8559
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo17797() {
        return this.f64688.mo1526();
    }
}
