package org.bouncycastle.asn1;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentMap;
import l.C22870;
import l.C3200;
import l.C4860;
import l.C5127;
import l.ConcurrentMapC10942;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public class ASN1RelativeOID extends ASN1Primitive {
    public static final long LONG_LIMIT = 72057594037927808L;
    public static final int MAX_CONTENTS_LENGTH = 4096;
    public static final int MAX_IDENTIFIER_LENGTH = 16383;
    public static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1RelativeOID.class, 13) { // from class: org.bouncycastle.asn1.ASN1RelativeOID.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1RelativeOID.createPrimitive(dEROctetString.getOctets(), false);
        }
    };
    public static final ConcurrentMap pool = new ConcurrentMapC10942();
    public final byte[] contents;
    public String identifier;

    public ASN1RelativeOID(String str) {
        checkIdentifier(str);
        byte[] identifier = parseIdentifier(str);
        checkContentsLength(identifier.length);
        this.contents = identifier;
        this.identifier = str;
    }

    public ASN1RelativeOID(byte[] bArr, String str) {
        this.contents = bArr;
        this.identifier = str;
    }

    public static void checkContentsLength(int i) {
        if (i > 4096) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
    }

    public static ASN1RelativeOID createPrimitive(byte[] bArr, boolean z) {
        checkContentsLength(bArr.length);
        ASN1RelativeOID aSN1RelativeOID = (ASN1RelativeOID) pool.get(new ASN1ObjectIdentifier.OidHandle(bArr));
        if (aSN1RelativeOID != null) {
            return aSN1RelativeOID;
        }
        if (!isValidContents(bArr)) {
            throw new IllegalArgumentException("invalid relative OID contents");
        }
        if (z) {
            bArr = Arrays.clone(bArr);
        }
        return new ASN1RelativeOID(bArr, null);
    }

    public static ASN1RelativeOID fromContents(byte[] bArr) {
        if (bArr != null) {
            return createPrimitive(bArr, true);
        }
        throw new NullPointerException("'contents' cannot be null");
    }

    public static ASN1RelativeOID getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1RelativeOID)) {
            return (ASN1RelativeOID) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1RelativeOID) {
                return (ASN1RelativeOID) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1RelativeOID) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException(C5127.m14678(e, new StringBuilder("failed to construct relative OID from byte[]: ")));
            }
        }
        throw new IllegalArgumentException(C3200.m9832(obj, "illegal object in getInstance: "));
    }

    public static ASN1RelativeOID getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1RelativeOID) TYPE.getContextTagged(aSN1TaggedObject, z);
    }

    public static ASN1RelativeOID getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1RelativeOID) TYPE.getTagged(aSN1TaggedObject, z);
    }

    public static boolean isValidContents(byte[] bArr) {
        if (Properties.isOverrideSet("org.bouncycastle.asn1.allow_wrong_oid_enc")) {
            return true;
        }
        if (bArr.length < 1) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            if (z && (bArr[i] & 255) == 128) {
                return false;
            }
            z = (bArr[i] & GCMSIVBlockCipher.MASK) == 0;
        }
        return z;
    }

    public static boolean isValidIdentifier(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i3 < i) {
                return i2 != 0 && (i2 <= 1 || str.charAt(length) != '0');
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt == '.') {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    return false;
                }
                i2 = 0;
            } else {
                if ('0' > cCharAt || cCharAt > '9') {
                    return false;
                }
                i2++;
            }
            length = i3;
        }
    }

    public static String parseContents(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        long j = 0;
        BigInteger bigIntegerShiftLeft = null;
        for (int i = 0; i != bArr.length; i++) {
            byte b = bArr[i];
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID));
                if ((b & GCMSIVBlockCipher.MASK) == 0) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append('.');
                    }
                    sb.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                if (bigIntegerShiftLeft == null) {
                    bigIntegerShiftLeft = BigInteger.valueOf(j);
                }
                BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID));
                if ((b & GCMSIVBlockCipher.MASK) == 0) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append('.');
                    }
                    sb.append(bigIntegerOr);
                    j = 0;
                    bigIntegerShiftLeft = null;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
        }
        return sb.toString();
    }

    public static byte[] parseIdentifier(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OIDTokenizer oIDTokenizer = new OIDTokenizer(str);
        while (oIDTokenizer.hasMoreTokens()) {
            String strNextToken = oIDTokenizer.nextToken();
            if (strNextToken.length() <= 18) {
                writeField(byteArrayOutputStream, Long.parseLong(strNextToken));
            } else {
                writeField(byteArrayOutputStream, new BigInteger(strNextToken));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static ASN1RelativeOID tryFromID(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (str.length() > 16383 || !isValidIdentifier(str, 0)) {
            return null;
        }
        byte[] identifier = parseIdentifier(str);
        if (identifier.length <= 4096) {
            return new ASN1RelativeOID(identifier, str);
        }
        return null;
    }

    public static void writeField(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public static void writeField(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        int i = iBitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (this == aSN1Primitive) {
            return true;
        }
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            return Arrays.areEqual(this.contents, ((ASN1RelativeOID) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.writeEncodingDL(z, 13, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.contents.length);
    }

    public synchronized String getId() {
        if (this.identifier == null) {
            this.identifier = parseContents(this.contents);
        }
        return this.identifier;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public String toString() {
        return getId();
    }

    public ASN1RelativeOID branch(String str) {
        byte[] bArrConcatenate;
        checkIdentifier(str);
        if (str.length() <= 2) {
            checkContentsLength(this.contents.length + 1);
            int iCharAt = str.charAt(0) - '0';
            if (str.length() == 2) {
                iCharAt = (iCharAt * 10) + (str.charAt(1) - '0');
            }
            bArrConcatenate = Arrays.append(this.contents, (byte) iCharAt);
        } else {
            byte[] identifier = parseIdentifier(str);
            checkContentsLength(this.contents.length + identifier.length);
            bArrConcatenate = Arrays.concatenate(this.contents, identifier);
        }
        return new ASN1RelativeOID(bArrConcatenate, C22870.m50967(getId(), ".", str));
    }

    public static void checkIdentifier(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (str.length() > 16383) {
            throw new IllegalArgumentException("exceeded relative OID contents length limit");
        }
        if (!isValidIdentifier(str, 0)) {
            throw new IllegalArgumentException(C4860.m14172("string ", str, " not a valid relative OID"));
        }
    }
}
