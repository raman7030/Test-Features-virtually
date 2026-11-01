package p067l;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ۛᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: BA22 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8310 implements InterfaceC18587 {

    /* JADX INFO: renamed from: ۧ */
    public static final InterfaceC4410 f22205 = C13128.m30022(C8310.class);

    /* JADX INFO: renamed from: ֫ */
    public final Mac f22206;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m19165(byte[] bArr, int i, int i2, InterfaceC15605 interfaceC15605, InterfaceC15605 interfaceC15606) {
        this.f22206.reset();
        int i3 = i + 48;
        for (int i4 = 0; i4 < 16; i4++) {
            bArr[i3 + i4] = 0;
        }
        int i5 = i + 16;
        C3775.m7366(C3775.m7365(i5, bArr) | 8, i5, bArr);
        this.f22206.update(bArr, i, i2);
        System.arraycopy(this.f22206.doFinal(), 0, bArr, i3, 16);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m19166(byte[] bArr, int i, int i2, InterfaceC15605 interfaceC15605) {
        this.f22206.reset();
        if ((C3775.m7365(i + 16, bArr) & 8) == 0) {
            f22205.mo9175("The server did not sign a message we expected to be signed");
            return true;
        }
        byte[] bArr2 = new byte[16];
        int i3 = i + 48;
        System.arraycopy(bArr, i3, bArr2, 0, 16);
        for (int i4 = 0; i4 < 16; i4++) {
            bArr[i3 + i4] = 0;
        }
        this.f22206.update(bArr, i, i2);
        byte[] bArr3 = new byte[16];
        System.arraycopy(this.f22206.doFinal(), 0, bArr3, 0, 16);
        return !MessageDigest.isEqual(bArr2, bArr3);
    }

    public C8310(byte[] bArr, int i, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac;
        if (i == 514 || i == 528) {
            mac = Mac.getInstance("HmacSHA256");
        } else if (i == 768 || i == 770) {
            bArr = C13675.m31071(i, bArr, new byte[0]);
            mac = Mac.getInstance("AESCMAC", C6478.m14846());
        } else {
            if (i != 785) {
                throw new IllegalArgumentException("Unknown dialect");
            }
            if (bArr2 == null) {
                throw new IllegalArgumentException("Missing preauthIntegrityHash for SMB 3.1");
            }
            bArr = C13675.m31071(i, bArr, bArr2);
            mac = Mac.getInstance("AESCMAC", C6478.m14846());
        }
        mac.init(new SecretKeySpec(bArr, "HMAC"));
        this.f22206 = mac;
    }
}
