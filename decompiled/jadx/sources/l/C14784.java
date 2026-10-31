package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F67X */
/* JADX INFO: loaded from: classes4.dex */
public final class C14784 extends AbstractC2043 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f45156;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f45157;

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ֫ */
    public final int mo6715(int i) {
        return (i % 2) + ((this.f45157.length + 1) / 2) + 4;
    }

    public C14784(int i, byte[] bArr) {
        super(EnumC23915.f77361);
        if (bArr.length % i != 0) {
            throw new RuntimeException(C18307.m42645(i, "There are not a whole number of ", " byte elements"));
        }
        this.f45156 = i;
        this.f45157 = bArr;
    }

    public C14784(byte[] bArr, int i) {
        super(EnumC23915.f77361);
        if (bArr[i] != 0) {
            throw new RuntimeException("Invalid opcode byte for an ArrayData pseudo-instruction");
        }
        if (bArr[i + 1] != 3) {
            throw new RuntimeException("Invalid sub-opcode byte for an ArrayData pseudo-instruction");
        }
        int iM28871 = C11807.m28871(i + 2, bArr);
        this.f45156 = iM28871;
        int iM28859 = C11807.m28859(i + 4, bArr) * iM28871;
        byte[] bArr2 = new byte[iM28859];
        this.f45157 = bArr2;
        System.arraycopy(bArr, i + 8, bArr2, 0, iM28859);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5296(4);
        byte[] bArr = this.f45157;
        int length = bArr.length;
        int i2 = this.f45156;
        c1547.m5300(0);
        c1547.m5300(3);
        c1547.m5304(i2);
        c1547.m5302(length / i2);
        c1547.m5298(bArr, 0, bArr.length);
        c1547.m5296(2);
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.ArrayData;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m35171() {
        return this.f45156;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m35170() {
        return this.f45157.length / this.f45156;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Iterator m35169() {
        return new C18313(this);
    }
}
