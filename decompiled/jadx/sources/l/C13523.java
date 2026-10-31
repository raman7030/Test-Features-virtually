package l;

/* JADX INFO: renamed from: l.ܰۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9Q3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13523 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17757 f40339;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f40340;

    public C13523(C17757 c17757, int i) {
        this.f40339 = c17757;
        this.f40340 = i;
    }

    public final int hashCode() {
        return (this.f40339.hashCode() * 65535) + this.f40340;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13523)) {
            return false;
        }
        C13523 c13523 = (C13523) obj;
        return this.f40339 == c13523.f40339 && this.f40340 == c13523.f40340;
    }
}
