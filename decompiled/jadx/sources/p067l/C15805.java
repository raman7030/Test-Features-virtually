package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܰ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1E5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15805 implements InterfaceC6616 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ViewOnClickListenerC9771 f45739;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C24164 f45740;

    public C15805(ViewOnClickListenerC9771 viewOnClickListenerC9771, C24164 c24164) {
        this.f45739 = viewOnClickListenerC9771;
        this.f45740 = c24164;
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5692() {
        return this.f45740.m53444();
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ܽ */
    public final ActivityC18686 mo5695() {
        return this.f45739.f26993;
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ۧ */
    public final void mo5694(int i) {
        this.f45740.m53436(i);
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ֫ */
    public final void mo5690(int i) {
        this.f45740.m53431(C7050.m16203(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ֫ */
    public final void mo5691(C3263 c3263) {
        ViewOnClickListenerC9771 viewOnClickListenerC9771 = this.f45739;
        viewOnClickListenerC9771.f26991.m13321(c3263, viewOnClickListenerC9771.f26989);
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ۧ */
    public final void mo5693() {
        this.f45740.m53442();
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo5696() {
        return new C11981(this.f45739.f26993).m27416();
    }

    @Override // p067l.InterfaceC6616
    /* JADX INFO: renamed from: ᩳ */
    public final void mo5697() {
        C22682.m50799(R.string.MT_Protector);
    }
}
