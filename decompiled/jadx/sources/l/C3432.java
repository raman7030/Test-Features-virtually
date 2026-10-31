package l;

import android.app.Application;
import android.content.res.Resources;
import com.alipay.sdk.m.p.a;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 05OF */
/* JADX INFO: loaded from: classes.dex */
public class C3432 {

    /* JADX INFO: renamed from: ֫۠۟, reason: not valid java name and contains not printable characters */
    public static int f10845;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static int f10846;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object[] f10847;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int f10848;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static Object[] f10849;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f10850;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object[] f10851;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f10852;

    /* JADX INFO: renamed from: ֡֫ܶ, reason: not valid java name and contains not printable characters */
    public static void m10475(int i, int i2, Object obj) {
        C15972.m37746(i, i2, (byte[]) obj);
    }

    /* JADX INFO: renamed from: ֫ۖ᩻, reason: not valid java name and contains not printable characters */
    public static int m10477() {
        return 490417414;
    }

    /* JADX INFO: renamed from: ֫ۧܺ, reason: not valid java name and contains not printable characters */
    public static String m10478(Object obj, int i) {
        return ((String) obj).substring(i);
    }

    /* JADX INFO: renamed from: ۙ᩶ۨ, reason: not valid java name and contains not printable characters */
    public static Application m10479() {
        return C4925.m14335();
    }

    /* JADX INFO: renamed from: ۡᩴۙ, reason: not valid java name and contains not printable characters */
    public static int m10481(Object obj) {
        return ((ArrayList) obj).size();
    }

    /* JADX INFO: renamed from: ۢܰܰ, reason: not valid java name and contains not printable characters */
    public static long m10482(long j, long j2) {
        return Math.min(j, j2);
    }

    /* JADX INFO: renamed from: ۧ֡֫, reason: not valid java name and contains not printable characters */
    public static Iterator m10483(Object obj) {
        return ((Set) obj).iterator();
    }

