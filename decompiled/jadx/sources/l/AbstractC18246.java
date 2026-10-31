package l;

import java.util.Enumeration;

/* JADX INFO: renamed from: l.ᩳᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9XX */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18246 extends AbstractC11422 implements Enumeration {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f56698;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f56699;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public int f56700;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public String f56701;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f56702;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f56703;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public int f56704;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public byte f56705;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public int f56706;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f56707;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public int f56708;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public int f56709;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public int f56710;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public int f56711;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public int f56712;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f56713;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public int f56714;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public byte[] f56715;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f56716;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean f56717;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f56718;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public int f56719;

    /* JADX INFO: renamed from: ۜ */
    public abstract int mo2483(int i, byte[] bArr);

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ۧ */
    public final int mo1306(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܽ */
    public final int mo1308(int i, byte[] bArr) {
        return 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo2484(byte[] bArr);

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo2485(int i, byte[] bArr);

    @Override // java.util.Enumeration
    public final /* bridge */ /* synthetic */ Object nextElement() {
        nextElement();
        return this;
    }

    public AbstractC18246(InterfaceC1023 interfaceC1023, byte b, byte b2) {
        super(interfaceC1023, b);
        this.f56711 = 0;
        this.f56710 = 0;
        this.f56713 = true;
        this.f56717 = true;
        this.f56700 = 0;
        this.f56712 = 1;
        this.f56701 = "";
        this.f56705 = b2;
        this.f56716 = ((C13722) interfaceC1023).m33003() - 512;
        this.f56702 = 1024;
        this.f56719 = 61;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m42529(int i) {
        this.f56718 = i;
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final void m42527() {
        this.f56716 = 1024;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m42531(byte[] bArr) {
        this.f56715 = bArr;
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m42532() {
        byte[] bArr = this.f56715;
        this.f56715 = null;
        return bArr;
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final byte m42528() {
        return this.f56705;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m42530(byte b) {
        this.f56705 = (byte) -41;
    }

    @Override // l.AbstractC11422, l.InterfaceC13927
    public final void reset() {
        super.reset();
        this.f56713 = true;
        this.f56717 = true;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f56713;
    }

    @Override // java.util.Enumeration
    public final void nextElement() {
        if (this.f56717) {
            this.f56717 = false;
            this.f56709 = C23202.m51496(this.f56712, 2, this.f56719, 2);
            if (mo10463() == 37 && !m28212()) {
                int i = this.f56709;
                this.f56709 = m28196(i, this.f56701) + i;
            }
            int i2 = this.f56709;
            int i3 = i2 % 4;
            int i4 = i3 == 0 ? 0 : 4 - i3;
            this.f56711 = i4;
            this.f56709 = i2 + i4;
            int iMo2484 = mo2484(this.f56715);
            this.f56714 = iMo2484;
            this.f56698 = iMo2484;
            int i5 = this.f56718 - this.f56709;
            int iMin = Math.min(iMo2484, i5);
            this.f56707 = iMin;
            int i6 = i5 - iMin;
            int i7 = this.f56709 + iMin;
            this.f56706 = i7;
            int i8 = i7 % 4;
            int i9 = i8 == 0 ? 0 : 4 - i8;
            this.f56710 = i9;
            this.f56706 = i7 + i9;
            int iMo2483 = mo2483(this.f56698, this.f56715);
            this.f56708 = iMo2483;
            this.f56703 = Math.min(iMo2483, i6);
        } else {
            if (mo10463() != -96) {
                mo10459(38);
            } else {
                mo10459(-95);
            }
            this.f56709 = 51;
            int i10 = this.f56714;
            int i11 = this.f56704;
            if (i10 - i11 > 0) {
                this.f56711 = 1;
                this.f56709 = 51 + 1;
            }
            int i12 = i11 + this.f56707;
            this.f56704 = i12;
            int i13 = (this.f56718 - this.f56709) - this.f56711;
            int iMin2 = Math.min(i10 - i12, i13);
            this.f56707 = iMin2;
            int i14 = i13 - iMin2;
            int i15 = this.f56709 + iMin2;
            this.f56706 = i15;
            int i16 = i15 % 4;
            int i17 = i16 == 0 ? 0 : 4 - i16;
            this.f56710 = i17;
            this.f56706 = i15 + i17;
            int i18 = this.f56699 + this.f56703;
            this.f56699 = i18;
            this.f56703 = Math.min(this.f56708 - i18, i14 - i17);
        }
        if (this.f56704 + this.f56707 < this.f56714 || this.f56699 + this.f56703 < this.f56708) {
            return;
        }
        this.f56713 = false;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        int iMo2485;
        C1480.m5122(this.f56714, i, bArr);
        C1480.m5122(this.f56708, i + 2, bArr);
        int i2 = i + 4;
        if (mo10463() != 38) {
            C1480.m5122(this.f56702, i2, bArr);
            C1480.m5122(this.f56716, i + 6, bArr);
            bArr[i + 8] = 0;
            bArr[i + 9] = 0;
            C1480.m5122(0, i + 10, bArr);
            C1480.m5124(this.f56700, i + 12, bArr);
            bArr[i + 16] = 0;
            i2 = i + 18;
            bArr[i + 17] = 0;
        }
        C1480.m5122(this.f56707, i2, bArr);
        C1480.m5122(this.f56709, i2 + 2, bArr);
        int i3 = i2 + 4;
        if (mo10463() == 38) {
            C1480.m5122(this.f56704, i3, bArr);
            i3 = i2 + 6;
        }
        C1480.m5122(this.f56703, i3, bArr);
        C1480.m5122(this.f56703 == 0 ? 0 : this.f56706, i3 + 2, bArr);
        int i4 = i3 + 4;
        if (mo10463() == 38) {
            C1480.m5122(this.f56699, i4, bArr);
            iMo2485 = i3 + 6;
        } else {
            int i5 = i3 + 5;
            bArr[i4] = (byte) this.f56712;
            int i6 = i3 + 6;
            bArr[i5] = 0;
            iMo2485 = i6 + mo2485(i6, bArr);
        }
        return iMo2485 - i;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        int iM28197 = ((mo10463() != 37 || m28212()) ? i : m28197(this.f56701, i, bArr) + i) + this.f56711;
        int i2 = this.f56707;
        if (i2 > 0) {
            System.arraycopy(this.f56715, 0, bArr, this.f34143 + this.f56709, i2);
            iM28197 = Math.max(iM28197, this.f34143 + this.f56709 + this.f56707 + this.f56710);
        }
        int i3 = this.f56703;
        if (i3 > 0) {
            System.arraycopy(this.f56715, this.f56698, bArr, this.f34143 + this.f56706, i3);
            int i4 = this.f56698;
            int i5 = this.f56703;
            this.f56698 = i4 + i5;
            iM28197 = Math.max(iM28197, this.f34143 + this.f56706 + i5);
        }
        return iM28197 - i;
    }

    @Override // l.AbstractC11422
    public String toString() {
        return new String(super.toString() + ",totalParameterCount=" + this.f56714 + ",totalDataCount=" + this.f56708 + ",maxParameterCount=" + this.f56702 + ",maxDataCount=" + this.f56716 + ",maxSetupCount=0,flags=0x" + C12085.m29467(0, 2) + ",timeout=" + this.f56700 + ",parameterCount=" + this.f56707 + ",parameterOffset=" + this.f56709 + ",parameterDisplacement=" + this.f56704 + ",dataCount=" + this.f56703 + ",dataOffset=" + this.f56706 + ",dataDisplacement=" + this.f56699 + ",setupCount=" + this.f56712 + ",pad=" + this.f56711 + ",pad1=" + this.f56710);
    }
}
