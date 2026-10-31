package l;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۤ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C9990 implements InterfaceC6103 {
    public final long[] a;
    public int b;

    @Override // l.InterfaceC5214
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC9198.B(this, consumer);
    }

    @Override // l.InterfaceC5214
    public final /* synthetic */ InterfaceC5214 j(long j, long j2, IntFunction intFunction) {
        return AbstractC9198.E(this, j, j2);
    }

    @Override // l.InterfaceC5214
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return AbstractC9198.v(this, intFunction);
    }

    @Override // l.InterfaceC5214
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // l.InterfaceC5214
    public final /* bridge */ /* synthetic */ InterfaceC5214 a(int i) {
        a(i);
        throw null;
    }

    @Override // l.InterfaceC23558, l.InterfaceC5214
    public final InterfaceC23558 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC5214
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC9198.y(this, (Long[]) objArr, i);
    }

    @Override // l.InterfaceC23558
    public final void e(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    @Override // l.InterfaceC23558
    public final void g(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            longConsumer.accept(this.a[i]);
        }
    }

    public C9990(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new long[(int) j];
        this.b = 0;
    }

    public C9990(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }

    @Override // l.InterfaceC23558, l.InterfaceC5214
    public final InterfaceC1124 spliterator() {
        int i = this.b;
        long[] jArr = this.a;
        C22291.a(((long[]) C11003.requireNonNull(jArr)).length, 0, i);
        return new C20861(jArr, 0, i, 1040);
    }

    @Override // l.InterfaceC5214
    public final InterfaceC15234 spliterator() {
        int i = this.b;
        long[] jArr = this.a;
        C22291.a(((long[]) C11003.requireNonNull(jArr)).length, 0, i);
        return new C20861(jArr, 0, i, 1040);
    }

    @Override // l.InterfaceC23558
    public final Object b() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // l.InterfaceC5214
    public final long count() {
        return this.b;
    }

    public String toString() {
        long[] jArr = this.a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }
}
