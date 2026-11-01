package org.bouncycastle.math.p080ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p080ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes2.dex */
public class SecP256R1FieldElement extends ECFieldElement.AbstractFp {

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f81484Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));

    /* JADX INFO: renamed from: x */
    public int[] f81485x;

    public SecP256R1FieldElement() {
        this.f81485x = Nat256.create();
    }

    public SecP256R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f81484Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.f81485x = SecP256R1Field.fromBigInteger(bigInteger);
    }

    public SecP256R1FieldElement(int[] iArr) {
        this.f81485x = iArr;
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.add(this.f81485x, ((SecP256R1FieldElement) eCFieldElement).f81485x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.addOne(this.f81485x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.inv(((SecP256R1FieldElement) eCFieldElement).f81485x, iArrCreate);
        SecP256R1Field.multiply(iArrCreate, this.f81485x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP256R1FieldElement) {
            return Nat256.m55418eq(this.f81485x, ((SecP256R1FieldElement) obj).f81485x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public String getFieldName() {
        return "SecP256R1Field";
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public int getFieldSize() {
        return f81484Q.bitLength();
    }

    public int hashCode() {
        return f81484Q.hashCode() ^ Arrays.hashCode(this.f81485x, 0, 8);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.inv(this.f81485x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne(this.f81485x);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero(this.f81485x);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.multiply(this.f81485x, ((SecP256R1FieldElement) eCFieldElement).f81485x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.negate(this.f81485x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f81485x;
        if (Nat256.isZero(iArr) || Nat256.isOne(iArr)) {
            return this;
        }
        int[] iArrCreateExt = Nat256.createExt();
        int[] iArrCreate = Nat256.create();
        int[] iArrCreate2 = Nat256.create();
        SecP256R1Field.square(iArr, iArrCreate, iArrCreateExt);
        SecP256R1Field.multiply(iArrCreate, iArr, iArrCreate, iArrCreateExt);
        SecP256R1Field.squareN(iArrCreate, 2, iArrCreate2, iArrCreateExt);
        SecP256R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2, iArrCreateExt);
        SecP256R1Field.squareN(iArrCreate2, 4, iArrCreate, iArrCreateExt);
        SecP256R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate, iArrCreateExt);
        SecP256R1Field.squareN(iArrCreate, 8, iArrCreate2, iArrCreateExt);
        SecP256R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2, iArrCreateExt);
        SecP256R1Field.squareN(iArrCreate2, 16, iArrCreate, iArrCreateExt);
        SecP256R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate, iArrCreateExt);
        SecP256R1Field.squareN(iArrCreate, 32, iArrCreate, iArrCreateExt);
        SecP256R1Field.multiply(iArrCreate, iArr, iArrCreate, iArrCreateExt);
        SecP256R1Field.squareN(iArrCreate, 96, iArrCreate, iArrCreateExt);
        SecP256R1Field.multiply(iArrCreate, iArr, iArrCreate, iArrCreateExt);
        SecP256R1Field.squareN(iArrCreate, 94, iArrCreate, iArrCreateExt);
        SecP256R1Field.square(iArrCreate, iArrCreate2, iArrCreateExt);
        if (Nat256.m55418eq(iArr, iArrCreate2)) {
            return new SecP256R1FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.square(this.f81485x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.subtract(this.f81485x, ((SecP256R1FieldElement) eCFieldElement).f81485x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public boolean testBitZero() {
        return Nat256.getBit(this.f81485x, 0) == 1;
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.f81485x);
    }
}
