package p067l;

/* JADX INFO: renamed from: l.ᩳ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAO5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19820 implements Comparable {

    /* JADX INFO: renamed from: ᩶ */
    public final String f60274;

    /* JADX INFO: renamed from: ᩸ */
    public final int f60275;

    /* JADX INFO: renamed from: ᩹ */
    public int f60276 = -1;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C19820 c19820 = (C19820) obj;
        int iCompare = Integer.compare(this.f60275, c19820.f60275);
        return iCompare != 0 ? iCompare : this.f60274.compareTo(c19820.f60274);
    }

    public C19820(String str, int i) {
        this.f60274 = str;
        this.f60275 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m45066() {
        int i = this.f60276;
        if (i != -1) {
            return i;
        }
        throw new IllegalStateException();
    }
}
