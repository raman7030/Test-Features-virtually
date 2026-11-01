package org.bouncycastle.math.p080ec.custom.sec;

import org.bouncycastle.math.p080ec.ECCurve;
import org.bouncycastle.math.p080ec.ECFieldElement;
import org.bouncycastle.math.p080ec.ECPoint;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes2.dex */
public class SecP256R1Point extends ECPoint.AbstractFp {
    public SecP256R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
    }

    public SecP256R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }

    @Override // org.bouncycastle.math.p080ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        if (this == eCPoint) {
            return twice();
        }
        ECCurve curve = getCurve();
        SecP256R1FieldElement secP256R1FieldElement = (SecP256R1FieldElement) this.f81420x;
        SecP256R1FieldElement secP256R1FieldElement2 = (SecP256R1FieldElement) this.f81421y;
        SecP256R1FieldElement secP256R1FieldElement3 = (SecP256R1FieldElement) eCPoint.getXCoord();
        SecP256R1FieldElement secP256R1FieldElement4 = (SecP256R1FieldElement) eCPoint.getYCoord();
        SecP256R1FieldElement secP256R1FieldElement5 = (SecP256R1FieldElement) this.f81422zs[0];
        SecP256R1FieldElement secP256R1FieldElement6 = (SecP256R1FieldElement) eCPoint.getZCoord(0);
        int[] iArrCreateExt = Nat256.createExt();
        int[] iArrCreateExt2 = Nat256.createExt();
        int[] iArrCreate = Nat256.create();
        int[] iArrCreate2 = Nat256.create();
        int[] iArrCreate3 = Nat256.create();
        boolean zIsOne = secP256R1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP256R1FieldElement3.f81485x;
            iArr2 = secP256R1FieldElement4.f81485x;
        } else {
            SecP256R1Field.square(secP256R1FieldElement5.f81485x, iArrCreate2, iArrCreateExt);
            SecP256R1Field.multiply(iArrCreate2, secP256R1FieldElement3.f81485x, iArrCreate, iArrCreateExt);
            SecP256R1Field.multiply(iArrCreate2, secP256R1FieldElement5.f81485x, iArrCreate2, iArrCreateExt);
            SecP256R1Field.multiply(iArrCreate2, secP256R1FieldElement4.f81485x, iArrCreate2, iArrCreateExt);
            iArr = iArrCreate;
            iArr2 = iArrCreate2;
        }
        boolean zIsOne2 = secP256R1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP256R1FieldElement.f81485x;
            iArr4 = secP256R1FieldElement2.f81485x;
        } else {
            SecP256R1Field.square(secP256R1FieldElement6.f81485x, iArrCreate3, iArrCreateExt);
            SecP256R1Field.multiply(iArrCreate3, secP256R1FieldElement.f81485x, iArrCreateExt2, iArrCreateExt);
            SecP256R1Field.multiply(iArrCreate3, secP256R1FieldElement6.f81485x, iArrCreate3, iArrCreateExt);
            SecP256R1Field.multiply(iArrCreate3, secP256R1FieldElement2.f81485x, iArrCreate3, iArrCreateExt);
            iArr3 = iArrCreateExt2;
            iArr4 = iArrCreate3;
        }
        int[] iArrCreate4 = Nat256.create();
        SecP256R1Field.subtract(iArr3, iArr, iArrCreate4);
        SecP256R1Field.subtract(iArr4, iArr2, iArrCreate);
        if (Nat256.isZero(iArrCreate4)) {
            return Nat256.isZero(iArrCreate) ? twice() : curve.getInfinity();
        }
        SecP256R1Field.square(iArrCreate4, iArrCreate2, iArrCreateExt);
        int[] iArrCreate5 = Nat256.create();
        SecP256R1Field.multiply(iArrCreate2, iArrCreate4, iArrCreate5, iArrCreateExt);
        SecP256R1Field.multiply(iArrCreate2, iArr3, iArrCreate2, iArrCreateExt);
        SecP256R1Field.negate(iArrCreate5, iArrCreate5);
        Nat256.mul(iArr4, iArrCreate5, iArrCreateExt2);
        SecP256R1Field.reduce32(Nat256.addBothTo(iArrCreate2, iArrCreate2, iArrCreate5), iArrCreate5);
        SecP256R1FieldElement secP256R1FieldElement7 = new SecP256R1FieldElement(iArrCreate3);
        SecP256R1Field.square(iArrCreate, secP256R1FieldElement7.f81485x, iArrCreateExt);
        int[] iArr5 = secP256R1FieldElement7.f81485x;
        SecP256R1Field.subtract(iArr5, iArrCreate5, iArr5);
        SecP256R1FieldElement secP256R1FieldElement8 = new SecP256R1FieldElement(iArrCreate5);
        SecP256R1Field.subtract(iArrCreate2, secP256R1FieldElement7.f81485x, secP256R1FieldElement8.f81485x);
        SecP256R1Field.multiplyAddToExt(secP256R1FieldElement8.f81485x, iArrCreate, iArrCreateExt2);
        SecP256R1Field.reduce(iArrCreateExt2, secP256R1FieldElement8.f81485x);
        SecP256R1FieldElement secP256R1FieldElement9 = new SecP256R1FieldElement(iArrCreate4);
        if (!zIsOne) {
            int[] iArr6 = secP256R1FieldElement9.f81485x;
            SecP256R1Field.multiply(iArr6, secP256R1FieldElement5.f81485x, iArr6, iArrCreateExt);
        }
        if (!zIsOne2) {
            int[] iArr7 = secP256R1FieldElement9.f81485x;
            SecP256R1Field.multiply(iArr7, secP256R1FieldElement6.f81485x, iArr7, iArrCreateExt);
        }
        return new SecP256R1Point(curve, secP256R1FieldElement7, secP256R1FieldElement8, new ECFieldElement[]{secP256R1FieldElement9});
    }

    @Override // org.bouncycastle.math.p080ec.ECPoint
    public ECPoint detach() {
        return new SecP256R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.p080ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP256R1Point(this.curve, this.f81420x, this.f81421y.negate(), this.f81422zs);
    }

    @Override // org.bouncycastle.math.p080ec.ECPoint
    public ECPoint threeTimes() {
        return (isInfinity() || this.f81421y.isZero()) ? this : twice().add(this);
    }

    @Override // org.bouncycastle.math.p080ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        SecP256R1FieldElement secP256R1FieldElement = (SecP256R1FieldElement) this.f81421y;
        if (secP256R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP256R1FieldElement secP256R1FieldElement2 = (SecP256R1FieldElement) this.f81420x;
        SecP256R1FieldElement secP256R1FieldElement3 = (SecP256R1FieldElement) this.f81422zs[0];
        int[] iArrCreateExt = Nat256.createExt();
        int[] iArrCreate = Nat256.create();
        int[] iArrCreate2 = Nat256.create();
        int[] iArrCreate3 = Nat256.create();
        SecP256R1Field.square(secP256R1FieldElement.f81485x, iArrCreate3, iArrCreateExt);
        int[] iArrCreate4 = Nat256.create();
        SecP256R1Field.square(iArrCreate3, iArrCreate4, iArrCreateExt);
        boolean zIsOne = secP256R1FieldElement3.isOne();
        int[] iArr = secP256R1FieldElement3.f81485x;
        if (!zIsOne) {
            SecP256R1Field.square(iArr, iArrCreate2, iArrCreateExt);
            iArr = iArrCreate2;
        }
        SecP256R1Field.subtract(secP256R1FieldElement2.f81485x, iArr, iArrCreate);
        SecP256R1Field.add(secP256R1FieldElement2.f81485x, iArr, iArrCreate2);
        SecP256R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2, iArrCreateExt);
        SecP256R1Field.reduce32(Nat256.addBothTo(iArrCreate2, iArrCreate2, iArrCreate2), iArrCreate2);
        SecP256R1Field.multiply(iArrCreate3, secP256R1FieldElement2.f81485x, iArrCreate3, iArrCreateExt);
        SecP256R1Field.reduce32(Nat.shiftUpBits(8, iArrCreate3, 2, 0), iArrCreate3);
        SecP256R1Field.reduce32(Nat.shiftUpBits(8, iArrCreate4, 3, 0, iArrCreate), iArrCreate);
        SecP256R1FieldElement secP256R1FieldElement4 = new SecP256R1FieldElement(iArrCreate4);
        SecP256R1Field.square(iArrCreate2, secP256R1FieldElement4.f81485x, iArrCreateExt);
        int[] iArr2 = secP256R1FieldElement4.f81485x;
        SecP256R1Field.subtract(iArr2, iArrCreate3, iArr2);
        int[] iArr3 = secP256R1FieldElement4.f81485x;
        SecP256R1Field.subtract(iArr3, iArrCreate3, iArr3);
        SecP256R1FieldElement secP256R1FieldElement5 = new SecP256R1FieldElement(iArrCreate3);
        SecP256R1Field.subtract(iArrCreate3, secP256R1FieldElement4.f81485x, secP256R1FieldElement5.f81485x);
        int[] iArr4 = secP256R1FieldElement5.f81485x;
        SecP256R1Field.multiply(iArr4, iArrCreate2, iArr4, iArrCreateExt);
        int[] iArr5 = secP256R1FieldElement5.f81485x;
        SecP256R1Field.subtract(iArr5, iArrCreate, iArr5);
        SecP256R1FieldElement secP256R1FieldElement6 = new SecP256R1FieldElement(iArrCreate2);
        SecP256R1Field.twice(secP256R1FieldElement.f81485x, secP256R1FieldElement6.f81485x);
        if (!zIsOne) {
            int[] iArr6 = secP256R1FieldElement6.f81485x;
            SecP256R1Field.multiply(iArr6, secP256R1FieldElement3.f81485x, iArr6, iArrCreateExt);
        }
        return new SecP256R1Point(curve, secP256R1FieldElement4, secP256R1FieldElement5, new ECFieldElement[]{secP256R1FieldElement6});
    }

    @Override // org.bouncycastle.math.p080ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        if (this == eCPoint) {
            return threeTimes();
        }
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return twice();
        }
        return this.f81421y.isZero() ? eCPoint : twice().add(eCPoint);
    }
}
