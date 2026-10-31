package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0941 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14944 extends FileInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f45545;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C14944(String str) {
        super(str);
        this.f45545 = false;
    }

    public C14944(File file) {
        super(file);
        this.f45545 = false;
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f45545) {
            return;
        }
        try {
            super.close();
            this.f45545 = true;
        } catch (IOException unused) {
        }
    }
}
