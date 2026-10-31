package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9F9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23856 implements InterfaceC13851 {
    @Override // l.InterfaceC13851
    public final Long apply(Object obj) {
        Iterator it = ((List) obj).iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Long) it.next()).longValue();
        }
        return Long.valueOf(jLongValue);
    }
}
