package p067l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۧᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C0V */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC12984 extends Collection, InterfaceC2924 {
    boolean add(float f);

    @Override // java.util.Collection, p067l.InterfaceC12984
    @Deprecated
    boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable, p067l.InterfaceC2924
    InterfaceC3595 iterator();

    @Override // p067l.InterfaceC12984, p067l.InterfaceC3456
    @Deprecated
    /* JADX INFO: renamed from: parallelStream */
    InterfaceC19157 mo56527parallelStream();

    @Override // java.util.Collection, p067l.InterfaceC12984
    @Deprecated
    boolean remove(Object obj);

    @Override // java.util.Collection, java.lang.Iterable
    InterfaceC18327 spliterator();

    @Override // p067l.InterfaceC12984, p067l.InterfaceC3456
    @Deprecated
    /* JADX INFO: renamed from: stream */
    InterfaceC19157 mo56528stream();

    /* JADX INFO: renamed from: ֫ */
    boolean mo14152(InterfaceC24382 interfaceC24382);

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    boolean mo14153(Float f);

    /* JADX INFO: renamed from: ܳ */
    boolean mo18969(float f);

    /* JADX INFO: renamed from: ܿ */
    boolean mo6350(float f);
}
