package p067l;

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
public final class C13753 {

    /* JADX INFO: renamed from: ֫ */
    public final C12412 f38864;

    /* JADX INFO: renamed from: ۖ */
    public Object[] f38865;

    /* JADX INFO: renamed from: ۘ */
    public long f38866;

    /* JADX INFO: renamed from: ۜ */
    public int[] f38867;

    /* JADX INFO: renamed from: ۡ */
    public int[] f38868;

    /* JADX INFO: renamed from: ۢ */
    public long[] f38869;

    /* JADX INFO: renamed from: ۧ */
    public long f38870;

    /* JADX INFO: renamed from: ܳ */
    public int f38871;

    /* JADX INFO: renamed from: ܺ */
    public long[] f38872;

    /* JADX INFO: renamed from: ܽ */
    public long f38873;

    /* JADX INFO: renamed from: ܿ */
    public int f38874;

    /* JADX INFO: renamed from: ᩳ */
    public IdentityHashMap f38875;

    /* JADX INFO: renamed from: ᩷ */
    public int f38876;

    /* JADX INFO: renamed from: ᩻ */
    public long[] f38877;

    /* JADX INFO: renamed from: ᩴ */
    public static Object[] f38862 = new Object[0];

    /* JADX INFO: renamed from: ᩵ */
    public static Object[] f38863 = new Object[73];

