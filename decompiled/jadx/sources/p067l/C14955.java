package p067l;

/* JADX INFO: renamed from: l.۬ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14955 extends AbstractC19690 {

    /* JADX INFO: renamed from: h */
    public final Object[] f42700h;

    public C14955(InterfaceC16847 interfaceC16847, AbstractC11111 abstractC11111, Object[] objArr) {
        super(interfaceC16847, abstractC11111, objArr.length);
        this.f42700h = objArr;
    }

    public C14955(C14955 c14955, InterfaceC16847 interfaceC16847, long j, long j2) {
        super(c14955, interfaceC16847, j, j2, c14955.f42700h.length);
        this.f42700h = c14955.f42700h;
    }

    @Override // p067l.AbstractC19690
    /* JADX INFO: renamed from: a */
    public final AbstractC19690 mo32148a(InterfaceC16847 interfaceC16847, long j, long j2) {
        return new C14955(this, interfaceC16847, j, j2);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        int i = this.f59854f;
        if (i >= this.f59855g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f59854f));
        }
        Object[] objArr = this.f42700h;
        this.f59854f = i + 1;
        objArr[i] = obj;
    }
}
