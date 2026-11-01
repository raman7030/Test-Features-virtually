package p067l;

import android.widget.ImageView;

/* JADX INFO: renamed from: l.ܳۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C12B */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15977 implements InterfaceC9311, InterfaceC4522 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f46276;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f46277;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f46278;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f46279;

    public /* synthetic */ C15977(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f46278 = obj;
        this.f46279 = obj2;
        this.f46277 = obj3;
        this.f46276 = obj4;
    }

    @Override // p067l.InterfaceC9311
    /* JADX INFO: renamed from: ֫ */
    public void mo12963(C12073 c12073) {
        C17318.m39303((C17318) this.f46278, (C12073) this.f46279, (C4697) this.f46277, (C18107) this.f46276, c12073);
    }

    @Override // p067l.InterfaceC4522
    /* JADX INFO: renamed from: ۧ */
    public void mo9575(int i) {
        C13776 c13776 = (C13776) this.f46278;
        ImageView imageView = (ImageView) this.f46279;
        InterfaceC16397 interfaceC16397 = (InterfaceC16397) this.f46277;
        C22551 c22551 = (C22551) this.f46276;
        EnumC8411 enumC8411 = EnumC8411.IMMUTABLE;
        c13776.f38942 = i;
        c13776.f38944 = enumC8411;
        imageView.setImageBitmap(interfaceC16397.mo34535(c13776));
        if (c22551.mo50536()) {
            c22551.m50537();
            ((DialogInterfaceC2564) c22551.mo17723()).m3854(false);
        }
    }
}
