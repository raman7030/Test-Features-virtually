package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.۟۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68XX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7483 {
    /* JADX INFO: renamed from: ֫ */
    public abstract Collection mo5986();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo20106(InterfaceC3458 interfaceC3458, AbstractC2143 abstractC2143, InterfaceC15243 interfaceC15243);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20105(InterfaceC3458 interfaceC3458, AbstractC2143 abstractC2143, InterfaceC1133 interfaceC1133) {
        for (InterfaceC1133 interfaceC1134 : interfaceC1133.mo3872()) {
            if (interfaceC1134.isClosed()) {
                AbstractC7483 abstractC7483Mo7071 = abstractC2143.mo7071(interfaceC1134.name());
                if (abstractC7483Mo7071 != null) {
                    abstractC7483Mo7071.mo20106(interfaceC3458, abstractC2143, (InterfaceC15243) interfaceC1134);
                } else {
                    m20105(interfaceC3458, abstractC2143, interfaceC1134);
                }
            }
        }
    }
}
