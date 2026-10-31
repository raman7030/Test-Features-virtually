package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6PG */
/* JADX INFO: loaded from: classes.dex */
public final class C22324 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f72347 = true;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f72348;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f72349;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C19012 f72350;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C19012 f72351;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f72352;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2569 f72353;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f72354;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f72355;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f72356;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f72357;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f72358;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f72359;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int[] f72360;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15267[] f72361;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C15267[] f72362;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m50060(int i) {
        return i == 15 || i == 16 || i == 17;
    }

    public C22324(C19012 c19012, ArrayList arrayList, C2569 c2569, boolean z, int i, C19012 c19013) {
        this.f72351 = c19012;
        this.f72352 = arrayList;
        this.f72353 = c2569;
        this.f72349 = i;
        this.f72359 = z ? "\t" : C9679.m24607(' ', i);
        String str = "\n";
        int iM8474 = C2732.m8474("\n", c19012, 0);
        if (iM8474 > 0 && c19012.charAt(iM8474 - 1) == '\r') {
            str = "\r\n";
        }
        this.f72357 = str;
        this.f72362 = new C15267[arrayList.size()];
        this.f72361 = new C15267[arrayList.size()];
        this.f72354 = new int[arrayList.size()];
        int[] iArr = new int[arrayList.size()];
        this.f72355 = iArr;
        this.f72360 = new int[arrayList.size() * 2];
        this.f72348 = new int[arrayList.size() * 2];
        this.f72350 = c19013;
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.f72353.m8120();
            C21619 c21619 = (C21619) arrayList.get(i2);
            this.f72361[i2] = (C15267) arrayDeque.peek();
            int i3 = c21619.f69404;
            if (i3 == 12 || i3 == 13 || i3 == 14) {
                C15267 c15267 = new C15267(i2);
                this.f72362[i2] = c15267;
                arrayDeque.push(c15267);
            }
            if (!arrayDeque.isEmpty() && (c21619.f69403 || c21619.f69404 == 105)) {
                ((C15267) arrayDeque.peek()).f46852 = true;
            }
            if (m50060(c21619.f69404)) {
                C15267 c15268 = (C15267) arrayDeque.pop();
                c15268.f46851 = i2;
                if (!arrayDeque.isEmpty()) {
                    C15267 c15269 = (C15267) arrayDeque.peek();
                    c15269.f46852 = c15268.f46852 | c15269.f46852;
                }
            }
        }
        int length = c19012.length();
        int length2 = c19012.length() - 1;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            while (length2 >= ((C21619) arrayList.get(size)).f69405) {
                if (c19012.charAt(length2) == '\n') {
                    length = length2;
                }
                length2--;
            }
            this.f72354[size] = length;
            iArr[size] = size;
            int i4 = size + 1;
            if (i4 < arrayList.size() && length >= ((C21619) arrayList.get(i4)).f69402 && (!m50058(i4) || m50060(((C21619) arrayList.get(i4)).f69404))) {
                iArr[size] = iArr[i4];
            }
        }
        int[] iArr2 = this.f72360;
        int iCharCount = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            this.f72353.m8120();
            C21619 c216110 = (C21619) this.f72352.get(i7 / 2);
            int i8 = i7 % 2 == 0 ? c216110.f69405 : c216110.f69402;
            while (iCharCount < i8) {
                int iCodePointAt = Character.codePointAt(this.f72351, iCharCount);
                i6 = iCodePointAt == 9 ? i6 + 1 : i6;
                if (iCodePointAt != 13) {
                    i5++;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            iArr2[i7] = i5;
            this.f72348[i7] = i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0134  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50061() {
        boolean z;
        CharSequence charSequence;
        C15267 c15267;
        int i;
        boolean z2;
        boolean zM50059;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f72352;
            int size = arrayList.size();
            C19012 c19012 = this.f72351;
            if (i3 < size) {
                C2569 c2569 = this.f72353;
                c2569.m8120();
                C21619 c21619 = (C21619) arrayList.get(i3);
                C15267[] c15267Arr = this.f72361;
                C15267 c15268 = c15267Arr[i3];
                String strM8476 = C2732.m8476(i4, c21619.f69405, c19012);
                boolean zM50060 = m50060(c21619.f69404);
                int[] iArr = this.f72354;
                if (c15268 == null || c15268.f46852) {
                    c21619 = c21619;
                    c15267Arr = c15267Arr;
                    z = zM50060 ? 1 : 0;
                    c19012 = c19012;
                    charSequence = strM8476;
                } else {
                    int i5 = c15268.f46855 + (!zM50060 ? 1 : 0);
                    int iLastIndexOf = strM8476.lastIndexOf(10);
                    String str = this.f72359;
                    if (iLastIndexOf >= 0) {
                        charSequence = strM8476.substring(i2, iLastIndexOf + 1) + C9679.m24608(i5, str);
                        c21619 = c21619;
                        c15267Arr = c15267Arr;
                        z = zM50060 ? 1 : 0;
                        c19012 = c19012;
                    } else if (c21619.f69404 == 103 || !m50058(i3)) {
                        c21619 = c21619;
                        c15267Arr = c15267Arr;
                        z = zM50060 ? 1 : 0;
                        c19012 = c19012;
                        charSequence = strM8476;
                    } else {
                        C21619 c216110 = (C21619) arrayList.get(i3 - 1);
                        if (zM50060) {
                            z2 = c15268.f46850;
                        } else {
                            z2 = c15268.f46853 && (i3 == c15268.f46854 + 1 || c216110.f69404 == 20);
                        }
                        if (z2) {
                            c21619 = c21619;
                            c15267Arr = c15267Arr;
                            z = zM50060 ? 1 : 0;
                            c19012 = c19012;
                        } else {
                            if (zM50060) {
                                c21619 = c21619;
                                c15267Arr = c15267Arr;
                                z = zM50060 ? 1 : 0;
                                c19012 = c19012;
                            } else {
                                int length = strM8476.length() + this.f72356;
                                int i6 = i3 + 1;
                                int i7 = i3;
                                while (true) {
                                    if (i6 < arrayList.size()) {
                                        c2569.m8120();
                                        C21619 c216111 = (C21619) arrayList.get(i6);
                                        C2569 c25610 = c2569;
                                        z = zM50060;
                                        if (iArr[i3] >= c216111.f69402 && (c15267Arr[i6] != c15267Arr[i3] || !m50058(i6))) {
                                            c19012 = c19012;
                                            c21619 = c21619;
                                            c15267Arr = c15267Arr;
                                            if (((long) c216111.f69402) - ((long) ((C21619) arrayList.get(i3)).f69405) > ((long) UMErrorCode.E_UM_BE_NOT_MAINPROCESS) * 2) {
                                                zM50059 = false;
                                                break;
                                            }
                                            i7 = i6;
                                            i6++;
                                            c19012 = c19012;
                                            c2569 = c25610;
                                            zM50060 = z ? 1 : 0;
                                            c21619 = c21619;
                                            c15267Arr = c15267Arr;
                                        }
                                    } else {
                                        z = zM50060;
                                    }
                                    zM50059 = m50059(i3, i7, length);
                                    break;
                                }
                                if (!zM50059) {
                                }
                            }
                            charSequence = strM8476;
                        }
                        charSequence = this.f72357 + C9679.m24608(i5, str);
                        c15268.f46850 = true;
                    }
                }
                m50057(charSequence);
                C15267 c15269 = this.f72362[i3];
                if (c15269 != null) {
                    c15269.f46852 |= c15268 != null && c15268.f46852;
                    c15269.f46855 = this.f72358 / this.f72349;
                    c15269.f46853 = !c15269.f46852 && (i = c15269.f46851) > i3 + 1 && iArr[i3] >= ((C21619) arrayList.get(c15269.f46851)).f69402 && !m50059(i3, this.f72355[i], this.f72356);
                }
                m50057(new C13130(c21619.f69405, c21619.f69402, c19012));
                if (z && c15268.f46850 && (c15267 = c15267Arr[c15268.f46854]) != null) {
                    c15267.f46850 = true;
                }
                i4 = c21619.f69402;
                i3++;
                i2 = 0;
            } else {
                m50057(new C13130(i4, c19012.length(), c19012));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m50058(int i) {
        if (i != 0) {
            C15267[] c15267Arr = this.f72361;
            if (c15267Arr[i] != null) {
                ArrayList arrayList = this.f72352;
                C21619 c21619 = (C21619) arrayList.get(i);
                C21619 c216110 = (C21619) arrayList.get(i - 1);
                if (c21619.f69404 != 103 && c216110.f69404 != 103 && c21619.f69404 != 105 && c216110.f69404 != 105) {
                    if (i != c15267Arr[i].f46854 + 1 && !m50060(c21619.f69404) && c216110.f69404 != 20 && !c21619.f69401) {
                        int i2 = c21619.f69404;
                        if (i2 != 101 && i2 != 5 && i2 != 8) {
                            return false;
                        }
                        int i3 = c216110.f69404;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m50059(int i, int i2, int i3) {
        int i4;
        ArrayList arrayList = this.f72352;
        int iCharCount = ((C21619) arrayList.get(i)).f69405;
        int i5 = ((C21619) arrayList.get(i2)).f69402;
        if (this.f72354[i] >= i5) {
            int i6 = i * 2;
            int[] iArr = this.f72348;
            int i7 = (i2 * 2) + 1;
            if (iArr[i6] == iArr[i7]) {
                long j = i3;
                int[] iArr2 = this.f72360;
                return (j + ((long) iArr2[i7])) - ((long) iArr2[i6]) <= ((long) UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
            }
        }
        while (iCharCount < i5) {
            if ((iCharCount & 1023) == 0) {
                this.f72353.m8120();
            }
            int iCodePointAt = Character.codePointAt(this.f72351, iCharCount);
            if (iCodePointAt == 10) {
                break;
            }
            if (iCodePointAt == 9) {
                int i8 = this.f72349;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50057(CharSequence charSequence) {
        int length = charSequence.length();
        C19012 c19012 = this.f72350;
        if (length > 1048576 - c19012.length()) {
            throw C5391.m15357(EnumC0451.LIMIT, "Formatted source length limit exceeded");
        }
        c19012.append(charSequence);
        int iCharCount = 0;
        while (iCharCount < charSequence.length()) {
            if ((iCharCount & 1023) == 0) {
                this.f72353.m8120();
            }
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            int i = 1;
            if (iCodePointAt == 10) {
                this.f72356 = 0;
                this.f72358 = 0;
                this.f72347 = true;
            } else if (iCodePointAt != 13 && iCodePointAt != 65279) {
                int i2 = this.f72356;
                if (iCodePointAt == 9) {
                    int i3 = this.f72349;
                    i = i3 - (i2 % i3);
                }
                int i4 = i2 + i;
                this.f72356 = i4;
                if (this.f72347 && (iCodePointAt == 32 || iCodePointAt == 9 || iCodePointAt == 12)) {
                    this.f72358 = i4;
                } else {
                    this.f72347 = false;
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }
}
