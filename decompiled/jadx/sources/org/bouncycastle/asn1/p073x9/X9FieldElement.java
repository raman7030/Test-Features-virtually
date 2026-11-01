package org.bouncycastle.asn1.p073x9;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.p080ec.ECFieldElement;

/* JADX INFO: loaded from: classes.dex */
public class X9FieldElement extends ASN1Object {
    public static X9IntegerConverter converter = new X9IntegerConverter();

    /* JADX INFO: renamed from: f */
    public ECFieldElement f80737f;

    public X9FieldElement(ECFieldElement eCFieldElement) {
        this.f80737f = eCFieldElement;
    }

    public ECFieldElement getValue() {
        return this.f80737f;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DEROctetString(converter.integerToBytes(this.f80737f.toBigInteger(), converter.getByteLength(this.f80737f)));
    }
}
