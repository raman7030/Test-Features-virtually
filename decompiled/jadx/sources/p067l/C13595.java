package p067l;

/* JADX INFO: renamed from: l.ۨܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2A1U */
/* JADX INFO: loaded from: classes4.dex */
public class C13595 extends AbstractC8230 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f38233;

    /* JADX INFO: renamed from: ۧ */
    public byte f38234;

    /* JADX INFO: renamed from: ܽ */
    public int[] f38235;

    /* JADX INFO: renamed from: ᩳ */
    public byte f38236;

    @Override // p067l.AbstractC8230
    /* JADX INFO: renamed from: ۧ */
    public final void mo4602(C14935 c14935) {
        c14935.m34161(4);
        byte b = this.f38236;
        c14935.m34167(b);
        c14935.m34162(this.f38234);
        c14935.m34162(this.f38236);
        int i = c14935.f42650;
        c14935.m34157(6);
        int i2 = c14935.f42650;
        c14935.m34157(b * 4);
        C14935 c14935M34164 = c14935.m34164(i);
        for (int i3 = 0; i3 < 6; i3++) {
            c14935M34164.m34162(this.f38233[i3]);
        }
        C14935 c14935M34165 = c14935M34164.m34164(i2);
        for (int i4 = 0; i4 < b; i4++) {
            c14935M34165.m34167(this.f38235[i4]);
        }
    }

    @Override // p067l.AbstractC8230
    /* JADX INFO: renamed from: ֫ */
    public final void mo4601(C14935 c14935) throws C14265 {
        c14935.m34161(4);
        int iM34156 = c14935.m34156();
        this.f38234 = (byte) c14935.m34163();
        this.f38236 = (byte) c14935.m34163();
        int i = c14935.f42650;
        c14935.m34157(6);
        int i2 = c14935.f42650;
        c14935.m34157(iM34156 * 4);
        if (this.f38233 == null) {
            this.f38233 = new byte[6];
        }
        C14935 c14935M34164 = c14935.m34164(i);
        for (int i3 = 0; i3 < 6; i3++) {
            this.f38233[i3] = (byte) c14935M34164.m34163();
        }
        if (this.f38235 == null) {
            if (iM34156 < 0 || iM34156 > 65535) {
                throw new C14265("invalid array conformance");
            }
            this.f38235 = new int[iM34156];
        }
        C14935 c14935M34165 = c14935M34164.m34164(i2);
        for (int i4 = 0; i4 < iM34156; i4++) {
            this.f38235[i4] = c14935M34165.m34156();
        }
    }
}
