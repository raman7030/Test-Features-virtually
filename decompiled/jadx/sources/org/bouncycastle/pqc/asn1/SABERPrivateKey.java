package org.bouncycastle.pqc.asn1;

import l.C16014;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes2.dex */
public class SABERPrivateKey extends ASN1Object {
    public SABERPublicKey PublicKey;
    public byte[] hpk;
    public byte[] s;
    public int version;
    public byte[] z;

    public SABERPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.version = i;
        if (i != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.z = bArr;
        this.s = bArr2;
        this.hpk = bArr3;
    }

    public SABERPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, SABERPublicKey sABERPublicKey) {
        this.version = i;
        if (i != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.z = bArr;
        this.s = bArr2;
        this.hpk = bArr3;
        this.PublicKey = sABERPublicKey;
    }

    public SABERPrivateKey(ASN1Sequence aSN1Sequence) {
        int iIntValueExact = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intValueExact();
        this.version = iIntValueExact;
        if (iIntValueExact != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.z = C16014.m37869(aSN1Sequence, 1);
        this.s = C16014.m37869(aSN1Sequence, 2);
        this.PublicKey = SABERPublicKey.getInstance(aSN1Sequence.getObjectAt(3));
        this.hpk = C16014.m37869(aSN1Sequence, 4);
    }

    public static SABERPrivateKey getInstance(Object obj) {
        if (obj instanceof SABERPrivateKey) {
            return (SABERPrivateKey) obj;
        }
        if (obj != null) {
            return new SABERPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getHpk() {
        return this.hpk;
    }

    public SABERPublicKey getPublicKey() {
        return this.PublicKey;
    }

    public byte[] getS() {
        return this.s;
    }

    public int getVersion() {
        return this.version;
    }

    public byte[] getZ() {
        return this.z;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.z));
        aSN1EncodableVector.add(new DEROctetString(this.s));
        aSN1EncodableVector.add(new DEROctetString(this.hpk));
        return new DERSequence(aSN1EncodableVector);
    }
}
