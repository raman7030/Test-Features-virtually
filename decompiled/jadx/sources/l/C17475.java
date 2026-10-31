package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܿܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51WE */
/* JADX INFO: loaded from: classes4.dex */
public final class C17475 extends OutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14652 f53408;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ OutputStream f53409;

    public C17475(C14652 c14652, OutputStream outputStream) {
        this.f53408 = c14652;
        this.f53409 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f53409.write(bArr, i, i2);
        this.f53408.f44784.m52515(i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f53409.write(i);
        this.f53408.f44784.m52515(1);
    }
}
