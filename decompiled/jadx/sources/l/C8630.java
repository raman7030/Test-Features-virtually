package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: W7S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8630 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f26352;

    public C8630(C15684 c15684) {
        c15684.f48346.getClass();
        this.f26352 = new HashMap();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22393(C9378 c9378) {
        return this.f26352.containsKey(c9378);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m22391(AbstractC5144 abstractC5144) {
        C9336 c9336 = (C9336) this.f26352.get(abstractC5144);
        InterfaceC5102 interfaceC5102 = c9336 == null ? null : c9336.f28314;
        if (interfaceC5102 == null) {
            return null;
        }
        return interfaceC5102.getText();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22392(AbstractC5144 abstractC5144, InterfaceC5102 interfaceC5102) {
        this.f26352.put(abstractC5144, new C9336(interfaceC5102));
    }
}
