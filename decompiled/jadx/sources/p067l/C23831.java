package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩹᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23831 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public int f75721;

    /* JADX INFO: renamed from: ۙ */
    public C23161 f75722;

    /* JADX INFO: renamed from: ۛ */
    public C13773 f75723;

    /* JADX INFO: renamed from: ۤ */
    public int f75724;

    /* JADX INFO: renamed from: ۫ */
    public final C25172[] f75725;

    /* JADX INFO: renamed from: ۬ */
    public int f75726 = -1;

    /* JADX INFO: renamed from: ᩶ */
    public final int[] f75727;

    /* JADX INFO: renamed from: ᩸ */
    public C17124 f75728;

    /* JADX INFO: renamed from: ᩹ */
    public final int f75729;

    public C23831(C13773 c13773, int i, int i2) {
        AbstractC21820[] abstractC21820Arr;
        int i3;
        C13773.m31392(i, i2, c13773.m31402());
        this.f75723 = c13773;
        this.f75724 = i;
        this.f75729 = i2;
        AbstractC21820 abstractC21820 = c13773.f38939;
        int i4 = abstractC21820 == null ? 0 : abstractC21820.f68651;
        this.f75725 = new C25172[i4];
        this.f75727 = new int[i4];
        C22902 c22902 = c13773.f38940;
        if (c22902 != null) {
            c22902.m51158();
        }
        if (i == i2 || abstractC21820 == null || abstractC21820.f68653 == 0) {
            return;
        }
        int i5 = 0;
        while (abstractC21820 instanceof C25172) {
            C25172 c25172 = (C25172) abstractC21820;
            int i6 = 0;
            while (true) {
                abstractC21820Arr = c25172.f80530;
                if (i6 >= abstractC21820Arr.length - 1 || i < (i3 = this.f75721 + abstractC21820Arr[i6].f68652)) {
                    break;
                }
                i6++;
                this.f75721 = i3;
            }
            this.f75725[i5] = c25172;
            this.f75727[i5] = i6;
            abstractC21820 = abstractC21820Arr[i6];
            i5++;
        }
        this.f75722 = (C23161) abstractC21820;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[LOOP:2: B:27:0x0069->B:34:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094 A[LOOP:4: B:39:0x008c->B:41:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa A[LOOP:0: B:4:0x0004->B:46:0x00aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b2 A[EDGE_INSN: B:57:0x00b2->B:47:0x00b2 BREAK  A[LOOP:0: B:4:0x0004->B:46:0x00aa, LOOP_LABEL: LOOP:0: B:4:0x0004->B:46:0x00aa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2 A[EDGE_INSN: B:58:0x00b2->B:47:0x00b2 BREAK  A[LOOP:0: B:4:0x0004->B:46:0x00aa, LOOP_LABEL: LOOP:0: B:4:0x0004->B:46:0x00aa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2 A[EDGE_INSN: B:59:0x00b2->B:47:0x00b2 BREAK  A[LOOP:0: B:4:0x0004->B:46:0x00aa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[LOOP:1: B:24:0x005f->B:61:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5 A[EDGE_INSN: B:62:0x00a5->B:43:0x00a5 BREAK  A[LOOP:3: B:36:0x0083->B:42:0x009e], SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final int m52903() {
        C17124 c17124;
        C25172[] c25172Arr;
        int length;
        C25172 c25172;
        int[] iArr;
        int i;
        AbstractC21820[] abstractC21820Arr;
        int i2;
        AbstractC21820 abstractC21820;
        int i3;
        C25172 c25173;
        int i4;
        AbstractC21820[] abstractC21820Arr2;
        AbstractC21820 abstractC21821;
        if (this.f75723 == null) {
            throw new IllegalStateException("Line cursor is closed");
        }
        loop0: while (true) {
            C23161 c23161 = this.f75722;
            if (c23161 == null) {
                break;
            }
            int i5 = this.f75724;
            int i6 = this.f75729;
            if (i5 >= i6) {
                break;
            }
            if (c23161.f68653 != 0) {
                if (this.f75728 == null) {
                    C17124 c17124M51621 = c23161.m51621();
                    this.f75728 = c17124M51621;
                    this.f75726 = c17124M51621.f50590.m29378(this.f75724 - this.f75721);
                }
                int i7 = this.f75726;
                if (i7 < this.f75722.f68653) {
                    int i8 = this.f75721;
                    C12825 c12825 = this.f75728.f50590;
                    this.f75726 = i7 + 1;
                    int iM29380 = c12825.m29380(i7) + i8;
                    if (iM29380 >= i6) {
                        break;
                    }
                    this.f75724 = iM29380 + 1;
                    return iM29380;
                }
                c17124 = this.f75728;
                if (c17124 != null) {
                    c17124.close();
                    this.f75728 = null;
                }
                this.f75721 += this.f75722.f68652;
                c25172Arr = this.f75725;
                length = c25172Arr.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        break loop0;
                        break loop0;
                    }
                    c25172 = c25172Arr[length];
                    iArr = this.f75727;
                    i = iArr[length];
                    while (true) {
                        i++;
                        abstractC21820Arr = c25172.f80530;
                        if (i < abstractC21820Arr.length) {
                            i2 = this.f75721;
                            if (i2 >= i6) {
                                break loop0;
                                break loop0;
                            }
                            abstractC21820 = abstractC21820Arr[i];
                            if (abstractC21820.f68653 == 0) {
                                this.f75721 = i2 + abstractC21820.f68652;
                            }
                        }
                    }
                }
                iArr[length] = i;
                while (true) {
                    length++;
                    if (abstractC21820 instanceof C25172) {
                        break;
                        break;
                    }
                    c25173 = (C25172) abstractC21820;
                    i4 = 0;
                    while (true) {
                        abstractC21820Arr2 = c25173.f80530;
                        abstractC21821 = abstractC21820Arr2[i4];
                        if (abstractC21821.f68653 == 0) {
                            i4++;
                            this.f75721 += abstractC21821.f68652;
                        }
                    }
                    c25172Arr[length] = c25173;
                    iArr[length] = i4;
                    abstractC21820 = abstractC21820Arr2[i4];
                }
                i3 = this.f75721;
                if (i3 >= i6) {
                    break;
                    break;
                }
                this.f75722 = (C23161) abstractC21820;
                this.f75724 = i3;
            } else {
                c17124 = this.f75728;
                if (c17124 != null) {
                    c17124.close();
                    this.f75728 = null;
                }
                this.f75721 += this.f75722.f68652;
                c25172Arr = this.f75725;
                length = c25172Arr.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        break loop0;
                    }
                    c25172 = c25172Arr[length];
                    iArr = this.f75727;
                    i = iArr[length];
                    while (true) {
                        i++;
                        abstractC21820Arr = c25172.f80530;
                        if (i < abstractC21820Arr.length) {
                            i2 = this.f75721;
                            if (i2 >= i6) {
                                break loop0;
                            }
                            abstractC21820 = abstractC21820Arr[i];
                            if (abstractC21820.f68653 == 0) {
                                this.f75721 = i2 + abstractC21820.f68652;
                            }
                        }
                    }
                }
                iArr[length] = i;
                while (true) {
                    length++;
                    if (abstractC21820 instanceof C25172) {
                        break;
                    }
                    c25173 = (C25172) abstractC21820;
                    i4 = 0;
                    while (true) {
                        abstractC21820Arr2 = c25173.f80530;
                        abstractC21821 = abstractC21820Arr2[i4];
                        if (abstractC21821.f68653 == 0) {
                            i4++;
                            this.f75721 += abstractC21821.f68652;
                        }
                    }
                    c25172Arr[length] = c25173;
                    iArr[length] = i4;
                    abstractC21820 = abstractC21820Arr2[i4];
                }
                i3 = this.f75721;
                if (i3 >= i6) {
                    break;
                }
                this.f75722 = (C23161) abstractC21820;
                this.f75724 = i3;
            }
        }
        C17124 c17125 = this.f75728;
        if (c17125 != null) {
            c17125.close();
            this.f75728 = null;
        }
        this.f75722 = null;
        return -1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C13773 c13773 = this.f75723;
        if (c13773 == null) {
            return;
        }
        C22902 c22902 = c13773.f38940;
        this.f75723 = null;
        this.f75722 = null;
        Arrays.fill(this.f75725, (Object) null);
        try {
            C17124 c17124 = this.f75728;
            if (c17124 != null) {
                c17124.close();
                this.f75728 = null;
            }
        } finally {
            if (c22902 != null) {
                c22902.m51159();
            }
        }
    }
}
