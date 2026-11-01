package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۘܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6178 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C7519 f15540;

    /* JADX INFO: renamed from: ۙ */
    public int f15541;

    /* JADX INFO: renamed from: ۬ */
    public C17441 f15542;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f15543;

    /* JADX INFO: renamed from: ᩸ */
    public int f15544;

    /* JADX INFO: renamed from: ᩹ */
    public int f15545 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo14007(int i, Object obj);

    public AbstractC6178(C7519 c7519) {
        this.f15540 = c7519;
        this.f15541 = c7519.f19740;
        this.f15544 = c7519.f19739;
        this.f15543 = c7519.f19745;
    }

    public final boolean hasNext() {
        return this.f15544 != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m14006() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15544--;
        boolean z = this.f15543;
        C7519 c7519 = this.f15540;
        if (z) {
            this.f15543 = false;
            int i2 = c7519.f19740;
            this.f15545 = i2;
            return i2;
        }
        int[] iArr = c7519.f19744;
        do {
            i = this.f15541 - 1;
            this.f15541 = i;
            if (i < 0) {
                this.f15545 = Integer.MIN_VALUE;
                int i3 = this.f15542.getInt((-i) - 1);
                int iM34881 = C15322.m34881(i3);
                int i4 = c7519.f19737;
                while (true) {
                    int i5 = iM34881 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    iM34881 = i5 + 1;
                    i4 = c7519.f19737;
                }
            }
        } while (iArr[i] == 0);
        this.f15545 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f15543;
        C7519 c7519 = this.f15540;
        if (z) {
            this.f15543 = false;
            int i2 = c7519.f19740;
            this.f15545 = i2;
            mo14007(i2, obj);
            this.f15544--;
        }
        int[] iArr = c7519.f19744;
        while (this.f15544 != 0) {
            int i3 = this.f15541 - 1;
            this.f15541 = i3;
            if (i3 < 0) {
                this.f15545 = Integer.MIN_VALUE;
                int i4 = this.f15542.getInt((-i3) - 1);
                int iM34881 = C15322.m34881(i4);
                int i5 = c7519.f19737;
                while (true) {
                    i = iM34881 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    iM34881 = i + 1;
                    i5 = c7519.f19737;
                }
                mo14007(i, obj);
                this.f15544--;
            } else if (iArr[i3] != 0) {
                this.f15545 = i3;
                mo14007(i3, obj);
                this.f15544--;
            }
        }
    }

    public void remove() {
        int i;
        int i2 = this.f15545;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C7519 c7519 = this.f15540;
        if (i2 == c7519.f19740) {
            c7519.f19745 = false;
        } else {
            int i3 = this.f15541;
            if (i3 >= 0) {
                int[] iArr = c7519.f19744;
                byte[] bArr = c7519.f19741;
                loop0: while (true) {
                    int i4 = (i2 + 1) & c7519.f19737;
                    while (true) {
                        i = iArr[i4];
                        if (i != 0) {
                            int iM34881 = C15322.m34881(i);
                            int i5 = c7519.f19737;
                            int i6 = iM34881 & i5;
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
                        if (this.f15542 == null) {
                            this.f15542 = new C17441(2);
                        }
                        this.f15542.add(iArr[i4]);
                    }
                    iArr[i2] = i;
                    bArr[i2] = bArr[i4];
                    i2 = i4;
                }
                iArr[i2] = 0;
            } else {
                c7519.remove(this.f15542.getInt((-i3) - 1));
                this.f15545 = -1;
                return;
            }
        }
        c7519.f19739--;
        this.f15545 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}
