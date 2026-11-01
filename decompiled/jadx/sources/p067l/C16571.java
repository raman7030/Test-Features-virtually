package p067l;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0941 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16571 extends FileInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f48659;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C16571(String str) {
        super(str);
        this.f48659 = false;
    }

    public C16571(File file) {
        super(file);
        this.f48659 = false;
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f48659) {
            return;
        }
        try {
            super.close();
            this.f48659 = true;
        } catch (IOException unused) {
        }
    }
}
