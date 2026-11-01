package p067l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16316 implements InterfaceC16847 {

    /* JADX INFO: renamed from: a */
    public int f47939a;

    /* JADX INFO: renamed from: b */
    public final int f47940b;

    /* JADX INFO: renamed from: c */
    public int f47941c;

    /* JADX INFO: renamed from: d */
    public final int f47942d;

    /* JADX INFO: renamed from: e */
    public Object[] f47943e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C21581 f47944f;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 16464;
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ Comparator getComparator() {
        return C4779.$default$getComparator(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    public C16316(C21581 c21581, int i, int i2, int i3, int i4) {
        this.f47944f = c21581;
        this.f47939a = i;
        this.f47940b = i2;
        this.f47941c = i3;
        this.f47942d = i4;
        Object[][] objArr = c21581.f68053f;
        this.f47943e = objArr == null ? c21581.f68052e : objArr[i];
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        int i = this.f47939a;
        int i2 = this.f47942d;
        int i3 = this.f47940b;
        if (i == i3) {
            return ((long) i2) - ((long) this.f47941c);
        }
        long[] jArr = this.f47944f.f65671d;
        return ((jArr[i3] + ((long) i2)) - jArr[i]) - ((long) this.f47941c);
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        C12826.requireNonNull(consumer);
        int i = this.f47939a;
        int i2 = this.f47940b;
        if (i >= i2 && (i != i2 || this.f47941c >= this.f47942d)) {
            return false;
        }
        Object[] objArr = this.f47943e;
        int i3 = this.f47941c;
        this.f47941c = i3 + 1;
        consumer.accept(objArr[i3]);
        if (this.f47941c == this.f47943e.length) {
            this.f47941c = 0;
            int i4 = this.f47939a + 1;
            this.f47939a = i4;
            Object[][] objArr2 = this.f47944f.f68053f;
            if (objArr2 != null && i4 <= i2) {
                this.f47943e = objArr2[i4];
            }
        }
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        C21581 c21581;
        C12826.requireNonNull(consumer);
        int i = this.f47939a;
        int i2 = this.f47942d;
        int i3 = this.f47940b;
        if (i < i3 || (i == i3 && this.f47941c < i2)) {
            int i4 = this.f47941c;
            while (true) {
                c21581 = this.f47944f;
                if (i >= i3) {
                    break;
                }
                Object[] objArr = c21581.f68053f[i];
                while (i4 < objArr.length) {
                    consumer.accept(objArr[i4]);
                    i4++;
                }
                i++;
                i4 = 0;
            }
            Object[] objArr2 = this.f47939a == i3 ? this.f47943e : c21581.f68053f[i3];
            while (i4 < i2) {
                consumer.accept(objArr2[i4]);
                i4++;
            }
            this.f47939a = i3;
            this.f47941c = i2;
        }
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        int i = this.f47939a;
        int i2 = this.f47940b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.f47941c;
            C21581 c21581 = this.f47944f;
            C16316 c16316 = new C16316(c21581, i, i3, i4, c21581.f68053f[i3].length);
            this.f47939a = i2;
            this.f47941c = 0;
            this.f47943e = c21581.f68053f[i2];
            return c16316;
        }
        if (i != i2) {
            return null;
        }
        int i5 = this.f47941c;
        int i6 = (this.f47942d - i5) / 2;
        if (i6 == 0) {
            return null;
        }
        C24224 c24224M52385a = C23573.m52385a(this.f47943e, i5, i5 + i6);
        this.f47941c += i6;
        return c24224M52385a;
    }
}
