package p067l;

/* JADX INFO: renamed from: l.ۙۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8NM */
/* JADX INFO: loaded from: classes3.dex */
public final class C6707 implements InterfaceC11402 {

    /* JADX INFO: renamed from: ֫ */
    public final long f17400;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C14753 f17401;

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8955() {
        return true;
    }

    public C6707(C14753 c14753, long j) {
        this.f17401 = c14753;
        this.f17400 = j;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ۜ */
    public final long mo8953() {
        return this.f17400;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ֫ */
    public final C8719 mo4119(long j) {
        C14753 c14753 = this.f17401;
        C8719 c8719M18687 = c14753.f42059[0].m18687(j);
        for (int i = 1; i < c14753.f42059.length; i++) {
            C8719 c8719M18688 = c14753.f42059[i].m18687(j);
            if (c8719M18688.f23641.f29728 < c8719M18687.f23641.f29728) {
                c8719M18687 = c8719M18688;
            }
        }
        return c8719M18687;
    }
}
