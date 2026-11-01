package p067l;

import java.io.Serializable;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1FL */
/* JADX INFO: loaded from: classes5.dex */
public class C22807 implements InterfaceC3360, Serializable, InterfaceC3456 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC3360 f71862;

    @Override // java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final /* synthetic */ void forEach(Consumer consumer) {
        C18763.m42786(this, consumer);
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C7384.m17107(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC18287 spliterator() {
        throw null;
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // p067l.InterfaceC3360
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public boolean add(Integer num) {
        throw null;
    }

    @Override // java.util.Collection
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        add((Integer) obj);
        throw null;
    }

    public C22807(InterfaceC3340 interfaceC3340) {
        C12826.requireNonNull(interfaceC3340);
        this.f71862 = interfaceC3340;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC16080
    public void forEach(IntConsumer intConsumer) {
        this.f71862.forEach(intConsumer);
    }
}
