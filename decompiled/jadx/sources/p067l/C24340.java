package p067l;

/* JADX INFO: renamed from: l.᩺ܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7S3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24340 implements CharSequence {

    /* JADX INFO: renamed from: ᩸ */
    public final int f77104;

    /* JADX INFO: renamed from: ᩹ */
    public final CharSequence f77105;

    public C24340(int i, CharSequence charSequence) {
        this.f77105 = charSequence;
        this.f77104 = Math.min(charSequence.length(), i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f77104;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f77104;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C19768.m44907("Index: ", i, i2, ", Length: "));
        }
        return this.f77105.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f77104;
        if (i >= 0 && i2 >= 0 && i <= i2 && i2 <= i3) {
            return this.f77105.subSequence(i, i2);
        }
        StringBuilder sbM49005 = C21720.m49005("start: ", i, ", end: ", ", length: ", i2);
        sbM49005.append(i3);
        throw new IndexOutOfBoundsException(sbM49005.toString());
    }
}
