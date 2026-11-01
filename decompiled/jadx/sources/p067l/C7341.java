package p067l;

import android.text.TextUtils;
import java.text.Normalizer;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6W3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7341 {

    /* JADX INFO: renamed from: ۗ */
    public static final C24158 f19225;

    /* JADX INFO: renamed from: ֡ */
    public int f19228;

    /* JADX INFO: renamed from: ֨ */
    public final C16727 f19229 = new C16727();

    /* JADX INFO: renamed from: ֫ */
    public boolean f19230;

    /* JADX INFO: renamed from: ۖ */
    public int[] f19231;

    /* JADX INFO: renamed from: ۘ */
    public long[] f19232;

    /* JADX INFO: renamed from: ۚ */
    public int[] f19233;

    /* JADX INFO: renamed from: ۜ */
    public int f19234;

    /* JADX INFO: renamed from: ۠ */
    public int f19235;

    /* JADX INFO: renamed from: ۡ */
    public C3771 f19236;

    /* JADX INFO: renamed from: ۢ */
    public final C10023 f19237;

    /* JADX INFO: renamed from: ۧ */
    public int f19238;

    /* JADX INFO: renamed from: ܳ */
    public Thread f19239;

    /* JADX INFO: renamed from: ܶ */
    public int f19240;

    /* JADX INFO: renamed from: ܺ */
    public C11365 f19241;

    /* JADX INFO: renamed from: ܽ */
    public int[] f19242;

    /* JADX INFO: renamed from: ܿ */
    public int f19243;

    /* JADX INFO: renamed from: ᩳ */
    public int f19244;

    /* JADX INFO: renamed from: ᩴ */
    public int[] f19245;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f19246;

    /* JADX INFO: renamed from: ᩷ */
    public long[] f19247;

    /* JADX INFO: renamed from: ᩸ */
    public int[] f19248;

    /* JADX INFO: renamed from: ᩹ */
    public int f19249;

    /* JADX INFO: renamed from: ᩻ */
    public int f19250;

    /* JADX INFO: renamed from: ᩶ */
    public static final int[] f19227 = new int[0];

    /* JADX INFO: renamed from: ۙ */
    public static final long[] f19226 = new long[0];

    static {
        C20753 c20753 = new C20753();
        Arrays.fill(new int[32], -1);
        Arrays.fill(new int[9], -1);
        f19225 = c20753;
    }

    public C7341(C10023 c10023) {
        int[] iArr = f19227;
        this.f19231 = iArr;
        this.f19242 = iArr;
        this.f19248 = iArr;
        long[] jArr = f19226;
        this.f19232 = jArr;
        this.f19245 = iArr;
        this.f19247 = jArr;
        this.f19233 = iArr;
        this.f19244 = -1;
        this.f19237 = c10023;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m16986() {
        if (this.f19246) {
            throw new IllegalStateException("Regex matcher is already executing");
        }
        C3771 c3771 = this.f19237.f27758;
        if (this.f19236 != c3771) {
            this.f19241 = c3771.m7347();
            this.f19236 = c3771;
            this.f19231 = f19227;
        }
        this.f19246 = true;
        this.f19230 = false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0068 A[Catch: all -> 0x008c, ֡۠ܽ -> 0x008f, TRY_LEAVE, TryCatch #11 {֡۠ܽ -> 0x008f, all -> 0x008c, blocks: (B:21:0x0035, B:32:0x0056, B:34:0x005a, B:36:0x0060, B:38:0x0064, B:40:0x0068, B:22:0x003c, B:30:0x0050), top: B:96:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m17021(int i, CharSequence charSequence) throws Throwable {
        boolean zM17015;
        boolean zM17010;
        C10023 c10023 = this.f19237;
        int i2 = c10023.f27741;
        int i3 = c10023.f27757;
        int i4 = c10023.f27743;
        m16986();
        boolean z = true;
        try {
            try {
                zM17015 = m17015();
                try {
                    C24775 c24775 = this.f19241.f31720;
                    if (c24775 != null && m16977(c24775, c10023, i, charSequence)) {
                        m16962(i2, i3, i4, zM17015);
                        return false;
                    }
                    C11365 c11365 = this.f19241;
                    int i5 = c11365.f31726;
                    boolean z2 = c11365.f31725;
                    if (i5 == 1) {
                        boolean zM16974 = m16974(c11365.f31727, i, charSequence);
                        m16962(i2, i3, i4, zM17015);
                        return zM16974;
                    }
                    if (i5 == 2) {
                        boolean zM16967 = m16967(i, c11365.f31728, charSequence);
                        m16962(i2, i3, i4, zM17015);
                        return zM16967;
                    }
                    try {
                        if (i5 == 3) {
                            zM17010 = m17010(i, charSequence);
                        } else if (i5 != 4) {
                            zM17010 = i5 != 5 ? m16991(c11365.f31736, i, charSequence) : m17016(i, charSequence);
                        } else {
                            try {
                                zM17010 = m16972(c11365.f31732, i, charSequence);
                                z2 = true;
                            } catch (C2646 e) {
                                e = e;
                                z = true;
                                try {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    zM17015 = true;
                                    if (z) {
                                        try {
                                            m16988(false);
                                        } finally {
                                            m16962(i2, i3, i4, zM17015);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (z) {
                                    m16988(false);
                                }
                                throw th;
                            }
                        }
                        if (zM17010) {
                            if (!c10023.f27750) {
                                C11365 c11366 = this.f19241;
                                if (c11366.f31735 || c11366.f31724 || c11366.f31730) {
                                    if (!m16997(0)) {
                                        if (z2) {
                                            try {
                                                m16988(false);
                                            } finally {
                                                m16962(i2, i3, i4, zM17015);
                                            }
                                        }
                                        return false;
                                    }
                                }
                            } else if (!m16997(0)) {
                                if (z2) {
                                    m16988(false);
                                }
                                return false;
                            }
                        }
                        if (z2) {
                            try {
                                m16988(zM17010);
                            } finally {
                                m16962(i2, i3, i4, zM17015);
                            }
                        }
                        return zM17010;
                    } catch (C2646 e2) {
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
                zM17015 = false;
            }
        } catch (C2646 e3) {
            e = e3;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m17022(int i, CharSequence charSequence) throws Throwable {
        boolean zM17015;
        C10023 c10023 = this.f19237;
        C3771 c3771 = c10023.f27758;
        if (c3771.f8060 == c3771.f8069) {
            return m17021(i, charSequence);
        }
        int i2 = c10023.f27741;
        int i3 = c10023.f27757;
        int i4 = c10023.f27743;
        m16986();
        try {
            try {
                zM17015 = m17015();
                try {
                    C7933 c7933 = this.f19236.f8060;
                    C11365 c11365 = this.f19241;
                    C4659 c4659 = c11365.f31734;
                    if (c4659 != null) {
                        boolean zM16969 = m16969(c4659, i, charSequence);
                        m16962(i2, i3, i4, zM17015);
                        return zM16969;
                    }
                    C17852 c17852 = c11365.f31728;
                    if (c17852 == null) {
                        boolean zM16992 = m16992(c7933, i, charSequence);
                        m16962(i2, i3, i4, zM17015);
                        return zM16992;
                    }
                    if (c17852.f53272 && c7933.getClass() == C2449.class) {
                        boolean zM16998 = m16998(i, this.f19241.f31728, charSequence);
                        m16962(i2, i3, i4, zM17015);
                        return zM16998;
                    }
                    boolean zM16970 = m16970(c7933, i, charSequence);
                    m16962(i2, i3, i4, zM17015);
                    return zM16970;
                } catch (Throwable th) {
                    th = th;
                    m16962(i2, i3, i4, zM17015);
                    throw th;
                }
            } catch (C2646 e) {
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    zM17015 = true;
                    m16962(i2, i3, i4, zM17015);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            zM17015 = false;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m17015() {
        int length = this.f19231.length;
        int i = this.f19241.f31721;
        if (length >= i) {
            return false;
        }
        m17003(i, this.f19242.length, this.f19248.length);
        this.f19231 = new int[this.f19241.f31721];
        return m17000() > 65536;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16962(int i, int i2, int i3, boolean z) {
        C10023 c10023 = this.f19237;
        c10023.f27741 = i;
        c10023.f27757 = i2;
        c10023.f27743 = i3;
        this.f19239 = null;
        this.f19246 = false;
        if (z) {
            int[] iArr = f19227;
            this.f19233 = iArr;
            this.f19245 = iArr;
            this.f19248 = iArr;
            this.f19242 = iArr;
            this.f19231 = iArr;
            long[] jArr = f19226;
            this.f19232 = jArr;
            this.f19247 = jArr;
            this.f19250 = 0;
            this.f19228 = 0;
            this.f19244 = -1;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m17004(int i, int i2, CharSequence charSequence) {
        C11365 c11365 = this.f19241;
        int i3 = c11365.f31726;
        if (i3 == 1) {
            return m16974(c11365.f31727, i2, charSequence);
        }
        if (i3 == 3) {
            return m17010(i2, charSequence);
        }
        if (i3 == 4) {
            return m16972(c11365.f31732, i2, charSequence);
        }
        return m16991(i, i2, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0065 A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #0 {all -> 0x0104, blocks: (B:14:0x0032, B:16:0x0036, B:17:0x003b, B:20:0x0043, B:23:0x0049, B:25:0x0053, B:27:0x0057, B:29:0x005d, B:31:0x0061, B:33:0x0065, B:39:0x0073, B:45:0x008a, B:47:0x0090, B:51:0x0098, B:54:0x00a7, B:56:0x00ab, B:58:0x00b1, B:60:0x00b5, B:66:0x00c3, B:62:0x00b9, B:69:0x00cd, B:77:0x00dc, B:79:0x00e6, B:81:0x00ec, B:83:0x00f6, B:85:0x00fb, B:52:0x009d, B:86:0x00fe, B:42:0x0083), top: B:92:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9 A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #0 {all -> 0x0104, blocks: (B:14:0x0032, B:16:0x0036, B:17:0x003b, B:20:0x0043, B:23:0x0049, B:25:0x0053, B:27:0x0057, B:29:0x005d, B:31:0x0061, B:33:0x0065, B:39:0x0073, B:45:0x008a, B:47:0x0090, B:51:0x0098, B:54:0x00a7, B:56:0x00ab, B:58:0x00b1, B:60:0x00b5, B:66:0x00c3, B:62:0x00b9, B:69:0x00cd, B:77:0x00dc, B:79:0x00e6, B:81:0x00ec, B:83:0x00f6, B:85:0x00fb, B:52:0x009d, B:86:0x00fe, B:42:0x0083), top: B:92:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX INFO: renamed from: ۧ */
    private boolean m16992(C7933 c7933, int i, CharSequence charSequence) {
        C14361 c14361 = this.f19241.f31719;
        if (!(c7933 instanceof C2449) && c14361 == null && c7933.getClass() != C7124.class && c7933.getClass() != C19411.class) {
            throw new UnsupportedOperationException("Regex program does not support search root: ".concat(c7933.getClass().getName()));
        }
        try {
            if (c14361 != null) {
                boolean zM16993 = c14361.f41055 ? m16993(c14361, i, charSequence) : m16973(c14361, i, charSequence);
                m16988(zM16993);
                return zM16993;
            }
            boolean z = c7933 instanceof C2449;
            C10023 c10023 = this.f19237;
            if (!z) {
                boolean zM17004 = m17004(this.f19241.f31733, i, charSequence);
                if (zM17004) {
                    if (!c10023.f27750) {
                        C11365 c11365 = this.f19241;
                        if (c11365.f31735 || c11365.f31724 || c11365.f31730) {
                            if (!m16997(0)) {
                                m16988(false);
                                return false;
                            }
                        }
                    } else if (!m16997(0)) {
                        m16988(false);
                        return false;
                    }
                }
                m16988(zM17004);
                return zM17004;
            }
            int i2 = c10023.f27757 - ((C2449) c7933).f3793;
            boolean z2 = c7933 instanceof C23238;
            C22094 c22094 = c10023.f27750 ? null : this.f19241.f31722;
            while (i <= i2) {
                if (c10023.m23374()) {
                    this.f19230 = true;
                    m16988(false);
                    return false;
                }
                if (c22094 != null ? m16976(c22094, i, charSequence) : m17004(this.f19241.f31733, i, charSequence)) {
                    if (!c10023.f27750) {
                        C11365 c11366 = this.f19241;
                        if (c11366.f31735 || c11366.f31724 || c11366.f31730) {
                            if (!m16997(0)) {
                                m16988(false);
                                return false;
                            }
                        }
                    } else if (!m16997(0)) {
                        m16988(false);
                        return false;
                    }
                    c10023.f27768 = i;
                    c10023.f27745[0] = i;
                    m16988(true);
                    return true;
                }
                if (this.f19230) {
                    m16988(false);
                    return false;
                }
                if (!z2 || i == i2) {
                    i++;
                } else {
                    int i3 = i + 1;
                    i = (Character.isHighSurrogate(charSequence.charAt(i)) && i3 < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i3))) ? i + 2 : i3;
                }
            }
            c10023.f27755 = true;
            m16988(false);
            return false;
        } catch (Throwable th) {
            m16988(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m16988(boolean z) {
        if (!z) {
            m16979(0);
            int i = this.f19228;
            while (true) {
                i -= 32;
                if (i < 0) {
                    break;
                } else {
                    m16958(i);
                }
            }
            this.f19228 = 0;
            this.f19244 = -1;
        }
        this.f19249 = 0;
        this.f19238 = 0;
        this.f19228 = 0;
        this.f19244 = -1;
        if (m17000() > 65536) {
            int[] iArr = f19227;
            this.f19233 = iArr;
            this.f19245 = iArr;
            this.f19248 = iArr;
            this.f19242 = iArr;
            this.f19231 = iArr;
            long[] jArr = f19226;
            this.f19232 = jArr;
            this.f19247 = jArr;
            this.f19250 = 0;
            this.f19228 = 0;
            this.f19244 = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0092 A[PHI: r13 r14
      0x0092: PHI (r13v6 int) = (r13v2 int), (r13v7 int), (r13v7 int) binds: [B:33:0x0081, B:35:0x0088, B:37:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r14v5 int) = (r14v1 int), (r14v6 int), (r14v6 int) binds: [B:33:0x0081, B:35:0x0088, B:37:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    private boolean m16973(C14361 c14361, int i, CharSequence charSequence) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int iIndexOf;
        int[] iArr = c14361.f41058;
        int[] iArr2 = c14361.f41056;
        int length = iArr.length;
        C10023 c10023 = this.f19237;
        int i5 = c10023.f27757 - length;
        int i6 = length - 1;
        char c = (char) iArr[i6];
        boolean z2 = charSequence instanceof InterfaceC24235;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        int iMax = i;
        while (iMax <= i5) {
            if (c10023.m23374()) {
                this.f19230 = true;
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
                        c10023.m23380();
                        int i11 = c10023.f27757;
                        int i12 = i11 - 1;
                        i3 = i6;
                        if (!(charSequence instanceof InterfaceC24235)) {
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
                            iIndexOf = ((InterfaceC24235) charSequence).indexOf(c, i9, i11);
                        }
                        if (c10023.m23378()) {
                            this.f19230 = true;
                            return false;
                        }
                        if (iIndexOf < 0) {
                            c10023.f27755 = true;
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
                    c10023.f27768 = iMax;
                    if (m16991(c14361.f41057, iMax + length, charSequence)) {
                        return m16989(iMax);
                    }
                    if (!this.f19230) {
                        iMax++;
                        break;
                    }
                    return z;
                }
                if (c10023.m23374()) {
                    this.f19230 = true;
                    return z;
                }
                char cCharAt2 = charSequence.charAt(iMax + i4);
                if (cCharAt2 != iArr[i4]) {
                    iMax += Math.max((i4 + 1) - iArr2[cCharAt2 & 127], c14361.f41054[i4]);
                    break;
                }
                i4--;
            }
            z3 = false;
            i5 = i2;
            i6 = i3;
        }
        c10023.f27755 = true;
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m16993(C14361 c14361, int i, CharSequence charSequence) {
        C10023 c10023 = this.f19237;
        int i2 = c10023.f27757 - c14361.f41053;
        int[] iArr = c14361.f41058;
        while (i <= i2) {
            if (!c10023.m23374()) {
                int iM16950 = m16950(i, iArr.length, charSequence);
                if (!this.f19230) {
                    int length = iArr.length - 1;
                    while (true) {
                        if (iM16950 <= 0) {
                            c10023.f27768 = i;
                            if (m16991(c14361.f41057, c14361.f41053 + i, charSequence)) {
                                return m16989(i);
                            }
                            if (!this.f19230) {
                                i += m16950(i, 1, charSequence);
                                if (!this.f19230) {
                                    break;
                                }
                                return false;
                            }
                            return false;
                        }
                        if (c10023.m23374()) {
                            this.f19230 = true;
                            return false;
                        }
                        int iCodePointBefore = Character.codePointBefore(charSequence, i + iM16950);
                        if (iCodePointBefore != iArr[length]) {
                            i += m16950(i, Math.max((length + 1) - c14361.f41056[iCodePointBefore & 127], c14361.f41054[length]), charSequence);
                            if (!this.f19230) {
                                break;
                            }
                            return false;
                        }
                        iM16950 -= Character.charCount(iCodePointBefore);
                        length--;
                    }
                } else {
                    return false;
                }
            } else {
                this.f19230 = true;
                return false;
            }
        }
        c10023.f27755 = true;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x001b A[RETURN] */
    /* JADX INFO: renamed from: ۧ */
    private boolean m16989(int i) {
        C10023 c10023 = this.f19237;
        if (!c10023.f27750) {
            C11365 c11365 = this.f19241;
            if (c11365.f31735 || c11365.f31724 || c11365.f31730) {
                if (!m16997(0)) {
                    return false;
                }
            }
        } else if (!m16997(0)) {
            return false;
        }
        int[] iArr = c10023.f27745;
        iArr[0] = i;
        c10023.f27768 = i;
        iArr[1] = c10023.f27735;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m16970(C7933 c7933, int i, CharSequence charSequence) {
        C17852 c17852 = this.f19241.f31728;
        if (!(c7933 instanceof C2449)) {
            if (c7933.getClass() != C7124.class) {
                throw new UnsupportedOperationException("Regex program does not support search root: ".concat(c7933.getClass().getName()));
            }
            return m16967(i, c17852, charSequence);
        }
        C10023 c10023 = this.f19237;
        int i2 = c10023.f27757 - ((C2449) c7933).f3793;
        boolean z = c7933 instanceof C23238;
        while (i <= i2) {
            if (c10023.m23374()) {
                this.f19230 = true;
                return false;
            }
            this.f19243 = i;
            if ((i >= c10023.f27757 || c17852.m40533(charSequence.charAt(i))) && m16967(i, c17852, charSequence)) {
                c10023.f27745[0] = i;
                c10023.f27768 = i;
                return true;
            }
            if (this.f19230) {
                return false;
            }
            int i3 = this.f19243;
            if (i3 > i && (!c17852.f53267 || z || c17852.f53274)) {
                i = i3;
            }
            if (!z || i >= i2) {
                i++;
            } else {
                int i4 = i + 1;
                i = (Character.isHighSurrogate(charSequence.charAt(i)) && i4 < charSequence.length() && Character.isLowSurrogate(charSequence.charAt(i4))) ? i + 2 : i4;
            }
        }
        c10023.f27755 = true;
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m16969(C4659 c4659, int i, CharSequence charSequence) {
        C16727 c16727 = this.f19229;
        try {
            c16727.m37968(c4659, this.f19237, charSequence, i);
            while (c16727.m37969()) {
                if (m16991(c16727.f49333, c16727.f49332, charSequence)) {
                    boolean zM16989 = m16989(c16727.f49329);
                    c16727.m37967();
                    m16988(zM16989);
                    return zM16989;
                }
                if (this.f19230) {
                    c16727.m37967();
                    m16988(false);
                    return false;
                }
            }
            this.f19230 |= c16727.f49323;
            c16727.m37967();
            m16988(false);
            return false;
        } catch (Throwable th) {
            c16727.m37967();
            m16988(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private boolean m16998(int i, C17852 c17852, CharSequence charSequence) {
        int i2 = c17852.f53276;
        int i3 = c17852.f53261;
        C10023 c10023 = this.f19237;
        int i4 = c10023.f27757 - 1;
        EnumC3791 enumC3791 = c17852.f53254.f29634;
        boolean z = enumC3791 == EnumC3791.LAZY;
        boolean z2 = enumC3791 == EnumC3791.GREEDY;
        while (i <= i4) {
            if (c10023.m23374()) {
                this.f19230 = true;
                return false;
            }
            if (i >= c10023.f27757 || c17852.m40533(charSequence.charAt(i))) {
                if (i >= c10023.f27757) {
                    c10023.f27755 = true;
                } else {
                    if (z && charSequence.charAt(i) == i3 && (c10023.f27733 != 1 || i + 1 == c10023.f27757)) {
                        m17001(i + 1);
                        c10023.f27745[0] = i;
                        c10023.f27768 = i;
                        return true;
                    }
                    if (i >= c10023.f27757) {
                        c10023.f27755 = true;
                    } else if (charSequence.charAt(i) == i2) {
                        int i5 = i + 1;
                        m17001(i5);
                        if (i5 >= c10023.f27757) {
                            c10023.f27755 = true;
                        } else if (charSequence.charAt(i5) == i3 && (c10023.f27733 != 1 || i + 2 == c10023.f27757)) {
                            m17001(i + 2);
                            c10023.f27745[0] = i;
                            c10023.f27768 = i;
                            return true;
                        }
                        if (!z2) {
                            continue;
                        }
                    }
                    if (z) {
                        continue;
                    } else if (i >= c10023.f27757) {
                        c10023.f27755 = true;
                    } else if (charSequence.charAt(i) == i3 && (c10023.f27733 != 1 || i + 1 == c10023.f27757)) {
                        m17001(i + 1);
                        c10023.f27745[0] = i;
                        c10023.f27768 = i;
                        return true;
                    }
                }
            }
            i++;
        }
        c10023.f27755 = true;
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
    /* JADX INFO: renamed from: ֫ */
    private boolean m16967(int i, C17852 c17852, CharSequence charSequence) throws Throwable {
        int iM16985;
        int i2;
        int iM17012;
        int iM16986;
        int iM16987;
        boolean z;
        int i3;
        int iM16988;
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
        int i9 = c17852.f53262;
        int i10 = c17852.f53263;
        int i11 = c17852.f53269;
        int i12 = c17852.f53276;
        int i13 = c17852.f53261;
        C10694 c10694 = c17852.f53254;
        C10023 c10023 = this.f19237;
        switch (i9) {
            case 0:
                Object obj = c17852.f53268;
                int i14 = c17852.f53258;
                boolean z7 = c17852.f53267;
                InterfaceC12628 interfaceC12628 = (InterfaceC12628) obj;
                int i15 = c10023.f27757;
                int i16 = 0;
                int iMax = i;
                while (iMax < i15) {
                    int iCodePointAt = z7 ? Character.codePointAt(charSequence, iMax) : charSequence.charAt(iMax);
                    int iCharCount = z7 ? Character.charCount(iCodePointAt) : 1;
                    if (iMax + iCharCount > i15) {
                        c10023.f27755 = true;
                        iCodePointAt = charSequence.charAt(iMax);
                        iCharCount = 1;
                    }
                    if (interfaceC12628.mo4821(iCodePointAt)) {
                        iMax += iCharCount;
                        i16++;
                        if (c10023.m23374()) {
                            this.f19230 = true;
                            return false;
                        }
                    } else {
                        if (iMax >= i15) {
                            c10023.f27755 = true;
                        }
                        this.f19243 = iMax;
                        if (i16 < i14) {
                            return false;
                        }
                        while (true) {
                            iM16985 = m16985(iMax, c17852, charSequence);
                            if (this.f19230) {
                                return false;
                            }
                            if (iM16985 >= 0) {
                                m17001(iM16985);
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
                            if (c10023.m23374()) {
                                this.f19230 = true;
                                return false;
                            }
                            i16 = i2;
                        }
                    }
                }
                if (iMax >= i15) {
                    c10023.f27755 = true;
                }
                this.f19243 = iMax;
                if (i16 < i14) {
                    return false;
                }
                while (true) {
                    iM16985 = m16985(iMax, c17852, charSequence);
                    if (this.f19230) {
                        return false;
                    }
                    if (iM16985 >= 0) {
                        m17001(iM16985);
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
                    if (c10023.m23374()) {
                        this.f19230 = true;
                        return false;
                    }
                    i16 = i2;
                }
                break;
            case 1:
                EnumC3791 enumC3791 = c10694.f29634;
                EnumC3791 enumC3792 = EnumC3791.LAZY;
                if (enumC3791 == enumC3792) {
                    int iM16989 = m16985(i, c17852, charSequence);
                    if (!this.f19230) {
                        if (iM16989 >= 0) {
                            m17001(iM16989);
                            return true;
                        }
                        iM17012 = m17012(i, c17852, charSequence);
                        if (!this.f19230) {
                            if (iM17012 >= 0) {
                                int[] iArr = c10023.f27745;
                                iArr[0] = c10023.f27768;
                                c10023.m23383(iM17012);
                                iArr[1] = iM17012;
                                iM16987 = m16985(iM17012, c17852, charSequence);
                                if (!this.f19230) {
                                    if (iM16987 >= 0) {
                                        m17001(iM16987);
                                        return true;
                                    }
                                    if (enumC3791 == EnumC3791.GREEDY) {
                                        iM16986 = m16985(i, c17852, charSequence);
                                        if (!this.f19230 && iM16986 >= 0) {
                                            m17001(iM16986);
                                            return true;
                                        }
                                    }
                                }
                            } else if (enumC3791 != enumC3792) {
                                iM16986 = m16985(i, c17852, charSequence);
                                if (!this.f19230) {
                                    m17001(iM16986);
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    iM17012 = m17012(i, c17852, charSequence);
                    if (!this.f19230) {
                        if (iM17012 >= 0) {
                            int[] iArr2 = c10023.f27745;
                            iArr2[0] = c10023.f27768;
                            c10023.m23383(iM17012);
                            iArr2[1] = iM17012;
                            iM16987 = m16985(iM17012, c17852, charSequence);
                            if (!this.f19230) {
                                if (iM16987 >= 0) {
                                    m17001(iM16987);
                                    return true;
                                }
                                if (enumC3791 == EnumC3791.GREEDY) {
                                    iM16986 = m16985(i, c17852, charSequence);
                                    if (!this.f19230) {
                                        m17001(iM16986);
                                        return true;
                                    }
                                }
                            }
                        } else if (enumC3791 != enumC3792) {
                            iM16986 = m16985(i, c17852, charSequence);
                            if (!this.f19230) {
                                m17001(iM16986);
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
                    int i19 = c10694.f29632;
                    EnumC3791 enumC3793 = c10694.f29634;
                    int i20 = c10694.f29633;
                    if (i18 < i19) {
                        int iM17013 = m17012(i17, c17852, charSequence);
                        if (!this.f19230) {
                            if (iM17013 < 0) {
                                m16966(c17852, i17, true);
                                return false;
                            }
                            m17001(iM17013);
                            i18++;
                            if (c10023.m23374()) {
                                this.f19230 = true;
                                return false;
                            }
                            i17 = iM17013;
                        }
                    } else {
                        if (c10023.f27744) {
                            this.f19230 = true;
                            return false;
                        }
                        if (enumC3793 != EnumC3791.LAZY) {
                            while (i18 < i20) {
                                int iM17014 = m17012(i17, c17852, charSequence);
                                if (!this.f19230) {
                                    if (iM17014 < 0) {
                                        if (i18 < i20) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        i3 = i17;
                                        do {
                                            iM16988 = m16985(i3, c17852, charSequence);
                                            if (this.f19230) {
                                                if (iM16988 >= 0) {
                                                    m17001(iM16988);
                                                    return true;
                                                }
                                                if (enumC3793 != EnumC3791.POSSESSIVE || i18 <= c10694.f29632) {
                                                    m16966(c17852, i17, z);
                                                    return false;
                                                }
                                                i3 -= c17852.f53275;
                                                i18--;
                                            }
                                        } while (!c10023.m23374());
                                        this.f19230 = true;
                                        return false;
                                    }
                                    m17001(iM17014);
                                    i18++;
                                    if (c10023.m23374()) {
                                        this.f19230 = true;
                                        return false;
                                    }
                                    i17 = iM17014;
                                }
                            }
                            if (i18 < i20) {
                                z = true;
                            } else {
                                z = false;
                            }
                            i3 = i17;
                            do {
                                iM16988 = m16985(i3, c17852, charSequence);
                                if (this.f19230) {
                                    if (iM16988 >= 0) {
                                        m17001(iM16988);
                                        return true;
                                    }
                                    if (enumC3793 != EnumC3791.POSSESSIVE) {
                                    }
                                    m16966(c17852, i17, z);
                                    return false;
                                }
                            } while (!c10023.m23374());
                            this.f19230 = true;
                            return false;
                        }
                        while (true) {
                            int iM169810 = m16985(i17, c17852, charSequence);
                            if (!this.f19230) {
                                if (iM169810 >= 0) {
                                    m17001(iM169810);
                                    return true;
                                }
                                if (i18 < i20) {
                                    int iM17015 = m17012(i17, c17852, charSequence);
                                    if (!this.f19230) {
                                        if (iM17015 < 0) {
                                            m16966(c17852, i17, true);
                                            return false;
                                        }
                                        m17001(iM17015);
                                        i18++;
                                        if (c10023.m23374()) {
                                            this.f19230 = true;
                                            return false;
                                        }
                                        i17 = iM17015;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            case 3:
                boolean z8 = c10023.f27750;
                if (z8) {
                    C10694 c10695 = c10694;
                    int i21 = c10695.f29632;
                    int i22 = c10695.f29629;
                    int i23 = c10695.f29631;
                    int i24 = this.f19231[i23];
                    int[] iArr3 = c10023.f27745;
                    int i25 = iArr3[i22];
                    int i26 = iArr3[i22 + 1];
                    int size = z8 ? c10023.f27736.f62172.size() : -1;
                    this.f19231[i23] = -1;
                    try {
                        int i27 = c17852.f53269;
                        int i28 = c17852.f53263;
                        int iM16951 = i;
                        int i29 = 0;
                        while (i29 < i21) {
                            int i30 = i29;
                            int i31 = iM16951;
                            int i32 = i27;
                            C10694 c10696 = c10695;
                            int i33 = i28;
                            iM16951 = m16951(i27, i28, charSequence, i31, c10023.f27757);
                            if (iM16951 < 0) {
                                m16966(c17852, i31, true);
                                m16961(i23, i22, i24, i25, i26, size);
                                return false;
                            }
                            c10023.m23383(iM16951);
                            m16959(i22, i31, iM16951);
                            i29 = i30 + 1;
                            if (c10023.m23374()) {
                                this.f19230 = true;
                                m16961(i23, i22, i24, i25, i26, size);
                                return false;
                            }
                            c10695 = c10696;
                            i27 = i32;
                            i28 = i33;
                        }
                        int i34 = iM16951;
                        boolean zM16994 = c10695.f29634 == EnumC3791.LAZY ? m16994(c17852, i34, i21, charSequence) : m16975(c17852, i34, i21, charSequence);
                        if (!zM16994) {
                            m16961(i23, i22, i24, i25, i26, size);
                        }
                        return zM16994;
                    } catch (Throwable th3) {
                        m16961(i23, i22, i24, i25, i26, size);
                        throw th3;
                    }
                }
                int i35 = c10694.f29632;
                int i36 = c10694.f29633;
                int i37 = c10023.f27757;
                int i38 = c10694.f29631;
                int[] iArr4 = this.f19231;
                int i39 = iArr4[i38];
                boolean z9 = c10694.f29634 == EnumC3791.LAZY;
                iArr4[i38] = -1;
                int i40 = z9 ? i35 : i36;
                int i41 = i;
                boolean z10 = z9;
                C10694 c10697 = c10694;
                int i42 = 0;
                int i43 = -1;
                while (i42 < i40) {
                    if (i41 >= i37) {
                        c10023.f27755 = true;
                    } else {
                        try {
                            int i44 = i40;
                            if (charSequence.charAt(i41) == i11) {
                                int i45 = i41 + 1;
                                if (i45 >= i37) {
                                    c10023.f27755 = true;
                                } else if (charSequence.charAt(i45) == i10) {
                                    i43 = i41 + 2;
                                    i42++;
                                    if (c10023.m23374()) {
                                        this.f19230 = true;
                                        if (i43 >= 0) {
                                            c10023.m23383(i43);
                                        }
                                        this.f19231[i38] = i39;
                                        return false;
                                    }
                                    i41 = i43;
                                    i40 = i44;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            if (i43 >= 0) {
                                c10023.m23383(i43);
                            }
                            this.f19231[i38] = i39;
                            throw th;
                        }
                    }
                    if (i42 < i35) {
                        m16966(c17852, i41, true);
                        if (i43 >= 0) {
                            c10023.m23383(i43);
                        }
                        this.f19231[i38] = i39;
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
                            c10023.f27755 = true;
                        } else {
                            i5 = i35;
                            if (iCharAt == i13) {
                                if (c10023.f27733 != 1) {
                                    if (i4 + 1 == i37) {
                                    }
                                }
                                if (i42 > 0) {
                                    int[] iArr5 = c10023.f27745;
                                    int i46 = c10697.f29629;
                                    iArr5[i46] = i4 - 2;
                                    iArr5[i46 + 1] = i4;
                                }
                                m17001(i4 + 1);
                                return true;
                            }
                            C10694 c10698 = c10697;
                            if (z10) {
                                i35 = i5;
                                if (i42 <= i35) {
                                    i41 = i41;
                                    m16966(c17852, i41, z3);
                                    if (i43 >= 0) {
                                        c10023.m23383(i43);
                                    }
                                    this.f19231[i38] = i39;
                                    return false;
                                }
                                i41 = i41;
                                i4 -= 2;
                                i42--;
                                if (c10023.m23374()) {
                                    this.f19230 = true;
                                    if (i43 >= 0) {
                                        c10023.m23383(i43);
                                    }
                                    this.f19231[i38] = i39;
                                    return false;
                                }
                            } else {
                                if (i42 >= i36) {
                                    if (i43 >= 0) {
                                        c10023.m23383(i43);
                                    }
                                    this.f19231[i38] = i39;
                                    return false;
                                }
                                if (i4 >= i37) {
                                    c10023.f27755 = true;
                                    m16966(c17852, i4, true);
                                    if (i43 >= 0) {
                                        c10023.m23383(i43);
                                    }
                                    this.f19231[i38] = i39;
                                    return false;
                                }
                                if (iCharAt != i11) {
                                    m16966(c17852, i4, true);
                                    if (i43 >= 0) {
                                        c10023.m23383(i43);
                                    }
                                    this.f19231[i38] = i39;
                                    return false;
                                }
                                i6 = i4 + 1;
                                if (i6 >= i37) {
                                    c10023.f27755 = true;
                                    m16966(c17852, i4, true);
                                    if (i43 >= 0) {
                                        c10023.m23383(i43);
                                    }
                                    this.f19231[i38] = i39;
                                    return false;
                                }
                                if (charSequence.charAt(i6) != i10) {
                                    m16966(c17852, i4, true);
                                    if (i43 >= 0) {
                                        c10023.m23383(i43);
                                    }
                                    this.f19231[i38] = i39;
                                    return false;
                                }
                                i4 += 2;
                                i42++;
                                try {
                                    if (c10023.m23374()) {
                                        this.f19230 = true;
                                        if (i4 >= 0) {
                                            c10023.m23383(i4);
                                        }
                                        this.f19231[i38] = i39;
                                        return false;
                                    }
                                    i41 = i41;
                                    i43 = i4;
                                    i35 = i5;
                                } catch (Throwable th5) {
                                    th = th5;
                                    i43 = i4;
                                    if (i43 >= 0) {
                                        c10023.m23383(i43);
                                    }
                                    this.f19231[i38] = i39;
                                    throw th;
                                }
                            }
                            z3 = z3;
                            c10697 = c10698;
                            i13 = i13;
                        }
                        C10694 c10699 = c10697;
                        if (z10) {
                            i35 = i5;
                            if (i42 <= i35) {
                                i41 = i41;
                                m16966(c17852, i41, z3);
                                if (i43 >= 0) {
                                    c10023.m23383(i43);
                                }
                                this.f19231[i38] = i39;
                                return false;
                            }
                            i41 = i41;
                            i4 -= 2;
                            i42--;
                            if (c10023.m23374()) {
                                this.f19230 = true;
                                if (i43 >= 0) {
                                    c10023.m23383(i43);
                                }
                                this.f19231[i38] = i39;
                                return false;
                            }
                        } else {
                            if (i42 >= i36) {
                                if (i43 >= 0) {
                                    c10023.m23383(i43);
                                }
                                this.f19231[i38] = i39;
                                return false;
                            }
                            if (i4 >= i37) {
                                c10023.f27755 = true;
                                m16966(c17852, i4, true);
                                if (i43 >= 0) {
                                    c10023.m23383(i43);
                                }
                                this.f19231[i38] = i39;
                                return false;
                            }
                            if (iCharAt != i11) {
                                m16966(c17852, i4, true);
                                if (i43 >= 0) {
                                    c10023.m23383(i43);
                                }
                                this.f19231[i38] = i39;
                                return false;
                            }
                            i6 = i4 + 1;
                            if (i6 >= i37) {
                                c10023.f27755 = true;
                                m16966(c17852, i4, true);
                                if (i43 >= 0) {
                                    c10023.m23383(i43);
                                }
                                this.f19231[i38] = i39;
                                return false;
                            }
                            if (charSequence.charAt(i6) != i10) {
                                m16966(c17852, i4, true);
                                if (i43 >= 0) {
                                    c10023.m23383(i43);
                                }
                                this.f19231[i38] = i39;
                                return false;
                            }
                            i4 += 2;
                            i42++;
                            if (c10023.m23374()) {
                                this.f19230 = true;
                                if (i4 >= 0) {
                                    c10023.m23383(i4);
                                }
                                this.f19231[i38] = i39;
                                return false;
                            }
                            i41 = i41;
                            i43 = i4;
                            i35 = i5;
                        }
                        z3 = z3;
                        c10697 = c10699;
                        i13 = i13;
                    }
                }
                if (i42 < i35) {
                    m16966(c17852, i41, true);
                    if (i43 >= 0) {
                        c10023.m23383(i43);
                    }
                    this.f19231[i38] = i39;
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
                        c10023.f27755 = true;
                    } else {
                        i5 = i35;
                        if (iCharAt == i13) {
                            if (c10023.f27733 != 1) {
                                if (i4 + 1 == i37) {
                                }
                            }
                            if (i42 > 0) {
                                int[] iArr6 = c10023.f27745;
                                int i47 = c10697.f29629;
                                iArr6[i47] = i4 - 2;
                                iArr6[i47 + 1] = i4;
                            }
                            m17001(i4 + 1);
                            return true;
                        }
                        C10694 c106910 = c10697;
                        if (z10) {
                            i35 = i5;
                            if (i42 <= i35) {
                                i41 = i41;
                                m16966(c17852, i41, z3);
                                if (i43 >= 0) {
                                    c10023.m23383(i43);
                                }
                                this.f19231[i38] = i39;
                                return false;
                            }
                            i41 = i41;
                            i4 -= 2;
                            i42--;
                            if (c10023.m23374()) {
                                this.f19230 = true;
                                if (i43 >= 0) {
                                    c10023.m23383(i43);
                                }
                                this.f19231[i38] = i39;
                                return false;
                            }
                        } else {
                            if (i42 >= i36) {
                                if (i43 >= 0) {
                                    c10023.m23383(i43);
                                }
                                this.f19231[i38] = i39;
                                return false;
                            }
                            if (i4 >= i37) {
                                c10023.f27755 = true;
                                m16966(c17852, i4, true);
                                if (i43 >= 0) {
                                    c10023.m23383(i43);
                                }
                                this.f19231[i38] = i39;
                                return false;
                            }
                            if (iCharAt != i11) {
                                m16966(c17852, i4, true);
                                if (i43 >= 0) {
                                    c10023.m23383(i43);
                                }
                                this.f19231[i38] = i39;
                                return false;
                            }
                            i6 = i4 + 1;
                            if (i6 >= i37) {
                                c10023.f27755 = true;
                                m16966(c17852, i4, true);
                                if (i43 >= 0) {
                                    c10023.m23383(i43);
                                }
                                this.f19231[i38] = i39;
                                return false;
                            }
                            if (charSequence.charAt(i6) != i10) {
                                m16966(c17852, i4, true);
                                if (i43 >= 0) {
                                    c10023.m23383(i43);
                                }
                                this.f19231[i38] = i39;
                                return false;
                            }
                            i4 += 2;
                            i42++;
                            if (c10023.m23374()) {
                                this.f19230 = true;
                                if (i4 >= 0) {
                                    c10023.m23383(i4);
                                }
                                this.f19231[i38] = i39;
                                return false;
                            }
                            i41 = i41;
                            i43 = i4;
                            i35 = i5;
                        }
                        z3 = z3;
                        c10697 = c106910;
                        i13 = i13;
                    }
                    C10694 c106911 = c10697;
                    if (z10) {
                        i35 = i5;
                        if (i42 <= i35) {
                            i41 = i41;
                            m16966(c17852, i41, z3);
                            if (i43 >= 0) {
                                c10023.m23383(i43);
                            }
                            this.f19231[i38] = i39;
                            return false;
                        }
                        i41 = i41;
                        i4 -= 2;
                        i42--;
                        if (c10023.m23374()) {
                            this.f19230 = true;
                            if (i43 >= 0) {
                                c10023.m23383(i43);
                            }
                            this.f19231[i38] = i39;
                            return false;
                        }
                    } else {
                        if (i42 >= i36) {
                            if (i43 >= 0) {
                                c10023.m23383(i43);
                            }
                            this.f19231[i38] = i39;
                            return false;
                        }
                        if (i4 >= i37) {
                            c10023.f27755 = true;
                            m16966(c17852, i4, true);
                            if (i43 >= 0) {
                                c10023.m23383(i43);
                            }
                            this.f19231[i38] = i39;
                            return false;
                        }
                        if (iCharAt != i11) {
                            m16966(c17852, i4, true);
                            if (i43 >= 0) {
                                c10023.m23383(i43);
                            }
                            this.f19231[i38] = i39;
                            return false;
                        }
                        i6 = i4 + 1;
                        if (i6 >= i37) {
                            c10023.f27755 = true;
                            m16966(c17852, i4, true);
                            if (i43 >= 0) {
                                c10023.m23383(i43);
                            }
                            this.f19231[i38] = i39;
                            return false;
                        }
                        if (charSequence.charAt(i6) != i10) {
                            m16966(c17852, i4, true);
                            if (i43 >= 0) {
                                c10023.m23383(i43);
                            }
                            this.f19231[i38] = i39;
                            return false;
                        }
                        i4 += 2;
                        i42++;
                        if (c10023.m23374()) {
                            this.f19230 = true;
                            if (i4 >= 0) {
                                c10023.m23383(i4);
                            }
                            this.f19231[i38] = i39;
                            return false;
                        }
                        i41 = i41;
                        i43 = i4;
                        i35 = i5;
                    }
                    z3 = z3;
                    c10697 = c106911;
                    i13 = i13;
                }
                break;
            case 4:
            default:
                return m17006(i, c17852, charSequence);
            case 5:
                if (m17011(i, c17852, charSequence)) {
                    int i48 = c10023.f27757;
                    int i49 = c10694.f29632;
                    int i50 = c10694.f29633;
                    int i51 = i + i49;
                    int i52 = i49;
                    while (i52 < i50) {
                        if (i51 >= i48) {
                            c10023.f27755 = true;
                        } else if (charSequence.charAt(i51) == i12) {
                            i51++;
                            m17001(i51);
                            i52++;
                            if (c10023.m23374()) {
                                this.f19230 = true;
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
                                c10023.f27755 = true;
                            } else if (charSequence.charAt(i7) == i13 && (c10023.f27733 != 1 || i7 + 1 == i48)) {
                                m17001(i7 + 1);
                                return true;
                            }
                            if (i52 <= i49) {
                                m16966(c17852, i51, z4);
                                return false;
                            }
                            i7--;
                            i52--;
                        } while (!c10023.m23374());
                        this.f19230 = true;
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
                            c10023.f27755 = true;
                        } else if (charSequence.charAt(i7) == i13) {
                            m17001(i7 + 1);
                            return true;
                        }
                        if (i52 <= i49) {
                            m16966(c17852, i51, z4);
                            return false;
                        }
                        i7--;
                        i52--;
                    } while (!c10023.m23374());
                    this.f19230 = true;
                    return false;
                }
                return false;
            case 6:
                if (c10023.f27750) {
                    return m17006(i, c17852, charSequence);
                }
                int i53 = c17852.f53257;
                int i54 = c10694.f29632;
                int i55 = c10694.f29633;
                int i56 = c10023.f27757;
                int i57 = 0;
                int i58 = i;
                boolean z11 = false;
                while (i57 < i54) {
                    if (i58 >= i56) {
                        c10023.f27755 = true;
                        m16966(c17852, i58, true);
                        if (i57 > 0) {
                            int[] iArr7 = c10023.f27745;
                            iArr7[i53] = i58 - 2;
                            iArr7[i53 + 1] = i58;
                            return z11;
                        }
                    } else {
                        try {
                            if (charSequence.charAt(i58) != i11) {
                                m16966(c17852, i58, true);
                                if (i57 > 0) {
                                    int[] iArr8 = c10023.f27745;
                                    iArr8[i53] = i58 - 2;
                                    iArr8[i53 + 1] = i58;
                                    return z11;
                                }
                            } else {
                                int i59 = i58 + 1;
                                if (i59 >= i56) {
                                    c10023.f27755 = true;
                                    m16966(c17852, i58, true);
                                    if (i57 > 0) {
                                        int[] iArr9 = c10023.f27745;
                                        iArr9[i53] = i58 - 2;
                                        iArr9[i53 + 1] = i58;
                                        return z11;
                                    }
                                } else if (charSequence.charAt(i59) != i10) {
                                    m16966(c17852, i58, true);
                                    if (i57 > 0) {
                                        int[] iArr10 = c10023.f27745;
                                        iArr10[i53] = i58 - 2;
                                        iArr10[i53 + 1] = i58;
                                        return z11;
                                    }
                                } else {
                                    z5 = false;
                                    i8 = i58 + 2;
                                    try {
                                        m17001(i8);
                                        i57++;
                                        if (c10023.m23374()) {
                                            this.f19230 = true;
                                            if (i57 > 0) {
                                                int[] iArr11 = c10023.f27745;
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
                                            int[] iArr12 = c10023.f27745;
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
                                int[] iArr13 = c10023.f27745;
                                iArr13[i53] = i8 - 2;
                                iArr13[i53 + 1] = i8;
                            }
                            throw th2;
                        }
                    }
                    return false;
                }
                z5 = false;
                if (c10023.f27744) {
                    this.f19230 = true;
                    if (i57 <= 0) {
                        return false;
                    }
                    int[] iArr14 = c10023.f27745;
                    iArr14[i53] = i58 - 2;
                    iArr14[i53 + 1] = i58;
                    return false;
                }
                while (i57 < i55) {
                    if (i58 >= i56) {
                        c10023.f27755 = true;
                    } else if (charSequence.charAt(i58) == i11) {
                        int i60 = i58 + 1;
                        if (i60 >= i56) {
                            c10023.f27755 = true;
                        } else if (charSequence.charAt(i60) == i10) {
                            i8 = i58 + 2;
                            m17001(i8);
                            i57++;
                            if (c10023.m23374()) {
                                this.f19230 = true;
                                if (i57 > 0) {
                                    int[] iArr15 = c10023.f27745;
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
                        c10023.f27755 = true;
                    } else if (charSequence.charAt(i58) == i13 && (c10023.f27733 != 1 || i58 + 1 == i56)) {
                        m17001(i58 + 1);
                        if (i57 > 0) {
                            int[] iArr16 = c10023.f27745;
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
                    m16966(c17852, i58, z6);
                    if (i57 > 0) {
                        return false;
                    }
                    int[] iArr17 = c10023.f27745;
                    iArr17[i53] = i58 - 2;
                    iArr17[i53 + 1] = i58;
                    return false;
                }
                if (i58 >= i56) {
                    c10023.f27755 = true;
                } else if (charSequence.charAt(i58) == i13) {
                    m17001(i58 + 1);
                    if (i57 > 0) {
                        int[] iArr18 = c10023.f27745;
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
                m16966(c17852, i58, z6);
                if (i57 > 0) {
                    return false;
                }
                int[] iArr19 = c10023.f27745;
                iArr19[i53] = i58 - 2;
                iArr19[i53 + 1] = i58;
                return false;
            case 7:
                if (m17011(i, c17852, charSequence)) {
                    int i61 = c10694.f29633;
                    int i62 = c10023.f27757;
                    int i63 = c10694.f29632;
                    int i64 = i + i63;
                    do {
                        int iCharAt2 = i64 < i62 ? charSequence.charAt(i64) : -1;
                        if (iCharAt2 < 0) {
                            c10023.f27755 = true;
                        } else if (iCharAt2 == i13 && (c10023.f27733 != 1 || i64 + 1 == i62)) {
                            m17001(i64 + 1);
                            return true;
                        }
                        if (i63 < i61) {
                            if (iCharAt2 < 0 || iCharAt2 != i12) {
                                m16966(c17852, i64, true);
                                return false;
                            }
                            i64++;
                            m17001(i64);
                            i63++;
                        }
                    } while (!c10023.m23374());
                    this.f19230 = true;
                    return false;
                }
                return false;
            case 8:
                if (m17011(i, c17852, charSequence)) {
                    int i65 = c10023.f27757;
                    int i66 = c10694.f29633;
                    int i67 = c10694.f29632;
                    int i68 = i + i67;
                    while (i67 < i66) {
                        if (i68 >= i65) {
                            c10023.f27755 = true;
                        } else if (charSequence.charAt(i68) == i12) {
                            i68++;
                            m17001(i68);
                            i67++;
                            if (c10023.m23374()) {
                                this.f19230 = true;
                                return false;
                            }
                        }
                        if (i68 >= i65) {
                            c10023.f27755 = true;
                        } else if (charSequence.charAt(i68) == i13 && (c10023.f27733 != 1 || i68 + 1 == i65)) {
                            m17001(i68 + 1);
                            return true;
                        }
                        m16966(c17852, i68, i67 < i66);
                        return false;
                    }
                    if (i68 >= i65) {
                        c10023.f27755 = true;
                    } else if (charSequence.charAt(i68) == i13) {
                        m17001(i68 + 1);
                        return true;
                    }
                    m16966(c17852, i68, i67 < i66);
                    return false;
                }
                return false;
            case 9:
                if (m17011(i, c17852, charSequence)) {
                    int i69 = c10023.f27757;
                    int i70 = c10694.f29632;
                    int i71 = c10694.f29633;
                    int i72 = i + i70;
                    int i73 = i70;
                    while (i73 < i71) {
                        if (i72 >= i69) {
                            c10023.f27755 = true;
                        } else if (charSequence.charAt(i72) == i12) {
                            i72++;
                            m17001(i72);
                            i73++;
                        }
                        if (i73 == i71) {
                            if (i72 >= i69) {
                                c10023.f27755 = true;
                            } else if (charSequence.charAt(i72) == i12 && (c10023.f27733 != 1 || i72 + 1 == i69)) {
                                m17001(i72 + 1);
                                return true;
                            }
                        }
                        if (i73 > i70 || (c10023.f27733 == 1 && i72 != i69)) {
                            m16966(c17852, i72, i73 < i71);
                            return false;
                        }
                        m17001(i72);
                        return true;
                    }
                    if (i73 == i71) {
                        if (i72 >= i69) {
                            c10023.f27755 = true;
                        } else if (charSequence.charAt(i72) == i12) {
                            m17001(i72 + 1);
                            return true;
                        }
                    }
                    if (i73 > i70) {
                    }
                    m16966(c17852, i72, i73 < i71);
                    return false;
                }
                return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16961(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f19231[i] = i3;
        C10023 c10023 = this.f19237;
        int[] iArr = c10023.f27745;
        iArr[i2] = i4;
        iArr[i2 + 1] = i5;
        if (i6 >= 0) {
            c10023.f27736.m45499(i6);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m16994(C17852 c17852, int i, int i2, CharSequence charSequence) {
        C10694 c10694 = c17852.f53254;
        int i3 = c10694.f29633;
        int i4 = c10694.f29629;
        int i5 = c17852.f53269;
        int i6 = c17852.f53263;
        int i7 = c17852.f53261;
        int i8 = i;
        int i9 = i2;
        while (true) {
            C10023 c10023 = this.f19237;
            int iM16948 = m16948(i7, i8, c10023.f27757, charSequence);
            if (iM16948 >= 0 && c10023.f27733 == 1 && iM16948 != c10023.f27757) {
                iM16948 = -1;
            }
            if (iM16948 >= 0) {
                m17001(iM16948);
                return true;
            }
            if (i9 >= i3) {
                return false;
            }
            int i10 = i3;
            int iM16951 = m16951(i5, i6, charSequence, i8, c10023.f27757);
            if (iM16951 < 0) {
                m16966(c17852, i8, true);
                return false;
            }
            c10023.m23383(iM16951);
            m16959(i4, i8, iM16951);
            i9++;
            if (c10023.m23374()) {
                this.f19230 = true;
                return false;
            }
            i8 = iM16951;
            i3 = i10;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m16975(C17852 c17852, int i, int i2, CharSequence charSequence) {
        int i3;
        int i4;
        int i5;
        C10694 c10694 = c17852.f53254;
        int i6 = c10694.f29633;
        int i7 = c10694.f29629;
        int i8 = c17852.f53269;
        int i9 = c17852.f53263;
        int i10 = c17852.f53261;
        C10023 c10023 = this.f19237;
        C20082 c20082 = c10023.f27736;
        int[] iArr = c10023.f27745;
        int i11 = iArr[i7];
        int i12 = i7 + 1;
        int i13 = iArr[i12];
        int size = c10023.f27750 ? c20082.f62172.size() : -1;
        int iM16951 = i;
        int i14 = i2;
        while (true) {
            if (i14 >= i6) {
                i3 = i14;
                i4 = iM16951;
                i5 = size;
                break;
            }
            int i15 = i8;
            int i16 = i9;
            int i17 = i8;
            i3 = i14;
            int i18 = iM16951;
            int i19 = i9;
            i5 = size;
            iM16951 = m16951(i15, i16, charSequence, iM16951, c10023.f27757);
            if (iM16951 < 0) {
                i4 = i18;
                break;
            }
            c10023.m23383(iM16951);
            m16959(i7, i18, iM16951);
            i14 = i3 + 1;
            if (!c10023.m23374()) {
                size = i5;
                i8 = i17;
                i9 = i19;
            }
            this.f19230 = true;
            return false;
        }
        boolean z = i3 < i6;
        int i20 = i4;
        int i21 = i3;
        while (true) {
            if (i21 == i2) {
                if (i5 >= 0) {
                    c20082.m45499(i5);
                }
                int[] iArr2 = c10023.f27745;
                iArr2[i7] = i11;
                iArr2[i12] = i13;
            }
            int iM16948 = m16948(i10, i20, c10023.f27757, charSequence);
            if (iM16948 >= 0 && c10023.f27733 == 1 && iM16948 != c10023.f27757) {
                iM16948 = -1;
            }
            if (iM16948 >= 0) {
                if (i21 > i2) {
                    m16959(i7, i20 - 2, i20);
                }
                m17001(iM16948);
                return true;
            }
            if (i21 <= i2) {
                m16966(c17852, i4, z);
                return false;
            }
            int i22 = i20 - 2;
            i21--;
            m16959(i7, i20 - 4, i22);
            if (c10023.m23374()) {
                this.f19230 = true;
                return false;
            }
            i20 = i22;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m16951(int i, int i2, CharSequence charSequence, int i3, int i4) {
        C10023 c10023 = this.f19237;
        if (i3 >= i4) {
            c10023.f27755 = true;
            return -1;
        }
        if (charSequence.charAt(i3) != i) {
            return -1;
        }
        int i5 = i3 + 1;
        if (i5 >= i4) {
            c10023.f27755 = true;
            return -1;
        }
        if (charSequence.charAt(i5) == i2) {
            return i3 + 2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16959(int i, int i2, int i3) {
        C10023 c10023 = this.f19237;
        if (c10023.f27750) {
            c10023.f27736.m45500(i, i2, i3, c10023.f27745);
        }
        int[] iArr = c10023.f27745;
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
    /* JADX INFO: renamed from: ܽ */
    private boolean m17006(int i, C17852 c17852, CharSequence charSequence) {
        int i2;
        int i3;
        int i4;
        EnumC3791 enumC3791;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM16985;
        C10694 c10694;
        boolean z3;
        int iM16986;
        int i10;
        int iM17012;
        C17852 c17853 = c17852;
        C10023 c10023 = this.f19237;
        C20082 c20082 = c10023.f27736;
        C10694 c10695 = c17853.f53254;
        int i11 = c17853.f53275;
        int i12 = c10695.f29631;
        EnumC3791 enumC3792 = c10695.f29634;
        int i13 = c10695.f29633;
        int i14 = c10695.f29632;
        boolean z4 = c10695.f29628;
        int i15 = c10695.f29629;
        int i16 = i12 >= 0 ? this.f19231[i12] : 0;
        int i17 = z4 ? c10023.f27745[i15] : 0;
        int i18 = z4 ? c10023.f27745[i15 + 1] : 0;
        int size = (!c10023.f27750 || (i12 >= 0 && !z4)) ? -1 : c20082.f62172.size();
        int i19 = i13;
        if (i12 >= 0) {
            this.f19231[i12] = -1;
        }
        int i20 = i;
        int i21 = 0;
        while (i21 < i14) {
            int i22 = i14;
            try {
                int iM17013 = m17012(i20, c17853, charSequence);
                if (this.f19230) {
                    if (i12 >= 0) {
                        this.f19231[i12] = i16;
                    }
                    if (z4) {
                        int[] iArr = c10023.f27745;
                        iArr[i15] = i17;
                        iArr[i15 + 1] = i18;
                    }
                    if (size < 0) {
                        return false;
                    }
                } else if (iM17013 < 0) {
                    m16966(c17853, i20, true);
                    if (i12 >= 0) {
                        this.f19231[i12] = i16;
                    }
                    if (z4) {
                        int[] iArr2 = c10023.f27745;
                        iArr2[i15] = i17;
                        iArr2[i15 + 1] = i18;
                    }
                    if (size < 0) {
                        return false;
                    }
                } else {
                    m16965(c17853, i20, iM17013);
                    m16964(c10695, i20, iM17013);
                    i21++;
                    if (c10023.m23374()) {
                        this.f19230 = true;
                        if (i12 >= 0) {
                            this.f19231[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr3 = c10023.f27745;
                            iArr3[i15] = i17;
                            iArr3[i15 + 1] = i18;
                        }
                        if (size < 0) {
                            return false;
                        }
                    } else {
                        i20 = iM17013;
                        i14 = i22;
                    }
                }
                c20082.m45499(size);
                return false;
            } catch (Throwable th) {
                if (i12 >= 0) {
                    this.f19231[i12] = i16;
                }
                if (z4) {
                    int[] iArr4 = c10023.f27745;
                    iArr4[i15] = i17;
                    iArr4[i15 + 1] = i18;
                }
                if (size >= 0) {
                    c20082.m45499(size);
                }
                throw th;
            }
        }
        int i23 = i14;
        if (c10695.f29630 || i12 >= 0 || !c10023.f27744) {
            EnumC3791 enumC3793 = enumC3792;
            if (enumC3793 == EnumC3791.LAZY) {
                while (true) {
                    int iM16987 = m16985(i20, c17853, charSequence);
                    C10694 c10696 = c10695;
                    if (this.f19230) {
                        if (i12 >= 0) {
                            this.f19231[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr5 = c10023.f27745;
                            iArr5[i15] = i17;
                            iArr5[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    if (iM16987 >= 0) {
                        m17001(iM16987);
                        return true;
                    }
                    int i24 = i19;
                    if (i21 >= i24) {
                        if (i12 >= 0) {
                            this.f19231[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr6 = c10023.f27745;
                            iArr6[i15] = i17;
                            iArr6[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    int iM17014 = m17012(i20, c17853, charSequence);
                    if (this.f19230) {
                        if (i12 >= 0) {
                            this.f19231[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr7 = c10023.f27745;
                            iArr7[i15] = i17;
                            iArr7[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    if (iM17014 < 0) {
                        m16966(c17853, i20, true);
                        if (i12 >= 0) {
                            this.f19231[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr8 = c10023.f27745;
                            iArr8[i15] = i17;
                            iArr8[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    m16965(c17853, i20, iM17014);
                    m16964(c10696, i20, iM17014);
                    i21++;
                    if (c10023.m23374()) {
                        this.f19230 = true;
                        if (i12 >= 0) {
                            this.f19231[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr9 = c10023.f27745;
                            iArr9[i15] = i17;
                            iArr9[i15 + 1] = i18;
                        }
                        if (size >= 0) {
                            break;
                        }
                        return false;
                    }
                    i19 = i24;
                    i20 = iM17014;
                    c10695 = c10696;
                }
            } else {
                C10694 c10697 = c10695;
                int i25 = i19;
                int i26 = z4 ? c10023.f27745[i15] : 0;
                int i27 = z4 ? c10023.f27745[i15 + 1] : 0;
                if (z4) {
                    i2 = i27;
                    int size2 = c10023.f27750 ? c20082.f62172.size() : -1;
                    int i28 = i26;
                    i3 = i21;
                    int i29 = size2;
                    i4 = i20;
                    while (true) {
                        if (i3 < i25) {
                            enumC3791 = enumC3793;
                            break;
                        }
                        i10 = i25;
                        enumC3791 = enumC3793;
                        iM17012 = m17012(i4, c17853, charSequence);
                        if (this.f19230) {
                            if (i12 >= 0) {
                                this.f19231[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr10 = c10023.f27745;
                                iArr10[i15] = i17;
                                iArr10[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        } else {
                            if (iM17012 < 0) {
                                i25 = i10;
                                break;
                            }
                            m16965(c17853, i4, iM17012);
                            m16964(c10697, i4, iM17012);
                            i3++;
                            if (c10023.m23374()) {
                                this.f19230 = true;
                                if (i12 >= 0) {
                                    this.f19231[i12] = i16;
                                }
                                if (z4) {
                                    int[] iArr11 = c10023.f27745;
                                    iArr11[i15] = i17;
                                    iArr11[i15 + 1] = i18;
                                }
                                if (size < 0) {
                                    return false;
                                }
                            } else {
                                i4 = iM17012;
                                enumC3793 = enumC3791;
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
                    if (enumC3791 == EnumC3791.POSSESSIVE) {
                        iM16986 = m16985(i4, c17853, charSequence);
                        if (this.f19230) {
                            if (i12 >= 0) {
                                this.f19231[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr12 = c10023.f27745;
                                iArr12[i15] = i17;
                                iArr12[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        } else {
                            if (iM16986 >= 0) {
                                m17001(iM16986);
                                return true;
                            }
                            m16966(c17853, i4, z);
                            if (i12 >= 0) {
                                this.f19231[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr13 = c10023.f27745;
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
                                    c20082.m45499(i30);
                                    i29 = i30;
                                }
                                int[] iArr14 = c10023.f27745;
                                iArr14[i15] = i28;
                                iArr14[i15 + 1] = i2;
                            } else {
                                c10697 = c10697;
                            }
                            iM16985 = m16985(i6, c17853, charSequence);
                            if (this.f19230) {
                                if (i12 >= 0) {
                                    this.f19231[i12] = i16;
                                }
                                if (z4) {
                                    int[] iArr15 = c10023.f27745;
                                    iArr15[i15] = i17;
                                    iArr15[i15 + 1] = i18;
                                }
                                if (size < 0) {
                                    return false;
                                }
                            } else {
                                if (iM16985 >= 0) {
                                    if (i12 >= 0 && i7 > i9) {
                                        m16964(c10697, i6 - i11, i6);
                                    }
                                    m17001(iM16985);
                                    return true;
                                }
                                c10694 = c10697;
                                if (i7 <= i9) {
                                    m16966(c17853, i8, z2);
                                    if (i12 >= 0) {
                                        this.f19231[i12] = i16;
                                    }
                                    if (z4) {
                                        int[] iArr16 = c10023.f27745;
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
                                    m16964(c10694, i6 - i11, i6);
                                    if (c10023.m23374()) {
                                        this.f19230 = true;
                                        if (i12 >= 0) {
                                            this.f19231[i12] = i16;
                                        }
                                        if (z4) {
                                            int[] iArr17 = c10023.f27745;
                                            iArr17[i15] = i17;
                                            iArr17[i15 + 1] = i18;
                                        }
                                        if (size >= 0) {
                                            return false;
                                        }
                                        c20082.m45499(size);
                                        return false;
                                    }
                                    c17853 = c17852;
                                    z2 = z3;
                                    i4 = i8;
                                    c10697 = c10694;
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
                        enumC3791 = enumC3793;
                        break;
                    }
                    i10 = i25;
                    enumC3791 = enumC3793;
                    iM17012 = m17012(i4, c17853, charSequence);
                    if (this.f19230) {
                        if (i12 >= 0) {
                            this.f19231[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr18 = c10023.f27745;
                            iArr18[i15] = i17;
                            iArr18[i15 + 1] = i18;
                        }
                        if (size < 0) {
                            return false;
                        }
                    } else {
                        if (iM17012 < 0) {
                            i25 = i10;
                            break;
                        }
                        m16965(c17853, i4, iM17012);
                        m16964(c10697, i4, iM17012);
                        i3++;
                        if (c10023.m23374()) {
                            this.f19230 = true;
                            if (i12 >= 0) {
                                this.f19231[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr19 = c10023.f27745;
                                iArr19[i15] = i17;
                                iArr19[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        } else {
                            i4 = iM17012;
                            enumC3793 = enumC3791;
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
                if (enumC3791 == EnumC3791.POSSESSIVE) {
                    iM16986 = m16985(i4, c17853, charSequence);
                    if (this.f19230) {
                        if (i12 >= 0) {
                            this.f19231[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr110 = c10023.f27745;
                            iArr110[i15] = i17;
                            iArr110[i15 + 1] = i18;
                        }
                        if (size < 0) {
                            return false;
                        }
                    } else {
                        if (iM16986 >= 0) {
                            m17001(iM16986);
                            return true;
                        }
                        m16966(c17853, i4, z);
                        if (i12 >= 0) {
                            this.f19231[i12] = i16;
                        }
                        if (z4) {
                            int[] iArr111 = c10023.f27745;
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
                            c10697 = c10697;
                        } else {
                            c10697 = c10697;
                        }
                        iM16985 = m16985(i6, c17853, charSequence);
                        if (this.f19230) {
                            if (i12 >= 0) {
                                this.f19231[i12] = i16;
                            }
                            if (z4) {
                                int[] iArr112 = c10023.f27745;
                                iArr112[i15] = i17;
                                iArr112[i15 + 1] = i18;
                            }
                            if (size < 0) {
                                return false;
                            }
                        } else {
                            if (iM16985 >= 0) {
                                if (i12 >= 0) {
                                    m16964(c10697, i6 - i11, i6);
                                }
                                m17001(iM16985);
                                return true;
                            }
                            c10694 = c10697;
                            if (i7 <= i9) {
                                m16966(c17853, i8, z2);
                                if (i12 >= 0) {
                                    this.f19231[i12] = i16;
                                }
                                if (z4) {
                                    int[] iArr113 = c10023.f27745;
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
                                m16964(c10694, i6 - i11, i6);
                                if (c10023.m23374()) {
                                    this.f19230 = true;
                                    if (i12 >= 0) {
                                        this.f19231[i12] = i16;
                                    }
                                    if (z4) {
                                        int[] iArr114 = c10023.f27745;
                                        iArr114[i15] = i17;
                                        iArr114[i15 + 1] = i18;
                                    }
                                    if (size >= 0) {
                                        return false;
                                    }
                                    c20082.m45499(size);
                                    return false;
                                }
                                c17853 = c17852;
                                z2 = z3;
                                i4 = i8;
                                c10697 = c10694;
                            }
                        }
                    }
                }
            }
        } else {
            this.f19230 = true;
            if (i12 >= 0) {
                this.f19231[i12] = i16;
            }
            if (z4) {
                int[] iArr20 = c10023.f27745;
                iArr20[i15] = i17;
                iArr20[i15 + 1] = i18;
            }
            if (size < 0) {
                return false;
            }
        }
        c20082.m45499(size);
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m17011(int i, C17852 c17852, CharSequence charSequence) {
        int i2 = c17852.f53276;
        int i3 = c17852.f53254.f29632;
        C10023 c10023 = this.f19237;
        int i4 = c10023.f27757;
        int i5 = 0;
        while (i5 < i3) {
            if (i >= i4) {
                c10023.f27755 = true;
                m16966(c17852, i, true);
                return false;
            }
            if (charSequence.charAt(i) != i2) {
                m16966(c17852, i, true);
                return false;
            }
            i++;
            m17001(i);
            i5++;
            if (c10023.m23374()) {
                this.f19230 = true;
                return false;
            }
        }
        if (!c10023.f27744) {
            return true;
        }
        this.f19230 = true;
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16966(C17852 c17852, int i, boolean z) {
        if (z && c17852.f53271) {
            this.f19243 = i;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16965(C17852 c17852, int i, int i2) {
        boolean z = c17852.f53265;
        C10023 c10023 = this.f19237;
        if (z) {
            int[] iArr = c10023.f27745;
            int i3 = c17852.f53257;
            int i4 = iArr[i3];
            int i5 = i3 + 1;
            int i6 = iArr[i5];
            iArr[i3] = i;
            iArr[i5] = i2;
            if (c10023.f27750 && i4 != -1 && i6 != -1) {
                C20082 c20082 = c10023.f27736;
                c20082.f62172.add(new C5212(i3 / 2, i4, i6));
            }
        }
        c10023.m23383(i2);
        if (c17852.f53254.f29631 < 0) {
            int[] iArr2 = c10023.f27745;
            iArr2[0] = c10023.f27768;
            iArr2[1] = i2;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private int m17012(int i, C17852 c17852, CharSequence charSequence) {
        C10023 c10023 = this.f19237;
        int i2 = c10023.f27757;
        if (!c17852.f53260) {
            int i3 = c17852.f53276;
            if (i3 >= 0) {
                return m16948(i3, i, i2, charSequence);
            }
            int i4 = c17852.f53270;
            return i4 >= 0 ? m16949(i4, i, i2, c17852.f53273, charSequence) : m16952(i, i2, charSequence, c17852.f53268);
        }
        if (i >= i2) {
            c10023.f27755 = true;
            return -1;
        }
        if (charSequence.charAt(i) != c17852.f53269) {
            return -1;
        }
        int i5 = i + 1;
        if (i5 >= i2) {
            c10023.f27755 = true;
            return -1;
        }
        if (charSequence.charAt(i5) == c17852.f53263) {
            return i + 2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m16948(int i, int i2, int i3, CharSequence charSequence) {
        if (i2 >= i3) {
            this.f19237.f27755 = true;
            return -1;
        }
        if (charSequence.charAt(i2) == i) {
            return i2 + 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m16949(int i, int i2, int i3, InterfaceC12628 interfaceC12628, CharSequence charSequence) {
        if (i2 >= i3) {
            this.f19237.f27755 = true;
            return -1;
        }
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt >= 128 ? interfaceC12628 == null || !interfaceC12628.mo4821(cCharAt) : cCharAt != i) {
            return -1;
        }
        return i2 + 1;
    }

    /* JADX INFO: renamed from: ۧ */
    private int m16985(int i, C17852 c17852, CharSequence charSequence) {
        int iM16949;
        C10023 c10023 = this.f19237;
        int i2 = c10023.f27757;
        int i3 = c17852.f53261;
        if (i3 >= 0) {
            iM16949 = m16948(i3, i, i2, charSequence);
        } else {
            int i4 = c17852.f53255;
            iM16949 = i4 >= 0 ? m16949(i4, i, i2, c17852.f53266, charSequence) : m16952(i, i2, charSequence, c17852.f53259);
        }
        if (iM16949 < 0) {
            return -1;
        }
        if (c10023.f27733 != 1 || iM16949 == c10023.f27757) {
            return iM16949;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m17001(int i) {
        C10023 c10023 = this.f19237;
        int[] iArr = c10023.f27745;
        iArr[0] = c10023.f27768;
        c10023.m23383(i);
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m17016(int i, CharSequence charSequence) {
        C11365 c11365 = this.f19241;
        int i2 = c11365.f31736;
        int[] iArr = c11365.f31731;
        Object[] objArr = c11365.f31729;
        C10023 c10023 = this.f19237;
        int i3 = c10023.f27757;
        while (true) {
            if (c10023.m23374()) {
                this.f19230 = true;
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
                                c10023.f27755 = true;
                                return false;
                            }
                            int i6 = i + 1;
                            if (iArr2[i5] == charSequence.charAt(i)) {
                                if (c10023.m23374()) {
                                    this.f19230 = true;
                                    return false;
                                }
                                i5++;
                                i = i6;
                            }
                        }
                        i2 = iArr[i2 + 1];
                    } else if (i4 == 4) {
                        InterfaceC12628 interfaceC12628 = (InterfaceC12628) objArr[iArr[i2 + 2]];
                        int i7 = i;
                        while (i7 < i3 && interfaceC12628.mo4821(charSequence.charAt(i7))) {
                            i7++;
                            if (c10023.m23374()) {
                                this.f19230 = true;
                                return false;
                            }
                        }
                        if (i7 >= i3) {
                            c10023.f27755 = true;
                        }
                        if (i7 - i >= iArr[i2 + 3]) {
                            i = i7;
                            i2 = iArr[i2 + 1];
                        }
                    } else {
                        if (i4 == 7) {
                            m16995(iArr[i2 + 2], i);
                        } else if (i4 == 8) {
                            int iM17007 = m17007(iArr[i2 + 2]);
                            if (iM17007 < 0) {
                                c10023.m23383(i);
                                return true;
                            }
                            int i8 = iArr[i2 + 3];
                            if (i8 != 0) {
                                m17009(i8, iM17007);
                                m17009(i8 + 1, i);
                            }
                        } else if (i4 == 11) {
                            continue;
                        } else if (i4 == 16) {
                            int i9 = i2 + 2;
                            if (C22764.m50944(iArr[i9], iArr[i2 + 3] != 0, c10023, i, charSequence)) {
                                if (iArr[i9] == 0) {
                                    m17014(Integer.MIN_VALUE, i);
                                }
                            }
                        } else if (i4 == 28 || i4 == 29) {
                            i = C3317.m5794((int[]) objArr[iArr[i2 + 2]], iArr[i2 + 3], c10023, charSequence, i);
                            if (i == -2) {
                                this.f19230 = true;
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
                        c10023.f27755 = true;
                        return false;
                    }
                    int i10 = i + 1;
                    if (((InterfaceC12628) objArr[iArr[i2 + 2]]).mo4821(charSequence.charAt(i))) {
                        i = i10;
                        i2 = iArr[i2 + 1];
                    }
                }
            } else if (c10023.f27733 != 1 || i == i3) {
                int[] iArr3 = c10023.f27745;
                iArr3[0] = c10023.f27768;
                c10023.m23383(i);
                iArr3[1] = i;
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m17010(int i, CharSequence charSequence) {
        C11365 c11365 = this.f19241;
        int i2 = c11365.f31736;
        int[] iArr = c11365.f31731;
        Object[] objArr = c11365.f31729;
        C10023 c10023 = this.f19237;
        int i3 = c10023.f27757;
        while (true) {
            if (c10023.m23374()) {
                this.f19230 = true;
                return false;
            }
            int i4 = iArr[i2];
            if (i4 != 1) {
                if (i4 != 16) {
                    if (i4 == 20) {
                        int iM16954 = m16954((C6000) objArr[iArr[i2 + 2]], charSequence, i, i3);
                        if (!this.f19230 && iM16954 >= 0) {
                            int[] iArr2 = c10023.f27745;
                            iArr2[0] = c10023.f27768;
                            c10023.m23383(iM16954);
                            iArr2[1] = iM16954;
                            return true;
                        }
                    } else if (i4 == 3) {
                        int[] iArr3 = (int[]) objArr[iArr[i2 + 2]];
                        int i5 = 0;
                        while (i5 < iArr3.length) {
                            if (i >= i3) {
                                c10023.f27755 = true;
                                return false;
                            }
                            int i6 = i + 1;
                            if (iArr3[i5] == charSequence.charAt(i)) {
                                if (c10023.m23374()) {
                                    this.f19230 = true;
                                    return false;
                                }
                                i5++;
                                i = i6;
                            }
                        }
                        i2 = iArr[i2 + 1];
                    } else if (i4 == 4) {
                        InterfaceC12628 interfaceC12628 = (InterfaceC12628) objArr[iArr[i2 + 2]];
                        int i7 = i;
                        while (i7 < i3 && interfaceC12628.mo4821(charSequence.charAt(i7))) {
                            i7++;
                            if (c10023.m23374()) {
                                this.f19230 = true;
                                return false;
                            }
                        }
                        if (i7 >= i3) {
                            c10023.f27755 = true;
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
                if (!C22764.m50944(iArr[i2 + 2], iArr[i2 + 3] != 0, c10023, i, charSequence)) {
                    return false;
                }
                i2 = iArr[i2 + 1];
            } else {
                if (i >= i3) {
                    c10023.f27755 = true;
                    return false;
                }
                int i8 = i + 1;
                if (!((InterfaceC12628) objArr[iArr[i2 + 2]]).mo4821(charSequence.charAt(i))) {
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
    
        if (p067l.C22764.m50946((p067l.C5644) r8[r7[r16 + 2]], r4, r9, r5) == false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013a, code lost:
    
        if (r9 == (-1)) goto L319;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m16991(int i, int i2, CharSequence charSequence) {
        int i3;
        C7341 c7341;
        CharSequence charSequence2;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int iM16984;
        int i7;
        C10023 c10023;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        C8682 c8682;
        int[] iArr2;
        int i13;
        int i14;
        int i15;
        boolean zM17005;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        Object[] objArr;
        int iM16952;
        boolean z;
        int i19;
        int i20;
        int i21;
        int iMax;
        boolean zM16978;
        int i22;
        int i23;
        boolean zM17017;
        int iM11539;
        int i24;
        int i25;
        C7341 c7342 = this;
        C11365 c11365 = c7342.f19241;
        int[] iArr3 = c11365.f31731;
        Object[] objArr2 = c11365.f31729;
        int i26 = i;
        int i27 = i2;
        CharSequence charSequence3 = charSequence;
        C7341 c7343 = c7342;
        boolean z2 = false;
        while (true) {
            int i28 = i26;
            int iCharCount = i27;
            CharSequence charSequence4 = charSequence3;
            int i29 = 0;
            int i30 = 0;
            while (true) {
                C10023 c10024 = c7343.f19237;
                if (c10024.m23374()) {
                    c7343.f19230 = true;
                    return z2;
                }
                int length = c10024.f27757;
                int i31 = i28 + 1;
                i3 = iArr3[i31];
                int i32 = iArr3[i28];
                if (i32 != 42) {
                    switch (i32) {
                        case 0:
                            c10024 = c10024;
                            c7341 = c7342;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            charSequence2 = charSequence4;
                            if (c10024.f27733 != 1 || iCharCount == length) {
                                if ((c10024.pattern().flags() & 512) != 0) {
                                    C7933 c7933 = C16057.f47257;
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
                                c10024.m23383(iCharCount);
                                int[] iArr4 = c10024.f27745;
                                iArr4[0] = c10024.f27768;
                                iArr4[1] = iCharCount;
                                return true;
                            }
                            while (true) {
                                i4 = c7343.f19238;
                                if (i4 == 0) {
                                    c7343.m16979(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c7343.m16979(c7343.f19242[i4 - 3]);
                                iArr = c7343.f19242;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM16984 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    if (zM17005) {
                                        i3 = c7343.f19235;
                                        iCharCount = c7343.f19240;
                                        charSequence4 = charSequence2;
                                    } else {
                                        c10023 = c10024;
                                        c10024 = c10023;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c10023 = c10024;
                                        if (i7 == 8) {
                                            c7343.f19238 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c7343.f19241.f31730) {
                                                c7343.m17014(~i8, i9 - 1);
                                                c7343.m17018(i8, i9);
                                            } else {
                                                c7343.m16995(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c8682.f23490;
                                            int i33 = i4 - 2;
                                            i13 = iArr[i33];
                                            iArr[i33] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c7343.f19238 = i5;
                                            }
                                            if (c10023.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                i3 = i14;
                                            } else {
                                                c10024 = c10023;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i34 = iArr[i11];
                                            int i35 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i34)];
                                            i12 = i34 & (i34 - 1);
                                            if (i12 == 0) {
                                                c7343.f19238 = i5;
                                            } else {
                                                c7343.f19242[i11] = i12;
                                            }
                                            i3 = i35;
                                        } else if (i7 == 6) {
                                            c7343.m17002(iArr[i4 - 2], iM16984);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            c7343.f19238 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c7343.f19238 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM16984;
                                        } else if (i7 == 1 || iM16984 <= iArr[i4 - 2]) {
                                            if (i7 == 2) {
                                                int iMax2 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                int[] iArr5 = c7343.f19242;
                                                iArr5[i6] = iMax2;
                                                int i36 = i4 - 1;
                                                i10 = iArr5[i36] - 1;
                                                iArr5[i36] = i10;
                                                if (i10 == 0) {
                                                    c7343.f19238 = i5;
                                                }
                                                iCharCount = iMax2;
                                            } else {
                                                c7343.f19238 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        } else {
                                            iArr[i6] = iM16984 - 1;
                                        }
                                    } else {
                                        if (c10024.m23374()) {
                                            c7343.f19230 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i37 = c7343.f19242[i15];
                                        c10023 = c10024;
                                        iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i37 - Character.charCount(Character.codePointBefore(charSequence2, i37)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (iM16984 < 0) {
                                            c7343.f19238 = i5;
                                            c10024 = c10023;
                                        } else {
                                            c7343.f19242[i15] = iM16984;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM16984;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            break;
                        case 1:
                            c10024 = c10024;
                            c7341 = c7342;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            charSequence2 = charSequence4;
                            if (iCharCount < length) {
                                if (((InterfaceC12628) objArr2[iArr3[i28 + 2]]).mo4821(charSequence2.charAt(iCharCount))) {
                                    iCharCount++;
                                }
                                charSequence4 = charSequence2;
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            } else {
                                c10024.f27755 = true;
                            }
                            while (true) {
                                i4 = c7343.f19238;
                                if (i4 == 0) {
                                    c7343.m16979(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c7343.m16979(c7343.f19242[i4 - 3]);
                                iArr = c7343.f19242;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM16984 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    if (zM17005) {
                                        c10023 = c10024;
                                        c10024 = c10023;
                                    } else {
                                        i3 = c7343.f19235;
                                        iCharCount = c7343.f19240;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c10023 = c10024;
                                        if (i7 == 8) {
                                            c7343.f19238 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c7343.f19241.f31730) {
                                                c7343.m17014(~i8, i9 - 1);
                                                c7343.m17018(i8, i9);
                                            } else {
                                                c7343.m16995(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c8682.f23490;
                                            int i38 = i4 - 2;
                                            i13 = iArr[i38];
                                            iArr[i38] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c7343.f19238 = i5;
                                            }
                                            if (c10023.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                c10024 = c10023;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i39 = iArr[i11];
                                            int i310 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i39)];
                                            i12 = i39 & (i39 - 1);
                                            if (i12 == 0) {
                                                c7343.f19238 = i5;
                                            } else {
                                                c7343.f19242[i11] = i12;
                                            }
                                            i3 = i310;
                                        } else if (i7 == 6) {
                                            c7343.m17002(iArr[i4 - 2], iM16984);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            c7343.f19238 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c7343.f19238 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM16984;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax3 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr6 = c7343.f19242;
                                                    iArr6[i6] = iMax3;
                                                    int i311 = i4 - 1;
                                                    i10 = iArr6[i311] - 1;
                                                    iArr6[i311] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax3;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax4 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                int[] iArr7 = c7343.f19242;
                                                iArr7[i6] = iMax4;
                                                int i312 = i4 - 1;
                                                i10 = iArr7[i312] - 1;
                                                iArr7[i312] = i10;
                                                if (i10 == 0) {
                                                    c7343.f19238 = i5;
                                                }
                                                iCharCount = iMax4;
                                            } else {
                                                c7343.f19238 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c10024.m23374()) {
                                            c7343.f19230 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i313 = c7343.f19242[i15];
                                        c10023 = c10024;
                                        iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i313 - Character.charCount(Character.codePointBefore(charSequence2, i313)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (iM16984 < 0) {
                                            c7343.f19238 = i5;
                                            c10024 = c10023;
                                        } else {
                                            c7343.f19242[i15] = iM16984;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM16984;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            break;
                        case 2:
                            c10024 = c10024;
                            c7341 = c7342;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            charSequence2 = charSequence4;
                            if (iCharCount < length) {
                                int iCodePointAt = Character.codePointAt(charSequence2, iCharCount);
                                iCharCount += Character.charCount(iCodePointAt);
                                if (iCharCount <= c10024.f27757) {
                                    if (((InterfaceC12628) objArr2[iArr3[i28 + 2]]).mo4821(iCodePointAt)) {
                                        charSequence4 = charSequence2;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c7342 = c7341;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                } else {
                                    c10024.f27755 = true;
                                }
                            } else {
                                c10024.f27755 = true;
                            }
                            while (true) {
                                i4 = c7343.f19238;
                                if (i4 == 0) {
                                    c7343.m16979(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c7343.m16979(c7343.f19242[i4 - 3]);
                                iArr = c7343.f19242;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM16984 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    if (zM17005) {
                                        c10023 = c10024;
                                        c10024 = c10023;
                                    } else {
                                        i3 = c7343.f19235;
                                        iCharCount = c7343.f19240;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c10023 = c10024;
                                        if (i7 == 8) {
                                            c7343.f19238 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c7343.f19241.f31730) {
                                                c7343.m17014(~i8, i9 - 1);
                                                c7343.m17018(i8, i9);
                                            } else {
                                                c7343.m16995(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c8682.f23490;
                                            int i314 = i4 - 2;
                                            i13 = iArr[i314];
                                            iArr[i314] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c7343.f19238 = i5;
                                            }
                                            if (c10023.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                c10024 = c10023;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i315 = iArr[i11];
                                            int i316 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i315)];
                                            i12 = i315 & (i315 - 1);
                                            if (i12 == 0) {
                                                c7343.f19238 = i5;
                                            } else {
                                                c7343.f19242[i11] = i12;
                                            }
                                            i3 = i316;
                                        } else if (i7 == 6) {
                                            c7343.m17002(iArr[i4 - 2], iM16984);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            c7343.f19238 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c7343.f19238 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM16984;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax5 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr8 = c7343.f19242;
                                                    iArr8[i6] = iMax5;
                                                    int i317 = i4 - 1;
                                                    i10 = iArr8[i317] - 1;
                                                    iArr8[i317] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax5;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax6 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                int[] iArr9 = c7343.f19242;
                                                iArr9[i6] = iMax6;
                                                int i318 = i4 - 1;
                                                i10 = iArr9[i318] - 1;
                                                iArr9[i318] = i10;
                                                if (i10 == 0) {
                                                    c7343.f19238 = i5;
                                                }
                                                iCharCount = iMax6;
                                            } else {
                                                c7343.f19238 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c10024.m23374()) {
                                            c7343.f19230 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i319 = c7343.f19242[i15];
                                        c10023 = c10024;
                                        iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i319 - Character.charCount(Character.codePointBefore(charSequence2, i319)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (iM16984 < 0) {
                                            c7343.f19238 = i5;
                                            c10024 = c10023;
                                        } else {
                                            c7343.f19242[i15] = iM16984;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM16984;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            break;
                        case 3:
                            c10024 = c10024;
                            c7341 = c7342;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            charSequence2 = charSequence4;
                            int[] iArr10 = (int[]) objArr2[iArr3[i28 + 2]];
                            int i40 = 0;
                            while (i40 < iArr10.length && (i16 = iCharCount + i40) < length && iArr10[i40] == charSequence2.charAt(i16)) {
                                i40++;
                                if (c10024.m23374()) {
                                    c7343.f19230 = true;
                                    return false;
                                }
                            }
                            if (i40 != iArr10.length) {
                                if (iCharCount + i40 >= length) {
                                    c10024.f27755 = true;
                                }
                                while (true) {
                                    i4 = c7343.f19238;
                                    if (i4 == 0) {
                                        c7343.m16979(0);
                                        return false;
                                    }
                                    i5 = i4 - 6;
                                    c7343.m16979(c7343.f19242[i4 - 3]);
                                    iArr = c7343.f19242;
                                    i3 = iArr[i4 - 5];
                                    i6 = i4 - 4;
                                    iM16984 = iArr[i6];
                                    i7 = iArr[i5];
                                    if (i7 == 7) {
                                        zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (zM17005) {
                                            c10023 = c10024;
                                            c10024 = c10023;
                                        } else {
                                            i3 = c7343.f19235;
                                            iCharCount = c7343.f19240;
                                        }
                                    } else {
                                        if (i7 == 9) {
                                            c10023 = c10024;
                                            if (i7 == 8) {
                                                c7343.f19238 = i5;
                                                i8 = iArr[i4 - 2];
                                                i9 = iArr[i4 - 1];
                                                if (c7343.f19241.f31730) {
                                                    c7343.m17014(~i8, i9 - 1);
                                                    c7343.m17018(i8, i9);
                                                } else {
                                                    c7343.m16995(i8, i9);
                                                }
                                            } else if (i7 == 3) {
                                                c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                iArr2 = c8682.f23490;
                                                int i3110 = i4 - 2;
                                                i13 = iArr[i3110];
                                                iArr[i3110] = i13 + 1;
                                                i14 = iArr2[i13];
                                                if (i13 == iArr2.length - 1) {
                                                    c7343.f19238 = i5;
                                                }
                                                if (c10023.m23374()) {
                                                    c7343.f19230 = true;
                                                    return false;
                                                }
                                                if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                    c10024 = c10023;
                                                } else {
                                                    i3 = i14;
                                                }
                                            } else if (i7 == 4) {
                                                i11 = i4 - 2;
                                                int i3111 = iArr[i11];
                                                int i3112 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i3111)];
                                                i12 = i3111 & (i3111 - 1);
                                                if (i12 == 0) {
                                                    c7343.f19238 = i5;
                                                } else {
                                                    c7343.f19242[i11] = i12;
                                                }
                                                i3 = i3112;
                                            } else if (i7 == 6) {
                                                c7343.m17002(iArr[i4 - 2], iM16984);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                c7343.f19238 = i5;
                                            } else if (i7 == 5) {
                                                i29 = iArr[i4 - 2];
                                                i30 = iArr[i4 - 1];
                                                c7343.f19238 = i5;
                                                charSequence4 = charSequence2;
                                                iCharCount = iM16984;
                                            } else if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax7 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr11 = c7343.f19242;
                                                    iArr11[i6] = iMax7;
                                                    int i3113 = i4 - 1;
                                                    i10 = iArr11[i3113] - 1;
                                                    iArr11[i3113] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax7;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax8 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                int[] iArr12 = c7343.f19242;
                                                iArr12[i6] = iMax8;
                                                int i3114 = i4 - 1;
                                                i10 = iArr12[i3114] - 1;
                                                iArr12[i3114] = i10;
                                                if (i10 == 0) {
                                                    c7343.f19238 = i5;
                                                }
                                                iCharCount = iMax8;
                                            } else {
                                                c7343.f19238 = i5;
                                            }
                                        } else {
                                            if (c10024.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            i15 = i4 - 1;
                                            int i3115 = c7343.f19242[i15];
                                            c10023 = c10024;
                                            iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i3115 - Character.charCount(Character.codePointBefore(charSequence2, i3115)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (iM16984 < 0) {
                                                c7343.f19238 = i5;
                                                c10024 = c10023;
                                            } else {
                                                c7343.f19242[i15] = iM16984;
                                                i14 = iArr3[i3 + 1];
                                                i3 = i14;
                                            }
                                        }
                                        iCharCount = iM16984;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c7342 = c7341;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            } else {
                                iCharCount += i40;
                            }
                            charSequence4 = charSequence2;
                            i28 = i3;
                            z2 = false;
                            c7342 = c7341;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 4:
                            c10024 = c10024;
                            c7341 = c7342;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            charSequence2 = charSequence4;
                            InterfaceC12628 interfaceC12628 = (InterfaceC12628) objArr2[iArr3[i28 + 2]];
                            int i41 = iCharCount;
                            while (i41 < length && interfaceC12628.mo4821(charSequence2.charAt(i41))) {
                                i41++;
                                if (c10024.m23374()) {
                                    c7343.f19230 = true;
                                    return false;
                                }
                            }
                            if (i41 >= length) {
                                c10024.f27755 = true;
                            }
                            int i42 = iArr3[i28 + 3];
                            if (i41 - iCharCount >= i42) {
                                int i43 = iCharCount + i42;
                                if (i41 > i43) {
                                    c7343.m16960(1, i3, i41 - 1, i43, 0);
                                }
                                z2 = false;
                                iCharCount = i41;
                                charSequence4 = charSequence2;
                                i28 = i3;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                c7342 = c7341;
                            } else {
                                while (true) {
                                    i4 = c7343.f19238;
                                    if (i4 == 0) {
                                        c7343.m16979(0);
                                        return false;
                                    }
                                    i5 = i4 - 6;
                                    c7343.m16979(c7343.f19242[i4 - 3]);
                                    iArr = c7343.f19242;
                                    i3 = iArr[i4 - 5];
                                    i6 = i4 - 4;
                                    iM16984 = iArr[i6];
                                    i7 = iArr[i5];
                                    if (i7 == 7) {
                                        zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (zM17005) {
                                            c10023 = c10024;
                                            c10024 = c10023;
                                        } else {
                                            i3 = c7343.f19235;
                                            iCharCount = c7343.f19240;
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (i7 == 9) {
                                            c10023 = c10024;
                                            if (i7 == 8) {
                                                c7343.f19238 = i5;
                                                i8 = iArr[i4 - 2];
                                                i9 = iArr[i4 - 1];
                                                if (c7343.f19241.f31730) {
                                                    c7343.m17014(~i8, i9 - 1);
                                                    c7343.m17018(i8, i9);
                                                } else {
                                                    c7343.m16995(i8, i9);
                                                }
                                            } else if (i7 == 3) {
                                                c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                iArr2 = c8682.f23490;
                                                int i3116 = i4 - 2;
                                                i13 = iArr[i3116];
                                                iArr[i3116] = i13 + 1;
                                                i14 = iArr2[i13];
                                                if (i13 == iArr2.length - 1) {
                                                    c7343.f19238 = i5;
                                                }
                                                if (c10023.m23374()) {
                                                    c7343.f19230 = true;
                                                    return false;
                                                }
                                                if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                    c10024 = c10023;
                                                } else {
                                                    i3 = i14;
                                                }
                                            } else if (i7 == 4) {
                                                i11 = i4 - 2;
                                                int i3117 = iArr[i11];
                                                int i3118 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i3117)];
                                                i12 = i3117 & (i3117 - 1);
                                                if (i12 == 0) {
                                                    c7343.f19238 = i5;
                                                } else {
                                                    c7343.f19242[i11] = i12;
                                                }
                                                i3 = i3118;
                                            } else if (i7 == 6) {
                                                c7343.m17002(iArr[i4 - 2], iM16984);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                c7343.f19238 = i5;
                                            } else if (i7 == 5) {
                                                i29 = iArr[i4 - 2];
                                                i30 = iArr[i4 - 1];
                                                c7343.f19238 = i5;
                                                charSequence4 = charSequence2;
                                                iCharCount = iM16984;
                                            } else {
                                                if (i7 == 1) {
                                                    if (i7 == 2) {
                                                        int iMax9 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                        int[] iArr13 = c7343.f19242;
                                                        iArr13[i6] = iMax9;
                                                        int i3119 = i4 - 1;
                                                        i10 = iArr13[i3119] - 1;
                                                        iArr13[i3119] = i10;
                                                        if (i10 == 0) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        iCharCount = iMax9;
                                                    } else {
                                                        c7343.f19238 = i5;
                                                    }
                                                } else if (i7 == 2) {
                                                    int iMax10 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr14 = c7343.f19242;
                                                    iArr14[i6] = iMax10;
                                                    int i31110 = i4 - 1;
                                                    i10 = iArr14[i31110] - 1;
                                                    iArr14[i31110] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax10;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (c10024.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            i15 = i4 - 1;
                                            int i31111 = c7343.f19242[i15];
                                            c10023 = c10024;
                                            iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i31111 - Character.charCount(Character.codePointBefore(charSequence2, i31111)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (iM16984 < 0) {
                                                c7343.f19238 = i5;
                                                c10024 = c10023;
                                            } else {
                                                c7343.f19242[i15] = iM16984;
                                                i14 = iArr3[i3 + 1];
                                                i3 = i14;
                                            }
                                        }
                                        iCharCount = iM16984;
                                        charSequence4 = charSequence2;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c7342 = c7341;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            }
                            break;
                        case 5:
                        case 33:
                            c10024 = c10024;
                            c7341 = c7342;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            charSequence2 = charSequence4;
                            InterfaceC12628 interfaceC12629 = (InterfaceC12628) objArr2[iArr3[i28 + 2]];
                            boolean z4 = i32 == 33;
                            int i44 = 0;
                            int i45 = iCharCount;
                            while (i45 < length) {
                                int iCodePointAt2 = Character.codePointAt(charSequence2, i45);
                                int iCharCount2 = Character.charCount(iCodePointAt2);
                                if (i45 + iCharCount2 > length) {
                                    c10024.f27755 = true;
                                    if (!z4) {
                                        iCodePointAt2 = charSequence2.charAt(i45);
                                    }
                                    iCharCount2 = 1;
                                }
                                if (!interfaceC12629.mo4821(iCodePointAt2)) {
                                    if (i45 >= length) {
                                        c10024.f27755 = true;
                                    }
                                    i17 = iArr3[i28 + 3];
                                    if (i44 < i17) {
                                        while (true) {
                                            i4 = c7343.f19238;
                                            if (i4 == 0) {
                                                c7343.m16979(0);
                                                return false;
                                            }
                                            i5 = i4 - 6;
                                            c7343.m16979(c7343.f19242[i4 - 3]);
                                            iArr = c7343.f19242;
                                            i3 = iArr[i4 - 5];
                                            i6 = i4 - 4;
                                            iM16984 = iArr[i6];
                                            i7 = iArr[i5];
                                            if (i7 == 7) {
                                                zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                if (zM17005) {
                                                    c10023 = c10024;
                                                    c10024 = c10023;
                                                } else {
                                                    i3 = c7343.f19235;
                                                    iCharCount = c7343.f19240;
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (i7 == 9) {
                                                    c10023 = c10024;
                                                    if (i7 == 8) {
                                                        c7343.f19238 = i5;
                                                        i8 = iArr[i4 - 2];
                                                        i9 = iArr[i4 - 1];
                                                        if (c7343.f19241.f31730) {
                                                            c7343.m17014(~i8, i9 - 1);
                                                            c7343.m17018(i8, i9);
                                                        } else {
                                                            c7343.m16995(i8, i9);
                                                        }
                                                    } else if (i7 == 3) {
                                                        c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                        iArr2 = c8682.f23490;
                                                        int i31112 = i4 - 2;
                                                        i13 = iArr[i31112];
                                                        iArr[i31112] = i13 + 1;
                                                        i14 = iArr2[i13];
                                                        if (i13 == iArr2.length - 1) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        if (c10023.m23374()) {
                                                            c7343.f19230 = true;
                                                            return false;
                                                        }
                                                        if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                            c10024 = c10023;
                                                        } else {
                                                            i3 = i14;
                                                        }
                                                    } else if (i7 == 4) {
                                                        i11 = i4 - 2;
                                                        int i31113 = iArr[i11];
                                                        int i31114 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i31113)];
                                                        i12 = i31113 & (i31113 - 1);
                                                        if (i12 == 0) {
                                                            c7343.f19238 = i5;
                                                        } else {
                                                            c7343.f19242[i11] = i12;
                                                        }
                                                        i3 = i31114;
                                                    } else if (i7 == 6) {
                                                        c7343.m17002(iArr[i4 - 2], iM16984);
                                                        if (c7343.f19230) {
                                                            return false;
                                                        }
                                                        c7343.f19238 = i5;
                                                    } else if (i7 == 5) {
                                                        i29 = iArr[i4 - 2];
                                                        i30 = iArr[i4 - 1];
                                                        c7343.f19238 = i5;
                                                        charSequence4 = charSequence2;
                                                        iCharCount = iM16984;
                                                    } else {
                                                        if (i7 == 1) {
                                                            if (i7 == 2) {
                                                                int iMax11 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                                int[] iArr15 = c7343.f19242;
                                                                iArr15[i6] = iMax11;
                                                                int i31115 = i4 - 1;
                                                                i10 = iArr15[i31115] - 1;
                                                                iArr15[i31115] = i10;
                                                                if (i10 == 0) {
                                                                    c7343.f19238 = i5;
                                                                }
                                                                iCharCount = iMax11;
                                                            } else {
                                                                c7343.f19238 = i5;
                                                            }
                                                        } else if (i7 == 2) {
                                                            int iMax12 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                            int[] iArr16 = c7343.f19242;
                                                            iArr16[i6] = iMax12;
                                                            int i31116 = i4 - 1;
                                                            i10 = iArr16[i31116] - 1;
                                                            iArr16[i31116] = i10;
                                                            if (i10 == 0) {
                                                                c7343.f19238 = i5;
                                                            }
                                                            iCharCount = iMax12;
                                                        } else {
                                                            c7343.f19238 = i5;
                                                        }
                                                        charSequence4 = charSequence2;
                                                    }
                                                } else {
                                                    if (c10024.m23374()) {
                                                        c7343.f19230 = true;
                                                        return false;
                                                    }
                                                    i15 = i4 - 1;
                                                    int i31117 = c7343.f19242[i15];
                                                    c10023 = c10024;
                                                    iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i31117 - Character.charCount(Character.codePointBefore(charSequence2, i31117)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                                    if (c7343.f19230) {
                                                        return false;
                                                    }
                                                    if (iM16984 < 0) {
                                                        c7343.f19238 = i5;
                                                        c10024 = c10023;
                                                    } else {
                                                        c7343.f19242[i15] = iM16984;
                                                        i14 = iArr3[i3 + 1];
                                                        i3 = i14;
                                                    }
                                                }
                                                iCharCount = iM16984;
                                                charSequence4 = charSequence2;
                                            }
                                        }
                                    } else {
                                        if (i44 > i17) {
                                            c7343.m16960(2, i3, i45, iCharCount, i44 - i17);
                                        }
                                        charSequence4 = charSequence2;
                                        iCharCount = i45;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c7342 = c7341;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                } else {
                                    i45 += iCharCount2;
                                    i44++;
                                    if (c10024.m23374()) {
                                        c7343.f19230 = true;
                                        return false;
                                    }
                                }
                                break;
                            }
                            if (i45 >= length) {
                                c10024.f27755 = true;
                            }
                            i17 = iArr3[i28 + 3];
                            if (i44 < i17) {
                                while (true) {
                                    i4 = c7343.f19238;
                                    if (i4 == 0) {
                                        c7343.m16979(0);
                                        return false;
                                    }
                                    i5 = i4 - 6;
                                    c7343.m16979(c7343.f19242[i4 - 3]);
                                    iArr = c7343.f19242;
                                    i3 = iArr[i4 - 5];
                                    i6 = i4 - 4;
                                    iM16984 = iArr[i6];
                                    i7 = iArr[i5];
                                    if (i7 == 7) {
                                        zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (zM17005) {
                                            c10023 = c10024;
                                            c10024 = c10023;
                                        } else {
                                            i3 = c7343.f19235;
                                            iCharCount = c7343.f19240;
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (i7 == 9) {
                                            c10023 = c10024;
                                            if (i7 == 8) {
                                                c7343.f19238 = i5;
                                                i8 = iArr[i4 - 2];
                                                i9 = iArr[i4 - 1];
                                                if (c7343.f19241.f31730) {
                                                    c7343.m17014(~i8, i9 - 1);
                                                    c7343.m17018(i8, i9);
                                                } else {
                                                    c7343.m16995(i8, i9);
                                                }
                                            } else if (i7 == 3) {
                                                c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                iArr2 = c8682.f23490;
                                                int i31118 = i4 - 2;
                                                i13 = iArr[i31118];
                                                iArr[i31118] = i13 + 1;
                                                i14 = iArr2[i13];
                                                if (i13 == iArr2.length - 1) {
                                                    c7343.f19238 = i5;
                                                }
                                                if (c10023.m23374()) {
                                                    c7343.f19230 = true;
                                                    return false;
                                                }
                                                if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                    c10024 = c10023;
                                                } else {
                                                    i3 = i14;
                                                }
                                            } else if (i7 == 4) {
                                                i11 = i4 - 2;
                                                int i31119 = iArr[i11];
                                                int i311110 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i31119)];
                                                i12 = i31119 & (i31119 - 1);
                                                if (i12 == 0) {
                                                    c7343.f19238 = i5;
                                                } else {
                                                    c7343.f19242[i11] = i12;
                                                }
                                                i3 = i311110;
                                            } else if (i7 == 6) {
                                                c7343.m17002(iArr[i4 - 2], iM16984);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                c7343.f19238 = i5;
                                            } else if (i7 == 5) {
                                                i29 = iArr[i4 - 2];
                                                i30 = iArr[i4 - 1];
                                                c7343.f19238 = i5;
                                                charSequence4 = charSequence2;
                                                iCharCount = iM16984;
                                            } else {
                                                if (i7 == 1) {
                                                    if (i7 == 2) {
                                                        int iMax13 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                        int[] iArr17 = c7343.f19242;
                                                        iArr17[i6] = iMax13;
                                                        int i311111 = i4 - 1;
                                                        i10 = iArr17[i311111] - 1;
                                                        iArr17[i311111] = i10;
                                                        if (i10 == 0) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        iCharCount = iMax13;
                                                    } else {
                                                        c7343.f19238 = i5;
                                                    }
                                                } else if (i7 == 2) {
                                                    int iMax14 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr18 = c7343.f19242;
                                                    iArr18[i6] = iMax14;
                                                    int i311112 = i4 - 1;
                                                    i10 = iArr18[i311112] - 1;
                                                    iArr18[i311112] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax14;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (c10024.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            i15 = i4 - 1;
                                            int i311113 = c7343.f19242[i15];
                                            c10023 = c10024;
                                            iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i311113 - Character.charCount(Character.codePointBefore(charSequence2, i311113)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (iM16984 < 0) {
                                                c7343.f19238 = i5;
                                                c10024 = c10023;
                                            } else {
                                                c7343.f19242[i15] = iM16984;
                                                i14 = iArr3[i3 + 1];
                                                i3 = i14;
                                            }
                                        }
                                        iCharCount = iM16984;
                                        charSequence4 = charSequence2;
                                    }
                                }
                            } else {
                                if (i44 > i17) {
                                    c7343.m16960(2, i3, i45, iCharCount, i44 - i17);
                                }
                                charSequence4 = charSequence2;
                                iCharCount = i45;
                            }
                            i28 = i3;
                            z2 = false;
                            c7342 = c7341;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 6:
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            C8682 c8683 = (C8682) objArr2[iArr3[i28 + 2]];
                            if (iCharCount < length && c8683.f23488 != null && (cCharAt = charSequence2.charAt(iCharCount)) < 128) {
                                int i46 = c8683.f23488[cCharAt];
                                if (i46 != 0) {
                                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i46);
                                    int i47 = i46 & (i46 - 1);
                                    if (i47 != 0) {
                                        c7343.m16960(4, i28, iCharCount, i47, 0);
                                    }
                                    i3 = c8683.f23490[iNumberOfTrailingZeros];
                                    c7341 = this;
                                }
                                c7341 = this;
                                c10024 = c10024;
                                while (true) {
                                    i4 = c7343.f19238;
                                    if (i4 == 0) {
                                        c7343.m16979(0);
                                        return false;
                                    }
                                    i5 = i4 - 6;
                                    c7343.m16979(c7343.f19242[i4 - 3]);
                                    iArr = c7343.f19242;
                                    i3 = iArr[i4 - 5];
                                    i6 = i4 - 4;
                                    iM16984 = iArr[i6];
                                    i7 = iArr[i5];
                                    if (i7 == 7) {
                                        zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (zM17005) {
                                            c10023 = c10024;
                                            c10024 = c10023;
                                        } else {
                                            i3 = c7343.f19235;
                                            iCharCount = c7343.f19240;
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (i7 == 9) {
                                            c10023 = c10024;
                                            if (i7 == 8) {
                                                c7343.f19238 = i5;
                                                i8 = iArr[i4 - 2];
                                                i9 = iArr[i4 - 1];
                                                if (c7343.f19241.f31730) {
                                                    c7343.m17014(~i8, i9 - 1);
                                                    c7343.m17018(i8, i9);
                                                } else {
                                                    c7343.m16995(i8, i9);
                                                }
                                            } else if (i7 == 3) {
                                                c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                iArr2 = c8682.f23490;
                                                int i311114 = i4 - 2;
                                                i13 = iArr[i311114];
                                                iArr[i311114] = i13 + 1;
                                                i14 = iArr2[i13];
                                                if (i13 == iArr2.length - 1) {
                                                    c7343.f19238 = i5;
                                                }
                                                if (c10023.m23374()) {
                                                    c7343.f19230 = true;
                                                    return false;
                                                }
                                                if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                    c10024 = c10023;
                                                } else {
                                                    i3 = i14;
                                                }
                                            } else if (i7 == 4) {
                                                i11 = i4 - 2;
                                                int i311115 = iArr[i11];
                                                int i311116 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i311115)];
                                                i12 = i311115 & (i311115 - 1);
                                                if (i12 == 0) {
                                                    c7343.f19238 = i5;
                                                } else {
                                                    c7343.f19242[i11] = i12;
                                                }
                                                i3 = i311116;
                                            } else if (i7 == 6) {
                                                c7343.m17002(iArr[i4 - 2], iM16984);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                c7343.f19238 = i5;
                                            } else if (i7 == 5) {
                                                i29 = iArr[i4 - 2];
                                                i30 = iArr[i4 - 1];
                                                c7343.f19238 = i5;
                                                charSequence4 = charSequence2;
                                                iCharCount = iM16984;
                                            } else {
                                                if (i7 == 1) {
                                                    if (i7 == 2) {
                                                        int iMax15 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                        int[] iArr19 = c7343.f19242;
                                                        iArr19[i6] = iMax15;
                                                        int i311117 = i4 - 1;
                                                        i10 = iArr19[i311117] - 1;
                                                        iArr19[i311117] = i10;
                                                        if (i10 == 0) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        iCharCount = iMax15;
                                                    } else {
                                                        c7343.f19238 = i5;
                                                    }
                                                } else if (i7 == 2) {
                                                    int iMax16 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr110 = c7343.f19242;
                                                    iArr110[i6] = iMax16;
                                                    int i311118 = i4 - 1;
                                                    i10 = iArr110[i311118] - 1;
                                                    iArr110[i311118] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax16;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (c10024.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            i15 = i4 - 1;
                                            int i311119 = c7343.f19242[i15];
                                            c10023 = c10024;
                                            iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i311119 - Character.charCount(Character.codePointBefore(charSequence2, i311119)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (iM16984 < 0) {
                                                c7343.f19238 = i5;
                                                c10024 = c10023;
                                            } else {
                                                c7343.f19242[i15] = iM16984;
                                                i14 = iArr3[i3 + 1];
                                                i3 = i14;
                                            }
                                        }
                                        iCharCount = iM16984;
                                        charSequence4 = charSequence2;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c7342 = c7341;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            } else {
                                if (c8683.f23490.length > 1) {
                                    m16960(3, i28, iCharCount, 1, 0);
                                }
                                c7341 = this;
                                if (!c7341.m16971(c8683, 0, iCharCount, charSequence2)) {
                                    c7343 = c7341;
                                    while (true) {
                                        i4 = c7343.f19238;
                                        if (i4 == 0) {
                                            c7343.m16979(0);
                                            return false;
                                        }
                                        i5 = i4 - 6;
                                        c7343.m16979(c7343.f19242[i4 - 3]);
                                        iArr = c7343.f19242;
                                        i3 = iArr[i4 - 5];
                                        i6 = i4 - 4;
                                        iM16984 = iArr[i6];
                                        i7 = iArr[i5];
                                        if (i7 == 7) {
                                            zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (zM17005) {
                                                c10023 = c10024;
                                                c10024 = c10023;
                                            } else {
                                                i3 = c7343.f19235;
                                                iCharCount = c7343.f19240;
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (i7 == 9) {
                                                c10023 = c10024;
                                                if (i7 == 8) {
                                                    c7343.f19238 = i5;
                                                    i8 = iArr[i4 - 2];
                                                    i9 = iArr[i4 - 1];
                                                    if (c7343.f19241.f31730) {
                                                        c7343.m17014(~i8, i9 - 1);
                                                        c7343.m17018(i8, i9);
                                                    } else {
                                                        c7343.m16995(i8, i9);
                                                    }
                                                } else if (i7 == 3) {
                                                    c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                    iArr2 = c8682.f23490;
                                                    int i3111110 = i4 - 2;
                                                    i13 = iArr[i3111110];
                                                    iArr[i3111110] = i13 + 1;
                                                    i14 = iArr2[i13];
                                                    if (i13 == iArr2.length - 1) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    if (c10023.m23374()) {
                                                        c7343.f19230 = true;
                                                        return false;
                                                    }
                                                    if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                        c10024 = c10023;
                                                    } else {
                                                        i3 = i14;
                                                    }
                                                } else if (i7 == 4) {
                                                    i11 = i4 - 2;
                                                    int i3111111 = iArr[i11];
                                                    int i3111112 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i3111111)];
                                                    i12 = i3111111 & (i3111111 - 1);
                                                    if (i12 == 0) {
                                                        c7343.f19238 = i5;
                                                    } else {
                                                        c7343.f19242[i11] = i12;
                                                    }
                                                    i3 = i3111112;
                                                } else if (i7 == 6) {
                                                    c7343.m17002(iArr[i4 - 2], iM16984);
                                                    if (c7343.f19230) {
                                                        return false;
                                                    }
                                                    c7343.f19238 = i5;
                                                } else if (i7 == 5) {
                                                    i29 = iArr[i4 - 2];
                                                    i30 = iArr[i4 - 1];
                                                    c7343.f19238 = i5;
                                                    charSequence4 = charSequence2;
                                                    iCharCount = iM16984;
                                                } else {
                                                    if (i7 == 1) {
                                                        if (i7 == 2) {
                                                            int iMax17 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                            int[] iArr111 = c7343.f19242;
                                                            iArr111[i6] = iMax17;
                                                            int i3111113 = i4 - 1;
                                                            i10 = iArr111[i3111113] - 1;
                                                            iArr111[i3111113] = i10;
                                                            if (i10 == 0) {
                                                                c7343.f19238 = i5;
                                                            }
                                                            iCharCount = iMax17;
                                                        } else {
                                                            c7343.f19238 = i5;
                                                        }
                                                    } else if (i7 == 2) {
                                                        int iMax18 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                        int[] iArr112 = c7343.f19242;
                                                        iArr112[i6] = iMax18;
                                                        int i3111114 = i4 - 1;
                                                        i10 = iArr112[i3111114] - 1;
                                                        iArr112[i3111114] = i10;
                                                        if (i10 == 0) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        iCharCount = iMax18;
                                                    } else {
                                                        c7343.f19238 = i5;
                                                    }
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (c10024.m23374()) {
                                                    c7343.f19230 = true;
                                                    return false;
                                                }
                                                i15 = i4 - 1;
                                                int i3111115 = c7343.f19242[i15];
                                                c10023 = c10024;
                                                iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i3111115 - Character.charCount(Character.codePointBefore(charSequence2, i3111115)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                if (iM16984 < 0) {
                                                    c7343.f19238 = i5;
                                                    c10024 = c10023;
                                                } else {
                                                    c7343.f19242[i15] = iM16984;
                                                    i14 = iArr3[i3 + 1];
                                                    i3 = i14;
                                                }
                                            }
                                            iCharCount = iM16984;
                                            charSequence4 = charSequence2;
                                        }
                                        i28 = i3;
                                        z2 = false;
                                        c7342 = c7341;
                                        objArr2 = objArr2;
                                        iArr3 = iArr3;
                                    }
                                } else {
                                    i3 = c8683.f23490[0];
                                }
                            }
                            c7343 = c7341;
                            charSequence4 = charSequence2;
                            i28 = i3;
                            z2 = false;
                            c7342 = c7341;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 7:
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            if (c7343.f19241.f31730) {
                                int i48 = i28 + 2;
                                c7343.m16980(iArr3[i48]);
                                c7343.m17018(iArr3[i48], iCharCount);
                            } else {
                                c7343.m16995(iArr3[i28 + 2], iCharCount);
                            }
                            c7341 = this;
                            charSequence4 = charSequence2;
                            i28 = i3;
                            z2 = false;
                            c7342 = c7341;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 8:
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            int iM17007 = c7343.m17007(iArr3[i28 + 2]);
                            if (iM17007 < 0) {
                                c10024.m23383(iCharCount);
                                if (c7343.f19244 < 0) {
                                    return true;
                                }
                                if (!c7343.m16978(true)) {
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    c7341 = this;
                                    c10024 = c10024;
                                    while (true) {
                                        i4 = c7343.f19238;
                                        if (i4 == 0) {
                                            c7343.m16979(0);
                                            return false;
                                        }
                                        i5 = i4 - 6;
                                        c7343.m16979(c7343.f19242[i4 - 3]);
                                        iArr = c7343.f19242;
                                        i3 = iArr[i4 - 5];
                                        i6 = i4 - 4;
                                        iM16984 = iArr[i6];
                                        i7 = iArr[i5];
                                        if (i7 == 7) {
                                            zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (zM17005) {
                                                c10023 = c10024;
                                                c10024 = c10023;
                                            } else {
                                                i3 = c7343.f19235;
                                                iCharCount = c7343.f19240;
                                            }
                                        } else {
                                            if (i7 == 9) {
                                                c10023 = c10024;
                                                if (i7 == 8) {
                                                    c7343.f19238 = i5;
                                                    i8 = iArr[i4 - 2];
                                                    i9 = iArr[i4 - 1];
                                                    if (c7343.f19241.f31730) {
                                                        c7343.m17014(~i8, i9 - 1);
                                                        c7343.m17018(i8, i9);
                                                    } else {
                                                        c7343.m16995(i8, i9);
                                                    }
                                                } else if (i7 == 3) {
                                                    c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                    iArr2 = c8682.f23490;
                                                    int i3111116 = i4 - 2;
                                                    i13 = iArr[i3111116];
                                                    iArr[i3111116] = i13 + 1;
                                                    i14 = iArr2[i13];
                                                    if (i13 == iArr2.length - 1) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    if (c10023.m23374()) {
                                                        c7343.f19230 = true;
                                                        return false;
                                                    }
                                                    if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                        c10024 = c10023;
                                                    } else {
                                                        i3 = i14;
                                                    }
                                                } else if (i7 == 4) {
                                                    i11 = i4 - 2;
                                                    int i3111117 = iArr[i11];
                                                    int i3111118 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i3111117)];
                                                    i12 = i3111117 & (i3111117 - 1);
                                                    if (i12 == 0) {
                                                        c7343.f19238 = i5;
                                                    } else {
                                                        c7343.f19242[i11] = i12;
                                                    }
                                                    i3 = i3111118;
                                                } else if (i7 == 6) {
                                                    c7343.m17002(iArr[i4 - 2], iM16984);
                                                    if (c7343.f19230) {
                                                        return false;
                                                    }
                                                    c7343.f19238 = i5;
                                                } else if (i7 == 5) {
                                                    i29 = iArr[i4 - 2];
                                                    i30 = iArr[i4 - 1];
                                                    c7343.f19238 = i5;
                                                    charSequence4 = charSequence2;
                                                    iCharCount = iM16984;
                                                } else if (i7 == 1) {
                                                    if (i7 == 2) {
                                                        int iMax19 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                        int[] iArr113 = c7343.f19242;
                                                        iArr113[i6] = iMax19;
                                                        int i3111119 = i4 - 1;
                                                        i10 = iArr113[i3111119] - 1;
                                                        iArr113[i3111119] = i10;
                                                        if (i10 == 0) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        iCharCount = iMax19;
                                                    } else {
                                                        c7343.f19238 = i5;
                                                    }
                                                } else if (i7 == 2) {
                                                    int iMax110 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr114 = c7343.f19242;
                                                    iArr114[i6] = iMax110;
                                                    int i31111110 = i4 - 1;
                                                    i10 = iArr114[i31111110] - 1;
                                                    iArr114[i31111110] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax110;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                            } else {
                                                if (c10024.m23374()) {
                                                    c7343.f19230 = true;
                                                    return false;
                                                }
                                                i15 = i4 - 1;
                                                int i31111111 = c7343.f19242[i15];
                                                c10023 = c10024;
                                                iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i31111111 - Character.charCount(Character.codePointBefore(charSequence2, i31111111)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                if (iM16984 < 0) {
                                                    c7343.f19238 = i5;
                                                    c10024 = c10023;
                                                } else {
                                                    c7343.f19242[i15] = iM16984;
                                                    i14 = iArr3[i3 + 1];
                                                    i3 = i14;
                                                }
                                            }
                                            iCharCount = iM16984;
                                        }
                                        i28 = i3;
                                        z2 = false;
                                        c7342 = c7341;
                                        objArr2 = objArr2;
                                        iArr3 = iArr3;
                                    }
                                } else {
                                    int i49 = c7343.f19235;
                                    iCharCount = c7343.f19240;
                                    c7341 = this;
                                    i3 = i49;
                                }
                            } else {
                                int i50 = iArr3[i28 + 3];
                                if (i50 != 0 || c7343.f19241.f31730) {
                                    c7343.m17009(i50, iM17007);
                                    c7343.m17009(i50 + 1, iCharCount);
                                }
                                c7341 = this;
                            }
                            charSequence4 = charSequence2;
                            i28 = i3;
                            z2 = false;
                            c7342 = c7341;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 9:
                        case 18:
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            if (c7343.f19241.f31730) {
                                if (i32 == 18) {
                                    int i51 = iArr3[i28 + 7];
                                    C24158[] c24158Arr = c10024.f27732;
                                    if (c24158Arr[i51] == null) {
                                        c24158Arr[i51] = f19225;
                                    }
                                }
                                c7343.m16980(iArr3[i28 + 2]);
                            }
                            if (iArr3[i28 + 4] == 0) {
                                if (iArr3[i28 + 5] == 0) {
                                    charSequence2 = charSequence2;
                                } else {
                                    c7343.m16960(0, i3, iCharCount, 0, 0);
                                }
                                c7341 = this;
                                charSequence4 = charSequence2;
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            int i52 = iArr3[i28 + 2];
                            if (c7343.f19241.f31730) {
                                c7343.m17018(i52, 1);
                            } else {
                                c7343.m16995(i52, 1);
                            }
                            if (iArr3[i28] == 9 && iArr3[i28 + 7] != 0) {
                                c7343.m16995(iArr3[i28 + 3], iCharCount);
                            }
                            i3 = iArr3[i28 + 6];
                            c7341 = this;
                            charSequence4 = charSequence2;
                            i28 = i3;
                            z2 = false;
                            c7342 = c7341;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 10:
                        case 19:
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            int i53 = i28 + 3;
                            if (iCharCount > c7343.m17007(iArr3[i53])) {
                                if (!c7343.m16996()) {
                                    int i54 = i28 + 2;
                                    int iM17008 = c7343.m17007(iArr3[i54]);
                                    if (iM17008 < iArr3[i28 + 5]) {
                                        if (iM17008 >= iArr3[i28 + 4]) {
                                            if (iArr3[i28] == 19) {
                                                int i55 = i28 + 7;
                                                boolean zM16990 = c7343.m16990(iArr3[i55], iCharCount);
                                                if (!c7343.f19230) {
                                                    if (zM16990) {
                                                        c7341 = this;
                                                        charSequence2 = charSequence4;
                                                        charSequence4 = charSequence2;
                                                    } else {
                                                        c7343.m16960(6, i3, iCharCount, iArr3[i55], 0);
                                                    }
                                                }
                                            } else {
                                                m16960(0, i3, iCharCount, 0, 0);
                                            }
                                            c7343 = this;
                                        } else {
                                            iM17008 = iM17008;
                                            charSequence4 = charSequence4;
                                        }
                                        c7343.m16995(iArr3[i54], iM17008 + 1);
                                        if (iArr3[i28] == 10 && iArr3[i28 + 7] != 0) {
                                            c7343.m16995(iArr3[i53], iCharCount);
                                        }
                                        i3 = iArr3[i28 + 6];
                                        c7341 = this;
                                        charSequence4 = charSequence4;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c7342 = c7341;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                    break;
                                }
                                return false;
                            }
                            charSequence2 = charSequence4;
                            charSequence2 = charSequence2;
                            c7341 = this;
                            charSequence4 = charSequence2;
                            i28 = i3;
                            z2 = false;
                            c7342 = c7341;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 11:
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            charSequence2 = charSequence4;
                            c7341 = this;
                            charSequence4 = charSequence2;
                            i28 = i3;
                            z2 = false;
                            c7342 = c7341;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 12:
                        case 13:
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            if (i32 == 12) {
                                if (iCharCount >= length) {
                                    c10024.f27755 = true;
                                } else if (((InterfaceC12628) objArr2[iArr3[i28 + 2]]).mo4821(charSequence4.charAt(iCharCount))) {
                                    i18 = iCharCount + 1;
                                }
                                c7341 = this;
                                c10024 = c10024;
                                charSequence2 = charSequence4;
                                while (true) {
                                    i4 = c7343.f19238;
                                    if (i4 == 0) {
                                        c7343.m16979(0);
                                        return false;
                                    }
                                    i5 = i4 - 6;
                                    c7343.m16979(c7343.f19242[i4 - 3]);
                                    iArr = c7343.f19242;
                                    i3 = iArr[i4 - 5];
                                    i6 = i4 - 4;
                                    iM16984 = iArr[i6];
                                    i7 = iArr[i5];
                                    if (i7 == 7) {
                                        zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (zM17005) {
                                            c10023 = c10024;
                                            c10024 = c10023;
                                        } else {
                                            i3 = c7343.f19235;
                                            iCharCount = c7343.f19240;
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (i7 == 9) {
                                            c10023 = c10024;
                                            if (i7 == 8) {
                                                c7343.f19238 = i5;
                                                i8 = iArr[i4 - 2];
                                                i9 = iArr[i4 - 1];
                                                if (c7343.f19241.f31730) {
                                                    c7343.m17014(~i8, i9 - 1);
                                                    c7343.m17018(i8, i9);
                                                } else {
                                                    c7343.m16995(i8, i9);
                                                }
                                            } else if (i7 == 3) {
                                                c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                iArr2 = c8682.f23490;
                                                int i31111112 = i4 - 2;
                                                i13 = iArr[i31111112];
                                                iArr[i31111112] = i13 + 1;
                                                i14 = iArr2[i13];
                                                if (i13 == iArr2.length - 1) {
                                                    c7343.f19238 = i5;
                                                }
                                                if (c10023.m23374()) {
                                                    c7343.f19230 = true;
                                                    return false;
                                                }
                                                if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                    c10024 = c10023;
                                                } else {
                                                    i3 = i14;
                                                }
                                            } else if (i7 == 4) {
                                                i11 = i4 - 2;
                                                int i31111113 = iArr[i11];
                                                int i31111114 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i31111113)];
                                                i12 = i31111113 & (i31111113 - 1);
                                                if (i12 == 0) {
                                                    c7343.f19238 = i5;
                                                } else {
                                                    c7343.f19242[i11] = i12;
                                                }
                                                i3 = i31111114;
                                            } else if (i7 == 6) {
                                                c7343.m17002(iArr[i4 - 2], iM16984);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                c7343.f19238 = i5;
                                            } else if (i7 == 5) {
                                                i29 = iArr[i4 - 2];
                                                i30 = iArr[i4 - 1];
                                                c7343.f19238 = i5;
                                                charSequence4 = charSequence2;
                                                iCharCount = iM16984;
                                            } else {
                                                if (i7 == 1) {
                                                    if (i7 == 2) {
                                                        int iMax111 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                        int[] iArr115 = c7343.f19242;
                                                        iArr115[i6] = iMax111;
                                                        int i31111115 = i4 - 1;
                                                        i10 = iArr115[i31111115] - 1;
                                                        iArr115[i31111115] = i10;
                                                        if (i10 == 0) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        iCharCount = iMax111;
                                                    } else {
                                                        c7343.f19238 = i5;
                                                    }
                                                } else if (i7 == 2) {
                                                    int iMax112 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr116 = c7343.f19242;
                                                    iArr116[i6] = iMax112;
                                                    int i31111116 = i4 - 1;
                                                    i10 = iArr116[i31111116] - 1;
                                                    iArr116[i31111116] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax112;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (c10024.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            i15 = i4 - 1;
                                            int i31111117 = c7343.f19242[i15];
                                            c10023 = c10024;
                                            iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i31111117 - Character.charCount(Character.codePointBefore(charSequence2, i31111117)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (iM16984 < 0) {
                                                c7343.f19238 = i5;
                                                c10024 = c10023;
                                            } else {
                                                c7343.f19242[i15] = iM16984;
                                                i14 = iArr3[i3 + 1];
                                                i3 = i14;
                                            }
                                        }
                                        iCharCount = iM16984;
                                        charSequence4 = charSequence2;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c7342 = c7341;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            } else {
                                i18 = iCharCount;
                            }
                            InterfaceC12628 interfaceC126210 = (InterfaceC12628) objArr2[iArr3[i28 + (i32 == 12 ? 3 : 2)]];
                            int i56 = i18;
                            while (i56 < length && interfaceC126210.mo4821(charSequence4.charAt(i56))) {
                                i56++;
                                if (c10024.m23374()) {
                                    c7343.f19230 = true;
                                    return false;
                                }
                            }
                            if (i56 >= length) {
                                c10024.f27755 = true;
                            }
                            if (i56 - i18 >= iArr3[i28 + (i32 == 12 ? 5 : 3)] && (c10024.f27733 != 1 || i56 == length)) {
                                int i57 = iArr3[i28 + 4];
                                if (c10024.f27750) {
                                    c7343.m17009(i57, iCharCount);
                                    c7343.m17009(i57 + 1, i56);
                                } else {
                                    int[] iArr20 = c10024.f27745;
                                    iArr20[i57] = iCharCount;
                                    iArr20[i57 + 1] = i56;
                                }
                                int[] iArr21 = c10024.f27745;
                                iArr21[0] = c10024.f27768;
                                c10024.m23383(i56);
                                iArr21[1] = i56;
                                return true;
                            }
                            c7341 = this;
                            c10024 = c10024;
                            charSequence2 = charSequence4;
                            while (true) {
                                i4 = c7343.f19238;
                                if (i4 == 0) {
                                    c7343.m16979(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c7343.m16979(c7343.f19242[i4 - 3]);
                                iArr = c7343.f19242;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM16984 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    if (zM17005) {
                                        c10023 = c10024;
                                        c10024 = c10023;
                                    } else {
                                        i3 = c7343.f19235;
                                        iCharCount = c7343.f19240;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c10023 = c10024;
                                        if (i7 == 8) {
                                            c7343.f19238 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c7343.f19241.f31730) {
                                                c7343.m17014(~i8, i9 - 1);
                                                c7343.m17018(i8, i9);
                                            } else {
                                                c7343.m16995(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c8682.f23490;
                                            int i31111118 = i4 - 2;
                                            i13 = iArr[i31111118];
                                            iArr[i31111118] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c7343.f19238 = i5;
                                            }
                                            if (c10023.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                c10024 = c10023;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i31111119 = iArr[i11];
                                            int i311111110 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i31111119)];
                                            i12 = i31111119 & (i31111119 - 1);
                                            if (i12 == 0) {
                                                c7343.f19238 = i5;
                                            } else {
                                                c7343.f19242[i11] = i12;
                                            }
                                            i3 = i311111110;
                                        } else if (i7 == 6) {
                                            c7343.m17002(iArr[i4 - 2], iM16984);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            c7343.f19238 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c7343.f19238 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM16984;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax113 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr117 = c7343.f19242;
                                                    iArr117[i6] = iMax113;
                                                    int i311111111 = i4 - 1;
                                                    i10 = iArr117[i311111111] - 1;
                                                    iArr117[i311111111] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax113;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax114 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                int[] iArr118 = c7343.f19242;
                                                iArr118[i6] = iMax114;
                                                int i311111112 = i4 - 1;
                                                i10 = iArr118[i311111112] - 1;
                                                iArr118[i311111112] = i10;
                                                if (i10 == 0) {
                                                    c7343.f19238 = i5;
                                                }
                                                iCharCount = iMax114;
                                            } else {
                                                c7343.f19238 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c10024.m23374()) {
                                            c7343.f19230 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i311111113 = c7343.f19242[i15];
                                        c10023 = c10024;
                                        iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i311111113 - Character.charCount(Character.codePointBefore(charSequence2, i311111113)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (iM16984 < 0) {
                                            c7343.f19238 = i5;
                                            c10024 = c10023;
                                        } else {
                                            c7343.f19242[i15] = iM16984;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM16984;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            break;
                        case 14:
                            C19194 c19194 = (C19194) objArr2[iArr3[i28 + 2]];
                            if (iArr3[i28 + 3] != 0) {
                                Object obj = objArr2[iArr3[i3 + 2]];
                                int i58 = c19194.f57372;
                                int i59 = c19194.f57370;
                                if (i58 != 0) {
                                    int i60 = (i59 + 1) * i58;
                                    long[] jArr = c7343.f19232;
                                    if (jArr.length >= i60) {
                                        Arrays.fill(jArr, 0, i60, 0L);
                                    } else {
                                        if ((((long) (i60 - c7343.f19232.length)) * 8) + c7343.m17000() > 33554432) {
                                            throw new C2646();
                                        }
                                        c7343.f19232 = new long[i60];
                                    }
                                }
                                int i61 = 0;
                                int i62 = 0;
                                int i63 = iCharCount;
                                while (true) {
                                    if (c10024.m23374()) {
                                        c7343.f19230 = true;
                                    } else {
                                        int i64 = i61 >>> 1;
                                        if (i62 != 0 || i58 == 0) {
                                            z = false;
                                        } else {
                                            int i65 = i63 - iCharCount;
                                            int i66 = (i64 * i58) + (i65 >>> 6);
                                            long j = 1 << i65;
                                            long[] jArr2 = c7343.f19232;
                                            long j2 = jArr2[i66];
                                            z = (j2 & j) != 0;
                                            jArr2[i66] = j2 | j;
                                        }
                                        if (!z) {
                                            if (i64 < i59) {
                                                Object[] objArr3 = c19194.f57369;
                                                i19 = i58;
                                                if (i62 < objArr3.length) {
                                                    int i67 = i62 + 1;
                                                    int iM16953 = c7343.m16952(i63, length, charSequence4, objArr3[i62]);
                                                    if (!c7343.f19230) {
                                                        if (iM16953 < 0) {
                                                            i62 = i67;
                                                            iArr3 = iArr3;
                                                            objArr2 = objArr2;
                                                            i20 = i59;
                                                        } else if (!c7343.m16996()) {
                                                            int[] iArr22 = c7343.f19245;
                                                            i20 = i59;
                                                            if (iArr22.length - i61 < 2) {
                                                                int iM16954 = m16953(iArr22.length, ((long) i61) + 2);
                                                                long jM17000 = c7343.m17000();
                                                                int[] iArr23 = c7343.f19245;
                                                                if ((((long) (iM16954 - iArr23.length)) * 4) + jM17000 > 33554432) {
                                                                    throw new C2646();
                                                                }
                                                                c7343.f19245 = Arrays.copyOf(iArr23, iM16954);
                                                            }
                                                            int[] iArr24 = c7343.f19245;
                                                            int i68 = i61 + 1;
                                                            iArr24[i61] = i63;
                                                            i61 += 2;
                                                            iArr24[i68] = i67;
                                                            i63 = iM16953;
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
                                            if (i64 >= c19194.f57371) {
                                                iM16952 = c7343.m16952(i63, length, charSequence4, obj);
                                                if (c7343.f19230) {
                                                    iM16952 = -1;
                                                } else if (iM16952 < 0 || (c10024.f27733 == 1 && iM16952 != length)) {
                                                }
                                            }
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (iM16952 >= 0) {
                                                int[] iArr25 = c10024.f27745;
                                                iArr25[0] = c10024.f27768;
                                                c10024.m23383(iM16952);
                                                iArr25[1] = iM16952;
                                                return true;
                                            }
                                            c7341 = this;
                                            c10024 = c10024;
                                            charSequence2 = charSequence4;
                                            i29 = 0;
                                            i30 = 0;
                                            while (true) {
                                                i4 = c7343.f19238;
                                                if (i4 == 0) {
                                                    c7343.m16979(0);
                                                    return false;
                                                }
                                                i5 = i4 - 6;
                                                c7343.m16979(c7343.f19242[i4 - 3]);
                                                iArr = c7343.f19242;
                                                i3 = iArr[i4 - 5];
                                                i6 = i4 - 4;
                                                iM16984 = iArr[i6];
                                                i7 = iArr[i5];
                                                if (i7 == 7) {
                                                    zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                                    if (c7343.f19230) {
                                                        return false;
                                                    }
                                                    if (zM17005) {
                                                        c10023 = c10024;
                                                        c10024 = c10023;
                                                    } else {
                                                        i3 = c7343.f19235;
                                                        iCharCount = c7343.f19240;
                                                        charSequence4 = charSequence2;
                                                    }
                                                } else {
                                                    if (i7 == 9) {
                                                        c10023 = c10024;
                                                        if (i7 == 8) {
                                                            c7343.f19238 = i5;
                                                            i8 = iArr[i4 - 2];
                                                            i9 = iArr[i4 - 1];
                                                            if (c7343.f19241.f31730) {
                                                                c7343.m17014(~i8, i9 - 1);
                                                                c7343.m17018(i8, i9);
                                                            } else {
                                                                c7343.m16995(i8, i9);
                                                            }
                                                        } else if (i7 == 3) {
                                                            c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                            iArr2 = c8682.f23490;
                                                            int i311111114 = i4 - 2;
                                                            i13 = iArr[i311111114];
                                                            iArr[i311111114] = i13 + 1;
                                                            i14 = iArr2[i13];
                                                            if (i13 == iArr2.length - 1) {
                                                                c7343.f19238 = i5;
                                                            }
                                                            if (c10023.m23374()) {
                                                                c7343.f19230 = true;
                                                                return false;
                                                            }
                                                            if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                                c10024 = c10023;
                                                            } else {
                                                                i3 = i14;
                                                            }
                                                        } else if (i7 == 4) {
                                                            i11 = i4 - 2;
                                                            int i311111115 = iArr[i11];
                                                            int i311111116 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i311111115)];
                                                            i12 = i311111115 & (i311111115 - 1);
                                                            if (i12 == 0) {
                                                                c7343.f19238 = i5;
                                                            } else {
                                                                c7343.f19242[i11] = i12;
                                                            }
                                                            i3 = i311111116;
                                                        } else if (i7 == 6) {
                                                            c7343.m17002(iArr[i4 - 2], iM16984);
                                                            if (c7343.f19230) {
                                                                return false;
                                                            }
                                                            c7343.f19238 = i5;
                                                        } else if (i7 == 5) {
                                                            i29 = iArr[i4 - 2];
                                                            i30 = iArr[i4 - 1];
                                                            c7343.f19238 = i5;
                                                            charSequence4 = charSequence2;
                                                            iCharCount = iM16984;
                                                        } else {
                                                            if (i7 == 1) {
                                                                if (i7 == 2) {
                                                                    int iMax115 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                                    int[] iArr119 = c7343.f19242;
                                                                    iArr119[i6] = iMax115;
                                                                    int i311111117 = i4 - 1;
                                                                    i10 = iArr119[i311111117] - 1;
                                                                    iArr119[i311111117] = i10;
                                                                    if (i10 == 0) {
                                                                        c7343.f19238 = i5;
                                                                    }
                                                                    iCharCount = iMax115;
                                                                } else {
                                                                    c7343.f19238 = i5;
                                                                }
                                                            } else if (i7 == 2) {
                                                                int iMax116 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                                int[] iArr1110 = c7343.f19242;
                                                                iArr1110[i6] = iMax116;
                                                                int i311111118 = i4 - 1;
                                                                i10 = iArr1110[i311111118] - 1;
                                                                iArr1110[i311111118] = i10;
                                                                if (i10 == 0) {
                                                                    c7343.f19238 = i5;
                                                                }
                                                                iCharCount = iMax116;
                                                            } else {
                                                                c7343.f19238 = i5;
                                                            }
                                                            charSequence4 = charSequence2;
                                                        }
                                                    } else {
                                                        if (c10024.m23374()) {
                                                            c7343.f19230 = true;
                                                            return false;
                                                        }
                                                        i15 = i4 - 1;
                                                        int i311111119 = c7343.f19242[i15];
                                                        c10023 = c10024;
                                                        iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i311111119 - Character.charCount(Character.codePointBefore(charSequence2, i311111119)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                                        if (c7343.f19230) {
                                                            return false;
                                                        }
                                                        if (iM16984 < 0) {
                                                            c7343.f19238 = i5;
                                                            c10024 = c10023;
                                                        } else {
                                                            c7343.f19242[i15] = iM16984;
                                                            i14 = iArr3[i3 + 1];
                                                            i3 = i14;
                                                        }
                                                    }
                                                    iCharCount = iM16984;
                                                    charSequence4 = charSequence2;
                                                }
                                                i28 = i3;
                                                z2 = false;
                                                c7342 = c7341;
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
                                            iM16952 = -1;
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (iM16952 >= 0) {
                                                int[] iArr26 = c10024.f27745;
                                                iArr26[0] = c10024.f27768;
                                                c10024.m23383(iM16952);
                                                iArr26[1] = iM16952;
                                                return true;
                                            }
                                            c7341 = this;
                                            c10024 = c10024;
                                            charSequence2 = charSequence4;
                                            i29 = 0;
                                            i30 = 0;
                                            while (true) {
                                                i4 = c7343.f19238;
                                                if (i4 == 0) {
                                                    c7343.m16979(0);
                                                    return false;
                                                }
                                                i5 = i4 - 6;
                                                c7343.m16979(c7343.f19242[i4 - 3]);
                                                iArr = c7343.f19242;
                                                i3 = iArr[i4 - 5];
                                                i6 = i4 - 4;
                                                iM16984 = iArr[i6];
                                                i7 = iArr[i5];
                                                if (i7 == 7) {
                                                    zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                                    if (c7343.f19230) {
                                                        return false;
                                                    }
                                                    if (zM17005) {
                                                        c10023 = c10024;
                                                        c10024 = c10023;
                                                    } else {
                                                        i3 = c7343.f19235;
                                                        iCharCount = c7343.f19240;
                                                        charSequence4 = charSequence2;
                                                    }
                                                } else {
                                                    if (i7 == 9) {
                                                        c10023 = c10024;
                                                        if (i7 == 8) {
                                                            c7343.f19238 = i5;
                                                            i8 = iArr[i4 - 2];
                                                            i9 = iArr[i4 - 1];
                                                            if (c7343.f19241.f31730) {
                                                                c7343.m17014(~i8, i9 - 1);
                                                                c7343.m17018(i8, i9);
                                                            } else {
                                                                c7343.m16995(i8, i9);
                                                            }
                                                        } else if (i7 == 3) {
                                                            c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                            iArr2 = c8682.f23490;
                                                            int i3111111110 = i4 - 2;
                                                            i13 = iArr[i3111111110];
                                                            iArr[i3111111110] = i13 + 1;
                                                            i14 = iArr2[i13];
                                                            if (i13 == iArr2.length - 1) {
                                                                c7343.f19238 = i5;
                                                            }
                                                            if (c10023.m23374()) {
                                                                c7343.f19230 = true;
                                                                return false;
                                                            }
                                                            if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                                c10024 = c10023;
                                                            } else {
                                                                i3 = i14;
                                                            }
                                                        } else if (i7 == 4) {
                                                            i11 = i4 - 2;
                                                            int i3111111111 = iArr[i11];
                                                            int i3111111112 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i3111111111)];
                                                            i12 = i3111111111 & (i3111111111 - 1);
                                                            if (i12 == 0) {
                                                                c7343.f19238 = i5;
                                                            } else {
                                                                c7343.f19242[i11] = i12;
                                                            }
                                                            i3 = i3111111112;
                                                        } else if (i7 == 6) {
                                                            c7343.m17002(iArr[i4 - 2], iM16984);
                                                            if (c7343.f19230) {
                                                                return false;
                                                            }
                                                            c7343.f19238 = i5;
                                                        } else if (i7 == 5) {
                                                            i29 = iArr[i4 - 2];
                                                            i30 = iArr[i4 - 1];
                                                            c7343.f19238 = i5;
                                                            charSequence4 = charSequence2;
                                                            iCharCount = iM16984;
                                                        } else {
                                                            if (i7 == 1) {
                                                                if (i7 == 2) {
                                                                    int iMax117 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                                    int[] iArr1111 = c7343.f19242;
                                                                    iArr1111[i6] = iMax117;
                                                                    int i3111111113 = i4 - 1;
                                                                    i10 = iArr1111[i3111111113] - 1;
                                                                    iArr1111[i3111111113] = i10;
                                                                    if (i10 == 0) {
                                                                        c7343.f19238 = i5;
                                                                    }
                                                                    iCharCount = iMax117;
                                                                } else {
                                                                    c7343.f19238 = i5;
                                                                }
                                                            } else if (i7 == 2) {
                                                                int iMax118 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                                int[] iArr1112 = c7343.f19242;
                                                                iArr1112[i6] = iMax118;
                                                                int i3111111114 = i4 - 1;
                                                                i10 = iArr1112[i3111111114] - 1;
                                                                iArr1112[i3111111114] = i10;
                                                                if (i10 == 0) {
                                                                    c7343.f19238 = i5;
                                                                }
                                                                iCharCount = iMax118;
                                                            } else {
                                                                c7343.f19238 = i5;
                                                            }
                                                            charSequence4 = charSequence2;
                                                        }
                                                    } else {
                                                        if (c10024.m23374()) {
                                                            c7343.f19230 = true;
                                                            return false;
                                                        }
                                                        i15 = i4 - 1;
                                                        int i3111111115 = c7343.f19242[i15];
                                                        c10023 = c10024;
                                                        iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i3111111115 - Character.charCount(Character.codePointBefore(charSequence2, i3111111115)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                                        if (c7343.f19230) {
                                                            return false;
                                                        }
                                                        if (iM16984 < 0) {
                                                            c7343.f19238 = i5;
                                                            c10024 = c10023;
                                                        } else {
                                                            c7343.f19242[i15] = iM16984;
                                                            i14 = iArr3[i3 + 1];
                                                            i3 = i14;
                                                        }
                                                    }
                                                    iCharCount = iM16984;
                                                    charSequence4 = charSequence2;
                                                }
                                                i28 = i3;
                                                z2 = false;
                                                c7342 = c7341;
                                                objArr2 = objArr2;
                                                iArr3 = iArr3;
                                            }
                                        } else {
                                            int[] iArr27 = c7343.f19245;
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
                                    iM16952 = -1;
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    if (iM16952 >= 0) {
                                        int[] iArr28 = c10024.f27745;
                                        iArr28[0] = c10024.f27768;
                                        c10024.m23383(iM16952);
                                        iArr28[1] = iM16952;
                                        return true;
                                    }
                                    c7341 = this;
                                    c10024 = c10024;
                                    charSequence2 = charSequence4;
                                    i29 = 0;
                                    i30 = 0;
                                    while (true) {
                                        i4 = c7343.f19238;
                                        if (i4 == 0) {
                                            c7343.m16979(0);
                                            return false;
                                        }
                                        i5 = i4 - 6;
                                        c7343.m16979(c7343.f19242[i4 - 3]);
                                        iArr = c7343.f19242;
                                        i3 = iArr[i4 - 5];
                                        i6 = i4 - 4;
                                        iM16984 = iArr[i6];
                                        i7 = iArr[i5];
                                        if (i7 == 7) {
                                            zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (zM17005) {
                                                c10023 = c10024;
                                                c10024 = c10023;
                                            } else {
                                                i3 = c7343.f19235;
                                                iCharCount = c7343.f19240;
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (i7 == 9) {
                                                c10023 = c10024;
                                                if (i7 == 8) {
                                                    c7343.f19238 = i5;
                                                    i8 = iArr[i4 - 2];
                                                    i9 = iArr[i4 - 1];
                                                    if (c7343.f19241.f31730) {
                                                        c7343.m17014(~i8, i9 - 1);
                                                        c7343.m17018(i8, i9);
                                                    } else {
                                                        c7343.m16995(i8, i9);
                                                    }
                                                } else if (i7 == 3) {
                                                    c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                    iArr2 = c8682.f23490;
                                                    int i3111111116 = i4 - 2;
                                                    i13 = iArr[i3111111116];
                                                    iArr[i3111111116] = i13 + 1;
                                                    i14 = iArr2[i13];
                                                    if (i13 == iArr2.length - 1) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    if (c10023.m23374()) {
                                                        c7343.f19230 = true;
                                                        return false;
                                                    }
                                                    if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                        c10024 = c10023;
                                                    } else {
                                                        i3 = i14;
                                                    }
                                                } else if (i7 == 4) {
                                                    i11 = i4 - 2;
                                                    int i3111111117 = iArr[i11];
                                                    int i3111111118 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i3111111117)];
                                                    i12 = i3111111117 & (i3111111117 - 1);
                                                    if (i12 == 0) {
                                                        c7343.f19238 = i5;
                                                    } else {
                                                        c7343.f19242[i11] = i12;
                                                    }
                                                    i3 = i3111111118;
                                                } else if (i7 == 6) {
                                                    c7343.m17002(iArr[i4 - 2], iM16984);
                                                    if (c7343.f19230) {
                                                        return false;
                                                    }
                                                    c7343.f19238 = i5;
                                                } else if (i7 == 5) {
                                                    i29 = iArr[i4 - 2];
                                                    i30 = iArr[i4 - 1];
                                                    c7343.f19238 = i5;
                                                    charSequence4 = charSequence2;
                                                    iCharCount = iM16984;
                                                } else {
                                                    if (i7 == 1) {
                                                        if (i7 == 2) {
                                                            int iMax119 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                            int[] iArr1113 = c7343.f19242;
                                                            iArr1113[i6] = iMax119;
                                                            int i3111111119 = i4 - 1;
                                                            i10 = iArr1113[i3111111119] - 1;
                                                            iArr1113[i3111111119] = i10;
                                                            if (i10 == 0) {
                                                                c7343.f19238 = i5;
                                                            }
                                                            iCharCount = iMax119;
                                                        } else {
                                                            c7343.f19238 = i5;
                                                        }
                                                    } else if (i7 == 2) {
                                                        int iMax1110 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                        int[] iArr1114 = c7343.f19242;
                                                        iArr1114[i6] = iMax1110;
                                                        int i31111111110 = i4 - 1;
                                                        i10 = iArr1114[i31111111110] - 1;
                                                        iArr1114[i31111111110] = i10;
                                                        if (i10 == 0) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        iCharCount = iMax1110;
                                                    } else {
                                                        c7343.f19238 = i5;
                                                    }
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (c10024.m23374()) {
                                                    c7343.f19230 = true;
                                                    return false;
                                                }
                                                i15 = i4 - 1;
                                                int i31111111111 = c7343.f19242[i15];
                                                c10023 = c10024;
                                                iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i31111111111 - Character.charCount(Character.codePointBefore(charSequence2, i31111111111)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                if (iM16984 < 0) {
                                                    c7343.f19238 = i5;
                                                    c10024 = c10023;
                                                } else {
                                                    c7343.f19242[i15] = iM16984;
                                                    i14 = iArr3[i3 + 1];
                                                    i3 = i14;
                                                }
                                            }
                                            iCharCount = iM16984;
                                            charSequence4 = charSequence2;
                                        }
                                        i28 = i3;
                                        z2 = false;
                                        c7342 = c7341;
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
                                        if (i70 == c19194.f57370) {
                                        }
                                        if (i70 >= c19194.f57371) {
                                            c7343.m16960(0, i3, iCharCount, 0, 0);
                                        }
                                    }
                                    int iM16955 = -1;
                                    int i71 = i30;
                                    while (true) {
                                        objArr = c19194.f57369;
                                        if (i71 < objArr.length) {
                                            if (c10024.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            iM16955 = c7343.m16952(iCharCount, length, charSequence4, objArr[i71]);
                                            if (!c7343.f19230) {
                                                if (iM16955 < 0) {
                                                    i71++;
                                                }
                                            }
                                            return false;
                                        }
                                    }
                                    if (iM16955 < 0) {
                                        c7341 = this;
                                        c10024 = c10024;
                                        charSequence2 = charSequence4;
                                        i29 = 0;
                                        i30 = 0;
                                        while (true) {
                                            i4 = c7343.f19238;
                                            if (i4 == 0) {
                                                c7343.m16979(0);
                                                return false;
                                            }
                                            i5 = i4 - 6;
                                            c7343.m16979(c7343.f19242[i4 - 3]);
                                            iArr = c7343.f19242;
                                            i3 = iArr[i4 - 5];
                                            i6 = i4 - 4;
                                            iM16984 = iArr[i6];
                                            i7 = iArr[i5];
                                            if (i7 == 7) {
                                                zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                if (zM17005) {
                                                    c10023 = c10024;
                                                    c10024 = c10023;
                                                } else {
                                                    i3 = c7343.f19235;
                                                    iCharCount = c7343.f19240;
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (i7 == 9) {
                                                    c10023 = c10024;
                                                    if (i7 == 8) {
                                                        c7343.f19238 = i5;
                                                        i8 = iArr[i4 - 2];
                                                        i9 = iArr[i4 - 1];
                                                        if (c7343.f19241.f31730) {
                                                            c7343.m17014(~i8, i9 - 1);
                                                            c7343.m17018(i8, i9);
                                                        } else {
                                                            c7343.m16995(i8, i9);
                                                        }
                                                    } else if (i7 == 3) {
                                                        c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                        iArr2 = c8682.f23490;
                                                        int i31111111112 = i4 - 2;
                                                        i13 = iArr[i31111111112];
                                                        iArr[i31111111112] = i13 + 1;
                                                        i14 = iArr2[i13];
                                                        if (i13 == iArr2.length - 1) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        if (c10023.m23374()) {
                                                            c7343.f19230 = true;
                                                            return false;
                                                        }
                                                        if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                            c10024 = c10023;
                                                        } else {
                                                            i3 = i14;
                                                        }
                                                    } else if (i7 == 4) {
                                                        i11 = i4 - 2;
                                                        int i31111111113 = iArr[i11];
                                                        int i31111111114 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i31111111113)];
                                                        i12 = i31111111113 & (i31111111113 - 1);
                                                        if (i12 == 0) {
                                                            c7343.f19238 = i5;
                                                        } else {
                                                            c7343.f19242[i11] = i12;
                                                        }
                                                        i3 = i31111111114;
                                                    } else if (i7 == 6) {
                                                        c7343.m17002(iArr[i4 - 2], iM16984);
                                                        if (c7343.f19230) {
                                                            return false;
                                                        }
                                                        c7343.f19238 = i5;
                                                    } else if (i7 == 5) {
                                                        i29 = iArr[i4 - 2];
                                                        i30 = iArr[i4 - 1];
                                                        c7343.f19238 = i5;
                                                        charSequence4 = charSequence2;
                                                        iCharCount = iM16984;
                                                    } else {
                                                        if (i7 == 1) {
                                                            if (i7 == 2) {
                                                                int iMax1111 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                                int[] iArr1115 = c7343.f19242;
                                                                iArr1115[i6] = iMax1111;
                                                                int i31111111115 = i4 - 1;
                                                                i10 = iArr1115[i31111111115] - 1;
                                                                iArr1115[i31111111115] = i10;
                                                                if (i10 == 0) {
                                                                    c7343.f19238 = i5;
                                                                }
                                                                iCharCount = iMax1111;
                                                            } else {
                                                                c7343.f19238 = i5;
                                                            }
                                                        } else if (i7 == 2) {
                                                            int iMax1112 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                            int[] iArr1116 = c7343.f19242;
                                                            iArr1116[i6] = iMax1112;
                                                            int i31111111116 = i4 - 1;
                                                            i10 = iArr1116[i31111111116] - 1;
                                                            iArr1116[i31111111116] = i10;
                                                            if (i10 == 0) {
                                                                c7343.f19238 = i5;
                                                            }
                                                            iCharCount = iMax1112;
                                                        } else {
                                                            c7343.f19238 = i5;
                                                        }
                                                        charSequence4 = charSequence2;
                                                    }
                                                } else {
                                                    if (c10024.m23374()) {
                                                        c7343.f19230 = true;
                                                        return false;
                                                    }
                                                    i15 = i4 - 1;
                                                    int i31111111117 = c7343.f19242[i15];
                                                    c10023 = c10024;
                                                    iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i31111111117 - Character.charCount(Character.codePointBefore(charSequence2, i31111111117)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                                    if (c7343.f19230) {
                                                        return false;
                                                    }
                                                    if (iM16984 < 0) {
                                                        c7343.f19238 = i5;
                                                        c10024 = c10023;
                                                    } else {
                                                        c7343.f19242[i15] = iM16984;
                                                        i14 = iArr3[i3 + 1];
                                                        i3 = i14;
                                                    }
                                                }
                                                iCharCount = iM16984;
                                                charSequence4 = charSequence2;
                                            }
                                            i28 = i3;
                                            z2 = false;
                                            c7342 = c7341;
                                            objArr2 = objArr2;
                                            iArr3 = iArr3;
                                        }
                                    } else {
                                        int i72 = i71 + 1;
                                        if (i72 < objArr.length) {
                                            c7343.m16960(5, i28, iCharCount, i70, i72);
                                        }
                                        i70++;
                                        if (c7343.m16996()) {
                                            return false;
                                        }
                                        i30 = 0;
                                        iCharCount = iM16955;
                                    }
                                }
                            }
                            break;
                        case 15:
                            break;
                        case 16:
                            int i73 = i28 + 2;
                            if (C22764.m50944(iArr3[i73], iArr3[i28 + 3] != 0, c10024, iCharCount, charSequence4)) {
                                if (iArr3[i73] == 0) {
                                    c7343.m17014(Integer.MIN_VALUE, iCharCount);
                                }
                                charSequence2 = charSequence4;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                c7341 = this;
                                charSequence4 = charSequence2;
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            c7341 = this;
                            c10024 = c10024;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c7343.f19238;
                                if (i4 == 0) {
                                    c7343.m16979(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c7343.m16979(c7343.f19242[i4 - 3]);
                                iArr = c7343.f19242;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM16984 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    if (zM17005) {
                                        c10023 = c10024;
                                        c10024 = c10023;
                                    } else {
                                        i3 = c7343.f19235;
                                        iCharCount = c7343.f19240;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c10023 = c10024;
                                        if (i7 == 8) {
                                            c7343.f19238 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c7343.f19241.f31730) {
                                                c7343.m17014(~i8, i9 - 1);
                                                c7343.m17018(i8, i9);
                                            } else {
                                                c7343.m16995(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c8682.f23490;
                                            int i31111111118 = i4 - 2;
                                            i13 = iArr[i31111111118];
                                            iArr[i31111111118] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c7343.f19238 = i5;
                                            }
                                            if (c10023.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                c10024 = c10023;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i31111111119 = iArr[i11];
                                            int i311111111110 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i31111111119)];
                                            i12 = i31111111119 & (i31111111119 - 1);
                                            if (i12 == 0) {
                                                c7343.f19238 = i5;
                                            } else {
                                                c7343.f19242[i11] = i12;
                                            }
                                            i3 = i311111111110;
                                        } else if (i7 == 6) {
                                            c7343.m17002(iArr[i4 - 2], iM16984);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            c7343.f19238 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c7343.f19238 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM16984;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax1113 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr1117 = c7343.f19242;
                                                    iArr1117[i6] = iMax1113;
                                                    int i311111111111 = i4 - 1;
                                                    i10 = iArr1117[i311111111111] - 1;
                                                    iArr1117[i311111111111] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax1113;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax1114 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                int[] iArr1118 = c7343.f19242;
                                                iArr1118[i6] = iMax1114;
                                                int i311111111112 = i4 - 1;
                                                i10 = iArr1118[i311111111112] - 1;
                                                iArr1118[i311111111112] = i10;
                                                if (i10 == 0) {
                                                    c7343.f19238 = i5;
                                                }
                                                iCharCount = iMax1114;
                                            } else {
                                                c7343.f19238 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c10024.m23374()) {
                                            c7343.f19230 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i311111111113 = c7343.f19242[i15];
                                        c10023 = c10024;
                                        iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i311111111113 - Character.charCount(Character.codePointBefore(charSequence2, i311111111113)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (iM16984 < 0) {
                                            c7343.f19238 = i5;
                                            c10024 = c10023;
                                        } else {
                                            c7343.f19242[i15] = iM16984;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM16984;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            break;
                        case 17:
                            int iM16956 = c7343.m16956((C15031) objArr2[iArr3[i28 + 2]], charSequence4, iCharCount, length);
                            if (c7343.f19230) {
                                return false;
                            }
                            if (iM16956 >= 0) {
                                int[] iArr29 = c10024.f27745;
                                iArr29[0] = c10024.f27768;
                                c10024.m23383(iM16956);
                                iArr29[1] = iM16956;
                                return true;
                            }
                            c7341 = this;
                            c10024 = c10024;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c7343.f19238;
                                if (i4 == 0) {
                                    c7343.m16979(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c7343.m16979(c7343.f19242[i4 - 3]);
                                iArr = c7343.f19242;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM16984 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    if (zM17005) {
                                        c10023 = c10024;
                                        c10024 = c10023;
                                    } else {
                                        i3 = c7343.f19235;
                                        iCharCount = c7343.f19240;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c10023 = c10024;
                                        if (i7 == 8) {
                                            c7343.f19238 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c7343.f19241.f31730) {
                                                c7343.m17014(~i8, i9 - 1);
                                                c7343.m17018(i8, i9);
                                            } else {
                                                c7343.m16995(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c8682.f23490;
                                            int i311111111114 = i4 - 2;
                                            i13 = iArr[i311111111114];
                                            iArr[i311111111114] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c7343.f19238 = i5;
                                            }
                                            if (c10023.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                c10024 = c10023;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i311111111115 = iArr[i11];
                                            int i311111111116 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i311111111115)];
                                            i12 = i311111111115 & (i311111111115 - 1);
                                            if (i12 == 0) {
                                                c7343.f19238 = i5;
                                            } else {
                                                c7343.f19242[i11] = i12;
                                            }
                                            i3 = i311111111116;
                                        } else if (i7 == 6) {
                                            c7343.m17002(iArr[i4 - 2], iM16984);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            c7343.f19238 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c7343.f19238 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM16984;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax1115 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr1119 = c7343.f19242;
                                                    iArr1119[i6] = iMax1115;
                                                    int i311111111117 = i4 - 1;
                                                    i10 = iArr1119[i311111111117] - 1;
                                                    iArr1119[i311111111117] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax1115;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax1116 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                int[] iArr11110 = c7343.f19242;
                                                iArr11110[i6] = iMax1116;
                                                int i311111111118 = i4 - 1;
                                                i10 = iArr11110[i311111111118] - 1;
                                                iArr11110[i311111111118] = i10;
                                                if (i10 == 0) {
                                                    c7343.f19238 = i5;
                                                }
                                                iCharCount = iMax1116;
                                            } else {
                                                c7343.f19238 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c10024.m23374()) {
                                            c7343.f19230 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i311111111119 = c7343.f19242[i15];
                                        c10023 = c10024;
                                        iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i311111111119 - Character.charCount(Character.codePointBefore(charSequence2, i311111111119)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (iM16984 < 0) {
                                            c7343.f19238 = i5;
                                            c10024 = c10023;
                                        } else {
                                            c7343.f19242[i15] = iM16984;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM16984;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            break;
                        case 20:
                            int iM16957 = c7343.m16954((C6000) objArr2[iArr3[i28 + 2]], charSequence4, iCharCount, length);
                            if (c7343.f19230) {
                                return false;
                            }
                            if (iM16957 >= 0) {
                                int[] iArr30 = c10024.f27745;
                                iArr30[0] = c10024.f27768;
                                c10024.m23383(iM16957);
                                iArr30[1] = iM16957;
                                return true;
                            }
                            c7341 = this;
                            c10024 = c10024;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c7343.f19238;
                                if (i4 == 0) {
                                    c7343.m16979(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c7343.m16979(c7343.f19242[i4 - 3]);
                                iArr = c7343.f19242;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM16984 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    if (zM17005) {
                                        c10023 = c10024;
                                        c10024 = c10023;
                                    } else {
                                        i3 = c7343.f19235;
                                        iCharCount = c7343.f19240;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c10023 = c10024;
                                        if (i7 == 8) {
                                            c7343.f19238 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c7343.f19241.f31730) {
                                                c7343.m17014(~i8, i9 - 1);
                                                c7343.m17018(i8, i9);
                                            } else {
                                                c7343.m16995(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c8682.f23490;
                                            int i3111111111110 = i4 - 2;
                                            i13 = iArr[i3111111111110];
                                            iArr[i3111111111110] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c7343.f19238 = i5;
                                            }
                                            if (c10023.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                c10024 = c10023;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i3111111111111 = iArr[i11];
                                            int i3111111111112 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i3111111111111)];
                                            i12 = i3111111111111 & (i3111111111111 - 1);
                                            if (i12 == 0) {
                                                c7343.f19238 = i5;
                                            } else {
                                                c7343.f19242[i11] = i12;
                                            }
                                            i3 = i3111111111112;
                                        } else if (i7 == 6) {
                                            c7343.m17002(iArr[i4 - 2], iM16984);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            c7343.f19238 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c7343.f19238 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM16984;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax1117 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr11111 = c7343.f19242;
                                                    iArr11111[i6] = iMax1117;
                                                    int i3111111111113 = i4 - 1;
                                                    i10 = iArr11111[i3111111111113] - 1;
                                                    iArr11111[i3111111111113] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax1117;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax1118 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                int[] iArr11112 = c7343.f19242;
                                                iArr11112[i6] = iMax1118;
                                                int i3111111111114 = i4 - 1;
                                                i10 = iArr11112[i3111111111114] - 1;
                                                iArr11112[i3111111111114] = i10;
                                                if (i10 == 0) {
                                                    c7343.f19238 = i5;
                                                }
                                                iCharCount = iMax1118;
                                            } else {
                                                c7343.f19238 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c10024.m23374()) {
                                            c7343.f19230 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i3111111111115 = c7343.f19242[i15];
                                        c10023 = c10024;
                                        iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i3111111111115 - Character.charCount(Character.codePointBefore(charSequence2, i3111111111115)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (iM16984 < 0) {
                                            c7343.f19238 = i5;
                                            c10024 = c10023;
                                        } else {
                                            c7343.f19242[i15] = iM16984;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM16984;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            break;
                        case 21:
                            int iM16958 = c7343.m16955((C12350) objArr2[iArr3[i28 + 2]], charSequence4, iCharCount, length);
                            if (c7343.f19230) {
                                return false;
                            }
                            if (iM16958 >= 0) {
                                int[] iArr31 = c10024.f27745;
                                iArr31[0] = c10024.f27768;
                                c10024.m23383(iM16958);
                                iArr31[1] = iM16958;
                                return true;
                            }
                            c7341 = this;
                            c10024 = c10024;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c7343.f19238;
                                if (i4 == 0) {
                                    c7343.m16979(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c7343.m16979(c7343.f19242[i4 - 3]);
                                iArr = c7343.f19242;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM16984 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    if (zM17005) {
                                        c10023 = c10024;
                                        c10024 = c10023;
                                    } else {
                                        i3 = c7343.f19235;
                                        iCharCount = c7343.f19240;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c10023 = c10024;
                                        if (i7 == 8) {
                                            c7343.f19238 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c7343.f19241.f31730) {
                                                c7343.m17014(~i8, i9 - 1);
                                                c7343.m17018(i8, i9);
                                            } else {
                                                c7343.m16995(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c8682.f23490;
                                            int i3111111111116 = i4 - 2;
                                            i13 = iArr[i3111111111116];
                                            iArr[i3111111111116] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c7343.f19238 = i5;
                                            }
                                            if (c10023.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                c10024 = c10023;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i3111111111117 = iArr[i11];
                                            int i3111111111118 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i3111111111117)];
                                            i12 = i3111111111117 & (i3111111111117 - 1);
                                            if (i12 == 0) {
                                                c7343.f19238 = i5;
                                            } else {
                                                c7343.f19242[i11] = i12;
                                            }
                                            i3 = i3111111111118;
                                        } else if (i7 == 6) {
                                            c7343.m17002(iArr[i4 - 2], iM16984);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            c7343.f19238 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c7343.f19238 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM16984;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax1119 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr11113 = c7343.f19242;
                                                    iArr11113[i6] = iMax1119;
                                                    int i3111111111119 = i4 - 1;
                                                    i10 = iArr11113[i3111111111119] - 1;
                                                    iArr11113[i3111111111119] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax1119;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax11110 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                int[] iArr11114 = c7343.f19242;
                                                iArr11114[i6] = iMax11110;
                                                int i31111111111110 = i4 - 1;
                                                i10 = iArr11114[i31111111111110] - 1;
                                                iArr11114[i31111111111110] = i10;
                                                if (i10 == 0) {
                                                    c7343.f19238 = i5;
                                                }
                                                iCharCount = iMax11110;
                                            } else {
                                                c7343.f19238 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c10024.m23374()) {
                                            c7343.f19230 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i31111111111111 = c7343.f19242[i15];
                                        c10023 = c10024;
                                        iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i31111111111111 - Character.charCount(Character.codePointBefore(charSequence2, i31111111111111)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (iM16984 < 0) {
                                            c7343.f19238 = i5;
                                            c10024 = c10023;
                                        } else {
                                            c7343.f19242[i15] = iM16984;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM16984;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            break;
                        case 22:
                            int[] iArr32 = c7343.f19241.f31731;
                            int i74 = iArr32[i28 + 2];
                            boolean z5 = i74 == 2 || i74 == 3;
                            int i75 = iArr32[i28 + 6] != 0 ? 1 : 0;
                            if (z5) {
                                int i76 = i28 + 5;
                                int iM16950 = i75 != 0 ? c7343.m16950(iCharCount, -iArr32[i76], charSequence4) : iArr32[i76];
                                if (!c7343.f19230) {
                                    int i77 = i28 + 4;
                                    int iM16951 = i75 != 0 ? c7343.m16950(iCharCount, -iArr32[i77], charSequence4) : iArr32[i77];
                                    if (!c7343.f19230) {
                                        iMax = Math.max(iCharCount - iM16950, c10024.f27760 ? 0 : c10024.f27741);
                                        i21 = iCharCount - iM16951;
                                    }
                                    if (zM16978) {
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        c7341 = this;
                                        c10024 = c10024;
                                        charSequence2 = charSequence4;
                                        iArr3 = iArr3;
                                        objArr2 = objArr2;
                                        while (true) {
                                            i4 = c7343.f19238;
                                            if (i4 == 0) {
                                                c7343.m16979(0);
                                                return false;
                                            }
                                            i5 = i4 - 6;
                                            c7343.m16979(c7343.f19242[i4 - 3]);
                                            iArr = c7343.f19242;
                                            i3 = iArr[i4 - 5];
                                            i6 = i4 - 4;
                                            iM16984 = iArr[i6];
                                            i7 = iArr[i5];
                                            if (i7 == 7) {
                                                zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                if (zM17005) {
                                                    c10023 = c10024;
                                                    c10024 = c10023;
                                                } else {
                                                    i3 = c7343.f19235;
                                                    iCharCount = c7343.f19240;
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (i7 == 9) {
                                                    c10023 = c10024;
                                                    if (i7 == 8) {
                                                        c7343.f19238 = i5;
                                                        i8 = iArr[i4 - 2];
                                                        i9 = iArr[i4 - 1];
                                                        if (c7343.f19241.f31730) {
                                                            c7343.m17014(~i8, i9 - 1);
                                                            c7343.m17018(i8, i9);
                                                        } else {
                                                            c7343.m16995(i8, i9);
                                                        }
                                                    } else if (i7 == 3) {
                                                        c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                        iArr2 = c8682.f23490;
                                                        int i31111111111112 = i4 - 2;
                                                        i13 = iArr[i31111111111112];
                                                        iArr[i31111111111112] = i13 + 1;
                                                        i14 = iArr2[i13];
                                                        if (i13 == iArr2.length - 1) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        if (c10023.m23374()) {
                                                            c7343.f19230 = true;
                                                            return false;
                                                        }
                                                        if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                            c10024 = c10023;
                                                        } else {
                                                            i3 = i14;
                                                        }
                                                    } else if (i7 == 4) {
                                                        i11 = i4 - 2;
                                                        int i31111111111113 = iArr[i11];
                                                        int i31111111111114 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i31111111111113)];
                                                        i12 = i31111111111113 & (i31111111111113 - 1);
                                                        if (i12 == 0) {
                                                            c7343.f19238 = i5;
                                                        } else {
                                                            c7343.f19242[i11] = i12;
                                                        }
                                                        i3 = i31111111111114;
                                                    } else if (i7 == 6) {
                                                        c7343.m17002(iArr[i4 - 2], iM16984);
                                                        if (c7343.f19230) {
                                                            return false;
                                                        }
                                                        c7343.f19238 = i5;
                                                    } else if (i7 == 5) {
                                                        i29 = iArr[i4 - 2];
                                                        i30 = iArr[i4 - 1];
                                                        c7343.f19238 = i5;
                                                        charSequence4 = charSequence2;
                                                        iCharCount = iM16984;
                                                    } else {
                                                        if (i7 == 1) {
                                                            if (i7 == 2) {
                                                                int iMax11111 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                                int[] iArr11115 = c7343.f19242;
                                                                iArr11115[i6] = iMax11111;
                                                                int i31111111111115 = i4 - 1;
                                                                i10 = iArr11115[i31111111111115] - 1;
                                                                iArr11115[i31111111111115] = i10;
                                                                if (i10 == 0) {
                                                                    c7343.f19238 = i5;
                                                                }
                                                                iCharCount = iMax11111;
                                                            } else {
                                                                c7343.f19238 = i5;
                                                            }
                                                        } else if (i7 == 2) {
                                                            int iMax11112 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                            int[] iArr11116 = c7343.f19242;
                                                            iArr11116[i6] = iMax11112;
                                                            int i31111111111116 = i4 - 1;
                                                            i10 = iArr11116[i31111111111116] - 1;
                                                            iArr11116[i31111111111116] = i10;
                                                            if (i10 == 0) {
                                                                c7343.f19238 = i5;
                                                            }
                                                            iCharCount = iMax11112;
                                                        } else {
                                                            c7343.f19238 = i5;
                                                        }
                                                        charSequence4 = charSequence2;
                                                    }
                                                } else {
                                                    if (c10024.m23374()) {
                                                        c7343.f19230 = true;
                                                        return false;
                                                    }
                                                    i15 = i4 - 1;
                                                    int i31111111111117 = c7343.f19242[i15];
                                                    c10023 = c10024;
                                                    iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i31111111111117 - Character.charCount(Character.codePointBefore(charSequence2, i31111111111117)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                                    if (c7343.f19230) {
                                                        return false;
                                                    }
                                                    if (iM16984 < 0) {
                                                        c7343.f19238 = i5;
                                                        c10024 = c10023;
                                                    } else {
                                                        c7343.f19242[i15] = iM16984;
                                                        i14 = iArr3[i3 + 1];
                                                        i3 = i14;
                                                    }
                                                }
                                                iCharCount = iM16984;
                                                charSequence4 = charSequence2;
                                            }
                                            i28 = i3;
                                            z2 = false;
                                            c7342 = c7341;
                                            objArr2 = objArr2;
                                            iArr3 = iArr3;
                                        }
                                    } else {
                                        i22 = c7343.f19235;
                                        iCharCount = c7343.f19240;
                                        c7341 = this;
                                        i28 = i22;
                                        iArr3 = iArr3;
                                        objArr2 = objArr2;
                                        z2 = false;
                                        c7342 = c7341;
                                        objArr2 = objArr2;
                                        iArr3 = iArr3;
                                    }
                                }
                                zM16978 = false;
                                if (zM16978) {
                                    i22 = c7343.f19235;
                                    iCharCount = c7343.f19240;
                                    c7341 = this;
                                    i28 = i22;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    z2 = false;
                                    c7342 = c7341;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                } else {
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    c7341 = this;
                                    c10024 = c10024;
                                    charSequence2 = charSequence4;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    while (true) {
                                        i4 = c7343.f19238;
                                        if (i4 == 0) {
                                            c7343.m16979(0);
                                            return false;
                                        }
                                        i5 = i4 - 6;
                                        c7343.m16979(c7343.f19242[i4 - 3]);
                                        iArr = c7343.f19242;
                                        i3 = iArr[i4 - 5];
                                        i6 = i4 - 4;
                                        iM16984 = iArr[i6];
                                        i7 = iArr[i5];
                                        if (i7 == 7) {
                                            zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (zM17005) {
                                                c10023 = c10024;
                                                c10024 = c10023;
                                            } else {
                                                i3 = c7343.f19235;
                                                iCharCount = c7343.f19240;
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (i7 == 9) {
                                                c10023 = c10024;
                                                if (i7 == 8) {
                                                    c7343.f19238 = i5;
                                                    i8 = iArr[i4 - 2];
                                                    i9 = iArr[i4 - 1];
                                                    if (c7343.f19241.f31730) {
                                                        c7343.m17014(~i8, i9 - 1);
                                                        c7343.m17018(i8, i9);
                                                    } else {
                                                        c7343.m16995(i8, i9);
                                                    }
                                                } else if (i7 == 3) {
                                                    c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                    iArr2 = c8682.f23490;
                                                    int i31111111111118 = i4 - 2;
                                                    i13 = iArr[i31111111111118];
                                                    iArr[i31111111111118] = i13 + 1;
                                                    i14 = iArr2[i13];
                                                    if (i13 == iArr2.length - 1) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    if (c10023.m23374()) {
                                                        c7343.f19230 = true;
                                                        return false;
                                                    }
                                                    if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                        c10024 = c10023;
                                                    } else {
                                                        i3 = i14;
                                                    }
                                                } else if (i7 == 4) {
                                                    i11 = i4 - 2;
                                                    int i31111111111119 = iArr[i11];
                                                    int i311111111111110 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i31111111111119)];
                                                    i12 = i31111111111119 & (i31111111111119 - 1);
                                                    if (i12 == 0) {
                                                        c7343.f19238 = i5;
                                                    } else {
                                                        c7343.f19242[i11] = i12;
                                                    }
                                                    i3 = i311111111111110;
                                                } else if (i7 == 6) {
                                                    c7343.m17002(iArr[i4 - 2], iM16984);
                                                    if (c7343.f19230) {
                                                        return false;
                                                    }
                                                    c7343.f19238 = i5;
                                                } else if (i7 == 5) {
                                                    i29 = iArr[i4 - 2];
                                                    i30 = iArr[i4 - 1];
                                                    c7343.f19238 = i5;
                                                    charSequence4 = charSequence2;
                                                    iCharCount = iM16984;
                                                } else {
                                                    if (i7 == 1) {
                                                        if (i7 == 2) {
                                                            int iMax11113 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                            int[] iArr11117 = c7343.f19242;
                                                            iArr11117[i6] = iMax11113;
                                                            int i311111111111111 = i4 - 1;
                                                            i10 = iArr11117[i311111111111111] - 1;
                                                            iArr11117[i311111111111111] = i10;
                                                            if (i10 == 0) {
                                                                c7343.f19238 = i5;
                                                            }
                                                            iCharCount = iMax11113;
                                                        } else {
                                                            c7343.f19238 = i5;
                                                        }
                                                    } else if (i7 == 2) {
                                                        int iMax11114 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                        int[] iArr11118 = c7343.f19242;
                                                        iArr11118[i6] = iMax11114;
                                                        int i311111111111112 = i4 - 1;
                                                        i10 = iArr11118[i311111111111112] - 1;
                                                        iArr11118[i311111111111112] = i10;
                                                        if (i10 == 0) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        iCharCount = iMax11114;
                                                    } else {
                                                        c7343.f19238 = i5;
                                                    }
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (c10024.m23374()) {
                                                    c7343.f19230 = true;
                                                    return false;
                                                }
                                                i15 = i4 - 1;
                                                int i311111111111113 = c7343.f19242[i15];
                                                c10023 = c10024;
                                                iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i311111111111113 - Character.charCount(Character.codePointBefore(charSequence2, i311111111111113)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                if (iM16984 < 0) {
                                                    c7343.f19238 = i5;
                                                    c10024 = c10023;
                                                } else {
                                                    c7343.f19242[i15] = iM16984;
                                                    i14 = iArr3[i3 + 1];
                                                    i3 = i14;
                                                }
                                            }
                                            iCharCount = iM16984;
                                            charSequence4 = charSequence2;
                                        }
                                        i28 = i3;
                                        z2 = false;
                                        c7342 = c7341;
                                        objArr2 = objArr2;
                                        iArr3 = iArr3;
                                    }
                                }
                            } else {
                                i21 = iCharCount;
                                iMax = i21;
                            }
                            c7343.m17008();
                            int i78 = c7343.f19228;
                            int[] iArr33 = c7343.f19233;
                            iArr33[i78] = i74;
                            iArr33[i78 + 1] = iArr32[i31];
                            iArr33[i78 + 2] = iCharCount;
                            int i79 = i78 + 3;
                            iArr33[i79] = iArr32[i28 + 3];
                            iArr33[i78 + 4] = c7343.f19238;
                            iArr33[i78 + 5] = c7343.f19249;
                            iArr33[i78 + 6] = c10024.f27750 ? c10024.f27736.f62172.size() : -1;
                            int[] iArr34 = c7343.f19233;
                            iArr34[i78 + 7] = c10024.f27757;
                            iArr34[i78 + 8] = c10024.f27741;
                            iArr34[i78 + 9] = c10024.f27743;
                            iArr34[i78 + 10] = i21;
                            iArr34[i78 + 11] = iMax;
                            iArr34[i78 + 12] = c7343.f19244;
                            iArr34[i78 + 13] = 0;
                            iArr34[i78 + 14] = i75;
                            c7343.f19228 += 32;
                            int i80 = i21;
                            int i81 = iMax;
                            c7343.m16960(7, 0, iCharCount, i78, 0);
                            c7343.f19244 = i78;
                            if (z5) {
                                c10024.f27743 = iCharCount;
                                if (c10024.f27760) {
                                    c10024.f27741 = 0;
                                }
                                i23 = i80;
                                if (i23 < i81) {
                                    zM16978 = c7343.m16978(false);
                                }
                                if (zM16978) {
                                    i22 = c7343.f19235;
                                    iCharCount = c7343.f19240;
                                    c7341 = this;
                                    i28 = i22;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    z2 = false;
                                    c7342 = c7341;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                } else {
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    c7341 = this;
                                    c10024 = c10024;
                                    charSequence2 = charSequence4;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    while (true) {
                                        i4 = c7343.f19238;
                                        if (i4 == 0) {
                                            c7343.m16979(0);
                                            return false;
                                        }
                                        i5 = i4 - 6;
                                        c7343.m16979(c7343.f19242[i4 - 3]);
                                        iArr = c7343.f19242;
                                        i3 = iArr[i4 - 5];
                                        i6 = i4 - 4;
                                        iM16984 = iArr[i6];
                                        i7 = iArr[i5];
                                        if (i7 == 7) {
                                            zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (zM17005) {
                                                c10023 = c10024;
                                                c10024 = c10023;
                                            } else {
                                                i3 = c7343.f19235;
                                                iCharCount = c7343.f19240;
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (i7 == 9) {
                                                c10023 = c10024;
                                                if (i7 == 8) {
                                                    c7343.f19238 = i5;
                                                    i8 = iArr[i4 - 2];
                                                    i9 = iArr[i4 - 1];
                                                    if (c7343.f19241.f31730) {
                                                        c7343.m17014(~i8, i9 - 1);
                                                        c7343.m17018(i8, i9);
                                                    } else {
                                                        c7343.m16995(i8, i9);
                                                    }
                                                } else if (i7 == 3) {
                                                    c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                    iArr2 = c8682.f23490;
                                                    int i311111111111114 = i4 - 2;
                                                    i13 = iArr[i311111111111114];
                                                    iArr[i311111111111114] = i13 + 1;
                                                    i14 = iArr2[i13];
                                                    if (i13 == iArr2.length - 1) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    if (c10023.m23374()) {
                                                        c7343.f19230 = true;
                                                        return false;
                                                    }
                                                    if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                        c10024 = c10023;
                                                    } else {
                                                        i3 = i14;
                                                    }
                                                } else if (i7 == 4) {
                                                    i11 = i4 - 2;
                                                    int i311111111111115 = iArr[i11];
                                                    int i311111111111116 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i311111111111115)];
                                                    i12 = i311111111111115 & (i311111111111115 - 1);
                                                    if (i12 == 0) {
                                                        c7343.f19238 = i5;
                                                    } else {
                                                        c7343.f19242[i11] = i12;
                                                    }
                                                    i3 = i311111111111116;
                                                } else if (i7 == 6) {
                                                    c7343.m17002(iArr[i4 - 2], iM16984);
                                                    if (c7343.f19230) {
                                                        return false;
                                                    }
                                                    c7343.f19238 = i5;
                                                } else if (i7 == 5) {
                                                    i29 = iArr[i4 - 2];
                                                    i30 = iArr[i4 - 1];
                                                    c7343.f19238 = i5;
                                                    charSequence4 = charSequence2;
                                                    iCharCount = iM16984;
                                                } else {
                                                    if (i7 == 1) {
                                                        if (i7 == 2) {
                                                            int iMax11115 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                            int[] iArr11119 = c7343.f19242;
                                                            iArr11119[i6] = iMax11115;
                                                            int i311111111111117 = i4 - 1;
                                                            i10 = iArr11119[i311111111111117] - 1;
                                                            iArr11119[i311111111111117] = i10;
                                                            if (i10 == 0) {
                                                                c7343.f19238 = i5;
                                                            }
                                                            iCharCount = iMax11115;
                                                        } else {
                                                            c7343.f19238 = i5;
                                                        }
                                                    } else if (i7 == 2) {
                                                        int iMax11116 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                        int[] iArr111110 = c7343.f19242;
                                                        iArr111110[i6] = iMax11116;
                                                        int i311111111111118 = i4 - 1;
                                                        i10 = iArr111110[i311111111111118] - 1;
                                                        iArr111110[i311111111111118] = i10;
                                                        if (i10 == 0) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        iCharCount = iMax11116;
                                                    } else {
                                                        c7343.f19238 = i5;
                                                    }
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (c10024.m23374()) {
                                                    c7343.f19230 = true;
                                                    return false;
                                                }
                                                i15 = i4 - 1;
                                                int i311111111111119 = c7343.f19242[i15];
                                                c10023 = c10024;
                                                iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i311111111111119 - Character.charCount(Character.codePointBefore(charSequence2, i311111111111119)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                if (iM16984 < 0) {
                                                    c7343.f19238 = i5;
                                                    c10024 = c10023;
                                                } else {
                                                    c7343.f19242[i15] = iM16984;
                                                    i14 = iArr3[i3 + 1];
                                                    i3 = i14;
                                                }
                                            }
                                            iCharCount = iM16984;
                                            charSequence4 = charSequence2;
                                        }
                                        i28 = i3;
                                        z2 = false;
                                        c7342 = c7341;
                                        objArr2 = objArr2;
                                        iArr3 = iArr3;
                                    }
                                }
                            } else {
                                i23 = i80;
                                if (i74 != 4) {
                                    if (c10024.f27760) {
                                        c10024.f27757 = c10024.f27749.length();
                                    }
                                    if (i74 == 1 && iCharCount >= c10024.f27757) {
                                        c10024.f27746 = true;
                                    }
                                }
                            }
                            c7343.f19235 = c7343.f19233[i79];
                            c7343.f19240 = i23;
                            zM16978 = true;
                            if (zM16978) {
                                i22 = c7343.f19235;
                                iCharCount = c7343.f19240;
                                c7341 = this;
                                i28 = i22;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            } else {
                                if (c7343.f19230) {
                                    return false;
                                }
                                c7341 = this;
                                c10024 = c10024;
                                charSequence2 = charSequence4;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                while (true) {
                                    i4 = c7343.f19238;
                                    if (i4 == 0) {
                                        c7343.m16979(0);
                                        return false;
                                    }
                                    i5 = i4 - 6;
                                    c7343.m16979(c7343.f19242[i4 - 3]);
                                    iArr = c7343.f19242;
                                    i3 = iArr[i4 - 5];
                                    i6 = i4 - 4;
                                    iM16984 = iArr[i6];
                                    i7 = iArr[i5];
                                    if (i7 == 7) {
                                        zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (zM17005) {
                                            c10023 = c10024;
                                            c10024 = c10023;
                                        } else {
                                            i3 = c7343.f19235;
                                            iCharCount = c7343.f19240;
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (i7 == 9) {
                                            c10023 = c10024;
                                            if (i7 == 8) {
                                                c7343.f19238 = i5;
                                                i8 = iArr[i4 - 2];
                                                i9 = iArr[i4 - 1];
                                                if (c7343.f19241.f31730) {
                                                    c7343.m17014(~i8, i9 - 1);
                                                    c7343.m17018(i8, i9);
                                                } else {
                                                    c7343.m16995(i8, i9);
                                                }
                                            } else if (i7 == 3) {
                                                c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                iArr2 = c8682.f23490;
                                                int i3111111111111110 = i4 - 2;
                                                i13 = iArr[i3111111111111110];
                                                iArr[i3111111111111110] = i13 + 1;
                                                i14 = iArr2[i13];
                                                if (i13 == iArr2.length - 1) {
                                                    c7343.f19238 = i5;
                                                }
                                                if (c10023.m23374()) {
                                                    c7343.f19230 = true;
                                                    return false;
                                                }
                                                if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                    c10024 = c10023;
                                                } else {
                                                    i3 = i14;
                                                }
                                            } else if (i7 == 4) {
                                                i11 = i4 - 2;
                                                int i3111111111111111 = iArr[i11];
                                                int i3111111111111112 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i3111111111111111)];
                                                i12 = i3111111111111111 & (i3111111111111111 - 1);
                                                if (i12 == 0) {
                                                    c7343.f19238 = i5;
                                                } else {
                                                    c7343.f19242[i11] = i12;
                                                }
                                                i3 = i3111111111111112;
                                            } else if (i7 == 6) {
                                                c7343.m17002(iArr[i4 - 2], iM16984);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                c7343.f19238 = i5;
                                            } else if (i7 == 5) {
                                                i29 = iArr[i4 - 2];
                                                i30 = iArr[i4 - 1];
                                                c7343.f19238 = i5;
                                                charSequence4 = charSequence2;
                                                iCharCount = iM16984;
                                            } else {
                                                if (i7 == 1) {
                                                    if (i7 == 2) {
                                                        int iMax11117 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                        int[] iArr111111 = c7343.f19242;
                                                        iArr111111[i6] = iMax11117;
                                                        int i3111111111111113 = i4 - 1;
                                                        i10 = iArr111111[i3111111111111113] - 1;
                                                        iArr111111[i3111111111111113] = i10;
                                                        if (i10 == 0) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        iCharCount = iMax11117;
                                                    } else {
                                                        c7343.f19238 = i5;
                                                    }
                                                } else if (i7 == 2) {
                                                    int iMax11118 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr111112 = c7343.f19242;
                                                    iArr111112[i6] = iMax11118;
                                                    int i3111111111111114 = i4 - 1;
                                                    i10 = iArr111112[i3111111111111114] - 1;
                                                    iArr111112[i3111111111111114] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax11118;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (c10024.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            i15 = i4 - 1;
                                            int i3111111111111115 = c7343.f19242[i15];
                                            c10023 = c10024;
                                            iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i3111111111111115 - Character.charCount(Character.codePointBefore(charSequence2, i3111111111111115)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (iM16984 < 0) {
                                                c7343.f19238 = i5;
                                                c10024 = c10023;
                                            } else {
                                                c7343.f19242[i15] = iM16984;
                                                i14 = iArr3[i3 + 1];
                                                i3 = i14;
                                            }
                                        }
                                        iCharCount = iM16984;
                                        charSequence4 = charSequence2;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c7342 = c7341;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            }
                            break;
                        case 23:
                            int[] iArr35 = c10024.f27745;
                            iArr35[0] = c10024.f27768;
                            c10024.m23383(iCharCount);
                            iArr35[1] = iCharCount;
                            if (!c7343.m16978(true)) {
                                if (c7343.f19230) {
                                    return false;
                                }
                                c7341 = this;
                                c10024 = c10024;
                                charSequence2 = charSequence4;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                while (true) {
                                    i4 = c7343.f19238;
                                    if (i4 == 0) {
                                        c7343.m16979(0);
                                        return false;
                                    }
                                    i5 = i4 - 6;
                                    c7343.m16979(c7343.f19242[i4 - 3]);
                                    iArr = c7343.f19242;
                                    i3 = iArr[i4 - 5];
                                    i6 = i4 - 4;
                                    iM16984 = iArr[i6];
                                    i7 = iArr[i5];
                                    if (i7 == 7) {
                                        zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (zM17005) {
                                            c10023 = c10024;
                                            c10024 = c10023;
                                        } else {
                                            i3 = c7343.f19235;
                                            iCharCount = c7343.f19240;
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (i7 == 9) {
                                            c10023 = c10024;
                                            if (i7 == 8) {
                                                c7343.f19238 = i5;
                                                i8 = iArr[i4 - 2];
                                                i9 = iArr[i4 - 1];
                                                if (c7343.f19241.f31730) {
                                                    c7343.m17014(~i8, i9 - 1);
                                                    c7343.m17018(i8, i9);
                                                } else {
                                                    c7343.m16995(i8, i9);
                                                }
                                            } else if (i7 == 3) {
                                                c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                iArr2 = c8682.f23490;
                                                int i3111111111111116 = i4 - 2;
                                                i13 = iArr[i3111111111111116];
                                                iArr[i3111111111111116] = i13 + 1;
                                                i14 = iArr2[i13];
                                                if (i13 == iArr2.length - 1) {
                                                    c7343.f19238 = i5;
                                                }
                                                if (c10023.m23374()) {
                                                    c7343.f19230 = true;
                                                    return false;
                                                }
                                                if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                    c10024 = c10023;
                                                } else {
                                                    i3 = i14;
                                                }
                                            } else if (i7 == 4) {
                                                i11 = i4 - 2;
                                                int i3111111111111117 = iArr[i11];
                                                int i3111111111111118 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i3111111111111117)];
                                                i12 = i3111111111111117 & (i3111111111111117 - 1);
                                                if (i12 == 0) {
                                                    c7343.f19238 = i5;
                                                } else {
                                                    c7343.f19242[i11] = i12;
                                                }
                                                i3 = i3111111111111118;
                                            } else if (i7 == 6) {
                                                c7343.m17002(iArr[i4 - 2], iM16984);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                c7343.f19238 = i5;
                                            } else if (i7 == 5) {
                                                i29 = iArr[i4 - 2];
                                                i30 = iArr[i4 - 1];
                                                c7343.f19238 = i5;
                                                charSequence4 = charSequence2;
                                                iCharCount = iM16984;
                                            } else {
                                                if (i7 == 1) {
                                                    if (i7 == 2) {
                                                        int iMax11119 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                        int[] iArr111113 = c7343.f19242;
                                                        iArr111113[i6] = iMax11119;
                                                        int i3111111111111119 = i4 - 1;
                                                        i10 = iArr111113[i3111111111111119] - 1;
                                                        iArr111113[i3111111111111119] = i10;
                                                        if (i10 == 0) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        iCharCount = iMax11119;
                                                    } else {
                                                        c7343.f19238 = i5;
                                                    }
                                                } else if (i7 == 2) {
                                                    int iMax111110 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr111114 = c7343.f19242;
                                                    iArr111114[i6] = iMax111110;
                                                    int i31111111111111110 = i4 - 1;
                                                    i10 = iArr111114[i31111111111111110] - 1;
                                                    iArr111114[i31111111111111110] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax111110;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (c10024.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            i15 = i4 - 1;
                                            int i31111111111111111 = c7343.f19242[i15];
                                            c10023 = c10024;
                                            iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i31111111111111111 - Character.charCount(Character.codePointBefore(charSequence2, i31111111111111111)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (iM16984 < 0) {
                                                c7343.f19238 = i5;
                                                c10024 = c10023;
                                            } else {
                                                c7343.f19242[i15] = iM16984;
                                                i14 = iArr3[i3 + 1];
                                                i3 = i14;
                                            }
                                        }
                                        iCharCount = iM16984;
                                        charSequence4 = charSequence2;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c7342 = c7341;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            } else {
                                i22 = c7343.f19235;
                                iCharCount = c7343.f19240;
                                c7341 = this;
                                i28 = i22;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            break;
                        case 24:
                            if (iCharCount == c10024.f27743) {
                                if (c7343.m16978(true)) {
                                    i22 = c7343.f19235;
                                    iCharCount = c7343.f19240;
                                    c7341 = this;
                                    i28 = i22;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    z2 = false;
                                    c7342 = c7341;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                } else if (c7343.f19230) {
                                    return false;
                                }
                            }
                            c7341 = this;
                            c10024 = c10024;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c7343.f19238;
                                if (i4 == 0) {
                                    c7343.m16979(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c7343.m16979(c7343.f19242[i4 - 3]);
                                iArr = c7343.f19242;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM16984 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    if (zM17005) {
                                        c10023 = c10024;
                                        c10024 = c10023;
                                    } else {
                                        i3 = c7343.f19235;
                                        iCharCount = c7343.f19240;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c10023 = c10024;
                                        if (i7 == 8) {
                                            c7343.f19238 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c7343.f19241.f31730) {
                                                c7343.m17014(~i8, i9 - 1);
                                                c7343.m17018(i8, i9);
                                            } else {
                                                c7343.m16995(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c8682.f23490;
                                            int i31111111111111112 = i4 - 2;
                                            i13 = iArr[i31111111111111112];
                                            iArr[i31111111111111112] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c7343.f19238 = i5;
                                            }
                                            if (c10023.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                c10024 = c10023;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i31111111111111113 = iArr[i11];
                                            int i31111111111111114 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i31111111111111113)];
                                            i12 = i31111111111111113 & (i31111111111111113 - 1);
                                            if (i12 == 0) {
                                                c7343.f19238 = i5;
                                            } else {
                                                c7343.f19242[i11] = i12;
                                            }
                                            i3 = i31111111111111114;
                                        } else if (i7 == 6) {
                                            c7343.m17002(iArr[i4 - 2], iM16984);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            c7343.f19238 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c7343.f19238 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM16984;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax111111 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr111115 = c7343.f19242;
                                                    iArr111115[i6] = iMax111111;
                                                    int i31111111111111115 = i4 - 1;
                                                    i10 = iArr111115[i31111111111111115] - 1;
                                                    iArr111115[i31111111111111115] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax111111;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax111112 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                int[] iArr111116 = c7343.f19242;
                                                iArr111116[i6] = iMax111112;
                                                int i31111111111111116 = i4 - 1;
                                                i10 = iArr111116[i31111111111111116] - 1;
                                                iArr111116[i31111111111111116] = i10;
                                                if (i10 == 0) {
                                                    c7343.f19238 = i5;
                                                }
                                                iCharCount = iMax111112;
                                            } else {
                                                c7343.f19238 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c10024.m23374()) {
                                            c7343.f19230 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i31111111111111117 = c7343.f19242[i15];
                                        c10023 = c10024;
                                        iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i31111111111111117 - Character.charCount(Character.codePointBefore(charSequence2, i31111111111111117)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (iM16984 < 0) {
                                            c7343.f19238 = i5;
                                            c10024 = c10023;
                                        } else {
                                            c7343.f19242[i15] = iM16984;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM16984;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            break;
                        case 25:
                            int[] iArr36 = c7343.f19241.f31731;
                            int iM16947 = c7343.m16947(iArr36[i28 + 2], iArr36[i28 + 3], iArr36[i31], iCharCount, 0, false);
                            C10694 c10694M16983 = c7343.m16983(iM16947);
                            if (!c10694M16983.f29630) {
                                if (c10694M16983.f29632 > 0) {
                                    c7343.m16963(iM16947, 0, true);
                                } else {
                                    zM17017 = c7343.m17017(iM16947);
                                }
                                if (zM17017) {
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    c7341 = this;
                                    c10024 = c10024;
                                    charSequence2 = charSequence4;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    while (true) {
                                        i4 = c7343.f19238;
                                        if (i4 == 0) {
                                            c7343.m16979(0);
                                            return false;
                                        }
                                        i5 = i4 - 6;
                                        c7343.m16979(c7343.f19242[i4 - 3]);
                                        iArr = c7343.f19242;
                                        i3 = iArr[i4 - 5];
                                        i6 = i4 - 4;
                                        iM16984 = iArr[i6];
                                        i7 = iArr[i5];
                                        if (i7 == 7) {
                                            zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (zM17005) {
                                                c10023 = c10024;
                                                c10024 = c10023;
                                            } else {
                                                i3 = c7343.f19235;
                                                iCharCount = c7343.f19240;
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (i7 == 9) {
                                                c10023 = c10024;
                                                if (i7 == 8) {
                                                    c7343.f19238 = i5;
                                                    i8 = iArr[i4 - 2];
                                                    i9 = iArr[i4 - 1];
                                                    if (c7343.f19241.f31730) {
                                                        c7343.m17014(~i8, i9 - 1);
                                                        c7343.m17018(i8, i9);
                                                    } else {
                                                        c7343.m16995(i8, i9);
                                                    }
                                                } else if (i7 == 3) {
                                                    c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                    iArr2 = c8682.f23490;
                                                    int i31111111111111118 = i4 - 2;
                                                    i13 = iArr[i31111111111111118];
                                                    iArr[i31111111111111118] = i13 + 1;
                                                    i14 = iArr2[i13];
                                                    if (i13 == iArr2.length - 1) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    if (c10023.m23374()) {
                                                        c7343.f19230 = true;
                                                        return false;
                                                    }
                                                    if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                        c10024 = c10023;
                                                    } else {
                                                        i3 = i14;
                                                    }
                                                } else if (i7 == 4) {
                                                    i11 = i4 - 2;
                                                    int i31111111111111119 = iArr[i11];
                                                    int i311111111111111110 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i31111111111111119)];
                                                    i12 = i31111111111111119 & (i31111111111111119 - 1);
                                                    if (i12 == 0) {
                                                        c7343.f19238 = i5;
                                                    } else {
                                                        c7343.f19242[i11] = i12;
                                                    }
                                                    i3 = i311111111111111110;
                                                } else if (i7 == 6) {
                                                    c7343.m17002(iArr[i4 - 2], iM16984);
                                                    if (c7343.f19230) {
                                                        return false;
                                                    }
                                                    c7343.f19238 = i5;
                                                } else if (i7 == 5) {
                                                    i29 = iArr[i4 - 2];
                                                    i30 = iArr[i4 - 1];
                                                    c7343.f19238 = i5;
                                                    charSequence4 = charSequence2;
                                                    iCharCount = iM16984;
                                                } else {
                                                    if (i7 == 1) {
                                                        if (i7 == 2) {
                                                            int iMax111113 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                            int[] iArr111117 = c7343.f19242;
                                                            iArr111117[i6] = iMax111113;
                                                            int i311111111111111111 = i4 - 1;
                                                            i10 = iArr111117[i311111111111111111] - 1;
                                                            iArr111117[i311111111111111111] = i10;
                                                            if (i10 == 0) {
                                                                c7343.f19238 = i5;
                                                            }
                                                            iCharCount = iMax111113;
                                                        } else {
                                                            c7343.f19238 = i5;
                                                        }
                                                    } else if (i7 == 2) {
                                                        int iMax111114 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                        int[] iArr111118 = c7343.f19242;
                                                        iArr111118[i6] = iMax111114;
                                                        int i311111111111111112 = i4 - 1;
                                                        i10 = iArr111118[i311111111111111112] - 1;
                                                        iArr111118[i311111111111111112] = i10;
                                                        if (i10 == 0) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        iCharCount = iMax111114;
                                                    } else {
                                                        c7343.f19238 = i5;
                                                    }
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (c10024.m23374()) {
                                                    c7343.f19230 = true;
                                                    return false;
                                                }
                                                i15 = i4 - 1;
                                                int i311111111111111113 = c7343.f19242[i15];
                                                c10023 = c10024;
                                                iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i311111111111111113 - Character.charCount(Character.codePointBefore(charSequence2, i311111111111111113)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                if (iM16984 < 0) {
                                                    c7343.f19238 = i5;
                                                    c10024 = c10023;
                                                } else {
                                                    c7343.f19242[i15] = iM16984;
                                                    i14 = iArr3[i3 + 1];
                                                    i3 = i14;
                                                }
                                            }
                                            iCharCount = iM16984;
                                            charSequence4 = charSequence2;
                                        }
                                        i28 = i3;
                                        z2 = false;
                                        c7342 = c7341;
                                        objArr2 = objArr2;
                                        iArr3 = iArr3;
                                    }
                                } else {
                                    i22 = c7343.f19235;
                                    iCharCount = c7343.f19240;
                                    c7341 = this;
                                    i28 = i22;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    z2 = false;
                                    c7342 = c7341;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            } else {
                                EnumC3791 enumC3791 = c10694M16983.f29634;
                                EnumC3791 enumC3792 = EnumC3791.LAZY;
                                c7343.m16963(iM16947, enumC3791 == enumC3792 ? 12 : 10, enumC3791 != enumC3792);
                            }
                            zM17017 = true;
                            if (zM17017) {
                                i22 = c7343.f19235;
                                iCharCount = c7343.f19240;
                                c7341 = this;
                                i28 = i22;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            } else {
                                if (c7343.f19230) {
                                    return false;
                                }
                                c7341 = this;
                                c10024 = c10024;
                                charSequence2 = charSequence4;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                while (true) {
                                    i4 = c7343.f19238;
                                    if (i4 == 0) {
                                        c7343.m16979(0);
                                        return false;
                                    }
                                    i5 = i4 - 6;
                                    c7343.m16979(c7343.f19242[i4 - 3]);
                                    iArr = c7343.f19242;
                                    i3 = iArr[i4 - 5];
                                    i6 = i4 - 4;
                                    iM16984 = iArr[i6];
                                    i7 = iArr[i5];
                                    if (i7 == 7) {
                                        zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (zM17005) {
                                            c10023 = c10024;
                                            c10024 = c10023;
                                        } else {
                                            i3 = c7343.f19235;
                                            iCharCount = c7343.f19240;
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (i7 == 9) {
                                            c10023 = c10024;
                                            if (i7 == 8) {
                                                c7343.f19238 = i5;
                                                i8 = iArr[i4 - 2];
                                                i9 = iArr[i4 - 1];
                                                if (c7343.f19241.f31730) {
                                                    c7343.m17014(~i8, i9 - 1);
                                                    c7343.m17018(i8, i9);
                                                } else {
                                                    c7343.m16995(i8, i9);
                                                }
                                            } else if (i7 == 3) {
                                                c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                iArr2 = c8682.f23490;
                                                int i311111111111111114 = i4 - 2;
                                                i13 = iArr[i311111111111111114];
                                                iArr[i311111111111111114] = i13 + 1;
                                                i14 = iArr2[i13];
                                                if (i13 == iArr2.length - 1) {
                                                    c7343.f19238 = i5;
                                                }
                                                if (c10023.m23374()) {
                                                    c7343.f19230 = true;
                                                    return false;
                                                }
                                                if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                    c10024 = c10023;
                                                } else {
                                                    i3 = i14;
                                                }
                                            } else if (i7 == 4) {
                                                i11 = i4 - 2;
                                                int i311111111111111115 = iArr[i11];
                                                int i311111111111111116 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i311111111111111115)];
                                                i12 = i311111111111111115 & (i311111111111111115 - 1);
                                                if (i12 == 0) {
                                                    c7343.f19238 = i5;
                                                } else {
                                                    c7343.f19242[i11] = i12;
                                                }
                                                i3 = i311111111111111116;
                                            } else if (i7 == 6) {
                                                c7343.m17002(iArr[i4 - 2], iM16984);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                c7343.f19238 = i5;
                                            } else if (i7 == 5) {
                                                i29 = iArr[i4 - 2];
                                                i30 = iArr[i4 - 1];
                                                c7343.f19238 = i5;
                                                charSequence4 = charSequence2;
                                                iCharCount = iM16984;
                                            } else {
                                                if (i7 == 1) {
                                                    if (i7 == 2) {
                                                        int iMax111115 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                        int[] iArr111119 = c7343.f19242;
                                                        iArr111119[i6] = iMax111115;
                                                        int i311111111111111117 = i4 - 1;
                                                        i10 = iArr111119[i311111111111111117] - 1;
                                                        iArr111119[i311111111111111117] = i10;
                                                        if (i10 == 0) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        iCharCount = iMax111115;
                                                    } else {
                                                        c7343.f19238 = i5;
                                                    }
                                                } else if (i7 == 2) {
                                                    int iMax111116 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr1111110 = c7343.f19242;
                                                    iArr1111110[i6] = iMax111116;
                                                    int i311111111111111118 = i4 - 1;
                                                    i10 = iArr1111110[i311111111111111118] - 1;
                                                    iArr1111110[i311111111111111118] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax111116;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (c10024.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            i15 = i4 - 1;
                                            int i311111111111111119 = c7343.f19242[i15];
                                            c10023 = c10024;
                                            iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i311111111111111119 - Character.charCount(Character.codePointBefore(charSequence2, i311111111111111119)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (iM16984 < 0) {
                                                c7343.f19238 = i5;
                                                c10024 = c10023;
                                            } else {
                                                c7343.f19242[i15] = iM16984;
                                                i14 = iArr3[i3 + 1];
                                                i3 = i14;
                                            }
                                        }
                                        iCharCount = iM16984;
                                        charSequence4 = charSequence2;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c7342 = c7341;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            }
                            break;
                        case 26:
                            if (c7343.f19241.f31730) {
                                c7343.m16980(iArr3[i28 + 2]);
                            }
                            if (iArr3[i28 + 4] <= 0) {
                                if (iArr3[i28 + 5] > 0) {
                                    c7343.m16960(8, iArr3[i28 + 6], iCharCount, iArr3[i28 + 2], 1);
                                }
                                c7341 = c7342;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            } else {
                                int i82 = iArr3[i28 + 2];
                                if (c7343.f19241.f31730) {
                                    c7343.m17018(i82, 1);
                                } else {
                                    c7343.m16995(i82, 1);
                                }
                                i22 = iArr3[i28 + 6];
                                c7341 = this;
                                i28 = i22;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            break;
                        case 27:
                            if (iCharCount > c7343.m17007(iArr3[i28 + 3])) {
                                if (c7343.m16996()) {
                                    return false;
                                }
                                int i83 = i28 + 2;
                                int iM17009 = c7343.m17007(iArr3[i83]);
                                if (iM17009 < iArr3[i28 + 4]) {
                                    c7343.m16995(iArr3[i83], iM17009 + 1);
                                    i28 = iArr3[i28 + 6];
                                    z2 = false;
                                } else if (iM17009 < iArr3[i28 + 5]) {
                                    c7343.m16960(8, iArr3[i28 + 6], iCharCount, iArr3[i83], iM17009 + 1);
                                    charSequence4 = charSequence;
                                }
                                break;
                            }
                            c7341 = c7342;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            i28 = i3;
                            z2 = false;
                            c7342 = c7341;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                            int iM5794 = C3317.m5794((int[]) objArr2[iArr3[i28 + 2]], iArr3[i28 + 3], c10024, charSequence4, iCharCount);
                            if (iM5794 == -2) {
                                c7343.f19230 = true;
                                return false;
                            }
                            if (iM5794 != -1) {
                                iM11539 = iM5794;
                                c7341 = c7342;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                iCharCount = iM11539;
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            c7341 = this;
                            c10024 = c10024;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c7343.f19238;
                                if (i4 == 0) {
                                    c7343.m16979(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c7343.m16979(c7343.f19242[i4 - 3]);
                                iArr = c7343.f19242;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM16984 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    if (zM17005) {
                                        c10023 = c10024;
                                        c10024 = c10023;
                                    } else {
                                        i3 = c7343.f19235;
                                        iCharCount = c7343.f19240;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c10023 = c10024;
                                        if (i7 == 8) {
                                            c7343.f19238 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c7343.f19241.f31730) {
                                                c7343.m17014(~i8, i9 - 1);
                                                c7343.m17018(i8, i9);
                                            } else {
                                                c7343.m16995(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c8682.f23490;
                                            int i3111111111111111110 = i4 - 2;
                                            i13 = iArr[i3111111111111111110];
                                            iArr[i3111111111111111110] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c7343.f19238 = i5;
                                            }
                                            if (c10023.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                c10024 = c10023;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i3111111111111111111 = iArr[i11];
                                            int i3111111111111111112 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i3111111111111111111)];
                                            i12 = i3111111111111111111 & (i3111111111111111111 - 1);
                                            if (i12 == 0) {
                                                c7343.f19238 = i5;
                                            } else {
                                                c7343.f19242[i11] = i12;
                                            }
                                            i3 = i3111111111111111112;
                                        } else if (i7 == 6) {
                                            c7343.m17002(iArr[i4 - 2], iM16984);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            c7343.f19238 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c7343.f19238 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM16984;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax111117 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr1111111 = c7343.f19242;
                                                    iArr1111111[i6] = iMax111117;
                                                    int i3111111111111111113 = i4 - 1;
                                                    i10 = iArr1111111[i3111111111111111113] - 1;
                                                    iArr1111111[i3111111111111111113] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax111117;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax111118 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                int[] iArr1111112 = c7343.f19242;
                                                iArr1111112[i6] = iMax111118;
                                                int i3111111111111111114 = i4 - 1;
                                                i10 = iArr1111112[i3111111111111111114] - 1;
                                                iArr1111112[i3111111111111111114] = i10;
                                                if (i10 == 0) {
                                                    c7343.f19238 = i5;
                                                }
                                                iCharCount = iMax111118;
                                            } else {
                                                c7343.f19238 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c10024.m23374()) {
                                            c7343.f19230 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i3111111111111111115 = c7343.f19242[i15];
                                        c10023 = c10024;
                                        iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i3111111111111111115 - Character.charCount(Character.codePointBefore(charSequence2, i3111111111111111115)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (iM16984 < 0) {
                                            c7343.f19238 = i5;
                                            c10024 = c10023;
                                        } else {
                                            c7343.f19242[i15] = iM16984;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM16984;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            break;
                        case 34:
                            int i84 = iArr3[i28 + 2];
                            int i85 = iArr3[i28 + 3];
                            int[] iArr37 = c10024.f27745;
                            int iCharCount3 = iArr37[i84];
                            int i86 = iArr37[i84 + 1] - iCharCount3;
                            if (iCharCount3 >= 0) {
                                i25 = iCharCount + i86;
                                if (i25 > length) {
                                    c10024.f27755 = true;
                                } else if (i85 == 0) {
                                    int i87 = 0;
                                    while (true) {
                                        if (i87 >= i86) {
                                            i24 = -2;
                                        } else if (charSequence4.charAt(iCharCount + i87) == charSequence4.charAt(iCharCount3 + i87)) {
                                            if (c10024.m23374()) {
                                                i24 = -2;
                                                i25 = -2;
                                            } else {
                                                i87++;
                                            }
                                        }
                                    }
                                } else {
                                    if (i85 != 1 && i85 != 2) {
                                        throw new IllegalArgumentException(C20778.m46922(i85, "Unknown regex back-reference mode: "));
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
                                                } else if (C23434.m52142(iCodePointAt3) != C23434.m52142(iCodePointAt4)) {
                                                }
                                            }
                                            iCharCount += Character.charCount(iCodePointAt3);
                                            iCharCount3 += Character.charCount(iCodePointAt4);
                                            if (iCodePointAt3 >= 65536) {
                                                i86--;
                                            }
                                            if (c10024.m23374()) {
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
                                c7343.f19230 = true;
                                return false;
                            }
                            if (i25 >= 0) {
                                iM11539 = i25;
                                c7341 = c7342;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                iCharCount = iM11539;
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            c7341 = this;
                            c10024 = c10024;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c7343.f19238;
                                if (i4 == 0) {
                                    c7343.m16979(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c7343.m16979(c7343.f19242[i4 - 3]);
                                iArr = c7343.f19242;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM16984 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    if (zM17005) {
                                        c10023 = c10024;
                                        c10024 = c10023;
                                    } else {
                                        i3 = c7343.f19235;
                                        iCharCount = c7343.f19240;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c10023 = c10024;
                                        if (i7 == 8) {
                                            c7343.f19238 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c7343.f19241.f31730) {
                                                c7343.m17014(~i8, i9 - 1);
                                                c7343.m17018(i8, i9);
                                            } else {
                                                c7343.m16995(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c8682.f23490;
                                            int i3111111111111111116 = i4 - 2;
                                            i13 = iArr[i3111111111111111116];
                                            iArr[i3111111111111111116] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c7343.f19238 = i5;
                                            }
                                            if (c10023.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                c10024 = c10023;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i3111111111111111117 = iArr[i11];
                                            int i3111111111111111118 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i3111111111111111117)];
                                            i12 = i3111111111111111117 & (i3111111111111111117 - 1);
                                            if (i12 == 0) {
                                                c7343.f19238 = i5;
                                            } else {
                                                c7343.f19242[i11] = i12;
                                            }
                                            i3 = i3111111111111111118;
                                        } else if (i7 == 6) {
                                            c7343.m17002(iArr[i4 - 2], iM16984);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            c7343.f19238 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c7343.f19238 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM16984;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax111119 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr1111113 = c7343.f19242;
                                                    iArr1111113[i6] = iMax111119;
                                                    int i3111111111111111119 = i4 - 1;
                                                    i10 = iArr1111113[i3111111111111111119] - 1;
                                                    iArr1111113[i3111111111111111119] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax111119;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax1111110 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                int[] iArr1111114 = c7343.f19242;
                                                iArr1111114[i6] = iMax1111110;
                                                int i31111111111111111110 = i4 - 1;
                                                i10 = iArr1111114[i31111111111111111110] - 1;
                                                iArr1111114[i31111111111111111110] = i10;
                                                if (i10 == 0) {
                                                    c7343.f19238 = i5;
                                                }
                                                iCharCount = iMax1111110;
                                            } else {
                                                c7343.f19238 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c10024.m23374()) {
                                            c7343.f19230 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i31111111111111111111 = c7343.f19242[i15];
                                        c10023 = c10024;
                                        iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i31111111111111111111 - Character.charCount(Character.codePointBefore(charSequence2, i31111111111111111111)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (iM16984 < 0) {
                                            c7343.f19238 = i5;
                                            c10024 = c10023;
                                        } else {
                                            c7343.f19242[i15] = iM16984;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM16984;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
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
                                    iM11539 = iCharCount + 1;
                                    if (iM11539 >= c10024.f27757) {
                                        c10024.f27755 = true;
                                    } else if (charSequence4.charAt(iM11539) == '\n') {
                                        c7343.m16960(0, i3, iM11539, 0, 0);
                                        iCharCount += 2;
                                    }
                                    c7341 = c7342;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    iCharCount = iM11539;
                                    i28 = i3;
                                    z2 = false;
                                    c7342 = c7341;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                                iM11539 = iCharCount;
                                c7341 = c7342;
                                iArr3 = iArr3;
                                objArr2 = objArr2;
                                iCharCount = iM11539;
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            } else {
                                c10024.f27755 = true;
                            }
                            c7341 = this;
                            c10024 = c10024;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c7343.f19238;
                                if (i4 == 0) {
                                    c7343.m16979(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c7343.m16979(c7343.f19242[i4 - 3]);
                                iArr = c7343.f19242;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM16984 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    if (zM17005) {
                                        c10023 = c10024;
                                        c10024 = c10023;
                                    } else {
                                        i3 = c7343.f19235;
                                        iCharCount = c7343.f19240;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c10023 = c10024;
                                        if (i7 == 8) {
                                            c7343.f19238 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c7343.f19241.f31730) {
                                                c7343.m17014(~i8, i9 - 1);
                                                c7343.m17018(i8, i9);
                                            } else {
                                                c7343.m16995(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c8682.f23490;
                                            int i31111111111111111112 = i4 - 2;
                                            i13 = iArr[i31111111111111111112];
                                            iArr[i31111111111111111112] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c7343.f19238 = i5;
                                            }
                                            if (c10023.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                c10024 = c10023;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i31111111111111111113 = iArr[i11];
                                            int i31111111111111111114 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i31111111111111111113)];
                                            i12 = i31111111111111111113 & (i31111111111111111113 - 1);
                                            if (i12 == 0) {
                                                c7343.f19238 = i5;
                                            } else {
                                                c7343.f19242[i11] = i12;
                                            }
                                            i3 = i31111111111111111114;
                                        } else if (i7 == 6) {
                                            c7343.m17002(iArr[i4 - 2], iM16984);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            c7343.f19238 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c7343.f19238 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM16984;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax1111111 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr1111115 = c7343.f19242;
                                                    iArr1111115[i6] = iMax1111111;
                                                    int i31111111111111111115 = i4 - 1;
                                                    i10 = iArr1111115[i31111111111111111115] - 1;
                                                    iArr1111115[i31111111111111111115] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax1111111;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax1111112 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                int[] iArr1111116 = c7343.f19242;
                                                iArr1111116[i6] = iMax1111112;
                                                int i31111111111111111116 = i4 - 1;
                                                i10 = iArr1111116[i31111111111111111116] - 1;
                                                iArr1111116[i31111111111111111116] = i10;
                                                if (i10 == 0) {
                                                    c7343.f19238 = i5;
                                                }
                                                iCharCount = iMax1111112;
                                            } else {
                                                c7343.f19238 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c10024.m23374()) {
                                            c7343.f19230 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i31111111111111111117 = c7343.f19242[i15];
                                        c10023 = c10024;
                                        iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i31111111111111111117 - Character.charCount(Character.codePointBefore(charSequence2, i31111111111111111117)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (iM16984 < 0) {
                                            c7343.f19238 = i5;
                                            c10024 = c10023;
                                        } else {
                                            c7343.f19242[i15] = iM16984;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM16984;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            break;
                        case 36:
                        case 37:
                            if (i32 != 36) {
                                int i89 = c10024.f27741;
                                if (c10024.f27760) {
                                    length = c10024.f27749.length();
                                    i89 = 0;
                                }
                                if (iCharCount != i89) {
                                    if (iCharCount < length) {
                                        boolean zIsSurrogatePair = Character.isSurrogatePair(charSequence4.charAt(iCharCount - 1), charSequence4.charAt(iCharCount));
                                        if (c10024.m23374() || Thread.currentThread().isInterrupted()) {
                                            iCharCount = -2;
                                        } else if (zIsSurrogatePair) {
                                            iCharCount = -1;
                                        } else {
                                            int iM115310 = C5329.m11539(charSequence4, c10024.m23369(), length, c10024);
                                            if (iM115310 == -2) {
                                                iCharCount = -2;
                                            } else if (iM115310 > iCharCount) {
                                                iCharCount = -1;
                                            }
                                        }
                                    } else {
                                        c10024.f27755 = true;
                                        c10024.f27746 = true;
                                    }
                                }
                            } else if (iCharCount < length) {
                                iCharCount = C5329.m11539(charSequence4, iCharCount, length, c10024);
                            } else {
                                c10024.f27755 = true;
                                iCharCount = -1;
                            }
                            if (iCharCount == -2) {
                                c7343.f19230 = true;
                                return false;
                            }
                            break;
                        case 38:
                            if (iCharCount < length) {
                                InterfaceC12628 interfaceC126211 = (InterfaceC12628) objArr2[iArr3[i28 + 2]];
                                int iCodePointAt5 = Character.codePointAt(charSequence4, iCharCount);
                                int iCharCount4 = Character.charCount(iCodePointAt5) + iCharCount;
                                iM11539 = C5329.m11539(charSequence4, iCharCount, c10024.f27757, c10024);
                                if (iM11539 == -2) {
                                    c7343.f19230 = true;
                                    return false;
                                }
                                if (iCharCount4 != iM11539) {
                                    int iM16985 = c7343.m16984(iCharCount, iCharCount4, iM11539, interfaceC126211, charSequence4);
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    if (iM16985 >= 0) {
                                        c7343.m16960(9, i28, iCharCount, iCharCount4, iM16985);
                                        iM11539 = iM16985;
                                        c7341 = c7342;
                                        iArr3 = iArr3;
                                        objArr2 = objArr2;
                                        iCharCount = iM11539;
                                        i28 = i3;
                                        z2 = false;
                                        c7342 = c7341;
                                        objArr2 = objArr2;
                                        iArr3 = iArr3;
                                    }
                                } else {
                                    if (interfaceC126211.mo4821(iCodePointAt5)) {
                                        c7341 = c7342;
                                        iArr3 = iArr3;
                                        objArr2 = objArr2;
                                        iCharCount = iM11539;
                                    }
                                    i28 = i3;
                                    z2 = false;
                                    c7342 = c7341;
                                    objArr2 = objArr2;
                                    iArr3 = iArr3;
                                }
                            } else {
                                c10024.f27755 = true;
                            }
                            c7341 = this;
                            c10024 = c10024;
                            charSequence2 = charSequence4;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            while (true) {
                                i4 = c7343.f19238;
                                if (i4 == 0) {
                                    c7343.m16979(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c7343.m16979(c7343.f19242[i4 - 3]);
                                iArr = c7343.f19242;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM16984 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    if (zM17005) {
                                        c10023 = c10024;
                                        c10024 = c10023;
                                    } else {
                                        i3 = c7343.f19235;
                                        iCharCount = c7343.f19240;
                                        charSequence4 = charSequence2;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c10023 = c10024;
                                        if (i7 == 8) {
                                            c7343.f19238 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c7343.f19241.f31730) {
                                                c7343.m17014(~i8, i9 - 1);
                                                c7343.m17018(i8, i9);
                                            } else {
                                                c7343.m16995(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c8682.f23490;
                                            int i31111111111111111118 = i4 - 2;
                                            i13 = iArr[i31111111111111111118];
                                            iArr[i31111111111111111118] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c7343.f19238 = i5;
                                            }
                                            if (c10023.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                c10024 = c10023;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i31111111111111111119 = iArr[i11];
                                            int i311111111111111111110 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i31111111111111111119)];
                                            i12 = i31111111111111111119 & (i31111111111111111119 - 1);
                                            if (i12 == 0) {
                                                c7343.f19238 = i5;
                                            } else {
                                                c7343.f19242[i11] = i12;
                                            }
                                            i3 = i311111111111111111110;
                                        } else if (i7 == 6) {
                                            c7343.m17002(iArr[i4 - 2], iM16984);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            c7343.f19238 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c7343.f19238 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM16984;
                                        } else {
                                            if (i7 == 1) {
                                                if (i7 == 2) {
                                                    int iMax1111113 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                    int[] iArr1111117 = c7343.f19242;
                                                    iArr1111117[i6] = iMax1111113;
                                                    int i311111111111111111111 = i4 - 1;
                                                    i10 = iArr1111117[i311111111111111111111] - 1;
                                                    iArr1111117[i311111111111111111111] = i10;
                                                    if (i10 == 0) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    iCharCount = iMax1111113;
                                                } else {
                                                    c7343.f19238 = i5;
                                                }
                                            } else if (i7 == 2) {
                                                int iMax1111114 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                int[] iArr1111118 = c7343.f19242;
                                                iArr1111118[i6] = iMax1111114;
                                                int i311111111111111111112 = i4 - 1;
                                                i10 = iArr1111118[i311111111111111111112] - 1;
                                                iArr1111118[i311111111111111111112] = i10;
                                                if (i10 == 0) {
                                                    c7343.f19238 = i5;
                                                }
                                                iCharCount = iMax1111114;
                                            } else {
                                                c7343.f19238 = i5;
                                            }
                                            charSequence4 = charSequence2;
                                        }
                                    } else {
                                        if (c10024.m23374()) {
                                            c7343.f19230 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i311111111111111111113 = c7343.f19242[i15];
                                        c10023 = c10024;
                                        iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i311111111111111111113 - Character.charCount(Character.codePointBefore(charSequence2, i311111111111111111113)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (iM16984 < 0) {
                                            c7343.f19238 = i5;
                                            c10024 = c10023;
                                        } else {
                                            c7343.f19242[i15] = iM16984;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM16984;
                                    charSequence4 = charSequence2;
                                }
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                                break;
                            }
                            break;
                        case 39:
                            C7933 c7934 = C16057.f47257;
                            if (iCharCount != charSequence4.length() && iCharCount != 0) {
                                int i90 = iCharCount - 1;
                                boolean z6 = Character.isJavaIdentifierPart(charSequence4.charAt(i90)) && (iCharCount <= 1 || charSequence4.charAt(iCharCount + (-2)) != '\\');
                                boolean z7 = charSequence4.charAt(i90) == charSequence4.charAt(iCharCount);
                                if (!Character.isJavaIdentifierPart(charSequence4.charAt(iCharCount)) ? z7 : z6) {
                                    c7341 = this;
                                    c10024 = c10024;
                                    charSequence2 = charSequence4;
                                    iArr3 = iArr3;
                                    objArr2 = objArr2;
                                    while (true) {
                                        i4 = c7343.f19238;
                                        if (i4 == 0) {
                                            c7343.m16979(0);
                                            return false;
                                        }
                                        i5 = i4 - 6;
                                        c7343.m16979(c7343.f19242[i4 - 3]);
                                        iArr = c7343.f19242;
                                        i3 = iArr[i4 - 5];
                                        i6 = i4 - 4;
                                        iM16984 = iArr[i6];
                                        i7 = iArr[i5];
                                        if (i7 == 7) {
                                            zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            if (zM17005) {
                                                c10023 = c10024;
                                                c10024 = c10023;
                                            } else {
                                                i3 = c7343.f19235;
                                                iCharCount = c7343.f19240;
                                                charSequence4 = charSequence2;
                                            }
                                        } else {
                                            if (i7 == 9) {
                                                c10023 = c10024;
                                                if (i7 == 8) {
                                                    c7343.f19238 = i5;
                                                    i8 = iArr[i4 - 2];
                                                    i9 = iArr[i4 - 1];
                                                    if (c7343.f19241.f31730) {
                                                        c7343.m17014(~i8, i9 - 1);
                                                        c7343.m17018(i8, i9);
                                                    } else {
                                                        c7343.m16995(i8, i9);
                                                    }
                                                } else if (i7 == 3) {
                                                    c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                                    iArr2 = c8682.f23490;
                                                    int i311111111111111111114 = i4 - 2;
                                                    i13 = iArr[i311111111111111111114];
                                                    iArr[i311111111111111111114] = i13 + 1;
                                                    i14 = iArr2[i13];
                                                    if (i13 == iArr2.length - 1) {
                                                        c7343.f19238 = i5;
                                                    }
                                                    if (c10023.m23374()) {
                                                        c7343.f19230 = true;
                                                        return false;
                                                    }
                                                    if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                        c10024 = c10023;
                                                    } else {
                                                        i3 = i14;
                                                    }
                                                } else if (i7 == 4) {
                                                    i11 = i4 - 2;
                                                    int i311111111111111111115 = iArr[i11];
                                                    int i311111111111111111116 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i311111111111111111115)];
                                                    i12 = i311111111111111111115 & (i311111111111111111115 - 1);
                                                    if (i12 == 0) {
                                                        c7343.f19238 = i5;
                                                    } else {
                                                        c7343.f19242[i11] = i12;
                                                    }
                                                    i3 = i311111111111111111116;
                                                } else if (i7 == 6) {
                                                    c7343.m17002(iArr[i4 - 2], iM16984);
                                                    if (c7343.f19230) {
                                                        return false;
                                                    }
                                                    c7343.f19238 = i5;
                                                } else if (i7 == 5) {
                                                    i29 = iArr[i4 - 2];
                                                    i30 = iArr[i4 - 1];
                                                    c7343.f19238 = i5;
                                                    charSequence4 = charSequence2;
                                                    iCharCount = iM16984;
                                                } else {
                                                    if (i7 == 1) {
                                                        if (i7 == 2) {
                                                            int iMax1111115 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                            int[] iArr1111119 = c7343.f19242;
                                                            iArr1111119[i6] = iMax1111115;
                                                            int i311111111111111111117 = i4 - 1;
                                                            i10 = iArr1111119[i311111111111111111117] - 1;
                                                            iArr1111119[i311111111111111111117] = i10;
                                                            if (i10 == 0) {
                                                                c7343.f19238 = i5;
                                                            }
                                                            iCharCount = iMax1111115;
                                                        } else {
                                                            c7343.f19238 = i5;
                                                        }
                                                    } else if (i7 == 2) {
                                                        int iMax1111116 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                        int[] iArr11111110 = c7343.f19242;
                                                        iArr11111110[i6] = iMax1111116;
                                                        int i311111111111111111118 = i4 - 1;
                                                        i10 = iArr11111110[i311111111111111111118] - 1;
                                                        iArr11111110[i311111111111111111118] = i10;
                                                        if (i10 == 0) {
                                                            c7343.f19238 = i5;
                                                        }
                                                        iCharCount = iMax1111116;
                                                    } else {
                                                        c7343.f19238 = i5;
                                                    }
                                                    charSequence4 = charSequence2;
                                                }
                                            } else {
                                                if (c10024.m23374()) {
                                                    c7343.f19230 = true;
                                                    return false;
                                                }
                                                i15 = i4 - 1;
                                                int i311111111111111111119 = c7343.f19242[i15];
                                                c10023 = c10024;
                                                iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i311111111111111111119 - Character.charCount(Character.codePointBefore(charSequence2, i311111111111111111119)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                                if (c7343.f19230) {
                                                    return false;
                                                }
                                                if (iM16984 < 0) {
                                                    c7343.f19238 = i5;
                                                    c10024 = c10023;
                                                } else {
                                                    c7343.f19242[i15] = iM16984;
                                                    i14 = iArr3[i3 + 1];
                                                    i3 = i14;
                                                }
                                            }
                                            iCharCount = iM16984;
                                            charSequence4 = charSequence2;
                                        }
                                    }
                                }
                                i28 = i3;
                                z2 = false;
                                c7342 = c7341;
                                objArr2 = objArr2;
                                iArr3 = iArr3;
                            }
                            c7341 = c7342;
                            iArr3 = iArr3;
                            objArr2 = objArr2;
                            i28 = i3;
                            z2 = false;
                            c7342 = c7341;
                            objArr2 = objArr2;
                            iArr3 = iArr3;
                            break;
                        default:
                            throw new IllegalStateException("Invalid regex opcode");
                    }
                } else {
                    c10024 = c10024;
                    c7341 = c7342;
                    iArr3 = iArr3;
                    objArr2 = objArr2;
                    charSequence2 = charSequence4;
                    C24578 c24578 = (C24578) objArr2[iArr3[i28 + 2]];
                    int i91 = c24578.f77813 + iCharCount;
                    if (i91 >= iCharCount && i91 < length) {
                        char cCharAt3 = charSequence2.charAt(i91);
                        if (!c24578.f77812 ? !c24578.f77814.mo4821(cCharAt3) : cCharAt3 != c24578.f77811) {
                            while (true) {
                                i4 = c7343.f19238;
                                if (i4 == 0) {
                                    c7343.m16979(0);
                                    return false;
                                }
                                i5 = i4 - 6;
                                c7343.m16979(c7343.f19242[i4 - 3]);
                                iArr = c7343.f19242;
                                i3 = iArr[i4 - 5];
                                i6 = i4 - 4;
                                iM16984 = iArr[i6];
                                i7 = iArr[i5];
                                if (i7 == 7) {
                                    zM17005 = c7343.m17005(iArr[i4 - 2], charSequence2);
                                    if (c7343.f19230) {
                                        return false;
                                    }
                                    if (zM17005) {
                                        c10023 = c10024;
                                        c10024 = c10023;
                                    } else {
                                        i3 = c7343.f19235;
                                        iCharCount = c7343.f19240;
                                    }
                                } else {
                                    if (i7 == 9) {
                                        c10023 = c10024;
                                        if (i7 == 8) {
                                            c7343.f19238 = i5;
                                            i8 = iArr[i4 - 2];
                                            i9 = iArr[i4 - 1];
                                            if (c7343.f19241.f31730) {
                                                c7343.m17014(~i8, i9 - 1);
                                                c7343.m17018(i8, i9);
                                            } else {
                                                c7343.m16995(i8, i9);
                                            }
                                        } else if (i7 == 3) {
                                            c8682 = (C8682) objArr2[iArr3[i3 + 2]];
                                            iArr2 = c8682.f23490;
                                            int i3111111111111111111110 = i4 - 2;
                                            i13 = iArr[i3111111111111111111110];
                                            iArr[i3111111111111111111110] = i13 + 1;
                                            i14 = iArr2[i13];
                                            if (i13 == iArr2.length - 1) {
                                                c7343.f19238 = i5;
                                            }
                                            if (c10023.m23374()) {
                                                c7343.f19230 = true;
                                                return false;
                                            }
                                            if (c7343.m16971(c8682, i13, iM16984, charSequence2)) {
                                                c10024 = c10023;
                                            } else {
                                                i3 = i14;
                                            }
                                        } else if (i7 == 4) {
                                            i11 = i4 - 2;
                                            int i3111111111111111111111 = iArr[i11];
                                            int i3111111111111111111112 = ((C8682) objArr2[iArr3[i3 + 2]]).f23490[Integer.numberOfTrailingZeros(i3111111111111111111111)];
                                            i12 = i3111111111111111111111 & (i3111111111111111111111 - 1);
                                            if (i12 == 0) {
                                                c7343.f19238 = i5;
                                            } else {
                                                c7343.f19242[i11] = i12;
                                            }
                                            i3 = i3111111111111111111112;
                                        } else if (i7 == 6) {
                                            c7343.m17002(iArr[i4 - 2], iM16984);
                                            if (c7343.f19230) {
                                                return false;
                                            }
                                            c7343.f19238 = i5;
                                        } else if (i7 == 5) {
                                            i29 = iArr[i4 - 2];
                                            i30 = iArr[i4 - 1];
                                            c7343.f19238 = i5;
                                            charSequence4 = charSequence2;
                                            iCharCount = iM16984;
                                        } else if (i7 == 1) {
                                            if (i7 == 2) {
                                                int iMax1111117 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                                int[] iArr11111111 = c7343.f19242;
                                                iArr11111111[i6] = iMax1111117;
                                                int i3111111111111111111113 = i4 - 1;
                                                i10 = iArr11111111[i3111111111111111111113] - 1;
                                                iArr11111111[i3111111111111111111113] = i10;
                                                if (i10 == 0) {
                                                    c7343.f19238 = i5;
                                                }
                                                iCharCount = iMax1111117;
                                            } else {
                                                c7343.f19238 = i5;
                                            }
                                        } else if (i7 == 2) {
                                            int iMax1111118 = Math.max(iArr[i4 - 2], iM16984 - Character.charCount(Character.codePointBefore(charSequence2, iM16984)));
                                            int[] iArr11111112 = c7343.f19242;
                                            iArr11111112[i6] = iMax1111118;
                                            int i3111111111111111111114 = i4 - 1;
                                            i10 = iArr11111112[i3111111111111111111114] - 1;
                                            iArr11111112[i3111111111111111111114] = i10;
                                            if (i10 == 0) {
                                                c7343.f19238 = i5;
                                            }
                                            iCharCount = iMax1111118;
                                        } else {
                                            c7343.f19238 = i5;
                                        }
                                    } else {
                                        if (c10024.m23374()) {
                                            c7343.f19230 = true;
                                            return false;
                                        }
                                        i15 = i4 - 1;
                                        int i3111111111111111111115 = c7343.f19242[i15];
                                        c10023 = c10024;
                                        iM16984 = c7343.m16984(iM16984, c7343.f19242[i4 - 2], i3111111111111111111115 - Character.charCount(Character.codePointBefore(charSequence2, i3111111111111111111115)), (InterfaceC12628) objArr2[iArr3[i3 + 2]], charSequence2);
                                        if (c7343.f19230) {
                                            return false;
                                        }
                                        if (iM16984 < 0) {
                                            c7343.f19238 = i5;
                                            c10024 = c10023;
                                        } else {
                                            c7343.f19242[i15] = iM16984;
                                            i14 = iArr3[i3 + 1];
                                            i3 = i14;
                                        }
                                    }
                                    iCharCount = iM16984;
                                }
                            }
                        }
                        i28 = i3;
                        z2 = false;
                        c7342 = c7341;
                        objArr2 = objArr2;
                        iArr3 = iArr3;
                    }
                    charSequence4 = charSequence2;
                    i28 = i3;
                    z2 = false;
                    c7342 = c7341;
                    objArr2 = objArr2;
                    iArr3 = iArr3;
                }
            }
            z2 = false;
            c7342 = this;
            charSequence3 = charSequence4;
            i27 = iCharCount;
            i26 = i3;
            objArr2 = objArr2;
            iArr3 = iArr3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m16971(C8682 c8682, int i, int i2, CharSequence charSequence) {
        char cCharAt;
        int[] iArr = c8682.f23489;
        return iArr == null || iArr[i] < 0 || i2 >= this.f19237.f27757 || (cCharAt = charSequence.charAt(i2)) >= 128 || cCharAt == iArr[i];
    }

    /* JADX INFO: renamed from: ۢ */
    private C10694 m16983(int i) {
        return (C10694) this.f19241.f31729[this.f19233[i + 16]];
    }

    /* JADX INFO: renamed from: ֫ */
    private int m16947(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        m17008();
        C10694 c10694 = (C10694) this.f19241.f31729[i];
        int i7 = this.f19228;
        int[] iArr = this.f19233;
        iArr[i7] = z ? 6 : 5;
        iArr[i7 + 1] = i3;
        iArr[i7 + 2] = i4;
        iArr[i7 + 3] = i2;
        iArr[i7 + 4] = this.f19238;
        iArr[i7 + 5] = this.f19249;
        int i8 = i7 + 6;
        C10023 c10023 = this.f19237;
        iArr[i8] = (!c10023.f27750 || (!c10694.f29628 && (z || c10694.f29631 >= 0))) ? -1 : c10023.f27736.f62172.size();
        int[] iArr2 = this.f19233;
        iArr2[i7 + 12] = this.f19244;
        iArr2[i7 + 13] = 0;
        iArr2[i7 + 16] = i;
        iArr2[i7 + 17] = 0;
        iArr2[i7 + 18] = i5;
        iArr2[i7 + 19] = 0;
        iArr2[i7 + 20] = i5;
        iArr2[i7 + 21] = this.f19249;
        int i9 = i7 + 22;
        int i10 = c10694.f29631;
        int i11 = c10694.f29629;
        iArr2[i9] = i10 >= 0 ? m17007(i10) : 0;
        int[] iArr3 = this.f19233;
        int i12 = i7 + 23;
        boolean z2 = c10694.f29628;
        iArr3[i12] = z2 ? c10023.f27745[i11] : 0;
        iArr3[i7 + 24] = z2 ? c10023.f27745[i11 + 1] : 0;
        this.f19228 += 32;
        if (!z && (i6 = c10694.f29631) >= 0) {
            m17018(i6, -1);
        }
        m16960(7, 0, i4, i7, 0);
        return i7;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16963(int i, int i2, boolean z) {
        int[] iArr = this.f19233;
        iArr[i + 17] = i2;
        iArr[i + 13] = !z ? 1 : 0;
        int i3 = this.f19249;
        iArr[i + 21] = i3;
        this.f19242[iArr[i + 4] + 3] = i3;
        this.f19244 = z ? i : iArr[i + 12];
        this.f19235 = iArr[(z ? 3 : 1) + i];
        this.f19240 = iArr[i + 2];
    }

    /* JADX INFO: renamed from: ᩷ */
    private boolean m17017(int i) {
        C10694 c10694M16983 = m16983(i);
        if (c10694M16983.f29631 < 0 && this.f19237.f27744) {
            this.f19230 = true;
            return false;
        }
        EnumC3791 enumC3791 = c10694M16983.f29634;
        if (enumC3791 == EnumC3791.GREEDY) {
            int[] iArr = this.f19233;
            iArr[i + 17] = 1;
            m16987(i, iArr[i + 2], iArr[i + 18]);
            return true;
        }
        if (enumC3791 == EnumC3791.LAZY) {
            m16963(i, 2, false);
            return true;
        }
        if (this.f19233[i + 18] < c10694M16983.f29633) {
            m16963(i, 4, true);
            return true;
        }
        m16963(i, 1, false);
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m16987(int i, int i2, int i3) {
        C10694 c10694M16983 = m16983(i);
        int[] iArr = this.f19233;
        iArr[i + 13] = 1;
        this.f19244 = iArr[i + 12];
        int i4 = c10694M16983.f29631;
        int i5 = c10694M16983.f29633;
        if (i4 < 0 && i3 >= i5) {
            m16963(i, iArr[i + 17], false);
            this.f19240 = i2;
            return;
        }
        int iM16947 = m16947(iArr[i + 16], iArr[i + 3], iArr[i + 1], i2, i3, true);
        if (i3 < i5) {
            m16963(iM16947, 5, true);
        } else {
            m16982(iM16947);
            m16963(iM16947, 9, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m16968(int i, boolean z) {
        int i2;
        int i3;
        C10694 c10694M16983 = m16983(i);
        int[] iArr = this.f19233;
        int i4 = i + 17;
        int i5 = iArr[i4];
        int i6 = i + 2;
        int i7 = iArr[i6];
        int i8 = i + 18;
        int i9 = iArr[i8];
        C10023 c10023 = this.f19237;
        switch (i5) {
            case 0:
                if (!z) {
                    m17013(i);
                    return false;
                }
                m16964(c10694M16983, i7, c10023.f27735);
                int[] iArr2 = this.f19233;
                iArr2[i6] = c10023.f27735;
                int i10 = i9 + 1;
                iArr2[i8] = i10;
                if (i10 >= c10694M16983.f29632) {
                    return m17017(i);
                }
                m16963(i, 0, true);
                return true;
            case 1:
            case 9:
            case 13:
                m17013(i);
                return false;
            case 2:
                if (i9 < c10694M16983.f29633) {
                    m16963(i, 3, true);
                    return true;
                }
                m17013(i);
                return false;
            case 3:
                if (!z || i7 == (i2 = c10023.f27735)) {
                    m17013(i);
                    return false;
                }
                m16964(c10694M16983, i7, i2);
                int[] iArr3 = this.f19233;
                iArr3[i6] = c10023.f27735;
                iArr3[i8] = i9 + 1;
                m16963(i, 2, false);
                return true;
            case 4:
                if (z) {
                    m16964(c10694M16983, i7, c10023.f27735);
                    int i11 = c10023.f27735;
                    if (i7 != i11) {
                        int[] iArr4 = this.f19233;
                        iArr4[i6] = i11;
                        int i12 = i9 + 1;
                        iArr4[i8] = i12;
                        if (i12 < c10694M16983.f29633) {
                            m16963(i, 4, true);
                            return true;
                        }
                    }
                }
                m16963(i, 1, false);
                return true;
            case 5:
                if (!z || (i3 = c10023.f27735) == i7 || (c10694M16983.f29631 >= 0 && i3 < i7)) {
                    if (z && c10694M16983.f29631 >= 0) {
                        iArr[i6] = c10023.f27735;
                    }
                    m16982(i);
                    m16963(i, 9, false);
                    return true;
                }
                iArr[i + 19] = i3 - i7;
                return m16981(i);
            case 6:
                if (!z) {
                    return m17019(i);
                }
                int i13 = iArr[i + 19] + i7;
                int i14 = c10023.f27735;
                if (i13 != i14) {
                    iArr[i4] = 7;
                    int i15 = c10694M16983.f29631;
                    if (i15 < 0) {
                        i7 = i14;
                    }
                    if (i15 < 0) {
                        i9++;
                    }
                    m16987(i, i7, i9);
                    return true;
                }
                return m16981(i);
            case 7:
                return m17019(i);
            case 8:
                int i16 = iArr[i + 19];
                int i17 = i7 - i16;
                m16964(c10694M16983, i17 - i16, i17);
                int[] iArr5 = this.f19233;
                iArr5[i6] = i17;
                iArr5[i8] = i9 - 1;
                return m17019(i);
            case 10:
                if (z) {
                    iArr[i6] = c10023.f27735;
                    iArr[i + 20] = i7;
                    m16963(i, 11, false);
                    return true;
                }
                if (c10694M16983.f29634 != EnumC3791.LAZY) {
                    m16963(i, 13, false);
                    return true;
                }
                m17013(i);
                return false;
            case 11:
                if (c10694M16983.f29634 == EnumC3791.GREEDY) {
                    iArr[i6] = iArr[i + 20];
                    m16963(i, 13, false);
                    return true;
                }
                m17013(i);
                return false;
            case 12:
                m16963(i, 10, true);
                return true;
            default:
                throw new IllegalStateException("Invalid quantifier continuation");
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private boolean m16981(int i) {
        int[] iArr = this.f19233;
        int i2 = i + 2;
        int i3 = iArr[i2];
        int i4 = iArr[i + 19] + i3;
        C10694 c10694M16983 = m16983(i);
        m16964(c10694M16983, i3, i4);
        int[] iArr2 = this.f19233;
        iArr2[i2] = i4;
        int i5 = i + 18;
        int i6 = iArr2[i5] + 1;
        iArr2[i5] = i6;
        if (i6 >= c10694M16983.f29633) {
            return m17019(i);
        }
        m16963(i, 6, true);
        return true;
    }

    /* JADX INFO: renamed from: ᩻ */
    private boolean m17019(int i) {
        int[] iArr = this.f19233;
        int i2 = iArr[i + 18];
        int i3 = iArr[i + 20];
        if (m16983(i).f29631 >= 0) {
            if (i2 <= i3) {
                m16982(i);
                m16963(i, 9, false);
                return true;
            }
        } else if (i2 < i3) {
            m17013(i);
            return false;
        }
        m16963(i, 8, false);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16964(C10694 c10694, int i, int i2) {
        boolean z = c10694.f29628;
        int i3 = c10694.f29629;
        if (z) {
            C10023 c10023 = this.f19237;
            if (c10023.f27750) {
                c10023.f27736.m45500(i3, i, i2, c10023.f27745);
            }
            int[] iArr = c10023.f27745;
            iArr[i3] = i;
            iArr[i3 + 1] = i2;
        }
    }

    /* JADX INFO: renamed from: ۡ */
    private void m16982(int i) {
        C10694 c10694M16983 = m16983(i);
        if (c10694M16983.f29628) {
            int i2 = this.f19233[i + 6];
            C10023 c10023 = this.f19237;
            if (i2 >= 0) {
                c10023.f27736.m45499(i2);
            }
            int[] iArr = c10023.f27745;
            int i3 = c10694M16983.f29629;
            int[] iArr2 = this.f19233;
            iArr[i3] = iArr2[i + 23];
            iArr[i3 + 1] = iArr2[i + 24];
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m17013(int i) {
        m16958(i);
        int[] iArr = this.f19233;
        this.f19238 = iArr[i + 4];
        this.f19228 = i;
        this.f19244 = iArr[i + 12];
    }

    /* JADX INFO: renamed from: ܿ */
    private void m17008() {
        int[] iArr = this.f19233;
        int length = iArr.length;
        int i = this.f19228;
        if (length - i >= 32) {
            return;
        }
        int iM16953 = m16953(iArr.length, ((long) i) + 32);
        long jM17000 = m17000();
        int[] iArr2 = this.f19233;
        if ((((long) (iM16953 - iArr2.length)) * 4) + jM17000 > 33554432) {
            throw new C2646();
        }
        this.f19233 = Arrays.copyOf(iArr2, iM16953);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034 A[RETURN] */
    /* JADX INFO: renamed from: ֫ */
    private boolean m16978(boolean z) {
        int i = this.f19244;
        if (i < 0) {
            throw new IllegalStateException("Regex condition returned without a control scope");
        }
        int[] iArr = this.f19233;
        boolean z2 = iArr[i] >= 5;
        int i2 = iArr[(z2 ? 21 : 5) + i];
        C10023 c10023 = this.f19237;
        if (z) {
            if (!c10023.f27750) {
                C11365 c11365 = this.f19241;
                if (c11365.f31735 || c11365.f31724 || c11365.f31730) {
                    if (!m16997(i2)) {
                        return false;
                    }
                }
            } else if (!m16997(i2)) {
                return false;
            }
            if (!this.f19241.f31730) {
                for (int i3 = this.f19249 - 2; i3 >= i2; i3 -= 2) {
                    int[] iArr2 = this.f19248;
                    int i4 = iArr2[i3];
                    if (i4 < 0 && i4 != Integer.MIN_VALUE) {
                        this.f19231[~i4] = iArr2[i3 + 1];
                    }
                }
            }
            this.f19249 = i2;
        } else {
            m16979(i2);
        }
        this.f19228 = i + 32;
        int[] iArr3 = this.f19233;
        int i5 = i + 4;
        this.f19238 = iArr3[i5] + 6;
        this.f19244 = iArr3[i + 12];
        if (z2) {
            return m16968(i, z);
        }
        m16999(i);
        int[] iArr4 = this.f19233;
        int i6 = iArr4[i];
        if (z != (i6 == 0 || i6 == 2 || i6 == 4)) {
            m16958(i);
            this.f19238 = this.f19233[i5];
            this.f19228 = i;
            return false;
        }
        iArr4[i + 13] = 1;
        this.f19235 = iArr4[i + 1];
        this.f19240 = i6 == 4 ? c10023.f27735 : iArr4[i + 2];
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m17005(int i, CharSequence charSequence) {
        int[] iArr = this.f19233;
        int i2 = iArr[i];
        if (i2 >= 5) {
            if (iArr[i + 13] == 0) {
                this.f19244 = i;
                return m16978(false);
            }
            return m16968(i, false);
        }
        if (iArr[i + 13] == 0) {
            this.f19244 = i;
            if (i2 == 2 || i2 == 3) {
                int i3 = i + 10;
                int i4 = iArr[i3];
                int i5 = iArr[i + 11];
                int iM16950 = i4 - ((iArr[i + 14] == 0 || i4 <= i5) ? 1 : m16950(i4, -1, charSequence));
                if (this.f19230) {
                    return false;
                }
                if (iM16950 >= i5) {
                    int[] iArr2 = this.f19233;
                    iArr2[i3] = iM16950;
                    this.f19235 = iArr2[i + 3];
                    this.f19240 = iM16950;
                    return true;
                }
            }
            return m16978(false);
        }
        m16958(i);
        int[] iArr3 = this.f19233;
        this.f19238 = iArr3[i + 4];
        this.f19228 = i;
        this.f19244 = iArr3[i + 12];
        return false;
    }

    /* JADX INFO: renamed from: ܺ */
    private void m16999(int i) {
        int[] iArr = this.f19233;
        int i2 = iArr[i];
        C10023 c10023 = this.f19237;
        if (i2 == 0 || i2 == 1) {
            c10023.f27757 = iArr[i + 7];
        } else if (i2 == 2 || i2 == 3) {
            c10023.f27741 = iArr[i + 8];
            c10023.f27743 = iArr[i + 9];
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16958(int i) {
        int i2;
        int[] iArr = this.f19233;
        if (iArr[i + 13] == 2) {
            return;
        }
        if (iArr[i] >= 5) {
            C10694 c10694M16983 = m16983(i);
            int[] iArr2 = this.f19233;
            if (iArr2[i] == 5 && (i2 = c10694M16983.f29631) >= 0) {
                m17018(i2, iArr2[i + 22]);
            }
            m16982(i);
        } else {
            m16999(i);
        }
        int i3 = this.f19233[i + 6];
        if (i3 >= 0) {
            this.f19237.f27736.m45499(i3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m16950(int i, int i2, CharSequence charSequence) {
        if (i2 == 1 && i >= 0 && i < charSequence.length() && !Character.isHighSurrogate(charSequence.charAt(i))) {
            return 1;
        }
        int length = charSequence.length();
        C10023 c10023 = this.f19237;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = i;
            while (i4 < length && i3 < i2) {
                int i5 = i4 + 1;
                i4 = (Character.isHighSurrogate(charSequence.charAt(i4)) && i5 < length && Character.isLowSurrogate(charSequence.charAt(i5))) ? i4 + 2 : i5;
                if (c10023.m23374()) {
                    this.f19230 = true;
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
            if (c10023.m23374()) {
                this.f19230 = true;
                return i - i7;
            }
            i3++;
        }
        return i - i7;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m16955(C12350 c12350, CharSequence charSequence, int i, int i2) {
        int i3;
        int i4 = 0;
        do {
            int i5 = c12350.f34463;
            C10023 c10023 = this.f19237;
            if (i4 < i5) {
                if (i >= i2) {
                    c10023.f27755 = true;
                } else {
                    char cCharAt = charSequence.charAt(i);
                    int[] iArr = c12350.f34462;
                    if (cCharAt >= iArr.length) {
                        int i6 = 0;
                        while (true) {
                            InterfaceC12628[] interfaceC12628Arr = c12350.f34465;
                            if (i6 >= interfaceC12628Arr.length) {
                                i3 = 0;
                                break;
                            }
                            if (interfaceC12628Arr[i6].mo4821(cCharAt)) {
                                i3 = c12350.f34466[i6];
                                break;
                            }
                            if (c10023.m23374()) {
                                this.f19230 = true;
                                return -1;
                            }
                            i6++;
                        }
                    } else {
                        i3 = iArr[cCharAt];
                    }
                    if (i3 != 0) {
                        m17009(i3, i);
                        i++;
                        m17009(i3 + 1, i);
                        i4++;
                    }
                }
            }
            if (i4 >= c12350.f34464 && (c10023.f27733 != 1 || i == i2)) {
                return i;
            }
        } while (!m16996());
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX INFO: renamed from: ֫ */
    private int m16954(C6000 c6000, CharSequence charSequence, int i, int i2) {
        int i3;
        int i4 = 0;
        do {
            int i5 = c6000.f15029;
            InterfaceC12628 interfaceC12628 = c6000.f15037;
            boolean z = c6000.f15036;
            boolean z2 = c6000.f15033;
            C10023 c10023 = this.f19237;
            if (i4 < i5) {
                if (i >= i2) {
                    c10023.f27755 = true;
                } else {
                    int iCharAt = z2 ? charSequence.charAt(i) : Character.codePointAt(charSequence, i);
                    int iCharCount = (z2 ? 1 : Character.charCount(iCharAt)) + i;
                    if (iCharCount > i2) {
                        c10023.f27755 = true;
                    }
                    if (iCharCount <= i2 && c6000.f15038.mo4821(iCharAt)) {
                        i = iCharCount;
                    } else if (iCharAt == c6000.f15034) {
                        int i6 = i + 1;
                        if (i6 >= i2) {
                            c10023.f27755 = true;
                        } else {
                            int iCharAt2 = z ? charSequence.charAt(i6) : Character.codePointAt(charSequence, i6);
                            int iCharCount2 = i6 + (z ? 1 : Character.charCount(iCharAt2));
                            if (iCharCount2 > i2) {
                                c10023.f27755 = true;
                            } else if (c6000.f15035.mo4821(iCharAt2)) {
                                i = iCharCount2;
                            }
                        }
                    }
                    i4++;
                }
            }
            if (i4 < c6000.f15032) {
                break;
            }
            if (interfaceC12628 == null) {
                if (i >= i2) {
                    c10023.f27755 = true;
                    return -1;
                }
                if (c6000.f15031.mo4821(charSequence.charAt(i))) {
                    break;
                }
                i3 = i + 1;
                if (c10023.f27733 == 1) {
                }
                return i3;
            }
            int i7 = i;
            while (i7 < i2 && interfaceC12628.mo4821(charSequence.charAt(i7))) {
                i7++;
                if (c10023.m23374()) {
                    this.f19230 = true;
                    return -1;
                }
            }
            if (i7 >= i2) {
                c10023.f27755 = true;
            }
            if (i7 - i < c6000.f15030) {
                break;
            }
            i = i7;
            if (i >= i2) {
                c10023.f27755 = true;
                return -1;
            }
            if (c6000.f15031.mo4821(charSequence.charAt(i))) {
                break;
            }
            i3 = i + 1;
            if (c10023.f27733 == 1 || i3 == i2) {
                return i3;
            }
        } while (!m16996());
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m16956(C15031 c15031, CharSequence charSequence, int i, int i2) {
        char cCharAt;
        C5644 c5644 = c15031.f42944;
        int[][] iArr = c15031.f42945;
        C10023 c10023 = this.f19237;
        if (C22764.m50946(c5644, c10023, i, charSequence)) {
            int[] iArr2 = (i >= i2 || (cCharAt = charSequence.charAt(i)) >= 128) ? null : c15031.f42943[cCharAt];
            int length = iArr2 == null ? iArr.length : iArr2.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (c10023.m23374()) {
                    this.f19230 = true;
                    return -1;
                }
                int iM16952 = m16952(i, i2, charSequence, iArr[iArr2 == null ? i3 : iArr2[i3]]);
                if (this.f19230) {
                    break;
                }
                if (iM16952 >= 0 && C22764.m50946(c15031.f42942, c10023, iM16952, charSequence) && (c10023.f27733 != 1 || iM16952 == i2)) {
                    return iM16952;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m16952(int i, int i2, CharSequence charSequence, Object obj) {
        boolean z = obj instanceof InterfaceC12628;
        C10023 c10023 = this.f19237;
        if (z) {
            InterfaceC12628 interfaceC12628 = (InterfaceC12628) obj;
            if (i >= i2) {
                c10023.f27755 = true;
                return -1;
            }
            if (interfaceC12628.mo4821(charSequence.charAt(i))) {
                return i + 1;
            }
            return -1;
        }
        int[] iArr = (int[]) obj;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = i + i3;
            if (i4 >= i2) {
                c10023.f27755 = true;
                return -1;
            }
            if (iArr[i3] != charSequence.charAt(i4)) {
                return -1;
            }
            if (c10023.m23374()) {
                this.f19230 = true;
                return -1;
            }
        }
        return i + iArr.length;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16960(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.f19242;
        int length = iArr.length;
        int i6 = this.f19238;
        if (length - i6 < 6) {
            int iM16953 = m16953(iArr.length, ((long) i6) + 6);
            m17003(this.f19231.length, iM16953, this.f19248.length);
            this.f19242 = Arrays.copyOf(this.f19242, iM16953);
        }
        int i7 = this.f19238;
        int[] iArr2 = this.f19242;
        iArr2[i7] = i;
        iArr2[i7 + 1] = i2;
        iArr2[i7 + 2] = i3;
        iArr2[i7 + 3] = this.f19249;
        iArr2[i7 + 4] = i4;
        iArr2[i7 + 5] = i5;
        this.f19238 = i7 + 6;
    }

    /* JADX INFO: renamed from: ܿ */
    private int m17007(int i) {
        return this.f19241.f31730 ? this.f19237.f27739[i] : this.f19231[i];
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m17018(int i, int i2) {
        if (this.f19241.f31730) {
            this.f19237.f27739[i] = i2;
        } else {
            this.f19231[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ۘ */
    private void m16980(int i) {
        if ((i & 1073741824) != 0) {
            throw new C2646();
        }
        m17014(~(1073741824 | i), m17007(i));
    }

    /* JADX INFO: renamed from: ܳ */
    private void m16995(int i, int i2) {
        if (this.f19241.f31730 || this.f19238 != 0) {
            m17014(~i, m17007(i));
        }
        m17018(i, i2);
    }

    /* JADX INFO: renamed from: ܿ */
    private void m17009(int i, int i2) {
        C10023 c10023 = this.f19237;
        m17014(i, c10023.f27745[i]);
        c10023.f27745[i] = i2;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m17014(int i, int i2) {
        int[] iArr = this.f19248;
        int length = iArr.length;
        int i3 = this.f19249;
        if (length - i3 < 2) {
            int iM16953 = m16953(iArr.length, ((long) i3) + 2);
            m17003(this.f19231.length, this.f19242.length, iM16953);
            this.f19248 = Arrays.copyOf(this.f19248, iM16953);
        }
        int[] iArr2 = this.f19248;
        int i4 = this.f19249;
        int i5 = i4 + 1;
        this.f19249 = i5;
        iArr2[i4] = i;
        this.f19249 = i4 + 2;
        iArr2[i5] = i2;
    }

    /* JADX INFO: renamed from: ۖ */
    private void m16979(int i) {
        while (true) {
            int i2 = this.f19249;
            if (i2 <= i) {
                return;
            }
            int[] iArr = this.f19248;
            int i3 = i2 - 1;
            this.f19249 = i3;
            int i4 = iArr[i3];
            int i5 = i2 - 2;
            this.f19249 = i5;
            int i6 = iArr[i5];
            if (i6 != Integer.MIN_VALUE && i6 != -2147483647) {
                if (i6 < 0) {
                    m17018((~i6) & (-1073741825), i4);
                } else {
                    this.f19237.f27745[i6] = i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private boolean m16997(int i) {
        int iM16946 = this.f19228 - 32;
        int i2 = this.f19249 - 2;
        boolean z = true;
        while (i2 >= i) {
            iM16946 = m16946(iM16946, i2 + 2);
            if (!this.f19230) {
                int i3 = this.f19248[i2];
                if (i3 != -2147483647) {
                    boolean z2 = (i3 >= 0 || i3 == Integer.MIN_VALUE || ((~i3) & 1073741824) == 0) ? false : true;
                    C10023 c10023 = this.f19237;
                    if (z && i3 != Integer.MIN_VALUE && !z2) {
                        if (m16996()) {
                        }
                    } else if (c10023.m23374()) {
                        this.f19230 = true;
                        return false;
                    }
                    if (z2) {
                        m17018((~i3) & (-1073741825), this.f19248[i2 + 1]);
                        this.f19248[i2] = -2147483647;
                    } else if (this.f19241.f31730 && i3 < 0 && i3 != Integer.MIN_VALUE) {
                        this.f19248[i2] = -2147483647;
                    } else if (i3 == Integer.MIN_VALUE) {
                        int[] iArr = c10023.f27745;
                        int i4 = this.f19248[i2 + 1];
                        iArr[0] = i4;
                        c10023.f27768 = i4;
                        iArr[1] = c10023.f27735;
                    } else if (i3 > 1 && (i3 & 1) != 0) {
                        int[] iArr2 = this.f19248;
                        int i5 = iArr2[i2 + 1];
                        int i6 = iArr2[i2 - 1];
                        if (c10023.f27750 && i6 != -1 && i5 != -1) {
                            c10023.f27736.f62172.add(new C5212(i3 / 2, i6, i5));
                        }
                        i2 -= 2;
                    }
                    z = false;
                }
                i2 -= 2;
            }
            return false;
        }
        m16946(iM16946, i);
        return !this.f19230;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m16946(int i, int i2) {
        while (i >= 0) {
            int[] iArr = this.f19233;
            int i3 = i + 13;
            int i4 = iArr[i3];
            if (i4 == 0 || iArr[i + 5] < i2) {
                break;
            }
            if (i4 != 2 && iArr[i] == 6 && iArr[i + 17] == 8) {
                int i5 = iArr[i + 2];
                m16964(m16983(i), i5 - this.f19233[i + 19], i5);
            }
            this.f19233[i3] = 2;
            i -= 32;
            if (this.f19237.m23374()) {
                this.f19230 = true;
                break;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17020() {
        if (this.f19250 != 0) {
            this.f19234++;
            Arrays.fill(this.f19247, 0L);
            this.f19250 = 0;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m16990(int i, int i2) {
        if (this.f19241.f31730) {
            this.f19237.f27732[i].getClass();
        }
        long[] jArr = this.f19247;
        if (jArr.length == 0) {
            return false;
        }
        long j = (((long) i2) + 1) | (((long) i) << 32);
        return !this.f19230 && this.f19234 == this.f19234 && this.f19247[m16957(jArr, j)] == j;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m17002(int i, int i2) {
        boolean z = this.f19241.f31730;
        C10023 c10023 = this.f19237;
        if (z) {
            c10023.f27732[i].getClass();
        }
        int i3 = this.f19234;
        long j = (((long) i2) + 1) | (((long) i) << 32);
        long[] jArr = this.f19247;
        if (jArr.length != 0) {
            int iM16957 = m16957(jArr, j);
            if (this.f19230 || i3 != this.f19234 || this.f19247[iM16957] == j) {
                return;
            }
        }
        int i4 = this.f19250;
        long[] jArr2 = this.f19247;
        if (i4 >= jArr2.length / 2) {
            int iM16953 = m16953(jArr2.length, ((long) jArr2.length) + 1);
            if (((iM16953 - 1) & iM16953) == 0) {
                if ((((long) (iM16953 - this.f19247.length)) * 8) + m17000() <= 33554432) {
                    long[] jArr3 = new long[iM16953];
                    for (int i5 = 0; i5 < this.f19247.length; i5++) {
                        if (c10023.m23374()) {
                            this.f19230 = true;
                            return;
                        }
                        if (i3 != this.f19234) {
                            return;
                        }
                        long j2 = this.f19247[i5];
                        if (j2 != 0) {
                            int iM16958 = m16957(jArr3, j2);
                            if (this.f19230 || i3 != this.f19234) {
                                return;
                            } else {
                                jArr3[iM16958] = j2;
                            }
                        }
                    }
                    if (i3 != this.f19234) {
                        return;
                    } else {
                        this.f19247 = jArr3;
                    }
                }
            }
            throw new C2646();
        }
        int iM16959 = m16957(this.f19247, j);
        if (this.f19230 || i3 != this.f19234) {
            return;
        }
        this.f19247[iM16959] = j;
        this.f19250++;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m16957(long[] jArr, long j) {
        long j2 = ((j >>> 33) ^ j) * (-49064778989728563L);
        int length = jArr.length - 1;
        int i = ((int) (j2 ^ (j2 >>> 33))) & length;
        while (true) {
            long j3 = jArr[i];
            if (j3 == 0 || j3 == j) {
                break;
            }
            if (this.f19237.m23374()) {
                this.f19230 = true;
                return 0;
            }
            i = (i + 1) & length;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m16972(C12350 c12350, int i, CharSequence charSequence) {
        C10023 c10023 = this.f19237;
        if (c10023.m23374()) {
            this.f19230 = true;
            return false;
        }
        int iM16955 = m16955(c12350, charSequence, i, c10023.f27757);
        if (this.f19230 || iM16955 < 0) {
            m16979(0);
            return false;
        }
        int[] iArr = c10023.f27745;
        iArr[0] = c10023.f27768;
        c10023.m23383(iM16955);
        iArr[1] = iM16955;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m16974(C15031 c15031, int i, CharSequence charSequence) {
        C10023 c10023 = this.f19237;
        if (c10023.m23374()) {
            this.f19230 = true;
            return false;
        }
        int iM16956 = m16956(c15031, charSequence, i, c10023.f27757);
        if (this.f19230 || iM16956 < 0) {
            return false;
        }
        int[] iArr = c10023.f27745;
        iArr[0] = c10023.f27768;
        c10023.m23383(iM16956);
        iArr[1] = iM16956;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m16976(C22094 c22094, int i, CharSequence charSequence) {
        char cCharAt;
        C10023 c10023 = this.f19237;
        if (c10023.m23374()) {
            this.f19230 = true;
            return false;
        }
        int i2 = c10023.f27757;
        C8682 c8682 = c22094.f69919;
        int[] iArr = c8682.f23490;
        if (i < i2 && (cCharAt = charSequence.charAt(i)) < 128) {
            int i3 = c8682.f23488[cCharAt];
            return i3 != 0 && m16991(iArr[Integer.numberOfTrailingZeros(i3)], i, charSequence);
        }
        m16960(3, c22094.f69920, i, 1, 0);
        return m16991(iArr[0], i, charSequence);
    }

    /* JADX INFO: renamed from: ۧ */
    private int m16984(int i, int i2, int i3, InterfaceC12628 interfaceC12628, CharSequence charSequence) {
        while (i2 < i3) {
            C10023 c10023 = this.f19237;
            if (!c10023.m23374()) {
                c10023.m23380();
                String strNormalize = Normalizer.normalize(TextUtils.substring(charSequence, i, i3), Normalizer.Form.NFC);
                if (!c10023.m23378()) {
                    Thread threadCurrentThread = this.f19239;
                    if (threadCurrentThread == null) {
                        threadCurrentThread = Thread.currentThread();
                        this.f19239 = threadCurrentThread;
                    }
                    if (!c10023.m23364(threadCurrentThread)) {
                        if (strNormalize.codePointCount(0, strNormalize.length()) == 1 && interfaceC12628.mo4821(strNormalize.codePointAt(0))) {
                            return i3;
                        }
                        i3 -= Character.charCount(Character.codePointBefore(charSequence, i3));
                    }
                }
                this.f19230 = true;
                break;
            }
            this.f19230 = true;
            return -1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܳ */
    private boolean m16996() {
        C10023 c10023 = this.f19237;
        if (!c10023.m23374()) {
            if (c10023.f27740) {
                return false;
            }
            Thread threadCurrentThread = this.f19239;
            if (threadCurrentThread == null) {
                threadCurrentThread = Thread.currentThread();
                this.f19239 = threadCurrentThread;
            }
            if (!c10023.m23364(threadCurrentThread)) {
                return false;
            }
        }
        this.f19230 = true;
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m17003(int i, int i2, int i3) {
        if (((((long) this.f19245.length) + ((long) this.f19233.length)) * 4) + ((((long) this.f19232.length) + ((long) this.f19247.length)) * 8) + ((((long) i) + ((long) i2) + ((long) i3)) * 4) > 33554432) {
            throw new C2646();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m16953(int i, long j) {
        if (j > 2147483639) {
            throw new C2646();
        }
        return (int) Math.min(2147483639L, Math.max(j, Math.max(64L, ((long) i) * 2)));
    }

    /* JADX INFO: renamed from: ܽ */
    private long m17000() {
        return ((((long) this.f19232.length) + ((long) this.f19247.length)) * 8) + ((((long) this.f19231.length) + ((long) this.f19242.length) + ((long) this.f19248.length) + ((long) this.f19245.length) + ((long) this.f19233.length)) * 4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m16977(C24775 c24775, C10023 c10023, int i, CharSequence charSequence) {
        int i2 = c24775.f79211;
        Object obj = c24775.f79213;
        if (i2 != 16) {
            if (i2 == 1) {
                if (i >= c10023.f27757) {
                    c10023.f27755 = true;
                    return true;
                }
                return !((InterfaceC12628) obj).mo4821(charSequence.charAt(i));
            }
            C24578 c24578 = (C24578) obj;
            int i3 = c24578.f77813 + i;
            if (i3 >= i && i3 < c10023.f27757) {
                char cCharAt = charSequence.charAt(i3);
                if (!c24578.f77812 ? c24578.f77814.mo4821(cCharAt) : cCharAt == c24578.f77811) {
                }
            }
            return false;
        }
        boolean z = c10023.f27755;
        boolean z2 = c10023.f27746;
        if (C22764.m50944(c24775.f79210, c24775.f79212, c10023, i, charSequence)) {
            c10023.f27755 = z;
            c10023.f27746 = z2;
            return false;
        }
        return true;
    }
}
