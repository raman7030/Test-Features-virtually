package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes4.dex */
public final class C13300 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6951 f39815;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39816;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13300(AbstractActivityC3346 abstractActivityC3346, C6951 c6951, int i) {
        super(abstractActivityC3346, -1);
        this.f39815 = c6951;
        this.f39816 = i;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        if (strM31260.isEmpty() || strM31260.equals(this.f39815.m18794())) {
            m31262();
        } else if (C9068.m23419(strM31260)) {
            m31263(R.string.MT_Protector);
        } else {
            C9068.m23399(this.f39816, strM31260);
            m31262();
        }
    }
}
