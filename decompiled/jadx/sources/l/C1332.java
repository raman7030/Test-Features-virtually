package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1332 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f4796 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15442 f4797;

    public C1332(C15442 c15442) {
        this.f4797 = c15442;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4796 < this.f4797.f47296.f69812;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f4797.f47296.f69811;
        int i = this.f4796;
        this.f4796 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f4796;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C15442 c15442 = this.f4797;
        C21794 c21794 = c15442.f47296;
        int i2 = c21794.f69812 - i;
        Object[] objArr = c21794.f69816;
        System.arraycopy(objArr, i, objArr, i - 1, i2);
        Object[] objArr2 = c15442.f47296.f69811;
        int i3 = this.f4796;
        System.arraycopy(objArr2, i3, objArr2, i3 - 1, i2);
        C21794 c21795 = c15442.f47296;
        int i4 = c21795.f69812 - 1;
        c21795.f69812 = i4;
        this.f4796--;
        c21795.f69816[i4] = null;
        c21795.f69811[i4] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        C21794 c21794 = this.f4797.f47296;
        Object[] objArr = c21794.f69811;
        int i = c21794.f69812;
        while (true) {
            int i2 = this.f4796;
            if (i2 >= i) {
                return;
            }
            this.f4796 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
