package l;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11854 implements InterfaceC15234 {
    public final InterfaceC15234 a;
    public final AtomicBoolean b;
    public boolean c;
    public int d;

    public abstract InterfaceC15234 b(InterfaceC15234 interfaceC15234);

    @Override // l.InterfaceC15234
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        C2536.$default$forEachRemaining(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    public AbstractC11854(InterfaceC15234 interfaceC15234) {
        this.c = true;
        this.a = interfaceC15234;
        this.b = new AtomicBoolean();
    }

    public AbstractC11854(InterfaceC15234 interfaceC15234, AbstractC11854 abstractC11854) {
        this.c = true;
        this.a = interfaceC15234;
        this.b = abstractC11854.b;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.a.characteristics() & (-16449);
    }

    @Override // l.InterfaceC15234
    public final Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // l.InterfaceC15234
    public InterfaceC15234 trySplit() {
        InterfaceC15234 interfaceC15234TrySplit = this.a.trySplit();
        if (interfaceC15234TrySplit != null) {
            return b(interfaceC15234TrySplit);
        }
        return null;
    }

    public final boolean a() {
        return (this.d == 0 && this.b.get()) ? false : true;
    }

    @Override // l.InterfaceC15234
    public /* bridge */ /* synthetic */ InterfaceC18764 trySplit() {
        return (InterfaceC18764) trySplit();
    }

    @Override // l.InterfaceC15234
    public /* bridge */ /* synthetic */ InterfaceC0418 trySplit() {
        return (InterfaceC0418) trySplit();
    }

    @Override // l.InterfaceC15234
    public /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return (InterfaceC1124) trySplit();
    }

    @Override // l.InterfaceC15234
    public /* bridge */ /* synthetic */ InterfaceC8160 trySplit() {
        return (InterfaceC8160) trySplit();
    }
}
