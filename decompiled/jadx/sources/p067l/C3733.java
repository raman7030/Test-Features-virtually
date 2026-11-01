package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֨᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes2.dex */
public final class C3733 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C17143 f7913;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3733(C17143 c17143, AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549, -1);
        this.f7913 = c17143;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        try {
            if (!this.f7913.f51063.m32521(Integer.parseInt(m33346()) - 1)) {
                m33349(R.string.MT_Protector);
                return;
            }
        } catch (Exception unused) {
        }
        m33348();
    }
}
