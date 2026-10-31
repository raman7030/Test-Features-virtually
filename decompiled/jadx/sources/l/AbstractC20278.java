package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩶ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBWB */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20278 implements InterfaceC23455, InterfaceC12433 {
    @Override // l.InterfaceC6769, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C14282.m34066(this, consumer);
    }

    @Override // l.InterfaceC20881
    public /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C23702.$default$forEachRemaining((InterfaceC6769) this, longConsumer);
    }

    @Override // l.InterfaceC6769, java.util.Iterator
    public /* synthetic */ Long next() {
        return C23702.$default$next((InterfaceC6769) this);
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return next();
    }
}
