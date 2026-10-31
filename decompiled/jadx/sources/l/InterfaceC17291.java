package l;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC17291 extends InterfaceC1830 {
    @Override // java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    Object compute(Object obj, BiFunction biFunction);

    @Override // java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    Object computeIfAbsent(Object obj, Function function);

    @Override // java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    Object computeIfPresent(Object obj, BiFunction biFunction);

    @Override // java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    void forEach(BiConsumer biConsumer);

    @Override // java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    Object getOrDefault(Object obj, Object obj2);

    @Override // java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    Object merge(Object obj, Object obj2, BiFunction biFunction);

    @Override // java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    void replaceAll(BiFunction biFunction);
}
