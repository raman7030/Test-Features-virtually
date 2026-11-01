package p067l;

/* JADX INFO: renamed from: l.ܽܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OM */
/* JADX INFO: loaded from: classes4.dex */
public final class C18305 {

    /* JADX INFO: renamed from: ֫ */
    public final C15543 f54662;

    /* JADX INFO: renamed from: ۜ */
    public int f54663;

    /* JADX INFO: renamed from: ۧ */
    public final int f54664;

    /* JADX INFO: renamed from: ܳ */
    public final int f54665;

    /* JADX INFO: renamed from: ܽ */
    public int f54666;

    /* JADX INFO: renamed from: ܿ */
    public final int f54667;

    /* JADX INFO: renamed from: ᩳ */
    public final C22076 f54668;

    /* JADX INFO: renamed from: ᩻ */
    public int f54669;

    public C18305(C22076 c22076, int i, int i2, int i3, int i4) {
        this.f54668 = c22076;
        this.f54662 = c22076.m49686();
        this.f54666 = i;
        this.f54669 = i2;
        this.f54664 = i2;
        this.f54667 = i3;
        this.f54665 = i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m41683(C13533 c13533, C8664 c8664) {
        int i;
        int i2;
        while (true) {
            int i3 = this.f54666;
            i = this.f54667;
            i2 = this.f54664;
            if (i3 >= i2 || this.f54668.m49685(i3) + i >= c13533.f38062) {
                break;
            }
            this.f54666++;
        }
        int i4 = this.f54666;
        if (i4 == i2) {
            return false;
        }
        C13533 c13533M35335 = this.f54662.m35335(i4);
        int i5 = c13533M35335.f38061 + i;
        c13533M35335.f38061 = i5;
        int i6 = c13533M35335.f38062 + i;
        c13533M35335.f38062 = i6;
        int i7 = c13533M35335.f38063 + this.f54665;
        c13533M35335.f38063 = i7;
        if (i7 != c13533.f38063) {
            return false;
        }
        int i8 = this.f54663 + 1;
        this.f54663 = i8;
        int i9 = c13533.f38062;
        if (i6 != i9) {
            if (i8 < 5000 || i9 < i5) {
                return false;
            }
            c8664.m20108(new C13533(i9, i6, i7));
        }
        this.f54669 = this.f54666 + 1;
        return true;
    }
}
