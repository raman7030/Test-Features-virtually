package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۟۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9350 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C15579 f25478;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9350(AbstractActivityC5549 abstractActivityC5549, C15579 c15579) {
        super(abstractActivityC5549, -1);
        this.f25478 = c15579;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strTrim = m33346().trim();
        if (!strTrim.isEmpty()) {
            C15579 c15579 = this.f25478;
            String str = c15579.f44505;
            int i = c15579.f44504;
            if (!strTrim.equals(str)) {
                if (C4361.m9083(i, strTrim)) {
                    m33349(R.string.MT_Protector);
                    return;
                } else {
                    C4361.m9088(i, strTrim);
                    m33348();
                    return;
                }
            }
        }
        m33348();
    }
}
