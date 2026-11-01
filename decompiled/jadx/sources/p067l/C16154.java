package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes4.dex */
public final class C16154 extends AbstractC8779 implements Consumer {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C4407 f47574;

    /* JADX INFO: renamed from: ᩶ */
    public Object f47575;

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16154(InterfaceC16847 interfaceC16847, long j, C4407 c4407) {
        super(interfaceC16847, j);
        this.f47574 = c4407;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f47575 = obj;
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        if (!this.f23822.tryAdvance(this)) {
            return false;
        }
        try {
            C4407 c4407 = this.f47574;
            Object obj = this.f47575;
            long j = this.f23823;
            this.f23823 = 1 + j;
            if (!((C5143) c4407.f9897).apply(obj)) {
                j = -1;
            }
            consumer.accept(Long.valueOf(j));
            return true;
        } finally {
            this.f47575 = null;
        }
    }
}
