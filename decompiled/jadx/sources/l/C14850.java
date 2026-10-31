package l;

/* JADX INFO: renamed from: l.ܳ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1LA */
/* JADX INFO: loaded from: classes4.dex */
public final class C14850 implements CharSequence {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f45288;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CharSequence f45289;

    public C14850(CharSequence charSequence, CharSequence charSequence2) {
        this.f45288 = charSequence;
        this.f45289 = charSequence2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f45289.length() + this.f45288.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        CharSequence charSequence = this.f45288;
        if (i < charSequence.length()) {
            return charSequence.charAt(i);
        }
        return this.f45289.charAt(i - charSequence.length());
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i == 0 && i2 == length()) {
            return this;
        }
        CharSequence charSequence = this.f45288;
        if (i < charSequence.length() && i2 < charSequence.length()) {
            return charSequence.subSequence(i, i2);
        }
        int length = charSequence.length();
        CharSequence charSequence2 = this.f45289;
        if (i >= length && i2 >= charSequence.length()) {
            return charSequence2.subSequence(i - charSequence.length(), i2 - charSequence.length());
        }
        return new C14850(charSequence.subSequence(i, charSequence.length()), charSequence2.subSequence(0, i2 - charSequence.length()));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return ((Object) this.f45288) + this.f45289.toString();
    }
}
