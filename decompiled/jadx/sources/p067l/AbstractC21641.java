package p067l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩶ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBWB */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21641 implements InterfaceC24660, InterfaceC14185 {
    @Override // p067l.InterfaceC8802, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C15942.m36199(this, consumer);
    }

    @Override // p067l.InterfaceC22214
    public /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C24895.$default$forEachRemaining((InterfaceC8802) this, longConsumer);
    }

    @Override // p067l.InterfaceC8802, java.util.Iterator
    public /* synthetic */ Long next() {
        return C24895.$default$next((InterfaceC8802) this);
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return next();
    }
}
