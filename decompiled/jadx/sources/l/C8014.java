package l;

/* JADX INFO: renamed from: l.۠ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4TV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8014 implements InterfaceC21129 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12164 f24742;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11459 f24743;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21834 f24744;

    public C8014(C11459 c11459, C21834 c21834) {
        this.f24743 = c11459;
        this.f24742 = c11459.matcher("");
        this.f24744 = c21834;
    }

    @Override // l.InterfaceC21129
    /* JADX INFO: renamed from: ֫ */
    public final C21834 mo18558(int i, int i2, CharSequence charSequence) {
        C12164 c12164 = this.f24742;
        try {
            c12164.m29615reset(charSequence);
            c12164.m29614region(i, i2);
            if (c12164.matches()) {
                return this.f24744;
            }
            return null;
        } finally {
            c12164.m29615reset((CharSequence) "");
        }
    }
}
