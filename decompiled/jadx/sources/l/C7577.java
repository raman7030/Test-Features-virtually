package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7577 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10715 f23444;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f23445 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f23446 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14241 f23447;

    public C7577(C10715 c10715) {
        this.f23444 = c10715;
        this.f23447 = new C14241(c10715.f32296);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23445 < this.f23444.f32296.f28192;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f23445;
        this.f23445 = i + 1;
        this.f23446 = i;
        C14241 c14241 = this.f23447;
        c14241.f42916 = i;
        return c14241;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f23446 == -1) {
            throw new IllegalStateException();
        }
        this.f23446 = -1;
        C10715 c10715 = this.f23444;
        C9304 c9304 = c10715.f32296;
        int i = c9304.f28192;
        c9304.f28192 = i - 1;
        int i2 = this.f23445;
        int i3 = i2 - 1;
        this.f23445 = i3;
        int i4 = i - i2;
        long[] jArr = c9304.f28196;
        System.arraycopy(jArr, i2, jArr, i3, i4);
        Object[] objArr = c10715.f32296.f28191;
        int i5 = this.f23445;
        System.arraycopy(objArr, i5 + 1, objArr, i5, i4);
        this.f23447.f42916 = -1;
        C9304 c9305 = c10715.f32296;
        c9305.f28191[c9305.f28192] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f23444.f32296.f28192;
        while (true) {
            int i2 = this.f23445;
            if (i2 >= i) {
                return;
            }
            this.f23445 = i2 + 1;
            this.f23446 = i2;
            C14241 c14241 = this.f23447;
            c14241.f42916 = i2;
            consumer.accept(c14241);
        }
    }
}
