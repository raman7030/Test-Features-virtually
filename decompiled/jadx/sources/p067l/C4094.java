package p067l;

/* JADX INFO: renamed from: l.֫۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes3.dex */
public final class C4094 extends C22870 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C18175 f9022;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ AbstractC6462 f9023;

    public C4094(C18175 c18175, AbstractC6462 abstractC6462) {
        this.f9022 = c18175;
        this.f9023 = abstractC6462;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3618(C11813 c11813) {
        AbstractC14355 abstractC14355 = c11813.f32975;
        if (abstractC14355 != null) {
            C18175 c18175 = this.f9022;
            AbstractC6462 abstractC6462 = c18175.f54259;
            try {
                c18175.f54259 = this.f9023;
                c18175.mo12739(abstractC14355);
            } finally {
                c18175.f54259 = abstractC6462;
            }
        }
    }
}
