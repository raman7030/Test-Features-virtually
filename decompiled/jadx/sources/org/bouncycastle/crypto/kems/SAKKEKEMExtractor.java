package org.bouncycastle.crypto.kems;

import java.math.BigInteger;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.params.SAKKEPrivateKeyParameters;
import org.bouncycastle.crypto.params.SAKKEPublicKeyParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes.dex */
public class SAKKEKEMExtractor implements EncapsulatedSecretExtractor {
    public final ECPoint K_bs;
    public final ECPoint P;
    public final ECPoint Z_S;
    public final ECCurve curve;
    public final Digest digest;
    public final BigInteger identifier;
    public final int n;
    public final BigInteger p;
    public final BigInteger q;

    public SAKKEKEMExtractor(SAKKEPrivateKeyParameters sAKKEPrivateKeyParameters) {
        SAKKEPublicKeyParameters publicParams = sAKKEPrivateKeyParameters.getPublicParams();
        this.curve = publicParams.getCurve();
        BigInteger q = publicParams.getQ();
        this.q = q;
        ECPoint point = publicParams.getPoint();
        this.P = point;
        this.p = publicParams.getPrime();
        this.Z_S = publicParams.getZ();
        BigInteger identifier = publicParams.getIdentifier();
        this.identifier = identifier;
        this.K_bs = point.multiply(identifier.add(sAKKEPrivateKeyParameters.getMasterSecret()).modInverse(q)).normalize();
        this.n = publicParams.getN();
        this.digest = publicParams.getDigest();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x00ed A[PHI: r2
      0x00ed: PHI (r2v10 java.math.BigInteger[]) = (r2v9 java.math.BigInteger[]), (r2v13 java.math.BigInteger[]) binds: [B:5:0x00a2, B:7:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    public static BigInteger computePairing(ECPoint eCPoint, ECPoint eCPoint2, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = BigInteger.ONE;
        BigInteger[] bigIntegerArrFp2Multiply = {bigInteger3, BigInteger.ZERO};
        BigInteger bigIntegerSubtract = bigInteger2.subtract(bigInteger3);
        int iBitLength = bigIntegerSubtract.bitLength();
        BigInteger bigInteger4 = eCPoint2.getAffineXCoord().toBigInteger();
        BigInteger bigInteger5 = eCPoint2.getAffineYCoord().toBigInteger();
        BigInteger bigInteger6 = eCPoint.getAffineXCoord().toBigInteger();
        BigInteger bigInteger7 = eCPoint.getAffineYCoord().toBigInteger();
        BigInteger bigIntegerValueOf = BigInteger.valueOf(3L);
        ECPoint eCPointNormalize = eCPoint;
        for (int i = iBitLength - 2; i >= 0; i--) {
            BigInteger bigInteger8 = eCPointNormalize.getAffineXCoord().toBigInteger();
            BigInteger bigInteger9 = eCPointNormalize.getAffineYCoord().toBigInteger();
            BigInteger bigIntegerMod = bigInteger8.multiply(bigInteger8).mod(bigInteger).subtract(BigInteger.ONE).multiply(bigIntegerValueOf).multiply(BigIntegers.modOddInverse(bigInteger, bigInteger9.shiftLeft(1))).mod(bigInteger);
            BigInteger[] bigIntegerArrFp2PointSquare = fp2PointSquare(bigIntegerArrFp2Multiply[0], bigIntegerArrFp2Multiply[1], bigInteger);
            bigIntegerArrFp2Multiply = fp2Multiply(bigIntegerArrFp2PointSquare[0], bigIntegerArrFp2PointSquare[1], bigIntegerMod.multiply(bigInteger4.add(bigInteger8)).subtract(bigInteger9).mod(bigInteger), bigInteger5, bigInteger);
            eCPointNormalize = eCPointNormalize.twice().normalize();
            if (bigIntegerSubtract.testBit(i)) {
                BigInteger bigInteger10 = eCPointNormalize.getAffineXCoord().toBigInteger();
                BigInteger bigInteger11 = eCPointNormalize.getAffineYCoord().toBigInteger();
                bigIntegerArrFp2Multiply = fp2Multiply(bigIntegerArrFp2Multiply[0], bigIntegerArrFp2Multiply[1], bigInteger11.subtract(bigInteger7).multiply(BigIntegers.modOddInverse(bigInteger, bigInteger10.subtract(bigInteger6))).mod(bigInteger).multiply(bigInteger4.add(bigInteger10)).subtract(bigInteger11).mod(bigInteger), bigInteger5, bigInteger);
                if (i > 0) {
                    eCPointNormalize = eCPointNormalize.add(eCPoint).normalize();
                }
            }
        }
        BigInteger[] bigIntegerArrFp2PointSquare2 = fp2PointSquare(bigIntegerArrFp2Multiply[0], bigIntegerArrFp2Multiply[1], bigInteger);
        BigInteger[] bigIntegerArrFp2PointSquare3 = fp2PointSquare(bigIntegerArrFp2PointSquare2[0], bigIntegerArrFp2PointSquare2[1], bigInteger);
        return bigIntegerArrFp2PointSquare3[1].multiply(BigIntegers.modOddInverse(bigInteger, bigIntegerArrFp2PointSquare3[0])).mod(bigInteger);
    }

    public static BigInteger[] fp2Multiply(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        return new BigInteger[]{bigInteger.multiply(bigInteger3).subtract(bigInteger2.multiply(bigInteger4)).mod(bigInteger5), bigInteger.multiply(bigInteger4).add(bigInteger2.multiply(bigInteger3)).mod(bigInteger5)};
    }

    public static BigInteger[] fp2PointSquare(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return new BigInteger[]{bigInteger.add(bigInteger2).multiply(bigInteger.subtract(bigInteger2)).mod(bigInteger3), bigInteger.multiply(bigInteger2).shiftLeft(1).mod(bigInteger3)};
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        ECPoint eCPointSumOfTwoMultiplies;
        ECPoint eCPointDecodePoint = this.curve.decodePoint(Arrays.copyOfRange(bArr, 0, 257));
        BigInteger bigIntegerFromUnsignedByteArray = BigIntegers.fromUnsignedByteArray(bArr, 257, 16);
        BigInteger bigIntegerComputePairing = computePairing(eCPointDecodePoint, this.K_bs, this.p, this.q);
        BigInteger bigIntegerMod = bigIntegerFromUnsignedByteArray.xor(SAKKEKEMSGenerator.hashToIntegerRange(bigIntegerComputePairing.toByteArray(), BigInteger.ONE.shiftLeft(this.n), this.digest)).mod(this.p);
        BigInteger bigInteger = this.identifier;
        BigInteger bigIntegerHashToIntegerRange = SAKKEKEMSGenerator.hashToIntegerRange(Arrays.concatenate(bigIntegerMod.toByteArray(), bigInteger.toByteArray()), this.q, this.digest);
        BigInteger order = this.curve.getOrder();
        if (order == null) {
            eCPointSumOfTwoMultiplies = this.P.multiply(bigInteger).add(this.Z_S).multiply(bigIntegerHashToIntegerRange);
        } else {
            eCPointSumOfTwoMultiplies = ECAlgorithms.sumOfTwoMultiplies(this.P, bigInteger.multiply(bigIntegerHashToIntegerRange).mod(order), this.Z_S, bigIntegerHashToIntegerRange);
        }
        if (eCPointSumOfTwoMultiplies.subtract(eCPointDecodePoint).isInfinity()) {
            return BigIntegers.asUnsignedByteArray(this.n / 8, bigIntegerMod);
        }
        throw new IllegalStateException("Validation of R_bS failed");
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return 273;
    }
}
