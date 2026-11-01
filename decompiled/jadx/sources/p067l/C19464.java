package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19464 extends AbstractDialogInterfaceOnClickListenerC3930 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ ActivityC12088 f59298;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19464(ActivityC12088 activityC12088, ActivityC12088 activityC12089) {
        super(activityC12089);
        this.f59298 = activityC12088;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC3930
    /* JADX INFO: renamed from: ܽ */
    public final void mo7754() {
        String strTrim = m7751().trim();
        try {
            if (strTrim.isEmpty()) {
                throw new NumberFormatException();
            }
            int i = Integer.parseInt(strTrim);
            if (i < 1 || i > 999) {
                C22682.m50793(R.string.MT_Protector);
            } else {
                this.f59298.f33782.m28454(i);
                m7748();
            }
        } catch (NumberFormatException unused) {
            C22682.m50793(R.string.MT_Protector);
        }
    }
}
