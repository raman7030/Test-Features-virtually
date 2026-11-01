package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܳ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16375 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C11683 f48116;

    /* JADX INFO: renamed from: ۙ */
    public int f48117;

    /* JADX INFO: renamed from: ۬ */
    public C20539 f48118;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f48119;

    /* JADX INFO: renamed from: ᩸ */
    public int f48120;

    /* JADX INFO: renamed from: ᩹ */
    public int f48121 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8754(int i, Object obj);

    public AbstractC16375(C11683 c11683) {
        this.f48116 = c11683;
        this.f48117 = c11683.f32578;
        this.f48120 = c11683.f32580;
        this.f48119 = c11683.f32585;
    }

    public final boolean hasNext() {
        return this.f48120 != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m37188() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f48120--;
        boolean z = this.f48119;
        C11683 c11683 = this.f48116;
        if (z) {
            this.f48119 = false;
            int i2 = c11683.f32578;
            this.f48121 = i2;
            return i2;
        }
        Object[] objArr = c11683.f32577;
        do {
            i = this.f48117 - 1;
            this.f48117 = i;
            if (i < 0) {
                this.f48121 = Integer.MIN_VALUE;
                Object obj = this.f48118.get((-i) - 1);
                int iM34881 = C15322.m34881(obj.hashCode());
                int i3 = c11683.f32582;
                while (true) {
                    int i4 = iM34881 & i3;
                    if (obj.equals(objArr[i4])) {
                        return i4;
                    }
                    iM34881 = i4 + 1;
                    i3 = c11683.f32582;
                }
            }
        } while (objArr[i] == null);
        this.f48121 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f48119;
        C11683 c11683 = this.f48116;
        if (z) {
            this.f48119 = false;
            int i2 = c11683.f32578;
            this.f48121 = i2;
            mo8754(i2, obj);
            this.f48120--;
        }
        Object[] objArr = c11683.f32577;
        while (this.f48120 != 0) {
            int i3 = this.f48117 - 1;
            this.f48117 = i3;
            if (i3 < 0) {
                this.f48121 = Integer.MIN_VALUE;
                Object obj2 = this.f48118.get((-i3) - 1);
                int iM34881 = C15322.m34881(obj2.hashCode());
                int i4 = c11683.f32582;
                while (true) {
                    i = iM34881 & i4;
                    if (obj2.equals(objArr[i])) {
                        break;
                    }
                    iM34881 = i + 1;
                    i4 = c11683.f32582;
                }
                mo8754(i, obj);
                this.f48120--;
            } else if (objArr[i3] != null) {
                this.f48121 = i3;
                mo8754(i3, obj);
                this.f48120--;
            }
        }
    }

    public void remove() {
        Object obj;
        int i = this.f48121;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C11683 c11683 = this.f48116;
        int i2 = c11683.f32578;
        if (i == i2) {
            c11683.f32585 = false;
            c11683.f32577[i2] = null;
        } else {
            int i3 = this.f48117;
            if (i3 >= 0) {
                Object[] objArr = c11683.f32577;
                int[] iArr = c11683.f32587;
                loop0: while (true) {
                    int i4 = (i + 1) & c11683.f32582;
                    while (true) {
                        obj = objArr[i4];
                        if (obj != null) {
                            int iM34881 = C15322.m34881(obj.hashCode());
                            int i5 = c11683.f32582;
                            int i6 = iM34881 & i5;
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
                        if (this.f48118 == null) {
                            this.f48118 = new C20539(2);
                        }
                        this.f48118.add(objArr[i4]);
                    }
                    objArr[i] = obj;
                    iArr[i] = iArr[i4];
                    i = i4;
                }
                objArr[i] = null;
            } else {
                c11683.mo23937(this.f48118.set((-i3) - 1, null));
                this.f48121 = -1;
                return;
            }
        }
        c11683.f32580--;
        this.f48121 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}
