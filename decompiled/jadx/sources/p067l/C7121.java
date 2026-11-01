package p067l;

/* JADX INFO: renamed from: l.ۚ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8V0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7121 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f18580;

    /* JADX INFO: renamed from: ۖ */
    public int f18581;

    /* JADX INFO: renamed from: ۘ */
    public int f18582;

    /* JADX INFO: renamed from: ۜ */
    public boolean f18583;

    /* JADX INFO: renamed from: ۡ */
    public boolean f18584;

    /* JADX INFO: renamed from: ۢ */
    public int f18585;

    /* JADX INFO: renamed from: ۧ */
    public boolean f18586;

    /* JADX INFO: renamed from: ܳ */
    public boolean f18587;

    /* JADX INFO: renamed from: ܺ */
    public int f18588;

    /* JADX INFO: renamed from: ܽ */
    public int f18589;

    /* JADX INFO: renamed from: ܿ */
    public int f18590;

    /* JADX INFO: renamed from: ᩳ */
    public int f18591;

    /* JADX INFO: renamed from: ᩴ */
    public int f18592;

    /* JADX INFO: renamed from: ᩵ */
    public C12695 f18593;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f18594;

    /* JADX INFO: renamed from: ᩻ */
    public int f18595;

    /* JADX INFO: renamed from: ֫ */
    public final void m16391() {
        this.f18583 = false;
        this.f18584 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16392(int i) {
        this.f18592 = i;
        this.f18583 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16393(C12695 c12695, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
        this.f18593 = c12695;
        this.f18588 = i;
        this.f18592 = i2;
        this.f18595 = i3;
        this.f18582 = i4;
        this.f18587 = z;
        this.f18586 = z2;
        this.f18580 = z3;
        this.f18594 = z4;
        this.f18585 = i5;
        this.f18581 = i6;
        this.f18590 = i7;
        this.f18589 = i8;
        this.f18591 = i9;
        this.f18584 = true;
        this.f18583 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m16394() {
        if (!this.f18583) {
            return false;
        }
        int i = this.f18592;
        return i == 7 || i == 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m16390(C7121 c7121, C7121 c7122) {
        int i;
        int i2;
        int i3;
        boolean z;
        if (!c7121.f18584) {
            return false;
        }
        if (c7122.f18584) {
            C12695 c12695 = c7121.f18593;
            C23877.m52958(c12695);
            C12695 c12696 = c7122.f18593;
            C23877.m52958(c12696);
            int i4 = c12696.f35621;
            if (c7121.f18595 == c7122.f18595 && c7121.f18582 == c7122.f18582 && c7121.f18587 == c7122.f18587 && ((!c7121.f18586 || !c7122.f18586 || c7121.f18580 == c7122.f18580) && (((i = c7121.f18588) == (i2 = c7122.f18588) || (i != 0 && i2 != 0)) && (((i3 = c12695.f35621) != 0 || i4 != 0 || (c7121.f18581 == c7122.f18581 && c7121.f18590 == c7122.f18590)) && ((i3 != 1 || i4 != 1 || (c7121.f18589 == c7122.f18589 && c7121.f18591 == c7122.f18591)) && (z = c7121.f18594) == c7122.f18594 && (!z || c7121.f18585 == c7122.f18585)))))) {
                return false;
            }
        }
        return true;
    }
}
