package l;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۤۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7YO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9998 implements InterfaceC14415 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public KeyFactory f30123;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Signature f30124;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo8965();

    @Override // l.InterfaceC17944
    public void init() {
        String str;
        String strMo8965 = mo8965();
        if (strMo8965.equals("ecdsa-sha2-nistp384")) {
            str = "SHA384withECDSA";
        } else {
            str = strMo8965.equals("ecdsa-sha2-nistp521") ? "SHA512withECDSA" : "SHA256withECDSA";
        }
        this.f30124 = Signature.getInstance(str);
        this.f30123 = KeyFactory.getInstance("EC");
    }

    @Override // l.InterfaceC14415
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo25163(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException {
        String str;
        byte[] bArrM25160 = m25160(bArr);
        byte[] bArrM25161 = m25160(bArr2);
        if (bArrM25160.length >= 64) {
            str = "secp521r1";
        } else {
            str = bArrM25160.length >= 48 ? "secp384r1" : "secp256r1";
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec(str));
        this.f30124.initVerify(this.f30123.generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, bArrM25160), new BigInteger(1, bArrM25161)), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class))));
    }

    @Override // l.InterfaceC14415
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo25162(byte[] bArr) throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException {
        String str;
        byte[] bArrM25160 = m25160(bArr);
        if (bArrM25160.length >= 64) {
            str = "secp521r1";
        } else {
            str = bArrM25160.length >= 48 ? "secp384r1" : "secp256r1";
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec(str));
        this.f30124.initSign(this.f30123.generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArrM25160), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class))));
    }

    @Override // l.InterfaceC17944
    public byte[] sign() throws SignatureException {
        byte[] bArrSign = this.f30124.sign();
        if (bArrSign[0] == '0') {
            int i = bArrSign[1];
            int i2 = 3;
            if (i + 2 == bArrSign.length || ((i & 128) != 0 && (bArrSign[2] & 255) + 3 == bArrSign.length)) {
                if ((i & 128) != 0 && (bArrSign[2] & 255) + 3 == bArrSign.length) {
                    i2 = 4;
                }
                int i3 = bArrSign[i2];
                byte[] bArr = new byte[i3];
                int i4 = bArrSign[i2 + 2 + i3];
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArrSign, i2 + 1, bArr, 0, i3);
                System.arraycopy(bArrSign, i2 + 3 + bArrSign[i2], bArr2, 0, i4);
                if (bArr[0] == 0) {
                    int i5 = i3 - 1;
                    byte[] bArr3 = new byte[i5];
                    System.arraycopy(bArr, 1, bArr3, 0, i5);
                    C14270.m33917(bArr);
                    bArr = bArr3;
                }
                if (bArr2[0] == 0) {
                    int i6 = i4 - 1;
                    byte[] bArr4 = new byte[i6];
                    System.arraycopy(bArr2, 1, bArr4, 0, i6);
                    C14270.m33917(bArr2);
                    bArr2 = bArr4;
                }
                C16261 c16261 = new C16261();
                c16261.m38253(bArr);
                c16261.m38253(bArr2);
                byte[] bArr5 = new byte[c16261.m38255()];
                c16261.m38240();
                c16261.m38238(bArr5);
                return bArr5;
            }
        }
        return bArrSign;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:13:0x0073  */
    @Override // l.InterfaceC17944
    public boolean verify(byte[] bArr) {
        byte[] bArrM25161;
        byte[] bArrM25162;
        byte[] bArr2;
        if (bArr[0] == 48) {
            byte b = bArr[1];
            if (b + 2 != bArr.length && ((b & GCMSIVBlockCipher.MASK) == 0 || (bArr[2] & 255) + 3 != bArr.length)) {
                C16261 c16261 = new C16261(bArr);
                c16261.m38257();
                c16261.m38250();
                byte[] bArrM38254 = c16261.m38254();
                byte[] bArrM38255 = c16261.m38254();
                bArrM25161 = m25161(m25160(bArrM38254));
                bArrM25162 = m25161(m25160(bArrM38255));
                if (bArrM25161.length < 64) {
                    bArr2 = new byte[bArrM25161.length + 6 + bArrM25162.length];
                    bArr2[0] = UTF8.S_P3A;
                    bArr2[1] = (byte) (bArrM25161.length + 4 + bArrM25162.length);
                    bArr2[2] = 2;
                    bArr2[3] = (byte) bArrM25161.length;
                    System.arraycopy(bArrM25161, 0, bArr2, 4, bArrM25161.length);
                    bArr2[bArrM25161.length + 4] = 2;
                    bArr2[bArrM25161.length + 5] = (byte) bArrM25162.length;
                    System.arraycopy(bArrM25162, 0, bArr2, bArrM25161.length + 6, bArrM25162.length);
                } else {
                    bArr2 = new byte[bArrM25161.length + 6 + bArrM25162.length + 1];
                    bArr2[0] = UTF8.S_P3A;
                    bArr2[1] = -127;
                    bArr2[2] = (byte) (bArrM25161.length + 4 + bArrM25162.length);
                    bArr2[3] = 2;
                    bArr2[4] = (byte) bArrM25161.length;
                    System.arraycopy(bArrM25161, 0, bArr2, 5, bArrM25161.length);
                    bArr2[bArrM25161.length + 5] = 2;
                    bArr2[bArrM25161.length + 6] = (byte) bArrM25162.length;
                    System.arraycopy(bArrM25162, 0, bArr2, bArrM25161.length + 7, bArrM25162.length);
                }
                bArr = bArr2;
            }
        } else {
            C16261 c16262 = new C16261(bArr);
            c16262.m38257();
            c16262.m38250();
            byte[] bArrM38256 = c16262.m38254();
            byte[] bArrM38257 = c16262.m38254();
            bArrM25161 = m25161(m25160(bArrM38256));
            bArrM25162 = m25161(m25160(bArrM38257));
            if (bArrM25161.length < 64) {
                bArr2 = new byte[bArrM25161.length + 6 + bArrM25162.length];
                bArr2[0] = UTF8.S_P3A;
                bArr2[1] = (byte) (bArrM25161.length + 4 + bArrM25162.length);
                bArr2[2] = 2;
                bArr2[3] = (byte) bArrM25161.length;
                System.arraycopy(bArrM25161, 0, bArr2, 4, bArrM25161.length);
                bArr2[bArrM25161.length + 4] = 2;
                bArr2[bArrM25161.length + 5] = (byte) bArrM25162.length;
                System.arraycopy(bArrM25162, 0, bArr2, bArrM25161.length + 6, bArrM25162.length);
            } else {
                bArr2 = new byte[bArrM25161.length + 6 + bArrM25162.length + 1];
                bArr2[0] = UTF8.S_P3A;
                bArr2[1] = -127;
                bArr2[2] = (byte) (bArrM25161.length + 4 + bArrM25162.length);
                bArr2[3] = 2;
                bArr2[4] = (byte) bArrM25161.length;
                System.arraycopy(bArrM25161, 0, bArr2, 5, bArrM25161.length);
                bArr2[bArrM25161.length + 5] = 2;
                bArr2[bArrM25161.length + 6] = (byte) bArrM25162.length;
                System.arraycopy(bArrM25162, 0, bArr2, bArrM25161.length + 7, bArrM25162.length);
            }
            bArr = bArr2;
        }
        return this.f30124.verify(bArr);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static byte[] m25160(byte[] bArr) {
        if ((bArr[0] & GCMSIVBlockCipher.MASK) == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        C14270.m33917(bArr);
        return bArr2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static byte[] m25161(byte[] bArr) {
        if (bArr.length >= 2) {
            int i = 0;
            while (i < bArr.length - 1 && bArr[i] == 0) {
                int i2 = i + 1;
                if ((bArr[i2] & GCMSIVBlockCipher.MASK) != 0) {
                    break;
                }
                i = i2;
            }
            if (i != 0) {
                int length = bArr.length - i;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, i, bArr2, 0, length);
                C14270.m33917(bArr);
                return bArr2;
            }
        }
        return bArr;
    }
}
