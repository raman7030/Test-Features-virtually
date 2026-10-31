package l;

import bin.mt.json.JSON;
import com.google.android.material.color.ColorResourcesTableCreator;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۡᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9042 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final char[] f27416 = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public SoftReference f27417;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f27418;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public SoftReference f27419;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19626 f27420;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f27421;

    /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23316(C9042 c9042, C1986 c1986, int i, C23528 c23528, boolean z, C18878 c18878, C11138 c11138, String str, HashSet hashSet, C4766 c4766, int i2, ArrayList arrayList, int i3, C13232 c13232) {
        String str2;
        C23942 c23942;
        C1965 c1965;
        c9042.getClass();
        int i4 = c1986.f6644;
        int i5 = i4 + 1;
        c1986.f6644 = i5;
        if (i4 >= i && ((str2 = c23528.f75542) == null || c13232.m32096(str2))) {
            if (!z) {
                if (!"resource_table_id".equals(str)) {
                    if ("resource_table_name".equals(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(c13232.f39606);
                        sb.append("/");
                        String str3 = c13232.f39605;
                        sb.append(str3);
                        C1965 c1965M27623 = c11138.m27623(sb.toString(), "resource_table_type_name");
                        C1965 c1965M27624 = c1965M27623 != null ? c1965M27623 : c11138.m27623(str3, "resource_table_name");
                        if (c1965M27624 != null) {
                            c23942 = new C23942("resource", str, "name", c1965M27624, null, c13232, null, null, null, null);
                        } else {
                            c23942 = null;
                        }
                    } else {
                        c23942 = null;
                    }
                } else {
                    int i6 = c13232.f39608;
                    if (i6 != i2) {
                        c1965 = null;
                    } else {
                        String strM23294 = m23294(i6);
                        c1965 = new C1965("resource_table_id", 0, strM23294.length(), strM23294);
                    }
                    if (c1965 != null) {
                        c23942 = new C23942("resource", str, "id", c1965, null, c13232, null, null, null, null);
                    } else {
                        c23942 = null;
                    }
                }
            } else {
                final C18214 c18214 = new C18214(c18878, c23528, str, c13232, hashSet, c11138);
                m23314(c18878, c13232, new InterfaceC12527() { // from class: l.ܺܽۜ
                    @Override // l.InterfaceC12527
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo24676(InterfaceC7099 interfaceC7099, InterfaceC21211 interfaceC21211) {
                        return c18214.m42437(interfaceC7099, interfaceC21211);
                    }
                }, c4766);
                c23942 = c18214.f56611;
            }
            if (c23942 != null) {
                arrayList.add(c23942);
                if (arrayList.size() >= i3) {
                    c1986.f6645 = true;
                    c1986.f6646 = i5;
                    return true;
                }
            }
        }
        return false;
    }

    public C9042(C19626 c19626) {
        this.f27418 = new Object();
        this.f27420 = c19626;
        this.f27421 = new ArrayList();
    }

    public C9042(C19626 c19626, ArrayList arrayList) {
        this.f27418 = new Object();
        this.f27420 = c19626;
        this.f27421 = C4103.m12318(arrayList);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m23339() {
        return new ArrayList(this.f27421);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9042 m23304(C19626 c19626) {
        C9042 c9042 = new C9042(c19626);
        c9042.m23328();
        return c9042;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9042 m23305(C19626 c19626, ArrayList arrayList) {
        C9042 c9042 = new C9042(c19626, arrayList);
        c9042.m23328();
        return c9042;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6177 m23330(int i, int i2, String str, final HashSet hashSet) {
        String str2;
        final C18878 c18878M23328 = m23328();
        final C11822 c11822 = new C11822(str, i, i2);
        m23313(c18878M23328, new InterfaceC10411() { // from class: l.ۜܽۜ
            @Override // l.InterfaceC10411
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final boolean mo18654(C13232 c13232) {
                C11822 c11823 = c11822;
                ArrayList arrayList = c11823.f35269;
                c11823.f35273++;
                if (!c13232.m32096(c11823.f35274)) {
                    return false;
                }
                if (c11823.f35271 >= c11823.f35272 && arrayList.size() < c11823.f35270) {
                    arrayList.add(c13232);
                }
                c11823.f35271++;
                return false;
            }
        });
        ArrayList<C13232> arrayList = c11822.f35269;
        int size = arrayList.size() + c11822.f35272;
        int i3 = c11822.f35273;
        int i4 = c11822.f35271;
        C6177 c6177 = new C6177(arrayList, i3, i4, size, size < i4);
        C4766 c4766 = new C4766();
        for (C13232 c13232 : arrayList) {
            final C21037 c21037 = new C21037();
            m23314(c18878M23328, c13232, new InterfaceC12527() { // from class: l.ۢܽۜ
                @Override // l.InterfaceC12527
                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public final boolean mo24676(InterfaceC7099 interfaceC7099, InterfaceC21211 interfaceC21211) {
                    C21037 c21038 = c21037;
                    c21038.f67882.add(C2692.m8426(interfaceC7099));
                    c21038.f67881.add(C9042.m23326(interfaceC21211));
                    C11159 c11159M23308 = C9042.m23308(c18878M23328, interfaceC7099, interfaceC21211, 300, -1, 0, 0, hashSet, null);
                    if ("item_list".equals(c11159M23308.f33502)) {
                        return false;
                    }
                    c21038.f67880.add(c11159M23308);
                    return false;
                }
            }, c4766);
            c13232.f39610 = c21037.m47864().size();
            LinkedHashSet linkedHashSet = c21037.f67881;
            if (linkedHashSet.size() > 1) {
                str2 = "mixed";
            } else {
                str2 = linkedHashSet.contains("item_list") ? "item_list" : "single_value";
            }
            c13232.f39604 = str2;
            C11159 c11159 = null;
            for (C11159 c111510 : c21037.f67880) {
                if ("default".equals(c111510.f33488)) {
                    c11159 = c111510;
                    break;
                }
                if (c11159 == null || m23291(c111510.f33488, c11159.f33488) < 0) {
                    c11159 = c111510;
                }
            }
            c13232.f39609 = c11159;
        }
        return c6177;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23110 m23336(String str, HashSet hashSet) throws C3059 {
        C18878 c18878M23328 = m23328();
        int iM23324 = m23324(str, "locator");
        C15348 c15348 = new C15348(c18878M23328, iM23324, "default", 20, 4096, 32768, 50, 0, hashSet);
        m23312(c18878M23328, iM23324, new C20995(c15348));
        if (c15348.f47039 == null) {
            return null;
        }
        ArrayList arrayListM36385 = c15348.m36385();
        c15348.f47039.f39610 = arrayListM36385.size();
        String str2 = c15348.f47037;
        if (!"*".equals(str2) && !arrayListM36385.contains(str2)) {
            C3059 c3059M9364 = C3059.m9364("Resource variant not found", "variant", JSON.value("default"), C0899.m3247(arrayListM36385), JSON.object().add("variant", "default"));
            c3059M9364.f9609.put("availableVariants", C0899.m3247(arrayListM36385));
            throw c3059M9364;
        }
        c15348.m36386();
        ArrayList arrayList = c15348.f47031;
        int size = arrayList.size();
        int i = c15348.f47035;
        return new C23110(c15348.f47039, arrayListM36385, arrayList, size, size < i, i, "default");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23110 m23335(String str, String str2, int i, int i2, int i3, int i4, HashSet hashSet) throws C3059 {
        C18878 c18878M23328 = m23328();
        int iM23324 = m23324(str, "locator");
        C15348 c15348 = new C15348(c18878M23328, iM23324, str2, 1, i, i2, i3, i4, hashSet);
        m23312(c18878M23328, iM23324, new C20995(c15348));
        if (c15348.f47039 == null) {
            return null;
        }
        ArrayList arrayListM36385 = c15348.m36385();
        c15348.f47039.f39610 = arrayListM36385.size();
        if (!arrayListM36385.contains(str2)) {
            return new C23110(c15348.f47039, arrayListM36385, new ArrayList(), 0, false, 0, str2);
        }
        c15348.m36386();
        C13232 c13232 = c15348.f47039;
        ArrayList arrayList = c15348.f47031;
        return new C23110(c13232, arrayListM36385, arrayList, arrayList.size(), false, c15348.f47035, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7588 m23332(final C23528 c23528, final String str, final int i, final HashSet hashSet, final int i2) {
        final int i3;
        C16781 c16781 = c23528.f75548;
        final ArrayList arrayList = new ArrayList();
        if (i2 <= 0) {
            return new C7588(arrayList, i, true);
        }
        if (!"resource_table_id".equals(str)) {
            i3 = 0;
        } else {
            if (!"literal".equals(c16781.f51542)) {
                return new C7588(arrayList, i, false);
            }
            long jM23293 = m23293(c23528.f75538);
            if (jM23293 < 0) {
                return new C7588(arrayList, i, false);
            }
            i3 = (int) jM23293;
        }
        final C18878 c18878M23328 = m23328();
        final C11138 c11138M39517 = c16781.m39517();
        final boolean z = "resource_table_value".equals(str) || "resource_table_file_path".equals(str);
        final C4766 c4766 = z ? new C4766() : null;
        final C1986 c1986 = new C1986();
        m23313(c18878M23328, new InterfaceC10411() { // from class: l.ۡܽۜ
            @Override // l.InterfaceC10411
            /* JADX INFO: renamed from: ֫ */
            public final boolean mo18654(C13232 c13232) {
                return C9042.m23316(this.f27336, c1986, i, c23528, z, c18878M23328, c11138M39517, str, hashSet, c4766, i3, arrayList, i2, c13232);
            }
        });
        boolean z2 = c1986.f6645;
        return new C7588(arrayList, z2 ? c1986.f6646 : c1986.f6644, z2);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x019c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6925 m23331(String str, int i, int i2, int i3, HashSet hashSet) throws C3059 {
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        C17508 c17508;
        InterfaceC7099 interfaceC7099;
        HashSet hashSet2;
        InterfaceC0748 interfaceC0748;
        HashSet hashSet3;
        int i8;
        C17508 c17509;
        C17508 c175010;
        int i9 = i;
        C18878 c18878M23328 = m23328();
        String str2 = str;
        int iM23324 = m23324(str2, "locator");
        C4766 c4766 = new C4766();
        ArrayList arrayList = new ArrayList();
        C14587 c14587 = c18878M23328.f59510;
        InterfaceC9922 interfaceC9922M34846 = c14587.m34846();
        HashSet hashSet4 = new HashSet();
        Iterator it = interfaceC9922M34846.mo21936().iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                InterfaceC4277 interfaceC4277 = (InterfaceC4277) it.next();
                if (hashSet4.add(Integer.valueOf(interfaceC4277.mo12858()))) {
                    HashSet hashSet5 = new HashSet();
                    Iterator it2 = interfaceC4277.mo12850().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            InterfaceC0748 interfaceC0749 = (InterfaceC0748) it2.next();
                            if (hashSet5.add(Integer.valueOf(interfaceC0749.mo2870()))) {
                                HashSet hashSet6 = new HashSet();
                                Iterator it3 = interfaceC0749.mo2876().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        InterfaceC7099 interfaceC70910 = (InterfaceC7099) it3.next();
                                        Iterator it4 = interfaceC70910.mo18746().iterator();
                                        int i11 = i10;
                                        while (true) {
                                            if (it4.hasNext()) {
                                                InterfaceC21211 interfaceC21211 = (InterfaceC21211) it4.next();
                                                if (hashSet6.add(Integer.valueOf(interfaceC21211.mo47883()))) {
                                                    int i12 = i11 + 1;
                                                    if (i11 >= i9) {
                                                        C17508 c175011 = new C17508(arrayList, Math.max(0, i11 == i9 ? i2 : 0), i3);
                                                        C23858 c23858 = new C23858(c18878M23328, interfaceC70910, interfaceC21211);
                                                        int iMo47883 = interfaceC21211.mo47883();
                                                        Iterator it5 = c4766.m13929(interfaceC0749).iterator();
                                                        String str3 = str2;
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                InterfaceC7099 interfaceC70911 = (InterfaceC7099) it5.next();
                                                                if (interfaceC70911.mo2347(iMo47883)) {
                                                                    i6 = i11;
                                                                    InterfaceC21211 interfaceC21211Mo2346 = interfaceC70911.mo2346(iMo47883);
                                                                    if (interfaceC21211Mo2346 != null) {
                                                                        InterfaceC21211 interfaceC21211M23323 = m23323(c18878M23328, interfaceC70911, interfaceC21211Mo2346);
                                                                        int parent = interfaceC21211M23323.getParent();
                                                                        if (parent != 0 && parent == iM23324 && c175011.m40896(c23858, interfaceC70911, str3)) {
                                                                            c175010 = c175011;
                                                                        } else {
                                                                            boolean z2 = interfaceC21211M23323.mo29409() > 0 && !m23329(interfaceC21211M23323);
                                                                            Iterator it6 = interfaceC21211M23323.values().iterator();
                                                                            String str4 = str3;
                                                                            while (true) {
                                                                                if (it6.hasNext()) {
                                                                                    InterfaceC1454 interfaceC1454 = (InterfaceC1454) it6.next();
                                                                                    if (iM23324 == 0 || !z2) {
                                                                                        i8 = iMo47883;
                                                                                    } else {
                                                                                        int iMo5006 = interfaceC1454.mo5006();
                                                                                        if (iMo5006 == -1) {
                                                                                            i8 = iMo47883;
                                                                                        } else {
                                                                                            i8 = iMo47883;
                                                                                            if (!"style".equals(C2692.m8425(interfaceC70911.getType().getTypeName()))) {
                                                                                            }
                                                                                            if (iMo5006 == iM23324) {
                                                                                                c17509 = c175011;
                                                                                                if (c175011.m40894(c14587, c23858, interfaceC70911, interfaceC1454, str4, hashSet)) {
                                                                                                }
                                                                                                c175010 = c17509;
                                                                                            }
                                                                                            if (iM23324 == 0 && m23292(interfaceC1454) == iM23324) {
                                                                                                if (c17509.m40895(c14587, c23858, interfaceC70911, interfaceC1454, z2, str, hashSet)) {
                                                                                                    c175010 = c17509;
                                                                                                }
                                                                                            }
                                                                                            c175011 = c17509;
                                                                                            interfaceC0749 = interfaceC0749;
                                                                                            hashSet5 = hashSet5;
                                                                                            iMo47883 = i8;
                                                                                            interfaceC70910 = interfaceC70910;
                                                                                            hashSet6 = hashSet6;
                                                                                            str4 = str;
                                                                                        }
                                                                                        iMo5006 = 0;
                                                                                        if (iMo5006 == iM23324) {
                                                                                            c17509 = c175011;
                                                                                            if (c175011.m40894(c14587, c23858, interfaceC70911, interfaceC1454, str4, hashSet)) {
                                                                                            }
                                                                                            c175010 = c17509;
                                                                                        }
                                                                                        if (iM23324 == 0) {
                                                                                        }
                                                                                        c175011 = c17509;
                                                                                        interfaceC0749 = interfaceC0749;
                                                                                        hashSet5 = hashSet5;
                                                                                        iMo47883 = i8;
                                                                                        interfaceC70910 = interfaceC70910;
                                                                                        hashSet6 = hashSet6;
                                                                                        str4 = str;
                                                                                    }
                                                                                    c17509 = c175011;
                                                                                    if (iM23324 == 0) {
                                                                                    }
                                                                                    c175011 = c17509;
                                                                                    interfaceC0749 = interfaceC0749;
                                                                                    hashSet5 = hashSet5;
                                                                                    iMo47883 = i8;
                                                                                    interfaceC70910 = interfaceC70910;
                                                                                    hashSet6 = hashSet6;
                                                                                    str4 = str;
                                                                                } else {
                                                                                    i7 = iMo47883;
                                                                                    c17508 = c175011;
                                                                                    interfaceC7099 = interfaceC70910;
                                                                                    hashSet2 = hashSet6;
                                                                                    interfaceC0748 = interfaceC0749;
                                                                                    hashSet3 = hashSet5;
                                                                                    str3 = str;
                                                                                }
                                                                            }
                                                                        }
                                                                        i5 = c175010.f53477;
                                                                        z = true;
                                                                        i10 = i12;
                                                                        i4 = i6;
                                                                    }
                                                                    c175011 = c17508;
                                                                    i11 = i6;
                                                                    c18878M23328 = c18878M23328;
                                                                    interfaceC0749 = interfaceC0748;
                                                                    hashSet5 = hashSet3;
                                                                    iMo47883 = i7;
                                                                    interfaceC70910 = interfaceC7099;
                                                                    hashSet6 = hashSet2;
                                                                } else {
                                                                    i6 = i11;
                                                                }
                                                                i7 = iMo47883;
                                                                c17508 = c175011;
                                                                interfaceC7099 = interfaceC70910;
                                                                hashSet2 = hashSet6;
                                                                interfaceC0748 = interfaceC0749;
                                                                hashSet3 = hashSet5;
                                                                c175011 = c17508;
                                                                i11 = i6;
                                                                c18878M23328 = c18878M23328;
                                                                interfaceC0749 = interfaceC0748;
                                                                hashSet5 = hashSet3;
                                                                iMo47883 = i7;
                                                                interfaceC70910 = interfaceC7099;
                                                                hashSet6 = hashSet2;
                                                            }
                                                        }
                                                    }
                                                    str2 = str;
                                                    i9 = i;
                                                    i11 = i12;
                                                    c18878M23328 = c18878M23328;
                                                    interfaceC0749 = interfaceC0749;
                                                    hashSet5 = hashSet5;
                                                    interfaceC70910 = interfaceC70910;
                                                    hashSet6 = hashSet6;
                                                }
                                            } else {
                                                str2 = str;
                                                i9 = i;
                                                i10 = i11;
                                            }
                                        }
                                    } else {
                                        str2 = str;
                                        i9 = i;
                                    }
                                }
                            }
                        } else {
                            str2 = str;
                            i9 = i;
                        }
                    }
                }
            } else {
                i4 = 0;
                i5 = 0;
                z = false;
            }
            if (z) {
                i10 = i4;
            }
            if (!z) {
                i5 = 0;
            }
            return new C6925(i10, i5, arrayList, z);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12534 m23333() {
        C12534 c12534;
        C12534 c12535;
        SoftReference softReference = this.f27417;
        if (softReference != null && (c12535 = (C12534) softReference.get()) != null) {
            return c12535;
        }
        synchronized (this.f27418) {
            SoftReference softReference2 = this.f27417;
            if (softReference2 != null && (c12534 = (C12534) softReference2.get()) != null) {
                return c12534;
            }
            C14587 c14587 = m23328().f59510;
            C12534 c12536 = new C12534(c14587.m34846(), c14587.m34848());
            this.f27417 = new SoftReference(c12536);
            return c12536;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22405 m23337() {
        return new C22405(m23328());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22405 m23334(ArrayList arrayList) {
        C18878 c18878M23328 = m23328();
        return new C22405(new C18878(new C14587(new C8336(c18878M23328.f59510.m34846(), arrayList)), c18878M23328.f59511, c18878M23328.f59509));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C18878 m23328() {
        C18878 c18878;
        C18878 c18879;
        SoftReference softReference = this.f27419;
        if (softReference != null && (c18879 = (C18878) softReference.get()) != null) {
            return c18879;
        }
        synchronized (this.f27418) {
            SoftReference softReference2 = this.f27419;
            if (softReference2 != null && (c18878 = (C18878) softReference2.get()) != null) {
                return c18878;
            }
            C23326 c23326M45090 = this.f27420.m45090();
            AbstractC9049 c8336 = this.f27421.isEmpty() ? c23326M45090 : new C8336(c23326M45090, this.f27421);
            C18878 c188710 = new C18878(new C14587(c8336), m23299(c8336), c23326M45090);
            this.f27419 = new SoftReference(c188710);
            return c188710;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16096 m23338() {
        return C13979.m33438(m23328().f59510);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private HashMap m23299(AbstractC9049 abstractC9049) throws C3059 {
        HashMap map = new HashMap();
        for (C4103 c4103 : this.f27421) {
            boolean zM12329 = c4103.m12329();
            String str = c4103.f13039;
            int i = c4103.f13041;
            if (!zM12329) {
                InterfaceC7099 interfaceC7099M23321 = m23321(abstractC9049, i, str);
                if (interfaceC7099M23321 != null) {
                    int i2 = 65535 & i;
                    if (interfaceC7099M23321.mo2347(i2)) {
                        map.put(m23325(i, str), C23816.m52501(interfaceC7099M23321, i2, c4103.f13042));
                    }
                }
                throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Resource patch target is missing from base resources.arsc.");
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23312(C18878 c18878, int i, InterfaceC3355 interfaceC3355) {
        InterfaceC0748 interfaceC0748M23301;
        InterfaceC21211 interfaceC21211Mo2346;
        InterfaceC4277 interfaceC4277M23302 = m23302((i >>> 24) & 255, c18878.f59510.m34846());
        if (interfaceC4277M23302 == null || (interfaceC0748M23301 = m23301(interfaceC4277M23302, (i >>> 16) & 255)) == null) {
            return;
        }
        int i2 = i & 65535;
        for (InterfaceC7099 interfaceC7099 : interfaceC0748M23301.mo2876()) {
            if (interfaceC7099.mo2347(i2) && (interfaceC21211Mo2346 = interfaceC7099.mo2346(i2)) != null) {
                interfaceC3355.mo10253(interfaceC7099, m23323(c18878, interfaceC7099, interfaceC21211Mo2346));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23313(C18878 c18878, InterfaceC10411 interfaceC10411) {
        InterfaceC9922 interfaceC9922M34846 = c18878.f59510.m34846();
        HashSet hashSet = new HashSet();
        for (InterfaceC4277 interfaceC4277 : interfaceC9922M34846.mo21936()) {
            if (hashSet.add(Integer.valueOf(interfaceC4277.mo12858()))) {
                HashSet hashSet2 = new HashSet();
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (hashSet2.add(Integer.valueOf(interfaceC0748.mo2870()))) {
                        HashSet hashSet3 = new HashSet();
                        for (InterfaceC7099 interfaceC7099 : interfaceC0748.mo2876()) {
                            for (InterfaceC21211 interfaceC21211 : interfaceC7099.mo18746()) {
                                if (hashSet3.add(Integer.valueOf(interfaceC21211.mo47883())) && interfaceC10411.mo18654(m23327(m23323(c18878, interfaceC7099, interfaceC21211)))) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C13232 m23327(InterfaceC21211 interfaceC21211) {
        int iMo47884 = interfaceC21211.mo47884();
        InterfaceC4277 interfaceC4277Mo29407 = interfaceC21211.mo29407();
        InterfaceC0748 type = interfaceC21211.getType();
        interfaceC4277Mo29407.getClass();
        int iMo12858 = interfaceC4277Mo29407.mo12858();
        return new C13232(type.getTypeName(), iMo47884, iMo12858, type.mo2870(), interfaceC21211.mo47883(), interfaceC21211.mo29406());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23314(C18878 c18878, C13232 c13232, InterfaceC12527 interfaceC12527, C4766 c4766) {
        InterfaceC0748 interfaceC0748M23301;
        InterfaceC21211 interfaceC21211Mo2346;
        InterfaceC9922 interfaceC9922M34846 = c18878.f59510.m34846();
        int i = c13232.f39607;
        int i2 = c13232.f39603;
        InterfaceC4277 interfaceC4277M23302 = m23302(i, interfaceC9922M34846);
        if (interfaceC4277M23302 == null || (interfaceC0748M23301 = m23301(interfaceC4277M23302, c13232.f39611)) == null) {
            return;
        }
        for (InterfaceC7099 interfaceC7099 : c4766 == null ? m23297((Iterable) interfaceC0748M23301.mo2876()) : c4766.m13929(interfaceC0748M23301)) {
            if (interfaceC7099.mo2347(i2) && (interfaceC21211Mo2346 = interfaceC7099.mo2346(i2)) != null && interfaceC12527.mo24676(interfaceC7099, m23323(c18878, interfaceC7099, interfaceC21211Mo2346))) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m23297(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC7099) it.next());
        }
        C6083.sort(arrayList, new C2650());
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21211 m23323(C18878 c18878, InterfaceC7099 interfaceC7099, InterfaceC21211 interfaceC21211) {
        InterfaceC21211 interfaceC21212;
        return (c18878.f59511.isEmpty() || (interfaceC21212 = (InterfaceC21211) c18878.f59511.get(m23325(interfaceC21211.mo47884(), C2692.m8426(interfaceC7099)))) == null) ? interfaceC21211 : interfaceC21212;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m23325(int i, String str) {
        return m23294(i) + '\n' + str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC7099 m23321(InterfaceC9922 interfaceC9922, int i, String str) {
        InterfaceC0748 interfaceC0748M23301;
        InterfaceC4277 interfaceC4277M23302 = m23302((i >>> 24) & 255, interfaceC9922);
        if (interfaceC4277M23302 == null || (interfaceC0748M23301 = m23301(interfaceC4277M23302, (i >>> 16) & 255)) == null) {
            return null;
        }
        int i2 = i & 65535;
        for (InterfaceC7099 interfaceC7099 : interfaceC0748M23301.mo2876()) {
            if (C2692.m8426(interfaceC7099).equals(str) && interfaceC7099.mo2347(i2)) {
                return interfaceC7099;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23291(String str, String str2) {
        if (str.equals(str2)) {
            return 0;
        }
        if ("default".equals(str)) {
            return -1;
        }
        if ("default".equals(str2)) {
            return 1;
        }
        return str.compareTo(str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC4277 m23302(int i, InterfaceC9922 interfaceC9922) {
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i) {
                return interfaceC4277;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC0748 m23301(InterfaceC4277 interfaceC4277, int i) {
        for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
            if (interfaceC0748.mo2870() == i) {
                return interfaceC0748;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m23294(int i) {
        char[] cArr = new char[10];
        cArr[0] = '0';
        cArr[1] = 'x';
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[i2 + 2] = f27416[(i >>> (28 - (i2 * 4))) & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m23319(String str, String str2) {
        return m23294(m23324(str, str2));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m23324(String str, String str2) throws C3059 {
        long jM23293 = m23293(str);
        if (jM23293 < 0) {
            throw C3059.m9364(C20094.m46315("Invalid ", str2), str2, str == null ? null : JSON.value(str), JSON.array("0x00000000..0xffffffff"), JSON.object().add(str2, "0x7f010000"));
        }
        return (int) jM23293;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m23293(String str) {
        int i;
        if (str == null || str.length() != 10 || !str.regionMatches(true, 0, "0x", 0, 2)) {
            return -1L;
        }
        long j = 0;
        for (int i2 = 2; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= '0' && cCharAt <= '9') {
                i = cCharAt - '0';
            } else if (cCharAt < 'a' || cCharAt > 'f') {
                i = (cCharAt < 'A' || cCharAt > 'F') ? -1 : cCharAt - '7';
            } else {
                i = cCharAt - 'W';
            }
            if (i < 0) {
                return -1L;
            }
            j = (j << 4) | ((long) i);
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23315(int i, String str) {
        char c;
        if (str.length() <= 10) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (i2 == 0) {
                    c = '0';
                } else if (i2 == 1) {
                    c = 'x';
                } else {
                    c = f27416[(i >>> (28 - ((i2 - 2) * 4))) & 15];
                }
                char cCharAt = str.charAt(i2);
                if (cCharAt == c || cCharAt == Character.toUpperCase(c)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m23329(InterfaceC21211 interfaceC21211) {
        return interfaceC21211.mo29409() == 1 && interfaceC21211.getValue(0).mo5006() == -1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m23326(InterfaceC21211 interfaceC21211) {
        return (interfaceC21211.mo29409() <= 0 || m23329(interfaceC21211)) ? "single_value" : "item_list";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11159 m23308(C18878 c18878, InterfaceC7099 interfaceC7099, InterfaceC21211 interfaceC21211, int i, int i2, int i3, int i4, Set set, HashMap map) {
        C14587 c14587 = c18878.f59510;
        String strM8426 = C2692.m8426(interfaceC7099);
        int iMo29409 = interfaceC21211.mo29409();
        if (iMo29409 != 0) {
            C20331 c20331M33439 = i2 >= 0 ? C13979.m33439(c14587, interfaceC21211, i2) : null;
            if (m23329(interfaceC21211)) {
                return m23306(c18878, interfaceC21211.getValue(0), null, null, strM8426, i, i4, set, map, c20331M33439);
            }
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            for (InterfaceC1454 interfaceC1454 : interfaceC21211.values()) {
                if (i5 < i3) {
                    C0532 c0532M23320 = m23320(c14587, interfaceC7099, interfaceC1454.mo5006());
                    arrayList.add(m23306(c18878, interfaceC1454, c0532M23320.f2194, c0532M23320.f2195, strM8426, i, i4, set, map, null));
                }
                i5++;
            }
            return new C11159(null, null, strM8426, "item_list", false, false, null, null, null, null, null, arrayList, iMo29409 > i3, iMo29409, c20331M33439);
        }
        return new C11159(null, null, strM8426, "null_value", false, false, null, null, null, null, null, new ArrayList(), false, 0, i2 >= 0 ? C13979.m33439(c14587, interfaceC21211, i2) : null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11159 m23306(C18878 c18878, InterfaceC1454 interfaceC1454, String str, String str2, String str3, int i, int i2, Set set, HashMap map, C20331 c20331) {
        String str4;
        C13937 c13937;
        String str5;
        C13937 c13937M48989;
        C19584 c19584M23310 = m23310(c18878.f59510, interfaceC1454, i);
        String str6 = c19584M23310.f63272;
        String strM23296 = m23296(interfaceC1454, c19584M23310, set);
        if ("null_value".equals(strM23296)) {
            return new C11159(str, str2, str3, strM23296, false, false, null, null, null, null, null, new ArrayList(), false, 0, c20331);
        }
        if ("unparsed".equals(strM23296)) {
            return new C11159(str, str2, str3, strM23296, false, false, (str6 == null || str6.isEmpty()) ? null : C8163.m21635(0, str6.length(), 300, str6), null, null, null, null, new ArrayList(), false, 0, c20331);
        }
        String str7 = c19584M23310.f63276;
        int iM23292 = m23292(interfaceC1454);
        String strM23294 = iM23292 == 0 ? null : m23294(iM23292);
        String str8 = "file_path".equals(strM23296) ? c19584M23310.f63273 : null;
        if (i2 != 1 || iM23292 == 0) {
            str4 = strM23294;
            c13937 = null;
        } else {
            String strM23295 = m23294(iM23292);
            String strM50967 = C22870.m50967(str3, "\n", strM23295);
            if (map == null || !map.containsKey(strM50967)) {
                try {
                    str4 = strM23294;
                    str5 = strM50967;
                    try {
                        final C21700 c21700 = new C21700(c18878, iM23292, strM23295, str3, set);
                        m23312(c18878, iM23292, new InterfaceC3355() { // from class: l.ۘܽۜ
                            @Override // l.InterfaceC3355
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo10253(InterfaceC7099 interfaceC7099, InterfaceC21211 interfaceC21211) {
                                int iMo47884 = interfaceC21211.mo47884();
                                C21700 c21701 = c21700;
                                if (iMo47884 != c21701.f69596) {
                                    return;
                                }
                                if (c21701.f69601 == null) {
                                    c21701.f69601 = C9042.m23327(interfaceC21211);
                                }
                                C11159 c11159M23308 = C9042.m23308(c21701.f69595, interfaceC7099, interfaceC21211, 300, -1, 0, 0, c21701.f69602, null);
                                String strM8426 = C2692.m8426(interfaceC7099);
                                if (c21701.f69598.equals(strM8426)) {
                                    c21701.f69600 = c11159M23308;
                                } else if ("default".equals(strM8426)) {
                                    c21701.f69597 = c11159M23308;
                                }
                                C11159 c11159 = c21701.f69599;
                                if (c11159 == null || C9042.m23291(strM8426, c11159.f33488) < 0) {
                                    c21701.f69599 = c11159M23308;
                                }
                            }
                        });
                        c13937M48989 = c21700.m48989();
                    } catch (Exception unused) {
                        c13937M48989 = null;
                    }
                } catch (Exception unused2) {
                    str4 = strM23294;
                    str5 = strM50967;
                }
                if (map != null) {
                    map.put(str5, c13937M48989);
                }
                c13937 = c13937M48989;
            } else {
                c13937 = (C13937) map.get(strM50967);
                str4 = strM23294;
            }
        }
        return new C11159(str, str2, str3, strM23296, "styled_text".equals(strM23296), c19584M23310.f63275, str7, c20331 == null ? null : c20331.f65642, str8, str4, c13937, new ArrayList(), false, 0, c20331);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m23296(InterfaceC1454 interfaceC1454, C19584 c19584, Set set) {
        if (c19584.f63272 != null) {
            return "unparsed";
        }
        int iMo5004 = interfaceC1454.mo5004();
        if (iMo5004 == 0) {
            return "null_value";
        }
        if (iMo5004 == 3) {
            if (c19584.f63274) {
                return "styled_text";
            }
            String str = c19584.f63273;
            return (str == null || !set.contains(str)) ? TextBundle.TEXT_ENTRY : "file_path";
        }
        if (iMo5004 == 1 || iMo5004 == 7) {
            return Name.REFER;
        }
        if (iMo5004 == 2 || iMo5004 == 8) {
            return AnnotationHandler.ATTRIBUTE;
        }
        if (iMo5004 == 18) {
            return ClassTransform.BOOLEAN;
        }
        if (iMo5004 >= 28 && iMo5004 <= 31) {
            return ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR;
        }
        if (iMo5004 == 5) {
            return "dimension";
        }
        if (iMo5004 == 6) {
            return "fraction";
        }
        return (iMo5004 == 4 || iMo5004 == 16 || iMo5004 == 17) ? "number" : "unparsed";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19584 m23310(C14587 c14587, InterfaceC1454 interfaceC1454, int i) {
        CharSequence charSequenceM24585;
        boolean zMo10323;
        try {
            if (interfaceC1454.mo5004() == 3 && interfaceC1454.mo5008() != null) {
                InterfaceC3571 interfaceC3571Mo5008 = interfaceC1454.mo5008();
                charSequenceM24585 = interfaceC3571Mo5008.getValue();
                zMo10323 = interfaceC3571Mo5008.mo10323();
            } else {
                charSequenceM24585 = C9650.m24585(c14587, interfaceC1454);
                if (charSequenceM24585 instanceof InterfaceC3571) {
                    InterfaceC3571 interfaceC3571 = (InterfaceC3571) charSequenceM24585;
                    String value = interfaceC3571.getValue();
                    zMo10323 = interfaceC3571.mo10323();
                    charSequenceM24585 = value;
                } else {
                    zMo10323 = false;
                }
            }
            String strM21638 = C8163.m21638(charSequenceM24585.toString());
            if (i > 0) {
                String strM21636 = C8163.m21636(0, i, (CharSequence) strM21638);
                return new C19584(strM21636, null, strM21638, strM21636.codePointCount(0, strM21636.length()) < strM21638.codePointCount(0, strM21638.length()), zMo10323);
            }
            return new C19584(strM21638, null, strM21638, false, zMo10323);
        } catch (Exception e) {
            return new C19584("", e.getMessage() == null ? "Failed to format resource value" : e.getMessage(), null, false, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23292(InterfaceC1454 interfaceC1454) {
        int iMo5004 = interfaceC1454.mo5004();
        if (interfaceC1454.getValue() == 0) {
            return 0;
        }
        if (iMo5004 == 1 || iMo5004 == 7 || iMo5004 == 2 || iMo5004 == 8) {
            return interfaceC1454.getValue();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091 A[ADDED_TO_REGION, LOOP:0: B:28:0x0091->B:32:0x00a7, LOOP_START, PHI: r0
      0x0091: PHI (r0v4 int) = (r0v0 int), (r0v5 int) binds: [B:26:0x008e, B:32:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5 A[EDGE_INSN: B:31:0x00a5->B:33:0x00aa BREAK  A[LOOP:0: B:28:0x0091->B:32:0x00a7]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7 A[LOOP:0: B:28:0x0091->B:32:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C0532 m23320(C14587 c14587, InterfaceC7099 interfaceC7099, int i) {
        C16809 c16809M40933;
        String strMo32239;
        String strM23294 = null;
        if (i == -1) {
            return new C0532(null, 0);
        }
        int i2 = (i != -1 && "style".equals(C2692.m8425(interfaceC7099.getType().getTypeName()))) ? i : 0;
        String strM8425 = C2692.m8425(interfaceC7099.getType().getTypeName());
        if ("plurals".equals(strM8425)) {
            int i3 = i - 16777220;
            if (i3 >= 0 && i3 < 6) {
                strM23294 = InterfaceC1454.f5200[i3];
            } else {
                strMo32239 = c14587.mo32239(interfaceC7099.mo8396().mo12858(), i);
                if (strMo32239.length() != 8) {
                    strM23294 = strMo32239;
                    break;
                }
                for (int i4 = 0; i4 < 8; i4++) {
                    if (strMo32239.charAt(i4) != f27416[(i >>> (28 - (i4 * 4))) & 15]) {
                        strM23294 = strMo32239;
                        break;
                    }
                }
            }
        } else if ("style".equals(strM8425) && (c16809M40933 = c14587.m34848().m40933(i)) != null) {
            strM23294 = c14587.m34844(interfaceC7099.mo8396().mo12858(), (c16809M40933.f51604 >>> 24) & 255) + c16809M40933.f51605;
        } else {
            strMo32239 = c14587.mo32239(interfaceC7099.mo8396().mo12858(), i);
            if (strMo32239.length() != 8) {
                strM23294 = strMo32239;
                break;
            }
            while (i4 < 8) {
                if (strMo32239.charAt(i4) != f27416[(i >>> (28 - (i4 * 4))) & 15]) {
                    strM23294 = strMo32239;
                    break;
                }
            }
        }
        if (strM23294 == null) {
            strM23294 = m23294(i);
        }
        return new C0532(strM23294, i2);
    }
}
