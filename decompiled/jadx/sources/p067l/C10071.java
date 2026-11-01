package p067l;

/* JADX INFO: renamed from: l.۠ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10071 extends C16105 {

    /* JADX INFO: renamed from: ᩳ */
    public boolean f27896;

    @Override // p067l.C16105, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
    }

    @Override // p067l.C16105, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3618(C11813 c11813) {
        m45570(new C6048(c11813));
    }

    @Override // p067l.C16105, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
        if (this.f27896 || c15834.m35951() == EnumC15394.EXPRESSION) {
            return;
        }
        this.f27896 = true;
        try {
            super.mo3619(c15834);
        } finally {
            this.f27896 = false;
        }
    }
}
