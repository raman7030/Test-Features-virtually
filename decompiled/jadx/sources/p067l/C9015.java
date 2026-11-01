package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۜ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B3J */
/* JADX INFO: loaded from: classes3.dex */
public class C9015 extends AbstractC11994 {

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC21323 f24466;

    public C9015(InterfaceC21323 interfaceC21323) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f24466 = interfaceC21323;
    }

    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ֫ */
    public final void mo7575(C18107 c18107) {
        InterfaceC21323 interfaceC21323 = this.f24466;
        C15957.m36232(c18107, interfaceC21323, interfaceC21323.mo15430());
    }

    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ܳ */
    public boolean mo11888() {
        C17969 c17969Mo15430 = this.f24466.mo15430();
        return !(c17969Mo15430.f53666 == null || c17969Mo15430.f53664.isEmpty());
    }
}
