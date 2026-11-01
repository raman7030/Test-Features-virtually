package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18979 extends AbstractC19690 implements InterfaceC12274 {

    /* JADX INFO: renamed from: h */
    public final int[] f56602h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
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

    public C18979(InterfaceC16847 interfaceC16847, AbstractC11111 abstractC11111, int[] iArr) {
        super(interfaceC16847, abstractC11111, iArr.length);
        this.f56602h = iArr;
    }

    public C18979(C18979 c18979, InterfaceC16847 interfaceC16847, long j, long j2) {
        super(c18979, interfaceC16847, j, j2, c18979.f56602h.length);
        this.f56602h = c18979.f56602h;
    }

    @Override // p067l.AbstractC19690
    /* JADX INFO: renamed from: a */
    public final AbstractC19690 mo32148a(InterfaceC16847 interfaceC16847, long j, long j2) {
        return new C18979(this, interfaceC16847, j, j2);
    }

    @Override // p067l.AbstractC19690, p067l.InterfaceC2925
    public final void accept(int i) {
        int i2 = this.f59854f;
        if (i2 >= this.f59855g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f59854f));
        }
        int[] iArr = this.f56602h;
        this.f59854f = i2 + 1;
        iArr[i2] = i;
    }
}
