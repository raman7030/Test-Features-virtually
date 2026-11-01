package p067l;

import android.app.Application;
import android.content.res.Resources;
import com.alipay.sdk.p010m.p041p.C0184a;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗ᩵ */
/* JADX INFO: compiled from: 05OF */
/* JADX INFO: loaded from: classes.dex */
public class C1012 {

    /* JADX INFO: renamed from: ֫۠۟, reason: not valid java name and contains not printable characters */
    public static int f81938;

    /* JADX INFO: renamed from: ۗ */
    public static int f13649;

    /* JADX INFO: renamed from: ۙ */
    public static Object[] f13650;

    /* JADX INFO: renamed from: ۫ */
    public static int f13651;

    /* JADX INFO: renamed from: ۬ */
    public static Object[] f13652;

    /* JADX INFO: renamed from: ᩶ */
    public int f13653;

    /* JADX INFO: renamed from: ᩸ */
    public Object[] f13654;

    /* JADX INFO: renamed from: ᩹ */
    public int[] f13655;

    /* JADX INFO: renamed from: ֡֫ܶ, reason: not valid java name and contains not printable characters */
    public static void m56133(int i, int i2, Object obj) {
        C17548.m39930(i, i2, (byte[]) obj);
    }

    /* JADX INFO: renamed from: ֫ۖ᩻, reason: not valid java name and contains not printable characters */
    public static int m56134() {
        return 490417414;
    }

    /* JADX INFO: renamed from: ֫ۧܺ, reason: not valid java name and contains not printable characters */
    public static String m56135(Object obj, int i) {
        return ((String) obj).substring(i);
    }

    /* JADX INFO: renamed from: ۙ᩶ۨ, reason: not valid java name and contains not printable characters */
    public static Application m56136() {
        return C7050.m16232();
    }

    /* JADX INFO: renamed from: ۡᩴۙ, reason: not valid java name and contains not printable characters */
    public static int m56137(Object obj) {
        return ((ArrayList) obj).size();
    }

    /* JADX INFO: renamed from: ۢܰܰ, reason: not valid java name and contains not printable characters */
    public static long m56138(long j, long j2) {
        return Math.min(j, j2);
    }

    /* JADX INFO: renamed from: ۧ֡֫, reason: not valid java name and contains not printable characters */
    public static Iterator m56139(Object obj) {
        return ((Set) obj).iterator();
    }

