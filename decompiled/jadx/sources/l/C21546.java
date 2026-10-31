package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C1E */
/* JADX INFO: loaded from: classes5.dex */
public final class C21546 implements InterfaceC15900, InterfaceC12433 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20135 f69239;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69240;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21983 f69241;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f69242;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f69243;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f69244 = -1;

    @Override // java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C8846.m22855(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo7691());
    }

    public C21546(C20135 c20135) {
        this.f69239 = c20135;
        this.f69240 = c20135.f65199;
        this.f69243 = c20135.f65198;
        this.f69242 = c20135.f65202;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f69243 != 0;
    }

    @Override // l.InterfaceC15900
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo7691() {
        int i;
        char c;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f69243--;
        C20135 c20135 = this.f69239;
        char[] cArr = c20135.f65201;
        if (this.f69242) {
            this.f69242 = false;
            int i2 = c20135.f65199;
            this.f69244 = i2;
            return cArr[i2];
        }
        do {
            i = this.f69240 - 1;
            this.f69240 = i;
            if (i < 0) {
                this.f69244 = Integer.MIN_VALUE;
                return this.f69241.getChar((-i) - 1);
            }
            c = cArr[i];
        } while (c == 0);
        this.f69244 = i;
        return c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        char c;
        int i = this.f69244;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C20135 c20135 = this.f69239;
        int i2 = c20135.f65199;
        if (i == i2) {
            c20135.f65202 = false;
            c20135.f65201[i2] = 0;
        } else {
            int i3 = this.f69240;
            if (i3 >= 0) {
                char[] cArr = c20135.f65201;
                loop0: while (true) {
                    int i4 = (i + 1) & c20135.f65197;
                    while (true) {
                        c = cArr[i4];
                        if (c != 0) {
                            int iM32766 = C13630.m32766((int) c);
                            int i5 = c20135.f65197;
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
                        if (this.f69241 == null) {
                            this.f69241 = new C21983(2);
                        }
                        this.f69241.mo8955(cArr[i4]);
                    }
                    cArr[i] = c;
                    i = i4;
                }
                cArr[i] = 0;
            } else {
                c20135.mo2004(this.f69241.getChar((-i3) - 1));
                this.f69244 = -1;
                return;
            }
        }
        c20135.f65198--;
        this.f69244 = -1;
    }

    @Override // l.InterfaceC20881
    /* JADX INFO: renamed from: ۧ */
    public final void forEachRemaining(InterfaceC23662 interfaceC23662) {
        C20135 c20135 = this.f69239;
        char[] cArr = c20135.f65201;
        if (this.f69242) {
            this.f69242 = false;
            int i = c20135.f65199;
            this.f69244 = i;
            interfaceC23662.mo18328(cArr[i]);
            this.f69243--;
        }
        while (this.f69243 != 0) {
            int i2 = this.f69240 - 1;
            this.f69240 = i2;
            if (i2 < 0) {
                this.f69244 = Integer.MIN_VALUE;
                interfaceC23662.mo18328(this.f69241.getChar((-i2) - 1));
                this.f69243--;
            } else {
                char c = cArr[i2];
                if (c != 0) {
                    this.f69244 = i2;
                    interfaceC23662.mo18328(c);
                    this.f69243--;
                }
            }
        }
    }
}
