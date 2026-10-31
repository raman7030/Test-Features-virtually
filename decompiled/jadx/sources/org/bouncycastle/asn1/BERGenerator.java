package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: loaded from: classes.dex */
public abstract class BERGenerator extends ASN1Generator {
    public boolean _isExplicit;
    public int _tagNo;
    public boolean _tagged;

    public BERGenerator(OutputStream outputStream) {
        super(outputStream);
        this._tagged = false;
    }

    public BERGenerator(OutputStream outputStream, int i, boolean z) {
        super(outputStream);
        this._tagged = true;
        this._isExplicit = z;
        this._tagNo = i;
    }

    private void writeHdr(int i) throws IOException {
        this._out.write(i);
        this._out.write(128);
    }

    @Override // org.bouncycastle.asn1.ASN1Generator
    public OutputStream getRawOutputStream() {
        return this._out;
    }

    public void writeBEREnd() throws IOException {
        this._out.write(0);
        this._out.write(0);
        if (this._tagged && this._isExplicit) {
            this._out.write(0);
            this._out.write(0);
        }
    }

    public void writeBERHeader(int i) throws IOException {
        if (!this._tagged) {
            writeHdr(i);
            return;
        }
        int i2 = this._tagNo;
        int i3 = i2 | 128;
        if (this._isExplicit) {
            writeHdr(i2 | DHParameters.DEFAULT_MINIMUM_LENGTH);
        } else {
            if ((i & 32) == 0) {
                writeHdr(i3);
                return;
            }
            i = i2 | DHParameters.DEFAULT_MINIMUM_LENGTH;
        }
        writeHdr(i);
    }
}
