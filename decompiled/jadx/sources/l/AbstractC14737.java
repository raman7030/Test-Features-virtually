package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܳ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14737 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9800 f45003;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f45004;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C19119 f45005;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f45006;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f45007;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f45008 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo6628(int i, Object obj);

    public AbstractC14737(C9800 c9800) {
        this.f45003 = c9800;
        this.f45004 = c9800.f29627;
        this.f45007 = c9800.f29629;
        this.f45006 = c9800.f29634;
    }

    public final boolean hasNext() {
        return this.f45007 != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35041() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f45007--;
        boolean z = this.f45006;
        C9800 c9800 = this.f45003;
        if (z) {
            this.f45006 = false;
            int i2 = c9800.f29627;
            this.f45008 = i2;
            return i2;
        }
        Object[] objArr = c9800.f29626;
        do {
            i = this.f45004 - 1;
            this.f45004 = i;
            if (i < 0) {
                this.f45008 = Integer.MIN_VALUE;
                Object obj = this.f45005.get((-i) - 1);
                int iM32766 = C13630.m32766(obj.hashCode());
                int i3 = c9800.f29631;
                while (true) {
                    int i4 = iM32766 & i3;
                    if (obj.equals(objArr[i4])) {
                        return i4;
                    }
                    iM32766 = i4 + 1;
                    i3 = c9800.f29631;
                }
            }
        } while (objArr[i] == null);
        this.f45008 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f45006;
        C9800 c9800 = this.f45003;
        if (z) {
            this.f45006 = false;
            int i2 = c9800.f29627;
            this.f45008 = i2;
            mo6628(i2, obj);
            this.f45007--;
        }
        Object[] objArr = c9800.f29626;
        while (this.f45007 != 0) {
            int i3 = this.f45004 - 1;
            this.f45004 = i3;
            if (i3 < 0) {
                this.f45008 = Integer.MIN_VALUE;
                Object obj2 = this.f45005.get((-i3) - 1);
                int iM32766 = C13630.m32766(obj2.hashCode());
                int i4 = c9800.f29631;
                while (true) {
                    i = iM32766 & i4;
                    if (obj2.equals(objArr[i])) {
                        break;
                    }
                    iM32766 = i + 1;
                    i4 = c9800.f29631;
                }
                mo6628(i, obj);
                this.f45007--;
            } else if (objArr[i3] != null) {
                this.f45008 = i3;
                mo6628(i3, obj);
                this.f45007--;
            }
        }
    }

    public void remove() {
        Object obj;
        int i = this.f45008;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C9800 c9800 = this.f45003;
        int i2 = c9800.f29627;
        if (i == i2) {
            c9800.f29634 = false;
            c9800.f29626[i2] = null;
        } else {
            int i3 = this.f45004;
            if (i3 >= 0) {
                Object[] objArr = c9800.f29626;
                int[] iArr = c9800.f29636;
                loop0: while (true) {
                    int i4 = (i + 1) & c9800.f29631;
                    while (true) {
                        obj = objArr[i4];
                        if (obj != null) {
                            int iM32766 = C13630.m32766(obj.hashCode());
                            int i5 = c9800.f29631;
                            int i6 = iM32766 & i5;
                            if (i > i4) {
                                if (i >= i6 && i6 > i4) {
                                    break;
                                } else {
                                    i4 = (i4 + 1) & i5;
                                }
                            } else if (i >= i6 || i6 > i4) {
                                break;
                            } else {
                                i4 = (i4 + 1) & i5;
                            }
                        } else {
                            break loop0;
                        }
                    }
                    if (i4 < i) {
                        if (this.f45005 == null) {
                            this.f45005 = new C19119(2);
                        }
                        this.f45005.add(objArr[i4]);
                    }
                    objArr[i] = obj;
                    iArr[i] = iArr[i4];
                    i = i4;
                }
                objArr[i] = null;
            } else {
                c9800.mo21966(this.f45005.set((-i3) - 1, null));
                this.f45008 = -1;
                return;
            }
        }
        c9800.f29629--;
        this.f45008 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}
