package org.bouncycastle.crypto.agreement.kdf;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Pack;
import p067l.C7241;

/* JADX INFO: loaded from: classes.dex */
public class DHKEKGenerator implements DerivationFunction {
    public ASN1ObjectIdentifier algorithm;
    public final Digest digest;
    public int keySize;
    public byte[] partyAInfo;

    /* JADX INFO: renamed from: z */
    public byte[] f80762z;

    public DHKEKGenerator(Digest digest) {
        this.digest = digest;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        DHKDFParameters dHKDFParameters = (DHKDFParameters) derivationParameters;
        this.algorithm = dHKDFParameters.getAlgorithm();
        this.keySize = dHKDFParameters.getKeySize();
        this.f80762z = dHKDFParameters.getZ();
        this.partyAInfo = dHKDFParameters.getExtraInfo();
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) {
        boolean z;
        if (bArr.length - i2 < i) {
            throw new OutputLengthException("output buffer too small");
        }
        long j = i2;
        int digestSize = this.digest.getDigestSize();
        if (j > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        long j2 = digestSize;
        int i3 = (int) (((j + j2) - 1) / j2);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i5 < i3) {
            Digest digest = this.digest;
            byte[] bArr3 = this.f80762z;
            digest.update(bArr3, i4, bArr3.length);
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(this.algorithm);
            aSN1EncodableVector2.add(new DEROctetString(Pack.intToBigEndian(i6)));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
            if (this.partyAInfo != null) {
                z = true;
                aSN1EncodableVector.add(new DERTaggedObject(true, i4, (ASN1Encodable) new DEROctetString(this.partyAInfo)));
            } else {
                z = true;
            }
            aSN1EncodableVector.add(new DERTaggedObject(z, 2, new DEROctetString(Pack.intToBigEndian(this.keySize))));
            try {
                byte[] encoded = new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
                this.digest.update(encoded, 0, encoded.length);
                this.digest.doFinal(bArr2, 0);
                if (i2 > digestSize) {
                    System.arraycopy(bArr2, 0, bArr, i, digestSize);
                    i += digestSize;
                    i2 -= digestSize;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i, i2);
                }
                i6++;
                i5++;
                i4 = 0;
            } catch (IOException e) {
                throw new IllegalArgumentException(C7241.m16586(e, new StringBuilder("unable to encode parameter info: ")));
            }
        }
        this.digest.reset();
        return (int) j;
    }
}
