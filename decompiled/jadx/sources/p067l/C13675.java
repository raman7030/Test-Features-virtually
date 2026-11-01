package p067l;

import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.KDFCounterBytesGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.KDFCounterParameters;

/* JADX INFO: renamed from: l.ۨᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 5A1F */
/* JADX INFO: loaded from: classes3.dex */
public final class C13675 {

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f38533 = m31072("SmbSign");

    /* JADX INFO: renamed from: ۧ */
    public static final byte[] f38534 = m31072("SMB2AESCMAC");

    /* JADX INFO: renamed from: ܽ */
    public static final byte[] f38535 = m31072("SMBSigningKey");

    static {
        m31072("SmbRpc");
        m31072("SMB2APP");
        m31072("SMBAppKey");
        m31072("ServerIn ");
        m31072("SMB2AESCCM");
        m31072("SMB2C2SCipherKey");
        m31072("ServerOut");
        m31072("SMB2AESCCM");
        m31072("SMB2S2CCipherKey");
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m31071(int i, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = i == 785 ? f38535 : f38534;
        if (i != 785) {
            bArr2 = f38533;
        }
        KDFCounterBytesGenerator kDFCounterBytesGenerator = new KDFCounterBytesGenerator(new HMac(new SHA256Digest()));
        int length = bArr3.length + bArr2.length;
        byte[] bArr4 = new byte[length + 5];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(bArr2, 0, bArr4, bArr3.length + 1, bArr2.length);
        bArr4[length + 4] = GCMSIVBlockCipher.MASK;
        kDFCounterBytesGenerator.init(new KDFCounterParameters(bArr, null, bArr4, 32));
        byte[] bArr5 = new byte[16];
        kDFCounterBytesGenerator.generateBytes(bArr5, 0, 16);
        return bArr5;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m31072(String str) {
        byte[] bArr = new byte[str.length() + 1];
        System.arraycopy(str.getBytes(StandardCharsets.US_ASCII), 0, bArr, 0, str.length());
        return bArr;
    }
}
