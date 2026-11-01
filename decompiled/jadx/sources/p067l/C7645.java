package p067l;

/* JADX INFO: renamed from: l.ۚ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 98OO */
/* JADX INFO: loaded from: classes2.dex */
public final class C7645 {

    /* JADX INFO: renamed from: ֫ */
    public final int f20007;

    /* JADX INFO: renamed from: ۜ */
    public final long f20008;

    /* JADX INFO: renamed from: ۧ */
    public final int f20009;

    /* JADX INFO: renamed from: ܳ */
    public final int f20010;

    /* JADX INFO: renamed from: ܽ */
    public final long f20011;

    /* JADX INFO: renamed from: ܿ */
    public final int f20012;

    /* JADX INFO: renamed from: ᩳ */
    public final C13010 f20013;

    /* JADX INFO: renamed from: ᩷ */
    public final Object f20014;

    /* JADX INFO: renamed from: ᩻ */
    public final Object f20015;

    public C7645(Object obj, int i, C13010 c13010, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.f20014 = obj;
        this.f20012 = i;
        this.f20013 = c13010;
        this.f20015 = obj2;
        this.f20010 = i2;
        this.f20008 = j;
        this.f20011 = j2;
        this.f20007 = i3;
        this.f20009 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7645.class == obj.getClass()) {
            C7645 c7645 = (C7645) obj;
            if (this.f20012 == c7645.f20012 && this.f20010 == c7645.f20010 && this.f20008 == c7645.f20008 && this.f20011 == c7645.f20011 && this.f20007 == c7645.f20007 && this.f20009 == c7645.f20009 && C12826.equals(this.f20013, c7645.f20013) && C12826.equals(this.f20014, c7645.f20014) && C12826.equals(this.f20015, c7645.f20015)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hash(this.f20014, Integer.valueOf(this.f20012), this.f20013, this.f20015, Integer.valueOf(this.f20010), Long.valueOf(this.f20008), Long.valueOf(this.f20011), Integer.valueOf(this.f20007), Integer.valueOf(this.f20009));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f20012 + ", period=" + this.f20010 + ", pos=" + this.f20008;
        int i = this.f20007;
        if (i == -1) {
            return str;
        }
        StringBuilder sbM21133 = C9179.m21133(str, ", contentPos=");
        sbM21133.append(this.f20011);
        sbM21133.append(", adGroup=");
        sbM21133.append(i);
        sbM21133.append(", ad=");
        sbM21133.append(this.f20009);
        return sbM21133.toString();
    }

    static {
        C7470.m17250(0, 1, 2, 3, 4);
        C5792.m13032(5);
        C5792.m13032(6);
    }
}
