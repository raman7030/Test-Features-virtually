package p067l;

/* JADX INFO: renamed from: l.ۙᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes3.dex */
public class C6933 extends C3580 {

    /* JADX INFO: renamed from: ۗ */
    public String f18035;

    public C6933(int i, String str, int i2, EnumC21552 enumC21552, String str2) {
        super(i, str, i2, enumC21552);
        this.f18035 = (str2 == null || str2.isEmpty()) ? null : str2;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m15894() {
        return this.f18035;
    }

    @Override // p067l.C3580, p067l.C23697, p067l.C8537
    public final int hashCode() {
        String str = this.f18035;
        return (str == null ? 0 : str.hashCode()) + super.hashCode();
    }
}
