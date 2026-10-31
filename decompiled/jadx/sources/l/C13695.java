package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13695 extends AbstractDialogInterfaceOnClickListenerC12849 {
    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strTrim = m31260().trim();
        if (!strTrim.isEmpty()) {
            if (C2096.m6957(-1, strTrim)) {
                m31263(R.string.MT_Protector);
                return;
            } else {
                C2096.m6951(strTrim);
                m31262();
                return;
            }
        }
        m31262();
    }
}
