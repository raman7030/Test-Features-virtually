package p067l;

/* JADX INFO: renamed from: l.ܶۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16629 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ AbstractC17043 f48872;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ViewOnClickListenerC22666 f48873;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16629(ViewOnClickListenerC22666 viewOnClickListenerC22666, AbstractActivityC5549 abstractActivityC5549, AbstractC17043 abstractC17043) {
        super(abstractActivityC5549, -1);
        this.f48873 = viewOnClickListenerC22666;
        this.f48872 = abstractC17043;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        ActivityC23336 activityC23336 = this.f48873.f71497;
        AbstractC17043 abstractC17043 = this.f48872;
        String strM38675 = abstractC17043.m38675();
        String strTrim = m33346().trim();
        if (strTrim.isEmpty() || strTrim.equals(strM38675)) {
            m33348();
            return;
        }
        StringBuilder sbM17248 = C7470.m17248(strTrim);
        sbM17248.append(abstractC17043.m38663());
        AbstractC17043 abstractC17043M38682 = abstractC17043.m38682(sbM17248.toString());
        String strM42104 = C18524.m42104(abstractC17043, abstractC17043M38682);
        if (strM42104 != null) {
            m33337(strM42104);
            return;
        }
        C17127.m38756();
        C10987.m25375();
        m33348();
        activityC23336.f73412 = abstractC17043M38682.getName();
        ActivityC23336.m51973(activityC23336);
    }
}
