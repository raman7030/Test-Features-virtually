package l;

/* JADX INFO: renamed from: l.۟ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 398Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C7439 extends C22920 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2271 f22854;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7439(byte[] bArr, InterfaceC2271 interfaceC2271) {
        super(bArr, 0);
        this.f22854 = interfaceC2271;
    }

    @Override // l.AbstractC3912
    /* JADX INFO: renamed from: ۜ */
    public final int mo11935(int i) {
        if ((((i - 56) | (95 - i)) >>> 31) == 0) {
            byte bMo11933 = mo11933(i);
            InterfaceC2271 interfaceC2271 = this.f22854;
            int iMo7499 = bMo11933 ^ interfaceC2271.mo7499(i);
            int i2 = i + 1;
            int i3 = i + 2;
            int i4 = i + 3;
            return ((interfaceC2271.mo7499(i4) ^ mo11933(i4)) << 24) | (iMo7499 & 255) | (((interfaceC2271.mo7499(i2) ^ mo11933(i2)) & 255) << 8) | (((interfaceC2271.mo7499(i3) ^ mo11933(i3)) & 255) << 16);
        }
        return super.mo11935(i);
    }
}
