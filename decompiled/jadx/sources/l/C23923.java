package l;

/* JADX INFO: renamed from: l.᩻᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBKO */
/* JADX INFO: loaded from: classes.dex */
public final class C23923 implements Comparable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f77594;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC21102 f77595;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f77596;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C23923 c23923 = (C23923) obj;
        int iCompareTo = this.f77595.compareTo(c23923.f77595);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompare = Integer.compare(this.f77596, c23923.f77596);
        return iCompare != 0 ? iCompare : this.f77594.compareTo(c23923.f77594);
    }

    public C23923(EnumC21102 enumC21102, int i, String str) {
        this.f77595 = enumC21102;
        this.f77596 = i;
        this.f77594 = str;
    }
}
