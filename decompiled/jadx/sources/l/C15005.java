package l;

/* JADX INFO: renamed from: l.ܶۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15005 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f45759;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC21357 f45760;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15005(ViewOnClickListenerC21357 viewOnClickListenerC21357, AbstractActivityC3346 abstractActivityC3346, AbstractC15440 abstractC15440) {
        super(abstractActivityC3346, -1);
        this.f45760 = viewOnClickListenerC21357;
        this.f45759 = abstractC15440;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        ActivityC22062 activityC22062 = this.f45760.f68803;
        AbstractC15440 abstractC15440 = this.f45759;
        String strM36517 = abstractC15440.m36517();
        String strTrim = m31260().trim();
        if (strTrim.isEmpty() || strTrim.equals(strM36517)) {
            m31262();
            return;
        }
        StringBuilder sbM15339 = C5368.m15339(strTrim);
        sbM15339.append(abstractC15440.m36505());
        AbstractC15440 abstractC15440M36524 = abstractC15440.m36524(sbM15339.toString());
        String strM39861 = C16999.m39861(abstractC15440, abstractC15440M36524);
        if (strM39861 != null) {
            m31251(strM39861);
            return;
        }
        C15528.m36596();
        C9068.m23429();
        m31262();
        activityC22062.f70695 = abstractC15440M36524.getName();
        ActivityC22062.m49637(activityC22062);
    }
}
