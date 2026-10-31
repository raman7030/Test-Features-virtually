package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩹᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22582 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f72994;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21877 f72995;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C11999 f72996;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f72997;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C23993[] f72998;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f72999 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int[] f73000;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15525 f73001;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f73002;

    public C22582(C11999 c11999, int i, int i2) {
        AbstractC20466[] abstractC20466Arr;
        int i3;
        C11999.m29337(i, i2, c11999.m29347());
        this.f72996 = c11999;
        this.f72997 = i;
        this.f73002 = i2;
        AbstractC20466 abstractC20466 = c11999.f35929;
        int i4 = abstractC20466 == null ? 0 : abstractC20466.f65975;
        this.f72998 = new C23993[i4];
        this.f73000 = new int[i4];
        C21605 c21605 = c11999.f35930;
        if (c21605 != null) {
            c21605.m48811();
        }
        if (i == i2 || abstractC20466 == null || abstractC20466.f65977 == 0) {
            return;
        }
        int i5 = 0;
        while (abstractC20466 instanceof C23993) {
            C23993 c23993 = (C23993) abstractC20466;
            int i6 = 0;
            while (true) {
                abstractC20466Arr = c23993.f77779;
                if (i6 >= abstractC20466Arr.length - 1 || i < (i3 = this.f72994 + abstractC20466Arr[i6].f65976)) {
                    break;
                }
                i6++;
                this.f72994 = i3;
            }
            this.f72998[i5] = c23993;
            this.f73000[i5] = i6;
            abstractC20466 = abstractC20466Arr[i6];
            i5++;
        }
        this.f72995 = (C21877) abstractC20466;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50561() {
        C15525 c15525;
        C23993[] c23993Arr;
        int length;
        C23993 c23993;
        int[] iArr;
        int i;
        AbstractC20466[] abstractC20466Arr;
        int i2;
        AbstractC20466 abstractC20466;
        int i3;
        C23993 c23994;
        int i4;
        AbstractC20466[] abstractC20466Arr2;
        AbstractC20466 abstractC20467;
        if (this.f72996 == null) {
            throw new IllegalStateException("Line cursor is closed");
        }
        loop0: while (true) {
            C21877 c21877 = this.f72995;
            if (c21877 == null) {
                break;
            }
            int i5 = this.f72997;
            int i6 = this.f73002;
            if (i5 >= i6) {
                break;
            }
            if (c21877.f65977 != 0) {
                if (this.f73001 == null) {
                    C15525 c15525M49269 = c21877.m49269();
                    this.f73001 = c15525M49269;
                    this.f72999 = c15525M49269.f47458.m27316(this.f72997 - this.f72994);
                }
                int i7 = this.f72999;
                if (i7 < this.f72995.f65977) {
                    int i8 = this.f72994;
                    C11002 c11002 = this.f73001.f47458;
                    this.f72999 = i7 + 1;
                    int iM27318 = c11002.m27318(i7) + i8;
                    if (iM27318 >= i6) {
                        break;
                    }
                    this.f72997 = iM27318 + 1;
                    return iM27318;
                }
                c15525 = this.f73001;
                if (c15525 != null) {
                    c15525.close();
                    this.f73001 = null;
                }
                this.f72994 += this.f72995.f65976;
                c23993Arr = this.f72998;
                length = c23993Arr.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        break loop0;
                        break loop0;
                    }
                    c23993 = c23993Arr[length];
                    iArr = this.f73000;
                    i = iArr[length];
                    while (true) {
                        i++;
                        abstractC20466Arr = c23993.f77779;
                        if (i < abstractC20466Arr.length) {
                            i2 = this.f72994;
                            if (i2 >= i6) {
                                break loop0;
                                break loop0;
                            }
                            abstractC20466 = abstractC20466Arr[i];
                            if (abstractC20466.f65977 == 0) {
                                this.f72994 = i2 + abstractC20466.f65976;
                            }
                        }
                    }
                }
                iArr[length] = i;
                while (true) {
                    length++;
                    if (abstractC20466 instanceof C23993) {
                        break;
                        break;
                    }
                    c23994 = (C23993) abstractC20466;
                    i4 = 0;
                    while (true) {
                        abstractC20466Arr2 = c23994.f77779;
                        abstractC20467 = abstractC20466Arr2[i4];
                        if (abstractC20467.f65977 == 0) {
                            i4++;
                            this.f72994 += abstractC20467.f65976;
                        }
                    }
                    c23993Arr[length] = c23994;
                    iArr[length] = i4;
                    abstractC20466 = abstractC20466Arr2[i4];
                }
                i3 = this.f72994;
                if (i3 >= i6) {
                    break;
                    break;
                }
                this.f72995 = (C21877) abstractC20466;
                this.f72997 = i3;
            } else {
                c15525 = this.f73001;
                if (c15525 != null) {
                    c15525.close();
                    this.f73001 = null;
                }
                this.f72994 += this.f72995.f65976;
                c23993Arr = this.f72998;
                length = c23993Arr.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        break loop0;
                    }
                    c23993 = c23993Arr[length];
                    iArr = this.f73000;
                    i = iArr[length];
                    while (true) {
                        i++;
                        abstractC20466Arr = c23993.f77779;
                        if (i < abstractC20466Arr.length) {
                            i2 = this.f72994;
                            if (i2 >= i6) {
                                break loop0;
                            }
                            abstractC20466 = abstractC20466Arr[i];
                            if (abstractC20466.f65977 == 0) {
                                this.f72994 = i2 + abstractC20466.f65976;
                            }
                        }
                    }
                }
                iArr[length] = i;
                while (true) {
                    length++;
                    if (abstractC20466 instanceof C23993) {
                        break;
                    }
                    c23994 = (C23993) abstractC20466;
                    i4 = 0;
                    while (true) {
                        abstractC20466Arr2 = c23994.f77779;
                        abstractC20467 = abstractC20466Arr2[i4];
                        if (abstractC20467.f65977 == 0) {
                            i4++;
                            this.f72994 += abstractC20467.f65976;
                        }
                    }
                    c23993Arr[length] = c23994;
                    iArr[length] = i4;
                    abstractC20466 = abstractC20466Arr2[i4];
                }
                i3 = this.f72994;
                if (i3 >= i6) {
                    break;
                }
                this.f72995 = (C21877) abstractC20466;
                this.f72997 = i3;
            }
        }
        C15525 c15526 = this.f73001;
        if (c15526 != null) {
            c15526.close();
            this.f73001 = null;
        }
        this.f72995 = null;
        return -1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C11999 c11999 = this.f72996;
        if (c11999 == null) {
            return;
        }
        C21605 c21605 = c11999.f35930;
        this.f72996 = null;
        this.f72995 = null;
        Arrays.fill(this.f72998, (Object) null);
        try {
            C15525 c15525 = this.f73001;
            if (c15525 != null) {
                c15525.close();
                this.f73001 = null;
            }
        } finally {
            if (c21605 != null) {
                c21605.m48812();
            }
        }
    }
}
