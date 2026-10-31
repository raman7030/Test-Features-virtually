package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12241 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36492;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11536 f36493;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12241(ActivityC11536 activityC11536, AbstractActivityC3346 abstractActivityC3346, int i) {
        super(abstractActivityC3346, -1);
        this.f36493 = activityC11536;
        this.f36492 = i;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        int i;
        try {
            i = Integer.parseInt(m31260());
        } catch (Exception unused) {
            i = 0;
        }
        if (i <= 0) {
            m31262();
        } else if (i > this.f36492) {
            C21374.m48457(R.string.MT_Protector);
        } else {
            new C12946(this, i).m20274();
        }
    }
}
