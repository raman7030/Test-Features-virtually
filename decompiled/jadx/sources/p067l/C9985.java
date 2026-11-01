package p067l;

/* JADX INFO: renamed from: l.۠ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4TV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9985 implements InterfaceC22450 {

    /* JADX INFO: renamed from: ֫ */
    public final C13929 f27656;

    /* JADX INFO: renamed from: ۧ */
    public final C13259 f27657;

    /* JADX INFO: renamed from: ܽ */
    public final C23120 f27658;

    public C9985(C13259 c13259, C23120 c23120) {
        this.f27657 = c13259;
        this.f27656 = c13259.matcher("");
        this.f27658 = c23120;
    }

    @Override // p067l.InterfaceC22450
    /* JADX INFO: renamed from: ֫ */
    public final C23120 mo20507(int i, int i2, CharSequence charSequence) {
        C13929 c13929 = this.f27656;
        try {
            c13929.m56473reset(charSequence);
            c13929.m56472region(i, i2);
            if (c13929.matches()) {
                return this.f27658;
            }
            return null;
        } finally {
            c13929.m56473reset((CharSequence) "");
        }
    }
}
