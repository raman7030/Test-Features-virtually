package l;

/* JADX INFO: renamed from: l.ܽ֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 87S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16300 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence f50140;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19954 f50141;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16300 m38334(CharSequence charSequence, C19954 c19954) {
        return new C16300(charSequence, c19954);
    }

    public C16300(CharSequence charSequence, C19954 c19954) {
        C11003.requireNonNull(charSequence, "content must not be null");
        this.f50140 = charSequence;
        this.f50141 = c19954;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m38335() {
        return this.f50140;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19954 m38337() {
        return this.f50141;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16300 m38336(int i, int i2) {
        int i3;
        CharSequence charSequenceSubSequence = this.f50140.subSequence(i, i2);
        C19954 c19954 = this.f50141;
        return new C16300(charSequenceSubSequence, (c19954 == null || (i3 = i2 - i) == 0) ? null : C19954.m46022(c19954.m46028(), c19954.m46023() + i, c19954.m46026() + i, i3));
    }
}
