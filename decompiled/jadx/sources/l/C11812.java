package l;

/* JADX INFO: renamed from: l.ۨܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2A1U */
/* JADX INFO: loaded from: classes4.dex */
public class C11812 extends AbstractC6167 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f35231;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte f35232;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f35233;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f35234;

    @Override // l.AbstractC6167
    /* JADX INFO: renamed from: ۧ */
    public final void mo2235(C13222 c13222) {
        c13222.m32063(4);
        byte b = this.f35234;
        c13222.m32069(b);
        c13222.m32064(this.f35232);
        c13222.m32064(this.f35234);
        int i = c13222.f39586;
        c13222.m32059(6);
        int i2 = c13222.f39586;
        c13222.m32059(b * 4);
        C13222 c13222M32066 = c13222.m32066(i);
        for (int i3 = 0; i3 < 6; i3++) {
            c13222M32066.m32064(this.f35231[i3]);
        }
        C13222 c13222M32067 = c13222M32066.m32066(i2);
        for (int i4 = 0; i4 < b; i4++) {
            c13222M32067.m32069(this.f35233[i4]);
        }
    }

    @Override // l.AbstractC6167
    /* JADX INFO: renamed from: ֫ */
    public final void mo2234(C13222 c13222) throws C12517 {
        c13222.m32063(4);
        int iM32058 = c13222.m32058();
        this.f35232 = (byte) c13222.m32065();
        this.f35234 = (byte) c13222.m32065();
        int i = c13222.f39586;
        c13222.m32059(6);
        int i2 = c13222.f39586;
        c13222.m32059(iM32058 * 4);
        if (this.f35231 == null) {
            this.f35231 = new byte[6];
        }
        C13222 c13222M32066 = c13222.m32066(i);
        for (int i3 = 0; i3 < 6; i3++) {
            this.f35231[i3] = (byte) c13222M32066.m32065();
        }
        if (this.f35233 == null) {
            if (iM32058 < 0 || iM32058 > 65535) {
                throw new C12517("invalid array conformance");
            }
            this.f35233 = new int[iM32058];
        }
        C13222 c13222M32067 = c13222M32066.m32066(i2);
        for (int i4 = 0; i4 < iM32058; i4++) {
            this.f35233[i4] = c13222M32067.m32058();
        }
    }
}
