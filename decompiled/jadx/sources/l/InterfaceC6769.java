package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۜ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC6769 extends InterfaceC20881 {
    @Override // java.util.Iterator, l.InterfaceC12433
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(LongConsumer longConsumer);

    @Override // java.util.Iterator
    Long next();

    long nextLong();
}
