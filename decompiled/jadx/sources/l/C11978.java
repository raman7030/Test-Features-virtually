package l;

import android.text.NoCopySpan;
import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spanned;
import android.text.TextWatcher;
import com.google.android.material.motion.MotionUtils;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۨ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6UZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11978 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10567 f35854;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Object[] f35855;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f35856;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f35857;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int[] f35858;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long[] f35859;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f35860;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f35861;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long[] f35862;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f35863;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f35864;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public IdentityHashMap f35865;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f35866;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long[] f35867;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Object[] f35852 = new Object[0];

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static Object[] f35853 = new Object[73];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int[][] f35851 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m29257(long j, long j2) {
        return C15942.m37718(C12803.m31106(MotionUtils.EASING_TYPE_FORMAT_START, " ... ", j), j2, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m29267(int i) {
        return i - (((i + 1) & (~i)) >> 1);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m29274(int i) {
        return i + (((i + 1) & (~i)) >> 1);
    }

    public C11978(C10567 c10567, CharSequence charSequence, int i) {
        this.f35854 = c10567;
        long length = c10567.length();
        long jMax = Math.max(8L, 2 * length);
        this.f35856 = jMax;
        this.f35863 = length;
        this.f35860 = jMax - length;
        this.f35861 = 0;
        this.f35866 = 0;
        this.f35855 = new Object[0];
        this.f35862 = new long[0];
        this.f35867 = new long[0];
        this.f35857 = new int[0];
        this.f35859 = new long[0];
        this.f35858 = new int[0];
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            for (Object obj : spanned.getSpans(0, i, Object.class)) {
                if (!(obj instanceof NoCopySpan)) {
                    int spanStart = spanned.getSpanStart(obj);
                    int spanEnd = spanned.getSpanEnd(obj);
                    int spanFlags = spanned.getSpanFlags(obj);
                    spanStart = spanStart < 0 ? 0 : spanStart;
                    spanStart = spanStart > i ? i : spanStart;
                    spanEnd = spanEnd < 0 ? 0 : spanEnd;
                    m29262(false, obj, spanStart, spanEnd > i ? i : spanEnd, spanFlags, false);
                }
            }
            m29270();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29277() {
        int i = this.f35861;
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            Object[] objArr = this.f35855;
            Object obj = objArr[i];
            long j = this.f35862[i];
            long j2 = this.f35867[i];
            long j3 = this.f35863;
            if (j > j3) {
                j -= this.f35860;
            }
            if (j2 > j3) {
                j2 -= this.f35860;
            }
            this.f35861 = i;
            objArr[i] = null;
            IdentityHashMap identityHashMap = this.f35865;
            if (identityHashMap != null) {
                identityHashMap.remove(obj);
            }
            m29271(obj, j, j2);
        }
        IdentityHashMap identityHashMap2 = this.f35865;
        if (identityHashMap2 != null) {
            identityHashMap2.clear();
        }
        this.f35866 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m29264(int i, int i2, int i3, boolean z) {
        int i4 = i3 & 1;
        if (i4 == 0 || m29269(this.f35859[i3]) < i || !m29264(i, i2, m29267(i3), z)) {
            if (i3 >= this.f35861) {
                return false;
            }
            if ((this.f35857[i3] & 33) == 33) {
                long j = this.f35862[i3];
                long j2 = i;
                if (j >= j2) {
                    long j3 = this.f35863;
                    long j4 = this.f35860 + j3;
                    if (j < j4) {
                        long j5 = this.f35867[i3];
                        if (j5 >= j2 && j5 < j4 && (z || j > j2 || j5 < j3)) {
                            this.f35865.remove(this.f35855[i3]);
                            m29275(i3);
                            return true;
                        }
                    }
                }
            }
            if (m29269(this.f35862[i3]) > i2 || i4 == 0 || !m29264(i, i2, m29274(i3), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0232  */
    /* JADX WARN: Code duplicated, block: B:124:0x0239  */
    /* JADX WARN: Code duplicated, block: B:125:0x023c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0255  */
    /* JADX WARN: Code duplicated, block: B:195:0x0393  */
    /* JADX WARN: Code duplicated, block: B:268:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:283:0x050c  */
    /* JADX WARN: Code duplicated, block: B:309:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x025e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0110  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:79:0x018b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0194  */
    /* JADX WARN: Code duplicated, block: B:82:0x0197  */
    /* JADX WARN: Code duplicated, block: B:85:0x019c  */
    /* JADX WARN: Code duplicated, block: B:86:0x019f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a6  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29278(int i, int i2, CharSequence charSequence, int i3, int i4, boolean z) {
        C10567 c10567;
        int selectionStart;
        int selectionEnd;
        int i5;
        long j;
        int i6;
        int i7;
        int i8;
        int i9;
        long j2;
        boolean z2;
        long j3;
        boolean z3;
        long j4;
        int i10;
        boolean z4;
        int i11;
        long j5;
        int i12;
        long j6;
        long j7;
        long j8;
        int i13;
        int i14;
        long j9;
        long j10;
        int i15;
        int i16;
        long j11;
        long j12;
        long j13 = i;
        long j14 = i2;
        long j15 = j14;
        m29261("replace", j13, j14);
        int i17 = i2 - i;
        int i18 = i4 - i3;
        Class<Object> cls = Object.class;
        if (i17 == 0 && i18 == 0) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                Object[] spans = spanned.getSpans(i3, i3, cls);
                int length = spans.length;
                int i19 = 0;
                while (i19 < length) {
                    int i20 = length;
                    Spanned spanned2 = spanned;
                    if (spanned.getSpanFlags(spans[i19]) == 33) {
                        i19++;
                        length = i20;
                        spanned = spanned2;
                    }
                }
                return;
            }
            return;
        }
        TextWatcher[] textWatcherArr = (TextWatcher[]) m29280(i, i + i17, TextWatcher.class);
        int length2 = textWatcherArr.length;
        int i21 = 0;
        while (true) {
            c10567 = this.f35854;
            if (i21 >= length2) {
                break;
            }
            textWatcherArr[i21].beforeTextChanged(c10567, i, i17, i18);
            i21++;
            length2 = length2;
        }
        boolean z5 = (i17 == 0 || i18 == 0) ? false : true;
        if (z5 || z) {
            selectionStart = Selection.getSelectionStart(c10567);
            selectionEnd = Selection.getSelectionEnd(c10567);
        } else {
            selectionEnd = 0;
            selectionStart = 0;
        }
        int i22 = i18 - i17;
        int i23 = selectionEnd;
        int i24 = this.f35861 - 1;
        boolean z6 = false;
        while (i24 >= 0) {
            int i25 = i22;
            long j16 = this.f35862[i24];
            Class<Object> cls2 = cls;
            TextWatcher[] textWatcherArr2 = textWatcherArr;
            long j17 = this.f35863;
            if (j16 > j17) {
                j16 -= this.f35860;
            }
            long j18 = this.f35867[i24];
            if (j18 > j17) {
                j18 -= this.f35860;
            }
            if ((this.f35857[i24] & 51) == 51) {
                int length3 = c10567.length();
                if (j16 > j13) {
                    j11 = j15;
                    if (j16 <= j11) {
                        j9 = j11;
                        while (j9 < length3 && (j9 <= j11 || m29252(j9 - 1) != '\n')) {
                            j9++;
                        }
                    }
                    if (j18 > j13 || j18 > j11) {
                        j12 = j13;
                        j10 = j18;
                    } else {
                        j10 = j11;
                        j12 = j13;
                        while (j10 < length3 && (j10 <= j11 || m29252(j10 - 1) != '\n')) {
                            j10++;
                        }
                    }
                    if (j9 == j16 || j10 != j18) {
                        i14 = 32768;
                        selectionStart = selectionStart;
                        i25 = i25;
                        c10567 = c10567;
                        j7 = j11;
                        textWatcherArr2 = textWatcherArr2;
                        cls2 = cls2;
                        i23 = i23;
                        i17 = i17;
                        i18 = i18;
                        j8 = j12;
                        m29262(false, this.f35855[i24], j9, j10, this.f35857[i24], true);
                        z6 = true;
                    } else {
                        i13 = 32768;
                        j7 = j11;
                        j18 = j10;
                        j16 = j9;
                        j8 = j12;
                    }
                    if (j9 == j8) {
                        i16 = 4096;
                        i15 = i25;
                    } else {
                        i15 = i25;
                        if (j9 == i2 + i15) {
                            i16 = 8192;
                        } else {
                            i16 = 0;
                        }
                    }
                    if (j10 == j8) {
                        i16 |= 16384;
                    } else if (j10 == i2 + i15) {
                        i16 |= i14;
                    }
                    int[] iArr = this.f35857;
                    iArr[i24] = i16 | iArr[i24];
                    i24--;
                    i22 = i15;
                    c10567 = c10567;
                    j13 = j8;
                    selectionStart = selectionStart;
                    j15 = j7;
                    textWatcherArr = textWatcherArr2;
                    i17 = i17;
                    i18 = i18;
                    cls = cls2;
                    i23 = i23;
                } else {
                    j11 = j15;
                }
                j9 = j16;
                if (j18 > j13) {
                    j12 = j13;
                    j10 = j18;
                } else {
                    j12 = j13;
                    j10 = j18;
                }
                if (j9 == j16) {
                }
                i14 = 32768;
                selectionStart = selectionStart;
                i25 = i25;
                c10567 = c10567;
                j7 = j11;
                textWatcherArr2 = textWatcherArr2;
                cls2 = cls2;
                i23 = i23;
                i17 = i17;
                i18 = i18;
                j8 = j12;
                m29262(false, this.f35855[i24], j9, j10, this.f35857[i24], true);
                z6 = true;
                if (j9 == j8) {
                    i16 = 4096;
                    i15 = i25;
                } else {
                    i15 = i25;
                    if (j9 == i2 + i15) {
                        i16 = 8192;
                    } else {
                        i16 = 0;
                    }
                }
                if (j10 == j8) {
                    i16 |= 16384;
                } else if (j10 == i2 + i15) {
                    i16 |= i14;
                }
                int[] iArr2 = this.f35857;
                iArr2[i24] = i16 | iArr2[i24];
                i24--;
                i22 = i15;
                c10567 = c10567;
                j13 = j8;
                selectionStart = selectionStart;
                j15 = j7;
                textWatcherArr = textWatcherArr2;
                i17 = i17;
                i18 = i18;
                cls = cls2;
                i23 = i23;
            } else {
                j7 = j15;
                j8 = j13;
                i13 = 32768;
            }
            i14 = i13;
            j10 = j18;
            j9 = j16;
            if (j9 == j8) {
                i16 = 4096;
                i15 = i25;
            } else {
                i15 = i25;
                if (j9 == i2 + i15) {
                    i16 = 8192;
                } else {
                    i16 = 0;
                }
            }
            if (j10 == j8) {
                i16 |= 16384;
            } else if (j10 == i2 + i15) {
                i16 |= i14;
            }
            int[] iArr3 = this.f35857;
            iArr3[i24] = i16 | iArr3[i24];
            i24--;
            i22 = i15;
            c10567 = c10567;
            j13 = j8;
            selectionStart = selectionStart;
            j15 = j7;
            textWatcherArr = textWatcherArr2;
            i17 = i17;
            i18 = i18;
            cls = cls2;
            i23 = i23;
        }
        Class<Object> cls3 = cls;
        TextWatcher[] textWatcherArr3 = textWatcherArr;
        int i26 = i17;
        int i27 = i18;
        long j19 = j13;
        long j20 = j15;
        int i28 = selectionStart;
        int i29 = i23;
        int i30 = i22;
        C10567 c10568 = c10567;
        if (z6) {
            m29270();
        }
        if (j20 != this.f35863) {
            boolean z7 = i2 == c10568.length();
            if (this.f35861 != 0) {
                boolean z8 = false;
                for (int i31 = 0; i31 < this.f35861; i31++) {
                    long[] jArr = this.f35862;
                    long j21 = jArr[i31];
                    long[] jArr2 = this.f35867;
                    long j22 = jArr2[i31];
                    long j23 = this.f35863;
                    if (j21 > j23) {
                        j21 -= this.f35860;
                    }
                    if (j21 > j20) {
                        j5 = this.f35860;
                    } else {
                        if (j21 == j20 && ((i11 = (this.f35857[i31] & 240) >> 4) == 2 || (z7 && i11 == 3))) {
                            j5 = this.f35860;
                        }
                        if (j22 > j23) {
                            j22 -= this.f35860;
                        }
                        if (j22 > j20) {
                            j6 = this.f35860;
                        } else {
                            if (j22 == j20 && ((i12 = this.f35857[i31] & 15) == 2 || (z7 && i12 == 3))) {
                                j6 = this.f35860;
                            }
                            jArr[i31] = j21;
                            jArr2[i31] = j22;
                            if (i31 <= 0 && j21 < jArr[i31 - 1]) {
                                z8 = true;
                            }
                        }
                        j22 += j6;
                        jArr[i31] = j21;
                        jArr2[i31] = j22;
                        if (i31 <= 0) {
                        }
                    }
                    j21 += j5;
                    if (j22 > j23) {
                        j22 -= this.f35860;
                    }
                    if (j22 > j20) {
                        j6 = this.f35860;
                    } else {
                        if (j22 == j20) {
                            j6 = this.f35860;
                        }
                        jArr[i31] = j21;
                        jArr2[i31] = j22;
                        if (i31 <= 0) {
                        }
                    }
                    j22 += j6;
                    jArr[i31] = j21;
                    jArr2[i31] = j22;
                    if (i31 <= 0) {
                    }
                }
                if (z8) {
                    m29270();
                } else {
                    m29255(m29272());
                }
            }
            this.f35863 = j20;
        }
        long j24 = i30;
        long j25 = this.f35860;
        if (j24 >= j25) {
            long j26 = this.f35856;
            long j27 = (j26 + j24) - j25;
            if (j27 + 1 > j26) {
                long jMax = Math.max(8L, j27 * 2);
                long j28 = jMax - j26;
                this.f35856 = jMax;
                long j29 = this.f35860 + j28;
                this.f35860 = j29;
                if (j29 < 1) {
                    new Exception("mGapLength < 1");
                }
                if (this.f35861 != 0) {
                    for (int i32 = 0; i32 < this.f35861; i32++) {
                        long[] jArr3 = this.f35862;
                        long j30 = jArr3[i32];
                        long j31 = this.f35863;
                        if (j30 > j31) {
                            jArr3[i32] = j30 + j28;
                        }
                        long[] jArr4 = this.f35867;
                        long j32 = jArr4[i32];
                        if (j32 > j31) {
                            jArr4[i32] = j32 + j28;
                        }
                    }
                    m29255(m29272());
                }
            }
        }
        boolean z9 = i27 == 0;
        if (i26 <= 0) {
            i5 = i2;
            break;
        }
        do {
            if (this.f35861 <= 0) {
                i5 = i2;
                break;
            }
            i5 = i2;
        } while (m29264(i, i5, m29272(), z9));
        c10568.m26549(i, i2, charSequence, i3, i4);
        this.f35863 += j24;
        long j33 = this.f35860 - j24;
        this.f35860 = j33;
        if (j33 < 1) {
            new Exception("mGapLength < 1");
        }
        if (i26 > 0) {
            boolean z10 = this.f35863 + this.f35860 == this.f35856;
            int i33 = 0;
            while (i33 < this.f35861) {
                int i34 = (this.f35857[i33] & 240) >> 4;
                long[] jArr5 = this.f35862;
                long j34 = jArr5[i33];
                int i35 = i33;
                boolean z11 = z10;
                long j35 = j24;
                int i36 = i5;
                boolean z12 = z9;
                jArr5[i35] = m29256(i, i30, i34, j34, z11, z12);
                int i37 = this.f35857[i35] & 15;
                long[] jArr6 = this.f35867;
                jArr6[i35] = m29256(i, i30, i37, jArr6[i35], z11, z12);
                i33 = i35 + 1;
                i5 = i36;
                j24 = j35;
            }
            j = j24;
            i6 = i5;
            m29270();
        } else {
            j = j24;
            i6 = i5;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned3 = (Spanned) charSequence;
            int i38 = i4;
            Object[] spans2 = spanned3.getSpans(i3, i38, cls3);
            int i39 = 0;
            for (int length4 = spans2.length; i39 < length4; length4 = length4) {
                Object obj = spans2[i39];
                if (!(obj instanceof TextWatcher)) {
                    int spanStart = spanned3.getSpanStart(obj);
                    int spanEnd = spanned3.getSpanEnd(obj);
                    if (spanStart < i3) {
                        spanStart = i3;
                    }
                    if (spanEnd > i38) {
                        spanEnd = i38;
                    }
                    if (m29283(obj) < 0) {
                        m29262(false, obj, (spanStart - i3) + i, (spanEnd - i3) + i, spanned3.getSpanFlags(obj) | 2048, false);
                    }
                }
                i39++;
                i38 = i4;
                i30 = i30;
                spans2 = spans2;
            }
            i7 = i30;
            m29270();
        } else {
            i7 = i30;
        }
        if (z5) {
            if (i28 <= i || i28 >= i6) {
                i10 = i28;
                z4 = false;
            } else {
                long j36 = (((long) (i28 - i)) * ((long) i27)) / ((long) i26);
                int i40 = (int) j36;
                if (j36 != i40) {
                    throw new ArithmeticException();
                }
                i10 = i + i40;
                long j37 = i10;
                m29262(false, Selection.SELECTION_START, j37, j37, 34, true);
                z4 = true;
            }
            if (i29 <= i || i29 >= i6) {
                i8 = i29;
            } else {
                long j38 = (((long) (i29 - i)) * ((long) i27)) / ((long) i26);
                int i41 = (int) j38;
                if (j38 != i41) {
                    throw new ArithmeticException();
                }
                i8 = i + i41;
                long j39 = i8;
                m29262(false, Selection.SELECTION_END, j39, j39, 34, true);
                z4 = true;
            }
            if (z4) {
                m29270();
            }
            i9 = i10;
        } else {
            i8 = i29;
            i9 = i28;
        }
        if (z) {
            if (i9 >= 0) {
                long j40 = i9;
                m29262(false, Selection.SELECTION_START, j40, j40, 34, true);
            }
            if (i8 >= 0) {
                long j41 = i8;
                m29262(false, Selection.SELECTION_END, j41, j41, 34, true);
            }
            m29270();
        }
        c10568.m26555();
        for (TextWatcher textWatcher : textWatcherArr3) {
            textWatcher.onTextChanged(c10568, i, i26, i27);
        }
        for (TextWatcher textWatcher2 : textWatcherArr3) {
            textWatcher2.afterTextChanged(c10568);
        }
        int i42 = 32768;
        for (int i43 = 0; i43 < this.f35861; i43++) {
            int i44 = this.f35857[i43];
            if ((i44 & 2048) == 0) {
                long j42 = this.f35862[i43];
                long j43 = this.f35867[i43];
                long j44 = this.f35863;
                if (j42 > j44) {
                    j42 -= this.f35860;
                }
                long j45 = j42;
                if (j43 > j44) {
                    j43 -= this.f35860;
                }
                long j46 = j43;
                long j47 = i6 + i7;
                if (j45 > j47) {
                    if (i7 != 0) {
                        j2 = j45 - j;
                        z2 = true;
                    } else {
                        z2 = false;
                        j2 = j45;
                    }
                } else if (j45 < j19 || ((j45 == j19 && (i44 & 4096) == 4096) || (j45 == j47 && (i44 & 8192) == 8192))) {
                    z2 = false;
                    j2 = j45;
                } else {
                    j2 = j45;
                    z2 = true;
                }
                if (j46 > j47) {
                    if (i7 != 0) {
                        j3 = j46 - j;
                        j4 = j3;
                        z3 = true;
                    } else {
                        z3 = z2;
                        j4 = j46;
                    }
                } else if (j46 < j19 || ((j46 == j19 && (i44 & 16384) == 16384) || (j46 == j47 && (i44 & i42) == 32768))) {
                    z3 = z2;
                    j4 = j46;
                } else {
                    j3 = j46;
                    j4 = j3;
                    z3 = true;
                }
                if (z3) {
                    i42 = 32768;
                    m29260(this.f35855[i43], j2, j4, j45, j46);
                } else {
                    i42 = 32768;
                }
                int[] iArr4 = this.f35857;
                iArr4[i43] = iArr4[i43] & (-61441);
            }
        }
        for (int i45 = 0; i45 < this.f35861; i45++) {
            int[] iArr5 = this.f35857;
            int i46 = iArr5[i45];
            if ((i46 & 2048) != 0) {
                iArr5[i45] = i46 & (-2049);
                long j48 = this.f35862[i45];
                long j49 = this.f35867[i45];
                long j50 = this.f35863;
                if (j48 > j50) {
                    j48 -= this.f35860;
                }
                if (j49 > j50) {
                    j49 -= this.f35860;
                }
                m29259(this.f35855[i45], j48, j49);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m29256(int i, int i2, int i3, long j, boolean z, boolean z2) {
        long j2 = i;
        if (j >= j2) {
            long j3 = this.f35863;
            long j4 = this.f35860;
            if (j < j3 + j4) {
                if (i3 == 2) {
                    if (z2 || j > j2) {
                        return j3 + j4;
                    }
                } else {
                    if (i3 != 3) {
                        return (z2 || j < j3 - ((long) i2)) ? j2 : j3;
                    }
                    if (z) {
                        return j3 + j4;
                    }
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m29275(int i) {
        Object[] objArr = this.f35855;
        Object obj = objArr[i];
        long j = this.f35862[i];
        long j2 = this.f35867[i];
        long j3 = this.f35863;
        if (j > j3) {
            j -= this.f35860;
        }
        if (j2 > j3) {
            j2 -= this.f35860;
        }
        int i2 = i + 1;
        int i3 = this.f35861 - i2;
        System.arraycopy(objArr, i2, objArr, i, i3);
        long[] jArr = this.f35862;
        System.arraycopy(jArr, i2, jArr, i, i3);
        long[] jArr2 = this.f35867;
        System.arraycopy(jArr2, i2, jArr2, i, i3);
        int[] iArr = this.f35857;
        System.arraycopy(iArr, i2, iArr, i, i3);
        int[] iArr2 = this.f35858;
        System.arraycopy(iArr2, i2, iArr2, i, i3);
        this.f35861--;
        this.f35864 = Math.min(i, this.f35864);
        this.f35855[this.f35861] = null;
        m29270();
        m29271(obj, j, j2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29279(Object obj, int i, int i2, int i3) {
        m29262(true, obj, i, i2, i3, true);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x0116  */
    /* JADX WARN: Code duplicated, block: B:65:0x0129  */
    /* JADX WARN: Code duplicated, block: B:68:0x013c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0151  */
    /* JADX WARN: Code duplicated, block: B:74:0x017d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0183  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29262(boolean z, Object obj, long j, long j2, int i, boolean z2) {
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        IdentityHashMap identityHashMap;
        Object[] objArrCopyOf;
        int i2;
        long[] jArrCopyOf;
        int i3;
        long[] jArrCopyOf2;
        int i4;
        int[] iArrCopyOf;
        int i5;
        int[] iArrCopyOf2;
        int i6;
        int iM29272;
        Integer num;
        m29261("setSpan", j, j2);
        int i7 = (i & 240) >> 4;
        if (m29265(i7, j)) {
            if (z2) {
                StringBuilder sbM31106 = C12803.m31106("PARAGRAPH span must start at paragraph boundary (", " follows ", j);
                sbM31106.append(m29252(j - 1));
                sbM31106.append(MotionUtils.EASING_TYPE_FORMAT_END);
                throw new RuntimeException(sbM31106.toString());
            }
            return;
        }
        int i8 = i & 15;
        if (m29265(i8, j2)) {
            if (z2) {
                StringBuilder sbM31107 = C12803.m31106("PARAGRAPH span must end at paragraph boundary (", " follows ", j2);
                sbM31107.append(m29252(j2 - 1));
                sbM31107.append(MotionUtils.EASING_TYPE_FORMAT_END);
                throw new RuntimeException(sbM31107.toString());
            }
            return;
        }
        if (i7 == 2 && i8 == 1 && j == j2) {
            return;
        }
        long j8 = this.f35863;
        C10567 c10567 = this.f35854;
        if (j <= j8) {
            if (j == j8 && (i7 == 2 || (i7 == 3 && j == c10567.length()))) {
                j4 = this.f35860;
            } else {
                j3 = j;
            }
            j5 = this.f35863;
            if (j2 > j5) {
                if (j2 == j5 || !(i8 == 2 || (i8 == 3 && j2 == c10567.length()))) {
                    j6 = j2;
                } else {
                    j7 = this.f35860;
                }
                identityHashMap = this.f35865;
                if (identityHashMap == null && (num = (Integer) identityHashMap.get(obj)) != null) {
                    int iIntValue = num.intValue();
                    long[] jArr = this.f35862;
                    long j9 = jArr[iIntValue];
                    long[] jArr2 = this.f35867;
                    long j10 = jArr2[iIntValue];
                    long j11 = this.f35863;
                    if (j9 > j11) {
                        j9 -= this.f35860;
                    }
                    if (j10 > j11) {
                        j10 -= this.f35860;
                    }
                    jArr[iIntValue] = j3;
                    jArr2[iIntValue] = j6;
                    this.f35857[iIntValue] = i;
                    if (z) {
                        m29270();
                        m29260(obj, j9, j10, j, j2);
                        return;
                    }
                    return;
                }
                objArrCopyOf = this.f35855;
                i2 = this.f35861;
                if (i2 == objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, C6333.m17611(i2));
                }
                objArrCopyOf[i2] = obj;
                this.f35855 = objArrCopyOf;
                jArrCopyOf = this.f35862;
                i3 = this.f35861;
                if (i3 == jArrCopyOf.length) {
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, C6333.m17611(i3));
                }
                jArrCopyOf[i3] = j3;
                this.f35862 = jArrCopyOf;
                jArrCopyOf2 = this.f35867;
                i4 = this.f35861;
                if (i4 == jArrCopyOf2.length) {
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, C6333.m17611(i4));
                }
                jArrCopyOf2[i4] = j6;
                this.f35867 = jArrCopyOf2;
                iArrCopyOf = this.f35857;
                i5 = this.f35861;
                if (i5 == iArrCopyOf.length) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, C6333.m17611(i5));
                }
                iArrCopyOf[i5] = i;
                this.f35857 = iArrCopyOf;
                iArrCopyOf2 = this.f35858;
                i6 = this.f35861;
                int i9 = this.f35866;
                if (i6 == iArrCopyOf2.length) {
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, C6333.m17611(i6));
                }
                iArrCopyOf2[i6] = i9;
                this.f35858 = iArrCopyOf2;
                this.f35864 = Math.min(this.f35861, this.f35864);
                this.f35861++;
                this.f35866++;
                iM29272 = (m29272() * 2) + 1;
                if (this.f35859.length < iM29272) {
                    this.f35859 = new long[iM29272];
                }
                if (z) {
                    m29270();
                    m29259(obj, j, j2);
                }
            }
            j7 = this.f35860;
            j6 = j7 + j2;
            identityHashMap = this.f35865;
            if (identityHashMap == null) {
            }
            objArrCopyOf = this.f35855;
            i2 = this.f35861;
            if (i2 == objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, C6333.m17611(i2));
            }
            objArrCopyOf[i2] = obj;
            this.f35855 = objArrCopyOf;
            jArrCopyOf = this.f35862;
            i3 = this.f35861;
            if (i3 == jArrCopyOf.length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, C6333.m17611(i3));
            }
            jArrCopyOf[i3] = j3;
            this.f35862 = jArrCopyOf;
            jArrCopyOf2 = this.f35867;
            i4 = this.f35861;
            if (i4 == jArrCopyOf2.length) {
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, C6333.m17611(i4));
            }
            jArrCopyOf2[i4] = j6;
            this.f35867 = jArrCopyOf2;
            iArrCopyOf = this.f35857;
            i5 = this.f35861;
            if (i5 == iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, C6333.m17611(i5));
            }
            iArrCopyOf[i5] = i;
            this.f35857 = iArrCopyOf;
            iArrCopyOf2 = this.f35858;
            i6 = this.f35861;
            int i10 = this.f35866;
            if (i6 == iArrCopyOf2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, C6333.m17611(i6));
            }
            iArrCopyOf2[i6] = i10;
            this.f35858 = iArrCopyOf2;
            this.f35864 = Math.min(this.f35861, this.f35864);
            this.f35861++;
            this.f35866++;
            iM29272 = (m29272() * 2) + 1;
            if (this.f35859.length < iM29272) {
                this.f35859 = new long[iM29272];
            }
            if (z) {
                m29270();
                m29259(obj, j, j2);
            }
        }
        j4 = this.f35860;
        j3 = j4 + j;
        j5 = this.f35863;
        if (j2 > j5) {
            if (j2 == j5) {
            }
            j6 = j2;
            identityHashMap = this.f35865;
            if (identityHashMap == null) {
            }
            objArrCopyOf = this.f35855;
            i2 = this.f35861;
            if (i2 == objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, C6333.m17611(i2));
            }
            objArrCopyOf[i2] = obj;
            this.f35855 = objArrCopyOf;
            jArrCopyOf = this.f35862;
            i3 = this.f35861;
            if (i3 == jArrCopyOf.length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, C6333.m17611(i3));
            }
            jArrCopyOf[i3] = j3;
            this.f35862 = jArrCopyOf;
            jArrCopyOf2 = this.f35867;
            i4 = this.f35861;
            if (i4 == jArrCopyOf2.length) {
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, C6333.m17611(i4));
            }
            jArrCopyOf2[i4] = j6;
            this.f35867 = jArrCopyOf2;
            iArrCopyOf = this.f35857;
            i5 = this.f35861;
            if (i5 == iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, C6333.m17611(i5));
            }
            iArrCopyOf[i5] = i;
            this.f35857 = iArrCopyOf;
            iArrCopyOf2 = this.f35858;
            i6 = this.f35861;
            int i11 = this.f35866;
            if (i6 == iArrCopyOf2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, C6333.m17611(i6));
            }
            iArrCopyOf2[i6] = i11;
            this.f35858 = iArrCopyOf2;
            this.f35864 = Math.min(this.f35861, this.f35864);
            this.f35861++;
            this.f35866++;
            iM29272 = (m29272() * 2) + 1;
            if (this.f35859.length < iM29272) {
                this.f35859 = new long[iM29272];
            }
            if (z) {
                m29270();
                m29259(obj, j, j2);
            }
        }
        j7 = this.f35860;
        j6 = j7 + j2;
        identityHashMap = this.f35865;
        if (identityHashMap == null) {
        }
        objArrCopyOf = this.f35855;
        i2 = this.f35861;
        if (i2 == objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, C6333.m17611(i2));
        }
        objArrCopyOf[i2] = obj;
        this.f35855 = objArrCopyOf;
        jArrCopyOf = this.f35862;
        i3 = this.f35861;
        if (i3 == jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, C6333.m17611(i3));
        }
        jArrCopyOf[i3] = j3;
        this.f35862 = jArrCopyOf;
        jArrCopyOf2 = this.f35867;
        i4 = this.f35861;
        if (i4 == jArrCopyOf2.length) {
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, C6333.m17611(i4));
        }
        jArrCopyOf2[i4] = j6;
        this.f35867 = jArrCopyOf2;
        iArrCopyOf = this.f35857;
        i5 = this.f35861;
        if (i5 == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, C6333.m17611(i5));
        }
        iArrCopyOf[i5] = i;
        this.f35857 = iArrCopyOf;
        iArrCopyOf2 = this.f35858;
        i6 = this.f35861;
        int i12 = this.f35866;
        if (i6 == iArrCopyOf2.length) {
            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, C6333.m17611(i6));
        }
        iArrCopyOf2[i6] = i12;
        this.f35858 = iArrCopyOf2;
        this.f35864 = Math.min(this.f35861, this.f35864);
        this.f35861++;
        this.f35866++;
        iM29272 = (m29272() * 2) + 1;
        if (this.f35859.length < iM29272) {
            this.f35859 = new long[iM29272];
        }
        if (z) {
            m29270();
            m29259(obj, j, j2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29259(Object obj, long j, long j2) {
        Object obj2 = Selection.SELECTION_START;
        C10567 c10567 = this.f35854;
        if (obj == obj2 || obj == Selection.SELECTION_END) {
            c10567.m26555();
        }
        int i = (int) j;
        long j3 = i;
        if (j != j3) {
            throw new ArithmeticException();
        }
        int i2 = (int) j2;
        long j4 = i2;
        if (j2 != j4) {
            throw new ArithmeticException();
        }
        for (SpanWatcher spanWatcher : (SpanWatcher[]) m29280(i, i2, SpanWatcher.class)) {
            if (j != j3) {
                throw new ArithmeticException();
            }
            if (j2 != j4) {
                throw new ArithmeticException();
            }
            spanWatcher.onSpanAdded(c10567, obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29260(Object obj, long j, long j2, long j3, long j4) {
        Object obj2 = Selection.SELECTION_START;
        C10567 c10567 = this.f35854;
        if (obj == obj2 || obj == Selection.SELECTION_END) {
            c10567.m26555();
        }
        long jMin = Math.min(j, j3);
        int i = (int) jMin;
        if (jMin != i) {
            throw new ArithmeticException();
        }
        long jMin2 = Math.min(Math.max(j2, j4), c10567.length());
        int i2 = (int) jMin2;
        if (jMin2 != i2) {
            throw new ArithmeticException();
        }
        SpanWatcher[] spanWatcherArr = (SpanWatcher[]) m29280(i, i2, SpanWatcher.class);
        int length = spanWatcherArr.length;
        int i3 = 0;
        while (i3 < length) {
            SpanWatcher spanWatcher = spanWatcherArr[i3];
            int i4 = (int) j;
            if (j != i4) {
                throw new ArithmeticException();
            }
            int i5 = (int) j2;
            int i6 = i3;
            int i7 = length;
            if (j2 != i5) {
                throw new ArithmeticException();
            }
            int i8 = (int) j3;
            if (j3 != i8) {
                throw new ArithmeticException();
            }
            int i9 = (int) j4;
            SpanWatcher[] spanWatcherArr2 = spanWatcherArr;
            if (j4 != i9) {
                throw new ArithmeticException();
            }
            spanWatcher.onSpanChanged(c10567, obj, i4, i5, i8, i9);
            i3 = i6 + 1;
            length = i7;
            spanWatcherArr = spanWatcherArr2;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m29271(Object obj, long j, long j2) {
        Object obj2 = Selection.SELECTION_START;
        C10567 c10567 = this.f35854;
        if (obj == obj2 || obj == Selection.SELECTION_END) {
            c10567.m26555();
        }
        int i = (int) j;
        long j3 = i;
        if (j != j3) {
            throw new ArithmeticException();
        }
        int i2 = (int) j2;
        long j4 = i2;
        if (j2 != j4) {
            throw new ArithmeticException();
        }
        for (SpanWatcher spanWatcher : (SpanWatcher[]) m29280(i, i2, SpanWatcher.class)) {
            if (j != j3) {
                throw new ArithmeticException();
            }
            if (j2 != j4) {
                throw new ArithmeticException();
            }
            spanWatcher.onSpanRemoved(c10567, obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m29284(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f35865;
        if (identityHashMap == null || (num = (Integer) identityHashMap.remove(obj)) == null) {
            return;
        }
        m29275(num.intValue());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m29269(long j) {
        if (j > this.f35863) {
            j -= this.f35860;
        }
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m29283(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f35865;
        if (identityHashMap == null || (num = (Integer) identityHashMap.get(obj)) == null) {
            return -1;
        }
        return m29269(this.f35862[num.intValue()]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29276(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f35865;
        if (identityHashMap == null || (num = (Integer) identityHashMap.get(obj)) == null) {
            return -1;
        }
        return m29269(this.f35867[num.intValue()]);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m29282(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f35865;
        if (identityHashMap == null || (num = (Integer) identityHashMap.get(obj)) == null) {
            return 0;
        }
        return this.f35857[num.intValue()];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object[] m29280(int i, int i2, Class cls) {
        if (cls == null) {
            return m29266(Object.class);
        }
        if (this.f35861 == 0) {
            return m29266(cls);
        }
        int iM29253 = m29253(i, i2, m29272(), cls);
        if (iM29253 == 0) {
            return m29266(cls);
        }
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, iM29253);
        int[] iArrM29273 = m29273(iM29253);
        int[] iArrM29274 = m29273(iM29253);
        m29254(i, i2, cls, m29272(), objArr, iArrM29273, iArrM29274, 0);
        int length = objArr.length;
        int i3 = length / 2;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            m29258(i3, objArr, length, iArrM29273, iArrM29274);
        }
        while (true) {
            length--;
            if (length <= 0) {
                m29263(iArrM29273);
                m29263(iArrM29274);
                return objArr;
            }
            Object obj = objArr[0];
            objArr[0] = objArr[length];
            objArr[length] = obj;
            int i4 = iArrM29273[0];
            iArrM29273[0] = iArrM29273[length];
            iArrM29273[length] = i4;
            int i5 = iArrM29274[0];
            iArrM29274[0] = iArrM29274[length];
            iArrM29274[length] = i5;
            m29258(0, objArr, length, iArrM29273, iArrM29274);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object[] m29266(Class cls) {
        if (cls == Object.class) {
            return f35852;
        }
        int iIdentityHashCode = ((System.identityHashCode(cls) / 8) & Integer.MAX_VALUE) % 73;
        Object[] objArr = f35853;
        Object objNewInstance = objArr[iIdentityHashCode];
        if (objNewInstance == null || objNewInstance.getClass().getComponentType() != cls) {
            objNewInstance = Array.newInstance((Class<?>) cls, 0);
            objArr[iIdentityHashCode] = objNewInstance;
        }
        return (Object[]) objNewInstance;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m29253(int i, int i2, int i3, Class cls) {
        int iM29253;
        int i4 = i3 & 1;
        if (i4 != 0) {
            int iM29267 = m29267(i3);
            long j = this.f35859[iM29267];
            if (j > this.f35863) {
                j -= this.f35860;
            }
            if (j >= i) {
                iM29253 = m29253(i, i2, iM29267, cls);
            } else {
                iM29253 = 0;
            }
        } else {
            iM29253 = 0;
        }
        if (i3 >= this.f35861) {
            return iM29253;
        }
        long j2 = this.f35862[i3];
        long j3 = this.f35863;
        if (j2 > j3) {
            j2 -= this.f35860;
        }
        long j4 = i2;
        if (j2 > j4) {
            return iM29253;
        }
        long j5 = this.f35867[i3];
        if (j5 > j3) {
            j5 -= this.f35860;
        }
        long j6 = i;
        if (j5 >= j6 && ((j2 == j5 || i == i2 || (j2 != j4 && j5 != j6)) && (Object.class == cls || cls.isInstance(this.f35855[i3])))) {
            iM29253++;
        }
        return i4 != 0 ? iM29253 + m29253(i, i2, m29274(i3), cls) : iM29253;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m29254(int i, int i2, Class cls, int i3, Object[] objArr, int[] iArr, int[] iArr2, int i4) {
        int iM29254;
        int i5 = i3 & 1;
        if (i5 != 0) {
            int iM29267 = m29267(i3);
            long j = this.f35859[iM29267];
            if (j > this.f35863) {
                j -= this.f35860;
            }
            if (j >= i) {
                iM29254 = m29254(i, i2, cls, iM29267, objArr, iArr, iArr2, i4);
            } else {
                iM29254 = i4;
            }
        } else {
            iM29254 = i4;
        }
        if (i3 < this.f35861) {
            long j2 = this.f35862[i3];
            long j3 = this.f35863;
            if (j2 > j3) {
                j2 -= this.f35860;
            }
            long j4 = i2;
            if (j2 <= j4) {
                long j5 = this.f35867[i3];
                if (j5 > j3) {
                    j5 -= this.f35860;
                }
                long j6 = i;
                if (j5 >= j6 && ((j2 == j5 || i == i2 || (j2 != j4 && j5 != j6)) && (Object.class == cls || cls.isInstance(this.f35855[i3])))) {
                    iArr[iM29254] = this.f35857[i3] & 16711680;
                    iArr2[iM29254] = this.f35858[i3];
                    objArr[iM29254] = this.f35855[i3];
                    iM29254++;
                }
                int i6 = iM29254;
                return (i6 >= objArr.length || i5 == 0) ? i6 : m29254(i, i2, cls, m29274(i3), objArr, iArr, iArr2, i6);
            }
        }
        return iM29254;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int[] m29273(int i) {
        int[] iArr;
        int[][] iArr2 = f35851;
        synchronized (iArr2) {
            int length = iArr2.length - 1;
            int i2 = -1;
            while (true) {
                if (length < 0) {
                    length = i2;
                    break;
                }
                int[] iArr3 = f35851[length];
                if (iArr3 != null) {
                    if (iArr3.length >= i) {
                        break;
                    }
                    if (i2 == -1) {
                        i2 = length;
                    }
                }
                length--;
            }
            iArr = null;
            if (length != -1) {
                int[][] iArr4 = f35851;
                int[] iArr5 = iArr4[length];
                iArr4[length] = null;
                iArr = iArr5;
            }
        }
        return (iArr == null || i > iArr.length) ? new int[C6333.m17611(i)] : iArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29263(int[] iArr) {
        int i;
        synchronized (f35851) {
            while (true) {
                int[][] iArr2 = f35851;
                if (i < iArr2.length) {
                    int[] iArr3 = iArr2[i];
                    i = (iArr3 != null && iArr.length <= iArr3.length) ? i + 1 : 0;
                    iArr2[i] = iArr;
                    break;
                }
                break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29258(int i, Object[] objArr, int i2, int[] iArr, int[] iArr2) {
        int iCompare;
        int iCompare2;
        int i3 = (i * 2) + 1;
        while (i3 < i2) {
            if (i3 < i2 - 1) {
                int i4 = i3 + 1;
                int i5 = iArr[i3];
                int i6 = iArr[i4];
                if (i5 == i6) {
                    iCompare2 = Integer.compare(iArr2[i3], iArr2[i4]);
                } else {
                    iCompare2 = Integer.compare(i6, i5);
                }
                if (iCompare2 < 0) {
                    i3 = i4;
                }
            }
            int i7 = iArr[i];
            int i8 = iArr[i3];
            if (i7 == i8) {
                iCompare = Integer.compare(iArr2[i], iArr2[i3]);
            } else {
                iCompare = Integer.compare(i8, i7);
            }
            if (iCompare >= 0) {
                return;
            }
            Object obj = objArr[i];
            objArr[i] = objArr[i3];
            objArr[i3] = obj;
            int i9 = iArr[i];
            iArr[i] = iArr[i3];
            iArr[i3] = i9;
            int i10 = iArr2[i];
            iArr2[i] = iArr2[i3];
            iArr2[i3] = i10;
            int i11 = i3;
            i3 = (i3 * 2) + 1;
            i = i11;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m29281(int i, int i2, Class cls) {
        if (this.f35861 == 0) {
            return i2;
        }
        if (cls == null) {
            cls = Object.class;
        }
        return m29268(i, i2, m29272(), cls);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m29268(int i, int i2, int i3, Class cls) {
        int i4 = i3 & 1;
        if (i4 != 0) {
            int iM29267 = m29267(i3);
            if (m29269(this.f35859[iM29267]) > i) {
                i2 = m29268(i, i2, iM29267, cls);
            }
        }
        if (i3 >= this.f35861) {
            return i2;
        }
        int iM29269 = m29269(this.f35862[i3]);
        int iM292610 = m29269(this.f35867[i3]);
        if (iM29269 > i && iM29269 < i2 && cls.isInstance(this.f35855[i3])) {
            i2 = iM29269;
        }
        if (iM292610 <= i || iM292610 >= i2 || !cls.isInstance(this.f35855[i3])) {
            iM292610 = i2;
        }
        return (iM29269 >= iM292610 || i4 == 0) ? iM292610 : m29268(i, iM292610, m29274(i3), cls);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m29272() {
        return Integer.highestOneBit(this.f35861) - 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m29255(int i) {
        int i2 = i & 1;
        long jM29255 = i2 != 0 ? m29255(m29267(i)) : 0L;
        if (i < this.f35861) {
            jM29255 = Math.max(jM29255, this.f35867[i]);
            if (i2 != 0) {
                jM29255 = Math.max(jM29255, m29255(m29274(i)));
            }
        }
        this.f35859[i] = jM29255;
        return jM29255;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m29270() {
        Object[] objArr;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        int[] iArr2;
        int i;
        if (this.f35861 == 0) {
            return;
        }
        for (int i2 = 1; i2 < this.f35861; i2++) {
            long[] jArr3 = this.f35862;
            long j = jArr3[i2];
            if (j < jArr3[i2 - 1]) {
                Object obj = this.f35855[i2];
                long j2 = this.f35867[i2];
                int i3 = this.f35857[i2];
                int i4 = this.f35858[i2];
                int i5 = i2;
                while (true) {
                    objArr = this.f35855;
                    int i6 = i5 - 1;
                    objArr[i5] = objArr[i6];
                    jArr = this.f35862;
                    jArr[i5] = jArr[i6];
                    jArr2 = this.f35867;
                    jArr2[i5] = jArr2[i6];
                    iArr = this.f35857;
                    iArr[i5] = iArr[i6];
                    iArr2 = this.f35858;
                    iArr2[i5] = iArr2[i6];
                    i = i5 - 1;
                    if (i <= 0 || j >= jArr[i5 - 2]) {
                        break;
                    } else {
                        i5 = i;
                    }
                }
                objArr[i] = obj;
                jArr[i] = j;
                jArr2[i] = j2;
                iArr[i] = i3;
                iArr2[i] = i4;
                this.f35864 = Math.min(i, this.f35864);
            }
        }
        m29255(m29272());
        if (this.f35865 == null) {
            this.f35865 = new IdentityHashMap();
        }
        for (int i7 = this.f35864; i7 < this.f35861; i7++) {
            Integer num = (Integer) this.f35865.get(this.f35855[i7]);
            if (num == null || num.intValue() != i7) {
                this.f35865.put(this.f35855[i7], Integer.valueOf(i7));
            }
        }
        this.f35864 = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29261(String str, long j, long j2) {
        if (j2 < j) {
            throw new IndexOutOfBoundsException(C9045.m23341(C7166.m19190(str, " "), m29257(j, j2), " has end before start"));
        }
        int length = this.f35854.length();
        long j3 = length;
        if (j <= j3 && j2 <= j3) {
            if (j < 0 || j2 < 0) {
                throw new IndexOutOfBoundsException(C9045.m23341(C7166.m19190(str, " "), m29257(j, j2), " starts before 0"));
            }
        } else {
            StringBuilder sbM19190 = C7166.m19190(str, " ");
            sbM19190.append(m29257(j, j2));
            sbM19190.append(" ends beyond length ");
            sbM19190.append(length);
            throw new IndexOutOfBoundsException(sbM19190.toString());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m29265(int i, long j) {
        return (i != 3 || j == 0 || j == ((long) this.f35854.length()) || m29252(j - 1) == '\n') ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private char m29252(long j) {
        int i = (int) j;
        if (j == i) {
            return this.f35854.charAt(i);
        }
        throw new ArithmeticException();
    }
}
