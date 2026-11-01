package p067l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۢ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11793 extends AbstractC22049 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C21378 f32947;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11793(C21378 c21378, AbstractC12224 abstractC12224, EnumC18497 enumC18497, EnumSet enumSet) {
        super(c21378, abstractC12224, enumC18497, enumSet);
        this.f32947 = c21378;
    }

    @Override // p067l.AbstractC22049
    /* JADX INFO: renamed from: ֫ */
    public final void mo5187(int i, AbstractC7783 abstractC7783) {
        EnumC3600 enumC3600 = abstractC7783.f20405;
        EnumC3600 enumC3601 = EnumC3600.f7354;
        C21378 c21378 = this.f32947;
        if (enumC3600 == enumC3601) {
            C15828 c15828 = (C15828) abstractC7783;
            boolean z = true;
            c21378.f67396 = true;
            try {
                C21333 c21333 = (C21333) c15828.f20406;
                if (c15828 != c21378.f67402) {
                    z = false;
                }
                C1446.m31704(z);
                AbstractC12224 abstractC12224M48603 = c21378.f67409.m48603(c21378.m48439());
                byte[] bArrMo5096 = abstractC12224M48603.mo5096();
                int iMo5100 = abstractC12224M48603.mo5100();
                int iMo5098 = abstractC12224M48603.mo5098();
                c21378.f67416 = bArrMo5096;
                c21378.f67418 = iMo5100;
                c21378.f67406 = iMo5100 + iMo5098;
                c21333.f67257 = c21378.m48449();
                c21333.f67259 = c21378.m48450();
                C20271 c20271 = new C20271();
                while (c21378.f67418 != c21378.f67406) {
                    c20271.m45777(c21378.m48450());
                }
                c21333.f67261 = c20271.m45783();
                return;
            } finally {
                c21378.f67396 = false;
            }
        }
        C4848 c4848Mo14794 = abstractC7783.f20406.mo14794();
        AbstractC6462 abstractC6462M48604 = c21378.f67409.m48604(c21378.m48439());
        abstractC7783.f20406 = abstractC6462M48604;
        if (abstractC7783.f20405 == EnumC3600.f7343 && abstractC6462M48604.mo14794().isEmpty()) {
            abstractC7783.f20406.mo14809().f35032 = c4848Mo14794;
        }
    }
}
