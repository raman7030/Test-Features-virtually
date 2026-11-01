package p067l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۛ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8439 extends AbstractC22049 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C21378 f22629;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8439(C21378 c21378, AbstractC12224 abstractC12224, EnumC18497 enumC18497, EnumSet enumSet) {
        super(c21378, abstractC12224, enumC18497, enumSet);
        this.f22629 = c21378;
    }

    @Override // p067l.AbstractC22049
    /* JADX INFO: renamed from: ֫ */
    public final void mo5187(int i, AbstractC7783 abstractC7783) {
        C21378 c21378 = this.f22629;
        if (!c21378.f67428) {
            c21378.f67411 += i;
            return;
        }
        c21378.m48439();
        c21378.m48439();
        c21378.f67411 += c21378.m48443();
        c21378.f67411 = (c21378.m48439() * '\b') + c21378.f67411;
        c21378.m48434(abstractC7783, EnumC8637.MEMBER);
        ((C5771) abstractC7783).f14173 = null;
    }
}
