package org.bouncycastle.pqc.asn1;

import l.C16014;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes2.dex */
public class SABERPublicKey extends ASN1Object {
    public byte[] b;
    public byte[] seed_A;

    public SABERPublicKey(ASN1Sequence aSN1Sequence) {
        this.seed_A = C16014.m37869(aSN1Sequence, 0);
        this.b = C16014.m37869(aSN1Sequence, 1);
    }

    public SABERPublicKey(byte[] bArr, byte[] bArr2) {
        this.seed_A = bArr;
        this.b = bArr2;
    }

    public static SABERPublicKey getInstance(Object obj) {
        if (obj instanceof SABERPublicKey) {
            return (SABERPublicKey) obj;
        }
        if (obj != null) {
            return new SABERPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getB() {
        return this.b;
    }

    public byte[] getSeed_A() {
        return this.seed_A;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.seed_A));
        aSN1EncodableVector.add(new DEROctetString(this.b));
        return new DERSequence(aSN1EncodableVector);
    }
}
