package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16874 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C23581 f49965;

    /* JADX INFO: renamed from: ᩶ */
    public int f49966 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public int f49967 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public C14863 f49968;

    public C16874(C23581 c23581) {
        this.f49965 = c23581;
        this.f49968 = new C14863(c23581.f75068);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f49966 < this.f49965.f75068.f38006;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f49966;
        this.f49966 = i + 1;
        this.f49967 = i;
        C14863 c14863 = this.f49968;
        c14863.f42362 = i;
        return c14863;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f49967 == -1) {
            throw new IllegalStateException();
        }
        this.f49967 = -1;
        C23581 c23581 = this.f49965;
        C13523 c13523 = c23581.f75068;
        int i = c13523.f38006;
        c13523.f38006 = i - 1;
        int i2 = this.f49966;
        int i3 = i2 - 1;
        this.f49966 = i3;
        int i4 = i - i2;
        char[] cArr = c13523.f38010;
        System.arraycopy(cArr, i2, cArr, i3, i4);
        char[] cArr2 = c23581.f75068.f38005;
        int i5 = this.f49966;
        System.arraycopy(cArr2, i5 + 1, cArr2, i5, i4);
        this.f49968.f42362 = -1;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f49965.f75068.f38006;
        while (true) {
            int i2 = this.f49966;
            if (i2 >= i) {
                return;
            }
            this.f49966 = i2 + 1;
            this.f49967 = i2;
            C14863 c14863 = this.f49968;
            c14863.f42362 = i2;
            consumer.accept(c14863);
        }
    }
}
