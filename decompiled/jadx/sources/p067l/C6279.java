package p067l;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۘᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C6279 implements InterfaceC10440 {

    /* JADX INFO: renamed from: a */
    public final double[] f15881a;

    /* JADX INFO: renamed from: b */
    public int f15882b;

    @Override // p067l.InterfaceC7324
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC11111.m25624z(this, consumer);
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC7324 mo3497j(long j, long j2, IntFunction intFunction) {
        return AbstractC11111.m25588C(this, j, j2);
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object[] mo3499m(IntFunction intFunction) {
        return AbstractC11111.m25620v(this, intFunction);
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int mo3500o() {
        return 0;
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC7324 mo3496a(int i) {
        mo3496a(i);
        throw null;
    }

    @Override // p067l.InterfaceC24758, p067l.InterfaceC7324
    /* JADX INFO: renamed from: a */
    public final InterfaceC24758 mo3496a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo3498k(Object[] objArr, int i) {
        AbstractC11111.m25621w(this, (Double[]) objArr, i);
    }

    @Override // p067l.InterfaceC24758
    /* JADX INFO: renamed from: e */
    public final void mo4232e(int i, Object obj) {
        int i2 = this.f15882b;
        System.arraycopy(this.f15881a, 0, (double[]) obj, i, i2);
    }

    @Override // p067l.InterfaceC24758
    /* JADX INFO: renamed from: g */
    public final void mo4234g(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < this.f15882b; i++) {
            doubleConsumer.accept(this.f15881a[i]);
        }
    }

    public C6279(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f15881a = new double[(int) j];
        this.f15882b = 0;
    }

    public C6279(double[] dArr) {
        this.f15881a = dArr;
        this.f15882b = dArr.length;
    }

    @Override // p067l.InterfaceC24758, p067l.InterfaceC7324
    public final InterfaceC3437 spliterator() {
        int i = this.f15882b;
        double[] dArr = this.f15881a;
        C23554.m52341a(((double[]) C12826.requireNonNull(dArr)).length, 0, i);
        return new C8073(dArr, 0, i, 1040);
    }

    @Override // p067l.InterfaceC7324
    public final InterfaceC16847 spliterator() {
        int i = this.f15882b;
        double[] dArr = this.f15881a;
        C23554.m52341a(((double[]) C12826.requireNonNull(dArr)).length, 0, i);
        return new C8073(dArr, 0, i, 1040);
    }

    @Override // p067l.InterfaceC24758
    /* JADX INFO: renamed from: b */
    public final Object mo4230b() {
        double[] dArr = this.f15881a;
        int length = dArr.length;
        int i = this.f15882b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    @Override // p067l.InterfaceC7324
    public final long count() {
        return this.f15882b;
    }

    public String toString() {
        double[] dArr = this.f15881a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f15882b), Arrays.toString(dArr));
    }
}
