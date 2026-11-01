package p067l;

/* JADX INFO: renamed from: l.۟ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 398Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C9438 extends C24151 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC4527 f25766;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9438(byte[] bArr, InterfaceC4527 interfaceC4527) {
        super(bArr, 0);
        this.f25766 = interfaceC4527;
    }

    @Override // p067l.AbstractC6086
    /* JADX INFO: renamed from: ۜ */
    public final int mo13855(int i) {
        if ((((i - 56) | (95 - i)) >>> 31) == 0) {
            byte bMo13853 = mo13853(i);
            InterfaceC4527 interfaceC4527 = this.f25766;
            int iMo9582 = bMo13853 ^ interfaceC4527.mo9582(i);
            int i2 = i + 1;
            int i3 = i + 2;
            int i4 = i + 3;
            return ((interfaceC4527.mo9582(i4) ^ mo13853(i4)) << 24) | (iMo9582 & 255) | (((interfaceC4527.mo9582(i2) ^ mo13853(i2)) & 255) << 8) | (((interfaceC4527.mo9582(i3) ^ mo13853(i3)) & 255) << 16);
        }
        return super.mo13855(i);
    }
}
