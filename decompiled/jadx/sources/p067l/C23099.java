package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩸᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14V2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23099 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ C21249 f72595;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC21758 f72596;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ String f72597;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23099(ActivityC21758 activityC21758, AbstractActivityC5549 abstractActivityC5549, String str, C21249 c21249) {
        super(abstractActivityC5549, -1);
        this.f72596 = activityC21758;
        this.f72597 = str;
        this.f72595 = c21249;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        if (strM33346.length() == 0 || strM33346.equalsIgnoreCase(this.f72597)) {
            m33348();
            return;
        }
        AbstractC17043 abstractC17043M48002 = this.f72595.m48002();
        AbstractC17043 abstractC17043M38682 = abstractC17043M48002.m38682(strM33346.concat(".mtd"));
        if (abstractC17043M38682.mo25094()) {
            m33349(R.string.MT_Protector);
            return;
        }
        abstractC17043M48002.mo25502(abstractC17043M38682);
        ActivityC21758.m49046(this.f72596);
        m33348();
    }
}
