package org.bouncycastle.math.p080ec.custom.djb;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.p080ec.AbstractECLookupTable;
import org.bouncycastle.math.p080ec.ECConstants;
import org.bouncycastle.math.p080ec.ECCurve;
import org.bouncycastle.math.p080ec.ECFieldElement;
import org.bouncycastle.math.p080ec.ECLookupTable;
import org.bouncycastle.math.p080ec.ECPoint;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes2.dex */
public class Curve25519 extends ECCurve.AbstractFp {
    public static final ECFieldElement[] CURVE25519_AFFINE_ZS;
    public static final int CURVE25519_DEFAULT_COORDS = 4;
    public static final BigInteger C_a;
    public static final BigInteger C_b;

    /* JADX INFO: renamed from: q */
    public static final BigInteger f81425q = Curve25519FieldElement.f81429Q;
    public Curve25519Point infinity;

    static {
        BigInteger bigInteger = new BigInteger(1, Hex.decodeStrict("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144"));
        C_a = bigInteger;
        C_b = new BigInteger(1, Hex.decodeStrict("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864"));
        CURVE25519_AFFINE_ZS = new ECFieldElement[]{new Curve25519FieldElement(ECConstants.ONE), new Curve25519FieldElement(bigInteger)};
    }

    public Curve25519() {
        super(f81425q);
        this.infinity = new Curve25519Point(this, null, null);
        this.f81405a = fromBigInteger(C_a);
        this.f81406b = fromBigInteger(C_b);
        this.order = new BigInteger(1, Hex.decodeStrict("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.cofactor = BigInteger.valueOf(8L);
        this.coord = 4;
    }

    @Override // org.bouncycastle.math.p080ec.ECCurve
    public ECCurve cloneCurve() {
        return new Curve25519();
    }

    @Override // org.bouncycastle.math.p080ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i, final int i2) {
        final int[] iArr = new int[i2 * 16];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            ECPoint eCPoint = eCPointArr[i + i4];
            Nat256.copy(((Curve25519FieldElement) eCPoint.getRawXCoord()).f81430x, 0, iArr, i3);
            Nat256.copy(((Curve25519FieldElement) eCPoint.getRawYCoord()).f81430x, 0, iArr, i3 + 8);
            i3 += 16;
        }
        return new AbstractECLookupTable(this) { // from class: org.bouncycastle.math.ec.custom.djb.Curve25519.1
            public final /* synthetic */ Curve25519 this$0;

            {
                this.this$0 = this;
            }

            private ECPoint createPoint(int[] iArr2, int[] iArr3) {
                return this.this$0.createRawPoint(new Curve25519FieldElement(iArr2), new Curve25519FieldElement(iArr3), Curve25519.CURVE25519_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.p080ec.ECLookupTable
            public int getSize() {
                return i2;
            }

            @Override // org.bouncycastle.math.p080ec.ECLookupTable
            public ECPoint lookup(int i5) {
                int[] iArrCreate = Nat256.create();
                int[] iArrCreate2 = Nat256.create();
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    int i8 = ((i7 ^ i5) - 1) >> 31;
                    for (int i9 = 0; i9 < 8; i9++) {
                        int i10 = iArrCreate[i9];
                        int[] iArr2 = iArr;
                        iArrCreate[i9] = i10 ^ (iArr2[i6 + i9] & i8);
                        iArrCreate2[i9] = iArrCreate2[i9] ^ (iArr2[(i6 + 8) + i9] & i8);
                    }
                    i6 += 16;
                }
                return createPoint(iArrCreate, iArrCreate2);
            }

            @Override // org.bouncycastle.math.p080ec.AbstractECLookupTable, org.bouncycastle.math.p080ec.ECLookupTable
            public ECPoint lookupVar(int i5) {
                int[] iArrCreate = Nat256.create();
                int[] iArrCreate2 = Nat256.create();
                int i6 = i5 * 16;
                for (int i7 = 0; i7 < 8; i7++) {
                    int[] iArr2 = iArr;
                    iArrCreate[i7] = iArr2[i6 + i7];
                    iArrCreate2[i7] = iArr2[8 + i6 + i7];
                }
                return createPoint(iArrCreate, iArrCreate2);
            }
        };
    }

    @Override // org.bouncycastle.math.p080ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new Curve25519Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.p080ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new Curve25519Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }

    @Override // org.bouncycastle.math.p080ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new Curve25519FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.p080ec.ECCurve
    public int getFieldSize() {
        return f81425q.bitLength();
    }

    @Override // org.bouncycastle.math.p080ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp
    public BigInteger getQ() {
        return f81425q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.p080ec.ECCurve
    public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.random(secureRandom, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.p080ec.ECCurve
    public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.randomMult(secureRandom, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 4;
    }
}
