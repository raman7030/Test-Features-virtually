package p067l;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֨֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: WA0T */
/* JADX INFO: loaded from: classes2.dex */
public final class C3104 extends AbstractC7128 {

    /* JADX INFO: renamed from: ᩳ */
    public String f5645;

    public C3104(InterfaceC20106 interfaceC20106, int i, String str) {
        m16403((((C15410) interfaceC20106.mo29602()).m35102() ? 1 : 2) | 33554944 | i);
        this.f5645 = str;
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte[] m5286() {
        int i;
        try {
            int iM16400 = m16400();
            int i2 = iM16400 & 33554432;
            int i3 = 32;
            int length = (i2 != 0 ? 8 : 0) + 32;
            byte[] bytes = new byte[0];
            String str = this.f5645;
            if (i2 != 0 || str == null || str.length() == 0) {
                i = iM16400 & (-4097);
            } else {
                i = iM16400 | 4096;
                bytes = str.toUpperCase().getBytes("Cp850");
                length += bytes.length;
            }
            byte[] bArr = new byte[0];
            byte[] bArr2 = new byte[length];
            System.arraycopy(AbstractC7128.f18612, 0, bArr2, 0, 8);
            AbstractC7128.m16397(8, 1, bArr2);
            AbstractC7128.m16397(12, i & (-8193), bArr2);
            int iM16396 = AbstractC7128.m16396(16, bArr2, bytes);
            int iM16397 = AbstractC7128.m16396(24, bArr2, bArr);
            if ((i & 33554432) != 0) {
                System.arraycopy(AbstractC7128.f18613, 0, bArr2, 32, 8);
                i3 = 40;
            }
            AbstractC7128.m16395(i3 + AbstractC7128.m16395(i3, iM16396, bArr2, bytes), iM16397, bArr2, bArr);
            return bArr2;
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Type1Message[suppliedDomain=");
        String str = this.f5645;
        if (str == null) {
            str = "null";
        }
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, str, ",suppliedWorkstation=", "null", ",flags=0x");
        sb.append(C13854.m31529(m16400(), 8));
        sb.append("]");
        return sb.toString();
    }
}
