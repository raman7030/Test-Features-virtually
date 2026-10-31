package l;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩵᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E8EY */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19704 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f63647;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f63648;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC19704(InputStream inputStream, String str) {
        super(inputStream);
        int i = C8789.f26773;
        Charset charsetForName = str != null ? Charset.forName(str) : Charset.defaultCharset();
        this.f63648 = new byte[1];
        if (charsetForName == null) {
            Charset.defaultCharset();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45394(int i) {
        m45395(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45395(long j) {
        if (j != -1) {
            this.f63647 += j;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m45393() {
        return this.f63647;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m45396(long j) {
        this.f63647 -= j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        byte[] bArr = this.f63648;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
