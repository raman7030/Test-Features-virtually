package l;

/* JADX INFO: renamed from: l.۫᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38RU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12657 implements InterfaceC9505 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f38124;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6307 f38125;

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6829() {
        return true;
    }

    public C12657(C6307 c6307, long j) {
        this.f38125 = c6307;
        this.f38124 = j;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ۜ */
    public final long mo6827() {
        return this.f38125.m17435();
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ֫ */
    public final C6682 mo1721(long j) {
        C6307 c6307 = this.f38125;
        C22632.m50632(c6307.f19529);
        C10541 c10541 = c6307.f19529;
        long[] jArr = c10541.f31649;
        long[] jArr2 = c10541.f31648;
        int iM11036 = C3603.m11036(jArr, C3603.m11016((((long) c6307.f19537) * j) / 1000000, 0L, c6307.f19533 - 1), false);
        long j2 = iM11036 == -1 ? 0L : jArr[iM11036];
        long j3 = iM11036 != -1 ? jArr2[iM11036] : 0L;
        int i = c6307.f19537;
        long j4 = (j2 * 1000000) / ((long) i);
        long j5 = this.f38124;
        C8799 c8799 = new C8799(j4, j3 + j5);
        if (j4 != j && iM11036 != jArr.length - 1) {
            int i2 = iM11036 + 1;
            return new C6682(c8799, new C8799((jArr[i2] * 1000000) / ((long) i), j5 + jArr2[i2]));
        }
        return new C6682(c8799, c8799);
    }
}
