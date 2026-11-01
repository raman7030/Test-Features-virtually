package p067l;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.ۙܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6909 extends AbstractC4938 implements InterfaceC16336 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EnumC21702 f17986c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LongPredicate f17987d;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo4235l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C4603.$default$andThen(this, longConsumer);
    }

    @Override // p067l.InterfaceC16336
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo4235l(Long l2) {
        AbstractC11111.m25616r(this, l2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6909(EnumC21702 enumC21702, LongPredicate longPredicate) {
        super(enumC21702);
        this.f17986c = enumC21702;
        this.f17987d = longPredicate;
    }

    @Override // p067l.AbstractC4938, p067l.InterfaceC2925
    public final void accept(long j) {
        if (this.f11241a) {
            return;
        }
        boolean zTest = this.f17987d.test(j);
        EnumC21702 enumC21702 = this.f17986c;
        if (zTest == enumC21702.f68337a) {
            this.f11241a = true;
            this.f11242b = enumC21702.f68338b;
        }
    }
}
