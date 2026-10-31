package org.bouncycastle.asn1.x509;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import l.C12803;
import l.C16014;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;

/* JADX INFO: loaded from: classes.dex */
public class X509ExtensionsGenerator {
    public Hashtable extensions = new Hashtable();
    public Vector extOrdering = new Vector();

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, ASN1Encodable aSN1Encodable) {
        try {
            addExtension(aSN1ObjectIdentifier, z, aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
        } catch (IOException e) {
            throw new IllegalArgumentException(C16014.m37866("error encoding value: ", e));
        }
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) {
        if (this.extensions.containsKey(aSN1ObjectIdentifier)) {
            throw new IllegalArgumentException(C12803.m31105("extension ", aSN1ObjectIdentifier, " already added"));
        }
        this.extOrdering.addElement(aSN1ObjectIdentifier);
        this.extensions.put(aSN1ObjectIdentifier, new X509Extension(z, new DEROctetString(bArr)));
    }

    public X509Extensions generate() {
        return new X509Extensions(this.extOrdering, this.extensions);
    }

    public boolean isEmpty() {
        return this.extOrdering.isEmpty();
    }

    public void reset() {
        this.extensions = new Hashtable();
        this.extOrdering = new Vector();
    }
}
