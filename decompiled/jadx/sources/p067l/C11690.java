package p067l;

/* JADX INFO: renamed from: l.ۢ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U582 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11690 extends AbstractC20407 {

    /* JADX INFO: renamed from: ۗ */
    public String f32596;

    /* JADX INFO: renamed from: ۫ */
    public String f32597;

    /* JADX INFO: renamed from: ۬ */
    public String f32598;

    public C11690(String str, String str2, String str3) {
        super(EnumC3642.STATIC_FIELD);
        this.f32597 = str3;
        this.f32596 = str2;
        this.f32598 = str;
    }

    @Override // p067l.AbstractC20407, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        return new C11690(this.f32598, this.f32596, this.f32597);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return new C11690(this.f32598, this.f32596, this.f32597);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        return C2805.m4425(this.f32598) + "." + this.f32596;
    }
}
