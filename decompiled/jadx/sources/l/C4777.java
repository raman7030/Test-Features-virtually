package l;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.ۙܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4777 extends AbstractC2703 implements InterfaceC14696 {
    public final /* synthetic */ EnumC20342 c;
    public final /* synthetic */ LongPredicate d;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C2351.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC14696
    public final /* synthetic */ void l(Long l2) {
        AbstractC9198.r(this, l2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4777(EnumC20342 enumC20342, LongPredicate longPredicate) {
        super(enumC20342);
        this.c = enumC20342;
        this.d = longPredicate;
    }

    @Override // l.AbstractC2703, l.InterfaceC0585
    public final void accept(long j) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(j);
        EnumC20342 enumC20342 = this.c;
        if (zTest == enumC20342.a) {
            this.a = true;
            this.b = enumC20342.b;
        }
    }
}
