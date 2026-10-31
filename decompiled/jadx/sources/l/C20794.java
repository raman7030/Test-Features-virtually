package l;

/* JADX INFO: renamed from: l.᩷ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8NG */
/* JADX INFO: loaded from: classes5.dex */
public class C20794 implements InterfaceC9505 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f67328;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6682 f67329;

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6829() {
        return false;
    }

    public C20794(long j) {
        this(j, 0L);
    }

    public C20794(long j, long j2) {
        this.f67328 = j;
        C8799 c8799 = j2 == 0 ? C8799.f26802 : new C8799(0L, j2);
        this.f67329 = new C6682(c8799, c8799);
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ۜ */
    public final long mo6827() {
        return this.f67328;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ֫ */
    public final C6682 mo1721(long j) {
        return this.f67329;
    }
}
