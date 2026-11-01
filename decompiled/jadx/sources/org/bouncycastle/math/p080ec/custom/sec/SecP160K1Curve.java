package org.bouncycastle.math.p080ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.p080ec.AbstractECLookupTable;
import org.bouncycastle.math.p080ec.ECConstants;
import org.bouncycastle.math.p080ec.ECCurve;
import org.bouncycastle.math.p080ec.ECFieldElement;
import org.bouncycastle.math.p080ec.ECLookupTable;
import org.bouncycastle.math.p080ec.ECPoint;
import org.bouncycastle.math.raw.Nat160;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes2.dex */
public class SecP160K1Curve extends ECCurve.AbstractFp {
    public static final int SECP160K1_DEFAULT_COORDS = 2;
    public SecP160K1Point infinity;

    /* JADX INFO: renamed from: q */
    public static final BigInteger f81441q = SecP160R2FieldElement.f81451Q;
    public static final ECFieldElement[] SECP160K1_AFFINE_ZS = {new SecP160R2FieldElement(ECConstants.ONE)};

    public SecP160K1Curve() {
        super(f81441q);
        this.infinity = new SecP160K1Point(this, null, null);
        this.f81405a = fromBigInteger(ECConstants.ZERO);
        this.f81406b = fromBigInteger(BigInteger.valueOf(7L));
        this.order = new BigInteger(1, Hex.decodeStrict("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.p080ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP160K1Curve();
    }

    @Override // org.bouncycastle.math.p080ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i, final int i2) {
        final int[] iArr = new int[i2 * 10];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            ECPoint eCPoint = eCPointArr[i + i4];
            Nat160.copy(((SecP160R2FieldElement) eCPoint.getRawXCoord()).f81452x, 0, iArr, i3);
            Nat160.copy(((SecP160R2FieldElement) eCPoint.getRawYCoord()).f81452x, 0, iArr, i3 + 5);
            i3 += 10;
        }
        return new AbstractECLookupTable(this) { // from class: org.bouncycastle.math.ec.custom.sec.SecP160K1Curve.1
            public final /* synthetic */ SecP160K1Curve this$0;

            {
                this.this$0 = this;
            }

            private ECPoint createPoint(int[] iArr2, int[] iArr3) {
                return this.this$0.createRawPoint(new SecP160R2FieldElement(iArr2), new SecP160R2FieldElement(iArr3), SecP160K1Curve.SECP160K1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.p080ec.ECLookupTable
            public int getSize() {
                return i2;
            }

            @Override // org.bouncycastle.math.p080ec.ECLookupTable
            public ECPoint lookup(int i5) {
                int[] iArrCreate = Nat160.create();
                int[] iArrCreate2 = Nat160.create();
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    int i8 = ((i7 ^ i5) - 1) >> 31;
                    for (int i9 = 0; i9 < 5; i9++) {
                        int i10 = iArrCreate[i9];
                        int[] iArr2 = iArr;
                        iArrCreate[i9] = i10 ^ (iArr2[i6 + i9] & i8);
                        iArrCreate2[i9] = iArrCreate2[i9] ^ (iArr2[(i6 + 5) + i9] & i8);
                    }
                    i6 += 10;
                }
                return createPoint(iArrCreate, iArrCreate2);
            }

            @Override // org.bouncycastle.math.p080ec.AbstractECLookupTable, org.bouncycastle.math.p080ec.ECLookupTable
            public ECPoint lookupVar(int i5) {
                int[] iArrCreate = Nat160.create();
                int[] iArrCreate2 = Nat160.create();
                int i6 = i5 * 10;
                for (int i7 = 0; i7 < 5; i7++) {
                    int[] iArr2 = iArr;
                    iArrCreate[i7] = iArr2[i6 + i7];
                    iArrCreate2[i7] = iArr2[5 + i6 + i7];
                }
                return createPoint(iArrCreate, iArrCreate2);
            }
        };
    }

    @Override // org.bouncycastle.math.p080ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP160K1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.p080ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP160K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }

    @Override // org.bouncycastle.math.p080ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP160R2FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.p080ec.ECCurve
    public int getFieldSize() {
        return f81441q.bitLength();
    }

    @Override // org.bouncycastle.math.p080ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp
    public BigInteger getQ() {
        return f81441q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.p080ec.ECCurve
    public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
        int[] iArrCreate = Nat160.create();
        SecP160R2Field.random(secureRandom, iArrCreate);
        return new SecP160R2FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.p080ec.ECCurve
    public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
        int[] iArrCreate = Nat160.create();
        SecP160R2Field.randomMult(secureRandom, iArrCreate);
        return new SecP160R2FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 2;
    }
}
