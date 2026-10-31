package l;

import android.text.TextUtils;
import java.text.Normalizer;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6W3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5232 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C22927 f16385;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f16388;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C15108 f16389 = new C15108();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f16390;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int[] f16391;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long[] f16392;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f16393;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f16394;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f16395;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C1476 f16396;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C8054 f16397;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f16398;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Thread f16399;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f16400;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C9466 f16401;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f16402;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f16403;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f16404;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f16405;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f16406;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long[] f16407;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f16408;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f16409;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f16410;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final int[] f16387 = new int[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long[] f16386 = new long[0];

    static {
        C19344 c19344 = new C19344();
        Arrays.fill(new int[32], -1);
        Arrays.fill(new int[9], -1);
        f16385 = c19344;
    }

    public C5232(C8054 c8054) {
        int[] iArr = f16387;
        this.f16391 = iArr;
        this.f16402 = iArr;
        this.f16408 = iArr;
        long[] jArr = f16386;
        this.f16392 = jArr;
        this.f16405 = iArr;
        this.f16407 = jArr;
        this.f16393 = iArr;
        this.f16404 = -1;
        this.f16397 = c8054;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m15076() {
        if (this.f16406) {
            throw new IllegalStateException("Regex matcher is already executing");
        }
        C1476 c1476 = this.f16397.f24845;
        if (this.f16396 != c1476) {
            this.f16401 = c1476.m5105();
            this.f16396 = c1476;
            this.f16391 = f16387;
        }
        this.f16406 = true;
        this.f16390 = false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0068 A[Catch: all -> 0x008c, ֡۠ܽ -> 0x008f, TRY_LEAVE, TryCatch #11 {֡۠ܽ -> 0x008f, all -> 0x008c, blocks: (B:21:0x0035, B:32:0x0056, B:34:0x005a, B:36:0x0060, B:38:0x0064, B:40:0x0068, B:22:0x003c, B:30:0x0050), top: B:96:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15111(int i, CharSequence charSequence) throws Throwable {
        boolean zM15105;
        boolean zM15100;
        C8054 c8054 = this.f16397;
        int i2 = c8054.f24828;
        int i3 = c8054.f24844;
        int i4 = c8054.f24830;
        m15076();
        boolean z = true;
        try {
            try {
                zM15105 = m15105();
                try {
                    C23576 c23576 = this.f16401.f28771;
                    if (c23576 != null && m15067(c23576, c8054, i, charSequence)) {
                        m15052(i2, i3, i4, zM15105);
                        return false;
                    }
                    C9466 c9466 = this.f16401;
                    int i5 = c9466.f28777;
                    boolean z2 = c9466.f28776;
                    if (i5 == 1) {
                        boolean zM15064 = m15064(c9466.f28778, i, charSequence);
                        m15052(i2, i3, i4, zM15105);
                        return zM15064;
                    }
                    if (i5 == 2) {
                        boolean zM15057 = m15057(i, c9466.f28779, charSequence);
                        m15052(i2, i3, i4, zM15105);
                        return zM15057;
                    }
                    try {
                        if (i5 == 3) {
                            zM15100 = m15100(i, charSequence);
                        } else if (i5 != 4) {
                            zM15100 = i5 != 5 ? m15081(c9466.f28787, i, charSequence) : m15106(i, charSequence);
                        } else {
                            try {
                                zM15100 = m15062(c9466.f28783, i, charSequence);
                                z2 = true;
                            } catch (C0292 e) {
                                e = e;
                                z = true;
                                try {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    zM15105 = true;
                                    if (z) {
                                        try {
                                            m15078(false);
                                        } finally {
                                            m15052(i2, i3, i4, zM15105);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (z) {
                                    m15078(false);
                                }
                                throw th;
                            }
                        }
                        if (zM15100) {
                            if (!c8054.f24837) {
                                C9466 c9467 = this.f16401;
                                if (c9467.f28786 || c9467.f28775 || c9467.f28781) {
                                    if (!m15087(0)) {
                                        if (z2) {
                                            try {
                                                m15078(false);
                                            } finally {
                                                m15052(i2, i3, i4, zM15105);
                                            }
                                        }
                                        return false;
                                    }
                                }
                            } else if (!m15087(0)) {
                                if (z2) {
                                    m15078(false);
                                }
                                return false;
                            }
                        }
                        if (z2) {
                            try {
                                m15078(zM15100);
                            } finally {
                                m15052(i2, i3, i4, zM15105);
                            }
                        }
                        return zM15100;
                    } catch (C0292 e2) {
                        e = e2;
                        z = z2;
                    } catch (Throwable th3) {
                        th = th3;
                        z = z2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z = false;
                }
            } catch (Throwable th5) {
                th = th5;
                z = false;
                zM15105 = false;
            }
        } catch (C0292 e3) {
            e = e3;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m15112(int i, CharSequence charSequence) throws Throwable {
        boolean zM15105;
        C8054 c8054 = this.f16397;
        C1476 c1476 = c8054.f24845;
        if (c1476.f5287 == c1476.f5296) {
            return m15111(i, charSequence);
        }
        int i2 = c8054.f24828;
        int i3 = c8054.f24844;
        int i4 = c8054.f24830;
        m15076();
        try {
            try {
                zM15105 = m15105();
                try {
                    C5855 c5855 = this.f16396.f5287;
                    C9466 c9466 = this.f16401;
                    C2410 c2410 = c9466.f28785;
                    if (c2410 != null) {
                        boolean zM15059 = m15059(c2410, i, charSequence);
                        m15052(i2, i3, i4, zM15105);
                        return zM15059;
                    }
                    C16292 c16292 = c9466.f28779;
                    if (c16292 == null) {
                        boolean zM15082 = m15082(c5855, i, charSequence);
                        m15052(i2, i3, i4, zM15105);
                        return zM15082;
                    }
                    if (c16292.f50105 && c5855.getClass() == C0085.class) {
                        boolean zM15088 = m15088(i, this.f16401.f28779, charSequence);
                        m15052(i2, i3, i4, zM15105);
                        return zM15088;
                    }
                    boolean zM15060 = m15060(c5855, i, charSequence);
                    m15052(i2, i3, i4, zM15105);
                    return zM15060;
                } catch (Throwable th) {
                    th = th;
                    m15052(i2, i3, i4, zM15105);
                    throw th;
                }
            } catch (C0292 e) {
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    zM15105 = true;
                    m15052(i2, i3, i4, zM15105);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            zM15105 = false;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m15105() {
        int length = this.f16391.length;
        int i = this.f16401.f28772;
        if (length >= i) {
            return false;
        }
        m15093(i, this.f16402.length, this.f16408.length);
        this.f16391 = new int[this.f16401.f28772];
        return m15090() > 65536;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15052(int i, int i2, int i3, boolean z) {
        C8054 c8054 = this.f16397;
        c8054.f24828 = i;
        c8054.f24844 = i2;
        c8054.f24830 = i3;
        this.f16399 = null;
        this.f16406 = false;
        if (z) {
            int[] iArr = f16387;
            this.f16393 = iArr;
            this.f16405 = iArr;
            this.f16408 = iArr;
            this.f16402 = iArr;
            this.f16391 = iArr;
            long[] jArr = f16386;
            this.f16392 = jArr;
            this.f16407 = jArr;
            this.f16410 = 0;
            this.f16388 = 0;
            this.f16404 = -1;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m15094(int i, int i2, CharSequence charSequence) {
        C9466 c9466 = this.f16401;
        int i3 = c9466.f28777;
        if (i3 == 1) {
            return m15064(c9466.f28778, i2, charSequence);
        }
        if (i3 == 3) {
            return m15100(i2, charSequence);
        }
        if (i3 == 4) {
            return m15062(c9466.f28783, i2, charSequence);
        }
        return m15081(i, i2, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0065 A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #0 {all -> 0x0104, blocks: (B:14:0x0032, B:16:0x0036, B:17:0x003b, B:20:0x0043, B:23:0x0049, B:25:0x0053, B:27:0x0057, B:29:0x005d, B:31:0x0061, B:33:0x0065, B:39:0x0073, B:45:0x008a, B:47:0x0090, B:51:0x0098, B:54:0x00a7, B:56:0x00ab, B:58:0x00b1, B:60:0x00b5, B:66:0x00c3, B:62:0x00b9, B:69:0x00cd, B:77:0x00dc, B:79:0x00e6, B:81:0x00ec, B:83:0x00f6, B:85:0x00fb, B:52:0x009d, B:86:0x00fe, B:42:0x0083), top: B:92:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9 A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #0 {all -> 0x0104, blocks: (B:14:0x0032, B:16:0x0036, B:17:0x003b, B:20:0x0043, B:23:0x0049, B:25:0x0053, B:27:0x0057, B:29:0x005d, B:31:0x0061, B:33:0x0065, B:39:0x0073, B:45:0x008a, B:47:0x0090, B:51:0x0098, B:54:0x00a7, B:56:0x00ab, B:58:0x00b1, B:60:0x00b5, B:66:0x00c3, B:62:0x00b9, B:69:0x00cd, B:77:0x00dc, B:79:0x00e6, B:81:0x00ec, B:83:0x00f6, B:85:0x00fb, B:52:0x009d, B:86:0x00fe, B:42:0x0083), top: B:92:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m15082(C5855 c5855, int i, CharSequence charSequence) {
        C12618 c12618 = this.f16401.f28770;
        if (!(c5855 instanceof C0085) && c12618 == null && c5855.getClass() != C5004.class && c5855.getClass() != C17932.class) {
            throw new UnsupportedOperationException("Regex program does not support search root: ".concat(c5855.getClass().getName()));
        }
        try {
            if (c12618 != null) {
                boolean zM15083 = c12618.f38029 ? m15083(c12618, i, charSequence) : m15063(c12618, i, charSequence);
                m15078(zM15083);
                return zM15083;
            }
            boolean z = c5855 instanceof C0085;
            C8054 c8054 = this.f16397;
            if (!z) {
                boolean zM15094 = m15094(this.f16401.f28784, i, charSequence);
                if (zM15094) {
                    if (!c8054.f24837) {
                        C9466 c9466 = this.f16401;
                        if (c9466.f28786 || c9466.f28775 || c9466.f28781) {
                            if (!m15087(0)) {
                                m15078(false);
                                return false;
                            }
                        }
                    } else if (!m15087(0)) {
                        m15078(false);
                        return false;
                    }
                }
                m15078(zM15094);
                return zM15094;
            }
            int i2 = c8054.f24844 - ((C0085) c5855).f1019;
            boolean z2 = c5855 instanceof C21959;
            C20755 c20755 = c8054.f24837 ? null : this.f16401.f28773;
            while (i <= i2) {
                if (c8054.m21407()) {
                    this.f16390 = true;
                    m15078(false);
                    return false;
                }
                if (c20755 != null ? m15066(c20755, i, charSequence) : m15094(this.f16401.f28784, i, charSequence)) {
                    if (!c8054.f24837) {
                        C9466 c9467 = this.f16401;
                        if (c9467.f28786 || c9467.f28775 || c9467.f28781) {
                            if (!m15087(0)) {
                                m15078(false);
                                return false;
                            }
                        }
                    } else if (!m15087(0)) {
                        m15078(false);
                        return false;
                    }
                    c8054.f24855 = i;
                    c8054.f24832[0] = i;
                    m15078(true);
                    return true;
                }
                if (this.f16390) {
                    m15078(false);
                    return false;
                }
                if (!z2 || i == i2) {
                    i++;
                } else {
                    int i3 = i + 1;
                    i = (Character.isHighSurrogate(charSequence.charAt(i)) && i3 < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i3))) ? i + 2 : i3;
                }
            }
            c8054.f24842 = true;
            m15078(false);
            return false;
        } catch (Throwable th) {
            m15078(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m15078(boolean z) {
        if (!z) {
            m15069(0);
            int i = this.f16388;
            while (true) {
                i -= 32;
                if (i < 0) {
                    break;
                } else {
                    m15048(i);
                }
            }
            this.f16388 = 0;
            this.f16404 = -1;
        }
        this.f16409 = 0;
        this.f16398 = 0;
        this.f16388 = 0;
        this.f16404 = -1;
        if (m15090() > 65536) {
            int[] iArr = f16387;
            this.f16393 = iArr;
            this.f16405 = iArr;
            this.f16408 = iArr;
            this.f16402 = iArr;
            this.f16391 = iArr;
            long[] jArr = f16386;
            this.f16392 = jArr;
            this.f16407 = jArr;
            this.f16410 = 0;
            this.f16388 = 0;
            this.f16404 = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0092 A[PHI: r13 r14
      0x0092: PHI (r13v6 int) = (r13v2 int), (r13v7 int), (r13v7 int) binds: [B:33:0x0081, B:35:0x0088, B:37:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r14v5 int) = (r14v1 int), (r14v6 int), (r14v6 int) binds: [B:33:0x0081, B:35:0x0088, B:37:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15063(C12618 c12618, int i, CharSequence charSequence) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int iIndexOf;
        int[] iArr = c12618.f38032;
        int[] iArr2 = c12618.f38030;
        int length = iArr.length;
        C8054 c8054 = this.f16397;
        int i5 = c8054.f24844 - length;
        int i6 = length - 1;
        char c = (char) iArr[i6];
        boolean z2 = charSequence instanceof InterfaceC23008;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        int iMax = i;
        while (iMax <= i5) {
            if (c8054.m21407()) {
                this.f16390 = true;
                return z3;
            }
            if (z2) {
                int i9 = iMax + length;
                char cCharAt = charSequence.charAt(i9 - 1);
                if (cCharAt != c) {
                    int i10 = length - iArr2[cCharAt & 127];
                    i2 = i5;
                    if (i10 > 2) {
                        iMax += i10;
                        i3 = i6;
                    } else {
                        c8054.m21413();
                        int i11 = c8054.f24844;
                        int i12 = i11 - 1;
                        i3 = i6;
                        if (!(charSequence instanceof InterfaceC23008)) {
                            while (true) {
                                if (i9 > i12) {
                                    iIndexOf = -1;
                                    break;
                                }
                                if (charSequence.charAt(i9) == c) {
                                    iIndexOf = i9;
                                    break;
                                }
                                i9++;
                            }
                        } else {
                            iIndexOf = ((InterfaceC23008) charSequence).indexOf(c, i9, i11);
                        }
                        if (c8054.m21411()) {
                            this.f16390 = true;
                            return false;
                        }
                        if (iIndexOf < 0) {
                            c8054.f24842 = true;
                            return false;
                        }
                        int i13 = (iIndexOf - length) + 1;
                        if (i7 < 64) {
                            i7++;
                            i8 += i13 - iMax;
                            if (i7 != 64 || i8 >= 128) {
                                iMax = i13;
                            } else {
                                iMax = i13;
                                z2 = false;
                            }
                        } else {
                            iMax = i13;
                        }
                    }
                    z3 = false;
                    i5 = i2;
                    i6 = i3;
                } else {
                    i2 = i5;
                    i3 = i6;
                }
                i4 = length - 2;
                z = false;
            } else {
                i2 = i5;
                i3 = i6;
                z = false;
                i4 = i3;
            }
            while (true) {
                if (i4 < 0) {
                    c8054.f24855 = iMax;
                    if (m15081(c12618.f38031, iMax + length, charSequence)) {
                        return m15079(iMax);
                    }
                    if (!this.f16390) {
                        iMax++;
                        break;
                    }
                    return z;
                }
                if (c8054.m21407()) {
                    this.f16390 = true;
                    return z;
                }
                char cCharAt2 = charSequence.charAt(iMax + i4);
                if (cCharAt2 != iArr[i4]) {
                    iMax += Math.max((i4 + 1) - iArr2[cCharAt2 & 127], c12618.f38028[i4]);
                    break;
                }
                i4--;
            }
            z3 = false;
            i5 = i2;
            i6 = i3;
        }
        c8054.f24842 = true;
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m15083(C12618 c12618, int i, CharSequence charSequence) {
        C8054 c8054 = this.f16397;
        int i2 = c8054.f24844 - c12618.f38027;
        int[] iArr = c12618.f38032;
        while (i <= i2) {
            if (!c8054.m21407()) {
                int iM15040 = m15040(i, iArr.length, charSequence);
                if (!this.f16390) {
                    int length = iArr.length - 1;
                    while (true) {
                        if (iM15040 <= 0) {
                            c8054.f24855 = i;
                            if (m15081(c12618.f38031, c12618.f38027 + i, charSequence)) {
                                return m15079(i);
                            }
                            if (!this.f16390) {
                                i += m15040(i, 1, charSequence);
                                if (!this.f16390) {
                                    break;
                                }
                                return false;
                            }
                            return false;
                        }
                        if (c8054.m21407()) {
                            this.f16390 = true;
                            return false;
                        }
                        int iCodePointBefore = Character.codePointBefore(charSequence, i + iM15040);
                        if (iCodePointBefore != iArr[length]) {
                            i += m15040(i, Math.max((length + 1) - c12618.f38030[iCodePointBefore & 127], c12618.f38028[length]), charSequence);
                            if (!this.f16390) {
                                break;
                            }
                            return false;
                        }
                        iM15040 -= Character.charCount(iCodePointBefore);
                        length--;
                    }
                } else {
                    return false;
                }
            } else {
                this.f16390 = true;
                return false;
            }
        }
        c8054.f24842 = true;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x001b A[RETURN] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m15079(int i) {
        C8054 c8054 = this.f16397;
        if (!c8054.f24837) {
            C9466 c9466 = this.f16401;
            if (c9466.f28786 || c9466.f28775 || c9466.f28781) {
                if (!m15087(0)) {
                    return false;
                }
            }
        } else if (!m15087(0)) {
            return false;
        }
        int[] iArr = c8054.f24832;
        iArr[0] = i;
        c8054.f24855 = i;
        iArr[1] = c8054.f24822;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15060(C5855 c5855, int i, CharSequence charSequence) {
        C16292 c16292 = this.f16401.f28779;
        if (!(c5855 instanceof C0085)) {
            if (c5855.getClass() != C5004.class) {
                throw new UnsupportedOperationException("Regex program does not support search root: ".concat(c5855.getClass().getName()));
            }
            return m15057(i, c16292, charSequence);
        }
        C8054 c8054 = this.f16397;
        int i2 = c8054.f24844 - ((C0085) c5855).f1019;
        boolean z = c5855 instanceof C21959;
        while (i <= i2) {
            if (c8054.m21407()) {
                this.f16390 = true;
                return false;
            }
            this.f16403 = i;
            if ((i >= c8054.f24844 || c16292.m38318(charSequence.charAt(i))) && m15057(i, c16292, charSequence)) {
                c8054.f24832[0] = i;
                c8054.f24855 = i;
                return true;
            }
            if (this.f16390) {
                return false;
            }
            int i3 = this.f16403;
            if (i3 > i && (!c16292.f50100 || z || c16292.f50107)) {
                i = i3;
            }
            if (!z || i >= i2) {
                i++;
            } else {
                int i4 = i + 1;
                i = (Character.isHighSurrogate(charSequence.charAt(i)) && i4 < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i4))) ? i + 2 : i4;
            }
        }
        c8054.f24842 = true;
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15059(C2410 c2410, int i, CharSequence charSequence) {
        C15108 c15108 = this.f16389;
        try {
            c15108.m35810(c2410, this.f16397, charSequence, i);
            while (c15108.m35811()) {
                if (m15081(c15108.f46213, c15108.f46212, charSequence)) {
                    boolean zM15079 = m15079(c15108.f46209);
                    c15108.m35809();
                    m15078(zM15079);
                    return zM15079;
                }
                if (this.f16390) {
                    c15108.m35809();
                    m15078(false);
                    return false;
                }
            }
            this.f16390 |= c15108.f46203;
            c15108.m35809();
            m15078(false);
            return false;
        } catch (Throwable th) {
            c15108.m35809();
            m15078(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m15088(int i, C16292 c16292, CharSequence charSequence) {
        int i2 = c16292.f50109;
        int i3 = c16292.f50094;
        C8054 c8054 = this.f16397;
        int i4 = c8054.f24844 - 1;
        EnumC1497 enumC1497 = c16292.f50087.f26708;
        boolean z = enumC1497 == EnumC1497.LAZY;
        boolean z2 = enumC1497 == EnumC1497.GREEDY;
        while (i <= i4) {
            if (c8054.m21407()) {
                this.f16390 = true;
                return false;
            }
            if (i >= c8054.f24844 || c16292.m38318(charSequence.charAt(i))) {
                if (i >= c8054.f24844) {
                    c8054.f24842 = true;
                } else {
                    if (z && charSequence.charAt(i) == i3 && (c8054.f24820 != 1 || i + 1 == c8054.f24844)) {
                        m15091(i + 1);
                        c8054.f24832[0] = i;
                        c8054.f24855 = i;
                        return true;
                    }
                    if (i >= c8054.f24844) {
                        c8054.f24842 = true;
                    } else if (charSequence.charAt(i) == i2) {
                        int i5 = i + 1;
                        m15091(i5);
                        if (i5 >= c8054.f24844) {
                            c8054.f24842 = true;
                        } else if (charSequence.charAt(i5) == i3 && (c8054.f24820 != 1 || i + 2 == c8054.f24844)) {
                            m15091(i + 2);
                            c8054.f24832[0] = i;
                            c8054.f24855 = i;
                            return true;
                        }
                        if (!z2) {
                            continue;
                        }
                    }
                    if (z) {
                        continue;
                    } else if (i >= c8054.f24844) {
                        c8054.f24842 = true;
                    } else if (charSequence.charAt(i) == i3 && (c8054.f24820 != 1 || i + 1 == c8054.f24844)) {
                        m15091(i + 1);
                        c8054.f24832[0] = i;
                        c8054.f24855 = i;
                        return true;
                    }
                }
            }
            i++;
        }
        c8054.f24842 = true;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x01de A[Catch: all -> 0x0214, TRY_ENTER, TryCatch #0 {all -> 0x0214, blocks: (B:102:0x0122, B:106:0x0133, B:108:0x0139, B:114:0x014c, B:118:0x015d, B:120:0x0163, B:135:0x0193, B:137:0x0197, B:143:0x01a9, B:144:0x01ac, B:147:0x01b3, B:149:0x01b7, B:150:0x01ba, B:162:0x01de, B:176:0x0205, B:163:0x01e1, B:165:0x01e7, B:167:0x01eb, B:169:0x01ef), top: B:519:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x01e1 A[Catch: all -> 0x0214, TryCatch #0 {all -> 0x0214, blocks: (B:102:0x0122, B:106:0x0133, B:108:0x0139, B:114:0x014c, B:118:0x015d, B:120:0x0163, B:135:0x0193, B:137:0x0197, B:143:0x01a9, B:144:0x01ac, B:147:0x01b3, B:149:0x01b7, B:150:0x01ba, B:162:0x01de, B:176:0x0205, B:163:0x01e1, B:165:0x01e7, B:167:0x01eb, B:169:0x01ef), top: B:519:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:174:0x0202  */
    /* JADX WARN: Code duplicated, block: B:175:0x0204  */
    /* JADX WARN: Code duplicated, block: B:178:0x020a  */
    /* JADX WARN: Code duplicated, block: B:183:0x0218  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0255  */
    /* JADX WARN: Code duplicated, block: B:201:0x0258  */
    /* JADX WARN: Code duplicated, block: B:204:0x025d  */
    /* JADX WARN: Code duplicated, block: B:205:0x0260  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0279  */
    /* JADX WARN: Code duplicated, block: B:255:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:258:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:261:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:262:0x0305  */
    /* JADX WARN: Code duplicated, block: B:263:0x0307  */
    /* JADX WARN: Code duplicated, block: B:266:0x030d A[Catch: all -> 0x02ef, TRY_ENTER, TryCatch #3 {all -> 0x02ef, blocks: (B:234:0x02b8, B:235:0x02bb, B:238:0x02c4, B:240:0x02c8, B:241:0x02cc, B:244:0x02d3, B:246:0x02dd, B:256:0x02f5, B:266:0x030d, B:269:0x031d, B:291:0x0362, B:298:0x0375, B:306:0x0388, B:311:0x0398, B:313:0x039e, B:332:0x03d8, B:338:0x03ec, B:340:0x03f2, B:272:0x0328, B:274:0x032e, B:279:0x0338, B:280:0x0346), top: B:523:0x02bb }] */
    /* JADX WARN: Code duplicated, block: B:267:0x0316  */
    /* JADX WARN: Code duplicated, block: B:269:0x031d A[Catch: all -> 0x02ef, TryCatch #3 {all -> 0x02ef, blocks: (B:234:0x02b8, B:235:0x02bb, B:238:0x02c4, B:240:0x02c8, B:241:0x02cc, B:244:0x02d3, B:246:0x02dd, B:256:0x02f5, B:266:0x030d, B:269:0x031d, B:291:0x0362, B:298:0x0375, B:306:0x0388, B:311:0x0398, B:313:0x039e, B:332:0x03d8, B:338:0x03ec, B:340:0x03f2, B:272:0x0328, B:274:0x032e, B:279:0x0338, B:280:0x0346), top: B:523:0x02bb }] */
    /* JADX WARN: Code duplicated, block: B:270:0x0323  */
    /* JADX WARN: Code duplicated, block: B:272:0x0328 A[Catch: all -> 0x02ef, TryCatch #3 {all -> 0x02ef, blocks: (B:234:0x02b8, B:235:0x02bb, B:238:0x02c4, B:240:0x02c8, B:241:0x02cc, B:244:0x02d3, B:246:0x02dd, B:256:0x02f5, B:266:0x030d, B:269:0x031d, B:291:0x0362, B:298:0x0375, B:306:0x0388, B:311:0x0398, B:313:0x039e, B:332:0x03d8, B:338:0x03ec, B:340:0x03f2, B:272:0x0328, B:274:0x032e, B:279:0x0338, B:280:0x0346), top: B:523:0x02bb }] */
    /* JADX WARN: Code duplicated, block: B:274:0x032e A[Catch: all -> 0x02ef, TryCatch #3 {all -> 0x02ef, blocks: (B:234:0x02b8, B:235:0x02bb, B:238:0x02c4, B:240:0x02c8, B:241:0x02cc, B:244:0x02d3, B:246:0x02dd, B:256:0x02f5, B:266:0x030d, B:269:0x031d, B:291:0x0362, B:298:0x0375, B:306:0x0388, B:311:0x0398, B:313:0x039e, B:332:0x03d8, B:338:0x03ec, B:340:0x03f2, B:272:0x0328, B:274:0x032e, B:279:0x0338, B:280:0x0346), top: B:523:0x02bb }] */
    /* JADX WARN: Code duplicated, block: B:279:0x0338 A[Catch: all -> 0x02ef, TryCatch #3 {all -> 0x02ef, blocks: (B:234:0x02b8, B:235:0x02bb, B:238:0x02c4, B:240:0x02c8, B:241:0x02cc, B:244:0x02d3, B:246:0x02dd, B:256:0x02f5, B:266:0x030d, B:269:0x031d, B:291:0x0362, B:298:0x0375, B:306:0x0388, B:311:0x0398, B:313:0x039e, B:332:0x03d8, B:338:0x03ec, B:340:0x03f2, B:272:0x0328, B:274:0x032e, B:279:0x0338, B:280:0x0346), top: B:523:0x02bb }] */
    /* JADX WARN: Code duplicated, block: B:284:0x0352 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:286:0x0356  */
    /* JADX WARN: Code duplicated, block: B:289:0x035f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:293:0x0369  */
    /* JADX WARN: Code duplicated, block: B:296:0x0372 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:300:0x037a  */
    /* JADX WARN: Code duplicated, block: B:303:0x0383  */
    /* JADX WARN: Code duplicated, block: B:308:0x038f  */
    /* JADX WARN: Code duplicated, block: B:311:0x0398 A[Catch: all -> 0x02ef, TRY_ENTER, TryCatch #3 {all -> 0x02ef, blocks: (B:234:0x02b8, B:235:0x02bb, B:238:0x02c4, B:240:0x02c8, B:241:0x02cc, B:244:0x02d3, B:246:0x02dd, B:256:0x02f5, B:266:0x030d, B:269:0x031d, B:291:0x0362, B:298:0x0375, B:306:0x0388, B:311:0x0398, B:313:0x039e, B:332:0x03d8, B:338:0x03ec, B:340:0x03f2, B:272:0x0328, B:274:0x032e, B:279:0x0338, B:280:0x0346), top: B:523:0x02bb }] */
    /* JADX WARN: Code duplicated, block: B:315:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:318:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:323:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:326:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:329:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:334:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:337:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:342:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:347:0x040a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:432:0x055d  */
    /* JADX WARN: Code duplicated, block: B:433:0x055f  */
    /* JADX WARN: Code duplicated, block: B:438:0x056b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:440:0x0572  */
    /* JADX WARN: Code duplicated, block: B:461:0x05b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:462:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:465:0x05c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:466:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:468:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:471:0x05d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:473:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:475:0x05e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:497:0x062d  */
    /* JADX WARN: Code duplicated, block: B:501:0x0634 A[LOOP:15: B:501:0x0634->B:518:0x066a, LOOP_START, PHI: r5 r6
      0x0634: PHI (r5v3 int) = (r5v2 int), (r5v5 int) binds: [B:499:0x0631, B:518:0x066a] A[DONT_GENERATE, DONT_INLINE]
      0x0634: PHI (r6v3 int) = (r6v2 int), (r6v5 int) binds: [B:499:0x0631, B:518:0x066a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:504:0x063d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:508:0x0644  */
    /* JADX WARN: Code duplicated, block: B:511:0x0649 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:512:0x064b  */
    /* JADX WARN: Code duplicated, block: B:513:0x065c  */
    /* JADX WARN: Code duplicated, block: B:518:0x066a A[LOOP:15: B:501:0x0634->B:518:0x066a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:561:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x03d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:0x03f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x0374 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x039e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:0x0400 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x056d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x0666 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x0648 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x063f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x0648 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15057(int i, C16292 c16292, CharSequence charSequence) throws Throwable {
        int iM15075;
        int i2;
        int iM15102;
        int iM15076;
        int iM15077;
        boolean z;
        int i3;
        int iM15078;
        Throwable th;
        boolean z2;
        boolean z3;
        int i4;
        int iCharAt;
        int i5;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        boolean z6;
        int i8;
        Throwable th2;
        int i9 = c16292.f50095;
        int i10 = c16292.f50096;
        int i11 = c16292.f50102;
        int i12 = c16292.f50109;
        int i13 = c16292.f50094;
        C8760 c8760 = c16292.f50087;
        C8054 c8054 = this.f16397;
        switch (i9) {
            case 0:
                Object obj = c16292.f50101;
                int i14 = c16292.f50091;
                boolean z7 = c16292.f50100;
                InterfaceC10795 interfaceC10795 = (InterfaceC10795) obj;
                int i15 = c8054.f24844;
                int i16 = 0;
                int iMax = i;
                while (iMax < i15) {
                    int iCodePointAt = z7 ? Character.codePointAt(charSequence, iMax) : charSequence.charAt(iMax);
                    int iCharCount = z7 ? Character.charCount(iCodePointAt) : 1;
                    if (iMax + iCharCount > i15) {
                        c8054.f24842 = true;
                        iCodePointAt = charSequence.charAt(iMax);
                        iCharCount = 1;
                    }
                    if (interfaceC10795.mo2465(iCodePointAt)) {
                        iMax += iCharCount;
                        i16++;
                        if (c8054.m21407()) {
                            this.f16390 = true;
                            return false;
                        }
                    } else {
                        if (iMax >= i15) {
                            c8054.f24842 = true;
                        }
                        this.f16403 = iMax;
                        if (i16 < i14) {
                            return false;
                        }
                        while (true) {
                            iM15075 = m15075(iMax, c16292, charSequence);
                            if (this.f16390) {
                                return false;
                            }
                            if (iM15075 >= 0) {
                                m15091(iM15075);
                                return true;
                            }
                            i2 = i16 - 1;
                            if (i16 <= i14) {
                                return false;
                            }
                            if (z7) {
                                iMax = Math.max(i, iMax - Character.charCount(Character.codePointBefore(charSequence, iMax)));
                            } else {
                                iMax--;
                            }
                            if (c8054.m21407()) {
                                this.f16390 = true;
                                return false;
                            }
                            i16 = i2;
                        }
                    }
                }
                if (iMax >= i15) {
                    c8054.f24842 = true;
                }
                this.f16403 = iMax;
                if (i16 < i14) {
                    return false;
                }
                while (true) {
                    iM15075 = m15075(iMax, c16292, charSequence);
                    if (this.f16390) {
                        return false;
                    }
                    if (iM15075 >= 0) {
                        m15091(iM15075);
                        return true;
                    }
                    i2 = i16 - 1;
                    if (i16 <= i14) {
                        return false;
                    }
                    if (z7) {
                        iMax = Math.max(i, iMax - Character.charCount(Character.codePointBefore(charSequence, iMax)));
                    } else {
                        iMax--;
                    }
                    if (c8054.m21407()) {
                        this.f16390 = true;
                        return false;
                    }
                    i16 = i2;
                }
                break;
            case 1:
                EnumC1497 enumC1497 = c8760.f26708;
                EnumC1497 enumC1498 = EnumC1497.LAZY;
                if (enumC1497 == enumC1498) {
                    int iM15079 = m15075(i, c16292, charSequence);
                    if (!this.f16390) {
                        if (iM15079 >= 0) {
                            m15091(iM15079);
                            return true;
                        }
                        iM15102 = m15102(i, c16292, charSequence);
                        if (!this.f16390) {
                            if (iM15102 >= 0) {
                                int[] iArr = c8054.f24832;
                                iArr[0] = c8054.f24855;
                                c8054.m21416(iM15102);
                                iArr[1] = iM15102;
                                iM15077 = m15075(iM15102, c16292, charSequence);
                                if (!this.f16390) {
                                    if (iM15077 >= 0) {
                                        m15091(iM15077);
                                        return true;
                                    }
                                    if (enumC1497 == EnumC1497.GREEDY) {
                                        iM15076 = m15075(i, c16292, charSequence);
                                        if (!this.f16390 && iM15076 >= 0) {
                                            m15091(iM15076);
                                            return true;
                                        }
                                    }
                                }
                            } else if (enumC1497 != enumC1498) {
                                iM15076 = m15075(i, c16292, charSequence);
                                if (!this.f16390) {
                                    m15091(iM15076);
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    iM15102 = m15102(i, c16292, charSequence);
                    if (!this.f16390) {
                        if (iM15102 >= 0) {
                            int[] iArr2 = c8054.f24832;
                            iArr2[0] = c8054.f24855;
                            c8054.m21416(iM15102);
                            iArr2[1] = iM15102;
                            iM15077 = m15075(iM15102, c16292, charSequence);
                            if (!this.f16390) {
                                if (iM15077 >= 0) {
                                    m15091(iM15077);
                                    return true;
                                }
                                if (enumC1497 == EnumC1497.GREEDY) {
                                    iM15076 = m15075(i, c16292, charSequence);
                                    if (!this.f16390) {
                                        m15091(iM15076);
                                        return true;
                                    }
                                }
                            }
                        } else if (enumC1497 != enumC1498) {
                            iM15076 = m15075(i, c16292, charSequence);
                            if (!this.f16390) {
                                m15091(iM15076);
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 2:
                int i17 = i;
                int i18 = 0;
                while (true) {
                    int i19 = c8760.f26706;
                    EnumC1497 enumC1499 = c8760.f26708;
                    int i20 = c8760.f26707;
                    if (i18 < i19) {
                        int iM15103 = m15102(i17, c16292, charSequence);
                        if (!this.f16390) {
                            if (iM15103 < 0) {
                                m15056(c16292, i17, true);
                                return false;
                            }
                            m15091(iM15103);
                            i18++;
                            if (c8054.m21407()) {
                                this.f16390 = true;
                                return false;
                            }
                            i17 = iM15103;
                        }
                    } else {
                        if (c8054.f24831) {
                            this.f16390 = true;
                            return false;
                        }
                        if (enumC1499 != EnumC1497.LAZY) {
                            while (i18 < i20) {
                                int iM15104 = m15102(i17, c16292, charSequence);
                                if (!this.f16390) {
                                    if (iM15104 < 0) {
                                        if (i18 < i20) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        i3 = i17;
                                        do {
                                            iM15078 = m15075(i3, c16292, charSequence);
                                            if (this.f16390) {
                                                if (iM15078 >= 0) {
                                                    m15091(iM15078);
                                                    return true;
                                                }
                                                if (enumC1499 != EnumC1497.POSSESSIVE || i18 <= c8760.f26706) {
                                                    m15056(c16292, i17, z);
                                                    return false;
                                                }
                                                i3 -= c16292.f50108;
                                                i18--;
                                            }
                                        } while (!c8054.m21407());
                                        this.f16390 = true;
                                        return false;
                                    }
                                    m15091(iM15104);
                                    i18++;
                                    if (c8054.m21407()) {
                                        this.f16390 = true;
                                        return false;
                                    }
                                    i17 = iM15104;
                                }
                            }
                            if (i18 < i20) {
                                z = true;
                            } else {
                                z = false;
                            }
                            i3 = i17;
                            do {
                                iM15078 = m15075(i3, c16292, charSequence);
                                if (this.f16390) {
                                    if (iM15078 >= 0) {
                                        m15091(iM15078);
                                        return true;
                                    }
                                    if (enumC1499 != EnumC1497.POSSESSIVE) {
                                    }
                                    m15056(c16292, i17, z);
                                    return false;
                                }
                            } while (!c8054.m21407());
                            this.f16390 = true;
                            return false;
                        }
                        while (true) {
                            int iM150710 = m15075(i17, c16292, charSequence);
                            if (!this.f16390) {
                                if (iM150710 >= 0) {
                                    m15091(iM150710);
                                    return true;
                                }
                                if (i18 < i20) {
                                    int iM15105 = m15102(i17, c16292, charSequence);
                                    if (!this.f16390) {
                                        if (iM15105 < 0) {
                                            m15056(c16292, i17, true);
                                            return false;
                                        }
                                        m15091(iM15105);
                                        i18++;
                                        if (c8054.m21407()) {
                                            this.f16390 = true;
                                            return false;
                                        }
                                        i17 = iM15105;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            case 3:
                boolean z8 = c8054.f24837;
                if (z8) {
                    C8760 c8761 = c8760;
                    int i21 = c8761.f26706;
                    int i22 = c8761.f26703;
                    int i23 = c8761.f26705;
                    int i24 = this.f16391[i23];
                    int[] iArr3 = c8054.f24832;
                    int i25 = iArr3[i22];
                    int i26 = iArr3[i22 + 1];
                    int size = z8 ? c8054.f24823.f58949.size() : -1;
                    this.f16391[i23] = -1;
                    try {
                        int i27 = c16292.f50102;
                        int i28 = c16292.f50096;
                        int iM15041 = i;
                        int i29 = 0;
                        while (i29 < i21) {
                            int i30 = i29;
                            int i31 = iM15041;
                            int i32 = i27;
                            C8760 c8762 = c8761;
                            int i33 = i28;
                            iM15041 = m15041(i27, i28, charSequence, i31, c8054.f24844);
                            if (iM15041 < 0) {
                                m15056(c16292, i31, true);
                                m15051(i23, i22, i24, i25, i26, size);
                                return false;
                            }
                            c8054.m21416(iM15041);
                            m15049(i22, i31, iM15041);
                            i29 = i30 + 1;
                            if (c8054.m21407()) {
                                this.f16390 = true;
                                m15051(i23, i22, i24, i25, i26, size);
                                return false;
                            }
                            c8761 = c8762;
                            i27 = i32;
                            i28 = i33;
                        }
                        int i34 = iM15041;
                        boolean zM15084 = c8761.f26708 == EnumC1497.LAZY ? m15084(c16292, i34, i21, charSequence) : m15065(c16292, i34, i21, charSequence);
                        if (!zM15084) {
                            m15051(i23, i22, i24, i25, i26, size);
                        }
                        return zM15084;
                    } catch (Throwable th3) {
                        m15051(i23, i22, i24, i25, i26, size);
                        throw th3;
                    }
                }
                int i35 = c8760.f26706;
                int i36 = c8760.f26707;
                int i37 = c8054.f24844;
                int i38 = c8760.f26705;
                int[] iArr4 = this.f16391;
                int i39 = iArr4[i38];
                boolean z9 = c8760.f26708 == EnumC1497.LAZY;
                iArr4[i38] = -1;
                int i40 = z9 ? i35 : i36;
                int i41 = i;
                boolean z10 = z9;
                C8760 c8763 = c8760;
                int i42 = 0;
                int i43 = -1;
                while (i42 < i40) {
                    if (i41 >= i37) {
                        c8054.f24842 = true;
                    } else {
                        try {
                            int i44 = i40;
                            if (charSequence.charAt(i41) == i11) {
                                int i45 = i41 + 1;
                                if (i45 >= i37) {
                                    c8054.f24842 = true;
                                } else if (charSequence.charAt(i45) == i10) {
                                    i43 = i41 + 2;
                                    i42++;
                                    if (c8054.m21407()) {
                                        this.f16390 = true;
                                        if (i43 >= 0) {
                                            c8054.m21416(i43);
                                        }
                                        this.f16391[i38] = i39;
                                        return false;
                                    }
                                    i41 = i43;
                                    i40 = i44;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            if (i43 >= 0) {
                                c8054.m21416(i43);
                            }
                            this.f16391[i38] = i39;
                            throw th;
                        }
                    }
                    if (i42 < i35) {
                        m15056(c16292, i41, true);
                        if (i43 >= 0) {
                            c8054.m21416(i43);
                        }
                        this.f16391[i38] = i39;
                        return false;
                    }
                    if (i42 < i36) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2;
                    i4 = i41;
                    while (true) {
                        if (i4 < i37) {
                            iCharAt = charSequence.charAt(i4);
                        } else {
                            iCharAt = -1;
                        }
                        if (iCharAt < 0) {
                            i5 = i35;
                            c8054.f24842 = true;
                        } else {
                            i5 = i35;
                            if (iCharAt == i13) {
                                if (c8054.f24820 != 1) {
                                    if (i4 + 1 == i37) {
                                    }
                                }
                                if (i42 > 0) {
                                    int[] iArr5 = c8054.f24832;
                                    int i46 = c8763.f26703;
                                    iArr5[i46] = i4 - 2;
                                    iArr5[i46 + 1] = i4;
                                }
                                m15091(i4 + 1);
                                return true;
                            }
                            C8760 c8764 = c8763;
                            if (z10) {
                                i35 = i5;
                                if (i42 <= i35) {
                                    i41 = i41;
                                    m15056(c16292, i41, z3);
                                    if (i43 >= 0) {
                                        c8054.m21416(i43);
                                    }
                                    this.f16391[i38] = i39;
                                    return false;
                                }
                                i41 = i41;
                                i4 -= 2;
                                i42--;
                                if (c8054.m21407()) {
                                    this.f16390 = true;
                                    if (i43 >= 0) {
                                        c8054.m21416(i43);
                                    }
                                    this.f16391[i38] = i39;
                                    return false;
                                }
                            } else {
                                if (i42 >= i36) {
                                    if (i43 >= 0) {
                                        c8054.m21416(i43);
                                    }
                                    this.f16391[i38] = i39;
                                    return false;
                                }
                                if (i4 >= i37) {
                                    c8054.f24842 = true;
                                    m15056(c16292, i4, true);
                                    if (i43 >= 0) {
                                        c8054.m21416(i43);
                                    }
                                    this.f16391[i38] = i39;
                                    return false;
                                }
                                if (iCharAt != i11) {
                                    m15056(c16292, i4, true);
                                    if (i43 >= 0) {
                                        c8054.m21416(i43);
                                    }
                                    this.f16391[i38] = i39;
                                    return false;
                                }
                                i6 = i4 + 1;
                                if (i6 >= i37) {
                                    c8054.f24842 = true;
                                    m15056(c16292, i4, true);
                                    if (i43 >= 0) {
                                        c8054.m21416(i43);
                                    }
                                    this.f16391[i38] = i39;
                                    return false;
                                }
                                if (charSequence.charAt(i6) != i10) {
                                    m15056(c16292, i4, true);
                                    if (i43 >= 0) {
                                        c8054.m21416(i43);
                                    }
                                    this.f16391[i38] = i39;
                                    return false;
                                }
                                i4 += 2;
                                i42++;
                                try {
                                    if (c8054.m21407()) {
                                        this.f16390 = true;
                                        if (i4 >= 0) {
                                            c8054.m21416(i4);
                                        }
                                        this.f16391[i38] = i39;
                                        return false;
                                    }
                                    i41 = i41;
                                    i43 = i4;
                                    i35 = i5;
                                } catch (Throwable th5) {
                                    th = th5;
                                    i43 = i4;
                                    if (i43 >= 0) {
                                        c8054.m21416(i43);
                                    }
                                    this.f16391[i38] = i39;
                                    throw th;
                                }
                            }
                            z3 = z3;
                            c8763 = c8764;
                            i13 = i13;
                        }
                        C8760 c8765 = c8763;
                        if (z10) {
                            i35 = i5;
                            if (i42 <= i35) {
                                i41 = i41;
                                m15056(c16292, i41, z3);
                                if (i43 >= 0) {
                                    c8054.m21416(i43);
                                }
                                this.f16391[i38] = i39;
                                return false;
                            }
                            i41 = i41;
                            i4 -= 2;
                            i42--;
                            if (c8054.m21407()) {
                                this.f16390 = true;
                                if (i43 >= 0) {
                                    c8054.m21416(i43);
                                }
                                this.f16391[i38] = i39;
                                return false;
                            }
                        } else {
                            if (i42 >= i36) {
                                if (i43 >= 0) {
                                    c8054.m21416(i43);
                                }
                                this.f16391[i38] = i39;
                                return false;
                            }
                            if (i4 >= i37) {
                                c8054.f24842 = true;
                                m15056(c16292, i4, true);
                                if (i43 >= 0) {
                                    c8054.m21416(i43);
                                }
                                this.f16391[i38] = i39;
                                return false;
                            }
                            if (iCharAt != i11) {
                                m15056(c16292, i4, true);
                                if (i43 >= 0) {
                                    c8054.m21416(i43);
                                }
                                this.f16391[i38] = i39;
                                return false;
                            }
                            i6 = i4 + 1;
                            if (i6 >= i37) {
                                c8054.f24842 = true;
                                m15056(c16292, i4, true);
                                if (i43 >= 0) {
                                    c8054.m21416(i43);
                                }
                                this.f16391[i38] = i39;
                                return false;
                            }
                            if (charSequence.charAt(i6) != i10) {
                                m15056(c16292, i4, true);
                                if (i43 >= 0) {
                                    c8054.m21416(i43);
                                }
                                this.f16391[i38] = i39;
                                return false;
                            }
                            i4 += 2;
                            i42++;
                            if (c8054.m21407()) {
                                this.f16390 = true;
                                if (i4 >= 0) {
                                    c8054.m21416(i4);
                                }
                                this.f16391[i38] = i39;
                                return false;
                            }
                            i41 = i41;
                            i43 = i4;
                            i35 = i5;
                        }
                        z3 = z3;
                        c8763 = c8765;
                        i13 = i13;
                    }
                }
                if (i42 < i35) {
                    m15056(c16292, i41, true);
                    if (i43 >= 0) {
                        c8054.m21416(i43);
                    }
                    this.f16391[i38] = i39;
                    return false;
                }
                if (i42 < i36) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2;
                i4 = i41;
                while (true) {
                    if (i4 < i37) {
                        iCharAt = charSequence.charAt(i4);
                    } else {
                        iCharAt = -1;
                    }
                    if (iCharAt < 0) {
                        i5 = i35;
                        c8054.f24842 = true;
                    } else {
                        i5 = i35;
                        if (iCharAt == i13) {
                            if (c8054.f24820 != 1) {
                                if (i4 + 1 == i37) {
                                }
                            }
                            if (i42 > 0) {
                                int[] iArr6 = c8054.f24832;
                                int i47 = c8763.f26703;
                                iArr6[i47] = i4 - 2;
                                iArr6[i47 + 1] = i4;
                            }
                            m15091(i4 + 1);
                            return true;
                        }
                        C8760 c8766 = c8763;
                        if (z10) {
                            i35 = i5;
                            if (i42 <= i35) {
                                i41 = i41;
                                m15056(c16292, i41, z3);
                                if (i43 >= 0) {
                                    c8054.m21416(i43);
                                }
                                this.f16391[i38] = i39;
                                return false;
                            }
                            i41 = i41;
                            i4 -= 2;
                            i42--;
                            if (c8054.m21407()) {
                                this.f16390 = true;
                                if (i43 >= 0) {
                                    c8054.m21416(i43);
                                }
                                this.f16391[i38] = i39;
                                return false;
                            }
                        } else {
                            if (i42 >= i36) {
                                if (i43 >= 0) {
                                    c8054.m21416(i43);
                                }
                                this.f16391[i38] = i39;
                                return false;
                            }
                            if (i4 >= i37) {
                                c8054.f24842 = true;
                                m15056(c16292, i4, true);
                                if (i43 >= 0) {
                                    c8054.m21416(i43);
                                }
                                this.f16391[i38] = i39;
                                return false;
                            }
                            if (iCharAt != i11) {
                                m15056(c16292, i4, true);
                                if (i43 >= 0) {
                                    c8054.m21416(i43);
                                }
                                this.f16391[i38] = i39;
                                return false;
                            }
                            i6 = i4 + 1;
                            if (i6 >= i37) {
                                c8054.f24842 = true;
                                m15056(c16292, i4, true);
                                if (i43 >= 0) {
                                    c8054.m21416(i43);
                                }
                                this.f16391[i38] = i39;
                                return false;
                            }
                            if (charSequence.charAt(i6) != i10) {
                                m15056(c16292, i4, true);
                                if (i43 >= 0) {
                                    c8054.m21416(i43);
                                }
                                this.f16391[i38] = i39;
                                return false;
                            }
                            i4 += 2;
                            i42++;
                            if (c8054.m21407()) {
                                this.f16390 = true;
                                if (i4 >= 0) {
                                    c8054.m21416(i4);
                                }
                                this.f16391[i38] = i39;
                                return false;
                            }
                            i41 = i41;
                            i43 = i4;
                            i35 = i5;
                        }
                        z3 = z3;
                        c8763 = c8766;
                        i13 = i13;
                    }
                    C8760 c8767 = c8763;
                    if (z10) {
                        i35 = i5;
                        if (i42 <= i35) {
                            i41 = i41;
                            m15056(c16292, i41, z3);
                            if (i43 >= 0) {
                                c8054.m21416(i43);
                            }
                            this.f16391[i38] = i39;
                            return false;
                        }
                        i41 = i41;
                        i4 -= 2;
                        i42--;
                        if (c8054.m21407()) {
                            this.f16390 = true;
                            if (i43 >= 0) {
                                c8054.m21416(i43);
                            }
                            this.f16391[i38] = i39;
                            return false;
                        }
                    } else {
                        if (i42 >= i36) {
                            if (i43 >= 0) {
                                c8054.m21416(i43);
                            }
                            this.f16391[i38] = i39;
                            return false;
                        }
                        if (i4 >= i37) {
                            c8054.f24842 = true;
                            m15056(c16292, i4, true);
                            if (i43 >= 0) {
                                c8054.m21416(i43);
                            }
                            this.f16391[i38] = i39;
                            return false;
                        }
                        if (iCharAt != i11) {
                            m15056(c16292, i4, true);
                            if (i43 >= 0) {
                                c8054.m21416(i43);
                            }
                            this.f16391[i38] = i39;
                            return false;
                        }
                        i6 = i4 + 1;
                        if (i6 >= i37) {
                            c8054.f24842 = true;
                            m15056(c16292, i4, true);
                            if (i43 >= 0) {
                                c8054.m21416(i43);
                            }
                            this.f16391[i38] = i39;
                            return false;
                        }
                        if (charSequence.charAt(i6) != i10) {
                            m15056(c16292, i4, true);
                            if (i43 >= 0) {
                                c8054.m21416(i43);
                            }
                            this.f16391[i38] = i39;
                            return false;
                        }
                        i4 += 2;
                        i42++;
                        if (c8054.m21407()) {
                            this.f16390 = true;
                            if (i4 >= 0) {
                                c8054.m21416(i4);
                            }
                            this.f16391[i38] = i39;
                            return false;
                        }
                        i41 = i41;
                        i43 = i4;
                        i35 = i5;
                    }
                    z3 = z3;
                    c8763 = c8767;
                    i13 = i13;
                }
                break;
            case 4:
            default:
                return m15096(i, c16292, charSequence);
            case 5:
                if (m15101(i, c16292, charSequence)) {
                    int i48 = c8054.f24844;
                    int i49 = c8760.f26706;
                    int i50 = c8760.f26707;
                    int i51 = i + i49;
                    int i52 = i49;
                    while (i52 < i50) {
                        if (i51 >= i48) {
                            c8054.f24842 = true;
                        } else if (charSequence.charAt(i51) == i12) {
                            i51++;
                            m15091(i51);
                            i52++;
                            if (c8054.m21407()) {
                                this.f16390 = true;
                                return false;
                            }
                        }
                        if (i52 < i50) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        i7 = i51;
                        do {
                            if (i7 >= i48) {
                                c8054.f24842 = true;
                            } else if (charSequence.charAt(i7) == i13 && (c8054.f24820 != 1 || i7 + 1 == i48)) {
                                m15091(i7 + 1);
                                return true;
                            }
                            if (i52 <= i49) {
                                m15056(c16292, i51, z4);
                                return false;
                            }
                            i7--;
                            i52--;
                        } while (!c8054.m21407());
                        this.f16390 = true;
                        return false;
                    }
                    if (i52 < i50) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    i7 = i51;
                    do {
                        if (i7 >= i48) {
                            c8054.f24842 = true;
                        } else if (charSequence.charAt(i7) == i13) {
                            m15091(i7 + 1);
                            return true;
                        }
                        if (i52 <= i49) {
                            m15056(c16292, i51, z4);
                            return false;
                        }
                        i7--;
                        i52--;
                    } while (!c8054.m21407());
                    this.f16390 = true;
                    return false;
                }
                return false;
            case 6:
                if (c8054.f24837) {
                    return m15096(i, c16292, charSequence);
                }
                int i53 = c16292.f50090;
                int i54 = c8760.f26706;
                int i55 = c8760.f26707;
                int i56 = c8054.f24844;
                int i57 = 0;
                int i58 = i;
                boolean z11 = false;
                while (i57 < i54) {
                    if (i58 >= i56) {
                        c8054.f24842 = true;
                        m15056(c16292, i58, true);
                        if (i57 > 0) {
                            int[] iArr7 = c8054.f24832;
                            iArr7[i53] = i58 - 2;
                            iArr7[i53 + 1] = i58;
                            return z11;
                        }
                    } else {
                        try {
                            if (charSequence.charAt(i58) != i11) {
                                m15056(c16292, i58, true);
                                if (i57 > 0) {
                                    int[] iArr8 = c8054.f24832;
                                    iArr8[i53] = i58 - 2;
                                    iArr8[i53 + 1] = i58;
                                    return z11;
                                }
                            } else {
                                int i59 = i58 + 1;
                                if (i59 >= i56) {
                                    c8054.f24842 = true;
                                    m15056(c16292, i58, true);
                                    if (i57 > 0) {
                                        int[] iArr9 = c8054.f24832;
                                        iArr9[i53] = i58 - 2;
                                        iArr9[i53 + 1] = i58;
                                        return z11;
                                    }
                                } else if (charSequence.charAt(i59) != i10) {
                                    m15056(c16292, i58, true);
                                    if (i57 > 0) {
                                        int[] iArr10 = c8054.f24832;
                                        iArr10[i53] = i58 - 2;
                                        iArr10[i53 + 1] = i58;
                                        return z11;
                                    }
                                } else {
                                    z5 = false;
                                    i8 = i58 + 2;
                                    try {
                                        m15091(i8);
                                        i57++;
                                        if (c8054.m21407()) {
                                            this.f16390 = true;
                                            if (i57 > 0) {
                                                int[] iArr11 = c8054.f24832;
                                                iArr11[i53] = i58;
                                                iArr11[i53 + 1] = i8;
                                                return false;
                                            }
                                            return z5;
                                        }
                                        z11 = false;
                                        i58 = i8;
                                    } catch (Throwable th6) {
                                        th2 = th6;
                                        if (i57 > 0) {
                                            int[] iArr12 = c8054.f24832;
                                            iArr12[i53] = i8 - 2;
                                            iArr12[i53 + 1] = i8;
                                        }
                                        throw th2;
                                    }
                                }
                            }
                        } catch (Throwable th7) {
                            th2 = th7;
                            i8 = i58;
                            if (i57 > 0) {
                                int[] iArr13 = c8054.f24832;
                                iArr13[i53] = i8 - 2;
                                iArr13[i53 + 1] = i8;
                            }
                            throw th2;
                        }
                    }
                    return false;
                }
                z5 = false;
                if (c8054.f24831) {
                    this.f16390 = true;
                    if (i57 <= 0) {
                        return false;
                    }
                    int[] iArr14 = c8054.f24832;
                    iArr14[i53] = i58 - 2;
                    iArr14[i53 + 1] = i58;
                    return false;
                }
                while (i57 < i55) {
                    if (i58 >= i56) {
                        c8054.f24842 = true;
                    } else if (charSequence.charAt(i58) == i11) {
                        int i60 = i58 + 1;
                        if (i60 >= i56) {
                            c8054.f24842 = true;
                        } else if (charSequence.charAt(i60) == i10) {
                            i8 = i58 + 2;
                            m15091(i8);
                            i57++;
                            if (c8054.m21407()) {
                                this.f16390 = true;
                                if (i57 > 0) {
                                    int[] iArr15 = c8054.f24832;
                                    iArr15[i53] = i58;
                                    iArr15[i53 + 1] = i8;
                                    return false;
                                }
                                return z5;
                            }
                            i58 = i8;
                        }
                    }
                    if (i58 >= i56) {
                        c8054.f24842 = true;
                    } else if (charSequence.charAt(i58) == i13 && (c8054.f24820 != 1 || i58 + 1 == i56)) {
                        m15091(i58 + 1);
                        if (i57 > 0) {
                            int[] iArr16 = c8054.f24832;
                            iArr16[i53] = i58 - 2;
                            iArr16[i53 + 1] = i58;
                        }
                        return true;
                    }
                    if (i57 < i55) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    m15056(c16292, i58, z6);
                    if (i57 > 0) {
                        return false;
                    }
                    int[] iArr17 = c8054.f24832;
                    iArr17[i53] = i58 - 2;
                    iArr17[i53 + 1] = i58;
                    return false;
                }
                if (i58 >= i56) {
                    c8054.f24842 = true;
                } else if (charSequence.charAt(i58) == i13) {
                    m15091(i58 + 1);
                    if (i57 > 0) {
                        int[] iArr18 = c8054.f24832;
                        iArr18[i53] = i58 - 2;
                        iArr18[i53 + 1] = i58;
                    }
                    return true;
                }
                if (i57 < i55) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                m15056(c16292, i58, z6);
                if (i57 > 0) {
                    return false;
                }
                int[] iArr19 = c8054.f24832;
                iArr19[i53] = i58 - 2;
                iArr19[i53 + 1] = i58;
                return false;
            case 7:
                if (m15101(i, c16292, charSequence)) {
                    int i61 = c8760.f26707;
                    int i62 = c8054.f24844;
                    int i63 = c8760.f26706;
                    int i64 = i + i63;
                    do {
                        int iCharAt2 = i64 < i62 ? charSequence.charAt(i64) : -1;
                        if (iCharAt2 < 0) {
                            c8054.f24842 = true;
                        } else if (iCharAt2 == i13 && (c8054.f24820 != 1 || i64 + 1 == i62)) {
                            m15091(i64 + 1);
                            return true;
                        }
                        if (i63 < i61) {
                            if (iCharAt2 < 0 || iCharAt2 != i12) {
                                m15056(c16292, i64, true);
                                return false;
                            }
                            i64++;
                            m15091(i64);
                            i63++;
                        }
                    } while (!c8054.m21407());
                    this.f16390 = true;
                    return false;
                }
                return false;
            case 8:
                if (m15101(i, c16292, charSequence)) {
                    int i65 = c8054.f24844;
                    int i66 = c8760.f26707;
                    int i67 = c8760.f26706;
                    int i68 = i + i67;
                    while (i67 < i66) {
                        if (i68 >= i65) {
                            c8054.f24842 = true;
                        } else if (charSequence.charAt(i68) == i12) {
                            i68++;
                            m15091(i68);
                            i67++;
                            if (c8054.m21407()) {
                                this.f16390 = true;
                                return false;
                            }
                        }
                        if (i68 >= i65) {
                            c8054.f24842 = true;
                        } else if (charSequence.charAt(i68) == i13 && (c8054.f24820 != 1 || i68 + 1 == i65)) {
                            m15091(i68 + 1);
                            return true;
                        }
                        m15056(c16292, i68, i67 < i66);
                        return false;
                    }
                    if (i68 >= i65) {
                        c8054.f24842 = true;
                    } else if (charSequence.charAt(i68) == i13) {
                        m15091(i68 + 1);
                        return true;
                    }
                    m15056(c16292, i68, i67 < i66);
                    return false;
                }
                return false;
            case 9:
                if (m15101(i, c16292, charSequence)) {
                    int i69 = c8054.f24844;
                    int i70 = c8760.f26706;
                    int i71 = c8760.f26707;
                    int i72 = i + i70;
                    int i73 = i70;
                    while (i73 < i71) {
                        if (i72 >= i69) {
                            c8054.f24842 = true;
                        } else if (charSequence.charAt(i72) == i12) {
                            i72++;
                            m15091(i72);
                            i73++;
                        }
                        if (i73 == i71) {
                            if (i72 >= i69) {
                                c8054.f24842 = true;
                            } else if (charSequence.charAt(i72) == i12 && (c8054.f24820 != 1 || i72 + 1 == i69)) {
                                m15091(i72 + 1);
                                return true;
                            }
                        }
                        if (i73 > i70 || (c8054.f24820 == 1 && i72 != i69)) {
                            m15056(c16292, i72, i73 < i71);
                            return false;
                        }
                        m15091(i72);
                        return true;
                    }
                    if (i73 == i71) {
                        if (i72 >= i69) {
                            c8054.f24842 = true;
                        } else if (charSequence.charAt(i72) == i12) {
                            m15091(i72 + 1);
                            return true;
                        }
                    }
                    if (i73 > i70) {
                    }
                    m15056(c16292, i72, i73 < i71);
                    return false;
                }
                return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15051(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f16391[i] = i3;
        C8054 c8054 = this.f16397;
        int[] iArr = c8054.f24832;
        iArr[i2] = i4;
        iArr[i2 + 1] = i5;
        if (i6 >= 0) {
            c8054.f24823.m43233(i6);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m15084(C16292 c16292, int i, int i2, CharSequence charSequence) {
        C8760 c8760 = c16292.f50087;
        int i3 = c8760.f26707;
        int i4 = c8760.f26703;
        int i5 = c16292.f50102;
        int i6 = c16292.f50096;
        int i7 = c16292.f50094;
        int i8 = i;
        int i9 = i2;
        while (true) {
            C8054 c8054 = this.f16397;
            int iM15038 = m15038(i7, i8, c8054.f24844, charSequence);
            if (iM15038 >= 0 && c8054.f24820 == 1 && iM15038 != c8054.f24844) {
                iM15038 = -1;
            }
            if (iM15038 >= 0) {
                m15091(iM15038);
                return true;
            }
            if (i9 >= i3) {
                return false;
            }
            int i10 = i3;
            int iM15041 = m15041(i5, i6, charSequence, i8, c8054.f24844);
            if (iM15041 < 0) {
                m15056(c16292, i8, true);
                return false;
            }
            c8054.m21416(iM15041);
            m15049(i4, i8, iM15041);
            i9++;
            if (c8054.m21407()) {
                this.f16390 = true;
                return false;
            }
            i8 = iM15041;
            i3 = i10;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15065(C16292 c16292, int i, int i2, CharSequence charSequence) {
        int i3;
        int i4;
        int i5;
        C8760 c8760 = c16292.f50087;
        int i6 = c8760.f26707;
        int i7 = c8760.f26703;
        int i8 = c16292.f50102;
        int i9 = c16292.f50096;
        int i10 = c16292.f50094;
        C8054 c8054 = this.f16397;
        C18638 c18638 = c8054.f24823;
        int[] iArr = c8054.f24832;
        int i11 = iArr[i7];
        int i12 = i7 + 1;
        int i13 = iArr[i12];
        int size = c8054.f24837 ? c18638.f58949.size() : -1;
        int iM15041 = i;
        int i14 = i2;
        while (true) {
            if (i14 >= i6) {
                i3 = i14;
                i4 = iM15041;
                i5 = size;
                break;
            }
            int i15 = i8;
            int i16 = i9;
            int i17 = i8;
            i3 = i14;
            int i18 = iM15041;
            int i19 = i9;
            i5 = size;
            iM15041 = m15041(i15, i16, charSequence, iM15041, c8054.f24844);
            if (iM15041 < 0) {
                i4 = i18;
                break;
            }
            c8054.m21416(iM15041);
            m15049(i7, i18, iM15041);
            i14 = i3 + 1;
            if (!c8054.m21407()) {
                size = i5;
                i8 = i17;
                i9 = i19;
            }
            this.f16390 = true;
            return false;
        }
        boolean z = i3 < i6;
        int i20 = i4;
        int i21 = i3;
        while (true) {
            if (i21 == i2) {
                if (i5 >= 0) {
                    c18638.m43233(i5);
                }
                int[] iArr2 = c8054.f24832;
                iArr2[i7] = i11;
                iArr2[i12] = i13;
            }
            int iM15038 = m15038(i10, i20, c8054.f24844, charSequence);
            if (iM15038 >= 0 && c8054.f24820 == 1 && iM15038 != c8054.f24844) {
                iM15038 = -1;
            }
            if (iM15038 >= 0) {
                if (i21 > i2) {
                    m15049(i7, i20 - 2, i20);
                }
                m15091(iM15038);
                return true;
            }
            if (i21 <= i2) {
                m15056(c16292, i4, z);
                return false;
            }
            int i22 = i20 - 2;
            i21--;
            m15049(i7, i20 - 4, i22);
            if (c8054.m21407()) {
                this.f16390 = true;
                return false;
            }
            i20 = i22;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15041(int i, int i2, CharSequence charSequence, int i3, int i4) {
        C8054 c8054 = this.f16397;
        if (i3 >= i4) {
            c8054.f24842 = true;
            return -1;
        }
        if (charSequence.charAt(i3) != i) {
            return -1;
        }
        int i5 = i3 + 1;
        if (i5 >= i4) {
            c8054.f24842 = true;
            return -1;
        }
        if (charSequence.charAt(i5) == i2) {
            return i3 + 2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15049(int i, int i2, int i3) {
        C8054 c8054 = this.f16397;
        if (c8054.f24837) {
            c8054.f24823.m43234(i, i2, i3, c8054.f24832);
        }
        int[] iArr = c8054.f24832;
        iArr[i] = i2;
        iArr[i + 1] = i3;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x01c2 A[Catch: all -> 0x0214, TRY_LEAVE, TryCatch #0 {all -> 0x0214, blocks: (B:24:0x005a, B:36:0x007f, B:43:0x0095, B:45:0x00a3, B:54:0x00c1, B:57:0x00c7, B:59:0x00cb, B:66:0x00e1, B:68:0x00e7, B:78:0x010a, B:88:0x0126, B:98:0x0145, B:105:0x015c, B:107:0x016c, B:118:0x0190, B:121:0x019a, B:124:0x01a8, B:126:0x01ae, B:131:0x01c2, B:157:0x021e, B:159:0x0226, B:169:0x0247, B:171:0x024b, B:185:0x0279, B:187:0x0281, B:189:0x028c, B:201:0x02b2, B:202:0x02b5, B:206:0x02be, B:214:0x02e5, B:216:0x02ee, B:141:0x01e9, B:143:0x01f7), top: B:232:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:134:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01e9 A[Catch: all -> 0x0214, TRY_ENTER, TryCatch #0 {all -> 0x0214, blocks: (B:24:0x005a, B:36:0x007f, B:43:0x0095, B:45:0x00a3, B:54:0x00c1, B:57:0x00c7, B:59:0x00cb, B:66:0x00e1, B:68:0x00e7, B:78:0x010a, B:88:0x0126, B:98:0x0145, B:105:0x015c, B:107:0x016c, B:118:0x0190, B:121:0x019a, B:124:0x01a8, B:126:0x01ae, B:131:0x01c2, B:157:0x021e, B:159:0x0226, B:169:0x0247, B:171:0x024b, B:185:0x0279, B:187:0x0281, B:189:0x028c, B:201:0x02b2, B:202:0x02b5, B:206:0x02be, B:214:0x02e5, B:216:0x02ee, B:141:0x01e9, B:143:0x01f7), top: B:232:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:145:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:147:0x0202  */
    /* JADX WARN: Code duplicated, block: B:150:0x020e A[LOOP:2: B:130:0x01c0->B:150:0x020e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x021b  */
    /* JADX WARN: Code duplicated, block: B:156:0x021d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0226 A[Catch: all -> 0x0214, TRY_LEAVE, TryCatch #0 {all -> 0x0214, blocks: (B:24:0x005a, B:36:0x007f, B:43:0x0095, B:45:0x00a3, B:54:0x00c1, B:57:0x00c7, B:59:0x00cb, B:66:0x00e1, B:68:0x00e7, B:78:0x010a, B:88:0x0126, B:98:0x0145, B:105:0x015c, B:107:0x016c, B:118:0x0190, B:121:0x019a, B:124:0x01a8, B:126:0x01ae, B:131:0x01c2, B:157:0x021e, B:159:0x0226, B:169:0x0247, B:171:0x024b, B:185:0x0279, B:187:0x0281, B:189:0x028c, B:201:0x02b2, B:202:0x02b5, B:206:0x02be, B:214:0x02e5, B:216:0x02ee, B:141:0x01e9, B:143:0x01f7), top: B:232:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0230 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x0232  */
    /* JADX WARN: Code duplicated, block: B:164:0x0238  */
    /* JADX WARN: Code duplicated, block: B:167:0x0244  */
    /* JADX WARN: Code duplicated, block: B:169:0x0247 A[Catch: all -> 0x0214, TRY_ENTER, TryCatch #0 {all -> 0x0214, blocks: (B:24:0x005a, B:36:0x007f, B:43:0x0095, B:45:0x00a3, B:54:0x00c1, B:57:0x00c7, B:59:0x00cb, B:66:0x00e1, B:68:0x00e7, B:78:0x010a, B:88:0x0126, B:98:0x0145, B:105:0x015c, B:107:0x016c, B:118:0x0190, B:121:0x019a, B:124:0x01a8, B:126:0x01ae, B:131:0x01c2, B:157:0x021e, B:159:0x0226, B:169:0x0247, B:171:0x024b, B:185:0x0279, B:187:0x0281, B:189:0x028c, B:201:0x02b2, B:202:0x02b5, B:206:0x02be, B:214:0x02e5, B:216:0x02ee, B:141:0x01e9, B:143:0x01f7), top: B:232:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:171:0x024b A[Catch: all -> 0x0214, TRY_LEAVE, TryCatch #0 {all -> 0x0214, blocks: (B:24:0x005a, B:36:0x007f, B:43:0x0095, B:45:0x00a3, B:54:0x00c1, B:57:0x00c7, B:59:0x00cb, B:66:0x00e1, B:68:0x00e7, B:78:0x010a, B:88:0x0126, B:98:0x0145, B:105:0x015c, B:107:0x016c, B:118:0x0190, B:121:0x019a, B:124:0x01a8, B:126:0x01ae, B:131:0x01c2, B:157:0x021e, B:159:0x0226, B:169:0x0247, B:171:0x024b, B:185:0x0279, B:187:0x0281, B:189:0x028c, B:201:0x02b2, B:202:0x02b5, B:206:0x02be, B:214:0x02e5, B:216:0x02ee, B:141:0x01e9, B:143:0x01f7), top: B:232:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0250  */
    /* JADX WARN: Code duplicated, block: B:175:0x0256  */
    /* JADX WARN: Code duplicated, block: B:178:0x0262  */
    /* JADX WARN: Code duplicated, block: B:188:0x028a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0296  */
    /* JADX WARN: Code duplicated, block: B:194:0x029c  */
    /* JADX WARN: Code duplicated, block: B:197:0x02a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:208:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:210:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:213:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:218:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:220:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:222:0x0303  */
    /* JADX WARN: Code duplicated, block: B:224:0x0309 A[LOOP:3: B:179:0x0269->B:224:0x0309, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:243:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m15096(int i, C16292 c16292, CharSequence charSequence) {
        int i2;
        int i3;
        int i4;
        EnumC1497 enumC1497;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM15075;
        C8760 c8760;
        boolean z3;
        int iM15076;
        int i10;
        int iM15102;
        C16292 c16293 = c16292;
        C8054 c8054 = this.f16397;
        C18638 c18638 = c8054.f24823;
        C8760 c8761 = c16293.f50087;
        int i11 = c16293.f50108;
        int i12 = c8761.f26705;
        EnumC1497 enumC1498 = c8761.f26708;
        int i13 = c8761.f26707;
        int i14 = c8761.f26706;
        boolean z4 = c8761.f26702;
        int i15 = c8761.f26703;
        int i16 = i12 >= 0 ? this.f16391[i12] : 0;
        int i17 = z4 ? c8054.f24832[i15] : 0;
        int i18 = z4 ? c8054.f24832[i15 + 1] : 0;
        int size = (!c8054.f24837 || (i12 >= 0 && !z4)) ? -1 : c18638.f58949.size();
        int i19 = i13;
        if (i12 >= 0) {
            this.f16391[i12] = -1;
        }
        int i20 = i;
        int i21 = 0;
        while (i21 < i14) {
            int i22 = i14;
            try {
                int iM15103 = m15102(i20, c16293, charSequence);
                if (this.f16390) {
                    if (i12 >= 0) {
                        this.f16391[i12] = i16;
                    }
                    if (z4) {
                        int[] iArr = c8054.f24832;
                        iArr[i15] = i17;
                        iArr[i15 + 1] = i18;
                    }
                    if (size < 0) {
                        return false;
                    }
                } else if (iM15103 < 0) {
                    m15056(c16293, i20, true);
                    if (i12 >= 0) {
                        this.f16391[i12] = i16;
                    }
                    if (z4) {
                        int[] iArr2 = c8054.f24832;
                        iArr2[i15] = i17;
                        iArr2[i15 + 1] = i18;
                    }
                    if (size < 0) {
                        return false;
                    }
                } else {
                    m15055(c16293, i20, iM15103);
                    m15054(c8761, i20, iM15103);
                    i21++;
                    if (c8054.m21407()) {
                        this.f16390 = true;
                        if (i12 >= 0) {
                            this.f16391[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr3 = c8054.f24832;
                            iArr3[i15] = i17;
                            iArr3[i15 + 1] = i18;
                        }
                        if (size < 0) {
                            return false;
                        }
                    } else {
                        i20 = iM15103;
                        i14 = i22;
                    }
                }
                c18638.m43233(size);
                return false;
            } catch (Throwable th) {
                if (i12 >= 0) {
                    this.f16391[i12] = i16;
                }
                if (z4) {
                    int[] iArr4 = c8054.f24832;
                    iArr4[i15] = i17;
                    iArr4[i15 + 1] = i18;
                }
                if (size >= 0) {
                    c18638.m43233(size);
                }
                throw th;
            }
        }
        int i23 = i14;
        if (c8761.f26704 || i12 >= 0 || !c8054.f24831) {
            EnumC1497 enumC1499 = enumC1498;
            if (enumC1499 == EnumC1497.LAZY) {
                while (true) {
                    int iM15077 = m15075(i20, c16293, charSequence);
                    C8760 c8762 = c8761;
                    if (this.f16390) {
                        if (i12 >= 0) {
                            this.f16391[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr5 = c8054.f24832;
                            iArr5[i15] = i17;
                            iArr5[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    if (iM15077 >= 0) {
                        m15091(iM15077);
                        return true;
                    }
                    int i24 = i19;
                    if (i21 >= i24) {
                        if (i12 >= 0) {
                            this.f16391[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr6 = c8054.f24832;
                            iArr6[i15] = i17;
                            iArr6[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    int iM15104 = m15102(i20, c16293, charSequence);
                    if (this.f16390) {
                        if (i12 >= 0) {
                            this.f16391[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr7 = c8054.f24832;
                            iArr7[i15] = i17;
                            iArr7[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    if (iM15104 < 0) {
                        m15056(c16293, i20, true);
                        if (i12 >= 0) {
                            this.f16391[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr8 = c8054.f24832;
                            iArr8[i15] = i17;
                            iArr8[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    m15055(c16293, i20, iM15104);
                    m15054(c8762, i20, iM15104);
                    i21++;
                    if (c8054.m21407()) {
                        this.f16390 = true;
                        if (i12 >= 0) {
                            this.f16391[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr9 = c8054.f24832;
                            iArr9[i15] = i17;
                            iArr9[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    i19 = i24;
                    i20 = iM15104;
                    c8761 = c8762;
                }
            } else {
                C8760 c8763 = c8761;
                int i25 = i19;
                int i26 = z4 ? c8054.f24832[i15] : 0;
                int i27 = z4 ? c8054.f24832[i15 + 1] : 0;
                if (z4) {
                    i2 = i27;
                    int size2 = c8054.f24837 ? c18638.f58949.size() : -1;
                    int i28 = i26;
                    i3 = i21;
                    int i29 = size2;
                    i4 = i20;
                    while (true) {
                        if (i3 < i25) {
                            enumC1497 = enumC1499;
                            break;
                        }
                        i10 = i25;
                        enumC1497 = enumC1499;
                        iM15102 = m15102(i4, c16293, charSequence);
                        if (this.f16390) {
                            if (i12 >= 0) {
                                this.f16391[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr10 = c8054.f24832;
                                iArr10[i15] = i17;
                                iArr10[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        } else {
                            if (iM15102 < 0) {
                                i25 = i10;
                                break;
                            }
                            m15055(c16293, i4, iM15102);
                            m15054(c8763, i4, iM15102);
                            i3++;
                            if (c8054.m21407()) {
                                this.f16390 = true;
                                if (i12 >= 0) {
                                    this.f16391[i12] = i16;
                                }
                                if (z4) {
                                    int[] iArr11 = c8054.f24832;
                                    iArr11[i15] = i17;
                                    iArr11[i15 + 1] = i18;
                                }
                                if (size < 0) {
                                    return false;
                                }
                            } else {
                                i4 = iM15102;
                                enumC1499 = enumC1497;
                                i25 = i10;
                            }
                        }
                    }
                    if (i3 < i25) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i5 = i3;
                    if (enumC1497 == EnumC1497.POSSESSIVE) {
                        iM15076 = m15075(i4, c16293, charSequence);
                        if (this.f16390) {
                            if (i12 >= 0) {
                                this.f16391[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr12 = c8054.f24832;
                                iArr12[i15] = i17;
                                iArr12[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        } else {
                            if (iM15076 >= 0) {
                                m15091(iM15076);
                                return true;
                            }
                            m15056(c16293, i4, z);
                            if (i12 >= 0) {
                                this.f16391[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr13 = c8054.f24832;
                                iArr13[i15] = i17;
                                iArr13[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        }
                    } else {
                        z2 = z;
                        i6 = i4;
                        i7 = i5;
                        while (true) {
                            i8 = i4;
                            i9 = i23;
                            if (i12 < 0 && i7 == i9 && z4) {
                                if (i29 >= 0) {
                                    int i30 = i29;
                                    c18638.m43233(i30);
                                    i29 = i30;
                                }
                                int[] iArr14 = c8054.f24832;
                                iArr14[i15] = i28;
                                iArr14[i15 + 1] = i2;
                            } else {
                                c8763 = c8763;
                            }
                            iM15075 = m15075(i6, c16293, charSequence);
                            if (this.f16390) {
                                if (i12 >= 0) {
                                    this.f16391[i12] = i16;
                                }
                                if (z4) {
                                    int[] iArr15 = c8054.f24832;
                                    iArr15[i15] = i17;
                                    iArr15[i15 + 1] = i18;
                                }
                                if (size < 0) {
                                    return false;
                                }
                            } else {
                                if (iM15075 >= 0) {
                                    if (i12 >= 0 && i7 > i9) {
                                        m15054(c8763, i6 - i11, i6);
                                    }
                                    m15091(iM15075);
                                    return true;
                                }
                                c8760 = c8763;
                                if (i7 <= i9) {
                                    m15056(c16293, i8, z2);
                                    if (i12 >= 0) {
                                        this.f16391[i12] = i16;
                                    }
                                    if (z4) {
                                        int[] iArr16 = c8054.f24832;
                                        iArr16[i15] = i17;
                                        iArr16[i15 + 1] = i18;
                                    }
                                    if (size < 0) {
                                        return false;
                                    }
                                } else {
                                    i23 = i9;
                                    z3 = z2;
                                    i6 -= i11;
                                    i7--;
                                    m15054(c8760, i6 - i11, i6);
                                    if (c8054.m21407()) {
                                        this.f16390 = true;
                                        if (i12 >= 0) {
                                            this.f16391[i12] = i16;
                                        }
                                        if (z4) {
                                            int[] iArr17 = c8054.f24832;
                                            iArr17[i15] = i17;
                                            iArr17[i15 + 1] = i18;
                                        }
                                        if (size >= 0) {
                                            return false;
                                        }
                                        c18638.m43233(size);
                                        return false;
                                    }
                                    c16293 = c16292;
                                    z2 = z3;
                                    i4 = i8;
                                    c8763 = c8760;
                                }
                            }
                        }
                    }
                } else {
                    i2 = i27;
                }
                int i210 = i26;
                i3 = i21;
                int i211 = size2;
                i4 = i20;
                while (true) {
                    if (i3 < i25) {
                        enumC1497 = enumC1499;
                        break;
                    }
                    i10 = i25;
                    enumC1497 = enumC1499;
                    iM15102 = m15102(i4, c16293, charSequence);
                    if (this.f16390) {
                        if (i12 >= 0) {
                            this.f16391[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr18 = c8054.f24832;
                            iArr18[i15] = i17;
                            iArr18[i15 + 1] = i18;
                        }
                        if (size < 0) {
                            return false;
                        }
                    } else {
                        if (iM15102 < 0) {
                            i25 = i10;
                            break;
                        }
                        m15055(c16293, i4, iM15102);
                        m15054(c8763, i4, iM15102);
                        i3++;
                        if (c8054.m21407()) {
                            this.f16390 = true;
                            if (i12 >= 0) {
                                this.f16391[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr19 = c8054.f24832;
                                iArr19[i15] = i17;
                                iArr19[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        } else {
                            i4 = iM15102;
                            enumC1499 = enumC1497;
                            i25 = i10;
                        }
                    }
                }
                if (i3 < i25) {
                    z = true;
                } else {
                    z = false;
                }
                i5 = i3;
                if (enumC1497 == EnumC1497.POSSESSIVE) {
                    iM15076 = m15075(i4, c16293, charSequence);
                    if (this.f16390) {
                        if (i12 >= 0) {
                            this.f16391[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr110 = c8054.f24832;
                            iArr110[i15] = i17;
                            iArr110[i15 + 1] = i18;
                        }
                        if (size < 0) {
                            return false;
                        }
                    } else {
                        if (iM15076 >= 0) {
                            m15091(iM15076);
                            return true;
                        }
                        m15056(c16293, i4, z);
                        if (i12 >= 0) {
                            this.f16391[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr111 = c8054.f24832;
                            iArr111[i15] = i17;
                            iArr111[i15 + 1] = i18;
                        }
                        if (size < 0) {
                            return false;
                        }
                    }
                } else {
                    z2 = z;
                    i6 = i4;
                    i7 = i5;
                    while (true) {
                        i8 = i4;
                        i9 = i23;
                        if (i12 < 0) {
                            c8763 = c8763;
                        } else {
                            c8763 = c8763;
                        }
                        iM15075 = m15075(i6, c16293, charSequence);
                        if (this.f16390) {
                            if (i12 >= 0) {
                                this.f16391[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr112 = c8054.f24832;
                                iArr112[i15] = i17;
                                iArr112[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        } else {
                            if (iM15075 >= 0) {
                                if (i12 >= 0) {
                                    m15054(c8763, i6 - i11, i6);
                                }
                                m15091(iM15075);
                                return true;
                            }
                            c8760 = c8763;
                            if (i7 <= i9) {
                                m15056(c16293, i8, z2);
                                if (i12 >= 0) {
                                    this.f16391[i12] = i16;
                                }
                                if (z4) {
                                    int[] iArr113 = c8054.f24832;
                                    iArr113[i15] = i17;
                                    iArr113[i15 + 1] = i18;
                                }
                                if (size < 0) {
                                    return false;
                                }
                            } else {
                                i23 = i9;
                                z3 = z2;
                                i6 -= i11;
                                i7--;
                                m15054(c8760, i6 - i11, i6);
                                if (c8054.m21407()) {
                                    this.f16390 = true;
                                    if (i12 >= 0) {
                                        this.f16391[i12] = i16;
                                    }
                                    if (z4) {
                                        int[] iArr114 = c8054.f24832;
                                        iArr114[i15] = i17;
                                        iArr114[i15 + 1] = i18;
                                    }
                                    if (size >= 0) {
                                        return false;
                                    }
                                    c18638.m43233(size);
                                    return false;
                                }
                                c16293 = c16292;
                                z2 = z3;
                                i4 = i8;
                                c8763 = c8760;
                            }
                        }
                    }
                }
            }
        } else {
            this.f16390 = true;
            if (i12 >= 0) {
                this.f16391[i12] = i16;
            }
            if (z4) {
                int[] iArr20 = c8054.f24832;
                iArr20[i15] = i17;
                iArr20[i15 + 1] = i18;
            }
            if (size < 0) {
                return false;
            }
        }
        c18638.m43233(size);
        return false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m15101(int i, C16292 c16292, CharSequence charSequence) {
        int i2 = c16292.f50109;
        int i3 = c16292.f50087.f26706;
        C8054 c8054 = this.f16397;
        int i4 = c8054.f24844;
        int i5 = 0;
        while (i5 < i3) {
            if (i >= i4) {
                c8054.f24842 = true;
                m15056(c16292, i, true);
                return false;
            }
            if (charSequence.charAt(i) != i2) {
                m15056(c16292, i, true);
                return false;
            }
            i++;
            m15091(i);
            i5++;
            if (c8054.m21407()) {
                this.f16390 = true;
                return false;
            }
        }
        if (!c8054.f24831) {
            return true;
        }
        this.f16390 = true;
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15056(C16292 c16292, int i, boolean z) {
        if (z && c16292.f50104) {
            this.f16403 = i;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15055(C16292 c16292, int i, int i2) {
        boolean z = c16292.f50098;
        C8054 c8054 = this.f16397;
        if (z) {
            int[] iArr = c8054.f24832;
            int i3 = c16292.f50090;
            int i4 = iArr[i3];
            int i5 = i3 + 1;
            int i6 = iArr[i5];
            iArr[i3] = i;
            iArr[i5] = i2;
            if (c8054.f24837 && i4 != -1 && i6 != -1) {
                C18638 c18638 = c8054.f24823;
                c18638.f58949.add(new C2992(i3 / 2, i4, i6));
            }
        }
        c8054.m21416(i2);
        if (c16292.f50087.f26705 < 0) {
            int[] iArr2 = c8054.f24832;
            iArr2[0] = c8054.f24855;
            iArr2[1] = i2;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m15102(int i, C16292 c16292, CharSequence charSequence) {
        C8054 c8054 = this.f16397;
        int i2 = c8054.f24844;
        if (!c16292.f50093) {
            int i3 = c16292.f50109;
            if (i3 >= 0) {
                return m15038(i3, i, i2, charSequence);
            }
            int i4 = c16292.f50103;
            return i4 >= 0 ? m15039(i4, i, i2, c16292.f50106, charSequence) : m15042(i, i2, charSequence, c16292.f50101);
        }
        if (i >= i2) {
            c8054.f24842 = true;
            return -1;
        }
        if (charSequence.charAt(i) != c16292.f50102) {
            return -1;
        }
        int i5 = i + 1;
        if (i5 >= i2) {
            c8054.f24842 = true;
            return -1;
        }
        if (charSequence.charAt(i5) == c16292.f50096) {
            return i + 2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15038(int i, int i2, int i3, CharSequence charSequence) {
        if (i2 >= i3) {
            this.f16397.f24842 = true;
            return -1;
        }
        if (charSequence.charAt(i2) == i) {
            return i2 + 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15039(int i, int i2, int i3, InterfaceC10795 interfaceC10795, CharSequence charSequence) {
        if (i2 >= i3) {
            this.f16397.f24842 = true;
            return -1;
        }
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt >= 128 ? interfaceC10795 == null || !interfaceC10795.mo2465(cCharAt) : cCharAt != i) {
            return -1;
        }
        return i2 + 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m15075(int i, C16292 c16292, CharSequence charSequence) {
        int iM15039;
        C8054 c8054 = this.f16397;
        int i2 = c8054.f24844;
        int i3 = c16292.f50094;
        if (i3 >= 0) {
            iM15039 = m15038(i3, i, i2, charSequence);
        } else {
            int i4 = c16292.f50088;
            iM15039 = i4 >= 0 ? m15039(i4, i, i2, c16292.f50099, charSequence) : m15042(i, i2, charSequence, c16292.f50092);
        }
        if (iM15039 < 0) {
            return -1;
        }
        if (c8054.f24820 != 1 || iM15039 == c8054.f24844) {
            return iM15039;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m15091(int i) {
        C8054 c8054 = this.f16397;
        int[] iArr = c8054.f24832;
        iArr[0] = c8054.f24855;
        c8054.m21416(i);
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m15106(int i, CharSequence charSequence) {
        C9466 c9466 = this.f16401;
        int i2 = c9466.f28787;
        int[] iArr = c9466.f28782;
        Object[] objArr = c9466.f28780;
        C8054 c8054 = this.f16397;
        int i3 = c8054.f24844;
        while (true) {
            if (c8054.m21407()) {
                this.f16390 = true;
                return false;
            }
            int i4 = iArr[i2];
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 3) {
                        int[] iArr2 = (int[]) objArr[iArr[i2 + 2]];
                        int i5 = 0;
                        while (i5 < iArr2.length) {
                            if (i >= i3) {
                                c8054.f24842 = true;
                                return false;
                            }
                            int i6 = i + 1;
                            if (iArr2[i5] == charSequence.charAt(i)) {
                                if (c8054.m21407()) {
                                    this.f16390 = true;
                                    return false;
                                }
                                i5++;
                                i = i6;
                            }
                        }
                        i2 = iArr[i2 + 1];
                    } else if (i4 == 4) {
                        InterfaceC10795 interfaceC10795 = (InterfaceC10795) objArr[iArr[i2 + 2]];
                        int i7 = i;
                        while (i7 < i3 && interfaceC10795.mo2465(charSequence.charAt(i7))) {
                            i7++;
                            if (c8054.m21407()) {
                                this.f16390 = true;
                                return false;
                            }
                        }
                        if (i7 >= i3) {
                            c8054.f24842 = true;
                        }
                        if (i7 - i >= iArr[i2 + 3]) {
                            i = i7;
                            i2 = iArr[i2 + 1];
                        }
                    } else {
                        if (i4 == 7) {
                            m15085(iArr[i2 + 2], i);
                        } else if (i4 == 8) {
                            int iM15097 = m15097(iArr[i2 + 2]);
                            if (iM15097 < 0) {
                                c8054.m21416(i);
                                return true;
                            }
                            int i8 = iArr[i2 + 3];
                            if (i8 != 0) {
                                m15099(i8, iM15097);
                                m15099(i8 + 1, i);
                            }
                        } else if (i4 == 11) {
                            continue;
                        } else if (i4 == 16) {
                            int i9 = i2 + 2;
                            if (C21460.m48607(iArr[i9], iArr[i2 + 3] != 0, c8054, i, charSequence)) {
                                if (iArr[i9] == 0) {
                                    m15104(Integer.MIN_VALUE, i);
                                }
                            }
                        } else if (i4 == 28 || i4 == 29) {
                            i = C0998.m3491((int[]) objArr[iArr[i2 + 2]], iArr[i2 + 3], c8054, charSequence, i);
                            if (i == -2) {
                                this.f16390 = true;
                                return false;
                            }
                            if (i == -1) {
                            }
                        } else {
                            throw new IllegalStateException("Invalid linear regex scan opcode");
                        }
                        i2 = iArr[i2 + 1];
                    }
                } else {
                    if (i >= i3) {
                        c8054.f24842 = true;
                        return false;
                    }
                    int i10 = i + 1;
                    if (((InterfaceC10795) objArr[iArr[i2 + 2]]).mo2465(charSequence.charAt(i))) {
                        i = i10;
                        i2 = iArr[i2 + 1];
                    }
                }
            } else if (c8054.f24820 != 1 || i == i3) {
                int[] iArr3 = c8054.f24832;
                iArr3[0] = c8054.f24855;
                c8054.m21416(i);
                iArr3[1] = i;
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m15100(int i, CharSequence charSequence) {
        C9466 c9466 = this.f16401;
        int i2 = c9466.f28787;
        int[] iArr = c9466.f28782;
        Object[] objArr = c9466.f28780;
        C8054 c8054 = this.f16397;
        int i3 = c8054.f24844;
        while (true) {
            if (c8054.m21407()) {
                this.f16390 = true;
                return false;
            }
            int i4 = iArr[i2];
            if (i4 != 1) {
                if (i4 != 16) {
                    if (i4 == 20) {
                        int iM15044 = m15044((C3821) objArr[iArr[i2 + 2]], charSequence, i, i3);
                        if (!this.f16390 && iM15044 >= 0) {
                            int[] iArr2 = c8054.f24832;
                            iArr2[0] = c8054.f24855;
                            c8054.m21416(iM15044);
                            iArr2[1] = iM15044;
                            return true;
                        }
                    } else if (i4 == 3) {
                        int[] iArr3 = (int[]) objArr[iArr[i2 + 2]];
                        int i5 = 0;
                        while (i5 < iArr3.length) {
                            if (i >= i3) {
                                c8054.f24842 = true;
                                return false;
                            }
                            int i6 = i + 1;
                            if (iArr3[i5] == charSequence.charAt(i)) {
                                if (c8054.m21407()) {
                                    this.f16390 = true;
                                    return false;
                                }
                                i5++;
                                i = i6;
                            }
                        }
                        i2 = iArr[i2 + 1];
                    } else if (i4 == 4) {
                        InterfaceC10795 interfaceC10795 = (InterfaceC10795) objArr[iArr[i2 + 2]];
                        int i7 = i;
                        while (i7 < i3 && interfaceC10795.mo2465(charSequence.charAt(i7))) {
                            i7++;
                            if (c8054.m21407()) {
                                this.f16390 = true;
                                return false;
                            }
                        }
                        if (i7 >= i3) {
                            c8054.f24842 = true;
                        }
                        if (i7 - i >= iArr[i2 + 3]) {
                            i = i7;
                            i2 = iArr[i2 + 1];
                        }
                    } else {
                        throw new IllegalStateException("Invalid terminal regex prefix opcode");
                    }
                    return false;
                }
                if (!C21460.m48607(iArr[i2 + 2], iArr[i2 + 3] != 0, c8054, i, charSequence)) {
                    return false;
                }
                i2 = iArr[i2 + 1];
            } else {
                if (i >= i3) {
                    c8054.f24842 = true;
                    return false;
                }
                int i8 = i + 1;
                if (!((InterfaceC10795) objArr[iArr[i2 + 2]]).mo2465(charSequence.charAt(i))) {
                    return false;
                }
                i = i8;
                i2 = iArr[i2 + 1];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:206:0x0324  */
    /* JADX WARN: Code duplicated, block: B:209:0x0329  */
    /* JADX WARN: Code duplicated, block: B:281:0x047b  */
    /* JADX WARN: Code duplicated, block: B:284:0x0480  */
    /* JADX WARN: Code duplicated, block: B:385:0x0666 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:581:0x09a8  */
    /* JADX WARN: Code duplicated, block: B:585:0x09b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:586:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:675:0x0b37  */
    /* JADX WARN: Code duplicated, block: B:677:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:680:0x0b5f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:681:0x0b61  */
    /* JADX WARN: Code duplicated, block: B:683:0x0b6d  */
    /* JADX WARN: Code duplicated, block: B:685:0x0b71  */
    /* JADX WARN: Code duplicated, block: B:689:0x0b7c  */
    /* JADX WARN: Code duplicated, block: B:692:0x0ba8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:693:0x0baa  */
    /* JADX WARN: Code duplicated, block: B:695:0x0bb6  */
    /* JADX WARN: Code duplicated, block: B:699:0x0bcb  */
    /* JADX WARN: Code duplicated, block: B:700:0x0bd5  */
    /* JADX WARN: Code duplicated, block: B:701:0x0bd9  */
    /* JADX WARN: Code duplicated, block: B:703:0x0bdc  */
    /* JADX WARN: Code duplicated, block: B:705:0x0bf5  */
    /* JADX WARN: Code duplicated, block: B:710:0x0c01  */
    /* JADX WARN: Code duplicated, block: B:717:0x0c12  */
    /* JADX WARN: Code duplicated, block: B:719:0x0c2b  */
    /* JADX WARN: Code duplicated, block: B:720:0x0c2e  */
    /* JADX WARN: Code duplicated, block: B:722:0x0c35  */
    /* JADX WARN: Code duplicated, block: B:724:0x0c38  */
    /* JADX WARN: Code duplicated, block: B:728:0x0c46  */
    /* JADX WARN: Code duplicated, block: B:729:0x0c49  */
    /* JADX WARN: Code duplicated, block: B:731:0x0c4c  */
    /* JADX WARN: Code duplicated, block: B:732:0x0c59  */
    /* JADX WARN: Code duplicated, block: B:734:0x0c5c  */
    /* JADX WARN: Code duplicated, block: B:737:0x0c67  */
    /* JADX WARN: Code duplicated, block: B:739:0x0c6a  */
    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    /* JADX WARN: Code duplicated, block: B:741:0x0c89  */
    /* JADX WARN: Code duplicated, block: B:743:0x0c8e  */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:755:0x035e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:0x04e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:0x04e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:0x066a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:0x0b32 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:0x0c43 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:0x0b77 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:0x0c43 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:790:0x0bfd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:0x0c43 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:834:0x0c0a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:835:0x0b64 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:836:0x0bad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:837:0x0bbb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:838:0x0c0f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:841:0x0c07 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:842:? A[PHI: r1 r3 r6 r15 r17 r18 r22 r23
      PHI (r1v7 l.ۚ۠ܽ) = 
      (r1v3 l.ۚ۠ܽ)
      (r1v3 l.ۚ۠ܽ)
      (r1v11 l.ۚ۠ܽ)
      (r1v11 l.ۚ۠ܽ)
      (r1v11 l.ۚ۠ܽ)
      (r1v12 l.ۚ۠ܽ)
      (r1v12 l.ۚ۠ܽ)
      (r1v13 l.ۚ۠ܽ)
      (r1v13 l.ۚ۠ܽ)
      (r1v13 l.ۚ۠ܽ)
      (r1v14 l.ۚ۠ܽ)
      (r1v14 l.ۚ۠ܽ)
      (r1v15 l.ۚ۠ܽ)
      (r1v16 l.ۚ۠ܽ)
      (r1v21 l.ۚ۠ܽ)
      (r1v28 l.ۚ۠ܽ)
      (r1v54 l.ۚ۠ܽ)
      (r1v61 l.ۚ۠ܽ)
      (r1v117 l.ۚ۠ܽ)
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE]
      PHI (r3v7 l.ۚ۠ܽ) = 
      (r3v2 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
      (r3v9 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
      (r3v2 l.ۚ۠ܽ)
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE]
      PHI (r6v7 java.lang.CharSequence) = 
      (r6v3 java.lang.CharSequence)
      (r6v3 java.lang.CharSequence)
      (r6v8 java.lang.CharSequence)
      (r6v8 java.lang.CharSequence)
      (r6v8 java.lang.CharSequence)
      (r6v9 java.lang.CharSequence)
      (r6v9 java.lang.CharSequence)
      (r6v10 java.lang.CharSequence)
      (r6v10 java.lang.CharSequence)
      (r6v10 java.lang.CharSequence)
      (r6v11 java.lang.CharSequence)
      (r6v11 java.lang.CharSequence)
      (r6v12 java.lang.CharSequence)
      (r6v14 java.lang.CharSequence)
      (r6v15 java.lang.CharSequence)
      (r6v17 java.lang.CharSequence)
      (r6v34 java.lang.CharSequence)
      (r6v45 java.lang.CharSequence)
      (r6v60 java.lang.CharSequence)
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE]
      PHI (r15v1 l.۠۠ܽ) = 
      (r15v0 l.۠۠ܽ)
      (r15v0 l.۠۠ܽ)
      (r15v6 l.۠۠ܽ)
      (r15v6 l.۠۠ܽ)
      (r15v6 l.۠۠ܽ)
      (r15v7 l.۠۠ܽ)
      (r15v7 l.۠۠ܽ)
      (r15v8 l.۠۠ܽ)
      (r15v8 l.۠۠ܽ)
      (r15v8 l.۠۠ܽ)
      (r15v9 l.۠۠ܽ)
      (r15v9 l.۠۠ܽ)
      (r15v10 l.۠۠ܽ)
      (r15v12 l.۠۠ܽ)
      (r4v2 l.۠۠ܽ)
      (r15v18 l.۠۠ܽ)
      (r15v29 l.۠۠ܽ)
      (r15v32 l.۠۠ܽ)
      (r15v51 l.۠۠ܽ)
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE]
      PHI (r17v6 int) = 
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v1 int)
      (r17v8 int)
      (r17v1 int)
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE]
      PHI (r18v6 int) = 
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v1 int)
      (r18v10 int)
      (r18v1 int)
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE]
      PHI (r22v4 java.lang.Object[]) = 
      (r22v0 java.lang.Object[])
      (r22v0 java.lang.Object[])
      (r22v5 java.lang.Object[])
      (r22v5 java.lang.Object[])
      (r22v5 java.lang.Object[])
      (r22v6 java.lang.Object[])
      (r22v6 java.lang.Object[])
      (r22v7 java.lang.Object[])
      (r22v7 java.lang.Object[])
      (r22v7 java.lang.Object[])
      (r22v8 java.lang.Object[])
      (r22v8 java.lang.Object[])
      (r22v9 java.lang.Object[])
      (r22v10 java.lang.Object[])
      (r22v11 java.lang.Object[])
      (r22v13 java.lang.Object[])
      (r22v19 java.lang.Object[])
      (r22v21 java.lang.Object[])
      (r22v38 java.lang.Object[])
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE]
      PHI (r23v4 int[]) = 
      (r23v0 int[])
      (r23v0 int[])
      (r23v5 int[])
      (r23v5 int[])
      (r23v5 int[])
      (r23v6 int[])
      (r23v6 int[])
      (r23v7 int[])
      (r23v7 int[])
      (r23v7 int[])
      (r23v8 int[])
      (r23v8 int[])
      (r23v9 int[])
      (r23v10 int[])
      (r23v11 int[])
      (r23v13 int[])
      (r23v19 int[])
      (r23v21 int[])
      (r23v39 int[])
     binds: [B:670:0x0b2c, B:667:0x0b22, B:658:0x0af2, B:656:0x0aef, B:641:0x0ab0, B:636:0x0a9c, B:634:0x0a87, B:630:0x0a7a, B:628:0x0a6a, B:625:0x0a59, B:620:0x0a46, B:621:0x0a48, B:829:0x0b2e, B:583:0x09ae, B:557:0x0956, B:526:0x08b5, B:425:0x0710, B:413:0x06db, B:319:0x0524] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0522, code lost:
    
        if (l.C21460.m48609((l.C3446) r8[r7[r16 + 2]], r4, r9, r5) == false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013a, code lost:
    
        if (r9 == (-1)) goto L319;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m15081(int i, int i2, CharSequence charSequence) {
        int i3;
        C5232 c5232;
        CharSequence charSequence2;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int iM15074;
        int i7;
        C8054 c8054;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        C6643 c6643;
        int[] iArr2;
        int i13;
        int i14;
        int i15;
        boolean zM15095;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        Object[] objArr;
        int iM15042;
        boolean z;
        int i19;
        int i20;
        int i21;
        int iMax;
        boolean zM15068;
        int i22;
        int i23;
        boolean zM15107;
        int iM9496;
        int i24;
        int i25;
        C5232 c5233 = this;
        C9466 c9466 = c5233.f16401;
        int[] iArr3 = c9466.f28782;
        Object[] objArr2 = c9466.f28780;
        int i26 = i;
        int i27 = i2;
        CharSequence charSequence3 = charSequence;
        C5232 c5234 = c5233;
        boolean z2 = false;
        while (true) {
            int i28 = i26;
            int iCharCount = i27;
            CharSequence charSequence4 = charSequence3;
            int i29 = 0;
            int i30 = 0;
            while (true) {
                C8054 c8055 = c5234.f16397;
                if (c8055.m21407()) {
                    c5234.f16390 = true;
                    return z2;
                }
                int length = c8055.f24844;
                int i31 = i28 + 1;
                i3 = iArr3[i31];
                int i32 = iArr3[i28];
                if (i32 != 42) {
                    switch (i32) {
                        case 0:
                            c8055 = c8055;
                            c5232 = c5233;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            charSequence2 = charSequence4;
                            if (c8055.f24820 != 1 || iCharCount == length) {
                                if ((c8055.pattern().flags() & 512) != 0) {
                                    C5855 c5855 = C14403.f44164;
                                    if (iCharCount != charSequence2.length()) {
                                        boolean zIsJavaIdentifierPart = Character.isJavaIdentifierPart(charSequence2.charAt(iCharCount));
                                        boolean z3 = iCharCount > 0 && charSequence2.charAt(iCharCount) == charSequence2.charAt(iCharCount + (-1));
                                        if (iCharCount <= 0 || !Character.isJavaIdentifierPart(charSequence2.charAt(iCharCount - 1))) {
                                            if (!z3) {
                                            }
                                        } else if (!zIsJavaIdentifierPart) {
                                        }
                                    }
                                }
                                c8055.m21416(iCharCount);
                                int[] iArr4 = c8055.f24832;
                                iArr4[0] = c8055.f24855;
                                iArr4[1] = iCharCount;
                                return true;
                            }
                            while (true) {
                                i4 = c5234.f16398;
                                if (i4 == 0) {
                                    c5234.m15069(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c5234.m15069(c5234.f16402[i4 - 3]);
                                iArr = c5234.f16402;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM15074 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    if (zM15095) {
                                        i3 = c5234.f16395;
                                        iCharCount = c5234.f16400;
                                        charSequence4 = charSequence2;
                                    } else {
                                        c8054 = c8055;
                                        c8055 = c8054;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c8054 = c8055;
                                        if (i7 == 8) {
                                            c5234.f16398 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c5234.f16401.f28781) {
                                                c5234.m15104(~i8, i9 - 1);
                                                c5234.m15108(i8, i9);
                                            } else {
                                                c5234.m15085(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c6643.f20614;
                                            int i33 = i4 - 2;
                                            i13 = iArr[i33];
                                            iArr[i33] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c5234.f16398 = i5;
                                            }
                                            if (c8054.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                i3 = i14;
                                            } else {
                                                c8055 = c8054;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i34 = iArr[i11];
                                            int i35 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i34)];
                                            i12 = i34 & (i34 - 1);
                                            if (i12 == 0) {
                                                c5234.f16398 = i5;
                                            } else {
                                                c5234.f16402[i11] = i12;
                                            }
                                            i3 = i35;
                                        } else if (i7 == 6) {
                                            c5234.m15092(iArr[i4 - 2], iM15074);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            c5234.f16398 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c5234.f16398 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM15074;
                                        } else if (i7 == 1 || iM15074 <= iArr[i4 - 2]) {
                                            if (i7 == 2) {
                                                int iMax2 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                int[] iArr5 = c5234.f16402;
                                                iArr5[i6] = iMax2;
                                                int i36 = i4 - 1;
                                                i10 = iArr5[i36] - 1;
                                                iArr5[i36] = i10;
                                                if (i10 == 0) {
                                                    c5234.f16398 = i5;
                                                }
                                                iCharCount = iMax2;
                                            } else {
                                                c5234.f16398 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        } else {
                                            iArr[i6] = iM15074 - 1;
                                        }
                                    } else {
                                        if (c8055.m21407()) {
                                            c5234.f16390 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i37 = c5234.f16402[i15];
                                        c8054 = c8055;
                                        iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i37 - Character.charCount(Character.codePointBefore(charSequence2, i37)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (iM15074 < 0) {
                                            c5234.f16398 = i5;
                                            c8055 = c8054;
                                        } else {
                                            c5234.f16402[i15] = iM15074;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM15074;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            break;
                        case 1:
                            c8055 = c8055;
                            c5232 = c5233;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            charSequence2 = charSequence4;
                            if (iCharCount < length) {
                                if (((InterfaceC10795) objArr2[iArr3[i28 + 2]]).mo2465(charSequence2.charAt(iCharCount))) {
                                    iCharCount++;
                                }
                                charSequence4 = charSequence2;
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            } else {
                                c8055.f24842 = true;
                            }
                            while (true) {
                                i4 = c5234.f16398;
                                if (i4 == 0) {
                                    c5234.m15069(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c5234.m15069(c5234.f16402[i4 - 3]);
                                iArr = c5234.f16402;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM15074 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    if (zM15095) {
                                        c8054 = c8055;
                                        c8055 = c8054;
                                    } else {
                                        i3 = c5234.f16395;
                                        iCharCount = c5234.f16400;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c8054 = c8055;
                                        if (i7 == 8) {
                                            c5234.f16398 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c5234.f16401.f28781) {
                                                c5234.m15104(~i8, i9 - 1);
                                                c5234.m15108(i8, i9);
                                            } else {
                                                c5234.m15085(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c6643.f20614;
                                            int i38 = i4 - 2;
                                            i13 = iArr[i38];
                                            iArr[i38] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c5234.f16398 = i5;
                                            }
                                            if (c8054.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                c8055 = c8054;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i39 = iArr[i11];
                                            int i310 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i39)];
                                            i12 = i39 & (i39 - 1);
                                            if (i12 == 0) {
                                                c5234.f16398 = i5;
                                            } else {
                                                c5234.f16402[i11] = i12;
                                            }
                                            i3 = i310;
                                        } else if (i7 == 6) {
                                            c5234.m15092(iArr[i4 - 2], iM15074);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            c5234.f16398 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c5234.f16398 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM15074;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax3 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr6 = c5234.f16402;
                                                    iArr6[i6] = iMax3;
                                                    int i311 = i4 - 1;
                                                    i10 = iArr6[i311] - 1;
                                                    iArr6[i311] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax3;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax4 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                int[] iArr7 = c5234.f16402;
                                                iArr7[i6] = iMax4;
                                                int i312 = i4 - 1;
                                                i10 = iArr7[i312] - 1;
                                                iArr7[i312] = i10;
                                                if (i10 == 0) {
                                                    c5234.f16398 = i5;
                                                }
                                                iCharCount = iMax4;
                                            } else {
                                                c5234.f16398 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c8055.m21407()) {
                                            c5234.f16390 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i313 = c5234.f16402[i15];
                                        c8054 = c8055;
                                        iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i313 - Character.charCount(Character.codePointBefore(charSequence2, i313)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (iM15074 < 0) {
                                            c5234.f16398 = i5;
                                            c8055 = c8054;
                                        } else {
                                            c5234.f16402[i15] = iM15074;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM15074;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            break;
                        case 2:
                            c8055 = c8055;
                            c5232 = c5233;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            charSequence2 = charSequence4;
                            if (iCharCount < length) {
                                int iCodePointAt = Character.codePointAt(charSequence2, iCharCount);
                                iCharCount += Character.charCount(iCodePointAt);
                                if (iCharCount <= c8055.f24844) {
                                    if (((InterfaceC10795) objArr2[iArr3[i28 + 2]]).mo2465(iCodePointAt)) {
                                        charSequence4 = charSequence2;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c5233 = c5232;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                } else {
                                    c8055.f24842 = true;
                                }
                            } else {
                                c8055.f24842 = true;
                            }
                            while (true) {
                                i4 = c5234.f16398;
                                if (i4 == 0) {
                                    c5234.m15069(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c5234.m15069(c5234.f16402[i4 - 3]);
                                iArr = c5234.f16402;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM15074 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    if (zM15095) {
                                        c8054 = c8055;
                                        c8055 = c8054;
                                    } else {
                                        i3 = c5234.f16395;
                                        iCharCount = c5234.f16400;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c8054 = c8055;
                                        if (i7 == 8) {
                                            c5234.f16398 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c5234.f16401.f28781) {
                                                c5234.m15104(~i8, i9 - 1);
                                                c5234.m15108(i8, i9);
                                            } else {
                                                c5234.m15085(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c6643.f20614;
                                            int i314 = i4 - 2;
                                            i13 = iArr[i314];
                                            iArr[i314] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c5234.f16398 = i5;
                                            }
                                            if (c8054.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                c8055 = c8054;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i315 = iArr[i11];
                                            int i316 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i315)];
                                            i12 = i315 & (i315 - 1);
                                            if (i12 == 0) {
                                                c5234.f16398 = i5;
                                            } else {
                                                c5234.f16402[i11] = i12;
                                            }
                                            i3 = i316;
                                        } else if (i7 == 6) {
                                            c5234.m15092(iArr[i4 - 2], iM15074);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            c5234.f16398 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c5234.f16398 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM15074;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax5 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr8 = c5234.f16402;
                                                    iArr8[i6] = iMax5;
                                                    int i317 = i4 - 1;
                                                    i10 = iArr8[i317] - 1;
                                                    iArr8[i317] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax5;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax6 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                int[] iArr9 = c5234.f16402;
                                                iArr9[i6] = iMax6;
                                                int i318 = i4 - 1;
                                                i10 = iArr9[i318] - 1;
                                                iArr9[i318] = i10;
                                                if (i10 == 0) {
                                                    c5234.f16398 = i5;
                                                }
                                                iCharCount = iMax6;
                                            } else {
                                                c5234.f16398 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c8055.m21407()) {
                                            c5234.f16390 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i319 = c5234.f16402[i15];
                                        c8054 = c8055;
                                        iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i319 - Character.charCount(Character.codePointBefore(charSequence2, i319)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (iM15074 < 0) {
                                            c5234.f16398 = i5;
                                            c8055 = c8054;
                                        } else {
                                            c5234.f16402[i15] = iM15074;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM15074;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            break;
                        case 3:
                            c8055 = c8055;
                            c5232 = c5233;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            charSequence2 = charSequence4;
                            int[] iArr10 = (int[]) objArr2[iArr3[i28 + 2]];
                            int i40 = 0;
                            while (i40 < iArr10.length && (i16 = iCharCount + i40) < length && iArr10[i40] == charSequence2.charAt(i16)) {
                                i40++;
                                if (c8055.m21407()) {
                                    c5234.f16390 = true;
                                    return false;
                                }
                            }
                            if (i40 != iArr10.length) {
                                if (iCharCount + i40 >= length) {
                                    c8055.f24842 = true;
                                }
                                while (true) {
                                    i4 = c5234.f16398;
                                    if (i4 == 0) {
                                        c5234.m15069(0);
                                        return false;
                                    }
                                    i5 = i4 - 6;
                                    c5234.m15069(c5234.f16402[i4 - 3]);
                                    iArr = c5234.f16402;
                                    i3 = iArr[i4 - 5];
                                    i6 = i4 - 4;
                                    iM15074 = iArr[i6];
                                    i7 = iArr[i5];
                                    if (i7 == 7) {
                                        zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (zM15095) {
                                            c8054 = c8055;
                                            c8055 = c8054;
                                        } else {
                                            i3 = c5234.f16395;
                                            iCharCount = c5234.f16400;
                                        }
                                    } else {
                                        if (i7 == 9) {
                                            c8054 = c8055;
                                            if (i7 == 8) {
                                                c5234.f16398 = i5;
                                                i8 = iArr[i4 - 2];
                                                i9 = iArr[i4 - 1];
                                                if (c5234.f16401.f28781) {
                                                    c5234.m15104(~i8, i9 - 1);
                                                    c5234.m15108(i8, i9);
                                                } else {
                                                    c5234.m15085(i8, i9);
                                                }
                                            } else if (i7 == 3) {
                                                c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                iArr2 = c6643.f20614;
                                                int i3110 = i4 - 2;
                                                i13 = iArr[i3110];
                                                iArr[i3110] = i13 + 1;
                                                i14 = iArr2[i13];
                                                if (i13 == iArr2.length - 1) {
                                                    c5234.f16398 = i5;
                                                }
                                                if (c8054.m21407()) {
                                                    c5234.f16390 = true;
                                                    return false;
                                                }
                                                if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                    c8055 = c8054;
                                                } else {
                                                    i3 = i14;
                                                }
                                            } else if (i7 == 4) {
                                                i11 = i4 - 2;
                                                int i3111 = iArr[i11];
                                                int i3112 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i3111)];
                                                i12 = i3111 & (i3111 - 1);
                                                if (i12 == 0) {
                                                    c5234.f16398 = i5;
                                                } else {
                                                    c5234.f16402[i11] = i12;
                                                }
                                                i3 = i3112;
                                            } else if (i7 == 6) {
                                                c5234.m15092(iArr[i4 - 2], iM15074);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                c5234.f16398 = i5;
                                            } else if (i7 == 5) {
                                                i29 = iArr[i4 - 2];
                                                i30 = iArr[i4 - 1];
                                                c5234.f16398 = i5;
                                                charSequence4 = charSequence2;
                                                iCharCount = iM15074;
                                            } else if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax7 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr11 = c5234.f16402;
                                                    iArr11[i6] = iMax7;
                                                    int i3113 = i4 - 1;
                                                    i10 = iArr11[i3113] - 1;
                                                    iArr11[i3113] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax7;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax8 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                int[] iArr12 = c5234.f16402;
                                                iArr12[i6] = iMax8;
                                                int i3114 = i4 - 1;
                                                i10 = iArr12[i3114] - 1;
                                                iArr12[i3114] = i10;
                                                if (i10 == 0) {
                                                    c5234.f16398 = i5;
                                                }
                                                iCharCount = iMax8;
                                            } else {
                                                c5234.f16398 = i5;
                                            }
                                        } else {
                                            if (c8055.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            i15 = i4 - 1;
                                            int i3115 = c5234.f16402[i15];
                                            c8054 = c8055;
                                            iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i3115 - Character.charCount(Character.codePointBefore(charSequence2, i3115)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (iM15074 < 0) {
                                                c5234.f16398 = i5;
                                                c8055 = c8054;
                                            } else {
                                                c5234.f16402[i15] = iM15074;
                                                i14 = iArr3[i3 + 1];
                                                i3 = i14;
                                            }
                                        }
                                        iCharCount = iM15074;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c5233 = c5232;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            } else {
                                iCharCount += i40;
                            }
                            charSequence4 = charSequence2;
                            i28 = i3;
                            z2 = false;
                            c5233 = c5232;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 4:
                            c8055 = c8055;
                            c5232 = c5233;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            charSequence2 = charSequence4;
                            InterfaceC10795 interfaceC10795 = (InterfaceC10795) objArr2[iArr3[i28 + 2]];
                            int i41 = iCharCount;
                            while (i41 < length && interfaceC10795.mo2465(charSequence2.charAt(i41))) {
                                i41++;
                                if (c8055.m21407()) {
                                    c5234.f16390 = true;
                                    return false;
                                }
                            }
                            if (i41 >= length) {
                                c8055.f24842 = true;
                            }
                            int i42 = iArr3[i28 + 3];
                            if (i41 - iCharCount >= i42) {
                                int i43 = iCharCount + i42;
                                if (i41 > i43) {
                                    c5234.m15050(1, i3, i41 - 1, i43, 0);
                                }
                                z2 = false;
                                iCharCount = i41;
                                charSequence4 = charSequence2;
                                i28 = i3;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                c5233 = c5232;
                            } else {
                                while (true) {
                                    i4 = c5234.f16398;
                                    if (i4 == 0) {
                                        c5234.m15069(0);
                                        return false;
                                    }
                                    i5 = i4 - 6;
                                    c5234.m15069(c5234.f16402[i4 - 3]);
                                    iArr = c5234.f16402;
                                    i3 = iArr[i4 - 5];
                                    i6 = i4 - 4;
                                    iM15074 = iArr[i6];
                                    i7 = iArr[i5];
                                    if (i7 == 7) {
                                        zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (zM15095) {
                                            c8054 = c8055;
                                            c8055 = c8054;
                                        } else {
                                            i3 = c5234.f16395;
                                            iCharCount = c5234.f16400;
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (i7 == 9) {
                                            c8054 = c8055;
                                            if (i7 == 8) {
                                                c5234.f16398 = i5;
                                                i8 = iArr[i4 - 2];
                                                i9 = iArr[i4 - 1];
                                                if (c5234.f16401.f28781) {
                                                    c5234.m15104(~i8, i9 - 1);
                                                    c5234.m15108(i8, i9);
                                                } else {
                                                    c5234.m15085(i8, i9);
                                                }
                                            } else if (i7 == 3) {
                                                c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                iArr2 = c6643.f20614;
                                                int i3116 = i4 - 2;
                                                i13 = iArr[i3116];
                                                iArr[i3116] = i13 + 1;
                                                i14 = iArr2[i13];
                                                if (i13 == iArr2.length - 1) {
                                                    c5234.f16398 = i5;
                                                }
                                                if (c8054.m21407()) {
                                                    c5234.f16390 = true;
                                                    return false;
                                                }
                                                if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                    c8055 = c8054;
                                                } else {
                                                    i3 = i14;
                                                }
                                            } else if (i7 == 4) {
                                                i11 = i4 - 2;
                                                int i3117 = iArr[i11];
                                                int i3118 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i3117)];
                                                i12 = i3117 & (i3117 - 1);
                                                if (i12 == 0) {
                                                    c5234.f16398 = i5;
                                                } else {
                                                    c5234.f16402[i11] = i12;
                                                }
                                                i3 = i3118;
                                            } else if (i7 == 6) {
                                                c5234.m15092(iArr[i4 - 2], iM15074);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                c5234.f16398 = i5;
                                            } else if (i7 == 5) {
                                                i29 = iArr[i4 - 2];
                                                i30 = iArr[i4 - 1];
                                                c5234.f16398 = i5;
                                                charSequence4 = charSequence2;
                                                iCharCount = iM15074;
                                            } else {
                                                if (i7 == 1) {
                                                    if (i7 == 2) {
                                                        int iMax9 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                        int[] iArr13 = c5234.f16402;
                                                        iArr13[i6] = iMax9;
                                                        int i3119 = i4 - 1;
                                                        i10 = iArr13[i3119] - 1;
                                                        iArr13[i3119] = i10;
                                                        if (i10 == 0) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        iCharCount = iMax9;
                                                    } else {
                                                        c5234.f16398 = i5;
                                                    }
                                                } else if (i7 == 2) {
                                                    int iMax10 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr14 = c5234.f16402;
                                                    iArr14[i6] = iMax10;
                                                    int i31110 = i4 - 1;
                                                    i10 = iArr14[i31110] - 1;
                                                    iArr14[i31110] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax10;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (c8055.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            i15 = i4 - 1;
                                            int i31111 = c5234.f16402[i15];
                                            c8054 = c8055;
                                            iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i31111 - Character.charCount(Character.codePointBefore(charSequence2, i31111)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (iM15074 < 0) {
                                                c5234.f16398 = i5;
                                                c8055 = c8054;
                                            } else {
                                                c5234.f16402[i15] = iM15074;
                                                i14 = iArr3[i3 + 1];
                                                i3 = i14;
                                            }
                                        }
                                        iCharCount = iM15074;
                                        charSequence4 = charSequence2;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c5233 = c5232;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            }
                            break;
                        case 5:
                        case 33:
                            c8055 = c8055;
                            c5232 = c5233;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            charSequence2 = charSequence4;
                            InterfaceC10795 interfaceC10796 = (InterfaceC10795) objArr2[iArr3[i28 + 2]];
                            boolean z4 = i32 == 33;
                            int i44 = 0;
                            int i45 = iCharCount;
                            while (i45 < length) {
                                int iCodePointAt2 = Character.codePointAt(charSequence2, i45);
                                int iCharCount2 = Character.charCount(iCodePointAt2);
                                if (i45 + iCharCount2 > length) {
                                    c8055.f24842 = true;
                                    if (!z4) {
                                        iCodePointAt2 = charSequence2.charAt(i45);
                                    }
                                    iCharCount2 = 1;
                                }
                                if (!interfaceC10796.mo2465(iCodePointAt2)) {
                                    if (i45 >= length) {
                                        c8055.f24842 = true;
                                    }
                                    i17 = iArr3[i28 + 3];
                                    if (i44 < i17) {
                                        while (true) {
                                            i4 = c5234.f16398;
                                            if (i4 == 0) {
                                                c5234.m15069(0);
                                                return false;
                                            }
                                            i5 = i4 - 6;
                                            c5234.m15069(c5234.f16402[i4 - 3]);
                                            iArr = c5234.f16402;
                                            i3 = iArr[i4 - 5];
                                            i6 = i4 - 4;
                                            iM15074 = iArr[i6];
                                            i7 = iArr[i5];
                                            if (i7 == 7) {
                                                zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                if (zM15095) {
                                                    c8054 = c8055;
                                                    c8055 = c8054;
                                                } else {
                                                    i3 = c5234.f16395;
                                                    iCharCount = c5234.f16400;
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (i7 == 9) {
                                                    c8054 = c8055;
                                                    if (i7 == 8) {
                                                        c5234.f16398 = i5;
                                                        i8 = iArr[i4 - 2];
                                                        i9 = iArr[i4 - 1];
                                                        if (c5234.f16401.f28781) {
                                                            c5234.m15104(~i8, i9 - 1);
                                                            c5234.m15108(i8, i9);
                                                        } else {
                                                            c5234.m15085(i8, i9);
                                                        }
                                                    } else if (i7 == 3) {
                                                        c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                        iArr2 = c6643.f20614;
                                                        int i31112 = i4 - 2;
                                                        i13 = iArr[i31112];
                                                        iArr[i31112] = i13 + 1;
                                                        i14 = iArr2[i13];
                                                        if (i13 == iArr2.length - 1) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        if (c8054.m21407()) {
                                                            c5234.f16390 = true;
                                                            return false;
                                                        }
                                                        if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                            c8055 = c8054;
                                                        } else {
                                                            i3 = i14;
                                                        }
                                                    } else if (i7 == 4) {
                                                        i11 = i4 - 2;
                                                        int i31113 = iArr[i11];
                                                        int i31114 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i31113)];
                                                        i12 = i31113 & (i31113 - 1);
                                                        if (i12 == 0) {
                                                            c5234.f16398 = i5;
                                                        } else {
                                                            c5234.f16402[i11] = i12;
                                                        }
                                                        i3 = i31114;
                                                    } else if (i7 == 6) {
                                                        c5234.m15092(iArr[i4 - 2], iM15074);
                                                        if (c5234.f16390) {
                                                            return false;
                                                        }
                                                        c5234.f16398 = i5;
                                                    } else if (i7 == 5) {
                                                        i29 = iArr[i4 - 2];
                                                        i30 = iArr[i4 - 1];
                                                        c5234.f16398 = i5;
                                                        charSequence4 = charSequence2;
                                                        iCharCount = iM15074;
                                                    } else {
                                                        if (i7 == 1) {
                                                            if (i7 == 2) {
                                                                int iMax11 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                                int[] iArr15 = c5234.f16402;
                                                                iArr15[i6] = iMax11;
                                                                int i31115 = i4 - 1;
                                                                i10 = iArr15[i31115] - 1;
                                                                iArr15[i31115] = i10;
                                                                if (i10 == 0) {
                                                                    c5234.f16398 = i5;
                                                                }
                                                                iCharCount = iMax11;
                                                            } else {
                                                                c5234.f16398 = i5;
                                                            }
                                                        } else if (i7 == 2) {
                                                            int iMax12 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                            int[] iArr16 = c5234.f16402;
                                                            iArr16[i6] = iMax12;
                                                            int i31116 = i4 - 1;
                                                            i10 = iArr16[i31116] - 1;
                                                            iArr16[i31116] = i10;
                                                            if (i10 == 0) {
                                                                c5234.f16398 = i5;
                                                            }
                                                            iCharCount = iMax12;
                                                        } else {
                                                            c5234.f16398 = i5;
                                                        }
                                                        charSequence4 = charSequence2;
                                                    }
                                                } else {
                                                    if (c8055.m21407()) {
                                                        c5234.f16390 = true;
                                                        return false;
                                                    }
                                                    i15 = i4 - 1;
                                                    int i31117 = c5234.f16402[i15];
                                                    c8054 = c8055;
                                                    iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i31117 - Character.charCount(Character.codePointBefore(charSequence2, i31117)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                                    if (c5234.f16390) {
                                                        return false;
                                                    }
                                                    if (iM15074 < 0) {
                                                        c5234.f16398 = i5;
                                                        c8055 = c8054;
                                                    } else {
                                                        c5234.f16402[i15] = iM15074;
                                                        i14 = iArr3[i3 + 1];
                                                        i3 = i14;
                                                    }
                                                }
                                                iCharCount = iM15074;
                                                charSequence4 = charSequence2;
                                            }
                                        }
                                    } else {
                                        if (i44 > i17) {
                                            c5234.m15050(2, i3, i45, iCharCount, i44 - i17);
                                        }
                                        charSequence4 = charSequence2;
                                        iCharCount = i45;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c5233 = c5232;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                } else {
                                    i45 += iCharCount2;
                                    i44++;
                                    if (c8055.m21407()) {
                                        c5234.f16390 = true;
                                        return false;
                                    }
                                }
                                break;
                            }
                            if (i45 >= length) {
                                c8055.f24842 = true;
                            }
                            i17 = iArr3[i28 + 3];
                            if (i44 < i17) {
                                while (true) {
                                    i4 = c5234.f16398;
                                    if (i4 == 0) {
                                        c5234.m15069(0);
                                        return false;
                                    }
                                    i5 = i4 - 6;
                                    c5234.m15069(c5234.f16402[i4 - 3]);
                                    iArr = c5234.f16402;
                                    i3 = iArr[i4 - 5];
                                    i6 = i4 - 4;
                                    iM15074 = iArr[i6];
                                    i7 = iArr[i5];
                                    if (i7 == 7) {
                                        zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (zM15095) {
                                            c8054 = c8055;
                                            c8055 = c8054;
                                        } else {
                                            i3 = c5234.f16395;
                                            iCharCount = c5234.f16400;
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (i7 == 9) {
                                            c8054 = c8055;
                                            if (i7 == 8) {
                                                c5234.f16398 = i5;
                                                i8 = iArr[i4 - 2];
                                                i9 = iArr[i4 - 1];
                                                if (c5234.f16401.f28781) {
                                                    c5234.m15104(~i8, i9 - 1);
                                                    c5234.m15108(i8, i9);
                                                } else {
                                                    c5234.m15085(i8, i9);
                                                }
                                            } else if (i7 == 3) {
                                                c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                iArr2 = c6643.f20614;
                                                int i31118 = i4 - 2;
                                                i13 = iArr[i31118];
                                                iArr[i31118] = i13 + 1;
                                                i14 = iArr2[i13];
                                                if (i13 == iArr2.length - 1) {
                                                    c5234.f16398 = i5;
                                                }
                                                if (c8054.m21407()) {
                                                    c5234.f16390 = true;
                                                    return false;
                                                }
                                                if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                    c8055 = c8054;
                                                } else {
                                                    i3 = i14;
                                                }
                                            } else if (i7 == 4) {
                                                i11 = i4 - 2;
                                                int i31119 = iArr[i11];
                                                int i311110 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i31119)];
                                                i12 = i31119 & (i31119 - 1);
                                                if (i12 == 0) {
                                                    c5234.f16398 = i5;
                                                } else {
                                                    c5234.f16402[i11] = i12;
                                                }
                                                i3 = i311110;
                                            } else if (i7 == 6) {
                                                c5234.m15092(iArr[i4 - 2], iM15074);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                c5234.f16398 = i5;
                                            } else if (i7 == 5) {
                                                i29 = iArr[i4 - 2];
                                                i30 = iArr[i4 - 1];
                                                c5234.f16398 = i5;
                                                charSequence4 = charSequence2;
                                                iCharCount = iM15074;
                                            } else {
                                                if (i7 == 1) {
                                                    if (i7 == 2) {
                                                        int iMax13 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                        int[] iArr17 = c5234.f16402;
                                                        iArr17[i6] = iMax13;
                                                        int i311111 = i4 - 1;
                                                        i10 = iArr17[i311111] - 1;
                                                        iArr17[i311111] = i10;
                                                        if (i10 == 0) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        iCharCount = iMax13;
                                                    } else {
                                                        c5234.f16398 = i5;
                                                    }
                                                } else if (i7 == 2) {
                                                    int iMax14 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr18 = c5234.f16402;
                                                    iArr18[i6] = iMax14;
                                                    int i311112 = i4 - 1;
                                                    i10 = iArr18[i311112] - 1;
                                                    iArr18[i311112] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax14;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (c8055.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            i15 = i4 - 1;
                                            int i311113 = c5234.f16402[i15];
                                            c8054 = c8055;
                                            iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i311113 - Character.charCount(Character.codePointBefore(charSequence2, i311113)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (iM15074 < 0) {
                                                c5234.f16398 = i5;
                                                c8055 = c8054;
                                            } else {
                                                c5234.f16402[i15] = iM15074;
                                                i14 = iArr3[i3 + 1];
                                                i3 = i14;
                                            }
                                        }
                                        iCharCount = iM15074;
                                        charSequence4 = charSequence2;
                                    }
                                }
                            } else {
                                if (i44 > i17) {
                                    c5234.m15050(2, i3, i45, iCharCount, i44 - i17);
                                }
                                charSequence4 = charSequence2;
                                iCharCount = i45;
                            }
                            i28 = i3;
                            z2 = false;
                            c5233 = c5232;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 6:
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            C6643 c6644 = (C6643) objArr2[iArr3[i28 + 2]];
                            if (iCharCount < length && c6644.f20612 != null && (cCharAt = charSequence2.charAt(iCharCount)) < 128) {
                                int i46 = c6644.f20612[cCharAt];
                                if (i46 != 0) {
                                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i46);
                                    int i47 = i46 & (i46 - 1);
                                    if (i47 != 0) {
                                        c5234.m15050(4, i28, iCharCount, i47, 0);
                                    }
                                    i3 = c6644.f20614[iNumberOfTrailingZeros];
                                    c5232 = this;
                                }
                                c5232 = this;
                                c8055 = c8055;
                                while (true) {
                                    i4 = c5234.f16398;
                                    if (i4 == 0) {
                                        c5234.m15069(0);
                                        return false;
                                    }
                                    i5 = i4 - 6;
                                    c5234.m15069(c5234.f16402[i4 - 3]);
                                    iArr = c5234.f16402;
                                    i3 = iArr[i4 - 5];
                                    i6 = i4 - 4;
                                    iM15074 = iArr[i6];
                                    i7 = iArr[i5];
                                    if (i7 == 7) {
                                        zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (zM15095) {
                                            c8054 = c8055;
                                            c8055 = c8054;
                                        } else {
                                            i3 = c5234.f16395;
                                            iCharCount = c5234.f16400;
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (i7 == 9) {
                                            c8054 = c8055;
                                            if (i7 == 8) {
                                                c5234.f16398 = i5;
                                                i8 = iArr[i4 - 2];
                                                i9 = iArr[i4 - 1];
                                                if (c5234.f16401.f28781) {
                                                    c5234.m15104(~i8, i9 - 1);
                                                    c5234.m15108(i8, i9);
                                                } else {
                                                    c5234.m15085(i8, i9);
                                                }
                                            } else if (i7 == 3) {
                                                c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                iArr2 = c6643.f20614;
                                                int i311114 = i4 - 2;
                                                i13 = iArr[i311114];
                                                iArr[i311114] = i13 + 1;
                                                i14 = iArr2[i13];
                                                if (i13 == iArr2.length - 1) {
                                                    c5234.f16398 = i5;
                                                }
                                                if (c8054.m21407()) {
                                                    c5234.f16390 = true;
                                                    return false;
                                                }
                                                if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                    c8055 = c8054;
                                                } else {
                                                    i3 = i14;
                                                }
                                            } else if (i7 == 4) {
                                                i11 = i4 - 2;
                                                int i311115 = iArr[i11];
                                                int i311116 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i311115)];
                                                i12 = i311115 & (i311115 - 1);
                                                if (i12 == 0) {
                                                    c5234.f16398 = i5;
                                                } else {
                                                    c5234.f16402[i11] = i12;
                                                }
                                                i3 = i311116;
                                            } else if (i7 == 6) {
                                                c5234.m15092(iArr[i4 - 2], iM15074);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                c5234.f16398 = i5;
                                            } else if (i7 == 5) {
                                                i29 = iArr[i4 - 2];
                                                i30 = iArr[i4 - 1];
                                                c5234.f16398 = i5;
                                                charSequence4 = charSequence2;
                                                iCharCount = iM15074;
                                            } else {
                                                if (i7 == 1) {
                                                    if (i7 == 2) {
                                                        int iMax15 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                        int[] iArr19 = c5234.f16402;
                                                        iArr19[i6] = iMax15;
                                                        int i311117 = i4 - 1;
                                                        i10 = iArr19[i311117] - 1;
                                                        iArr19[i311117] = i10;
                                                        if (i10 == 0) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        iCharCount = iMax15;
                                                    } else {
                                                        c5234.f16398 = i5;
                                                    }
                                                } else if (i7 == 2) {
                                                    int iMax16 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr110 = c5234.f16402;
                                                    iArr110[i6] = iMax16;
                                                    int i311118 = i4 - 1;
                                                    i10 = iArr110[i311118] - 1;
                                                    iArr110[i311118] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax16;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (c8055.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            i15 = i4 - 1;
                                            int i311119 = c5234.f16402[i15];
                                            c8054 = c8055;
                                            iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i311119 - Character.charCount(Character.codePointBefore(charSequence2, i311119)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (iM15074 < 0) {
                                                c5234.f16398 = i5;
                                                c8055 = c8054;
                                            } else {
                                                c5234.f16402[i15] = iM15074;
                                                i14 = iArr3[i3 + 1];
                                                i3 = i14;
                                            }
                                        }
                                        iCharCount = iM15074;
                                        charSequence4 = charSequence2;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c5233 = c5232;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            } else {
                                if (c6644.f20614.length > 1) {
                                    m15050(3, i28, iCharCount, 1, 0);
                                }
                                c5232 = this;
                                if (!c5232.m15061(c6644, 0, iCharCount, charSequence2)) {
                                    c5234 = c5232;
                                    while (true) {
                                        i4 = c5234.f16398;
                                        if (i4 == 0) {
                                            c5234.m15069(0);
                                            return false;
                                        }
                                        i5 = i4 - 6;
                                        c5234.m15069(c5234.f16402[i4 - 3]);
                                        iArr = c5234.f16402;
                                        i3 = iArr[i4 - 5];
                                        i6 = i4 - 4;
                                        iM15074 = iArr[i6];
                                        i7 = iArr[i5];
                                        if (i7 == 7) {
                                            zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (zM15095) {
                                                c8054 = c8055;
                                                c8055 = c8054;
                                            } else {
                                                i3 = c5234.f16395;
                                                iCharCount = c5234.f16400;
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (i7 == 9) {
                                                c8054 = c8055;
                                                if (i7 == 8) {
                                                    c5234.f16398 = i5;
                                                    i8 = iArr[i4 - 2];
                                                    i9 = iArr[i4 - 1];
                                                    if (c5234.f16401.f28781) {
                                                        c5234.m15104(~i8, i9 - 1);
                                                        c5234.m15108(i8, i9);
                                                    } else {
                                                        c5234.m15085(i8, i9);
                                                    }
                                                } else if (i7 == 3) {
                                                    c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                    iArr2 = c6643.f20614;
                                                    int i3111110 = i4 - 2;
                                                    i13 = iArr[i3111110];
                                                    iArr[i3111110] = i13 + 1;
                                                    i14 = iArr2[i13];
                                                    if (i13 == iArr2.length - 1) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    if (c8054.m21407()) {
                                                        c5234.f16390 = true;
                                                        return false;
                                                    }
                                                    if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                        c8055 = c8054;
                                                    } else {
                                                        i3 = i14;
                                                    }
                                                } else if (i7 == 4) {
                                                    i11 = i4 - 2;
                                                    int i3111111 = iArr[i11];
                                                    int i3111112 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i3111111)];
                                                    i12 = i3111111 & (i3111111 - 1);
                                                    if (i12 == 0) {
                                                        c5234.f16398 = i5;
                                                    } else {
                                                        c5234.f16402[i11] = i12;
                                                    }
                                                    i3 = i3111112;
                                                } else if (i7 == 6) {
                                                    c5234.m15092(iArr[i4 - 2], iM15074);
                                                    if (c5234.f16390) {
                                                        return false;
                                                    }
                                                    c5234.f16398 = i5;
                                                } else if (i7 == 5) {
                                                    i29 = iArr[i4 - 2];
                                                    i30 = iArr[i4 - 1];
                                                    c5234.f16398 = i5;
                                                    charSequence4 = charSequence2;
                                                    iCharCount = iM15074;
                                                } else {
                                                    if (i7 == 1) {
                                                        if (i7 == 2) {
                                                            int iMax17 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                            int[] iArr111 = c5234.f16402;
                                                            iArr111[i6] = iMax17;
                                                            int i3111113 = i4 - 1;
                                                            i10 = iArr111[i3111113] - 1;
                                                            iArr111[i3111113] = i10;
                                                            if (i10 == 0) {
                                                                c5234.f16398 = i5;
                                                            }
                                                            iCharCount = iMax17;
                                                        } else {
                                                            c5234.f16398 = i5;
                                                        }
                                                    } else if (i7 == 2) {
                                                        int iMax18 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                        int[] iArr112 = c5234.f16402;
                                                        iArr112[i6] = iMax18;
                                                        int i3111114 = i4 - 1;
                                                        i10 = iArr112[i3111114] - 1;
                                                        iArr112[i3111114] = i10;
                                                        if (i10 == 0) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        iCharCount = iMax18;
                                                    } else {
                                                        c5234.f16398 = i5;
                                                    }
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (c8055.m21407()) {
                                                    c5234.f16390 = true;
                                                    return false;
                                                }
                                                i15 = i4 - 1;
                                                int i3111115 = c5234.f16402[i15];
                                                c8054 = c8055;
                                                iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i3111115 - Character.charCount(Character.codePointBefore(charSequence2, i3111115)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                if (iM15074 < 0) {
                                                    c5234.f16398 = i5;
                                                    c8055 = c8054;
                                                } else {
                                                    c5234.f16402[i15] = iM15074;
                                                    i14 = iArr3[i3 + 1];
                                                    i3 = i14;
                                                }
                                            }
                                            iCharCount = iM15074;
                                            charSequence4 = charSequence2;
                                        }
                                        i28 = i3;
                                        z2 = false;
                                        c5233 = c5232;
                                        objArr2 = objArr2;
                                        iArr3 = iArr3;
                                    }
                                } else {
                                    i3 = c6644.f20614[0];
                                }
                            }
                            c5234 = c5232;
                            charSequence4 = charSequence2;
                            i28 = i3;
                            z2 = false;
                            c5233 = c5232;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 7:
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            if (c5234.f16401.f28781) {
                                int i48 = i28 + 2;
                                c5234.m15070(iArr3[i48]);
                                c5234.m15108(iArr3[i48], iCharCount);
                            } else {
                                c5234.m15085(iArr3[i28 + 2], iCharCount);
                            }
                            c5232 = this;
                            charSequence4 = charSequence2;
                            i28 = i3;
                            z2 = false;
                            c5233 = c5232;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 8:
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            int iM15097 = c5234.m15097(iArr3[i28 + 2]);
                            if (iM15097 < 0) {
                                c8055.m21416(iCharCount);
                                if (c5234.f16404 < 0) {
                                    return true;
                                }
                                if (!c5234.m15068(true)) {
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    c5232 = this;
                                    c8055 = c8055;
                                    while (true) {
                                        i4 = c5234.f16398;
                                        if (i4 == 0) {
                                            c5234.m15069(0);
                                            return false;
                                        }
                                        i5 = i4 - 6;
                                        c5234.m15069(c5234.f16402[i4 - 3]);
                                        iArr = c5234.f16402;
                                        i3 = iArr[i4 - 5];
                                        i6 = i4 - 4;
                                        iM15074 = iArr[i6];
                                        i7 = iArr[i5];
                                        if (i7 == 7) {
                                            zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (zM15095) {
                                                c8054 = c8055;
                                                c8055 = c8054;
                                            } else {
                                                i3 = c5234.f16395;
                                                iCharCount = c5234.f16400;
                                            }
                                        } else {
                                            if (i7 == 9) {
                                                c8054 = c8055;
                                                if (i7 == 8) {
                                                    c5234.f16398 = i5;
                                                    i8 = iArr[i4 - 2];
                                                    i9 = iArr[i4 - 1];
                                                    if (c5234.f16401.f28781) {
                                                        c5234.m15104(~i8, i9 - 1);
                                                        c5234.m15108(i8, i9);
                                                    } else {
                                                        c5234.m15085(i8, i9);
                                                    }
                                                } else if (i7 == 3) {
                                                    c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                    iArr2 = c6643.f20614;
                                                    int i3111116 = i4 - 2;
                                                    i13 = iArr[i3111116];
                                                    iArr[i3111116] = i13 + 1;
                                                    i14 = iArr2[i13];
                                                    if (i13 == iArr2.length - 1) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    if (c8054.m21407()) {
                                                        c5234.f16390 = true;
                                                        return false;
                                                    }
                                                    if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                        c8055 = c8054;
                                                    } else {
                                                        i3 = i14;
                                                    }
                                                } else if (i7 == 4) {
                                                    i11 = i4 - 2;
                                                    int i3111117 = iArr[i11];
                                                    int i3111118 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i3111117)];
                                                    i12 = i3111117 & (i3111117 - 1);
                                                    if (i12 == 0) {
                                                        c5234.f16398 = i5;
                                                    } else {
                                                        c5234.f16402[i11] = i12;
                                                    }
                                                    i3 = i3111118;
                                                } else if (i7 == 6) {
                                                    c5234.m15092(iArr[i4 - 2], iM15074);
                                                    if (c5234.f16390) {
                                                        return false;
                                                    }
                                                    c5234.f16398 = i5;
                                                } else if (i7 == 5) {
                                                    i29 = iArr[i4 - 2];
                                                    i30 = iArr[i4 - 1];
                                                    c5234.f16398 = i5;
                                                    charSequence4 = charSequence2;
                                                    iCharCount = iM15074;
                                                } else if (i7 == 1) {
                                                    if (i7 == 2) {
                                                        int iMax19 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                        int[] iArr113 = c5234.f16402;
                                                        iArr113[i6] = iMax19;
                                                        int i3111119 = i4 - 1;
                                                        i10 = iArr113[i3111119] - 1;
                                                        iArr113[i3111119] = i10;
                                                        if (i10 == 0) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        iCharCount = iMax19;
                                                    } else {
                                                        c5234.f16398 = i5;
                                                    }
                                                } else if (i7 == 2) {
                                                    int iMax110 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr114 = c5234.f16402;
                                                    iArr114[i6] = iMax110;
                                                    int i31111110 = i4 - 1;
                                                    i10 = iArr114[i31111110] - 1;
                                                    iArr114[i31111110] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax110;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                            } else {
                                                if (c8055.m21407()) {
                                                    c5234.f16390 = true;
                                                    return false;
                                                }
                                                i15 = i4 - 1;
                                                int i31111111 = c5234.f16402[i15];
                                                c8054 = c8055;
                                                iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i31111111 - Character.charCount(Character.codePointBefore(charSequence2, i31111111)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                if (iM15074 < 0) {
                                                    c5234.f16398 = i5;
                                                    c8055 = c8054;
                                                } else {
                                                    c5234.f16402[i15] = iM15074;
                                                    i14 = iArr3[i3 + 1];
                                                    i3 = i14;
                                                }
                                            }
                                            iCharCount = iM15074;
                                        }
                                        i28 = i3;
                                        z2 = false;
                                        c5233 = c5232;
                                        objArr2 = objArr2;
                                        iArr3 = iArr3;
                                    }
                                } else {
                                    int i49 = c5234.f16395;
                                    iCharCount = c5234.f16400;
                                    c5232 = this;
                                    i3 = i49;
                                }
                            } else {
                                int i50 = iArr3[i28 + 3];
                                if (i50 != 0 || c5234.f16401.f28781) {
                                    c5234.m15099(i50, iM15097);
                                    c5234.m15099(i50 + 1, iCharCount);
                                }
                                c5232 = this;
                            }
                            charSequence4 = charSequence2;
                            i28 = i3;
                            z2 = false;
                            c5233 = c5232;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 9:
                        case 18:
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            if (c5234.f16401.f28781) {
                                if (i32 == 18) {
                                    int i51 = iArr3[i28 + 7];
                                    C22927[] c22927Arr = c8055.f24819;
                                    if (c22927Arr[i51] == null) {
                                        c22927Arr[i51] = f16385;
                                    }
                                }
                                c5234.m15070(iArr3[i28 + 2]);
                            }
                            if (iArr3[i28 + 4] == 0) {
                                if (iArr3[i28 + 5] == 0) {
                                    charSequence2 = charSequence2;
                                } else {
                                    c5234.m15050(0, i3, iCharCount, 0, 0);
                                }
                                c5232 = this;
                                charSequence4 = charSequence2;
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            int i52 = iArr3[i28 + 2];
                            if (c5234.f16401.f28781) {
                                c5234.m15108(i52, 1);
                            } else {
                                c5234.m15085(i52, 1);
                            }
                            if (iArr3[i28] == 9 && iArr3[i28 + 7] != 0) {
                                c5234.m15085(iArr3[i28 + 3], iCharCount);
                            }
                            i3 = iArr3[i28 + 6];
                            c5232 = this;
                            charSequence4 = charSequence2;
                            i28 = i3;
                            z2 = false;
                            c5233 = c5232;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 10:
                        case 19:
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            int i53 = i28 + 3;
                            if (iCharCount > c5234.m15097(iArr3[i53])) {
                                if (!c5234.m15086()) {
                                    int i54 = i28 + 2;
                                    int iM15098 = c5234.m15097(iArr3[i54]);
                                    if (iM15098 < iArr3[i28 + 5]) {
                                        if (iM15098 >= iArr3[i28 + 4]) {
                                            if (iArr3[i28] == 19) {
                                                int i55 = i28 + 7;
                                                boolean zM15080 = c5234.m15080(iArr3[i55], iCharCount);
                                                if (!c5234.f16390) {
                                                    if (zM15080) {
                                                        c5232 = this;
                                                        charSequence2 = charSequence4;
                                                        charSequence4 = charSequence2;
                                                    } else {
                                                        c5234.m15050(6, i3, iCharCount, iArr3[i55], 0);
                                                    }
                                                }
                                            } else {
                                                m15050(0, i3, iCharCount, 0, 0);
                                            }
                                            c5234 = this;
                                        } else {
                                            iM15098 = iM15098;
                                            charSequence4 = charSequence4;
                                        }
                                        c5234.m15085(iArr3[i54], iM15098 + 1);
                                        if (iArr3[i28] == 10 && iArr3[i28 + 7] != 0) {
                                            c5234.m15085(iArr3[i53], iCharCount);
                                        }
                                        i3 = iArr3[i28 + 6];
                                        c5232 = this;
                                        charSequence4 = charSequence4;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c5233 = c5232;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                    break;
                                }
                                return false;
                            }
                            charSequence2 = charSequence4;
                            charSequence2 = charSequence2;
                            c5232 = this;
                            charSequence4 = charSequence2;
                            i28 = i3;
                            z2 = false;
                            c5233 = c5232;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 11:
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            charSequence2 = charSequence4;
                            c5232 = this;
                            charSequence4 = charSequence2;
                            i28 = i3;
                            z2 = false;
                            c5233 = c5232;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 12:
                        case 13:
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            if (i32 == 12) {
                                if (iCharCount >= length) {
                                    c8055.f24842 = true;
                                } else if (((InterfaceC10795) objArr2[iArr3[i28 + 2]]).mo2465(charSequence4.charAt(iCharCount))) {
                                    i18 = iCharCount + 1;
                                }
                                c5232 = this;
                                c8055 = c8055;
                                charSequence2 = charSequence4;
                                while (true) {
                                    i4 = c5234.f16398;
                                    if (i4 == 0) {
                                        c5234.m15069(0);
                                        return false;
                                    }
                                    i5 = i4 - 6;
                                    c5234.m15069(c5234.f16402[i4 - 3]);
                                    iArr = c5234.f16402;
                                    i3 = iArr[i4 - 5];
                                    i6 = i4 - 4;
                                    iM15074 = iArr[i6];
                                    i7 = iArr[i5];
                                    if (i7 == 7) {
                                        zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (zM15095) {
                                            c8054 = c8055;
                                            c8055 = c8054;
                                        } else {
                                            i3 = c5234.f16395;
                                            iCharCount = c5234.f16400;
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (i7 == 9) {
                                            c8054 = c8055;
                                            if (i7 == 8) {
                                                c5234.f16398 = i5;
                                                i8 = iArr[i4 - 2];
                                                i9 = iArr[i4 - 1];
                                                if (c5234.f16401.f28781) {
                                                    c5234.m15104(~i8, i9 - 1);
                                                    c5234.m15108(i8, i9);
                                                } else {
                                                    c5234.m15085(i8, i9);
                                                }
                                            } else if (i7 == 3) {
                                                c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                iArr2 = c6643.f20614;
                                                int i31111112 = i4 - 2;
                                                i13 = iArr[i31111112];
                                                iArr[i31111112] = i13 + 1;
                                                i14 = iArr2[i13];
                                                if (i13 == iArr2.length - 1) {
                                                    c5234.f16398 = i5;
                                                }
                                                if (c8054.m21407()) {
                                                    c5234.f16390 = true;
                                                    return false;
                                                }
                                                if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                    c8055 = c8054;
                                                } else {
                                                    i3 = i14;
                                                }
                                            } else if (i7 == 4) {
                                                i11 = i4 - 2;
                                                int i31111113 = iArr[i11];
                                                int i31111114 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i31111113)];
                                                i12 = i31111113 & (i31111113 - 1);
                                                if (i12 == 0) {
                                                    c5234.f16398 = i5;
                                                } else {
                                                    c5234.f16402[i11] = i12;
                                                }
                                                i3 = i31111114;
                                            } else if (i7 == 6) {
                                                c5234.m15092(iArr[i4 - 2], iM15074);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                c5234.f16398 = i5;
                                            } else if (i7 == 5) {
                                                i29 = iArr[i4 - 2];
                                                i30 = iArr[i4 - 1];
                                                c5234.f16398 = i5;
                                                charSequence4 = charSequence2;
                                                iCharCount = iM15074;
                                            } else {
                                                if (i7 == 1) {
                                                    if (i7 == 2) {
                                                        int iMax111 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                        int[] iArr115 = c5234.f16402;
                                                        iArr115[i6] = iMax111;
                                                        int i31111115 = i4 - 1;
                                                        i10 = iArr115[i31111115] - 1;
                                                        iArr115[i31111115] = i10;
                                                        if (i10 == 0) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        iCharCount = iMax111;
                                                    } else {
                                                        c5234.f16398 = i5;
                                                    }
                                                } else if (i7 == 2) {
                                                    int iMax112 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr116 = c5234.f16402;
                                                    iArr116[i6] = iMax112;
                                                    int i31111116 = i4 - 1;
                                                    i10 = iArr116[i31111116] - 1;
                                                    iArr116[i31111116] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax112;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (c8055.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            i15 = i4 - 1;
                                            int i31111117 = c5234.f16402[i15];
                                            c8054 = c8055;
                                            iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i31111117 - Character.charCount(Character.codePointBefore(charSequence2, i31111117)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (iM15074 < 0) {
                                                c5234.f16398 = i5;
                                                c8055 = c8054;
                                            } else {
                                                c5234.f16402[i15] = iM15074;
                                                i14 = iArr3[i3 + 1];
                                                i3 = i14;
                                            }
                                        }
                                        iCharCount = iM15074;
                                        charSequence4 = charSequence2;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c5233 = c5232;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            } else {
                                i18 = iCharCount;
                            }
                            InterfaceC10795 interfaceC10797 = (InterfaceC10795) objArr2[iArr3[i28 + (i32 == 12 ? 3 : 2)]];
                            int i56 = i18;
                            while (i56 < length && interfaceC10797.mo2465(charSequence4.charAt(i56))) {
                                i56++;
                                if (c8055.m21407()) {
                                    c5234.f16390 = true;
                                    return false;
                                }
                            }
                            if (i56 >= length) {
                                c8055.f24842 = true;
                            }
                            if (i56 - i18 >= iArr3[i28 + (i32 == 12 ? 5 : 3)] && (c8055.f24820 != 1 || i56 == length)) {
                                int i57 = iArr3[i28 + 4];
                                if (c8055.f24837) {
                                    c5234.m15099(i57, iCharCount);
                                    c5234.m15099(i57 + 1, i56);
                                } else {
                                    int[] iArr20 = c8055.f24832;
                                    iArr20[i57] = iCharCount;
                                    iArr20[i57 + 1] = i56;
                                }
                                int[] iArr21 = c8055.f24832;
                                iArr21[0] = c8055.f24855;
                                c8055.m21416(i56);
                                iArr21[1] = i56;
                                return true;
                            }
                            c5232 = this;
                            c8055 = c8055;
                            charSequence2 = charSequence4;
                            while (true) {
                                i4 = c5234.f16398;
                                if (i4 == 0) {
                                    c5234.m15069(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c5234.m15069(c5234.f16402[i4 - 3]);
                                iArr = c5234.f16402;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM15074 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    if (zM15095) {
                                        c8054 = c8055;
                                        c8055 = c8054;
                                    } else {
                                        i3 = c5234.f16395;
                                        iCharCount = c5234.f16400;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c8054 = c8055;
                                        if (i7 == 8) {
                                            c5234.f16398 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c5234.f16401.f28781) {
                                                c5234.m15104(~i8, i9 - 1);
                                                c5234.m15108(i8, i9);
                                            } else {
                                                c5234.m15085(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c6643.f20614;
                                            int i31111118 = i4 - 2;
                                            i13 = iArr[i31111118];
                                            iArr[i31111118] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c5234.f16398 = i5;
                                            }
                                            if (c8054.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                c8055 = c8054;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i31111119 = iArr[i11];
                                            int i311111110 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i31111119)];
                                            i12 = i31111119 & (i31111119 - 1);
                                            if (i12 == 0) {
                                                c5234.f16398 = i5;
                                            } else {
                                                c5234.f16402[i11] = i12;
                                            }
                                            i3 = i311111110;
                                        } else if (i7 == 6) {
                                            c5234.m15092(iArr[i4 - 2], iM15074);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            c5234.f16398 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c5234.f16398 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM15074;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax113 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr117 = c5234.f16402;
                                                    iArr117[i6] = iMax113;
                                                    int i311111111 = i4 - 1;
                                                    i10 = iArr117[i311111111] - 1;
                                                    iArr117[i311111111] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax113;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax114 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                int[] iArr118 = c5234.f16402;
                                                iArr118[i6] = iMax114;
                                                int i311111112 = i4 - 1;
                                                i10 = iArr118[i311111112] - 1;
                                                iArr118[i311111112] = i10;
                                                if (i10 == 0) {
                                                    c5234.f16398 = i5;
                                                }
                                                iCharCount = iMax114;
                                            } else {
                                                c5234.f16398 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c8055.m21407()) {
                                            c5234.f16390 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i311111113 = c5234.f16402[i15];
                                        c8054 = c8055;
                                        iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i311111113 - Character.charCount(Character.codePointBefore(charSequence2, i311111113)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (iM15074 < 0) {
                                            c5234.f16398 = i5;
                                            c8055 = c8054;
                                        } else {
                                            c5234.f16402[i15] = iM15074;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM15074;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            break;
                        case 14:
                            C17704 c17704 = (C17704) objArr2[iArr3[i28 + 2]];
                            if (iArr3[i28 + 3] != 0) {
                                Object obj = objArr2[iArr3[i3 + 2]];
                                int i58 = c17704.f54180;
                                int i59 = c17704.f54178;
                                if (i58 != 0) {
                                    int i60 = (i59 + 1) * i58;
                                    long[] jArr = c5234.f16392;
                                    if (jArr.length >= i60) {
                                        Arrays.fill(jArr, 0, i60, 0L);
                                    } else {
                                        if ((((long) (i60 - c5234.f16392.length)) * 8) + c5234.m15090() > 33554432) {
                                            throw new C0292();
                                        }
                                        c5234.f16392 = new long[i60];
                                    }
                                }
                                int i61 = 0;
                                int i62 = 0;
                                int i63 = iCharCount;
                                while (true) {
                                    if (c8055.m21407()) {
                                        c5234.f16390 = true;
                                    } else {
                                        int i64 = i61 >>> 1;
                                        if (i62 != 0 || i58 == 0) {
                                            z = false;
                                        } else {
                                            int i65 = i63 - iCharCount;
                                            int i66 = (i64 * i58) + (i65 >>> 6);
                                            long j = 1 << i65;
                                            long[] jArr2 = c5234.f16392;
                                            long j2 = jArr2[i66];
                                            z = (j2 & j) != 0;
                                            jArr2[i66] = j2 | j;
                                        }
                                        if (!z) {
                                            if (i64 < i59) {
                                                Object[] objArr3 = c17704.f54177;
                                                i19 = i58;
                                                if (i62 < objArr3.length) {
                                                    int i67 = i62 + 1;
                                                    int iM15043 = c5234.m15042(i63, length, charSequence4, objArr3[i62]);
                                                    if (!c5234.f16390) {
                                                        if (iM15043 < 0) {
                                                            i62 = i67;
                                                            iArr3 = iArr3;
                                                            objArr2 = objArr2;
                                                            i20 = i59;
                                                        } else if (!c5234.m15086()) {
                                                            int[] iArr22 = c5234.f16405;
                                                            i20 = i59;
                                                            if (iArr22.length - i61 < 2) {
                                                                int iM15044 = m15043(iArr22.length, ((long) i61) + 2);
                                                                long jM15090 = c5234.m15090();
                                                                int[] iArr23 = c5234.f16405;
                                                                if ((((long) (iM15044 - iArr23.length)) * 4) + jM15090 > 33554432) {
                                                                    throw new C0292();
                                                                }
                                                                c5234.f16405 = Arrays.copyOf(iArr23, iM15044);
                                                            }
                                                            int[] iArr24 = c5234.f16405;
                                                            int i68 = i61 + 1;
                                                            iArr24[i61] = i63;
                                                            i61 += 2;
                                                            iArr24[i68] = i67;
                                                            i63 = iM15043;
                                                            i62 = 0;
                                                        }
                                                        i58 = i19;
                                                        i59 = i20;
                                                        objArr2 = objArr2;
                                                        iArr3 = iArr3;
                                                    }
                                                }
                                            } else {
                                                i19 = i58;
                                            }
                                            iArr3 = iArr3;
                                            objArr2 = objArr2;
                                            i20 = i59;
                                            if (i64 >= c17704.f54179) {
                                                iM15042 = c5234.m15042(i63, length, charSequence4, obj);
                                                if (c5234.f16390) {
                                                    iM15042 = -1;
                                                } else if (iM15042 < 0 || (c8055.f24820 == 1 && iM15042 != length)) {
                                                }
                                            }
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (iM15042 >= 0) {
                                                int[] iArr25 = c8055.f24832;
                                                iArr25[0] = c8055.f24855;
                                                c8055.m21416(iM15042);
                                                iArr25[1] = iM15042;
                                                return true;
                                            }
                                            c5232 = this;
                                            c8055 = c8055;
                                            charSequence2 = charSequence4;
                                            i29 = 0;
                                            i30 = 0;
                                            while (true) {
                                                i4 = c5234.f16398;
                                                if (i4 == 0) {
                                                    c5234.m15069(0);
                                                    return false;
                                                }
                                                i5 = i4 - 6;
                                                c5234.m15069(c5234.f16402[i4 - 3]);
                                                iArr = c5234.f16402;
                                                i3 = iArr[i4 - 5];
                                                i6 = i4 - 4;
                                                iM15074 = iArr[i6];
                                                i7 = iArr[i5];
                                                if (i7 == 7) {
                                                    zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                                    if (c5234.f16390) {
                                                        return false;
                                                    }
                                                    if (zM15095) {
                                                        c8054 = c8055;
                                                        c8055 = c8054;
                                                    } else {
                                                        i3 = c5234.f16395;
                                                        iCharCount = c5234.f16400;
                                                        charSequence4 = charSequence2;
                                                    }
                                                } else {
                                                    if (i7 == 9) {
                                                        c8054 = c8055;
                                                        if (i7 == 8) {
                                                            c5234.f16398 = i5;
                                                            i8 = iArr[i4 - 2];
                                                            i9 = iArr[i4 - 1];
                                                            if (c5234.f16401.f28781) {
                                                                c5234.m15104(~i8, i9 - 1);
                                                                c5234.m15108(i8, i9);
                                                            } else {
                                                                c5234.m15085(i8, i9);
                                                            }
                                                        } else if (i7 == 3) {
                                                            c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                            iArr2 = c6643.f20614;
                                                            int i311111114 = i4 - 2;
                                                            i13 = iArr[i311111114];
                                                            iArr[i311111114] = i13 + 1;
                                                            i14 = iArr2[i13];
                                                            if (i13 == iArr2.length - 1) {
                                                                c5234.f16398 = i5;
                                                            }
                                                            if (c8054.m21407()) {
                                                                c5234.f16390 = true;
                                                                return false;
                                                            }
                                                            if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                                c8055 = c8054;
                                                            } else {
                                                                i3 = i14;
                                                            }
                                                        } else if (i7 == 4) {
                                                            i11 = i4 - 2;
                                                            int i311111115 = iArr[i11];
                                                            int i311111116 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i311111115)];
                                                            i12 = i311111115 & (i311111115 - 1);
                                                            if (i12 == 0) {
                                                                c5234.f16398 = i5;
                                                            } else {
                                                                c5234.f16402[i11] = i12;
                                                            }
                                                            i3 = i311111116;
                                                        } else if (i7 == 6) {
                                                            c5234.m15092(iArr[i4 - 2], iM15074);
                                                            if (c5234.f16390) {
                                                                return false;
                                                            }
                                                            c5234.f16398 = i5;
                                                        } else if (i7 == 5) {
                                                            i29 = iArr[i4 - 2];
                                                            i30 = iArr[i4 - 1];
                                                            c5234.f16398 = i5;
                                                            charSequence4 = charSequence2;
                                                            iCharCount = iM15074;
                                                        } else {
                                                            if (i7 == 1) {
                                                                if (i7 == 2) {
                                                                    int iMax115 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                                    int[] iArr119 = c5234.f16402;
                                                                    iArr119[i6] = iMax115;
                                                                    int i311111117 = i4 - 1;
                                                                    i10 = iArr119[i311111117] - 1;
                                                                    iArr119[i311111117] = i10;
                                                                    if (i10 == 0) {
                                                                        c5234.f16398 = i5;
                                                                    }
                                                                    iCharCount = iMax115;
                                                                } else {
                                                                    c5234.f16398 = i5;
                                                                }
                                                            } else if (i7 == 2) {
                                                                int iMax116 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                                int[] iArr1110 = c5234.f16402;
                                                                iArr1110[i6] = iMax116;
                                                                int i311111118 = i4 - 1;
                                                                i10 = iArr1110[i311111118] - 1;
                                                                iArr1110[i311111118] = i10;
                                                                if (i10 == 0) {
                                                                    c5234.f16398 = i5;
                                                                }
                                                                iCharCount = iMax116;
                                                            } else {
                                                                c5234.f16398 = i5;
                                                            }
                                                            charSequence4 = charSequence2;
                                                        }
                                                    } else {
                                                        if (c8055.m21407()) {
                                                            c5234.f16390 = true;
                                                            return false;
                                                        }
                                                        i15 = i4 - 1;
                                                        int i311111119 = c5234.f16402[i15];
                                                        c8054 = c8055;
                                                        iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i311111119 - Character.charCount(Character.codePointBefore(charSequence2, i311111119)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                                        if (c5234.f16390) {
                                                            return false;
                                                        }
                                                        if (iM15074 < 0) {
                                                            c5234.f16398 = i5;
                                                            c8055 = c8054;
                                                        } else {
                                                            c5234.f16402[i15] = iM15074;
                                                            i14 = iArr3[i3 + 1];
                                                            i3 = i14;
                                                        }
                                                    }
                                                    iCharCount = iM15074;
                                                    charSequence4 = charSequence2;
                                                }
                                                i28 = i3;
                                                z2 = false;
                                                c5233 = c5232;
                                                objArr2 = objArr2;
                                                iArr3 = iArr3;
                                            }
                                        } else {
                                            i19 = i58;
                                            iArr3 = iArr3;
                                            objArr2 = objArr2;
                                            i20 = i59;
                                        }
                                        if (i61 == 0) {
                                            iM15042 = -1;
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (iM15042 >= 0) {
                                                int[] iArr26 = c8055.f24832;
                                                iArr26[0] = c8055.f24855;
                                                c8055.m21416(iM15042);
                                                iArr26[1] = iM15042;
                                                return true;
                                            }
                                            c5232 = this;
                                            c8055 = c8055;
                                            charSequence2 = charSequence4;
                                            i29 = 0;
                                            i30 = 0;
                                            while (true) {
                                                i4 = c5234.f16398;
                                                if (i4 == 0) {
                                                    c5234.m15069(0);
                                                    return false;
                                                }
                                                i5 = i4 - 6;
                                                c5234.m15069(c5234.f16402[i4 - 3]);
                                                iArr = c5234.f16402;
                                                i3 = iArr[i4 - 5];
                                                i6 = i4 - 4;
                                                iM15074 = iArr[i6];
                                                i7 = iArr[i5];
                                                if (i7 == 7) {
                                                    zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                                    if (c5234.f16390) {
                                                        return false;
                                                    }
                                                    if (zM15095) {
                                                        c8054 = c8055;
                                                        c8055 = c8054;
                                                    } else {
                                                        i3 = c5234.f16395;
                                                        iCharCount = c5234.f16400;
                                                        charSequence4 = charSequence2;
                                                    }
                                                } else {
                                                    if (i7 == 9) {
                                                        c8054 = c8055;
                                                        if (i7 == 8) {
                                                            c5234.f16398 = i5;
                                                            i8 = iArr[i4 - 2];
                                                            i9 = iArr[i4 - 1];
                                                            if (c5234.f16401.f28781) {
                                                                c5234.m15104(~i8, i9 - 1);
                                                                c5234.m15108(i8, i9);
                                                            } else {
                                                                c5234.m15085(i8, i9);
                                                            }
                                                        } else if (i7 == 3) {
                                                            c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                            iArr2 = c6643.f20614;
                                                            int i3111111110 = i4 - 2;
                                                            i13 = iArr[i3111111110];
                                                            iArr[i3111111110] = i13 + 1;
                                                            i14 = iArr2[i13];
                                                            if (i13 == iArr2.length - 1) {
                                                                c5234.f16398 = i5;
                                                            }
                                                            if (c8054.m21407()) {
                                                                c5234.f16390 = true;
                                                                return false;
                                                            }
                                                            if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                                c8055 = c8054;
                                                            } else {
                                                                i3 = i14;
                                                            }
                                                        } else if (i7 == 4) {
                                                            i11 = i4 - 2;
                                                            int i3111111111 = iArr[i11];
                                                            int i3111111112 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i3111111111)];
                                                            i12 = i3111111111 & (i3111111111 - 1);
                                                            if (i12 == 0) {
                                                                c5234.f16398 = i5;
                                                            } else {
                                                                c5234.f16402[i11] = i12;
                                                            }
                                                            i3 = i3111111112;
                                                        } else if (i7 == 6) {
                                                            c5234.m15092(iArr[i4 - 2], iM15074);
                                                            if (c5234.f16390) {
                                                                return false;
                                                            }
                                                            c5234.f16398 = i5;
                                                        } else if (i7 == 5) {
                                                            i29 = iArr[i4 - 2];
                                                            i30 = iArr[i4 - 1];
                                                            c5234.f16398 = i5;
                                                            charSequence4 = charSequence2;
                                                            iCharCount = iM15074;
                                                        } else {
                                                            if (i7 == 1) {
                                                                if (i7 == 2) {
                                                                    int iMax117 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                                    int[] iArr1111 = c5234.f16402;
                                                                    iArr1111[i6] = iMax117;
                                                                    int i3111111113 = i4 - 1;
                                                                    i10 = iArr1111[i3111111113] - 1;
                                                                    iArr1111[i3111111113] = i10;
                                                                    if (i10 == 0) {
                                                                        c5234.f16398 = i5;
                                                                    }
                                                                    iCharCount = iMax117;
                                                                } else {
                                                                    c5234.f16398 = i5;
                                                                }
                                                            } else if (i7 == 2) {
                                                                int iMax118 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                                int[] iArr1112 = c5234.f16402;
                                                                iArr1112[i6] = iMax118;
                                                                int i3111111114 = i4 - 1;
                                                                i10 = iArr1112[i3111111114] - 1;
                                                                iArr1112[i3111111114] = i10;
                                                                if (i10 == 0) {
                                                                    c5234.f16398 = i5;
                                                                }
                                                                iCharCount = iMax118;
                                                            } else {
                                                                c5234.f16398 = i5;
                                                            }
                                                            charSequence4 = charSequence2;
                                                        }
                                                    } else {
                                                        if (c8055.m21407()) {
                                                            c5234.f16390 = true;
                                                            return false;
                                                        }
                                                        i15 = i4 - 1;
                                                        int i3111111115 = c5234.f16402[i15];
                                                        c8054 = c8055;
                                                        iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i3111111115 - Character.charCount(Character.codePointBefore(charSequence2, i3111111115)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                                        if (c5234.f16390) {
                                                            return false;
                                                        }
                                                        if (iM15074 < 0) {
                                                            c5234.f16398 = i5;
                                                            c8055 = c8054;
                                                        } else {
                                                            c5234.f16402[i15] = iM15074;
                                                            i14 = iArr3[i3 + 1];
                                                            i3 = i14;
                                                        }
                                                    }
                                                    iCharCount = iM15074;
                                                    charSequence4 = charSequence2;
                                                }
                                                i28 = i3;
                                                z2 = false;
                                                c5233 = c5232;
                                                objArr2 = objArr2;
                                                iArr3 = iArr3;
                                            }
                                        } else {
                                            int[] iArr27 = c5234.f16405;
                                            int i69 = iArr27[i61 - 1];
                                            i61 -= 2;
                                            i63 = iArr27[i61];
                                            i62 = i69;
                                            i58 = i19;
                                            i59 = i20;
                                            objArr2 = objArr2;
                                            iArr3 = iArr3;
                                        }
                                    }
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    iM15042 = -1;
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    if (iM15042 >= 0) {
                                        int[] iArr28 = c8055.f24832;
                                        iArr28[0] = c8055.f24855;
                                        c8055.m21416(iM15042);
                                        iArr28[1] = iM15042;
                                        return true;
                                    }
                                    c5232 = this;
                                    c8055 = c8055;
                                    charSequence2 = charSequence4;
                                    i29 = 0;
                                    i30 = 0;
                                    while (true) {
                                        i4 = c5234.f16398;
                                        if (i4 == 0) {
                                            c5234.m15069(0);
                                            return false;
                                        }
                                        i5 = i4 - 6;
                                        c5234.m15069(c5234.f16402[i4 - 3]);
                                        iArr = c5234.f16402;
                                        i3 = iArr[i4 - 5];
                                        i6 = i4 - 4;
                                        iM15074 = iArr[i6];
                                        i7 = iArr[i5];
                                        if (i7 == 7) {
                                            zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (zM15095) {
                                                c8054 = c8055;
                                                c8055 = c8054;
                                            } else {
                                                i3 = c5234.f16395;
                                                iCharCount = c5234.f16400;
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (i7 == 9) {
                                                c8054 = c8055;
                                                if (i7 == 8) {
                                                    c5234.f16398 = i5;
                                                    i8 = iArr[i4 - 2];
                                                    i9 = iArr[i4 - 1];
                                                    if (c5234.f16401.f28781) {
                                                        c5234.m15104(~i8, i9 - 1);
                                                        c5234.m15108(i8, i9);
                                                    } else {
                                                        c5234.m15085(i8, i9);
                                                    }
                                                } else if (i7 == 3) {
                                                    c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                    iArr2 = c6643.f20614;
                                                    int i3111111116 = i4 - 2;
                                                    i13 = iArr[i3111111116];
                                                    iArr[i3111111116] = i13 + 1;
                                                    i14 = iArr2[i13];
                                                    if (i13 == iArr2.length - 1) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    if (c8054.m21407()) {
                                                        c5234.f16390 = true;
                                                        return false;
                                                    }
                                                    if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                        c8055 = c8054;
                                                    } else {
                                                        i3 = i14;
                                                    }
                                                } else if (i7 == 4) {
                                                    i11 = i4 - 2;
                                                    int i3111111117 = iArr[i11];
                                                    int i3111111118 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i3111111117)];
                                                    i12 = i3111111117 & (i3111111117 - 1);
                                                    if (i12 == 0) {
                                                        c5234.f16398 = i5;
                                                    } else {
                                                        c5234.f16402[i11] = i12;
                                                    }
                                                    i3 = i3111111118;
                                                } else if (i7 == 6) {
                                                    c5234.m15092(iArr[i4 - 2], iM15074);
                                                    if (c5234.f16390) {
                                                        return false;
                                                    }
                                                    c5234.f16398 = i5;
                                                } else if (i7 == 5) {
                                                    i29 = iArr[i4 - 2];
                                                    i30 = iArr[i4 - 1];
                                                    c5234.f16398 = i5;
                                                    charSequence4 = charSequence2;
                                                    iCharCount = iM15074;
                                                } else {
                                                    if (i7 == 1) {
                                                        if (i7 == 2) {
                                                            int iMax119 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                            int[] iArr1113 = c5234.f16402;
                                                            iArr1113[i6] = iMax119;
                                                            int i3111111119 = i4 - 1;
                                                            i10 = iArr1113[i3111111119] - 1;
                                                            iArr1113[i3111111119] = i10;
                                                            if (i10 == 0) {
                                                                c5234.f16398 = i5;
                                                            }
                                                            iCharCount = iMax119;
                                                        } else {
                                                            c5234.f16398 = i5;
                                                        }
                                                    } else if (i7 == 2) {
                                                        int iMax1110 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                        int[] iArr1114 = c5234.f16402;
                                                        iArr1114[i6] = iMax1110;
                                                        int i31111111110 = i4 - 1;
                                                        i10 = iArr1114[i31111111110] - 1;
                                                        iArr1114[i31111111110] = i10;
                                                        if (i10 == 0) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        iCharCount = iMax1110;
                                                    } else {
                                                        c5234.f16398 = i5;
                                                    }
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (c8055.m21407()) {
                                                    c5234.f16390 = true;
                                                    return false;
                                                }
                                                i15 = i4 - 1;
                                                int i31111111111 = c5234.f16402[i15];
                                                c8054 = c8055;
                                                iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i31111111111 - Character.charCount(Character.codePointBefore(charSequence2, i31111111111)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                if (iM15074 < 0) {
                                                    c5234.f16398 = i5;
                                                    c8055 = c8054;
                                                } else {
                                                    c5234.f16402[i15] = iM15074;
                                                    i14 = iArr3[i3 + 1];
                                                    i3 = i14;
                                                }
                                            }
                                            iCharCount = iM15074;
                                            charSequence4 = charSequence2;
                                        }
                                        i28 = i3;
                                        z2 = false;
                                        c5233 = c5232;
                                        objArr2 = objArr2;
                                        iArr3 = iArr3;
                                    }
                                    break;
                                }
                            } else {
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                int i70 = i29;
                                while (true) {
                                    if (i30 == 0) {
                                        if (i70 == c17704.f54178) {
                                        }
                                        if (i70 >= c17704.f54179) {
                                            c5234.m15050(0, i3, iCharCount, 0, 0);
                                        }
                                    }
                                    int iM15045 = -1;
                                    int i71 = i30;
                                    while (true) {
                                        objArr = c17704.f54177;
                                        if (i71 < objArr.length) {
                                            if (c8055.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            iM15045 = c5234.m15042(iCharCount, length, charSequence4, objArr[i71]);
                                            if (!c5234.f16390) {
                                                if (iM15045 < 0) {
                                                    i71++;
                                                }
                                            }
                                            return false;
                                        }
                                    }
                                    if (iM15045 < 0) {
                                        c5232 = this;
                                        c8055 = c8055;
                                        charSequence2 = charSequence4;
                                        i29 = 0;
                                        i30 = 0;
                                        while (true) {
                                            i4 = c5234.f16398;
                                            if (i4 == 0) {
                                                c5234.m15069(0);
                                                return false;
                                            }
                                            i5 = i4 - 6;
                                            c5234.m15069(c5234.f16402[i4 - 3]);
                                            iArr = c5234.f16402;
                                            i3 = iArr[i4 - 5];
                                            i6 = i4 - 4;
                                            iM15074 = iArr[i6];
                                            i7 = iArr[i5];
                                            if (i7 == 7) {
                                                zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                if (zM15095) {
                                                    c8054 = c8055;
                                                    c8055 = c8054;
                                                } else {
                                                    i3 = c5234.f16395;
                                                    iCharCount = c5234.f16400;
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (i7 == 9) {
                                                    c8054 = c8055;
                                                    if (i7 == 8) {
                                                        c5234.f16398 = i5;
                                                        i8 = iArr[i4 - 2];
                                                        i9 = iArr[i4 - 1];
                                                        if (c5234.f16401.f28781) {
                                                            c5234.m15104(~i8, i9 - 1);
                                                            c5234.m15108(i8, i9);
                                                        } else {
                                                            c5234.m15085(i8, i9);
                                                        }
                                                    } else if (i7 == 3) {
                                                        c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                        iArr2 = c6643.f20614;
                                                        int i31111111112 = i4 - 2;
                                                        i13 = iArr[i31111111112];
                                                        iArr[i31111111112] = i13 + 1;
                                                        i14 = iArr2[i13];
                                                        if (i13 == iArr2.length - 1) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        if (c8054.m21407()) {
                                                            c5234.f16390 = true;
                                                            return false;
                                                        }
                                                        if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                            c8055 = c8054;
                                                        } else {
                                                            i3 = i14;
                                                        }
                                                    } else if (i7 == 4) {
                                                        i11 = i4 - 2;
                                                        int i31111111113 = iArr[i11];
                                                        int i31111111114 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i31111111113)];
                                                        i12 = i31111111113 & (i31111111113 - 1);
                                                        if (i12 == 0) {
                                                            c5234.f16398 = i5;
                                                        } else {
                                                            c5234.f16402[i11] = i12;
                                                        }
                                                        i3 = i31111111114;
                                                    } else if (i7 == 6) {
                                                        c5234.m15092(iArr[i4 - 2], iM15074);
                                                        if (c5234.f16390) {
                                                            return false;
                                                        }
                                                        c5234.f16398 = i5;
                                                    } else if (i7 == 5) {
                                                        i29 = iArr[i4 - 2];
                                                        i30 = iArr[i4 - 1];
                                                        c5234.f16398 = i5;
                                                        charSequence4 = charSequence2;
                                                        iCharCount = iM15074;
                                                    } else {
                                                        if (i7 == 1) {
                                                            if (i7 == 2) {
                                                                int iMax1111 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                                int[] iArr1115 = c5234.f16402;
                                                                iArr1115[i6] = iMax1111;
                                                                int i31111111115 = i4 - 1;
                                                                i10 = iArr1115[i31111111115] - 1;
                                                                iArr1115[i31111111115] = i10;
                                                                if (i10 == 0) {
                                                                    c5234.f16398 = i5;
                                                                }
                                                                iCharCount = iMax1111;
                                                            } else {
                                                                c5234.f16398 = i5;
                                                            }
                                                        } else if (i7 == 2) {
                                                            int iMax1112 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                            int[] iArr1116 = c5234.f16402;
                                                            iArr1116[i6] = iMax1112;
                                                            int i31111111116 = i4 - 1;
                                                            i10 = iArr1116[i31111111116] - 1;
                                                            iArr1116[i31111111116] = i10;
                                                            if (i10 == 0) {
                                                                c5234.f16398 = i5;
                                                            }
                                                            iCharCount = iMax1112;
                                                        } else {
                                                            c5234.f16398 = i5;
                                                        }
                                                        charSequence4 = charSequence2;
                                                    }
                                                } else {
                                                    if (c8055.m21407()) {
                                                        c5234.f16390 = true;
                                                        return false;
                                                    }
                                                    i15 = i4 - 1;
                                                    int i31111111117 = c5234.f16402[i15];
                                                    c8054 = c8055;
                                                    iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i31111111117 - Character.charCount(Character.codePointBefore(charSequence2, i31111111117)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                                    if (c5234.f16390) {
                                                        return false;
                                                    }
                                                    if (iM15074 < 0) {
                                                        c5234.f16398 = i5;
                                                        c8055 = c8054;
                                                    } else {
                                                        c5234.f16402[i15] = iM15074;
                                                        i14 = iArr3[i3 + 1];
                                                        i3 = i14;
                                                    }
                                                }
                                                iCharCount = iM15074;
                                                charSequence4 = charSequence2;
                                            }
                                            i28 = i3;
                                            z2 = false;
                                            c5233 = c5232;
                                            objArr2 = objArr2;
                                            iArr3 = iArr3;
                                        }
                                    } else {
                                        int i72 = i71 + 1;
                                        if (i72 < objArr.length) {
                                            c5234.m15050(5, i28, iCharCount, i70, i72);
                                        }
                                        i70++;
                                        if (c5234.m15086()) {
                                            return false;
                                        }
                                        i30 = 0;
                                        iCharCount = iM15045;
                                    }
                                }
                            }
                            break;
                        case 15:
                            break;
                        case 16:
                            int i73 = i28 + 2;
                            if (C21460.m48607(iArr3[i73], iArr3[i28 + 3] != 0, c8055, iCharCount, charSequence4)) {
                                if (iArr3[i73] == 0) {
                                    c5234.m15104(Integer.MIN_VALUE, iCharCount);
                                }
                                charSequence2 = charSequence4;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                c5232 = this;
                                charSequence4 = charSequence2;
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            c5232 = this;
                            c8055 = c8055;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c5234.f16398;
                                if (i4 == 0) {
                                    c5234.m15069(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c5234.m15069(c5234.f16402[i4 - 3]);
                                iArr = c5234.f16402;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM15074 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    if (zM15095) {
                                        c8054 = c8055;
                                        c8055 = c8054;
                                    } else {
                                        i3 = c5234.f16395;
                                        iCharCount = c5234.f16400;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c8054 = c8055;
                                        if (i7 == 8) {
                                            c5234.f16398 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c5234.f16401.f28781) {
                                                c5234.m15104(~i8, i9 - 1);
                                                c5234.m15108(i8, i9);
                                            } else {
                                                c5234.m15085(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c6643.f20614;
                                            int i31111111118 = i4 - 2;
                                            i13 = iArr[i31111111118];
                                            iArr[i31111111118] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c5234.f16398 = i5;
                                            }
                                            if (c8054.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                c8055 = c8054;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i31111111119 = iArr[i11];
                                            int i311111111110 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i31111111119)];
                                            i12 = i31111111119 & (i31111111119 - 1);
                                            if (i12 == 0) {
                                                c5234.f16398 = i5;
                                            } else {
                                                c5234.f16402[i11] = i12;
                                            }
                                            i3 = i311111111110;
                                        } else if (i7 == 6) {
                                            c5234.m15092(iArr[i4 - 2], iM15074);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            c5234.f16398 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c5234.f16398 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM15074;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax1113 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr1117 = c5234.f16402;
                                                    iArr1117[i6] = iMax1113;
                                                    int i311111111111 = i4 - 1;
                                                    i10 = iArr1117[i311111111111] - 1;
                                                    iArr1117[i311111111111] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax1113;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax1114 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                int[] iArr1118 = c5234.f16402;
                                                iArr1118[i6] = iMax1114;
                                                int i311111111112 = i4 - 1;
                                                i10 = iArr1118[i311111111112] - 1;
                                                iArr1118[i311111111112] = i10;
                                                if (i10 == 0) {
                                                    c5234.f16398 = i5;
                                                }
                                                iCharCount = iMax1114;
                                            } else {
                                                c5234.f16398 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c8055.m21407()) {
                                            c5234.f16390 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i311111111113 = c5234.f16402[i15];
                                        c8054 = c8055;
                                        iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i311111111113 - Character.charCount(Character.codePointBefore(charSequence2, i311111111113)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (iM15074 < 0) {
                                            c5234.f16398 = i5;
                                            c8055 = c8054;
                                        } else {
                                            c5234.f16402[i15] = iM15074;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM15074;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            break;
                        case 17:
                            int iM15046 = c5234.m15046((C13323) objArr2[iArr3[i28 + 2]], charSequence4, iCharCount, length);
                            if (c5234.f16390) {
                                return false;
                            }
                            if (iM15046 >= 0) {
                                int[] iArr29 = c8055.f24832;
                                iArr29[0] = c8055.f24855;
                                c8055.m21416(iM15046);
                                iArr29[1] = iM15046;
                                return true;
                            }
                            c5232 = this;
                            c8055 = c8055;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c5234.f16398;
                                if (i4 == 0) {
                                    c5234.m15069(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c5234.m15069(c5234.f16402[i4 - 3]);
                                iArr = c5234.f16402;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM15074 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    if (zM15095) {
                                        c8054 = c8055;
                                        c8055 = c8054;
                                    } else {
                                        i3 = c5234.f16395;
                                        iCharCount = c5234.f16400;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c8054 = c8055;
                                        if (i7 == 8) {
                                            c5234.f16398 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c5234.f16401.f28781) {
                                                c5234.m15104(~i8, i9 - 1);
                                                c5234.m15108(i8, i9);
                                            } else {
                                                c5234.m15085(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c6643.f20614;
                                            int i311111111114 = i4 - 2;
                                            i13 = iArr[i311111111114];
                                            iArr[i311111111114] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c5234.f16398 = i5;
                                            }
                                            if (c8054.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                c8055 = c8054;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i311111111115 = iArr[i11];
                                            int i311111111116 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i311111111115)];
                                            i12 = i311111111115 & (i311111111115 - 1);
                                            if (i12 == 0) {
                                                c5234.f16398 = i5;
                                            } else {
                                                c5234.f16402[i11] = i12;
                                            }
                                            i3 = i311111111116;
                                        } else if (i7 == 6) {
                                            c5234.m15092(iArr[i4 - 2], iM15074);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            c5234.f16398 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c5234.f16398 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM15074;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax1115 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr1119 = c5234.f16402;
                                                    iArr1119[i6] = iMax1115;
                                                    int i311111111117 = i4 - 1;
                                                    i10 = iArr1119[i311111111117] - 1;
                                                    iArr1119[i311111111117] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax1115;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax1116 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                int[] iArr11110 = c5234.f16402;
                                                iArr11110[i6] = iMax1116;
                                                int i311111111118 = i4 - 1;
                                                i10 = iArr11110[i311111111118] - 1;
                                                iArr11110[i311111111118] = i10;
                                                if (i10 == 0) {
                                                    c5234.f16398 = i5;
                                                }
                                                iCharCount = iMax1116;
                                            } else {
                                                c5234.f16398 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c8055.m21407()) {
                                            c5234.f16390 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i311111111119 = c5234.f16402[i15];
                                        c8054 = c8055;
                                        iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i311111111119 - Character.charCount(Character.codePointBefore(charSequence2, i311111111119)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (iM15074 < 0) {
                                            c5234.f16398 = i5;
                                            c8055 = c8054;
                                        } else {
                                            c5234.f16402[i15] = iM15074;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM15074;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            break;
                        case 20:
                            int iM15047 = c5234.m15044((C3821) objArr2[iArr3[i28 + 2]], charSequence4, iCharCount, length);
                            if (c5234.f16390) {
                                return false;
                            }
                            if (iM15047 >= 0) {
                                int[] iArr30 = c8055.f24832;
                                iArr30[0] = c8055.f24855;
                                c8055.m21416(iM15047);
                                iArr30[1] = iM15047;
                                return true;
                            }
                            c5232 = this;
                            c8055 = c8055;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c5234.f16398;
                                if (i4 == 0) {
                                    c5234.m15069(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c5234.m15069(c5234.f16402[i4 - 3]);
                                iArr = c5234.f16402;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM15074 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    if (zM15095) {
                                        c8054 = c8055;
                                        c8055 = c8054;
                                    } else {
                                        i3 = c5234.f16395;
                                        iCharCount = c5234.f16400;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c8054 = c8055;
                                        if (i7 == 8) {
                                            c5234.f16398 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c5234.f16401.f28781) {
                                                c5234.m15104(~i8, i9 - 1);
                                                c5234.m15108(i8, i9);
                                            } else {
                                                c5234.m15085(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c6643.f20614;
                                            int i3111111111110 = i4 - 2;
                                            i13 = iArr[i3111111111110];
                                            iArr[i3111111111110] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c5234.f16398 = i5;
                                            }
                                            if (c8054.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                c8055 = c8054;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i3111111111111 = iArr[i11];
                                            int i3111111111112 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i3111111111111)];
                                            i12 = i3111111111111 & (i3111111111111 - 1);
                                            if (i12 == 0) {
                                                c5234.f16398 = i5;
                                            } else {
                                                c5234.f16402[i11] = i12;
                                            }
                                            i3 = i3111111111112;
                                        } else if (i7 == 6) {
                                            c5234.m15092(iArr[i4 - 2], iM15074);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            c5234.f16398 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c5234.f16398 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM15074;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax1117 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr11111 = c5234.f16402;
                                                    iArr11111[i6] = iMax1117;
                                                    int i3111111111113 = i4 - 1;
                                                    i10 = iArr11111[i3111111111113] - 1;
                                                    iArr11111[i3111111111113] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax1117;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax1118 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                int[] iArr11112 = c5234.f16402;
                                                iArr11112[i6] = iMax1118;
                                                int i3111111111114 = i4 - 1;
                                                i10 = iArr11112[i3111111111114] - 1;
                                                iArr11112[i3111111111114] = i10;
                                                if (i10 == 0) {
                                                    c5234.f16398 = i5;
                                                }
                                                iCharCount = iMax1118;
                                            } else {
                                                c5234.f16398 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c8055.m21407()) {
                                            c5234.f16390 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i3111111111115 = c5234.f16402[i15];
                                        c8054 = c8055;
                                        iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i3111111111115 - Character.charCount(Character.codePointBefore(charSequence2, i3111111111115)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (iM15074 < 0) {
                                            c5234.f16398 = i5;
                                            c8055 = c8054;
                                        } else {
                                            c5234.f16402[i15] = iM15074;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM15074;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            break;
                        case 21:
                            int iM15048 = c5234.m15045((C10502) objArr2[iArr3[i28 + 2]], charSequence4, iCharCount, length);
                            if (c5234.f16390) {
                                return false;
                            }
                            if (iM15048 >= 0) {
                                int[] iArr31 = c8055.f24832;
                                iArr31[0] = c8055.f24855;
                                c8055.m21416(iM15048);
                                iArr31[1] = iM15048;
                                return true;
                            }
                            c5232 = this;
                            c8055 = c8055;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c5234.f16398;
                                if (i4 == 0) {
                                    c5234.m15069(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c5234.m15069(c5234.f16402[i4 - 3]);
                                iArr = c5234.f16402;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM15074 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    if (zM15095) {
                                        c8054 = c8055;
                                        c8055 = c8054;
                                    } else {
                                        i3 = c5234.f16395;
                                        iCharCount = c5234.f16400;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c8054 = c8055;
                                        if (i7 == 8) {
                                            c5234.f16398 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c5234.f16401.f28781) {
                                                c5234.m15104(~i8, i9 - 1);
                                                c5234.m15108(i8, i9);
                                            } else {
                                                c5234.m15085(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c6643.f20614;
                                            int i3111111111116 = i4 - 2;
                                            i13 = iArr[i3111111111116];
                                            iArr[i3111111111116] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c5234.f16398 = i5;
                                            }
                                            if (c8054.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                c8055 = c8054;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i3111111111117 = iArr[i11];
                                            int i3111111111118 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i3111111111117)];
                                            i12 = i3111111111117 & (i3111111111117 - 1);
                                            if (i12 == 0) {
                                                c5234.f16398 = i5;
                                            } else {
                                                c5234.f16402[i11] = i12;
                                            }
                                            i3 = i3111111111118;
                                        } else if (i7 == 6) {
                                            c5234.m15092(iArr[i4 - 2], iM15074);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            c5234.f16398 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c5234.f16398 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM15074;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax1119 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr11113 = c5234.f16402;
                                                    iArr11113[i6] = iMax1119;
                                                    int i3111111111119 = i4 - 1;
                                                    i10 = iArr11113[i3111111111119] - 1;
                                                    iArr11113[i3111111111119] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax1119;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax11110 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                int[] iArr11114 = c5234.f16402;
                                                iArr11114[i6] = iMax11110;
                                                int i31111111111110 = i4 - 1;
                                                i10 = iArr11114[i31111111111110] - 1;
                                                iArr11114[i31111111111110] = i10;
                                                if (i10 == 0) {
                                                    c5234.f16398 = i5;
                                                }
                                                iCharCount = iMax11110;
                                            } else {
                                                c5234.f16398 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c8055.m21407()) {
                                            c5234.f16390 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i31111111111111 = c5234.f16402[i15];
                                        c8054 = c8055;
                                        iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i31111111111111 - Character.charCount(Character.codePointBefore(charSequence2, i31111111111111)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (iM15074 < 0) {
                                            c5234.f16398 = i5;
                                            c8055 = c8054;
                                        } else {
                                            c5234.f16402[i15] = iM15074;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM15074;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            break;
                        case 22:
                            int[] iArr32 = c5234.f16401.f28782;
                            int i74 = iArr32[i28 + 2];
                            boolean z5 = i74 == 2 || i74 == 3;
                            int i75 = iArr32[i28 + 6] != 0 ? 1 : 0;
                            if (z5) {
                                int i76 = i28 + 5;
                                int iM15040 = i75 != 0 ? c5234.m15040(iCharCount, -iArr32[i76], charSequence4) : iArr32[i76];
                                if (!c5234.f16390) {
                                    int i77 = i28 + 4;
                                    int iM15041 = i75 != 0 ? c5234.m15040(iCharCount, -iArr32[i77], charSequence4) : iArr32[i77];
                                    if (!c5234.f16390) {
                                        iMax = Math.max(iCharCount - iM15040, c8055.f24847 ? 0 : c8055.f24828);
                                        i21 = iCharCount - iM15041;
                                    }
                                    if (zM15068) {
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        c5232 = this;
                                        c8055 = c8055;
                                        charSequence2 = charSequence4;
                                        iArr3 = iArr3;
                                        objArr2 = objArr2;
                                        while (true) {
                                            i4 = c5234.f16398;
                                            if (i4 == 0) {
                                                c5234.m15069(0);
                                                return false;
                                            }
                                            i5 = i4 - 6;
                                            c5234.m15069(c5234.f16402[i4 - 3]);
                                            iArr = c5234.f16402;
                                            i3 = iArr[i4 - 5];
                                            i6 = i4 - 4;
                                            iM15074 = iArr[i6];
                                            i7 = iArr[i5];
                                            if (i7 == 7) {
                                                zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                if (zM15095) {
                                                    c8054 = c8055;
                                                    c8055 = c8054;
                                                } else {
                                                    i3 = c5234.f16395;
                                                    iCharCount = c5234.f16400;
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (i7 == 9) {
                                                    c8054 = c8055;
                                                    if (i7 == 8) {
                                                        c5234.f16398 = i5;
                                                        i8 = iArr[i4 - 2];
                                                        i9 = iArr[i4 - 1];
                                                        if (c5234.f16401.f28781) {
                                                            c5234.m15104(~i8, i9 - 1);
                                                            c5234.m15108(i8, i9);
                                                        } else {
                                                            c5234.m15085(i8, i9);
                                                        }
                                                    } else if (i7 == 3) {
                                                        c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                        iArr2 = c6643.f20614;
                                                        int i31111111111112 = i4 - 2;
                                                        i13 = iArr[i31111111111112];
                                                        iArr[i31111111111112] = i13 + 1;
                                                        i14 = iArr2[i13];
                                                        if (i13 == iArr2.length - 1) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        if (c8054.m21407()) {
                                                            c5234.f16390 = true;
                                                            return false;
                                                        }
                                                        if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                            c8055 = c8054;
                                                        } else {
                                                            i3 = i14;
                                                        }
                                                    } else if (i7 == 4) {
                                                        i11 = i4 - 2;
                                                        int i31111111111113 = iArr[i11];
                                                        int i31111111111114 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i31111111111113)];
                                                        i12 = i31111111111113 & (i31111111111113 - 1);
                                                        if (i12 == 0) {
                                                            c5234.f16398 = i5;
                                                        } else {
                                                            c5234.f16402[i11] = i12;
                                                        }
                                                        i3 = i31111111111114;
                                                    } else if (i7 == 6) {
                                                        c5234.m15092(iArr[i4 - 2], iM15074);
                                                        if (c5234.f16390) {
                                                            return false;
                                                        }
                                                        c5234.f16398 = i5;
                                                    } else if (i7 == 5) {
                                                        i29 = iArr[i4 - 2];
                                                        i30 = iArr[i4 - 1];
                                                        c5234.f16398 = i5;
                                                        charSequence4 = charSequence2;
                                                        iCharCount = iM15074;
                                                    } else {
                                                        if (i7 == 1) {
                                                            if (i7 == 2) {
                                                                int iMax11111 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                                int[] iArr11115 = c5234.f16402;
                                                                iArr11115[i6] = iMax11111;
                                                                int i31111111111115 = i4 - 1;
                                                                i10 = iArr11115[i31111111111115] - 1;
                                                                iArr11115[i31111111111115] = i10;
                                                                if (i10 == 0) {
                                                                    c5234.f16398 = i5;
                                                                }
                                                                iCharCount = iMax11111;
                                                            } else {
                                                                c5234.f16398 = i5;
                                                            }
                                                        } else if (i7 == 2) {
                                                            int iMax11112 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                            int[] iArr11116 = c5234.f16402;
                                                            iArr11116[i6] = iMax11112;
                                                            int i31111111111116 = i4 - 1;
                                                            i10 = iArr11116[i31111111111116] - 1;
                                                            iArr11116[i31111111111116] = i10;
                                                            if (i10 == 0) {
                                                                c5234.f16398 = i5;
                                                            }
                                                            iCharCount = iMax11112;
                                                        } else {
                                                            c5234.f16398 = i5;
                                                        }
                                                        charSequence4 = charSequence2;
                                                    }
                                                } else {
                                                    if (c8055.m21407()) {
                                                        c5234.f16390 = true;
                                                        return false;
                                                    }
                                                    i15 = i4 - 1;
                                                    int i31111111111117 = c5234.f16402[i15];
                                                    c8054 = c8055;
                                                    iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i31111111111117 - Character.charCount(Character.codePointBefore(charSequence2, i31111111111117)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                                    if (c5234.f16390) {
                                                        return false;
                                                    }
                                                    if (iM15074 < 0) {
                                                        c5234.f16398 = i5;
                                                        c8055 = c8054;
                                                    } else {
                                                        c5234.f16402[i15] = iM15074;
                                                        i14 = iArr3[i3 + 1];
                                                        i3 = i14;
                                                    }
                                                }
                                                iCharCount = iM15074;
                                                charSequence4 = charSequence2;
                                            }
                                            i28 = i3;
                                            z2 = false;
                                            c5233 = c5232;
                                            objArr2 = objArr2;
                                            iArr3 = iArr3;
                                        }
                                    } else {
                                        i22 = c5234.f16395;
                                        iCharCount = c5234.f16400;
                                        c5232 = this;
                                        i28 = i22;
                                        iArr3 = iArr3;
                                        objArr2 = objArr2;
                                        z2 = false;
                                        c5233 = c5232;
                                        objArr2 = objArr2;
                                        iArr3 = iArr3;
                                    }
                                }
                                zM15068 = false;
                                if (zM15068) {
                                    i22 = c5234.f16395;
                                    iCharCount = c5234.f16400;
                                    c5232 = this;
                                    i28 = i22;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    z2 = false;
                                    c5233 = c5232;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                } else {
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    c5232 = this;
                                    c8055 = c8055;
                                    charSequence2 = charSequence4;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    while (true) {
                                        i4 = c5234.f16398;
                                        if (i4 == 0) {
                                            c5234.m15069(0);
                                            return false;
                                        }
                                        i5 = i4 - 6;
                                        c5234.m15069(c5234.f16402[i4 - 3]);
                                        iArr = c5234.f16402;
                                        i3 = iArr[i4 - 5];
                                        i6 = i4 - 4;
                                        iM15074 = iArr[i6];
                                        i7 = iArr[i5];
                                        if (i7 == 7) {
                                            zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (zM15095) {
                                                c8054 = c8055;
                                                c8055 = c8054;
                                            } else {
                                                i3 = c5234.f16395;
                                                iCharCount = c5234.f16400;
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (i7 == 9) {
                                                c8054 = c8055;
                                                if (i7 == 8) {
                                                    c5234.f16398 = i5;
                                                    i8 = iArr[i4 - 2];
                                                    i9 = iArr[i4 - 1];
                                                    if (c5234.f16401.f28781) {
                                                        c5234.m15104(~i8, i9 - 1);
                                                        c5234.m15108(i8, i9);
                                                    } else {
                                                        c5234.m15085(i8, i9);
                                                    }
                                                } else if (i7 == 3) {
                                                    c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                    iArr2 = c6643.f20614;
                                                    int i31111111111118 = i4 - 2;
                                                    i13 = iArr[i31111111111118];
                                                    iArr[i31111111111118] = i13 + 1;
                                                    i14 = iArr2[i13];
                                                    if (i13 == iArr2.length - 1) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    if (c8054.m21407()) {
                                                        c5234.f16390 = true;
                                                        return false;
                                                    }
                                                    if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                        c8055 = c8054;
                                                    } else {
                                                        i3 = i14;
                                                    }
                                                } else if (i7 == 4) {
                                                    i11 = i4 - 2;
                                                    int i31111111111119 = iArr[i11];
                                                    int i311111111111110 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i31111111111119)];
                                                    i12 = i31111111111119 & (i31111111111119 - 1);
                                                    if (i12 == 0) {
                                                        c5234.f16398 = i5;
                                                    } else {
                                                        c5234.f16402[i11] = i12;
                                                    }
                                                    i3 = i311111111111110;
                                                } else if (i7 == 6) {
                                                    c5234.m15092(iArr[i4 - 2], iM15074);
                                                    if (c5234.f16390) {
                                                        return false;
                                                    }
                                                    c5234.f16398 = i5;
                                                } else if (i7 == 5) {
                                                    i29 = iArr[i4 - 2];
                                                    i30 = iArr[i4 - 1];
                                                    c5234.f16398 = i5;
                                                    charSequence4 = charSequence2;
                                                    iCharCount = iM15074;
                                                } else {
                                                    if (i7 == 1) {
                                                        if (i7 == 2) {
                                                            int iMax11113 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                            int[] iArr11117 = c5234.f16402;
                                                            iArr11117[i6] = iMax11113;
                                                            int i311111111111111 = i4 - 1;
                                                            i10 = iArr11117[i311111111111111] - 1;
                                                            iArr11117[i311111111111111] = i10;
                                                            if (i10 == 0) {
                                                                c5234.f16398 = i5;
                                                            }
                                                            iCharCount = iMax11113;
                                                        } else {
                                                            c5234.f16398 = i5;
                                                        }
                                                    } else if (i7 == 2) {
                                                        int iMax11114 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                        int[] iArr11118 = c5234.f16402;
                                                        iArr11118[i6] = iMax11114;
                                                        int i311111111111112 = i4 - 1;
                                                        i10 = iArr11118[i311111111111112] - 1;
                                                        iArr11118[i311111111111112] = i10;
                                                        if (i10 == 0) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        iCharCount = iMax11114;
                                                    } else {
                                                        c5234.f16398 = i5;
                                                    }
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (c8055.m21407()) {
                                                    c5234.f16390 = true;
                                                    return false;
                                                }
                                                i15 = i4 - 1;
                                                int i311111111111113 = c5234.f16402[i15];
                                                c8054 = c8055;
                                                iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i311111111111113 - Character.charCount(Character.codePointBefore(charSequence2, i311111111111113)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                if (iM15074 < 0) {
                                                    c5234.f16398 = i5;
                                                    c8055 = c8054;
                                                } else {
                                                    c5234.f16402[i15] = iM15074;
                                                    i14 = iArr3[i3 + 1];
                                                    i3 = i14;
                                                }
                                            }
                                            iCharCount = iM15074;
                                            charSequence4 = charSequence2;
                                        }
                                        i28 = i3;
                                        z2 = false;
                                        c5233 = c5232;
                                        objArr2 = objArr2;
                                        iArr3 = iArr3;
                                    }
                                }
                            } else {
                                i21 = iCharCount;
                                iMax = i21;
                            }
                            c5234.m15098();
                            int i78 = c5234.f16388;
                            int[] iArr33 = c5234.f16393;
                            iArr33[i78] = i74;
                            iArr33[i78 + 1] = iArr32[i31];
                            iArr33[i78 + 2] = iCharCount;
                            int i79 = i78 + 3;
                            iArr33[i79] = iArr32[i28 + 3];
                            iArr33[i78 + 4] = c5234.f16398;
                            iArr33[i78 + 5] = c5234.f16409;
                            iArr33[i78 + 6] = c8055.f24837 ? c8055.f24823.f58949.size() : -1;
                            int[] iArr34 = c5234.f16393;
                            iArr34[i78 + 7] = c8055.f24844;
                            iArr34[i78 + 8] = c8055.f24828;
                            iArr34[i78 + 9] = c8055.f24830;
                            iArr34[i78 + 10] = i21;
                            iArr34[i78 + 11] = iMax;
                            iArr34[i78 + 12] = c5234.f16404;
                            iArr34[i78 + 13] = 0;
                            iArr34[i78 + 14] = i75;
                            c5234.f16388 += 32;
                            int i80 = i21;
                            int i81 = iMax;
                            c5234.m15050(7, 0, iCharCount, i78, 0);
                            c5234.f16404 = i78;
                            if (z5) {
                                c8055.f24830 = iCharCount;
                                if (c8055.f24847) {
                                    c8055.f24828 = 0;
                                }
                                i23 = i80;
                                if (i23 < i81) {
                                    zM15068 = c5234.m15068(false);
                                }
                                if (zM15068) {
                                    i22 = c5234.f16395;
                                    iCharCount = c5234.f16400;
                                    c5232 = this;
                                    i28 = i22;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    z2 = false;
                                    c5233 = c5232;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                } else {
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    c5232 = this;
                                    c8055 = c8055;
                                    charSequence2 = charSequence4;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    while (true) {
                                        i4 = c5234.f16398;
                                        if (i4 == 0) {
                                            c5234.m15069(0);
                                            return false;
                                        }
                                        i5 = i4 - 6;
                                        c5234.m15069(c5234.f16402[i4 - 3]);
                                        iArr = c5234.f16402;
                                        i3 = iArr[i4 - 5];
                                        i6 = i4 - 4;
                                        iM15074 = iArr[i6];
                                        i7 = iArr[i5];
                                        if (i7 == 7) {
                                            zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (zM15095) {
                                                c8054 = c8055;
                                                c8055 = c8054;
                                            } else {
                                                i3 = c5234.f16395;
                                                iCharCount = c5234.f16400;
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (i7 == 9) {
                                                c8054 = c8055;
                                                if (i7 == 8) {
                                                    c5234.f16398 = i5;
                                                    i8 = iArr[i4 - 2];
                                                    i9 = iArr[i4 - 1];
                                                    if (c5234.f16401.f28781) {
                                                        c5234.m15104(~i8, i9 - 1);
                                                        c5234.m15108(i8, i9);
                                                    } else {
                                                        c5234.m15085(i8, i9);
                                                    }
                                                } else if (i7 == 3) {
                                                    c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                    iArr2 = c6643.f20614;
                                                    int i311111111111114 = i4 - 2;
                                                    i13 = iArr[i311111111111114];
                                                    iArr[i311111111111114] = i13 + 1;
                                                    i14 = iArr2[i13];
                                                    if (i13 == iArr2.length - 1) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    if (c8054.m21407()) {
                                                        c5234.f16390 = true;
                                                        return false;
                                                    }
                                                    if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                        c8055 = c8054;
                                                    } else {
                                                        i3 = i14;
                                                    }
                                                } else if (i7 == 4) {
                                                    i11 = i4 - 2;
                                                    int i311111111111115 = iArr[i11];
                                                    int i311111111111116 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i311111111111115)];
                                                    i12 = i311111111111115 & (i311111111111115 - 1);
                                                    if (i12 == 0) {
                                                        c5234.f16398 = i5;
                                                    } else {
                                                        c5234.f16402[i11] = i12;
                                                    }
                                                    i3 = i311111111111116;
                                                } else if (i7 == 6) {
                                                    c5234.m15092(iArr[i4 - 2], iM15074);
                                                    if (c5234.f16390) {
                                                        return false;
                                                    }
                                                    c5234.f16398 = i5;
                                                } else if (i7 == 5) {
                                                    i29 = iArr[i4 - 2];
                                                    i30 = iArr[i4 - 1];
                                                    c5234.f16398 = i5;
                                                    charSequence4 = charSequence2;
                                                    iCharCount = iM15074;
                                                } else {
                                                    if (i7 == 1) {
                                                        if (i7 == 2) {
                                                            int iMax11115 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                            int[] iArr11119 = c5234.f16402;
                                                            iArr11119[i6] = iMax11115;
                                                            int i311111111111117 = i4 - 1;
                                                            i10 = iArr11119[i311111111111117] - 1;
                                                            iArr11119[i311111111111117] = i10;
                                                            if (i10 == 0) {
                                                                c5234.f16398 = i5;
                                                            }
                                                            iCharCount = iMax11115;
                                                        } else {
                                                            c5234.f16398 = i5;
                                                        }
                                                    } else if (i7 == 2) {
                                                        int iMax11116 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                        int[] iArr111110 = c5234.f16402;
                                                        iArr111110[i6] = iMax11116;
                                                        int i311111111111118 = i4 - 1;
                                                        i10 = iArr111110[i311111111111118] - 1;
                                                        iArr111110[i311111111111118] = i10;
                                                        if (i10 == 0) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        iCharCount = iMax11116;
                                                    } else {
                                                        c5234.f16398 = i5;
                                                    }
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (c8055.m21407()) {
                                                    c5234.f16390 = true;
                                                    return false;
                                                }
                                                i15 = i4 - 1;
                                                int i311111111111119 = c5234.f16402[i15];
                                                c8054 = c8055;
                                                iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i311111111111119 - Character.charCount(Character.codePointBefore(charSequence2, i311111111111119)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                if (iM15074 < 0) {
                                                    c5234.f16398 = i5;
                                                    c8055 = c8054;
                                                } else {
                                                    c5234.f16402[i15] = iM15074;
                                                    i14 = iArr3[i3 + 1];
                                                    i3 = i14;
                                                }
                                            }
                                            iCharCount = iM15074;
                                            charSequence4 = charSequence2;
                                        }
                                        i28 = i3;
                                        z2 = false;
                                        c5233 = c5232;
                                        objArr2 = objArr2;
                                        iArr3 = iArr3;
                                    }
                                }
                            } else {
                                i23 = i80;
                                if (i74 != 4) {
                                    if (c8055.f24847) {
                                        c8055.f24844 = c8055.f24836.length();
                                    }
                                    if (i74 == 1 && iCharCount >= c8055.f24844) {
                                        c8055.f24833 = true;
                                    }
                                }
                            }
                            c5234.f16395 = c5234.f16393[i79];
                            c5234.f16400 = i23;
                            zM15068 = true;
                            if (zM15068) {
                                i22 = c5234.f16395;
                                iCharCount = c5234.f16400;
                                c5232 = this;
                                i28 = i22;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            } else {
                                if (c5234.f16390) {
                                    return false;
                                }
                                c5232 = this;
                                c8055 = c8055;
                                charSequence2 = charSequence4;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                while (true) {
                                    i4 = c5234.f16398;
                                    if (i4 == 0) {
                                        c5234.m15069(0);
                                        return false;
                                    }
                                    i5 = i4 - 6;
                                    c5234.m15069(c5234.f16402[i4 - 3]);
                                    iArr = c5234.f16402;
                                    i3 = iArr[i4 - 5];
                                    i6 = i4 - 4;
                                    iM15074 = iArr[i6];
                                    i7 = iArr[i5];
                                    if (i7 == 7) {
                                        zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (zM15095) {
                                            c8054 = c8055;
                                            c8055 = c8054;
                                        } else {
                                            i3 = c5234.f16395;
                                            iCharCount = c5234.f16400;
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (i7 == 9) {
                                            c8054 = c8055;
                                            if (i7 == 8) {
                                                c5234.f16398 = i5;
                                                i8 = iArr[i4 - 2];
                                                i9 = iArr[i4 - 1];
                                                if (c5234.f16401.f28781) {
                                                    c5234.m15104(~i8, i9 - 1);
                                                    c5234.m15108(i8, i9);
                                                } else {
                                                    c5234.m15085(i8, i9);
                                                }
                                            } else if (i7 == 3) {
                                                c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                iArr2 = c6643.f20614;
                                                int i3111111111111110 = i4 - 2;
                                                i13 = iArr[i3111111111111110];
                                                iArr[i3111111111111110] = i13 + 1;
                                                i14 = iArr2[i13];
                                                if (i13 == iArr2.length - 1) {
                                                    c5234.f16398 = i5;
                                                }
                                                if (c8054.m21407()) {
                                                    c5234.f16390 = true;
                                                    return false;
                                                }
                                                if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                    c8055 = c8054;
                                                } else {
                                                    i3 = i14;
                                                }
                                            } else if (i7 == 4) {
                                                i11 = i4 - 2;
                                                int i3111111111111111 = iArr[i11];
                                                int i3111111111111112 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i3111111111111111)];
                                                i12 = i3111111111111111 & (i3111111111111111 - 1);
                                                if (i12 == 0) {
                                                    c5234.f16398 = i5;
                                                } else {
                                                    c5234.f16402[i11] = i12;
                                                }
                                                i3 = i3111111111111112;
                                            } else if (i7 == 6) {
                                                c5234.m15092(iArr[i4 - 2], iM15074);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                c5234.f16398 = i5;
                                            } else if (i7 == 5) {
                                                i29 = iArr[i4 - 2];
                                                i30 = iArr[i4 - 1];
                                                c5234.f16398 = i5;
                                                charSequence4 = charSequence2;
                                                iCharCount = iM15074;
                                            } else {
                                                if (i7 == 1) {
                                                    if (i7 == 2) {
                                                        int iMax11117 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                        int[] iArr111111 = c5234.f16402;
                                                        iArr111111[i6] = iMax11117;
                                                        int i3111111111111113 = i4 - 1;
                                                        i10 = iArr111111[i3111111111111113] - 1;
                                                        iArr111111[i3111111111111113] = i10;
                                                        if (i10 == 0) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        iCharCount = iMax11117;
                                                    } else {
                                                        c5234.f16398 = i5;
                                                    }
                                                } else if (i7 == 2) {
                                                    int iMax11118 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr111112 = c5234.f16402;
                                                    iArr111112[i6] = iMax11118;
                                                    int i3111111111111114 = i4 - 1;
                                                    i10 = iArr111112[i3111111111111114] - 1;
                                                    iArr111112[i3111111111111114] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax11118;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (c8055.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            i15 = i4 - 1;
                                            int i3111111111111115 = c5234.f16402[i15];
                                            c8054 = c8055;
                                            iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i3111111111111115 - Character.charCount(Character.codePointBefore(charSequence2, i3111111111111115)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (iM15074 < 0) {
                                                c5234.f16398 = i5;
                                                c8055 = c8054;
                                            } else {
                                                c5234.f16402[i15] = iM15074;
                                                i14 = iArr3[i3 + 1];
                                                i3 = i14;
                                            }
                                        }
                                        iCharCount = iM15074;
                                        charSequence4 = charSequence2;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c5233 = c5232;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            }
                            break;
                        case 23:
                            int[] iArr35 = c8055.f24832;
                            iArr35[0] = c8055.f24855;
                            c8055.m21416(iCharCount);
                            iArr35[1] = iCharCount;
                            if (!c5234.m15068(true)) {
                                if (c5234.f16390) {
                                    return false;
                                }
                                c5232 = this;
                                c8055 = c8055;
                                charSequence2 = charSequence4;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                while (true) {
                                    i4 = c5234.f16398;
                                    if (i4 == 0) {
                                        c5234.m15069(0);
                                        return false;
                                    }
                                    i5 = i4 - 6;
                                    c5234.m15069(c5234.f16402[i4 - 3]);
                                    iArr = c5234.f16402;
                                    i3 = iArr[i4 - 5];
                                    i6 = i4 - 4;
                                    iM15074 = iArr[i6];
                                    i7 = iArr[i5];
                                    if (i7 == 7) {
                                        zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (zM15095) {
                                            c8054 = c8055;
                                            c8055 = c8054;
                                        } else {
                                            i3 = c5234.f16395;
                                            iCharCount = c5234.f16400;
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (i7 == 9) {
                                            c8054 = c8055;
                                            if (i7 == 8) {
                                                c5234.f16398 = i5;
                                                i8 = iArr[i4 - 2];
                                                i9 = iArr[i4 - 1];
                                                if (c5234.f16401.f28781) {
                                                    c5234.m15104(~i8, i9 - 1);
                                                    c5234.m15108(i8, i9);
                                                } else {
                                                    c5234.m15085(i8, i9);
                                                }
                                            } else if (i7 == 3) {
                                                c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                iArr2 = c6643.f20614;
                                                int i3111111111111116 = i4 - 2;
                                                i13 = iArr[i3111111111111116];
                                                iArr[i3111111111111116] = i13 + 1;
                                                i14 = iArr2[i13];
                                                if (i13 == iArr2.length - 1) {
                                                    c5234.f16398 = i5;
                                                }
                                                if (c8054.m21407()) {
                                                    c5234.f16390 = true;
                                                    return false;
                                                }
                                                if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                    c8055 = c8054;
                                                } else {
                                                    i3 = i14;
                                                }
                                            } else if (i7 == 4) {
                                                i11 = i4 - 2;
                                                int i3111111111111117 = iArr[i11];
                                                int i3111111111111118 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i3111111111111117)];
                                                i12 = i3111111111111117 & (i3111111111111117 - 1);
                                                if (i12 == 0) {
                                                    c5234.f16398 = i5;
                                                } else {
                                                    c5234.f16402[i11] = i12;
                                                }
                                                i3 = i3111111111111118;
                                            } else if (i7 == 6) {
                                                c5234.m15092(iArr[i4 - 2], iM15074);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                c5234.f16398 = i5;
                                            } else if (i7 == 5) {
                                                i29 = iArr[i4 - 2];
                                                i30 = iArr[i4 - 1];
                                                c5234.f16398 = i5;
                                                charSequence4 = charSequence2;
                                                iCharCount = iM15074;
                                            } else {
                                                if (i7 == 1) {
                                                    if (i7 == 2) {
                                                        int iMax11119 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                        int[] iArr111113 = c5234.f16402;
                                                        iArr111113[i6] = iMax11119;
                                                        int i3111111111111119 = i4 - 1;
                                                        i10 = iArr111113[i3111111111111119] - 1;
                                                        iArr111113[i3111111111111119] = i10;
                                                        if (i10 == 0) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        iCharCount = iMax11119;
                                                    } else {
                                                        c5234.f16398 = i5;
                                                    }
                                                } else if (i7 == 2) {
                                                    int iMax111110 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr111114 = c5234.f16402;
                                                    iArr111114[i6] = iMax111110;
                                                    int i31111111111111110 = i4 - 1;
                                                    i10 = iArr111114[i31111111111111110] - 1;
                                                    iArr111114[i31111111111111110] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax111110;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (c8055.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            i15 = i4 - 1;
                                            int i31111111111111111 = c5234.f16402[i15];
                                            c8054 = c8055;
                                            iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i31111111111111111 - Character.charCount(Character.codePointBefore(charSequence2, i31111111111111111)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (iM15074 < 0) {
                                                c5234.f16398 = i5;
                                                c8055 = c8054;
                                            } else {
                                                c5234.f16402[i15] = iM15074;
                                                i14 = iArr3[i3 + 1];
                                                i3 = i14;
                                            }
                                        }
                                        iCharCount = iM15074;
                                        charSequence4 = charSequence2;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c5233 = c5232;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            } else {
                                i22 = c5234.f16395;
                                iCharCount = c5234.f16400;
                                c5232 = this;
                                i28 = i22;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            break;
                        case 24:
                            if (iCharCount == c8055.f24830) {
                                if (c5234.m15068(true)) {
                                    i22 = c5234.f16395;
                                    iCharCount = c5234.f16400;
                                    c5232 = this;
                                    i28 = i22;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    z2 = false;
                                    c5233 = c5232;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                } else if (c5234.f16390) {
                                    return false;
                                }
                            }
                            c5232 = this;
                            c8055 = c8055;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c5234.f16398;
                                if (i4 == 0) {
                                    c5234.m15069(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c5234.m15069(c5234.f16402[i4 - 3]);
                                iArr = c5234.f16402;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM15074 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    if (zM15095) {
                                        c8054 = c8055;
                                        c8055 = c8054;
                                    } else {
                                        i3 = c5234.f16395;
                                        iCharCount = c5234.f16400;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c8054 = c8055;
                                        if (i7 == 8) {
                                            c5234.f16398 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c5234.f16401.f28781) {
                                                c5234.m15104(~i8, i9 - 1);
                                                c5234.m15108(i8, i9);
                                            } else {
                                                c5234.m15085(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c6643.f20614;
                                            int i31111111111111112 = i4 - 2;
                                            i13 = iArr[i31111111111111112];
                                            iArr[i31111111111111112] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c5234.f16398 = i5;
                                            }
                                            if (c8054.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                c8055 = c8054;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i31111111111111113 = iArr[i11];
                                            int i31111111111111114 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i31111111111111113)];
                                            i12 = i31111111111111113 & (i31111111111111113 - 1);
                                            if (i12 == 0) {
                                                c5234.f16398 = i5;
                                            } else {
                                                c5234.f16402[i11] = i12;
                                            }
                                            i3 = i31111111111111114;
                                        } else if (i7 == 6) {
                                            c5234.m15092(iArr[i4 - 2], iM15074);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            c5234.f16398 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c5234.f16398 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM15074;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax111111 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr111115 = c5234.f16402;
                                                    iArr111115[i6] = iMax111111;
                                                    int i31111111111111115 = i4 - 1;
                                                    i10 = iArr111115[i31111111111111115] - 1;
                                                    iArr111115[i31111111111111115] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax111111;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax111112 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                int[] iArr111116 = c5234.f16402;
                                                iArr111116[i6] = iMax111112;
                                                int i31111111111111116 = i4 - 1;
                                                i10 = iArr111116[i31111111111111116] - 1;
                                                iArr111116[i31111111111111116] = i10;
                                                if (i10 == 0) {
                                                    c5234.f16398 = i5;
                                                }
                                                iCharCount = iMax111112;
                                            } else {
                                                c5234.f16398 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c8055.m21407()) {
                                            c5234.f16390 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i31111111111111117 = c5234.f16402[i15];
                                        c8054 = c8055;
                                        iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i31111111111111117 - Character.charCount(Character.codePointBefore(charSequence2, i31111111111111117)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (iM15074 < 0) {
                                            c5234.f16398 = i5;
                                            c8055 = c8054;
                                        } else {
                                            c5234.f16402[i15] = iM15074;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM15074;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            break;
                        case 25:
                            int[] iArr36 = c5234.f16401.f28782;
                            int iM15037 = c5234.m15037(iArr36[i28 + 2], iArr36[i28 + 3], iArr36[i31], iCharCount, 0, false);
                            C8760 c8760M15073 = c5234.m15073(iM15037);
                            if (!c8760M15073.f26704) {
                                if (c8760M15073.f26706 > 0) {
                                    c5234.m15053(iM15037, 0, true);
                                } else {
                                    zM15107 = c5234.m15107(iM15037);
                                }
                                if (zM15107) {
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    c5232 = this;
                                    c8055 = c8055;
                                    charSequence2 = charSequence4;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    while (true) {
                                        i4 = c5234.f16398;
                                        if (i4 == 0) {
                                            c5234.m15069(0);
                                            return false;
                                        }
                                        i5 = i4 - 6;
                                        c5234.m15069(c5234.f16402[i4 - 3]);
                                        iArr = c5234.f16402;
                                        i3 = iArr[i4 - 5];
                                        i6 = i4 - 4;
                                        iM15074 = iArr[i6];
                                        i7 = iArr[i5];
                                        if (i7 == 7) {
                                            zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (zM15095) {
                                                c8054 = c8055;
                                                c8055 = c8054;
                                            } else {
                                                i3 = c5234.f16395;
                                                iCharCount = c5234.f16400;
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (i7 == 9) {
                                                c8054 = c8055;
                                                if (i7 == 8) {
                                                    c5234.f16398 = i5;
                                                    i8 = iArr[i4 - 2];
                                                    i9 = iArr[i4 - 1];
                                                    if (c5234.f16401.f28781) {
                                                        c5234.m15104(~i8, i9 - 1);
                                                        c5234.m15108(i8, i9);
                                                    } else {
                                                        c5234.m15085(i8, i9);
                                                    }
                                                } else if (i7 == 3) {
                                                    c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                    iArr2 = c6643.f20614;
                                                    int i31111111111111118 = i4 - 2;
                                                    i13 = iArr[i31111111111111118];
                                                    iArr[i31111111111111118] = i13 + 1;
                                                    i14 = iArr2[i13];
                                                    if (i13 == iArr2.length - 1) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    if (c8054.m21407()) {
                                                        c5234.f16390 = true;
                                                        return false;
                                                    }
                                                    if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                        c8055 = c8054;
                                                    } else {
                                                        i3 = i14;
                                                    }
                                                } else if (i7 == 4) {
                                                    i11 = i4 - 2;
                                                    int i31111111111111119 = iArr[i11];
                                                    int i311111111111111110 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i31111111111111119)];
                                                    i12 = i31111111111111119 & (i31111111111111119 - 1);
                                                    if (i12 == 0) {
                                                        c5234.f16398 = i5;
                                                    } else {
                                                        c5234.f16402[i11] = i12;
                                                    }
                                                    i3 = i311111111111111110;
                                                } else if (i7 == 6) {
                                                    c5234.m15092(iArr[i4 - 2], iM15074);
                                                    if (c5234.f16390) {
                                                        return false;
                                                    }
                                                    c5234.f16398 = i5;
                                                } else if (i7 == 5) {
                                                    i29 = iArr[i4 - 2];
                                                    i30 = iArr[i4 - 1];
                                                    c5234.f16398 = i5;
                                                    charSequence4 = charSequence2;
                                                    iCharCount = iM15074;
                                                } else {
                                                    if (i7 == 1) {
                                                        if (i7 == 2) {
                                                            int iMax111113 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                            int[] iArr111117 = c5234.f16402;
                                                            iArr111117[i6] = iMax111113;
                                                            int i311111111111111111 = i4 - 1;
                                                            i10 = iArr111117[i311111111111111111] - 1;
                                                            iArr111117[i311111111111111111] = i10;
                                                            if (i10 == 0) {
                                                                c5234.f16398 = i5;
                                                            }
                                                            iCharCount = iMax111113;
                                                        } else {
                                                            c5234.f16398 = i5;
                                                        }
                                                    } else if (i7 == 2) {
                                                        int iMax111114 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                        int[] iArr111118 = c5234.f16402;
                                                        iArr111118[i6] = iMax111114;
                                                        int i311111111111111112 = i4 - 1;
                                                        i10 = iArr111118[i311111111111111112] - 1;
                                                        iArr111118[i311111111111111112] = i10;
                                                        if (i10 == 0) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        iCharCount = iMax111114;
                                                    } else {
                                                        c5234.f16398 = i5;
                                                    }
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (c8055.m21407()) {
                                                    c5234.f16390 = true;
                                                    return false;
                                                }
                                                i15 = i4 - 1;
                                                int i311111111111111113 = c5234.f16402[i15];
                                                c8054 = c8055;
                                                iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i311111111111111113 - Character.charCount(Character.codePointBefore(charSequence2, i311111111111111113)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                if (iM15074 < 0) {
                                                    c5234.f16398 = i5;
                                                    c8055 = c8054;
                                                } else {
                                                    c5234.f16402[i15] = iM15074;
                                                    i14 = iArr3[i3 + 1];
                                                    i3 = i14;
                                                }
                                            }
                                            iCharCount = iM15074;
                                            charSequence4 = charSequence2;
                                        }
                                        i28 = i3;
                                        z2 = false;
                                        c5233 = c5232;
                                        objArr2 = objArr2;
                                        iArr3 = iArr3;
                                    }
                                } else {
                                    i22 = c5234.f16395;
                                    iCharCount = c5234.f16400;
                                    c5232 = this;
                                    i28 = i22;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    z2 = false;
                                    c5233 = c5232;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            } else {
                                EnumC1497 enumC1497 = c8760M15073.f26708;
                                EnumC1497 enumC1498 = EnumC1497.LAZY;
                                c5234.m15053(iM15037, enumC1497 == enumC1498 ? 12 : 10, enumC1497 != enumC1498);
                            }
                            zM15107 = true;
                            if (zM15107) {
                                i22 = c5234.f16395;
                                iCharCount = c5234.f16400;
                                c5232 = this;
                                i28 = i22;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            } else {
                                if (c5234.f16390) {
                                    return false;
                                }
                                c5232 = this;
                                c8055 = c8055;
                                charSequence2 = charSequence4;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                while (true) {
                                    i4 = c5234.f16398;
                                    if (i4 == 0) {
                                        c5234.m15069(0);
                                        return false;
                                    }
                                    i5 = i4 - 6;
                                    c5234.m15069(c5234.f16402[i4 - 3]);
                                    iArr = c5234.f16402;
                                    i3 = iArr[i4 - 5];
                                    i6 = i4 - 4;
                                    iM15074 = iArr[i6];
                                    i7 = iArr[i5];
                                    if (i7 == 7) {
                                        zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (zM15095) {
                                            c8054 = c8055;
                                            c8055 = c8054;
                                        } else {
                                            i3 = c5234.f16395;
                                            iCharCount = c5234.f16400;
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (i7 == 9) {
                                            c8054 = c8055;
                                            if (i7 == 8) {
                                                c5234.f16398 = i5;
                                                i8 = iArr[i4 - 2];
                                                i9 = iArr[i4 - 1];
                                                if (c5234.f16401.f28781) {
                                                    c5234.m15104(~i8, i9 - 1);
                                                    c5234.m15108(i8, i9);
                                                } else {
                                                    c5234.m15085(i8, i9);
                                                }
                                            } else if (i7 == 3) {
                                                c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                iArr2 = c6643.f20614;
                                                int i311111111111111114 = i4 - 2;
                                                i13 = iArr[i311111111111111114];
                                                iArr[i311111111111111114] = i13 + 1;
                                                i14 = iArr2[i13];
                                                if (i13 == iArr2.length - 1) {
                                                    c5234.f16398 = i5;
                                                }
                                                if (c8054.m21407()) {
                                                    c5234.f16390 = true;
                                                    return false;
                                                }
                                                if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                    c8055 = c8054;
                                                } else {
                                                    i3 = i14;
                                                }
                                            } else if (i7 == 4) {
                                                i11 = i4 - 2;
                                                int i311111111111111115 = iArr[i11];
                                                int i311111111111111116 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i311111111111111115)];
                                                i12 = i311111111111111115 & (i311111111111111115 - 1);
                                                if (i12 == 0) {
                                                    c5234.f16398 = i5;
                                                } else {
                                                    c5234.f16402[i11] = i12;
                                                }
                                                i3 = i311111111111111116;
                                            } else if (i7 == 6) {
                                                c5234.m15092(iArr[i4 - 2], iM15074);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                c5234.f16398 = i5;
                                            } else if (i7 == 5) {
                                                i29 = iArr[i4 - 2];
                                                i30 = iArr[i4 - 1];
                                                c5234.f16398 = i5;
                                                charSequence4 = charSequence2;
                                                iCharCount = iM15074;
                                            } else {
                                                if (i7 == 1) {
                                                    if (i7 == 2) {
                                                        int iMax111115 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                        int[] iArr111119 = c5234.f16402;
                                                        iArr111119[i6] = iMax111115;
                                                        int i311111111111111117 = i4 - 1;
                                                        i10 = iArr111119[i311111111111111117] - 1;
                                                        iArr111119[i311111111111111117] = i10;
                                                        if (i10 == 0) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        iCharCount = iMax111115;
                                                    } else {
                                                        c5234.f16398 = i5;
                                                    }
                                                } else if (i7 == 2) {
                                                    int iMax111116 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr1111110 = c5234.f16402;
                                                    iArr1111110[i6] = iMax111116;
                                                    int i311111111111111118 = i4 - 1;
                                                    i10 = iArr1111110[i311111111111111118] - 1;
                                                    iArr1111110[i311111111111111118] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax111116;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (c8055.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            i15 = i4 - 1;
                                            int i311111111111111119 = c5234.f16402[i15];
                                            c8054 = c8055;
                                            iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i311111111111111119 - Character.charCount(Character.codePointBefore(charSequence2, i311111111111111119)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (iM15074 < 0) {
                                                c5234.f16398 = i5;
                                                c8055 = c8054;
                                            } else {
                                                c5234.f16402[i15] = iM15074;
                                                i14 = iArr3[i3 + 1];
                                                i3 = i14;
                                            }
                                        }
                                        iCharCount = iM15074;
                                        charSequence4 = charSequence2;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c5233 = c5232;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            }
                            break;
                        case 26:
                            if (c5234.f16401.f28781) {
                                c5234.m15070(iArr3[i28 + 2]);
                            }
                            if (iArr3[i28 + 4] <= 0) {
                                if (iArr3[i28 + 5] > 0) {
                                    c5234.m15050(8, iArr3[i28 + 6], iCharCount, iArr3[i28 + 2], 1);
                                }
                                c5232 = c5233;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            } else {
                                int i82 = iArr3[i28 + 2];
                                if (c5234.f16401.f28781) {
                                    c5234.m15108(i82, 1);
                                } else {
                                    c5234.m15085(i82, 1);
                                }
                                i22 = iArr3[i28 + 6];
                                c5232 = this;
                                i28 = i22;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            break;
                        case 27:
                            if (iCharCount > c5234.m15097(iArr3[i28 + 3])) {
                                if (c5234.m15086()) {
                                    return false;
                                }
                                int i83 = i28 + 2;
                                int iM15099 = c5234.m15097(iArr3[i83]);
                                if (iM15099 < iArr3[i28 + 4]) {
                                    c5234.m15085(iArr3[i83], iM15099 + 1);
                                    i28 = iArr3[i28 + 6];
                                    z2 = false;
                                } else if (iM15099 < iArr3[i28 + 5]) {
                                    c5234.m15050(8, iArr3[i28 + 6], iCharCount, iArr3[i83], iM15099 + 1);
                                    charSequence4 = charSequence;
                                }
                                break;
                            }
                            c5232 = c5233;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            i28 = i3;
                            z2 = false;
                            c5233 = c5232;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                            int iM3491 = C0998.m3491((int[]) objArr2[iArr3[i28 + 2]], iArr3[i28 + 3], c8055, charSequence4, iCharCount);
                            if (iM3491 == -2) {
                                c5234.f16390 = true;
                                return false;
                            }
                            if (iM3491 != -1) {
                                iM9496 = iM3491;
                                c5232 = c5233;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                iCharCount = iM9496;
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            c5232 = this;
                            c8055 = c8055;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c5234.f16398;
                                if (i4 == 0) {
                                    c5234.m15069(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c5234.m15069(c5234.f16402[i4 - 3]);
                                iArr = c5234.f16402;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM15074 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    if (zM15095) {
                                        c8054 = c8055;
                                        c8055 = c8054;
                                    } else {
                                        i3 = c5234.f16395;
                                        iCharCount = c5234.f16400;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c8054 = c8055;
                                        if (i7 == 8) {
                                            c5234.f16398 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c5234.f16401.f28781) {
                                                c5234.m15104(~i8, i9 - 1);
                                                c5234.m15108(i8, i9);
                                            } else {
                                                c5234.m15085(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c6643.f20614;
                                            int i3111111111111111110 = i4 - 2;
                                            i13 = iArr[i3111111111111111110];
                                            iArr[i3111111111111111110] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c5234.f16398 = i5;
                                            }
                                            if (c8054.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                c8055 = c8054;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i3111111111111111111 = iArr[i11];
                                            int i3111111111111111112 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i3111111111111111111)];
                                            i12 = i3111111111111111111 & (i3111111111111111111 - 1);
                                            if (i12 == 0) {
                                                c5234.f16398 = i5;
                                            } else {
                                                c5234.f16402[i11] = i12;
                                            }
                                            i3 = i3111111111111111112;
                                        } else if (i7 == 6) {
                                            c5234.m15092(iArr[i4 - 2], iM15074);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            c5234.f16398 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c5234.f16398 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM15074;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax111117 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr1111111 = c5234.f16402;
                                                    iArr1111111[i6] = iMax111117;
                                                    int i3111111111111111113 = i4 - 1;
                                                    i10 = iArr1111111[i3111111111111111113] - 1;
                                                    iArr1111111[i3111111111111111113] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax111117;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax111118 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                int[] iArr1111112 = c5234.f16402;
                                                iArr1111112[i6] = iMax111118;
                                                int i3111111111111111114 = i4 - 1;
                                                i10 = iArr1111112[i3111111111111111114] - 1;
                                                iArr1111112[i3111111111111111114] = i10;
                                                if (i10 == 0) {
                                                    c5234.f16398 = i5;
                                                }
                                                iCharCount = iMax111118;
                                            } else {
                                                c5234.f16398 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c8055.m21407()) {
                                            c5234.f16390 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i3111111111111111115 = c5234.f16402[i15];
                                        c8054 = c8055;
                                        iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i3111111111111111115 - Character.charCount(Character.codePointBefore(charSequence2, i3111111111111111115)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (iM15074 < 0) {
                                            c5234.f16398 = i5;
                                            c8055 = c8054;
                                        } else {
                                            c5234.f16402[i15] = iM15074;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM15074;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            break;
                        case 34:
                            int i84 = iArr3[i28 + 2];
                            int i85 = iArr3[i28 + 3];
                            int[] iArr37 = c8055.f24832;
                            int iCharCount3 = iArr37[i84];
                            int i86 = iArr37[i84 + 1] - iCharCount3;
                            if (iCharCount3 >= 0) {
                                i25 = iCharCount + i86;
                                if (i25 > length) {
                                    c8055.f24842 = true;
                                } else if (i85 == 0) {
                                    int i87 = 0;
                                    while (true) {
                                        if (i87 >= i86) {
                                            i24 = -2;
                                        } else if (charSequence4.charAt(iCharCount + i87) == charSequence4.charAt(iCharCount3 + i87)) {
                                            if (c8055.m21407()) {
                                                i24 = -2;
                                                i25 = -2;
                                            } else {
                                                i87++;
                                            }
                                        }
                                    }
                                } else {
                                    if (i85 != 1 && i85 != 2) {
                                        throw new IllegalArgumentException(C19370.m44628(i85, "Unknown regex back-reference mode: "));
                                    }
                                    int i88 = 0;
                                    while (true) {
                                        if (i88 >= i86) {
                                            i24 = -2;
                                        } else {
                                            int iCodePointAt3 = Character.codePointAt(charSequence4, iCharCount);
                                            int iCodePointAt4 = Character.codePointAt(charSequence4, iCharCount3);
                                            if (iCodePointAt3 != iCodePointAt4) {
                                                if (i85 == 2) {
                                                    int upperCase = Character.toUpperCase(iCodePointAt3);
                                                    int upperCase2 = Character.toUpperCase(iCodePointAt4);
                                                    if (upperCase != upperCase2 && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                                                    }
                                                } else if (C22165.m49804(iCodePointAt3) != C22165.m49804(iCodePointAt4)) {
                                                }
                                            }
                                            iCharCount += Character.charCount(iCodePointAt3);
                                            iCharCount3 += Character.charCount(iCodePointAt4);
                                            if (iCodePointAt3 >= 65536) {
                                                i86--;
                                            }
                                            if (c8055.m21407()) {
                                                i24 = -2;
                                                i25 = -2;
                                            } else {
                                                i88++;
                                            }
                                        }
                                    }
                                }
                                i24 = -2;
                                i25 = -1;
                            } else {
                                i24 = -2;
                                i25 = -1;
                            }
                            if (i25 == i24) {
                                c5234.f16390 = true;
                                return false;
                            }
                            if (i25 >= 0) {
                                iM9496 = i25;
                                c5232 = c5233;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                iCharCount = iM9496;
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            c5232 = this;
                            c8055 = c8055;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c5234.f16398;
                                if (i4 == 0) {
                                    c5234.m15069(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c5234.m15069(c5234.f16402[i4 - 3]);
                                iArr = c5234.f16402;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM15074 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    if (zM15095) {
                                        c8054 = c8055;
                                        c8055 = c8054;
                                    } else {
                                        i3 = c5234.f16395;
                                        iCharCount = c5234.f16400;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c8054 = c8055;
                                        if (i7 == 8) {
                                            c5234.f16398 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c5234.f16401.f28781) {
                                                c5234.m15104(~i8, i9 - 1);
                                                c5234.m15108(i8, i9);
                                            } else {
                                                c5234.m15085(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c6643.f20614;
                                            int i3111111111111111116 = i4 - 2;
                                            i13 = iArr[i3111111111111111116];
                                            iArr[i3111111111111111116] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c5234.f16398 = i5;
                                            }
                                            if (c8054.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                c8055 = c8054;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i3111111111111111117 = iArr[i11];
                                            int i3111111111111111118 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i3111111111111111117)];
                                            i12 = i3111111111111111117 & (i3111111111111111117 - 1);
                                            if (i12 == 0) {
                                                c5234.f16398 = i5;
                                            } else {
                                                c5234.f16402[i11] = i12;
                                            }
                                            i3 = i3111111111111111118;
                                        } else if (i7 == 6) {
                                            c5234.m15092(iArr[i4 - 2], iM15074);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            c5234.f16398 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c5234.f16398 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM15074;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax111119 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr1111113 = c5234.f16402;
                                                    iArr1111113[i6] = iMax111119;
                                                    int i3111111111111111119 = i4 - 1;
                                                    i10 = iArr1111113[i3111111111111111119] - 1;
                                                    iArr1111113[i3111111111111111119] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax111119;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax1111110 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                int[] iArr1111114 = c5234.f16402;
                                                iArr1111114[i6] = iMax1111110;
                                                int i31111111111111111110 = i4 - 1;
                                                i10 = iArr1111114[i31111111111111111110] - 1;
                                                iArr1111114[i31111111111111111110] = i10;
                                                if (i10 == 0) {
                                                    c5234.f16398 = i5;
                                                }
                                                iCharCount = iMax1111110;
                                            } else {
                                                c5234.f16398 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c8055.m21407()) {
                                            c5234.f16390 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i31111111111111111111 = c5234.f16402[i15];
                                        c8054 = c8055;
                                        iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i31111111111111111111 - Character.charCount(Character.codePointBefore(charSequence2, i31111111111111111111)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (iM15074 < 0) {
                                            c5234.f16398 = i5;
                                            c8055 = c8054;
                                        } else {
                                            c5234.f16402[i15] = iM15074;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM15074;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            break;
                        case 35:
                            if (iCharCount < length) {
                                char cCharAt2 = charSequence4.charAt(iCharCount);
                                if (cCharAt2 == '\n' || cCharAt2 == 11 || cCharAt2 == '\f' || cCharAt2 == 133 || cCharAt2 == 8232 || cCharAt2 == 8233) {
                                    iCharCount++;
                                } else if (cCharAt2 == '\r') {
                                    iM9496 = iCharCount + 1;
                                    if (iM9496 >= c8055.f24844) {
                                        c8055.f24842 = true;
                                    } else if (charSequence4.charAt(iM9496) == '\n') {
                                        c5234.m15050(0, i3, iM9496, 0, 0);
                                        iCharCount += 2;
                                    }
                                    c5232 = c5233;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    iCharCount = iM9496;
                                    i28 = i3;
                                    z2 = false;
                                    c5233 = c5232;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                                iM9496 = iCharCount;
                                c5232 = c5233;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                iCharCount = iM9496;
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            } else {
                                c8055.f24842 = true;
                            }
                            c5232 = this;
                            c8055 = c8055;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c5234.f16398;
                                if (i4 == 0) {
                                    c5234.m15069(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c5234.m15069(c5234.f16402[i4 - 3]);
                                iArr = c5234.f16402;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM15074 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    if (zM15095) {
                                        c8054 = c8055;
                                        c8055 = c8054;
                                    } else {
                                        i3 = c5234.f16395;
                                        iCharCount = c5234.f16400;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c8054 = c8055;
                                        if (i7 == 8) {
                                            c5234.f16398 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c5234.f16401.f28781) {
                                                c5234.m15104(~i8, i9 - 1);
                                                c5234.m15108(i8, i9);
                                            } else {
                                                c5234.m15085(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c6643.f20614;
                                            int i31111111111111111112 = i4 - 2;
                                            i13 = iArr[i31111111111111111112];
                                            iArr[i31111111111111111112] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c5234.f16398 = i5;
                                            }
                                            if (c8054.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                c8055 = c8054;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i31111111111111111113 = iArr[i11];
                                            int i31111111111111111114 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i31111111111111111113)];
                                            i12 = i31111111111111111113 & (i31111111111111111113 - 1);
                                            if (i12 == 0) {
                                                c5234.f16398 = i5;
                                            } else {
                                                c5234.f16402[i11] = i12;
                                            }
                                            i3 = i31111111111111111114;
                                        } else if (i7 == 6) {
                                            c5234.m15092(iArr[i4 - 2], iM15074);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            c5234.f16398 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c5234.f16398 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM15074;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax1111111 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr1111115 = c5234.f16402;
                                                    iArr1111115[i6] = iMax1111111;
                                                    int i31111111111111111115 = i4 - 1;
                                                    i10 = iArr1111115[i31111111111111111115] - 1;
                                                    iArr1111115[i31111111111111111115] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax1111111;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax1111112 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                int[] iArr1111116 = c5234.f16402;
                                                iArr1111116[i6] = iMax1111112;
                                                int i31111111111111111116 = i4 - 1;
                                                i10 = iArr1111116[i31111111111111111116] - 1;
                                                iArr1111116[i31111111111111111116] = i10;
                                                if (i10 == 0) {
                                                    c5234.f16398 = i5;
                                                }
                                                iCharCount = iMax1111112;
                                            } else {
                                                c5234.f16398 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c8055.m21407()) {
                                            c5234.f16390 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i31111111111111111117 = c5234.f16402[i15];
                                        c8054 = c8055;
                                        iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i31111111111111111117 - Character.charCount(Character.codePointBefore(charSequence2, i31111111111111111117)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (iM15074 < 0) {
                                            c5234.f16398 = i5;
                                            c8055 = c8054;
                                        } else {
                                            c5234.f16402[i15] = iM15074;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM15074;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            break;
                        case 36:
                        case 37:
                            if (i32 != 36) {
                                int i89 = c8055.f24828;
                                if (c8055.f24847) {
                                    length = c8055.f24836.length();
                                    i89 = 0;
                                }
                                if (iCharCount != i89) {
                                    if (iCharCount < length) {
                                        boolean zIsSurrogatePair = Character.isSurrogatePair(charSequence4.charAt(iCharCount - 1), charSequence4.charAt(iCharCount));
                                        if (c8055.m21407() || Thread.currentThread().isInterrupted()) {
                                            iCharCount = -2;
                                        } else if (zIsSurrogatePair) {
                                            iCharCount = -1;
                                        } else {
                                            int iM9497 = C3115.m9496(charSequence4, c8055.m21402(), length, c8055);
                                            if (iM9497 == -2) {
                                                iCharCount = -2;
                                            } else if (iM9497 > iCharCount) {
                                                iCharCount = -1;
                                            }
                                        }
                                    } else {
                                        c8055.f24842 = true;
                                        c8055.f24833 = true;
                                    }
                                }
                            } else if (iCharCount < length) {
                                iCharCount = C3115.m9496(charSequence4, iCharCount, length, c8055);
                            } else {
                                c8055.f24842 = true;
                                iCharCount = -1;
                            }
                            if (iCharCount == -2) {
                                c5234.f16390 = true;
                                return false;
                            }
                            break;
                        case 38:
                            if (iCharCount < length) {
                                InterfaceC10795 interfaceC10798 = (InterfaceC10795) objArr2[iArr3[i28 + 2]];
                                int iCodePointAt5 = Character.codePointAt(charSequence4, iCharCount);
                                int iCharCount4 = Character.charCount(iCodePointAt5) + iCharCount;
                                iM9496 = C3115.m9496(charSequence4, iCharCount, c8055.f24844, c8055);
                                if (iM9496 == -2) {
                                    c5234.f16390 = true;
                                    return false;
                                }
                                if (iCharCount4 != iM9496) {
                                    int iM15075 = c5234.m15074(iCharCount, iCharCount4, iM9496, interfaceC10798, charSequence4);
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    if (iM15075 >= 0) {
                                        c5234.m15050(9, i28, iCharCount, iCharCount4, iM15075);
                                        iM9496 = iM15075;
                                        c5232 = c5233;
                                        iArr3 = iArr3;
                                        objArr2 = objArr2;
                                        iCharCount = iM9496;
                                        i28 = i3;
                                        z2 = false;
                                        c5233 = c5232;
                                        objArr2 = objArr2;
                                        iArr3 = iArr3;
                                    }
                                } else {
                                    if (interfaceC10798.mo2465(iCodePointAt5)) {
                                        c5232 = c5233;
                                        iArr3 = iArr3;
                                        objArr2 = objArr2;
                                        iCharCount = iM9496;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c5233 = c5232;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            } else {
                                c8055.f24842 = true;
                            }
                            c5232 = this;
                            c8055 = c8055;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c5234.f16398;
                                if (i4 == 0) {
                                    c5234.m15069(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c5234.m15069(c5234.f16402[i4 - 3]);
                                iArr = c5234.f16402;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM15074 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    if (zM15095) {
                                        c8054 = c8055;
                                        c8055 = c8054;
                                    } else {
                                        i3 = c5234.f16395;
                                        iCharCount = c5234.f16400;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c8054 = c8055;
                                        if (i7 == 8) {
                                            c5234.f16398 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c5234.f16401.f28781) {
                                                c5234.m15104(~i8, i9 - 1);
                                                c5234.m15108(i8, i9);
                                            } else {
                                                c5234.m15085(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c6643.f20614;
                                            int i31111111111111111118 = i4 - 2;
                                            i13 = iArr[i31111111111111111118];
                                            iArr[i31111111111111111118] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c5234.f16398 = i5;
                                            }
                                            if (c8054.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                c8055 = c8054;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i31111111111111111119 = iArr[i11];
                                            int i311111111111111111110 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i31111111111111111119)];
                                            i12 = i31111111111111111119 & (i31111111111111111119 - 1);
                                            if (i12 == 0) {
                                                c5234.f16398 = i5;
                                            } else {
                                                c5234.f16402[i11] = i12;
                                            }
                                            i3 = i311111111111111111110;
                                        } else if (i7 == 6) {
                                            c5234.m15092(iArr[i4 - 2], iM15074);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            c5234.f16398 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c5234.f16398 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM15074;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax1111113 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                    int[] iArr1111117 = c5234.f16402;
                                                    iArr1111117[i6] = iMax1111113;
                                                    int i311111111111111111111 = i4 - 1;
                                                    i10 = iArr1111117[i311111111111111111111] - 1;
                                                    iArr1111117[i311111111111111111111] = i10;
                                                    if (i10 == 0) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    iCharCount = iMax1111113;
                                                } else {
                                                    c5234.f16398 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax1111114 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                int[] iArr1111118 = c5234.f16402;
                                                iArr1111118[i6] = iMax1111114;
                                                int i311111111111111111112 = i4 - 1;
                                                i10 = iArr1111118[i311111111111111111112] - 1;
                                                iArr1111118[i311111111111111111112] = i10;
                                                if (i10 == 0) {
                                                    c5234.f16398 = i5;
                                                }
                                                iCharCount = iMax1111114;
                                            } else {
                                                c5234.f16398 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c8055.m21407()) {
                                            c5234.f16390 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i311111111111111111113 = c5234.f16402[i15];
                                        c8054 = c8055;
                                        iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i311111111111111111113 - Character.charCount(Character.codePointBefore(charSequence2, i311111111111111111113)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (iM15074 < 0) {
                                            c5234.f16398 = i5;
                                            c8055 = c8054;
                                        } else {
                                            c5234.f16402[i15] = iM15074;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM15074;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            break;
                        case 39:
                            C5855 c5856 = C14403.f44164;
                            if (iCharCount != charSequence4.length() && iCharCount != 0) {
                                int i90 = iCharCount - 1;
                                boolean z6 = Character.isJavaIdentifierPart(charSequence4.charAt(i90)) && (iCharCount <= 1 || charSequence4.charAt(iCharCount + (-2)) != '\\');
                                boolean z7 = charSequence4.charAt(i90) == charSequence4.charAt(iCharCount);
                                if (!Character.isJavaIdentifierPart(charSequence4.charAt(iCharCount)) ? z7 : z6) {
                                    c5232 = this;
                                    c8055 = c8055;
                                    charSequence2 = charSequence4;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    while (true) {
                                        i4 = c5234.f16398;
                                        if (i4 == 0) {
                                            c5234.m15069(0);
                                            return false;
                                        }
                                        i5 = i4 - 6;
                                        c5234.m15069(c5234.f16402[i4 - 3]);
                                        iArr = c5234.f16402;
                                        i3 = iArr[i4 - 5];
                                        i6 = i4 - 4;
                                        iM15074 = iArr[i6];
                                        i7 = iArr[i5];
                                        if (i7 == 7) {
                                            zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            if (zM15095) {
                                                c8054 = c8055;
                                                c8055 = c8054;
                                            } else {
                                                i3 = c5234.f16395;
                                                iCharCount = c5234.f16400;
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (i7 == 9) {
                                                c8054 = c8055;
                                                if (i7 == 8) {
                                                    c5234.f16398 = i5;
                                                    i8 = iArr[i4 - 2];
                                                    i9 = iArr[i4 - 1];
                                                    if (c5234.f16401.f28781) {
                                                        c5234.m15104(~i8, i9 - 1);
                                                        c5234.m15108(i8, i9);
                                                    } else {
                                                        c5234.m15085(i8, i9);
                                                    }
                                                } else if (i7 == 3) {
                                                    c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                                    iArr2 = c6643.f20614;
                                                    int i311111111111111111114 = i4 - 2;
                                                    i13 = iArr[i311111111111111111114];
                                                    iArr[i311111111111111111114] = i13 + 1;
                                                    i14 = iArr2[i13];
                                                    if (i13 == iArr2.length - 1) {
                                                        c5234.f16398 = i5;
                                                    }
                                                    if (c8054.m21407()) {
                                                        c5234.f16390 = true;
                                                        return false;
                                                    }
                                                    if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                        c8055 = c8054;
                                                    } else {
                                                        i3 = i14;
                                                    }
                                                } else if (i7 == 4) {
                                                    i11 = i4 - 2;
                                                    int i311111111111111111115 = iArr[i11];
                                                    int i311111111111111111116 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i311111111111111111115)];
                                                    i12 = i311111111111111111115 & (i311111111111111111115 - 1);
                                                    if (i12 == 0) {
                                                        c5234.f16398 = i5;
                                                    } else {
                                                        c5234.f16402[i11] = i12;
                                                    }
                                                    i3 = i311111111111111111116;
                                                } else if (i7 == 6) {
                                                    c5234.m15092(iArr[i4 - 2], iM15074);
                                                    if (c5234.f16390) {
                                                        return false;
                                                    }
                                                    c5234.f16398 = i5;
                                                } else if (i7 == 5) {
                                                    i29 = iArr[i4 - 2];
                                                    i30 = iArr[i4 - 1];
                                                    c5234.f16398 = i5;
                                                    charSequence4 = charSequence2;
                                                    iCharCount = iM15074;
                                                } else {
                                                    if (i7 == 1) {
                                                        if (i7 == 2) {
                                                            int iMax1111115 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                            int[] iArr1111119 = c5234.f16402;
                                                            iArr1111119[i6] = iMax1111115;
                                                            int i311111111111111111117 = i4 - 1;
                                                            i10 = iArr1111119[i311111111111111111117] - 1;
                                                            iArr1111119[i311111111111111111117] = i10;
                                                            if (i10 == 0) {
                                                                c5234.f16398 = i5;
                                                            }
                                                            iCharCount = iMax1111115;
                                                        } else {
                                                            c5234.f16398 = i5;
                                                        }
                                                    } else if (i7 == 2) {
                                                        int iMax1111116 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                        int[] iArr11111110 = c5234.f16402;
                                                        iArr11111110[i6] = iMax1111116;
                                                        int i311111111111111111118 = i4 - 1;
                                                        i10 = iArr11111110[i311111111111111111118] - 1;
                                                        iArr11111110[i311111111111111111118] = i10;
                                                        if (i10 == 0) {
                                                            c5234.f16398 = i5;
                                                        }
                                                        iCharCount = iMax1111116;
                                                    } else {
                                                        c5234.f16398 = i5;
                                                    }
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (c8055.m21407()) {
                                                    c5234.f16390 = true;
                                                    return false;
                                                }
                                                i15 = i4 - 1;
                                                int i311111111111111111119 = c5234.f16402[i15];
                                                c8054 = c8055;
                                                iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i311111111111111111119 - Character.charCount(Character.codePointBefore(charSequence2, i311111111111111111119)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                                if (c5234.f16390) {
                                                    return false;
                                                }
                                                if (iM15074 < 0) {
                                                    c5234.f16398 = i5;
                                                    c8055 = c8054;
                                                } else {
                                                    c5234.f16402[i15] = iM15074;
                                                    i14 = iArr3[i3 + 1];
                                                    i3 = i14;
                                                }
                                            }
                                            iCharCount = iM15074;
                                            charSequence4 = charSequence2;
                                        }
                                    }
                                }
                                i28 = i3;
                                z2 = false;
                                c5233 = c5232;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            c5232 = c5233;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            i28 = i3;
                            z2 = false;
                            c5233 = c5232;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        default:
                            throw new IllegalStateException("Invalid regex opcode");
                    }
                } else {
                    c8055 = c8055;
                    c5232 = c5233;
                    iArr3 = iArr3;
                    objArr2 = objArr2;
                    charSequence2 = charSequence4;
                    C23369 c23369 = (C23369) objArr2[iArr3[i28 + 2]];
                    int i91 = c23369.f75067 + iCharCount;
                    if (i91 >= iCharCount && i91 < length) {
                        char cCharAt3 = charSequence2.charAt(i91);
                        if (!c23369.f75066 ? !c23369.f75068.mo2465(cCharAt3) : cCharAt3 != c23369.f75065) {
                            while (true) {
                                i4 = c5234.f16398;
                                if (i4 == 0) {
                                    c5234.m15069(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c5234.m15069(c5234.f16402[i4 - 3]);
                                iArr = c5234.f16402;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM15074 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM15095 = c5234.m15095(iArr[i4 - 2], charSequence2);
                                    if (c5234.f16390) {
                                        return false;
                                    }
                                    if (zM15095) {
                                        c8054 = c8055;
                                        c8055 = c8054;
                                    } else {
                                        i3 = c5234.f16395;
                                        iCharCount = c5234.f16400;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c8054 = c8055;
                                        if (i7 == 8) {
                                            c5234.f16398 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c5234.f16401.f28781) {
                                                c5234.m15104(~i8, i9 - 1);
                                                c5234.m15108(i8, i9);
                                            } else {
                                                c5234.m15085(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c6643 = (C6643) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c6643.f20614;
                                            int i3111111111111111111110 = i4 - 2;
                                            i13 = iArr[i3111111111111111111110];
                                            iArr[i3111111111111111111110] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c5234.f16398 = i5;
                                            }
                                            if (c8054.m21407()) {
                                                c5234.f16390 = true;
                                                return false;
                                            }
                                            if (c5234.m15061(c6643, i13, iM15074, charSequence2)) {
                                                c8055 = c8054;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i3111111111111111111111 = iArr[i11];
                                            int i3111111111111111111112 = ((C6643) objArr2[iArr3[i3 + 2]]).f20614[Integer.numberOfTrailingZeros(i3111111111111111111111)];
                                            i12 = i3111111111111111111111 & (i3111111111111111111111 - 1);
                                            if (i12 == 0) {
                                                c5234.f16398 = i5;
                                            } else {
                                                c5234.f16402[i11] = i12;
                                            }
                                            i3 = i3111111111111111111112;
                                        } else if (i7 == 6) {
                                            c5234.m15092(iArr[i4 - 2], iM15074);
                                            if (c5234.f16390) {
                                                return false;
                                            }
                                            c5234.f16398 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c5234.f16398 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM15074;
                                        } else if (i7 == 1) {
                                            if (i7 == 2) {
                                                int iMax1111117 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                                int[] iArr11111111 = c5234.f16402;
                                                iArr11111111[i6] = iMax1111117;
                                                int i3111111111111111111113 = i4 - 1;
                                                i10 = iArr11111111[i3111111111111111111113] - 1;
                                                iArr11111111[i3111111111111111111113] = i10;
                                                if (i10 == 0) {
                                                    c5234.f16398 = i5;
                                                }
                                                iCharCount = iMax1111117;
                                            } else {
                                                c5234.f16398 = i5;
                                            }
                                        } else if (i7 == 2) {
                                            int iMax1111118 = Math.max(iArr[i4 - 2], iM15074 - Character.charCount(Character.codePointBefore(charSequence2, iM15074)));
                                            int[] iArr11111112 = c5234.f16402;
                                            iArr11111112[i6] = iMax1111118;
                                            int i3111111111111111111114 = i4 - 1;
                                            i10 = iArr11111112[i3111111111111111111114] - 1;
                                            iArr11111112[i3111111111111111111114] = i10;
                                            if (i10 == 0) {
                                                c5234.f16398 = i5;
                                            }
                                            iCharCount = iMax1111118;
                                        } else {
                                            c5234.f16398 = i5;
                                        }
                                    } else {
                                        if (c8055.m21407()) {
                                            c5234.f16390 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i3111111111111111111115 = c5234.f16402[i15];
                                        c8054 = c8055;
                                        iM15074 = c5234.m15074(iM15074, c5234.f16402[i4 - 2], i3111111111111111111115 - Character.charCount(Character.codePointBefore(charSequence2, i3111111111111111111115)), (InterfaceC10795) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c5234.f16390) {
                                            return false;
                                        }
                                        if (iM15074 < 0) {
                                            c5234.f16398 = i5;
                                            c8055 = c8054;
                                        } else {
                                            c5234.f16402[i15] = iM15074;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM15074;
                                }
                            }
                        }
                        i28 = i3;
                        z2 = false;
                        c5233 = c5232;
                        objArr2 = objArr2;
                        iArr3 = iArr3;
                    }
                    charSequence4 = charSequence2;
                    i28 = i3;
                    z2 = false;
                    c5233 = c5232;
                    objArr2 = objArr2;
                    iArr3 = iArr3;
                }
            }
            z2 = false;
            c5233 = this;
            charSequence3 = charSequence4;
            i27 = iCharCount;
            i26 = i3;
            objArr2 = objArr2;
            iArr3 = iArr3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15061(C6643 c6643, int i, int i2, CharSequence charSequence) {
        char cCharAt;
        int[] iArr = c6643.f20613;
        return iArr == null || iArr[i] < 0 || i2 >= this.f16397.f24844 || (cCharAt = charSequence.charAt(i2)) >= 128 || cCharAt == iArr[i];
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private C8760 m15073(int i) {
        return (C8760) this.f16401.f28780[this.f16393[i + 16]];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15037(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        m15098();
        C8760 c8760 = (C8760) this.f16401.f28780[i];
        int i7 = this.f16388;
        int[] iArr = this.f16393;
        iArr[i7] = z ? 6 : 5;
        iArr[i7 + 1] = i3;
        iArr[i7 + 2] = i4;
        iArr[i7 + 3] = i2;
        iArr[i7 + 4] = this.f16398;
        iArr[i7 + 5] = this.f16409;
        int i8 = i7 + 6;
        C8054 c8054 = this.f16397;
        iArr[i8] = (!c8054.f24837 || (!c8760.f26702 && (z || c8760.f26705 >= 0))) ? -1 : c8054.f24823.f58949.size();
        int[] iArr2 = this.f16393;
        iArr2[i7 + 12] = this.f16404;
        iArr2[i7 + 13] = 0;
        iArr2[i7 + 16] = i;
        iArr2[i7 + 17] = 0;
        iArr2[i7 + 18] = i5;
        iArr2[i7 + 19] = 0;
        iArr2[i7 + 20] = i5;
        iArr2[i7 + 21] = this.f16409;
        int i9 = i7 + 22;
        int i10 = c8760.f26705;
        int i11 = c8760.f26703;
        iArr2[i9] = i10 >= 0 ? m15097(i10) : 0;
        int[] iArr3 = this.f16393;
        int i12 = i7 + 23;
        boolean z2 = c8760.f26702;
        iArr3[i12] = z2 ? c8054.f24832[i11] : 0;
        iArr3[i7 + 24] = z2 ? c8054.f24832[i11 + 1] : 0;
        this.f16388 += 32;
        if (!z && (i6 = c8760.f26705) >= 0) {
            m15108(i6, -1);
        }
        m15050(7, 0, i4, i7, 0);
        return i7;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15053(int i, int i2, boolean z) {
        int[] iArr = this.f16393;
        iArr[i + 17] = i2;
        iArr[i + 13] = !z ? 1 : 0;
        int i3 = this.f16409;
        iArr[i + 21] = i3;
        this.f16402[iArr[i + 4] + 3] = i3;
        this.f16404 = z ? i : iArr[i + 12];
        this.f16395 = iArr[(z ? 3 : 1) + i];
        this.f16400 = iArr[i + 2];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m15107(int i) {
        C8760 c8760M15073 = m15073(i);
        if (c8760M15073.f26705 < 0 && this.f16397.f24831) {
            this.f16390 = true;
            return false;
        }
        EnumC1497 enumC1497 = c8760M15073.f26708;
        if (enumC1497 == EnumC1497.GREEDY) {
            int[] iArr = this.f16393;
            iArr[i + 17] = 1;
            m15077(i, iArr[i + 2], iArr[i + 18]);
            return true;
        }
        if (enumC1497 == EnumC1497.LAZY) {
            m15053(i, 2, false);
            return true;
        }
        if (this.f16393[i + 18] < c8760M15073.f26707) {
            m15053(i, 4, true);
            return true;
        }
        m15053(i, 1, false);
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m15077(int i, int i2, int i3) {
        C8760 c8760M15073 = m15073(i);
        int[] iArr = this.f16393;
        iArr[i + 13] = 1;
        this.f16404 = iArr[i + 12];
        int i4 = c8760M15073.f26705;
        int i5 = c8760M15073.f26707;
        if (i4 < 0 && i3 >= i5) {
            m15053(i, iArr[i + 17], false);
            this.f16400 = i2;
            return;
        }
        int iM15037 = m15037(iArr[i + 16], iArr[i + 3], iArr[i + 1], i2, i3, true);
        if (i3 < i5) {
            m15053(iM15037, 5, true);
        } else {
            m15072(iM15037);
            m15053(iM15037, 9, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15058(int i, boolean z) {
        int i2;
        int i3;
        C8760 c8760M15073 = m15073(i);
        int[] iArr = this.f16393;
        int i4 = i + 17;
        int i5 = iArr[i4];
        int i6 = i + 2;
        int i7 = iArr[i6];
        int i8 = i + 18;
        int i9 = iArr[i8];
        C8054 c8054 = this.f16397;
        switch (i5) {
            case 0:
                if (!z) {
                    m15103(i);
                    return false;
                }
                m15054(c8760M15073, i7, c8054.f24822);
                int[] iArr2 = this.f16393;
                iArr2[i6] = c8054.f24822;
                int i10 = i9 + 1;
                iArr2[i8] = i10;
                if (i10 >= c8760M15073.f26706) {
                    return m15107(i);
                }
                m15053(i, 0, true);
                return true;
            case 1:
            case 9:
            case 13:
                m15103(i);
                return false;
            case 2:
                if (i9 < c8760M15073.f26707) {
                    m15053(i, 3, true);
                    return true;
                }
                m15103(i);
                return false;
            case 3:
                if (!z || i7 == (i2 = c8054.f24822)) {
                    m15103(i);
                    return false;
                }
                m15054(c8760M15073, i7, i2);
                int[] iArr3 = this.f16393;
                iArr3[i6] = c8054.f24822;
                iArr3[i8] = i9 + 1;
                m15053(i, 2, false);
                return true;
            case 4:
                if (z) {
                    m15054(c8760M15073, i7, c8054.f24822);
                    int i11 = c8054.f24822;
                    if (i7 != i11) {
                        int[] iArr4 = this.f16393;
                        iArr4[i6] = i11;
                        int i12 = i9 + 1;
                        iArr4[i8] = i12;
                        if (i12 < c8760M15073.f26707) {
                            m15053(i, 4, true);
                            return true;
                        }
                    }
                }
                m15053(i, 1, false);
                return true;
            case 5:
                if (!z || (i3 = c8054.f24822) == i7 || (c8760M15073.f26705 >= 0 && i3 < i7)) {
                    if (z && c8760M15073.f26705 >= 0) {
                        iArr[i6] = c8054.f24822;
                    }
                    m15072(i);
                    m15053(i, 9, false);
                    return true;
                }
                iArr[i + 19] = i3 - i7;
                return m15071(i);
            case 6:
                if (!z) {
                    return m15109(i);
                }
                int i13 = iArr[i + 19] + i7;
                int i14 = c8054.f24822;
                if (i13 != i14) {
                    iArr[i4] = 7;
                    int i15 = c8760M15073.f26705;
                    if (i15 < 0) {
                        i7 = i14;
                    }
                    if (i15 < 0) {
                        i9++;
                    }
                    m15077(i, i7, i9);
                    return true;
                }
                return m15071(i);
            case 7:
                return m15109(i);
            case 8:
                int i16 = iArr[i + 19];
                int i17 = i7 - i16;
                m15054(c8760M15073, i17 - i16, i17);
                int[] iArr5 = this.f16393;
                iArr5[i6] = i17;
                iArr5[i8] = i9 - 1;
                return m15109(i);
            case 10:
                if (z) {
                    iArr[i6] = c8054.f24822;
                    iArr[i + 20] = i7;
                    m15053(i, 11, false);
                    return true;
                }
                if (c8760M15073.f26708 != EnumC1497.LAZY) {
                    m15053(i, 13, false);
                    return true;
                }
                m15103(i);
                return false;
            case 11:
                if (c8760M15073.f26708 == EnumC1497.GREEDY) {
                    iArr[i6] = iArr[i + 20];
                    m15053(i, 13, false);
                    return true;
                }
                m15103(i);
                return false;
            case 12:
                m15053(i, 10, true);
                return true;
            default:
                throw new IllegalStateException("Invalid quantifier continuation");
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m15071(int i) {
        int[] iArr = this.f16393;
        int i2 = i + 2;
        int i3 = iArr[i2];
        int i4 = iArr[i + 19] + i3;
        C8760 c8760M15073 = m15073(i);
        m15054(c8760M15073, i3, i4);
        int[] iArr2 = this.f16393;
        iArr2[i2] = i4;
        int i5 = i + 18;
        int i6 = iArr2[i5] + 1;
        iArr2[i5] = i6;
        if (i6 >= c8760M15073.f26707) {
            return m15109(i);
        }
        m15053(i, 6, true);
        return true;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m15109(int i) {
        int[] iArr = this.f16393;
        int i2 = iArr[i + 18];
        int i3 = iArr[i + 20];
        if (m15073(i).f26705 >= 0) {
            if (i2 <= i3) {
                m15072(i);
                m15053(i, 9, false);
                return true;
            }
        } else if (i2 < i3) {
            m15103(i);
            return false;
        }
        m15053(i, 8, false);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15054(C8760 c8760, int i, int i2) {
        boolean z = c8760.f26702;
        int i3 = c8760.f26703;
        if (z) {
            C8054 c8054 = this.f16397;
            if (c8054.f24837) {
                c8054.f24823.m43234(i3, i, i2, c8054.f24832);
            }
            int[] iArr = c8054.f24832;
            iArr[i3] = i;
            iArr[i3 + 1] = i2;
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m15072(int i) {
        C8760 c8760M15073 = m15073(i);
        if (c8760M15073.f26702) {
            int i2 = this.f16393[i + 6];
            C8054 c8054 = this.f16397;
            if (i2 >= 0) {
                c8054.f24823.m43233(i2);
            }
            int[] iArr = c8054.f24832;
            int i3 = c8760M15073.f26703;
            int[] iArr2 = this.f16393;
            iArr[i3] = iArr2[i + 23];
            iArr[i3 + 1] = iArr2[i + 24];
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m15103(int i) {
        m15048(i);
        int[] iArr = this.f16393;
        this.f16398 = iArr[i + 4];
        this.f16388 = i;
        this.f16404 = iArr[i + 12];
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m15098() {
        int[] iArr = this.f16393;
        int length = iArr.length;
        int i = this.f16388;
        if (length - i >= 32) {
            return;
        }
        int iM15043 = m15043(iArr.length, ((long) i) + 32);
        long jM15090 = m15090();
        int[] iArr2 = this.f16393;
        if ((((long) (iM15043 - iArr2.length)) * 4) + jM15090 > 33554432) {
            throw new C0292();
        }
        this.f16393 = Arrays.copyOf(iArr2, iM15043);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034 A[RETURN] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15068(boolean z) {
        int i = this.f16404;
        if (i < 0) {
            throw new IllegalStateException("Regex condition returned without a control scope");
        }
        int[] iArr = this.f16393;
        boolean z2 = iArr[i] >= 5;
        int i2 = iArr[(z2 ? 21 : 5) + i];
        C8054 c8054 = this.f16397;
        if (z) {
            if (!c8054.f24837) {
                C9466 c9466 = this.f16401;
                if (c9466.f28786 || c9466.f28775 || c9466.f28781) {
                    if (!m15087(i2)) {
                        return false;
                    }
                }
            } else if (!m15087(i2)) {
                return false;
            }
            if (!this.f16401.f28781) {
                for (int i3 = this.f16409 - 2; i3 >= i2; i3 -= 2) {
                    int[] iArr2 = this.f16408;
                    int i4 = iArr2[i3];
                    if (i4 < 0 && i4 != Integer.MIN_VALUE) {
                        this.f16391[~i4] = iArr2[i3 + 1];
                    }
                }
            }
            this.f16409 = i2;
        } else {
            m15069(i2);
        }
        this.f16388 = i + 32;
        int[] iArr3 = this.f16393;
        int i5 = i + 4;
        this.f16398 = iArr3[i5] + 6;
        this.f16404 = iArr3[i + 12];
        if (z2) {
            return m15058(i, z);
        }
        m15089(i);
        int[] iArr4 = this.f16393;
        int i6 = iArr4[i];
        if (z != (i6 == 0 || i6 == 2 || i6 == 4)) {
            m15048(i);
            this.f16398 = this.f16393[i5];
            this.f16388 = i;
            return false;
        }
        iArr4[i + 13] = 1;
        this.f16395 = iArr4[i + 1];
        this.f16400 = i6 == 4 ? c8054.f24822 : iArr4[i + 2];
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m15095(int i, CharSequence charSequence) {
        int[] iArr = this.f16393;
        int i2 = iArr[i];
        if (i2 >= 5) {
            if (iArr[i + 13] == 0) {
                this.f16404 = i;
                return m15068(false);
            }
            return m15058(i, false);
        }
        if (iArr[i + 13] == 0) {
            this.f16404 = i;
            if (i2 == 2 || i2 == 3) {
                int i3 = i + 10;
                int i4 = iArr[i3];
                int i5 = iArr[i + 11];
                int iM15040 = i4 - ((iArr[i + 14] == 0 || i4 <= i5) ? 1 : m15040(i4, -1, charSequence));
                if (this.f16390) {
                    return false;
                }
                if (iM15040 >= i5) {
                    int[] iArr2 = this.f16393;
                    iArr2[i3] = iM15040;
                    this.f16395 = iArr2[i + 3];
                    this.f16400 = iM15040;
                    return true;
                }
            }
            return m15068(false);
        }
        m15048(i);
        int[] iArr3 = this.f16393;
        this.f16398 = iArr3[i + 4];
        this.f16388 = i;
        this.f16404 = iArr3[i + 12];
        return false;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m15089(int i) {
        int[] iArr = this.f16393;
        int i2 = iArr[i];
        C8054 c8054 = this.f16397;
        if (i2 == 0 || i2 == 1) {
            c8054.f24844 = iArr[i + 7];
        } else if (i2 == 2 || i2 == 3) {
            c8054.f24828 = iArr[i + 8];
            c8054.f24830 = iArr[i + 9];
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15048(int i) {
        int i2;
        int[] iArr = this.f16393;
        if (iArr[i + 13] == 2) {
            return;
        }
        if (iArr[i] >= 5) {
            C8760 c8760M15073 = m15073(i);
            int[] iArr2 = this.f16393;
            if (iArr2[i] == 5 && (i2 = c8760M15073.f26705) >= 0) {
                m15108(i2, iArr2[i + 22]);
            }
            m15072(i);
        } else {
            m15089(i);
        }
        int i3 = this.f16393[i + 6];
        if (i3 >= 0) {
            this.f16397.f24823.m43233(i3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15040(int i, int i2, CharSequence charSequence) {
        if (i2 == 1 && i >= 0 && i < charSequence.length() && !Character.isHighSurrogate(charSequence.charAt(i))) {
            return 1;
        }
        int length = charSequence.length();
        C8054 c8054 = this.f16397;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = i;
            while (i4 < length && i3 < i2) {
                int i5 = i4 + 1;
                i4 = (Character.isHighSurrogate(charSequence.charAt(i4)) && i5 < length && Character.isLowSurrogate(charSequence.charAt(i5))) ? i4 + 2 : i5;
                if (c8054.m21407()) {
                    this.f16390 = true;
                    return i4 - i;
                }
                i3++;
            }
            return i4 - i;
        }
        int i6 = -i2;
        int i7 = i;
        while (i7 > 0 && i3 < i6) {
            int i8 = i7 - 1;
            i7 = (Character.isLowSurrogate(charSequence.charAt(i8)) && i8 > 0 && Character.isHighSurrogate(charSequence.charAt(i7 + (-2)))) ? i7 - 2 : i8;
            if (c8054.m21407()) {
                this.f16390 = true;
                return i - i7;
            }
            i3++;
        }
        return i - i7;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15045(C10502 c10502, CharSequence charSequence, int i, int i2) {
        int i3;
        int i4 = 0;
        do {
            int i5 = c10502.f31501;
            C8054 c8054 = this.f16397;
            if (i4 < i5) {
                if (i >= i2) {
                    c8054.f24842 = true;
                } else {
                    char cCharAt = charSequence.charAt(i);
                    int[] iArr = c10502.f31500;
                    if (cCharAt >= iArr.length) {
                        int i6 = 0;
                        while (true) {
                            InterfaceC10795[] interfaceC10795Arr = c10502.f31503;
                            if (i6 >= interfaceC10795Arr.length) {
                                i3 = 0;
                                break;
                            }
                            if (interfaceC10795Arr[i6].mo2465(cCharAt)) {
                                i3 = c10502.f31504[i6];
                                break;
                            }
                            if (c8054.m21407()) {
                                this.f16390 = true;
                                return -1;
                            }
                            i6++;
                        }
                    } else {
                        i3 = iArr[cCharAt];
                    }
                    if (i3 != 0) {
                        m15099(i3, i);
                        i++;
                        m15099(i3 + 1, i);
                        i4++;
                    }
                }
            }
            if (i4 >= c10502.f31502 && (c8054.f24820 != 1 || i == i2)) {
                return i;
            }
        } while (!m15086());
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15044(C3821 c3821, CharSequence charSequence, int i, int i2) {
        int i3;
        int i4 = 0;
        do {
            int i5 = c3821.f12222;
            InterfaceC10795 interfaceC10795 = c3821.f12230;
            boolean z = c3821.f12229;
            boolean z2 = c3821.f12226;
            C8054 c8054 = this.f16397;
            if (i4 < i5) {
                if (i >= i2) {
                    c8054.f24842 = true;
                } else {
                    int iCharAt = z2 ? charSequence.charAt(i) : Character.codePointAt(charSequence, i);
                    int iCharCount = (z2 ? 1 : Character.charCount(iCharAt)) + i;
                    if (iCharCount > i2) {
                        c8054.f24842 = true;
                    }
                    if (iCharCount <= i2 && c3821.f12231.mo2465(iCharAt)) {
                        i = iCharCount;
                    } else if (iCharAt == c3821.f12227) {
                        int i6 = i + 1;
                        if (i6 >= i2) {
                            c8054.f24842 = true;
                        } else {
                            int iCharAt2 = z ? charSequence.charAt(i6) : Character.codePointAt(charSequence, i6);
                            int iCharCount2 = i6 + (z ? 1 : Character.charCount(iCharAt2));
                            if (iCharCount2 > i2) {
                                c8054.f24842 = true;
                            } else if (c3821.f12228.mo2465(iCharAt2)) {
                                i = iCharCount2;
                            }
                        }
                    }
                    i4++;
                }
            }
            if (i4 < c3821.f12225) {
                break;
            }
            if (interfaceC10795 == null) {
                if (i >= i2) {
                    c8054.f24842 = true;
                    return -1;
                }
                if (c3821.f12224.mo2465(charSequence.charAt(i))) {
                    break;
                }
                i3 = i + 1;
                if (c8054.f24820 == 1) {
                }
                return i3;
            }
            int i7 = i;
            while (i7 < i2 && interfaceC10795.mo2465(charSequence.charAt(i7))) {
                i7++;
                if (c8054.m21407()) {
                    this.f16390 = true;
                    return -1;
                }
            }
            if (i7 >= i2) {
                c8054.f24842 = true;
            }
            if (i7 - i < c3821.f12223) {
                break;
            }
            i = i7;
            if (i >= i2) {
                c8054.f24842 = true;
                return -1;
            }
            if (c3821.f12224.mo2465(charSequence.charAt(i))) {
                break;
            }
            i3 = i + 1;
            if (c8054.f24820 == 1 || i3 == i2) {
                return i3;
            }
        } while (!m15086());
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15046(C13323 c13323, CharSequence charSequence, int i, int i2) {
        char cCharAt;
        C3446 c3446 = c13323.f39878;
        int[][] iArr = c13323.f39879;
        C8054 c8054 = this.f16397;
        if (C21460.m48609(c3446, c8054, i, charSequence)) {
            int[] iArr2 = (i >= i2 || (cCharAt = charSequence.charAt(i)) >= 128) ? null : c13323.f39877[cCharAt];
            int length = iArr2 == null ? iArr.length : iArr2.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (c8054.m21407()) {
                    this.f16390 = true;
                    return -1;
                }
                int iM15042 = m15042(i, i2, charSequence, iArr[iArr2 == null ? i3 : iArr2[i3]]);
                if (this.f16390) {
                    break;
                }
                if (iM15042 >= 0 && C21460.m48609(c13323.f39876, c8054, iM15042, charSequence) && (c8054.f24820 != 1 || iM15042 == i2)) {
                    return iM15042;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15042(int i, int i2, CharSequence charSequence, Object obj) {
        boolean z = obj instanceof InterfaceC10795;
        C8054 c8054 = this.f16397;
        if (z) {
            InterfaceC10795 interfaceC10795 = (InterfaceC10795) obj;
            if (i >= i2) {
                c8054.f24842 = true;
                return -1;
            }
            if (interfaceC10795.mo2465(charSequence.charAt(i))) {
                return i + 1;
            }
            return -1;
        }
        int[] iArr = (int[]) obj;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = i + i3;
            if (i4 >= i2) {
                c8054.f24842 = true;
                return -1;
            }
            if (iArr[i3] != charSequence.charAt(i4)) {
                return -1;
            }
            if (c8054.m21407()) {
                this.f16390 = true;
                return -1;
            }
        }
        return i + iArr.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15050(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.f16402;
        int length = iArr.length;
        int i6 = this.f16398;
        if (length - i6 < 6) {
            int iM15043 = m15043(iArr.length, ((long) i6) + 6);
            m15093(this.f16391.length, iM15043, this.f16408.length);
            this.f16402 = Arrays.copyOf(this.f16402, iM15043);
        }
        int i7 = this.f16398;
        int[] iArr2 = this.f16402;
        iArr2[i7] = i;
        iArr2[i7 + 1] = i2;
        iArr2[i7 + 2] = i3;
        iArr2[i7 + 3] = this.f16409;
        iArr2[i7 + 4] = i4;
        iArr2[i7 + 5] = i5;
        this.f16398 = i7 + 6;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m15097(int i) {
        return this.f16401.f28781 ? this.f16397.f24826[i] : this.f16391[i];
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m15108(int i, int i2) {
        if (this.f16401.f28781) {
            this.f16397.f24826[i] = i2;
        } else {
            this.f16391[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m15070(int i) {
        if ((i & 1073741824) != 0) {
            throw new C0292();
        }
        m15104(~(1073741824 | i), m15097(i));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m15085(int i, int i2) {
        if (this.f16401.f28781 || this.f16398 != 0) {
            m15104(~i, m15097(i));
        }
        m15108(i, i2);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m15099(int i, int i2) {
        C8054 c8054 = this.f16397;
        m15104(i, c8054.f24832[i]);
        c8054.f24832[i] = i2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m15104(int i, int i2) {
        int[] iArr = this.f16408;
        int length = iArr.length;
        int i3 = this.f16409;
        if (length - i3 < 2) {
            int iM15043 = m15043(iArr.length, ((long) i3) + 2);
            m15093(this.f16391.length, this.f16402.length, iM15043);
            this.f16408 = Arrays.copyOf(this.f16408, iM15043);
        }
        int[] iArr2 = this.f16408;
        int i4 = this.f16409;
        int i5 = i4 + 1;
        this.f16409 = i5;
        iArr2[i4] = i;
        this.f16409 = i4 + 2;
        iArr2[i5] = i2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m15069(int i) {
        while (true) {
            int i2 = this.f16409;
            if (i2 <= i) {
                return;
            }
            int[] iArr = this.f16408;
            int i3 = i2 - 1;
            this.f16409 = i3;
            int i4 = iArr[i3];
            int i5 = i2 - 2;
            this.f16409 = i5;
            int i6 = iArr[i5];
            if (i6 != Integer.MIN_VALUE && i6 != -2147483647) {
                if (i6 < 0) {
                    m15108((~i6) & (-1073741825), i4);
                } else {
                    this.f16397.f24832[i6] = i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m15087(int i) {
        int iM15036 = this.f16388 - 32;
        int i2 = this.f16409 - 2;
        boolean z = true;
        while (i2 >= i) {
            iM15036 = m15036(iM15036, i2 + 2);
            if (!this.f16390) {
                int i3 = this.f16408[i2];
                if (i3 != -2147483647) {
                    boolean z2 = (i3 >= 0 || i3 == Integer.MIN_VALUE || ((~i3) & 1073741824) == 0) ? false : true;
                    C8054 c8054 = this.f16397;
                    if (z && i3 != Integer.MIN_VALUE && !z2) {
                        if (m15086()) {
                        }
                    } else if (c8054.m21407()) {
                        this.f16390 = true;
                        return false;
                    }
                    if (z2) {
                        m15108((~i3) & (-1073741825), this.f16408[i2 + 1]);
                        this.f16408[i2] = -2147483647;
                    } else if (this.f16401.f28781 && i3 < 0 && i3 != Integer.MIN_VALUE) {
                        this.f16408[i2] = -2147483647;
                    } else if (i3 == Integer.MIN_VALUE) {
                        int[] iArr = c8054.f24832;
                        int i4 = this.f16408[i2 + 1];
                        iArr[0] = i4;
                        c8054.f24855 = i4;
                        iArr[1] = c8054.f24822;
                    } else if (i3 > 1 && (i3 & 1) != 0) {
                        int[] iArr2 = this.f16408;
                        int i5 = iArr2[i2 + 1];
                        int i6 = iArr2[i2 - 1];
                        if (c8054.f24837 && i6 != -1 && i5 != -1) {
                            c8054.f24823.f58949.add(new C2992(i3 / 2, i6, i5));
                        }
                        i2 -= 2;
                    }
                    z = false;
                }
                i2 -= 2;
            }
            return false;
        }
        m15036(iM15036, i);
        return !this.f16390;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15036(int i, int i2) {
        while (i >= 0) {
            int[] iArr = this.f16393;
            int i3 = i + 13;
            int i4 = iArr[i3];
            if (i4 == 0 || iArr[i + 5] < i2) {
                break;
            }
            if (i4 != 2 && iArr[i] == 6 && iArr[i + 17] == 8) {
                int i5 = iArr[i + 2];
                m15054(m15073(i), i5 - this.f16393[i + 19], i5);
            }
            this.f16393[i3] = 2;
            i -= 32;
            if (this.f16397.m21407()) {
                this.f16390 = true;
                break;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15110() {
        if (this.f16410 != 0) {
            this.f16394++;
            Arrays.fill(this.f16407, 0L);
            this.f16410 = 0;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m15080(int i, int i2) {
        if (this.f16401.f28781) {
            this.f16397.f24819[i].getClass();
        }
        long[] jArr = this.f16407;
        if (jArr.length == 0) {
            return false;
        }
        long j = (((long) i2) + 1) | (((long) i) << 32);
        return !this.f16390 && this.f16394 == this.f16394 && this.f16407[m15047(jArr, j)] == j;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m15092(int i, int i2) {
        boolean z = this.f16401.f28781;
        C8054 c8054 = this.f16397;
        if (z) {
            c8054.f24819[i].getClass();
        }
        int i3 = this.f16394;
        long j = (((long) i2) + 1) | (((long) i) << 32);
        long[] jArr = this.f16407;
        if (jArr.length != 0) {
            int iM15047 = m15047(jArr, j);
            if (this.f16390 || i3 != this.f16394 || this.f16407[iM15047] == j) {
                return;
            }
        }
        int i4 = this.f16410;
        long[] jArr2 = this.f16407;
        if (i4 >= jArr2.length / 2) {
            int iM15043 = m15043(jArr2.length, ((long) jArr2.length) + 1);
            if (((iM15043 - 1) & iM15043) == 0) {
                if ((((long) (iM15043 - this.f16407.length)) * 8) + m15090() <= 33554432) {
                    long[] jArr3 = new long[iM15043];
                    for (int i5 = 0; i5 < this.f16407.length; i5++) {
                        if (c8054.m21407()) {
                            this.f16390 = true;
                            return;
                        }
                        if (i3 != this.f16394) {
                            return;
                        }
                        long j2 = this.f16407[i5];
                        if (j2 != 0) {
                            int iM15048 = m15047(jArr3, j2);
                            if (this.f16390 || i3 != this.f16394) {
                                return;
                            } else {
                                jArr3[iM15048] = j2;
                            }
                        }
                    }
                    if (i3 != this.f16394) {
                        return;
                    } else {
                        this.f16407 = jArr3;
                    }
                }
            }
            throw new C0292();
        }
        int iM15049 = m15047(this.f16407, j);
        if (this.f16390 || i3 != this.f16394) {
            return;
        }
        this.f16407[iM15049] = j;
        this.f16410++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15047(long[] jArr, long j) {
        long j2 = ((j >>> 33) ^ j) * (-49064778989728563L);
        int length = jArr.length - 1;
        int i = ((int) (j2 ^ (j2 >>> 33))) & length;
        while (true) {
            long j3 = jArr[i];
            if (j3 == 0 || j3 == j) {
                break;
            }
            if (this.f16397.m21407()) {
                this.f16390 = true;
                return 0;
            }
            i = (i + 1) & length;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15062(C10502 c10502, int i, CharSequence charSequence) {
        C8054 c8054 = this.f16397;
        if (c8054.m21407()) {
            this.f16390 = true;
            return false;
        }
        int iM15045 = m15045(c10502, charSequence, i, c8054.f24844);
        if (this.f16390 || iM15045 < 0) {
            m15069(0);
            return false;
        }
        int[] iArr = c8054.f24832;
        iArr[0] = c8054.f24855;
        c8054.m21416(iM15045);
        iArr[1] = iM15045;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15064(C13323 c13323, int i, CharSequence charSequence) {
        C8054 c8054 = this.f16397;
        if (c8054.m21407()) {
            this.f16390 = true;
            return false;
        }
        int iM15046 = m15046(c13323, charSequence, i, c8054.f24844);
        if (this.f16390 || iM15046 < 0) {
            return false;
        }
        int[] iArr = c8054.f24832;
        iArr[0] = c8054.f24855;
        c8054.m21416(iM15046);
        iArr[1] = iM15046;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15066(C20755 c20755, int i, CharSequence charSequence) {
        char cCharAt;
        C8054 c8054 = this.f16397;
        if (c8054.m21407()) {
            this.f16390 = true;
            return false;
        }
        int i2 = c8054.f24844;
        C6643 c6643 = c20755.f67235;
        int[] iArr = c6643.f20614;
        if (i < i2 && (cCharAt = charSequence.charAt(i)) < 128) {
            int i3 = c6643.f20612[cCharAt];
            return i3 != 0 && m15081(iArr[Integer.numberOfTrailingZeros(i3)], i, charSequence);
        }
        m15050(3, c20755.f67236, i, 1, 0);
        return m15081(iArr[0], i, charSequence);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m15074(int i, int i2, int i3, InterfaceC10795 interfaceC10795, CharSequence charSequence) {
        while (i2 < i3) {
            C8054 c8054 = this.f16397;
            if (!c8054.m21407()) {
                c8054.m21413();
                String strNormalize = Normalizer.normalize(TextUtils.substring(charSequence, i, i3), Normalizer.Form.NFC);
                if (!c8054.m21411()) {
                    Thread threadCurrentThread = this.f16399;
                    if (threadCurrentThread == null) {
                        threadCurrentThread = Thread.currentThread();
                        this.f16399 = threadCurrentThread;
                    }
                    if (!c8054.m21397(threadCurrentThread)) {
                        if (strNormalize.codePointCount(0, strNormalize.length()) == 1 && interfaceC10795.mo2465(strNormalize.codePointAt(0))) {
                            return i3;
                        }
                        i3 -= Character.charCount(Character.codePointBefore(charSequence, i3));
                    }
                }
                this.f16390 = true;
                break;
            }
            this.f16390 = true;
            return -1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m15086() {
        C8054 c8054 = this.f16397;
        if (!c8054.m21407()) {
            if (c8054.f24827) {
                return false;
            }
            Thread threadCurrentThread = this.f16399;
            if (threadCurrentThread == null) {
                threadCurrentThread = Thread.currentThread();
                this.f16399 = threadCurrentThread;
            }
            if (!c8054.m21397(threadCurrentThread)) {
                return false;
            }
        }
        this.f16390 = true;
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m15093(int i, int i2, int i3) {
        if (((((long) this.f16405.length) + ((long) this.f16393.length)) * 4) + ((((long) this.f16392.length) + ((long) this.f16407.length)) * 8) + ((((long) i) + ((long) i2) + ((long) i3)) * 4) > 33554432) {
            throw new C0292();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m15043(int i, long j) {
        if (j > 2147483639) {
            throw new C0292();
        }
        return (int) Math.min(2147483639L, Math.max(j, Math.max(64L, ((long) i) * 2)));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private long m15090() {
        return ((((long) this.f16392.length) + ((long) this.f16407.length)) * 8) + ((((long) this.f16391.length) + ((long) this.f16402.length) + ((long) this.f16408.length) + ((long) this.f16405.length) + ((long) this.f16393.length)) * 4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15067(C23576 c23576, C8054 c8054, int i, CharSequence charSequence) {
        int i2 = c23576.f76465;
        Object obj = c23576.f76467;
        if (i2 != 16) {
            if (i2 == 1) {
                if (i >= c8054.f24844) {
                    c8054.f24842 = true;
                    return true;
                }
                return !((InterfaceC10795) obj).mo2465(charSequence.charAt(i));
            }
            C23369 c23369 = (C23369) obj;
            int i3 = c23369.f75067 + i;
            if (i3 >= i && i3 < c8054.f24844) {
                char cCharAt = charSequence.charAt(i3);
                if (!c23369.f75066 ? c23369.f75068.mo2465(cCharAt) : cCharAt == c23369.f75065) {
                }
            }
            return false;
        }
        boolean z = c8054.f24842;
        boolean z2 = c8054.f24833;
        if (C21460.m48607(c23576.f76464, c23576.f76466, c8054, i, charSequence)) {
            c8054.f24842 = z;
            c8054.f24833 = z2;
            return false;
        }
        return true;
    }
}
