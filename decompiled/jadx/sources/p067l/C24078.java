package p067l;

/* JADX INFO: renamed from: l.᩺۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59KW */
/* JADX INFO: loaded from: classes.dex */
public final class C24078 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public int f76457;

    /* JADX INFO: renamed from: ᩹ */
    public int f76458;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C24078 c24078 = (C24078) obj;
        return -Integer.compare(this.f76457 - this.f76458, c24078.f76457 - c24078.f76458);
    }

    public C24078(int i, int i2) {
        this.f76458 = i;
        this.f76457 = i2;
    }
}
