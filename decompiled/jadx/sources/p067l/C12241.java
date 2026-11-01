package p067l;

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
public final class C12241 implements InterfaceC11040 {

    /* JADX INFO: renamed from: ܿ */
    public static BigInteger f34200;

    /* JADX INFO: renamed from: ᩳ */
    public static BigInteger f34201;

    /* JADX INFO: renamed from: ֫ */
    public byte[] f34202;

    /* JADX INFO: renamed from: ۧ */
    public KeyAgreement f34203;

    /* JADX INFO: renamed from: ܽ */
    public ECPublicKey f34204;

    @Override // p067l.InterfaceC11040
    /* JADX INFO: renamed from: ֫ */
    public final void mo25447(int i) throws NoSuchAlgorithmException, InvalidKeyException, C14392, InvalidAlgorithmParameterException {
        String str;
        this.f34203 = KeyAgreement.getInstance("ECDH");
        C19916 c19916 = new C19916();
        if (i == 256) {
            str = "secp256r1";
        } else if (i == 384) {
            str = "secp384r1";
        } else {
            if (i != 521) {
                throw new C14392(C20778.m46922(i, "unsupported key size: "));
            }
            str = "secp521r1";
        }
        for (int i2 = 0; i2 < 1000; i2++) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(new ECGenParameterSpec(str));
            KeyPair keyPairGenKeyPair = keyPairGenerator.genKeyPair();
            c19916.f60474 = (ECPrivateKey) keyPairGenKeyPair.getPrivate();
            ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenKeyPair.getPublic();
            c19916.f60475 = eCPublicKey;
            eCPublicKey.getParams();
            c19916.f60473 = c19916.f60474.getS().toByteArray();
            ECPoint w = c19916.f60475.getW();
            c19916.f60477 = w.getAffineX().toByteArray();
            byte[] byteArray = w.getAffineY().toByteArray();
            c19916.f60476 = byteArray;
            byte[] bArr = c19916.f60477;
            if (bArr.length == byteArray.length && ((i == 256 && bArr.length == 32) || ((i == 384 && bArr.length == 48) || (i == 521 && bArr.length == 66)))) {
                break;
            }
        }
        byte[] bArr2 = c19916.f60473;
        if (bArr2.length < c19916.f60477.length) {
            byte[] bArr3 = new byte[bArr2.length + 1];
            System.arraycopy(bArr2, 0, bArr3, 1, bArr2.length);
            C15930.m36050(bArr2);
            c19916.f60473 = bArr3;
        }
        this.f34204 = c19916.f60475;
        byte[] bArr4 = c19916.f60477;
        byte[] bArr5 = c19916.f60476;
        byte[] bArr6 = new byte[bArr4.length + 1 + bArr5.length];
        bArr6[0] = 4;
        System.arraycopy(bArr4, 0, bArr6, 1, bArr4.length);
        System.arraycopy(bArr5, 0, bArr6, bArr4.length + 1, bArr5.length);
        this.f34202 = bArr6;
        this.f34203.init(c19916.f60474);
    }

    @Override // p067l.InterfaceC11040
    public final byte[] getQ() {
        return this.f34202;
    }

    @Override // p067l.InterfaceC11040
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo25448(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, InvalidKeyException {
        this.f34203.doPhase(KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2)), this.f34204.getParams())), true);
        return this.f34203.generateSecret();
    }

    static {
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerAdd = bigInteger.add(bigInteger);
        f34200 = bigIntegerAdd;
        f34201 = bigIntegerAdd.add(bigInteger);
    }

    @Override // p067l.InterfaceC11040
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo25449(byte[] bArr, byte[] bArr2) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        BigInteger bigInteger2 = new BigInteger(1, bArr2);
        if (new ECPoint(bigInteger, bigInteger2).equals(ECPoint.POINT_INFINITY)) {
            return false;
        }
        EllipticCurve curve = this.f34204.getParams().getCurve();
        BigInteger p = ((ECFieldFp) curve.getField()).getP();
        BigInteger bigIntegerSubtract = p.subtract(BigInteger.ONE);
        if (bigInteger.compareTo(bigIntegerSubtract) > 0 || bigInteger2.compareTo(bigIntegerSubtract) > 0) {
            return false;
        }
        return bigInteger2.modPow(f34200, p).equals(bigInteger.multiply(curve.getA()).add(curve.getB()).add(bigInteger.modPow(f34201, p)).mod(p));
    }
}
