package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۙ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7107 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C12472 f18537;

    /* JADX INFO: renamed from: ۙ */
    public int f18538;

    /* JADX INFO: renamed from: ۬ */
    public C17441 f18539;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f18540;

    /* JADX INFO: renamed from: ᩸ */
    public int f18541;

    /* JADX INFO: renamed from: ᩹ */
    public int f18542 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5216(int i, Object obj);

    public AbstractC7107(C12472 c12472) {
        this.f18537 = c12472;
        this.f18538 = c12472.f34911;
        this.f18541 = c12472.f34917;
        this.f18540 = c12472.f34916;
    }

    public final boolean hasNext() {
        return this.f18541 != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m16376() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18541--;
        boolean z = this.f18540;
        C12472 c12472 = this.f18537;
        if (z) {
            this.f18540 = false;
            int i2 = c12472.f34911;
            this.f18542 = i2;
            return i2;
        }
        int[] iArr = c12472.f34906;
        do {
            i = this.f18538 - 1;
            this.f18538 = i;
            if (i < 0) {
                this.f18542 = Integer.MIN_VALUE;
                int i3 = this.f18539.getInt((-i) - 1);
                int iM34881 = C15322.m34881(i3);
                int i4 = c12472.f34912;
                while (true) {
                    int i5 = iM34881 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    iM34881 = i5 + 1;
                    i4 = c12472.f34912;
                }
            }
        } while (iArr[i] == 0);
        this.f18542 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f18540;
        C12472 c12472 = this.f18537;
        if (z) {
            this.f18540 = false;
            int i2 = c12472.f34911;
            this.f18542 = i2;
            mo5216(i2, obj);
            this.f18541--;
        }
        int[] iArr = c12472.f34906;
        while (this.f18541 != 0) {
            int i3 = this.f18538 - 1;
            this.f18538 = i3;
            if (i3 < 0) {
                this.f18542 = Integer.MIN_VALUE;
                int i4 = this.f18539.getInt((-i3) - 1);
                int iM34881 = C15322.m34881(i4);
                int i5 = c12472.f34912;
                while (true) {
                    i = iM34881 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    iM34881 = i + 1;
                    i5 = c12472.f34912;
                }
                mo5216(i, obj);
                this.f18541--;
            } else if (iArr[i3] != 0) {
                this.f18542 = i3;
                mo5216(i3, obj);
                this.f18541--;
            }
        }
    }

    public void remove() {
        int i;
        int i2 = this.f18542;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        C12472 c12472 = this.f18537;
        if (i2 == c12472.f34911) {
            c12472.f34916 = false;
        } else {
            int i3 = this.f18538;
            if (i3 >= 0) {
                int[] iArr = c12472.f34906;
                int[] iArr2 = c12472.f34914;
                loop0: while (true) {
                    int i4 = (i2 + 1) & c12472.f34912;
                    while (true) {
                        i = iArr[i4];
                        if (i != 0) {
                            int iM34881 = C15322.m34881(i);
                            int i5 = c12472.f34912;
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
                        if (this.f18539 == null) {
                            this.f18539 = new C17441(2);
                        }
                        this.f18539.add(iArr[i4]);
                    }
                    iArr[i2] = i;
                    iArr2[i2] = iArr2[i4];
                    i2 = i4;
                }
                iArr[i2] = 0;
            } else {
                c12472.remove(this.f18539.getInt((-i3) - 1));
                this.f18542 = -1;
                return;
            }
        }
        c12472.f34917--;
        this.f18542 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}
