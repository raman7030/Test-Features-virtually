package p067l;

/* JADX INFO: renamed from: l.ۙ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69LN */
/* JADX INFO: loaded from: classes2.dex */
public class C6644 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public int f17144;

    /* JADX INFO: renamed from: ᩹ */
    public int f17145;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f17145, ((C6644) obj).f17145);
    }

    public C6644() {
    }

    public C6644(int i, int i2) {
        this.f17145 = i;
        this.f17144 = i2;
    }

    public final String toString() {
        return this.f17145 + " - " + this.f17144;
    }
}
