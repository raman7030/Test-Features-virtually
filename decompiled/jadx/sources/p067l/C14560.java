package p067l;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: renamed from: l.۬ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAPP */
/* JADX INFO: loaded from: classes3.dex */
public final class C14560 extends Reader {

    /* JADX INFO: renamed from: ۗ */
    public int f41561;

    /* JADX INFO: renamed from: ۙ */
    public int f41562;

    /* JADX INFO: renamed from: ۬ */
    public int f41563;

    /* JADX INFO: renamed from: ᩶ */
    public int f41564;

    /* JADX INFO: renamed from: ᩸ */
    public char[] f41565;

    /* JADX INFO: renamed from: ᩹ */
    public InputStreamReader f41566;

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    public C14560(InputStreamReader inputStreamReader) {
        super(inputStreamReader);
        this.f41564 = -1;
        this.f41563 = 0;
        this.f41566 = inputStreamReader;
        this.f41565 = new char[8192];
        this.f41562 = 0;
        this.f41561 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33289() throws IOException {
        if (this.f41566 == null) {
            throw new IOException("Stream closed");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m33290() throws IOException {
        int i;
        int i2 = this.f41564;
        int i3 = 0;
        if (i2 > -1) {
            int i4 = this.f41561 - i2;
            int i5 = this.f41563;
            if (i4 >= i5) {
                this.f41564 = -2;
                this.f41563 = 0;
            } else {
                char[] cArr = this.f41565;
                if (i5 <= cArr.length) {
                    System.arraycopy(cArr, i2, cArr, 0, i4);
                    this.f41564 = 0;
                } else {
                    int length = cArr.length * 2;
                    if (length <= i5) {
                        i5 = length;
                    }
                    char[] cArr2 = new char[i5];
                    System.arraycopy(cArr, i2, cArr2, 0, i4);
                    this.f41565 = cArr2;
                    this.f41564 = 0;
                }
                this.f41562 = i4;
                this.f41561 = i4;
                i3 = i4;
            }
        }
        do {
            InputStreamReader inputStreamReader = this.f41566;
            char[] cArr3 = this.f41565;
            i = inputStreamReader.read(cArr3, i3, cArr3.length - i3);
        } while (i == 0);
        if (i > 0) {
            this.f41562 = i + i3;
            this.f41561 = i3;
        }
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        m33289();
        if (this.f41561 >= this.f41562) {
            m33290();
            if (this.f41561 >= this.f41562) {
                return -1;
            }
        }
        char[] cArr = this.f41565;
        int i = this.f41561;
        this.f41561 = i + 1;
        return cArr[i];
    }

    /* JADX INFO: renamed from: ֫ */
    private int m33288(char[] cArr, int i, int i2) throws IOException {
        if (this.f41561 >= this.f41562) {
            if (i2 >= this.f41565.length && this.f41564 <= -1) {
                return this.f41566.read(cArr, i, i2);
            }
            m33290();
        }
        int i3 = this.f41561;
        int i4 = this.f41562;
        if (i3 >= i4) {
            return -1;
        }
        int iMin = Math.min(i2, i4 - i3);
        System.arraycopy(this.f41565, this.f41561, cArr, i, iMin);
        this.f41561 += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        m33289();
        if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) > cArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int iM33288 = m33288(cArr, i, i2);
        if (iM33288 <= 0) {
            return iM33288;
        }
        while (iM33288 < i2 && this.f41566.ready()) {
            int iM33289 = m33288(cArr, i + iM33288, i2 - iM33288);
            if (iM33289 <= 0) {
                break;
            }
            iM33288 += iM33289;
        }
        return iM33288;
    }

    @Override // java.io.Reader
    public final long skip(long j) throws IOException {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("skip value is negative");
        }
        m33289();
        long j3 = j;
        while (j3 > 0) {
            if (this.f41561 >= this.f41562) {
                m33290();
            }
            int i = this.f41561;
            int i2 = this.f41562;
            if (i >= i2) {
                break;
            }
            long j4 = i2 - i;
            if (j3 <= j4) {
                this.f41561 = (int) (((long) i) + j3);
            } else {
                j3 -= j4;
                this.f41561 = i2;
            }
            return j - j2;
        }
        j2 = j3;
        return j - j2;
    }

    @Override // java.io.Reader
    public final boolean ready() throws IOException {
        m33289();
        return this.f41561 < this.f41562 || this.f41566.ready();
    }

    @Override // java.io.Reader
    public final void mark(int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Read-ahead limit < 0");
        }
        m33289();
        this.f41563 = i;
        this.f41564 = this.f41561;
    }

    @Override // java.io.Reader
    public final void reset() throws IOException {
        m33289();
        int i = this.f41564;
        if (i < 0) {
            throw new IOException(this.f41564 == -2 ? "Mark invalid" : "Stream not marked");
        }
        this.f41561 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStreamReader inputStreamReader = this.f41566;
        if (inputStreamReader == null) {
            return;
        }
        try {
            inputStreamReader.close();
        } finally {
            this.f41566 = null;
            this.f41565 = null;
        }
    }
}
