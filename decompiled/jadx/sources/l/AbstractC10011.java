package l;

/* JADX INFO: renamed from: l.ۤۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZA1E */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10011 extends AbstractC11422 {

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f30149 = C11321.m27961(AbstractC10011.class);

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public AbstractC11422 f30150;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f30151;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public byte f30152;

    public AbstractC10011(InterfaceC1023 interfaceC1023, byte b, String str) {
        super(interfaceC1023, b, str);
        this.f30152 = (byte) -1;
        this.f30151 = 0;
        this.f30150 = null;
    }

    public AbstractC10011(InterfaceC1023 interfaceC1023) {
        this(interfaceC1023, null);
    }

    public AbstractC10011(InterfaceC1023 interfaceC1023, AbstractC11422 abstractC11422) {
        super(interfaceC1023);
        this.f30152 = (byte) -1;
        this.f30151 = 0;
        this.f30150 = abstractC11422;
        if (abstractC11422 != null) {
            this.f30152 = (byte) abstractC11422.mo10463();
        }
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11422 m25186() {
        return this.f30150;
    }

    @Override // l.AbstractC11422, l.InterfaceC7578
    /* JADX INFO: renamed from: getNext */
    public final InterfaceC7578 mo20322() {
        return this.f30150;
    }

    @Override // l.AbstractC11422, l.InterfaceC7578
    /* JADX INFO: renamed from: getNext */
    public final AbstractC11422 mo20322() {
        return this.f30150;
    }

    @Override // l.AbstractC11422, l.InterfaceC7578
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC7578 mo20322() {
        return this.f30150;
    }

    @Override // l.InterfaceC1543
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC1543 mo5290() {
        return this.f30150;
    }

    @Override // l.AbstractC11422, l.InterfaceC13927
    /* JADX INFO: renamed from: ֫ */
    public final int mo10430(int i, byte[] bArr) {
        this.f34143 = i;
        m28220(i, bArr);
        int i2 = i + 32;
        int i3 = i + 35;
        int iMo1311 = mo1311(i + 37, bArr);
        int i4 = iMo1311 + 4;
        int i5 = iMo1311 + 5 + i2;
        int i6 = i4 / 2;
        this.f34157 = i6;
        bArr[i2] = (byte) (i6 & 255);
        int i7 = i5 + 2;
        int iMo1309 = mo1309(i7, bArr);
        this.f34160 = iMo1309;
        bArr[i5] = (byte) (iMo1309 & 255);
        bArr[i5 + 1] = (byte) ((iMo1309 >> 8) & 255);
        int i8 = i7 + iMo1309;
        if (this.f30150 != null) {
            m28218().getClass();
        }
        this.f30152 = (byte) -1;
        this.f30150 = null;
        bArr[i + 33] = -1;
        bArr[i + 34] = 0;
        bArr[i3] = -34;
        bArr[i + 36] = -34;
        int i9 = ((i8 - i2) + i2) - i;
        this.f34147 = i9;
        C5777 c5777 = this.f34140;
        if (c5777 != null) {
            c5777.m16247(bArr, this.f34143, i9, this, mo5429());
        }
        return this.f34147;
    }

    @Override // l.AbstractC11422, l.InterfaceC13927
    public final int decode(byte[] bArr) throws C17771 {
        this.f34143 = 4;
        m28205(bArr);
        int iM25185 = m25185(36, bArr) + 32;
        this.f34147 = iM25185;
        if (m28230()) {
            System.arraycopy(bArr, 4, new byte[iM25185], 0, iM25185);
        }
        if (m28206(4, iM25185, bArr)) {
            return iM25185;
        }
        throw new C17771("Signature verification failed for ".concat(getClass().getName()));
    }

    public AbstractC10011(InterfaceC1023 interfaceC1023, byte b, AbstractC11422 abstractC11422) {
        super(interfaceC1023, b, null);
        this.f30152 = (byte) -1;
        this.f30151 = 0;
        this.f30150 = abstractC11422;
        if (abstractC11422 != null) {
            this.f30152 = (byte) abstractC11422.mo10463();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m25185(int i, byte[] bArr) {
        byte b;
        int i2 = i + 1;
        byte b2 = bArr[i];
        this.f34157 = b2;
        if (b2 != 0) {
            this.f30152 = bArr[i2];
            int iM5121 = C1480.m5121(i + 3, bArr);
            this.f30151 = iM5121;
            if (iM5121 == 0) {
                this.f30152 = (byte) -1;
            }
            if (this.f34157 > 2) {
                mo1308(i + 5, bArr);
                if (mo10463() == -94) {
                    C20635 c20635 = (C20635) this;
                    if (c20635.m47221() && c20635.m47219() != 1) {
                        this.f34157 += 8;
                    }
                }
            }
            i2 += this.f34157 * 2;
        }
        int iM5122 = C1480.m5121(i2, bArr);
        this.f34160 = iM5122;
        int iM25185 = i2 + 2;
        if (iM5122 != 0) {
            int iMo1306 = mo1306(iM25185, bArr);
            if (iMo1306 != this.f34160) {
                InterfaceC2148 interfaceC2148 = f30149;
                if (interfaceC2148.mo7099()) {
                    StringBuilder sbM32308 = C13325.m32308(iMo1306, "Short read, have ", ", want ");
                    sbM32308.append(this.f34160);
                    interfaceC2148.mo7101(sbM32308.toString());
                }
            }
            iM25185 += this.f34160;
        }
        if (this.f34150 != 0 || (b = this.f30152) == -1) {
            this.f30152 = (byte) -1;
            this.f30150 = null;
        } else {
            AbstractC11422 abstractC11422 = this.f30150;
            if (abstractC11422 == null) {
                this.f30152 = (byte) -1;
                throw new C13017("no andx command supplied with response");
            }
            int i3 = this.f34143;
            int i4 = this.f30151 + i3;
            abstractC11422.f34143 = i3;
            abstractC11422.mo10459(b);
            AbstractC11422 abstractC11423 = this.f30150;
            abstractC11423.f34150 = this.f34150;
            abstractC11423.m28201(m28223());
            AbstractC11422 abstractC11424 = this.f30150;
            abstractC11424.f34162 = this.f34162;
            abstractC11424.f34144 = this.f34144;
            abstractC11424.f34155 = this.f34155;
            abstractC11424.f34153 = this.f34153;
            abstractC11424.f34154 = this.f34154;
            abstractC11424.m28217(m28215());
            AbstractC11422 abstractC11425 = this.f30150;
            if (abstractC11425 instanceof AbstractC10011) {
                iM25185 = i4 + ((AbstractC10011) abstractC11425).m25185(i4, bArr);
            } else {
                int iMo1308 = i4 + 1;
                int i5 = abstractC11425.f34157;
                bArr[i4] = (byte) (i5 & 255);
                if (i5 != 0 && i5 > 2) {
                    iMo1308 += abstractC11425.mo1308(iMo1308, bArr);
                }
                this.f30150.f34160 = C1480.m5121(iMo1308, bArr);
                int i6 = iMo1308 + 2;
                AbstractC11422 abstractC11426 = this.f30150;
                if (abstractC11426.f34160 != 0) {
                    abstractC11426.mo1306(i6, bArr);
                    i6 += this.f30150.f34160;
                }
                iM25185 = i6;
            }
            this.f30150.mo28228();
        }
        return iM25185 - i;
    }

    @Override // l.AbstractC11422
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(",andxCommand=0x");
        C19033.m43886(this.f30152, 2, ",andxOffset=", sb);
        sb.append(this.f30151);
        return new String(sb.toString());
    }
}
