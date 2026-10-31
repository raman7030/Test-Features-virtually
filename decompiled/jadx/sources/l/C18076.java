package l;

/* JADX INFO: renamed from: l.ᩳ۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5I2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18076 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f56302;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12164 f56303;

    public C18076(C11459 c11459, boolean z) {
        this.f56303 = c11459.matcher("");
        this.f56302 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42137(String str) {
        C12164 c12164 = this.f56303;
        c12164.m29615reset((CharSequence) str);
        return this.f56302 ? c12164.matches() : c12164.find();
    }
}
