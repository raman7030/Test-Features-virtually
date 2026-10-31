package l;

/* JADX INFO: renamed from: l.ۡ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAH0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9207 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f27892;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C9207 f27891 = new C9207("tableDirectory");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C9207 f27889 = new C9207("name");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C9207 f27890 = new C9207("OS/2");

    public C9207(String str) {
        this.f27892 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9207 m23651(String str) {
        return new C9207(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9207) {
            return this.f27892.equals(((C9207) obj).f27892);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27892.hashCode();
    }

    public final String toString() {
        return this.f27892;
    }
}
