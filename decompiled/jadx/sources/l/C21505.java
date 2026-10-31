package l;

import java.io.Serializable;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1FL */
/* JADX INFO: loaded from: classes5.dex */
public class C21505 implements InterfaceC1043, Serializable, InterfaceC1144 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC1043 f69165;

    @Override // java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final /* synthetic */ void forEach(Consumer consumer) {
        C17250.m40537(this, consumer);
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C5277.m15204(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC16749 spliterator() {
        throw null;
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // l.InterfaceC1043
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

    public C21505(InterfaceC1022 interfaceC1022) {
        C11003.requireNonNull(interfaceC1022);
        this.f69165 = interfaceC1022;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC14427
    public void forEach(IntConsumer intConsumer) {
        this.f69165.forEach(intConsumer);
    }
}