    /* JADX INFO: renamed from: ۨᩴ۫, reason: not valid java name and contains not printable characters */
    public static void m56140(Object obj, Object obj2) {
        ((C12412) obj).append((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܳ֡ۜ, reason: not valid java name and contains not printable characters */
    public static Object m56141(Object obj, char c, Object obj2) {
        return ((InterfaceC14688) obj).mo15129(c, obj2);
    }

    /* JADX INFO: renamed from: ܳ᩺᩷, reason: not valid java name and contains not printable characters */
    public static Set m56142(Object obj) {
        return ((IdentityHashMap) obj).keySet();
    }

    /* JADX INFO: renamed from: ܶᩴ۬, reason: not valid java name and contains not printable characters */
    public static AbstractC17043 m56143(Object obj, Object obj2) {
        return C18524.m42109((String) obj, (String[]) obj2);
    }

    /* JADX INFO: renamed from: ܶ᩺᩹, reason: not valid java name and contains not printable characters */
    public static String m56144(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܿۚۗ, reason: not valid java name and contains not printable characters */
    public static boolean m56145(Object obj, Object obj2) {
        return ((Set) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ᩴ᩵ܰ, reason: not valid java name and contains not printable characters */
    public static void m56146(Object obj, int i) {
        ((C20671) obj).m46727(i);
    }

    /* JADX INFO: renamed from: ᩵ۨۘ, reason: not valid java name and contains not printable characters */
    public static Set m56147(Object obj) {
        return ((InterfaceC17213) obj).mo29500();
    }

    /* JADX INFO: renamed from: ᩺ᩴۗ, reason: not valid java name and contains not printable characters */
    public static int m56148(Object obj, int i) {
        return C22553.m50541((Resources.Theme) obj, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m12517(int i, Object obj) {
        int i2 = this.f13653;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM4842 = C0872.m4842(i2, i, this.f13655);
            if (iM4842 < 0 || obj.equals(this.f13654[iM4842 << 1])) {
                return iM4842;
            }
            int i3 = iM4842 + 1;
            while (i3 < i2 && this.f13655[i3] == i) {
                if (obj.equals(this.f13654[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            do {
                iM4842--;
                if (iM4842 < 0 || this.f13655[iM4842] != i) {
                    return ~i3;
                }
            } while (!obj.equals(this.f13654[iM4842 << 1]));
            return iM4842;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m12516() {
        int i = this.f13653;
        if (i == 0) {
            return -1;
        }
        try {
            int iM4842 = C0872.m4842(i, 0, this.f13655);
            if (iM4842 < 0 || this.f13654[iM4842 << 1] == null) {
                return iM4842;
            }
            int i2 = iM4842 + 1;
            while (i2 < i && this.f13655[i2] == 0) {
                if (this.f13654[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            do {
                iM4842--;
                if (iM4842 < 0 || this.f13655[iM4842] != 0) {
                    return ~i2;
                }
            } while (this.f13654[iM4842 << 1] != null);
            return iM4842;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private void m12515(int i) {
        if (i == 8) {
            synchronized (C1012.class) {
                Object[] objArr = f13652;
                if (objArr != null) {
                    this.f13654 = objArr;
                    f13652 = (Object[]) objArr[0];
                    this.f13655 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f13651--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C1012.class) {
                Object[] objArr2 = f13650;
                if (objArr2 != null) {
                    this.f13654 = objArr2;
                    f13650 = (Object[]) objArr2[0];
                    this.f13655 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f13649--;
                    return;
                }
            }
        }
        this.f13655 = new int[i];
        this.f13654 = new Object[i << 1];
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12514(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1012.class) {
                if (f13651 < 10) {
                    objArr[0] = f13652;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f13652 = objArr;
                    f13651++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1012.class) {
                if (f13649 < 10) {
                    objArr[0] = f13650;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f13650 = objArr;
                    f13649++;
                }
            }
        }
    }

    public C1012() {
        this.f13655 = C0872.f5138;
        this.f13654 = C0872.f5139;
        this.f13653 = 0;
    }

    public C1012(int i) {
        if (i == 0) {
            this.f13655 = C0872.f5138;
            this.f13654 = C0872.f5139;
        } else {
            m12515(i);
        }
        this.f13653 = 0;
    }

    public final void clear() {
        int i = this.f13653;
        if (i > 0) {
            int[] iArr = this.f13655;
            Object[] objArr = this.f13654;
            this.f13655 = C0872.f5138;
            this.f13654 = C0872.f5139;
            this.f13653 = 0;
            m12514(iArr, objArr, i);
        }
        if (this.f13653 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12520(int i) {
        int i2 = this.f13653;
        int[] iArr = this.f13655;
        if (iArr.length < i) {
            Object[] objArr = this.f13654;
            m12515(i);
            if (this.f13653 > 0) {
                System.arraycopy(iArr, 0, this.f13655, 0, i2);
                System.arraycopy(objArr, 0, this.f13654, 0, i2 << 1);
            }
            m12514(iArr, objArr, i2);
        }
        if (this.f13653 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m12518(obj) >= 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m12518(Object obj) {
        return obj == null ? m12516() : m12517(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m12519(Object obj) {
        int i = this.f13653 * 2;
        Object[] objArr = this.f13654;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final boolean containsValue(Object obj) {
        return m12519(obj) >= 0;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM12518 = m12518(obj);
        return iM12518 >= 0 ? this.f13654[(iM12518 << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object m12522(int i) {
        return this.f13654[i << 1];
    }

    /* JADX INFO: renamed from: ܳ */
    public final Object m12521(int i) {
        return this.f13654[(i << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f13653 <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int iHashCode;
        int iM12517;
        int i = this.f13653;
        if (obj == null) {
            iM12517 = m12516();
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            iM12517 = m12517(iHashCode, obj);
        }
        if (iM12517 >= 0) {
            int i2 = (iM12517 << 1) + 1;
            Object[] objArr = this.f13654;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM12517;
        int[] iArr = this.f13655;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            Object[] objArr2 = this.f13654;
            m12515(i4);
            if (i != this.f13653) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f13655;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f13654, 0, objArr2.length);
            }
            m12514(iArr, objArr2, i);
        }
        if (i3 < i) {
            int[] iArr3 = this.f13655;
            int i5 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i5, i - i3);
            Object[] objArr3 = this.f13654;
            System.arraycopy(objArr3, i3 << 1, objArr3, i5 << 1, (this.f13653 - i3) << 1);
        }
        int i6 = this.f13653;
        if (i == i6) {
            int[] iArr4 = this.f13655;
            if (i3 < iArr4.length) {
                iArr4[i3] = iHashCode;
                Object[] objArr4 = this.f13654;
                int i7 = i3 << 1;
                objArr4[i7] = obj;
                objArr4[i7 + 1] = obj2;
                this.f13653 = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object remove(Object obj) {
        int iM12518 = m12518(obj);
        if (iM12518 >= 0) {
            return m12523(iM12518);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM12518 = m12518(obj);
        if (iM12518 < 0) {
            return false;
        }
        Object objM12521 = m12521(iM12518);
        if (obj2 != objM12521 && (obj2 == null || !obj2.equals(objM12521))) {
            return false;
        }
        m12523(iM12518);
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final Object m12523(int i) {
        Object[] objArr = this.f13654;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f13653;
        int i4 = 0;
        if (i3 <= 1) {
            m12514(this.f13655, objArr, i3);
            this.f13655 = C0872.f5138;
            this.f13654 = C0872.f5139;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f13655;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                m12515(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f13653) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f13655, 0, i);
                    System.arraycopy(objArr, 0, this.f13654, 0, i2);
                }
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, this.f13655, i, i7);
                    System.arraycopy(objArr, i6 << 1, this.f13654, i2, i7 << 1);
                }
            } else {
                if (i < i5) {
                    int i8 = i + 1;
                    int i9 = i5 - i;
                    System.arraycopy(iArr, i8, iArr, i, i9);
                    Object[] objArr2 = this.f13654;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i2, i9 << 1);
                }
                Object[] objArr3 = this.f13654;
                int i10 = i5 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            }
            i4 = i5;
        }
        if (i3 != this.f13653) {
            throw new ConcurrentModificationException();
        }
        this.f13653 = i4;
        return obj;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM12518 = m12518(obj);
        if (iM12518 < 0) {
            return null;
        }
        int i = (iM12518 << 1) + 1;
        Object[] objArr = this.f13654;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM12518 = m12518(obj);
        if (iM12518 < 0) {
            return false;
        }
        Object objM12521 = m12521(iM12518);
        if (objM12521 != obj2 && (obj2 == null || !obj2.equals(objM12521))) {
            return false;
        }
        int i = (iM12518 << 1) + 1;
        Object[] objArr = this.f13654;
        Object obj4 = objArr[i];
        objArr[i] = obj3;
        return true;
    }

    public final int size() {
        return this.f13653;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1012) {
            C1012 c1012 = (C1012) obj;
            if (this.f13653 != c1012.f13653) {
                return false;
            }
            for (int i = 0; i < this.f13653; i++) {
                try {
                    Object objM12522 = m12522(i);
                    Object objM12521 = m12521(i);
                    Object orDefault = c1012.getOrDefault(objM12522, null);
                    if (objM12521 == null) {
                        if (orDefault != null || !c1012.containsKey(objM12522)) {
                            return false;
                        }
                    } else if (!objM12521.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f13653 != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f13653; i2++) {
                try {
                    Object objM12523 = m12522(i2);
                    Object objM12524 = m12521(i2);
                    Object obj2 = map.get(objM12523);
                    if (objM12524 == null) {
                        if (obj2 != null || !map.containsKey(objM12523)) {
                            return false;
                        }
                    } else if (!objM12524.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f13655;
        Object[] objArr = this.f13654;
        int i = this.f13653;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f13653 * 28);
        sb.append('{');
        for (int i = 0; i < this.f13653; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objM12522 = m12522(i);
            if (objM12522 != this) {
                sb.append(objM12522);
            } else {
                sb.append("(this Map)");
            }
            sb.append(C0184a.f880h);
            Object objM12521 = m12521(i);
            if (objM12521 != this) {
                sb.append(objM12521);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
