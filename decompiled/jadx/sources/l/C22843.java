package l;

/* JADX INFO: renamed from: l.᩺۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59KW */
/* JADX INFO: loaded from: classes.dex */
public final class C22843 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f73725;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f73726;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C22843 c22843 = (C22843) obj;
        return -Integer.compare(this.f73725 - this.f73726, c22843.f73725 - c22843.f73726);
    }

    public C22843(int i, int i2) {
        this.f73726 = i;
        this.f73725 = i2;
    }
}
