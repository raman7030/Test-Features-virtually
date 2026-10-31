package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.ᩴܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes4.dex */
public final class C18896 extends Writer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final StringBuilder f59560;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4079 f59561 = new C4079();

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public C18896(StringBuilder sb) {
        this.f59560 = sb;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        C4079 c4079 = this.f59561;
        c4079.m12274(cArr);
        this.f59560.append((CharSequence) c4079, i, i2 + i);
    }

    @Override // java.io.Writer
    public final void write(int i) {
        this.f59560.append((char) i);
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        C11003.requireNonNull(str);
        this.f59560.append((CharSequence) str, i, i2 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f59560.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.f59560.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.f59560.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.f59560.append(charSequence, i, i2);
        return this;
    }
}
