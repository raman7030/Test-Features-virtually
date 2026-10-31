package l;

import java.util.Collection;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.֨ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51QH */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1043 extends Collection, InterfaceC14427 {
    boolean add(int i);

    boolean contains(int i);

    @Override // java.util.Collection
    @Deprecated
    boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1043, l.InterfaceC14427
    InterfaceC6667 iterator();

    @Override // java.util.Collection
    @Deprecated
    InterfaceC17664 parallelStream();

    @Override // java.util.Collection
    @Deprecated
    boolean remove(Object obj);

    @Override // java.util.Collection, java.lang.Iterable
    InterfaceC16749 spliterator();

    @Override // java.util.Collection
    @Deprecated
    InterfaceC17664 stream();

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    boolean mo3583(Integer num);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    boolean mo3584(IntPredicate intPredicate);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    boolean mo3585(int i);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    int[] mo3586();
}
