package p067l;

import java.util.Enumeration;

/* JADX INFO: renamed from: l.ܿᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 69YC */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19039 extends AbstractC13224 implements Enumeration {

    /* JADX INFO: renamed from: ֡֫ */
    public int f56755;

    /* JADX INFO: renamed from: ֨֫ */
    public int f56756;

    /* JADX INFO: renamed from: ֫ۧ */
    public int f56757;

    /* JADX INFO: renamed from: ۗ֫ */
    public int f56758;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f56759;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f56760;

    /* JADX INFO: renamed from: ۛ֫ */
    public boolean f56761;

    /* JADX INFO: renamed from: ۟֫ */
    public byte f56762;

    /* JADX INFO: renamed from: ۠֫ */
    public boolean f56763;

    /* JADX INFO: renamed from: ۤ֫ */
    public int f56764;

    /* JADX INFO: renamed from: ۧۧ */
    public int f56765;

    /* JADX INFO: renamed from: ۨ֫ */
    public InterfaceC15983[] f56766;

    /* JADX INFO: renamed from: ۫֫ */
    public int f56767;

    /* JADX INFO: renamed from: ۬֫ */
    public int f56768;

    /* JADX INFO: renamed from: ܰ֫ */
    public int f56769;

    /* JADX INFO: renamed from: ܶ֫ */
    public int f56770;

    /* JADX INFO: renamed from: ܽۧ */
    public byte[] f56771;

    /* JADX INFO: renamed from: ᩶֫ */
    public int f56772;

    /* JADX INFO: renamed from: ᩸֫ */
    public volatile boolean f56773;

    /* JADX INFO: renamed from: ᩹֫ */
    public volatile boolean f56774;

    /* JADX INFO: renamed from: ᩺֫ */
    public int f56775;

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo10508(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo10509(byte[] bArr);

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        return 0;
    }

    public AbstractC19039(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341);
        this.f56773 = true;
        this.f56774 = true;
    }

    public AbstractC19039(InterfaceC3341 interfaceC3341, int i) {
        super(interfaceC3341, (byte) 50);
        this.f56773 = true;
        this.f56774 = true;
        this.f56762 = (byte) 1;
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final int m43255() {
        return this.f56760;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m43259(byte[] bArr) {
        this.f56771 = bArr;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final byte[] m43261() {
        byte[] bArr = this.f56771;
        this.f56771 = null;
        return bArr;
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public final byte m43260() {
        return this.f56762;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m43257(byte b) {
        this.f56762 = b;
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final int m43253() {
        return this.f56769;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m43254(int i) {
        this.f56769 = i;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final int m43258() {
        return this.f56772;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m43256(int i) {
        this.f56772 = i;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final InterfaceC15983[] m43252() {
        return this.f56766;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43251(InterfaceC15983[] interfaceC15983Arr) {
        this.f56766 = interfaceC15983Arr;
    }

    @Override // p067l.AbstractC13224, p067l.InterfaceC15605
    public final void reset() {
        super.reset();
        this.f56755 = 0;
        this.f56773 = true;
        this.f56774 = true;
        this.f56763 = false;
        this.f56761 = false;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f37146 == 0 && this.f56773;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        if (this.f56774) {
            this.f56774 = false;
        }
        return this;
    }

    @Override // p067l.AbstractC13224, p067l.InterfaceC15605
    public final int decode(byte[] bArr) throws C19258 {
        int iDecode = super.decode(bArr);
        if (this.f37156 == 0) {
            mo3714(iDecode + 4, bArr);
        }
        if (this.f56774) {
            this.f56774 = false;
        }
        return iDecode;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        int iM7363 = C3775.m7363(i, bArr);
        this.f56765 = iM7363;
        if (this.f56755 == 0) {
            this.f56755 = iM7363;
        }
        this.f56757 = C3775.m7363(i + 2, bArr);
        this.f56768 = C3775.m7363(i + 6, bArr);
        this.f56764 = C3775.m7363(i + 8, bArr);
        this.f56767 = C3775.m7363(i + 10, bArr);
        this.f56760 = C3775.m7363(i + 12, bArr);
        this.f56770 = C3775.m7363(i + 14, bArr);
        this.f56756 = C3775.m7363(i + 16, bArr);
        this.f56775 = bArr[i + 18] & 255;
        return (i + 20) - i;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ۧ */
    public final int mo3714(int i, byte[] bArr) {
        this.f56758 = 0;
        this.f56759 = 0;
        int i2 = this.f56768;
        if (i2 > 0) {
            int i3 = this.f56764 - (i - this.f37139);
            this.f56759 = i3;
            int i4 = i + i3;
            System.arraycopy(bArr, i4, this.f56771, this.f56767, i2);
            i = i4 + this.f56768;
        }
        int i5 = this.f56760;
        if (i5 > 0) {
            int i6 = this.f56770 - (i - this.f37139);
            this.f56758 = i6;
            System.arraycopy(bArr, i + i6, this.f56771, this.f56755 + this.f56756, i5);
        }
        if (!this.f56761 && this.f56767 + this.f56768 == this.f56765) {
            this.f56761 = true;
        }
        if (!this.f56763 && this.f56756 + this.f56760 == this.f56757) {
            this.f56763 = true;
        }
        if (this.f56761 && this.f56763) {
            mo10509(this.f56771);
            mo10508(this.f56755, this.f56757, this.f56771);
            this.f56773 = false;
        }
        return this.f56759 + this.f56768 + this.f56758 + this.f56760;
    }

    @Override // p067l.AbstractC13224
    public String toString() {
        return new String(super.toString() + ",totalParameterCount=" + this.f56765 + ",totalDataCount=" + this.f56757 + ",parameterCount=" + this.f56768 + ",parameterOffset=" + this.f56764 + ",parameterDisplacement=" + this.f56767 + ",dataCount=" + this.f56760 + ",dataOffset=" + this.f56770 + ",dataDisplacement=" + this.f56756 + ",setupCount=" + this.f56775 + ",pad=" + this.f56759 + ",pad1=" + this.f56758);
    }
}
