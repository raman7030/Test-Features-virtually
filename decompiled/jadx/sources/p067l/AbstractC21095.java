package p067l;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩵᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E8EY */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21095 extends FilterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public long f66278;

    /* JADX INFO: renamed from: ᩹ */
    public final byte[] f66279;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC21095(InputStream inputStream, String str) {
        super(inputStream);
        int i = C10721.f29698;
        Charset charsetForName = str != null ? Charset.forName(str) : Charset.defaultCharset();
        this.f66279 = new byte[1];
        if (charsetForName == null) {
            Charset.defaultCharset();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47698(int i) {
        m47699(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47699(long j) {
        if (j != -1) {
            this.f66278 += j;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m47697() {
        return this.f66278;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m47700(long j) {
        this.f66278 -= j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        byte[] bArr = this.f66279;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
