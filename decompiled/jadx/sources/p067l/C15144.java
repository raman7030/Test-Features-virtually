package p067l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.۬᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15144 extends AbstractC22049 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C21378 f43236;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15144(C21378 c21378, AbstractC12224 abstractC12224, EnumC18497 enumC18497, EnumSet enumSet) {
        super(c21378, abstractC12224, enumC18497, enumSet);
        this.f43236 = c21378;
    }

    @Override // p067l.AbstractC22049
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12848(EnumC8637 enumC8637) {
        return super.mo12848(enumC8637) && this.f43236.f67405;
    }

    @Override // p067l.AbstractC22049
    /* JADX INFO: renamed from: ֫ */
    public final void mo5187(int i, AbstractC7783 abstractC7783) {
        if (abstractC7783.f20405 == EnumC3600.f7354) {
            abstractC7783.f20409 |= 2305843009213693952L;
        }
        C21378 c21378 = this.f43236;
        char cM48439 = c21378.m48439();
        C20271 c20271 = new C20271();
        for (int i2 = 0; i2 < cM48439; i2++) {
            C22536 c22536 = new C22536(abstractC7783, c21378.f67409.m48604(c21378.m48439()), c21378.f67409.m48603(c21378.m48439()));
            c21378.m48434(c22536, EnumC8637.MEMBER);
            c20271.m45777(c22536);
        }
        ((C15828) abstractC7783).m35947(c20271.m45783());
    }
}
