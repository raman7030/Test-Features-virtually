package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۫ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DC36 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12311 implements InterfaceC6667, InterfaceC12433 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5961 f36851;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f36852;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15859 f36853;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f36854;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f36855;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f36856 = -1;

    @Override // l.InterfaceC6667, l.InterfaceC14529, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public C12311(C5961 c5961) {
        this.f36851 = c5961;
        this.f36852 = c5961.f18277;
        this.f36855 = c5961.f18276;
        this.f36854 = c5961.f18280;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36855 != 0;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        int i;
        int i2;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f36855--;
        C5961 c5961 = this.f36851;
        int[] iArr = c5961.f18279;
        if (this.f36854) {
            this.f36854 = false;
            int i3 = c5961.f18277;
            this.f36856 = i3;
            return iArr[i3];
        }
        do {
            i = this.f36852 - 1;
            this.f36852 = i;
            if (i < 0) {
                this.f36856 = Integer.MIN_VALUE;
                return this.f36853.getInt((-i) - 1);
            }
            i2 = iArr[i];
        } while (i2 == 0);
        this.f36856 = i;
        return i2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        int i2 = this.f36856;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C5961 c5961 = this.f36851;
        int i3 = c5961.f18277;
        if (i2 == i3) {
            c5961.f18280 = false;
            c5961.f18279[i3] = 0;
        } else {
            int i4 = this.f36852;
            if (i4 >= 0) {
                int[] iArr = c5961.f18279;
                loop0: while (true) {
                    int i5 = (i2 + 1) & c5961.f18275;
                    while (true) {
                        i = iArr[i5];
                        if (i != 0) {
                            int iM32766 = C13630.m32766(i);
                            int i6 = c5961.f18275;
                            int i7 = iM32766 & i6;
                            if (i2 > i5) {
                                if (i2 >= i7 && i7 > i5) {
                                    break;
                                } else {
                                    i5 = (i5 + 1) & i6;
                                }
                            } else if (i2 >= i7 || i7 > i5) {
                                break;
                            } else {
                                i5 = (i5 + 1) & i6;
                            }
                        } else {
                            break loop0;
                        }
                    }
                    if (i5 < i2) {
                        if (this.f36853 == null) {
                            this.f36853 = new C15859(2);
                        }
                        this.f36853.add(iArr[i5]);
                    }
                    iArr[i2] = i;
                    i2 = i5;
                }
                iArr[i2] = 0;
            } else {
                c5961.remove(this.f36853.getInt((-i4) - 1));
                this.f36856 = -1;
                return;
            }
        }
        c5961.f18276--;
        this.f36856 = -1;
    }

    @Override // l.InterfaceC20881
    public final void forEachRemaining(IntConsumer intConsumer) {
        C5961 c5961 = this.f36851;
        int[] iArr = c5961.f18279;
        if (this.f36854) {
            this.f36854 = false;
            int i = c5961.f18277;
            this.f36856 = i;
            intConsumer.accept(iArr[i]);
            this.f36855--;
        }
        while (this.f36855 != 0) {
            int i2 = this.f36852 - 1;
            this.f36852 = i2;
            if (i2 < 0) {
                this.f36856 = Integer.MIN_VALUE;
                intConsumer.accept(this.f36853.getInt((-i2) - 1));
                this.f36855--;
            } else {
                int i3 = iArr[i2];
                if (i3 != 0) {
                    this.f36856 = i2;
                    intConsumer.accept(i3);
                    this.f36855--;
                }
            }
        }
    }
}
