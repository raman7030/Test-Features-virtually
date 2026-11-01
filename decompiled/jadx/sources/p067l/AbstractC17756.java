package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܺ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17756 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C21111 f53024;

    /* JADX INFO: renamed from: ۙ */
    public int f53025;

    /* JADX INFO: renamed from: ۬ */
    public C17441 f53026;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f53027;

    /* JADX INFO: renamed from: ᩸ */
    public int f53028;

    /* JADX INFO: renamed from: ᩹ */
    public int f53029 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo14536(int i, Object obj);

    public AbstractC17756(C21111 c21111) {
        this.f53024 = c21111;
        this.f53025 = c21111.f66361;
        this.f53028 = c21111.f66363;
        this.f53027 = c21111.f66368;
    }

    public final boolean hasNext() {
        return this.f53028 != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40337() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f53028--;
        boolean z = this.f53027;
        C21111 c21111 = this.f53024;
        if (z) {
            this.f53027 = false;
            int i2 = c21111.f66361;
            this.f53029 = i2;
            return i2;
        }
        int[] iArr = c21111.f66360;
        do {
            i = this.f53025 - 1;
            this.f53025 = i;
            if (i < 0) {
                this.f53029 = Integer.MIN_VALUE;
                int i3 = this.f53026.getInt((-i) - 1);
                int iM34881 = C15322.m34881(i3);
                int i4 = c21111.f66365;
                while (true) {
                    int i5 = iM34881 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    iM34881 = i5 + 1;
                    i4 = c21111.f66365;
                }
            }
        } while (iArr[i] == 0);
        this.f53029 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f53027;
        C21111 c21111 = this.f53024;
        if (z) {
            this.f53027 = false;
            int i2 = c21111.f66361;
            this.f53029 = i2;
            mo14536(i2, obj);
            this.f53028--;
        }
        int[] iArr = c21111.f66360;
        while (this.f53028 != 0) {
            int i3 = this.f53025 - 1;
            this.f53025 = i3;
            if (i3 < 0) {
                this.f53029 = Integer.MIN_VALUE;
                int i4 = this.f53026.getInt((-i3) - 1);
                int iM34881 = C15322.m34881(i4);
                int i5 = c21111.f66365;
                while (true) {
                    i = iM34881 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    iM34881 = i + 1;
                    i5 = c21111.f66365;
                }
                mo14536(i, obj);
                this.f53028--;
            } else if (iArr[i3] != 0) {
                this.f53029 = i3;
                mo14536(i3, obj);
                this.f53028--;
            }
        }
    }

    public void remove() {
        int i;
        int i2 = this.f53029;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C21111 c21111 = this.f53024;
        int i3 = c21111.f66361;
        if (i2 == i3) {
            c21111.f66368 = false;
            c21111.f66370[i3] = null;
        } else {
            int i4 = this.f53025;
            if (i4 >= 0) {
                int[] iArr = c21111.f66360;
                Object[] objArr = c21111.f66370;
                loop0: while (true) {
                    int i5 = (i2 + 1) & c21111.f66365;
                    while (true) {
                        i = iArr[i5];
                        if (i != 0) {
                            int iM34881 = C15322.m34881(i);
                            int i6 = c21111.f66365;
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
                        if (this.f53026 == null) {
                            this.f53026 = new C17441(2);
                        }
                        this.f53026.add(iArr[i5]);
                    }
                    iArr[i2] = i;
                    objArr[i2] = objArr[i5];
                    i2 = i5;
                }
                iArr[i2] = 0;
                objArr[i2] = null;
            } else {
                c21111.remove(this.f53026.getInt((-i4) - 1));
                this.f53029 = -1;
                return;
            }
        }
        c21111.f66363--;
        this.f53029 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}
