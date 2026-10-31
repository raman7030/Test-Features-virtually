package l;

/* JADX INFO: renamed from: l.֫᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88UO */
/* JADX INFO: loaded from: classes2.dex */
public final class C2074 implements InterfaceC9505 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f6918;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f6919;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18302 f6920;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f6921;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f6922;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f6923;

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean mo6829() {
        return true;
    }

    public C2074(InterfaceC18302 interfaceC18302, long j, long j2, long j3, long j4, long j5) {
        this.f6920 = interfaceC18302;
        this.f6923 = j;
        this.f6921 = j2;
        this.f6922 = j3;
        this.f6919 = j4;
        this.f6918 = j5;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ֫ */
    public final C6682 mo1721(long j) {
        C8799 c8799 = new C8799(j, C16890.m39717(this.f6920.mo20158(j), 0L, this.f6921, this.f6922, this.f6919, this.f6918));
        return new C6682(c8799, c8799);
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long mo6827() {
        return this.f6923;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m6828(long j) {
        return this.f6920.mo20158(j);
    }
}
