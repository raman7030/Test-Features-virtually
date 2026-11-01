package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20400 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩸ */
    public int f63058 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C2964 f63059;

    public C20400(C2964 c2964) {
        this.f63059 = c2964;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63058 < this.f63059.f5174.f72520;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f63059.f5174.f72524;
        int i = this.f63058;
        this.f63058 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f63058;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C2964 c2964 = this.f63059;
        C23082 c23082 = c2964.f5174;
        int i2 = c23082.f72520 - i;
        Object[] objArr = c23082.f72524;
        System.arraycopy(objArr, i, objArr, i - 1, i2);
        Object[] objArr2 = c2964.f5174.f72519;
        int i3 = this.f63058;
        System.arraycopy(objArr2, i3, objArr2, i3 - 1, i2);
        C23082 c23083 = c2964.f5174;
        int i4 = c23083.f72520 - 1;
        c23083.f72520 = i4;
        this.f63058--;
        c23083.f72524[i4] = null;
        c23083.f72519[i4] = null;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        C23082 c23082 = this.f63059.f5174;
        Object[] objArr = c23082.f72524;
        int i = c23082.f72520;
        while (true) {
            int i2 = this.f63058;
            if (i2 >= i) {
                return;
            }
            this.f63058 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
