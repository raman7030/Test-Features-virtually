package org.bouncycastle.math.p080ec.custom.djb;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.math.BigInteger;
import org.bouncycastle.math.p080ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Curve25519FieldElement extends ECFieldElement.AbstractFp {

    /* JADX INFO: renamed from: x */
    public int[] f81430x;

    /* JADX INFO: renamed from: Q */
    public static final BigInteger f81429Q = Nat256.toBigInteger(Curve25519Field.f81427P);
    public static final int[] PRECOMP_POW2 = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    public Curve25519FieldElement() {
        this.f81430x = Nat256.create();
    }

    public Curve25519FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f81429Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.f81430x = Curve25519Field.fromBigInteger(bigInteger);
    }

    public Curve25519FieldElement(int[] iArr) {
        this.f81430x = iArr;
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.add(this.f81430x, ((Curve25519FieldElement) eCFieldElement).f81430x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.addOne(this.f81430x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.inv(((Curve25519FieldElement) eCFieldElement).f81430x, iArrCreate);
        Curve25519Field.multiply(iArrCreate, this.f81430x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Curve25519FieldElement) {
            return Nat256.m55418eq(this.f81430x, ((Curve25519FieldElement) obj).f81430x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public String getFieldName() {
        return "Curve25519Field";
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public int getFieldSize() {
        return f81429Q.bitLength();
    }

    public int hashCode() {
        return f81429Q.hashCode() ^ Arrays.hashCode(this.f81430x, 0, 8);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.inv(this.f81430x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne(this.f81430x);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero(this.f81430x);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.multiply(this.f81430x, ((Curve25519FieldElement) eCFieldElement).f81430x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.negate(this.f81430x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f81430x;
        if (Nat256.isZero(iArr) || Nat256.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat256.create();
        Curve25519Field.square(iArr, iArrCreate);
        Curve25519Field.multiply(iArrCreate, iArr, iArrCreate);
        Curve25519Field.square(iArrCreate, iArrCreate);
        Curve25519Field.multiply(iArrCreate, iArr, iArrCreate);
        int[] iArrCreate2 = Nat256.create();
        Curve25519Field.square(iArrCreate, iArrCreate2);
        Curve25519Field.multiply(iArrCreate2, iArr, iArrCreate2);
        int[] iArrCreate3 = Nat256.create();
        Curve25519Field.squareN(iArrCreate2, 3, iArrCreate3);
        Curve25519Field.multiply(iArrCreate3, iArrCreate, iArrCreate3);
        Curve25519Field.squareN(iArrCreate3, 4, iArrCreate);
        Curve25519Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        Curve25519Field.squareN(iArrCreate, 4, iArrCreate3);
        Curve25519Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        Curve25519Field.squareN(iArrCreate3, 15, iArrCreate2);
        Curve25519Field.multiply(iArrCreate2, iArrCreate3, iArrCreate2);
        Curve25519Field.squareN(iArrCreate2, 30, iArrCreate3);
        Curve25519Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3);
        Curve25519Field.squareN(iArrCreate3, 60, iArrCreate2);
        Curve25519Field.multiply(iArrCreate2, iArrCreate3, iArrCreate2);
        Curve25519Field.squareN(iArrCreate2, 11, iArrCreate3);
        Curve25519Field.multiply(iArrCreate3, iArrCreate, iArrCreate3);
        Curve25519Field.squareN(iArrCreate3, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, iArrCreate);
        Curve25519Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        Curve25519Field.square(iArrCreate, iArrCreate);
        Curve25519Field.square(iArrCreate, iArrCreate2);
        if (Nat256.m55418eq(iArr, iArrCreate2)) {
            return new Curve25519FieldElement(iArrCreate);
        }
        Curve25519Field.multiply(iArrCreate, PRECOMP_POW2, iArrCreate);
        Curve25519Field.square(iArrCreate, iArrCreate2);
        if (Nat256.m55418eq(iArr, iArrCreate2)) {
            return new Curve25519FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.square(this.f81430x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        Curve25519Field.subtract(this.f81430x, ((Curve25519FieldElement) eCFieldElement).f81430x, iArrCreate);
        return new Curve25519FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public boolean testBitZero() {
        return Nat256.getBit(this.f81430x, 0) == 1;
    }

    @Override // org.bouncycastle.math.p080ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.f81430x);
    }
}
