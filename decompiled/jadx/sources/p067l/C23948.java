package p067l;

import java.io.Writer;

/* JADX INFO: renamed from: l.᩺ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q2RQ */
/* JADX INFO: loaded from: classes.dex */
public class C23948 extends Writer {

    /* JADX INFO: renamed from: ᩸ */
    public final C13220 f76077;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public C23948() {
        this.f76077 = new C13220();
    }

    public C23948(int i) {
        this.f76077 = new C13220(i);
    }

    public C23948(C13220 c13220) {
        this.f76077 = c13220;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        this.f76077.append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f76077.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        this.f76077.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public void write(int i) {
        this.f76077.append((char) i);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.f76077.m30227(cArr);
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        this.f76077.append((CharSequence) str, i, i2 + i);
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f76077.m30230(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.f76077.m30228(cArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13220 m53043() {
        return this.f76077;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m53044() {
        this.f76077.m30229(0);
    }

    public final String toString() {
        return this.f76077.toString();
    }
}
