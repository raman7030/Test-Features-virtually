package l;

import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.KDFCounterBytesGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.KDFCounterParameters;

/* JADX INFO: renamed from: l.ۨᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 5A1F */
/* JADX INFO: loaded from: classes3.dex */
public final class C11896 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f35523 = m29020("SmbSign");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f35524 = m29020("SMB2AESCMAC");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f35525 = m29020("SMBSigningKey");

    static {
        m29020("SmbRpc");
        m29020("SMB2APP");
        m29020("SMBAppKey");
        m29020("ServerIn ");
        m29020("SMB2AESCCM");
        m29020("SMB2C2SCipherKey");
        m29020("ServerOut");
        m29020("SMB2AESCCM");
        m29020("SMB2S2CCipherKey");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m29019(int i, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = i == 785 ? f35525 : f35524;
        if (i != 785) {
            bArr2 = f35523;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m29020(String str) {
        byte[] bArr = new byte[str.length() + 1];
        System.arraycopy(str.getBytes(StandardCharsets.US_ASCII), 0, bArr, 0, str.length());
        return bArr;
    }
}
