package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17477 extends AbstractC18225 implements InterfaceC10422 {
    public final int[] h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC10422
    public final /* synthetic */ void d(Integer num) {
        AbstractC9198.p(this, num);
    }

    public C17477(InterfaceC15234 interfaceC15234, AbstractC9198 abstractC9198, int[] iArr) {
        super(interfaceC15234, abstractC9198, iArr.length);
        this.h = iArr;
    }

    public C17477(C17477 c17477, InterfaceC15234 interfaceC15234, long j, long j2) {
        super(c17477, interfaceC15234, j, j2, c17477.h.length);
        this.h = c17477.h;
    }

    @Override // l.AbstractC18225
    public final AbstractC18225 a(InterfaceC15234 interfaceC15234, long j, long j2) {
        return new C17477(this, interfaceC15234, j, j2);
    }

    @Override // l.AbstractC18225, l.InterfaceC0585
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }
}
