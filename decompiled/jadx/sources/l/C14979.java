package l;

/* JADX INFO: renamed from: l.ܶۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes4.dex */
public class C14979 extends C22036 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f45654;

    public C14979(EnumC19920 enumC19920, int i, int i2, String str, C2609 c2609) {
        super(enumC19920, i, i2, c2609);
        this.f45654 = str;
    }

    @Override // l.C22036
    /* JADX INFO: renamed from: ֫ */
    public void mo3193() {
        EnumC21331 enumC21331 = this.f70640.f64483;
        EnumC21331 enumC21332 = EnumC21331.STRING;
        if (enumC21331 == enumC21332) {
            return;
        }
        throw new AssertionError("Bad token kind - expected " + enumC21332);
    }

    @Override // l.C22036
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo35462() {
        return this.f45654;
    }
}
