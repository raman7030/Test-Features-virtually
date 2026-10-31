package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩹ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC22436 implements InterfaceC6667, InterfaceC12433 {
    @Override // l.InterfaceC6667, l.InterfaceC14529, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
    }

    @Override // l.InterfaceC20881
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C17352.$default$forEachRemaining((InterfaceC14529) this, intConsumer);
    }

    @Override // l.InterfaceC14529, java.util.Iterator
    public /* synthetic */ Integer next() {
        return C17352.$default$next((InterfaceC14529) this);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public /* bridge */ /* synthetic */ Object next() {
        return next();
    }
}
