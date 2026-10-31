package l;

/* JADX INFO: renamed from: l.ۙ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69LN */
/* JADX INFO: loaded from: classes2.dex */
public class C4499 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f14317;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f14318;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f14318, ((C4499) obj).f14318);
    }

    public C4499() {
    }

    public C4499(int i, int i2) {
        this.f14318 = i;
        this.f14317 = i2;
    }

    public final String toString() {
        return this.f14318 + " - " + this.f14317;
    }
}
