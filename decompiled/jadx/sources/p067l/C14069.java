package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۫ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DC36 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14069 implements InterfaceC8705, InterfaceC14185 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C8034 f39866;

    /* JADX INFO: renamed from: ۙ */
    public int f39867;

    /* JADX INFO: renamed from: ۬ */
    public C17441 f39868;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f39869;

    /* JADX INFO: renamed from: ᩸ */
    public int f39870;

    /* JADX INFO: renamed from: ᩹ */
    public int f39871 = -1;

    @Override // p067l.InterfaceC8705, p067l.InterfaceC16177, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C24798.m54480(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public C14069(C8034 c8034) {
        this.f39866 = c8034;
        this.f39867 = c8034.f21131;
        this.f39870 = c8034.f21130;
        this.f39869 = c8034.f21134;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39870 != 0;
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        int i;
        int i2;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f39870--;
        C8034 c8034 = this.f39866;
        int[] iArr = c8034.f21133;
        if (this.f39869) {
            this.f39869 = false;
            int i3 = c8034.f21131;
            this.f39871 = i3;
            return iArr[i3];
        }
        do {
            i = this.f39867 - 1;
            this.f39867 = i;
            if (i < 0) {
                this.f39871 = Integer.MIN_VALUE;
                return this.f39868.getInt((-i) - 1);
            }
            i2 = iArr[i];
        } while (i2 == 0);
        this.f39871 = i;
        return i2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        int i2 = this.f39871;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C8034 c8034 = this.f39866;
        int i3 = c8034.f21131;
        if (i2 == i3) {
            c8034.f21134 = false;
            c8034.f21133[i3] = 0;
        } else {
            int i4 = this.f39867;
            if (i4 >= 0) {
                int[] iArr = c8034.f21133;
                loop0: while (true) {
                    int i5 = (i2 + 1) & c8034.f21129;
                    while (true) {
                        i = iArr[i5];
                        if (i != 0) {
                            int iM34881 = C15322.m34881(i);
                            int i6 = c8034.f21129;
                            int i7 = iM34881 & i6;
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
                        if (this.f39868 == null) {
                            this.f39868 = new C17441(2);
                        }
                        this.f39868.add(iArr[i5]);
                    }
                    iArr[i2] = i;
                    i2 = i5;
                }
                iArr[i2] = 0;
            } else {
                c8034.remove(this.f39868.getInt((-i4) - 1));
                this.f39871 = -1;
                return;
            }
        }
        c8034.f21130--;
        this.f39871 = -1;
    }

    @Override // p067l.InterfaceC22214
    public final void forEachRemaining(IntConsumer intConsumer) {
        C8034 c8034 = this.f39866;
        int[] iArr = c8034.f21133;
        if (this.f39869) {
            this.f39869 = false;
            int i = c8034.f21131;
            this.f39871 = i;
            intConsumer.accept(iArr[i]);
            this.f39870--;
        }
        while (this.f39870 != 0) {
            int i2 = this.f39867 - 1;
            this.f39867 = i2;
            if (i2 < 0) {
                this.f39871 = Integer.MIN_VALUE;
                intConsumer.accept(this.f39868.getInt((-i2) - 1));
                this.f39870--;
            } else {
                int i3 = iArr[i2];
                if (i3 != 0) {
                    this.f39871 = i2;
                    intConsumer.accept(i3);
                    this.f39870--;
                }
            }
        }
    }
}
