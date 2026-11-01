package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19177 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C22531 f57326;

    /* JADX INFO: renamed from: ۙ */
    public int f57327;

    /* JADX INFO: renamed from: ۬ */
    public C17441 f57328;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f57329;

    /* JADX INFO: renamed from: ᩸ */
    public int f57330;

    /* JADX INFO: renamed from: ᩹ */
    public int f57331 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo22195(int i, Object obj);

    public AbstractC19177(C22531 c22531) {
        this.f57326 = c22531;
        this.f57327 = c22531.f71031;
        this.f57330 = c22531.f71030;
        this.f57329 = c22531.f71036;
    }

    public final boolean hasNext() {
        return this.f57330 != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m43665() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f57330--;
        boolean z = this.f57329;
        C22531 c22531 = this.f57326;
        if (z) {
            this.f57329 = false;
            int i2 = c22531.f71031;
            this.f57331 = i2;
            return i2;
        }
        int[] iArr = c22531.f71035;
        do {
            i = this.f57327 - 1;
            this.f57327 = i;
            if (i < 0) {
                this.f57331 = Integer.MIN_VALUE;
                int i3 = this.f57328.getInt((-i) - 1);
                int iM34881 = C15322.m34881(i3);
                int i4 = c22531.f71028;
                while (true) {
                    int i5 = iM34881 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    iM34881 = i5 + 1;
                    i4 = c22531.f71028;
                }
            }
        } while (iArr[i] == 0);
        this.f57331 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f57329;
        C22531 c22531 = this.f57326;
        if (z) {
            this.f57329 = false;
            int i2 = c22531.f71031;
            this.f57331 = i2;
            mo22195(i2, obj);
            this.f57330--;
        }
        int[] iArr = c22531.f71035;
        while (this.f57330 != 0) {
            int i3 = this.f57327 - 1;
            this.f57327 = i3;
            if (i3 < 0) {
                this.f57331 = Integer.MIN_VALUE;
                int i4 = this.f57328.getInt((-i3) - 1);
                int iM34881 = C15322.m34881(i4);
                int i5 = c22531.f71028;
                while (true) {
                    i = iM34881 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    iM34881 = i + 1;
                    i5 = c22531.f71028;
                }
                mo22195(i, obj);
                this.f57330--;
            } else if (iArr[i3] != 0) {
                this.f57331 = i3;
                mo22195(i3, obj);
                this.f57330--;
            }
        }
    }

    public void remove() {
        int i;
        int i2 = this.f57331;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C22531 c22531 = this.f57326;
        if (i2 == c22531.f71031) {
            c22531.f71036 = false;
        } else {
            int i3 = this.f57327;
            if (i3 >= 0) {
                int[] iArr = c22531.f71035;
                float[] fArr = c22531.f71032;
                loop0: while (true) {
                    int i4 = (i2 + 1) & c22531.f71028;
                    while (true) {
                        i = iArr[i4];
                        if (i != 0) {
                            int iM34881 = C15322.m34881(i);
                            int i5 = c22531.f71028;
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
                        if (this.f57328 == null) {
                            this.f57328 = new C17441(2);
                        }
                        this.f57328.add(iArr[i4]);
                    }
                    iArr[i2] = i;
                    fArr[i2] = fArr[i4];
                    i2 = i4;
                }
                iArr[i2] = 0;
            } else {
                c22531.remove(this.f57328.getInt((-i3) - 1));
                this.f57331 = -1;
                return;
            }
        }
        c22531.f71030--;
        this.f57331 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    /* JADX INFO: renamed from: ܽ */
    public /* bridge */ /* synthetic */ void m43666(InterfaceC6278 interfaceC6278) {
        forEachRemaining((Object) interfaceC6278);
    }
}
