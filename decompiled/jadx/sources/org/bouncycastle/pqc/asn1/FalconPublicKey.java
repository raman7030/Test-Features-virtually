package org.bouncycastle.pqc.asn1;

import l.C16014;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes2.dex */
public class FalconPublicKey extends ASN1Object {
    public byte[] h;

    @Deprecated
    public FalconPublicKey(ASN1Sequence aSN1Sequence) {
        this.h = C16014.m37869(aSN1Sequence, 0);
    }

    public FalconPublicKey(byte[] bArr) {
        this.h = bArr;
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
        return this.h;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.h));
        return new DERSequence(aSN1EncodableVector);
    }
}
