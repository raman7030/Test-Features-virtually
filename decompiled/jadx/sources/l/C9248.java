package l;

import java.math.RoundingMode;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: renamed from: l.ۢ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08QK */
/* JADX INFO: loaded from: classes3.dex */
public final class C9248 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f28018;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f28019;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f28020 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f28021;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized long m23730() {
        long j;
        j = this.f28018;
        if (j == C13132.FOREVER_NS || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized long m23731(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!m23738()) {
            long jLongValue = this.f28018;
            if (jLongValue == 9223372036854775806L) {
                Long l2 = (Long) this.f28020.get();
                l2.getClass();
                jLongValue = l2.longValue();
            }
            this.f28021 = jLongValue - j;
            notifyAll();
        }
        this.f28019 = j;
        return j + this.f28021;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m23732(long j, boolean z) {
        C22632.m50634(this.f28018 == 9223372036854775806L);
        if (m23738()) {
            return;
        }
        if (z) {
            this.f28020.set(Long.valueOf(j));
        } else {
            while (!m23738()) {
                wait();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized long m23733() {
        long j;
        j = this.f28019;
        return j != -9223372036854775807L ? j + this.f28021 : m23730();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0049 A[PHI: r12
      0x0049: PHI (r12v2 long) = (r12v0 long), (r12v6 long) binds: [B:9:0x0011, B:11:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized long m23734(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f28019;
        if (j3 != -9223372036854775807L) {
            String str = C3603.f11424;
            long jM11017 = C3603.m11017(j3, 90000L, 1000000L, RoundingMode.DOWN);
            long j4 = (Blake2xsDigest.MAX_NUMBER_BLOCKS + jM11017) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - jM11017) < Math.abs(j - jM11017)) {
                j2 = j5;
            } else {
                j2 = j;
            }
        } else {
            j2 = j;
        }
        String str2 = C3603.f11424;
        return m23731(C3603.m11017(j2, 1000000L, 90000L, RoundingMode.DOWN));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized long m23735() {
        return this.f28021;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a A[PHI: r12
      0x003a: PHI (r12v2 long) = (r12v0 long), (r12v6 long) binds: [B:9:0x0011, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized long m23736(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f28019;
        if (j3 != -9223372036854775807L) {
            String str = C3603.f11424;
            long jM11017 = C3603.m11017(j3, 90000L, 1000000L, RoundingMode.DOWN);
            long j4 = jM11017 / 8589934592L;
            Long.signum(j4);
            long j5 = (j4 * 8589934592L) + j;
            j += (j4 + 1) * 8589934592L;
            if (j5 >= jM11017) {
                j2 = j5;
            } else {
                j2 = j;
            }
        } else {
            j2 = j;
        }
        String str2 = C3603.f11424;
        return m23731(C3603.m11017(j2, 1000000L, 90000L, RoundingMode.DOWN));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m23737(long j) {
        this.f28018 = j;
        this.f28021 = j == C13132.FOREVER_NS ? 0L : -9223372036854775807L;
        this.f28019 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m23738() {
        return this.f28021 != -9223372036854775807L;
    }

    public C9248(long j) {
        m23737(j);
    }
}
