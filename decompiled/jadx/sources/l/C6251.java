package l;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ۛᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: BA22 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6251 implements InterfaceC17065 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f19341 = C11321.m27961(C6251.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Mac f19342;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m17227(byte[] bArr, int i, int i2, InterfaceC13927 interfaceC13927, InterfaceC13927 interfaceC13928) {
        this.f19342.reset();
        int i3 = i + 48;
        for (int i4 = 0; i4 < 16; i4++) {
            bArr[i3 + i4] = 0;
        }
        int i5 = i + 16;
        C1480.m5124(C1480.m5123(i5, bArr) | 8, i5, bArr);
        this.f19342.update(bArr, i, i2);
        System.arraycopy(this.f19342.doFinal(), 0, bArr, i3, 16);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m17228(byte[] bArr, int i, int i2, InterfaceC13927 interfaceC13927) {
        this.f19342.reset();
        if ((C1480.m5123(i + 16, bArr) & 8) == 0) {
            f19341.mo7080("The server did not sign a message we expected to be signed");
            return true;
        }
        byte[] bArr2 = new byte[16];
        int i3 = i + 48;
        System.arraycopy(bArr, i3, bArr2, 0, 16);
        for (int i4 = 0; i4 < 16; i4++) {
            bArr[i3 + i4] = 0;
        }
        this.f19342.update(bArr, i, i2);
        byte[] bArr3 = new byte[16];
        System.arraycopy(this.f19342.doFinal(), 0, bArr3, 0, 16);
        return !MessageDigest.isEqual(bArr2, bArr3);
    }

    public C6251(byte[] bArr, int i, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac;
        if (i == 514 || i == 528) {
            mac = Mac.getInstance("HmacSHA256");
        } else if (i == 768 || i == 770) {
            bArr = C11896.m29019(i, bArr, new byte[0]);
            mac = Mac.getInstance("AESCMAC", C4324.m12982());
        } else {
            if (i != 785) {
                throw new IllegalArgumentException("Unknown dialect");
            }
            if (bArr2 == null) {
                throw new IllegalArgumentException("Missing preauthIntegrityHash for SMB 3.1");
            }
            bArr = C11896.m29019(i, bArr, bArr2);
            mac = Mac.getInstance("AESCMAC", C4324.m12982());
        }
        mac.init(new SecretKeySpec(bArr, "HMAC"));
        this.f19342 = mac;
    }
}
