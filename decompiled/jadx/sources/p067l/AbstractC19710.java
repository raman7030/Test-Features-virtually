package p067l;

import java.util.Enumeration;

/* JADX INFO: renamed from: l.ᩳᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9XX */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19710 extends AbstractC13224 implements Enumeration {

    /* JADX INFO: renamed from: ֡֫ */
    public int f59916;

    /* JADX INFO: renamed from: ֨֫ */
    public int f59917;

    /* JADX INFO: renamed from: ֫ۧ */
    public int f59918;

    /* JADX INFO: renamed from: ۗ֫ */
    public String f59919;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f59920;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f59921;

    /* JADX INFO: renamed from: ۛ֫ */
    public int f59922;

    /* JADX INFO: renamed from: ۟֫ */
    public byte f59923;

    /* JADX INFO: renamed from: ۠֫ */
    public int f59924;

    /* JADX INFO: renamed from: ۤ֫ */
    public int f59925;

    /* JADX INFO: renamed from: ۧۧ */
    public int f59926;

    /* JADX INFO: renamed from: ۨ֫ */
    public int f59927;

    /* JADX INFO: renamed from: ۫֫ */
    public int f59928;

    /* JADX INFO: renamed from: ۬֫ */
    public int f59929;

    /* JADX INFO: renamed from: ܰ֫ */
    public int f59930;

    /* JADX INFO: renamed from: ܶ֫ */
    public boolean f59931;

    /* JADX INFO: renamed from: ܽۧ */
    public int f59932;

    /* JADX INFO: renamed from: ᩳۧ */
    public byte[] f59933;

    /* JADX INFO: renamed from: ᩶֫ */
    public int f59934;

    /* JADX INFO: renamed from: ᩸֫ */
    public boolean f59935;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f59936;

    /* JADX INFO: renamed from: ᩺֫ */
    public int f59937;

    /* JADX INFO: renamed from: ۜ */
    public abstract int mo4839(int i, byte[] bArr);

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ۧ */
    public final int mo3714(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        return 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo4840(byte[] bArr);

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo4841(int i, byte[] bArr);

    @Override // java.util.Enumeration
    public final /* bridge */ /* synthetic */ Object nextElement() {
        nextElement();
        return this;
    }

    public AbstractC19710(InterfaceC3341 interfaceC3341, byte b, byte b2) {
        super(interfaceC3341, b);
        this.f59929 = 0;
        this.f59928 = 0;
        this.f59931 = true;
        this.f59935 = true;
        this.f59918 = 0;
        this.f59930 = 1;
        this.f59919 = "";
        this.f59923 = b2;
        this.f59934 = ((C15410) interfaceC3341).m35117() - 512;
        this.f59920 = 1024;
        this.f59937 = 61;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m44788(int i) {
        this.f59936 = i;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final void m44786() {
        this.f59934 = 1024;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m44790(byte[] bArr) {
        this.f59933 = bArr;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final byte[] m44791() {
        byte[] bArr = this.f59933;
        this.f59933 = null;
        return bArr;
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final byte m44787() {
        return this.f59923;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m44789(byte b) {
        this.f59923 = (byte) -41;
    }

    @Override // p067l.AbstractC13224, p067l.InterfaceC15605
    public final void reset() {
        super.reset();
        this.f59931 = true;
        this.f59935 = true;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f59931;
    }

    @Override // java.util.Enumeration
    public final void nextElement() {
        if (this.f59935) {
            this.f59935 = false;
            this.f59927 = C24420.m53892(this.f59930, 2, this.f59937, 2);
            if (mo12502() == 37 && !m30256()) {
                int i = this.f59927;
                this.f59927 = m30240(i, this.f59919) + i;
            }
            int i2 = this.f59927;
            int i3 = i2 % 4;
            int i4 = i3 == 0 ? 0 : 4 - i3;
            this.f59929 = i4;
            this.f59927 = i2 + i4;
            int iMo4840 = mo4840(this.f59933);
            this.f59932 = iMo4840;
            this.f59916 = iMo4840;
            int i5 = this.f59936 - this.f59927;
            int iMin = Math.min(iMo4840, i5);
            this.f59925 = iMin;
            int i6 = i5 - iMin;
            int i7 = this.f59927 + iMin;
            this.f59924 = i7;
            int i8 = i7 % 4;
            int i9 = i8 == 0 ? 0 : 4 - i8;
            this.f59928 = i9;
            this.f59924 = i7 + i9;
            int iMo4839 = mo4839(this.f59916, this.f59933);
            this.f59926 = iMo4839;
            this.f59921 = Math.min(iMo4839, i6);
        } else {
            if (mo12502() != -96) {
                mo12498(38);
            } else {
                mo12498(-95);
            }
            this.f59927 = 51;
            int i10 = this.f59932;
            int i11 = this.f59922;
            if (i10 - i11 > 0) {
                this.f59929 = 1;
                this.f59927 = 51 + 1;
            }
            int i12 = i11 + this.f59925;
            this.f59922 = i12;
            int i13 = (this.f59936 - this.f59927) - this.f59929;
            int iMin2 = Math.min(i10 - i12, i13);
            this.f59925 = iMin2;
            int i14 = i13 - iMin2;
            int i15 = this.f59927 + iMin2;
            this.f59924 = i15;
            int i16 = i15 % 4;
            int i17 = i16 == 0 ? 0 : 4 - i16;
            this.f59928 = i17;
            this.f59924 = i15 + i17;
            int i18 = this.f59917 + this.f59921;
            this.f59917 = i18;
            this.f59921 = Math.min(this.f59926 - i18, i14 - i17);
        }
        if (this.f59922 + this.f59925 < this.f59932 || this.f59917 + this.f59921 < this.f59926) {
            return;
        }
        this.f59931 = false;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        int iMo4841;
        C3775.m7364(this.f59932, i, bArr);
        C3775.m7364(this.f59926, i + 2, bArr);
        int i2 = i + 4;
        if (mo12502() != 38) {
            C3775.m7364(this.f59920, i2, bArr);
            C3775.m7364(this.f59934, i + 6, bArr);
            bArr[i + 8] = 0;
            bArr[i + 9] = 0;
            C3775.m7364(0, i + 10, bArr);
            C3775.m7366(this.f59918, i + 12, bArr);
            bArr[i + 16] = 0;
            i2 = i + 18;
            bArr[i + 17] = 0;
        }
        C3775.m7364(this.f59925, i2, bArr);
        C3775.m7364(this.f59927, i2 + 2, bArr);
        int i3 = i2 + 4;
        if (mo12502() == 38) {
            C3775.m7364(this.f59922, i3, bArr);
            i3 = i2 + 6;
        }
        C3775.m7364(this.f59921, i3, bArr);
        C3775.m7364(this.f59921 == 0 ? 0 : this.f59924, i3 + 2, bArr);
        int i4 = i3 + 4;
        if (mo12502() == 38) {
            C3775.m7364(this.f59917, i4, bArr);
            iMo4841 = i3 + 6;
        } else {
            int i5 = i3 + 5;
            bArr[i4] = (byte) this.f59930;
            int i6 = i3 + 6;
            bArr[i5] = 0;
            iMo4841 = i6 + mo4841(i6, bArr);
        }
        return iMo4841 - i;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        int iM30241 = ((mo12502() != 37 || m30256()) ? i : m30241(this.f59919, i, bArr) + i) + this.f59929;
        int i2 = this.f59925;
        if (i2 > 0) {
            System.arraycopy(this.f59933, 0, bArr, this.f37139 + this.f59927, i2);
            iM30241 = Math.max(iM30241, this.f37139 + this.f59927 + this.f59925 + this.f59928);
        }
        int i3 = this.f59921;
        if (i3 > 0) {
            System.arraycopy(this.f59933, this.f59916, bArr, this.f37139 + this.f59924, i3);
            int i4 = this.f59916;
            int i5 = this.f59921;
            this.f59916 = i4 + i5;
            iM30241 = Math.max(iM30241, this.f37139 + this.f59924 + i5);
        }
        return iM30241 - i;
    }

    @Override // p067l.AbstractC13224
    public String toString() {
        return new String(super.toString() + ",totalParameterCount=" + this.f59932 + ",totalDataCount=" + this.f59926 + ",maxParameterCount=" + this.f59920 + ",maxDataCount=" + this.f59934 + ",maxSetupCount=0,flags=0x" + C13854.m31529(0, 2) + ",timeout=" + this.f59918 + ",parameterCount=" + this.f59925 + ",parameterOffset=" + this.f59927 + ",parameterDisplacement=" + this.f59922 + ",dataCount=" + this.f59921 + ",dataOffset=" + this.f59924 + ",dataDisplacement=" + this.f59917 + ",setupCount=" + this.f59930 + ",pad=" + this.f59929 + ",pad1=" + this.f59928);
    }
}
