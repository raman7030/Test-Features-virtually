package p067l;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11423 extends AbstractMap {
    /* JADX INFO: renamed from: ֫ */
    public abstract Iterator mo17188();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C22152(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Iterator itMo17188 = mo17188();
        itMo17188.getClass();
        while (itMo17188.hasNext()) {
            itMo17188.next();
            itMo17188.remove();
        }
    }
}
