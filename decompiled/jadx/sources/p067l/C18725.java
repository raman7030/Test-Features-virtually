package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܿ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18725 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ String f55969;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f55970;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C19548 f55971;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C20738 f55972;

    public C18725(C20738 c20738, String str, C19548 c19548) {
        this.f55972 = c20738;
        this.f55969 = str;
        this.f55971 = c19548;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C24164 c24164 = new C24164((AbstractActivityC5549) this.f55972.requireActivity());
        c24164.m53440(R.string.MT_Protector);
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        this.f55970 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        String str = this.f55969;
        C20738 c20738 = this.f55972;
        c20738.f63994 = str;
        if (c20738.f63989 == null || c20738.f63989.length < c20738.f63990.size()) {
            c20738.f63989 = new int[c20738.f63990.size()];
        }
        int i = 0;
        for (int i2 = 0; i2 < c20738.f63990.size(); i2++) {
            if (this.f55971.m44389(((C24760) c20738.f63990.get(i2)).m54427())) {
                c20738.f63989[i] = i2;
                i++;
            }
            this.f55970.m53436((i * 100) / c20738.f63990.size());
            if (this.f55970.m53444()) {
                return;
            }
        }
        c20738.f63995 = i;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f55970.m53444()) {
            return;
        }
        C20738 c20738 = this.f55972;
        c20738.f63992 = true;
        C20738.m46823(c20738);
        c20738.f63997.notifyDataSetChanged();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f55972.f63999.m13320((Throwable) exc);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f55970.m53442();
    }
}
