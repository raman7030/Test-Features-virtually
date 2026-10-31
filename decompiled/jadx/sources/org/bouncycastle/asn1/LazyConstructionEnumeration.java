package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import l.C16014;

/* JADX INFO: loaded from: classes.dex */
public class LazyConstructionEnumeration implements Enumeration {
    public ASN1InputStream aIn;
    public Object nextObj = readObject();

    public LazyConstructionEnumeration(byte[] bArr) {
        this.aIn = new ASN1InputStream(bArr, true);
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.nextObj != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.nextObj;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.nextObj = readObject();
        return obj;
    }

    private Object readObject() {
        try {
            return this.aIn.readObject();
        } catch (IOException e) {
            throw new ASN1ParsingException(C16014.m37866("malformed ASN.1: ", e), e);
        }
    }
}
