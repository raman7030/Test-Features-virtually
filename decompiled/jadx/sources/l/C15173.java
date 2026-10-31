package l;

/* JADX INFO: renamed from: l.ܶۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C15173 {
    public C0357[] a;
    public C0357 b = null;
    public C8119 c;
    public C8119 d;
    public int e;
    public int f;
    public int g;
    public final int h;

    public C15173(C0357[] c0357Arr, int i, int i2, int i3) {
        this.a = c0357Arr;
        this.h = i;
        this.e = i2;
        this.f = i2;
        this.g = i3;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c A[LOOP:1: B:34:0x005f->B:38:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0082 A[EDGE_INSN: B:70:0x0082->B:39:0x0082 BREAK  A[LOOP:1: B:34:0x005f->B:38:0x006c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0082 A[EDGE_INSN: B:71:0x0082->B:39:0x0082 BREAK  A[LOOP:1: B:34:0x005f->B:38:0x006c], SYNTHETIC] */
    public final C0357 a() {
        C0357[] c0357Arr;
        int length;
        int i;
        C8119 c8119;
        int i2;
        int i3;
        int i4;
        int i5;
        C0357 c0357 = this.b;
        if (c0357 != null) {
            c0357 = c0357.d;
        }
        while (c0357 == null) {
            if (this.f >= this.g || (c0357Arr = this.a) == null || (length = c0357Arr.length) <= (i = this.e) || i < 0) {
                this.b = null;
                return null;
            }
            C0357 c0357K = ConcurrentMapC10942.k(c0357Arr, i);
            if (c0357K != null && c0357K.a < 0) {
                if (c0357K instanceof C2475) {
                    this.a = ((C2475) c0357K).e;
                    C8119 c81110 = this.d;
                    if (c81110 == null) {
                        c81110 = new C8119();
                    } else {
                        this.d = c81110.d;
                    }
                    c81110.c = c0357Arr;
                    c81110.a = length;
                    c81110.b = i;
                    c81110.d = this.c;
                    this.c = c81110;
                    c0357 = null;
                } else {
                    c0357 = c0357K instanceof C21525 ? ((C21525) c0357K).f : null;
                    if (this.c != null) {
                        while (true) {
                            c8119 = this.c;
                            if (c8119 != null) {
                                break;
                                break;
                            }
                            int i6 = this.e;
                            i3 = c8119.a;
                            i4 = i6 + i3;
                            this.e = i4;
                            if (i4 >= length) {
                                break;
                                break;
                            }
                            this.e = c8119.b;
                            this.a = c8119.c;
                            c8119.c = null;
                            C8119 c81111 = c8119.d;
                            c8119.d = this.d;
                            this.c = c81111;
                            this.d = c8119;
                            length = i3;
                        }
                        if (c8119 == null) {
                            i2 = this.e + this.h;
                            this.e = i2;
                            if (i2 >= length) {
                                int i7 = this.f + 1;
                                this.f = i7;
                                this.e = i7;
                            }
                        }
                    } else {
                        i5 = i + this.h;
                        this.e = i5;
                        if (i5 >= length) {
                            int i8 = this.f + 1;
                            this.f = i8;
                            this.e = i8;
                        }
                    }
                }
            } else {
                c0357 = c0357K;
                if (this.c != null) {
                    while (true) {
                        c8119 = this.c;
                        if (c8119 != null) {
                            break;
                        }
                        int i9 = this.e;
                        i3 = c8119.a;
                        i4 = i9 + i3;
                        this.e = i4;
                        if (i4 >= length) {
                            break;
                        }
                        this.e = c8119.b;
                        this.a = c8119.c;
                        c8119.c = null;
                        C8119 c81112 = c8119.d;
                        c8119.d = this.d;
                        this.c = c81112;
                        this.d = c8119;
                        length = i3;
                    }
                    if (c8119 == null) {
                        i2 = this.e + this.h;
                        this.e = i2;
                        if (i2 >= length) {
                            int i10 = this.f + 1;
                            this.f = i10;
                            this.e = i10;
                        }
                    }
                } else {
                    i5 = i + this.h;
                    this.e = i5;
                    if (i5 >= length) {
                        int i11 = this.f + 1;
                        this.f = i11;
                        this.e = i11;
                    }
                }
            }
        }
        this.b = c0357;
        return c0357;
    }
}
