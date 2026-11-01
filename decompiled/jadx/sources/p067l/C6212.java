package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۘܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8LL */
/* JADX INFO: loaded from: classes2.dex */
public final class C6212 {

    /* JADX INFO: renamed from: ֫ */
    public final long f15643;

    /* JADX INFO: renamed from: ۧ */
    public final int f15644;

    /* JADX INFO: renamed from: ܽ */
    public final long f15645;

    public C6212(long j, int i, long j2) {
        C23877.m52957(j < j2);
        this.f15645 = j;
        this.f15643 = j2;
        this.f15644 = i;
    }

    public final String toString() {
        String str = C5792.f14228;
        Locale locale = Locale.US;
        StringBuilder sbM33191 = C14536.m33191("Segment: startTimeMs=", ", endTimeMs=", this.f15645);
        sbM33191.append(this.f15643);
        sbM33191.append(", speedDivisor=");
        sbM33191.append(this.f15644);
        return sbM33191.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6212.class == obj.getClass()) {
            C6212 c6212 = (C6212) obj;
            if (this.f15645 == c6212.f15645 && this.f15643 == c6212.f15643 && this.f15644 == c6212.f15644) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hash(Long.valueOf(this.f15645), Long.valueOf(this.f15643), Integer.valueOf(this.f15644));
    }
}
