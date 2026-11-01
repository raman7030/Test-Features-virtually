package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes5.dex */
public final class C21920 extends AbstractC4485 implements InterfaceC18307 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C20579 f68933;

    @Override // p067l.AbstractC4485, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12944.m29673(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.AbstractC4485, p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C12944.m29674(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // p067l.InterfaceC18307, p067l.InterfaceC16847
    public final InterfaceC4070 getComparator() {
        throw new IllegalStateException();
    }

    @Override // p067l.AbstractC4485
    /* JADX INFO: renamed from: ֫ */
    public final void mo9491(int i, Object obj) {
        ((InterfaceC24857) obj).mo20276(this.f68933.f63607[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21920(C20579 c20579) {
        super(c20579);
        this.f68933 = c20579;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21920(C20579 c20579, int i, int i2, boolean z) {
        super(c20579, i, i2, z);
        this.f68933 = c20579;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return this.f10074 ? 257 : 321;
    }

    @Override // p067l.AbstractC4485
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4485 mo9490(int i, int i2, boolean z) {
        return new C21920(this.f68933, i, i2, z);
    }
}
