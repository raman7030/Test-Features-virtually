package p067l;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C21478 {

    /* JADX INFO: renamed from: ֫ */
    public final C6607 f67744;

    /* JADX INFO: renamed from: ۖ */
    public final String f67745;

    /* JADX INFO: renamed from: ۘ */
    public final int[] f67746;

    /* JADX INFO: renamed from: ۜ */
    public final C22819[] f67747;

    /* JADX INFO: renamed from: ۡ */
    public final CharSequence f67748;

    /* JADX INFO: renamed from: ۢ */
    public final int[] f67749;

    /* JADX INFO: renamed from: ۧ */
    public int f67750;

    /* JADX INFO: renamed from: ܳ */
    public final C22819[] f67751;

    /* JADX INFO: renamed from: ܺ */
    public final int f67752;

    /* JADX INFO: renamed from: ܽ */
    public int f67753;

    /* JADX INFO: renamed from: ܿ */
    public final String f67754;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean[] f67755;

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayList f67756;

    /* JADX INFO: renamed from: ᩻ */
    public final C20438 f67757;

    /* JADX INFO: renamed from: ۧ */
    public static boolean m48680(int i) {
        return i == 31 || i == 48 || i == 46;
    }

    public C21478(CharSequence charSequence, ArrayList arrayList, String str, String str2, int i, C6607 c6607, C20438 c20438) {
        this.f67748 = charSequence;
        this.f67756 = arrayList;
        this.f67745 = str;
        this.f67754 = str2;
        this.f67752 = i;
        this.f67744 = c6607;
        this.f67757 = c20438;
        this.f67751 = new C22819[arrayList.size()];
        this.f67747 = new C22819[arrayList.size()];
        this.f67746 = new int[arrayList.size() + 1];
        this.f67749 = new int[arrayList.size()];
        this.f67755 = new boolean[arrayList.size()];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            c6607.m15087();
            C23489 c23489 = (C23489) arrayList.get(i2);
            int length = c23489.f74837.length();
            int iCharCount = c23489.f74832;
            int i3 = 0;
            while (iCharCount < c23489.f74833) {
                int i4 = i3 + 1;
                if ((i3 & 1023) == 0) {
                    c6607.m15087();
                }
                int iCodePointAt = Character.codePointAt(this.f67748, iCharCount);
                if (iCodePointAt == 13 || iCodePointAt == 10) {
                    this.f67755[i2] = true;
                } else if (iCodePointAt != 65279) {
                    length += iCodePointAt == 9 ? this.f67752 : 1;
                }
                iCharCount += Character.charCount(iCodePointAt);
                i3 = i4;
            }
            int[] iArr = this.f67746;
            int i5 = i2 + 1;
            iArr[i5] = iArr[i2] + length;
            i2 = i5;
        }
        ArrayList arrayList2 = this.f67756;
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            this.f67744.m15087();
            C23489 c234810 = (C23489) arrayList2.get(i6);
            this.f67747[i6] = (C22819) arrayDeque.peek();
            if (!arrayDeque.isEmpty()) {
                C22819 c22819 = (C22819) arrayDeque.peek();
                boolean z = c22819.f71884;
                C23489 c234811 = (C23489) this.f67756.get(i6);
                c22819.f71884 = z | (c234811.f74834 || c234811.f74836 >= 0 || this.f67755[i6]);
                ((C22819) arrayDeque.peek()).f71885 |= c234810.f74830;
            }
            int i7 = c234810.f74831;
            if (i7 == 30 || i7 == 47 || i7 == 45) {
                C22819 c228110 = new C22819(i6, c234810.f74839);
                c228110.f71885 = c234810.f74830;
                this.f67751[i6] = c228110;
                arrayDeque.push(c228110);
            } else if (m48680(c234810.f74831)) {
                C22819 c228111 = (C22819) arrayDeque.pop();
                c228111.f71879 = i6;
                if (!arrayDeque.isEmpty()) {
                    ((C22819) arrayDeque.peek()).f71884 |= c228111.f71884;
                    C22819 c228112 = (C22819) arrayDeque.peek();
                    c228112.f71885 = c228111.f71885 | c228112.f71885;
                }
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c6607.m15087();
            this.f67749[size] = size;
            int i8 = size + 1;
            if (i8 < arrayList.size() && !this.f67755[size]) {
                C23489 c234812 = (C23489) this.f67756.get(i8);
                if (!c234812.f74834 && c234812.f74836 < 0 && !m48679(i8)) {
                    int[] iArr2 = this.f67749;
                    iArr2[size] = iArr2[i8];
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:78:0x0185  */
    /* JADX WARN: Code duplicated, block: B:82:0x018e  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8  */
    /* JADX INFO: renamed from: ֫ */
    public final void m48681() {
        boolean z;
        int i;
        C22819 c22819;
        ArrayDeque arrayDeque;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        ArrayDeque arrayDeque2 = new ArrayDeque();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f67756;
            int size = arrayList.size();
            CharSequence charSequence = this.f67748;
            if (i4 < size) {
                C6607 c6607 = this.f67744;
                c6607.m15087();
                C23489 c23489 = (C23489) arrayList.get(i4);
                C22819 c228110 = this.f67747[i4];
                int iMax = Math.max(c228110 == null ? 0 : c228110.f71883, arrayDeque2.isEmpty() ? 0 : ((C16782) arrayDeque2.peek()).f49450);
                int i6 = c23489.f74839 + iMax;
                int i7 = (c23489.f74830 || !c23489.f74829 || m48680(c23489.f74831) || (c228110 != null && c23489.f74839 <= c228110.f71882 + 1)) ? 0 : 1;
                boolean z4 = c228110 != null && c228110.f71880 && (i4 == c228110.f71881 + 1 || m48680(c23489.f74831) || (c23489.f74839 == c228110.f71882 + 1 && ((i3 = ((C23489) arrayList.get(i4 + (-1))).f74831) == 15 || i3 == 1)));
                boolean z5 = c23489.f74830;
                int[] iArr = this.f67746;
                int[] iArr2 = this.f67749;
                if (z5) {
                    z = false;
                } else {
                    if (!z4) {
                        if (m48679(i4)) {
                            if (((iArr[iArr2[i4] + 1] - iArr[i4]) - ((C23489) arrayList.get(i4)).f74837.length()) + c23489.f74837.length() + this.f67750 > 100) {
                            }
                        }
                        z = false;
                    }
                    z = true;
                }
                int i8 = c23489.f74836;
                ArrayDeque arrayDeque3 = arrayDeque2;
                String str = this.f67745;
                if (i8 >= 0) {
                    m48678(charSequence, i5, c23489.f74836);
                    i = i6 + i7;
                    for (int i9 = 0; i9 < i; i9++) {
                        c6607.m15087();
                        m48678(str, 0, str.length());
                    }
                } else {
                    if (c23489.f74834 || z) {
                        String str2 = this.f67754;
                        m48678(str2, 0, str2.length());
                        i = i6 + i7;
                        for (int i10 = 0; i10 < i; i10++) {
                            c6607.m15087();
                            m48678(str, 0, str.length());
                        }
                    } else {
                        m48678(c23489.f74837, 0, c23489.f74837.length());
                    }
                    c22819 = this.f67751[i4];
                    if (c22819 != null) {
                        boolean z6 = c22819.f71885;
                        if (c228110 == null && c228110.f71885) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c22819.f71885 = z6 | z2;
                        c22819.f71883 = Math.max(iMax, this.f67753 - c23489.f74839);
                        if (!c22819.f71885 || (i2 = c22819.f71879) <= i4 + 1) {
                            z3 = false;
                        } else {
                            if (!c22819.f71884) {
                                if (((iArr[iArr2[i2] + 1] - iArr[i4]) - ((C23489) arrayList.get(i4)).f74837.length()) + this.f67750 <= 100) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        }
                        c22819.f71880 = z3;
                    }
                    if (c23489.f74835 != 0) {
                        arrayDeque = arrayDeque3;
                        arrayDeque.push(new C16782(c23489.f74835, Math.max(iMax, this.f67753 - c23489.f74839)));
                    } else {
                        arrayDeque = arrayDeque3;
                    }
                    m48678(charSequence, c23489.f74832, c23489.f74833);
                    if (arrayDeque.isEmpty() && ((C16782) arrayDeque.peek()).f49449 == c23489.f74833) {
                        arrayDeque.pop();
                    }
                    i5 = c23489.f74833;
                    i4++;
                    arrayDeque2 = arrayDeque;
                }
                this.f67753 = i;
                c22819 = this.f67751[i4];
                if (c22819 != null) {
                    boolean z7 = c22819.f71885;
                    if (c228110 == null) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    c22819.f71885 = z7 | z2;
                    c22819.f71883 = Math.max(iMax, this.f67753 - c23489.f74839);
                    if (c22819.f71885) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    c22819.f71880 = z3;
                }
                if (c23489.f74835 != 0) {
                    arrayDeque = arrayDeque3;
                    arrayDeque.push(new C16782(c23489.f74835, Math.max(iMax, this.f67753 - c23489.f74839)));
                } else {
                    arrayDeque = arrayDeque3;
                }
                m48678(charSequence, c23489.f74832, c23489.f74833);
                if (arrayDeque.isEmpty()) {
                }
                i5 = c23489.f74833;
                i4++;
                arrayDeque2 = arrayDeque;
            } else {
                m48678(charSequence, i5, charSequence.length());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m48679(int i) {
        if (i == 0) {
            return false;
        }
        C23489 c23489 = (C23489) this.f67756.get(i);
        if (c23489.f74830 || c23489.f74834 || m48680(c23489.f74831) || c23489.f74831 == 17) {
            return false;
        }
        C22819 c22819 = this.f67747[i];
        return c23489.f74838 || !(c22819 == null || c22819.f71885 || i != c22819.f71881 + 1);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48678(CharSequence charSequence, int i, int i2) {
        int i3;
        int i4 = i2 - i;
        C20438 c20438 = this.f67757;
        if (i4 > 1048576 - c20438.length()) {
            throw C13983.m31774(EnumC20808.LIMIT, "Formatted source length limit exceeded");
        }
        c20438.m46122(i, i2, charSequence);
        int i5 = 0;
        while (i < i2) {
            int i6 = i5 + 1;
            if ((i5 & 1023) == 0) {
                this.f67744.m15087();
            }
            int iCodePointAt = Character.codePointAt(charSequence, i);
            if (iCodePointAt == 10 || iCodePointAt == 13) {
                this.f67750 = 0;
                this.f67753 = 0;
            } else if (iCodePointAt != 65279) {
                int i7 = this.f67750;
                if (iCodePointAt == 9) {
                    int i8 = this.f67752;
                    i3 = i8 - (i7 % i8);
                } else {
                    i3 = 1;
                }
                this.f67750 = i7 + i3;
            }
            i += Character.charCount(iCodePointAt);
            i5 = i6;
        }
    }
}
