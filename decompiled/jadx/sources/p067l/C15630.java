package p067l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܰܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C15630 extends C12279 {
    public C15630(byte[] bArr) {
        super(bArr);
        this.f34297.mark(Integer.MAX_VALUE);
    }

    public C15630(InputStream inputStream) {
        super(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.f34297.mark(Integer.MAX_VALUE);
    }

    public final void seek(long j) throws IOException {
        int i = this.f34294;
        if (i > j) {
            this.f34294 = 0;
            this.f34297.reset();
        } else {
            j -= (long) i;
        }
        m28300((int) j);
    }
}
