package p067l;

import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: renamed from: l.ܽܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q2RQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18271 extends Writer implements Serializable {
    public static final long serialVersionUID = -146927496096066153L;

    /* JADX INFO: renamed from: ᩸ */
    public final StringBuilder f54552;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public C18271() {
        this.f54552 = new StringBuilder();
    }

    public C18271(StringBuilder sb) {
        this.f54552 = sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        this.f54552.append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        this.f54552.append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f54552.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.f54552.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.f54552.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.f54552.append(charSequence, i, i2);
        return this;
    }

    public final String toString() {
        return this.f54552.toString();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.f54552.append(cArr, i, i2);
        }
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str != null) {
            this.f54552.append(str);
        }
    }
}
