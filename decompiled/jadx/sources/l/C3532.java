package l;

import java.io.IOException;
import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.ۗ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8OA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3532 implements Appendable, CharSequence, AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f11213;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f11214;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f11215;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C21605 f11216;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public char[] f11217;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public StringBuilder f11218 = new StringBuilder();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f11219;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7060 f11220;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1143 f11221;

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) throws Throwable {
        append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    public C3532(InterfaceC20758 interfaceC20758, C1143 c1143, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative output threshold");
        }
        C11003.requireNonNull(interfaceC20758);
        this.f11213 = interfaceC20758;
        C11003.requireNonNull(c1143);
        this.f11221 = c1143;
        this.f11215 = i;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException();
        }
        StringBuilder sb = this.f11218;
        if (sb != null) {
            return sb.charAt(i);
        }
        int iM19040 = this.f11220.m19040();
        return i < iM19040 ? this.f11220.m19037(i) : this.f11217[i - iM19040];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C13130(i, i2, this);
    }

    @Override // java.lang.Appendable
    public final void append(char c) throws Throwable {
        int length = length();
        if (length == Integer.MAX_VALUE) {
            throw new IllegalStateException("Output is too large");
        }
        StringBuilder sb = this.f11218;
        if (sb != null && length < this.f11215) {
            sb.append(c);
            return;
        }
        m10727();
        if (this.f11214 == this.f11217.length) {
            flush();
        }
        char[] cArr = this.f11217;
        int i = this.f11214;
        this.f11214 = i + 1;
        cArr[i] = c;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final void append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        C11999.m29337(i, i2, charSequence.length());
        int i3 = i2 - i;
        if (i3 > Integer.MAX_VALUE - length()) {
            throw new IllegalStateException("Output is too large");
        }
        StringBuilder sb = this.f11218;
        if (sb != null && i3 <= this.f11215 - sb.length()) {
            this.f11218.append(charSequence, i, i2);
            return;
        }
        m10727();
        while (i < i2) {
            if (this.f11214 == this.f11217.length) {
                flush();
            }
            int iMin = Math.min(i2 - i, this.f11217.length - this.f11214);
            if (charSequence instanceof C13409) {
                ((C13409) charSequence).getChars(i, i + iMin, this.f11217, this.f11214);
            } else if (charSequence instanceof String) {
                ((String) charSequence).getChars(i, i + iMin, this.f11217, this.f11214);
            } else {
                for (int i4 = 0; i4 < iMin; i4++) {
                    this.f11217[this.f11214 + i4] = charSequence.charAt(i + i4);
                }
            }
            this.f11214 += iMin;
            i += iMin;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10728(int i) {
        if (i < 0 || i > length()) {
            throw new IndexOutOfBoundsException();
        }
        StringBuilder sb = this.f11218;
        if (sb != null) {
            sb.setLength(i);
        } else {
            if (i >= this.f11220.m19040()) {
                this.f11214 = i - this.f11220.m19040();
                return;
            }
            this.f11220.m19041(i);
            this.f11220.m19042();
            this.f11214 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10727() throws Throwable {
        InterfaceC20758 interfaceC20758 = this.f11213;
        if (this.f11218 == null) {
            return;
        }
        try {
            C17229.createDirectories(interfaceC20758, new InterfaceC22168[0]);
            InterfaceC20758 interfaceC20758CreateTempFile = C17229.createTempFile(interfaceC20758, "format-", ".pages", new InterfaceC22168[0]);
            try {
                C4943 c4943 = new C4943(interfaceC20758CreateTempFile);
                try {
                    C21605 c21605M48783 = C21605.m48783(c4943, this.f11221);
                    this.f11216 = c21605M48783;
                    this.f11220 = new C7060(c21605M48783);
                    this.f11217 = new char[2048];
                    CharSequence charSequence = this.f11218;
                    this.f11218 = null;
                    if (charSequence == null) {
                        charSequence = "null";
                    }
                    append(charSequence, 0, charSequence.length());
                } catch (IOException | Error | RuntimeException e) {
                    try {
                        c4943.close();
                    } catch (IOException e2) {
                        e.addSuppressed(e2);
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
                C17229.deleteIfExists(interfaceC20758CreateTempFile);
                throw e;
            } catch (Error e4) {
                e = e4;
                C17229.deleteIfExists(interfaceC20758CreateTempFile);
                throw e;
            } catch (RuntimeException e5) {
                e = e5;
                C17229.deleteIfExists(interfaceC20758CreateTempFile);
                throw e;
            }
        } catch (IOException e6) {
            throw new UncheckedIOException(e6);
        }
    }

    private void flush() {
        int i = this.f11214;
        if (i == 0) {
            return;
        }
        this.f11220.m19039(this.f11217, i);
        this.f11220.m19042();
        this.f11214 = 0;
    }

    public final C13409 finish() {
        if (!this.f11219) {
            if (this.f11218 != null) {
                this.f11220 = new C7060(null);
                this.f11217 = new char[2048];
                CharSequence charSequence = this.f11218;
                this.f11218 = null;
                if (charSequence == null) {
                    charSequence = "null";
                }
                append(charSequence, 0, charSequence.length());
            }
            flush();
            C13409 c13409 = new C13409(this.f11220.m19038());
            close();
            return c13409;
        }
        throw new IllegalStateException("Text output is closed");
    }

    @Override // java.lang.CharSequence
    public final int length() {
        if (!this.f11219) {
            StringBuilder sb = this.f11218;
            return sb != null ? sb.length() : this.f11220.m19040() + this.f11214;
        }
        throw new IllegalStateException("Text output is closed");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f11219) {
            return;
        }
        this.f11219 = true;
        this.f11218 = null;
        this.f11217 = null;
        this.f11220 = null;
        C21605 c21605 = this.f11216;
        if (c21605 != null) {
            c21605.close();
        }
    }
}
