package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C17988 extends AbstractDialogInterfaceOnClickListenerC1643 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10227 f56101;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17988(ActivityC10227 activityC10227, ActivityC10227 activityC10228) {
        super(activityC10228);
        this.f56101 = activityC10227;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC1643
    /* JADX INFO: renamed from: ܽ */
    public final void mo5524() {
        String strTrim = m5521().trim();
        try {
            if (strTrim.isEmpty()) {
                throw new NumberFormatException();
            }
            int i = Integer.parseInt(strTrim);
            if (i < 1 || i > 999) {
                C21374.m48457(R.string.MT_Protector);
            } else {
                this.f56101.f30821.m26421(i);
                m5518();
            }
        } catch (NumberFormatException unused) {
            C21374.m48457(R.string.MT_Protector);
        }
    }
}
