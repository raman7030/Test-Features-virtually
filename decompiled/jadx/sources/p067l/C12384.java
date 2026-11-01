package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۤ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes4.dex */
public final class C12384 extends AbstractC9701 {

    /* JADX INFO: renamed from: ܽ */
    public AbstractC9701 f34573;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C16091 f34574;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12384(C16091 c16091, AbstractC9701 abstractC9701) {
        super(c16091, abstractC9701.f26759);
        this.f34574 = c16091;
        this.f34573 = abstractC9701;
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC9701 mo8027() {
        AbstractC9701 abstractC9701 = this.f34573;
        int i = this.f26759;
        abstractC9701.mo19302(i);
        abstractC9701.mo8025();
        return this.f34574.f47349[i];
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ۧ */
    public final void mo19301() {
        mo8027().mo19301();
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ֫ */
    public final void mo19298() {
        this.f34573.mo8025();
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ۧ */
    public final void mo19302(int i) {
        C1446.m31698();
        throw null;
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ᩻ */
    public final int mo19305() {
        return C3666.m7034(this.f26759) + this.f34573.mo19305();
    }

    public final String toString() {
        return "assign(lhs = " + this.f34573 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
