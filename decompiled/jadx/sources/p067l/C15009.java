package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes4.dex */
public final class C15009 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ C8975 f42882;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ int f42883;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15009(AbstractActivityC5549 abstractActivityC5549, C8975 c8975, int i) {
        super(abstractActivityC5549, -1);
        this.f42882 = c8975;
        this.f42883 = i;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        if (strM33346.isEmpty() || strM33346.equals(this.f42882.m20748())) {
            m33348();
        } else if (C10987.m25365(strM33346)) {
            m33349(R.string.MT_Protector);
        } else {
            C10987.m25345(this.f42883, strM33346);
            m33348();
        }
    }
}
