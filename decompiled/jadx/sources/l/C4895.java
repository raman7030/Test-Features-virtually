package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4895 extends C21645 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1869 f15456;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3484 f15457;

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo8782() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4895(C3484 c3484, C20418 c20418, C1869 c1869) {
        super(R.string.MT_Protector, R.drawable.MT_Protector, c20418);
        this.f15457 = c3484;
        this.f15456 = c1869;
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8783() {
        this.f15456.f6373 = false;
        C6306 c6306 = this.f15457.f11034;
        if (c6306.f19523) {
            c6306.f19506.invalidate();
        }
    }
}
