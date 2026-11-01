package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0684bo;
import java.io.PrintStream;
import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۢ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 058F */
/* JADX INFO: loaded from: classes3.dex */
public final class C11750 {

    /* JADX INFO: renamed from: ֡ */
    public final ByteBuffer f32812;

    /* JADX INFO: renamed from: ֨ */
    public final int f32813;

    /* JADX INFO: renamed from: ֫ */
    public final ByteBuffer f32814;

    /* JADX INFO: renamed from: ۖ */
    public final ByteBuffer f32815;

    /* JADX INFO: renamed from: ۗ */
    public final String[] f32816;

    /* JADX INFO: renamed from: ۘ */
    public final ByteBuffer f32817;

    /* JADX INFO: renamed from: ۙ */
    public final int f32818;

    /* JADX INFO: renamed from: ۚ */
    public final ByteBuffer f32819;

    /* JADX INFO: renamed from: ۜ */
    public final ByteBuffer f32820;

    /* JADX INFO: renamed from: ۠ */
    public final ByteBuffer f32821;

    /* JADX INFO: renamed from: ۡ */
    public final ByteBuffer f32822;

    /* JADX INFO: renamed from: ۢ */
    public final ByteBuffer f32823;

    /* JADX INFO: renamed from: ۤ */
    public final int f32824;

    /* JADX INFO: renamed from: ۧ */
    public final ByteBuffer f32825;

    /* JADX INFO: renamed from: ۫ */
    public final ByteBuffer f32826;

    /* JADX INFO: renamed from: ۬ */
    public final ByteBuffer f32827;

    /* JADX INFO: renamed from: ܳ */
    public final int f32828;

    /* JADX INFO: renamed from: ܶ */
    public final int f32829;

    /* JADX INFO: renamed from: ܺ */
    public final int f32830;

    /* JADX INFO: renamed from: ܽ */
    public final ByteBuffer f32831;

    /* JADX INFO: renamed from: ܿ */
    public final ByteBuffer f32832;

    /* JADX INFO: renamed from: ᩳ */
    public final ByteBuffer f32833;

    /* JADX INFO: renamed from: ᩴ */
    public final int f32834;

    /* JADX INFO: renamed from: ᩶ */
    public final ByteBuffer f32836;

    /* JADX INFO: renamed from: ᩷ */
    public final int f32837;

    /* JADX INFO: renamed from: ᩹ */
    public final ByteBuffer f32839;

    /* JADX INFO: renamed from: ᩻ */
    public final ByteBuffer f32840;

    /* JADX INFO: renamed from: ᩵ */
    public final C2582 f32835 = new C2582(C19110.f57020 * 3);

    /* JADX INFO: renamed from: ᩸ */
    public final C2582 f32838 = new C2582();

