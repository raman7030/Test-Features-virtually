package p067l;

/* JADX INFO: renamed from: l.ܶۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09TX */
/* JADX INFO: loaded from: classes5.dex */
public final class C16614 extends AbstractC11883 {

    /* JADX INFO: renamed from: ۗ֫ */
    public byte[] f48822;

    /* JADX INFO: renamed from: ۙ֫ */
    public C10580 f48823;

    /* JADX INFO: renamed from: ۬֫ */
    public String f48824;

    /* JADX INFO: renamed from: ܶ֫ */
    public String f48825;

    /* JADX INFO: renamed from: ᩶֫ */
    public byte[] f48826;

    /* JADX INFO: renamed from: ᩸֫ */
    public byte[] f48827;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f48828;

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

    public C16614(InterfaceC20106 interfaceC20106, C10580 c10580, AbstractC13224 abstractC13224, Object obj) throws C5255 {
        super(interfaceC20106.mo29602(), (byte) 115, abstractC13224);
        this.f48827 = null;
        this.f48823 = c10580;
        int iM24377 = c10580.m24377();
        this.f48828 = iM24377;
        C15234 c15234M24379 = c10580.m24379();
        int i = c15234M24379.f43472;
        if (i != 1) {
            if (i == 0) {
                if (obj instanceof C20008) {
                    C20008 c20008 = (C20008) obj;
                    this.f48826 = new byte[0];
                    this.f48822 = new byte[0];
                    if (!c20008.mo18056()) {
                        String strM45375 = c20008.m45375();
                        this.f48825 = strM45375;
                        if (m30259()) {
                            this.f48825 = strM45375.toUpperCase();
                        }
                        this.f48824 = c20008.mo18057() != null ? c20008.mo18057().toUpperCase() : "?";
                        return;
                    }
                    this.f48825 = "";
                    this.f48824 = "";
                    return;
                }
                throw new C5255("Unsupported credential type");
            }
            throw new C5255("Unsupported");
        }
        if (obj instanceof C20008) {
            C20008 c20009 = (C20008) obj;
            if (c20009.mo18056()) {
                this.f48826 = new byte[0];
                this.f48822 = new byte[0];
                this.f48828 = Integer.MAX_VALUE & iM24377;
                if (c20009.mo18054()) {
                    String strM45376 = c20009.m45375();
                    this.f48825 = strM45376;
                    if (m30259()) {
                        this.f48825 = strM45376.toUpperCase();
                    }
                    this.f48824 = c20009.mo18057() != null ? c20009.mo18057().toUpperCase() : "?";
                    return;
                }
                this.f48825 = "";
                this.f48824 = "";
                return;
            }
            String strM45377 = c20009.m45375();
            this.f48825 = strM45377;
            if (m30259()) {
                this.f48825 = strM45377.toUpperCase();
            }
            this.f48824 = c20009.mo18057() != null ? c20009.mo18057().toUpperCase() : "?";
            if (c15234M24379.f43467) {
                byte[] bArrM45377 = c20009.m45377(interfaceC20106, c15234M24379.f43473);
                this.f48826 = bArrM45377;
                byte[] bArrM45378 = c20009.m45378(interfaceC20106, c15234M24379.f43473);
                this.f48822 = bArrM45378;
                if (bArrM45377.length == 0 && bArrM45378.length == 0) {
                    throw new RuntimeException("Null setup prohibited.");
                }
                return;
            }
            if (((C15410) interfaceC20106.mo29602()).m35113()) {
                throw new RuntimeException("Plain text passwords are disabled");
            }
            String password = c20009.getPassword();
            byte[] bArr = new byte[(password.length() + 1) * 2];
            this.f48826 = bArr;
            this.f48822 = new byte[0];
            m30241(password, 0, bArr);
            return;
        }
        if (obj instanceof byte[]) {
            this.f48827 = (byte[]) obj;
        } else {
            StringBuilder sb = new StringBuilder("Unsupported credential type ");
            sb.append(obj != null ? obj.getClass() : "NULL");
            throw new C5255(sb.toString());
        }
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        int i2;
        C10580 c10580 = this.f48823;
        C3775.m7364(c10580.m24378(), i, bArr);
        C3775.m7364(c10580.m24375(), i + 2, bArr);
        C3775.m7364(((C15410) m30262()).m35121(), i + 4, bArr);
        C3775.m7366(0, i + 6, bArr);
        int i3 = i + 10;
        byte[] bArr2 = this.f48827;
        if (bArr2 != null) {
            C3775.m7364(bArr2.length, i3, bArr);
            i2 = i + 12;
        } else {
            C3775.m7364(this.f48826.length, i3, bArr);
            C3775.m7364(this.f48822.length, i + 12, bArr);
            i2 = i + 14;
        }
        bArr[i2] = 0;
        bArr[i2 + 1] = 0;
        bArr[i2 + 2] = 0;
        bArr[i2 + 3] = 0;
        C3775.m7366(this.f48828, i2 + 4, bArr);
        return (i2 + 8) - i;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        int iM30241;
        byte[] bArr2 = this.f48827;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            iM30241 = bArr2.length + i;
        } else {
            byte[] bArr3 = this.f48826;
            System.arraycopy(bArr3, 0, bArr, i, bArr3.length);
            int length = bArr3.length + i;
            byte[] bArr4 = this.f48822;
            System.arraycopy(bArr4, 0, bArr, length, bArr4.length);
            int length2 = length + bArr4.length;
            int iM30242 = length2 + m30241(this.f48825, length2, bArr);
            iM30241 = m30241(this.f48824, iM30242, bArr) + iM30242;
        }
        int iM30243 = iM30241 + m30241(((C15410) m30262()).m35100(), iM30241, bArr);
        return (iM30243 + m30241(((C15410) m30262()).m35087(), iM30243, bArr)) - i;
    }

    @Override // p067l.AbstractC11883, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComSessionSetupAndX[");
        sb.append(super.toString());
        sb.append(",snd_buf_size=");
        C10580 c10580 = this.f48823;
        sb.append(c10580.m24378());
        sb.append(",maxMpxCount=");
        sb.append(c10580.m24375());
        sb.append(",VC_NUMBER=");
        sb.append(((C15410) m30262()).m35121());
        sb.append(",sessionKey=0,lmHash.length=");
        byte[] bArr = this.f48826;
        sb.append(bArr == null ? 0 : bArr.length);
        sb.append(",ntHash.length=");
        byte[] bArr2 = this.f48822;
        sb.append(bArr2 != null ? bArr2.length : 0);
        sb.append(",capabilities=");
        sb.append(this.f48828);
        sb.append(",accountName=");
        sb.append(this.f48825);
        sb.append(",primaryDomain=");
        sb.append(this.f48824);
        sb.append(",NATIVE_OS=");
        sb.append(((C15410) m30262()).m35100());
        sb.append(",NATIVE_LANMAN=");
        sb.append(((C15410) m30262()).m35087());
        sb.append("]");
        return new String(sb.toString());
    }
}
