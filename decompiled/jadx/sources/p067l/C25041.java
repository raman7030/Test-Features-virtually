package p067l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9F9 */
/* JADX INFO: loaded from: classes.dex */
public final class C25041 implements InterfaceC15532 {
    @Override // p067l.InterfaceC15532
    public final Long apply(Object obj) {
        Iterator it = ((List) obj).iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Long) it.next()).longValue();
        }
        return Long.valueOf(jLongValue);
    }
}
