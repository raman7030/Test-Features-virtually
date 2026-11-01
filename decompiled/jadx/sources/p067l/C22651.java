package p067l;

/* JADX INFO: renamed from: l.᩸ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9SA */
/* JADX INFO: loaded from: classes5.dex */
public final class C22651 extends AbstractC11883 {

    /* JADX INFO: renamed from: ۙ֫ */
    public String f71465;

    /* JADX INFO: renamed from: ܶ֫ */
    public byte[] f71466;

    /* JADX INFO: renamed from: ᩶֫ */
    public String f71467;

    /* JADX INFO: renamed from: ᩸֫ */
    public boolean f71468;

    /* JADX INFO: renamed from: ᩹֫ */
    public String f71469;

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

    public C22651(InterfaceC3341 interfaceC3341, AbstractC13224 abstractC13224) {
        super(interfaceC3341, abstractC13224);
        this.f71467 = "";
        this.f71469 = "";
        this.f71465 = "";
        this.f71466 = null;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final boolean m50710() {
        return this.f71468;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final byte[] m50711() {
        return this.f71466;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        this.f71468 = (bArr[i] & 1) == 1;
        int i2 = i + 2;
        if (m30265()) {
            int iM7363 = C3775.m7363(i2, bArr);
            i2 = i + 4;
            this.f71466 = new byte[iM7363];
        }
        return i2 - i;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ۧ */
    public final int mo3714(int i, byte[] bArr) {
        int length;
        if (m30265()) {
            byte[] bArr2 = this.f71466;
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            length = this.f71466.length + i;
        } else {
            length = i;
        }
        String strM30270 = m30270(length, bArr);
        this.f71467 = strM30270;
        int iM30240 = m30240(length, strM30270) + length;
        String strM30244 = m30244(bArr, iM30240, m30259());
        this.f71469 = strM30244;
        int iM30241 = m30240(iM30240, strM30244) + iM30240;
        if (!m30265()) {
            String strM30245 = m30244(bArr, iM30241, m30259());
            this.f71465 = strM30245;
            iM30241 += m30240(iM30241, strM30245);
        }
        return iM30241 - i;
    }

    @Override // p067l.AbstractC11883, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComSessionSetupAndXResponse[");
        sb.append(super.toString());
        sb.append(",isLoggedInAsGuest=");
        sb.append(this.f71468);
        sb.append(",nativeOs=");
        sb.append(this.f71467);
        sb.append(",nativeLanMan=");
        sb.append(this.f71469);
        sb.append(",primaryDomain=");
        return new String(C10965.m25286(sb, this.f71465, "]"));
    }
}
