package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܰ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15384 extends AbstractDialogInterfaceOnClickListenerC14580 {
    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strTrim = m33346().trim();
        if (!strTrim.isEmpty()) {
            if (C4361.m9083(-1, strTrim)) {
                m33349(R.string.MT_Protector);
                return;
            } else {
                C4361.m9077(strTrim);
                m33348();
                return;
            }
        }
        m33348();
    }
}
