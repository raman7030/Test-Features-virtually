package l;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9527 extends AbstractMap {
    /* JADX INFO: renamed from: ֫ */
    public abstract Iterator mo15281();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C20816(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Iterator itMo15281 = mo15281();
        itMo15281.getClass();
        while (itMo15281.hasNext()) {
            itMo15281.next();
            itMo15281.remove();
        }
    }
}
