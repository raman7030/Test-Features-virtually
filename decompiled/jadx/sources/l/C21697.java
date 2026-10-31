package l;

/* JADX INFO: renamed from: l.᩸ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1968 */
/* JADX INFO: loaded from: classes.dex */
public final class C21697 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f69585;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f69586;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f69587;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C21697 f69584 = new C21697("", "", false);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C21697 f69583 = new C21697("\n", EnumC0121.f1143, true);

    public C21697(String str, String str2, boolean z) {
        C11003.requireNonNull(str, "newline == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f69586 = str;
        this.f69585 = str2;
        this.f69587 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21697 m48972(String str) {
        return new C21697(this.f69586, str, this.f69587);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m48973() {
        return this.f69586;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m48971() {
        return this.f69585;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m48974() {
        return this.f69587;
    }
}
