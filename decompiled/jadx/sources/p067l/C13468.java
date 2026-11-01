package p067l;

/* JADX INFO: renamed from: l.ۨۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66M9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13468 {

    /* JADX INFO: renamed from: ֫ */
    public final String f37801;

    /* JADX INFO: renamed from: ۧ */
    public final long f37802;

    /* JADX INFO: renamed from: ܽ */
    public final long f37803;

    public C13468(String str, long j, long j2) {
        C12826.requireNonNull(str);
        this.f37801 = str;
        if (j < -1) {
            throw new IllegalArgumentException("Invalid source size");
        }
        this.f37803 = j;
        this.f37802 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13468)) {
            return false;
        }
        C13468 c13468 = (C13468) obj;
        return this.f37803 == c13468.f37803 && this.f37802 == c13468.f37802 && this.f37801.equals(c13468.f37801);
    }

    public final int hashCode() {
        return C12826.hash(this.f37801, Long.valueOf(this.f37803), Long.valueOf(this.f37802));
    }
}
