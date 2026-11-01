package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20572 extends C22940 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C4145 f63582;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C2465 f63583;

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo10849() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20572(C2465 c2465, C19901 c19901, C4145 c4145) {
        super(R.string.MT_Protector, R.drawable.MT_Protector, c19901);
        this.f63583 = c2465;
        this.f63582 = c4145;
    }

    @Override // p067l.AbstractC5094
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10850() {
        this.f63582.f9154 = false;
        C9842 c9842 = this.f63583.f3847;
        if (c9842.f27301) {
            c9842.f27290.invalidate();
        }
    }
}
