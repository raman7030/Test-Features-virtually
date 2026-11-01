package p067l;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes2.dex */
public final class C6301 extends BufferedOutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f15921;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3940 f15922;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6301(C20383 c20383, OutputStream outputStream, C3940 c3940) {
        super(outputStream, 32768);
        this.f15922 = c3940;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C3940 c3940 = this.f15922;
        if (this.f15921) {
            return;
        }
        try {
            super.close();
        } finally {
            int i = C20383.f63001;
            C5218.m11189(c3940);
            this.f15921 = true;
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
