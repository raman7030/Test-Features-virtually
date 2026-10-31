package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6745 implements InterfaceC15234 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC15234 f20948;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f20949;

    @Override // l.InterfaceC15234
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        C2536.$default$forEachRemaining(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    public AbstractC6745(InterfaceC15234 interfaceC15234, long j) {
        this.f20948 = interfaceC15234;
        this.f20949 = j;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        InterfaceC15234 interfaceC15234TrySplit = this.f20948.trySplit();
        if (interfaceC15234TrySplit == null) {
            return null;
        }
        long j = this.f20949;
        C14505 c14505 = new C14505(interfaceC15234TrySplit, j, ((C14505) this).f44473);
        this.f20949 = interfaceC15234TrySplit.getExactSizeIfKnown() + j;
        return c14505;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.f20948.estimateSize();
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f20948.characteristics() & 16464;
    }
}
