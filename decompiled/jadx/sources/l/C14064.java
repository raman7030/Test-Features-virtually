package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܰ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes4.dex */
public final class C14064 extends AbstractC7715 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14439 f42490;

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ᩻ */
    public final int mo17365() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14064(C14439 c14439, AbstractC4308 abstractC4308) {
        super(c14439, C1365.m4782(abstractC4308));
        this.f42490 = c14439;
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC7715 mo5817() {
        C14439 c14439 = this.f42490;
        C1365 c1365 = c14439.f44254;
        int i = this.f23845;
        c1365.m4824(i + 46);
        return c14439.f44255[i];
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ܳ */
    public final void mo5815() {
        this.f42490.f44254.m4824(this.f23845 + 79);
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ۧ */
    public final void mo17361() {
        this.f42490.f44254.m4824(92);
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ֫ */
    public final void mo17358() {
        this.f42490.f44254.m4824(88);
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ۧ */
    public final void mo17362(int i) {
        this.f42490.f44254.m4824(((C1365.m4796(i) - 1) * 3) + 91);
    }

    public final String toString() {
        return C9045.m23341(new StringBuilder("indexed("), InterfaceC23048.f74161[this.f23845], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
