package l;

/* JADX INFO: renamed from: l.ۡ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes4.dex */
public final class C8562 extends C9268 {

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C6445 f26164;

    public C8562(EnumC7464 enumC7464, AbstractC11817 abstractC11817, C6445 c6445) {
        super(enumC7464, abstractC11817);
        this.f26164 = c6445;
        this.f35252 = "Annotation_AnnotationValue";
    }

    @Override // l.C9268
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3022() {
        return this.f26164.toString();
    }

    @Override // l.AbstractC11817
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22276(EnumC6172 enumC6172) {
        super.mo22276(enumC6172);
        this.f26164.mo22276(enumC6172);
    }

    @Override // l.C9268, l.AbstractC9701, l.InterfaceC17482
    /* JADX INFO: renamed from: ۧ */
    public final void mo3021() {
        C6445 c6445 = this.f26164;
        if (c6445 != null) {
            c6445.f29349 = this.f29349;
            c6445.m24647(this);
            c6445.mo3021();
        }
    }
}
