package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;
import p067l.C20778;
import p067l.C7775;

/* JADX INFO: loaded from: classes2.dex */
public class ParSet extends ASN1Object {

    /* JADX INFO: renamed from: h */
    public int[] f81560h;

    /* JADX INFO: renamed from: k */
    public int[] f81561k;

    /* JADX INFO: renamed from: t */
    public int f81562t;

    /* JADX INFO: renamed from: w */
    public int[] f81563w;

    public ParSet(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        this.f81562t = i;
        this.f81560h = iArr;
        this.f81563w = iArr2;
        this.f81561k = iArr3;
    }

    public ParSet(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4) {
            throw new IllegalArgumentException(C7775.m17938(aSN1Sequence, new StringBuilder("sie of seqOfParams = ")));
        }
        this.f81562t = checkBigIntegerInIntRangeAndPositive(aSN1Sequence.getObjectAt(0));
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        if (aSN1Sequence2.size() != this.f81562t || aSN1Sequence3.size() != this.f81562t || aSN1Sequence4.size() != this.f81562t) {
            throw new IllegalArgumentException("invalid size of sequences");
        }
        this.f81560h = new int[aSN1Sequence2.size()];
        this.f81563w = new int[aSN1Sequence3.size()];
        this.f81561k = new int[aSN1Sequence4.size()];
        for (int i = 0; i < this.f81562t; i++) {
            this.f81560h[i] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence2.getObjectAt(i));
            this.f81563w[i] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence3.getObjectAt(i));
            this.f81561k[i] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence4.getObjectAt(i));
        }
    }

    public static ParSet getInstance(Object obj) {
        if (obj instanceof ParSet) {
            return (ParSet) obj;
        }
        if (obj != null) {
            return new ParSet(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int[] getH() {
        return Arrays.clone(this.f81560h);
    }

    public int[] getK() {
        return Arrays.clone(this.f81561k);
    }

    public int getT() {
        return this.f81562t;
    }

    public int[] getW() {
        return Arrays.clone(this.f81563w);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (int i = 0; i < this.f81560h.length; i++) {
            aSN1EncodableVector.add(new ASN1Integer(this.f81560h[i]));
            aSN1EncodableVector2.add(new ASN1Integer(this.f81563w[i]));
            aSN1EncodableVector3.add(new ASN1Integer(this.f81561k[i]));
        }
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        aSN1EncodableVector4.add(new ASN1Integer(this.f81562t));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector3));
        return new DERSequence(aSN1EncodableVector4);
    }

    public static int checkBigIntegerInIntRangeAndPositive(ASN1Encodable aSN1Encodable) {
        int iIntValueExact = ((ASN1Integer) aSN1Encodable).intValueExact();
        if (iIntValueExact > 0) {
            return iIntValueExact;
        }
        throw new IllegalArgumentException(C20778.m46922(iIntValueExact, "BigInteger not in Range: "));
    }
}
