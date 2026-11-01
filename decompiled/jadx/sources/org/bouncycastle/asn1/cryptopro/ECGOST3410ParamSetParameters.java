package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import p067l.C5410;

/* JADX INFO: loaded from: classes.dex */
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: a */
    public ASN1Integer f80662a;

    /* JADX INFO: renamed from: b */
    public ASN1Integer f80663b;

    /* JADX INFO: renamed from: p */
    public ASN1Integer f80664p;

    /* JADX INFO: renamed from: q */
    public ASN1Integer f80665q;

    /* JADX INFO: renamed from: x */
    public ASN1Integer f80666x;

    /* JADX INFO: renamed from: y */
    public ASN1Integer f80667y;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, BigInteger bigInteger5) {
        this.f80662a = new ASN1Integer(bigInteger);
        this.f80663b = new ASN1Integer(bigInteger2);
        this.f80664p = new ASN1Integer(bigInteger3);
        this.f80665q = new ASN1Integer(bigInteger4);
        this.f80666x = new ASN1Integer(i);
        this.f80667y = new ASN1Integer(bigInteger5);
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f80662a = (ASN1Integer) objects.nextElement();
        this.f80663b = (ASN1Integer) objects.nextElement();
        this.f80664p = (ASN1Integer) objects.nextElement();
        this.f80665q = (ASN1Integer) objects.nextElement();
        this.f80666x = (ASN1Integer) objects.nextElement();
        this.f80667y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(C5410.m11877(obj, "Invalid GOST3410Parameter: "));
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public BigInteger getA() {
        return this.f80662a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f80664p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f80665q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f80662a);
        aSN1EncodableVector.add(this.f80663b);
        aSN1EncodableVector.add(this.f80664p);
        aSN1EncodableVector.add(this.f80665q);
        aSN1EncodableVector.add(this.f80666x);
        aSN1EncodableVector.add(this.f80667y);
        return new DERSequence(aSN1EncodableVector);
    }
}
