package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes4.dex */
public final class C14505 extends AbstractC6745 implements Consumer {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2144 f44473;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f44474;

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14505(InterfaceC15234 interfaceC15234, long j, C2144 c2144) {
        super(interfaceC15234, j);
        this.f44473 = c2144;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f44474 = obj;
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        if (!this.f20948.tryAdvance(this)) {
            return false;
        }
        try {
            C2144 c2144 = this.f44473;
            Object obj = this.f44474;
            long j = this.f20949;
            this.f20949 = 1 + j;
            if (!((C2920) c2144.f7111).apply(obj)) {
                j = -1;
            }
            consumer.accept(Long.valueOf(j));
            return true;
        } finally {
            this.f44474 = null;
        }
    }
}
