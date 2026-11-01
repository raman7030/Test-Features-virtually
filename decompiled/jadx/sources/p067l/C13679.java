package p067l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۨ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13679 {

    /* JADX INFO: renamed from: ֫ */
    public C4848 f38554;

    /* JADX INFO: renamed from: ֫ */
    public final void m31079(AbstractC9655 abstractC9655, AbstractC7783 abstractC7783) {
        m31078(abstractC7783, abstractC9655, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31080(AbstractC9655 abstractC9655, AbstractC7783 abstractC7783) {
        m31078(abstractC7783, abstractC9655, true);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m31078(AbstractC7783 abstractC7783, AbstractC9655 abstractC9655, boolean z) {
        C20271 c20271 = new C20271();
        for (WeakReference weakReference : this.f38554) {
            InterfaceC8314 interfaceC8314 = (InterfaceC8314) weakReference.get();
            if (interfaceC8314 != null) {
                if (z) {
                    interfaceC8314.mo4846(abstractC9655, abstractC7783);
                } else {
                    interfaceC8314.mo4845(abstractC9655, abstractC7783);
                }
                c20271.m45777(weakReference);
            }
        }
        this.f38554 = c20271.m45783();
    }
}
