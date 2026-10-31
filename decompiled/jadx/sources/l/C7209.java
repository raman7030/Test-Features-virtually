package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X6MV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7209 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1852 f22064;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7209(C1852 c1852, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, -1);
        this.f22064 = c1852;
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
            long j = Long.parseLong(strTrim);
            if (j < 100000 || j > 1000000000) {
                m31263(R.string.MT_Protector);
                return;
            }
            C1852 c1852 = this.f22064;
            c1852.m11313().edit().putInt(c1852.m6911(), (int) j).apply();
            m31262();
        } catch (NumberFormatException unused) {
            m31263(R.string.MT_Protector);
        }
    }
}
