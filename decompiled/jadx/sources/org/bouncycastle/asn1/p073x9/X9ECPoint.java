package org.bouncycastle.asn1.p073x9;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.p080ec.ECCurve;
import org.bouncycastle.math.p080ec.ECPoint;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class X9ECPoint extends ASN1Object {

    /* JADX INFO: renamed from: c */
    public ECCurve f80735c;
    public final ASN1OctetString encoding;

    /* JADX INFO: renamed from: p */
    public ECPoint f80736p;

    public X9ECPoint(ECCurve eCCurve, ASN1OctetString aSN1OctetString) {
        this(eCCurve, aSN1OctetString.getOctets());
    }

    public X9ECPoint(ECCurve eCCurve, byte[] bArr) {
        this.f80735c = eCCurve;
        this.encoding = new DEROctetString(Arrays.clone(bArr));
    }

    public X9ECPoint(ECPoint eCPoint, boolean z) {
        this.f80736p = eCPoint.normalize();
        this.encoding = new DEROctetString(eCPoint.getEncoded(z));
    }

    public synchronized ECPoint getPoint() {
        if (this.f80736p == null) {
            this.f80736p = this.f80735c.decodePoint(this.encoding.getOctets()).normalize();
        }
        return this.f80736p;
    }

    public byte[] getPointEncoding() {
        return Arrays.clone(this.encoding.getOctets());
    }

    public boolean isPointCompressed() {
        byte b;
        byte[] octets = this.encoding.getOctets();
        return octets != null && octets.length > 0 && ((b = octets[0]) == 2 || b == 3);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.encoding;
    }
}
