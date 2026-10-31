package l;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.֡֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C0110 implements InterfaceC5214 {
    public final Object[] a;
    public int b;

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

    public C0110(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = (Object[]) intFunction.apply((int) j);
        this.b = 0;
    }

    public C0110(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }

    @Override // l.InterfaceC5214
    public final InterfaceC15234 spliterator() {
        return C22311.a(this.a, 0, this.b);
    }

    @Override // l.InterfaceC5214
    public final void k(Object[] objArr, int i) {
        System.arraycopy(this.a, 0, objArr, i, this.b);
    }

    @Override // l.InterfaceC5214
    public final Object[] m(IntFunction intFunction) {
        Object[] objArr = this.a;
        if (objArr.length == this.b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC5214
    public final long count() {
        return this.b;
    }

    @Override // l.InterfaceC5214
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            consumer.n(this.a[i]);
        }
    }

    public String toString() {
        Object[] objArr = this.a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }
}
