package org.bouncycastle.asn1;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import l.C3200;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ASN1PrintableString extends ASN1Primitive implements ASN1String {
    public static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1PrintableString.class, 19) { // from class: org.bouncycastle.asn1.ASN1PrintableString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1PrintableString.createPrimitive(dEROctetString.getOctets());
        }
    };
    public final byte[] contents;

    public ASN1PrintableString(String str, boolean z) {
        if (z && !isPrintableString(str)) {
            throw new IllegalArgumentException("string contains illegal characters");
        }
        this.contents = Strings.toByteArray(str);
    }

    public ASN1PrintableString(byte[] bArr, boolean z) {
        this.contents = z ? Arrays.clone(bArr) : bArr;
    }

    public static ASN1PrintableString createPrimitive(byte[] bArr) {
        return new DERPrintableString(bArr, false);
    }

    public static ASN1PrintableString getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1PrintableString)) {
            return (ASN1PrintableString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1PrintableString) {
                return (ASN1PrintableString) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(C3200.m9832(obj, "illegal object in getInstance: "));
        }
        try {
            return (ASN1PrintableString) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException(ASN1BMPString$$ExternalSyntheticOutline0.m(e, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    public static ASN1PrintableString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1PrintableString) TYPE.getContextTagged(aSN1TaggedObject, z);
    }

    public static ASN1PrintableString getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1PrintableString) TYPE.getTagged(aSN1TaggedObject, z);
    }

    public static boolean isPrintableString(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            char cCharAt = str.charAt(length);
            if (cCharAt > 127) {
                return false;
            }
            if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && (('0' > cCharAt || cCharAt > '9') && cCharAt != ' ' && cCharAt != ':' && cCharAt != '=' && cCharAt != '?'))) {
                switch (cCharAt) {
                    case '\'':
                    case '(':
                    case ')':
                        continue;
                    default:
                        switch (cCharAt) {
                            case '+':
                            case ',':
                            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                            case '.':
                            case '/':
                                break;
                            default:
                                return false;
                        }
                        break;
                }
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1PrintableString) {
            return Arrays.areEqual(this.contents, ((ASN1PrintableString) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.writeEncodingDL(z, 19, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.contents.length);
    }

    public final byte[] getOctets() {
        return Arrays.clone(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String getString() {
        return Strings.fromByteArray(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public String toString() {
        return getString();
    }
}
