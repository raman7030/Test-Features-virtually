package p067l;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BJB */
/* JADX INFO: loaded from: classes3.dex */
public final class C11208 extends ByteArrayInputStream implements InterfaceC16534, InterfaceC2452 {
    @Override // java.io.ByteArrayInputStream, java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m25874() {
        return ((ByteArrayInputStream) this).buf;
    }
}
