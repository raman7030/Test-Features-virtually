package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܰ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes4.dex */
public final class C15719 extends AbstractC3848 {

    /* JADX INFO: renamed from: ֫ */
    public C10748 f45541 = C10748.m24760();

    /* JADX INFO: renamed from: ۧ */
    public String f45542;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C9685 f45543;

    public C15719(C9685 c9685) {
        this.f45543 = c9685;
    }

    @Override // p067l.AbstractC3848
    /* JADX INFO: renamed from: ֫ */
    public final void mo7558(final String str, boolean z) {
        if (!z) {
            this.f45542 = str;
        }
        if (this.f45541.m24761()) {
            C7050.m16212(new Runnable() { // from class: l.ۛ᩶ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C9685 c9685 = this.f22313.f45543;
                    c9685.f26695.setText(C7050.m16203(R.string.MT_Protector, Integer.valueOf(c9685.f26692.f53664.size())));
                    c9685.f26697.setText(C8597.m20013(250, str));
                }
            });
        } else {
            if (z) {
                return;
            }
            C4081.m8187(this, 100L, new Runnable() { // from class: l.ۨ᩶ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    final C15719 c15719 = this.f38689;
                    C7050.m16212(new Runnable() { // from class: l.᩺᩶ܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C15719 c157110 = c15719;
                            C9685 c9685 = c157110.f45543;
                            c9685.f26695.setText(C7050.m16203(R.string.MT_Protector, Integer.valueOf(c9685.f26692.f53664.size())));
                            c9685.f26697.setText(C8597.m20013(250, c157110.f45542));
                        }
                    });
                }
            });
        }
    }
}
