package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3783 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0254 f11951;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15070 f11954;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f11953 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f11952 = 0;

    public C3783(C0254 c0254) {
        this.f11951 = c0254;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11952 < this.f11951.f1537.f14280;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C4488 c4488 = this.f11951.f1537;
        int i = this.f11952;
        this.f11952 = i + 1;
        this.f11953 = i;
        C15070 c15070 = new C15070(c4488, i);
        this.f11954 = c15070;
        return c15070;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f11953 == -1) {
            throw new IllegalStateException();
        }
        this.f11953 = -1;
        C0254 c0254 = this.f11951;
        C4488 c4488 = c0254.f1537;
        int i = c4488.f14280;
        c4488.f14280 = i - 1;
        int i2 = this.f11952;
        int i3 = i2 - 1;
        this.f11952 = i3;
        int i4 = i - i2;
        int[] iArr = c4488.f14284;
        System.arraycopy(iArr, i2, iArr, i3, i4);
        Object[] objArr = c0254.f1537.f14279;
        int i5 = this.f11952;
        System.arraycopy(objArr, i5 + 1, objArr, i5, i4);
        this.f11954.f46047 = -1;
        C4488 c4489 = c0254.f1537;
        c4489.f14279[c4489.f14280] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        C0254 c0254 = this.f11951;
        int i = c0254.f1537.f14280;
        while (true) {
            int i2 = this.f11952;
            if (i2 >= i) {
                return;
            }
            C4488 c4488 = c0254.f1537;
            this.f11952 = i2 + 1;
            this.f11953 = i2;
            C15070 c15070 = new C15070(c4488, i2);
            this.f11954 = c15070;
            consumer.accept(c15070);
        }
    }
}
