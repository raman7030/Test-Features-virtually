package l;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܳܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14564 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C19277 f44598;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C14564(C15975 c15975, BufferedInputStream bufferedInputStream, AbstractC15440 abstractC15440) {
        super(bufferedInputStream);
        C19277 c19277 = new C19277(abstractC15440.mo23127());
        c19277.m44459(new C19164(c15975));
        this.f44598 = c19277;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        this.f44598.m44460(1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        this.f44598.m44460(i3);
        return i3;
    }
}
