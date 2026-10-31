package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۨ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11901 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2609 f35544;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29027(AbstractC7667 abstractC7667, AbstractC5698 abstractC5698) {
        m29026(abstractC5698, abstractC7667, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29028(AbstractC7667 abstractC7667, AbstractC5698 abstractC5698) {
        m29026(abstractC5698, abstractC7667, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29026(AbstractC5698 abstractC5698, AbstractC7667 abstractC7667, boolean z) {
        C18837 c18837 = new C18837();
        for (WeakReference weakReference : this.f35544) {
            InterfaceC6256 interfaceC6256 = (InterfaceC6256) weakReference.get();
            if (interfaceC6256 != null) {
                if (z) {
                    interfaceC6256.mo2490(abstractC7667, abstractC5698);
                } else {
                    interfaceC6256.mo2489(abstractC7667, abstractC5698);
                }
                c18837.m43511(weakReference);
            }
        }
        this.f35544 = c18837.m43517();
    }
}
