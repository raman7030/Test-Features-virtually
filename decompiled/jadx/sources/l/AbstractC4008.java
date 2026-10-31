package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۘܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4008 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5419 f12724;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f12725;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15859 f12726;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f12727;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f12728;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f12729 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo12087(int i, Object obj);

    public AbstractC4008(C5419 c5419) {
        this.f12724 = c5419;
        this.f12725 = c5419.f16902;
        this.f12728 = c5419.f16901;
        this.f12727 = c5419.f16907;
    }

    public final boolean hasNext() {
        return this.f12728 != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m12086() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12728--;
        boolean z = this.f12727;
        C5419 c5419 = this.f12724;
        if (z) {
            this.f12727 = false;
            int i2 = c5419.f16902;
            this.f12729 = i2;
            return i2;
        }
        int[] iArr = c5419.f16906;
        do {
            i = this.f12725 - 1;
            this.f12725 = i;
            if (i < 0) {
                this.f12729 = Integer.MIN_VALUE;
                int i3 = this.f12726.getInt((-i) - 1);
                int iM32766 = C13630.m32766(i3);
                int i4 = c5419.f16899;
                while (true) {
                    int i5 = iM32766 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    iM32766 = i5 + 1;
                    i4 = c5419.f16899;
                }
            }
        } while (iArr[i] == 0);
        this.f12729 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f12727;
        C5419 c5419 = this.f12724;
        if (z) {
            this.f12727 = false;
            int i2 = c5419.f16902;
            this.f12729 = i2;
            mo12087(i2, obj);
            this.f12728--;
        }
        int[] iArr = c5419.f16906;
        while (this.f12728 != 0) {
            int i3 = this.f12725 - 1;
            this.f12725 = i3;
            if (i3 < 0) {
                this.f12729 = Integer.MIN_VALUE;
                int i4 = this.f12726.getInt((-i3) - 1);
                int iM32766 = C13630.m32766(i4);
                int i5 = c5419.f16899;
                while (true) {
                    i = iM32766 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    iM32766 = i + 1;
                    i5 = c5419.f16899;
                }
                mo12087(i, obj);
                this.f12728--;
            } else if (iArr[i3] != 0) {
                this.f12729 = i3;
                mo12087(i3, obj);
                this.f12728--;
            }
        }
    }

    public void remove() {
        int i;
        int i2 = this.f12729;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C5419 c5419 = this.f12724;
        if (i2 == c5419.f16902) {
            c5419.f16907 = false;
        } else {
            int i3 = this.f12725;
            if (i3 >= 0) {
                int[] iArr = c5419.f16906;
                byte[] bArr = c5419.f16903;
                loop0: while (true) {
                    int i4 = (i2 + 1) & c5419.f16899;
                    while (true) {
                        i = iArr[i4];
                        if (i != 0) {
                            int iM32766 = C13630.m32766(i);
                            int i5 = c5419.f16899;
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
                        if (this.f12726 == null) {
                            this.f12726 = new C15859(2);
                        }
                        this.f12726.add(iArr[i4]);
                    }
                    iArr[i2] = i;
                    bArr[i2] = bArr[i4];
                    i2 = i4;
                }
                iArr[i2] = 0;
            } else {
                c5419.remove(this.f12726.getInt((-i3) - 1));
                this.f12729 = -1;
                return;
            }
        }
        c5419.f16901--;
        this.f12729 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}
