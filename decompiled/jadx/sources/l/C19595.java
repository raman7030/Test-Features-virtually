package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩵ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19595 extends AbstractC18225 implements InterfaceC14696 {
    public final long[] h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C2351.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC14696
    public final /* synthetic */ void l(Long l2) {
        AbstractC9198.r(this, l2);
    }

    public C19595(InterfaceC15234 interfaceC15234, AbstractC9198 abstractC9198, long[] jArr) {
        super(interfaceC15234, abstractC9198, jArr.length);
        this.h = jArr;
    }

    public C19595(C19595 c19595, InterfaceC15234 interfaceC15234, long j, long j2) {
        super(c19595, interfaceC15234, j, j2, c19595.h.length);
        this.h = c19595.h;
    }

    @Override // l.AbstractC18225
    public final AbstractC18225 a(InterfaceC15234 interfaceC15234, long j, long j2) {
        return new C19595(this, interfaceC15234, j, j2);
    }

    @Override // l.AbstractC18225, l.InterfaceC0585
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }
}
