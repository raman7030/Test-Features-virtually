package l;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۟ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B6P */
/* JADX INFO: loaded from: classes2.dex */
public final class C7307 implements Closeable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InputStream f22428;

    public final synchronized int readInt() {
        return m19583(0) | m19583(8) | m19583(16) | m19583(24);
    }

    public final synchronized short readShort() {
        return (short) (m19583(0) | m19583(8));
    }

    public final synchronized void skipBytes(int i) {
        try {
            if (i < 0) {
                throw new IllegalArgumentException();
            }
            int i2 = 0;
            while (i2 < i) {
                int iSkip = (int) this.f22428.skip(i - i2);
                if (iSkip <= 0) {
                    break;
                } else {
                    i2 += iSkip;
                }
            }
            if (i2 != i) {
                throw new EOFException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public final synchronized int m19584() {
        return m19583(0) | m19583(8);
    }

    public C7307(InputStream inputStream) {
        this.f22428 = inputStream;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m19583(int i) throws IOException {
        int i2 = this.f22428.read();
        if (i2 != -1) {
            return (i2 & 255) << i;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f22428.close();
    }
}
