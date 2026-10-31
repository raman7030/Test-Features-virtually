package l;

/* JADX INFO: renamed from: l.۠ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7951 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13262 f24587;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC21357 f24588;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7951(ViewOnClickListenerC21357 viewOnClickListenerC21357, AbstractActivityC3346 abstractActivityC3346, AbstractC13262 abstractC13262) {
        super(abstractActivityC3346, -1);
        this.f24588 = viewOnClickListenerC21357;
        this.f24587 = abstractC13262;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        ActivityC22062 activityC22062 = this.f24588.f68803;
        AbstractC13262 abstractC13262 = this.f24587;
        String strMo14006 = abstractC13262.mo14006();
        String strTrim = m31260().trim();
        if (strTrim.isEmpty() || strTrim.equals(strMo14006)) {
            m31262();
            return;
        }
        String strSubstring = abstractC13262.mo14004().substring(strMo14006.length());
        String strMo14001 = abstractC13262.mo14001(strTrim);
        if (strMo14001 != null) {
            m31251(strMo14001);
            return;
        }
        C15528.m36596();
        C9068.m23429();
        m31262();
        activityC22062.f70704 = strTrim + strSubstring;
        ActivityC22062.m49637(activityC22062);
    }
}
