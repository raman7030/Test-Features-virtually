package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۤ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes4.dex */
public final class C10538 extends AbstractC7715 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC7715 f31609;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14439 f31610;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10538(C14439 c14439, AbstractC7715 abstractC7715) {
        super(c14439, abstractC7715.f23845);
        this.f31610 = c14439;
        this.f31609 = abstractC7715;
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC7715 mo5817() {
        AbstractC7715 abstractC7715 = this.f31609;
        int i = this.f23845;
        abstractC7715.mo17362(i);
        abstractC7715.mo5815();
        return this.f31610.f44255[i];
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ۧ */
    public final void mo17361() {
        mo5817().mo17361();
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ֫ */
    public final void mo17358() {
        this.f31609.mo5815();
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ۧ */
    public final void mo17362(int i) {
        C12171.m29636();
        throw null;
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ᩻ */
    public final int mo17365() {
        return C1365.m4796(this.f23845) + this.f31609.mo17365();
    }

    public final String toString() {
        return "assign(lhs = " + this.f31609 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
