package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18600 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0254 f57694;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f57695 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f57696 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15070 f57697;

    public C18600(C0254 c0254) {
        this.f57694 = c0254;
        this.f57697 = new C15070(c0254.f1537);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f57695 < this.f57694.f1537.f14280;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f57695;
        this.f57695 = i + 1;
        this.f57696 = i;
        C15070 c15070 = this.f57697;
        c15070.f46047 = i;
        return c15070;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f57696 == -1) {
            throw new IllegalStateException();
        }
        this.f57696 = -1;
        C0254 c0254 = this.f57694;
        C4488 c4488 = c0254.f1537;
        int i = c4488.f14280;
        c4488.f14280 = i - 1;
        int i2 = this.f57695;
        int i3 = i2 - 1;
        this.f57695 = i3;
        int i4 = i - i2;
        int[] iArr = c4488.f14284;
        System.arraycopy(iArr, i2, iArr, i3, i4);
        Object[] objArr = c0254.f1537.f14279;
        int i5 = this.f57695;
        System.arraycopy(objArr, i5 + 1, objArr, i5, i4);
        this.f57697.f46047 = -1;
        C4488 c4489 = c0254.f1537;
        c4489.f14279[c4489.f14280] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f57694.f1537.f14280;
        while (true) {
            int i2 = this.f57695;
            if (i2 >= i) {
                return;
            }
            this.f57695 = i2 + 1;
            this.f57696 = i2;
            C15070 c15070 = this.f57697;
            c15070.f46047 = i2;
            consumer.accept(c15070);
        }
    }
}
