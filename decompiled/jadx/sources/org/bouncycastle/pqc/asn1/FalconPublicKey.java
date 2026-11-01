package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import p067l.C17588;

/* JADX INFO: loaded from: classes2.dex */
public class FalconPublicKey extends ASN1Object {

    /* JADX INFO: renamed from: h */
    public byte[] f81559h;

    @Deprecated
    public FalconPublicKey(ASN1Sequence aSN1Sequence) {
        this.f81559h = C17588.m40055(aSN1Sequence, 0);
    }

    public FalconPublicKey(byte[] bArr) {
        this.f81559h = bArr;
    }

    public static FalconPublicKey getInstance(Object obj) {
        if (obj instanceof FalconPublicKey) {
            return (FalconPublicKey) obj;
        }
        if (obj != null) {
            return new FalconPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getH() {
        return this.f81559h;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.f81559h));
        return new DERSequence(aSN1EncodableVector);
    }
}
