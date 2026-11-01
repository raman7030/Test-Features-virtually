package p067l;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۘܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6239 extends AbstractC4938 implements InterfaceC12274 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EnumC21702 f15748c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ IntPredicate f15749d;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo6025d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }

    @Override // p067l.InterfaceC12274
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo6025d(Integer num) {
        AbstractC11111.m25614p(this, num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6239(EnumC21702 enumC21702, IntPredicate intPredicate) {
        super(enumC21702);
        this.f15748c = enumC21702;
        this.f15749d = intPredicate;
    }

    @Override // p067l.AbstractC4938, p067l.InterfaceC2925
    public final void accept(int i) {
        if (this.f11241a) {
            return;
        }
        boolean zTest = this.f15749d.test(i);
        EnumC21702 enumC21702 = this.f15748c;
        if (zTest == enumC21702.f68337a) {
            this.f11241a = true;
            this.f11242b = enumC21702.f68338b;
        }
    }
}
