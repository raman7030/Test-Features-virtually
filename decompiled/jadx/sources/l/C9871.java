package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
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
public final class C9871 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29855;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f29856;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29857;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29858;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String[] f29859;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29860;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f29861;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29862;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29863;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29864;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29865;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29866;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f29867;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29868;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29869;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29870;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f29871;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f29872;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f29873;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29874;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29875;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29876;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f29877;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29879;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f29880;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29882;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29883;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C0225 f29878 = new C0225(C17615.f53826 * 3);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0225 f29881 = new C0225();

    public C9871(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        int i4;
        byteBuffer.position(0);
        ByteBuffer byteBufferOrder = byteBuffer.asReadOnlyBuffer().order(ByteOrder.BIG_ENDIAN);
        int i5 = byteBufferOrder.getInt() & (-256);
        if (i5 != 1684371456) {
            if (i5 == 1684371712) {
                throw new C5927("Odex unsupported.");
            }
            throw new C5927("Magic unsupported.");
        }
        int i6 = byteBufferOrder.getInt() >> 8;
        if (i6 < 3158837 || i6 > 3158848) {
            System.err.println("Unknown DEX version. Trying anyway...");
        }
        this.f29873 = i6;
        byteBufferOrder.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.position(byteBufferOrder.position() + 32);
        if (byteBufferOrder.getInt() != 305419896) {
            throw new C5927("Endian_tag unsupported");
        }
        byteBufferOrder.position(byteBufferOrder.position() + 8);
        int i7 = byteBufferOrder.getInt();
        int i8 = byteBufferOrder.getInt();
        this.f29861 = i8;
        int i9 = byteBufferOrder.getInt();
        this.f29867 = byteBufferOrder.getInt();
        int i10 = byteBufferOrder.getInt();
        this.f29872 = byteBufferOrder.getInt();
        int i11 = byteBufferOrder.getInt();
        this.f29877 = byteBufferOrder.getInt();
        int i12 = byteBufferOrder.getInt();
        this.f29856 = byteBufferOrder.getInt();
        int i13 = byteBufferOrder.getInt();
        this.f29880 = byteBufferOrder.getInt();
        int i14 = byteBufferOrder.getInt();
        this.f29859 = new String[i8];
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
        this.f29871 = i4;
        this.f29879 = m24935(byteBufferOrder, i9, this.f29861 * 4);
        this.f29870 = m24935(byteBufferOrder, i10, this.f29867 * 4);
        this.f29864 = m24935(byteBufferOrder, i11, this.f29872 * 12);
        this.f29860 = m24935(byteBufferOrder, i12, this.f29877 * 8);
        this.f29855 = m24935(byteBufferOrder, i13, this.f29856 * 8);
        this.f29863 = m24935(byteBufferOrder, i14, this.f29880 * 32);
        this.f29875 = m24935(byteBufferOrder, i3, i4 * 4);
        this.f29862 = m24935(byteBufferOrder, i, i2 * 8);
        byteBufferOrder.position(0);
        ByteBuffer byteBufferDuplicate = byteBufferOrder.duplicate();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f29876 = byteBufferDuplicate.order(byteOrder);
        this.f29868 = byteBufferOrder.duplicate().order(byteOrder);
        this.f29857 = byteBufferOrder.duplicate().order(byteOrder);
        this.f29874 = byteBufferOrder.duplicate().order(byteOrder);
        this.f29883 = byteBufferOrder.duplicate().order(byteOrder);
        this.f29866 = byteBufferOrder.duplicate().order(byteOrder);
        this.f29882 = byteBufferOrder.duplicate().order(byteOrder);
        this.f29858 = byteBufferOrder.duplicate().order(byteOrder);
        this.f29869 = byteBufferOrder.duplicate().order(byteOrder);
        this.f29865 = byteBufferOrder.duplicate().order(byteOrder);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m24935(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.position(i);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(i2);
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferSlice;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24938(int i, Throwable th) {
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
        if (th instanceof C5927) {
            sb.append(th.getMessage());
            System.err.println(sb);
            if (th.getCause() != null) {
                m24938(i2, th.getCause());
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m24947(ByteBuffer byteBuffer, int i) {
        int i2 = ((i >> 5) & 7) + 1;
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= ((long) (byteBuffer.get() & 255)) << (i3 * 8);
        }
        int i4 = (8 - i2) * 8;
        return (j << i4) >> i4;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static long m24952(ByteBuffer byteBuffer, int i) {
        int i2 = ((i >> 5) & 7) + 1;
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= ((long) (byteBuffer.get() & 255)) << (i3 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m24933(ByteBuffer byteBuffer, int i) {
        int i2 = ((i >> 5) & 7) + 1;
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= ((long) (byteBuffer.get() & 255)) << (i3 * 8);
        }
        return j << ((int) (((long) (8 - i2)) * 8));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m24945(int i, byte[] bArr) {
        return (bArr[i] & 255) | (bArr[i + 1] << 8);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m24950(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m24930(int i, byte[] bArr) {
        return (bArr[i] & 255) | (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24940(String str, Object... objArr) {
        System.err.printf(str.concat("%n"), objArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24941(TreeMap treeMap, int i) {
        if (treeMap.containsKey(Integer.valueOf(i))) {
            return;
        }
        treeMap.put(Integer.valueOf(i), new C11572(i));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m24951(ByteBuffer byteBuffer) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m24946(ByteBuffer byteBuffer) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24937(int i, int i2, boolean z, C7338 c7338, TreeMap treeMap, C3816 c3816) {
        ByteBuffer byteBuffer = this.f29865;
        byteBuffer.position(i);
        int iM24951 = m24951(byteBuffer);
        int iM24952 = m24951(byteBuffer);
        C7048[] c7048Arr = new C7048[i2];
        int i3 = 0;
        for (String str : c7338.m19704()) {
            i3 = (str.equals("J") || str.equals("D")) ? i3 + 2 : i3 + 1;
        }
        int i4 = i2 - i3;
        if (!z) {
            c7048Arr[i4 - 1] = new C7048();
        }
        String[] strArrM19704 = c7338.m19704();
        for (int i5 = 0; i5 < iM24952; i5++) {
            String str2 = strArrM19704[i5];
            String strM24949 = m24949(m24951(byteBuffer) - 1);
            c7048Arr[i4] = new C7048();
            if (strM24949 != null) {
                c3816.mo11503(i5, strM24949);
            }
            i4 = (str2.equals("J") || str2.equals("D")) ? i4 + 2 : i4 + 1;
        }
        int iM24953 = 0;
        while (true) {
            int i6 = iM24951;
            while (true) {
                int i7 = byteBuffer.get() & 255;
                switch (i7) {
                    case 0:
                        return;
                    case 1:
                        iM24953 = m24951(byteBuffer) + iM24953;
                        break;
                    case 2:
                        break;
                    case 3:
                        int iM24954 = m24951(byteBuffer);
                        int iM24955 = m24951(byteBuffer) - 1;
                        int iM24956 = m24951(byteBuffer) - 1;
                        String strM249410 = m24949(iM24955);
                        String strM24957 = m24957(iM24956);
                        c7048Arr[iM24954] = new C7048();
                        m24941(treeMap, iM24953);
                        c3816.mo11505(iM24954, (C11572) treeMap.get(Integer.valueOf(iM24953)), strM249410, strM24957, null);
                        break;
                    case 4:
                        int iM24957 = m24951(byteBuffer);
                        int iM24958 = m24951(byteBuffer) - 1;
                        int iM24959 = m24951(byteBuffer) - 1;
                        int iM249510 = m24951(byteBuffer) - 1;
                        String strM249411 = m24949(iM24958);
                        String strM24958 = m24957(iM24959);
                        String strM249412 = m24949(iM249510);
                        C7048 c7048 = new C7048();
                        m24941(treeMap, iM24953);
                        c3816.mo11505(iM24957, (C11572) treeMap.get(Integer.valueOf(iM24953)), strM249411, strM24958, strM249412);
                        c7048Arr[iM24957] = c7048;
                        break;
                    case 5:
                        int iM249511 = m24951(byteBuffer);
                        if (c7048Arr[iM249511] == null) {
                            throw new RuntimeException(C19370.m44628(iM249511, "Encountered RESTART_LOCAL on new v"));
                        }
                        m24941(treeMap, iM24953);
                        c3816.mo11504(iM249511, (C11572) treeMap.get(Integer.valueOf(iM24953)));
                        break;
                        break;
                    case 6:
                        int iM249512 = m24951(byteBuffer);
                        if (c7048Arr[iM249512] == null) {
                            throw new RuntimeException(C19370.m44628(iM249512, "Encountered RESTART_LOCAL on new v"));
                        }
                        m24941(treeMap, iM24953);
                        c3816.mo11509(iM249512, (C11572) treeMap.get(Integer.valueOf(iM24953)));
                        break;
                        break;
                    case 7:
                        m24941(treeMap, iM24953);
                        c3816.mo11508((C11572) treeMap.get(Integer.valueOf(iM24953)));
                        break;
                    case 8:
                        m24941(treeMap, iM24953);
                        c3816.mo11506((C11572) treeMap.get(Integer.valueOf(iM24953)));
                        break;
                    case 9:
                        break;
                    default:
                        if (i7 < 10) {
                            throw new RuntimeException(C19370.m44628(i7, "Invalid extended opcode encountered "));
                        }
                        int i8 = i7 - 10;
                        int i9 = (i8 / 15) + iM24953;
                        int i10 = ((i8 % 15) - 4) + i6;
                        m24941(treeMap, i9);
                        c3816.mo11507(i10, (C11572) treeMap.get(Integer.valueOf(i9)));
                        i6 = i10;
                        iM24953 = i9;
                        break;
                        break;
                }
            }
            iM24951 = m24946(byteBuffer) + i6;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m24962() {
        return this.f29873;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24960(C19749 c19749, int i) {
        c19749.mo12699(this.f29873);
        int i2 = this.f29880;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBuffer = this.f29863;
            byteBuffer.position(i3 * 32);
            arrayList.add(new C21160(m24957(byteBuffer.getInt()), i3));
        }
        Collections.sort(arrayList);
        for (int i4 = 0; i4 < i2; i4++) {
            m24961(c19749, ((C21160) arrayList.get(i4)).f68217, i);
        }
        c19749.mo45453();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24961(C19749 c19749, int i, int i2) {
        ByteBuffer byteBuffer = this.f29863;
        byteBuffer.position(i * 32);
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        int i8 = byteBuffer.getInt();
        int i9 = byteBuffer.getInt();
        int i10 = byteBuffer.getInt();
        String strM24957 = m24957(i3);
        try {
            C16904 c16904Mo12698 = c19749.mo12698(strM24957, m24957(i5), m24944(i6), i4);
            if (c16904Mo12698 != null) {
                m24943(c16904Mo12698, i7, i8, i9, i10, i2);
            }
        } catch (Exception e) {
            C5927 c5927 = new C5927(e, "Error process class: [%d]%s", Integer.valueOf(i3), strM24957);
            if ((i2 & 32) != 0) {
                m24938(0, c5927);
                return;
            }
            throw c5927;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m24934(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        int i = b & 255;
        boolean z = b & bo.j;
        if (z == 0) {
            return Byte.valueOf((byte) m24947(byteBuffer, i));
        }
        if (z == 6) {
            return Long.valueOf(m24947(byteBuffer, i));
        }
        if (z == 2) {
            return Short.valueOf((short) m24947(byteBuffer, i));
        }
        if (z == 3) {
            return Character.valueOf((char) m24952(byteBuffer, i));
        }
        if (z == 4) {
            return Integer.valueOf((int) m24947(byteBuffer, i));
        }
        if (z == 16) {
            return Float.valueOf(Float.intBitsToFloat((int) (m24933(byteBuffer, i) >> 32)));
        }
        if (z == 17) {
            return Double.valueOf(Double.longBitsToDouble(m24933(byteBuffer, i)));
        }
        switch (z ? 1 : 0) {
            case 21:
                return m24954((int) m24952(byteBuffer, i));
            case 22:
                return m24955((int) m24952(byteBuffer, i));
            case 23:
                return m24949((int) m24952(byteBuffer, i));
            case 24:
                return new C22860(m24957((int) m24952(byteBuffer, i)));
            case 25:
                return m24948((int) m24952(byteBuffer, i));
            case 26:
                return m24953((int) m24952(byteBuffer, i));
            case 27:
                return m24948((int) m24952(byteBuffer, i));
            case 28:
                int iM24951 = m24951(byteBuffer);
                Object[] objArr = new Object[iM24951];
                for (int i2 = 0; i2 < iM24951; i2++) {
                    objArr[i2] = m24934(byteBuffer);
                }
                return objArr;
            case 29:
                return m24956(byteBuffer);
            case 30:
                return null;
            case 31:
                return Boolean.valueOf(((i >> 5) & 3) != 0);
            default:
                throw new C5927("Not support yet.");
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C1899 m24955(int i) {
        ByteBuffer byteBuffer = this.f29862;
        byteBuffer.position(i * 8);
        int i2 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        byteBuffer.getShort();
        int i3 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
                return new C1899(i2, m24948(i3));
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new C1899(i2, m24953(i3));
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24943(C16904 c16904, int i, int i2, int i3, int i4, int i5) {
        Map map;
        Map map2;
        Map map3;
        Object[] objArr;
        if ((i5 & 1) == 0 && i != -1) {
            c16904.f51961 = m24949(i);
        }
        int i6 = i5 & 8;
        C0225 c0225 = this.f29878;
        if (i6 == 0) {
            map = (Map) c0225.m1479();
            map2 = (Map) c0225.m1479();
            map3 = (Map) c0225.m1479();
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
                ByteBuffer byteBuffer = this.f29876;
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
                        m24939(i7, c16904);
                    } catch (Exception e) {
                        throw new C5927("error on reading Annotation of class ", e);
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
            ByteBuffer byteBuffer2 = this.f29883;
            byteBuffer2.position(i3);
            int iM24951 = m24951(byteBuffer2);
            int iM24952 = m24951(byteBuffer2);
            int iM24953 = m24951(byteBuffer2);
            int iM24954 = m24951(byteBuffer2);
            if ((i5 & 16) != 0 || i4 == 0) {
                objArr = null;
            } else {
                ByteBuffer byteBuffer3 = this.f29858;
                byteBuffer3.position(i4);
                int iM24955 = m24951(byteBuffer3);
                objArr = new Object[iM24955];
                for (int i14 = 0; i14 < iM24955; i14++) {
                    objArr[i14] = m24934(byteBuffer3);
                }
            }
            Object[] objArr2 = objArr;
            int iM24931 = 0;
            int i15 = 0;
            while (i15 < iM24951) {
                iM24931 = m24931(byteBuffer2, iM24931, c16904, map4, (objArr2 == null || i15 >= objArr2.length) ? null : objArr2[i15], i5);
                i15++;
                iM24954 = iM24954;
                iM24953 = iM24953;
                objArr2 = objArr2;
            }
            int i16 = iM24954;
            int i17 = iM24953;
            int iM24932 = 0;
            for (int i18 = 0; i18 < iM24952; i18++) {
                iM24932 = m24931(byteBuffer2, iM24932, c16904, map4, (Object) null, i5);
            }
            int iM24933 = 0;
            boolean z = true;
            int i19 = 0;
            while (i19 < i17) {
                iM24933 = m24932(byteBuffer2, iM24933, c16904, map5, map6, i5, z);
                i19++;
                z = false;
            }
            int iM24934 = 0;
            boolean z2 = true;
            int i20 = 0;
            while (i20 < i16) {
                iM24934 = m24932(byteBuffer2, iM24934, c16904, map5, map6, i5, z2);
                i20++;
                z2 = false;
            }
        }
        if (map4 != null) {
            map4.clear();
            c0225.m1477(map4);
        }
        if (map5 != null) {
            map5.clear();
            c0225.m1477(map5);
        }
        if (map6 != null) {
            map6.clear();
            c0225.m1477(map6);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24939(int i, InterfaceC19043 interfaceC19043) {
        ByteBuffer byteBuffer = this.f29868;
        byteBuffer.position(i);
        int i2 = byteBuffer.getInt();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = byteBuffer.getInt();
            ByteBuffer byteBuffer2 = this.f29857;
            byteBuffer2.position(i4);
            int i5 = byteBuffer2.get() & 255;
            C11261 c11261M24956 = m24956(byteBuffer2);
            EnumC16715 enumC16715 = EnumC16715.values()[i5];
            c11261M24956.f33753 = enumC16715;
            C11261 c11261Mo8631 = interfaceC19043.mo8631(c11261M24956.f33752, enumC16715);
            for (C2088 c2088 : c11261M24956.f33751) {
                C11261.m27874(c11261Mo8631, c2088.f6964, c2088.f6965);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C11261 m24956(ByteBuffer byteBuffer) {
        int iM24951 = m24951(byteBuffer);
        int iM24952 = m24951(byteBuffer);
        C11261 c11261 = new C11261(m24957(iM24951), EnumC16715.RUNTIME);
        for (int i = 0; i < iM24952; i++) {
            c11261.f33751.add(new C2088(m24949(m24951(byteBuffer)), m24934(byteBuffer)));
        }
        return c11261;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C13687 m24948(int i) {
        ByteBuffer byteBuffer = this.f29860;
        byteBuffer.position(i * 8);
        int i2 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        int i3 = 65535 & byteBuffer.getShort();
        return new C13687(m24957(i2), m24949(byteBuffer.getInt()), m24957(i3));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private String[] m24944(int i) {
        if (i == 0) {
            return new String[0];
        }
        ByteBuffer byteBuffer = this.f29869;
        byteBuffer.position(i);
        int i2 = byteBuffer.getInt();
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = m24957(65535 & byteBuffer.getShort());
        }
        return strArr;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C11072 m24954(int i) {
        ByteBuffer byteBuffer = this.f29864;
        byteBuffer.position((i * 12) + 4);
        return new C11072(m24957(byteBuffer.getInt()), m24944(byteBuffer.getInt()));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C7338 m24953(int i) {
        ByteBuffer byteBuffer = this.f29855;
        byteBuffer.position(i * 8);
        int i2 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        int i3 = 65535 & byteBuffer.getShort();
        return new C7338(m24957(i2), m24949(byteBuffer.getInt()), m24954(i3));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private String m24949(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.f29859;
        if (i >= strArr.length) {
            return null;
        }
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        C0225 c0225 = this.f29881;
        int i2 = this.f29879.getInt(i * 4);
        ByteBuffer byteBuffer = this.f29882;
        byteBuffer.position(i2);
        int iM24951 = m24951(byteBuffer);
        try {
            StringBuilder sb = (StringBuilder) c0225.m1479();
            if (sb == null) {
                sb = new StringBuilder((int) (((double) iM24951) * 1.5d));
            }
            String strM12728 = C4226.m12728(byteBuffer, sb);
            if (sb.length() < 100) {
                sb.setLength(0);
                c0225.m1477(sb);
            }
            strArr[i] = strM12728;
            return strM12728;
        } catch (UTFDataFormatException e) {
            throw new C5927(e, "fail to load string %d@%08x", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private String m24957(int i) {
        if (i == -1) {
            return null;
        }
        return m24949(this.f29870.getInt(i * 4));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24931(ByteBuffer byteBuffer, int i, C16904 c16904, Map map, Object obj, int i2) {
        Integer num;
        int iM24951 = m24951(byteBuffer);
        int iM24952 = m24951(byteBuffer);
        int i3 = i + iM24951;
        C13687 c13687M24948 = m24948(i3);
        if (c16904.f51959 == null) {
            c16904.f51959 = new ArrayList();
        }
        C2794 c2794 = new C2794();
        c2794.f8714 = iM24952;
        c2794.f8712 = c13687M24948;
        c2794.f8713 = obj;
        c16904.f51959.add(c2794);
        if ((i2 & 8) != 0 || (num = (Integer) map.get(Integer.valueOf(i3))) == null) {
            return i3;
        }
        try {
            m24939(num.intValue(), c2794);
            return i3;
        } catch (Exception e) {
            throw new C5927(e, "while accept annotation in field:%s.", c13687M24948.toString());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24932(ByteBuffer byteBuffer, int i, C16904 c16904, Map map, Map map2, int i2, boolean z) {
        InterfaceC19043 interfaceC19043M45439;
        int iPosition = byteBuffer.position();
        int iM24951 = m24951(byteBuffer);
        int iM24952 = m24951(byteBuffer);
        int iM24953 = m24951(byteBuffer);
        int i3 = i + iM24951;
        C7338 c7338M24953 = m24953(i3);
        if (!z && iM24951 == 0) {
            m24940("GLITCH: duplicated method %s @%08x", c7338M24953.toString(), Integer.valueOf(iPosition));
            if ((i2 & 64) == 0) {
                m24940("WARN: skip method %s @%08x", c7338M24953.toString(), Integer.valueOf(iPosition));
                return i3;
            }
        }
        if ((65536 & iM24952) == 0 && (c7338M24953.m19700().equals("<init>") || c7338M24953.m19700().equals("<clinit>"))) {
            m24940("GLITCH: method %s @%08x not marked as ACC_CONSTRUCTOR", c7338M24953.toString(), Integer.valueOf(iPosition));
        }
        try {
            if (c16904.f51962 == null) {
                c16904.f51962 = new ArrayList();
            }
            C19728 c19728 = new C19728();
            c19728.f63749 = iM24952;
            c19728.f63747 = c7338M24953;
            c16904.f51962.add(c19728);
            if ((i2 & 8) == 0) {
                Integer num = (Integer) map.get(Integer.valueOf(i3));
                if (num != null) {
                    try {
                        m24939(num.intValue(), c19728);
                    } catch (Exception e) {
                        throw new C5927(e, "while accept annotation in method:%s.", c7338M24953.toString());
                    }
                }
                Integer num2 = (Integer) map2.get(Integer.valueOf(i3));
                if (num2 != null) {
                    try {
                        int iIntValue = num2.intValue();
                        ByteBuffer byteBuffer2 = this.f29874;
                        byteBuffer2.position(iIntValue);
                        int i4 = byteBuffer2.getInt();
                        for (int i5 = 0; i5 < i4; i5++) {
                            int i6 = byteBuffer2.getInt();
                            if (i6 != 0 && (interfaceC19043M45439 = c19728.m45439(i5)) != null) {
                                try {
                                    m24939(i6, interfaceC19043M45439);
                                } catch (Exception e2) {
                                    throw new C5927(e2, "While accepting parameter annotation in parameter: [%d]", Integer.valueOf(i5));
                                }
                            }
                        }
                    } catch (Exception e3) {
                        throw new C5927(e3, "while accept parameter annotation in method:%s.", c7338M24953.toString());
                    }
                }
            }
            if (iM24953 == 0 || ((i2 & 4) != 0 && ((i2 & 128) == 0 || !c7338M24953.m19700().equals("<clinit>")))) {
                return i3;
            }
            C18316 c18316 = new C18316();
            c18316.f56946 = new ArrayList();
            c18316.f56948 = null;
            c18316.f56947 = -1;
            c19728.f63748 = c18316;
            try {
                m24959(iM24953, c18316, i2, (iM24952 & 8) != 0, c7338M24953);
                return i3;
            } catch (Exception e4) {
                throw new C5927(e4, "while accept code in method:[%s] @%08x", c7338M24953.toString(), Integer.valueOf(iM24953));
            }
        } catch (Exception e5) {
            throw new C5927(e5, "while accept method:[%s]", c7338M24953.toString());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m24958() {
        return this.f29880;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x0220 A[PHI: r1
      0x0220: PHI (r1v46 int) = (r1v34 int), (r1v38 int), (r1v40 int), (r1v42 int), (r1v44 int), (r1v48 int) binds: [B:108:0x021e, B:100:0x0204, B:97:0x01f9, B:94:0x01f0, B:91:0x01e5, B:88:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x0222 A[PHI: r1
      0x0222: PHI (r1v45 int) = (r1v34 int), (r1v34 int), (r1v38 int), (r1v40 int), (r1v42 int), (r1v44 int), (r1v48 int), (r1v48 int) binds: [B:106:0x021a, B:108:0x021e, B:100:0x0204, B:97:0x01f9, B:94:0x01f0, B:91:0x01e5, B:86:0x01d6, B:88:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24942(TreeMap treeMap, LinkedList linkedList, byte[] bArr, int i) {
        boolean z;
        char c;
        int iM24950;
        boolean z2;
        int i2 = i * 2;
        if (i2 >= bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = bArr[i2] & 255;
        EnumC2815 enumC2815 = EnumC2815.f8986[i3];
        if (enumC2815 == null || enumC2815.f9027 == null) {
            throw new C23981("zero-width instruction op=0x%02x", Integer.valueOf(i3));
        }
        if (enumC2815.m8698()) {
            switch (C14808.f45201[enumC2815.f9027.ordinal()]) {
                case 1:
                    int i4 = i + bArr[i2 + 1];
                    if (i4 < 0 || i4 * 2 > bArr.length) {
                        throw new C23981("jump out of insns %s -> %04x", enumC2815, Integer.valueOf(i4));
                    }
                    linkedList.add(Integer.valueOf(i4));
                    m24941(treeMap, i4);
                    z = true;
                    break;
                    break;
                case 2:
                case 3:
                    int iM24945 = i + m24945(i2 + 2, bArr);
                    if (iM24945 < 0 || iM24945 * 2 > bArr.length) {
                        throw new C23981("jump out of insns %s -> %04x", enumC2815, Integer.valueOf(iM24945));
                    }
                    linkedList.add(Integer.valueOf(iM24945));
                    m24941(treeMap, iM24945);
                    z = true;
                    break;
                    break;
                case 4:
                    int iM24946 = i + m24945(i2 + 2, bArr);
                    byte b = bArr[i2 + 1];
                    if ((b & 15) == (((b & 255) >> 4) & 15)) {
                        switch (C14808.f45203[enumC2815.ordinal()]) {
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
                        if (iM24946 < 0 || iM24946 * 2 > bArr.length) {
                            throw new C23981("jump out of insns %s -> %04x", enumC2815, Integer.valueOf(iM24946));
                        }
                        linkedList.add(Integer.valueOf(iM24946));
                        m24941(treeMap, iM24946);
                    }
                    break;
                case 5:
                case 6:
                    int iM24930 = i + m24930(i2 + 2, bArr);
                    if (iM24930 < 0 || iM24930 * 2 > bArr.length) {
                        throw new C23981("jump out of insns %s -> %04x", enumC2815, Integer.valueOf(iM24930));
                    }
                    linkedList.add(Integer.valueOf(iM24930));
                    m24941(treeMap, iM24930);
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
        if (enumC2815.m8702()) {
            m24941(treeMap, i + enumC2815.f9027.f27771);
            int iM24931 = (i + m24930(i2 + 2, bArr)) * 2;
            int i5 = iM24931 + 2;
            if (i5 < bArr.length) {
                byte b2 = bArr[iM24931 + 1];
                if (b2 == 1) {
                    c = 0;
                    int iM24951 = m24950(i5, bArr);
                    int i6 = iM24931 + 8;
                    for (int i7 = 0; i7 < iM24951; i7++) {
                        int iM24932 = i + m24930((i7 * 4) + i6, bArr);
                        if (iM24932 < 0 || iM24932 * 2 > bArr.length) {
                            throw new C23981("jump out of insns %s -> %04x", enumC2815, Integer.valueOf(iM24932));
                        }
                        linkedList.add(Integer.valueOf(iM24932));
                        m24941(treeMap, iM24932);
                    }
                } else if (b2 == 2) {
                    int iM24952 = m24950(i5, bArr);
                    int i8 = (iM24952 * 4) + iM24931 + 4;
                    for (int i9 = 0; i9 < iM24952; i9++) {
                        int iM24933 = i + m24930((i9 * 4) + i8, bArr);
                        if (iM24933 < 0 || iM24933 * 2 > bArr.length) {
                            throw new C23981("jump out of insns %s -> %04x", enumC2815, Integer.valueOf(iM24933));
                        }
                        linkedList.add(Integer.valueOf(iM24933));
                        m24941(treeMap, iM24933);
                    }
                    c = 0;
                } else {
                    throw new C23981("bad payload for %s", enumC2815);
                }
            } else {
                throw new C23981("bad payload offset for %s", enumC2815);
            }
        } else {
            c = 0;
        }
        if (z) {
            int i10 = C14808.f45202[enumC2815.f9026.ordinal()];
            int i11 = this.f29856;
            switch (i10) {
                case 1:
                    if (enumC2815.f9027 == EnumC9165.kFmt31c) {
                        iM24950 = m24930(i2 + 2, bArr);
                    } else {
                        iM24950 = m24950(i2 + 2, bArr);
                    }
                    if (iM24950 < 0 || iM24950 >= this.f29861) {
                        z = false;
                    } else {
                        z = true;
                    }
                    break;
                case 2:
                    iM24950 = m24950(i2 + 2, bArr);
                    if (iM24950 < this.f29867) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 3:
                    iM24950 = m24950(i2 + 2, bArr);
                    if (iM24950 < i11) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 4:
                    iM24950 = m24950(i2 + 2, bArr);
                    if (iM24950 < this.f29877) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 5:
                    iM24950 = m24950(i2 + 2, bArr);
                    if (iM24950 < this.f29871) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 6:
                    iM24950 = m24950(i2 + 2, bArr);
                    int iM24953 = m24950(i2 + 6, bArr);
                    if (iM24950 >= i11 || iM24953 >= this.f29872) {
                        z = false;
                    } else {
                        z = true;
                    }
                    break;
                default:
                    iM24950 = Integer.MAX_VALUE;
                    break;
            }
            if (!z) {
                Integer numValueOf = Integer.valueOf(iM24950);
                Object[] objArr = new Object[2];
                objArr[c] = enumC2815;
                objArr[1] = numValueOf;
                throw new C23981("index-out-of-range for %s index: %d", objArr);
            }
        }
        if (z && enumC2815.m8699()) {
            EnumC2815 enumC2816 = EnumC2815.f8822;
            if (enumC2815 == enumC2816) {
                byte b3 = bArr[i2 + 1];
                if (b3 == 0) {
                    linkedList.add(Integer.valueOf(i + enumC2816.f9027.f27771));
                    return;
                }
                if (b3 == 1) {
                    linkedList.add(Integer.valueOf((m24950(i2 + 2, bArr) * 2) + i + 4));
                    return;
                } else if (b3 == 2) {
                    linkedList.add(Integer.valueOf((m24950(i2 + 2, bArr) * 4) + i + 2));
                    return;
                } else {
                    if (b3 != 3) {
                        return;
                    }
                    linkedList.add(Integer.valueOf((((m24930(i2 + 4, bArr) * m24950(i2 + 2, bArr)) + 1) / 2) + i + 4));
                    return;
                }
            }
            linkedList.add(Integer.valueOf(i + enumC2815.f9027.f27771));
        }
    }

    /* JADX WARN: Code duplicated, block: B:218:0x079a  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24959(int i, C18316 c18316, int i2, boolean z, C7338 c7338) {
        BitSet bitSet;
        Integer num;
        EnumC2815[] enumC2815Arr;
        int i3;
        BitSet bitSet2;
        boolean z2;
        int i4;
        int i5;
        int i6;
        BitSet bitSet3;
        ByteBuffer byteBuffer = this.f29866;
        byteBuffer.position(i);
        int i7 = byteBuffer.getShort() & 65535;
        byteBuffer.getShort();
        byteBuffer.getShort();
        int i8 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        int i9 = byteBuffer.getInt();
        int i10 = byteBuffer.getInt();
        byte[] bArr = new byte[i10 * 2];
        byteBuffer.get(bArr);
        c18316.f56947 = i7;
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
                        m24941(treeMap, i13);
                        int i16 = i13 + i14;
                        m24941(treeMap, i16);
                        byteBufferOrder.position(iPosition + i15);
                        int iM24946 = m24946(byteBufferOrder);
                        if (iM24946 <= 0) {
                            int i17 = -iM24946;
                            z2 = true;
                            int i18 = i10;
                            i5 = i17;
                            iM24946 = i17 + 1;
                            i4 = i18;
                        } else {
                            z2 = false;
                            i4 = i10;
                            i5 = iM24946;
                        }
                        C11572[] c11572Arr = new C11572[iM24946];
                        String[] strArr = new String[iM24946];
                        int i19 = 0;
                        while (i19 < i5) {
                            BitSet bitSet5 = bitSet4;
                            int iM24951 = m24951(byteBufferOrder);
                            int i20 = i7;
                            int iM24952 = m24951(byteBufferOrder);
                            m24941(treeMap, iM24952);
                            hashSet.add(Integer.valueOf(iM24952));
                            strArr[i19] = m24957(iM24951);
                            c11572Arr[i19] = (C11572) treeMap.get(Integer.valueOf(iM24952));
                            i19++;
                            bitSet4 = bitSet5;
                            i7 = i20;
                        }
                        i6 = i7;
                        bitSet3 = bitSet4;
                        if (z2) {
                            int iM24953 = m24951(byteBufferOrder);
                            m24941(treeMap, iM24953);
                            hashSet.add(Integer.valueOf(iM24953));
                            c11572Arr[i5] = (C11572) treeMap.get(Integer.valueOf(iM24953));
                        }
                        C11572 c11572 = (C11572) treeMap.get(Integer.valueOf(i13));
                        C11572 c11573 = (C11572) treeMap.get(Integer.valueOf(i16));
                        if (c18316.f56948 == null) {
                            c18316.f56948 = new ArrayList(3);
                        }
                        c18316.f56948.add(new C0676(c11572, c11573, c11572Arr, strArr));
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
            c18316.getClass();
            C16198 c16198 = new C16198();
            c16198.f49887 = new ArrayList();
            c18316.f56945 = c16198;
            try {
                m24937(i9, i21, z, c7338, treeMap, c16198);
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
                    m24942(treeMap, linkedList, bArr3, iIntValue);
                } catch (IndexOutOfBoundsException unused2) {
                    bitSet7.set(iIntValue);
                    m24940("GLITCH: %04x %s | not enough space for reading instruction", num2, c7338.toString());
                } catch (C23981 e) {
                    bitSet7.set(iIntValue);
                    m24940("GLITCH: %04x %s | %s", num2, c7338.toString(), e.getMessage());
                }
                bArr2 = bArr3;
            }
        }
        BitSet bitSet8 = bitSet6;
        byte[] bArr4 = bArr2;
        Iterator it = treeMap.keySet().iterator();
        Integer num3 = it.hasNext() ? (Integer) it.next() : null;
        EnumC2815[] enumC2815Arr2 = EnumC2815.f8986;
        int iNextSetBit = bitSet8.nextSetBit(0);
        while (iNextSetBit >= 0) {
            while (num3 != null && num3.intValue() <= iNextSetBit) {
                c18316.m42680((C11572) treeMap.get(num3));
                num3 = it.hasNext() ? (Integer) it.next() : null;
            }
            if (bitSet7.get(iNextSetBit)) {
                c18316.m42667(EnumC2815.f8825);
            } else {
                int i22 = iNextSetBit * 2;
                EnumC2815 enumC2815 = enumC2815Arr2[bArr4[i22] & 255];
                switch (C14808.f45201[enumC2815.f9027.ordinal()]) {
                    case 1:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC2815Arr = enumC2815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        c18316.m42672(enumC2815, -1, -1, (C11572) treeMap.get(Integer.valueOf(bArr4[i22 + 1] + i3)));
                        break;
                    case 2:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC2815Arr = enumC2815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        c18316.m42672(enumC2815, -1, -1, (C11572) treeMap.get(Integer.valueOf(m24945(i22 + 2, bArr4) + i3)));
                        break;
                    case 3:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC2815Arr = enumC2815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        c18316.m42672(enumC2815, bArr4[i22 + 1] & 255, -1, (C11572) treeMap.get(Integer.valueOf(m24945(i22 + 2, bArr4) + i3)));
                        break;
                    case 4:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC2815Arr = enumC2815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        int iM24945 = m24945(i22 + 2, bArr4) + i3;
                        int i23 = bArr4[i22 + 1];
                        int i24 = i23 & 255;
                        int i25 = i23 & 15;
                        int i26 = i24 >> 4;
                        if (i25 != i26) {
                            c18316.m42672(enumC2815, i25, i26, (C11572) treeMap.get(Integer.valueOf(iM24945)));
                            break;
                        } else {
                            switch (C14808.f45203[enumC2815.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                    c18316.m42672(EnumC2815.f8907, 0, 0, (C11572) treeMap.get(Integer.valueOf(iM24945)));
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                    break;
                                default:
                                    c18316.m42672(enumC2815, i25, i26, (C11572) treeMap.get(Integer.valueOf(iM24945)));
                                    break;
                            }
                        }
                        break;
                    case 5:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC2815Arr = enumC2815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        c18316.m42672(enumC2815, -1, -1, (C11572) treeMap.get(Integer.valueOf(m24930(i22 + 2, bArr4) + i3)));
                        break;
                    case 6:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC2815Arr = enumC2815Arr2;
                        bitSet2 = bitSet8;
                        int iM24930 = m24930(i22 + 2, bArr4) + iNextSetBit;
                        int i27 = bArr4[i22 + 1] & 255;
                        int i28 = iM24930 * 2;
                        if (enumC2815 == EnumC2815.f8920) {
                            int iM24950 = m24950(i28 + 2, bArr4);
                            int iM24931 = m24930(i28 + 4, bArr4);
                            if (iM24950 == 1) {
                                i3 = iNextSetBit;
                                Object obj = new byte[iM24931];
                                System.arraycopy(bArr4, i28 + 8, obj, 0, iM24931);
                                c18316.m42683(enumC2815, i27, obj);
                            } else if (iM24950 == 2) {
                                i3 = iNextSetBit;
                                short[] sArr = new short[iM24931];
                                for (int i29 = 0; i29 < iM24931; i29++) {
                                    sArr[i29] = (short) m24945((i29 * 2) + i28 + 8, bArr4);
                                }
                                c18316.m42683(enumC2815, i27, sArr);
                            } else if (iM24950 == 4) {
                                i3 = iNextSetBit;
                                int[] iArr = new int[iM24931];
                                for (int i30 = 0; i30 < iM24931; i30++) {
                                    iArr[i30] = m24930((i30 * 4) + i28 + 8, bArr4);
                                }
                                c18316.m42683(enumC2815, i27, iArr);
                            } else if (iM24950 != 8) {
                                i3 = iNextSetBit;
                            } else {
                                long[] jArr = new long[iM24931];
                                int i31 = 0;
                                while (i31 < iM24931) {
                                    int i32 = (i31 * 8) + i28 + 8;
                                    jArr[i31] = (((long) m24950(i32 + 2, bArr4)) << 16) | ((long) m24950(i32, bArr4)) | (((long) m24950(i32 + 4, bArr4)) << 32) | (((long) m24950(i32 + 6, bArr4)) << 48);
                                    i31++;
                                    iNextSetBit = iNextSetBit;
                                    iM24931 = iM24931;
                                }
                                i3 = iNextSetBit;
                                c18316.m42683(enumC2815, i27, jArr);
                            }
                        } else {
                            i3 = iNextSetBit;
                            if (enumC2815 == EnumC2815.f9002) {
                                int iM24947 = m24945(i28 + 2, bArr4);
                                int[] iArr2 = new int[iM24947];
                                C11572[] c11572Arr2 = new C11572[iM24947];
                                int i33 = i28 + 4;
                                for (int i34 = 0; i34 < iM24947; i34++) {
                                    iArr2[i34] = m24930((i34 * 4) + i33, bArr4);
                                }
                                int i35 = (iM24947 * 4) + i33;
                                for (int i36 = 0; i36 < iM24947; i36++) {
                                    c11572Arr2[i36] = (C11572) treeMap.get(Integer.valueOf(m24930((i36 * 4) + i35, bArr4) + i3));
                                }
                                c18316.m42675(enumC2815, i27, iArr2, c11572Arr2);
                            } else {
                                int iM24948 = m24945(i28 + 2, bArr4);
                                int iM24932 = m24930(i28 + 4, bArr4);
                                C11572[] c11572Arr3 = new C11572[iM24948];
                                int i37 = i28 + 8;
                                for (int i38 = 0; i38 < iM24948; i38++) {
                                    c11572Arr3[i38] = (C11572) treeMap.get(Integer.valueOf(m24930(i37, bArr4) + i3));
                                    i37 += 4;
                                }
                                c18316.m42673(enumC2815, i27, iM24932, c11572Arr3);
                            }
                        }
                        break;
                    case 7:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC2815Arr = enumC2815Arr2;
                        bitSet2 = bitSet8;
                        c18316.m42667(enumC2815);
                        i3 = iNextSetBit;
                        break;
                    case 8:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC2815Arr = enumC2815Arr2;
                        bitSet2 = bitSet8;
                        c18316.m42668(enumC2815, bArr4[i22 + 1] & 255);
                        i3 = iNextSetBit;
                        break;
                    case 9:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC2815Arr = enumC2815Arr2;
                        bitSet2 = bitSet8;
                        int i39 = bArr4[i22 + 1];
                        c18316.m42669(enumC2815, i39 & 15, (i39 & 255) >> 4);
                        i3 = iNextSetBit;
                        break;
                    case 10:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC2815Arr = enumC2815Arr2;
                        bitSet2 = bitSet8;
                        int i40 = bArr4[i22 + 1] & 255;
                        int iM24954 = m24950(i22 + 2, bArr4);
                        int i41 = C14808.f45202[enumC2815.f9026.ordinal()];
                        if (i41 == 1) {
                            c18316.m42674(enumC2815, i40, m24949(iM24954));
                        } else if (i41 != 2) {
                            if (i41 == 4) {
                                c18316.mo29645(enumC2815, i40, -1, m24948(iM24954));
                            } else if (i41 == 7) {
                                c18316.m42674(enumC2815, i40, m24955(iM24954));
                            } else if (i41 == 8) {
                                c18316.m42674(enumC2815, i40, m24954(iM24954));
                            }
                        } else if (enumC2815 == EnumC2815.f8899) {
                            c18316.m42674(enumC2815, i40, new C22860(m24957(iM24954)));
                        } else {
                            c18316.m42671(enumC2815, i40, -1, m24957(iM24954));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 11:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC2815Arr = enumC2815Arr2;
                        bitSet2 = bitSet8;
                        int i42 = bArr4[i22 + 1];
                        int i43 = i42 & 255;
                        int iM24955 = m24950(i22 + 2, bArr4);
                        int i44 = C14808.f45202[enumC2815.f9026.ordinal()];
                        if (i44 == 2) {
                            c18316.m42671(enumC2815, i42 & 15, i43 >> 4, m24957(iM24955));
                        } else if (i44 == 4) {
                            c18316.mo29645(enumC2815, i42 & 15, i43 >> 4, m24948(iM24955));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 12:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC2815Arr = enumC2815Arr2;
                        bitSet2 = bitSet8;
                        if (enumC2815.f9026 == EnumC16219.kIndexStringRef) {
                            c18316.m42674(enumC2815, bArr4[i22 + 1] & 255, m24949(m24930(i22 + 2, bArr4)));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 13:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC2815Arr = enumC2815Arr2;
                        bitSet2 = bitSet8;
                        int i45 = bArr4[i22 + 1];
                        int iM24956 = m24950(i22 + 2, bArr4);
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
                        EnumC16219 enumC16219 = enumC2815.f9026;
                        if (enumC16219 == EnumC16219.kIndexTypeRef) {
                            c18316.m42676(enumC2815, iArr3, m24957(iM24956));
                        } else if (enumC16219 == EnumC16219.kIndexCallSiteRef) {
                            c18316.m42679(enumC2815, iArr3, m24936(iM24956));
                        } else {
                            c18316.m42677(enumC2815, iArr3, m24953(iM24956));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 14:
                        it = it;
                        bitSet = bitSet7;
                        num = num3;
                        enumC2815Arr = enumC2815Arr2;
                        bitSet2 = bitSet8;
                        int i51 = bArr4[i22 + 1] & 255;
                        int iM24957 = m24950(i22 + 2, bArr4);
                        int iM24958 = m24950(i22 + 4, bArr4);
                        int[] iArr4 = new int[i51];
                        for (int i52 = 0; i52 < i51; i52++) {
                            iArr4[i52] = iM24958 + i52;
                        }
                        EnumC16219 enumC162110 = enumC2815.f9026;
                        if (enumC162110 == EnumC16219.kIndexTypeRef) {
                            c18316.m42676(enumC2815, iArr4, m24957(iM24957));
                        } else if (enumC162110 == EnumC16219.kIndexCallSiteRef) {
                            c18316.m42679(enumC2815, iArr4, m24936(iM24957));
                        } else {
                            c18316.m42677(enumC2815, iArr4, m24953(iM24957));
                        }
                        i3 = iNextSetBit;
                        break;
                    case 15:
                        bitSet = bitSet7;
                        num = num3;
                        int i53 = bArr4[i22 + 1];
                        int iM24959 = m24950(i22 + 2, bArr4);
                        int i54 = bArr4[i22 + 4];
                        int i55 = i54 & 255;
                        int i56 = bArr4[i22 + 5];
                        enumC2815Arr = enumC2815Arr2;
                        int i57 = i56 & 255;
                        int iM249510 = m24950(i22 + 6, bArr4);
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
                        c18316.m42678(enumC2815, iArr5, m24953(iM24959), m24954(iM249510));
                        i3 = iNextSetBit;
                        break;
                    case 16:
                        bitSet = bitSet7;
                        num = num3;
                        int i59 = bArr4[i22 + 1] & 255;
                        int iM249511 = m24950(i22 + 2, bArr4);
                        int iM249512 = m24950(i22 + 4, bArr4);
                        int iM249513 = m24950(i22 + 6, bArr4);
                        int[] iArr6 = new int[i59];
                        for (int i60 = 0; i60 < i59; i60++) {
                            iArr6[i60] = iM249512 + i60;
                        }
                        c18316.m42678(enumC2815, iArr6, m24953(iM249511), m24954(iM249513));
                        enumC2815Arr = enumC2815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 17:
                        bitSet = bitSet7;
                        num = num3;
                        c18316.m42669(enumC2815, bArr4[i22 + 1] & 255, m24950(i22 + 2, bArr4));
                        enumC2815Arr = enumC2815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 18:
                        bitSet = bitSet7;
                        num = num3;
                        c18316.m42682(enumC2815, bArr4[i22 + 1] & 255, bArr4[i22 + 2] & 255, bArr4[i22 + 3] & 255);
                        enumC2815Arr = enumC2815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 19:
                        bitSet = bitSet7;
                        num = num3;
                        c18316.m42669(enumC2815, m24950(i22 + 2, bArr4), m24950(i22 + 4, bArr4));
                        enumC2815Arr = enumC2815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 20:
                        bitSet = bitSet7;
                        num = num3;
                        int i61 = bArr4[i22 + 1];
                        c18316.m42674(enumC2815, i61 & 15, Integer.valueOf(i61 >> 4));
                        enumC2815Arr = enumC2815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 21:
                        bitSet = bitSet7;
                        num = num3;
                        int i62 = bArr4[i22 + 1] & 255;
                        int iM24949 = m24945(i22 + 2, bArr4);
                        if (enumC2815 == EnumC2815.f8953) {
                            c18316.m42674(enumC2815, i62, Integer.valueOf(iM24949 << 16));
                        } else {
                            c18316.m42674(enumC2815, i62, Long.valueOf(((long) iM24949) << 48));
                        }
                        enumC2815Arr = enumC2815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 22:
                        bitSet = bitSet7;
                        num = num3;
                        int i63 = bArr4[i22 + 1] & 255;
                        int iM249410 = m24945(i22 + 2, bArr4);
                        if (enumC2815 == EnumC2815.f8865) {
                            c18316.m42674(enumC2815, i63, Integer.valueOf(iM249410));
                        } else {
                            c18316.m42674(enumC2815, i63, Long.valueOf(iM249410));
                        }
                        enumC2815Arr = enumC2815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 23:
                        bitSet = bitSet7;
                        num = num3;
                        c18316.m42670(enumC2815, bArr4[i22 + 1] & 255, bArr4[i22 + 2] & 255, bArr4[i22 + 3]);
                        enumC2815Arr = enumC2815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 24:
                        bitSet = bitSet7;
                        num = num3;
                        int i64 = bArr4[i22 + 1];
                        c18316.m42670(enumC2815, i64 & 15, (i64 & 255) >> 4, m24945(i22 + 2, bArr4));
                        enumC2815Arr = enumC2815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 25:
                        bitSet = bitSet7;
                        num = num3;
                        int i65 = bArr4[i22 + 1] & 255;
                        int iM24933 = m24930(i22 + 2, bArr4);
                        if (enumC2815 == EnumC2815.f8926) {
                            c18316.m42674(enumC2815, i65, Integer.valueOf(iM24933));
                        } else {
                            c18316.m42674(enumC2815, i65, Long.valueOf(iM24933));
                        }
                        enumC2815Arr = enumC2815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                    case 26:
                        bitSet = bitSet7;
                        num = num3;
                        c18316.m42674(enumC2815, bArr4[i22 + 1] & 255, Long.valueOf((((long) m24950(i22 + 4, bArr4)) << 16) | ((long) m24950(i22 + 2, bArr4)) | (((long) m24950(i22 + 6, bArr4)) << 32) | (((long) m24950(i22 + 8, bArr4)) << 48)));
                        enumC2815Arr = enumC2815Arr2;
                        i3 = iNextSetBit;
                        bitSet2 = bitSet8;
                        break;
                }
                BitSet bitSet9 = bitSet2;
                iNextSetBit = bitSet9.nextSetBit(i3 + 1);
                num3 = num;
                bitSet8 = bitSet9;
                bitSet7 = bitSet;
                enumC2815Arr2 = enumC2815Arr;
                it = it;
            }
            bitSet = bitSet7;
            num = num3;
            enumC2815Arr = enumC2815Arr2;
            i3 = iNextSetBit;
            bitSet2 = bitSet8;
            BitSet bitSet10 = bitSet2;
            iNextSetBit = bitSet10.nextSetBit(i3 + 1);
            num3 = num;
            bitSet8 = bitSet10;
            bitSet7 = bitSet;
            enumC2815Arr2 = enumC2815Arr;
            it = it;
        }
        Iterator it2 = it;
        while (num3 != null) {
            c18316.m42680((C11572) treeMap.get(num3));
            if (!it2.hasNext()) {
                return;
            } else {
                num3 = (Integer) it2.next();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C10161 m24936(int i) {
        ByteBuffer byteBuffer = this.f29875;
        byteBuffer.position(i * 4);
        int i2 = byteBuffer.getInt();
        ByteBuffer byteBuffer2 = this.f29858;
        byteBuffer2.position(i2);
        int iM24951 = m24951(byteBuffer2);
        Object[] objArr = new Object[iM24951];
        for (int i3 = 0; i3 < iM24951; i3++) {
            objArr[i3] = m24934(byteBuffer2);
        }
        Object[] objArrCopyOfRange = iM24951 > 3 ? Arrays.copyOfRange(objArr, 3, iM24951) : new Object[0];
        String.format("call_site_%d", Integer.valueOf(i));
        return new C10161((C1899) objArr[0], (String) objArr[1], (C11072) objArr[2], objArrCopyOfRange);
    }
}
