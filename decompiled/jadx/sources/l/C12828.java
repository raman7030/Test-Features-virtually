package l;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: renamed from: l.۬ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAPP */
/* JADX INFO: loaded from: classes3.dex */
public final class C12828 extends Reader {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f38518;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f38519;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f38520;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f38521;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public char[] f38522;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InputStreamReader f38523;

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    public C12828(InputStreamReader inputStreamReader) {
        super(inputStreamReader);
        this.f38521 = -1;
        this.f38520 = 0;
        this.f38523 = inputStreamReader;
        this.f38522 = new char[8192];
        this.f38519 = 0;
        this.f38518 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31203() throws IOException {
        if (this.f38523 == null) {
            throw new IOException("Stream closed");
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m31204() throws IOException {
        int i;
        int i2 = this.f38521;
        int i3 = 0;
        if (i2 > -1) {
            int i4 = this.f38518 - i2;
            int i5 = this.f38520;
            if (i4 >= i5) {
                this.f38521 = -2;
                this.f38520 = 0;
            } else {
                char[] cArr = this.f38522;
                if (i5 <= cArr.length) {
                    System.arraycopy(cArr, i2, cArr, 0, i4);
                    this.f38521 = 0;
                } else {
                    int length = cArr.length * 2;
                    if (length <= i5) {
                        i5 = length;
                    }
                    char[] cArr2 = new char[i5];
                    System.arraycopy(cArr, i2, cArr2, 0, i4);
                    this.f38522 = cArr2;
                    this.f38521 = 0;
                }
                this.f38519 = i4;
                this.f38518 = i4;
                i3 = i4;
            }
        }
        do {
            InputStreamReader inputStreamReader = this.f38523;
            char[] cArr3 = this.f38522;
            i = inputStreamReader.read(cArr3, i3, cArr3.length - i3);
        } while (i == 0);
        if (i > 0) {
            this.f38519 = i + i3;
            this.f38518 = i3;
        }
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        m31203();
        if (this.f38518 >= this.f38519) {
            m31204();
            if (this.f38518 >= this.f38519) {
                return -1;
            }
        }
        char[] cArr = this.f38522;
        int i = this.f38518;
        this.f38518 = i + 1;
        return cArr[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m31202(char[] cArr, int i, int i2) throws IOException {
        if (this.f38518 >= this.f38519) {
            if (i2 >= this.f38522.length && this.f38521 <= -1) {
                return this.f38523.read(cArr, i, i2);
            }
            m31204();
        }
        int i3 = this.f38518;
        int i4 = this.f38519;
        if (i3 >= i4) {
            return -1;
        }
        int iMin = Math.min(i2, i4 - i3);
        System.arraycopy(this.f38522, this.f38518, cArr, i, iMin);
        this.f38518 += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        m31203();
        if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) > cArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int iM31202 = m31202(cArr, i, i2);
        if (iM31202 <= 0) {
            return iM31202;
        }
        while (iM31202 < i2 && this.f38523.ready()) {
            int iM31203 = m31202(cArr, i + iM31202, i2 - iM31202);
            if (iM31203 <= 0) {
                break;
            }
            iM31202 += iM31203;
        }
        return iM31202;
    }

    @Override // java.io.Reader
    public final long skip(long j) throws IOException {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("skip value is negative");
        }
        m31203();
        long j3 = j;
        while (j3 > 0) {
            if (this.f38518 >= this.f38519) {
                m31204();
            }
            int i = this.f38518;
            int i2 = this.f38519;
            if (i >= i2) {
                break;
            }
            long j4 = i2 - i;
            if (j3 <= j4) {
                this.f38518 = (int) (((long) i) + j3);
            } else {
                j3 -= j4;
                this.f38518 = i2;
            }
            return j - j2;
        }
        j2 = j3;
        return j - j2;
    }

    @Override // java.io.Reader
    public final boolean ready() throws IOException {
        m31203();
        return this.f38518 < this.f38519 || this.f38523.ready();
    }

    @Override // java.io.Reader
    public final void mark(int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Read-ahead limit < 0");
        }
        m31203();
        this.f38520 = i;
        this.f38521 = this.f38518;
    }

    @Override // java.io.Reader
    public final void reset() throws IOException {
        m31203();
        int i = this.f38521;
        if (i < 0) {
            throw new IOException(this.f38521 == -2 ? "Mark invalid" : "Stream not marked");
        }
        this.f38518 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStreamReader inputStreamReader = this.f38523;
        if (inputStreamReader == null) {
            return;
        }
        try {
            inputStreamReader.close();
        } finally {
            this.f38523 = null;
            this.f38522 = null;
        }
    }
}
