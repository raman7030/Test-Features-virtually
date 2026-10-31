package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes.dex */
public final class ASN1Tag {
    public final int tagClass;
    public final int tagNumber;

    public ASN1Tag(int i, int i2) {
        this.tagClass = i;
        this.tagNumber = i2;
    }

    public static ASN1Tag create(int i, int i2) {
        return new ASN1Tag(i, i2);
    }

    public int getTagClass() {
        return this.tagClass;
    }

    public int getTagNumber() {
        return this.tagNumber;
    }
}
