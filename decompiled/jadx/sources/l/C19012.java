package l;

/* JADX INFO: renamed from: l.ᩴ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6MK */
/* JADX INFO: loaded from: classes4.dex */
public final class C19012 implements Appendable, CharSequence, AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3532 f59908;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1143 f59909;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f59910;

    public C19012(InterfaceC20758 interfaceC20758, C1143 c1143) {
        this.f59910 = interfaceC20758;
        this.f59909 = c1143;
        this.f59908 = new C3532(interfaceC20758, c1143, 524288);
    }

    @Override // java.lang.Appendable
    public final C19012 append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        m43854(0, charSequence.length(), charSequence);
        return this;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C13130(i, i2, this);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f59908.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f59908.charAt(i);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws Throwable {
        this.f59908.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final C19012 append(char c) throws Throwable {
        this.f59908.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.f59908.append(charSequence, i, i2);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19012 m43854(int i, int i2, CharSequence charSequence) {
        this.f59908.append(charSequence, i, i2);
        return this;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43855(int i) {
        this.f59908.m10728(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19012 m43853() {
        return new C19012(this.f59910, this.f59909);
    }

    public final C13409 finish() {
        return this.f59908.finish();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f59908.close();
    }
}
