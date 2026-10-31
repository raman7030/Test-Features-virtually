package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19154 extends C21645 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1869 f60351;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0102 f60352;

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo8782() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19154(C0102 c0102, C18448 c18448, C1869 c1869) {
        super(R.string.MT_Protector, R.drawable.MT_Protector, c18448);
        this.f60352 = c0102;
        this.f60351 = c1869;
    }

    @Override // l.AbstractC2867
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8783() {
        this.f60351.f6373 = false;
        C7864 c7864 = this.f60352.f1073;
        if (c7864.f24385) {
            c7864.f24374.invalidate();
        }
    }
}
