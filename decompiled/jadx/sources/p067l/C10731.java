package p067l;

/* JADX INFO: renamed from: l.ۡۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8LY */
/* JADX INFO: loaded from: classes3.dex */
public final class C10731 {

    /* JADX INFO: renamed from: ܽ */
    public static final C10731 f29727 = new C10731(0, 0);

    /* JADX INFO: renamed from: ֫ */
    public final long f29728;

    /* JADX INFO: renamed from: ۧ */
    public final long f29729;

    public C10731(long j, long j2) {
        this.f29729 = j;
        this.f29728 = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f29729);
        sb.append(", position=");
        return C17520.m39893(sb, this.f29728, "]");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10731.class == obj.getClass()) {
            C10731 c10731 = (C10731) obj;
            if (this.f29729 == c10731.f29729 && this.f29728 == c10731.f29728) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f29729) * 31) + ((int) this.f29728);
    }
}
