package l;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A7N6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15201 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C21180 f46416;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC9731 f46417;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f46418;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C8353[] f46419;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17379 f46420;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13312 f46421;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Uri f46423;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final List f46424;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22258 f46425;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13830 f46427;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C8571 f46428;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f46429;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f46430;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Uri[] f46431;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f46433;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Uri f46434;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C18731 f46426 = new C18731();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public byte[] f46432 = C3603.f11423;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f46422 = -9223372036854775807L;

    public C15201(InterfaceC22258 interfaceC22258, InterfaceC17379 interfaceC17379, Uri[] uriArr, C8353[] c8353Arr, InterfaceC21553 interfaceC21553, InterfaceC0486 interfaceC0486, C21180 c21180, List list, C13830 c13830) {
        this.f46425 = interfaceC22258;
        this.f46420 = interfaceC17379;
        this.f46431 = uriArr;
        this.f46419 = c8353Arr;
        this.f46416 = c21180;
        this.f46424 = list;
        this.f46427 = c13830;
        InterfaceC21449 interfaceC21449Mo6042 = interfaceC21553.mo6042(1);
        this.f46433 = interfaceC21449Mo6042;
        if (interfaceC0486 != null) {
            interfaceC21449Mo6042.mo5937(interfaceC0486);
        }
        this.f46418 = interfaceC21553.mo6042(3);
        this.f46421 = new C13312("", c8353Arr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((c8353Arr[i].f25608 & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f46417 = new C1091(this.f46421, C13426.m32449(arrayList));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m35946() throws C8571 {
        C8571 c8571 = this.f46428;
        if (c8571 != null) {
            throw c8571;
        }
        Uri uri = this.f46434;
        if (uri == null || !uri.equals(this.f46423)) {
            return;
        }
        this.f46420.mo9180(this.f46434);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13312 m35932() {
        return this.f46421;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m35944() {
        return this.f46430;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9731 m35943() {
        return this.f46417;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35936(boolean z) {
        this.f46429 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m35931(long j, C9599 c9599) {
        int iMo3757 = this.f46417.mo3757();
        Uri[] uriArr = this.f46431;
        int length = uriArr.length;
        InterfaceC17379 interfaceC17379 = this.f46420;
        C4951 c4951Mo9174 = (iMo3757 >= length || iMo3757 == -1) ? null : interfaceC17379.mo9174(uriArr[this.f46417.mo2390()], true);
        if (c4951Mo9174 != null) {
            AbstractC14545 abstractC14545 = c4951Mo9174.f15593;
            if (!abstractC14545.isEmpty()) {
                long jMo9173 = c4951Mo9174.f15599 - interfaceC17379.mo9173();
                long j2 = j - jMo9173;
                int iM11009 = C3603.m11009((List) abstractC14545, Long.valueOf(j2), true);
                long j3 = ((C21885) abstractC14545.get(iM11009)).f73016;
                return c9599.m24534(j2, j3, (!c4951Mo9174.f31807 || iM11009 == abstractC14545.size() - 1) ? j3 : ((C21885) abstractC14545.get(iM11009 + 1)).f73016) + jMo9173;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35930(C20142 c20142) {
        AbstractC14545 abstractC14545;
        int i = c20142.f65222;
        if (i == -1) {
            return 1;
        }
        C4951 c4951Mo9174 = this.f46420.mo9174(this.f46431[this.f46421.m32294(c20142.f23468)], false);
        c4951Mo9174.getClass();
        AbstractC14545 abstractC14546 = c4951Mo9174.f15593;
        int i2 = (int) (c20142.f33524 - c4951Mo9174.f15600);
        if (i2 < 0) {
            return 1;
        }
        if (i2 < abstractC14546.size()) {
            abstractC14545 = ((C21885) abstractC14546.get(i2)).f70066;
        } else {
            abstractC14545 = c4951Mo9174.f15610;
        }
        if (i >= abstractC14545.size()) {
            return 2;
        }
        C8479 c8479 = (C8479) abstractC14545.get(i);
        if (c8479.f25916) {
            return 0;
        }
        return C11003.equals(Uri.parse(C8542.m22228(c4951Mo9174.f31806, c8479.f73022)), c20142.f23467.f9711) ? 1 : 2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m35942(C20142 c20142) {
        AbstractC14545 abstractC14545;
        int i = c20142.f65222;
        C22632.m50634(i != -1);
        C4951 c4951Mo9174 = this.f46420.mo9174(this.f46431[this.f46421.m32294(c20142.f23468)], false);
        c4951Mo9174.getClass();
        AbstractC14545 abstractC14546 = c4951Mo9174.f15593;
        int i2 = (int) (c20142.f33524 - c4951Mo9174.f15600);
        if (i2 < 0) {
            return 0L;
        }
        if (i2 < abstractC14546.size()) {
            abstractC14545 = ((C21885) abstractC14546.get(i2)).f70066;
        } else {
            abstractC14545 = c4951Mo9174.f15610;
        }
        return ((C8479) abstractC14545.get(i)).f73013;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35935(C11469 c11469, long j, long j2, List list, boolean z, C0385 c0385) {
        long j3;
        Uri uri;
        boolean z2;
        String str;
        C8147 c8147M35928;
        C20142 c20142 = list.isEmpty() ? null : (C20142) C8882.m22955(list);
        int iM32294 = c20142 == null ? -1 : this.f46421.m32294(c20142.f23468);
        long j4 = c11469.f34255;
        long jMax = j - j4;
        long j5 = this.f46422;
        long jMax2 = j5 != -9223372036854775807L ? j5 - j4 : -9223372036854775807L;
        if (c20142 == null || this.f46430) {
            j3 = -9223372036854775807L;
        } else {
            long j6 = c20142.f23469 - c20142.f23470;
            jMax = Math.max(0L, jMax - j6);
            j3 = -9223372036854775807L;
            if (jMax2 != -9223372036854775807L) {
                jMax2 = Math.max(0L, jMax2 - j6);
            }
        }
        this.f46417.mo3758(j4, jMax, jMax2, list, m35941(c20142, j));
        int iMo2390 = this.f46417.mo2390();
        boolean z3 = iM32294 != iMo2390;
        Uri[] uriArr = this.f46431;
        Uri uri2 = uriArr[iMo2390];
        InterfaceC17379 interfaceC17379 = this.f46420;
        if (!interfaceC17379.mo9185(uri2)) {
            c0385.f1820 = uri2;
            this.f46423 = uri2;
            return;
        }
        C4951 c4951Mo9174 = interfaceC17379.mo9174(uri2, true);
        c4951Mo9174.getClass();
        long j7 = c4951Mo9174.f15599;
        this.f46430 = c4951Mo9174.f31807;
        this.f46422 = c4951Mo9174.f15612 ? j3 : (c4951Mo9174.f15605 + j7) - interfaceC17379.mo9173();
        long jMo9173 = j7 - interfaceC17379.mo9173();
        C4951 c4951 = c4951Mo9174;
        Pair pairM35926 = m35926(c20142, z3, c4951Mo9174, jMo9173, j);
        long jLongValue = ((Long) pairM35926.first).longValue();
        int iIntValue = ((Integer) pairM35926.second).intValue();
        if (z3 && c20142 != null && (jLongValue < c4951.f15600 || ((c8147M35928 = m35928(c4951, jLongValue, iIntValue)) != null && c8147M35928.f25138.f73016 + jMo9173 < j2))) {
            Uri uri3 = uriArr[iM32294];
            C4951 c4951Mo9175 = interfaceC17379.mo9174(uri3, true);
            c4951Mo9175.getClass();
            jMo9173 = c4951Mo9175.f15599 - interfaceC17379.mo9173();
            Pair pairM35927 = m35926(c20142, false, c4951Mo9175, jMo9173, j);
            jLongValue = ((Long) pairM35927.first).longValue();
            iIntValue = ((Integer) pairM35927.second).intValue();
            uri = uri3;
            c4951 = c4951Mo9175;
            iMo2390 = iM32294;
        } else {
            uri = uri2;
        }
        String str2 = c4951.f31806;
        boolean z4 = c4951.f31807;
        long j8 = c4951.f15600;
        AbstractC14545 abstractC14545 = c4951.f15593;
        if (iMo2390 != iM32294 && iM32294 != -1) {
            interfaceC17379.mo9175(uriArr[iM32294]);
        }
        if (jLongValue < j8) {
            this.f46428 = new C8571();
            return;
        }
        C8147 c8147M35929 = m35928(c4951, jLongValue, iIntValue);
        if (c8147M35929 == null) {
            if (!c4951.f15612) {
                c0385.f1820 = uri;
                this.f46423 = uri;
                return;
            } else {
                if (z || abstractC14545.isEmpty()) {
                    c0385.f1819 = true;
                    return;
                }
                c8147M35929 = new C8147((C22590) C8882.m22955(abstractC14545), (j8 + ((long) abstractC14545.size())) - 1, -1);
            }
        }
        C8147 c8147 = c8147M35929;
        C22590 c22590 = c8147.f25138;
        this.f46423 = null;
        SystemClock.elapsedRealtime();
        C21885 c21885 = c22590.f73015;
        Uri uriM22231 = (c21885 == null || (str = c21885.f73018) == null) ? null : C8542.m22231(str2, str);
        AbstractC7592 abstractC7592M35927 = m35927(uriM22231, iMo2390, true);
        c0385.f1818 = abstractC7592M35927;
        if (abstractC7592M35927 != null) {
            return;
        }
        String str3 = c22590.f73018;
        Uri uriM22232 = str3 != null ? C8542.m22231(str2, str3) : null;
        boolean z5 = false;
        AbstractC7592 abstractC7592M35928 = m35927(uriM22232, iMo2390, false);
        c0385.f1818 = abstractC7592M35928;
        if (abstractC7592M35928 != null) {
            return;
        }
        if (c22590 instanceof C8479) {
            if (((C8479) c22590).f25917 || (c8147.f25137 == 0 && z4)) {
                z5 = true;
            }
            z2 = z5;
        } else {
            z2 = z4;
        }
        boolean zM46390 = C20142.m46390(c20142, j, uri, z2, c8147, jMo9173);
        if (zM46390 && c8147.f25135) {
            return;
        }
        int iMo3760 = this.f46417.mo3760();
        Object objMo3759 = this.f46417.mo3759();
        boolean z6 = this.f46429;
        C18731 c18731 = this.f46426;
        c0385.f1818 = C20142.m46388(this.f46425, this.f46433, this.f46419[iMo2390], jMo9173, c4951, c8147, uri, this.f46424, iMo3760, objMo3759, z6, this.f46416, c20142, c18731.m43382(uriM22232), c18731.m43382(uriM22231), zM46390, z2, this.f46427);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8147 m35928(C4951 c4951, long j, int i) {
        long j2 = c4951.f15600;
        AbstractC14545 abstractC14545 = c4951.f15610;
        int i2 = (int) (j - j2);
        AbstractC14545 abstractC14546 = c4951.f15593;
        if (i2 == abstractC14546.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < abstractC14545.size()) {
                return new C8147((C22590) abstractC14545.get(i), j, i);
            }
            return null;
        }
        C21885 c21885 = (C21885) abstractC14546.get(i2);
        if (i == -1) {
            return new C8147(c21885, j, -1);
        }
        if (i < c21885.f70066.size()) {
            return new C8147((C22590) c21885.f70066.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < abstractC14546.size()) {
            return new C8147((C22590) abstractC14546.get(i3), j + 1, -1);
        }
        if (abstractC14545.isEmpty()) {
            return null;
        }
        return new C8147((C22590) abstractC14545.get(0), j + 1, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35933(AbstractC7592 abstractC7592) {
        if (abstractC7592 instanceof C19437) {
            C19437 c19437 = (C19437) abstractC7592;
            this.f46432 = c19437.m6512();
            Uri uri = c19437.f23467.f9711;
            byte[] bArrM44778 = c19437.m44778();
            bArrM44778.getClass();
            this.f46426.m43381(uri, bArrM44778);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35940(AbstractC7592 abstractC7592, long j) {
        InterfaceC9731 interfaceC9731 = this.f46417;
        return interfaceC9731.mo2385(interfaceC9731.indexOf(this.f46421.m32294(abstractC7592.f23468)), j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35939(Uri uri, long j) {
        int iIndexOf;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.f46431;
            if (i >= uriArr.length) {
                i = -1;
                break;
            }
            if (uriArr[i].equals(uri)) {
                break;
            }
            i++;
        }
        if (i == -1 || (iIndexOf = this.f46417.indexOf(i)) == -1) {
            return true;
        }
        this.f46434 = uri;
        return j != -9223372036854775807L && this.f46417.mo2385(iIndexOf, j) && this.f46420.mo9178(uri, j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18218[] m35941(C20142 c20142, long j) {
        List listOf;
        int iM32294 = c20142 == null ? -1 : this.f46421.m32294(c20142.f23468);
        int length = this.f46417.length();
        InterfaceC18218[] interfaceC18218Arr = new InterfaceC18218[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int iMo2384 = this.f46417.mo2384(i);
            Uri uri = this.f46431[iMo2384];
            InterfaceC17379 interfaceC17379 = this.f46420;
            if (!interfaceC17379.mo9185(uri)) {
                interfaceC18218Arr[i] = InterfaceC18218.f56618;
            } else {
                C4951 c4951Mo9174 = interfaceC17379.mo9174(uri, z);
                c4951Mo9174.getClass();
                long jMo9173 = c4951Mo9174.f15599 - interfaceC17379.mo9173();
                Pair pairM35926 = m35926(c20142, iMo2384 != iM32294, c4951Mo9174, jMo9173, j);
                long jLongValue = ((Long) pairM35926.first).longValue();
                int iIntValue = ((Integer) pairM35926.second).intValue();
                long j2 = c4951Mo9174.f15600;
                AbstractC14545 abstractC14545 = c4951Mo9174.f15610;
                AbstractC14545 abstractC14546 = c4951Mo9174.f15593;
                int i2 = (int) (jLongValue - j2);
                if (i2 < 0 || abstractC14546.size() < i2) {
                    listOf = AbstractC14545.of();
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < abstractC14546.size()) {
                        if (iIntValue != -1) {
                            C21885 c21885 = (C21885) abstractC14546.get(i2);
                            if (iIntValue == 0) {
                                arrayList.add(c21885);
                            } else if (iIntValue < c21885.f70066.size()) {
                                AbstractC14545 abstractC14547 = c21885.f70066;
                                arrayList.addAll(abstractC14547.subList(iIntValue, abstractC14547.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(abstractC14546.subList(i2, abstractC14546.size()));
                        iIntValue = 0;
                    }
                    if (c4951Mo9174.f15604 != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < abstractC14545.size()) {
                            arrayList.addAll(abstractC14545.subList(iIntValue, abstractC14545.size()));
                        }
                    }
                    listOf = C20195.unmodifiableList(arrayList);
                }
                interfaceC18218Arr[i] = new C5325(jMo9173, listOf);
            }
            i++;
            z = false;
        }
        return interfaceC18218Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35929(long j, List list) {
        if (this.f46428 != null || this.f46417.length() < 2) {
            return list.size();
        }
        return this.f46417.mo2375(j, list);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35937(long j, AbstractC7592 abstractC7592, List list) {
        if (this.f46428 != null) {
            return false;
        }
        return this.f46417.mo2381(j, abstractC7592, list);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35938(Uri uri) {
        return C3603.m11029(uri, this.f46431);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Pair m35926(C20142 c20142, boolean z, C4951 c4951, long j, long j2) {
        boolean z2 = true;
        if (c20142 != null) {
            long j3 = c20142.f33524;
            int i = c20142.f65222;
            if (!z) {
                if (c20142.m46399()) {
                    if (i == -1) {
                        j3 = j3 != -1 ? j3 + 1 : -1L;
                    }
                    return new Pair(Long.valueOf(j3), Integer.valueOf(i != -1 ? i + 1 : -1));
                }
                return new Pair(Long.valueOf(j3), Integer.valueOf(i));
            }
        }
        long j4 = c4951.f15605;
        AbstractC14545 abstractC14545 = c4951.f15610;
        long j5 = c4951.f15600;
        AbstractC14545 abstractC14546 = c4951.f15593;
        long j6 = j4 + j;
        if (c20142 != null && !this.f46430) {
            j2 = c20142.f23470;
        }
        if (!c4951.f15612 && j2 >= j6) {
            return new Pair(Long.valueOf(j5 + ((long) abstractC14546.size())), -1);
        }
        long j7 = j2 - j;
        Long lValueOf = Long.valueOf(j7);
        int i2 = 0;
        if (this.f46420.mo9183() && c20142 != null) {
            z2 = false;
        }
        int iM11009 = C3603.m11009(abstractC14546, lValueOf, z2);
        long j8 = ((long) iM11009) + j5;
        if (iM11009 >= 0) {
            C21885 c21885 = (C21885) abstractC14546.get(iM11009);
            AbstractC14545 abstractC14547 = j7 < c21885.f73016 + c21885.f73013 ? c21885.f70066 : abstractC14545;
            while (i2 < abstractC14547.size()) {
                C8479 c8479 = (C8479) abstractC14547.get(i2);
                if (j7 >= c8479.f73016 + c8479.f73013) {
                    i2++;
                } else if (c8479.f25917) {
                    j8 += abstractC14547 == abstractC14545 ? 1L : 0L;
                }
            }
            i2 = -1;
        } else {
            i2 = -1;
        }
        return new Pair(Long.valueOf(j8), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC7592 m35927(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        C18731 c18731 = this.f46426;
        byte[] bArrM43383 = c18731.m43383(uri);
        if (bArrM43383 != null) {
            c18731.m43381(uri, bArrM43383);
            return null;
        }
        C4515 c4515 = new C4515();
        c4515.m13281(uri);
        c4515.m13279(1);
        return new C19437(this.f46418, c4515.m13278(), this.f46419[i], this.f46417.mo3760(), this.f46417.mo3759(), this.f46432);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35934(InterfaceC9731 interfaceC9731) {
        this.f46420.mo9175(this.f46431[this.f46417.mo2390()]);
        this.f46417 = interfaceC9731;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m35945() {
        this.f46420.mo9175(this.f46431[this.f46417.mo2390()]);
        this.f46428 = null;
    }
}
