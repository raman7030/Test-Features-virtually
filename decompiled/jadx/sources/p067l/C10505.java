package p067l;

/* JADX INFO: renamed from: l.ۡ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes4.dex */
public final class C10505 extends C11176 {

    /* JADX INFO: renamed from: ۜۧ */
    public C8493 f29080;

    public C10505(EnumC9462 enumC9462, AbstractC13599 abstractC13599, C8493 c8493) {
        super(enumC9462, abstractC13599);
        this.f29080 = c8493;
        this.f38254 = "Annotation_AnnotationValue";
    }

    @Override // p067l.C11176
    /* JADX INFO: renamed from: ᩹ */
    public final String mo5335() {
        return this.f29080.toString();
    }

    @Override // p067l.AbstractC13599
    /* JADX INFO: renamed from: ֫ */
    public final void mo24245(EnumC8234 enumC8234) {
        super.mo24245(enumC8234);
        this.f29080.mo24245(enumC8234);
    }

    @Override // p067l.C11176, p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ۧ */
    public final void mo5334() {
        C8493 c8493 = this.f29080;
        if (c8493 != null) {
            c8493.f32298 = this.f32298;
            c8493.m26661(this);
            c8493.mo5334();
        }
    }
}
