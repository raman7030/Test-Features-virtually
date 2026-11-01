package p067l;

/* JADX INFO: renamed from: l.ܽ֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 87S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17859 {

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence f53307;

    /* JADX INFO: renamed from: ۧ */
    public final C21332 f53308;

    /* JADX INFO: renamed from: ֫ */
    public static C17859 m40549(CharSequence charSequence, C21332 c21332) {
        return new C17859(charSequence, c21332);
    }

    public C17859(CharSequence charSequence, C21332 c21332) {
        C12826.requireNonNull(charSequence, "content must not be null");
        this.f53307 = charSequence;
        this.f53308 = c21332;
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence m40550() {
        return this.f53307;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C21332 m40552() {
        return this.f53308;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17859 m40551(int i, int i2) {
        int i3;
        CharSequence charSequenceSubSequence = this.f53307.subSequence(i, i2);
        C21332 c21332 = this.f53308;
        return new C17859(charSequenceSubSequence, (c21332 == null || (i3 = i2 - i) == 0) ? null : C21332.m48336(c21332.m48342(), c21332.m48337() + i, c21332.m48340() + i, i3));
    }
}
