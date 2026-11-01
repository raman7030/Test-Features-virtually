package p067l;

/* JADX INFO: renamed from: l.۟ܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9495 implements InterfaceC15529 {

    /* JADX INFO: renamed from: ۧ */
    public int f26001 = 0;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C3956 f26002;

    /* JADX INFO: renamed from: ܽ */
    public int f26003;

    /* JADX INFO: renamed from: ܿ */
    public final int f26004;

    /* JADX INFO: renamed from: ᩳ */
    public final int f26005;

    public C9495(C3956 c3956, int i, int i2) {
        this.f26002 = c3956;
        this.f26004 = i;
        this.f26005 = i2;
        this.f26003 = c3956.f8621.m33504().mo13855(i);
    }

    @Override // p067l.InterfaceC15529
    public final int seekTo(int i) {
        int i2;
        int i3;
        C3956 c3956;
        while (true) {
            i2 = this.f26003;
            i3 = this.f26004;
            c3956 = this.f26002;
            if (i2 >= i) {
                break;
            }
            int i4 = this.f26001;
            if (i4 + 1 >= this.f26005) {
                break;
            }
            this.f26001 = i4 + 1;
            this.f26003 = c3956.f8621.m33504().mo13855((this.f26001 * 8) + i3);
        }
        if (i2 == i) {
            return c3956.f8621.m33504().mo13855((this.f26001 * 8) + i3 + 4);
        }
        return 0;
    }
}
