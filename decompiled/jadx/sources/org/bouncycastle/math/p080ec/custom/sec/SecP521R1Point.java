package org.bouncycastle.math.p080ec.custom.sec;

import org.bouncycastle.math.p080ec.ECCurve;
import org.bouncycastle.math.p080ec.ECFieldElement;
import org.bouncycastle.math.p080ec.ECPoint;
import org.bouncycastle.math.raw.Nat;

/* JADX INFO: loaded from: classes2.dex */
public class SecP521R1Point extends ECPoint.AbstractFp {
    public SecP521R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
    }

    public SecP521R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }

    @Override // org.bouncycastle.math.p080ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        char c;
        int[] iArr;
        int[] iArr2;
        int i;
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
        SecP521R1FieldElement secP521R1FieldElement = (SecP521R1FieldElement) this.f81420x;
        SecP521R1FieldElement secP521R1FieldElement2 = (SecP521R1FieldElement) this.f81421y;
        SecP521R1FieldElement secP521R1FieldElement3 = (SecP521R1FieldElement) eCPoint.getXCoord();
        SecP521R1FieldElement secP521R1FieldElement4 = (SecP521R1FieldElement) eCPoint.getYCoord();
        SecP521R1FieldElement secP521R1FieldElement5 = (SecP521R1FieldElement) this.f81422zs[0];
        SecP521R1FieldElement secP521R1FieldElement6 = (SecP521R1FieldElement) eCPoint.getZCoord(0);
        int[] iArrCreate = Nat.create(33);
        int[] iArrCreate2 = Nat.create(17);
        int[] iArrCreate3 = Nat.create(17);
        int[] iArrCreate4 = Nat.create(17);
        int[] iArrCreate5 = Nat.create(17);
        boolean zIsOne = secP521R1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP521R1FieldElement3.f81494x;
            iArr2 = secP521R1FieldElement4.f81494x;
            c = 0;
        } else {
            c = 0;
            SecP521R1Field.square(secP521R1FieldElement5.f81494x, iArrCreate4, iArrCreate);
            SecP521R1Field.multiply(iArrCreate4, secP521R1FieldElement3.f81494x, iArrCreate3, iArrCreate);
            SecP521R1Field.multiply(iArrCreate4, secP521R1FieldElement5.f81494x, iArrCreate4, iArrCreate);
            SecP521R1Field.multiply(iArrCreate4, secP521R1FieldElement4.f81494x, iArrCreate4, iArrCreate);
            iArr = iArrCreate3;
            iArr2 = iArrCreate4;
        }
        boolean zIsOne2 = secP521R1FieldElement6.isOne();
        if (zIsOne2) {
            iArr4 = secP521R1FieldElement.f81494x;
            iArr3 = secP521R1FieldElement2.f81494x;
            i = 17;
        } else {
            i = 17;
            SecP521R1Field.square(secP521R1FieldElement6.f81494x, iArrCreate5, iArrCreate);
            SecP521R1Field.multiply(iArrCreate5, secP521R1FieldElement.f81494x, iArrCreate2, iArrCreate);
            SecP521R1Field.multiply(iArrCreate5, secP521R1FieldElement6.f81494x, iArrCreate5, iArrCreate);
            SecP521R1Field.multiply(iArrCreate5, secP521R1FieldElement2.f81494x, iArrCreate5, iArrCreate);
            iArr3 = iArrCreate5;
            iArr4 = iArrCreate2;
        }
        int[] iArrCreate6 = Nat.create(i);
        SecP521R1Field.subtract(iArr4, iArr, iArrCreate6);
        SecP521R1Field.subtract(iArr3, iArr2, iArrCreate3);
        if (Nat.isZero(17, iArrCreate6)) {
            return Nat.isZero(17, iArrCreate3) ? twice() : curve.getInfinity();
        }
        SecP521R1Field.square(iArrCreate6, iArrCreate4, iArrCreate);
        int[] iArrCreate7 = Nat.create(17);
        SecP521R1Field.multiply(iArrCreate4, iArrCreate6, iArrCreate7, iArrCreate);
        SecP521R1Field.multiply(iArrCreate4, iArr4, iArrCreate4, iArrCreate);
        SecP521R1Field.multiply(iArr3, iArrCreate7, iArrCreate2, iArrCreate);
        SecP521R1FieldElement secP521R1FieldElement7 = new SecP521R1FieldElement(iArrCreate5);
        SecP521R1Field.square(iArrCreate3, secP521R1FieldElement7.f81494x, iArrCreate);
        int[] iArr5 = secP521R1FieldElement7.f81494x;
        SecP521R1Field.add(iArr5, iArrCreate7, iArr5);
        int[] iArr6 = secP521R1FieldElement7.f81494x;
        SecP521R1Field.subtract(iArr6, iArrCreate4, iArr6);
        int[] iArr7 = secP521R1FieldElement7.f81494x;
        SecP521R1Field.subtract(iArr7, iArrCreate4, iArr7);
        SecP521R1FieldElement secP521R1FieldElement8 = new SecP521R1FieldElement(iArrCreate7);
        SecP521R1Field.subtract(iArrCreate4, secP521R1FieldElement7.f81494x, secP521R1FieldElement8.f81494x);
        SecP521R1Field.multiply(secP521R1FieldElement8.f81494x, iArrCreate3, iArrCreate3, iArrCreate);
        SecP521R1Field.subtract(iArrCreate3, iArrCreate2, secP521R1FieldElement8.f81494x);
        SecP521R1FieldElement secP521R1FieldElement9 = new SecP521R1FieldElement(iArrCreate6);
        if (!zIsOne) {
            int[] iArr8 = secP521R1FieldElement9.f81494x;
            SecP521R1Field.multiply(iArr8, secP521R1FieldElement5.f81494x, iArr8, iArrCreate);
        }
        if (!zIsOne2) {
            int[] iArr9 = secP521R1FieldElement9.f81494x;
            SecP521R1Field.multiply(iArr9, secP521R1FieldElement6.f81494x, iArr9, iArrCreate);
        }
        ECFieldElement[] eCFieldElementArr = new ECFieldElement[1];
        eCFieldElementArr[c] = secP521R1FieldElement9;
        return new SecP521R1Point(curve, secP521R1FieldElement7, secP521R1FieldElement8, eCFieldElementArr);
    }

    @Override // org.bouncycastle.math.p080ec.ECPoint
    public ECPoint detach() {
        return new SecP521R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    public ECFieldElement doubleProductFromSquares(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3, ECFieldElement eCFieldElement4) {
        return eCFieldElement.add(eCFieldElement2).square().subtract(eCFieldElement3).subtract(eCFieldElement4);
    }

    public ECFieldElement eight(ECFieldElement eCFieldElement) {
        return four(two(eCFieldElement));
    }

    public ECFieldElement four(ECFieldElement eCFieldElement) {
        return two(two(eCFieldElement));
    }

    @Override // org.bouncycastle.math.p080ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP521R1Point(this.curve, this.f81420x, this.f81421y.negate(), this.f81422zs);
    }

    public ECFieldElement three(ECFieldElement eCFieldElement) {
        return two(eCFieldElement).add(eCFieldElement);
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
        SecP521R1FieldElement secP521R1FieldElement = (SecP521R1FieldElement) this.f81421y;
        if (secP521R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP521R1FieldElement secP521R1FieldElement2 = (SecP521R1FieldElement) this.f81420x;
        SecP521R1FieldElement secP521R1FieldElement3 = (SecP521R1FieldElement) this.f81422zs[0];
        int[] iArrCreate = Nat.create(33);
        int[] iArrCreate2 = Nat.create(17);
        int[] iArrCreate3 = Nat.create(17);
        int[] iArrCreate4 = Nat.create(17);
        SecP521R1Field.square(secP521R1FieldElement.f81494x, iArrCreate4, iArrCreate);
        int[] iArrCreate5 = Nat.create(17);
        SecP521R1Field.square(iArrCreate4, iArrCreate5, iArrCreate);
        boolean zIsOne = secP521R1FieldElement3.isOne();
        int[] iArr = secP521R1FieldElement3.f81494x;
        if (!zIsOne) {
            SecP521R1Field.square(iArr, iArrCreate3, iArrCreate);
            iArr = iArrCreate3;
        }
        SecP521R1Field.subtract(secP521R1FieldElement2.f81494x, iArr, iArrCreate2);
        SecP521R1Field.add(secP521R1FieldElement2.f81494x, iArr, iArrCreate3);
        SecP521R1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3, iArrCreate);
        Nat.addBothTo(17, iArrCreate3, iArrCreate3, iArrCreate3);
        SecP521R1Field.reduce23(iArrCreate3);
        SecP521R1Field.multiply(iArrCreate4, secP521R1FieldElement2.f81494x, iArrCreate4, iArrCreate);
        Nat.shiftUpBits(17, iArrCreate4, 2, 0);
        SecP521R1Field.reduce23(iArrCreate4);
        Nat.shiftUpBits(17, iArrCreate5, 3, 0, iArrCreate2);
        SecP521R1Field.reduce23(iArrCreate2);
        SecP521R1FieldElement secP521R1FieldElement4 = new SecP521R1FieldElement(iArrCreate5);
        SecP521R1Field.square(iArrCreate3, secP521R1FieldElement4.f81494x, iArrCreate);
        int[] iArr2 = secP521R1FieldElement4.f81494x;
        SecP521R1Field.subtract(iArr2, iArrCreate4, iArr2);
        int[] iArr3 = secP521R1FieldElement4.f81494x;
        SecP521R1Field.subtract(iArr3, iArrCreate4, iArr3);
        SecP521R1FieldElement secP521R1FieldElement5 = new SecP521R1FieldElement(iArrCreate4);
        SecP521R1Field.subtract(iArrCreate4, secP521R1FieldElement4.f81494x, secP521R1FieldElement5.f81494x);
        int[] iArr4 = secP521R1FieldElement5.f81494x;
        SecP521R1Field.multiply(iArr4, iArrCreate3, iArr4, iArrCreate);
        int[] iArr5 = secP521R1FieldElement5.f81494x;
        SecP521R1Field.subtract(iArr5, iArrCreate2, iArr5);
        SecP521R1FieldElement secP521R1FieldElement6 = new SecP521R1FieldElement(iArrCreate3);
        SecP521R1Field.twice(secP521R1FieldElement.f81494x, secP521R1FieldElement6.f81494x);
        if (!zIsOne) {
            int[] iArr6 = secP521R1FieldElement6.f81494x;
            SecP521R1Field.multiply(iArr6, secP521R1FieldElement3.f81494x, iArr6, iArrCreate);
        }
        return new SecP521R1Point(curve, secP521R1FieldElement4, secP521R1FieldElement5, new ECFieldElement[]{secP521R1FieldElement6});
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

    public ECFieldElement two(ECFieldElement eCFieldElement) {
        return eCFieldElement.add(eCFieldElement);
    }
}
