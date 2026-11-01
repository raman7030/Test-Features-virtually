package p067l;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9770 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ᩸ */
    public final C12516 f26977;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC19221 f26978 = new C14464(this);

    public C9770(File file) {
        this.f26977 = C12516.m28828(file, 201105, 2, 10485760L);
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f26977.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f26977.close();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m22791(InterfaceC8233 interfaceC8233) throws IOException {
        try {
            long jMo14219 = interfaceC8233.mo14219();
            String strMo14205 = interfaceC8233.mo14205();
            if (jMo14219 >= 0 && jMo14219 <= 2147483647L && strMo14205.isEmpty()) {
                return (int) jMo14219;
            }
            throw new IOException("expected an int but was \"" + jMo14219 + strMo14205 + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }
}
