package org.bouncycastle.pqc.asn1;

import l.C16014;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class CMCEPrivateKey extends ASN1Object {
    public byte[] C;
    public CMCEPublicKey PublicKey;
    public byte[] alpha;
    public byte[] delta;
    public byte[] g;
    public byte[] s;
    public int version;

    public CMCEPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this(i, bArr, bArr2, bArr3, bArr4, bArr5, null);
    }

    public CMCEPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, CMCEPublicKey cMCEPublicKey) {
        this.version = i;
        if (i != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.delta = Arrays.clone(bArr);
        this.C = Arrays.clone(bArr2);
        this.g = Arrays.clone(bArr3);
        this.alpha = Arrays.clone(bArr4);
        this.s = Arrays.clone(bArr5);
        this.PublicKey = cMCEPublicKey;
    }

    public CMCEPrivateKey(ASN1Sequence aSN1Sequence) {
        int iIntValueExact = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intValueExact();
        this.version = iIntValueExact;
        if (iIntValueExact != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.delta = C16014.m37869(aSN1Sequence, 1);
        this.C = C16014.m37869(aSN1Sequence, 2);
        this.g = C16014.m37869(aSN1Sequence, 3);
        this.alpha = C16014.m37869(aSN1Sequence, 4);
        this.s = C16014.m37869(aSN1Sequence, 5);
        if (aSN1Sequence.size() == 7) {
            this.PublicKey = CMCEPublicKey.getInstance(aSN1Sequence.getObjectAt(6));
        }
    }

    public static CMCEPrivateKey getInstance(Object obj) {
        if (obj instanceof CMCEPrivateKey) {
            return (CMCEPrivateKey) obj;
        }
        if (obj != null) {
            return new CMCEPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getAlpha() {
        return Arrays.clone(this.alpha);
    }

    public byte[] getC() {
        return Arrays.clone(this.C);
    }

    public byte[] getDelta() {
        return Arrays.clone(this.delta);
    }

    public byte[] getG() {
        return Arrays.clone(this.g);
    }

    public CMCEPublicKey getPublicKey() {
        return this.PublicKey;
    }

    public byte[] getS() {
        return Arrays.clone(this.s);
    }

    public int getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.delta));
        aSN1EncodableVector.add(new DEROctetString(this.C));
        aSN1EncodableVector.add(new DEROctetString(this.g));
        aSN1EncodableVector.add(new DEROctetString(this.alpha));
        aSN1EncodableVector.add(new DEROctetString(this.s));
        CMCEPublicKey cMCEPublicKey = this.PublicKey;
        if (cMCEPublicKey != null) {
            aSN1EncodableVector.add(new CMCEPublicKey(cMCEPublicKey.getT()));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
