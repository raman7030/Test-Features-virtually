package l;

/* JADX INFO: renamed from: l.ܽۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBDV */
/* JADX INFO: loaded from: classes4.dex */
public class C16354 extends AbstractC2988 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21064 f50333;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f50334;

    public C16354(int i) {
        super(1);
        this.f50333 = new C21064(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38500() {
        return this.f50334;
    }

    @Override // l.AbstractC2988
    /* JADX INFO: renamed from: ֫ */
    public final C21480 mo9123(C21480 c21480) {
        int i;
        if (c21480 == null) {
            return null;
        }
        try {
            i = this.f50333.get(c21480.m48652());
        } catch (IndexOutOfBoundsException unused) {
            i = -1;
        }
        if (i < 0) {
            throw new RuntimeException("no mapping specified for register");
        }
        return c21480.m48646(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38501(int i) {
        C21064 c21064 = this.f50333;
        if (i >= c21064.size()) {
            return -1;
        }
        return c21064.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo21169(int i, int i2, int i3) {
        C21064 c21064 = this.f50333;
        if (i >= c21064.size()) {
            for (int size = i - c21064.size(); size >= 0; size--) {
                c21064.add(-1);
            }
        }
        c21064.set(i, i2);
        int i4 = i2 + i3;
        if (this.f50334 < i4) {
            this.f50334 = i4;
        }
    }
}
