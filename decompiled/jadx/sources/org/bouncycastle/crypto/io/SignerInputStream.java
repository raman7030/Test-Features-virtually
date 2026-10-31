package org.bouncycastle.crypto.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import l.C0794;
import l.InterfaceC14905;
import org.bouncycastle.crypto.Signer;

/* JADX INFO: loaded from: classes.dex */
public class SignerInputStream extends FilterInputStream implements InterfaceC14905 {
    public Signer signer;

    public SignerInputStream(InputStream inputStream, Signer signer) {
        super(inputStream);
        this.signer = signer;
    }

    public Signer getSigner() {
        return this.signer;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i >= 0) {
            this.signer.update((byte) i);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 > 0) {
            this.signer.update(bArr, i, i3);
        }
        return i3;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }
}
