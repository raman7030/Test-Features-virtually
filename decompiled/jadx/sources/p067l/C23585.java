package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6PG */
/* JADX INFO: loaded from: classes.dex */
public final class C23585 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f75073 = true;

    /* JADX INFO: renamed from: ۖ */
    public final int[] f75074;

    /* JADX INFO: renamed from: ۘ */
    public final int f75075;

    /* JADX INFO: renamed from: ۜ */
    public final C20438 f75076;

    /* JADX INFO: renamed from: ۡ */
    public final C20438 f75077;

    /* JADX INFO: renamed from: ۢ */
    public final ArrayList f75078;

    /* JADX INFO: renamed from: ۧ */
    public final C4810 f75079;

    /* JADX INFO: renamed from: ܳ */
    public final int[] f75080;

    /* JADX INFO: renamed from: ܺ */
    public final int[] f75081;

    /* JADX INFO: renamed from: ܽ */
    public int f75082;

    /* JADX INFO: renamed from: ܿ */
    public final String f75083;

    /* JADX INFO: renamed from: ᩳ */
    public int f75084;

    /* JADX INFO: renamed from: ᩴ */
    public final String f75085;

    /* JADX INFO: renamed from: ᩵ */
    public final int[] f75086;

    /* JADX INFO: renamed from: ᩷ */
    public final C16878[] f75087;

    /* JADX INFO: renamed from: ᩻ */
    public final C16878[] f75088;

    /* JADX INFO: renamed from: ۧ */
    public static boolean m52391(int i) {
        return i == 15 || i == 16 || i == 17;
    }

    public C23585(C20438 c20438, ArrayList arrayList, C4810 c4810, boolean z, int i, C20438 c20439) {
        this.f75077 = c20438;
        this.f75078 = arrayList;
        this.f75079 = c4810;
        this.f75075 = i;
        this.f75085 = z ? "\t" : C11567.m26621(' ', i);
        String str = "\n";
        int iM10521 = C4965.m10521("\n", c20438, 0);
        if (iM10521 > 0 && c20438.charAt(iM10521 - 1) == '\r') {
            str = "\r\n";
        }
        this.f75083 = str;
        this.f75088 = new C16878[arrayList.size()];
        this.f75087 = new C16878[arrayList.size()];
        this.f75080 = new int[arrayList.size()];
        int[] iArr = new int[arrayList.size()];
        this.f75081 = iArr;
        this.f75086 = new int[arrayList.size() * 2];
        this.f75074 = new int[arrayList.size() * 2];
        this.f75076 = c20439;
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.f75079.m10153();
            C22915 c22915 = (C22915) arrayList.get(i2);
            this.f75087[i2] = (C16878) arrayDeque.peek();
            int i3 = c22915.f72107;
            if (i3 == 12 || i3 == 13 || i3 == 14) {
                C16878 c16878 = new C16878(i2);
                this.f75088[i2] = c16878;
                arrayDeque.push(c16878);
            }
            if (!arrayDeque.isEmpty() && (c22915.f72106 || c22915.f72107 == 105)) {
                ((C16878) arrayDeque.peek()).f49976 = true;
            }
            if (m52391(c22915.f72107)) {
                C16878 c16879 = (C16878) arrayDeque.pop();
                c16879.f49975 = i2;
                if (!arrayDeque.isEmpty()) {
                    C16878 c168710 = (C16878) arrayDeque.peek();
                    c168710.f49976 = c16879.f49976 | c168710.f49976;
                }
            }
        }
        int length = c20438.length();
        int length2 = c20438.length() - 1;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            while (length2 >= ((C22915) arrayList.get(size)).f72108) {
                if (c20438.charAt(length2) == '\n') {
                    length = length2;
                }
                length2--;
            }
            this.f75080[size] = length;
            iArr[size] = size;
            int i4 = size + 1;
            if (i4 < arrayList.size() && length >= ((C22915) arrayList.get(i4)).f72105 && (!m52389(i4) || m52391(((C22915) arrayList.get(i4)).f72107))) {
                iArr[size] = iArr[i4];
            }
        }
        int[] iArr2 = this.f75086;
        int iCharCount = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            this.f75079.m10153();
            C22915 c22916 = (C22915) this.f75078.get(i7 / 2);
            int i8 = i7 % 2 == 0 ? c22916.f72108 : c22916.f72105;
            while (iCharCount < i8) {
                int iCodePointAt = Character.codePointAt(this.f75077, iCharCount);
                i6 = iCodePointAt == 9 ? i6 + 1 : i6;
                if (iCodePointAt != 13) {
                    i5++;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            iArr2[i7] = i5;
            this.f75074[i7] = i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0134  */
    /* JADX INFO: renamed from: ֫ */
    public final void m52392() {
        boolean z;
        CharSequence charSequence;
        C16878 c16878;
        int i;
        boolean z2;
        boolean zM52390;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f75078;
            int size = arrayList.size();
            C20438 c20438 = this.f75077;
            if (i3 < size) {
                C4810 c4810 = this.f75079;
                c4810.m10153();
                C22915 c22915 = (C22915) arrayList.get(i3);
                C16878[] c16878Arr = this.f75087;
                C16878 c16879 = c16878Arr[i3];
                String strM10523 = C4965.m10523(i4, c22915.f72108, c20438);
                boolean zM52391 = m52391(c22915.f72107);
                int[] iArr = this.f75080;
                if (c16879 == null || c16879.f49976) {
                    c22915 = c22915;
                    c16878Arr = c16878Arr;
                    z = zM52391 ? 1 : 0;
                    c20438 = c20438;
                    charSequence = strM10523;
                } else {
                    int i5 = c16879.f49979 + (!zM52391 ? 1 : 0);
                    int iLastIndexOf = strM10523.lastIndexOf(10);
                    String str = this.f75085;
                    if (iLastIndexOf >= 0) {
                        charSequence = strM10523.substring(i2, iLastIndexOf + 1) + C11567.m26622(i5, str);
                        c22915 = c22915;
                        c16878Arr = c16878Arr;
                        z = zM52391 ? 1 : 0;
                        c20438 = c20438;
                    } else if (c22915.f72107 == 103 || !m52389(i3)) {
                        c22915 = c22915;
                        c16878Arr = c16878Arr;
                        z = zM52391 ? 1 : 0;
                        c20438 = c20438;
                        charSequence = strM10523;
                    } else {
                        C22915 c22916 = (C22915) arrayList.get(i3 - 1);
                        if (zM52391) {
                            z2 = c16879.f49974;
                        } else {
                            z2 = c16879.f49977 && (i3 == c16879.f49978 + 1 || c22916.f72107 == 20);
                        }
                        if (z2) {
                            c22915 = c22915;
                            c16878Arr = c16878Arr;
                            z = zM52391 ? 1 : 0;
                            c20438 = c20438;
                        } else {
                            if (zM52391) {
                                c22915 = c22915;
                                c16878Arr = c16878Arr;
                                z = zM52391 ? 1 : 0;
                                c20438 = c20438;
                            } else {
                                int length = strM10523.length() + this.f75082;
                                int i6 = i3 + 1;
                                int i7 = i3;
                                while (true) {
                                    if (i6 < arrayList.size()) {
                                        c4810.m10153();
                                        C22915 c22917 = (C22915) arrayList.get(i6);
                                        C4810 c4811 = c4810;
                                        z = zM52391;
                                        if (iArr[i3] >= c22917.f72105 && (c16878Arr[i6] != c16878Arr[i3] || !m52389(i6))) {
                                            c20438 = c20438;
                                            c22915 = c22915;
                                            c16878Arr = c16878Arr;
                                            if (((long) c22917.f72105) - ((long) ((C22915) arrayList.get(i3)).f72108) > ((long) UMErrorCode.E_UM_BE_NOT_MAINPROCESS) * 2) {
                                                zM52390 = false;
                                                break;
                                            }
                                            i7 = i6;
                                            i6++;
                                            c20438 = c20438;
                                            c4810 = c4811;
                                            zM52391 = z ? 1 : 0;
                                            c22915 = c22915;
                                            c16878Arr = c16878Arr;
                                        }
                                    } else {
                                        z = zM52391;
                                    }
                                    zM52390 = m52390(i3, i7, length);
                                    break;
                                }
                                if (!zM52390) {
                                }
                            }
                            charSequence = strM10523;
                        }
                        charSequence = this.f75083 + C11567.m26622(i5, str);
                        c16879.f49974 = true;
                    }
                }
                m52388(charSequence);
                C16878 c168710 = this.f75088[i3];
                if (c168710 != null) {
                    c168710.f49976 |= c16879 != null && c16879.f49976;
                    c168710.f49979 = this.f75084 / this.f75075;
                    c168710.f49977 = !c168710.f49976 && (i = c168710.f49975) > i3 + 1 && iArr[i3] >= ((C22915) arrayList.get(c168710.f49975)).f72105 && !m52390(i3, this.f75081[i], this.f75082);
                }
                m52388(new C14847(c22915.f72108, c22915.f72105, c20438));
                if (z && c16879.f49974 && (c16878 = c16878Arr[c16879.f49978]) != null) {
                    c16878.f49974 = true;
                }
                i4 = c22915.f72105;
                i3++;
                i2 = 0;
            } else {
                m52388(new C14847(i4, c20438.length(), c20438));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m52389(int i) {
        if (i != 0) {
            C16878[] c16878Arr = this.f75087;
            if (c16878Arr[i] != null) {
                ArrayList arrayList = this.f75078;
                C22915 c22915 = (C22915) arrayList.get(i);
                C22915 c22916 = (C22915) arrayList.get(i - 1);
                if (c22915.f72107 != 103 && c22916.f72107 != 103 && c22915.f72107 != 105 && c22916.f72107 != 105) {
                    if (i != c16878Arr[i].f49978 + 1 && !m52391(c22915.f72107) && c22916.f72107 != 20 && !c22915.f72104) {
                        int i2 = c22915.f72107;
                        if (i2 != 101 && i2 != 5 && i2 != 8) {
                            return false;
                        }
                        int i3 = c22916.f72107;
                        if (i3 != 101 && i3 != 5 && i3 != 8) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m52390(int i, int i2, int i3) {
        int i4;
        ArrayList arrayList = this.f75078;
        int iCharCount = ((C22915) arrayList.get(i)).f72108;
        int i5 = ((C22915) arrayList.get(i2)).f72105;
        if (this.f75080[i] >= i5) {
            int i6 = i * 2;
            int[] iArr = this.f75074;
            int i7 = (i2 * 2) + 1;
            if (iArr[i6] == iArr[i7]) {
                long j = i3;
                int[] iArr2 = this.f75086;
                return (j + ((long) iArr2[i7])) - ((long) iArr2[i6]) <= ((long) UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
            }
        }
        while (iCharCount < i5) {
            if ((iCharCount & 1023) == 0) {
                this.f75079.m10153();
            }
            int iCodePointAt = Character.codePointAt(this.f75077, iCharCount);
            if (iCodePointAt == 10) {
                break;
            }
            if (iCodePointAt == 9) {
                int i8 = this.f75075;
                i4 = i8 - (i3 % i8);
            } else {
                i4 = iCodePointAt == 13 ? 0 : 1;
            }
            i3 += i4;
            if (i3 <= 120) {
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52388(CharSequence charSequence) {
        int length = charSequence.length();
        C20438 c20438 = this.f75076;
        if (length > 1048576 - c20438.length()) {
            throw C7492.m17268(EnumC2797.LIMIT, "Formatted source length limit exceeded");
        }
        c20438.append(charSequence);
        int iCharCount = 0;
        while (iCharCount < charSequence.length()) {
            if ((iCharCount & 1023) == 0) {
                this.f75079.m10153();
            }
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            int i = 1;
            if (iCodePointAt == 10) {
                this.f75082 = 0;
                this.f75084 = 0;
                this.f75073 = true;
            } else if (iCodePointAt != 13 && iCodePointAt != 65279) {
                int i2 = this.f75082;
                if (iCodePointAt == 9) {
                    int i3 = this.f75075;
                    i = i3 - (i2 % i3);
                }
                int i4 = i2 + i;
                this.f75082 = i4;
                if (this.f75073 && (iCodePointAt == 32 || iCodePointAt == 9 || iCodePointAt == 12)) {
                    this.f75084 = i4;
                } else {
                    this.f75073 = false;
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }
}
