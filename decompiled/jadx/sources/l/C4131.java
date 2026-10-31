package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۘᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AJN */
/* JADX INFO: loaded from: classes2.dex */
public final class C4131 implements CharSequence, Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InputStreamReader f13093;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f13094;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f13095;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char[] f13096 = new char[943718];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f13097 = true;

    public C4131(InputStreamReader inputStreamReader) throws IOException {
        this.f13093 = inputStreamReader;
        m12407();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12410(C11459 c11459, InterfaceC17066 interfaceC17066, boolean z) throws IOException {
        C12164 c12164Matcher = c11459.matcher((CharSequence) this);
        m12409(interfaceC17066, z);
        if (length() < 524288) {
            boolean zFind = c12164Matcher.find();
            m12408(c12164Matcher, zFind, interfaceC17066, z);
            return zFind;
        }
        for (int i = 0; i < 5120; i++) {
            boolean zM29602 = c12164Matcher.m29602(i);
            m12408(c12164Matcher, zM29602, interfaceC17066, z);
            if (zM29602) {
                return true;
            }
        }
        while (true) {
            boolean zM29603 = c12164Matcher.m29602(5120);
            m12408(c12164Matcher, zM29603, interfaceC17066, z);
            if (zM29603) {
                return true;
            }
            int i2 = this.f13095;
            int i3 = this.f13094;
            if (i2 - i3 > 524288) {
                this.f13094 = i3 + 1;
            } else {
                if (!this.f13097 || interfaceC17066.mo1526()) {
                    break;
                }
                m12407();
                int i4 = this.f13095;
                int i5 = this.f13094;
                if (i4 - i5 <= 524288) {
                    break;
                }
                this.f13094 = i5 + 1;
            }
        }
        if (interfaceC17066.mo1526()) {
            m12409(interfaceC17066, z);
            return false;
        }
        boolean zFind2 = c12164Matcher.find(5121);
        m12408(c12164Matcher, zFind2, interfaceC17066, z);
        return zFind2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12408(C12164 c12164, boolean z, InterfaceC17066 interfaceC17066, boolean z2) throws IOException {
        m12409(interfaceC17066, z2);
        if (!z2 || z) {
            return;
        }
        if (c12164.m29603() || c12164.m29613()) {
            throw new IOException("Regex matching did not complete.");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12409(InterfaceC17066 interfaceC17066, boolean z) throws InterruptedIOException {
        if (z && interfaceC17066.mo1526()) {
            throw new InterruptedIOException("Content search canceled.");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12407() throws IOException {
        if (!this.f13097) {
            return;
        }
        int i = this.f13095;
        int i2 = this.f13094;
        int i3 = i - i2;
        char[] cArr = this.f13096;
        if (i3 > 0) {
            System.arraycopy(cArr, i2, cArr, 0, i3);
        }
        this.f13094 = 0;
        this.f13095 = i3;
        while (true) {
            int length = cArr.length;
            int i4 = this.f13095;
            int i5 = length - i4;
            if (i5 == 0) {
                return;
            }
            InputStreamReader inputStreamReader = this.f13093;
            int i6 = inputStreamReader.read(cArr, i4, i5);
            if (i6 == -1) {
                inputStreamReader.close();
                this.f13097 = false;
                return;
            }
            this.f13095 += i6;
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return Math.min(this.f13095 - this.f13094, 524288);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException();
        }
        return this.f13096[i + this.f13094];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i2 < i || i2 > length()) {
            throw new IndexOutOfBoundsException();
        }
        return new String(this.f13096, this.f13094 + i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f13096, this.f13094, length());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f13097) {
            this.f13093.close();
            this.f13097 = false;
        }
    }
}
