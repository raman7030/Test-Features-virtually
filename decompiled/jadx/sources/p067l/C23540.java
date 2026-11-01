package p067l;

/* JADX INFO: renamed from: l.᩹۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes2.dex */
public final class C23540 extends C18175 {

    /* JADX INFO: renamed from: ᩻ */
    public boolean f74988;

    @Override // p067l.C18175, p067l.InterfaceC20859
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo30640() {
        return super.mo30640() || this.f74988;
    }

    @Override // p067l.C18175, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
        super.mo3619(c15834);
        if (c15834.f45861 == EnumC18517.IMPLICIT) {
            this.f74988 = true;
        }
    }

    @Override // p067l.C18175, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3804(C11142 c11142) {
        super.mo3804(c11142);
        if (c11142.mo25671() != EnumC8459.UNOVERLOADED) {
            this.f74988 = true;
        }
    }
}
