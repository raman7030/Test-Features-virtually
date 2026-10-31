package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩶᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U8EV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20409 extends InputStream implements InterfaceC14905 {
    @Override // java.io.InputStream
    public final int read() {
        return 0;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return j;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }
}
