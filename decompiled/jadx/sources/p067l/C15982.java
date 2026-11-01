package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VFO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15982 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C8607 f46298;

    /* JADX INFO: renamed from: ۙ */
    public int f46299;

    /* JADX INFO: renamed from: ۬ */
    public C20539 f46300;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f46301;

    /* JADX INFO: renamed from: ᩸ */
    public int f46302;

    /* JADX INFO: renamed from: ᩹ */
    public int f46303 = -1;

    public C15982(C8607 c8607) {
        this.f46298 = c8607;
        this.f46299 = c8607.f23131;
        this.f46302 = c8607.f23130;
        this.f46301 = c8607.f23134;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46302 != 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        Object obj;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f46302--;
        C8607 c8607 = this.f46298;
        Object[] objArr = c8607.f23133;
        if (this.f46301) {
            this.f46301 = false;
            int i2 = c8607.f23131;
            this.f46303 = i2;
            return objArr[i2];
        }
        do {
            i = this.f46299 - 1;
            this.f46299 = i;
            if (i < 0) {
                this.f46303 = Integer.MIN_VALUE;
                return this.f46300.get((-i) - 1);
            }
            obj = objArr[i];
        } while (obj == null);
        this.f46303 = i;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Object obj;
        int i = this.f46303;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C8607 c8607 = this.f46298;
        int i2 = c8607.f23131;
        if (i == i2) {
            c8607.f23134 = false;
            c8607.f23133[i2] = null;
        } else {
            int i3 = this.f46299;
            if (i3 >= 0) {
                Object[] objArr = c8607.f23133;
                loop0: while (true) {
                    int i4 = (i + 1) & c8607.f23128;
                    while (true) {
                        obj = objArr[i4];
                        if (obj != null) {
                            int iM34881 = C15322.m34881(c8607.f23129.mo10800(obj));
                            int i5 = c8607.f23128;
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
                        if (this.f46300 == null) {
                            this.f46300 = new C20539(2);
                        }
                        this.f46300.add(objArr[i4]);
                    }
                    objArr[i] = obj;
                    i = i4;
                }
                objArr[i] = null;
            } else {
                c8607.remove(this.f46300.set((-i3) - 1, null));
                this.f46303 = -1;
                return;
            }
        }
        c8607.f23130--;
        this.f46303 = -1;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        C8607 c8607 = this.f46298;
        Object[] objArr = c8607.f23133;
        if (this.f46301) {
            this.f46301 = false;
            int i = c8607.f23131;
            this.f46303 = i;
            consumer.accept(objArr[i]);
            this.f46302--;
        }
        while (this.f46302 != 0) {
            int i2 = this.f46299 - 1;
            this.f46299 = i2;
            if (i2 < 0) {
                this.f46303 = Integer.MIN_VALUE;
                consumer.accept(this.f46300.get((-i2) - 1));
                this.f46302--;
            } else {
                Object obj = objArr[i2];
                if (obj != null) {
                    this.f46303 = i2;
                    consumer.accept(obj);
                    this.f46302--;
                }
            }
        }
    }
}
