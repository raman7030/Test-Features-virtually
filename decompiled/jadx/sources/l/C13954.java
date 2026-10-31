package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܰܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C13954 extends C10428 {
    public C13954(byte[] bArr) {
        super(bArr);
        this.f31333.mark(Integer.MAX_VALUE);
    }

    public C13954(InputStream inputStream) {
        super(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.f31333.mark(Integer.MAX_VALUE);
    }

    public final void seek(long j) throws IOException {
        int i = this.f31330;
        if (i > j) {
            this.f31330 = 0;
            this.f31333.reset();
        } else {
            j -= (long) i;
        }
        m26271((int) j);
    }
}