    public C11750(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        int i4;
        byteBuffer.position(0);
        ByteBuffer byteBufferOrder = byteBuffer.asReadOnlyBuffer().order(ByteOrder.BIG_ENDIAN);
        int i5 = byteBufferOrder.getInt() & (-256);
        if (i5 != 1684371456) {
            if (i5 == 1684371712) {
                throw new C8001("Odex unsupported.");
            }
            throw new C8001("Magic unsupported.");
        }
        int i6 = byteBufferOrder.getInt() >> 8;
        if (i6 < 3158837 || i6 > 3158848) {
            System.err.println("Unknown DEX version. Trying anyway...");
        }
        this.f32830 = i6;
        byteBufferOrder.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.position(byteBufferOrder.position() + 32);
        if (byteBufferOrder.getInt() != 305419896) {
            throw new C8001("Endian_tag unsupported");
        }
        byteBufferOrder.position(byteBufferOrder.position() + 8);
        int i7 = byteBufferOrder.getInt();
        int i8 = byteBufferOrder.getInt();
        this.f32818 = i8;
        int i9 = byteBufferOrder.getInt();
        this.f32824 = byteBufferOrder.getInt();
        int i10 = byteBufferOrder.getInt();
        this.f32829 = byteBufferOrder.getInt();
        int i11 = byteBufferOrder.getInt();
        this.f32834 = byteBufferOrder.getInt();
        int i12 = byteBufferOrder.getInt();
        this.f32813 = byteBufferOrder.getInt();
        int i13 = byteBufferOrder.getInt();
        this.f32837 = byteBufferOrder.getInt();
        int i14 = byteBufferOrder.getInt();
        this.f32816 = new String[i8];
        if (i6 >= 3158840) {
            byteBufferOrder.position(i7);
            int i15 = byteBufferOrder.getInt();
            int i16 = 0;
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            while (i16 < i15) {
                int i17 = byteBufferOrder.getShort() & HPKE.aead_EXPORT_ONLY;
                byteBufferOrder.getShort();
                int i18 = byteBufferOrder.getInt();
                int i19 = byteBufferOrder.getInt();
                int i20 = i15;
                if (i17 == 7) {
                    i4 = i18;
                    i3 = i19;
                } else if (i17 == 8) {
                    i2 = i18;
                    i = i19;
                }
                i16++;
                i15 = i20;
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        this.f32828 = i4;
        this.f32836 = m26950(byteBufferOrder, i9, this.f32818 * 4);
        this.f32827 = m26950(byteBufferOrder, i10, this.f32824 * 4);
        this.f32821 = m26950(byteBufferOrder, i11, this.f32829 * 12);
        this.f32817 = m26950(byteBufferOrder, i12, this.f32834 * 8);
        this.f32812 = m26950(byteBufferOrder, i13, this.f32813 * 8);
        this.f32820 = m26950(byteBufferOrder, i14, this.f32837 * 32);
        this.f32832 = m26950(byteBufferOrder, i3, i4 * 4);
        this.f32819 = m26950(byteBufferOrder, i, i2 * 8);
        byteBufferOrder.position(0);
        ByteBuffer byteBufferDuplicate = byteBufferOrder.duplicate();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f32833 = byteBufferDuplicate.order(byteOrder);
        this.f32825 = byteBufferOrder.duplicate().order(byteOrder);
        this.f32814 = byteBufferOrder.duplicate().order(byteOrder);
        this.f32831 = byteBufferOrder.duplicate().order(byteOrder);
        this.f32840 = byteBufferOrder.duplicate().order(byteOrder);
        this.f32823 = byteBufferOrder.duplicate().order(byteOrder);
        this.f32839 = byteBufferOrder.duplicate().order(byteOrder);
        this.f32815 = byteBufferOrder.duplicate().order(byteOrder);
        this.f32826 = byteBufferOrder.duplicate().order(byteOrder);
        this.f32822 = byteBufferOrder.duplicate().order(byteOrder);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ByteBuffer m26950(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.position(i);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(i2);
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferSlice;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26953(int i, Throwable th) {
        int i2;
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            i2 = i + 1;
            if (i3 >= i2) {
                break;
            }
            sb.append(".");
            i3++;
        }
        sb.append(' ');
        if (th instanceof C8001) {
            sb.append(th.getMessage());
            System.err.println(sb);
            if (th.getCause() != null) {
                m26953(i2, th.getCause());
                return;
            }
            return;
        }
        if (th != null) {
            PrintStream printStream = System.err;
            sb.append("ROOT cause:");
            printStream.println(sb);
            th.printStackTrace(System.err);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m26962(ByteBuffer byteBuffer, int i) {
        int i2 = ((i >> 5) & 7) + 1;
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= ((long) (byteBuffer.get() & 255)) << (i3 * 8);
        }
        int i4 = (8 - i2) * 8;
        return (j << i4) >> i4;
    }

    /* JADX INFO: renamed from: ܽ */
    public static long m26967(ByteBuffer byteBuffer, int i) {
        int i2 = ((i >> 5) & 7) + 1;
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= ((long) (byteBuffer.get() & 255)) << (i3 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m26948(ByteBuffer byteBuffer, int i) {
        int i2 = ((i >> 5) & 7) + 1;
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= ((long) (byteBuffer.get() & 255)) << (i3 * 8);
        }
        return j << ((int) (((long) (8 - i2)) * 8));
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m26960(int i, byte[] bArr) {
        return (bArr[i] & 255) | (bArr[i + 1] << 8);
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m26965(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m26945(int i, byte[] bArr) {
        return (bArr[i] & 255) | (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26955(String str, Object... objArr) {
        System.err.printf(str.concat("%n"), objArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26956(TreeMap treeMap, int i) {
        if (treeMap.containsKey(Integer.valueOf(i))) {
            return;
        }
        treeMap.put(Integer.valueOf(i), new C13366(i));
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m26966(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        int i = 0;
        int i2 = 0;
        while ((b & GCMSIVBlockCipher.MASK) != 0) {
            i |= (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i2;
            i2 += 7;
            b = byteBuffer.get();
        }
        return ((b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i2) | i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m26961(ByteBuffer byteBuffer) {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte b = byteBuffer.get();
            i2 |= (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i3;
            i = i3 + 7;
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                break;
            }
            i3 = i;
        }
        long j = i2;
        return ((1 << (i3 + 6)) & j) != 0 ? (int) (j - (1 << i)) : i2;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26952(int i, int i2, boolean z, C9342 c9342, TreeMap treeMap, C5995 c5995) {
        ByteBuffer byteBuffer = this.f32822;
        byteBuffer.position(i);
        int iM26966 = m26966(byteBuffer);
        int iM26967 = m26966(byteBuffer);
        C9067[] c9067Arr = new C9067[i2];
        int i3 = 0;
        for (String str : c9342.m21677()) {
            i3 = (str.equals("J") || str.equals("D")) ? i3 + 2 : i3 + 1;
        }
        int i4 = i2 - i3;
        if (!z) {
            c9067Arr[i4 - 1] = new C9067();
        }
        String[] strArrM21677 = c9342.m21677();
        for (int i5 = 0; i5 < iM26967; i5++) {
            String str2 = strArrM21677[i5];
            String strM26964 = m26964(m26966(byteBuffer) - 1);
            c9067Arr[i4] = new C9067();
            if (strM26964 != null) {
                c5995.mo13439(i5, strM26964);
            }
            i4 = (str2.equals("J") || str2.equals("D")) ? i4 + 2 : i4 + 1;
        }
        int iM26968 = 0;
        while (true) {
            int i6 = iM26966;
            while (true) {
                int i7 = byteBuffer.get() & 255;
                switch (i7) {
                    case 0:
                        return;
                    case 1:
                        iM26968 = m26966(byteBuffer) + iM26968;
                        break;
                    case 2:
                        break;
                    case 3:
                        int iM26969 = m26966(byteBuffer);
                        int iM269610 = m26966(byteBuffer) - 1;
                        int iM269611 = m26966(byteBuffer) - 1;
                        String strM26965 = m26964(iM269610);
                        String strM26972 = m26972(iM269611);
                        c9067Arr[iM26969] = new C9067();
                        m26956(treeMap, iM26968);
                        c5995.mo13441(iM26969, (C13366) treeMap.get(Integer.valueOf(iM26968)), strM26965, strM26972, null);
                        break;
                    case 4:
                        int iM269612 = m26966(byteBuffer);
                        int iM269613 = m26966(byteBuffer) - 1;
                        int iM269614 = m26966(byteBuffer) - 1;
                        int iM269615 = m26966(byteBuffer) - 1;
                        String strM26966 = m26964(iM269613);
                        String strM26973 = m26972(iM269614);
                        String strM26967 = m26964(iM269615);
                        C9067 c9067 = new C9067();
                        m26956(treeMap, iM26968);
                        c5995.mo13441(iM269612, (C13366) treeMap.get(Integer.valueOf(iM26968)), strM26966, strM26973, strM26967);
                        c9067Arr[iM269612] = c9067;
                        break;
                    case 5:
                        int iM269616 = m26966(byteBuffer);
                        if (c9067Arr[iM269616] == null) {
                            throw new RuntimeException(C20778.m46922(iM269616, "Encountered RESTART_LOCAL on new v"));
                        }
                        m26956(treeMap, iM26968);
                        c5995.mo13440(iM269616, (C13366) treeMap.get(Integer.valueOf(iM26968)));
                        break;
                        break;
                    case 6:
                        int iM269617 = m26966(byteBuffer);
                        if (c9067Arr[iM269617] == null) {
                            throw new RuntimeException(C20778.m46922(iM269617, "Encountered RESTART_LOCAL on new v"));
                        }
                        m26956(treeMap, iM26968);
                        c5995.mo13445(iM269617, (C13366) treeMap.get(Integer.valueOf(iM26968)));
                        break;
                        break;
                    case 7:
                        m26956(treeMap, iM26968);
                        c5995.mo13444((C13366) treeMap.get(Integer.valueOf(iM26968)));
                        break;
                    case 8:
                        m26956(treeMap, iM26968);
                        c5995.mo13442((C13366) treeMap.get(Integer.valueOf(iM26968)));
                        break;
                    case 9:
                        break;
                    default:
                        if (i7 < 10) {
                            throw new RuntimeException(C20778.m46922(i7, "Invalid extended opcode encountered "));
                        }
                        int i8 = i7 - 10;
                        int i9 = (i8 / 15) + iM26968;
                        int i10 = ((i8 % 15) - 4) + i6;
                        m26956(treeMap, i9);
                        c5995.mo13443(i10, (C13366) treeMap.get(Integer.valueOf(i9)));
                        i6 = i10;
                        iM26968 = i9;
                        break;
                        break;
                }
            }
            iM26966 = m26961(byteBuffer) + i6;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m26977() {
        return this.f32830;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26975(C21138 c21138, int i) {
        c21138.mo14575(this.f32830);
        int i2 = this.f32837;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBuffer = this.f32820;
            byteBuffer.position(i3 * 32);
            arrayList.add(new C22479(m26972(byteBuffer.getInt()), i3));
        }
        Collections.sort(arrayList);
        for (int i4 = 0; i4 < i2; i4++) {
            m26976(c21138, ((C22479) arrayList.get(i4)).f70900, i);
        }
        c21138.mo47760();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26976(C21138 c21138, int i, int i2) {
        ByteBuffer byteBuffer = this.f32820;
        byteBuffer.position(i * 32);
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        int i8 = byteBuffer.getInt();
        int i9 = byteBuffer.getInt();
        int i10 = byteBuffer.getInt();
        String strM26972 = m26972(i3);
        try {
            C18434 c18434Mo14574 = c21138.mo14574(strM26972, m26972(i5), m26959(i6), i4);
            if (c18434Mo14574 != null) {
                m26958(c18434Mo14574, i7, i8, i9, i10, i2);
            }
        } catch (Exception e) {
            C8001 c8001 = new C8001(e, "Error process class: [%d]%s", Integer.valueOf(i3), strM26972);
            if ((i2 & 32) != 0) {
                m26953(0, c8001);
                return;
            }
            throw c8001;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    private Object m26949(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        int i = b & 255;
        boolean z = b & C0684bo.f2505j;
        if (z == 0) {
            return Byte.valueOf((byte) m26962(byteBuffer, i));
        }
        if (z == 6) {
            return Long.valueOf(m26962(byteBuffer, i));
        }
        if (z == 2) {
            return Short.valueOf((short) m26962(byteBuffer, i));
        }
        if (z == 3) {
            return Character.valueOf((char) m26967(byteBuffer, i));
        }
        if (z == 4) {
            return Integer.valueOf((int) m26962(byteBuffer, i));
        }
        if (z == 16) {
            return Float.valueOf(Float.intBitsToFloat((int) (m26948(byteBuffer, i) >> 32)));
        }
        if (z == 17) {
            return Double.valueOf(Double.longBitsToDouble(m26948(byteBuffer, i)));
        }
        switch (z ? 1 : 0) {
            case 21:
                return m26969((int) m26967(byteBuffer, i));
            case 22:
                return m26970((int) m26967(byteBuffer, i));
            case 23:
                return m26964((int) m26967(byteBuffer, i));
            case 24:
                return new C24094(m26972((int) m26967(byteBuffer, i)));
            case 25:
                return m26963((int) m26967(byteBuffer, i));
            case 26:
                return m26968((int) m26967(byteBuffer, i));
            case 27:
                return m26963((int) m26967(byteBuffer, i));
            case 28:
                int iM26966 = m26966(byteBuffer);
                Object[] objArr = new Object[iM26966];
                for (int i2 = 0; i2 < iM26966; i2++) {
                    objArr[i2] = m26949(byteBuffer);
                }
                return objArr;
            case 29:
                return m26971(byteBuffer);
            case 30:
                return null;
            case 31:
                return Boolean.valueOf(((i >> 5) & 3) != 0);
            default:
                throw new C8001("Not support yet.");
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private C4173 m26970(int i) {
        ByteBuffer byteBuffer = this.f32819;
        byteBuffer.position(i * 8);
        int i2 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        byteBuffer.getShort();
        int i3 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
                return new C4173(i2, m26963(i3));
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new C4173(i2, m26968(i3));
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26958(C18434 c18434, int i, int i2, int i3, int i4, int i5) {
        Map map;
        Map map2;
        Map map3;
        Object[] objArr;
        if ((i5 & 1) == 0 && i != -1) {
            c18434.f55141 = m26964(i);
        }
        int i6 = i5 & 8;
        C2582 c2582 = this.f32835;
        if (i6 == 0) {
            map = (Map) c2582.m3892();
            map2 = (Map) c2582.m3892();
            map3 = (Map) c2582.m3892();
            if (map == null) {
                map = new HashMap();
            }
            if (map2 == null) {
                map2 = new HashMap();
            }
            if (map3 == null) {
                map3 = new HashMap();
            }
            if (i2 != 0) {
                ByteBuffer byteBuffer = this.f32833;
                byteBuffer.position(i2);
                int i7 = byteBuffer.getInt();
                int i8 = byteBuffer.getInt();
                int i9 = byteBuffer.getInt();
                int i10 = byteBuffer.getInt();
                for (int i11 = 0; i11 < i8; i11++) {
                    map.put(Integer.valueOf(byteBuffer.getInt()), Integer.valueOf(byteBuffer.getInt()));
                }
                for (int i12 = 0; i12 < i9; i12++) {
                    map2.put(Integer.valueOf(byteBuffer.getInt()), Integer.valueOf(byteBuffer.getInt()));
                }
                for (int i13 = 0; i13 < i10; i13++) {
                    map3.put(Integer.valueOf(byteBuffer.getInt()), Integer.valueOf(byteBuffer.getInt()));
                }
                if (i7 != 0) {
                    try {
                        m26954(i7, c18434);
                    } catch (Exception e) {
                        throw new C8001("error on reading Annotation of class ", e);
                    }
                }
            }
        } else {
            map = null;
            map2 = null;
            map3 = null;
        }
        Map map4 = map;
        Map map5 = map2;
        Map map6 = map3;
        if (i3 != 0) {
            ByteBuffer byteBuffer2 = this.f32840;
            byteBuffer2.position(i3);
            int iM26966 = m26966(byteBuffer2);
            int iM26967 = m26966(byteBuffer2);
            int iM26968 = m26966(byteBuffer2);
            int iM26969 = m26966(byteBuffer2);
            if ((i5 & 16) != 0 || i4 == 0) {
                objArr = null;
            } else {
                ByteBuffer byteBuffer3 = this.f32815;
                byteBuffer3.position(i4);
                int iM269610 = m26966(byteBuffer3);
                objArr = new Object[iM269610];
                for (int i14 = 0; i14 < iM269610; i14++) {
                    objArr[i14] = m26949(byteBuffer3);
                }
            }
            Object[] objArr2 = objArr;
            int iM26946 = 0;
            int i15 = 0;
            while (i15 < iM26966) {
                iM26946 = m26946(byteBuffer2, iM26946, c18434, map4, (objArr2 == null || i15 >= objArr2.length) ? null : objArr2[i15], i5);
                i15++;
                iM26969 = iM26969;
                iM26968 = iM26968;
                objArr2 = objArr2;
            }
            int i16 = iM26969;
            int i17 = iM26968;
            int iM26947 = 0;
            for (int i18 = 0; i18 < iM26967; i18++) {
                iM26947 = m26946(byteBuffer2, iM26947, c18434, map4, (Object) null, i5);
            }
            int iM26948 = 0;
            boolean z = true;
            int i19 = 0;
            while (i19 < i17) {
                iM26948 = m26947(byteBuffer2, iM26948, c18434, map5, map6, i5, z);
                i19++;
                z = false;
            }
            int iM26949 = 0;
            boolean z2 = true;
            int i20 = 0;
            while (i20 < i16) {
                iM26949 = m26947(byteBuffer2, iM26949, c18434, map5, map6, i5, z2);
                i20++;
                z2 = false;
            }
        }
        if (map4 != null) {
            map4.clear();
            c2582.m3890(map4);
        }
        if (map5 != null) {
            map5.clear();
            c2582.m3890(map5);
        }
        if (map6 != null) {
            map6.clear();
            c2582.m3890(map6);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26954(int i, InterfaceC20467 interfaceC20467) {
        ByteBuffer byteBuffer = this.f32825;
        byteBuffer.position(i);
        int i2 = byteBuffer.getInt();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = byteBuffer.getInt();
            ByteBuffer byteBuffer2 = this.f32814;
            byteBuffer2.position(i4);
            int i5 = byteBuffer2.get() & 255;
            C13071 c13071M26971 = m26971(byteBuffer2);
            EnumC18254 enumC18254 = EnumC18254.values()[i5];
            c13071M26971.f36753 = enumC18254;
            C13071 c13071Mo10691 = interfaceC20467.mo10691(c13071M26971.f36752, enumC18254);
            for (C4353 c4353 : c13071M26971.f36751) {
                C13071.m29935(c13071Mo10691, c4353.f9748, c4353.f9749);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private C13071 m26971(ByteBuffer byteBuffer) {
        int iM26966 = m26966(byteBuffer);
        int iM26967 = m26966(byteBuffer);
        C13071 c13071 = new C13071(m26972(iM26966), EnumC18254.RUNTIME);
        for (int i = 0; i < iM26967; i++) {
            c13071.f36751.add(new C4353(m26964(m26966(byteBuffer)), m26949(byteBuffer)));
        }
        return c13071;
    }

    /* JADX INFO: renamed from: ۧ */
    private C15376 m26963(int i) {
        ByteBuffer byteBuffer = this.f32817;
        byteBuffer.position(i * 8);
        int i2 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        int i3 = 65535 & byteBuffer.getShort();
        return new C15376(m26972(i2), m26964(byteBuffer.getInt()), m26972(i3));
    }

    /* JADX INFO: renamed from: ۜ */
    private String[] m26959(int i) {
        if (i == 0) {
            return new String[0];
        }
        ByteBuffer byteBuffer = this.f32826;
        byteBuffer.position(i);
        int i2 = byteBuffer.getInt();
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = m26972(65535 & byteBuffer.getShort());
        }
        return strArr;
    }

    /* JADX INFO: renamed from: ܿ */
    private C12891 m26969(int i) {
        ByteBuffer byteBuffer = this.f32821;
        byteBuffer.position((i * 12) + 4);
        return new C12891(m26972(byteBuffer.getInt()), m26959(byteBuffer.getInt()));
    }

    /* JADX INFO: renamed from: ܽ */
    private C9342 m26968(int i) {
        ByteBuffer byteBuffer = this.f32812;
        byteBuffer.position(i * 8);
        int i2 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        int i3 = 65535 & byteBuffer.getShort();
        return new C9342(m26972(i2), m26964(byteBuffer.getInt()), m26969(i3));
    }

    /* JADX INFO: renamed from: ܳ */
    private String m26964(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.f32816;
        if (i >= strArr.length) {
            return null;
        }
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        C2582 c2582 = this.f32838;
        int i2 = this.f32836.getInt(i * 4);
        ByteBuffer byteBuffer = this.f32839;
        byteBuffer.position(i2);
        int iM26966 = m26966(byteBuffer);
        try {
            StringBuilder sb = (StringBuilder) c2582.m3892();
            if (sb == null) {
                sb = new StringBuilder((int) (((double) iM26966) * 1.5d));
            }
            String strM14604 = C6385.m14604(byteBuffer, sb);
            if (sb.length() < 100) {
                sb.setLength(0);
                c2582.m3890(sb);
            }
            strArr[i] = strM14604;
            return strM14604;
        } catch (UTFDataFormatException e) {
            throw new C8001(e, "fail to load string %d@%08x", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private String m26972(int i) {
        if (i == -1) {
            return null;
        }
        return m26964(this.f32827.getInt(i * 4));
    }

    /* JADX INFO: renamed from: ֫ */
    private int m26946(ByteBuffer byteBuffer, int i, C18434 c18434, Map map, Object obj, int i2) {
        Integer num;
        int iM26966 = m26966(byteBuffer);
        int iM26967 = m26966(byteBuffer);
        int i3 = i + iM26966;
        C15376 c15376M26963 = m26963(i3);
        if (c18434.f55139 == null) {
            c18434.f55139 = new ArrayList();
        }
        C5024 c5024 = new C5024();
        c5024.f11508 = iM26967;
        c5024.f11506 = c15376M26963;
        c5024.f11507 = obj;
        c18434.f55139.add(c5024);
        if ((i2 & 8) != 0 || (num = (Integer) map.get(Integer.valueOf(i3))) == null) {
            return i3;
        }
        try {
            m26954(num.intValue(), c5024);
            return i3;
        } catch (Exception e) {
            throw new C8001(e, "while accept annotation in field:%s.", c15376M26963.toString());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m26947(ByteBuffer byteBuffer, int i, C18434 c18434, Map map, Map map2, int i2, boolean z) {
        InterfaceC20467 interfaceC20467M47743;
        int iPosition = byteBuffer.position();
        int iM26966 = m26966(byteBuffer);
        int iM26967 = m26966(byteBuffer);
        int iM26968 = m26966(byteBuffer);
        int i3 = i + iM26966;
        C9342 c9342M26968 = m26968(i3);
        if (!z && iM26966 == 0) {
            m26955("GLITCH: duplicated method %s @%08x", c9342M26968.toString(), Integer.valueOf(iPosition));
            if ((i2 & 64) == 0) {
                m26955("WARN: skip method %s @%08x", c9342M26968.toString(), Integer.valueOf(iPosition));
                return i3;
            }
        }
        if ((65536 & iM26967) == 0 && (c9342M26968.m21673().equals("<init>") || c9342M26968.m21673().equals("<clinit>"))) {
            m26955("GLITCH: method %s @%08x not marked as ACC_CONSTRUCTOR", c9342M26968.toString(), Integer.valueOf(iPosition));
        }
        try {
            if (c18434.f55142 == null) {
                c18434.f55142 = new ArrayList();
            }
            C21118 c21118 = new C21118();
            c21118.f66380 = iM26967;
            c21118.f66378 = c9342M26968;
            c18434.f55142.add(c21118);
            if ((i2 & 8) == 0) {
                Integer num = (Integer) map.get(Integer.valueOf(i3));
                if (num != null) {
                    try {
                        m26954(num.intValue(), c21118);
                    } catch (Exception e) {
                        throw new C8001(e, "while accept annotation in method:%s.", c9342M26968.toString());
                    }
                }
                Integer num2 = (Integer) map2.get(Integer.valueOf(i3));
                if (num2 != null) {
                    try {
                        int iIntValue = num2.intValue();
                        ByteBuffer byteBuffer2 = this.f32831;
                        byteBuffer2.position(iIntValue);
                        int i4 = byteBuffer2.getInt();
                        for (int i5 = 0; i5 < i4; i5++) {
                            int i6 = byteBuffer2.getInt();
                            if (i6 != 0 && (interfaceC20467M47743 = c21118.m47743(i5)) != null) {
                                try {
                                    m26954(i6, interfaceC20467M47743);
                                } catch (Exception e2) {
                                    throw new C8001(e2, "While accepting parameter annotation in parameter: [%d]", Integer.valueOf(i5));
                                }
                            }
                        }
                    } catch (Exception e3) {
                        throw new C8001(e3, "while accept parameter annotation in method:%s.", c9342M26968.toString());
                    }
                }
            }
            if (iM26968 == 0 || ((i2 & 4) != 0 && ((i2 & 128) == 0 || !c9342M26968.m21673().equals("<clinit>")))) {
                return i3;
            }
            C19776 c19776 = new C19776();
            c19776.f60164 = new ArrayList();
            c19776.f60166 = null;
            c19776.f60165 = -1;
            c21118.f66379 = c19776;
            try {
                m26974(iM26968, c19776, i2, (iM26967 & 8) != 0, c9342M26968);
                return i3;
            } catch (Exception e4) {
                throw new C8001(e4, "while accept code in method:[%s] @%08x", c9342M26968.toString(), Integer.valueOf(iM26968));
            }
        } catch (Exception e5) {
            throw new C8001(e5, "while accept method:[%s]", c9342M26968.toString());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m26973() {
        return this.f32837;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x0220 A[PHI: r1
      0x0220: PHI (r1v46 int) = (r1v34 int), (r1v38 int), (r1v40 int), (r1v42 int), (r1v44 int), (r1v48 int) binds: [B:108:0x021e, B:100:0x0204, B:97:0x01f9, B:94:0x01f0, B:91:0x01e5, B:88:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x0222 A[PHI: r1
      0x0222: PHI (r1v45 int) = (r1v34 int), (r1v34 int), (r1v38 int), (r1v40 int), (r1v42 int), (r1v44 int), (r1v48 int), (r1v48 int) binds: [B:106:0x021a, B:108:0x021e, B:100:0x0204, B:97:0x01f9, B:94:0x01f0, B:91:0x01e5, B:86:0x01d6, B:88:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX INFO: renamed from: ֫ */
    private void m26957(TreeMap treeMap, LinkedList linkedList, byte[] bArr, int i) {
        boolean z;
        char c;
        int iM26965;
        boolean z2;
        int i2 = i * 2;
        if (i2 >= bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = bArr[i2] & 255;
        EnumC5044 enumC5044 = EnumC5044.f11780[i3];
        if (enumC5044 == null || enumC5044.f11821 == null) {
            throw new C25160("zero-width instruction op=0x%02x", Integer.valueOf(i3));
        }
        if (enumC5044.m10759()) {
            switch (C16442.f48317[enumC5044.f11821.ordinal()]) {
                case 1:
                    int i4 = i + bArr[i2 + 1];
                    if (i4 < 0 || i4 * 2 > bArr.length) {
                        throw new C25160("jump out of insns %s -> %04x", enumC5044, Integer.valueOf(i4));
                    }
                    linkedList.add(Integer.valueOf(i4));
                    m26956(treeMap, i4);
                    z = true;
                    break;
                    break;
                case 2:
                case 3:
                    int iM26960 = i + m26960(i2 + 2, bArr);
                    if (iM26960 < 0 || iM26960 * 2 > bArr.length) {
                        throw new C25160("jump out of insns %s -> %04x", enumC5044, Integer.valueOf(iM26960));
                    }
                    linkedList.add(Integer.valueOf(iM26960));
                    m26956(treeMap, iM26960);
                    z = true;
                    break;
                    break;
                case 4:
                    int iM26961 = i + m26960(i2 + 2, bArr);
                    byte b = bArr[i2 + 1];
                    if ((b & 15) == (((b & 255) >> 4) & 15)) {
                        switch (C16442.f48319[enumC5044.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                                z2 = false;
                                z = false;
                                break;
                            case 4:
                            case 5:
                            case 6:
                                z2 = true;
                                z = true;
                                break;
                            default:
                                z2 = false;
                                z = true;
                                break;
                        }
                    } else {
                        z2 = false;
                        z = true;
                    }
                    if (!z2) {
                        if (iM26961 < 0 || iM26961 * 2 > bArr.length) {
                            throw new C25160("jump out of insns %s -> %04x", enumC5044, Integer.valueOf(iM26961));
                        }
                        linkedList.add(Integer.valueOf(iM26961));
                        m26956(treeMap, iM26961);
                    }
                    break;
                case 5:
                case 6:
                    int iM26945 = i + m26945(i2 + 2, bArr);
                    if (iM26945 < 0 || iM26945 * 2 > bArr.length) {
                        throw new C25160("jump out of insns %s -> %04x", enumC5044, Integer.valueOf(iM26945));
                    }
                    linkedList.add(Integer.valueOf(iM26945));
                    m26956(treeMap, iM26945);
                    z = true;
                    break;
                    break;
                default:
                    z = true;
                    break;
            }
        } else {
            z = true;
        }
        if (enumC5044.m10763()) {
            m26956(treeMap, i + enumC5044.f11821.f30711);
            int iM26946 = (i + m26945(i2 + 2, bArr)) * 2;
            int i5 = iM26946 + 2;
            if (i5 < bArr.length) {
                byte b2 = bArr[iM26946 + 1];
                if (b2 == 1) {
                    c = 0;
                    int iM26966 = m26965(i5, bArr);
                    int i6 = iM26946 + 8;
                    for (int i7 = 0; i7 < iM26966; i7++) {
                        int iM26947 = i + m26945((i7 * 4) + i6, bArr);
                        if (iM26947 < 0 || iM26947 * 2 > bArr.length) {
                            throw new C25160("jump out of insns %s -> %04x", enumC5044, Integer.valueOf(iM26947));
                        }
                        linkedList.add(Integer.valueOf(iM26947));
                        m26956(treeMap, iM26947);
                    }
                } else if (b2 == 2) {
                    int iM26967 = m26965(i5, bArr);
                    int i8 = (iM26967 * 4) + iM26946 + 4;
                    for (int i9 = 0; i9 < iM26967; i9++) {
                        int iM26948 = i + m26945((i9 * 4) + i8, bArr);
                        if (iM26948 < 0 || iM26948 * 2 > bArr.length) {
                            throw new C25160("jump out of insns %s -> %04x", enumC5044, Integer.valueOf(iM26948));
                        }
                        linkedList.add(Integer.valueOf(iM26948));
                        m26956(treeMap, iM26948);
                    }
                    c = 0;
                } else {
                    throw new C25160("bad payload for %s", enumC5044);
                }
            } else {
                throw new C25160("bad payload offset for %s", enumC5044);
            }
        } else {
            c = 0;
        }
        if (z) {
            int i10 = C16442.f48318[enumC5044.f11820.ordinal()];
            int i11 = this.f32813;
            switch (i10) {
                case 1:
                    if (enumC5044.f11821 == EnumC11079.kFmt31c) {
                        iM26965 = m26945(i2 + 2, bArr);
                    } else {
                        iM26965 = m26965(i2 + 2, bArr);
                    }
                    if (iM26965 < 0 || iM26965 >= this.f32818) {
                        z = false;
                    } else {
                        z = true;
                    }
                    break;
                case 2:
                    iM26965 = m26965(i2 + 2, bArr);
                    if (iM26965 < this.f32824) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 3:
                    iM26965 = m26965(i2 + 2, bArr);
                    if (iM26965 < i11) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 4:
                    iM26965 = m26965(i2 + 2, bArr);
                    if (iM26965 < this.f32834) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 5:
                    iM26965 = m26965(i2 + 2, bArr);
                    if (iM26965 < this.f32828) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 6:
                    iM26965 = m26965(i2 + 2, bArr);
                    int iM26968 = m26965(i2 + 6, bArr);
                    if (iM26965 >= i11 || iM26968 >= this.f32829) {
                        z = false;
                    } else {
                        z = true;
                    }
                    break;
                default:
                    iM26965 = Integer.MAX_VALUE;
                    break;
            }
            if (!z) {
                Integer numValueOf = Integer.valueOf(iM26965);
                Object[] objArr = new Object[2];
                objArr[c] = enumC5044;
                objArr[1] = numValueOf;
                throw new C25160("index-out-of-range for %s index: %d", objArr);
            }
        }
        if (z && enumC5044.m10760()) {
            EnumC5044 enumC5045 = EnumC5044.f11616;
            if (enumC5044 == enumC5045) {
                byte b3 = bArr[i2 + 1];
                if (b3 == 0) {
                    linkedList.add(Integer.valueOf(i + enumC5045.f11821.f30711));
                    return;
                }
                if (b3 == 1) {
                    linkedList.add(Integer.valueOf((m26965(i2 + 2, bArr) * 2) + i + 4));
                    return;
                } else if (b3 == 2) {
                    linkedList.add(Integer.valueOf((m26965(i2 + 2, bArr) * 4) + i + 2));
                    return;
                } else {
                    if (b3 != 3) {
                        return;
                    }
                    linkedList.add(Integer.valueOf((((m26945(i2 + 4, bArr) * m26965(i2 + 2, bArr)) + 1) / 2) + i + 4));
                    return;
                }
            }
            linkedList.add(Integer.valueOf(i + enumC5044.f11821.f30711));
        }
    }

    /* JADX WARN: Code duplicated, block: B:218:0x079a  */
    /* JADX INFO: renamed from: ֫ */
    public final void m26974(int i, C19776 c19776, int i2, boolean z, C9342 c9342) {
        BitSet bitSet;
        Integer num;
        EnumC5044[] enumC5044Arr;
        int i3;
        BitSet bitSet2;
        boolean z2;
        int i4;
        int i5;
        int i6;
        BitSet bitSet3;
        ByteBuffer byteBuffer = this.f32823;
        byteBuffer.position(i);
        int i7 = byteBuffer.getShort() & 65535;
        byteBuffer.getShort();
        byteBuffer.getShort();
        int i8 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        int i9 = byteBuffer.getInt();
        int i10 = byteBuffer.getInt();
        byte[] bArr = new byte[i10 * 2];
        byteBuffer.get(bArr);
        c19776.f60165 = i7;
        BitSet bitSet4 = new BitSet();
        TreeMap treeMap = new TreeMap();
        HashSet hashSet = new HashSet();
        if (i8 > 0) {
            if ((i10 & 1) != 0) {
                byteBuffer.getShort();
            }
            short s = HPKE.aead_EXPORT_ONLY;
            if ((i2 & 256) == 0) {
                int iPosition = (i8 * 8) + byteBuffer.position();
                ByteBuffer byteBufferOrder = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
                int i11 = 0;
                while (i11 < i8) {
                    int i12 = i8;
                    int i13 = byteBuffer.getInt();
                    int i14 = byteBuffer.getShort() & s;
                    int i15 = byteBuffer.getShort() & s;
                    if (i13 > i10) {
                        i6 = i7;
                        i4 = i10;
                        bitSet3 = bitSet4;
                    } else {
                        m26956(treeMap, i13);
                        int i16 = i13 + i14;
                        m26956(treeMap, i16);
                        byteBufferOrder.position(iPosition + i15);
                        int iM26961 = m26961(byteBufferOrder);
                        if (iM26961 <= 0) {
                            int i17 = -iM26961;
                            z2 = true;
                            int i18 = i10;
                            i5 = i17;
                            iM26961 = i17 + 1;
                            i4 = i18;
                        } else {
                            z2 = false;
                            i4 = i10;
                            i5 = iM26961;
                        }
                        C13366[] c13366Arr = new C13366[iM26961];
                        String[] strArr = new String[iM26961];
                        int i19 = 0;
                        while (i19 < i5) {
                            BitSet bitSet5 = bitSet4;
                            int iM26966 = m26966(byteBufferOrder);
                            int i20 = i7;
                            int iM26967 = m26966(byteBufferOrder);
                            m26956(treeMap, iM26967);
                            hashSet.add(Integer.valueOf(iM26967));
                            strArr[i19] = m26972(iM26966);
                            c13366Arr[i19] = (C13366) treeMap.get(Integer.valueOf(iM26967));
                            i19++;
                            bitSet4 = bitSet5;
                            i7 = i20;
                        }
                        i6 = i7;
                        bitSet3 = bitSet4;
                        if (z2) {
                            int iM26968 = m26966(byteBufferOrder);
                            m26956(treeMap, iM26968);
                            hashSet.add(Integer.valueOf(iM26968));
                            c13366Arr[i5] = (C13366) treeMap.get(Integer.valueOf(iM26968));
                        }
                        C13366 c13366 = (C13366) treeMap.get(Integer.valueOf(i13));
                        C13366 c13367 = (C13366) treeMap.get(Integer.valueOf(i16));
                        if (c19776.f60166 == null) {
                            c19776.f60166 = new ArrayList(3);
                        }
                        c19776.f60166.add(new C3011(c13366, c13367, c13366Arr, strArr));
                    }
                    i11++;
                    i8 = i12;
                    byteBuffer = byteBuffer;
                    i10 = i4;
                    iPosition = iPosition;
                    bitSet4 = bitSet3;
                    bArr = bArr;
                    i7 = i6;
                    s = HPKE.aead_EXPORT_ONLY;
                }
            }
        }
        int i21 = i7;
        byte[] bArr2 = bArr;
        BitSet bitSet6 = bitSet4;
        if (i9 != 0 && (i2 & 1) == 0) {
            c19776.getClass();
            C17763 c17763 = new C17763();
            c17763.f53053 = new ArrayList();
            c19776.f60163 = c17763;
            try {
                m26952(i9, i21, z, c9342, treeMap, c17763);
            } catch (Exception unused) {
            }
        }
        BitSet bitSet7 = new BitSet();
        LinkedList linkedList = new LinkedList();
        linkedList.add(0);
        linkedList.addAll(hashSet);
        hashSet.clear();
        while (!linkedList.isEmpty()) {
            Integer num2 = (Integer) linkedList.poll();
            int iIntValue = num2.intValue();
            bitSet6 = bitSet6;
            if (!bitSet6.get(iIntValue)) {
                bitSet6.set(iIntValue);
                byte[] bArr3 = bArr2;
                try {
                    m26957(treeMap, linkedList, bArr3, iIntValue);
                } catch (IndexOutOfBoundsException unused2) {
                    bitSet7.set(iIntValue);
                    m26955("GLITCH: %04x %s | not enough space for reading instruction", num2, c9342.toString());
                } catch (C25160 e) {
                    bitSet7.set(iIntValue);
                    m26955("GLITCH: %04x %s | %s", num2, c9342.toString(), e.getMessage());
                }
                bArr2 = bArr3;
            }
        }
        BitSet bitSet8 = bitSet6;
        byte[] bArr4 = bArr2;
        Iterator it = treeMap.keySet().iterator();
        Integer num3 = it.hasNext() ? (Integer) it.next() : null;
        EnumC5044[] enumC5044Arr2 = EnumC5044.f11780;
        int iNextSetBit = bitSet8.nextSetBit(0);
        while (iNextSetBit >= 0) {
            while (num3 != null && num3.intValue() <= iNextSetBit) {
                c19776.m44942((C13366) treeMap.get(num3));
                num3 = it.hasNext() ? (Integer) it.next() : null;
            }
            if (bitSet7.get(iNextSetBit)) {
                c19776.m44929(EnumC5044.f11619);
            } else {
                int i22 = iNextSetBit * 2;
                EnumC5044 enumC5044 = enumC5044Arr2[bArr4[i22] & 255];
                switch (C16442.f48317[enumC5044.f11821.ordinal()]) {
                    case 1:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC5044Arr = enumC5044Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        c19776.m44934(enumC5044, -1, -1, (C13366) treeMap.get(Integer.valueOf(bArr4[i22 + 1] + i3)));
                        break;
                    case 2:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC5044Arr = enumC5044Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        c19776.m44934(enumC5044, -1, -1, (C13366) treeMap.get(Integer.valueOf(m26960(i22 + 2, bArr4) + i3)));
                        break;
                    case 3:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC5044Arr = enumC5044Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        c19776.m44934(enumC5044, bArr4[i22 + 1] & 255, -1, (C13366) treeMap.get(Integer.valueOf(m26960(i22 + 2, bArr4) + i3)));
                        break;
                    case 4:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC5044Arr = enumC5044Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        int iM26960 = m26960(i22 + 2, bArr4) + i3;
                        int i23 = bArr4[i22 + 1];
                        int i24 = i23 & 255;
                        int i25 = i23 & 15;
                        int i26 = i24 >> 4;
                        if (i25 != i26) {
                            c19776.m44934(enumC5044, i25, i26, (C13366) treeMap.get(Integer.valueOf(iM26960)));
                            break;
                        } else {
                            switch (C16442.f48319[enumC5044.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                    c19776.m44934(EnumC5044.f11701, 0, 0, (C13366) treeMap.get(Integer.valueOf(iM26960)));
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                    break;
                                default:
                                    c19776.m44934(enumC5044, i25, i26, (C13366) treeMap.get(Integer.valueOf(iM26960)));
                                    break;
                            }
                        }
                        break;
                    case 5:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC5044Arr = enumC5044Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        c19776.m44934(enumC5044, -1, -1, (C13366) treeMap.get(Integer.valueOf(m26945(i22 + 2, bArr4) + i3)));
                        break;
                    case 6:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC5044Arr = enumC5044Arr2;
                        bitSet2 = bitSet8;
                        int iM26945 = m26945(i22 + 2, bArr4) + iNextSetBit;
                        int i27 = bArr4[i22 + 1] & 255;
                        int i28 = iM26945 * 2;
                        if (enumC5044 == EnumC5044.f11714) {
                            int iM26965 = m26965(i28 + 2, bArr4);
                            int iM26946 = m26945(i28 + 4, bArr4);
                            if (iM26965 == 1) {
                                i3 = iNextSetBit;
                                Object obj = new byte[iM26946];
                                System.arraycopy(bArr4, i28 + 8, obj, 0, iM26946);
                                c19776.m44945(enumC5044, i27, obj);
                            } else if (iM26965 == 2) {
                                i3 = iNextSetBit;
                                short[] sArr = new short[iM26946];
                                for (int i29 = 0; i29 < iM26946; i29++) {
                                    sArr[i29] = (short) m26960((i29 * 2) + i28 + 8, bArr4);
                                }
                                c19776.m44945(enumC5044, i27, sArr);
                            } else if (iM26965 == 4) {
                                i3 = iNextSetBit;
                                int[] iArr = new int[iM26946];
                                for (int i30 = 0; i30 < iM26946; i30++) {
                                    iArr[i30] = m26945((i30 * 4) + i28 + 8, bArr4);
                                }
                                c19776.m44945(enumC5044, i27, iArr);
                            } else if (iM26965 != 8) {
                                i3 = iNextSetBit;
                            } else {
                                long[] jArr = new long[iM26946];
                                int i31 = 0;
                                while (i31 < iM26946) {
                                    int i32 = (i31 * 8) + i28 + 8;
                                    jArr[i31] = (((long) m26965(i32 + 2, bArr4)) << 16) | ((long) m26965(i32, bArr4)) | (((long) m26965(i32 + 4, bArr4)) << 32) | (((long) m26965(i32 + 6, bArr4)) << 48);
                                    i31++;
                                    iNextSetBit = iNextSetBit;
                                    iM26946 = iM26946;
                                }
                                i3 = iNextSetBit;
                                c19776.m44945(enumC5044, i27, jArr);
                            }
                        } else {
                            i3 = iNextSetBit;
                            if (enumC5044 == EnumC5044.f11796) {
                                int iM26962 = m26960(i28 + 2, bArr4);
                                int[] iArr2 = new int[iM26962];
                                C13366[] c13366Arr2 = new C13366[iM26962];
                                int i33 = i28 + 4;
                                for (int i34 = 0; i34 < iM26962; i34++) {
                                    iArr2[i34] = m26945((i34 * 4) + i33, bArr4);
                                }
                                int i35 = (iM26962 * 4) + i33;
                                for (int i36 = 0; i36 < iM26962; i36++) {
                                    c13366Arr2[i36] = (C13366) treeMap.get(Integer.valueOf(m26945((i36 * 4) + i35, bArr4) + i3));
                                }
                                c19776.m44937(enumC5044, i27, iArr2, c13366Arr2);
                            } else {
                                int iM26963 = m26960(i28 + 2, bArr4);
                                int iM26947 = m26945(i28 + 4, bArr4);
                                C13366[] c13366Arr3 = new C13366[iM26963];
                                int i37 = i28 + 8;
                                for (int i38 = 0; i38 < iM26963; i38++) {
                                    c13366Arr3[i38] = (C13366) treeMap.get(Integer.valueOf(m26945(i37, bArr4) + i3));
                                    i37 += 4;
                                }
                                c19776.m44935(enumC5044, i27, iM26947, c13366Arr3);
                            }
                        }
                        break;
                    case 7:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC5044Arr = enumC5044Arr2;
                        bitSet2 = bitSet8;
                        c19776.m44929(enumC5044);
                        i3 = iNextSetBit;
                        break;
                    case 8:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC5044Arr = enumC5044Arr2;
                        bitSet2 = bitSet8;
                        c19776.m44930(enumC5044, bArr4[i22 + 1] & 255);
                        i3 = iNextSetBit;
                        break;
                    case 9:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC5044Arr = enumC5044Arr2;
                        bitSet2 = bitSet8;
                        int i39 = bArr4[i22 + 1];
                        c19776.m44931(enumC5044, i39 & 15, (i39 & 255) >> 4);
                        i3 = iNextSetBit;
                        break;
                    case 10:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC5044Arr = enumC5044Arr2;
                        bitSet2 = bitSet8;
                        int i40 = bArr4[i22 + 1] & 255;
                        int iM26969 = m26965(i22 + 2, bArr4);
                        int i41 = C16442.f48318[enumC5044.f11820.ordinal()];
                        if (i41 == 1) {
                            c19776.m44936(enumC5044, i40, m26964(iM26969));
                        } else if (i41 != 2) {
                            if (i41 == 4) {
                                c19776.mo31707(enumC5044, i40, -1, m26963(iM26969));
                            } else if (i41 == 7) {
                                c19776.m44936(enumC5044, i40, m26970(iM26969));
                            } else if (i41 == 8) {
                                c19776.m44936(enumC5044, i40, m26969(iM26969));
                            }
                        } else if (enumC5044 == EnumC5044.f11693) {
                            c19776.m44936(enumC5044, i40, new C24094(m26972(iM26969)));
                        } else {
                            c19776.m44933(enumC5044, i40, -1, m26972(iM26969));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 11:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC5044Arr = enumC5044Arr2;
                        bitSet2 = bitSet8;
                        int i42 = bArr4[i22 + 1];
                        int i43 = i42 & 255;
                        int iM269610 = m26965(i22 + 2, bArr4);
                        int i44 = C16442.f48318[enumC5044.f11820.ordinal()];
                        if (i44 == 2) {
                            c19776.m44933(enumC5044, i42 & 15, i43 >> 4, m26972(iM269610));
                        } else if (i44 == 4) {
                            c19776.mo31707(enumC5044, i42 & 15, i43 >> 4, m26963(iM269610));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 12:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC5044Arr = enumC5044Arr2;
                        bitSet2 = bitSet8;
                        if (enumC5044.f11820 == EnumC17783.kIndexStringRef) {
                            c19776.m44936(enumC5044, bArr4[i22 + 1] & 255, m26964(m26945(i22 + 2, bArr4)));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 13:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC5044Arr = enumC5044Arr2;
                        bitSet2 = bitSet8;
                        int i45 = bArr4[i22 + 1];
                        int iM269611 = m26965(i22 + 2, bArr4);
                        int i46 = bArr4[i22 + 4];
                        int i47 = i46 & 255;
                        int i48 = bArr4[i22 + 5];
                        int i49 = i48 & 255;
                        int i50 = (i45 & 255) >> 4;
                        int[] iArr3 = new int[i50];
                        if (i50 == 1) {
                            iArr3[0] = i46 & 15;
                        } else {
                            if (i50 != 2) {
                                if (i50 != 3) {
                                    if (i50 != 4) {
                                        if (i50 == 5) {
                                            iArr3[4] = i45 & 15;
                                        }
                                        i3 = iNextSetBit;
                                    }
                                    iArr3[3] = (i49 >> 4) & 15;
                                }
                                iArr3[2] = i48 & 15;
                            }
                            iArr3[1] = (i47 >> 4) & 15;
                            iArr3[0] = i46 & 15;
                        }
                        EnumC17783 enumC17783 = enumC5044.f11820;
                        if (enumC17783 == EnumC17783.kIndexTypeRef) {
                            c19776.m44938(enumC5044, iArr3, m26972(iM269611));
                        } else if (enumC17783 == EnumC17783.kIndexCallSiteRef) {
                            c19776.m44941(enumC5044, iArr3, m26951(iM269611));
                        } else {
                            c19776.m44939(enumC5044, iArr3, m26968(iM269611));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 14:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC5044Arr = enumC5044Arr2;
                        bitSet2 = bitSet8;
                        int i51 = bArr4[i22 + 1] & 255;
                        int iM269612 = m26965(i22 + 2, bArr4);
                        int iM269613 = m26965(i22 + 4, bArr4);
                        int[] iArr4 = new int[i51];
                        for (int i52 = 0; i52 < i51; i52++) {
                            iArr4[i52] = iM269613 + i52;
                        }
                        EnumC17783 enumC17784 = enumC5044.f11820;
                        if (enumC17784 == EnumC17783.kIndexTypeRef) {
                            c19776.m44938(enumC5044, iArr4, m26972(iM269612));
                        } else if (enumC17784 == EnumC17783.kIndexCallSiteRef) {
                            c19776.m44941(enumC5044, iArr4, m26951(iM269612));
                        } else {
                            c19776.m44939(enumC5044, iArr4, m26968(iM269612));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 15:
                        bitSet = bitSet7;
                        num = num3;
                        int i53 = bArr4[i22 + 1];
                        int iM269614 = m26965(i22 + 2, bArr4);
                        int i54 = bArr4[i22 + 4];
                        int i55 = i54 & 255;
                        int i56 = bArr4[i22 + 5];
                        enumC5044Arr = enumC5044Arr2;
                        int i57 = i56 & 255;
                        int iM269615 = m26965(i22 + 6, bArr4);
                        int i58 = (i53 & 255) >> 4;
                        it = it;
                        int[] iArr5 = new int[i58];
                        bitSet2 = bitSet8;
                        if (i58 == 1) {
                            iArr5[0] = i54 & 15;
                        } else {
                            if (i58 != 2) {
                                if (i58 != 3) {
                                    if (i58 != 4) {
                                        if (i58 == 5) {
                                            iArr5[4] = i53 & 15;
                                        }
                                    }
                                    iArr5[3] = (i57 >> 4) & 15;
                                }
                                iArr5[2] = i56 & 15;
                            }
                            iArr5[1] = (i55 >> 4) & 15;
                            iArr5[0] = i54 & 15;
                        }
                        c19776.m44940(enumC5044, iArr5, m26968(iM269614), m26969(iM269615));
                        i3 = iNextSetBit;
                        break;
                    case 16:
                        bitSet = bitSet7;
                        num = num3;
                        int i59 = bArr4[i22 + 1] & 255;
                        int iM269616 = m26965(i22 + 2, bArr4);
                        int iM269617 = m26965(i22 + 4, bArr4);
                        int iM269618 = m26965(i22 + 6, bArr4);
                        int[] iArr6 = new int[i59];
                        for (int i60 = 0; i60 < i59; i60++) {
                            iArr6[i60] = iM269617 + i60;
                        }
                        c19776.m44940(enumC5044, iArr6, m26968(iM269616), m26969(iM269618));
                        enumC5044Arr = enumC5044Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 17:
                        bitSet = bitSet7;
                        num = num3;
                        c19776.m44931(enumC5044, bArr4[i22 + 1] & 255, m26965(i22 + 2, bArr4));
                        enumC5044Arr = enumC5044Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 18:
                        bitSet = bitSet7;
                        num = num3;
                        c19776.m44944(enumC5044, bArr4[i22 + 1] & 255, bArr4[i22 + 2] & 255, bArr4[i22 + 3] & 255);
                        enumC5044Arr = enumC5044Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 19:
                        bitSet = bitSet7;
                        num = num3;
                        c19776.m44931(enumC5044, m26965(i22 + 2, bArr4), m26965(i22 + 4, bArr4));
                        enumC5044Arr = enumC5044Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 20:
                        bitSet = bitSet7;
                        num = num3;
                        int i61 = bArr4[i22 + 1];
                        c19776.m44936(enumC5044, i61 & 15, Integer.valueOf(i61 >> 4));
                        enumC5044Arr = enumC5044Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 21:
                        bitSet = bitSet7;
                        num = num3;
                        int i62 = bArr4[i22 + 1] & 255;
                        int iM26964 = m26960(i22 + 2, bArr4);
                        if (enumC5044 == EnumC5044.f11747) {
                            c19776.m44936(enumC5044, i62, Integer.valueOf(iM26964 << 16));
                        } else {
                            c19776.m44936(enumC5044, i62, Long.valueOf(((long) iM26964) << 48));
                        }
                        enumC5044Arr = enumC5044Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 22:
                        bitSet = bitSet7;
                        num = num3;
                        int i63 = bArr4[i22 + 1] & 255;
                        int iM269619 = m26960(i22 + 2, bArr4);
                        if (enumC5044 == EnumC5044.f11659) {
                            c19776.m44936(enumC5044, i63, Integer.valueOf(iM269619));
                        } else {
                            c19776.m44936(enumC5044, i63, Long.valueOf(iM269619));
                        }
                        enumC5044Arr = enumC5044Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 23:
                        bitSet = bitSet7;
                        num = num3;
                        c19776.m44932(enumC5044, bArr4[i22 + 1] & 255, bArr4[i22 + 2] & 255, bArr4[i22 + 3]);
                        enumC5044Arr = enumC5044Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 24:
                        bitSet = bitSet7;
                        num = num3;
                        int i64 = bArr4[i22 + 1];
                        c19776.m44932(enumC5044, i64 & 15, (i64 & 255) >> 4, m26960(i22 + 2, bArr4));
                        enumC5044Arr = enumC5044Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 25:
                        bitSet = bitSet7;
                        num = num3;
                        int i65 = bArr4[i22 + 1] & 255;
                        int iM26948 = m26945(i22 + 2, bArr4);
                        if (enumC5044 == EnumC5044.f11720) {
                            c19776.m44936(enumC5044, i65, Integer.valueOf(iM26948));
                        } else {
                            c19776.m44936(enumC5044, i65, Long.valueOf(iM26948));
                        }
                        enumC5044Arr = enumC5044Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 26:
                        bitSet = bitSet7;
                        num = num3;
                        c19776.m44936(enumC5044, bArr4[i22 + 1] & 255, Long.valueOf((((long) m26965(i22 + 4, bArr4)) << 16) | ((long) m26965(i22 + 2, bArr4)) | (((long) m26965(i22 + 6, bArr4)) << 32) | (((long) m26965(i22 + 8, bArr4)) << 48)));
                        enumC5044Arr = enumC5044Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                }
                BitSet bitSet9 = bitSet2;
                iNextSetBit = bitSet9.nextSetBit(i3 + 1);
                num3 = num;
                bitSet8 = bitSet9;
                bitSet7 = bitSet;
                enumC5044Arr2 = enumC5044Arr;
                it = it;
            }
            bitSet = bitSet7;
            num = num3;
            enumC5044Arr = enumC5044Arr2;
            i3 = iNextSetBit;
            bitSet2 = bitSet8;
            BitSet bitSet10 = bitSet2;
            iNextSetBit = bitSet10.nextSetBit(i3 + 1);
            num3 = num;
            bitSet8 = bitSet10;
            bitSet7 = bitSet;
            enumC5044Arr2 = enumC5044Arr;
            it = it;
        }
        Iterator it2 = it;
        while (num3 != null) {
            c19776.m44942((C13366) treeMap.get(num3));
            if (!it2.hasNext()) {
                return;
            } else {
                num3 = (Integer) it2.next();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C12025 m26951(int i) {
        ByteBuffer byteBuffer = this.f32832;
        byteBuffer.position(i * 4);
        int i2 = byteBuffer.getInt();
        ByteBuffer byteBuffer2 = this.f32815;
        byteBuffer2.position(i2);
        int iM26966 = m26966(byteBuffer2);
        Object[] objArr = new Object[iM26966];
        for (int i3 = 0; i3 < iM26966; i3++) {
            objArr[i3] = m26949(byteBuffer2);
        }
        Object[] objArrCopyOfRange = iM26966 > 3 ? Arrays.copyOfRange(objArr, 3, iM26966) : new Object[0];
        String.format("call_site_%d", Integer.valueOf(i));
        return new C12025((C4173) objArr[0], (String) objArr[1], (C12891) objArr[2], objArrCopyOfRange);
    }
}
