package l;

import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBI4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23325 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f74966;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f74967;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C20938 f74969;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC5813 f74971;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f74972;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f74973;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f74974;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C1662 f74975;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23095 f74976;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1887 f74977;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13964[] f74978;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f74965 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f74968 = 1;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C18241 f74970 = new C18241();

    public C23325(C20938 c20938, C1887 c1887, C1662 c1662, int i, int i2, boolean z, C22390 c22390) {
        this.f74969 = c20938;
        this.f74977 = c1887;
        this.f74975 = c1662;
        this.f74976 = c22390.m39386();
        this.f74972 = z;
        this.f74974 = i;
        this.f74966 = i2;
        this.f74978 = new C13964[i2];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51721(int i, String str) {
        if (this.f74973 != null) {
            str = C9045.m23341(new StringBuilder(), this.f74973, str);
        }
        InterfaceC5813 interfaceC5813 = this.f74971;
        if (interfaceC5813 != null) {
            if (!this.f74967) {
                i = 0;
            }
            ((C18241) interfaceC5813).m42501(i, str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m51729() {
        try {
            return m51727();
        } catch (IOException e) {
            throw C8136.m21601("...while encoding debug info", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m51730(String str, InterfaceC5813 interfaceC5813, boolean z) {
        this.f74973 = str;
        this.f74971 = interfaceC5813;
        this.f74967 = z;
        return m51729();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private byte[] m51727() {
        char c;
        C1662 c1662;
        C13217 c13217;
        C13964 c13964;
        C20938 c20938 = this.f74969;
        int size = c20938 == null ? 0 : c20938.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(c20938.m40994get(i));
        }
        Collections.sort(arrayList, new C6392());
        C23095 c23095 = this.f74976;
        ArrayList<C13964> arrayList2 = new ArrayList(c23095.m51259().size());
        int iM33357 = c23095.m51259().m33357();
        int i2 = this.f74966;
        boolean z = this.f74972;
        int i3 = (i2 - iM33357) - (!z ? 1 : 0);
        BitSet bitSet = new BitSet(i2 - i3);
        C1887 c1887 = this.f74977;
        int size2 = c1887.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C13964 c13964M41000get = c1887.m41000get(i4);
            int iM33421 = c13964M41000get.m33421();
            if (iM33421 >= i3) {
                int i5 = iM33421 - i3;
                if (!bitSet.get(i5)) {
                    bitSet.set(i5);
                    arrayList2.add(c13964M41000get);
                }
            }
        }
        Collections.sort(arrayList2, new C12037());
        boolean z2 = this.f74971 != null;
        C18241 c18241 = this.f74970;
        int iM42510 = c18241.m42510();
        if (arrayList.size() > 0) {
            this.f74968 = ((C6826) arrayList.get(0)).m18514().m25588();
        }
        c18241.m42507(this.f74968);
        if (z2) {
            m51721(c18241.m42510() - iM42510, "line_start: " + this.f74968);
        }
        int iM33358 = (i2 - c23095.m51259().m33357()) - (!z ? 1 : 0);
        C13922 c13922M51259 = c23095.m51259();
        int size3 = c13922M51259.size();
        C13964[] c13964Arr = this.f74978;
        if (!z) {
            for (C13964 c13965 : arrayList2) {
                if (iM33358 == c13965.m33421()) {
                    c13964Arr[iM33358] = c13965;
                    break;
                }
            }
            iM33358++;
        }
        int iM42511 = c18241.m42510();
        c18241.m42507(size3);
        if (z2) {
            m51721(c18241.m42510() - iM42511, String.format("parameters_size: %04x", Integer.valueOf(size3)));
        }
        for (int i6 = 0; i6 < size3; i6++) {
            C7573 c7573M40995get = c13922M51259.m40995get(i6);
            int iM42512 = c18241.m42510();
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c13217 = null;
                    c13964 = null;
                    break;
                }
                c13964 = (C13964) it.next();
                if (iM33358 == c13964.m33421()) {
                    if (c13964.getSignature() != null) {
                        c13217 = null;
                        m51723((C13217) null);
                    } else {
                        c13217 = null;
                        m51723(c13964.getName());
                    }
                    c13964Arr[iM33358] = c13964;
                    break;
                }
            }
            if (c13964 == null) {
                m51723(c13217);
            }
            if (z2) {
                m51721(c18241.m42510() - iM42512, "parameter " + ((c13964 == null || c13964.getSignature() != null) ? "<unnamed>" : c13964.getName().mo2463()) + " v" + iM33358);
            }
            iM33358 += c7573M40995get.m20314();
        }
        char c2 = 0;
        for (C13964 c13966 : c13964Arr) {
            if (c13966 != null && c13966.getSignature() != null) {
                m51724(c13966);
            }
        }
        if (this.f74971 != null) {
            m51721(1, String.format("%04x: prologue end", Integer.valueOf(this.f74965)));
        }
        int size4 = arrayList.size();
        int size5 = c1887.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int size6 = c1887.size();
            while (i7 < size6 && c1887.m41000get(i7).m33415() == this.f74965) {
                int i9 = i7 + 1;
                C13964 c13964M41000get2 = c1887.m41000get(i7);
                int iM33422 = c13964M41000get2.m33421();
                C13964 c13967 = c13964Arr[iM33422];
                if (c13964M41000get2 != c13967) {
                    c13964Arr[iM33422] = c13964M41000get2;
                    if (c13964M41000get2.m33422()) {
                        if (c13967 != null && c13964M41000get2.m33420(c13967)) {
                            if (c13967.m33422()) {
                                throw new RuntimeException("shouldn't happen");
                            }
                            int iM42513 = c18241.m42510();
                            c18241.m42517(6);
                            m51728(c13964M41000get2.m33421());
                            if (this.f74971 != null) {
                                int iM42514 = c18241.m42510() - iM42513;
                                Integer numValueOf = Integer.valueOf(this.f74965);
                                String strM51725 = m51725(c13964M41000get2);
                                Object[] objArr = new Object[2];
                                objArr[c2] = numValueOf;
                                objArr[1] = strM51725;
                                m51721(iM42514, String.format("%04x: +local restart %s", objArr));
                            }
                        } else if (c13964M41000get2.getSignature() != null) {
                            m51724(c13964M41000get2);
                        } else {
                            int iM42515 = c18241.m42510();
                            c18241.m42517(3);
                            m51728(c13964M41000get2.m33421());
                            m51723(c13964M41000get2.getName());
                            C12512 type = c13964M41000get2.getType();
                            if (type == null || (c1662 = this.f74975) == null) {
                                c = 0;
                                c18241.m42507(0);
                            } else {
                                c18241.m42507(c1662.m5632().m39748(type) + 1);
                                c = 0;
                            }
                            if (this.f74971 != null) {
                                int iM42516 = c18241.m42510() - iM42515;
                                Integer numValueOf2 = Integer.valueOf(this.f74965);
                                String strM51726 = m51725(c13964M41000get2);
                                Object[] objArr2 = new Object[2];
                                objArr2[c] = numValueOf2;
                                objArr2[1] = strM51726;
                                m51721(iM42516, String.format("%04x: +local %s", objArr2));
                            }
                        }
                    } else if (c13964M41000get2.m33419() != EnumC23137.END_REPLACED) {
                        int iM42517 = c18241.m42510();
                        c18241.m42517(5);
                        c18241.m42507(c13964M41000get2.m33421());
                        if (this.f74971 != null) {
                            m51721(c18241.m42510() - iM42517, String.format("%04x: -local %s", Integer.valueOf(this.f74965), m51725(c13964M41000get2)));
                        }
                    }
                }
                c2 = 0;
                i7 = i9;
            }
            int size7 = arrayList.size();
            while (i8 < size7 && ((C6826) arrayList.get(i8)).m18513() == this.f74965) {
                m51722((C6826) arrayList.get(i8));
                i8++;
            }
            int iM33415 = i7 < size5 ? c1887.m41000get(i7).m33415() : Integer.MAX_VALUE;
            int iM18513 = i8 < size4 ? ((C6826) arrayList.get(i8)).m18513() : Integer.MAX_VALUE;
            int iMin = Math.min(iM18513, iM33415);
            if (iMin == Integer.MAX_VALUE || (iMin == this.f74974 && iM33415 == Integer.MAX_VALUE && iM18513 == Integer.MAX_VALUE)) {
                break;
            }
            if (iMin == iM18513) {
                m51722((C6826) arrayList.get(i8));
                i8++;
            } else {
                m51726(iMin - this.f74965);
            }
            c2 = 0;
        }
        c18241.m42517(0);
        if (this.f74971 != null) {
            m51721(1, "end sequence");
        }
        return c18241.m42520();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m51725(C13964 c13964) {
        StringBuilder sb = new StringBuilder(am.aE);
        sb.append(c13964.m33421());
        sb.append(' ');
        C13217 name = c13964.getName();
        if (name == null) {
            sb.append("null");
        } else {
            sb.append(name.mo2463());
        }
        sb.append(' ');
        C12512 type = c13964.getType();
        if (type == null) {
            sb.append("null");
        } else {
            sb.append(type.mo2463());
        }
        C13217 signature = c13964.getSignature();
        if (signature != null) {
            sb.append(' ');
            sb.append(signature.mo2463());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51723(C13217 c13217) {
        C1662 c1662;
        C18241 c18241 = this.f74970;
        if (c13217 == null || (c1662 = this.f74975) == null) {
            c18241.m42507(0);
        } else {
            c18241.m42507(c1662.m5631().m6830(c13217) + 1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51724(C13964 c13964) {
        C1662 c1662;
        C18241 c18241 = this.f74970;
        int iM42510 = c18241.m42510();
        c18241.m42517(4);
        m51728(c13964.m33421());
        m51723(c13964.getName());
        C12512 type = c13964.getType();
        if (type == null || (c1662 = this.f74975) == null) {
            c18241.m42507(0);
        } else {
            c18241.m42507(c1662.m5632().m39748(type) + 1);
        }
        m51723(c13964.getSignature());
        if (this.f74971 == null) {
            return;
        }
        m51721(c18241.m42510() - iM42510, String.format("%04x: +localx %s", Integer.valueOf(this.f74965), m51725(c13964)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51722(C6826 c6826) {
        int iM25588 = c6826.m18514().m25588();
        int iM18513 = c6826.m18513();
        int i = iM25588 - this.f74968;
        int i2 = iM18513 - this.f74965;
        if (i2 < 0) {
            throw new RuntimeException("Position entries must be in ascending address order");
        }
        if (i < -4 || i > 10) {
            m51720(i);
            i = 0;
        }
        int iM51719 = m51719(i, i2);
        if ((iM51719 & (-256)) > 0) {
            m51726(i2);
            iM51719 = m51719(i, 0);
            if ((iM51719 & (-256)) > 0) {
                m51720(i);
                iM51719 = m51719(0, 0);
                i2 = 0;
                i = 0;
            } else {
                i2 = 0;
            }
        }
        this.f74970.m42517(iM51719);
        this.f74968 += i;
        int i3 = this.f74965 + i2;
        this.f74965 = i3;
        if (this.f74971 == null) {
            return;
        }
        m51721(1, String.format("%04x: line %d", Integer.valueOf(i3), Integer.valueOf(this.f74968)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m51719(int i, int i2) {
        if (i < -4 || i > 10) {
            throw new RuntimeException("Parameter out of range");
        }
        return C23202.m51496(i2, 15, i - (-4), 10);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51720(int i) {
        C18241 c18241 = this.f74970;
        int iM42510 = c18241.m42510();
        c18241.m42517(2);
        c18241.m42519(i);
        this.f74968 += i;
        if (this.f74971 == null) {
            return;
        }
        m51721(c18241.m42510() - iM42510, String.format("line = %d", Integer.valueOf(this.f74968)));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m51726(int i) {
        C18241 c18241 = this.f74970;
        int iM42510 = c18241.m42510();
        c18241.m42517(1);
        c18241.m42507(i);
        this.f74965 += i;
        if (this.f74971 == null) {
            return;
        }
        m51721(c18241.m42510() - iM42510, String.format("%04x: advance pc", Integer.valueOf(this.f74965)));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m51728(int i) {
        if (i < 0) {
            throw new RuntimeException(C19370.m44628(i, "Signed value where unsigned required: "));
        }
        this.f74970.m42507(i);
    }
}
