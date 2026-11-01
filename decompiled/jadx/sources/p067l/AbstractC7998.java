package p067l;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A5T6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7998 {
    /* JADX INFO: renamed from: ֫ */
    public static void m18538(C5636 c5636, Set set) throws IOException {
        c5636.m12536();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC11180 interfaceC11180 = (InterfaceC11180) it.next();
            c5636.write(interfaceC11180.getName());
            c5636.write(" = ", 0, 3);
            AbstractC13363.m30508(c5636, interfaceC11180.getValue());
            c5636.write(10);
        }
        c5636.m12532();
    }
}
