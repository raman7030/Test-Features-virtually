package p067l;

/* JADX INFO: renamed from: l.ۗᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NA29 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5628 implements InterfaceC15605 {

    /* JADX INFO: renamed from: ֫֫ */
    public int f13620;

    /* JADX INFO: renamed from: ۗ */
    public InterfaceC3341 f13621;

    /* JADX INFO: renamed from: ۙ */
    public int f13622;

    /* JADX INFO: renamed from: ۛ */
    public int f13623;

    /* JADX INFO: renamed from: ۜ֫ */
    public int f13624;

    /* JADX INFO: renamed from: ۟ */
    public AbstractC5628 f13625;

    /* JADX INFO: renamed from: ۤ */
    public C8310 f13626;

    /* JADX INFO: renamed from: ۧ֫ */
    public byte[] f13627;

    /* JADX INFO: renamed from: ۨ */
    public int f13628;

    /* JADX INFO: renamed from: ۫ */
    public int f13629;

    /* JADX INFO: renamed from: ۬ */
    public int f13630;

    /* JADX INFO: renamed from: ܰ */
    public long f13631;

    /* JADX INFO: renamed from: ܳ֫ */
    public byte[] f13632;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f13633;

    /* JADX INFO: renamed from: ܿ֫ */
    public long f13634;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f13635;

    /* JADX INFO: renamed from: ᩶ */
    public int f13636;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f13637;

    /* JADX INFO: renamed from: ᩹ */
    public long f13638;

    /* JADX INFO: renamed from: ᩺ */
    public int f13639;

    /* JADX INFO: renamed from: ᩻֫ */
    public int f13640;

    /* JADX INFO: renamed from: ֫ */
    public void mo12472(int i, int i2, byte[] bArr) {
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ֫ */
    public final void mo12476(boolean z) {
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo8760(int i, byte[] bArr);

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ۧ */
    public AbstractC14345 mo7658() {
        return null;
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ۧ */
    public final void mo12486(int i) {
    }

    /* JADX INFO: renamed from: ᩳ */
    public abstract int mo8765(int i, byte[] bArr);

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC3835 m12505() {
        return (InterfaceC3835) getNext();
    }

    public AbstractC5628(InterfaceC3341 interfaceC3341) {
        this.f13632 = new byte[16];
        this.f13626 = null;
        this.f13621 = interfaceC3341;
    }

    public AbstractC5628(InterfaceC3341 interfaceC3341, int i) {
        this.f13632 = new byte[16];
        this.f13626 = null;
        this.f13621 = interfaceC3341;
        this.f13622 = i;
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public final InterfaceC3341 m12497() {
        return this.f13621;
    }

    @Override // p067l.InterfaceC15605
    public void reset() {
        this.f13623 = 0;
        this.f13626 = null;
        this.f13634 = 0L;
        this.f13624 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public void m12471(int i) {
        m12481(i);
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ᩶ */
    public final int mo12502() {
        return this.f13622;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m12503(int i) {
        this.f13633 = i;
    }

    /* JADX INFO: renamed from: ۨ */
    public final boolean m12490() {
        return this.f13637;
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ܿ */
    public final void mo12498(int i) {
        this.f13622 = i;
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final int m12483() {
        return this.f13624;
    }

    /* JADX INFO: renamed from: ᩺ */
    public int m12506() {
        return m12483();
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m12484(int i) {
        this.f13624 = i;
        AbstractC5628 abstractC5628 = this.f13625;
        if (abstractC5628 != null) {
            abstractC5628.m12484(i);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public void m12500(int i) {
        m12484(i);
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final long m12489() {
        return this.f13638;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m12496(long j) {
        this.f13638 = j;
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public final int m12501() {
        return this.f13630;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m12481(int i) {
        this.f13630 = i;
    }

    public int getErrorCode() {
        return m12485();
    }

    @Override // p067l.InterfaceC13184
    /* JADX INFO: renamed from: ֡ */
    public final void mo12468() {
        this.f13635 = true;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final boolean m12479() {
        return this.f13635;
    }

    /* JADX INFO: renamed from: ܶ */
    public int m12493() {
        return m12501();
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final byte[] m12482() {
        return this.f13627;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12488(byte[] bArr) {
        this.f13627 = bArr;
    }

    @Override // p067l.InterfaceC15605
    public final C8310 getDigest() {
        return this.f13626;
    }

    @Override // p067l.InterfaceC15605
    public final InterfaceC18587 getDigest() {
        return this.f13626;
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ֫ */
    public final void mo12475(InterfaceC18587 interfaceC18587) {
        this.f13626 = (C8310) interfaceC18587;
        AbstractC5628 abstractC5628 = this.f13625;
        if (abstractC5628 != null) {
            abstractC5628.mo12475(interfaceC18587);
        }
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final int m12485() {
        return this.f13640;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean mo12494() {
        return this.f13640 != 0;
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final long m12504() {
        return this.f13634;
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ۧ */
    public final void mo12487(long j) {
        this.f13634 = j;
        AbstractC5628 abstractC5628 = this.f13625;
        if (abstractC5628 != null) {
            abstractC5628.mo12487(j);
        }
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final int m12499() {
        return this.f13623;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m12491(int i) {
        this.f13623 = i | this.f13623;
    }

    /* JADX INFO: renamed from: ֫֫ */
    public final void m12478() {
        this.f13623 &= -5;
    }

    /* JADX INFO: renamed from: ۜ */
    public final long m12480() {
        return this.f13631;
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ֫ */
    public final void mo12473(long j) {
        this.f13631 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo12477(AbstractC5628 abstractC5628) {
        AbstractC5628 abstractC5629 = this.f13625;
        if (abstractC5629 != null) {
            return abstractC5629.mo12477(abstractC5628);
        }
        abstractC5628.m12491(4);
        this.f13625 = abstractC5628;
        return true;
    }

    public final AbstractC5628 getNext() {
        return this.f13625;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12474(AbstractC14345 abstractC14345) {
        this.f13625 = abstractC14345;
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final int m12492() {
        return this.f13628;
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final int m12508() {
        return this.f13639;
    }

    @Override // p067l.InterfaceC15605
    /* JADX INFO: renamed from: ֫ */
    public int mo12469(int i, byte[] bArr) {
        this.f13628 = i;
        System.arraycopy(C3775.f8083, 0, bArr, i, 68);
        C3775.m7364(this.f13629, i + 6, bArr);
        C3775.m7364(this.f13622, i + 12, bArr);
        C3775.m7364(this.f13630, i + 14, bArr);
        C3775.m7366(this.f13623, i + 16, bArr);
        int i2 = i + 20;
        C3775.m7366(this.f13620, i2, bArr);
        C3775.m7368(this.f13631, i + 24, bArr);
        if (this.f13637) {
            C3775.m7368(this.f13638, i + 32, bArr);
            C3775.m7368(this.f13634, i + 40, bArr);
        } else {
            C3775.m7366(this.f13624, i + 36, bArr);
            C3775.m7368(this.f13634, i + 40, bArr);
        }
        int i3 = i + 64;
        int iMo8765 = mo8765(i3, bArr);
        this.f13636 = iMo8765;
        int i4 = i3 + iMo8765;
        int iM12507 = i4 + m12507(i4);
        int i5 = iM12507 - i;
        this.f13639 = i5;
        AbstractC5628 abstractC5628 = this.f13625;
        if (abstractC5628 != null) {
            int iMo12469 = abstractC5628.mo12469(iM12507, bArr) + iM12507;
            C3775.m7366(i5, i2, bArr);
            i5 += iMo12469 - iM12507;
        }
        C8310 c8310 = this.f13626;
        if (c8310 != null) {
            c8310.m19165(bArr, this.f13628, this.f13639, this, mo7658());
        }
        if (this.f13635) {
            byte[] bArr2 = new byte[i5];
            this.f13627 = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, i5);
        }
        return i5;
    }

    /* JADX INFO: renamed from: ۡ */
    public static final int m12467(int i) {
        int i2 = i % 8;
        if (i2 == 0) {
            return i;
        }
        if (i2 < 0) {
            i2 += 8;
        }
        return (i + 8) - i2;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m12507(int i) {
        int i2 = (i - this.f13628) % 8;
        if (i2 == 0) {
            return 0;
        }
        return 8 - i2;
    }

    @Override // p067l.InterfaceC15605
    public final int decode(byte[] bArr) {
        return m12470(bArr, 4, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m12470(byte[] bArr, int i, boolean z) throws C19258 {
        int iMo8760;
        int i2;
        int iM12507;
        int i3;
        this.f13628 = i;
        C3775.m7365(i, bArr);
        C3775.m7363(i + 4, bArr);
        this.f13629 = C3775.m7363(i + 6, bArr);
        this.f13640 = C3775.m7365(i + 8, bArr);
        this.f13622 = C3775.m7363(i + 12, bArr);
        this.f13630 = C3775.m7363(i + 14, bArr);
        this.f13623 = C3775.m7365(i + 16, bArr);
        this.f13620 = C3775.m7365(i + 20, bArr);
        this.f13631 = C3775.m7367(i + 24, bArr);
        int i4 = i + 32;
        int i5 = this.f13623 & 2;
        byte[] bArr2 = this.f13632;
        if (i5 == 2) {
            this.f13637 = true;
            this.f13638 = C3775.m7367(i4, bArr);
            this.f13634 = C3775.m7367(i + 40, bArr);
            System.arraycopy(bArr, i + 48, bArr2, 0, 16);
        } else {
            this.f13637 = false;
            this.f13624 = C3775.m7365(i + 36, bArr);
            this.f13634 = C3775.m7367(i + 40, bArr);
            System.arraycopy(bArr, i + 48, bArr2, 0, 16);
        }
        int i6 = i + 64;
        if (mo12494()) {
            iMo8760 = m12495(i6, bArr);
        } else {
            iMo8760 = mo8760(i6, bArr);
        }
        int i7 = i6 + iMo8760;
        int i8 = i7 - i;
        this.f13639 = i8;
        int i9 = this.f13620;
        if (i9 != 0) {
            iM12507 = m12507(i7);
        } else {
            if (z && i9 == 0 && (i2 = this.f13633) > 0) {
                iM12507 = i2 - i8;
            }
            mo12472(i, i8, bArr);
            i3 = this.f13620;
            if (i3 != 0 || this.f13625 == null || i3 % 8 == 0) {
                return i8;
            }
            throw new C19258("Chained command is not aligned");
        }
        i8 += iM12507;
        mo12472(i, i8, bArr);
        i3 = this.f13620;
        if (i3 != 0) {
        }
        return i8;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m12495(int i, byte[] bArr) throws C19258 {
        if (C3775.m7363(i, bArr) != 9) {
            throw new C19258("Error structureSize should be 9");
        }
        byte b = bArr[i + 2];
        int iM7365 = C3775.m7365(i + 4, bArr);
        int i2 = i + 8;
        if (iM7365 > 0) {
            System.arraycopy(bArr, i2, new byte[iM7365], 0, iM7365);
            i2 += iM7365;
        }
        return i2 - i;
    }

    public final int hashCode() {
        return (int) this.f13631;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC5628) && ((AbstractC5628) obj).f13631 == this.f13631;
    }

    public String toString() {
        String str;
        switch (this.f13622) {
            case 0:
                str = "SMB2_NEGOTIATE";
                break;
            case 1:
                str = "SMB2_SESSION_SETUP";
                break;
            case 2:
                str = "SMB2_LOGOFF";
                break;
            case 3:
                str = "SMB2_TREE_CONNECT";
                break;
            case 4:
                str = "SMB2_TREE_DISCONNECT";
                break;
            case 5:
                str = "SMB2_CREATE";
                break;
            case 6:
                str = "SMB2_CLOSE";
                break;
            case 7:
                str = "SMB2_FLUSH";
                break;
            case 8:
                str = "SMB2_READ";
                break;
            case 9:
                str = "SMB2_WRITE";
                break;
            case 10:
                str = "SMB2_LOCK";
                break;
            case 11:
                str = "SMB2_IOCTL";
                break;
            case 12:
                str = "SMB2_CANCEL";
                break;
            case 13:
                str = "SMB2_ECHO";
                break;
            case 14:
                str = "SMB2_QUERY_DIRECTORY";
                break;
            case 15:
                str = "SMB2_CHANGE_NOTIFY";
                break;
            case 16:
                str = "SMB2_QUERY_INFO";
                break;
            case 17:
                str = "SMB2_SET_INFO";
                break;
            case 18:
                str = "SMB2_OPLOCK_BREAK";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        int i = this.f13640;
        StringBuilder sbM12525 = C5633.m12525("command=", str, ",status=", i == 0 ? "0" : C5255.m11330(i), ",flags=0x");
        C20458.m46154(this.f13623, 4, ",mid=", sbM12525);
        sbM12525.append(this.f13631);
        sbM12525.append(",wordCount=0,byteCount=");
        sbM12525.append(this.f13636);
        return new String(sbM12525.toString());
    }
}
