package p067l;

import bin.p000mt.json.JSON;
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
public final class C10962 {

    /* JADX INFO: renamed from: ܳ */
    public static final char[] f30353 = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: ֫ */
    public SoftReference f30354;

    /* JADX INFO: renamed from: ۧ */
    public final Object f30355;

    /* JADX INFO: renamed from: ܽ */
    public SoftReference f30356;

    /* JADX INFO: renamed from: ܿ */
    public final C21021 f30357;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f30358;

    /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m25261(C10962 c10962, C4256 c4256, int i, C24729 c24729, boolean z, C20310 c20310, C12954 c12954, String str, HashSet hashSet, C6898 c6898, int i2, ArrayList arrayList, int i3, C14944 c14944) {
        String str2;
        C25123 c25123;
        C4236 c4236;
        c10962.getClass();
        int i4 = c4256.f9424;
        int i5 = i4 + 1;
        c4256.f9424 = i5;
        if (i4 >= i && ((str2 = c24729.f78288) == null || c14944.m34194(str2))) {
            if (!z) {
                if (!"resource_table_id".equals(str)) {
                    if ("resource_table_name".equals(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(c14944.f42670);
                        sb.append("/");
                        String str3 = c14944.f42669;
                        sb.append(str3);
                        C4236 c4236M29685 = c12954.m29685(sb.toString(), "resource_table_type_name");
                        C4236 c4236M29686 = c4236M29685 != null ? c4236M29685 : c12954.m29685(str3, "resource_table_name");
                        if (c4236M29686 != null) {
                            c25123 = new C25123("resource", str, "name", c4236M29686, null, c14944, null, null, null, null);
                        } else {
                            c25123 = null;
                        }
                    } else {
                        c25123 = null;
                    }
                } else {
                    int i6 = c14944.f42672;
                    if (i6 != i2) {
                        c4236 = null;
                    } else {
                        String strM25239 = m25239(i6);
                        c4236 = new C4236("resource_table_id", 0, strM25239.length(), strM25239);
                    }
                    if (c4236 != null) {
                        c25123 = new C25123("resource", str, "id", c4236, null, c14944, null, null, null, null);
                    } else {
                        c25123 = null;
                    }
                }
            } else {
                final C19679 c19679 = new C19679(c20310, c24729, str, c14944, hashSet, c12954);
                m25259(c20310, c14944, new InterfaceC14274() { // from class: l.ܺܽۜ
                    @Override // p067l.InterfaceC14274
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo26690(InterfaceC9116 interfaceC9116, InterfaceC22528 interfaceC22528) {
                        return c19679.m44698(interfaceC9116, interfaceC22528);
                    }
                }, c6898);
                c25123 = c19679.f59824;
            }
            if (c25123 != null) {
                arrayList.add(c25123);
                if (arrayList.size() >= i3) {
                    c4256.f9425 = true;
                    c4256.f9426 = i5;
                    return true;
                }
            }
        }
        return false;
    }

    public C10962(C21021 c21021) {
        this.f30355 = new Object();
        this.f30357 = c21021;
        this.f30358 = new ArrayList();
    }

    public C10962(C21021 c21021, ArrayList arrayList) {
        this.f30355 = new Object();
        this.f30357 = c21021;
        this.f30358 = C6268.m14223(arrayList);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList m25284() {
        return new ArrayList(this.f30358);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10962 m25249(C21021 c21021) {
        C10962 c10962 = new C10962(c21021);
        c10962.m25273();
        return c10962;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10962 m25250(C21021 c21021, ArrayList arrayList) {
        C10962 c10962 = new C10962(c21021, arrayList);
        c10962.m25273();
        return c10962;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8239 m25275(int i, int i2, String str, final HashSet hashSet) {
        String str2;
        final C20310 c20310M25273 = m25273();
        final C13604 c13604 = new C13604(str, i, i2);
        m25258(c20310M25273, new InterfaceC12263() { // from class: l.ۜܽۜ
            @Override // p067l.InterfaceC12263
            /* JADX INFO: renamed from: ֫ */
            public final boolean mo20603(C14944 c14944) {
                C13604 c13605 = c13604;
                ArrayList arrayList = c13605.f38271;
                c13605.f38275++;
                if (!c14944.m34194(c13605.f38276)) {
                    return false;
                }
                if (c13605.f38273 >= c13605.f38274 && arrayList.size() < c13605.f38272) {
                    arrayList.add(c14944);
                }
                c13605.f38273++;
                return false;
            }
        });
        ArrayList<C14944> arrayList = c13604.f38271;
        int size = arrayList.size() + c13604.f38274;
        int i3 = c13604.f38275;
        int i4 = c13604.f38273;
        C8239 c8239 = new C8239(arrayList, i3, i4, size, size < i4);
        C6898 c6898 = new C6898();
        for (C14944 c14944 : arrayList) {
            final C22362 c22362 = new C22362();
            m25259(c20310M25273, c14944, new InterfaceC14274() { // from class: l.ۢܽۜ
                @Override // p067l.InterfaceC14274
                /* JADX INFO: renamed from: ֫ */
                public final boolean mo26690(InterfaceC9116 interfaceC9116, InterfaceC22528 interfaceC22528) {
                    C22362 c22363 = c22362;
                    c22363.f70568.add(C4927.m10472(interfaceC9116));
                    c22363.f70567.add(C10962.m25271(interfaceC22528));
                    C12974 c12974M25253 = C10962.m25253(c20310M25273, interfaceC9116, interfaceC22528, 300, -1, 0, 0, hashSet, null);
                    if ("item_list".equals(c12974M25253.f36502)) {
                        return false;
                    }
                    c22363.f70566.add(c12974M25253);
                    return false;
                }
            }, c6898);
            c14944.f42674 = c22362.m50194().size();
            LinkedHashSet linkedHashSet = c22362.f70567;
            if (linkedHashSet.size() > 1) {
                str2 = "mixed";
            } else {
                str2 = linkedHashSet.contains("item_list") ? "item_list" : "single_value";
            }
            c14944.f42668 = str2;
            C12974 c12974 = null;
            for (C12974 c12975 : c22362.f70566) {
                if ("default".equals(c12975.f36488)) {
                    c12974 = c12975;
                    break;
                }
                if (c12974 == null || m25236(c12975.f36488, c12974.f36488) < 0) {
                    c12974 = c12975;
                }
            }
            c14944.f42673 = c12974;
        }
        return c8239;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24332 m25281(String str, HashSet hashSet) throws C5276 {
        C20310 c20310M25273 = m25273();
        int iM25269 = m25269(str, "locator");
        C16955 c16955 = new C16955(c20310M25273, iM25269, "default", 20, 4096, 32768, 50, 0, hashSet);
        m25257(c20310M25273, iM25269, new C22322(c16955));
        if (c16955.f50164 == null) {
            return null;
        }
        ArrayList arrayListM38543 = c16955.m38543();
        c16955.f50164.f42674 = arrayListM38543.size();
        String str2 = c16955.f50162;
        if (!"*".equals(str2) && !arrayListM38543.contains(str2)) {
            C5276 c5276M11406 = C5276.m11406("Resource variant not found", "variant", JSON.value("default"), C3223.m5566(arrayListM38543), JSON.object().add("variant", "default"));
            c5276M11406.f12412.put("availableVariants", C3223.m5566(arrayListM38543));
            throw c5276M11406;
        }
        c16955.m38544();
        ArrayList arrayList = c16955.f50156;
        int size = arrayList.size();
        int i = c16955.f50160;
        return new C24332(c16955.f50164, arrayListM38543, arrayList, size, size < i, i, "default");
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24332 m25280(String str, String str2, int i, int i2, int i3, int i4, HashSet hashSet) throws C5276 {
        C20310 c20310M25273 = m25273();
        int iM25269 = m25269(str, "locator");
        C16955 c16955 = new C16955(c20310M25273, iM25269, str2, 1, i, i2, i3, i4, hashSet);
        m25257(c20310M25273, iM25269, new C22322(c16955));
        if (c16955.f50164 == null) {
            return null;
        }
        ArrayList arrayListM38543 = c16955.m38543();
        c16955.f50164.f42674 = arrayListM38543.size();
        if (!arrayListM38543.contains(str2)) {
            return new C24332(c16955.f50164, arrayListM38543, new ArrayList(), 0, false, 0, str2);
        }
        c16955.m38544();
        C14944 c14944 = c16955.f50164;
        ArrayList arrayList = c16955.f50156;
        return new C24332(c14944, arrayListM38543, arrayList, arrayList.size(), false, c16955.f50160, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9580 m25277(final C24729 c24729, final String str, final int i, final HashSet hashSet, final int i2) {
        final int i3;
        C18317 c18317 = c24729.f78294;
        final ArrayList arrayList = new ArrayList();
        if (i2 <= 0) {
            return new C9580(arrayList, i, true);
        }
        if (!"resource_table_id".equals(str)) {
            i3 = 0;
        } else {
            if (!"literal".equals(c18317.f54724)) {
                return new C9580(arrayList, i, false);
            }
            long jM25238 = m25238(c24729.f78284);
            if (jM25238 < 0) {
                return new C9580(arrayList, i, false);
            }
            i3 = (int) jM25238;
        }
        final C20310 c20310M25273 = m25273();
        final C12954 c12954M41753 = c18317.m41753();
        final boolean z = "resource_table_value".equals(str) || "resource_table_file_path".equals(str);
        final C6898 c6898 = z ? new C6898() : null;
        final C4256 c4256 = new C4256();
        m25258(c20310M25273, new InterfaceC12263() { // from class: l.ۡܽۜ
            @Override // p067l.InterfaceC12263
            /* JADX INFO: renamed from: ֫ */
            public final boolean mo20603(C14944 c14944) {
                return C10962.m25261(this.f30270, c4256, i, c24729, z, c20310M25273, c12954M41753, str, hashSet, c6898, i3, arrayList, i2, c14944);
            }
        });
        boolean z2 = c4256.f9425;
        return new C9580(arrayList, z2 ? c4256.f9426 : c4256.f9424, z2);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x019c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final C8950 m25276(String str, int i, int i2, int i3, HashSet hashSet) throws C5276 {
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        C19008 c19008;
        InterfaceC9116 interfaceC9116;
        HashSet hashSet2;
        InterfaceC3080 interfaceC3080;
        HashSet hashSet3;
        int i8;
        C19008 c19009;
        C19008 c190010;
        int i9 = i;
        C20310 c20310M25273 = m25273();
        String str2 = str;
        int iM25269 = m25269(str2, "locator");
        C6898 c6898 = new C6898();
        ArrayList arrayList = new ArrayList();
        C16232 c16232 = c20310M25273.f62739;
        InterfaceC11799 interfaceC11799M36997 = c16232.m36997();
        HashSet hashSet4 = new HashSet();
        Iterator it = interfaceC11799M36997.mo23906().iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                InterfaceC6434 interfaceC6434 = (InterfaceC6434) it.next();
                if (hashSet4.add(Integer.valueOf(interfaceC6434.mo14722()))) {
                    HashSet hashSet5 = new HashSet();
                    Iterator it2 = interfaceC6434.mo14714().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            InterfaceC3080 interfaceC3081 = (InterfaceC3080) it2.next();
                            if (hashSet5.add(Integer.valueOf(interfaceC3081.mo5199()))) {
                                HashSet hashSet6 = new HashSet();
                                Iterator it3 = interfaceC3081.mo5205().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        InterfaceC9116 interfaceC9117 = (InterfaceC9116) it3.next();
                                        Iterator it4 = interfaceC9117.mo20696().iterator();
                                        int i11 = i10;
                                        while (true) {
                                            if (it4.hasNext()) {
                                                InterfaceC22528 interfaceC22528 = (InterfaceC22528) it4.next();
                                                if (hashSet6.add(Integer.valueOf(interfaceC22528.mo50213()))) {
                                                    int i12 = i11 + 1;
                                                    if (i11 >= i9) {
                                                        C19008 c190011 = new C19008(arrayList, Math.max(0, i11 == i9 ? i2 : 0), i3);
                                                        C25043 c25043 = new C25043(c20310M25273, interfaceC9117, interfaceC22528);
                                                        int iMo50213 = interfaceC22528.mo50213();
                                                        Iterator it5 = c6898.m15809(interfaceC3081).iterator();
                                                        String str3 = str2;
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                InterfaceC9116 interfaceC9118 = (InterfaceC9116) it5.next();
                                                                if (interfaceC9118.mo4718(iMo50213)) {
                                                                    i6 = i11;
                                                                    InterfaceC22528 interfaceC22528Mo4717 = interfaceC9118.mo4717(iMo50213);
                                                                    if (interfaceC22528Mo4717 != null) {
                                                                        InterfaceC22528 interfaceC22528M25268 = m25268(c20310M25273, interfaceC9118, interfaceC22528Mo4717);
                                                                        int parent = interfaceC22528M25268.getParent();
                                                                        if (parent != 0 && parent == iM25269 && c190011.m43154(c25043, interfaceC9118, str3)) {
                                                                            c190010 = c190011;
                                                                        } else {
                                                                            boolean z2 = interfaceC22528M25268.mo31471() > 0 && !m25274(interfaceC22528M25268);
                                                                            Iterator it6 = interfaceC22528M25268.values().iterator();
                                                                            String str4 = str3;
                                                                            while (true) {
                                                                                if (it6.hasNext()) {
                                                                                    InterfaceC3751 interfaceC3751 = (InterfaceC3751) it6.next();
                                                                                    if (iM25269 == 0 || !z2) {
                                                                                        i8 = iMo50213;
                                                                                    } else {
                                                                                        int iMo7249 = interfaceC3751.mo7249();
                                                                                        if (iMo7249 == -1) {
                                                                                            i8 = iMo50213;
                                                                                        } else {
                                                                                            i8 = iMo50213;
                                                                                            if (!"style".equals(C4927.m10471(interfaceC9118.getType().getTypeName()))) {
                                                                                            }
                                                                                            if (iMo7249 == iM25269) {
                                                                                                c19009 = c190011;
                                                                                                if (c190011.m43152(c16232, c25043, interfaceC9118, interfaceC3751, str4, hashSet)) {
                                                                                                }
                                                                                                c190010 = c19009;
                                                                                            }
                                                                                            if (iM25269 == 0 && m25237(interfaceC3751) == iM25269) {
                                                                                                if (c19009.m43153(c16232, c25043, interfaceC9118, interfaceC3751, z2, str, hashSet)) {
                                                                                                    c190010 = c19009;
                                                                                                }
                                                                                            }
                                                                                            c190011 = c19009;
                                                                                            interfaceC3081 = interfaceC3081;
                                                                                            hashSet5 = hashSet5;
                                                                                            iMo50213 = i8;
                                                                                            interfaceC9117 = interfaceC9117;
                                                                                            hashSet6 = hashSet6;
                                                                                            str4 = str;
                                                                                        }
                                                                                        iMo7249 = 0;
                                                                                        if (iMo7249 == iM25269) {
                                                                                            c19009 = c190011;
                                                                                            if (c190011.m43152(c16232, c25043, interfaceC9118, interfaceC3751, str4, hashSet)) {
                                                                                            }
                                                                                            c190010 = c19009;
                                                                                        }
                                                                                        if (iM25269 == 0) {
                                                                                        }
                                                                                        c190011 = c19009;
                                                                                        interfaceC3081 = interfaceC3081;
                                                                                        hashSet5 = hashSet5;
                                                                                        iMo50213 = i8;
                                                                                        interfaceC9117 = interfaceC9117;
                                                                                        hashSet6 = hashSet6;
                                                                                        str4 = str;
                                                                                    }
                                                                                    c19009 = c190011;
                                                                                    if (iM25269 == 0) {
                                                                                    }
                                                                                    c190011 = c19009;
                                                                                    interfaceC3081 = interfaceC3081;
                                                                                    hashSet5 = hashSet5;
                                                                                    iMo50213 = i8;
                                                                                    interfaceC9117 = interfaceC9117;
                                                                                    hashSet6 = hashSet6;
                                                                                    str4 = str;
                                                                                } else {
                                                                                    i7 = iMo50213;
                                                                                    c19008 = c190011;
                                                                                    interfaceC9116 = interfaceC9117;
                                                                                    hashSet2 = hashSet6;
                                                                                    interfaceC3080 = interfaceC3081;
                                                                                    hashSet3 = hashSet5;
                                                                                    str3 = str;
                                                                                }
                                                                            }
                                                                        }
                                                                        i5 = c190010.f56667;
                                                                        z = true;
                                                                        i10 = i12;
                                                                        i4 = i6;
                                                                    }
                                                                    c190011 = c19008;
                                                                    i11 = i6;
                                                                    c20310M25273 = c20310M25273;
                                                                    interfaceC3081 = interfaceC3080;
                                                                    hashSet5 = hashSet3;
                                                                    iMo50213 = i7;
                                                                    interfaceC9117 = interfaceC9116;
                                                                    hashSet6 = hashSet2;
                                                                } else {
                                                                    i6 = i11;
                                                                }
                                                                i7 = iMo50213;
                                                                c19008 = c190011;
                                                                interfaceC9116 = interfaceC9117;
                                                                hashSet2 = hashSet6;
                                                                interfaceC3080 = interfaceC3081;
                                                                hashSet3 = hashSet5;
                                                                c190011 = c19008;
                                                                i11 = i6;
                                                                c20310M25273 = c20310M25273;
                                                                interfaceC3081 = interfaceC3080;
                                                                hashSet5 = hashSet3;
                                                                iMo50213 = i7;
                                                                interfaceC9117 = interfaceC9116;
                                                                hashSet6 = hashSet2;
                                                            }
                                                        }
                                                    }
                                                    str2 = str;
                                                    i9 = i;
                                                    i11 = i12;
                                                    c20310M25273 = c20310M25273;
                                                    interfaceC3081 = interfaceC3081;
                                                    hashSet5 = hashSet5;
                                                    interfaceC9117 = interfaceC9117;
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
            return new C8950(i10, i5, arrayList, z);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14281 m25278() {
        C14281 c14281;
        C14281 c14282;
        SoftReference softReference = this.f30354;
        if (softReference != null && (c14282 = (C14281) softReference.get()) != null) {
            return c14282;
        }
        synchronized (this.f30355) {
            SoftReference softReference2 = this.f30354;
            if (softReference2 != null && (c14281 = (C14281) softReference2.get()) != null) {
                return c14281;
            }
            C16232 c16232 = m25273().f62739;
            C14281 c14283 = new C14281(c16232.m36997(), c16232.m36999());
            this.f30354 = new SoftReference(c14283);
            return c14283;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C23662 m25282() {
        return new C23662(m25273());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23662 m25279(ArrayList arrayList) {
        C20310 c20310M25273 = m25273();
        return new C23662(new C20310(new C16232(new C10291(c20310M25273.f62739.m36997(), arrayList)), c20310M25273.f62740, c20310M25273.f62738));
    }

    /* JADX INFO: renamed from: ܿ */
    private C20310 m25273() {
        C20310 c20310;
        C20310 c20311;
        SoftReference softReference = this.f30356;
        if (softReference != null && (c20311 = (C20310) softReference.get()) != null) {
            return c20311;
        }
        synchronized (this.f30355) {
            SoftReference softReference2 = this.f30356;
            if (softReference2 != null && (c20310 = (C20310) softReference2.get()) != null) {
                return c20310;
            }
            C24538 c24538M47386 = this.f30357.m47386();
            AbstractC10969 c10291 = this.f30358.isEmpty() ? c24538M47386 : new C10291(c24538M47386, this.f30358);
            C20310 c20312 = new C20310(new C16232(c10291), m25244(c10291), c24538M47386);
            this.f30356 = new SoftReference(c20312);
            return c20312;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C17666 m25283() {
        return C15654.m35558(m25273().f62739);
    }

    /* JADX INFO: renamed from: ֫ */
    private HashMap m25244(AbstractC10969 abstractC10969) throws C5276 {
        HashMap map = new HashMap();
        for (C6268 c6268 : this.f30358) {
            boolean zM14234 = c6268.m14234();
            String str = c6268.f15853;
            int i = c6268.f15855;
            if (!zM14234) {
                InterfaceC9116 interfaceC9116M25266 = m25266(abstractC10969, i, str);
                if (interfaceC9116M25266 != null) {
                    int i2 = 65535 & i;
                    if (interfaceC9116M25266.mo4718(i2)) {
                        map.put(m25270(i, str), C25003.m54910(interfaceC9116M25266, i2, c6268.f15856));
                    }
                }
                throw C5276.m11410("RESOURCE_PATCH_CORRUPT", "Resource patch target is missing from base resources.arsc.");
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25257(C20310 c20310, int i, InterfaceC5557 interfaceC5557) {
        InterfaceC3080 interfaceC3080M25246;
        InterfaceC22528 interfaceC22528Mo4717;
        InterfaceC6434 interfaceC6434M25247 = m25247((i >>> 24) & 255, c20310.f62739.m36997());
        if (interfaceC6434M25247 == null || (interfaceC3080M25246 = m25246(interfaceC6434M25247, (i >>> 16) & 255)) == null) {
            return;
        }
        int i2 = i & 65535;
        for (InterfaceC9116 interfaceC9116 : interfaceC3080M25246.mo5205()) {
            if (interfaceC9116.mo4718(i2) && (interfaceC22528Mo4717 = interfaceC9116.mo4717(i2)) != null) {
                interfaceC5557.mo12289(interfaceC9116, m25268(c20310, interfaceC9116, interfaceC22528Mo4717));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25258(C20310 c20310, InterfaceC12263 interfaceC12263) {
        InterfaceC11799 interfaceC11799M36997 = c20310.f62739.m36997();
        HashSet hashSet = new HashSet();
        for (InterfaceC6434 interfaceC6434 : interfaceC11799M36997.mo23906()) {
            if (hashSet.add(Integer.valueOf(interfaceC6434.mo14722()))) {
                HashSet hashSet2 = new HashSet();
                for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
                    if (hashSet2.add(Integer.valueOf(interfaceC3080.mo5199()))) {
                        HashSet hashSet3 = new HashSet();
                        for (InterfaceC9116 interfaceC9116 : interfaceC3080.mo5205()) {
                            for (InterfaceC22528 interfaceC22528 : interfaceC9116.mo20696()) {
                                if (hashSet3.add(Integer.valueOf(interfaceC22528.mo50213())) && interfaceC12263.mo20603(m25272(m25268(c20310, interfaceC9116, interfaceC22528)))) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static C14944 m25272(InterfaceC22528 interfaceC22528) {
        int iMo50214 = interfaceC22528.mo50214();
        InterfaceC6434 interfaceC6434Mo31469 = interfaceC22528.mo31469();
        InterfaceC3080 type = interfaceC22528.getType();
        interfaceC6434Mo31469.getClass();
        int iMo14722 = interfaceC6434Mo31469.mo14722();
        return new C14944(type.getTypeName(), iMo50214, iMo14722, type.mo5199(), interfaceC22528.mo50213(), interfaceC22528.mo31468());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25259(C20310 c20310, C14944 c14944, InterfaceC14274 interfaceC14274, C6898 c6898) {
        InterfaceC3080 interfaceC3080M25246;
        InterfaceC22528 interfaceC22528Mo4717;
        InterfaceC11799 interfaceC11799M36997 = c20310.f62739.m36997();
        int i = c14944.f42671;
        int i2 = c14944.f42667;
        InterfaceC6434 interfaceC6434M25247 = m25247(i, interfaceC11799M36997);
        if (interfaceC6434M25247 == null || (interfaceC3080M25246 = m25246(interfaceC6434M25247, c14944.f42675)) == null) {
            return;
        }
        for (InterfaceC9116 interfaceC9116 : c6898 == null ? m25242((Iterable) interfaceC3080M25246.mo5205()) : c6898.m15809(interfaceC3080M25246)) {
            if (interfaceC9116.mo4718(i2) && (interfaceC22528Mo4717 = interfaceC9116.mo4717(i2)) != null && interfaceC14274.mo26690(interfaceC9116, m25268(c20310, interfaceC9116, interfaceC22528Mo4717))) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m25242(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC9116) it.next());
        }
        C8150.sort(arrayList, new C4887());
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC22528 m25268(C20310 c20310, InterfaceC9116 interfaceC9116, InterfaceC22528 interfaceC22528) {
        InterfaceC22528 interfaceC22529;
        return (c20310.f62740.isEmpty() || (interfaceC22529 = (InterfaceC22528) c20310.f62740.get(m25270(interfaceC22528.mo50214(), C4927.m10472(interfaceC9116)))) == null) ? interfaceC22528 : interfaceC22529;
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m25270(int i, String str) {
        return m25239(i) + '\n' + str;
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC9116 m25266(InterfaceC11799 interfaceC11799, int i, String str) {
        InterfaceC3080 interfaceC3080M25246;
        InterfaceC6434 interfaceC6434M25247 = m25247((i >>> 24) & 255, interfaceC11799);
        if (interfaceC6434M25247 == null || (interfaceC3080M25246 = m25246(interfaceC6434M25247, (i >>> 16) & 255)) == null) {
            return null;
        }
        int i2 = i & 65535;
        for (InterfaceC9116 interfaceC9116 : interfaceC3080M25246.mo5205()) {
            if (C4927.m10472(interfaceC9116).equals(str) && interfaceC9116.mo4718(i2)) {
                return interfaceC9116;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m25236(String str, String str2) {
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

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC6434 m25247(int i, InterfaceC11799 interfaceC11799) {
        for (InterfaceC6434 interfaceC6434 : interfaceC11799.mo23906()) {
            if (interfaceC6434.mo14722() == i) {
                return interfaceC6434;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC3080 m25246(InterfaceC6434 interfaceC6434, int i) {
        for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
            if (interfaceC3080.mo5199() == i) {
                return interfaceC3080;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m25239(int i) {
        char[] cArr = new char[10];
        cArr[0] = '0';
        cArr[1] = 'x';
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[i2 + 2] = f30353[(i >>> (28 - (i2 * 4))) & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m25264(String str, String str2) {
        return m25239(m25269(str, str2));
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m25269(String str, String str2) throws C5276 {
        long jM25238 = m25238(str);
        if (jM25238 < 0) {
            throw C5276.m11406(C21466.m48631("Invalid ", str2), str2, str == null ? null : JSON.value(str), JSON.array("0x00000000..0xffffffff"), JSON.object().add(str2, "0x7f010000"));
        }
        return (int) jM25238;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m25238(String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m25260(int i, String str) {
        char c;
        if (str.length() <= 10) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (i2 == 0) {
                    c = '0';
                } else if (i2 == 1) {
                    c = 'x';
                } else {
                    c = f30353[(i >>> (28 - ((i2 - 2) * 4))) & 15];
                }
                char cCharAt = str.charAt(i2);
                if (cCharAt == c || cCharAt == Character.toUpperCase(c)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m25274(InterfaceC22528 interfaceC22528) {
        return interfaceC22528.mo31471() == 1 && interfaceC22528.getValue(0).mo7249() == -1;
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m25271(InterfaceC22528 interfaceC22528) {
        return (interfaceC22528.mo31471() <= 0 || m25274(interfaceC22528)) ? "single_value" : "item_list";
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12974 m25253(C20310 c20310, InterfaceC9116 interfaceC9116, InterfaceC22528 interfaceC22528, int i, int i2, int i3, int i4, Set set, HashMap map) {
        C16232 c16232 = c20310.f62739;
        String strM10472 = C4927.m10472(interfaceC9116);
        int iMo31471 = interfaceC22528.mo31471();
        if (iMo31471 != 0) {
            C21691 c21691M35559 = i2 >= 0 ? C15654.m35559(c16232, interfaceC22528, i2) : null;
            if (m25274(interfaceC22528)) {
                return m25251(c20310, interfaceC22528.getValue(0), null, null, strM10472, i, i4, set, map, c21691M35559);
            }
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            for (InterfaceC3751 interfaceC3751 : interfaceC22528.values()) {
                if (i5 < i3) {
                    C2874 c2874M25265 = m25265(c16232, interfaceC9116, interfaceC3751.mo7249());
                    arrayList.add(m25251(c20310, interfaceC3751, c2874M25265.f4967, c2874M25265.f4968, strM10472, i, i4, set, map, null));
                }
                i5++;
            }
            return new C12974(null, null, strM10472, "item_list", false, false, null, null, null, null, null, arrayList, iMo31471 > i3, iMo31471, c21691M35559);
        }
        return new C12974(null, null, strM10472, "null_value", false, false, null, null, null, null, null, new ArrayList(), false, 0, i2 >= 0 ? C15654.m35559(c16232, interfaceC22528, i2) : null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12974 m25251(C20310 c20310, InterfaceC3751 interfaceC3751, String str, String str2, String str3, int i, int i2, Set set, HashMap map, C21691 c21691) {
        String str4;
        C15614 c15614;
        String str5;
        C15614 c15614M51338;
        C20981 c20981M25255 = m25255(c20310.f62739, interfaceC3751, i);
        String str6 = c20981M25255.f65889;
        String strM25241 = m25241(interfaceC3751, c20981M25255, set);
        if ("null_value".equals(strM25241)) {
            return new C12974(str, str2, str3, strM25241, false, false, null, null, null, null, null, new ArrayList(), false, 0, c21691);
        }
        if ("unparsed".equals(strM25241)) {
            return new C12974(str, str2, str3, strM25241, false, false, (str6 == null || str6.isEmpty()) ? null : C10127.m23604(0, str6.length(), 300, str6), null, null, null, null, new ArrayList(), false, 0, c21691);
        }
        String str7 = c20981M25255.f65893;
        int iM25237 = m25237(interfaceC3751);
        String strM25239 = iM25237 == 0 ? null : m25239(iM25237);
        String str8 = "file_path".equals(strM25241) ? c20981M25255.f65890 : null;
        if (i2 != 1 || iM25237 == 0) {
            str4 = strM25239;
            c15614 = null;
        } else {
            String strM252310 = m25239(iM25237);
            String strM53357 = C24104.m53357(str3, "\n", strM252310);
            if (map == null || !map.containsKey(strM53357)) {
                try {
                    str4 = strM25239;
                    str5 = strM53357;
                    try {
                        final C22992 c22992 = new C22992(c20310, iM25237, strM252310, str3, set);
                        m25257(c20310, iM25237, new InterfaceC5557() { // from class: l.ۘܽۜ
                            @Override // p067l.InterfaceC5557
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo12289(InterfaceC9116 interfaceC9116, InterfaceC22528 interfaceC22528) {
                                int iMo50214 = interfaceC22528.mo50214();
                                C22992 c22993 = c22992;
                                if (iMo50214 != c22993.f72301) {
                                    return;
                                }
                                if (c22993.f72306 == null) {
                                    c22993.f72306 = C10962.m25272(interfaceC22528);
                                }
                                C12974 c12974M25253 = C10962.m25253(c22993.f72300, interfaceC9116, interfaceC22528, 300, -1, 0, 0, c22993.f72307, null);
                                String strM10472 = C4927.m10472(interfaceC9116);
                                if (c22993.f72303.equals(strM10472)) {
                                    c22993.f72305 = c12974M25253;
                                } else if ("default".equals(strM10472)) {
                                    c22993.f72302 = c12974M25253;
                                }
                                C12974 c12974 = c22993.f72304;
                                if (c12974 == null || C10962.m25236(strM10472, c12974.f36488) < 0) {
                                    c22993.f72304 = c12974M25253;
                                }
                            }
                        });
                        c15614M51338 = c22992.m51338();
                    } catch (Exception unused) {
                        c15614M51338 = null;
                    }
                } catch (Exception unused2) {
                    str4 = strM25239;
                    str5 = strM53357;
                }
                if (map != null) {
                    map.put(str5, c15614M51338);
                }
                c15614 = c15614M51338;
            } else {
                c15614 = (C15614) map.get(strM53357);
                str4 = strM25239;
            }
        }
        return new C12974(str, str2, str3, strM25241, "styled_text".equals(strM25241), c20981M25255.f65892, str7, c21691 == null ? null : c21691.f68316, str8, str4, c15614, new ArrayList(), false, 0, c21691);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m25241(InterfaceC3751 interfaceC3751, C20981 c20981, Set set) {
        if (c20981.f65889 != null) {
            return "unparsed";
        }
        int iMo7247 = interfaceC3751.mo7247();
        if (iMo7247 == 0) {
            return "null_value";
        }
        if (iMo7247 == 3) {
            if (c20981.f65891) {
                return "styled_text";
            }
            String str = c20981.f65890;
            return (str == null || !set.contains(str)) ? TextBundle.TEXT_ENTRY : "file_path";
        }
        if (iMo7247 == 1 || iMo7247 == 7) {
            return Name.REFER;
        }
        if (iMo7247 == 2 || iMo7247 == 8) {
            return AnnotationHandler.ATTRIBUTE;
        }
        if (iMo7247 == 18) {
            return ClassTransform.BOOLEAN;
        }
        if (iMo7247 >= 28 && iMo7247 <= 31) {
            return ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR;
        }
        if (iMo7247 == 5) {
            return "dimension";
        }
        if (iMo7247 == 6) {
            return "fraction";
        }
        return (iMo7247 == 4 || iMo7247 == 16 || iMo7247 == 17) ? "number" : "unparsed";
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20981 m25255(C16232 c16232, InterfaceC3751 interfaceC3751, int i) {
        CharSequence charSequenceM26599;
        boolean zMo12361;
        try {
            if (interfaceC3751.mo7247() == 3 && interfaceC3751.mo7251() != null) {
                InterfaceC5763 interfaceC5763Mo7251 = interfaceC3751.mo7251();
                charSequenceM26599 = interfaceC5763Mo7251.getValue();
                zMo12361 = interfaceC5763Mo7251.mo12361();
            } else {
                charSequenceM26599 = C11540.m26599(c16232, interfaceC3751);
                if (charSequenceM26599 instanceof InterfaceC5763) {
                    InterfaceC5763 interfaceC5763 = (InterfaceC5763) charSequenceM26599;
                    String value = interfaceC5763.getValue();
                    zMo12361 = interfaceC5763.mo12361();
                    charSequenceM26599 = value;
                } else {
                    zMo12361 = false;
                }
            }
            String strM23607 = C10127.m23607(charSequenceM26599.toString());
            if (i > 0) {
                String strM23605 = C10127.m23605(0, i, (CharSequence) strM23607);
                return new C20981(strM23605, null, strM23607, strM23605.codePointCount(0, strM23605.length()) < strM23607.codePointCount(0, strM23607.length()), zMo12361);
            }
            return new C20981(strM23607, null, strM23607, false, zMo12361);
        } catch (Exception e) {
            return new C20981("", e.getMessage() == null ? "Failed to format resource value" : e.getMessage(), null, false, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m25237(InterfaceC3751 interfaceC3751) {
        int iMo7247 = interfaceC3751.mo7247();
        if (interfaceC3751.getValue() == 0) {
            return 0;
        }
        if (iMo7247 == 1 || iMo7247 == 7 || iMo7247 == 2 || iMo7247 == 8) {
            return interfaceC3751.getValue();
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
    /* JADX INFO: renamed from: ۧ */
    public static C2874 m25265(C16232 c16232, InterfaceC9116 interfaceC9116, int i) {
        C18344 c18344M43191;
        String strMo34338;
        String strM25239 = null;
        if (i == -1) {
            return new C2874(null, 0);
        }
        int i2 = (i != -1 && "style".equals(C4927.m10471(interfaceC9116.getType().getTypeName()))) ? i : 0;
        String strM10471 = C4927.m10471(interfaceC9116.getType().getTypeName());
        if ("plurals".equals(strM10471)) {
            int i3 = i - 16777220;
            if (i3 >= 0 && i3 < 6) {
                strM25239 = InterfaceC3751.f7973[i3];
            } else {
                strMo34338 = c16232.mo34338(interfaceC9116.mo10442().mo14722(), i);
                if (strMo34338.length() != 8) {
                    strM25239 = strMo34338;
                    break;
                }
                for (int i4 = 0; i4 < 8; i4++) {
                    if (strMo34338.charAt(i4) != f30353[(i >>> (28 - (i4 * 4))) & 15]) {
                        strM25239 = strMo34338;
                        break;
                    }
                }
            }
        } else if ("style".equals(strM10471) && (c18344M43191 = c16232.m36999().m43191(i)) != null) {
            strM25239 = c16232.m36995(interfaceC9116.mo10442().mo14722(), (c18344M43191.f54786 >>> 24) & 255) + c18344M43191.f54787;
        } else {
            strMo34338 = c16232.mo34338(interfaceC9116.mo10442().mo14722(), i);
            if (strMo34338.length() != 8) {
                strM25239 = strMo34338;
                break;
            }
            while (i4 < 8) {
                if (strMo34338.charAt(i4) != f30353[(i >>> (28 - (i4 * 4))) & 15]) {
                    strM25239 = strMo34338;
                    break;
                }
            }
        }
        if (strM25239 == null) {
            strM25239 = m25239(i);
        }
        return new C2874(strM25239, i2);
    }
}
