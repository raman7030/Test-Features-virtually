package l;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W7A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4262 extends ByteArrayInputStream implements InterfaceC14905, InterfaceC0088 {
    @Override // java.io.ByteArrayInputStream, java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public final int position() {
        return ((ByteArrayInputStream) this).pos;
    }
}
