package l;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۠֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 99YC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7830 extends AbstractC5008 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f24230;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f24231;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f24232;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f24233;

    public C7830(byte[] bArr) throws IOException {
        for (int i = 0; i < 8; i++) {
            if (bArr[i] != AbstractC5008.f15779[i]) {
                throw new IOException("Not an NTLMSSP message.");
            }
        }
        if (AbstractC5008.m14495(8, bArr) != 2) {
            throw new IOException("Not a Type 2 message.");
        }
        int iM14495 = AbstractC5008.m14495(20, bArr);
        m14499(iM14495);
        byte[] bArrM14494 = AbstractC5008.m14494(12, bArr);
        int iM14496 = AbstractC5008.m14495(16, bArr);
        if (bArrM14494.length != 0) {
            this.f24230 = new String(bArrM14494, (iM14495 & 1) != 0 ? "UTF-16LE" : "Cp850");
        }
        for (int i2 = 24; i2 < 32; i2++) {
            if (bArr[i2] != 0) {
                byte[] bArr2 = new byte[8];
                System.arraycopy(bArr, 24, bArr2, 0, 8);
                this.f24232 = bArr2;
                break;
            }
        }
        if (iM14496 < 40 || bArr.length < 40) {
            return;
        }
        for (int i3 = 32; i3 < 40; i3++) {
            if (bArr[i3] != 0) {
                byte[] bArr3 = new byte[8];
                System.arraycopy(bArr, 32, bArr3, 0, 8);
                this.f24231 = bArr3;
                break;
            }
        }
        if (iM14496 < 48 || bArr.length < 48) {
            return;
        }
        byte[] bArrM14495 = AbstractC5008.m14494(40, bArr);
        if (bArrM14495.length != 0) {
            this.f24233 = bArrM14495;
        }
    }

    static {
        C11321.m27961(C7830.class);
        new HashMap();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m20928() {
        return this.f24232;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] m20929() {
        return this.f24233;
    }

    public final String toString() {
        String strM9831;
        String strM9832;
        StringBuilder sbM9834 = C3200.m9834("Type2Message[target=", this.f24230, ",challenge=");
        String strM9833 = "null";
        byte[] bArr = this.f24232;
        if (bArr == null) {
            strM9831 = "null";
        } else {
            strM9831 = C3200.m9831(bArr.length, " bytes>", new StringBuilder("<"));
        }
        sbM9834.append(strM9831);
        sbM9834.append(",context=");
        byte[] bArr2 = this.f24231;
        if (bArr2 == null) {
            strM9832 = "null";
        } else {
            strM9832 = C3200.m9831(bArr2.length, " bytes>", new StringBuilder("<"));
        }
        sbM9834.append(strM9832);
        sbM9834.append(",targetInformation=");
        byte[] bArr3 = this.f24233;
        if (bArr3 != null) {
            strM9833 = C3200.m9831(bArr3.length, " bytes>", new StringBuilder("<"));
        }
        sbM9834.append(strM9833);
        sbM9834.append(",flags=0x");
        sbM9834.append(C12085.m29467(m14496(), 8));
        sbM9834.append("]");
        return sbM9834.toString();
    }
}
