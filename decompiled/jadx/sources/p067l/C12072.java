package p067l;

/* JADX INFO: renamed from: l.ۤۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12072 implements InterfaceC21460 {

    /* JADX INFO: renamed from: ֫ */
    public final int f33629;

    /* JADX INFO: renamed from: ۧ */
    public final int f33630;

    /* JADX INFO: renamed from: ܳ */
    public final int f33631;

    /* JADX INFO: renamed from: ܽ */
    public final int f33632;

    /* JADX INFO: renamed from: ܿ */
    public final int f33633;

    /* JADX INFO: renamed from: ᩳ */
    public final int f33634;

    @Override // p067l.InterfaceC21460
    public final int getType() {
        return 1752331379;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12072 m27639(C19203 c19203) {
        int iM43736 = c19203.m43736();
        c19203.m43724(12);
        c19203.m43736();
        int iM43737 = c19203.m43736();
        int iM43738 = c19203.m43736();
        c19203.m43724(4);
        int iM43739 = c19203.m43736();
        int iM437310 = c19203.m43736();
        c19203.m43724(4);
        return new C12072(iM43736, iM43737, iM43738, iM43739, iM437310, c19203.m43736());
    }

    public C12072(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f33633 = i;
        this.f33634 = i2;
        this.f33630 = i3;
        this.f33629 = i4;
        this.f33631 = i5;
        this.f33632 = i6;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m27640() {
        int i = this.f33633;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        C21334.m48351("Found unsupported streamType fourCC: " + Integer.toHexString(i));
        return -1;
    }
}
