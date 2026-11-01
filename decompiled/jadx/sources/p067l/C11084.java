package p067l;

import android.content.ComponentCallbacks2;

/* JADX INFO: renamed from: l.ۡ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6P1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11084 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9381 f30714;

    public C11084(AbstractC9381 abstractC9381) {
        this.f30714 = abstractC9381;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9381 m25531() {
        return this.f30714;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11084 m25530(InterfaceC24784 interfaceC24784) {
        return new C11084(interfaceC24784.getLifecycle());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11084 m25529(C14146 c14146) {
        InterfaceC24784 interfaceC24784M18997 = C8215.m18997(c14146);
        if (interfaceC24784M18997 == null) {
            ComponentCallbacks2 componentCallbacks2M17221 = C7453.m17221(c14146.getContext());
            if (componentCallbacks2M17221 instanceof InterfaceC24784) {
                interfaceC24784M18997 = (InterfaceC24784) componentCallbacks2M17221;
            }
        }
        return new C11084(interfaceC24784M18997 == null ? null : interfaceC24784M18997.getLifecycle());
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m25532() {
        AbstractC9381 abstractC9381 = this.f30714;
        return abstractC9381 == null || abstractC9381.mo21805() != EnumC15415.DESTROYED;
    }
}
