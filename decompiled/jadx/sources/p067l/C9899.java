package p067l;

/* JADX INFO: renamed from: l.۠ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes4.dex */
public final class C9899 extends C16604 {

    /* JADX INFO: renamed from: ܳ */
    public final int f27447;

    public C9899(EnumC21300 enumC21300, int i, int i2, String str, int i3, C4848 c4848) {
        super(enumC21300, i, i2, str, c4848);
        this.f27447 = i3;
    }

    @Override // p067l.C16604, p067l.C23311
    /* JADX INFO: renamed from: ֫ */
    public final void mo5507() {
        EnumC22641 enumC22641 = this.f73357.f67121;
        EnumC22641 enumC22642 = EnumC22641.NUMERIC;
        if (enumC22641 == enumC22642) {
            return;
        }
        throw new AssertionError("Bad token kind - expected " + enumC22642);
    }

    @Override // p067l.C23311
    /* JADX INFO: renamed from: ܿ */
    public final int mo23180() {
        return this.f27447;
    }
}
