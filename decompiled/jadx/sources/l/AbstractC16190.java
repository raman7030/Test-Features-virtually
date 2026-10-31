package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܺ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16190 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19720 f49858;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49859;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15859 f49860;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f49861;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f49862;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f49863 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo12660(int i, Object obj);

    public AbstractC16190(C19720 c19720) {
        this.f49858 = c19720;
        this.f49859 = c19720.f63730;
        this.f49862 = c19720.f63732;
        this.f49861 = c19720.f63737;
    }

    public final boolean hasNext() {
        return this.f49862 != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38125() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f49862--;
        boolean z = this.f49861;
        C19720 c19720 = this.f49858;
        if (z) {
            this.f49861 = false;
            int i2 = c19720.f63730;
            this.f49863 = i2;
            return i2;
        }
        int[] iArr = c19720.f63729;
        do {
            i = this.f49859 - 1;
            this.f49859 = i;
            if (i < 0) {
                this.f49863 = Integer.MIN_VALUE;
                int i3 = this.f49860.getInt((-i) - 1);
                int iM32766 = C13630.m32766(i3);
                int i4 = c19720.f63734;
                while (true) {
                    int i5 = iM32766 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    iM32766 = i5 + 1;
                    i4 = c19720.f63734;
                }
            }
        } while (iArr[i] == 0);
        this.f49863 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f49861;
        C19720 c19720 = this.f49858;
        if (z) {
            this.f49861 = false;
            int i2 = c19720.f63730;
            this.f49863 = i2;
            mo12660(i2, obj);
            this.f49862--;
        }
        int[] iArr = c19720.f63729;
        while (this.f49862 != 0) {
            int i3 = this.f49859 - 1;
            this.f49859 = i3;
            if (i3 < 0) {
                this.f49863 = Integer.MIN_VALUE;
                int i4 = this.f49860.getInt((-i3) - 1);
                int iM32766 = C13630.m32766(i4);
                int i5 = c19720.f63734;
                while (true) {
                    i = iM32766 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    iM32766 = i + 1;
                    i5 = c19720.f63734;
                }
                mo12660(i, obj);
                this.f49862--;
            } else if (iArr[i3] != 0) {
                this.f49863 = i3;
                mo12660(i3, obj);
                this.f49862--;
            }
        }
    }

    public void remove() {
        int i;
        int i2 = this.f49863;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C19720 c19720 = this.f49858;
        int i3 = c19720.f63730;
        if (i2 == i3) {
            c19720.f63737 = false;
            c19720.f63739[i3] = null;
        } else {
            int i4 = this.f49859;
            if (i4 >= 0) {
                int[] iArr = c19720.f63729;
                Object[] objArr = c19720.f63739;
                loop0: while (true) {
                    int i5 = (i2 + 1) & c19720.f63734;
                    while (true) {
                        i = iArr[i5];
                        if (i != 0) {
                            int iM32766 = C13630.m32766(i);
                            int i6 = c19720.f63734;
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
                        if (this.f49860 == null) {
                            this.f49860 = new C15859(2);
                        }
                        this.f49860.add(iArr[i5]);
                    }
                    iArr[i2] = i;
                    objArr[i2] = objArr[i5];
                    i2 = i5;
                }
                iArr[i2] = 0;
                objArr[i2] = null;
            } else {
                c19720.remove(this.f49860.getInt((-i4) - 1));
                this.f49863 = -1;
                return;
            }
        }
        c19720.f63732--;
        this.f49863 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}
