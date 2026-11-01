package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: renamed from: l.ܶ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FA1E */
/* JADX INFO: loaded from: classes4.dex */
public final class C16535 extends AbstractC23242 {

    /* JADX INFO: renamed from: ܽ */
    public ASN1ObjectIdentifier f48587;

    /* JADX INFO: renamed from: ᩳ */
    public int f48588;

    public C16535(byte[] bArr) throws IOException {
        this.f48588 = -1;
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        try {
            Enumeration objects = ASN1Sequence.getInstance((ASN1TaggedObject) aSN1InputStream.readObject(), true).getObjects();
            while (objects.hasMoreElements()) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    this.f48588 = ASN1Enumerated.getInstance(aSN1TaggedObject, true).getValue().intValue();
                } else if (tagNo == 1) {
                    this.f48587 = ASN1ObjectIdentifier.getInstance(aSN1TaggedObject, true);
                } else if (tagNo == 2) {
                    m51786(ASN1OctetString.getInstance(aSN1TaggedObject, true).getOctets());
                } else if (tagNo == 3) {
                    m51784(ASN1OctetString.getInstance(aSN1TaggedObject, true).getOctets());
                } else {
                    throw new IOException("Malformed token field.");
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

    public C16535(byte[] bArr, byte[] bArr2) {
        this.f48588 = -1;
        this.f48587 = null;
        m51786(bArr);
        m51784(bArr2);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m37517() {
        return this.f48588;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final ASN1ObjectIdentifier m37518() {
        return this.f48587;
    }

    @Override // p067l.AbstractC23242
    /* JADX INFO: renamed from: ܽ */
    public final byte[] mo22998() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ASN1OutputStream aSN1OutputStreamCreate = ASN1OutputStream.create(byteArrayOutputStream, ASN1Encoding.DER);
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            int i = this.f48588;
            if (i != -1) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) new ASN1Enumerated(i)));
            }
            ASN1ObjectIdentifier aSN1ObjectIdentifier = this.f48587;
            if (aSN1ObjectIdentifier != null) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 1, (ASN1Encodable) aSN1ObjectIdentifier));
            }
            byte[] bArrM51787 = m51787();
            if (bArrM51787 != null) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 2, (ASN1Encodable) new DEROctetString(bArrM51787)));
            }
            byte[] bArrM51785 = m51785();
            if (bArrM51785 != null) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 3, (ASN1Encodable) new DEROctetString(bArrM51785)));
            }
            aSN1OutputStreamCreate.writeObject((ASN1Primitive) new DERTaggedObject(true, 1, (ASN1Encodable) new DERSequence(aSN1EncodableVector)));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
