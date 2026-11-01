package p067l;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.᩺᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C24521 implements InterfaceC8840 {

    /* JADX INFO: renamed from: a */
    public final int[] f77669a;

    /* JADX INFO: renamed from: b */
    public int f77670b;

    @Override // p067l.InterfaceC7324
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC11111.m25586A(this, consumer);
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC7324 mo3497j(long j, long j2, IntFunction intFunction) {
        return AbstractC11111.m25589D(this, j, j2);
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
        AbstractC11111.m25622x(this, (Integer[]) objArr, i);
    }

    @Override // p067l.InterfaceC24758
    /* JADX INFO: renamed from: e */
    public final void mo4232e(int i, Object obj) {
        int i2 = this.f77670b;
        System.arraycopy(this.f77669a, 0, (int[]) obj, i, i2);
    }

    @Override // p067l.InterfaceC24758
    /* JADX INFO: renamed from: g */
    public final void mo4234g(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < this.f77670b; i++) {
            intConsumer.accept(this.f77669a[i]);
        }
    }

    public C24521(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f77669a = new int[(int) j];
        this.f77670b = 0;
    }

    public C24521(int[] iArr) {
        this.f77669a = iArr;
        this.f77670b = iArr.length;
    }

    @Override // p067l.InterfaceC24758, p067l.InterfaceC7324
    public final InterfaceC3437 spliterator() {
        return C23554.spliterator(this.f77669a, 0, this.f77670b, 1040);
    }

    @Override // p067l.InterfaceC7324
    public final InterfaceC16847 spliterator() {
        return C23554.spliterator(this.f77669a, 0, this.f77670b, 1040);
    }

    @Override // p067l.InterfaceC24758
    /* JADX INFO: renamed from: b */
    public final Object mo4230b() {
        int[] iArr = this.f77669a;
        int length = iArr.length;
        int i = this.f77670b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    @Override // p067l.InterfaceC7324
    public final long count() {
        return this.f77670b;
    }

    public String toString() {
        int[] iArr = this.f77669a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f77670b), Arrays.toString(iArr));
    }
}
