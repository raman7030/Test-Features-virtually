package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes.dex */
public final class C23414 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f75188 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20593 f75189;

    public C23414(C20593 c20593) {
        this.f75189 = c20593;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f75188 < this.f75189.f66296.f28192;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f75189.f66296.f28191;
        int i = this.f75188;
        this.f75188 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f75188;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C20593 c20593 = this.f75189;
        C9304 c9304 = c20593.f66296;
        int i2 = c9304.f28192 - i;
        long[] jArr = c9304.f28196;
        System.arraycopy(jArr, i, jArr, i - 1, i2);
        Object[] objArr = c20593.f66296.f28191;
        int i3 = this.f75188;
        System.arraycopy(objArr, i3, objArr, i3 - 1, i2);
        C9304 c9305 = c20593.f66296;
        int i4 = c9305.f28192 - 1;
        c9305.f28192 = i4;
        this.f75188--;
        c9305.f28191[i4] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        C9304 c9304 = this.f75189.f66296;
        Object[] objArr = c9304.f28191;
        int i = c9304.f28192;
        while (true) {
            int i2 = this.f75188;
            if (i2 >= i) {
                return;
            }
            this.f75188 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
