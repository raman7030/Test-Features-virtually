package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F67X */
/* JADX INFO: loaded from: classes4.dex */
public final class C16419 extends AbstractC4310 {

    /* JADX INFO: renamed from: ۧ */
    public int f48270;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f48271;

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ֫ */
    public final int mo8841(int i) {
        return (i % 2) + ((this.f48271.length + 1) / 2) + 4;
    }

    public C16419(int i, byte[] bArr) {
        super(EnumC25097.f80112);
        if (bArr.length % i != 0) {
            throw new RuntimeException(C19768.m44906(i, "There are not a whole number of ", " byte elements"));
        }
        this.f48270 = i;
        this.f48271 = bArr;
    }

    public C16419(byte[] bArr, int i) {
        super(EnumC25097.f80112);
        if (bArr[i] != 0) {
            throw new RuntimeException("Invalid opcode byte for an ArrayData pseudo-instruction");
        }
        if (bArr[i + 1] != 3) {
            throw new RuntimeException("Invalid sub-opcode byte for an ArrayData pseudo-instruction");
        }
        int iM30920 = C13590.m30920(i + 2, bArr);
        this.f48270 = iM30920;
        int iM30908 = C13590.m30908(i + 4, bArr) * iM30920;
        byte[] bArr2 = new byte[iM30908];
        this.f48271 = bArr2;
        System.arraycopy(bArr, i + 8, bArr2, 0, iM30908);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7525(4);
        byte[] bArr = this.f48271;
        int length = bArr.length;
        int i2 = this.f48270;
        c3838.m7529(0);
        c3838.m7529(3);
        c3838.m7533(i2);
        c3838.m7531(length / i2);
        c3838.m7527(bArr, 0, bArr.length);
        c3838.m7525(2);
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.ArrayData;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m37318() {
        return this.f48270;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m37317() {
        return this.f48271.length / this.f48270;
    }

    /* JADX INFO: renamed from: ۖ */
    public final Iterator m37316() {
        return new C19773(this);
    }
}
