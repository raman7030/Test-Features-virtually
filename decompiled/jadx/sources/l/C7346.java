package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7346 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13900 f22565;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7346(AbstractActivityC3346 abstractActivityC3346, C13900 c13900) {
        super(abstractActivityC3346, -1);
        this.f22565 = c13900;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strTrim = m31260().trim();
        if (!strTrim.isEmpty()) {
            C13900 c13900 = this.f22565;
            String str = c13900.f41424;
            int i = c13900.f41423;
            if (!strTrim.equals(str)) {
                if (C2096.m6957(i, strTrim)) {
                    m31263(R.string.MT_Protector);
                    return;
                } else {
                    C2096.m6962(i, strTrim);
                    m31262();
                    return;
                }
            }
        }
        m31262();
    }
}
