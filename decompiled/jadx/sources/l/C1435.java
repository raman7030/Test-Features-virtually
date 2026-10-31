package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes2.dex */
public final class C1435 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15545 f5140;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1435(C15545 c15545, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, -1);
        this.f5140 = c15545;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        try {
            if (!this.f5140.f47931.m30457(Integer.parseInt(m31260()) - 1)) {
                m31263(R.string.MT_Protector);
                return;
            }
        } catch (Exception unused) {
        }
        m31262();
    }
}
