package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17685 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21214 f54133;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f54134;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15859 f54135;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f54136;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f54137;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f54138 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo20219(int i, Object obj);

    public AbstractC17685(C21214 c21214) {
        this.f54133 = c21214;
        this.f54134 = c21214.f68348;
        this.f54137 = c21214.f68347;
        this.f54136 = c21214.f68353;
    }

    public final boolean hasNext() {
        return this.f54137 != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41419() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f54137--;
        boolean z = this.f54136;
        C21214 c21214 = this.f54133;
        if (z) {
            this.f54136 = false;
            int i2 = c21214.f68348;
            this.f54138 = i2;
            return i2;
        }
        int[] iArr = c21214.f68352;
        do {
            i = this.f54134 - 1;
            this.f54134 = i;
            if (i < 0) {
                this.f54138 = Integer.MIN_VALUE;
                int i3 = this.f54135.getInt((-i) - 1);
                int iM32766 = C13630.m32766(i3);
                int i4 = c21214.f68345;
                while (true) {
                    int i5 = iM32766 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    iM32766 = i5 + 1;
                    i4 = c21214.f68345;
                }
            }
        } while (iArr[i] == 0);
        this.f54138 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f54136;
        C21214 c21214 = this.f54133;
        if (z) {
            this.f54136 = false;
            int i2 = c21214.f68348;
            this.f54138 = i2;
            mo20219(i2, obj);
            this.f54137--;
        }
        int[] iArr = c21214.f68352;
        while (this.f54137 != 0) {
            int i3 = this.f54134 - 1;
            this.f54134 = i3;
            if (i3 < 0) {
                this.f54138 = Integer.MIN_VALUE;
                int i4 = this.f54135.getInt((-i3) - 1);
                int iM32766 = C13630.m32766(i4);
                int i5 = c21214.f68345;
                while (true) {
                    i = iM32766 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    iM32766 = i + 1;
                    i5 = c21214.f68345;
                }
                mo20219(i, obj);
                this.f54137--;
            } else if (iArr[i3] != 0) {
                this.f54138 = i3;
                mo20219(i3, obj);
                this.f54137--;
            }
        }
    }

    public void remove() {
        int i;
        int i2 = this.f54138;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C21214 c21214 = this.f54133;
        if (i2 == c21214.f68348) {
            c21214.f68353 = false;
        } else {
            int i3 = this.f54134;
            if (i3 >= 0) {
                int[] iArr = c21214.f68352;
                float[] fArr = c21214.f68349;
                loop0: while (true) {
                    int i4 = (i2 + 1) & c21214.f68345;
                    while (true) {
                        i = iArr[i4];
                        if (i != 0) {
                            int iM32766 = C13630.m32766(i);
                            int i5 = c21214.f68345;
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
                        if (this.f54135 == null) {
                            this.f54135 = new C15859(2);
                        }
                        this.f54135.add(iArr[i4]);
                    }
                    iArr[i2] = i;
                    fArr[i2] = fArr[i4];
                    i2 = i4;
                }
                iArr[i2] = 0;
            } else {
                c21214.remove(this.f54135.getInt((-i3) - 1));
                this.f54138 = -1;
                return;
            }
        }
        c21214.f68347--;
        this.f54138 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public /* bridge */ /* synthetic */ void m41420(InterfaceC4113 interfaceC4113) {
        forEachRemaining((Object) interfaceC4113);
    }
}
