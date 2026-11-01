package p067l;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C4VL */
/* JADX INFO: loaded from: classes4.dex */
public final class C20069 {
    /* JADX INFO: renamed from: ֫ */
    public static void m45448(C5636 c5636, Set set) throws IOException {
        Iterator it = set.iterator();
        boolean z = true;
        while (it.hasNext()) {
            InterfaceC21909 interfaceC21909 = (InterfaceC21909) it.next();
            if (!z) {
                c5636.write(10);
            }
            c5636.getClass();
            c5636.write(".annotation ", 0, 12);
            c5636.write(C4509.m9542(interfaceC21909.getVisibility()));
            c5636.write(32);
            c5636.write(interfaceC21909.getType());
            c5636.write(10);
            AbstractC7998.m18538(c5636, interfaceC21909.getElements());
            c5636.write(".end annotation\n", 0, 16);
            z = false;
        }
    }
}
