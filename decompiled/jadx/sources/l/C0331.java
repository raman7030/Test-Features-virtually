package l;

import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.֡ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28II */
/* JADX INFO: loaded from: classes2.dex */
public final class C0331 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f1722;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f1723;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f1724;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f1725;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f1726;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f1727;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] f1728 = new byte[10];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1750() {
        this.f1724 = false;
        this.f1725 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1751(InterfaceC8424 interfaceC8424) {
        if (this.f1724) {
            return;
        }
        int i = 0;
        byte[] bArr = this.f1728;
        interfaceC8424.mo22061(0, 10, bArr);
        interfaceC8424.mo22066();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & UTF8.S_ERR) == 186) {
                i = 40 << (7 & (bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4));
            }
        }
        if (i == 0) {
            return;
        }
        this.f1724 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1752(InterfaceC19383 interfaceC19383, long j, int i, int i2, int i3, C18677 c18677) {
        C22632.m50633("TrueHD chunk samples must be contiguous in the sample queue.", this.f1723 <= i2 + i3);
        if (this.f1724) {
            int i4 = this.f1725;
            int i5 = i4 + 1;
            this.f1725 = i5;
            if (i4 == 0) {
                this.f1726 = j;
                this.f1722 = i;
                this.f1727 = 0;
            }
            this.f1727 += i2;
            this.f1723 = i3;
            if (i5 >= 16) {
                m1753(interfaceC19383, c18677);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1753(InterfaceC19383 interfaceC19383, C18677 c18677) {
        if (this.f1725 > 0) {
            interfaceC19383.mo8455(this.f1726, this.f1722, this.f1727, this.f1723, c18677);
            this.f1725 = 0;
        }
    }
}
