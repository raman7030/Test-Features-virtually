package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5985 implements InterfaceC6616 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ViewOnClickListenerC20067 f14811;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ActivityC18686 f14812;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C24164 f14813;

    public C5985(ViewOnClickListenerC20067 viewOnClickListenerC20067, C24164 c24164, ActivityC18686 activityC18686) {
        this.f14811 = viewOnClickListenerC20067;
        this.f14813 = c24164;
        this.f14812 = activityC18686;
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5692() {
        return this.f14813.m53444();
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ܽ */
    public final ActivityC18686 mo5695() {
        return this.f14812;
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ۧ */
    public final void mo5694(int i) {
        this.f14813.m53436(i);
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ֫ */
    public final void mo5690(int i) {
        this.f14813.m53431(C7050.m16203(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ֫ */
    public final void mo5691(C3263 c3263) {
        this.f14811.f60971.f63999.m13321(c3263, false);
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ۧ */
    public final void mo5693() {
        this.f14813.m53442();
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo5696() {
        return new C11981(this.f14812).m27416();
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ᩳ */
    public final void mo5697() {
        C22682.m50799(R.string.MT_Protector);
    }
}
