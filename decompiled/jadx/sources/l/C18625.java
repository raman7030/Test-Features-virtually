package l;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C4VL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18625 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43182(C3438 c3438, Set set) throws IOException {
        Iterator it = set.iterator();
        boolean z = true;
        while (it.hasNext()) {
            InterfaceC20561 interfaceC20561 = (InterfaceC20561) it.next();
            if (!z) {
                c3438.write(10);
            }
            c3438.getClass();
            c3438.write(".annotation ", 0, 12);
            c3438.write(C2253.m7460(interfaceC20561.getVisibility()));
            c3438.write(32);
            c3438.write(interfaceC20561.getType());
            c3438.write(10);
            AbstractC5924.m16612(c3438, interfaceC20561.getElements());
            c3438.write(".end annotation\n", 0, 16);
            z = false;
        }
    }
}
