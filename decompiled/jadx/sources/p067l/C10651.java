package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10651 implements InterfaceC22710 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C16684 f29448;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ActivityC18686 f29449;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C24164 f29450;

    public C10651(C16684 c16684, C24164 c24164, ActivityC18686 activityC18686) {
        this.f29448 = c16684;
        this.f29450 = c24164;
        this.f29449 = activityC18686;
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo24482() {
        return this.f29450.m53444();
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ܽ */
    public final ActivityC18686 mo24485() {
        return this.f29449;
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ۧ */
    public final void mo24484(int i) {
        this.f29450.m53436(i);
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ֫ */
    public final void mo24481(int i, int i2) {
        this.f29449.m12254(R.string.MT_Protector, C7050.m16203(R.string.MT_Protector, Integer.valueOf(i2), Integer.valueOf(i)), false);
        C16684 c16684 = this.f29448;
        for (C17355 c17355 : c16684.f49116) {
            if (c17355.f51753) {
                c17355.f51752 = c17355.f51751;
                c17355.f51753 = false;
            }
        }
        c16684.f49118 = false;
        c16684.m37788();
        c16684.f49117.notifyDataSetChanged();
    }

    @Override // p067l.InterfaceC22710
    /* JADX INFO: renamed from: ۧ */
    public final void mo24483() {
        this.f29450.m53442();
    }
}
