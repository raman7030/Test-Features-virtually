package l;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: AAGU */
/* JADX INFO: loaded from: classes2.dex */
public final class C4137 extends BufferedOutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f13107;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1654 f13108;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4137(C18954 c18954, OutputStream outputStream, C1654 c1654) {
        super(outputStream, 32768);
        this.f13108 = c1654;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1654 c1654 = this.f13108;
        if (this.f13107) {
            return;
        }
        try {
            super.close();
        } finally {
            int i = C18954.f59772;
            C2998.m9138(c1654);
            this.f13107 = true;
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
