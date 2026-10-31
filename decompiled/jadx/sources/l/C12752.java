package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F6LO */
/* JADX INFO: loaded from: classes3.dex */
public final class C12752 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f38333 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f38334 = new HashMap(32);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31053(InterfaceC5012 interfaceC5012) {
        this.f38333.add(interfaceC5012);
        Iterator it = interfaceC5012.mo14504().iterator();
        while (it.hasNext()) {
            C13843.putIfAbsent(this.f38334, (Class) it.next(), interfaceC5012);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31055(AbstractC0197 abstractC0197) {
        InterfaceC5012 interfaceC5012 = (InterfaceC5012) this.f38334.get(abstractC0197.getClass());
        if (interfaceC5012 != null) {
            interfaceC5012.mo14503(abstractC0197);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31054(AbstractC0197 abstractC0197) {
        C19846.forEach(this.f38333, new C12741(2, abstractC0197));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31052(AbstractC0197 abstractC0197) {
        C19846.forEach(this.f38333, new C19557(1, abstractC0197));
    }
}
