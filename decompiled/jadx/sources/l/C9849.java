package l;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z728 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9849 extends BufferedOutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f29811;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f29811 = true;
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
        String str = C3603.f11424;
        throw th;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24920(OutputStream outputStream) {
        C22632.m50634(this.f29811);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f29811 = false;
    }
}
