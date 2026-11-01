package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes.dex */
public class DHParameter extends ASN1Object {

    /* JADX INFO: renamed from: g */
    public ASN1Integer f80674g;

    /* JADX INFO: renamed from: l */
    public ASN1Integer f80675l;

    /* JADX INFO: renamed from: p */
    public ASN1Integer f80676p;

    public DHParameter(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f80676p = new ASN1Integer(bigInteger);
        this.f80674g = new ASN1Integer(bigInteger2);
        this.f80675l = i != 0 ? new ASN1Integer(i) : null;
    }

    public DHParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f80676p = ASN1Integer.getInstance(objects.nextElement());
        this.f80674g = ASN1Integer.getInstance(objects.nextElement());
        this.f80675l = objects.hasMoreElements() ? (ASN1Integer) objects.nextElement() : null;
    }

    public static DHParameter getInstance(Object obj) {
        if (obj instanceof DHParameter) {
            return (DHParameter) obj;
        }
        if (obj != null) {
            return new DHParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f80674g.getPositiveValue();
    }

    public BigInteger getL() {
        ASN1Integer aSN1Integer = this.f80675l;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f80676p.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f80676p);
        aSN1EncodableVector.add(this.f80674g);
        if (getL() != null) {
            aSN1EncodableVector.add(this.f80675l);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
