package l;

/* JADX INFO: renamed from: l.ܶۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09TX */
/* JADX INFO: loaded from: classes5.dex */
public final class C14989 extends AbstractC10011 {

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public byte[] f45709;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public C8640 f45710;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public String f45711;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public String f45712;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public byte[] f45713;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public byte[] f45714;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f45715;

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

    public C14989(InterfaceC18663 interfaceC18663, C8640 c8640, AbstractC11422 abstractC11422, Object obj) throws C3037 {
        super(interfaceC18663.mo27540(), (byte) 115, abstractC11422);
        this.f45714 = null;
        this.f45710 = c8640;
        int iM22408 = c8640.m22408();
        this.f45715 = iM22408;
        C13537 c13537M22410 = c8640.m22410();
        int i = c13537M22410.f40402;
        if (i != 1) {
            if (i == 0) {
                if (obj instanceof C18560) {
                    C18560 c18560 = (C18560) obj;
                    this.f45713 = new byte[0];
                    this.f45709 = new byte[0];
                    if (!c18560.mo16137()) {
                        String strM43097 = c18560.m43097();
                        this.f45712 = strM43097;
                        if (m28215()) {
                            this.f45712 = strM43097.toUpperCase();
                        }
                        this.f45711 = c18560.mo16138() != null ? c18560.mo16138().toUpperCase() : "?";
                        return;
                    }
                    this.f45712 = "";
                    this.f45711 = "";
                    return;
                }
                throw new C3037("Unsupported credential type");
            }
            throw new C3037("Unsupported");
        }
        if (obj instanceof C18560) {
            C18560 c18561 = (C18560) obj;
            if (c18561.mo16137()) {
                this.f45713 = new byte[0];
                this.f45709 = new byte[0];
                this.f45715 = Integer.MAX_VALUE & iM22408;
                if (c18561.mo16135()) {
                    String strM43098 = c18561.m43097();
                    this.f45712 = strM43098;
                    if (m28215()) {
                        this.f45712 = strM43098.toUpperCase();
                    }
                    this.f45711 = c18561.mo16138() != null ? c18561.mo16138().toUpperCase() : "?";
                    return;
                }
                this.f45712 = "";
                this.f45711 = "";
                return;
            }
            String strM43099 = c18561.m43097();
            this.f45712 = strM43099;
            if (m28215()) {
                this.f45712 = strM43099.toUpperCase();
            }
            this.f45711 = c18561.mo16138() != null ? c18561.mo16138().toUpperCase() : "?";
            if (c13537M22410.f40397) {
                byte[] bArrM43099 = c18561.m43099(interfaceC18663, c13537M22410.f40403);
                this.f45713 = bArrM43099;
                byte[] bArrM43100 = c18561.m43100(interfaceC18663, c13537M22410.f40403);
                this.f45709 = bArrM43100;
                if (bArrM43099.length == 0 && bArrM43100.length == 0) {
                    throw new RuntimeException("Null setup prohibited.");
                }
                return;
            }
            if (((C13722) interfaceC18663.mo27540()).m32999()) {
                throw new RuntimeException("Plain text passwords are disabled");
            }
            String password = c18561.getPassword();
            byte[] bArr = new byte[(password.length() + 1) * 2];
            this.f45713 = bArr;
            this.f45709 = new byte[0];
            m28197(password, 0, bArr);
            return;
        }
        if (obj instanceof byte[]) {
            this.f45714 = (byte[]) obj;
        } else {
            StringBuilder sb = new StringBuilder("Unsupported credential type ");
            sb.append(obj != null ? obj.getClass() : "NULL");
            throw new C3037(sb.toString());
        }
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ᩻ */
    public final int mo1311(int i, byte[] bArr) {
        int i2;
        C8640 c8640 = this.f45710;
        C1480.m5122(c8640.m22409(), i, bArr);
        C1480.m5122(c8640.m22406(), i + 2, bArr);
        C1480.m5122(((C13722) m28218()).m33007(), i + 4, bArr);
        C1480.m5124(0, i + 6, bArr);
        int i3 = i + 10;
        byte[] bArr2 = this.f45714;
        if (bArr2 != null) {
            C1480.m5122(bArr2.length, i3, bArr);
            i2 = i + 12;
        } else {
            C1480.m5122(this.f45713.length, i3, bArr);
            C1480.m5122(this.f45709.length, i + 12, bArr);
            i2 = i + 14;
        }
        bArr[i2] = 0;
        bArr[i2 + 1] = 0;
        bArr[i2 + 2] = 0;
        bArr[i2 + 3] = 0;
        C1480.m5124(this.f45715, i2 + 4, bArr);
        return (i2 + 8) - i;
    }

    @Override // l.AbstractC11422
    /* JADX INFO: renamed from: ܿ */
    public final int mo1309(int i, byte[] bArr) {
        int iM28197;
        byte[] bArr2 = this.f45714;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            iM28197 = bArr2.length + i;
        } else {
            byte[] bArr3 = this.f45713;
            System.arraycopy(bArr3, 0, bArr, i, bArr3.length);
            int length = bArr3.length + i;
            byte[] bArr4 = this.f45709;
            System.arraycopy(bArr4, 0, bArr, length, bArr4.length);
            int length2 = length + bArr4.length;
            int iM28198 = length2 + m28197(this.f45712, length2, bArr);
            iM28197 = m28197(this.f45711, iM28198, bArr) + iM28198;
        }
        int iM28199 = iM28197 + m28197(((C13722) m28218()).m32986(), iM28197, bArr);
        return (iM28199 + m28197(((C13722) m28218()).m32973(), iM28199, bArr)) - i;
    }

    @Override // l.AbstractC10011, l.AbstractC11422
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComSessionSetupAndX[");
        sb.append(super.toString());
        sb.append(",snd_buf_size=");
        C8640 c8640 = this.f45710;
        sb.append(c8640.m22409());
        sb.append(",maxMpxCount=");
        sb.append(c8640.m22406());
        sb.append(",VC_NUMBER=");
        sb.append(((C13722) m28218()).m33007());
        sb.append(",sessionKey=0,lmHash.length=");
        byte[] bArr = this.f45713;
        sb.append(bArr == null ? 0 : bArr.length);
        sb.append(",ntHash.length=");
        byte[] bArr2 = this.f45709;
        sb.append(bArr2 != null ? bArr2.length : 0);
        sb.append(",capabilities=");
        sb.append(this.f45715);
        sb.append(",accountName=");
        sb.append(this.f45712);
        sb.append(",primaryDomain=");
        sb.append(this.f45711);
        sb.append(",NATIVE_OS=");
        sb.append(((C13722) m28218()).m32986());
        sb.append(",NATIVE_LANMAN=");
        sb.append(((C13722) m28218()).m32973());
        sb.append("]");
        return new String(sb.toString());
    }
}
