package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC14147 extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    Iterator iterator();

    InterfaceC14147 onClose(Runnable runnable);

    InterfaceC14147 parallel();

    InterfaceC14147 sequential();

    InterfaceC16847 spliterator();

    InterfaceC14147 unordered();
}
