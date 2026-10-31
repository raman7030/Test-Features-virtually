package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.InputStream;
import l.C4860;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.util.encoders.Base64;
import org.bouncycastle.util.io.pem.PemReader;

/* JADX INFO: loaded from: classes.dex */
public class PEMUtil {
    public final String _footer1;
    public final String _footer2;
    public final String _header1;
    public final String _header2;

    private String readLine(InputStream inputStream) throws IOException {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i = inputStream.read();
            if (i == 13 || i == 10 || i < 0) {
                if (i < 0 || stringBuffer.length() != 0) {
                    break;
                }
            } else if (i != 13) {
                stringBuffer.append((char) i);
            }
        }
        if (i < 0) {
            return null;
        }
        return stringBuffer.toString();
    }

    public ASN1Sequence readPEMObject(InputStream inputStream) {
        String line;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            line = readLine(inputStream);
            if (line == null || line.startsWith(this._header1)) {
                break;
            }
        } while (!line.startsWith(this._header2));
        while (true) {
            String line2 = readLine(inputStream);
            if (line2 == null || line2.startsWith(this._footer1) || line2.startsWith(this._footer2)) {
                break;
            }
            stringBuffer.append(line2);
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        ASN1Primitive object = new ASN1InputStream(Base64.decode(stringBuffer.toString())).readObject();
        if (object instanceof ASN1Sequence) {
            return (ASN1Sequence) object;
        }
        throw new IOException("malformed PEM data encountered");
    }

    public PEMUtil(String str) {
        this._header1 = C4860.m14172(PemReader.BEGIN, str, "-----");
        this._header2 = C4860.m14172("-----BEGIN X509 ", str, "-----");
        this._footer1 = C4860.m14172(PemReader.END, str, "-----");
        this._footer2 = C4860.m14172("-----END X509 ", str, "-----");
    }
}
