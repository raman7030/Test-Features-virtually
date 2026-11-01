package p067l;

import java.io.Writer;

/* JADX INFO: renamed from: l.ᩴܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes4.dex */
public final class C20327 extends Writer {

    /* JADX INFO: renamed from: ᩸ */
    public final StringBuilder f62790;

    /* JADX INFO: renamed from: ᩹ */
    public final C6245 f62791 = new C6245();

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public C20327(StringBuilder sb) {
        this.f62790 = sb;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        C6245 c6245 = this.f62791;
        c6245.m14179(cArr);
        this.f62790.append((CharSequence) c6245, i, i2 + i);
    }

    @Override // java.io.Writer
    public final void write(int i) {
        this.f62790.append((char) i);
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        C12826.requireNonNull(str);
        this.f62790.append((CharSequence) str, i, i2 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f62790.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.f62790.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.f62790.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.f62790.append(charSequence, i, i2);
        return this;
    }
}