    /* JADX INFO: renamed from: ֡ */
    public static final int[][] f38861 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 0);

    /* JADX INFO: renamed from: ֫ */
    public static String m31311(long j, long j2) {
        return C17520.m39893(C14536.m33191(MotionUtils.EASING_TYPE_FORMAT_START, " ... ", j), j2, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m31321(int i) {
        return i - (((i + 1) & (~i)) >> 1);
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m31328(int i) {
        return i + (((i + 1) & (~i)) >> 1);
    }

    public C13753(C12412 c12412, CharSequence charSequence, int i) {
        this.f38864 = c12412;
        long length = c12412.length();
        long jMax = Math.max(8L, 2 * length);
        this.f38866 = jMax;
        this.f38873 = length;
        this.f38870 = jMax - length;
        this.f38871 = 0;
        this.f38876 = 0;
        this.f38865 = new Object[0];
        this.f38872 = new long[0];
        this.f38877 = new long[0];
        this.f38867 = new int[0];
        this.f38869 = new long[0];
        this.f38868 = new int[0];
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
                    m31316(false, obj, spanStart, spanEnd > i ? i : spanEnd, spanFlags, false);
                }
            }
            m31324();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31331() {
        int i = this.f38871;
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            Object[] objArr = this.f38865;
            Object obj = objArr[i];
            long j = this.f38872[i];
            long j2 = this.f38877[i];
            long j3 = this.f38873;
            if (j > j3) {
                j -= this.f38870;
            }
            if (j2 > j3) {
                j2 -= this.f38870;
            }
            this.f38871 = i;
            objArr[i] = null;
            IdentityHashMap identityHashMap = this.f38875;
            if (identityHashMap != null) {
                identityHashMap.remove(obj);
            }
            m31325(obj, j, j2);
        }
        IdentityHashMap identityHashMap2 = this.f38875;
        if (identityHashMap2 != null) {
            identityHashMap2.clear();
        }
        this.f38876 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m31318(int i, int i2, int i3, boolean z) {
        int i4 = i3 & 1;
        if (i4 == 0 || m31323(this.f38869[i3]) < i || !m31318(i, i2, m31321(i3), z)) {
            if (i3 >= this.f38871) {
                return false;
            }
            if ((this.f38867[i3] & 33) == 33) {
                long j = this.f38872[i3];
                long j2 = i;
                if (j >= j2) {
                    long j3 = this.f38873;
                    long j4 = this.f38870 + j3;
                    if (j < j4) {
                        long j5 = this.f38877[i3];
                        if (j5 >= j2 && j5 < j4 && (z || j > j2 || j5 < j3)) {
                            this.f38875.remove(this.f38865[i3]);
                            m31329(i3);
                            return true;
                        }
                    }
                }
            }
            if (m31323(this.f38872[i3]) > i2 || i4 == 0 || !m31318(i, i2, m31328(i3), z)) {
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
    /* JADX INFO: renamed from: ֫ */
    public final void m31332(int i, int i2, CharSequence charSequence, int i3, int i4, boolean z) {
        C12412 c12412;
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
        m31315("replace", j13, j14);
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
        TextWatcher[] textWatcherArr = (TextWatcher[]) m31334(i, i + i17, TextWatcher.class);
        int length2 = textWatcherArr.length;
        int i21 = 0;
        while (true) {
            c12412 = this.f38864;
            if (i21 >= length2) {
                break;
            }
            textWatcherArr[i21].beforeTextChanged(c12412, i, i17, i18);
            i21++;
            length2 = length2;
        }
        boolean z5 = (i17 == 0 || i18 == 0) ? false : true;
        if (z5 || z) {
            selectionStart = Selection.getSelectionStart(c12412);
            selectionEnd = Selection.getSelectionEnd(c12412);
        } else {
            selectionEnd = 0;
            selectionStart = 0;
        }
        int i22 = i18 - i17;
        int i23 = selectionEnd;
        int i24 = this.f38871 - 1;
        boolean z6 = false;
        while (i24 >= 0) {
            int i25 = i22;
            long j16 = this.f38872[i24];
            Class<Object> cls2 = cls;
            TextWatcher[] textWatcherArr2 = textWatcherArr;
            long j17 = this.f38873;
            if (j16 > j17) {
                j16 -= this.f38870;
            }
            long j18 = this.f38877[i24];
            if (j18 > j17) {
                j18 -= this.f38870;
            }
            if ((this.f38867[i24] & 51) == 51) {
                int length3 = c12412.length();
                if (j16 > j13) {
                    j11 = j15;
                    if (j16 <= j11) {
                        j9 = j11;
                        while (j9 < length3 && (j9 <= j11 || m31306(j9 - 1) != '\n')) {
                            j9++;
                        }
                    }
                    if (j18 > j13 || j18 > j11) {
                        j12 = j13;
                        j10 = j18;
                    } else {
                        j10 = j11;
                        j12 = j13;
                        while (j10 < length3 && (j10 <= j11 || m31306(j10 - 1) != '\n')) {
                            j10++;
                        }
                    }
                    if (j9 == j16 || j10 != j18) {
                        i14 = 32768;
                        selectionStart = selectionStart;
                        i25 = i25;
                        c12412 = c12412;
                        j7 = j11;
                        textWatcherArr2 = textWatcherArr2;
                        cls2 = cls2;
                        i23 = i23;
                        i17 = i17;
                        i18 = i18;
                        j8 = j12;
                        m31316(false, this.f38865[i24], j9, j10, this.f38867[i24], true);
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
                    int[] iArr = this.f38867;
                    iArr[i24] = i16 | iArr[i24];
                    i24--;
                    i22 = i15;
                    c12412 = c12412;
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
                c12412 = c12412;
                j7 = j11;
                textWatcherArr2 = textWatcherArr2;
                cls2 = cls2;
                i23 = i23;
                i17 = i17;
                i18 = i18;
                j8 = j12;
                m31316(false, this.f38865[i24], j9, j10, this.f38867[i24], true);
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
                int[] iArr2 = this.f38867;
                iArr2[i24] = i16 | iArr2[i24];
                i24--;
                i22 = i15;
                c12412 = c12412;
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
            int[] iArr3 = this.f38867;
            iArr3[i24] = i16 | iArr3[i24];
            i24--;
            i22 = i15;
            c12412 = c12412;
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
        C12412 c12413 = c12412;
        if (z6) {
            m31324();
        }
        if (j20 != this.f38873) {
            boolean z7 = i2 == c12413.length();
            if (this.f38871 != 0) {
                boolean z8 = false;
                for (int i31 = 0; i31 < this.f38871; i31++) {
                    long[] jArr = this.f38872;
                    long j21 = jArr[i31];
                    long[] jArr2 = this.f38877;
                    long j22 = jArr2[i31];
                    long j23 = this.f38873;
                    if (j21 > j23) {
                        j21 -= this.f38870;
                    }
                    if (j21 > j20) {
                        j5 = this.f38870;
                    } else {
                        if (j21 == j20 && ((i11 = (this.f38867[i31] & 240) >> 4) == 2 || (z7 && i11 == 3))) {
                            j5 = this.f38870;
                        }
                        if (j22 > j23) {
                            j22 -= this.f38870;
                        }
                        if (j22 > j20) {
                            j6 = this.f38870;
                        } else {
                            if (j22 == j20 && ((i12 = this.f38867[i31] & 15) == 2 || (z7 && i12 == 3))) {
                                j6 = this.f38870;
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
                        j22 -= this.f38870;
                    }
                    if (j22 > j20) {
                        j6 = this.f38870;
                    } else {
                        if (j22 == j20) {
                            j6 = this.f38870;
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
                    m31324();
                } else {
                    m31309(m31326());
                }
            }
            this.f38873 = j20;
        }
        long j24 = i30;
        long j25 = this.f38870;
        if (j24 >= j25) {
            long j26 = this.f38866;
            long j27 = (j26 + j24) - j25;
            if (j27 + 1 > j26) {
                long jMax = Math.max(8L, j27 * 2);
                long j28 = jMax - j26;
                this.f38866 = jMax;
                long j29 = this.f38870 + j28;
                this.f38870 = j29;
                if (j29 < 1) {
                    new Exception("mGapLength < 1");
                }
                if (this.f38871 != 0) {
                    for (int i32 = 0; i32 < this.f38871; i32++) {
                        long[] jArr3 = this.f38872;
                        long j30 = jArr3[i32];
                        long j31 = this.f38873;
                        if (j30 > j31) {
                            jArr3[i32] = j30 + j28;
                        }
                        long[] jArr4 = this.f38877;
                        long j32 = jArr4[i32];
                        if (j32 > j31) {
                            jArr4[i32] = j32 + j28;
                        }
                    }
                    m31309(m31326());
                }
            }
        }
        boolean z9 = i27 == 0;
        if (i26 <= 0) {
            i5 = i2;
            break;
        }
        do {
            if (this.f38871 <= 0) {
                i5 = i2;
                break;
            }
            i5 = i2;
        } while (m31318(i, i5, m31326(), z9));
        c12413.m28582(i, i2, charSequence, i3, i4);
        this.f38873 += j24;
        long j33 = this.f38870 - j24;
        this.f38870 = j33;
        if (j33 < 1) {
            new Exception("mGapLength < 1");
        }
        if (i26 > 0) {
            boolean z10 = this.f38873 + this.f38870 == this.f38866;
            int i33 = 0;
            while (i33 < this.f38871) {
                int i34 = (this.f38867[i33] & 240) >> 4;
                long[] jArr5 = this.f38872;
                long j34 = jArr5[i33];
                int i35 = i33;
                boolean z11 = z10;
                long j35 = j24;
                int i36 = i5;
                boolean z12 = z9;
                jArr5[i35] = m31310(i, i30, i34, j34, z11, z12);
                int i37 = this.f38867[i35] & 15;
                long[] jArr6 = this.f38877;
                jArr6[i35] = m31310(i, i30, i37, jArr6[i35], z11, z12);
                i33 = i35 + 1;
                i5 = i36;
                j24 = j35;
            }
            j = j24;
            i6 = i5;
            m31324();
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
                    if (m31337(obj) < 0) {
                        m31316(false, obj, (spanStart - i3) + i, (spanEnd - i3) + i, spanned3.getSpanFlags(obj) | 2048, false);
                    }
                }
                i39++;
                i38 = i4;
                i30 = i30;
                spans2 = spans2;
            }
            i7 = i30;
            m31324();
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
                m31316(false, Selection.SELECTION_START, j37, j37, 34, true);
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
                m31316(false, Selection.SELECTION_END, j39, j39, 34, true);
                z4 = true;
            }
            if (z4) {
                m31324();
            }
            i9 = i10;
        } else {
            i8 = i29;
            i9 = i28;
        }
        if (z) {
            if (i9 >= 0) {
                long j40 = i9;
                m31316(false, Selection.SELECTION_START, j40, j40, 34, true);
            }
            if (i8 >= 0) {
                long j41 = i8;
                m31316(false, Selection.SELECTION_END, j41, j41, 34, true);
            }
            m31324();
        }
        c12413.m28588();
        for (TextWatcher textWatcher : textWatcherArr3) {
            textWatcher.onTextChanged(c12413, i, i26, i27);
        }
        for (TextWatcher textWatcher2 : textWatcherArr3) {
            textWatcher2.afterTextChanged(c12413);
        }
        int i42 = 32768;
        for (int i43 = 0; i43 < this.f38871; i43++) {
            int i44 = this.f38867[i43];
            if ((i44 & 2048) == 0) {
                long j42 = this.f38872[i43];
                long j43 = this.f38877[i43];
                long j44 = this.f38873;
                if (j42 > j44) {
                    j42 -= this.f38870;
                }
                long j45 = j42;
                if (j43 > j44) {
                    j43 -= this.f38870;
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
                    m31314(this.f38865[i43], j2, j4, j45, j46);
                } else {
                    i42 = 32768;
                }
                int[] iArr4 = this.f38867;
                iArr4[i43] = iArr4[i43] & (-61441);
            }
        }
        for (int i45 = 0; i45 < this.f38871; i45++) {
            int[] iArr5 = this.f38867;
            int i46 = iArr5[i45];
            if ((i46 & 2048) != 0) {
                iArr5[i45] = i46 & (-2049);
                long j48 = this.f38872[i45];
                long j49 = this.f38877[i45];
                long j50 = this.f38873;
                if (j48 > j50) {
                    j48 -= this.f38870;
                }
                if (j49 > j50) {
                    j49 -= this.f38870;
                }
                m31313(this.f38865[i45], j48, j49);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private long m31310(int i, int i2, int i3, long j, boolean z, boolean z2) {
        long j2 = i;
        if (j >= j2) {
            long j3 = this.f38873;
            long j4 = this.f38870;
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

    /* JADX INFO: renamed from: ᩳ */
    private void m31329(int i) {
        Object[] objArr = this.f38865;
        Object obj = objArr[i];
        long j = this.f38872[i];
        long j2 = this.f38877[i];
        long j3 = this.f38873;
        if (j > j3) {
            j -= this.f38870;
        }
        if (j2 > j3) {
            j2 -= this.f38870;
        }
        int i2 = i + 1;
        int i3 = this.f38871 - i2;
        System.arraycopy(objArr, i2, objArr, i, i3);
        long[] jArr = this.f38872;
        System.arraycopy(jArr, i2, jArr, i, i3);
        long[] jArr2 = this.f38877;
        System.arraycopy(jArr2, i2, jArr2, i, i3);
        int[] iArr = this.f38867;
        System.arraycopy(iArr, i2, iArr, i, i3);
        int[] iArr2 = this.f38868;
        System.arraycopy(iArr2, i2, iArr2, i, i3);
        this.f38871--;
        this.f38874 = Math.min(i, this.f38874);
        this.f38865[this.f38871] = null;
        m31324();
        m31325(obj, j, j2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31333(Object obj, int i, int i2, int i3) {
        m31316(true, obj, i, i2, i3, true);
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
    /* JADX INFO: renamed from: ֫ */
    private void m31316(boolean z, Object obj, long j, long j2, int i, boolean z2) {
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
        int iM31326;
        Integer num;
        m31315("setSpan", j, j2);
        int i7 = (i & 240) >> 4;
        if (m31319(i7, j)) {
            if (z2) {
                StringBuilder sbM33191 = C14536.m33191("PARAGRAPH span must start at paragraph boundary (", " follows ", j);
                sbM33191.append(m31306(j - 1));
                sbM33191.append(MotionUtils.EASING_TYPE_FORMAT_END);
                throw new RuntimeException(sbM33191.toString());
            }
            return;
        }
        int i8 = i & 15;
        if (m31319(i8, j2)) {
            if (z2) {
                StringBuilder sbM33192 = C14536.m33191("PARAGRAPH span must end at paragraph boundary (", " follows ", j2);
                sbM33192.append(m31306(j2 - 1));
                sbM33192.append(MotionUtils.EASING_TYPE_FORMAT_END);
                throw new RuntimeException(sbM33192.toString());
            }
            return;
        }
        if (i7 == 2 && i8 == 1 && j == j2) {
            return;
        }
        long j8 = this.f38873;
        C12412 c12412 = this.f38864;
        if (j <= j8) {
            if (j == j8 && (i7 == 2 || (i7 == 3 && j == c12412.length()))) {
                j4 = this.f38870;
            } else {
                j3 = j;
            }
            j5 = this.f38873;
            if (j2 > j5) {
                if (j2 == j5 || !(i8 == 2 || (i8 == 3 && j2 == c12412.length()))) {
                    j6 = j2;
                } else {
                    j7 = this.f38870;
                }
                identityHashMap = this.f38875;
                if (identityHashMap == null && (num = (Integer) identityHashMap.get(obj)) != null) {
                    int iIntValue = num.intValue();
                    long[] jArr = this.f38872;
                    long j9 = jArr[iIntValue];
                    long[] jArr2 = this.f38877;
                    long j10 = jArr2[iIntValue];
                    long j11 = this.f38873;
                    if (j9 > j11) {
                        j9 -= this.f38870;
                    }
                    if (j10 > j11) {
                        j10 -= this.f38870;
                    }
                    jArr[iIntValue] = j3;
                    jArr2[iIntValue] = j6;
                    this.f38867[iIntValue] = i;
                    if (z) {
                        m31324();
                        m31314(obj, j9, j10, j, j2);
                        return;
                    }
                    return;
                }
                objArrCopyOf = this.f38865;
                i2 = this.f38871;
                if (i2 == objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, C8388.m19551(i2));
                }
                objArrCopyOf[i2] = obj;
                this.f38865 = objArrCopyOf;
                jArrCopyOf = this.f38872;
                i3 = this.f38871;
                if (i3 == jArrCopyOf.length) {
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, C8388.m19551(i3));
                }
                jArrCopyOf[i3] = j3;
                this.f38872 = jArrCopyOf;
                jArrCopyOf2 = this.f38877;
                i4 = this.f38871;
                if (i4 == jArrCopyOf2.length) {
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, C8388.m19551(i4));
                }
                jArrCopyOf2[i4] = j6;
                this.f38877 = jArrCopyOf2;
                iArrCopyOf = this.f38867;
                i5 = this.f38871;
                if (i5 == iArrCopyOf.length) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, C8388.m19551(i5));
                }
                iArrCopyOf[i5] = i;
                this.f38867 = iArrCopyOf;
                iArrCopyOf2 = this.f38868;
                i6 = this.f38871;
                int i9 = this.f38876;
                if (i6 == iArrCopyOf2.length) {
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, C8388.m19551(i6));
                }
                iArrCopyOf2[i6] = i9;
                this.f38868 = iArrCopyOf2;
                this.f38874 = Math.min(this.f38871, this.f38874);
                this.f38871++;
                this.f38876++;
                iM31326 = (m31326() * 2) + 1;
                if (this.f38869.length < iM31326) {
                    this.f38869 = new long[iM31326];
                }
                if (z) {
                    m31324();
                    m31313(obj, j, j2);
                }
            }
            j7 = this.f38870;
            j6 = j7 + j2;
            identityHashMap = this.f38875;
            if (identityHashMap == null) {
            }
            objArrCopyOf = this.f38865;
            i2 = this.f38871;
            if (i2 == objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, C8388.m19551(i2));
            }
            objArrCopyOf[i2] = obj;
            this.f38865 = objArrCopyOf;
            jArrCopyOf = this.f38872;
            i3 = this.f38871;
            if (i3 == jArrCopyOf.length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, C8388.m19551(i3));
            }
            jArrCopyOf[i3] = j3;
            this.f38872 = jArrCopyOf;
            jArrCopyOf2 = this.f38877;
            i4 = this.f38871;
            if (i4 == jArrCopyOf2.length) {
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, C8388.m19551(i4));
            }
            jArrCopyOf2[i4] = j6;
            this.f38877 = jArrCopyOf2;
            iArrCopyOf = this.f38867;
            i5 = this.f38871;
            if (i5 == iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, C8388.m19551(i5));
            }
            iArrCopyOf[i5] = i;
            this.f38867 = iArrCopyOf;
            iArrCopyOf2 = this.f38868;
            i6 = this.f38871;
            int i10 = this.f38876;
            if (i6 == iArrCopyOf2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, C8388.m19551(i6));
            }
            iArrCopyOf2[i6] = i10;
            this.f38868 = iArrCopyOf2;
            this.f38874 = Math.min(this.f38871, this.f38874);
            this.f38871++;
            this.f38876++;
            iM31326 = (m31326() * 2) + 1;
            if (this.f38869.length < iM31326) {
                this.f38869 = new long[iM31326];
            }
            if (z) {
                m31324();
                m31313(obj, j, j2);
            }
        }
        j4 = this.f38870;
        j3 = j4 + j;
        j5 = this.f38873;
        if (j2 > j5) {
            if (j2 == j5) {
            }
            j6 = j2;
            identityHashMap = this.f38875;
            if (identityHashMap == null) {
            }
            objArrCopyOf = this.f38865;
            i2 = this.f38871;
            if (i2 == objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, C8388.m19551(i2));
            }
            objArrCopyOf[i2] = obj;
            this.f38865 = objArrCopyOf;
            jArrCopyOf = this.f38872;
            i3 = this.f38871;
            if (i3 == jArrCopyOf.length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, C8388.m19551(i3));
            }
            jArrCopyOf[i3] = j3;
            this.f38872 = jArrCopyOf;
            jArrCopyOf2 = this.f38877;
            i4 = this.f38871;
            if (i4 == jArrCopyOf2.length) {
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, C8388.m19551(i4));
            }
            jArrCopyOf2[i4] = j6;
            this.f38877 = jArrCopyOf2;
            iArrCopyOf = this.f38867;
            i5 = this.f38871;
            if (i5 == iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, C8388.m19551(i5));
            }
            iArrCopyOf[i5] = i;
            this.f38867 = iArrCopyOf;
            iArrCopyOf2 = this.f38868;
            i6 = this.f38871;
            int i11 = this.f38876;
            if (i6 == iArrCopyOf2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, C8388.m19551(i6));
            }
            iArrCopyOf2[i6] = i11;
            this.f38868 = iArrCopyOf2;
            this.f38874 = Math.min(this.f38871, this.f38874);
            this.f38871++;
            this.f38876++;
            iM31326 = (m31326() * 2) + 1;
            if (this.f38869.length < iM31326) {
                this.f38869 = new long[iM31326];
            }
            if (z) {
                m31324();
                m31313(obj, j, j2);
            }
        }
        j7 = this.f38870;
        j6 = j7 + j2;
        identityHashMap = this.f38875;
        if (identityHashMap == null) {
        }
        objArrCopyOf = this.f38865;
        i2 = this.f38871;
        if (i2 == objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, C8388.m19551(i2));
        }
        objArrCopyOf[i2] = obj;
        this.f38865 = objArrCopyOf;
        jArrCopyOf = this.f38872;
        i3 = this.f38871;
        if (i3 == jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, C8388.m19551(i3));
        }
        jArrCopyOf[i3] = j3;
        this.f38872 = jArrCopyOf;
        jArrCopyOf2 = this.f38877;
        i4 = this.f38871;
        if (i4 == jArrCopyOf2.length) {
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, C8388.m19551(i4));
        }
        jArrCopyOf2[i4] = j6;
        this.f38877 = jArrCopyOf2;
        iArrCopyOf = this.f38867;
        i5 = this.f38871;
        if (i5 == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, C8388.m19551(i5));
        }
        iArrCopyOf[i5] = i;
        this.f38867 = iArrCopyOf;
        iArrCopyOf2 = this.f38868;
        i6 = this.f38871;
        int i12 = this.f38876;
        if (i6 == iArrCopyOf2.length) {
            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, C8388.m19551(i6));
        }
        iArrCopyOf2[i6] = i12;
        this.f38868 = iArrCopyOf2;
        this.f38874 = Math.min(this.f38871, this.f38874);
        this.f38871++;
        this.f38876++;
        iM31326 = (m31326() * 2) + 1;
        if (this.f38869.length < iM31326) {
            this.f38869 = new long[iM31326];
        }
        if (z) {
            m31324();
            m31313(obj, j, j2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m31313(Object obj, long j, long j2) {
        Object obj2 = Selection.SELECTION_START;
        C12412 c12412 = this.f38864;
        if (obj == obj2 || obj == Selection.SELECTION_END) {
            c12412.m28588();
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
        for (SpanWatcher spanWatcher : (SpanWatcher[]) m31334(i, i2, SpanWatcher.class)) {
            if (j != j3) {
                throw new ArithmeticException();
            }
            if (j2 != j4) {
                throw new ArithmeticException();
            }
            spanWatcher.onSpanAdded(c12412, obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m31314(Object obj, long j, long j2, long j3, long j4) {
        Object obj2 = Selection.SELECTION_START;
        C12412 c12412 = this.f38864;
        if (obj == obj2 || obj == Selection.SELECTION_END) {
            c12412.m28588();
        }
        long jMin = Math.min(j, j3);
        int i = (int) jMin;
        if (jMin != i) {
            throw new ArithmeticException();
        }
        long jMin2 = Math.min(Math.max(j2, j4), c12412.length());
        int i2 = (int) jMin2;
        if (jMin2 != i2) {
            throw new ArithmeticException();
        }
        SpanWatcher[] spanWatcherArr = (SpanWatcher[]) m31334(i, i2, SpanWatcher.class);
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
            spanWatcher.onSpanChanged(c12412, obj, i4, i5, i8, i9);
            i3 = i6 + 1;
            length = i7;
            spanWatcherArr = spanWatcherArr2;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m31325(Object obj, long j, long j2) {
        Object obj2 = Selection.SELECTION_START;
        C12412 c12412 = this.f38864;
        if (obj == obj2 || obj == Selection.SELECTION_END) {
            c12412.m28588();
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
        for (SpanWatcher spanWatcher : (SpanWatcher[]) m31334(i, i2, SpanWatcher.class)) {
            if (j != j3) {
                throw new ArithmeticException();
            }
            if (j2 != j4) {
                throw new ArithmeticException();
            }
            spanWatcher.onSpanRemoved(c12412, obj, i, i2);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m31338(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f38875;
        if (identityHashMap == null || (num = (Integer) identityHashMap.remove(obj)) == null) {
            return;
        }
        m31329(num.intValue());
    }

    /* JADX INFO: renamed from: ۧ */
    private int m31323(long j) {
        if (j > this.f38873) {
            j -= this.f38870;
        }
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m31337(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f38875;
        if (identityHashMap == null || (num = (Integer) identityHashMap.get(obj)) == null) {
            return -1;
        }
        return m31323(this.f38872[num.intValue()]);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m31330(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f38875;
        if (identityHashMap == null || (num = (Integer) identityHashMap.get(obj)) == null) {
            return -1;
        }
        return m31323(this.f38877[num.intValue()]);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m31336(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f38875;
        if (identityHashMap == null || (num = (Integer) identityHashMap.get(obj)) == null) {
            return 0;
        }
        return this.f38867[num.intValue()];
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object[] m31334(int i, int i2, Class cls) {
        if (cls == null) {
            return m31320(Object.class);
        }
        if (this.f38871 == 0) {
            return m31320(cls);
        }
        int iM31307 = m31307(i, i2, m31326(), cls);
        if (iM31307 == 0) {
            return m31320(cls);
        }
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, iM31307);
        int[] iArrM31327 = m31327(iM31307);
        int[] iArrM31328 = m31327(iM31307);
        m31308(i, i2, cls, m31326(), objArr, iArrM31327, iArrM31328, 0);
        int length = objArr.length;
        int i3 = length / 2;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            m31312(i3, objArr, length, iArrM31327, iArrM31328);
        }
        while (true) {
            length--;
            if (length <= 0) {
                m31317(iArrM31327);
                m31317(iArrM31328);
                return objArr;
            }
            Object obj = objArr[0];
            objArr[0] = objArr[length];
            objArr[length] = obj;
            int i4 = iArrM31327[0];
            iArrM31327[0] = iArrM31327[length];
            iArrM31327[length] = i4;
            int i5 = iArrM31328[0];
            iArrM31328[0] = iArrM31328[length];
            iArrM31328[length] = i5;
            m31312(0, objArr, length, iArrM31327, iArrM31328);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object[] m31320(Class cls) {
        if (cls == Object.class) {
            return f38862;
        }
        int iIdentityHashCode = ((System.identityHashCode(cls) / 8) & Integer.MAX_VALUE) % 73;
        Object[] objArr = f38863;
        Object objNewInstance = objArr[iIdentityHashCode];
        if (objNewInstance == null || objNewInstance.getClass().getComponentType() != cls) {
            objNewInstance = Array.newInstance((Class<?>) cls, 0);
            objArr[iIdentityHashCode] = objNewInstance;
        }
        return (Object[]) objNewInstance;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX INFO: renamed from: ֫ */
    private int m31307(int i, int i2, int i3, Class cls) {
        int iM31307;
        int i4 = i3 & 1;
        if (i4 != 0) {
            int iM31321 = m31321(i3);
            long j = this.f38869[iM31321];
            if (j > this.f38873) {
                j -= this.f38870;
            }
            if (j >= i) {
                iM31307 = m31307(i, i2, iM31321, cls);
            } else {
                iM31307 = 0;
            }
        } else {
            iM31307 = 0;
        }
        if (i3 >= this.f38871) {
            return iM31307;
        }
        long j2 = this.f38872[i3];
        long j3 = this.f38873;
        if (j2 > j3) {
            j2 -= this.f38870;
        }
        long j4 = i2;
        if (j2 > j4) {
            return iM31307;
        }
        long j5 = this.f38877[i3];
        if (j5 > j3) {
            j5 -= this.f38870;
        }
        long j6 = i;
        if (j5 >= j6 && ((j2 == j5 || i == i2 || (j2 != j4 && j5 != j6)) && (Object.class == cls || cls.isInstance(this.f38865[i3])))) {
            iM31307++;
        }
        return i4 != 0 ? iM31307 + m31307(i, i2, m31328(i3), cls) : iM31307;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    /* JADX INFO: renamed from: ֫ */
    private int m31308(int i, int i2, Class cls, int i3, Object[] objArr, int[] iArr, int[] iArr2, int i4) {
        int iM31308;
        int i5 = i3 & 1;
        if (i5 != 0) {
            int iM31321 = m31321(i3);
            long j = this.f38869[iM31321];
            if (j > this.f38873) {
                j -= this.f38870;
            }
            if (j >= i) {
                iM31308 = m31308(i, i2, cls, iM31321, objArr, iArr, iArr2, i4);
            } else {
                iM31308 = i4;
            }
        } else {
            iM31308 = i4;
        }
        if (i3 < this.f38871) {
            long j2 = this.f38872[i3];
            long j3 = this.f38873;
            if (j2 > j3) {
                j2 -= this.f38870;
            }
            long j4 = i2;
            if (j2 <= j4) {
                long j5 = this.f38877[i3];
                if (j5 > j3) {
                    j5 -= this.f38870;
                }
                long j6 = i;
                if (j5 >= j6 && ((j2 == j5 || i == i2 || (j2 != j4 && j5 != j6)) && (Object.class == cls || cls.isInstance(this.f38865[i3])))) {
                    iArr[iM31308] = this.f38867[i3] & 16711680;
                    iArr2[iM31308] = this.f38868[i3];
                    objArr[iM31308] = this.f38865[i3];
                    iM31308++;
                }
                int i6 = iM31308;
                return (i6 >= objArr.length || i5 == 0) ? i6 : m31308(i, i2, cls, m31328(i3), objArr, iArr, iArr2, i6);
            }
        }
        return iM31308;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int[] m31327(int i) {
        int[] iArr;
        int[][] iArr2 = f38861;
        synchronized (iArr2) {
            int length = iArr2.length - 1;
            int i2 = -1;
            while (true) {
                if (length < 0) {
                    length = i2;
                    break;
                }
                int[] iArr3 = f38861[length];
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
                int[][] iArr4 = f38861;
                int[] iArr5 = iArr4[length];
                iArr4[length] = null;
                iArr = iArr5;
            }
        }
        return (iArr == null || i > iArr.length) ? new int[C8388.m19551(i)] : iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31317(int[] iArr) {
        int i;
        synchronized (f38861) {
            while (true) {
                int[][] iArr2 = f38861;
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

    /* JADX INFO: renamed from: ֫ */
    public static void m31312(int i, Object[] objArr, int i2, int[] iArr, int[] iArr2) {
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

    /* JADX INFO: renamed from: ۧ */
    public final int m31335(int i, int i2, Class cls) {
        if (this.f38871 == 0) {
            return i2;
        }
        if (cls == null) {
            cls = Object.class;
        }
        return m31322(i, i2, m31326(), cls);
    }

    /* JADX INFO: renamed from: ۧ */
    private int m31322(int i, int i2, int i3, Class cls) {
        int i4 = i3 & 1;
        if (i4 != 0) {
            int iM31321 = m31321(i3);
            if (m31323(this.f38869[iM31321]) > i) {
                i2 = m31322(i, i2, iM31321, cls);
            }
        }
        if (i3 >= this.f38871) {
            return i2;
        }
        int iM31323 = m31323(this.f38872[i3]);
        int iM31324 = m31323(this.f38877[i3]);
        if (iM31323 > i && iM31323 < i2 && cls.isInstance(this.f38865[i3])) {
            i2 = iM31323;
        }
        if (iM31324 <= i || iM31324 >= i2 || !cls.isInstance(this.f38865[i3])) {
            iM31324 = i2;
        }
        return (iM31323 >= iM31324 || i4 == 0) ? iM31324 : m31322(i, iM31324, m31328(i3), cls);
    }

    /* JADX INFO: renamed from: ܽ */
    private int m31326() {
        return Integer.highestOneBit(this.f38871) - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    private long m31309(int i) {
        int i2 = i & 1;
        long jM31309 = i2 != 0 ? m31309(m31321(i)) : 0L;
        if (i < this.f38871) {
            jM31309 = Math.max(jM31309, this.f38877[i]);
            if (i2 != 0) {
                jM31309 = Math.max(jM31309, m31309(m31328(i)));
            }
        }
        this.f38869[i] = jM31309;
        return jM31309;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m31324() {
        Object[] objArr;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        int[] iArr2;
        int i;
        if (this.f38871 == 0) {
            return;
        }
        for (int i2 = 1; i2 < this.f38871; i2++) {
            long[] jArr3 = this.f38872;
            long j = jArr3[i2];
            if (j < jArr3[i2 - 1]) {
                Object obj = this.f38865[i2];
                long j2 = this.f38877[i2];
                int i3 = this.f38867[i2];
                int i4 = this.f38868[i2];
                int i5 = i2;
                while (true) {
                    objArr = this.f38865;
                    int i6 = i5 - 1;
                    objArr[i5] = objArr[i6];
                    jArr = this.f38872;
                    jArr[i5] = jArr[i6];
                    jArr2 = this.f38877;
                    jArr2[i5] = jArr2[i6];
                    iArr = this.f38867;
                    iArr[i5] = iArr[i6];
                    iArr2 = this.f38868;
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
                this.f38874 = Math.min(i, this.f38874);
            }
        }
        m31309(m31326());
        if (this.f38875 == null) {
            this.f38875 = new IdentityHashMap();
        }
        for (int i7 = this.f38874; i7 < this.f38871; i7++) {
            Integer num = (Integer) this.f38875.get(this.f38865[i7]);
            if (num == null || num.intValue() != i7) {
                this.f38875.put(this.f38865[i7], Integer.valueOf(i7));
            }
        }
        this.f38874 = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m31315(String str, long j, long j2) {
        if (j2 < j) {
            throw new IndexOutOfBoundsException(C10965.m25286(C9179.m21133(str, " "), m31311(j, j2), " has end before start"));
        }
        int length = this.f38864.length();
        long j3 = length;
        if (j <= j3 && j2 <= j3) {
            if (j < 0 || j2 < 0) {
                throw new IndexOutOfBoundsException(C10965.m25286(C9179.m21133(str, " "), m31311(j, j2), " starts before 0"));
            }
        } else {
            StringBuilder sbM21133 = C9179.m21133(str, " ");
            sbM21133.append(m31311(j, j2));
            sbM21133.append(" ends beyond length ");
            sbM21133.append(length);
            throw new IndexOutOfBoundsException(sbM21133.toString());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m31319(int i, long j) {
        return (i != 3 || j == 0 || j == ((long) this.f38864.length()) || m31306(j - 1) == '\n') ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    private char m31306(long j) {
        int i = (int) j;
        if (j == i) {
            return this.f38864.charAt(i);
        }
        throw new ArithmeticException();
    }
}
