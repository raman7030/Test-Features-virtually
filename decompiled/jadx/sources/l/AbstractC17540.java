package l;

import java.util.Enumeration;

/* JADX INFO: renamed from: l.ܿᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 69YC */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17540 extends AbstractC11422 implements Enumeration {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f53564;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f53565;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public int f53566;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public int f53567;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f53568;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f53569;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public boolean f53570;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public byte f53571;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public boolean f53572;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f53573;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public int f53574;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC14325[] f53575;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public int f53576;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public int f53577;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public int f53578;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public int f53579;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public byte[] f53580;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f53581;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f53582;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f53583;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public int f53584;

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo8461(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo8462(byte[] bArr);

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        return 0;
    }

    public AbstractC17540(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023);
        this.f53582 = true;
        this.f53583 = true;
    }

    public AbstractC17540(InterfaceC1023 interfaceC1023, int i) {
        super(interfaceC1023, (byte) 50);
        this.f53582 = true;
        this.f53583 = true;
        this.f53571 = (byte) 1;
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final int m41010() {
        return this.f53569;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m41014(byte[] bArr) {
        this.f53580 = bArr;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final byte[] m41016() {
        byte[] bArr = this.f53580;
        this.f53580 = null;
        return bArr;
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final byte m41015() {
        return this.f53571;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41012(byte b) {
        this.f53571 = b;
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final int m41008() {
        return this.f53578;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m41009(int i) {
        this.f53578 = i;
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final int m41013() {
        return this.f53581;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m41011(int i) {
        this.f53581 = i;
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14325[] m41007() {
        return this.f53575;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41006(InterfaceC14325[] interfaceC14325Arr) {
        this.f53575 = interfaceC14325Arr;
    }

    @Override // l.AbstractC11422, l.InterfaceC13927
    public final void reset() {
        super.reset();
        this.f53564 = 0;
        this.f53582 = true;
        this.f53583 = true;
        this.f53572 = false;
        this.f53570 = false;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f34150 == 0 && this.f53582;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        if (this.f53583) {
            this.f53583 = false;
        }
        return this;
    }

    @Override // l.AbstractC11422, l.InterfaceC13927
    public final int decode(byte[] bArr) throws C17771 {
        int iDecode = super.decode(bArr);
        if (this.f34160 == 0) {
            mo1306(iDecode + 4, bArr);
        }
        if (this.f53583) {
            this.f53583 = false;
        }
        return iDecode;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        int iM5121 = C1480.m5121(i, bArr);
        this.f53574 = iM5121;
        if (this.f53564 == 0) {
            this.f53564 = iM5121;
        }
        this.f53566 = C1480.m5121(i + 2, bArr);
        this.f53577 = C1480.m5121(i + 6, bArr);
        this.f53573 = C1480.m5121(i + 8, bArr);
        this.f53576 = C1480.m5121(i + 10, bArr);
        this.f53569 = C1480.m5121(i + 12, bArr);
        this.f53579 = C1480.m5121(i + 14, bArr);
        this.f53565 = C1480.m5121(i + 16, bArr);
        this.f53584 = bArr[i + 18] & 255;
        return (i + 20) - i;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        this.f53567 = 0;
        this.f53568 = 0;
        int i2 = this.f53577;
        if (i2 > 0) {
            int i3 = this.f53573 - (i - this.f34143);
            this.f53568 = i3;
            int i4 = i + i3;
            System.arraycopy(bArr, i4, this.f53580, this.f53576, i2);
            i = i4 + this.f53577;
        }
        int i5 = this.f53569;
        if (i5 > 0) {
            int i6 = this.f53579 - (i - this.f34143);
            this.f53567 = i6;
            System.arraycopy(bArr, i + i6, this.f53580, this.f53564 + this.f53565, i5);
        }
        if (!this.f53570 && this.f53576 + this.f53577 == this.f53574) {
            this.f53570 = true;
        }
        if (!this.f53572 && this.f53565 + this.f53569 == this.f53566) {
            this.f53572 = true;
        }
        if (this.f53570 && this.f53572) {
            mo8462(this.f53580);
            mo8461(this.f53564, this.f53566, this.f53580);
            this.f53582 = false;
        }
        return this.f53568 + this.f53577 + this.f53567 + this.f53569;
    }

    @Override // l.AbstractC11422
    public String toString() {
        return new String(super.toString() + ",totalParameterCount=" + this.f53574 + ",totalDataCount=" + this.f53566 + ",parameterCount=" + this.f53577 + ",parameterOffset=" + this.f53573 + ",parameterDisplacement=" + this.f53576 + ",dataCount=" + this.f53569 + ",dataOffset=" + this.f53579 + ",dataDisplacement=" + this.f53565 + ",setupCount=" + this.f53584 + ",pad=" + this.f53568 + ",pad1=" + this.f53567);
    }
}
