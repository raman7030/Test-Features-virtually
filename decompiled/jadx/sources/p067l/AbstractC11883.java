package p067l;

/* JADX INFO: renamed from: l.ۤۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZA1E */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11883 extends AbstractC13224 {

    /* JADX INFO: renamed from: ۠֫ */
    public static final InterfaceC4410 f33109 = C13128.m30022(AbstractC11883.class);

    /* JADX INFO: renamed from: ֡֫ */
    public AbstractC13224 f33110;

    /* JADX INFO: renamed from: ֨֫ */
    public int f33111;

    /* JADX INFO: renamed from: ۚ֫ */
    public byte f33112;

    public AbstractC11883(InterfaceC3341 interfaceC3341, byte b, String str) {
        super(interfaceC3341, b, str);
        this.f33112 = (byte) -1;
        this.f33111 = 0;
        this.f33110 = null;
    }

    public AbstractC11883(InterfaceC3341 interfaceC3341) {
        this(interfaceC3341, null);
    }

    public AbstractC11883(InterfaceC3341 interfaceC3341, AbstractC13224 abstractC13224) {
        super(interfaceC3341);
        this.f33112 = (byte) -1;
        this.f33111 = 0;
        this.f33110 = abstractC13224;
        if (abstractC13224 != null) {
            this.f33112 = (byte) abstractC13224.mo12502();
        }
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final AbstractC13224 m27203() {
        return this.f33110;
    }

    @Override // p067l.AbstractC13224, p067l.InterfaceC9571
    /* JADX INFO: renamed from: getNext */
    public final InterfaceC9571 mo22299() {
        return this.f33110;
    }

    @Override // p067l.AbstractC13224, p067l.InterfaceC9571
    /* JADX INFO: renamed from: getNext */
    public final AbstractC13224 mo22299() {
        return this.f33110;
    }

    @Override // p067l.AbstractC13224, p067l.InterfaceC9571
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC9571 mo22299() {
        return this.f33110;
    }

    @Override // p067l.InterfaceC3835
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC3835 mo7519() {
        return this.f33110;
    }

    @Override // p067l.AbstractC13224, p067l.InterfaceC15605
    /* JADX INFO: renamed from: ֫ */
    public final int mo12469(int i, byte[] bArr) {
        this.f37139 = i;
        m30264(i, bArr);
        int i2 = i + 32;
        int i3 = i + 35;
        int iMo3719 = mo3719(i + 37, bArr);
        int i4 = iMo3719 + 4;
        int i5 = iMo3719 + 5 + i2;
        int i6 = i4 / 2;
        this.f37153 = i6;
        bArr[i2] = (byte) (i6 & 255);
        int i7 = i5 + 2;
        int iMo3717 = mo3717(i7, bArr);
        this.f37156 = iMo3717;
        bArr[i5] = (byte) (iMo3717 & 255);
        bArr[i5 + 1] = (byte) ((iMo3717 >> 8) & 255);
        int i8 = i7 + iMo3717;
        if (this.f33110 != null) {
            m30262().getClass();
        }
        this.f33112 = (byte) -1;
        this.f33110 = null;
        bArr[i + 33] = -1;
        bArr[i + 34] = 0;
        bArr[i3] = -34;
        bArr[i + 36] = -34;
        int i9 = ((i8 - i2) + i2) - i;
        this.f37143 = i9;
        C7859 c7859 = this.f37136;
        if (c7859 != null) {
            c7859.m18167(bArr, this.f37139, i9, this, mo7658());
        }
        return this.f37143;
    }

    @Override // p067l.AbstractC13224, p067l.InterfaceC15605
    public final int decode(byte[] bArr) throws C19258 {
        this.f37139 = 4;
        m30249(bArr);
        int iM27202 = m27202(36, bArr) + 32;
        this.f37143 = iM27202;
        if (m30274()) {
            System.arraycopy(bArr, 4, new byte[iM27202], 0, iM27202);
        }
        if (m30250(4, iM27202, bArr)) {
            return iM27202;
        }
        throw new C19258("Signature verification failed for ".concat(getClass().getName()));
    }

    public AbstractC11883(InterfaceC3341 interfaceC3341, byte b, AbstractC13224 abstractC13224) {
        super(interfaceC3341, b, null);
        this.f33112 = (byte) -1;
        this.f33111 = 0;
        this.f33110 = abstractC13224;
        if (abstractC13224 != null) {
            this.f33112 = (byte) abstractC13224.mo12502();
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m27202(int i, byte[] bArr) {
        byte b;
        int i2 = i + 1;
        byte b2 = bArr[i];
        this.f37153 = b2;
        if (b2 != 0) {
            this.f33112 = bArr[i2];
            int iM7363 = C3775.m7363(i + 3, bArr);
            this.f33111 = iM7363;
            if (iM7363 == 0) {
                this.f33112 = (byte) -1;
            }
            if (this.f37153 > 2) {
                mo3716(i + 5, bArr);
                if (mo12502() == -94) {
                    C21980 c21980 = (C21980) this;
                    if (c21980.m49548() && c21980.m49546() != 1) {
                        this.f37153 += 8;
                    }
                }
            }
            i2 += this.f37153 * 2;
        }
        int iM7364 = C3775.m7363(i2, bArr);
        this.f37156 = iM7364;
        int iM27202 = i2 + 2;
        if (iM7364 != 0) {
            int iMo3714 = mo3714(iM27202, bArr);
            if (iMo3714 != this.f37156) {
                InterfaceC4410 interfaceC4410 = f33109;
                if (interfaceC4410.mo9194()) {
                    StringBuilder sbM34408 = C15033.m34408(iMo3714, "Short read, have ", ", want ");
                    sbM34408.append(this.f37156);
                    interfaceC4410.mo9196(sbM34408.toString());
                }
            }
            iM27202 += this.f37156;
        }
        if (this.f37146 != 0 || (b = this.f33112) == -1) {
            this.f33112 = (byte) -1;
            this.f33110 = null;
        } else {
            AbstractC13224 abstractC13224 = this.f33110;
            if (abstractC13224 == null) {
                this.f33112 = (byte) -1;
                throw new C14740("no andx command supplied with response");
            }
            int i3 = this.f37139;
            int i4 = this.f33111 + i3;
            abstractC13224.f37139 = i3;
            abstractC13224.mo12498(b);
            AbstractC13224 abstractC13225 = this.f33110;
            abstractC13225.f37146 = this.f37146;
            abstractC13225.m30245(m30267());
            AbstractC13224 abstractC13226 = this.f33110;
            abstractC13226.f37158 = this.f37158;
            abstractC13226.f37140 = this.f37140;
            abstractC13226.f37151 = this.f37151;
            abstractC13226.f37149 = this.f37149;
            abstractC13226.f37150 = this.f37150;
            abstractC13226.m30261(m30259());
            AbstractC13224 abstractC13227 = this.f33110;
            if (abstractC13227 instanceof AbstractC11883) {
                iM27202 = i4 + ((AbstractC11883) abstractC13227).m27202(i4, bArr);
            } else {
                int iMo3716 = i4 + 1;
                int i5 = abstractC13227.f37153;
                bArr[i4] = (byte) (i5 & 255);
                if (i5 != 0 && i5 > 2) {
                    iMo3716 += abstractC13227.mo3716(iMo3716, bArr);
                }
                this.f33110.f37156 = C3775.m7363(iMo3716, bArr);
                int i6 = iMo3716 + 2;
                AbstractC13224 abstractC13228 = this.f33110;
                if (abstractC13228.f37156 != 0) {
                    abstractC13228.mo3714(i6, bArr);
                    i6 += this.f33110.f37156;
                }
                iM27202 = i6;
            }
            this.f33110.mo30272();
        }
        return iM27202 - i;
    }

    @Override // p067l.AbstractC13224
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(",andxCommand=0x");
        C20458.m46154(this.f33112, 2, ",andxOffset=", sb);
        sb.append(this.f33111);
        return new String(sb.toString());
    }
}
