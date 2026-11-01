package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܿܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51WE */
/* JADX INFO: loaded from: classes4.dex */
public final class C18977 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C16294 f56595;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ OutputStream f56596;

    public C18977(C16294 c16294, OutputStream outputStream) {
        this.f56595 = c16294;
        this.f56596 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f56596.write(bArr, i, i2);
        this.f56595.f47891.m54924(i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f56596.write(i);
        this.f56595.f47891.m54924(1);
    }
}
