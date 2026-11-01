package p067l;

/* JADX INFO: renamed from: l.֡۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78R7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2772 {

    /* JADX INFO: renamed from: ֫ */
    public final C17474 f4667;

    /* JADX INFO: renamed from: ۜ */
    public final AbstractC6974 f4668;

    /* JADX INFO: renamed from: ۢ */
    public final int f4669;

    /* JADX INFO: renamed from: ۧ */
    public final long f4670;

    /* JADX INFO: renamed from: ܳ */
    public final C17474 f4671;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC6974 f4672;

    /* JADX INFO: renamed from: ܿ */
    public final long f4673;

    /* JADX INFO: renamed from: ᩳ */
    public final int f4674;

    /* JADX INFO: renamed from: ᩷ */
    public final long f4675;

    /* JADX INFO: renamed from: ᩻ */
    public final long f4676;

    public C2772(long j, AbstractC6974 abstractC6974, int i, C17474 c17474, long j2, AbstractC6974 abstractC6975, int i2, C17474 c17475, long j3, long j4) {
        this.f4676 = j;
        this.f4668 = abstractC6974;
        this.f4669 = i;
        this.f4671 = c17474;
        this.f4673 = j2;
        this.f4672 = abstractC6975;
        this.f4674 = i2;
        this.f4667 = c17475;
        this.f4670 = j3;
        this.f4675 = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2772.class == obj.getClass()) {
            C2772 c2772 = (C2772) obj;
            if (this.f4676 == c2772.f4676 && this.f4669 == c2772.f4669 && this.f4673 == c2772.f4673 && this.f4674 == c2772.f4674 && this.f4670 == c2772.f4670 && this.f4675 == c2772.f4675 && C12826.equals(this.f4668, c2772.f4668) && C12826.equals(this.f4671, c2772.f4671) && C12826.equals(this.f4672, c2772.f4672) && C12826.equals(this.f4667, c2772.f4667)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hash(Long.valueOf(this.f4676), this.f4668, Integer.valueOf(this.f4669), this.f4671, Long.valueOf(this.f4673), this.f4672, Integer.valueOf(this.f4674), this.f4667, Long.valueOf(this.f4670), Long.valueOf(this.f4675));
    }
}
