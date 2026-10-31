package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩳۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes5.dex */
public final class C17968 extends AbstractC7715 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14439 f56039;

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC7715 mo5817() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17968(C14439 c14439, int i) {
        super(c14439, i);
        this.f56039 = c14439;
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ۧ */
    public final void mo17361() {
        this.f56039.f44254.m4824(C1365.m4796(this.f23845) == 2 ? 92 : 89);
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ֫ */
    public final void mo17358() {
        this.f56039.f44254.m4824(C1365.m4796(this.f23845) == 2 ? 88 : 87);
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ۧ */
    public final void mo17362(int i) {
        this.f56039.f44254.m4824(((C1365.m4796(i) - 1) * 3) + (C1365.m4796(this.f23845) == 2 ? 91 : 90));
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ᩻ */
    public final int mo17365() {
        return C1365.m4796(this.f23845);
    }

    public final String toString() {
        return C9045.m23341(new StringBuilder("stack("), InterfaceC23048.f74161[this.f23845], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
