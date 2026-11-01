package p067l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩷ۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: OJQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C22121 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC9866 f69992;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C22121(InterfaceC9866 interfaceC9866) {
        this.f69992 = interfaceC9866;
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f69992.read();
    }
}
