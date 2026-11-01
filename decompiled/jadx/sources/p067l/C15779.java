package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܰ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C15779 implements InterfaceC4321 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C18402 f45675;

    @Override // p067l.InterfaceC4321
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ String mo8865() {
        return null;
    }

    @Override // p067l.InterfaceC4321
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo8868() {
        return false;
    }

    public C15779(C18402 c18402) {
        this.f45675 = c18402;
    }

    @Override // p067l.InterfaceC4321
    public final String getName() {
        return C7050.m16224(R.string.MT_Protector);
    }

    @Override // p067l.InterfaceC4321
    /* JADX INFO: renamed from: ۧ */
    public final C13596 mo8867() {
        return this.f45675.f54946;
    }

    @Override // p067l.InterfaceC4321
    /* JADX INFO: renamed from: ֫ */
    public final void mo8866(Main main) {
        if (!C24414.m53856()) {
            C22682.m50793(R.string.MT_Protector);
            new ViewOnClickListenerC2424(main).m3393();
        } else {
            ViewOnClickListenerC9062.m20968((AbstractActivityC5549) main, true);
        }
    }
}
