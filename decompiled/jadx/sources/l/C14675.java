package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14675 implements InterfaceC15234 {
    public int a;
    public final int b;
    public int c;
    public final int d;
    public Object[] e;
    public final /* synthetic */ C20215 f;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 16464;
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    public C14675(C20215 c20215, int i, int i2, int i3, int i4) {
        this.f = c20215;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[][] objArr = c20215.f;
        this.e = objArr == null ? c20215.e : objArr[i];
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i == i3) {
            return ((long) i2) - ((long) this.c);
        }
        long[] jArr = this.f.d;
        return ((jArr[i3] + ((long) i2)) - jArr[i]) - ((long) this.c);
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        C11003.requireNonNull(consumer);
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        Object[] objArr = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        consumer.accept(objArr[i3]);
        if (this.c == this.e.length) {
            this.c = 0;
            int i4 = this.a + 1;
            this.a = i4;
            Object[][] objArr2 = this.f.f;
            if (objArr2 != null && i4 <= i2) {
                this.e = objArr2[i4];
            }
        }
        return true;
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        C20215 c20215;
        C11003.requireNonNull(consumer);
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                c20215 = this.f;
                if (i >= i3) {
                    break;
                }
                Object[] objArr = c20215.f[i];
                while (i4 < objArr.length) {
                    consumer.accept(objArr[i4]);
                    i4++;
                }
                i++;
                i4 = 0;
            }
            Object[] objArr2 = this.a == i3 ? this.e : c20215.f[i3];
            while (i4 < i2) {
                consumer.accept(objArr2[i4]);
                i4++;
            }
            this.a = i3;
            this.c = i2;
        }
    }

    @Override // l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            C20215 c20215 = this.f;
            C14675 c14675 = new C14675(c20215, i, i3, i4, c20215.f[i3].length);
            this.a = i2;
            this.c = 0;
            this.e = c20215.f[i2];
            return c14675;
        }
        if (i != i2) {
            return null;
        }
        int i5 = this.c;
        int i6 = (this.d - i5) / 2;
        if (i6 == 0) {
            return null;
        }
        C22996 c22996A = C22311.a(this.e, i5, i5 + i6);
        this.c += i6;
        return c22996A;
    }
}
