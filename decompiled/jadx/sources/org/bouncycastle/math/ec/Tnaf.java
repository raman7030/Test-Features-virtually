package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes2.dex */
public class Tnaf {
    public static final BigInteger MINUS_ONE;
    public static final BigInteger MINUS_THREE;
    public static final BigInteger MINUS_TWO;
    public static final byte WIDTH = 4;
    public static final ZTauElement[] alpha0;
    public static final byte[][] alpha0Tnaf;
    public static final ZTauElement[] alpha1;
    public static final byte[][] alpha1Tnaf;

    static {
        BigInteger bigInteger = ECConstants.ONE;
        BigInteger bigIntegerNegate = bigInteger.negate();
        MINUS_ONE = bigIntegerNegate;
        MINUS_TWO = ECConstants.TWO.negate();
        BigInteger bigInteger2 = ECConstants.THREE;
        BigInteger bigIntegerNegate2 = bigInteger2.negate();
        MINUS_THREE = bigIntegerNegate2;
        BigInteger bigInteger3 = ECConstants.ZERO;
        alpha0 = new ZTauElement[]{null, new ZTauElement(bigInteger, bigInteger3), null, new ZTauElement(bigIntegerNegate2, bigIntegerNegate), null, new ZTauElement(bigIntegerNegate, bigIntegerNegate), null, new ZTauElement(bigInteger, bigIntegerNegate), null, new ZTauElement(bigIntegerNegate, bigInteger), null, new ZTauElement(bigInteger, bigInteger), null, new ZTauElement(bigInteger2, bigInteger), null, new ZTauElement(bigIntegerNegate, bigInteger3)};
        alpha0Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        alpha1 = new ZTauElement[]{null, new ZTauElement(bigInteger, bigInteger3), null, new ZTauElement(bigIntegerNegate2, bigInteger), null, new ZTauElement(bigIntegerNegate, bigInteger), null, new ZTauElement(bigInteger, bigInteger), null, new ZTauElement(bigIntegerNegate, bigIntegerNegate), null, new ZTauElement(bigInteger, bigIntegerNegate), null, new ZTauElement(bigInteger2, bigIntegerNegate), null, new ZTauElement(bigIntegerNegate, bigInteger3)};
        alpha1Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    public static SimpleBigDecimal approximateDivisionByN(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b, int i, int i2) {
        int i3 = ((i + 5) / 2) + i2;
        BigInteger bigIntegerMultiply = bigInteger2.multiply(bigInteger.shiftRight(((i - i3) - 2) + b));
        BigInteger bigIntegerAdd = bigIntegerMultiply.add(bigInteger3.multiply(bigIntegerMultiply.shiftRight(i)));
        int i4 = i3 - i2;
        BigInteger bigIntegerShiftRight = bigIntegerAdd.shiftRight(i4);
        if (bigIntegerAdd.testBit(i4 - 1)) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(ECConstants.ONE);
        }
        return new SimpleBigDecimal(bigIntegerShiftRight, i2);
    }

