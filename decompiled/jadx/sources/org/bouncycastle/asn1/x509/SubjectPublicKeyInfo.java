package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import l.C5688;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes.dex */
public class SubjectPublicKeyInfo extends ASN1Object {
    public AlgorithmIdentifier algId;
    public ASN1BitString keyData;

    @Deprecated
    public SubjectPublicKeyInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(C5688.m16003(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.algId = AlgorithmIdentifier.getInstance(objects.nextElement());
        this.keyData = ASN1BitString.getInstance(objects.nextElement());
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, ASN1BitString aSN1BitString) {
        this.keyData = aSN1BitString;
        this.algId = algorithmIdentifier;
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable) {
        this.keyData = new DERBitString(aSN1Encodable);
        this.algId = algorithmIdentifier;
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.keyData = new DERBitString(bArr);
        this.algId = algorithmIdentifier;
    }

    public static SubjectPublicKeyInfo getInstance(Object obj) {
        if (obj instanceof SubjectPublicKeyInfo) {
            return (SubjectPublicKeyInfo) obj;
        }
        if (obj != null) {
            return new SubjectPublicKeyInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static SubjectPublicKeyInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public AlgorithmIdentifier getAlgorithm() {
        return this.algId;
    }

    @Deprecated
    public AlgorithmIdentifier getAlgorithmId() {
        return this.algId;
    }

    @Deprecated
    public ASN1Primitive getPublicKey() {
        return ASN1Primitive.fromByteArray(this.keyData.getOctets());
    }

    public ASN1BitString getPublicKeyData() {
        return this.keyData;
    }

    public ASN1Primitive parsePublicKey() {
        return ASN1Primitive.fromByteArray(this.keyData.getOctets());
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.algId, this.keyData);
    }
}
