package p067l;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W7A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6420 extends ByteArrayInputStream implements InterfaceC16534, InterfaceC2452 {
    @Override // java.io.ByteArrayInputStream, java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public final int position() {
        return ((ByteArrayInputStream) this).pos;
    }
}
