package p067l;

/* JADX INFO: renamed from: l.ܶۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes4.dex */
public class C16604 extends C23311 {

    /* JADX INFO: renamed from: ܿ */
    public final String f48767;

    public C16604(EnumC21300 enumC21300, int i, int i2, String str, C4848 c4848) {
        super(enumC21300, i, i2, c4848);
        this.f48767 = str;
    }

    @Override // p067l.C23311
    /* JADX INFO: renamed from: ֫ */
    public void mo5507() {
        EnumC22641 enumC22641 = this.f73357.f67121;
        EnumC22641 enumC22642 = EnumC22641.STRING;
        if (enumC22641 == enumC22642) {
            return;
        }
        throw new AssertionError("Bad token kind - expected " + enumC22642);
    }

    @Override // p067l.C23311
    /* JADX INFO: renamed from: ܳ */
    public final String mo37618() {
        return this.f48767;
    }
}
