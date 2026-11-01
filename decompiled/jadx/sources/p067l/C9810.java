package p067l;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۠֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 99YC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9810 extends AbstractC7128 {

    /* JADX INFO: renamed from: ܳ */
    public String f27146;

    /* JADX INFO: renamed from: ܿ */
    public byte[] f27147;

    /* JADX INFO: renamed from: ᩳ */
    public byte[] f27148;

    /* JADX INFO: renamed from: ᩻ */
    public byte[] f27149;

    public C9810(byte[] bArr) throws IOException {
        for (int i = 0; i < 8; i++) {
            if (bArr[i] != AbstractC7128.f18612[i]) {
                throw new IOException("Not an NTLMSSP message.");
            }
        }
        if (AbstractC7128.m16399(8, bArr) != 2) {
            throw new IOException("Not a Type 2 message.");
        }
        int iM16399 = AbstractC7128.m16399(20, bArr);
        m16403(iM16399);
        byte[] bArrM16398 = AbstractC7128.m16398(12, bArr);
        int iM163910 = AbstractC7128.m16399(16, bArr);
        if (bArrM16398.length != 0) {
            this.f27146 = new String(bArrM16398, (iM16399 & 1) != 0 ? "UTF-16LE" : "Cp850");
        }
        for (int i2 = 24; i2 < 32; i2++) {
            if (bArr[i2] != 0) {
                byte[] bArr2 = new byte[8];
                System.arraycopy(bArr, 24, bArr2, 0, 8);
                this.f27148 = bArr2;
                break;
            }
        }
        if (iM163910 < 40 || bArr.length < 40) {
            return;
        }
        for (int i3 = 32; i3 < 40; i3++) {
            if (bArr[i3] != 0) {
                byte[] bArr3 = new byte[8];
                System.arraycopy(bArr, 32, bArr3, 0, 8);
                this.f27147 = bArr3;
                break;
            }
        }
        if (iM163910 < 48 || bArr.length < 48) {
            return;
        }
        byte[] bArrM16399 = AbstractC7128.m16398(40, bArr);
        if (bArrM16399.length != 0) {
            this.f27149 = bArrM16399;
        }
    }

    static {
        C13128.m30022(C9810.class);
        new HashMap();
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte[] m22893() {
        return this.f27148;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] m22894() {
        return this.f27149;
    }

    public final String toString() {
        String strM11876;
        String strM11877;
        StringBuilder sbM11879 = C5410.m11879("Type2Message[target=", this.f27146, ",challenge=");
        String strM11878 = "null";
        byte[] bArr = this.f27148;
        if (bArr == null) {
            strM11876 = "null";
        } else {
            strM11876 = C5410.m11876(bArr.length, " bytes>", new StringBuilder("<"));
        }
        sbM11879.append(strM11876);
        sbM11879.append(",context=");
        byte[] bArr2 = this.f27147;
        if (bArr2 == null) {
            strM11877 = "null";
        } else {
            strM11877 = C5410.m11876(bArr2.length, " bytes>", new StringBuilder("<"));
        }
        sbM11879.append(strM11877);
        sbM11879.append(",targetInformation=");
        byte[] bArr3 = this.f27149;
        if (bArr3 != null) {
            strM11878 = C5410.m11876(bArr3.length, " bytes>", new StringBuilder("<"));
        }
        sbM11879.append(strM11878);
        sbM11879.append(",flags=0x");
        sbM11879.append(C13854.m31529(m16400(), 8));
        sbM11879.append("]");
        return sbM11879.toString();
    }
}
