package l;

/* JADX INFO: renamed from: l.ۡۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8LY */
/* JADX INFO: loaded from: classes3.dex */
public final class C8799 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C8799 f26802 = new C8799(0, 0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f26803;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f26804;

    public C8799(long j, long j2) {
        this.f26804 = j;
        this.f26803 = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f26804);
        sb.append(", position=");
        return C15942.m37718(sb, this.f26803, "]");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8799.class == obj.getClass()) {
            C8799 c8799 = (C8799) obj;
            if (this.f26804 == c8799.f26804 && this.f26803 == c8799.f26803) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f26804) * 31) + ((int) this.f26803);
    }
}
