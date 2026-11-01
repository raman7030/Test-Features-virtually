package p067l;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩺۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9CH */
/* JADX INFO: loaded from: classes.dex */
public final class C24212 {

    /* JADX INFO: renamed from: ֫ */
    public final long f76740;

    public C24212(long j) {
        this.f76740 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m53525() {
        return this.f76740;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m53526() {
        return TimeUnit.MILLISECONDS.convert((this.f76740 - 116444736000000000L) * 100, TimeUnit.NANOSECONDS);
    }

    public final String toString() {
        return new Date(m53526()).toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C24212.class == obj.getClass() && this.f76740 == ((C24212) obj).f76740;
    }

    public final int hashCode() {
        long j = this.f76740;
        return (int) (j ^ (j >>> 32));
    }
}
