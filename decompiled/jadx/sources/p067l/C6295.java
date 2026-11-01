package p067l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۘᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AJN */
/* JADX INFO: loaded from: classes2.dex */
public final class C6295 implements CharSequence, Closeable {

    /* JADX INFO: renamed from: ۗ */
    public final InputStreamReader f15907;

    /* JADX INFO: renamed from: ۙ */
    public int f15908;

    /* JADX INFO: renamed from: ᩶ */
    public int f15909;

    /* JADX INFO: renamed from: ᩸ */
    public final char[] f15910 = new char[943718];

    /* JADX INFO: renamed from: ᩹ */
    public boolean f15911 = true;

    public C6295(InputStreamReader inputStreamReader) throws IOException {
        this.f15907 = inputStreamReader;
        m14297();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m14300(C13259 c13259, InterfaceC18588 interfaceC18588, boolean z) throws IOException {
        C13929 c13929Matcher = c13259.matcher((CharSequence) this);
        m14299(interfaceC18588, z);
        if (length() < 524288) {
            boolean zFind = c13929Matcher.find();
            m14298(c13929Matcher, zFind, interfaceC18588, z);
            return zFind;
        }
        for (int i = 0; i < 5120; i++) {
            boolean zM31667 = c13929Matcher.m31667(i);
            m14298(c13929Matcher, zM31667, interfaceC18588, z);
            if (zM31667) {
                return true;
            }
        }
        while (true) {
            boolean zM31668 = c13929Matcher.m31667(5120);
            m14298(c13929Matcher, zM31668, interfaceC18588, z);
            if (zM31668) {
                return true;
            }
            int i2 = this.f15909;
            int i3 = this.f15908;
            if (i2 - i3 > 524288) {
                this.f15908 = i3 + 1;
            } else {
                if (!this.f15911 || interfaceC18588.mo3924()) {
                    break;
                }
                m14297();
                int i4 = this.f15909;
                int i5 = this.f15908;
                if (i4 - i5 <= 524288) {
                    break;
                }
                this.f15908 = i5 + 1;
            }
        }
        if (interfaceC18588.mo3924()) {
            m14299(interfaceC18588, z);
            return false;
        }
        boolean zFind2 = c13929Matcher.find(5121);
        m14298(c13929Matcher, zFind2, interfaceC18588, z);
        return zFind2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14298(C13929 c13929, boolean z, InterfaceC18588 interfaceC18588, boolean z2) throws IOException {
        m14299(interfaceC18588, z2);
        if (!z2 || z) {
            return;
        }
        if (c13929.m31668() || c13929.m31678()) {
            throw new IOException("Regex matching did not complete.");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14299(InterfaceC18588 interfaceC18588, boolean z) throws InterruptedIOException {
        if (z && interfaceC18588.mo3924()) {
            throw new InterruptedIOException("Content search canceled.");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m14297() throws IOException {
        if (!this.f15911) {
            return;
        }
        int i = this.f15909;
        int i2 = this.f15908;
        int i3 = i - i2;
        char[] cArr = this.f15910;
        if (i3 > 0) {
            System.arraycopy(cArr, i2, cArr, 0, i3);
        }
        this.f15908 = 0;
        this.f15909 = i3;
        while (true) {
            int length = cArr.length;
            int i4 = this.f15909;
            int i5 = length - i4;
            if (i5 == 0) {
                return;
            }
            InputStreamReader inputStreamReader = this.f15907;
            int i6 = inputStreamReader.read(cArr, i4, i5);
            if (i6 == -1) {
                inputStreamReader.close();
                this.f15911 = false;
                return;
            }
            this.f15909 += i6;
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return Math.min(this.f15909 - this.f15908, 524288);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException();
        }
        return this.f15910[i + this.f15908];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i2 < i || i2 > length()) {
            throw new IndexOutOfBoundsException();
        }
        return new String(this.f15910, this.f15908 + i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f15910, this.f15908, length());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f15911) {
            this.f15907.close();
            this.f15911 = false;
        }
    }
}
