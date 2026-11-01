package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C59 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17323 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C5925 f51677;

    /* JADX INFO: renamed from: ۙ */
    public int f51678;

    /* JADX INFO: renamed from: ۬ */
    public C20539 f51679;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f51680;

    /* JADX INFO: renamed from: ᩸ */
    public int f51681;

    /* JADX INFO: renamed from: ᩹ */
    public int f51682 = -1;

    public C17323(C5925 c5925) {
        this.f51677 = c5925;
        this.f51678 = c5925.f14624;
        this.f51681 = c5925.f14623;
        this.f51680 = c5925.f14627;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51681 != 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        Object obj;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f51681--;
        C5925 c5925 = this.f51677;
        Object[] objArr = c5925.f14626;
        if (this.f51680) {
            this.f51680 = false;
            int i2 = c5925.f14624;
            this.f51682 = i2;
            return objArr[i2];
        }
        do {
            i = this.f51678 - 1;
            this.f51678 = i;
            if (i < 0) {
                this.f51682 = Integer.MIN_VALUE;
                return this.f51679.get((-i) - 1);
            }
            obj = objArr[i];
        } while (obj == null);
        this.f51682 = i;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Object obj;
        int i = this.f51682;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C5925 c5925 = this.f51677;
        int i2 = c5925.f14624;
        if (i == i2) {
            c5925.f14627 = false;
            c5925.f14626[i2] = null;
        } else {
            int i3 = this.f51678;
            if (i3 >= 0) {
                Object[] objArr = c5925.f14626;
                loop0: while (true) {
                    int i4 = (i + 1) & c5925.f14622;
                    while (true) {
                        obj = objArr[i4];
                        if (obj != null) {
                            int iM34881 = C15322.m34881(obj.hashCode());
                            int i5 = c5925.f14622;
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
                        if (this.f51679 == null) {
                            this.f51679 = new C20539(2);
                        }
                        this.f51679.add(objArr[i4]);
                    }
                    objArr[i] = obj;
                    i = i4;
                }
                objArr[i] = null;
            } else {
                c5925.remove(this.f51679.set((-i3) - 1, null));
                this.f51682 = -1;
                return;
            }
        }
        c5925.f14623--;
        this.f51682 = -1;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        C5925 c5925 = this.f51677;
        Object[] objArr = c5925.f14626;
        if (this.f51680) {
            this.f51680 = false;
            int i = c5925.f14624;
            this.f51682 = i;
            consumer.m45213n(objArr[i]);
            this.f51681--;
        }
        while (this.f51681 != 0) {
            int i2 = this.f51678 - 1;
            this.f51678 = i2;
            if (i2 < 0) {
                this.f51682 = Integer.MIN_VALUE;
                consumer.m45213n(this.f51679.get((-i2) - 1));
                this.f51681--;
            } else {
                Object obj = objArr[i2];
                if (obj != null) {
                    this.f51682 = i2;
                    consumer.m45213n(obj);
                    this.f51681--;
                }
            }
        }
    }
}
