package l;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩺۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9CH */
/* JADX INFO: loaded from: classes.dex */
public final class C22984 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f74005;

    public C22984(long j) {
        this.f74005 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m51132() {
        return this.f74005;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m51133() {
        return TimeUnit.MILLISECONDS.convert((this.f74005 - 116444736000000000L) * 100, TimeUnit.NANOSECONDS);
    }

    public final String toString() {
        return new Date(m51133()).toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C22984.class == obj.getClass() && this.f74005 == ((C22984) obj).f74005;
    }

    public final int hashCode() {
        long j = this.f74005;
        return (int) (j ^ (j >>> 32));
    }
}
