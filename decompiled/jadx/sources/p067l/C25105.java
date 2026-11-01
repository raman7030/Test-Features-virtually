package p067l;

/* JADX INFO: renamed from: l.᩻᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBKO */
/* JADX INFO: loaded from: classes.dex */
public final class C25105 implements Comparable {

    /* JADX INFO: renamed from: ᩶ */
    public final String f80345;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC22424 f80346;

    /* JADX INFO: renamed from: ᩹ */
    public final int f80347;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C25105 c25105 = (C25105) obj;
        int iCompareTo = this.f80346.compareTo(c25105.f80346);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompare = Integer.compare(this.f80347, c25105.f80347);
        return iCompare != 0 ? iCompare : this.f80345.compareTo(c25105.f80345);
    }

    public C25105(EnumC22424 enumC22424, int i, String str) {
        this.f80346 = enumC22424;
        this.f80347 = i;
        this.f80345 = str;
    }
}
