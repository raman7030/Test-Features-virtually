package l;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: l.ۘۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6QB */
/* JADX INFO: loaded from: classes2.dex */
public final class C3720 extends Reader {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Reader f11755;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f11756;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f11757;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f11758;

    public C3720(Reader reader) {
        C11003.requireNonNull(reader);
        this.f11755 = reader;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m11311() {
        return this.f11758;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m11312() {
        return this.f11756;
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        int i;
        if (this.f11755 == null) {
            throw new IOException("Line normalizer is closed");
        }
        if (this.f11757) {
            return -1;
        }
        do {
            i = this.f11755.read();
            if (i == -1) {
                if (this.f11758 == 0) {
                    this.f11758 = this.f11756 ? 2 : 1;
                }
                this.f11756 = false;
                this.f11757 = true;
                return -1;
            }
            if (this.f11756) {
                this.f11756 = false;
                if (this.f11758 == 0) {
                    this.f11758 = i == 10 ? 3 : 2;
                }
            } else if (i == 13) {
                this.f11756 = true;
                return 10;
            }
            return i;
        } while (i == 10);
        if (i == 13) {
            return 10;
        }
        return i;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        if (this.f11755 == null) {
            throw new IOException("Line normalizer is closed");
        }
        C13409.m32419(cArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        if (!this.f11757) {
            int i4 = 0;
            while (i4 < i2) {
                int i5 = i + i4;
                int i6 = i2 - i4;
                int i7 = this.f11755.read(cArr, i5, i6);
                if (i7 == -1) {
                    if (this.f11758 == 0) {
                        this.f11758 = this.f11756 ? 2 : 1;
                    }
                    this.f11756 = false;
                    this.f11757 = true;
                    break;
                }
                if (i7 <= 0 || i7 > i6) {
                    throw new IOException("Text normalizer input made invalid progress");
                }
                int i8 = i7 + i5;
                while (i5 < i8) {
                    if (this.f11756) {
                        i3 = i5 + 1;
                        char c = cArr[i5];
                        this.f11756 = false;
                        if (this.f11758 == 0) {
                            this.f11758 = c == '\n' ? 3 : 2;
                        }
                        if (c != '\n') {
                            int i9 = i4 + 1;
                            cArr[i4 + i] = c != '\r' ? c : '\n';
                            i5 = i3;
                            i4 = i9;
                        }
                    } else {
                        i3 = i5;
                        while (i3 < i8 && cArr[i3] != '\r') {
                            i3++;
                        }
                        int i10 = i3 - i5;
                        if (i10 != 0) {
                            int i11 = i + i4;
                            if (i11 != i5) {
                                System.arraycopy(cArr, i5, cArr, i11, i10);
                            }
                            i4 += i10;
                        }
                        if (i3 < i8) {
                            i3++;
                            cArr[i4 + i] = '\n';
                            this.f11756 = true;
                            i4++;
                        }
                    }
                    i5 = i3;
                }
            }
            if (i4 != 0) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Reader reader = this.f11755;
        this.f11755 = null;
        if (reader != null) {
            reader.close();
        }
    }
}
