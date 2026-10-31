package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15631 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19161 f48123;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f48124;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21983 f48125;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f48126;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f48127;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f48128 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo11128(int i, Object obj);

    public AbstractC15631(C19161 c19161) {
        this.f48123 = c19161;
        this.f48124 = c19161.f60377;
        this.f48127 = c19161.f60379;
        this.f48126 = c19161.f60384;
    }

    public final boolean hasNext() {
        return this.f48127 != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m36829() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f48127--;
        boolean z = this.f48126;
        C19161 c19161 = this.f48123;
        if (z) {
            this.f48126 = false;
            int i2 = c19161.f60377;
            this.f48128 = i2;
            return i2;
        }
        char[] cArr = c19161.f60376;
        do {
            i = this.f48124 - 1;
            this.f48124 = i;
            if (i < 0) {
                this.f48128 = Integer.MIN_VALUE;
                char c = this.f48125.getChar((-i) - 1);
                int iM32766 = C13630.m32766((int) c);
                int i3 = c19161.f60381;
                while (true) {
                    int i4 = iM32766 & i3;
                    if (c == cArr[i4]) {
                        return i4;
                    }
                    iM32766 = i4 + 1;
                    i3 = c19161.f60381;
                }
            }
        } while (cArr[i] == 0);
        this.f48128 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f48126;
        C19161 c19161 = this.f48123;
        if (z) {
            this.f48126 = false;
            int i2 = c19161.f60377;
            this.f48128 = i2;
            mo11128(i2, obj);
            this.f48127--;
        }
        char[] cArr = c19161.f60376;
        while (this.f48127 != 0) {
            int i3 = this.f48124 - 1;
            this.f48124 = i3;
            if (i3 < 0) {
                this.f48128 = Integer.MIN_VALUE;
                char c = this.f48125.getChar((-i3) - 1);
                int iM32766 = C13630.m32766((int) c);
                int i4 = c19161.f60381;
                while (true) {
                    i = iM32766 & i4;
                    if (c == cArr[i]) {
                        break;
                    }
                    iM32766 = i + 1;
                    i4 = c19161.f60381;
                }
                mo11128(i, obj);
                this.f48127--;
            } else if (cArr[i3] != 0) {
                this.f48128 = i3;
                mo11128(i3, obj);
                this.f48127--;
            }
        }
    }

    public void remove() {
        char c;
        int i = this.f48128;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C19161 c19161 = this.f48123;
        int i2 = c19161.f60377;
        if (i == i2) {
            c19161.f60384 = false;
            c19161.f60386[i2] = null;
        } else {
            int i3 = this.f48124;
            if (i3 >= 0) {
                char[] cArr = c19161.f60376;
                Object[] objArr = c19161.f60386;
                loop0: while (true) {
                    int i4 = (i + 1) & c19161.f60381;
                    while (true) {
                        c = cArr[i4];
                        if (c != 0) {
                            int iM32766 = C13630.m32766((int) c);
                            int i5 = c19161.f60381;
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
                        if (this.f48125 == null) {
                            this.f48125 = new C21983(2);
                        }
                        this.f48125.mo8955(cArr[i4]);
                    }
                    cArr[i] = c;
                    objArr[i] = objArr[i4];
                    i = i4;
                }
                cArr[i] = 0;
                objArr[i] = null;
            } else {
                c19161.mo13251(this.f48125.getChar((-i3) - 1));
                this.f48128 = -1;
                return;
            }
        }
        c19161.f60379--;
        this.f48128 = -1;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public /* bridge */ /* synthetic */ void m36830(InterfaceC23662 interfaceC23662) {
        forEachRemaining((Object) interfaceC23662);
    }
}
