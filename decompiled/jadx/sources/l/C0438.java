package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0438 {
    public static boolean $default$removeIf(Collection collection, Predicate predicate) {
        C11003.requireNonNull(predicate);
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
