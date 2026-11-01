package p067l;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18802 extends InterfaceC4108 {
    @Override // java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    Object compute(Object obj, BiFunction biFunction);

    @Override // java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    Object computeIfAbsent(Object obj, Function function);

    @Override // java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    Object computeIfPresent(Object obj, BiFunction biFunction);

    @Override // java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    void forEach(BiConsumer biConsumer);

    @Override // java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    Object getOrDefault(Object obj, Object obj2);

    @Override // java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    Object merge(Object obj, Object obj2, BiFunction biFunction);

    @Override // java.util.concurrent.ConcurrentMap, p067l.InterfaceC18802, p067l.InterfaceC4108
    void replaceAll(BiFunction biFunction);
}
