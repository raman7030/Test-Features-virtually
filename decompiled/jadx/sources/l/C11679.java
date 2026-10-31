package l;

/* JADX INFO: renamed from: l.ۨۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66M9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11679 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f34802;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f34803;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f34804;

    public C11679(String str, long j, long j2) {
        C11003.requireNonNull(str);
        this.f34802 = str;
        if (j < -1) {
            throw new IllegalArgumentException("Invalid source size");
        }
        this.f34804 = j;
        this.f34803 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11679)) {
            return false;
        }
        C11679 c11679 = (C11679) obj;
        return this.f34804 == c11679.f34804 && this.f34803 == c11679.f34803 && this.f34802.equals(c11679.f34802);
    }

    public final int hashCode() {
        return C11003.hash(this.f34802, Long.valueOf(this.f34804), Long.valueOf(this.f34803));
    }
}
