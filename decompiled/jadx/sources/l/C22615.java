package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩹᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22615 extends AbstractC20708 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f73062;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22615(C20002 c20002, AbstractC10370 abstractC10370, EnumC16970 enumC16970, EnumSet enumSet) {
        super(c20002, abstractC10370, enumC16970, enumSet);
        this.f73062 = c20002;
    }

    @Override // l.AbstractC20708
    /* JADX INFO: renamed from: ֫ */
    public final void mo2858(int i, AbstractC5698 abstractC5698) {
        C20002 c20002 = this.f73062;
        int i2 = c20002.f64769 + i;
        if (c20002.f64786) {
            c20002.f64768 = true;
            int iM46112 = c20002.m46112();
            c20002.f64750 = new int[iM46112];
            c20002.f64781 = new int[iM46112];
            c20002.getClass();
            int i3 = 0;
            for (int i4 = 0; i4 < iM46112; i4++) {
                char cM46124 = c20002.m46124();
                char cM46125 = c20002.m46124();
                if ((36864 & cM46125) == 0) {
                    c20002.f64750[i3] = cM46124;
                    c20002.f64781[i3] = cM46125;
                    i3++;
                }
            }
        }
        c20002.f64769 = i2;
    }
}
