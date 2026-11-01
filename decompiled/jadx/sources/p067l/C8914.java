package p067l;

/* JADX INFO: renamed from: l.ۜܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8PX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8914 implements InterfaceC16979 {

    /* JADX INFO: renamed from: ֫ */
    public C10275 f24155;

    /* JADX INFO: renamed from: ۧ */
    public long f24156;

    /* JADX INFO: renamed from: ܽ */
    public C8914 f24157;

    /* JADX INFO: renamed from: ᩳ */
    public long f24158;

    public C8914(int i, long j) {
        C23877.m52960(this.f24155 == null);
        this.f24158 = j;
        this.f24156 = j + ((long) i);
    }

    @Override // p067l.InterfaceC16979
    /* JADX INFO: renamed from: ֫ */
    public final C10275 mo20604() {
        C10275 c10275 = this.f24155;
        c10275.getClass();
        return c10275;
    }

    @Override // p067l.InterfaceC16979
    public final InterfaceC16979 next() {
        C8914 c8914 = this.f24157;
        if (c8914 == null || c8914.f24155 == null) {
            return null;
        }
        return c8914;
    }
}
