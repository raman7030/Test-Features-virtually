package l;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۙۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7WN */
/* JADX INFO: loaded from: classes3.dex */
public final class C4353 implements InterfaceC17238 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public KeyFactory f13991;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Signature f13992;

    @Override // l.InterfaceC17944
    public final void init() {
        this.f13992 = Signature.getInstance("SHA1withDSA");
        this.f13991 = KeyFactory.getInstance("DSA");
    }

    @Override // l.InterfaceC17238
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo13054(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidKeySpecException, InvalidKeyException {
        this.f13992.initVerify(this.f13991.generatePublic(new DSAPublicKeySpec(new BigInteger(bArr), new BigInteger(bArr2), new BigInteger(bArr3), new BigInteger(bArr4))));
    }

    @Override // l.InterfaceC17238
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13053(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidKeySpecException, InvalidKeyException {
        this.f13992.initSign(this.f13991.generatePrivate(new DSAPrivateKeySpec(new BigInteger(bArr), new BigInteger(bArr2), new BigInteger(bArr3), new BigInteger(bArr4))));
    }

    @Override // l.InterfaceC17944
    public final byte[] sign() throws SignatureException {
        byte[] bArrSign = this.f13992.sign();
        int i = bArrSign[3] & 255;
        byte[] bArr = new byte[i];
        System.arraycopy(bArrSign, 4, bArr, 0, i);
        int i2 = bArrSign[i + 5] & 255;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArrSign, i + 6, bArr2, 0, i2);
        byte[] bArr3 = new byte[40];
        int i3 = i > 20 ? 1 : 0;
        int i4 = i > 20 ? 0 : 20 - i;
        if (i > 20) {
            i = 20;
        }
        System.arraycopy(bArr, i3, bArr3, i4, i);
        int i5 = i2 > 20 ? 1 : 0;
        int i6 = i2 > 20 ? 20 : 40 - i2;
        if (i2 > 20) {
            i2 = 20;
        }
        System.arraycopy(bArr2, i5, bArr3, i6, i2);
        return bArr3;
    }

    @Override // l.InterfaceC17944
    public final void update(byte[] bArr) throws SignatureException {
        this.f13992.update(bArr);
    }

    @Override // l.InterfaceC17944
    public final boolean verify(byte[] bArr) {
        C16261 c16261 = new C16261(bArr);
        if (new String(c16261.m38257(), StandardCharsets.UTF_8).equals(OpenSSHPublicKeyUtil.DSS)) {
            int iM38250 = c16261.m38250();
            byte[] bArr2 = new byte[iM38250];
            System.arraycopy(bArr, c16261.m38258(), bArr2, 0, iM38250);
            bArr = bArr2;
        }
        byte[] bArr3 = new byte[20];
        System.arraycopy(bArr, 0, bArr3, 0, 20);
        byte[] bArrM13052 = m13052(bArr3);
        byte[] bArr4 = new byte[20];
        System.arraycopy(bArr, 20, bArr4, 0, 20);
        byte[] bArrM13053 = m13052(bArr4);
        int i = (bArrM13052[0] & GCMSIVBlockCipher.MASK) != 0 ? 1 : 0;
        int i2 = (bArrM13053[0] & GCMSIVBlockCipher.MASK) != 0 ? 1 : 0;
        byte[] bArr5 = new byte[bArrM13052.length + bArrM13053.length + 6 + i + i2];
        bArr5[0] = UTF8.S_P3A;
        byte length = (byte) (bArrM13052.length + bArrM13053.length + 4);
        bArr5[1] = length;
        byte b = (byte) i;
        byte b2 = (byte) (length + b);
        bArr5[1] = b2;
        byte b3 = (byte) i2;
        bArr5[1] = (byte) (b2 + b3);
        bArr5[2] = 2;
        byte length2 = (byte) bArrM13052.length;
        bArr5[3] = length2;
        bArr5[3] = (byte) (length2 + b);
        System.arraycopy(bArrM13052, 0, bArr5, i + 4, bArrM13052.length);
        bArr5[bArr5[3] + 4] = 2;
        bArr5[bArr5[3] + 5] = (byte) bArrM13053.length;
        int i3 = bArr5[3] + 5;
        bArr5[i3] = (byte) (bArr5[i3] + b3);
        System.arraycopy(bArrM13053, 0, bArr5, bArr5[3] + 6 + i2, bArrM13053.length);
        return this.f13992.verify(bArr5);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static byte[] m13052(byte[] bArr) {
        if (bArr.length <= 1 || bArr[0] != 0 || (bArr[1] & GCMSIVBlockCipher.MASK) != 0) {
            return bArr;
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        return m13052(bArr2);
    }
}
