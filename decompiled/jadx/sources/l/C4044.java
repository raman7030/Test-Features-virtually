package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۘܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8LL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4044 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f12828;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f12829;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f12830;

    public C4044(long j, int i, long j2) {
        C22632.m50631(j < j2);
        this.f12830 = j;
        this.f12828 = j2;
        this.f12829 = i;
    }

    public final String toString() {
        String str = C3603.f11424;
        Locale locale = Locale.US;
        StringBuilder sbM31106 = C12803.m31106("Segment: startTimeMs=", ", endTimeMs=", this.f12830);
        sbM31106.append(this.f12828);
        sbM31106.append(", speedDivisor=");
        sbM31106.append(this.f12829);
        return sbM31106.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4044.class == obj.getClass()) {
            C4044 c4044 = (C4044) obj;
            if (this.f12830 == c4044.f12830 && this.f12828 == c4044.f12828 && this.f12829 == c4044.f12829) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hash(Long.valueOf(this.f12830), Long.valueOf(this.f12828), Integer.valueOf(this.f12829));
    }
}
