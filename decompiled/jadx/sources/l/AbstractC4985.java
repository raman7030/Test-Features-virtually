package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۙ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4985 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10630 f15703;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15704;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15859 f15705;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f15706;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f15707;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f15708 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo2887(int i, Object obj);

    public AbstractC4985(C10630 c10630) {
        this.f15703 = c10630;
        this.f15704 = c10630.f31939;
        this.f15707 = c10630.f31945;
        this.f15706 = c10630.f31944;
    }

    public final boolean hasNext() {
        return this.f15707 != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14472() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15707--;
        boolean z = this.f15706;
        C10630 c10630 = this.f15703;
        if (z) {
            this.f15706 = false;
            int i2 = c10630.f31939;
            this.f15708 = i2;
            return i2;
        }
        int[] iArr = c10630.f31934;
        do {
            i = this.f15704 - 1;
            this.f15704 = i;
            if (i < 0) {
                this.f15708 = Integer.MIN_VALUE;
                int i3 = this.f15705.getInt((-i) - 1);
                int iM32766 = C13630.m32766(i3);
                int i4 = c10630.f31940;
                while (true) {
                    int i5 = iM32766 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    iM32766 = i5 + 1;
                    i4 = c10630.f31940;
                }
            }
        } while (iArr[i] == 0);
        this.f15708 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f15706;
        C10630 c10630 = this.f15703;
        if (z) {
            this.f15706 = false;
            int i2 = c10630.f31939;
            this.f15708 = i2;
            mo2887(i2, obj);
            this.f15707--;
        }
        int[] iArr = c10630.f31934;
        while (this.f15707 != 0) {
            int i3 = this.f15704 - 1;
            this.f15704 = i3;
            if (i3 < 0) {
                this.f15708 = Integer.MIN_VALUE;
                int i4 = this.f15705.getInt((-i3) - 1);
                int iM32766 = C13630.m32766(i4);
                int i5 = c10630.f31940;
                while (true) {
                    i = iM32766 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    iM32766 = i + 1;
                    i5 = c10630.f31940;
                }
                mo2887(i, obj);
                this.f15707--;
            } else if (iArr[i3] != 0) {
                this.f15708 = i3;
                mo2887(i3, obj);
                this.f15707--;
            }
        }
    }

    public void remove() {
        int i;
        int i2 = this.f15708;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C10630 c10630 = this.f15703;
        if (i2 == c10630.f31939) {
            c10630.f31944 = false;
        } else {
            int i3 = this.f15704;
            if (i3 >= 0) {
                int[] iArr = c10630.f31934;
                int[] iArr2 = c10630.f31942;
                loop0: while (true) {
                    int i4 = (i2 + 1) & c10630.f31940;
                    while (true) {
                        i = iArr[i4];
                        if (i != 0) {
                            int iM32766 = C13630.m32766(i);
                            int i5 = c10630.f31940;
                            int i6 = iM32766 & i5;
                            if (i2 > i4) {
                                if (i2 >= i6 && i6 > i4) {
                                    break;
                                } else {
                                    i4 = (i4 + 1) & i5;
                                }
                            } else if (i2 >= i6 || i6 > i4) {
                                break;
                            } else {
                                i4 = (i4 + 1) & i5;
                            }
                        } else {
                            break loop0;
                        }
                    }
                    if (i4 < i2) {
                        if (this.f15705 == null) {
                            this.f15705 = new C15859(2);
                        }
                        this.f15705.add(iArr[i4]);
                    }
                    iArr[i2] = i;
                    iArr2[i2] = iArr2[i4];
                    i2 = i4;
                }
                iArr[i2] = 0;
            } else {
                c10630.remove(this.f15705.getInt((-i3) - 1));
                this.f15708 = -1;
                return;
            }
        }
        c10630.f31945--;
        this.f15708 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}
