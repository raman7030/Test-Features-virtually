package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۢۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11322 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ String f31524;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f31525;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C19548 f31526;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C16684 f31527;

    public C11322(C16684 c16684, String str, C19548 c19548) {
        this.f31527 = c16684;
        this.f31524 = str;
        this.f31526 = c19548;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C24164 c24164 = new C24164((AbstractActivityC5549) this.f31527.requireActivity());
        c24164.m53440(R.string.MT_Protector);
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        this.f31525 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        String str = this.f31524;
        C16684 c16684 = this.f31527;
        c16684.f49114 = str;
        if (c16684.f49109 == null || c16684.f49109.length < c16684.f49116.size()) {
            c16684.f49109 = new int[c16684.f49116.size()];
        }
        int i = 0;
        for (int i2 = 0; i2 < c16684.f49116.size(); i2++) {
            if (this.f31526.m44389(((C17355) c16684.f49116.get(i2)).m39356())) {
                c16684.f49109[i] = i2;
                i++;
            }
            this.f31525.m53436((i * 100) / c16684.f49116.size());
            if (this.f31525.m53444()) {
                return;
            }
        }
        c16684.f49115 = i;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f31525.m53444()) {
            return;
        }
        C16684 c16684 = this.f31527;
        c16684.f49112 = true;
        C16684.m37770(c16684);
        c16684.f49117.notifyDataSetChanged();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f31527.f49119.m13320((Throwable) exc);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f31525.m53442();
    }
}
