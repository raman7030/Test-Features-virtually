package l;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6V3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11999 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f35927;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f35928;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC20466 f35929;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21605 f35930;

    public C11999(AbstractC20466 abstractC20466, int i, int i2, C21605 c21605) {
        this.f35930 = c21605;
        this.f35929 = abstractC20466;
        this.f35927 = i;
        this.f35928 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11999 m29333(int i, int i2, C21605 c21605) {
        return new C11999(null, i, i2, c21605);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m29348(C11999 c11999) {
        return this.f35929 == c11999.f35929;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m29349() {
        AbstractC20466 abstractC20466 = this.f35929;
        if (abstractC20466 == null) {
            return 0;
        }
        return abstractC20466.f65977;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29341() {
        AbstractC20466 abstractC20466 = this.f35929;
        if (abstractC20466 == null) {
            return -1;
        }
        return abstractC20466.f65975;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m29347() {
        AbstractC20466 abstractC20466 = this.f35929;
        if (abstractC20466 == null) {
            return 0;
        }
        return abstractC20466.f65976;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11999 m29346(C11999 c11999) {
        C21605 c21605 = c11999.f35930;
        C21605 c21606 = this.f35930;
        if (c21606 == c21605) {
            int i = c11999.f35927;
            int i2 = this.f35927;
            if (i2 == i) {
                int i3 = c11999.f35928;
                int i4 = this.f35928;
                if (i4 == i3) {
                    m29338(m29347(), 0, c11999.m29347());
                    return new C11999(m29336(this.f35929, c11999.f35929, new Object()), i2, i4, c21606);
                }
            }
        }
        throw new IllegalArgumentException("Text fragments belong to different stores");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29337(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            StringBuilder sbM46682 = C20361.m46682("Invalid text range: ", i, "..", "/", i2);
            sbM46682.append(i3);
            throw new IndexOutOfBoundsException(sbM46682.toString());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m29338(int i, int i2, int i3) {
        long j = (((long) i) - ((long) i2)) + ((long) i3);
        if (j > 2147483647L || j < 0) {
            throw new IllegalArgumentException("Text exceeds UTF-16 coordinate limit");
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a A[Catch: all -> 0x00cb, LOOP:1: B:31:0x0098->B:32:0x009a, LOOP_END, TryCatch #2 {all -> 0x00cb, blocks: (B:14:0x0048, B:19:0x0056, B:21:0x0059, B:33:0x00a5, B:22:0x0061, B:24:0x0065, B:25:0x0073, B:27:0x007b, B:29:0x0084, B:32:0x009a), top: B:70:0x0048, outer: #0 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11999 m29344(int i, int i2, CharSequence charSequence, Object obj) {
        int iMin;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        C21605 c21605 = this.f35930;
        int i7 = this.f35928;
        int i8 = this.f35927;
        if (i6 == i2) {
            return new C11999(null, i8, i7, c21605);
        }
        int i9 = i2 - i6;
        int i10 = i8 - (i8 / 8);
        if (i9 <= i8) {
            iMin = 1;
        } else {
            long j = i10;
            iMin = Math.min((int) (((((long) i9) + j) - 1) / j), i9 / (i8 / 2));
        }
        int i11 = i9 / iMin;
        int i12 = i9 % iMin;
        ArrayList arrayList = new ArrayList(iMin);
        C23287 c23287 = new C23287(c21605, i8);
        try {
            C21172 c21172Mo27940 = charSequence instanceof C13409 ? ((C13409) charSequence).mo27940(i6) : null;
            try {
                char[] cArrM51607 = c23287.m51607();
                int i13 = 0;
                int i14 = 0;
                while (i14 < iMin) {
                    int i15 = (i14 < i12 ? 1 : 0) + i11;
                    if (c21172Mo27940 != null) {
                        c21172Mo27940.m48113(cArrM51607, i13, i15);
                        i3 = i12;
                        i4 = iMin;
                    } else if (charSequence instanceof String) {
                        i3 = i12;
                        i4 = iMin;
                        ((String) charSequence).getChars(i6, i6 + i15, cArrM51607, 0);
                    } else {
                        i3 = i12;
                        i4 = iMin;
                        if (charSequence instanceof CharBuffer) {
                            CharBuffer charBuffer = (CharBuffer) charSequence;
                            if (charBuffer.hasArray()) {
                                System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position() + i6, cArrM51607, 0, i15);
                            } else {
                                for (i5 = 0; i5 < i15; i5++) {
                                    cArrM51607[i5] = charSequence.charAt(i6 + i5);
                                }
                            }
                        } else {
                            while (i5 < i15) {
                                cArrM51607[i5] = charSequence.charAt(i6 + i5);
                            }
                        }
                    }
                    int i16 = i14;
                    char[] cArr = cArrM51607;
                    arrayList.add(new C21877(obj, this.f35927, cArrM51607, 0, i15, this.f35930));
                    i6 += i15;
                    i14 = i16 + 1;
                    i13 = 0;
                    i12 = i3;
                    cArrM51607 = cArr;
                    iMin = i4;
                }
                if (c21172Mo27940 != null) {
                    c21172Mo27940.close();
                }
                c23287.close();
                while (arrayList.size() > 1) {
                    int size = ((arrayList.size() + i7) - 1) / i7;
                    int size2 = arrayList.size() / size;
                    int size3 = arrayList.size() % size;
                    ArrayList arrayList2 = new ArrayList(size);
                    int i17 = 0;
                    int i18 = 0;
                    while (i18 < size) {
                        int i19 = (i18 < size3 ? 1 : 0) + size2 + i17;
                        arrayList2.add(new C23993(obj, (AbstractC20466[]) arrayList.subList(i17, i19).toArray(new AbstractC20466[0])));
                        i18++;
                        i17 = i19;
                    }
                    arrayList = arrayList2;
                }
                return new C11999((AbstractC20466) arrayList.get(0), i8, i7, c21605);
            } catch (Throwable th) {
                if (c21172Mo27940 == null) {
                    throw th;
                }
                try {
                    c21172Mo27940.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                c23287.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[Catch: Error | RuntimeException -> 0x0059, RuntimeException -> 0x005b, LOOP:0: B:16:0x0046->B:17:0x0048, LOOP_END, TryCatch #2 {Error | RuntimeException -> 0x0059, blocks: (B:5:0x000e, B:7:0x0017, B:18:0x0053, B:8:0x001d, B:10:0x0021, B:11:0x0027, B:13:0x002b, B:15:0x0034, B:17:0x0048), top: B:37:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:40:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10588 m29342(int i, int i2, CharSequence charSequence) {
        int i3 = i2 - i;
        C21605 c21605 = this.f35930;
        int i4 = this.f35927;
        if (i3 <= i4) {
            C23287 c23287 = new C23287(c21605, i3);
            try {
                char[] cArrM51607 = c23287.m51607();
                if (charSequence instanceof C13409) {
                    ((C13409) charSequence).getChars(i, i2, cArrM51607, 0);
                } else if (charSequence instanceof String) {
                    ((String) charSequence).getChars(i, i2, cArrM51607, 0);
                } else if (charSequence instanceof CharBuffer) {
                    CharBuffer charBuffer = (CharBuffer) charSequence;
                    if (charBuffer.hasArray()) {
                        System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position() + i, cArrM51607, 0, i3);
                    } else {
                        for (int i5 = 0; i5 < i3; i5++) {
                            cArrM51607[i5] = charSequence.charAt(i + i5);
                        }
                    }
                } else {
                    while (i5 < i3) {
                        cArrM51607[i5] = charSequence.charAt(i + i5);
                    }
                }
                return new C10588(cArrM51607, null, i3, c23287);
            } catch (Error | RuntimeException e) {
                c23287.close();
                throw e;
            }
        }
        if (charSequence instanceof C13409) {
            C13409 c13409 = (C13409) charSequence;
            C11999 c11999M32420 = c13409.m32420();
            if (c11999M32420.f35927 == i4 && c11999M32420.f35928 == this.f35928 && c11999M32420.f35930 == c21605) {
                return new C10588(null, c11999M32420.m29343(c13409.mo27939() + i, c13409.mo27939() + i2).f35929, i3, null);
            }
        }
        return new C10588(null, m29344(i, i2, charSequence, new Object()).f35929, i3, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11999 m29345(int i, int i2, C10588 c10588, Object obj) {
        int i3;
        if (i == i2 && c10588.f31790 == 0) {
            return this;
        }
        AbstractC20466 c21877 = c10588.f31788;
        char[] cArr = c10588.f31789;
        AbstractC20466 abstractC20466 = this.f35929;
        C21605 c21605 = this.f35930;
        int i4 = this.f35928;
        int i5 = this.f35927;
        if (cArr != null) {
            if (abstractC20466 != null) {
                i3 = i5;
                AbstractC20466 abstractC20466M29335 = m29335(abstractC20466, i, i2, cArr, c10588.f31790, obj, true);
                if (abstractC20466M29335 != null) {
                    return new C11999(abstractC20466M29335, i3, i4, c21605);
                }
            } else {
                i3 = i5;
            }
            int i6 = c10588.f31790;
            if (i6 == 0) {
                c21877 = null;
            } else {
                c21877 = new C21877(obj, this.f35927, c10588.f31789, 0, i6, this.f35930);
            }
        } else {
            i3 = i5;
        }
        C6354 c6354M29332 = m29332(abstractC20466, i, obj);
        return new C11999(m29336(m29336(c6354M29332.f19676, c21877, obj), m29332(c6354M29332.f19677, i2 - i, obj).f19677, obj), i3, i4, c21605);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC20466 m29335(AbstractC20466 abstractC20466, int i, int i2, char[] cArr, int i3, Object obj, boolean z) {
        AbstractC20466 abstractC20467;
        int i4;
        AbstractC20466 abstractC20466M29335;
        if (abstractC20466 instanceof C21877) {
            int i5 = (abstractC20466.f65976 - (i2 - i)) + i3;
            int i6 = this.f35927;
            if (i5 > i6) {
                return null;
            }
            if ((z || i5 >= i6 / 2) && i5 != 0) {
                return ((C21877) abstractC20466).m49264(obj, i, i2, cArr, i3);
            }
            return null;
        }
        C23993 c23993 = (C23993) abstractC20466;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            AbstractC20466[] abstractC20466Arr = c23993.f77779;
            if (i8 < abstractC20466Arr.length) {
                abstractC20467 = abstractC20466Arr[i8];
                i4 = abstractC20467.f65976 + i7;
                if (i < i4 || i8 == abstractC20466Arr.length - 1) {
                    break;
                }
                i8++;
                i7 = i4;
            } else {
                throw new AssertionError();
            }
        }
        if (i2 > i4 || (abstractC20466M29335 = m29335(abstractC20467, i - i7, i2 - i7, cArr, i3, obj, false)) == null) {
            return null;
        }
        if (c23993.f65979 != obj) {
            c23993 = new C23993(obj, (AbstractC20466[]) c23993.f77779.clone());
        }
        c23993.f77779[i8] = abstractC20466M29335;
        c23993.m52832();
        return c23993;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11999 m29343(int i, int i2) {
        m29337(i, i2, m29347());
        if (i == 0 && i2 == m29347()) {
            return this;
        }
        Object obj = new Object();
        return new C11999(m29332(m29332(this.f35929, i, obj).f19677, i2 - i, obj).f19676, this.f35927, this.f35928, this.f35930);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C6354 m29332(AbstractC20466 abstractC20466, int i, Object obj) {
        if (abstractC20466 == null) {
            return new C6354(null, null);
        }
        if (i == 0) {
            return new C6354(null, abstractC20466);
        }
        if (i == abstractC20466.f65976) {
            return new C6354(abstractC20466, null);
        }
        if (abstractC20466 instanceof C21877) {
            C23287 c23287 = new C23287(this.f35930, abstractC20466.f65976);
            try {
                char[] cArrM51607 = c23287.m51607();
                ((C21877) abstractC20466).m49265(cArrM51607, abstractC20466.f65976, 0);
                C6354 c6354 = new C6354(new C21877(obj, this.f35927, cArrM51607, 0, i, this.f35930), new C21877(obj, this.f35927, cArrM51607, i, abstractC20466.f65976 - i, this.f35930));
                c23287.close();
                return c6354;
            } catch (Throwable th) {
                try {
                    c23287.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        AbstractC20466[] abstractC20466Arr = ((C23993) abstractC20466).f77779;
        int i2 = 0;
        while (true) {
            AbstractC20466 abstractC20467 = abstractC20466Arr[i2];
            int i3 = abstractC20467.f65976;
            if (i <= i3) {
                C6354 c6354M29332 = m29332(abstractC20467, i, obj);
                return new C6354(m29336(m29334(obj, (AbstractC20466[]) Arrays.copyOfRange(abstractC20466Arr, 0, i2)), c6354M29332.f19676, obj), m29336(c6354M29332.f19677, m29334(obj, (AbstractC20466[]) Arrays.copyOfRange(abstractC20466Arr, i2 + 1, abstractC20466Arr.length)), obj));
            }
            i2++;
            i -= i3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC20466 m29334(Object obj, AbstractC20466[] abstractC20466Arr) {
        if (abstractC20466Arr.length == 0) {
            return null;
        }
        return abstractC20466Arr.length == 1 ? abstractC20466Arr[0] : new C23993(obj, abstractC20466Arr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC20466 m29336(AbstractC20466 abstractC20466, AbstractC20466 abstractC20467, Object obj) {
        if (abstractC20466 == null) {
            return abstractC20467;
        }
        return abstractC20467 == null ? abstractC20466 : m29334(obj, m29339(abstractC20466, abstractC20467, obj));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private AbstractC20466[] m29339(AbstractC20466 abstractC20466, AbstractC20466 abstractC20467, Object obj) {
        AbstractC20466[] abstractC20466Arr;
        int i;
        int i2 = abstractC20466.f65975;
        if (i2 == 0 && abstractC20467.f65975 == 0) {
            int i3 = abstractC20466.f65976;
            int i4 = abstractC20467.f65976;
            int i5 = i3 + i4;
            int i6 = this.f35927;
            if (i5 > i6 && i3 >= (i = i6 / 2) && i4 >= i) {
                return new AbstractC20466[]{abstractC20466, abstractC20467};
            }
            C23287 c23287 = new C23287(this.f35930, i5);
            try {
                char[] cArrM51607 = c23287.m51607();
                ((C21877) abstractC20466).m49265(cArrM51607, abstractC20466.f65976, 0);
                ((C21877) abstractC20467).m49265(cArrM51607, abstractC20467.f65976, abstractC20466.f65976);
                int i7 = this.f35927;
                if (i5 > i7) {
                    int i8 = i5 / 2;
                    AbstractC20466[] abstractC20466Arr2 = {new C21877(obj, i7, cArrM51607, 0, i8, this.f35930), new C21877(obj, this.f35927, cArrM51607, i8, i5 - i8, this.f35930)};
                    c23287.close();
                    return abstractC20466Arr2;
                }
                AbstractC20466[] abstractC20466Arr3 = {new C21877(obj, i7, cArrM51607, 0, i5, this.f35930)};
                c23287.close();
                return abstractC20466Arr3;
            } catch (Throwable th) {
                try {
                    c23287.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        int i9 = abstractC20467.f65975;
        if (i2 == i9) {
            AbstractC20466[] abstractC20466Arr4 = ((C23993) abstractC20466).f77779;
            AbstractC20466[] abstractC20466Arr5 = ((C23993) abstractC20467).f77779;
            abstractC20466Arr = new AbstractC20466[abstractC20466Arr4.length + abstractC20466Arr5.length];
            System.arraycopy(abstractC20466Arr4, 0, abstractC20466Arr, 0, abstractC20466Arr4.length);
            System.arraycopy(abstractC20466Arr5, 0, abstractC20466Arr, abstractC20466Arr4.length, abstractC20466Arr5.length);
        } else if (i2 > i9) {
            AbstractC20466[] abstractC20466Arr6 = ((C23993) abstractC20466).f77779;
            AbstractC20466[] abstractC20466ArrM29339 = m29339(abstractC20466Arr6[abstractC20466Arr6.length - 1], abstractC20467, obj);
            abstractC20466Arr = (AbstractC20466[]) Arrays.copyOf(abstractC20466Arr6, (abstractC20466Arr6.length - 1) + abstractC20466ArrM29339.length);
            System.arraycopy(abstractC20466ArrM29339, 0, abstractC20466Arr, abstractC20466Arr6.length - 1, abstractC20466ArrM29339.length);
        } else {
            AbstractC20466[] abstractC20466Arr7 = ((C23993) abstractC20467).f77779;
            AbstractC20466[] abstractC20466ArrM293310 = m29339(abstractC20466, abstractC20466Arr7[0], obj);
            abstractC20466Arr = new AbstractC20466[(abstractC20466ArrM293310.length + abstractC20466Arr7.length) - 1];
            System.arraycopy(abstractC20466ArrM293310, 0, abstractC20466Arr, 0, abstractC20466ArrM293310.length);
            System.arraycopy(abstractC20466Arr7, 1, abstractC20466Arr, abstractC20466ArrM293310.length, abstractC20466Arr7.length - 1);
        }
        if (abstractC20466Arr.length <= this.f35928) {
            return new AbstractC20466[]{new C23993(obj, abstractC20466Arr)};
        }
        int length = abstractC20466Arr.length / 2;
        return new AbstractC20466[]{new C23993(obj, (AbstractC20466[]) Arrays.copyOfRange(abstractC20466Arr, 0, length)), new C23993(obj, (AbstractC20466[]) Arrays.copyOfRange(abstractC20466Arr, length, abstractC20466Arr.length))};
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m29340(int i) {
        AbstractC20466 abstractC20466 = this.f35929;
        while (abstractC20466 instanceof C23993) {
            for (AbstractC20466 abstractC20467 : ((C23993) abstractC20466).f77779) {
                int i2 = abstractC20467.f65976;
                if (i < i2) {
                    abstractC20466 = abstractC20467;
                    break;
                }
                i -= i2;
            }
        }
        return ((C21877) abstractC20466).m49262(i);
    }
}
