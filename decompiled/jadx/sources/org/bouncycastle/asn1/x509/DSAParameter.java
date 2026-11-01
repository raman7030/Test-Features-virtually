package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import p067l.C7775;

/* JADX INFO: loaded from: classes.dex */
public class DSAParameter extends ASN1Object {

    /* JADX INFO: renamed from: g */
    public ASN1Integer f80708g;

    /* JADX INFO: renamed from: p */
    public ASN1Integer f80709p;

    /* JADX INFO: renamed from: q */
    public ASN1Integer f80710q;

    public DSAParameter(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f80709p = new ASN1Integer(bigInteger);
        this.f80710q = new ASN1Integer(bigInteger2);
        this.f80708g = new ASN1Integer(bigInteger3);
    }

    public DSAParameter(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException(C7775.m17938(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f80709p = ASN1Integer.getInstance(objects.nextElement());
        this.f80710q = ASN1Integer.getInstance(objects.nextElement());
        this.f80708g = ASN1Integer.getInstance(objects.nextElement());
    }

    public static DSAParameter getInstance(Object obj) {
        if (obj instanceof DSAParameter) {
            return (DSAParameter) obj;
        }
        if (obj != null) {
            return new DSAParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static DSAParameter getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public BigInteger getG() {
        return this.f80708g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f80709p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f80710q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f80709p);
        aSN1EncodableVector.add(this.f80710q);
        aSN1EncodableVector.add(this.f80708g);
        return new DERSequence(aSN1EncodableVector);
    }
}
