package l;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7787 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10678 f24060;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC17733 f24061 = new C12726(this);

    public C7787(File file) {
        this.f24060 = C10678.m26789(file, 201105, 2, 10485760L);
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f24060.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24060.close();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20810(InterfaceC6171 interfaceC6171) throws IOException {
        try {
            long jMo12314 = interfaceC6171.mo12314();
            String strMo12300 = interfaceC6171.mo12300();
            if (jMo12314 >= 0 && jMo12314 <= 2147483647L && strMo12300.isEmpty()) {
                return (int) jMo12314;
            }
            throw new IOException("expected an int but was \"" + jMo12314 + strMo12300 + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }
}
