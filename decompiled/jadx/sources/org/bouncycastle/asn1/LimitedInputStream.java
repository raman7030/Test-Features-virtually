package org.bouncycastle.asn1;

import java.io.InputStream;
import java.io.OutputStream;
import l.C0794;
import l.InterfaceC14905;

/* JADX INFO: loaded from: classes.dex */
public abstract class LimitedInputStream extends InputStream implements InterfaceC14905 {
    public final InputStream _in;
    public int _limit;

    public LimitedInputStream(InputStream inputStream, int i) {
        this._in = inputStream;
        this._limit = i;
    }

    public int getLimit() {
        return this._limit;
    }

    public void setParentEofDetect(boolean z) {
        InputStream inputStream = this._in;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream) inputStream).setEofOn00(z);
        }
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }
}
