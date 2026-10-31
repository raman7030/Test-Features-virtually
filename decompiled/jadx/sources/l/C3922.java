package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ۘۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 573L */
/* JADX INFO: loaded from: classes3.dex */
public final class C3922 extends InflaterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f12506;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f12507;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1 || this.f12507) {
            return i3;
        }
        if (((InflaterInputStream) this).inf.needsDictionary()) {
            throw new ZipException("ZLIB stream requires a preset dictionary");
        }
        if (((InflaterInputStream) this).inf.getRemaining() != 0 || ((InflaterInputStream) this).in.read() != -1) {
            throw new ZipException("Trailing data after ZLIB stream");
        }
        this.f12507 = true;
        return i3;
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12506) {
            return;
        }
        this.f12506 = true;
        try {
            super.close();
        } finally {
            ((InflaterInputStream) this).inf.end();
        }
    }
}
