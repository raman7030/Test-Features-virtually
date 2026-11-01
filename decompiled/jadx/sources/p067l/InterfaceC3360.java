package p067l;

import java.util.Collection;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.֨ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51QH */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3360 extends Collection, InterfaceC16080 {
    boolean add(int i);

    boolean contains(int i);

    @Override // java.util.Collection
    @Deprecated
    boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable, p067l.InterfaceC3360, p067l.InterfaceC16080
    InterfaceC8705 iterator();

    @Override // java.util.Collection
    @Deprecated
    InterfaceC19157 parallelStream();

    @Override // java.util.Collection
    @Deprecated
    boolean remove(Object obj);

    @Override // java.util.Collection, java.lang.Iterable
    InterfaceC18287 spliterator();

    @Override // java.util.Collection
    @Deprecated
    InterfaceC19157 stream();

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    boolean mo5870(Integer num);

    /* JADX INFO: renamed from: ֫ */
    boolean mo5871(IntPredicate intPredicate);

    /* JADX INFO: renamed from: ۖ */
    boolean mo5872(int i);

    /* JADX INFO: renamed from: ܶ */
    int[] mo5873();
}
