package l;

/* JADX INFO: renamed from: l.ܽܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OM */
/* JADX INFO: loaded from: classes4.dex */
public final class C16768 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13862 f51480;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f51481;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f51482;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f51483;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f51484;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f51485;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20736 f51486;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f51487;

    public C16768(C20736 c20736, int i, int i2, int i3, int i4) {
        this.f51486 = c20736;
        this.f51480 = c20736.m47359();
        this.f51484 = i;
        this.f51487 = i2;
        this.f51482 = i2;
        this.f51485 = i3;
        this.f51483 = i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39447(C11747 c11747, C6624 c6624) {
        int i;
        int i2;
        while (true) {
            int i3 = this.f51484;
            i = this.f51485;
            i2 = this.f51482;
            if (i3 >= i2 || this.f51486.m47358(i3) + i >= c11747.f35063) {
                break;
            }
            this.f51484++;
        }
        int i4 = this.f51484;
        if (i4 == i2) {
            return false;
        }
        C11747 c11747M33216 = this.f51480.m33216(i4);
        int i5 = c11747M33216.f35062 + i;
        c11747M33216.f35062 = i5;
        int i6 = c11747M33216.f35063 + i;
        c11747M33216.f35063 = i6;
        int i7 = c11747M33216.f35064 + this.f51483;
        c11747M33216.f35064 = i7;
        if (i7 != c11747.f35064) {
            return false;
        }
        int i8 = this.f51481 + 1;
        this.f51481 = i8;
        int i9 = c11747.f35063;
        if (i6 != i9) {
            if (i8 < 5000 || i9 < i5) {
                return false;
            }
            c6624.m18156(new C11747(i9, i6, i7));
        }
        this.f51487 = this.f51484 + 1;
        return true;
    }
}
