package p067l;

/* JADX INFO: renamed from: l.۠ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes3.dex */
public final class C9925 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ AbstractC14973 f27500;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ViewOnClickListenerC22666 f27501;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9925(ViewOnClickListenerC22666 viewOnClickListenerC22666, AbstractActivityC5549 abstractActivityC5549, AbstractC14973 abstractC14973) {
        super(abstractActivityC5549, -1);
        this.f27501 = viewOnClickListenerC22666;
        this.f27500 = abstractC14973;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        ActivityC23336 activityC23336 = this.f27501.f71497;
        AbstractC14973 abstractC14973 = this.f27500;
        String strMo15886 = abstractC14973.mo15886();
        String strTrim = m33346().trim();
        if (strTrim.isEmpty() || strTrim.equals(strMo15886)) {
            m33348();
            return;
        }
        String strSubstring = abstractC14973.mo15884().substring(strMo15886.length());
        String strMo15881 = abstractC14973.mo15881(strTrim);
        if (strMo15881 != null) {
            m33337(strMo15881);
            return;
        }
        C17127.m38756();
        C10987.m25375();
        m33348();
        activityC23336.f73421 = strTrim + strSubstring;
        ActivityC23336.m51973(activityC23336);
    }
}
