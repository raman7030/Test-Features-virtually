package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes4.dex */
public final class C14047 extends AbstractC1557 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8817 f42458 = C8817.m22790();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f42459;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7698 f42460;

    public C14047(C7698 c7698) {
        this.f42460 = c7698;
    }

    @Override // l.AbstractC1557
    /* JADX INFO: renamed from: ֫ */
    public final void mo5329(final String str, boolean z) {
        if (!z) {
            this.f42459 = str;
        }
        if (this.f42458.m22791()) {
            C4925.m14315(new Runnable() { // from class: l.ۛ᩶ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C7698 c7698 = this.f19450.f42460;
                    c7698.f23782.setText(C4925.m14306(R.string.MT_Protector, Integer.valueOf(c7698.f23779.f50492.size())));
                    c7698.f23784.setText(C6554.m18063(250, str));
                }
            });
        } else {
            if (z) {
                return;
            }
            C1802.m5990(this, 100L, new Runnable() { // from class: l.ۨ᩶ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    final C14047 c14047 = this.f35680;
                    C4925.m14315(new Runnable() { // from class: l.᩺᩶ܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C14047 c14048 = c14047;
                            C7698 c7698 = c14048.f42460;
                            c7698.f23782.setText(C4925.m14306(R.string.MT_Protector, Integer.valueOf(c7698.f23779.f50492.size())));
                            c7698.f23784.setText(C6554.m18063(250, c14048.f42459));
                        }
                    });
                }
            });
        }
    }
}
