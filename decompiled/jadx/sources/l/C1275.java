package l;

/* JADX INFO: renamed from: l.֨ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1275 extends C22442 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f4492;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC20185 f4493;

    @Override // l.C22442
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean mo4335() {
        return true;
    }

    public C1275(int i, String str, int i2, EnumC20185 enumC20185) {
        super(i, str);
        this.f4492 = i2;
        this.f4493 = enumC20185;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m4336() {
        return this.f4492;
    }

    @Override // l.C22442, l.C6491
    public int hashCode() {
        return super.hashCode() + this.f4492;
    }

    @Override // l.C22442, l.C6491
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C1275) obj).f4492 == this.f4492;
    }

    @Override // l.C22442, l.C6491
    public final String toString() {
        return EnumC6073.m16932(this.f4492, this.f4493) + super.toString();
    }
}
