package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13926 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10715 f41598;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14241 f41601;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f41600 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f41599 = 0;

    public C13926(C10715 c10715) {
        this.f41598 = c10715;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41599 < this.f41598.f32296.f28192;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C9304 c9304 = this.f41598.f32296;
        int i = this.f41599;
        this.f41599 = i + 1;
        this.f41600 = i;
        C14241 c14241 = new C14241(c9304, i);
        this.f41601 = c14241;
        return c14241;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f41600 == -1) {
            throw new IllegalStateException();
        }
        this.f41600 = -1;
        C10715 c10715 = this.f41598;
        C9304 c9304 = c10715.f32296;
        int i = c9304.f28192;
        c9304.f28192 = i - 1;
        int i2 = this.f41599;
        int i3 = i2 - 1;
        this.f41599 = i3;
        int i4 = i - i2;
        long[] jArr = c9304.f28196;
        System.arraycopy(jArr, i2, jArr, i3, i4);
        Object[] objArr = c10715.f32296.f28191;
        int i5 = this.f41599;
        System.arraycopy(objArr, i5 + 1, objArr, i5, i4);
        this.f41601.f42916 = -1;
        C9304 c9305 = c10715.f32296;
        c9305.f28191[c9305.f28192] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        C10715 c10715 = this.f41598;
        int i = c10715.f32296.f28192;
        while (true) {
            int i2 = this.f41599;
            if (i2 >= i) {
                return;
            }
            C9304 c9304 = c10715.f32296;
            this.f41599 = i2 + 1;
            this.f41600 = i2;
            C14241 c14241 = new C14241(c9304, i2);
            this.f41601 = c14241;
            consumer.accept(c14241);
        }
    }
}
