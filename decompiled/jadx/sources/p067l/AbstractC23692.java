package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩹ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23692 implements InterfaceC8705, InterfaceC14185 {
    @Override // p067l.InterfaceC8705, p067l.InterfaceC16177, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C24798.m54480(this, consumer);
    }

    @Override // p067l.InterfaceC22214
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C18860.$default$forEachRemaining((InterfaceC16177) this, intConsumer);
    }

    @Override // p067l.InterfaceC16177, java.util.Iterator
    public /* synthetic */ Integer next() {
        return C18860.$default$next((InterfaceC16177) this);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public /* bridge */ /* synthetic */ Object next() {
        return next();
    }
}
