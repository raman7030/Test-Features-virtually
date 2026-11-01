package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes3.dex */
public final class C10587 implements InterfaceC6996 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C22658 f29315;

    public C10587(C22658 c22658) {
        this.f29315 = c22658;
    }

    @Override // p067l.InterfaceC6996
    /* JADX INFO: renamed from: ֫ */
    public final void mo3729(InterfaceC5655 interfaceC5655, AbstractC2555 abstractC2555) {
        String strM33421 = ((C14625) abstractC2555).m33421();
        interfaceC5655.builder().m43999(strM33421);
        C22658 c22658 = this.f29315;
        if (c22658.f71481.isEmpty()) {
            return;
        }
        interfaceC5655.length();
        strM33421.length();
        Iterator it = c22658.f71481.iterator();
        while (it.hasNext()) {
            ((InterfaceC16621) it.next()).m37693();
        }
    }
}
