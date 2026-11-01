package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֨ۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3274 implements InterfaceC6616 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ViewOnClickListenerC9980 f6359;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ActivityC18686 f6360;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C24164 f6361;

    public C3274(ViewOnClickListenerC9980 viewOnClickListenerC9980, C24164 c24164, ActivityC18686 activityC18686) {
        this.f6359 = viewOnClickListenerC9980;
        this.f6361 = c24164;
        this.f6360 = activityC18686;
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5692() {
        return this.f6361.m53444();
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ܽ */
    public final ActivityC18686 mo5695() {
        return this.f6360;
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ۧ */
    public final void mo5694(int i) {
        this.f6361.m53436(i);
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ֫ */
    public final void mo5690(int i) {
        this.f6361.m53431(C7050.m16203(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ֫ */
    public final void mo5691(C3263 c3263) {
        this.f6359.f27648.f49119.m13342(c3263, false);
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ۧ */
    public final void mo5693() {
        this.f6361.m53442();
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo5696() {
        return new C11981(this.f6360).m27416();
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ᩳ */
    public final void mo5697() {
        C22682.m50799(R.string.MT_Protector);
    }
}
