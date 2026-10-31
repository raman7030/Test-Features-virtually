package l;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֨֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: WA0T */
/* JADX INFO: loaded from: classes2.dex */
public final class C0774 extends AbstractC5008 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f2873;

    public C0774(InterfaceC18663 interfaceC18663, int i, String str) {
        m14499((((C13722) interfaceC18663.mo27540()).m32988() ? 1 : 2) | 33554944 | i);
        this.f2873 = str;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m2957() {
        int i;
        try {
            int iM14496 = m14496();
            int i2 = iM14496 & 33554432;
            int i3 = 32;
            int length = (i2 != 0 ? 8 : 0) + 32;
            byte[] bytes = new byte[0];
            String str = this.f2873;
            if (i2 != 0 || str == null || str.length() == 0) {
                i = iM14496 & (-4097);
            } else {
                i = iM14496 | 4096;
                bytes = str.toUpperCase().getBytes("Cp850");
                length += bytes.length;
            }
            byte[] bArr = new byte[0];
            byte[] bArr2 = new byte[length];
            System.arraycopy(AbstractC5008.f15779, 0, bArr2, 0, 8);
            AbstractC5008.m14493(8, 1, bArr2);
            AbstractC5008.m14493(12, i & (-8193), bArr2);
            int iM14492 = AbstractC5008.m14492(16, bArr2, bytes);
            int iM14493 = AbstractC5008.m14492(24, bArr2, bArr);
            if ((i & 33554432) != 0) {
                System.arraycopy(AbstractC5008.f15780, 0, bArr2, 32, 8);
                i3 = 40;
            }
            AbstractC5008.m14491(i3 + AbstractC5008.m14491(i3, iM14492, bArr2, bytes), iM14493, bArr2, bArr);
            return bArr2;
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Type1Message[suppliedDomain=");
        String str = this.f2873;
        if (str == null) {
            str = "null";
        }
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, str, ",suppliedWorkstation=", "null", ",flags=0x");
        sb.append(C12085.m29467(m14496(), 8));
        sb.append("]");
        return sb.toString();
    }
}
