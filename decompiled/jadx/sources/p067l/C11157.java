package p067l;

import java.math.RoundingMode;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: renamed from: l.ۢ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08QK */
/* JADX INFO: loaded from: classes3.dex */
public final class C11157 {

    /* JADX INFO: renamed from: ֫ */
    public long f30964;

    /* JADX INFO: renamed from: ۧ */
    public long f30965;

    /* JADX INFO: renamed from: ܽ */
    public final ThreadLocal f30966 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩳ */
    public long f30967;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized long m25731() {
        long j;
        j = this.f30964;
        if (j == C14849.FOREVER_NS || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized long m25732(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!m25739()) {
            long jLongValue = this.f30964;
            if (jLongValue == 9223372036854775806L) {
                Long l2 = (Long) this.f30966.get();
                l2.getClass();
                jLongValue = l2.longValue();
            }
            this.f30967 = jLongValue - j;
            notifyAll();
        }
        this.f30965 = j;
        return j + this.f30967;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m25733(long j, boolean z) {
        C23877.m52960(this.f30964 == 9223372036854775806L);
        if (m25739()) {
            return;
        }
        if (z) {
            this.f30966.set(Long.valueOf(j));
        } else {
            while (!m25739()) {
                wait();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized long m25734() {
        long j;
        j = this.f30965;
        return j != -9223372036854775807L ? j + this.f30967 : m25731();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0049 A[PHI: r12
      0x0049: PHI (r12v2 long) = (r12v0 long), (r12v6 long) binds: [B:9:0x0011, B:11:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ */
    public final synchronized long m25735(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f30965;
        if (j3 != -9223372036854775807L) {
            String str = C5792.f14228;
            long jM12993 = C5792.m12993(j3, 90000L, 1000000L, RoundingMode.DOWN);
            long j4 = (Blake2xsDigest.MAX_NUMBER_BLOCKS + jM12993) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - jM12993) < Math.abs(j - jM12993)) {
                j2 = j5;
            } else {
                j2 = j;
            }
        } else {
            j2 = j;
        }
        String str2 = C5792.f14228;
        return m25732(C5792.m12993(j2, 1000000L, 90000L, RoundingMode.DOWN));
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized long m25736() {
        return this.f30967;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a A[PHI: r12
      0x003a: PHI (r12v2 long) = (r12v0 long), (r12v6 long) binds: [B:9:0x0011, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܽ */
    public final synchronized long m25737(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f30965;
        if (j3 != -9223372036854775807L) {
            String str = C5792.f14228;
            long jM12993 = C5792.m12993(j3, 90000L, 1000000L, RoundingMode.DOWN);
            long j4 = jM12993 / 8589934592L;
            Long.signum(j4);
            long j5 = (j4 * 8589934592L) + j;
            j += (j4 + 1) * 8589934592L;
            if (j5 >= jM12993) {
                j2 = j5;
            } else {
                j2 = j;
            }
        } else {
            j2 = j;
        }
        String str2 = C5792.f14228;
        return m25732(C5792.m12993(j2, 1000000L, 90000L, RoundingMode.DOWN));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized void m25738(long j) {
        this.f30964 = j;
        this.f30967 = j == C14849.FOREVER_NS ? 0L : -9223372036854775807L;
        this.f30965 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized boolean m25739() {
        return this.f30967 != -9223372036854775807L;
    }

    public C11157(long j) {
        m25738(j);
    }
}
