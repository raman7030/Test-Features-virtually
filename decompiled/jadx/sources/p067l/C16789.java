package p067l;

/* JADX INFO: renamed from: l.ܶۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C16789 {

    /* JADX INFO: renamed from: a */
    public C2708[] f49472a;

    /* JADX INFO: renamed from: b */
    public C2708 f49473b = null;

    /* JADX INFO: renamed from: c */
    public C10085 f49474c;

    /* JADX INFO: renamed from: d */
    public C10085 f49475d;

    /* JADX INFO: renamed from: e */
    public int f49476e;

    /* JADX INFO: renamed from: f */
    public int f49477f;

    /* JADX INFO: renamed from: g */
    public int f49478g;

    /* JADX INFO: renamed from: h */
    public final int f49479h;

    public C16789(C2708[] c2708Arr, int i, int i2, int i3) {
        this.f49472a = c2708Arr;
        this.f49479h = i;
        this.f49476e = i2;
        this.f49477f = i2;
        this.f49478g = i3;
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
    /* JADX INFO: renamed from: a */
    public final C2708 m38035a() {
        C2708[] c2708Arr;
        int length;
        int i;
        C10085 c10085;
        int i2;
        int i3;
        int i4;
        int i5;
        C2708 c2708 = this.f49473b;
        if (c2708 != null) {
            c2708 = c2708.f4547d;
        }
        while (c2708 == null) {
            if (this.f49477f >= this.f49478g || (c2708Arr = this.f49472a) == null || (length = c2708Arr.length) <= (i = this.f49476e) || i < 0) {
                this.f49473b = null;
                return null;
            }
            C2708 c2708M29312k = ConcurrentMapC12768.m29312k(c2708Arr, i);
            if (c2708M29312k != null && c2708M29312k.f4544a < 0) {
                if (c2708M29312k instanceof C4721) {
                    this.f49472a = ((C4721) c2708M29312k).f10674e;
                    C10085 c10086 = this.f49475d;
                    if (c10086 == null) {
                        c10086 = new C10085();
                    } else {
                        this.f49475d = c10086.f27996d;
                    }
                    c10086.f27995c = c2708Arr;
                    c10086.f27993a = length;
                    c10086.f27994b = i;
                    c10086.f27996d = this.f49474c;
                    this.f49474c = c10086;
                    c2708 = null;
                } else {
                    c2708 = c2708M29312k instanceof C22826 ? ((C22826) c2708M29312k).f71905f : null;
                    if (this.f49474c != null) {
                        while (true) {
                            c10085 = this.f49474c;
                            if (c10085 != null) {
                                break;
                                break;
                            }
                            int i6 = this.f49476e;
                            i3 = c10085.f27993a;
                            i4 = i6 + i3;
                            this.f49476e = i4;
                            if (i4 >= length) {
                                break;
                                break;
                            }
                            this.f49476e = c10085.f27994b;
                            this.f49472a = c10085.f27995c;
                            c10085.f27995c = null;
                            C10085 c10087 = c10085.f27996d;
                            c10085.f27996d = this.f49475d;
                            this.f49474c = c10087;
                            this.f49475d = c10085;
                            length = i3;
                        }
                        if (c10085 == null) {
                            i2 = this.f49476e + this.f49479h;
                            this.f49476e = i2;
                            if (i2 >= length) {
                                int i7 = this.f49477f + 1;
                                this.f49477f = i7;
                                this.f49476e = i7;
                            }
                        }
                    } else {
                        i5 = i + this.f49479h;
                        this.f49476e = i5;
                        if (i5 >= length) {
                            int i8 = this.f49477f + 1;
                            this.f49477f = i8;
                            this.f49476e = i8;
                        }
                    }
                }
            } else {
                c2708 = c2708M29312k;
                if (this.f49474c != null) {
                    while (true) {
                        c10085 = this.f49474c;
                        if (c10085 != null) {
                            break;
                        }
                        int i9 = this.f49476e;
                        i3 = c10085.f27993a;
                        i4 = i9 + i3;
                        this.f49476e = i4;
                        if (i4 >= length) {
                            break;
                        }
                        this.f49476e = c10085.f27994b;
                        this.f49472a = c10085.f27995c;
                        c10085.f27995c = null;
                        C10085 c10088 = c10085.f27996d;
                        c10085.f27996d = this.f49475d;
                        this.f49474c = c10088;
                        this.f49475d = c10085;
                        length = i3;
                    }
                    if (c10085 == null) {
                        i2 = this.f49476e + this.f49479h;
                        this.f49476e = i2;
                        if (i2 >= length) {
                            int i10 = this.f49477f + 1;
                            this.f49477f = i10;
                            this.f49476e = i10;
                        }
                    }
                } else {
                    i5 = i + this.f49479h;
                    this.f49476e = i5;
                    if (i5 >= length) {
                        int i11 = this.f49477f + 1;
                        this.f49477f = i11;
                        this.f49476e = i11;
                    }
                }
            }
        }
        this.f49473b = c2708;
        return c2708;
    }
}
