package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܽ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C18203 implements InterfaceC16191 {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f54340 = true;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C19545 f54341;

    public C18203(C19545 c19545) {
        this.f54341 = c19545;
    }

    @Override // p067l.InterfaceC16191
    /* JADX INFO: renamed from: ۧ */
    public final void mo15618(int i) {
        C19545 c19545 = this.f54341;
        if (i == -1) {
            c19545.f59502.m53429(R.string.MT_Protector);
            return;
        }
        if (this.f54340) {
            c19545.f59502.m53429(R.string.MT_Protector);
            this.f54340 = false;
        }
        c19545.f59502.m53436(i);
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f54341.f59502.m53444();
    }
}
