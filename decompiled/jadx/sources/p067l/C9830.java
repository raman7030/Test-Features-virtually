package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: renamed from: l.۠֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9XD */
/* JADX INFO: loaded from: classes3.dex */
public final class C9830 extends AbstractC23242 {

    /* JADX INFO: renamed from: ܿ */
    public static final ASN1ObjectIdentifier f27254 = new ASN1ObjectIdentifier("1.3.6.1.5.5.2");

    /* JADX INFO: renamed from: ܽ */
    public int f27255;

    /* JADX INFO: renamed from: ᩳ */
    public ASN1ObjectIdentifier[] f27256;

    public C9830(byte[] bArr) throws IOException {
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        try {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1InputStream.readObject();
            if (aSN1TaggedObject == null || aSN1TaggedObject.getTagClass() != 64 || !(aSN1TaggedObject.getBaseObject() instanceof ASN1Sequence)) {
                throw new IOException("Malformed SPNEGO token " + aSN1TaggedObject);
            }
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1TaggedObject.getBaseObject();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
            if (!f27254.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                throw new IOException("Malformed SPNEGO token, OID " + aSN1ObjectIdentifier);
            }
            ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) aSN1Sequence.getObjectAt(1);
            if (aSN1TaggedObject2.getTagNo() != 0) {
                throw new IOException("Malformed SPNEGO token: tag " + aSN1TaggedObject2.getTagNo() + " " + aSN1TaggedObject2);
            }
            Enumeration objects = ASN1Sequence.getInstance(aSN1TaggedObject2, true).getObjects();
            while (objects.hasMoreElements()) {
                ASN1TaggedObject aSN1TaggedObject3 = (ASN1TaggedObject) objects.nextElement();
                int tagNo = aSN1TaggedObject3.getTagNo();
                if (tagNo == 0) {
                    ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1TaggedObject3, true);
                    int size = aSN1Sequence2.size();
                    ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        } else {
                            aSN1ObjectIdentifierArr[size] = (ASN1ObjectIdentifier) aSN1Sequence2.getObjectAt(size);
                        }
                    }
                    this.f27256 = aSN1ObjectIdentifierArr;
                } else if (tagNo == 1) {
                    this.f27255 = ASN1BitString.getInstance(aSN1TaggedObject3, true).getBytes()[0] & 255;
                } else if (tagNo == 2) {
                    m51786(ASN1OctetString.getInstance(aSN1TaggedObject3, true).getOctets());
                } else {
                    if (tagNo != 3) {
                        if (tagNo != 4) {
                            throw new IOException("Malformed token field.");
                        }
                    } else if (!(aSN1TaggedObject3.getBaseObject() instanceof DEROctetString)) {
                    }
                    m51784(ASN1OctetString.getInstance(aSN1TaggedObject3, true).getOctets());
                }
            }
            aSN1InputStream.close();
        } catch (Throwable th) {
            try {
                aSN1InputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public C9830(ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr, int i, byte[] bArr) {
        this.f27256 = aSN1ObjectIdentifierArr;
        this.f27255 = i;
        m51786(bArr);
        m51784(null);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final ASN1ObjectIdentifier[] m22999() {
        return this.f27256;
    }

    public final String toString() {
        return String.format("NegTokenInit[flags=%d,mechs=%s,mic=%s]", Integer.valueOf(this.f27255), Arrays.toString(this.f27256), m51785() != null ? C13854.m31530(m51785(), 0, m51785().length) : null);
    }

    @Override // p067l.AbstractC23242
    /* JADX INFO: renamed from: ܽ */
    public final byte[] mo22998() {
        try {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = this.f27256;
            if (aSN1ObjectIdentifierArr != null) {
                ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                for (ASN1ObjectIdentifier aSN1ObjectIdentifier : aSN1ObjectIdentifierArr) {
                    aSN1EncodableVector2.add(aSN1ObjectIdentifier);
                }
                aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) new DERSequence(aSN1EncodableVector2)));
            }
            int i = this.f27255;
            if (i != 0) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 1, (ASN1Encodable) new DERBitString(i)));
            }
            byte[] bArrM51787 = m51787();
            if (bArrM51787 != null) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 2, (ASN1Encodable) new DEROctetString(bArrM51787)));
            }
            byte[] bArrM51785 = m51785();
            if (bArrM51785 != null) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 3, (ASN1Encodable) new DEROctetString(bArrM51785)));
            }
            ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
            aSN1EncodableVector3.add(f27254);
            aSN1EncodableVector3.add(new DERTaggedObject(true, 0, (ASN1Encodable) new DERSequence(aSN1EncodableVector)));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ASN1OutputStream.create(byteArrayOutputStream, ASN1Encoding.DER).writeObject((ASN1Primitive) new DERTaggedObject(false, 64, 0, (ASN1Encodable) new DERSequence(aSN1EncodableVector3)));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
