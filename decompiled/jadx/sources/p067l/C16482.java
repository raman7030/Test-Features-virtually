package p067l;

/* JADX INFO: renamed from: l.ܳ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1LA */
/* JADX INFO: loaded from: classes4.dex */
public final class C16482 implements CharSequence {

    /* JADX INFO: renamed from: ᩸ */
    public final CharSequence f48404;

    /* JADX INFO: renamed from: ᩹ */
    public final CharSequence f48405;

    public C16482(CharSequence charSequence, CharSequence charSequence2) {
        this.f48404 = charSequence;
        this.f48405 = charSequence2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f48405.length() + this.f48404.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        CharSequence charSequence = this.f48404;
        if (i < charSequence.length()) {
            return charSequence.charAt(i);
        }
        return this.f48405.charAt(i - charSequence.length());
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i == 0 && i2 == length()) {
            return this;
        }
        CharSequence charSequence = this.f48404;
        if (i < charSequence.length() && i2 < charSequence.length()) {
            return charSequence.subSequence(i, i2);
        }
        int length = charSequence.length();
        CharSequence charSequence2 = this.f48405;
        if (i >= length && i2 >= charSequence.length()) {
            return charSequence2.subSequence(i - charSequence.length(), i2 - charSequence.length());
        }
        return new C16482(charSequence.subSequence(i, charSequence.length()), charSequence2.subSequence(0, i2 - charSequence.length()));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return ((Object) this.f48404) + this.f48405.toString();
    }
}
