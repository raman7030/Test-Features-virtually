package l;

/* JADX INFO: renamed from: l.۟ܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7499 implements InterfaceC13848 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f23089 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1671 f23090;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f23091;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f23092;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f23093;

    public C7499(C1671 c1671, int i, int i2) {
        this.f23090 = c1671;
        this.f23092 = i;
        this.f23093 = i2;
        this.f23091 = c1671.f5842.m31418().mo11935(i);
    }

    @Override // l.InterfaceC13848
    public final int seekTo(int i) {
        int i2;
        int i3;
        C1671 c1671;
        while (true) {
            i2 = this.f23091;
            i3 = this.f23092;
            c1671 = this.f23090;
            if (i2 >= i) {
                break;
            }
            int i4 = this.f23089;
            if (i4 + 1 >= this.f23093) {
                break;
            }
            this.f23089 = i4 + 1;
            this.f23091 = c1671.f5842.m31418().mo11935((this.f23089 * 8) + i3);
        }
        if (i2 == i) {
            return c1671.f5842.m31418().mo11935((this.f23089 * 8) + i3 + 4);
        }
        return 0;
    }
}
