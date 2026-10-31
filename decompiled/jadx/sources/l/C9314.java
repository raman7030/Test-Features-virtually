package l;

import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۢۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 74MB */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9314 implements BiFunction {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C17167.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        String str = (String) obj;
        Iterator it = ((List) obj2).iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
