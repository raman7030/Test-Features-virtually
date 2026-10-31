package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC12393 extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    Iterator iterator();

    InterfaceC12393 onClose(Runnable runnable);

    InterfaceC12393 parallel();

    InterfaceC12393 sequential();

    InterfaceC15234 spliterator();

    InterfaceC12393 unordered();
}
