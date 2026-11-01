package p067l;

/* JADX INFO: renamed from: l.᩷᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4WW */
/* JADX INFO: loaded from: classes5.dex */
public final class C22419 extends AbstractC20407 {

    /* JADX INFO: renamed from: ۗ */
    public int f70720;

    /* JADX INFO: renamed from: ۬ */
    public String f70721;

    public C22419(EnumC3642 enumC3642, String str, int i) {
        super(enumC3642);
        this.f70721 = str;
        this.f70720 = i;
    }

    @Override // p067l.AbstractC20407, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        return new C22419(this.f28658, this.f70721, this.f70720);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return new C22419(this.f28658, this.f70721, this.f70720);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        int i = C9007.f24413[this.f28658.ordinal()];
        if (i == 1) {
            return "@this";
        }
        if (i != 2) {
            return i != 3 ? mo8845() : "@Exception";
        }
        return "@parameter_" + this.f70720;
    }
}
