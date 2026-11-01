package p067l;

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
public abstract class AbstractC11870 implements InterfaceC16068 {

    /* JADX INFO: renamed from: ֫ */
    public KeyFactory f33083;

    /* JADX INFO: renamed from: ۧ */
    public Signature f33084;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo11033();

    @Override // p067l.InterfaceC19422
    public void init() {
        String str;
        String strMo11033 = mo11033();
        if (strMo11033.equals("ecdsa-sha2-nistp384")) {
            str = "SHA384withECDSA";
        } else {
            str = strMo11033.equals("ecdsa-sha2-nistp521") ? "SHA512withECDSA" : "SHA256withECDSA";
        }
        this.f33084 = Signature.getInstance(str);
        this.f33083 = KeyFactory.getInstance("EC");
    }

    @Override // p067l.InterfaceC16068
    /* JADX INFO: renamed from: ֫ */
    public void mo27180(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException {
        String str;
        byte[] bArrM27177 = m27177(bArr);
        byte[] bArrM27178 = m27177(bArr2);
        if (bArrM27177.length >= 64) {
            str = "secp521r1";
        } else {
            str = bArrM27177.length >= 48 ? "secp384r1" : "secp256r1";
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec(str));
        this.f33084.initVerify(this.f33083.generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, bArrM27177), new BigInteger(1, bArrM27178)), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class))));
    }

    @Override // p067l.InterfaceC16068
    /* JADX INFO: renamed from: ֫ */
    public void mo27179(byte[] bArr) throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException {
        String str;
        byte[] bArrM27177 = m27177(bArr);
        if (bArrM27177.length >= 64) {
            str = "secp521r1";
        } else {
            str = bArrM27177.length >= 48 ? "secp384r1" : "secp256r1";
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec(str));
        this.f33084.initSign(this.f33083.generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArrM27177), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class))));
    }

    @Override // p067l.InterfaceC19422
    public byte[] sign() throws SignatureException {
        byte[] bArrSign = this.f33084.sign();
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
                    C15930.m36050(bArr);
                    bArr = bArr3;
                }
                if (bArr2[0] == 0) {
                    int i6 = i4 - 1;
                    byte[] bArr4 = new byte[i6];
                    System.arraycopy(bArr2, 1, bArr4, 0, i6);
                    C15930.m36050(bArr2);
                    bArr2 = bArr4;
                }
                C17823 c17823 = new C17823();
                c17823.m40467(bArr);
                c17823.m40467(bArr2);
                byte[] bArr5 = new byte[c17823.m40469()];
                c17823.m40454();
                c17823.m40452(bArr5);
                return bArr5;
            }
        }
        return bArrSign;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:13:0x0073  */
    @Override // p067l.InterfaceC19422
    public boolean verify(byte[] bArr) {
        byte[] bArrM27178;
        byte[] bArrM27179;
        byte[] bArr2;
        if (bArr[0] == 48) {
            byte b = bArr[1];
            if (b + 2 != bArr.length && ((b & GCMSIVBlockCipher.MASK) == 0 || (bArr[2] & 255) + 3 != bArr.length)) {
                C17823 c17823 = new C17823(bArr);
                c17823.m40471();
                c17823.m40464();
                byte[] bArrM40468 = c17823.m40468();
                byte[] bArrM40469 = c17823.m40468();
                bArrM27178 = m27178(m27177(bArrM40468));
                bArrM27179 = m27178(m27177(bArrM40469));
                if (bArrM27178.length < 64) {
                    bArr2 = new byte[bArrM27178.length + 6 + bArrM27179.length];
                    bArr2[0] = UTF8.S_P3A;
                    bArr2[1] = (byte) (bArrM27178.length + 4 + bArrM27179.length);
                    bArr2[2] = 2;
                    bArr2[3] = (byte) bArrM27178.length;
                    System.arraycopy(bArrM27178, 0, bArr2, 4, bArrM27178.length);
                    bArr2[bArrM27178.length + 4] = 2;
                    bArr2[bArrM27178.length + 5] = (byte) bArrM27179.length;
                    System.arraycopy(bArrM27179, 0, bArr2, bArrM27178.length + 6, bArrM27179.length);
                } else {
                    bArr2 = new byte[bArrM27178.length + 6 + bArrM27179.length + 1];
                    bArr2[0] = UTF8.S_P3A;
                    bArr2[1] = -127;
                    bArr2[2] = (byte) (bArrM27178.length + 4 + bArrM27179.length);
                    bArr2[3] = 2;
                    bArr2[4] = (byte) bArrM27178.length;
                    System.arraycopy(bArrM27178, 0, bArr2, 5, bArrM27178.length);
                    bArr2[bArrM27178.length + 5] = 2;
                    bArr2[bArrM27178.length + 6] = (byte) bArrM27179.length;
                    System.arraycopy(bArrM27179, 0, bArr2, bArrM27178.length + 7, bArrM27179.length);
                }
                bArr = bArr2;
            }
        } else {
            C17823 c17824 = new C17823(bArr);
            c17824.m40471();
            c17824.m40464();
            byte[] bArrM404610 = c17824.m40468();
            byte[] bArrM404611 = c17824.m40468();
            bArrM27178 = m27178(m27177(bArrM404610));
            bArrM27179 = m27178(m27177(bArrM404611));
            if (bArrM27178.length < 64) {
                bArr2 = new byte[bArrM27178.length + 6 + bArrM27179.length];
                bArr2[0] = UTF8.S_P3A;
                bArr2[1] = (byte) (bArrM27178.length + 4 + bArrM27179.length);
                bArr2[2] = 2;
                bArr2[3] = (byte) bArrM27178.length;
                System.arraycopy(bArrM27178, 0, bArr2, 4, bArrM27178.length);
                bArr2[bArrM27178.length + 4] = 2;
                bArr2[bArrM27178.length + 5] = (byte) bArrM27179.length;
                System.arraycopy(bArrM27179, 0, bArr2, bArrM27178.length + 6, bArrM27179.length);
            } else {
                bArr2 = new byte[bArrM27178.length + 6 + bArrM27179.length + 1];
                bArr2[0] = UTF8.S_P3A;
                bArr2[1] = -127;
                bArr2[2] = (byte) (bArrM27178.length + 4 + bArrM27179.length);
                bArr2[3] = 2;
                bArr2[4] = (byte) bArrM27178.length;
                System.arraycopy(bArrM27178, 0, bArr2, 5, bArrM27178.length);
                bArr2[bArrM27178.length + 5] = 2;
                bArr2[bArrM27178.length + 6] = (byte) bArrM27179.length;
                System.arraycopy(bArrM27179, 0, bArr2, bArrM27178.length + 7, bArrM27179.length);
            }
            bArr = bArr2;
        }
        return this.f33084.verify(bArr);
    }

    /* JADX INFO: renamed from: ܽ */
    public static byte[] m27177(byte[] bArr) {
        if ((bArr[0] & GCMSIVBlockCipher.MASK) == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        C15930.m36050(bArr);
        return bArr2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static byte[] m27178(byte[] bArr) {
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
                C15930.m36050(bArr);
                return bArr2;
            }
        }
        return bArr;
    }
}
