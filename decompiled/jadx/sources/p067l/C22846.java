package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C1E */
/* JADX INFO: loaded from: classes5.dex */
public final class C22846 implements InterfaceC17480, InterfaceC14185 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C21505 f71939;

    /* JADX INFO: renamed from: ۙ */
    public int f71940;

    /* JADX INFO: renamed from: ۬ */
    public C23261 f71941;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f71942;

    /* JADX INFO: renamed from: ᩸ */
    public int f71943;

    /* JADX INFO: renamed from: ᩹ */
    public int f71944 = -1;

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C10776.m24825(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo9752());
    }

    public C22846(C21505 c21505) {
        this.f71939 = c21505;
        this.f71940 = c21505.f67838;
        this.f71943 = c21505.f67837;
        this.f71942 = c21505.f67841;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71943 != 0;
    }

    @Override // p067l.InterfaceC17480
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo9752() {
        int i;
        char c;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f71943--;
        C21505 c21505 = this.f71939;
        char[] cArr = c21505.f67840;
        if (this.f71942) {
            this.f71942 = false;
            int i2 = c21505.f67838;
            this.f71944 = i2;
            return cArr[i2];
        }
        do {
            i = this.f71940 - 1;
            this.f71940 = i;
            if (i < 0) {
                this.f71944 = Integer.MIN_VALUE;
                return this.f71941.getChar((-i) - 1);
            }
            c = cArr[i];
        } while (c == 0);
        this.f71944 = i;
        return c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        char c;
        int i = this.f71944;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C21505 c21505 = this.f71939;
        int i2 = c21505.f67838;
        if (i == i2) {
            c21505.f67841 = false;
            c21505.f67840[i2] = 0;
        } else {
            int i3 = this.f71940;
            if (i3 >= 0) {
                char[] cArr = c21505.f67840;
                loop0: while (true) {
                    int i4 = (i + 1) & c21505.f67836;
                    while (true) {
                        c = cArr[i4];
                        if (c != 0) {
                            int iM34881 = C15322.m34881((int) c);
                            int i5 = c21505.f67836;
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
                        if (this.f71941 == null) {
                            this.f71941 = new C23261(2);
                        }
                        this.f71941.mo11023(cArr[i4]);
                    }
                    cArr[i] = c;
                    i = i4;
                }
                cArr[i] = 0;
            } else {
                c21505.mo4381(this.f71941.getChar((-i3) - 1));
                this.f71944 = -1;
                return;
            }
        }
        c21505.f67837--;
        this.f71944 = -1;
    }

    @Override // p067l.InterfaceC22214
    /* JADX INFO: renamed from: ۧ */
    public final void forEachRemaining(InterfaceC24857 interfaceC24857) {
        C21505 c21505 = this.f71939;
        char[] cArr = c21505.f67840;
        if (this.f71942) {
            this.f71942 = false;
            int i = c21505.f67838;
            this.f71944 = i;
            interfaceC24857.mo20276(cArr[i]);
            this.f71943--;
        }
        while (this.f71943 != 0) {
            int i2 = this.f71940 - 1;
            this.f71940 = i2;
            if (i2 < 0) {
                this.f71944 = Integer.MIN_VALUE;
                interfaceC24857.mo20276(this.f71941.getChar((-i2) - 1));
                this.f71943--;
            } else {
                char c = cArr[i2];
                if (c != 0) {
                    this.f71944 = i2;
                    interfaceC24857.mo20276(c);
                    this.f71943--;
                }
            }
        }
    }
}
