package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۫᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W1F3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14465 implements InterfaceC22710 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ViewOnClickListenerC8430 f41323;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C24164 f41324;

    public C14465(ViewOnClickListenerC8430 viewOnClickListenerC8430, C24164 c24164) {
        this.f41323 = viewOnClickListenerC8430;
        this.f41324 = c24164;
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo24482() {
        return this.f41324.m53444();
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ܽ */
    public final ActivityC18686 mo24485() {
        return this.f41323.f22611;
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ۧ */
    public final void mo24484(int i) {
        this.f41324.m53436(i);
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ֫ */
    public final void mo24481(int i, int i2) {
        ViewOnClickListenerC8430 viewOnClickListenerC8430 = this.f41323;
        viewOnClickListenerC8430.f22611.m12254(R.string.MT_Protector, viewOnClickListenerC8430.f22611.getString(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i)), false);
        if (i2 > 0) {
            ((C5946) new C6874(viewOnClickListenerC8430.f22611).m15765(C5946.class)).m13336();
        }
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ۧ */
    public final void mo24483() {
        this.f41324.m53442();
    }
}
