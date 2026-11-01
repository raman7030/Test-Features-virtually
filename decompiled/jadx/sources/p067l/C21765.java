package p067l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩶᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U8EV */
/* JADX INFO: loaded from: classes5.dex */
public final class C21765 extends InputStream implements InterfaceC16534 {
    @Override // java.io.InputStream
    public final int read() {
        return 0;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return j;
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }
}
