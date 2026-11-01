package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C14217 implements InterfaceC12647 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ViewOnClickListenerC9523 f40501;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractActivityC5549 f40502;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ AbstractC17043 f40503;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ AbstractC17043 f40504;

    @Override // p067l.InterfaceC12647
    /* JADX INFO: renamed from: ܽ */
    public final String mo29077() {
        return "Dex2Smali";
    }

    public C14217(ViewOnClickListenerC9523 viewOnClickListenerC9523, AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, AbstractActivityC5549 abstractActivityC5549) {
        this.f40501 = viewOnClickListenerC9523;
        this.f40503 = abstractC17043;
        this.f40504 = abstractC17044;
        this.f40502 = abstractActivityC5549;
    }

    @Override // p067l.InterfaceC12647
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC17043 mo29078() {
        return this.f40503;
    }

    @Override // p067l.InterfaceC12647
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 mo29074() {
        return this.f40504;
    }

    @Override // p067l.InterfaceC12647
    /* JADX INFO: renamed from: ۧ */
    public final AbstractActivityC5549 mo29076() {
        return this.f40502;
    }

    @Override // p067l.InterfaceC12647
    /* JADX INFO: renamed from: ֫ */
    public final void mo29075(AbstractC17043 abstractC17043) {
        String strMo25505 = abstractC17043.mo25505();
        ViewOnClickListenerC9523 viewOnClickListenerC9523 = this.f40501;
        new C8182(viewOnClickListenerC9523, (AbstractActivityC5549) viewOnClickListenerC9523.requireActivity(), strMo25505, new ArrayList(), true).m22250();
    }
}
