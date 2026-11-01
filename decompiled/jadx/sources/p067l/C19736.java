package p067l;

import com.umeng.analytics.pro.C0655am;

/* JADX INFO: renamed from: l.ᩳ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4V4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19736 extends AbstractC20407 {

    /* JADX INFO: renamed from: ۗ */
    public int f60034;

    public C19736() {
        super(EnumC3642.LOCAL);
    }

    public C19736(int i) {
        super(EnumC3642.LOCAL);
        this.f60034 = i;
    }

    @Override // p067l.AbstractC20407, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        C19736 c19736 = new C19736(this.f60034);
        c19736.f28659 = this.f28659;
        return c19736;
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return c3702.m7136(this);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        return C0655am.f2320av + this.f60034;
    }
}
