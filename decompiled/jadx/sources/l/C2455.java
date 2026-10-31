package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۖۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91Q1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2455 implements InterfaceC6667, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18683 f7841;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f7842 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f7843 = 0;

    @Override // l.InterfaceC6667, l.InterfaceC14529, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public C2455(C18683 c18683) {
        this.f7841 = c18683;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7843 < this.f7841.f59087;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f7841.f59086;
        int i = this.f7843;
        this.f7843 = i + 1;
        this.f7842 = i;
        return iArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f7842 == -1) {
            throw new IllegalStateException();
        }
        this.f7842 = -1;
        C18683 c18683 = this.f7841;
        int i = c18683.f59087;
        c18683.f59087 = i - 1;
        int i2 = this.f7843;
        int i3 = i2 - 1;
        this.f7843 = i3;
        int[] iArr = c18683.f59086;
        System.arraycopy(iArr, i2, iArr, i3, i - i2);
    }

    @Override // l.InterfaceC20881
    public final void forEachRemaining(IntConsumer intConsumer) {
        C18683 c18683 = this.f7841;
        int[] iArr = c18683.f59086;
        while (true) {
            int i = this.f7843;
            if (i >= c18683.f59087) {
                return;
            }
            this.f7843 = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }
}
