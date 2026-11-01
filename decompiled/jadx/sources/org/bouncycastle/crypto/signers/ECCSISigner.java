package org.bouncycastle.crypto.signers;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.asn1.p073x9.X9ECParameters;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.ECCSIPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECCSIPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.p080ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes.dex */
public class ECCSISigner implements Signer {

    /* JADX INFO: renamed from: G */
    public final ECPoint f81311G;

    /* JADX INFO: renamed from: N */
    public final int f81312N;

    /* JADX INFO: renamed from: Y */
    public ECPoint f81313Y;
    public final Digest digest;
    public boolean forSigning;

    /* JADX INFO: renamed from: id */
    public final byte[] f81314id;

    /* JADX INFO: renamed from: j */
    public BigInteger f81315j;
    public final ECPoint kpak;
    public CipherParameters param;

    /* JADX INFO: renamed from: q */
    public final BigInteger f81316q;

    /* JADX INFO: renamed from: r */
    public BigInteger f81317r;
    public ByteArrayOutputStream stream;

    public ECCSISigner(ECPoint eCPoint, X9ECParameters x9ECParameters, Digest digest, byte[] bArr) {
        this.kpak = eCPoint;
        this.f81314id = bArr;
        this.f81316q = x9ECParameters.getCurve().getOrder();
        this.f81311G = x9ECParameters.getG();
        this.digest = digest;
        digest.reset();
        this.f81312N = (x9ECParameters.getCurve().getOrder().bitLength() + 7) >> 3;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        ECCSIPrivateKeyParameters eCCSIPrivateKeyParameters = (ECCSIPrivateKeyParameters) ((ParametersWithRandom) this.param).getParameters();
        BigInteger bigIntegerMod = new BigInteger(1, bArr).add(this.f81317r.multiply(eCCSIPrivateKeyParameters.getSSK())).mod(this.f81316q);
        if (bigIntegerMod.equals(BigInteger.ZERO)) {
            throw new IllegalArgumentException("Invalid j, retry");
        }
        return Arrays.concatenate(BigIntegers.asUnsignedByteArray(this.f81312N, this.f81317r), BigIntegers.asUnsignedByteArray(this.f81312N, bigIntegerMod.modInverse(this.f81316q).multiply(this.f81315j).mod(this.f81316q)), eCCSIPrivateKeyParameters.getPublicKeyParameters().getPVT().getEncoded(false));
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forSigning = z;
        this.param = cipherParameters;
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        SecureRandom random;
        ECPoint pvt;
        ECPoint eCPointMultiply;
        this.digest.reset();
        CipherParameters parameters = this.param;
        if (parameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) parameters;
            random = parametersWithRandom.getRandom();
            parameters = parametersWithRandom.getParameters();
        } else {
            random = null;
        }
        if (this.forSigning) {
            ECCSIPrivateKeyParameters eCCSIPrivateKeyParameters = (ECCSIPrivateKeyParameters) parameters;
            pvt = eCCSIPrivateKeyParameters.getPublicKeyParameters().getPVT();
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(this.f81316q.bitLength(), random);
            this.f81315j = bigIntegerCreateRandomBigInteger;
            this.f81317r = this.f81311G.multiply(bigIntegerCreateRandomBigInteger).normalize().getAffineXCoord().toBigInteger().mod(this.f81316q);
            eCPointMultiply = this.f81311G.multiply(eCCSIPrivateKeyParameters.getSSK());
        } else {
            ECPoint pvt2 = ((ECCSIPublicKeyParameters) parameters).getPVT();
            this.stream = new ByteArrayOutputStream();
            pvt = pvt2;
            eCPointMultiply = null;
        }
        byte[] encoded = this.f81311G.getEncoded(false);
        this.digest.update(encoded, 0, encoded.length);
        byte[] encoded2 = this.kpak.getEncoded(false);
        this.digest.update(encoded2, 0, encoded2.length);
        Digest digest = this.digest;
        byte[] bArr = this.f81314id;
        digest.update(bArr, 0, bArr.length);
        byte[] encoded3 = pvt.getEncoded(false);
        this.digest.update(encoded3, 0, encoded3.length);
        int digestSize = this.digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        this.digest.doFinal(bArr2, 0);
        BigInteger bigIntegerMod = new BigInteger(1, bArr2).mod(this.f81316q);
        this.digest.update(bArr2, 0, digestSize);
        if (!this.forSigning) {
            this.f81313Y = pvt.multiply(bigIntegerMod).add(this.kpak).normalize();
        } else {
            if (!eCPointMultiply.subtract(pvt.multiply(bigIntegerMod)).normalize().equals(this.kpak)) {
                throw new IllegalArgumentException("Invalid KPAK");
            }
            byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(this.f81312N, this.f81317r);
            this.digest.update(bArrAsUnsignedByteArray, 0, bArrAsUnsignedByteArray.length);
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        if (this.forSigning) {
            this.digest.update(b);
        } else {
            this.stream.write(b);
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        if (this.forSigning) {
            this.digest.update(bArr, i, i2);
        } else {
            this.stream.write(bArr, i, i2);
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, this.f81312N);
        int i = this.f81312N;
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, i, i << 1));
        this.f81317r = new BigInteger(1, bArrCopyOf).mod(this.f81316q);
        this.digest.update(bArrCopyOf, 0, this.f81312N);
        byte[] byteArray = this.stream.toByteArray();
        this.digest.update(byteArray, 0, byteArray.length);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        return this.f81311G.multiply(new BigInteger(1, bArr2).mod(this.f81316q)).normalize().add(this.f81313Y.multiply(this.f81317r).normalize()).normalize().multiply(bigInteger).normalize().getAffineXCoord().toBigInteger().mod(this.f81316q).equals(this.f81317r.mod(this.f81316q));
    }
}
