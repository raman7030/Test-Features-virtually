package l;

/* JADX INFO: renamed from: l.ᩳ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18306 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f56912;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f56913;

    public C18306(String str, int i) {
        this.f56913 = str;
        this.f56912 = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && C18306.class == obj.getClass()) {
            C18306 c18306 = (C18306) obj;
            if (this.f56912 == c18306.f56912 && this.f56913.equals(c18306.f56913)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f56913.hashCode() * 31) + this.f56912;
    }
}
