package l;

/* JADX INFO: renamed from: l.۬ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13243 extends AbstractC18225 {
    public final Object[] h;

    public C13243(InterfaceC15234 interfaceC15234, AbstractC9198 abstractC9198, Object[] objArr) {
        super(interfaceC15234, abstractC9198, objArr.length);
        this.h = objArr;
    }

    public C13243(C13243 c13243, InterfaceC15234 interfaceC15234, long j, long j2) {
        super(c13243, interfaceC15234, j, j2, c13243.h.length);
        this.h = c13243.h;
    }

    @Override // l.AbstractC18225
    public final AbstractC18225 a(InterfaceC15234 interfaceC15234, long j, long j2) {
        return new C13243(this, interfaceC15234, j, j2);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }
}
