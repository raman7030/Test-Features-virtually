package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10170 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C23581 f28136;

    /* JADX INFO: renamed from: ᩹ */
    public C14863 f28139;

    /* JADX INFO: renamed from: ᩸ */
    public int f28138 = -1;

    /* JADX INFO: renamed from: ᩶ */
    public int f28137 = 0;

    public C10170(C23581 c23581) {
        this.f28136 = c23581;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28137 < this.f28136.f75068.f38006;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C13523 c13523 = this.f28136.f75068;
        int i = this.f28137;
        this.f28137 = i + 1;
        this.f28138 = i;
        C14863 c14863 = new C14863(c13523, i);
        this.f28139 = c14863;
        return c14863;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f28138 == -1) {
            throw new IllegalStateException();
        }
        this.f28138 = -1;
        C23581 c23581 = this.f28136;
        C13523 c13523 = c23581.f75068;
        int i = c13523.f38006;
        c13523.f38006 = i - 1;
        int i2 = this.f28137;
        int i3 = i2 - 1;
        this.f28137 = i3;
        int i4 = i - i2;
        char[] cArr = c13523.f38010;
        System.arraycopy(cArr, i2, cArr, i3, i4);
        char[] cArr2 = c23581.f75068.f38005;
        int i5 = this.f28137;
        System.arraycopy(cArr2, i5 + 1, cArr2, i5, i4);
        this.f28139.f42362 = -1;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        C23581 c23581 = this.f28136;
        int i = c23581.f75068.f38006;
        while (true) {
            int i2 = this.f28137;
            if (i2 >= i) {
                return;
            }
            C13523 c13523 = c23581.f75068;
            this.f28137 = i2 + 1;
            this.f28138 = i2;
            C14863 c14863 = new C14863(c13523, i2);
            this.f28139 = c14863;
            consumer.accept(c14863);
        }
    }
}
