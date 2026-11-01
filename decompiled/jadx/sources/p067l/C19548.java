package p067l;

/* JADX INFO: renamed from: l.ᩳ۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5I2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19548 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f59507;

    /* JADX INFO: renamed from: ۧ */
    public final C13929 f59508;

    public C19548(C13259 c13259, boolean z) {
        this.f59508 = c13259.matcher("");
        this.f59507 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m44389(String str) {
        C13929 c13929 = this.f59508;
        c13929.m56473reset((CharSequence) str);
        return this.f59507 ? c13929.matches() : c13929.find();
    }
}
