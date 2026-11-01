package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94PF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6373 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ AbstractC17043 f16496;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C3019 f16497;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6373(C3019 c3019, AbstractActivityC5549 abstractActivityC5549, AbstractC17043 abstractC17043) {
        super(abstractActivityC5549, -1);
        this.f16497 = c3019;
        this.f16496 = abstractC17043;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        AbstractC17043 abstractC17043 = this.f16496;
        String name = abstractC17043.getName();
        String strM33346 = m33346();
        if (name.equals(strM33346)) {
            m33348();
            return;
        }
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38672().m38684(strM33346);
        boolean zEqualsIgnoreCase = name.equalsIgnoreCase(strM33346);
        C3019 c3019 = this.f16497;
        if (!zEqualsIgnoreCase) {
            if (abstractC17043M38684.mo25094()) {
                m33349(R.string.MT_Protector);
                return;
            }
            abstractC17043.mo25502(abstractC17043M38684);
            c3019.m5114();
            m33348();
            return;
        }
        AbstractC17043 abstractC17043M38678 = abstractC17043.m38678(".tmp");
        abstractC17043.mo25502(abstractC17043M38678);
        abstractC17043M38678.mo25502(abstractC17043M38684);
        c3019.m5114();
        m33348();
    }
}
