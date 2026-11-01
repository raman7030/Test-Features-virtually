package p067l;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z728 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11729 extends BufferedOutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f32764;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f32764 = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        if (th == null) {
            return;
        }
        String str = C5792.f14228;
        throw th;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26935(OutputStream outputStream) {
        C23877.m52960(this.f32764);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f32764 = false;
    }
}
