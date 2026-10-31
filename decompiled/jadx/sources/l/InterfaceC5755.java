package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۛ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBNY */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5755 extends Collection, InterfaceC9552 {
    @Override // java.util.Collection
    @Deprecated
    boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC9552
    InterfaceC15900 iterator();

    @Override // java.util.Collection
    @Deprecated
    InterfaceC17664 parallelStream();

    @Override // java.util.Collection
    @Deprecated
    boolean remove(Object obj);

    @Override // java.util.Collection, java.lang.Iterable
    InterfaceC16770 spliterator();

    @Override // java.util.Collection
    @Deprecated
    InterfaceC17664 stream();

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    boolean mo16206(Character ch);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    boolean mo16207(InterfaceC6023 interfaceC6023);

    /* JADX INFO: renamed from: ۧ */
    boolean mo8955(char c);

    /* JADX INFO: renamed from: ܿ */
    boolean mo2005(char c);

    /* JADX INFO: renamed from: ᩻ */
    boolean mo8956(char c);
}
