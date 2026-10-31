package l;

import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17997 {
    public static /* synthetic */ Object compute(ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
        return concurrentMap instanceof InterfaceC17291 ? ((InterfaceC17291) concurrentMap).compute(obj, biFunction) : C16585.$default$compute(concurrentMap, obj, biFunction);
    }

    public static /* synthetic */ Object computeIfAbsent(ConcurrentMap concurrentMap, Object obj, Function function) {
        return concurrentMap instanceof InterfaceC17291 ? ((InterfaceC17291) concurrentMap).computeIfAbsent(obj, function) : C16585.$default$computeIfAbsent(concurrentMap, obj, function);
    }

    public static /* synthetic */ void forEach(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        if (concurrentMap instanceof InterfaceC17291) {
            ((InterfaceC17291) concurrentMap).forEach(biConsumer);
        } else {
            C16585.$default$forEach(concurrentMap, biConsumer);
        }
    }
}