    public static BigInteger[] getLucas(byte b, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigIntegerSubtract;
        if (b != 1 && b != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        if (z) {
            bigInteger = ECConstants.TWO;
            bigIntegerSubtract = BigInteger.valueOf(b);
        } else {
            bigInteger = ECConstants.ZERO;
            bigIntegerSubtract = ECConstants.ONE;
        }
        int i2 = 1;
        while (i2 < i) {
            i2++;
            BigInteger bigInteger2 = bigIntegerSubtract;
            bigIntegerSubtract = (b < 0 ? bigIntegerSubtract.negate() : bigIntegerSubtract).subtract(bigInteger.shiftLeft(1));
            bigInteger = bigInteger2;
        }
        return new BigInteger[]{bigInteger, bigIntegerSubtract};
    }

    public static byte getMu(int i) {
        return (byte) (i == 0 ? -1 : 1);
    }

    public static byte getMu(ECCurve.AbstractF2m abstractF2m) {
        if (abstractF2m.isKoblitz()) {
            return abstractF2m.getA().isZero() ? (byte) -1 : (byte) 1;
        }
        throw new IllegalArgumentException("No Koblitz curve (ABC), TNAF multiplication not possible");
    }

    public static byte getMu(ECFieldElement eCFieldElement) {
        return (byte) (eCFieldElement.isZero() ? -1 : 1);
    }

    public static ECPoint.AbstractF2m[] getPreComp(ECPoint.AbstractF2m abstractF2m, byte b) {
        ECPoint.AbstractF2m abstractF2m2 = (ECPoint.AbstractF2m) abstractF2m.negate();
        byte[][] bArr = b == 0 ? alpha0Tnaf : alpha1Tnaf;
        ECPoint.AbstractF2m[] abstractF2mArr = new ECPoint.AbstractF2m[(bArr.length + 1) >>> 1];
        abstractF2mArr[0] = abstractF2m;
        int length = bArr.length;
        for (int i = 3; i < length; i += 2) {
            abstractF2mArr[i >>> 1] = multiplyFromTnaf(abstractF2m, abstractF2m2, bArr[i]);
        }
        abstractF2m.getCurve().normalizeAll(abstractF2mArr);
        return abstractF2mArr;
    }

    public static int getShiftsForCofactor(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(ECConstants.TWO)) {
                return 1;
            }
            if (bigInteger.equals(ECConstants.FOUR)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    public static BigInteger[] getSi(int i, int i2, BigInteger bigInteger) {
        byte mu = getMu(i2);
        int shiftsForCofactor = getShiftsForCofactor(bigInteger);
        BigInteger[] lucas = getLucas(mu, (i + 3) - i2, false);
        if (mu == 1) {
            lucas[0] = lucas[0].negate();
            lucas[1] = lucas[1].negate();
        }
        BigInteger bigInteger2 = ECConstants.ONE;
        return new BigInteger[]{bigInteger2.add(lucas[1]).shiftRight(shiftsForCofactor), bigInteger2.add(lucas[0]).shiftRight(shiftsForCofactor).negate()};
    }

    public static BigInteger[] getSi(ECCurve.AbstractF2m abstractF2m) {
        if (abstractF2m.isKoblitz()) {
            return getSi(abstractF2m.getFieldSize(), abstractF2m.getA().toBigInteger().intValue(), abstractF2m.getCofactor());
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }

    public static BigInteger getTw(byte b, int i) {
        if (i == 4) {
            return b == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
        }
        BigInteger[] lucas = getLucas(b, i, false);
        BigInteger bit = ECConstants.ZERO.setBit(i);
        return lucas[0].shiftLeft(1).multiply(lucas[1].modInverse(bit)).mod(bit);
    }

    public static ECPoint.AbstractF2m multiplyFromTnaf(ECPoint.AbstractF2m abstractF2m, ECPoint.AbstractF2m abstractF2m2, byte[] bArr) {
        ECPoint.AbstractF2m abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m.getCurve().getInfinity();
        int i = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i++;
            byte b = bArr[length];
            if (b != 0) {
                abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m3.tauPow(i).add(b > 0 ? abstractF2m : abstractF2m2);
                i = 0;
            }
        }
        return i > 0 ? abstractF2m3.tauPow(i) : abstractF2m3;
    }

    public static ECPoint.AbstractF2m multiplyRTnaf(ECPoint.AbstractF2m abstractF2m, BigInteger bigInteger) {
        ECCurve.AbstractF2m abstractF2m2 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
        int iIntValue = abstractF2m2.getA().toBigInteger().intValue();
        return multiplyTnaf(abstractF2m, partModReduction(abstractF2m2, bigInteger, (byte) iIntValue, getMu(iIntValue), (byte) 10));
    }

    public static ECPoint.AbstractF2m multiplyTnaf(ECPoint.AbstractF2m abstractF2m, ZTauElement zTauElement) {
        return multiplyFromTnaf(abstractF2m, (ECPoint.AbstractF2m) abstractF2m.negate(), tauAdicNaf(getMu(((ECCurve.AbstractF2m) abstractF2m.getCurve()).getA()), zTauElement));
    }

    public static BigInteger norm(byte b, ZTauElement zTauElement) {
        BigInteger bigIntegerSubtract;
        BigInteger bigInteger = zTauElement.u;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger);
        if (b == 1) {
            bigIntegerSubtract = zTauElement.v.shiftLeft(1).add(zTauElement.u);
        } else {
            if (b != -1) {
                throw new IllegalArgumentException("mu must be 1 or -1");
            }
            bigIntegerSubtract = zTauElement.v.shiftLeft(1).subtract(zTauElement.u);
        }
        return bigIntegerSubtract.multiply(zTauElement.v).add(bigIntegerMultiply);
    }

    public static SimpleBigDecimal norm(byte b, SimpleBigDecimal simpleBigDecimal, SimpleBigDecimal simpleBigDecimal2) {
        SimpleBigDecimal simpleBigDecimalSubtract;
        SimpleBigDecimal simpleBigDecimalMultiply = simpleBigDecimal.multiply(simpleBigDecimal);
        SimpleBigDecimal simpleBigDecimalMultiply2 = simpleBigDecimal.multiply(simpleBigDecimal2);
        SimpleBigDecimal simpleBigDecimalShiftLeft = simpleBigDecimal2.multiply(simpleBigDecimal2).shiftLeft(1);
        if (b == 1) {
            simpleBigDecimalSubtract = simpleBigDecimalMultiply.add(simpleBigDecimalMultiply2);
        } else {
            if (b != -1) {
                throw new IllegalArgumentException("mu must be 1 or -1");
            }
            simpleBigDecimalSubtract = simpleBigDecimalMultiply.subtract(simpleBigDecimalMultiply2);
        }
        return simpleBigDecimalSubtract.add(simpleBigDecimalShiftLeft);
    }

    public static ZTauElement partModReduction(ECCurve.AbstractF2m abstractF2m, BigInteger bigInteger, byte b, byte b2, byte b3) {
        BigInteger bigIntegerSubtract;
        int fieldSize = abstractF2m.getFieldSize();
        BigInteger[] si = abstractF2m.getSi();
        BigInteger bigIntegerAdd = b2 == 1 ? si[0].add(si[1]) : si[0].subtract(si[1]);
        if (abstractF2m.isKoblitz()) {
            BigInteger bigInteger2 = ECConstants.ONE;
            bigIntegerSubtract = bigInteger2.shiftLeft(fieldSize).add(bigInteger2).subtract(abstractF2m.getOrder().multiply(abstractF2m.getCofactor()));
        } else {
            bigIntegerSubtract = getLucas(b2, fieldSize, true)[1];
        }
        BigInteger bigInteger3 = bigIntegerSubtract;
        ZTauElement zTauElementRound = round(approximateDivisionByN(bigInteger, si[0], bigInteger3, b, fieldSize, b3), approximateDivisionByN(bigInteger, si[1], bigInteger3, b, fieldSize, b3), b2);
        return new ZTauElement(bigInteger.subtract(bigIntegerAdd.multiply(zTauElementRound.u)).subtract(si[1].multiply(zTauElementRound.v).shiftLeft(1)), si[1].multiply(zTauElementRound.u).subtract(si[0].multiply(zTauElementRound.v)));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r5.compareTo(org.bouncycastle.math.ec.Tnaf.MINUS_ONE) < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r5.compareTo(r9) >= 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ZTauElement round(SimpleBigDecimal simpleBigDecimal, SimpleBigDecimal simpleBigDecimal2, byte b) {
        SimpleBigDecimal simpleBigDecimalAdd;
        SimpleBigDecimal simpleBigDecimalSubtract;
        if (simpleBigDecimal2.getScale() != simpleBigDecimal.getScale()) {
            throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
        }
        int i = -1;
        int i2 = 1;
        if (b != 1 && b != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger bigIntegerRound = simpleBigDecimal.round();
        BigInteger bigIntegerRound2 = simpleBigDecimal2.round();
        SimpleBigDecimal simpleBigDecimalSubtract2 = simpleBigDecimal.subtract(bigIntegerRound);
        SimpleBigDecimal simpleBigDecimalSubtract3 = simpleBigDecimal2.subtract(bigIntegerRound2);
        SimpleBigDecimal simpleBigDecimalAdd2 = simpleBigDecimalSubtract2.add(simpleBigDecimalSubtract2);
        SimpleBigDecimal simpleBigDecimalAdd3 = b == 1 ? simpleBigDecimalAdd2.add(simpleBigDecimalSubtract3) : simpleBigDecimalAdd2.subtract(simpleBigDecimalSubtract3);
        SimpleBigDecimal simpleBigDecimalAdd4 = simpleBigDecimalSubtract3.add(simpleBigDecimalSubtract3).add(simpleBigDecimalSubtract3);
        SimpleBigDecimal simpleBigDecimalAdd5 = simpleBigDecimalAdd4.add(simpleBigDecimalSubtract3);
        if (b == 1) {
            simpleBigDecimalAdd = simpleBigDecimalSubtract2.subtract(simpleBigDecimalAdd4);
            simpleBigDecimalSubtract = simpleBigDecimalSubtract2.add(simpleBigDecimalAdd5);
        } else {
            simpleBigDecimalAdd = simpleBigDecimalSubtract2.add(simpleBigDecimalAdd4);
            simpleBigDecimalSubtract = simpleBigDecimalSubtract2.subtract(simpleBigDecimalAdd5);
        }
        BigInteger bigInteger = ECConstants.ONE;
        byte b2 = 0;
        if (simpleBigDecimalAdd3.compareTo(bigInteger) < 0) {
            if (simpleBigDecimalSubtract.compareTo(ECConstants.TWO) >= 0) {
            }
            i2 = 0;
            if (simpleBigDecimalAdd3.compareTo(MINUS_ONE) < 0) {
                if (simpleBigDecimalSubtract.compareTo(MINUS_TWO) < 0) {
                }
                i = i2;
                return new ZTauElement(bigIntegerRound.add(BigInteger.valueOf(i)), bigIntegerRound2.add(BigInteger.valueOf(b2)));
            }
            b2 = (byte) (-b);
            i = i2;
            return new ZTauElement(bigIntegerRound.add(BigInteger.valueOf(i)), bigIntegerRound2.add(BigInteger.valueOf(b2)));
        }
        b2 = b;
        i2 = 0;
        if (simpleBigDecimalAdd3.compareTo(MINUS_ONE) < 0) {
            if (simpleBigDecimalSubtract.compareTo(MINUS_TWO) < 0) {
            }
            i = i2;
            return new ZTauElement(bigIntegerRound.add(BigInteger.valueOf(i)), bigIntegerRound2.add(BigInteger.valueOf(b2)));
        }
        b2 = (byte) (-b);
        i = i2;
        return new ZTauElement(bigIntegerRound.add(BigInteger.valueOf(i)), bigIntegerRound2.add(BigInteger.valueOf(b2)));
    }

    public static ECPoint.AbstractF2m tau(ECPoint.AbstractF2m abstractF2m) {
        return abstractF2m.tau();
    }

    public static byte[] tauAdicNaf(byte b, ZTauElement zTauElement) {
        if (b != 1 && b != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int iBitLength = norm(b, zTauElement).bitLength();
        byte[] bArr = new byte[iBitLength > 30 ? iBitLength + 4 : 34];
        BigInteger bigIntegerClearBit = zTauElement.u;
        BigInteger bigInteger = zTauElement.v;
        int i = 0;
        int i2 = 0;
        while (true) {
            BigInteger bigInteger2 = ECConstants.ZERO;
            if (bigIntegerClearBit.equals(bigInteger2) && bigInteger.equals(bigInteger2)) {
                int i3 = i + 1;
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, 0, bArr2, 0, i3);
                return bArr2;
            }
            if (bigIntegerClearBit.testBit(0)) {
                byte bIntValue = (byte) ECConstants.TWO.subtract(bigIntegerClearBit.subtract(bigInteger.shiftLeft(1)).mod(ECConstants.FOUR)).intValue();
                bArr[i2] = bIntValue;
                bigIntegerClearBit = bIntValue == 1 ? bigIntegerClearBit.clearBit(0) : bigIntegerClearBit.add(ECConstants.ONE);
                i = i2;
            } else {
                bArr[i2] = 0;
            }
            BigInteger bigIntegerShiftRight = bigIntegerClearBit.shiftRight(1);
            BigInteger bigIntegerAdd = b == 1 ? bigInteger.add(bigIntegerShiftRight) : bigInteger.subtract(bigIntegerShiftRight);
            BigInteger bigIntegerNegate = bigIntegerClearBit.shiftRight(1).negate();
            i2++;
            bigIntegerClearBit = bigIntegerAdd;
            bigInteger = bigIntegerNegate;
        }
    }

    public static byte[] tauAdicWNaf(byte b, ZTauElement zTauElement, int i, int i2, ZTauElement[] zTauElementArr) {
        if (b != 1 && b != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int iBitLength = norm(b, zTauElement).bitLength();
        byte[] bArr = new byte[iBitLength > 30 ? iBitLength + 4 + i : i + 34];
        int i3 = (1 << i) - 1;
        int i4 = 32 - i;
        BigInteger bigIntegerSubtract = zTauElement.u;
        BigInteger bigIntegerSubtract2 = zTauElement.v;
        int i5 = 0;
        while (true) {
            if (bigIntegerSubtract.bitLength() <= 62 && bigIntegerSubtract2.bitLength() <= 62) {
                break;
            }
            if (bigIntegerSubtract.testBit(0)) {
                int iIntValue = (bigIntegerSubtract2.intValue() * i2) + bigIntegerSubtract.intValue();
                int i6 = iIntValue & i3;
                bArr[i5] = (byte) ((iIntValue << i4) >> i4);
                bigIntegerSubtract = bigIntegerSubtract.subtract(zTauElementArr[i6].u);
                bigIntegerSubtract2 = bigIntegerSubtract2.subtract(zTauElementArr[i6].v);
            }
            i5++;
            BigInteger bigIntegerShiftRight = bigIntegerSubtract.shiftRight(1);
            BigInteger bigIntegerAdd = b == 1 ? bigIntegerSubtract2.add(bigIntegerShiftRight) : bigIntegerSubtract2.subtract(bigIntegerShiftRight);
            BigInteger bigIntegerNegate = bigIntegerShiftRight.negate();
            bigIntegerSubtract = bigIntegerAdd;
            bigIntegerSubtract2 = bigIntegerNegate;
        }
        long jLongValueExact = BigIntegers.longValueExact(bigIntegerSubtract);
        long jLongValueExact2 = BigIntegers.longValueExact(bigIntegerSubtract2);
        while ((jLongValueExact | jLongValueExact2) != 0) {
            if ((1 & jLongValueExact) != 0) {
                int i7 = (((int) jLongValueExact2) * i2) + ((int) jLongValueExact);
                int i8 = i7 & i3;
                bArr[i5] = (byte) ((i7 << i4) >> i4);
                jLongValueExact -= (long) zTauElementArr[i8].u.intValue();
                jLongValueExact2 -= (long) zTauElementArr[i8].v.intValue();
            }
            i5++;
            long j = jLongValueExact >> 1;
            long j2 = b == 1 ? jLongValueExact2 + j : jLongValueExact2 - j;
            long j3 = -j;
            jLongValueExact = j2;
            jLongValueExact2 = j3;
        }
        return bArr;
    }
}
