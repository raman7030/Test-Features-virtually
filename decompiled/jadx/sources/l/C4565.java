package l;

/* JADX INFO: renamed from: l.ۙۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8NM */
/* JADX INFO: loaded from: classes3.dex */
public final class C4565 implements InterfaceC9505 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f14571;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13031 f14572;

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6829() {
        return true;
    }

    public C4565(C13031 c13031, long j) {
        this.f14572 = c13031;
        this.f14571 = j;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ۜ */
    public final long mo6827() {
        return this.f14571;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ֫ */
    public final C6682 mo1721(long j) {
        C13031 c13031 = this.f14572;
        C6682 c6682M16761 = c13031.f39013[0].m16761(j);
        for (int i = 1; i < c13031.f39013.length; i++) {
            C6682 c6682M16762 = c13031.f39013[i].m16761(j);
            if (c6682M16762.f20766.f26803 < c6682M16761.f20766.f26803) {
                c6682M16761 = c6682M16762;
            }
        }
        return c6682M16761;
    }
}
