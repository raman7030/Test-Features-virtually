package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15263 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22320 f46841;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f46842 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f46843 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C13147 f46844;

    public C15263(C22320 c22320) {
        this.f46841 = c22320;
        this.f46844 = new C13147(c22320.f72342);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46842 < this.f46841.f72342.f35006;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f46842;
        this.f46842 = i + 1;
        this.f46843 = i;
        C13147 c13147 = this.f46844;
        c13147.f39307 = i;
        return c13147;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f46843 == -1) {
            throw new IllegalStateException();
        }
        this.f46843 = -1;
        C22320 c22320 = this.f46841;
        C11737 c11737 = c22320.f72342;
        int i = c11737.f35006;
        c11737.f35006 = i - 1;
        int i2 = this.f46842;
        int i3 = i2 - 1;
        this.f46842 = i3;
        int i4 = i - i2;
        char[] cArr = c11737.f35010;
        System.arraycopy(cArr, i2, cArr, i3, i4);
        char[] cArr2 = c22320.f72342.f35005;
        int i5 = this.f46842;
        System.arraycopy(cArr2, i5 + 1, cArr2, i5, i4);
        this.f46844.f39307 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f46841.f72342.f35006;
        while (true) {
            int i2 = this.f46842;
            if (i2 >= i) {
                return;
            }
            this.f46842 = i2 + 1;
            this.f46843 = i2;
            C13147 c13147 = this.f46844;
            c13147.f39307 = i2;
            consumer.accept(c13147);
        }
    }
}
