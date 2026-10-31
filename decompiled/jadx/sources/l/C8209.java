package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8209 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22320 f25226;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C13147 f25229;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f25228 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25227 = 0;

    public C8209(C22320 c22320) {
        this.f25226 = c22320;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25227 < this.f25226.f72342.f35006;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C11737 c11737 = this.f25226.f72342;
        int i = this.f25227;
        this.f25227 = i + 1;
        this.f25228 = i;
        C13147 c13147 = new C13147(c11737, i);
        this.f25229 = c13147;
        return c13147;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f25228 == -1) {
            throw new IllegalStateException();
        }
        this.f25228 = -1;
        C22320 c22320 = this.f25226;
        C11737 c11737 = c22320.f72342;
        int i = c11737.f35006;
        c11737.f35006 = i - 1;
        int i2 = this.f25227;
        int i3 = i2 - 1;
        this.f25227 = i3;
        int i4 = i - i2;
        char[] cArr = c11737.f35010;
        System.arraycopy(cArr, i2, cArr, i3, i4);
        char[] cArr2 = c22320.f72342.f35005;
        int i5 = this.f25227;
        System.arraycopy(cArr2, i5 + 1, cArr2, i5, i4);
        this.f25229.f39307 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        C22320 c22320 = this.f25226;
        int i = c22320.f72342.f35006;
        while (true) {
            int i2 = this.f25227;
            if (i2 >= i) {
                return;
            }
            C11737 c11737 = c22320.f72342;
            this.f25227 = i2 + 1;
            this.f25228 = i2;
            C13147 c13147 = new C13147(c11737, i2);
            this.f25229 = c13147;
            consumer.accept(c13147);
        }
    }
}
