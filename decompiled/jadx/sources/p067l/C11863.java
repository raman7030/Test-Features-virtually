package p067l;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۤ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C11863 implements InterfaceC8169 {

    /* JADX INFO: renamed from: a */
    public final long[] f33066a;

    /* JADX INFO: renamed from: b */
    public int f33067b;

    @Override // p067l.InterfaceC7324
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC11111.m25587B(this, consumer);
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC7324 mo3497j(long j, long j2, IntFunction intFunction) {
        return AbstractC11111.m25590E(this, j, j2);
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
        AbstractC11111.m25623y(this, (Long[]) objArr, i);
    }

    @Override // p067l.InterfaceC24758
    /* JADX INFO: renamed from: e */
    public final void mo4232e(int i, Object obj) {
        int i2 = this.f33067b;
        System.arraycopy(this.f33066a, 0, (long[]) obj, i, i2);
    }

    @Override // p067l.InterfaceC24758
    /* JADX INFO: renamed from: g */
    public final void mo4234g(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.f33067b; i++) {
            longConsumer.accept(this.f33066a[i]);
        }
    }

    public C11863(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33066a = new long[(int) j];
        this.f33067b = 0;
    }

    public C11863(long[] jArr) {
        this.f33066a = jArr;
        this.f33067b = jArr.length;
    }

    @Override // p067l.InterfaceC24758, p067l.InterfaceC7324
    public final InterfaceC3437 spliterator() {
        int i = this.f33067b;
        long[] jArr = this.f33066a;
        C23554.m52341a(((long[]) C12826.requireNonNull(jArr)).length, 0, i);
        return new C22195(jArr, 0, i, 1040);
    }

    @Override // p067l.InterfaceC7324
    public final InterfaceC16847 spliterator() {
        int i = this.f33067b;
        long[] jArr = this.f33066a;
        C23554.m52341a(((long[]) C12826.requireNonNull(jArr)).length, 0, i);
        return new C22195(jArr, 0, i, 1040);
    }

    @Override // p067l.InterfaceC24758
    /* JADX INFO: renamed from: b */
    public final Object mo4230b() {
        long[] jArr = this.f33066a;
        int length = jArr.length;
        int i = this.f33067b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // p067l.InterfaceC7324
    public final long count() {
        return this.f33067b;
    }

    public String toString() {
        long[] jArr = this.f33066a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f33067b), Arrays.toString(jArr));
    }
}
