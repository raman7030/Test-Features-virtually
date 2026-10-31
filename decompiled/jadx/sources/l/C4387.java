package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AJZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4387 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2976 f14070;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4387(C2976 c2976, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, -1);
        this.f14070 = c2976;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strTrim = m31260().trim();
        if (strTrim.isEmpty()) {
            m31262();
            return;
        }
        try {
            int i = Integer.parseInt(strTrim);
            if (i < 0) {
                throw new NumberFormatException();
            }
            C2976 c2976 = this.f14070;
            c2976.m11313().edit().putInt(c2976.m6911(), i).apply();
            m31262();
        } catch (NumberFormatException unused) {
            m31263(R.string.MT_Protector);
        }
    }
}