    /* JADX INFO: renamed from: ۨᩴ۫, reason: not valid java name and contains not printable characters */
    public static void m10484(Object obj, Object obj2) {
        ((C10567) obj).append((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܳ֡ۜ, reason: not valid java name and contains not printable characters */
    public static Object m10485(Object obj, char c, Object obj2) {
        return ((InterfaceC12963) obj).mo13246(c, obj2);
    }

    /* JADX INFO: renamed from: ܳ᩺᩷, reason: not valid java name and contains not printable characters */
    public static Set m10486(Object obj) {
        return ((IdentityHashMap) obj).keySet();
    }

    /* JADX INFO: renamed from: ܶᩴ۬, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m10487(Object obj, Object obj2) {
        return C16999.m39866((String) obj, (String[]) obj2);
    }

    /* JADX INFO: renamed from: ܶ᩺᩹, reason: not valid java name and contains not printable characters */
    public static String m10488(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܿۚۗ, reason: not valid java name and contains not printable characters */
    public static boolean m10489(Object obj, Object obj2) {
        return ((Set) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ᩴ᩵ܰ, reason: not valid java name and contains not printable characters */
    public static void m10490(Object obj, int i) {
        ((C19258) obj).m44433(i);
    }

    /* JADX INFO: renamed from: ᩵ۨۘ, reason: not valid java name and contains not printable characters */
    public static Set m10491(Object obj) {
        return ((InterfaceC15620) obj).mo27438();
    }

    /* JADX INFO: renamed from: ᩺ᩴۗ, reason: not valid java name and contains not printable characters */
    public static int m10492(Object obj, int i) {
        return C21238.m48210((Resources.Theme) obj, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m10494(int i, Object obj) {
        int i2 = this.f10850;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM2486 = C0609.m2486(i2, i, this.f10852);
            if (iM2486 < 0 || obj.equals(this.f10851[iM2486 << 1])) {
                return iM2486;
            }
            int i3 = iM2486 + 1;
            while (i3 < i2 && this.f10852[i3] == i) {
                if (obj.equals(this.f10851[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            do {
                iM2486--;
                if (iM2486 < 0 || this.f10852[iM2486] != i) {
                    return ~i3;
                }
            } while (!obj.equals(this.f10851[iM2486 << 1]));
            return iM2486;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m10493() {
        int i = this.f10850;
        if (i == 0) {
            return -1;
        }
        try {
            int iM2486 = C0609.m2486(i, 0, this.f10852);
            if (iM2486 < 0 || this.f10851[iM2486 << 1] == null) {
                return iM2486;
            }
            int i2 = iM2486 + 1;
            while (i2 < i && this.f10852[i2] == 0) {
                if (this.f10851[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            do {
                iM2486--;
                if (iM2486 < 0 || this.f10852[iM2486] != 0) {
                    return ~i2;
                }
            } while (this.f10851[iM2486 << 1] != null);
            return iM2486;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m10480(int i) {
        if (i == 8) {
            synchronized (C3432.class) {
                Object[] objArr = f10849;
                if (objArr != null) {
                    this.f10851 = objArr;
                    f10849 = (Object[]) objArr[0];
                    this.f10852 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f10848--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C3432.class) {
                Object[] objArr2 = f10847;
                if (objArr2 != null) {
                    this.f10851 = objArr2;
                    f10847 = (Object[]) objArr2[0];
                    this.f10852 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f10846--;
                    return;
                }
            }
        }
        this.f10852 = new int[i];
        this.f10851 = new Object[i << 1];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10476(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C3432.class) {
                if (f10848 < 10) {
                    objArr[0] = f10849;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f10849 = objArr;
                    f10848++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C3432.class) {
                if (f10846 < 10) {
                    objArr[0] = f10847;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f10847 = objArr;
                    f10846++;
                }
            }
        }
    }

    public C3432() {
        this.f10852 = C0609.f2364;
        this.f10851 = C0609.f2365;
        this.f10850 = 0;
    }

    public C3432(int i) {
        if (i == 0) {
            this.f10852 = C0609.f2364;
            this.f10851 = C0609.f2365;
        } else {
            m10480(i);
        }
        this.f10850 = 0;
    }

    public final void clear() {
        int i = this.f10850;
        if (i > 0) {
            int[] iArr = this.f10852;
            Object[] objArr = this.f10851;
            this.f10852 = C0609.f2364;
            this.f10851 = C0609.f2365;
            this.f10850 = 0;
            m10476(iArr, objArr, i);
        }
        if (this.f10850 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10497(int i) {
        int i2 = this.f10850;
        int[] iArr = this.f10852;
        if (iArr.length < i) {
            Object[] objArr = this.f10851;
            m10480(i);
            if (this.f10850 > 0) {
                System.arraycopy(iArr, 0, this.f10852, 0, i2);
                System.arraycopy(objArr, 0, this.f10851, 0, i2 << 1);
            }
            m10476(iArr, objArr, i2);
        }
        if (this.f10850 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m10495(obj) >= 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m10495(Object obj) {
        return obj == null ? m10493() : m10494(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m10496(Object obj) {
        int i = this.f10850 * 2;
        Object[] objArr = this.f10851;
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
        return m10496(obj) >= 0;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM10495 = m10495(obj);
        return iM10495 >= 0 ? this.f10851[(iM10495 << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m10499(int i) {
        return this.f10851[i << 1];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object m10498(int i) {
        return this.f10851[(i << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f10850 <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int iHashCode;
        int iM10494;
        int i = this.f10850;
        if (obj == null) {
            iM10494 = m10493();
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            iM10494 = m10494(iHashCode, obj);
        }
        if (iM10494 >= 0) {
            int i2 = (iM10494 << 1) + 1;
            Object[] objArr = this.f10851;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM10494;
        int[] iArr = this.f10852;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            Object[] objArr2 = this.f10851;
            m10480(i4);
            if (i != this.f10850) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f10852;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f10851, 0, objArr2.length);
            }
            m10476(iArr, objArr2, i);
        }
        if (i3 < i) {
            int[] iArr3 = this.f10852;
            int i5 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i5, i - i3);
            Object[] objArr3 = this.f10851;
            System.arraycopy(objArr3, i3 << 1, objArr3, i5 << 1, (this.f10850 - i3) << 1);
        }
        int i6 = this.f10850;
        if (i == i6) {
            int[] iArr4 = this.f10852;
            if (i3 < iArr4.length) {
                iArr4[i3] = iHashCode;
                Object[] objArr4 = this.f10851;
                int i7 = i3 << 1;
                objArr4[i7] = obj;
                objArr4[i7 + 1] = obj2;
                this.f10850 = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object remove(Object obj) {
        int iM10495 = m10495(obj);
        if (iM10495 >= 0) {
            return m10500(iM10495);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM10495 = m10495(obj);
        if (iM10495 < 0) {
            return false;
        }
        Object objM10498 = m10498(iM10495);
        if (obj2 != objM10498 && (obj2 == null || !obj2.equals(objM10498))) {
            return false;
        }
        m10500(iM10495);
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object m10500(int i) {
        Object[] objArr = this.f10851;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f10850;
        int i4 = 0;
        if (i3 <= 1) {
            m10476(this.f10852, objArr, i3);
            this.f10852 = C0609.f2364;
            this.f10851 = C0609.f2365;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f10852;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                m10480(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f10850) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f10852, 0, i);
                    System.arraycopy(objArr, 0, this.f10851, 0, i2);
                }
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, this.f10852, i, i7);
                    System.arraycopy(objArr, i6 << 1, this.f10851, i2, i7 << 1);
                }
            } else {
                if (i < i5) {
                    int i8 = i + 1;
                    int i9 = i5 - i;
                    System.arraycopy(iArr, i8, iArr, i, i9);
                    Object[] objArr2 = this.f10851;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i2, i9 << 1);
                }
                Object[] objArr3 = this.f10851;
                int i10 = i5 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            }
            i4 = i5;
        }
        if (i3 != this.f10850) {
            throw new ConcurrentModificationException();
        }
        this.f10850 = i4;
        return obj;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM10495 = m10495(obj);
        if (iM10495 < 0) {
            return null;
        }
        int i = (iM10495 << 1) + 1;
        Object[] objArr = this.f10851;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM10495 = m10495(obj);
        if (iM10495 < 0) {
            return false;
        }
        Object objM10498 = m10498(iM10495);
        if (objM10498 != obj2 && (obj2 == null || !obj2.equals(objM10498))) {
            return false;
        }
        int i = (iM10495 << 1) + 1;
        Object[] objArr = this.f10851;
        Object obj4 = objArr[i];
        objArr[i] = obj3;
        return true;
    }

    public final int size() {
        return this.f10850;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3432) {
            C3432 c3432 = (C3432) obj;
            if (this.f10850 != c3432.f10850) {
                return false;
            }
            for (int i = 0; i < this.f10850; i++) {
                try {
                    Object objM10499 = m10499(i);
                    Object objM10498 = m10498(i);
                    Object orDefault = c3432.getOrDefault(objM10499, null);
                    if (objM10498 == null) {
                        if (orDefault != null || !c3432.containsKey(objM10499)) {
                            return false;
                        }
                    } else if (!objM10498.equals(orDefault)) {
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
            if (this.f10850 != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f10850; i2++) {
                try {
                    Object objM104910 = m10499(i2);
                    Object objM104911 = m10498(i2);
                    Object obj2 = map.get(objM104910);
                    if (objM104911 == null) {
                        if (obj2 != null || !map.containsKey(objM104910)) {
                            return false;
                        }
                    } else if (!objM104911.equals(obj2)) {
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
        int[] iArr = this.f10852;
        Object[] objArr = this.f10851;
        int i = this.f10850;
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
        StringBuilder sb = new StringBuilder(this.f10850 * 28);
        sb.append('{');
        for (int i = 0; i < this.f10850; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objM10499 = m10499(i);
            if (objM10499 != this) {
                sb.append(objM10499);
            } else {
                sb.append("(this Map)");
            }
            sb.append(a.h);
            Object objM10498 = m10498(i);
            if (objM10498 != this) {
                sb.append(objM10498);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
