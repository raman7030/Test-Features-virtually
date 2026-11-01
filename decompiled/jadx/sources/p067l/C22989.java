package p067l;

/* JADX INFO: renamed from: l.᩸ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1968 */
/* JADX INFO: loaded from: classes.dex */
public final class C22989 {

    /* JADX INFO: renamed from: ֫ */
    public final String f72290;

    /* JADX INFO: renamed from: ۧ */
    public final String f72291;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f72292;

    /* JADX INFO: renamed from: ᩳ */
    public static final C22989 f72289 = new C22989("", "", false);

    /* JADX INFO: renamed from: ܿ */
    public static final C22989 f72288 = new C22989("\n", EnumC2483.f3919, true);

    public C22989(String str, String str2, boolean z) {
        C12826.requireNonNull(str, "newline == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f72291 = str;
        this.f72290 = str2;
        this.f72292 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22989 m51321(String str) {
        return new C22989(this.f72291, str, this.f72292);
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m51322() {
        return this.f72291;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m51320() {
        return this.f72290;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m51323() {
        return this.f72292;
    }
}
