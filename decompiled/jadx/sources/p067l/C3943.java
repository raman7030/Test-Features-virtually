package p067l;

import java.util.Arrays;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.֫ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3943 extends AbstractC22049 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C21378 f8574;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3943(C21378 c21378, AbstractC12224 abstractC12224, EnumC18497 enumC18497, EnumSet enumSet) {
        super(c21378, abstractC12224, enumC18497, enumSet);
        this.f8574 = c21378;
    }

    @Override // p067l.AbstractC22049
    /* JADX INFO: renamed from: ֫ */
    public final void mo5187(int i, AbstractC7783 abstractC7783) {
        C21378 c21378 = this.f8574;
        int i2 = c21378.f67411 + i;
        if (c21378.f67428 && !c21378.f67410) {
            char cM48439 = c21378.m48439();
            for (int i3 = 0; i3 < cM48439; i3++) {
                char cM484310 = c21378.m48439();
                c21378.m48439();
                char cM484311 = c21378.m48439();
                c21378.m48439();
                char cM484312 = c21378.m48439();
                if (cM484310 == 0) {
                    int[] iArr = c21378.f67392;
                    if (cM484312 >= iArr.length) {
                        c21378.f67392 = Arrays.copyOf(c21378.f67392, Math.max(cM484312 + 1, iArr.length + 8));
                    }
                    c21378.f67392[cM484312] = cM484311;
                }
            }
        }
        c21378.f67411 = i2;
    }
}
