package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩳۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes5.dex */
public final class C19445 extends AbstractC9701 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C16091 f59236;

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC9701 mo8027() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19445(C16091 c16091, int i) {
        super(c16091, i);
        this.f59236 = c16091;
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ۧ */
    public final void mo19301() {
        this.f59236.f47348.m7062(C3666.m7034(this.f26759) == 2 ? 92 : 89);
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ֫ */
    public final void mo19298() {
        this.f59236.f47348.m7062(C3666.m7034(this.f26759) == 2 ? 88 : 87);
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ۧ */
    public final void mo19302(int i) {
        this.f59236.f47348.m7062(((C3666.m7034(i) - 1) * 3) + (C3666.m7034(this.f26759) == 2 ? 91 : 90));
    }

    @Override // p067l.AbstractC9701
    /* JADX INFO: renamed from: ᩻ */
    public final int mo19305() {
        return C3666.m7034(this.f26759);
    }

    public final String toString() {
        return C10965.m25286(new StringBuilder("stack("), InterfaceC24273.f76903[this.f26759], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
