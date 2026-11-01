package p067l;

import java.io.IOException;
import java.p066io.UncheckedIOException;

/* JADX INFO: renamed from: l.ۗ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8OA */
/* JADX INFO: loaded from: classes2.dex */
public final class C5726 implements Appendable, CharSequence, AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC22097 f14019;

    /* JADX INFO: renamed from: ۙ */
    public int f14020;

    /* JADX INFO: renamed from: ۛ */
    public final int f14021;

    /* JADX INFO: renamed from: ۤ */
    public C22902 f14022;

    /* JADX INFO: renamed from: ۫ */
    public char[] f14023;

    /* JADX INFO: renamed from: ۬ */
    public StringBuilder f14024 = new StringBuilder();

    /* JADX INFO: renamed from: ᩶ */
    public boolean f14025;

    /* JADX INFO: renamed from: ᩸ */
    public C9079 f14026;

    /* JADX INFO: renamed from: ᩹ */
    public final C3455 f14027;

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

    public C5726(InterfaceC22097 interfaceC22097, C3455 c3455, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative output threshold");
        }
        C12826.requireNonNull(interfaceC22097);
        this.f14019 = interfaceC22097;
        C12826.requireNonNull(c3455);
        this.f14027 = c3455;
        this.f14021 = i;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException();
        }
        StringBuilder sb = this.f14024;
        if (sb != null) {
            return sb.charAt(i);
        }
        int iM20997 = this.f14026.m20997();
        return i < iM20997 ? this.f14026.m20994(i) : this.f14023[i - iM20997];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C14847(i, i2, this);
    }

    @Override // java.lang.Appendable
    public final void append(char c) throws Throwable {
        int length = length();
        if (length == Integer.MAX_VALUE) {
            throw new IllegalStateException("Output is too large");
        }
        StringBuilder sb = this.f14024;
        if (sb != null && length < this.f14021) {
            sb.append(c);
            return;
        }
        m12723();
        if (this.f14020 == this.f14023.length) {
            flush();
        }
        char[] cArr = this.f14023;
        int i = this.f14020;
        this.f14020 = i + 1;
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
        C13773.m31392(i, i2, charSequence.length());
        int i3 = i2 - i;
        if (i3 > Integer.MAX_VALUE - length()) {
            throw new IllegalStateException("Output is too large");
        }
        StringBuilder sb = this.f14024;
        if (sb != null && i3 <= this.f14021 - sb.length()) {
            this.f14024.append(charSequence, i, i2);
            return;
        }
        m12723();
        while (i < i2) {
            if (this.f14020 == this.f14023.length) {
                flush();
            }
            int iMin = Math.min(i2 - i, this.f14023.length - this.f14020);
            if (charSequence instanceof C15113) {
                ((C15113) charSequence).getChars(i, i + iMin, this.f14023, this.f14020);
            } else if (charSequence instanceof String) {
                ((String) charSequence).getChars(i, i + iMin, this.f14023, this.f14020);
            } else {
                for (int i4 = 0; i4 < iMin; i4++) {
                    this.f14023[this.f14020 + i4] = charSequence.charAt(i + i4);
                }
            }
            this.f14020 += iMin;
            i += iMin;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12724(int i) {
        if (i < 0 || i > length()) {
            throw new IndexOutOfBoundsException();
        }
        StringBuilder sb = this.f14024;
        if (sb != null) {
            sb.setLength(i);
        } else {
            if (i >= this.f14026.m20997()) {
                this.f14020 = i - this.f14026.m20997();
                return;
            }
            this.f14026.m20998(i);
            this.f14026.m20999();
            this.f14020 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m12723() throws Throwable {
        InterfaceC22097 interfaceC22097 = this.f14019;
        if (this.f14024 == null) {
            return;
        }
        try {
            C18743.createDirectories(interfaceC22097, new InterfaceC23437[0]);
            InterfaceC22097 interfaceC22097CreateTempFile = C18743.createTempFile(interfaceC22097, "format-", ".pages", new InterfaceC23437[0]);
            try {
                C7067 c7067 = new C7067(interfaceC22097CreateTempFile);
                try {
                    C22902 c22902M51130 = C22902.m51130(c7067, this.f14027);
                    this.f14022 = c22902M51130;
                    this.f14026 = new C9079(c22902M51130);
                    this.f14023 = new char[2048];
                    CharSequence charSequence = this.f14024;
                    this.f14024 = null;
                    if (charSequence == null) {
                        charSequence = "null";
                    }
                    append(charSequence, 0, charSequence.length());
                } catch (IOException | Error | RuntimeException e) {
                    try {
                        c7067.close();
                    } catch (IOException e2) {
                        e.addSuppressed(e2);
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
                C18743.deleteIfExists(interfaceC22097CreateTempFile);
                throw e;
            } catch (Error e4) {
                e = e4;
                C18743.deleteIfExists(interfaceC22097CreateTempFile);
                throw e;
            } catch (RuntimeException e5) {
                e = e5;
                C18743.deleteIfExists(interfaceC22097CreateTempFile);
                throw e;
            }
        } catch (IOException e6) {
            throw new UncheckedIOException(e6);
        }
    }

    private void flush() {
        int i = this.f14020;
        if (i == 0) {
            return;
        }
        this.f14026.m20996(this.f14023, i);
        this.f14026.m20999();
        this.f14020 = 0;
    }

    public final C15113 finish() {
        if (!this.f14025) {
            if (this.f14024 != null) {
                this.f14026 = new C9079(null);
                this.f14023 = new char[2048];
                CharSequence charSequence = this.f14024;
                this.f14024 = null;
                if (charSequence == null) {
                    charSequence = "null";
                }
                append(charSequence, 0, charSequence.length());
            }
            flush();
            C15113 c15113 = new C15113(this.f14026.m20995());
            close();
            return c15113;
        }
        throw new IllegalStateException("Text output is closed");
    }

    @Override // java.lang.CharSequence
    public final int length() {
        if (!this.f14025) {
            StringBuilder sb = this.f14024;
            return sb != null ? sb.length() : this.f14026.m20997() + this.f14020;
        }
        throw new IllegalStateException("Text output is closed");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f14025) {
            return;
        }
        this.f14025 = true;
        this.f14024 = null;
        this.f14023 = null;
        this.f14026 = null;
        C22902 c22902 = this.f14022;
        if (c22902 != null) {
            c22902.close();
        }
    }
}
