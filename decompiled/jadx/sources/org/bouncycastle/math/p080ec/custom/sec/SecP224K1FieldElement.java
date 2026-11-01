package org.bouncycastle.math.p080ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p080ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat224;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes2.dex */
public class SecP224K1FieldElement extends ECFieldElement.AbstractFp {

    /* JADX INFO: renamed from: x */
    public int[] f81468x;

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f81467Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));
    public static final int[] PRECOMP_POW2 = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    public SecP224K1FieldElement() {
        this.f81468x = Nat224.create();
    }

    public SecP224K1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f81467Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.f81468x = SecP224K1Field.fromBigInteger(bigInteger);
    }

    public SecP224K1FieldElement(int[] iArr) {
        this.f81468x = iArr;
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.add(this.f81468x, ((SecP224K1FieldElement) eCFieldElement).f81468x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.addOne(this.f81468x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.inv(((SecP224K1FieldElement) eCFieldElement).f81468x, iArrCreate);
        SecP224K1Field.multiply(iArrCreate, this.f81468x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP224K1FieldElement) {
            return Nat224.m55417eq(this.f81468x, ((SecP224K1FieldElement) obj).f81468x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public String getFieldName() {
        return "SecP224K1Field";
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public int getFieldSize() {
        return f81467Q.bitLength();
    }

    public int hashCode() {
        return f81467Q.hashCode() ^ Arrays.hashCode(this.f81468x, 0, 7);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.inv(this.f81468x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public boolean isOne() {
        return Nat224.isOne(this.f81468x);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public boolean isZero() {
        return Nat224.isZero(this.f81468x);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.multiply(this.f81468x, ((SecP224K1FieldElement) eCFieldElement).f81468x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.negate(this.f81468x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f81468x;
        if (Nat224.isZero(iArr) || Nat224.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.square(iArr, iArrCreate);
        SecP224K1Field.multiply(iArrCreate, iArr, iArrCreate);
        SecP224K1Field.square(iArrCreate, iArrCreate);
        SecP224K1Field.multiply(iArrCreate, iArr, iArrCreate);
        int[] iArrCreate2 = Nat224.create();
        SecP224K1Field.square(iArrCreate, iArrCreate2);
        SecP224K1Field.multiply(iArrCreate2, iArr, iArrCreate2);
        int[] iArrCreate3 = Nat224.create();
        SecP224K1Field.squareN(iArrCreate2, 4, iArrCreate3);
        SecP224K1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        int[] iArrCreate4 = Nat224.create();
        SecP224K1Field.squareN(iArrCreate3, 3, iArrCreate4);
        SecP224K1Field.multiply(iArrCreate4, iArrCreate, iArrCreate4);
        SecP224K1Field.squareN(iArrCreate4, 8, iArrCreate4);
        SecP224K1Field.multiply(iArrCreate4, iArrCreate3, iArrCreate4);
        SecP224K1Field.squareN(iArrCreate4, 4, iArrCreate3);
        SecP224K1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        SecP224K1Field.squareN(iArrCreate3, 19, iArrCreate2);
        SecP224K1Field.multiply(iArrCreate2, iArrCreate4, iArrCreate2);
        int[] iArrCreate5 = Nat224.create();
        SecP224K1Field.squareN(iArrCreate2, 42, iArrCreate5);
        SecP224K1Field.multiply(iArrCreate5, iArrCreate2, iArrCreate5);
        SecP224K1Field.squareN(iArrCreate5, 23, iArrCreate2);
        SecP224K1Field.multiply(iArrCreate2, iArrCreate3, iArrCreate2);
        SecP224K1Field.squareN(iArrCreate2, 84, iArrCreate3);
        SecP224K1Field.multiply(iArrCreate3, iArrCreate5, iArrCreate3);
        SecP224K1Field.squareN(iArrCreate3, 20, iArrCreate3);
        SecP224K1Field.multiply(iArrCreate3, iArrCreate4, iArrCreate3);
        SecP224K1Field.squareN(iArrCreate3, 3, iArrCreate3);
        SecP224K1Field.multiply(iArrCreate3, iArr, iArrCreate3);
        SecP224K1Field.squareN(iArrCreate3, 2, iArrCreate3);
        SecP224K1Field.multiply(iArrCreate3, iArr, iArrCreate3);
        SecP224K1Field.squareN(iArrCreate3, 4, iArrCreate3);
        SecP224K1Field.multiply(iArrCreate3, iArrCreate, iArrCreate3);
        SecP224K1Field.square(iArrCreate3, iArrCreate3);
        SecP224K1Field.square(iArrCreate3, iArrCreate5);
        if (Nat224.m55417eq(iArr, iArrCreate5)) {
            return new SecP224K1FieldElement(iArrCreate3);
        }
        SecP224K1Field.multiply(iArrCreate3, PRECOMP_POW2, iArrCreate3);
        SecP224K1Field.square(iArrCreate3, iArrCreate5);
        if (Nat224.m55417eq(iArr, iArrCreate5)) {
            return new SecP224K1FieldElement(iArrCreate3);
        }
        return null;
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.square(this.f81468x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.subtract(this.f81468x, ((SecP224K1FieldElement) eCFieldElement).f81468x, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public boolean testBitZero() {
        return Nat224.getBit(this.f81468x, 0) == 1;
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat224.toBigInteger(this.f81468x);
    }
}
