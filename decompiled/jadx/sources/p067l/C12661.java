package p067l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۧۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12661 extends AbstractC22049 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C21378 f35550;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12661(C21378 c21378, AbstractC12224 abstractC12224, EnumC18497 enumC18497, EnumSet enumSet) {
        super(c21378, abstractC12224, enumC18497, enumSet);
        this.f35550 = c21378;
    }

    @Override // p067l.AbstractC22049
    /* JADX INFO: renamed from: ֫ */
    public final void mo5187(int i, AbstractC7783 abstractC7783) {
        C15828 c15828 = (C15828) abstractC7783;
        C21378 c21378 = this.f35550;
        AbstractC12224 abstractC12224M48603 = c21378.f67409.m48603(c21378.m48439());
        c15828.f45858 = new C9978(abstractC12224M48603);
        String string = abstractC12224M48603.toString();
        if (c15828.f20407.f20405 == EnumC3600.f7351 && string.endsWith(".java") && !string.equals(c15828.f20408.toString().concat(".java"))) {
            c15828.f20409 |= 17592186044416L;
        }
    }
}
