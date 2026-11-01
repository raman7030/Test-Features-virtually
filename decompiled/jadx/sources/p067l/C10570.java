package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: W7S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10570 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f29270;

    public C10570(C17274 c17274) {
        c17274.f51484.getClass();
        this.f29270 = new HashMap();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m24362(C11281 c11281) {
        return this.f29270.containsKey(c11281);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m24360(AbstractC7257 abstractC7257) {
        C11241 c11241 = (C11241) this.f29270.get(abstractC7257);
        InterfaceC7217 interfaceC7217 = c11241 == null ? null : c11241.f31264;
        if (interfaceC7217 == null) {
            return null;
        }
        return interfaceC7217.getText();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24361(AbstractC7257 abstractC7257, InterfaceC7217 interfaceC7217) {
        this.f29270.put(abstractC7257, new C11241(interfaceC7217));
    }
}
