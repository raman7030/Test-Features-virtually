package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;
import p067l.C17588;

/* JADX INFO: loaded from: classes2.dex */
public class CMCEPublicKey extends ASN1Object {

    /* JADX INFO: renamed from: T */
    public byte[] f81555T;

    @Deprecated
    public CMCEPublicKey(ASN1Sequence aSN1Sequence) {
        this.f81555T = C17588.m40055(aSN1Sequence, 0);
    }

    public CMCEPublicKey(byte[] bArr) {
        this.f81555T = bArr;
    }

    public static CMCEPublicKey getInstance(Object obj) {
        if (obj instanceof CMCEPublicKey) {
            return (CMCEPublicKey) obj;
        }
        if (obj != null) {
            return new CMCEPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getT() {
        return Arrays.clone(this.f81555T);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.f81555T));
        return new DERSequence(aSN1EncodableVector);
    }
}
