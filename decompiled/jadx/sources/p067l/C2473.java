package p067l;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.֡֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C2473 implements InterfaceC7324 {

    /* JADX INFO: renamed from: a */
    public final Object[] f3863a;

    /* JADX INFO: renamed from: b */
    public int f3864b;

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

    public C2473(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f3863a = (Object[]) intFunction.apply((int) j);
        this.f3864b = 0;
    }

    public C2473(Object[] objArr) {
        this.f3863a = objArr;
        this.f3864b = objArr.length;
    }

    @Override // p067l.InterfaceC7324
    public final InterfaceC16847 spliterator() {
        return C23573.m52385a(this.f3863a, 0, this.f3864b);
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: k */
    public final void mo3498k(Object[] objArr, int i) {
        System.arraycopy(this.f3863a, 0, objArr, i, this.f3864b);
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: m */
    public final Object[] mo3499m(IntFunction intFunction) {
        Object[] objArr = this.f3863a;
        if (objArr.length == this.f3864b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // p067l.InterfaceC7324
    public final long count() {
        return this.f3864b;
    }

    @Override // p067l.InterfaceC7324
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.f3864b; i++) {
            consumer.m45213n(this.f3863a[i]);
        }
    }

    public String toString() {
        Object[] objArr = this.f3863a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f3864b), Arrays.toString(objArr));
    }
}
