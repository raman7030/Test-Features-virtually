package l;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BJB */
/* JADX INFO: loaded from: classes3.dex */
public final class C9301 extends ByteArrayInputStream implements InterfaceC14905, InterfaceC0088 {
    @Override // java.io.ByteArrayInputStream, java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m23865() {
        return ((ByteArrayInputStream) this).buf;
    }
}
