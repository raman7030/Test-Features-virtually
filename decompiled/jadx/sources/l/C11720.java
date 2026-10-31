package l;

/* JADX INFO: renamed from: l.ۨ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0APD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11720 implements CharSequence {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f34978;

    public C11720(CharSequence charSequence) {
        this.f34978 = charSequence;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f34978.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return Character.toLowerCase(this.f34978.charAt(i));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C11720(this.f34978.subSequence(i, i2));
    }
}
