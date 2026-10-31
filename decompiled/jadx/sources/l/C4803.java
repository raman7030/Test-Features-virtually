package l;

/* JADX INFO: renamed from: l.ۙᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes3.dex */
public class C4803 extends C1275 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f15202;

    public C4803(int i, String str, int i2, EnumC20185 enumC20185, String str2) {
        super(i, str, i2, enumC20185);
        this.f15202 = (str2 == null || str2.isEmpty()) ? null : str2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m14014() {
        return this.f15202;
    }

    @Override // l.C1275, l.C22442, l.C6491
    public final int hashCode() {
        String str = this.f15202;
        return (str == null ? 0 : str.hashCode()) + super.hashCode();
    }
}
