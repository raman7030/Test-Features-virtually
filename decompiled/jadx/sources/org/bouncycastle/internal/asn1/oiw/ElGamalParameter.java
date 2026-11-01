package org.bouncycastle.internal.asn1.oiw;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes2.dex */
public class ElGamalParameter extends ASN1Object {

    /* JADX INFO: renamed from: g */
    public ASN1Integer f81330g;

    /* JADX INFO: renamed from: p */
    public ASN1Integer f81331p;

    public ElGamalParameter(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f81331p = new ASN1Integer(bigInteger);
        this.f81330g = new ASN1Integer(bigInteger2);
    }

    public ElGamalParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f81331p = (ASN1Integer) objects.nextElement();
        this.f81330g = (ASN1Integer) objects.nextElement();
    }

    public static ElGamalParameter getInstance(Object obj) {
        if (obj instanceof ElGamalParameter) {
            return (ElGamalParameter) obj;
        }
        if (obj != null) {
            return new ElGamalParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f81330g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f81331p.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f81331p, this.f81330g);
    }
}
