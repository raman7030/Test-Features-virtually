package p067l;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۟ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B6P */
/* JADX INFO: loaded from: classes2.dex */
public final class C9313 implements Closeable {

    /* JADX INFO: renamed from: ᩸ */
    public final InputStream f25319;

    public final synchronized int readInt() {
        return m21551(0) | m21551(8) | m21551(16) | m21551(24);
    }

    public final synchronized short readShort() {
        return (short) (m21551(0) | m21551(8));
    }

    public final synchronized void skipBytes(int i) {
        try {
            if (i < 0) {
                throw new IllegalArgumentException();
            }
            int i2 = 0;
            while (i2 < i) {
                int iSkip = (int) this.f25319.skip(i - i2);
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

    /* JADX INFO: renamed from: ۛۧ */
    public final synchronized int m21552() {
        return m21551(0) | m21551(8);
    }

    public C9313(InputStream inputStream) {
        this.f25319 = inputStream;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m21551(int i) throws IOException {
        int i2 = this.f25319.read();
        if (i2 != -1) {
            return (i2 & 255) << i;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f25319.close();
    }
}
