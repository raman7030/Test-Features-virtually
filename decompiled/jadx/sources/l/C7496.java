package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۟۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes3.dex */
public final class C7496 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22313 f23085;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1832 f23086;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7496(C1832 c1832, AbstractActivityC3346 abstractActivityC3346, C22313 c22313) {
        super(abstractActivityC3346, -1);
        this.f23086 = c1832;
        this.f23085 = c22313;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        m31262();
        String strM31260 = m31260();
        if (strM31260.isEmpty()) {
            return;
        }
        C22313 c22313 = this.f23085;
        if (strM31260.equals(c22313.f72330)) {
            return;
        }
        try {
            c22313.f72328.m36510(strM31260);
        } catch (IOException unused) {
        }
        C1832 c1832 = this.f23086;
        c1832.f6273 = c1832.f6275.m46433();
        c1832.f6277.notifyDataSetChanged();
    }
}
