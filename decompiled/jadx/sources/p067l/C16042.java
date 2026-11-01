package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܳ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16042 implements InterfaceC22710 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C20738 f46442;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ActivityC18686 f46443;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C24164 f46444;

    public C16042(C20738 c20738, C24164 c24164, ActivityC18686 activityC18686) {
        this.f46442 = c20738;
        this.f46444 = c24164;
        this.f46443 = activityC18686;
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo24482() {
        return this.f46444.m53444();
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ܽ */
    public final ActivityC18686 mo24485() {
        return this.f46443;
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ۧ */
    public final void mo24484(int i) {
        this.f46444.m53436(i);
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ֫ */
    public final void mo24481(int i, int i2) {
        this.f46443.m12254(R.string.MT_Protector, C7050.m16203(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i)), false);
        C20738 c20738 = this.f46442;
        for (C24760 c24760 : c20738.f63990) {
            if (c24760.f78382) {
                c24760.f78381 = c24760.f78380;
                c24760.f78382 = false;
            }
        }
        c20738.f63996 = false;
        c20738.m46841();
        c20738.f63997.notifyDataSetChanged();
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ۧ */
    public final void mo24483() {
        this.f46444.m53442();
    }
}
