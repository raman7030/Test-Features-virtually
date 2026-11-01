package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C21581 extends AbstractC20911 implements Consumer, Iterable, InterfaceC6477 {

    /* JADX INFO: renamed from: e */
    public Object[] f68052e = new Object[1 << 4];

    /* JADX INFO: renamed from: f */
    public Object[][] f68053f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    /* JADX INFO: renamed from: p */
    public final void m48773p(long j) {
        long length;
        int i = this.f65670c;
        if (i == 0) {
            length = this.f68052e.length;
        } else {
            length = this.f65671d[i] + ((long) this.f68053f[i].length);
        }
        if (j > length) {
            if (this.f68053f == null) {
                Object[][] objArr = new Object[8][];
                this.f68053f = objArr;
                this.f65671d = new long[8];
                objArr[0] = this.f68052e;
            }
            int i2 = i + 1;
            while (j > length) {
                Object[][] objArr2 = this.f68053f;
                if (i2 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.f68053f = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.f65671d = Arrays.copyOf(this.f65671d, length2);
                }
                int iMin = this.f65668a;
                if (i2 != 0 && i2 != 1) {
                    iMin = Math.min((iMin + i2) - 1, 30);
                }
                int i3 = 1 << iMin;
                Object[][] objArr3 = this.f68053f;
                objArr3[i2] = new Object[i3];
                long[] jArr = this.f65671d;
                int i4 = i2 - 1;
                jArr[i2] = jArr[i4] + ((long) objArr3[i4].length);
                length += (long) i3;
                i2++;
            }
        }
    }

    @Override // p067l.AbstractC20911
    public final void clear() {
        Object[][] objArr = this.f68053f;
        if (objArr != null) {
            this.f68052e = objArr[0];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.f68052e;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.f68053f = null;
            this.f65671d = null;
        } else {
            for (int i2 = 0; i2 < this.f65669b; i2++) {
                this.f68052e[i2] = null;
            }
        }
        this.f65669b = 0;
        this.f65670c = 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return C23554.iterator(spliterator());
    }

    @Override // java.lang.Iterable, p067l.InterfaceC6477
    public void forEach(Consumer consumer) {
        for (int i = 0; i < this.f65670c; i++) {
            for (Object obj : this.f68053f[i]) {
                consumer.accept(obj);
            }
        }
        for (int i2 = 0; i2 < this.f65669b; i2++) {
            consumer.accept(this.f68052e[i2]);
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i = this.f65669b;
        Object[] objArr = this.f68052e;
        if (i == objArr.length) {
            if (this.f68053f == null) {
                Object[][] objArr2 = new Object[8][];
                this.f68053f = objArr2;
                this.f65671d = new long[8];
                objArr2[0] = objArr;
            }
            int i2 = this.f65670c;
            int i3 = i2 + 1;
            Object[][] objArr3 = this.f68053f;
            if (i3 >= objArr3.length || objArr3[i3] == null) {
                if (i2 == 0) {
                    length = objArr.length;
                } else {
                    length = ((long) objArr3[i2].length) + this.f65671d[i2];
                }
                m48773p(length + 1);
            }
            this.f65669b = 0;
            int i4 = this.f65670c + 1;
            this.f65670c = i4;
            this.f68052e = this.f68053f[i4];
        }
        Object[] objArr4 = this.f68052e;
        int i5 = this.f65669b;
        this.f65669b = i5 + 1;
        objArr4[i5] = obj;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C12826.requireNonNull(arrayList);
        forEach(new C18546(14, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }

    @Override // java.lang.Iterable, p067l.InterfaceC6477, p067l.InterfaceC3456, java.util.Set, p067l.InterfaceC10814
    public InterfaceC16847 spliterator() {
        return new C16316(this, 0, this.f65670c, 0, this.f65669b);
    }
}
