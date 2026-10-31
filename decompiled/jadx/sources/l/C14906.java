package l;

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
public final class C14906 extends AbstractC21963 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ASN1ObjectIdentifier f45472;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f45473;

    public C14906(byte[] bArr) throws IOException {
        this.f45473 = -1;
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        try {
            Enumeration objects = ASN1Sequence.getInstance((ASN1TaggedObject) aSN1InputStream.readObject(), true).getObjects();
            while (objects.hasMoreElements()) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    this.f45473 = ASN1Enumerated.getInstance(aSN1TaggedObject, true).getValue().intValue();
                } else if (tagNo == 1) {
                    this.f45472 = ASN1ObjectIdentifier.getInstance(aSN1TaggedObject, true);
                } else if (tagNo == 2) {
                    m49449(ASN1OctetString.getInstance(aSN1TaggedObject, true).getOctets());
                } else if (tagNo == 3) {
                    m49447(ASN1OctetString.getInstance(aSN1TaggedObject, true).getOctets());
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

    public C14906(byte[] bArr, byte[] bArr2) {
        this.f45473 = -1;
        this.f45472 = null;
        m49449(bArr);
        m49447(bArr2);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m35365() {
        return this.f45473;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ASN1ObjectIdentifier m35366() {
        return this.f45472;
    }

    @Override // l.AbstractC21963
    /* JADX INFO: renamed from: ܽ */
    public final byte[] mo21033() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ASN1OutputStream aSN1OutputStreamCreate = ASN1OutputStream.create(byteArrayOutputStream, ASN1Encoding.DER);
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            int i = this.f45473;
            if (i != -1) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) new ASN1Enumerated(i)));
            }
            ASN1ObjectIdentifier aSN1ObjectIdentifier = this.f45472;
            if (aSN1ObjectIdentifier != null) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 1, (ASN1Encodable) aSN1ObjectIdentifier));
            }
            byte[] bArrM49450 = m49450();
            if (bArrM49450 != null) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 2, (ASN1Encodable) new DEROctetString(bArrM49450)));
            }
            byte[] bArrM49448 = m49448();
            if (bArrM49448 != null) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 3, (ASN1Encodable) new DEROctetString(bArrM49448)));
            }
            aSN1OutputStreamCreate.writeObject((ASN1Primitive) new DERTaggedObject(true, 1, (ASN1Encodable) new DERSequence(aSN1EncodableVector)));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
