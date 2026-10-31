package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C22271 implements InterfaceC15234 {
    public final InterfaceC15234 a;

    public C22271(InterfaceC15234 interfaceC15234) {
        this.a = interfaceC15234;
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        C11003.requireNonNull(consumer);
        return this.a.tryAdvance(new C2122(consumer, 2));
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        C11003.requireNonNull(consumer);
        this.a.forEachRemaining(new C2122(consumer, 2));
    }

    @Override // l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        InterfaceC15234 interfaceC15234TrySplit = this.a.trySplit();
        if (interfaceC15234TrySplit == null) {
            return null;
        }
        return new C22271(interfaceC15234TrySplit);
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC15234
    public final long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.a.characteristics();
    }

    @Override // l.InterfaceC15234
    public final boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    @Override // l.InterfaceC15234
    public final Comparator getComparator() {
        return this.a.getComparator();
    }
}
