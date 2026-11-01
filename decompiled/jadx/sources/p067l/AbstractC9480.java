package p067l;

import java.util.Collection;

/* JADX INFO: renamed from: l.۟۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68XX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9480 {
    /* JADX INFO: renamed from: ֫ */
    public abstract Collection mo8183();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo22082(InterfaceC5655 interfaceC5655, AbstractC4406 abstractC4406, InterfaceC16855 interfaceC16855);

    /* JADX INFO: renamed from: ֫ */
    public static void m22081(InterfaceC5655 interfaceC5655, AbstractC4406 abstractC4406, InterfaceC3445 interfaceC3445) {
        for (InterfaceC3445 interfaceC3446 : interfaceC3445.mo6113()) {
            if (interfaceC3446.isClosed()) {
                AbstractC9480 abstractC9480Mo9166 = abstractC4406.mo9166(interfaceC3446.name());
                if (abstractC9480Mo9166 != null) {
                    abstractC9480Mo9166.mo22082(interfaceC5655, abstractC4406, (InterfaceC16855) interfaceC3446);
                } else {
                    m22081(interfaceC5655, abstractC4406, interfaceC3446);
                }
            }
        }
    }
}
