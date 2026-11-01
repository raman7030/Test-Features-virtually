package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4957 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩸ */
    public int f11290 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C20380 f11291;

    public C4957(C20380 c20380) {
        this.f11291 = c20380;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11290 < this.f11291.f62993.f28587;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f11291.f62993.f28591;
        int i = this.f11290;
        this.f11290 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f11290;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C20380 c20380 = this.f11291;
        C10321 c10321 = c20380.f62993;
        int i2 = c10321.f28587 - i;
        Object[] objArr = c10321.f28591;
        System.arraycopy(objArr, i, objArr, i - 1, i2);
        int[] iArr = c20380.f62993.f28586;
        int i3 = this.f11290;
        System.arraycopy(iArr, i3, iArr, i3 - 1, i2);
        C10321 c10322 = c20380.f62993;
        int i4 = c10322.f28587 - 1;
        c10322.f28587 = i4;
        this.f11290--;
        c10322.f28591[i4] = null;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        C10321 c10321 = this.f11291.f62993;
        Object[] objArr = c10321.f28591;
        int i = c10321.f28587;
        while (true) {
            int i2 = this.f11290;
            if (i2 >= i) {
                return;
            }
            this.f11290 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
