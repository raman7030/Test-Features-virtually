package l;

/* JADX INFO: renamed from: l.ᩳ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes4.dex */
public final class C18368 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f57062;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18177 f57063;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f57064;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f57065;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f57066;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f57067;

    public C18368(C18177 c18177, long j, int i, int i2, int i3) {
        this.f57063 = c18177;
        this.f57067 = j;
        this.f57064 = i;
        this.f57065 = i2;
        long j2 = (((long) i2) - ((long) i)) + 1;
        int i4 = (int) j2;
        if (j2 != i4) {
            throw new ArithmeticException();
        }
        this.f57066 = i4;
        this.f57062 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42802(C6807 c6807) {
        C11041 c11041 = c6807.f21109;
        C18177 c18177M27414 = c11041.m27414();
        C18177 c18177 = this.f57063;
        return c18177M27414 == c18177 && c18177.m42385() == this.f57067 && c11041.m27406() && c11041.m27418() == this.f57064 && c11041.m27404() == this.f57065;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C18368 m42801(C6807 c6807) {
        C11041 c11041 = c6807.f21109;
        if (!c11041.m27406()) {
            return null;
        }
        C18177 c18177M27414 = c11041.m27414();
        int iM27418 = c11041.m27418();
        int iM27404 = c11041.m27404();
        int iM27413 = c11041.m27413();
        if (iM27418 < 0 || iM27404 < iM27418 || iM27404 >= c18177M27414.length() || iM27413 <= 0) {
            return null;
        }
        return new C18368(c18177M27414, c18177M27414.m42385(), iM27418, iM27404, iM27413);
    }
}
