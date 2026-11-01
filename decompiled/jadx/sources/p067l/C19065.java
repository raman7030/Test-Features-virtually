package p067l;

/* JADX INFO: renamed from: l.ܿ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U58Q */
/* JADX INFO: loaded from: classes5.dex */
public final class C19065 extends AbstractC20407 {

    /* JADX INFO: renamed from: ۗ */
    public String f56875;

    public C19065(String str) {
        super(EnumC3642.NEW);
        this.f56875 = str;
    }

    @Override // p067l.AbstractC20407, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        return new C19065(this.f56875);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return new C19065(this.f56875);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        return "NEW " + C2805.m4425(this.f56875);
    }
}
