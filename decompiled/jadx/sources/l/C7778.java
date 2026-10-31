package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۟᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes3.dex */
public final class C7778 extends InputStream implements InterfaceC14905 {
    @Override // java.io.InputStream
    public final int read() {
        return -1;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }
}
