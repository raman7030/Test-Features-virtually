package p067l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes.dex */
public final class C24872 extends AbstractC22884 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C4407 f79455;

    /* JADX INFO: renamed from: ᩸ */
    public long f79456;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterator f79457;

    @Override // p067l.AbstractC22884, p067l.InterfaceC16847
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        C4779.$default$forEachRemaining(this, consumer);
    }

    @Override // p067l.AbstractC22884, p067l.InterfaceC16847
    public /* synthetic */ Comparator getComparator() {
        return C4779.$default$getComparator(this);
    }

    @Override // p067l.AbstractC22884, p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.AbstractC22884, p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24872(long j, int i, Iterator it, C4407 c4407) {
        super(j, i);
        this.f79457 = it;
        this.f79455 = c4407;
        this.f79456 = 0L;
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        Iterator it = this.f79457;
        if (!it.hasNext()) {
            return false;
        }
        Object next = it.next();
        long j = this.f79456;
        this.f79456 = 1 + j;
        if (!((C5143) this.f79455.f9897).apply(next)) {
            j = -1;
        }
        consumer.accept(Long.valueOf(j));
        return true;
    }
}
