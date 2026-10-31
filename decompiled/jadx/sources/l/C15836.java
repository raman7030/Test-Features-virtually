package l;

/* JADX INFO: renamed from: l.ܺۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15836 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f48933;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17975 f48934;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9302 f48935;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22913 f48936;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f48937;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22707 f48938;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C7185 f48939;

    public C15836(C22913 c22913, C9302 c9302, C17975 c17975, C7185 c7185, C22707 c22707, boolean z, boolean z2) {
        C11003.requireNonNull(c22913, "definition");
        this.f48936 = c22913;
        this.f48935 = c9302;
        this.f48934 = c17975;
        this.f48939 = c7185;
        this.f48938 = c22707;
        this.f48937 = z;
        this.f48933 = z2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15836 m37485(C22913 c22913) {
        return new C15836(c22913, null, null, null, null, false, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15836 m37487(C22913 c22913, C9302 c9302, C17975 c17975, C22707 c22707) {
        return new C15836(c22913, c9302, c17975, null, c22707, true, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15836 m37486(C22913 c22913, C7185 c7185, C22707 c22707) {
        return new C15836(c22913, c7185.m19247(), null, c7185, c22707, true, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22913 m37489() {
        return this.f48936;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9302 m37493() {
        return this.f48935;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17975 m37488() {
        return this.f48934;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7185 m37492() {
        return this.f48939;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22707 m37491() {
        return this.f48938;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m37494() {
        return this.f48937;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m37490() {
        return this.f48933;
    }
}
