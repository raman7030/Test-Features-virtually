package p067l;

/* JADX INFO: renamed from: l.֫᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5DL */
/* JADX INFO: loaded from: classes3.dex */
public final class C4313 extends AbstractC15101 {

    /* JADX INFO: renamed from: ۬ */
    public C12025 f9626;

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        return "InvokeCustomExpr(....)";
    }

    public C4313(EnumC3642 enumC3642, AbstractC10348[] abstractC10348Arr, C12025 c12025) {
        super(enumC3642, abstractC10348Arr);
        this.f9626 = c12025;
    }

    @Override // p067l.AbstractC15101
    /* JADX INFO: renamed from: ᩷ */
    public final C12891 mo8846() {
        return this.f9626.m27544();
    }

    @Override // p067l.AbstractC7666, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        return new C4313(this.f28658, m17751(), this.f9626);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return new C4313(this.f28658, m17752(c3702), this.f9626);
    }
}
