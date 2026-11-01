package p067l;

/* JADX INFO: renamed from: l.ᩴ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6MK */
/* JADX INFO: loaded from: classes4.dex */
public final class C20438 implements Appendable, CharSequence, AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public final C5726 f63137;

    /* JADX INFO: renamed from: ᩸ */
    public final C3455 f63138;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC22097 f63139;

    public C20438(InterfaceC22097 interfaceC22097, C3455 c3455) {
        this.f63139 = interfaceC22097;
        this.f63138 = c3455;
        this.f63137 = new C5726(interfaceC22097, c3455, 524288);
    }

    @Override // java.lang.Appendable
    public final C20438 append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m46122(0, charSequence.length(), charSequence);
        return this;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C14847(i, i2, this);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f63137.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f63137.charAt(i);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws Throwable {
        this.f63137.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final C20438 append(char c) throws Throwable {
        this.f63137.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.f63137.append(charSequence, i, i2);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20438 m46122(int i, int i2, CharSequence charSequence) {
        this.f63137.append(charSequence, i, i2);
        return this;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46123(int i) {
        this.f63137.m12724(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20438 m46121() {
        return new C20438(this.f63139, this.f63138);
    }

    public final C15113 finish() {
        return this.f63137.finish();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f63137.close();
    }
}
