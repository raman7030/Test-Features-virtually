package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֨۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3459 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ C20115 f6929;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C5471 f6930;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ DialogInterfaceC2564 f6931;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3459(C5471 c5471, AbstractActivityC5549 abstractActivityC5549, C20115 c20115, DialogInterfaceC2564 dialogInterfaceC2564) {
        super(abstractActivityC5549, -1);
        this.f6930 = c5471;
        this.f6929 = c20115;
        this.f6931 = dialogInterfaceC2564;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.֡۬᩻] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ۚ۬᩻] */
    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        final String strTrim = m33346().trim();
        try {
            C7374.m17086(strTrim);
            C5471 c5471 = this.f6930;
            if (c5471.f13048) {
                return;
            }
            final C20115 c20115 = this.f6929;
            ?? r2 = new InterfaceC16869() { // from class: l.֡۬᩻
                @Override // p067l.InterfaceC16869
                public final C6033 run() {
                    C5471 c5472 = this.f4706.f6930;
                    C20115 c20116 = c20115;
                    String str = strTrim;
                    if (c20116 == null) {
                        return c5472.f13052.m17087(str);
                    }
                    c5472.f13052.m17090(c20116.f62234, str);
                    return null;
                }
            };
            final DialogInterfaceC2564 dialogInterfaceC2564 = this.f6931;
            c5471.m12024((InterfaceC16869) r2, (Runnable) new Runnable() { // from class: l.ۚ۬᩻
                @Override // java.lang.Runnable
                public final void run() {
                    DialogInterfaceC2564 dialogInterfaceC2565 = dialogInterfaceC2564;
                    if (dialogInterfaceC2565 == null || !dialogInterfaceC2565.m3855()) {
                        return;
                    }
                    dialogInterfaceC2565.m3857(strTrim);
                }
            });
            m33348();
        } catch (IllegalArgumentException unused) {
            m33349(R.string.MT_Protector);
        }
    }
}
