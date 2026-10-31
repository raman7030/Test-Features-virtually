package l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ᩴᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18931 extends C20215 implements InterfaceC5214, InterfaceC8948 {
    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(double d) {
        AbstractC9198.m();
        throw null;
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(int i) {
        AbstractC9198.t();
        throw null;
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ void accept(long j) {
        AbstractC9198.u();
        throw null;
    }

    @Override // l.InterfaceC8948
    public final InterfaceC5214 build() {
        return this;
    }

    @Override // l.InterfaceC0585
    public final void end() {
    }

    @Override // l.InterfaceC0585
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // l.InterfaceC5214
    public final /* synthetic */ InterfaceC5214 j(long j, long j2, IntFunction intFunction) {
        return AbstractC9198.F(this, j, j2, intFunction);
    }

    @Override // l.InterfaceC5214
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // l.InterfaceC5214
    public final InterfaceC5214 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC5214
    public final void k(Object[] objArr, int i) {
        long j = i;
        long jCount = count() + j;
        if (jCount > objArr.length || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, objArr, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object[] objArr2 = this.f[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.f[i2].length;
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, objArr, i, i3);
        }
    }

    @Override // l.InterfaceC5214
    public final Object[] m(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        k(objArr, 0);
        return objArr;
    }

    @Override // l.InterfaceC0585
    public final void c(long j) {
        clear();
        p(j);
    }
}
