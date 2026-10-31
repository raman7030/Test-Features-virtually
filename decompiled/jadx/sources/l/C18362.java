package l;

/* JADX INFO: renamed from: l.ᩳ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAO5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18362 implements Comparable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f57054;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f57055;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f57056 = -1;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C18362 c18362 = (C18362) obj;
        int iCompare = Integer.compare(this.f57055, c18362.f57055);
        return iCompare != 0 ? iCompare : this.f57054.compareTo(c18362.f57054);
    }

    public C18362(String str, int i) {
        this.f57054 = str;
        this.f57055 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m42794() {
        int i = this.f57056;
        if (i != -1) {
            return i;
        }
        throw new IllegalStateException();
    }
}
