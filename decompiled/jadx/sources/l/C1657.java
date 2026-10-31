package l;

import java.util.Arrays;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.֫ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1657 extends AbstractC20708 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f5794;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1657(C20002 c20002, AbstractC10370 abstractC10370, EnumC16970 enumC16970, EnumSet enumSet) {
        super(c20002, abstractC10370, enumC16970, enumSet);
        this.f5794 = c20002;
    }

    @Override // l.AbstractC20708
    /* JADX INFO: renamed from: ֫ */
    public final void mo2858(int i, AbstractC5698 abstractC5698) {
        C20002 c20002 = this.f5794;
        int i2 = c20002.f64769 + i;
        if (c20002.f64786 && !c20002.f64768) {
            char cM46124 = c20002.m46124();
            for (int i3 = 0; i3 < cM46124; i3++) {
                char cM46125 = c20002.m46124();
                c20002.m46124();
                char cM46126 = c20002.m46124();
                c20002.m46124();
                char cM46127 = c20002.m46124();
                if (cM46125 == 0) {
                    int[] iArr = c20002.f64750;
                    if (cM46127 >= iArr.length) {
                        c20002.f64750 = Arrays.copyOf(c20002.f64750, Math.max(cM46127 + 1, iArr.length + 8));
                    }
                    c20002.f64750[cM46127] = cM46126;
                }
            }
        }
        c20002.f64769 = i2;
    }
}
