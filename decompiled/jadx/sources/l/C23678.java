package l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes.dex */
public final class C23678 extends AbstractC21586 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2144 f76705;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f76706;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f76707;

    @Override // l.AbstractC21586, l.InterfaceC15234
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        C2536.$default$forEachRemaining(this, consumer);
    }

    @Override // l.AbstractC21586, l.InterfaceC15234
    public /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.AbstractC21586, l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.AbstractC21586, l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23678(long j, int i, Iterator it, C2144 c2144) {
        super(j, i);
        this.f76707 = it;
        this.f76705 = c2144;
        this.f76706 = 0L;
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        Iterator it = this.f76707;
        if (!it.hasNext()) {
            return false;
        }
        Object next = it.next();
        long j = this.f76706;
        this.f76706 = 1 + j;
        if (!((C2920) this.f76705.f7111).apply(next)) {
            j = -1;
        }
        consumer.accept(Long.valueOf(j));
        return true;
    }
}
