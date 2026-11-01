package org.bouncycastle.asn1.p073x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.math.p080ec.ECAlgorithms;
import org.bouncycastle.math.p080ec.ECCurve;
import org.bouncycastle.math.p080ec.ECPoint;

/* JADX INFO: loaded from: classes.dex */
public class X9ECParameters extends ASN1Object implements X9ObjectIdentifiers {
    public static final BigInteger ONE = BigInteger.valueOf(1);
    public X9Curve curve;
    public X9FieldID fieldID;

    /* JADX INFO: renamed from: g */
    public X9ECPoint f80732g;

    /* JADX INFO: renamed from: h */
    public BigInteger f80733h;

    /* JADX INFO: renamed from: n */
    public BigInteger f80734n;

    public X9ECParameters(ASN1Sequence aSN1Sequence) {
        if (!(aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) || !((ASN1Integer) aSN1Sequence.getObjectAt(0)).hasValue(1)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        this.f80734n = ((ASN1Integer) aSN1Sequence.getObjectAt(4)).getValue();
        if (aSN1Sequence.size() == 6) {
            this.f80733h = ((ASN1Integer) aSN1Sequence.getObjectAt(5)).getValue();
        }
        X9FieldID x9FieldID = X9FieldID.getInstance(aSN1Sequence.getObjectAt(1));
        this.fieldID = x9FieldID;
        this.curve = new X9Curve(x9FieldID, this.f80734n, this.f80733h, ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2)));
        ASN1Encodable objectAt = aSN1Sequence.getObjectAt(3);
        if (objectAt instanceof X9ECPoint) {
            this.f80732g = (X9ECPoint) objectAt;
        } else {
            this.f80732g = new X9ECPoint(this.curve.getCurve(), (ASN1OctetString) objectAt);
        }
    }

    public X9ECParameters(ECCurve eCCurve, X9ECPoint x9ECPoint, BigInteger bigInteger) {
        this(eCCurve, x9ECPoint, bigInteger, null, null);
    }

    public X9ECParameters(ECCurve eCCurve, X9ECPoint x9ECPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, x9ECPoint, bigInteger, bigInteger2, null);
    }

    public X9ECParameters(ECCurve eCCurve, X9ECPoint x9ECPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        X9FieldID x9FieldID;
        this.curve = new X9Curve(eCCurve, bArr);
        this.f80732g = x9ECPoint;
        this.f80734n = bigInteger;
        this.f80733h = bigInteger2;
        FiniteField field = eCCurve.getField();
        if (ECAlgorithms.isFpField(field)) {
            x9FieldID = new X9FieldID(field.getCharacteristic());
        } else {
            if (!ECAlgorithms.isF2mField(field)) {
                throw new IllegalArgumentException("'curve' is of an unsupported type");
            }
            int[] exponentsPresent = ((PolynomialExtensionField) field).getMinimalPolynomial().getExponentsPresent();
            if (exponentsPresent.length == 3) {
                x9FieldID = new X9FieldID(exponentsPresent[2], exponentsPresent[1]);
            } else {
                if (exponentsPresent.length != 5) {
                    throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
                }
                x9FieldID = new X9FieldID(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
            }
        }
        this.fieldID = x9FieldID;
    }

    public static X9ECParameters getInstance(Object obj) {
        if (obj instanceof X9ECParameters) {
            return (X9ECParameters) obj;
        }
        if (obj != null) {
            return new X9ECParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public X9ECPoint getBaseEntry() {
        return this.f80732g;
    }

    public ECCurve getCurve() {
        return this.curve.getCurve();
    }

    public X9Curve getCurveEntry() {
        return this.curve;
    }

    public X9FieldID getFieldIDEntry() {
        return this.fieldID;
    }

    public ECPoint getG() {
        return this.f80732g.getPoint();
    }

    public BigInteger getH() {
        return this.f80733h;
    }

    public BigInteger getN() {
        return this.f80734n;
    }

    public byte[] getSeed() {
        return this.curve.getSeed();
    }

    public boolean hasSeed() {
        return this.curve.hasSeed();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(new ASN1Integer(ONE));
        aSN1EncodableVector.add(this.fieldID);
        aSN1EncodableVector.add(this.curve);
        aSN1EncodableVector.add(this.f80732g);
        aSN1EncodableVector.add(new ASN1Integer(this.f80734n));
        if (this.f80733h != null) {
            aSN1EncodableVector.add(new ASN1Integer(this.f80733h));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
