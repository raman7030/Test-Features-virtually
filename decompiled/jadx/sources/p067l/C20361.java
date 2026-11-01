package p067l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ᩴᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20361 extends C21581 implements InterfaceC7324, InterfaceC10873 {
    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(double d) {
        AbstractC11111.m25611m();
        throw null;
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(int i) {
        AbstractC11111.m25618t();
        throw null;
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(long j) {
        AbstractC11111.m25619u();
        throw null;
    }

    @Override // p067l.InterfaceC10873
    public final InterfaceC7324 build() {
        return this;
    }

    @Override // p067l.InterfaceC2925
    public final void end() {
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean mo4233f() {
        return false;
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC7324 mo3497j(long j, long j2, IntFunction intFunction) {
        return AbstractC11111.m25591F(this, j, j2, intFunction);
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int mo3500o() {
        return 0;
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: a */
    public final InterfaceC7324 mo3496a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: k */
    public final void mo3498k(Object[] objArr, int i) {
        long j = i;
        long jCount = count() + j;
        if (jCount > objArr.length || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f65670c == 0) {
            System.arraycopy(this.f68052e, 0, objArr, i, this.f65669b);
            return;
        }
        for (int i2 = 0; i2 < this.f65670c; i2++) {
            Object[] objArr2 = this.f68053f[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.f68053f[i2].length;
        }
        int i3 = this.f65669b;
        if (i3 > 0) {
            System.arraycopy(this.f68052e, 0, objArr, i, i3);
        }
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: m */
    public final Object[] mo3499m(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        mo3498k(objArr, 0);
        return objArr;
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        clear();
        m48773p(j);
    }
}
