package p067l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩹᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23862 extends AbstractC22049 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C21378 f75790;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23862(C21378 c21378, AbstractC12224 abstractC12224, EnumC18497 enumC18497, EnumSet enumSet) {
        super(c21378, abstractC12224, enumC18497, enumSet);
        this.f75790 = c21378;
    }

    @Override // p067l.AbstractC22049
    /* JADX INFO: renamed from: ֫ */
    public final void mo5187(int i, AbstractC7783 abstractC7783) {
        C21378 c21378 = this.f75790;
        int i2 = c21378.f67411 + i;
        if (c21378.f67428) {
            c21378.f67410 = true;
            int iM48427 = c21378.m48427();
            c21378.f67392 = new int[iM48427];
            c21378.f67423 = new int[iM48427];
            c21378.getClass();
            int i3 = 0;
            for (int i4 = 0; i4 < iM48427; i4++) {
                char cM48439 = c21378.m48439();
                char cM484310 = c21378.m48439();
                if ((36864 & cM484310) == 0) {
                    c21378.f67392[i3] = cM48439;
                    c21378.f67423[i3] = cM484310;
                    i3++;
                }
            }
        }
        c21378.f67411 = i2;
    }
}
