package p067l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.۫᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14474 extends AbstractC22049 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C21378 f41345;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14474(C21378 c21378, AbstractC12224 abstractC12224, EnumC18497 enumC18497, EnumSet enumSet) {
        super(c21378, abstractC12224, enumC18497, enumSet);
        this.f41345 = c21378;
    }

    @Override // p067l.AbstractC22049
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12848(EnumC8637 enumC8637) {
        return super.mo12848(enumC8637) && this.f41345.f67415;
    }

    @Override // p067l.AbstractC22049
    /* JADX INFO: renamed from: ֫ */
    public final void mo5187(int i, AbstractC7783 abstractC7783) {
        if (abstractC7783.f20405 == EnumC3600.f7354) {
            C20271 c20271 = new C20271();
            C21378 c21378 = this.f41345;
            char cM48439 = c21378.m48439();
            for (int i2 = 0; i2 < cM48439; i2++) {
                c20271.m45777(c21378.f67409.m48596(c21378.m48439()));
            }
            ((C15828) abstractC7783).f45853 = c20271.m45783();
        }
    }
}
