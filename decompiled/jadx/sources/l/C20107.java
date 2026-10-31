package l;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C20107 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4460 f65105;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f65106;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int[] f65107;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C21518[] f65108;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final CharSequence f65109;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int[] f65110;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f65111;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21518[] f65112;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f65113;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f65114;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f65115;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean[] f65116;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f65117;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C19012 f65118;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m46364(int i) {
        return i == 31 || i == 48 || i == 46;
    }

    public C20107(CharSequence charSequence, ArrayList arrayList, String str, String str2, int i, C4460 c4460, C19012 c19012) {
        this.f65109 = charSequence;
        this.f65117 = arrayList;
        this.f65106 = str;
        this.f65115 = str2;
        this.f65113 = i;
        this.f65105 = c4460;
        this.f65118 = c19012;
        this.f65112 = new C21518[arrayList.size()];
        this.f65108 = new C21518[arrayList.size()];
        this.f65107 = new int[arrayList.size() + 1];
        this.f65110 = new int[arrayList.size()];
        this.f65116 = new boolean[arrayList.size()];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            c4460.m13206();
            C22223 c22223 = (C22223) arrayList.get(i2);
            int length = c22223.f72117.length();
            int iCharCount = c22223.f72112;
            int i3 = 0;
            while (iCharCount < c22223.f72113) {
                int i4 = i3 + 1;
                if ((i3 & 1023) == 0) {
                    c4460.m13206();
                }
                int iCodePointAt = Character.codePointAt(this.f65109, iCharCount);
                if (iCodePointAt == 13 || iCodePointAt == 10) {
                    this.f65116[i2] = true;
                } else if (iCodePointAt != 65279) {
                    length += iCodePointAt == 9 ? this.f65113 : 1;
                }
                iCharCount += Character.charCount(iCodePointAt);
                i3 = i4;
            }
            int[] iArr = this.f65107;
            int i5 = i2 + 1;
            iArr[i5] = iArr[i2] + length;
            i2 = i5;
        }
        ArrayList arrayList2 = this.f65117;
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            this.f65105.m13206();
            C22223 c22224 = (C22223) arrayList2.get(i6);
            this.f65108[i6] = (C21518) arrayDeque.peek();
            if (!arrayDeque.isEmpty()) {
                C21518 c21518 = (C21518) arrayDeque.peek();
                boolean z = c21518.f69188;
                C22223 c22225 = (C22223) this.f65117.get(i6);
                c21518.f69188 = z | (c22225.f72114 || c22225.f72116 >= 0 || this.f65116[i6]);
                ((C21518) arrayDeque.peek()).f69189 |= c22224.f72110;
            }
            int i7 = c22224.f72111;
            if (i7 == 30 || i7 == 47 || i7 == 45) {
                C21518 c21519 = new C21518(i6, c22224.f72119);
                c21519.f69189 = c22224.f72110;
                this.f65112[i6] = c21519;
                arrayDeque.push(c21519);
            } else if (m46364(c22224.f72111)) {
                C21518 c215110 = (C21518) arrayDeque.pop();
                c215110.f69183 = i6;
                if (!arrayDeque.isEmpty()) {
                    ((C21518) arrayDeque.peek()).f69188 |= c215110.f69188;
                    C21518 c215111 = (C21518) arrayDeque.peek();
                    c215111.f69189 = c215110.f69189 | c215111.f69189;
                }
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c4460.m13206();
            this.f65110[size] = size;
            int i8 = size + 1;
            if (i8 < arrayList.size() && !this.f65116[size]) {
                C22223 c22226 = (C22223) this.f65117.get(i8);
                if (!c22226.f72114 && c22226.f72116 < 0 && !m46363(i8)) {
                    int[] iArr2 = this.f65110;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46365() {
        boolean z;
        int i;
        C21518 c21518;
        ArrayDeque arrayDeque;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        ArrayDeque arrayDeque2 = new ArrayDeque();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f65117;
            int size = arrayList.size();
            CharSequence charSequence = this.f65109;
            if (i4 < size) {
                C4460 c4460 = this.f65105;
                c4460.m13206();
                C22223 c22223 = (C22223) arrayList.get(i4);
                C21518 c21519 = this.f65108[i4];
                int iMax = Math.max(c21519 == null ? 0 : c21519.f69187, arrayDeque2.isEmpty() ? 0 : ((C15166) arrayDeque2.peek()).f46332);
                int i6 = c22223.f72119 + iMax;
                int i7 = (c22223.f72110 || !c22223.f72109 || m46364(c22223.f72111) || (c21519 != null && c22223.f72119 <= c21519.f69186 + 1)) ? 0 : 1;
                boolean z4 = c21519 != null && c21519.f69184 && (i4 == c21519.f69185 + 1 || m46364(c22223.f72111) || (c22223.f72119 == c21519.f69186 + 1 && ((i3 = ((C22223) arrayList.get(i4 + (-1))).f72111) == 15 || i3 == 1)));
                boolean z5 = c22223.f72110;
                int[] iArr = this.f65107;
                int[] iArr2 = this.f65110;
                if (z5) {
                    z = false;
                } else {
                    if (!z4) {
                        if (m46363(i4)) {
                            if (((iArr[iArr2[i4] + 1] - iArr[i4]) - ((C22223) arrayList.get(i4)).f72117.length()) + c22223.f72117.length() + this.f65111 > 100) {
                            }
                        }
                        z = false;
                    }
                    z = true;
                }
                int i8 = c22223.f72116;
                ArrayDeque arrayDeque3 = arrayDeque2;
                String str = this.f65106;
                if (i8 >= 0) {
                    m46362(charSequence, i5, c22223.f72116);
                    i = i6 + i7;
                    for (int i9 = 0; i9 < i; i9++) {
                        c4460.m13206();
                        m46362(str, 0, str.length());
                    }
                } else {
                    if (c22223.f72114 || z) {
                        String str2 = this.f65115;
                        m46362(str2, 0, str2.length());
                        i = i6 + i7;
                        for (int i10 = 0; i10 < i; i10++) {
                            c4460.m13206();
                            m46362(str, 0, str.length());
                        }
                    } else {
                        m46362(c22223.f72117, 0, c22223.f72117.length());
                    }
                    c21518 = this.f65112[i4];
                    if (c21518 != null) {
                        boolean z6 = c21518.f69189;
                        if (c21519 == null && c21519.f69189) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c21518.f69189 = z6 | z2;
                        c21518.f69187 = Math.max(iMax, this.f65114 - c22223.f72119);
                        if (!c21518.f69189 || (i2 = c21518.f69183) <= i4 + 1) {
                            z3 = false;
                        } else {
                            if (!c21518.f69188) {
                                if (((iArr[iArr2[i2] + 1] - iArr[i4]) - ((C22223) arrayList.get(i4)).f72117.length()) + this.f65111 <= 100) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        }
                        c21518.f69184 = z3;
                    }
                    if (c22223.f72115 != 0) {
                        arrayDeque = arrayDeque3;
                        arrayDeque.push(new C15166(c22223.f72115, Math.max(iMax, this.f65114 - c22223.f72119)));
                    } else {
                        arrayDeque = arrayDeque3;
                    }
                    m46362(charSequence, c22223.f72112, c22223.f72113);
                    if (arrayDeque.isEmpty() && ((C15166) arrayDeque.peek()).f46331 == c22223.f72113) {
                        arrayDeque.pop();
                    }
                    i5 = c22223.f72113;
                    i4++;
                    arrayDeque2 = arrayDeque;
                }
                this.f65114 = i;
                c21518 = this.f65112[i4];
                if (c21518 != null) {
                    boolean z7 = c21518.f69189;
                    if (c21519 == null) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    c21518.f69189 = z7 | z2;
                    c21518.f69187 = Math.max(iMax, this.f65114 - c22223.f72119);
                    if (c21518.f69189) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    c21518.f69184 = z3;
                }
                if (c22223.f72115 != 0) {
                    arrayDeque = arrayDeque3;
                    arrayDeque.push(new C15166(c22223.f72115, Math.max(iMax, this.f65114 - c22223.f72119)));
                } else {
                    arrayDeque = arrayDeque3;
                }
                m46362(charSequence, c22223.f72112, c22223.f72113);
                if (arrayDeque.isEmpty()) {
                }
                i5 = c22223.f72113;
                i4++;
                arrayDeque2 = arrayDeque;
            } else {
                m46362(charSequence, i5, charSequence.length());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m46363(int i) {
        if (i == 0) {
            return false;
        }
        C22223 c22223 = (C22223) this.f65117.get(i);
        if (c22223.f72110 || c22223.f72114 || m46364(c22223.f72111) || c22223.f72111 == 17) {
            return false;
        }
        C21518 c21518 = this.f65108[i];
        return c22223.f72118 || !(c21518 == null || c21518.f69189 || i != c21518.f69185 + 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46362(CharSequence charSequence, int i, int i2) {
        int i3;
        int i4 = i2 - i;
        C19012 c19012 = this.f65118;
        if (i4 > 1048576 - c19012.length()) {
            throw C12221.m29712(EnumC19402.LIMIT, "Formatted source length limit exceeded");
        }
        c19012.m43854(i, i2, charSequence);
        int i5 = 0;
        while (i < i2) {
            int i6 = i5 + 1;
            if ((i5 & 1023) == 0) {
                this.f65105.m13206();
            }
            int iCodePointAt = Character.codePointAt(charSequence, i);
            if (iCodePointAt == 10 || iCodePointAt == 13) {
                this.f65111 = 0;
                this.f65114 = 0;
            } else if (iCodePointAt != 65279) {
                int i7 = this.f65111;
                if (iCodePointAt == 9) {
                    int i8 = this.f65113;
                    i3 = i8 - (i7 % i8);
                } else {
                    i3 = 1;
                }
                this.f65111 = i7 + i3;
            }
            i += Character.charCount(iCodePointAt);
            i5 = i6;
        }
    }
}
