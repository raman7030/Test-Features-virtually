package p067l;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8M0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14569 {

    /* JADX INFO: renamed from: ܶ */
    public static final C17474 f41601 = new C17474(new Object());

    /* JADX INFO: renamed from: ֡ */
    public final AbstractC6974 f41602;

    /* JADX INFO: renamed from: ֨ */
    public final C8243 f41603;

    /* JADX INFO: renamed from: ֫ */
    public volatile long f41604;

    /* JADX INFO: renamed from: ۖ */
    public volatile long f41605;

    /* JADX INFO: renamed from: ۘ */
    public final long f41606;

    /* JADX INFO: renamed from: ۚ */
    public volatile long f41607;

    /* JADX INFO: renamed from: ۜ */
    public final C19735 f41608;

    /* JADX INFO: renamed from: ۠ */
    public final C3569 f41609;

    /* JADX INFO: renamed from: ۡ */
    public final int f41610;

    /* JADX INFO: renamed from: ۢ */
    public final int f41611;

    /* JADX INFO: renamed from: ۧ */
    public final long f41612;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f41613;

    /* JADX INFO: renamed from: ܺ */
    public volatile long f41614;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f41615;

    /* JADX INFO: renamed from: ܿ */
    public final C17474 f41616;

    /* JADX INFO: renamed from: ᩳ */
    public final C17474 f41617;

    /* JADX INFO: renamed from: ᩴ */
    public final boolean f41618;

    /* JADX INFO: renamed from: ᩵ */
    public final List f41619;

    /* JADX INFO: renamed from: ᩷ */
    public final C4963 f41620;

    /* JADX INFO: renamed from: ᩻ */
    public final int f41621;

    /* JADX INFO: renamed from: ֫ */
    public static C14569 m33310(C3569 c3569) {
        AbstractC6974 abstractC6974 = AbstractC6974.f18145;
        C8243 c8243 = C8243.f21835;
        AbstractC16192 abstractC16192M36872of = AbstractC16192.m36872of();
        C4963 c4963 = C4963.f11302;
        C17474 c17474 = f41601;
        return new C14569(abstractC6974, c17474, -9223372036854775807L, 0L, 1, null, false, c8243, c3569, abstractC16192M36872of, c17474, false, 1, 0, c4963, 0L, 0L, 0L, 0L, false);
    }

    public C14569(AbstractC6974 abstractC6974, C17474 c17474, long j, long j2, int i, C19735 c19735, boolean z, C8243 c8243, C3569 c3569, List list, C17474 c17475, boolean z2, int i2, int i3, C4963 c4963, long j3, long j4, long j5, long j6, boolean z3) {
        this.f41602 = abstractC6974;
        this.f41616 = c17474;
        this.f41606 = j;
        this.f41612 = j2;
        this.f41611 = i;
        this.f41608 = c19735;
        this.f41615 = z;
        this.f41603 = c8243;
        this.f41609 = c3569;
        this.f41619 = list;
        this.f41617 = c17475;
        this.f41613 = z2;
        this.f41621 = i2;
        this.f41610 = i3;
        this.f41620 = c4963;
        this.f41604 = j3;
        this.f41607 = j4;
        this.f41605 = j5;
        this.f41614 = j6;
        this.f41618 = z3;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C17474 m33311() {
        return f41601;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14569 m33318(C17474 c17474, long j, long j2, long j3, long j4, C8243 c8243, C3569 c3569, List list) {
        return new C14569(this.f41602, c17474, j2, j3, this.f41611, this.f41608, this.f41615, c8243, c3569, list, this.f41617, this.f41613, this.f41621, this.f41610, this.f41620, this.f41604, j4, j, SystemClock.elapsedRealtime(), this.f41618);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14569 m33316(AbstractC6974 abstractC6974) {
        return new C14569(abstractC6974, this.f41616, this.f41606, this.f41612, this.f41611, this.f41608, this.f41615, this.f41603, this.f41609, this.f41619, this.f41617, this.f41613, this.f41621, this.f41610, this.f41620, this.f41604, this.f41607, this.f41605, this.f41614, this.f41618);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14569 m33313(int i) {
        return new C14569(this.f41602, this.f41616, this.f41606, this.f41612, i, this.f41608, this.f41615, this.f41603, this.f41609, this.f41619, this.f41617, this.f41613, this.f41621, this.f41610, this.f41620, this.f41604, this.f41607, this.f41605, this.f41614, this.f41618);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14569 m33319(C19735 c19735) {
        return new C14569(this.f41602, this.f41616, this.f41606, this.f41612, this.f41611, c19735, this.f41615, this.f41603, this.f41609, this.f41619, this.f41617, this.f41613, this.f41621, this.f41610, this.f41620, this.f41604, this.f41607, this.f41605, this.f41614, this.f41618);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14569 m33320(boolean z) {
        return new C14569(this.f41602, this.f41616, this.f41606, this.f41612, this.f41611, this.f41608, z, this.f41603, this.f41609, this.f41619, this.f41617, this.f41613, this.f41621, this.f41610, this.f41620, this.f41604, this.f41607, this.f41605, this.f41614, this.f41618);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14569 m33317(C17474 c17474) {
        return new C14569(this.f41602, this.f41616, this.f41606, this.f41612, this.f41611, this.f41608, this.f41615, this.f41603, this.f41609, this.f41619, c17474, this.f41613, this.f41621, this.f41610, this.f41620, this.f41604, this.f41607, this.f41605, this.f41614, this.f41618);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14569 m33314(int i, int i2, boolean z) {
        return new C14569(this.f41602, this.f41616, this.f41606, this.f41612, this.f41611, this.f41608, this.f41615, this.f41603, this.f41609, this.f41619, this.f41617, z, i, i2, this.f41620, this.f41604, this.f41607, this.f41605, this.f41614, this.f41618);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14569 m33315(C4963 c4963) {
        return new C14569(this.f41602, this.f41616, this.f41606, this.f41612, this.f41611, this.f41608, this.f41615, this.f41603, this.f41609, this.f41619, this.f41617, this.f41613, this.f41621, this.f41610, c4963, this.f41604, this.f41607, this.f41605, this.f41614, this.f41618);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C14569 m33322(boolean z) {
        return new C14569(this.f41602, this.f41616, this.f41606, this.f41612, this.f41611, this.f41608, this.f41615, this.f41603, this.f41609, this.f41619, this.f41617, this.f41613, this.f41621, this.f41610, this.f41620, this.f41604, this.f41607, this.f41605, this.f41614, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14569 m33312() {
        return new C14569(this.f41602, this.f41616, this.f41606, this.f41612, this.f41611, this.f41608, this.f41615, this.f41603, this.f41609, this.f41619, this.f41617, this.f41613, this.f41621, this.f41610, this.f41620, this.f41604, this.f41607, m33321(), SystemClock.elapsedRealtime(), this.f41618);
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m33321() {
        long j;
        long j2;
        if (!m33323()) {
            return this.f41605;
        }
        do {
            j = this.f41614;
            j2 = this.f41605;
        } while (j != this.f41614);
        return C5792.m12990(C5792.m13013(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.f41620.f11305)));
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m33323() {
        return this.f41611 == 3 && this.f41613 && this.f41610 == 0;
    }
}
