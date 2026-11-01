package p067l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۗ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5757 extends AbstractC22049 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C21378 f14118;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5757(C21378 c21378, AbstractC12224 abstractC12224, EnumC18497 enumC18497, EnumSet enumSet) {
        super(c21378, abstractC12224, enumC18497, enumSet);
        this.f14118 = c21378;
    }

    @Override // p067l.AbstractC22049
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12848(EnumC8637 enumC8637) {
        return super.mo12848(enumC8637) && this.f14118.f67389;
    }

    @Override // p067l.AbstractC22049
    /* JADX INFO: renamed from: ֫ */
    public final void mo5187(int i, AbstractC7783 abstractC7783) {
        if (abstractC7783.f20405 == EnumC3600.f7354) {
            AbstractC7783 abstractC7784 = abstractC7783.f20407;
            if (abstractC7784.f20405 == EnumC3600.f7340) {
                EnumSet enumSet = ((C2417) abstractC7784).f3691;
                char cM48439 = this.f14118.m48439();
                EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC20524.class);
                for (EnumC20524 enumC20524 : EnumC20524.values()) {
                    if ((enumC20524.f63417 & cM48439) != 0) {
                        enumSetNoneOf.add(enumC20524);
                    }
                }
                enumSet.addAll(enumSetNoneOf);
            }
        }
    }
}
