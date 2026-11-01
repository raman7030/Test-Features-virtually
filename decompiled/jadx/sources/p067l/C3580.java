package p067l;

/* JADX INFO: renamed from: l.֨ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes3.dex */
public class C3580 extends C23697 {

    /* JADX INFO: renamed from: ۙ */
    public int f7266;

    /* JADX INFO: renamed from: ᩶ */
    public EnumC21552 f7267;

    @Override // p067l.C23697
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6581() {
        return true;
    }

    public C3580(int i, String str, int i2, EnumC21552 enumC21552) {
        super(i, str);
        this.f7266 = i2;
        this.f7267 = enumC21552;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m6582() {
        return this.f7266;
    }

    @Override // p067l.C23697, p067l.C8537
    public int hashCode() {
        return super.hashCode() + this.f7266;
    }

    @Override // p067l.C23697, p067l.C8537
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C3580) obj).f7266 == this.f7266;
    }

    @Override // p067l.C23697, p067l.C8537
    public final String toString() {
        return EnumC8140.m18861(this.f7266, this.f7267) + super.toString();
    }
}
