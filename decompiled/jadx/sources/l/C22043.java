package l;

/* JADX INFO: renamed from: l.᩹ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U707 */
/* JADX INFO: loaded from: classes.dex */
public final class C22043 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f70658;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f70659;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f70660;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC21338 f70661;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f70662;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f70663;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f70664;

    public C22043(int i) {
        m49604(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49604(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        this.f70664 = i;
        this.f70658 = -1;
        this.f70659 = -1;
        this.f70662 = -1;
        this.f70660 = -1;
        this.f70663 = false;
        this.f70661 = EnumC21338.COMPLETE;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49600(int i, int i2) {
        if (i == i2) {
            m49599(i);
            return;
        }
        if (i < 0 || i > i2 || i2 > this.f70664) {
            throw new IndexOutOfBoundsException("Invalid dependency read range");
        }
        int i3 = this.f70660;
        if (i3 == -1 || i < i3) {
            this.f70660 = i;
        }
        if (i2 > this.f70662) {
            this.f70662 = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49599(int i) {
        if (i < 0 || i > this.f70664) {
            throw new IndexOutOfBoundsException("Invalid dependency boundary");
        }
        int i2 = this.f70659;
        if (i2 == -1 || i < i2) {
            this.f70659 = i;
        }
        if (i > this.f70658) {
            this.f70658 = i;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49598() {
        this.f70663 = true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49605() {
        this.f70661 = EnumC21338.UNKNOWN;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49601(C19927 c19927) {
        C11003.requireNonNull(c19927);
        if (this.f70664 != c19927.f64521) {
            throw new IllegalArgumentException("Dependency text lengths differ");
        }
        int i = c19927.f64517;
        if (i != -1) {
            int i2 = this.f70660;
            if (i2 == -1 || i < i2) {
                this.f70660 = i;
            }
            int i3 = c19927.f64519;
            if (i3 > this.f70662) {
                this.f70662 = i3;
            }
        }
        int i4 = c19927.f64516;
        if (i4 != -1) {
            int i5 = this.f70659;
            if (i5 == -1 || i4 < i5) {
                this.f70659 = i4;
            }
            int i6 = c19927.f64515;
            if (i6 > this.f70658) {
                this.f70658 = i6;
            }
        }
        this.f70663 |= c19927.f64520;
        EnumC21338 enumC21338 = c19927.f64518;
        EnumC21338 enumC21339 = EnumC21338.UNKNOWN;
        if (enumC21338 == enumC21339) {
            this.f70661 = enumC21339;
            return;
        }
        EnumC21338 enumC213310 = EnumC21338.INCOMPLETE;
        if (enumC21338 == enumC213310 && this.f70661 == EnumC21338.COMPLETE) {
            this.f70661 = enumC213310;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49602(C22043 c22043) {
        C11003.requireNonNull(c22043);
        if (c22043 == this) {
            return;
        }
        if (this.f70664 != c22043.f70664) {
            throw new IllegalArgumentException("Dependency text lengths differ");
        }
        int i = c22043.f70660;
        if (i != -1) {
            int i2 = this.f70660;
            if (i2 == -1 || i < i2) {
                this.f70660 = i;
            }
            int i3 = c22043.f70662;
            if (i3 > this.f70662) {
                this.f70662 = i3;
            }
        }
        int i4 = c22043.f70659;
        if (i4 != -1) {
            int i5 = this.f70659;
            if (i5 == -1 || i4 < i5) {
                this.f70659 = i4;
            }
            int i6 = c22043.f70658;
            if (i6 > this.f70658) {
                this.f70658 = i6;
            }
        }
        this.f70663 |= c22043.f70663;
        EnumC21338 enumC21338 = c22043.f70661;
        EnumC21338 enumC21339 = EnumC21338.UNKNOWN;
        if (enumC21338 == enumC21339) {
            this.f70661 = enumC21339;
            return;
        }
        EnumC21338 enumC213310 = EnumC21338.INCOMPLETE;
        if (enumC21338 == enumC213310 && this.f70661 == EnumC21338.COMPLETE) {
            this.f70661 = enumC213310;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19927 m49603() {
        return new C19927(this, this.f70661);
    }
}
