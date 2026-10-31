package l;

/* JADX INFO: renamed from: l.᩺ۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P708 */
/* JADX INFO: loaded from: classes.dex */
public final class C22913 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C22913 f73850;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15068 f73851;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23097 f73852;

    static {
        EnumC11625 enumC11625 = EnumC11625.TEXT;
        f73850 = new C22913(null, null);
    }

    public C22913(C15068 c15068, C23097 c23097) {
        this.f73851 = c15068;
        this.f73852 = c23097;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22913 m50999(C15068 c15068) {
        C23097 c23097M51264;
        if (c15068 == null) {
            c23097M51264 = null;
        } else {
            try {
                c23097M51264 = C23097.m51264(c15068);
            } catch (RuntimeException unused) {
                return f73850;
            }
        }
        if (c15068 != null) {
            c15068.m35651(C4900.f15473);
        }
        EnumC11625 enumC11625 = EnumC11625.TEXT;
        return new C22913(c15068, c23097M51264);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15068 m51000() {
        return this.f73851;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23097 m51001() {
        return this.f73852;
    }
}
