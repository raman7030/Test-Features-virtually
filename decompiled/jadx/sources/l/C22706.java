package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.᩺ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q2RQ */
/* JADX INFO: loaded from: classes.dex */
public class C22706 extends Writer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11418 f73352;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public C22706() {
        this.f73352 = new C11418();
    }

    public C22706(int i) {
        this.f73352 = new C11418(i);
    }

    public C22706(C11418 c11418) {
        this.f73352 = c11418;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        this.f73352.append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f73352.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        this.f73352.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public void write(int i) {
        this.f73352.append((char) i);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.f73352.m28183(cArr);
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        this.f73352.append((CharSequence) str, i, i2 + i);
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f73352.m28186(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.f73352.m28184(cArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11418 m50717() {
        return this.f73352;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50718() {
        this.f73352.m28185(0);
    }

    public final String toString() {
        return this.f73352.toString();
    }
}
