package l;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.KeyAgreement;

/* JADX INFO: renamed from: l.ۤܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67UW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10388 implements InterfaceC9124 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static BigInteger f31235;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static BigInteger f31236;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f31237;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public KeyAgreement f31238;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ECPublicKey f31239;

    @Override // l.InterfaceC9124
    /* JADX INFO: renamed from: ֫ */
    public final void mo23496(int i) throws NoSuchAlgorithmException, InvalidKeyException, C12651, InvalidAlgorithmParameterException {
        String str;
        this.f31238 = KeyAgreement.getInstance("ECDH");
        C18464 c18464 = new C18464();
        if (i == 256) {
            str = "secp256r1";
        } else if (i == 384) {
            str = "secp384r1";
        } else {
            if (i != 521) {
                throw new C12651(C19370.m44628(i, "unsupported key size: "));
            }
            str = "secp521r1";
        }
        for (int i2 = 0; i2 < 1000; i2++) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(new ECGenParameterSpec(str));
            KeyPair keyPairGenKeyPair = keyPairGenerator.genKeyPair();
            c18464.f57254 = (ECPrivateKey) keyPairGenKeyPair.getPrivate();
            ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenKeyPair.getPublic();
            c18464.f57255 = eCPublicKey;
            eCPublicKey.getParams();
            c18464.f57253 = c18464.f57254.getS().toByteArray();
            ECPoint w = c18464.f57255.getW();
            c18464.f57257 = w.getAffineX().toByteArray();
            byte[] byteArray = w.getAffineY().toByteArray();
            c18464.f57256 = byteArray;
            byte[] bArr = c18464.f57257;
            if (bArr.length == byteArray.length && ((i == 256 && bArr.length == 32) || ((i == 384 && bArr.length == 48) || (i == 521 && bArr.length == 66)))) {
                break;
            }
        }
        byte[] bArr2 = c18464.f57253;
        if (bArr2.length < c18464.f57257.length) {
            byte[] bArr3 = new byte[bArr2.length + 1];
            System.arraycopy(bArr2, 0, bArr3, 1, bArr2.length);
            C14270.m33917(bArr2);
            c18464.f57253 = bArr3;
        }
        this.f31239 = c18464.f57255;
        byte[] bArr4 = c18464.f57257;
        byte[] bArr5 = c18464.f57256;
        byte[] bArr6 = new byte[bArr4.length + 1 + bArr5.length];
        bArr6[0] = 4;
        System.arraycopy(bArr4, 0, bArr6, 1, bArr4.length);
        System.arraycopy(bArr5, 0, bArr6, bArr4.length + 1, bArr5.length);
        this.f31237 = bArr6;
        this.f31238.init(c18464.f57254);
    }

    @Override // l.InterfaceC9124
    public final byte[] getQ() {
        return this.f31237;
    }

    @Override // l.InterfaceC9124
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo23497(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, InvalidKeyException {
        this.f31238.doPhase(KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2)), this.f31239.getParams())), true);
        return this.f31238.generateSecret();
    }

    static {
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerAdd = bigInteger.add(bigInteger);
        f31235 = bigIntegerAdd;
        f31236 = bigIntegerAdd.add(bigInteger);
    }

    @Override // l.InterfaceC9124
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo23498(byte[] bArr, byte[] bArr2) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        BigInteger bigInteger2 = new BigInteger(1, bArr2);
        if (new ECPoint(bigInteger, bigInteger2).equals(ECPoint.POINT_INFINITY)) {
            return false;
        }
        EllipticCurve curve = this.f31239.getParams().getCurve();
        BigInteger p = ((ECFieldFp) curve.getField()).getP();
        BigInteger bigIntegerSubtract = p.subtract(BigInteger.ONE);
        if (bigInteger.compareTo(bigIntegerSubtract) > 0 || bigInteger2.compareTo(bigIntegerSubtract) > 0) {
            return false;
        }
        return bigInteger2.modPow(f31235, p).equals(bigInteger.multiply(curve.getA()).add(curve.getB()).add(bigInteger.modPow(f31236, p)).mod(p));
    }
}
