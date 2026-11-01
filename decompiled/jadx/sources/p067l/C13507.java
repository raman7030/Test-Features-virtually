package p067l;

/* JADX INFO: renamed from: l.ۨ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0APD */
/* JADX INFO: loaded from: classes3.dex */
public final class C13507 implements CharSequence {

    /* JADX INFO: renamed from: ᩸ */
    public final CharSequence f37978;

    public C13507(CharSequence charSequence) {
        this.f37978 = charSequence;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f37978.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return Character.toLowerCase(this.f37978.charAt(i));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C13507(this.f37978.subSequence(i, i2));
    }
}
