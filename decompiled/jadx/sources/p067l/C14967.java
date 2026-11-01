package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬ܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5G5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14967 implements InterfaceC22710 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ViewOnClickListenerC12286 f42764;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C24164 f42765;

    public C14967(ViewOnClickListenerC12286 viewOnClickListenerC12286, C24164 c24164) {
        this.f42764 = viewOnClickListenerC12286;
        this.f42765 = c24164;
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo24482() {
        return this.f42765.m53444();
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ܽ */
    public final ActivityC18686 mo24485() {
        return this.f42764.f34323;
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ۧ */
    public final void mo24484(int i) {
        this.f42765.m53436(i);
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ֫ */
    public final void mo24481(int i, int i2) {
        ViewOnClickListenerC12286 viewOnClickListenerC12286 = this.f42764;
        viewOnClickListenerC12286.f34323.m12254(R.string.MT_Protector, viewOnClickListenerC12286.f34323.getString(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i)), false);
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ۧ */
    public final void mo24483() {
        this.f42765.m53442();
    }
}
