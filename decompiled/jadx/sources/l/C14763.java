package l;

/* JADX INFO: renamed from: l.ܳ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: TATF */
/* JADX INFO: loaded from: classes4.dex */
public final class C14763 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C14763[] f45080 = new C14763[1001];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f45081;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f45082;

    public C14763(int i, int i2) {
        this.f45081 = i;
        this.f45082 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14763 m35067(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new C14763(i, i2);
        }
        C14763[] c14763Arr = f45080;
        if (c14763Arr[i] == null) {
            c14763Arr[i] = new C14763(i, i);
        }
        return c14763Arr[i];
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14763)) {
            C14763 c14763 = (C14763) obj;
            if (this.f45081 == c14763.f45081 && this.f45082 == c14763.f45082) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45081 + 713) * 31) + this.f45082;
    }

    public final String toString() {
        return this.f45081 + ".." + this.f45082;
    }
}
