package p067l;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6V3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13773 {

    /* JADX INFO: renamed from: ֫ */
    public final int f38937;

    /* JADX INFO: renamed from: ۧ */
    public final int f38938;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC21820 f38939;

    /* JADX INFO: renamed from: ᩳ */
    public final C22902 f38940;

    public C13773(AbstractC21820 abstractC21820, int i, int i2, C22902 c22902) {
        this.f38940 = c22902;
        this.f38939 = abstractC21820;
        this.f38937 = i;
        this.f38938 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13773 m31388(int i, int i2, C22902 c22902) {
        return new C13773(null, i, i2, c22902);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m31403(C13773 c13773) {
        return this.f38939 == c13773.f38939;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m31404() {
        AbstractC21820 abstractC21820 = this.f38939;
        if (abstractC21820 == null) {
            return 0;
        }
        return abstractC21820.f68653;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m31396() {
        AbstractC21820 abstractC21820 = this.f38939;
        if (abstractC21820 == null) {
            return -1;
        }
        return abstractC21820.f68651;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m31402() {
        AbstractC21820 abstractC21820 = this.f38939;
        if (abstractC21820 == null) {
            return 0;
        }
        return abstractC21820.f68652;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13773 m31401(C13773 c13773) {
        C22902 c22902 = c13773.f38940;
        C22902 c22903 = this.f38940;
        if (c22903 == c22902) {
            int i = c13773.f38937;
            int i2 = this.f38937;
            if (i2 == i) {
                int i3 = c13773.f38938;
                int i4 = this.f38938;
                if (i4 == i3) {
                    m31393(m31402(), 0, c13773.m31402());
                    return new C13773(m31391(this.f38939, c13773.f38939, new Object()), i2, i4, c22903);
                }
            }
        }
        throw new IllegalArgumentException("Text fragments belong to different stores");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31392(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            StringBuilder sbM49005 = C21720.m49005("Invalid text range: ", i, "..", "/", i2);
            sbM49005.append(i3);
            throw new IndexOutOfBoundsException(sbM49005.toString());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m31393(int i, int i2, int i3) {
        long j = (((long) i) - ((long) i2)) + ((long) i3);
        if (j > 2147483647L || j < 0) {
            throw new IllegalArgumentException("Text exceeds UTF-16 coordinate limit");
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a A[Catch: all -> 0x00cb, LOOP:1: B:31:0x0098->B:32:0x009a, LOOP_END, TryCatch #2 {all -> 0x00cb, blocks: (B:14:0x0048, B:19:0x0056, B:21:0x0059, B:33:0x00a5, B:22:0x0061, B:24:0x0065, B:25:0x0073, B:27:0x007b, B:29:0x0084, B:32:0x009a), top: B:70:0x0048, outer: #0 }] */
    /* JADX INFO: renamed from: ֫ */
    public final C13773 m31399(int i, int i2, CharSequence charSequence, Object obj) {
        int iMin;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        C22902 c22902 = this.f38940;
        int i7 = this.f38938;
        int i8 = this.f38937;
        if (i6 == i2) {
            return new C13773(null, i8, i7, c22902);
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
        C24501 c24501 = new C24501(c22902, i8);
        try {
            C22491 c22491Mo30001 = charSequence instanceof C15113 ? ((C15113) charSequence).mo30001(i6) : null;
            try {
                char[] cArrM54003 = c24501.m54003();
                int i13 = 0;
                int i14 = 0;
                while (i14 < iMin) {
                    int i15 = (i14 < i12 ? 1 : 0) + i11;
                    if (c22491Mo30001 != null) {
                        c22491Mo30001.m50443(cArrM54003, i13, i15);
                        i3 = i12;
                        i4 = iMin;
                    } else if (charSequence instanceof String) {
                        i3 = i12;
                        i4 = iMin;
                        ((String) charSequence).getChars(i6, i6 + i15, cArrM54003, 0);
                    } else {
                        i3 = i12;
                        i4 = iMin;
                        if (charSequence instanceof CharBuffer) {
                            CharBuffer charBuffer = (CharBuffer) charSequence;
                            if (charBuffer.hasArray()) {
                                System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position() + i6, cArrM54003, 0, i15);
                            } else {
                                for (i5 = 0; i5 < i15; i5++) {
                                    cArrM54003[i5] = charSequence.charAt(i6 + i5);
                                }
                            }
                        } else {
                            while (i5 < i15) {
                                cArrM54003[i5] = charSequence.charAt(i6 + i5);
                            }
                        }
                    }
                    int i16 = i14;
                    char[] cArr = cArrM54003;
                    arrayList.add(new C23161(obj, this.f38937, cArrM54003, 0, i15, this.f38940));
                    i6 += i15;
                    i14 = i16 + 1;
                    i13 = 0;
                    i12 = i3;
                    cArrM54003 = cArr;
                    iMin = i4;
                }
                if (c22491Mo30001 != null) {
                    c22491Mo30001.close();
                }
                c24501.close();
                while (arrayList.size() > 1) {
                    int size = ((arrayList.size() + i7) - 1) / i7;
                    int size2 = arrayList.size() / size;
                    int size3 = arrayList.size() % size;
                    ArrayList arrayList2 = new ArrayList(size);
                    int i17 = 0;
                    int i18 = 0;
                    while (i18 < size) {
                        int i19 = (i18 < size3 ? 1 : 0) + size2 + i17;
                        arrayList2.add(new C25172(obj, (AbstractC21820[]) arrayList.subList(i17, i19).toArray(new AbstractC21820[0])));
                        i18++;
                        i17 = i19;
                    }
                    arrayList = arrayList2;
                }
                return new C13773((AbstractC21820) arrayList.get(0), i8, i7, c22902);
            } catch (Throwable th) {
                if (c22491Mo30001 == null) {
                    throw th;
                }
                try {
                    c22491Mo30001.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                c24501.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[Catch: Error | RuntimeException -> 0x0059, RuntimeException -> 0x005b, LOOP:0: B:16:0x0046->B:17:0x0048, LOOP_END, TryCatch #2 {Error | RuntimeException -> 0x0059, blocks: (B:5:0x000e, B:7:0x0017, B:18:0x0053, B:8:0x001d, B:10:0x0021, B:11:0x0027, B:13:0x002b, B:15:0x0034, B:17:0x0048), top: B:37:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:40:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final C12432 m31397(int i, int i2, CharSequence charSequence) {
        int i3 = i2 - i;
        C22902 c22902 = this.f38940;
        int i4 = this.f38937;
        if (i3 <= i4) {
            C24501 c24501 = new C24501(c22902, i3);
            try {
                char[] cArrM54003 = c24501.m54003();
                if (charSequence instanceof C15113) {
                    ((C15113) charSequence).getChars(i, i2, cArrM54003, 0);
                } else if (charSequence instanceof String) {
                    ((String) charSequence).getChars(i, i2, cArrM54003, 0);
                } else if (charSequence instanceof CharBuffer) {
                    CharBuffer charBuffer = (CharBuffer) charSequence;
                    if (charBuffer.hasArray()) {
                        System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position() + i, cArrM54003, 0, i3);
                    } else {
                        for (int i5 = 0; i5 < i3; i5++) {
                            cArrM54003[i5] = charSequence.charAt(i + i5);
                        }
                    }
                } else {
                    while (i5 < i3) {
                        cArrM54003[i5] = charSequence.charAt(i + i5);
                    }
                }
                return new C12432(cArrM54003, null, i3, c24501);
            } catch (Error | RuntimeException e) {
                c24501.close();
                throw e;
            }
        }
        if (charSequence instanceof C15113) {
            C15113 c15113 = (C15113) charSequence;
            C13773 c13773M34522 = c15113.m34522();
            if (c13773M34522.f38937 == i4 && c13773M34522.f38938 == this.f38938 && c13773M34522.f38940 == c22902) {
                return new C12432(null, c13773M34522.m31398(c15113.mo30000() + i, c15113.mo30000() + i2).f38939, i3, null);
            }
        }
        return new C12432(null, m31399(i, i2, charSequence, new Object()).f38939, i3, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13773 m31400(int i, int i2, C12432 c12432, Object obj) {
        int i3;
        if (i == i2 && c12432.f34760 == 0) {
            return this;
        }
        AbstractC21820 c23161 = c12432.f34758;
        char[] cArr = c12432.f34759;
        AbstractC21820 abstractC21820 = this.f38939;
        C22902 c22902 = this.f38940;
        int i4 = this.f38938;
        int i5 = this.f38937;
        if (cArr != null) {
            if (abstractC21820 != null) {
                i3 = i5;
                AbstractC21820 abstractC21820M31390 = m31390(abstractC21820, i, i2, cArr, c12432.f34760, obj, true);
                if (abstractC21820M31390 != null) {
                    return new C13773(abstractC21820M31390, i3, i4, c22902);
                }
            } else {
                i3 = i5;
            }
            int i6 = c12432.f34760;
            if (i6 == 0) {
                c23161 = null;
            } else {
                c23161 = new C23161(obj, this.f38937, c12432.f34759, 0, i6, this.f38940);
            }
        } else {
            i3 = i5;
        }
        C8408 c8408M31387 = m31387(abstractC21820, i, obj);
        return new C13773(m31391(m31391(c8408M31387.f22548, c23161, obj), m31387(c8408M31387.f22549, i2 - i, obj).f22549, obj), i3, i4, c22902);
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC21820 m31390(AbstractC21820 abstractC21820, int i, int i2, char[] cArr, int i3, Object obj, boolean z) {
        AbstractC21820 abstractC21821;
        int i4;
        AbstractC21820 abstractC21820M31390;
        if (abstractC21820 instanceof C23161) {
            int i5 = (abstractC21820.f68652 - (i2 - i)) + i3;
            int i6 = this.f38937;
            if (i5 > i6) {
                return null;
            }
            if ((z || i5 >= i6 / 2) && i5 != 0) {
                return ((C23161) abstractC21820).m51616(obj, i, i2, cArr, i3);
            }
            return null;
        }
        C25172 c25172 = (C25172) abstractC21820;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            AbstractC21820[] abstractC21820Arr = c25172.f80530;
            if (i8 < abstractC21820Arr.length) {
                abstractC21821 = abstractC21820Arr[i8];
                i4 = abstractC21821.f68652 + i7;
                if (i < i4 || i8 == abstractC21820Arr.length - 1) {
                    break;
                }
                i8++;
                i7 = i4;
            } else {
                throw new AssertionError();
            }
        }
        if (i2 > i4 || (abstractC21820M31390 = m31390(abstractC21821, i - i7, i2 - i7, cArr, i3, obj, false)) == null) {
            return null;
        }
        if (c25172.f68655 != obj) {
            c25172 = new C25172(obj, (AbstractC21820[]) c25172.f80530.clone());
        }
        c25172.f80530[i8] = abstractC21820M31390;
        c25172.m55238();
        return c25172;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13773 m31398(int i, int i2) {
        m31392(i, i2, m31402());
        if (i == 0 && i2 == m31402()) {
            return this;
        }
        Object obj = new Object();
        return new C13773(m31387(m31387(this.f38939, i, obj).f22549, i2 - i, obj).f22548, this.f38937, this.f38938, this.f38940);
    }

    /* JADX INFO: renamed from: ֫ */
    private C8408 m31387(AbstractC21820 abstractC21820, int i, Object obj) {
        if (abstractC21820 == null) {
            return new C8408(null, null);
        }
        if (i == 0) {
            return new C8408(null, abstractC21820);
        }
        if (i == abstractC21820.f68652) {
            return new C8408(abstractC21820, null);
        }
        if (abstractC21820 instanceof C23161) {
            C24501 c24501 = new C24501(this.f38940, abstractC21820.f68652);
            try {
                char[] cArrM54003 = c24501.m54003();
                ((C23161) abstractC21820).m51617(cArrM54003, abstractC21820.f68652, 0);
                C8408 c8408 = new C8408(new C23161(obj, this.f38937, cArrM54003, 0, i, this.f38940), new C23161(obj, this.f38937, cArrM54003, i, abstractC21820.f68652 - i, this.f38940));
                c24501.close();
                return c8408;
            } catch (Throwable th) {
                try {
                    c24501.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        AbstractC21820[] abstractC21820Arr = ((C25172) abstractC21820).f80530;
        int i2 = 0;
        while (true) {
            AbstractC21820 abstractC21821 = abstractC21820Arr[i2];
            int i3 = abstractC21821.f68652;
            if (i <= i3) {
                C8408 c8408M31387 = m31387(abstractC21821, i, obj);
                return new C8408(m31391(m31389(obj, (AbstractC21820[]) Arrays.copyOfRange(abstractC21820Arr, 0, i2)), c8408M31387.f22548, obj), m31391(c8408M31387.f22549, m31389(obj, (AbstractC21820[]) Arrays.copyOfRange(abstractC21820Arr, i2 + 1, abstractC21820Arr.length)), obj));
            }
            i2++;
            i -= i3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC21820 m31389(Object obj, AbstractC21820[] abstractC21820Arr) {
        if (abstractC21820Arr.length == 0) {
            return null;
        }
        return abstractC21820Arr.length == 1 ? abstractC21820Arr[0] : new C25172(obj, abstractC21820Arr);
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC21820 m31391(AbstractC21820 abstractC21820, AbstractC21820 abstractC21821, Object obj) {
        if (abstractC21820 == null) {
            return abstractC21821;
        }
        return abstractC21821 == null ? abstractC21820 : m31389(obj, m31394(abstractC21820, abstractC21821, obj));
    }

    /* JADX INFO: renamed from: ۧ */
    private AbstractC21820[] m31394(AbstractC21820 abstractC21820, AbstractC21820 abstractC21821, Object obj) {
        AbstractC21820[] abstractC21820Arr;
        int i;
        int i2 = abstractC21820.f68651;
        if (i2 == 0 && abstractC21821.f68651 == 0) {
            int i3 = abstractC21820.f68652;
            int i4 = abstractC21821.f68652;
            int i5 = i3 + i4;
            int i6 = this.f38937;
            if (i5 > i6 && i3 >= (i = i6 / 2) && i4 >= i) {
                return new AbstractC21820[]{abstractC21820, abstractC21821};
            }
            C24501 c24501 = new C24501(this.f38940, i5);
            try {
                char[] cArrM54003 = c24501.m54003();
                ((C23161) abstractC21820).m51617(cArrM54003, abstractC21820.f68652, 0);
                ((C23161) abstractC21821).m51617(cArrM54003, abstractC21821.f68652, abstractC21820.f68652);
                int i7 = this.f38937;
                if (i5 > i7) {
                    int i8 = i5 / 2;
                    AbstractC21820[] abstractC21820Arr2 = {new C23161(obj, i7, cArrM54003, 0, i8, this.f38940), new C23161(obj, this.f38937, cArrM54003, i8, i5 - i8, this.f38940)};
                    c24501.close();
                    return abstractC21820Arr2;
                }
                AbstractC21820[] abstractC21820Arr3 = {new C23161(obj, i7, cArrM54003, 0, i5, this.f38940)};
                c24501.close();
                return abstractC21820Arr3;
            } catch (Throwable th) {
                try {
                    c24501.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        int i9 = abstractC21821.f68651;
        if (i2 == i9) {
            AbstractC21820[] abstractC21820Arr4 = ((C25172) abstractC21820).f80530;
            AbstractC21820[] abstractC21820Arr5 = ((C25172) abstractC21821).f80530;
            abstractC21820Arr = new AbstractC21820[abstractC21820Arr4.length + abstractC21820Arr5.length];
            System.arraycopy(abstractC21820Arr4, 0, abstractC21820Arr, 0, abstractC21820Arr4.length);
            System.arraycopy(abstractC21820Arr5, 0, abstractC21820Arr, abstractC21820Arr4.length, abstractC21820Arr5.length);
        } else if (i2 > i9) {
            AbstractC21820[] abstractC21820Arr6 = ((C25172) abstractC21820).f80530;
            AbstractC21820[] abstractC21820ArrM31394 = m31394(abstractC21820Arr6[abstractC21820Arr6.length - 1], abstractC21821, obj);
            abstractC21820Arr = (AbstractC21820[]) Arrays.copyOf(abstractC21820Arr6, (abstractC21820Arr6.length - 1) + abstractC21820ArrM31394.length);
            System.arraycopy(abstractC21820ArrM31394, 0, abstractC21820Arr, abstractC21820Arr6.length - 1, abstractC21820ArrM31394.length);
        } else {
            AbstractC21820[] abstractC21820Arr7 = ((C25172) abstractC21821).f80530;
            AbstractC21820[] abstractC21820ArrM31395 = m31394(abstractC21820, abstractC21820Arr7[0], obj);
            abstractC21820Arr = new AbstractC21820[(abstractC21820ArrM31395.length + abstractC21820Arr7.length) - 1];
            System.arraycopy(abstractC21820ArrM31395, 0, abstractC21820Arr, 0, abstractC21820ArrM31395.length);
            System.arraycopy(abstractC21820Arr7, 1, abstractC21820Arr, abstractC21820ArrM31395.length, abstractC21820Arr7.length - 1);
        }
        if (abstractC21820Arr.length <= this.f38938) {
            return new AbstractC21820[]{new C25172(obj, abstractC21820Arr)};
        }
        int length = abstractC21820Arr.length / 2;
        return new AbstractC21820[]{new C25172(obj, (AbstractC21820[]) Arrays.copyOfRange(abstractC21820Arr, 0, length)), new C25172(obj, (AbstractC21820[]) Arrays.copyOfRange(abstractC21820Arr, length, abstractC21820Arr.length))};
    }

    /* JADX INFO: renamed from: ֫ */
    public final char m31395(int i) {
        AbstractC21820 abstractC21820 = this.f38939;
        while (abstractC21820 instanceof C25172) {
            for (AbstractC21820 abstractC21821 : ((C25172) abstractC21820).f80530) {
                int i2 = abstractC21821.f68652;
                if (i < i2) {
                    abstractC21820 = abstractC21821;
                    break;
                }
                i -= i2;
            }
        }
        return ((C23161) abstractC21820).m51614(i);
    }
}
