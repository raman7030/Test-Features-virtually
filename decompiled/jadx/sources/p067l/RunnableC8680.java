package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۜ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8680 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractActivityC5549 f23299;

    @Override // java.lang.Runnable
    public final void run() {
        AbstractActivityC5549 abstractActivityC5549 = this.f23299;
        C20751 c20751 = new C20751(abstractActivityC5549, R.string.MT_Protector);
        c20751.m33335(new C5998(c20751));
        c20751.m33344(R.string.MT_Protector);
        String string = ApplicationC21448.f67649.getString("rdtp", "yyyy-MM-dd_HH-mm-ss");
        c20751.m33336((CharSequence) (string.trim().isEmpty() ? "yyyy-MM-dd_HH-mm-ss" : string));
        c20751.m33342(R.string.MT_Protector);
        c20751.m33341().setPadding(0, C13076.m29939(6.0f), 0, 0);
        c20751.m33367();
        c20751.m33352(true);
        DialogInterfaceC2564 dialogInterfaceC2564M33364 = c20751.m33364();
        C10884.m25071(dialogInterfaceC2564M33364);
        C7050.m16206(1000L, new RunnableC20080(c20751, dialogInterfaceC2564M33364));
        dialogInterfaceC2564M33364.m3861().setOnClickListener(new ViewOnClickListenerC10554(abstractActivityC5549, 1));
    }
}
