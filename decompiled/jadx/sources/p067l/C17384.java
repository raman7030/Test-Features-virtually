package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.Reference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Predicate;
import org.simpleframework.xml.core.Entry;

/* JADX INFO: renamed from: l.ܺ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P77N */
/* JADX INFO: loaded from: classes.dex */
public final class C17384 {

    /* JADX INFO: renamed from: ۜۡܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f82247;

    /* JADX INFO: renamed from: ܽ */
    public static final RuntimeException f51869;

    /* JADX INFO: renamed from: ֫ */
    public final C13480 f51870;

    /* JADX INFO: renamed from: ۧ */
    public final C12107 f51871;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized String m39578(C16484 c16484, String str, String str2, C17502 c17502) {
        if (m39567(str)) {
            return this.f51870.m30628(c16484, str2, false, c17502).f51074;
        }
        AbstractC17043 abstractC17043M39546 = m39546(c16484, str);
        C12196 c12196 = (C12196) m39446(abstractC17043M39546, c17502).get(str2);
        if (c12196 != null) {
            return m39569(m39528(abstractC17043M39546, c12196));
        }
        if (m39527(abstractC17043M39546, str2) != null) {
            throw C19553.m44405(c16484.f48416, str);
        }
        return this.f51870.m30628(c16484, str2, false, c17502).f51074;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized ArrayList m39580(C16484 c16484, String str, boolean z, C17502 c17502) {
        if (m39567(str)) {
            return c16484.f48430;
        }
        if (!z) {
            m39554(c16484, str, c17502);
        }
        C9513 c9513M39462 = m39462(c16484, str, m39546(c16484, str), c17502);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (C19160 c19160 : c16484.f48430) {
            if (!c9513M39462.f26042.contains(c19160.f57226) && !c9513M39462.f26046.containsKey(c19160.f57226)) {
                arrayList.add(c19160);
                hashSet.add(c19160.f57226);
            }
        }
        for (C12196 c12196 : c9513M39462.f26044.values()) {
            if (!c9513M39462.f26042.contains(c12196.f34100) && hashSet.add(c12196.f34100)) {
                arrayList.add(new C19160(c12196.f34102, -1, -1, c12196.f34100));
            }
        }
        C8150.sort(arrayList, C10162.comparing(new C21086(3)));
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C7295 m39582(C16484 c16484, C21850 c21850, C17502 c17502) {
        AbstractC17043 abstractC17043M39546 = m39546(c16484, c21850.f68747);
        if ("smali_class".equals(c21850.f68749)) {
            return m39525(c16484, abstractC17043M39546, c21850);
        }
        if ("smali_method".equals(c21850.f68749)) {
            return m39460(c16484, abstractC17043M39546, c21850, c17502);
        }
        if (!"axml".equals(c21850.f68749) && !"zip_entry".equals(c21850.f68749)) {
            throw m39549(c21850.f68749);
        }
        return m39459(c16484, abstractC17043M39546, c21850);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C7965 m39583(C16484 c16484, C17154 c17154) {
        C24176 c24176M21927;
        try {
            AbstractC17043 abstractC17043M39546 = m39546(c16484, c17154.f51088);
            c24176M21927 = C9424.m21927(this.f51871.m28001(c16484, this, c17154.f51088), c17154);
            ArrayList arrayList = new ArrayList();
            for (C6268 c6268 : c24176M21927.f76656) {
                arrayList.add(new C15547(C16111.m36665(c6268.f15860), c6268));
            }
            this.f51871.m28000(c16484.f48416, c17154.f51088);
            try {
                m39486(abstractC17043M39546, arrayList);
                C4216.m8561(abstractC17043M39546);
            } catch (IOException e) {
                throw m39450(e);
            }
        } catch (C5276 e2) {
            e2.f12412.put("workspaceId", c16484.f48416).put("editSessionId", c17154.f51088);
            throw e2;
        }
        return new C7965(c16484.f48416, c17154.f51088, c24176M21927.f76657);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C11042 m39586(C16484 c16484, C8636 c8636, OutputStream outputStream) {
        long jM39433;
        String str = c8636.f23189;
        m39572(str);
        m39575(c16484, c8636.f23188, str);
        C4820 c4820M39558 = m39558(c16484, c8636.f23188, str);
        String str2 = c8636.f23188;
        if (c4820M39558.f10955) {
            throw m39455(c16484, str2, str, "directory");
        }
        if (c4820M39558.f10954) {
            throw m39455(c16484, str2, str, "axml_entry");
        }
        if (m39567(str2)) {
            if (c4820M39558.f10956) {
                long jM39434 = m39433(c16484, c8636.f23188, str, outputStream);
                return new C11042(c16484.f48416, c8636.f23188, str, jM39434, null);
            }
            String str3 = c8636.f23188;
            C5276 c5276M11405 = C5276.m11405("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
            m39478(c5276M11405, c16484, str3, str);
            throw c5276M11405;
        }
        AbstractC17043 abstractC17043M39546 = m39546(c16484, c8636.f23188);
        if (m39545(abstractC17043M39546).contains(str)) {
            String str4 = c8636.f23188;
            C5276 c5276M11406 = C5276.m11405("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
            m39478(c5276M11406, c16484, str4, str);
            throw c5276M11406;
        }
        C14207 c14207 = (C14207) m39557(abstractC17043M39546).get(str);
        int i = m39568(abstractC17043M39546).f72140;
        if (c14207 != null) {
            String str5 = c8636.f23188;
            AbstractC17043 abstractC17043M38684 = m39540(abstractC17043M39546).m38684(C20186.m45682(str)).m38684("data.bin");
            if ("axml".equals(c14207.f40482) || m39499(abstractC17043M38684, m39428(abstractC17043M38684))) {
                throw m39455(c16484, str5, str, "axml_entry");
            }
            String str6 = c8636.f23188;
            AbstractC17043 abstractC17043M38685 = m39540(abstractC17043M39546).m38684(C20186.m45682(str)).m38684("data.bin");
            m39428(abstractC17043M38685);
            try {
                try {
                    jM39433 = m39432(c16484, str6, str, abstractC17043M38685.mo29987(), outputStream);
                } catch (RuntimeException e) {
                    if (m39538(e)) {
                        throw m39454(c16484, str6, str, e);
                    }
                    throw e;
                }
            } catch (IOException e2) {
                throw m39454(c16484, str6, str, e2);
            }
        } else {
            if (!c4820M39558.f10956) {
                String str7 = c8636.f23188;
                C5276 c5276M11407 = C5276.m11405("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
                m39478(c5276M11407, c16484, str7, str);
                throw c5276M11407;
            }
            jM39433 = m39433(c16484, c8636.f23188, str, outputStream);
        }
        String str8 = c8636.f23188;
        Integer numValueOf = Integer.valueOf(i);
        return new C11042(c16484.f48416, str8, str, jM39433, numValueOf);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C14000 m39588(C16484 c16484, C9779 c9779) {
        AbstractC17043 abstractC17043M39546 = m39546(c16484, c9779.f27009);
        if (m39545(abstractC17043M39546).contains(c9779.f27010)) {
            throw m39522();
        }
        C14207 c14207 = (C14207) m39557(abstractC17043M39546).get(c9779.f27010);
        ArrayList arrayList = new ArrayList(c9779.f27011);
        C8150.sort(arrayList, C10162.comparingInt(new C8431()));
        m39531(arrayList);
        m39481(c16484, abstractC17043M39546, c14207, c9779.f27010);
        if (c14207 == null || !"zip_entry".equals(c14207.f40482)) {
            return m39465(c16484, abstractC17043M39546, c9779, arrayList);
        }
        return m39466(abstractC17043M39546, c9779, arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C19167 m39589(C16484 c16484, String str, String str2) {
        C13220 c13220;
        c13220 = new C13220();
        m39593(c16484, str, str2, c13220);
        return new C19167(c13220.toString(), "full_source", false, null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C20036 m39590(C16484 c16484, String str) {
        AbstractC17043 abstractC17043M39546;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList<C17352> arrayListM39445;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayListM39545;
        String str2;
        abstractC17043M39546 = m39546(c16484, str);
        m39430(c16484, abstractC17043M39546, (C17502) null);
        C22718 c22718M39510 = m39510(c16484, str);
        if (c22718M39510.f71658 > 0) {
            throw m39456(c16484, str, c22718M39510);
        }
        ArrayList<C12196> arrayList6 = new ArrayList(m39519(abstractC17043M39546).values());
        C8150.sort(arrayList6, C16866.thenComparing(C10162.comparing(new C9772()), new C4149()));
        arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (C12196 c12196 : arrayList6) {
            String strM45682 = C20186.m45682(m39569(m39528(abstractC17043M39546, c12196)));
            C20243 c20243M39529 = m39529(abstractC17043M39546, c12196, strM45682);
            if (c20243M39529 == null) {
                throw m39456(c16484, str, m39510(c16484, str));
            }
            arrayList.add(new C4613(c12196.f34101, c12196.f34102, c20243M39529.f62580, strM45682));
            hashSet.add(c12196.f34102);
        }
        arrayList2 = new ArrayList();
        for (C16888 c16888 : m39515(abstractC17043M39546)) {
            String str3 = c16888.f49998;
            if (str3 == null || (str2 = c16888.f49999) == null) {
                throw m39448();
            }
            arrayList2.add(new C10648(str3, str2));
            hashSet.add(c16888.f49999);
        }
        C8150.sort(arrayList2, C16866.thenComparing(C10162.comparing(new C6705(3)), new C9668(3)));
        arrayList3 = new ArrayList(hashSet);
        C8150.sort(arrayList3, C19831.m45077());
        arrayListM39445 = m39445(c16484, abstractC17043M39546);
        arrayList4 = new ArrayList();
        arrayList5 = new ArrayList();
        for (C17352 c17352 : arrayListM39445) {
            if (c17352.f51743) {
                arrayList5.add(c17352.f51742);
            } else {
                arrayList4.add(c17352.f51742);
            }
        }
        arrayListM39545 = m39545(abstractC17043M39546);
        C8150.sort(arrayList4, new C16596());
        C8150.sort(arrayList5, new C16596());
        C8150.sort(arrayListM39545, new C16596());
        return new C20036(str, m39568(abstractC17043M39546).f72140, abstractC17043M39546.m38684("cache").m38684("dex_build"), arrayList, arrayList2, arrayList3, arrayListM39445, arrayList4, arrayList5, arrayListM39545);
    }

    /* JADX INFO: renamed from: ֫ */
    public native synchronized C22718 m39591(C16484 c16484);

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C22718 m39592(C16484 c16484, C8438 c8438, C17502 c17502) {
        AbstractC17043 abstractC17043M39546 = m39546(c16484, c8438.f22623);
        if ("smali_class".equals(c8438.f22628)) {
            return m39474(c16484, abstractC17043M39546, c8438, c17502);
        }
        if ("smali_method".equals(c8438.f22628)) {
            return m39530(c16484, abstractC17043M39546, c8438, c17502);
        }
        if (!"axml".equals(c8438.f22628) && !"zip_entry".equals(c8438.f22628)) {
            throw m39549(c8438.f22628);
        }
        return m39473(c16484, abstractC17043M39546, c8438);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m39593(C16484 c16484, String str, String str2, C13220 c13220) {
        c13220.m30229(0);
        if (!m39567(str)) {
            AbstractC17043 abstractC17043M39546 = m39546(c16484, str);
            C14877 c14877M39526 = m39526(c16484, abstractC17043M39546, str2);
            if (c14877M39526.f42412 || "missing".equals(c14877M39526.f42413)) {
                throw m39522();
            }
            if (!"axml".equals(c14877M39526.f42413)) {
                throw C5276.m11405("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
            }
            if (((C14207) m39557(abstractC17043M39546).get(str2)) != null) {
                m39491(m39540(abstractC17043M39546).m38684(C20186.m45682(str2)).m38684("text.xml"), c13220);
                return;
            }
        }
        m39532(c16484, str, str2, c13220);
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized int m39595(C16484 c16484, String str) {
        if (m39567(str)) {
            return 0;
        }
        return m39568(m39546(c16484, str)).f72140;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized C3974 m39596(C16484 c16484, String str, C17502 c17502) {
        if (m39567(str)) {
            return new C3974(new ArrayList(c16484.f48424), new HashMap(), new HashSet());
        }
        AbstractC17043 abstractC17043M39546 = m39546(c16484, str);
        C9513 c9513M39462 = m39462(c16484, str, abstractC17043M39546, c17502);
        ArrayList arrayListM39444 = m39444(c16484, c9513M39462);
        HashMap map = new HashMap();
        for (C12196 c12196 : c9513M39462.f26046.values()) {
            map.put(c12196.f34100, m39528(abstractC17043M39546, c12196));
        }
        return new C3974(arrayListM39444, map, new HashSet(c9513M39462.f26042));
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized C9952 m39597(C16484 c16484, String str, C19160 c19160, C17502 c17502) {
        if (m39567(str)) {
            return this.f51870.m30627(c16484, c19160, c17502);
        }
        AbstractC17043 abstractC17043M39546 = m39546(c16484, str);
        C9513 c9513M39462 = m39462(c16484, str, abstractC17043M39546, c17502);
        C12196 c12196 = (C12196) c9513M39462.f26046.get(c19160.f57226);
        if (c12196 == null) {
            if (c9513M39462.f26042.contains(c19160.f57226)) {
                throw C19553.m44405(c16484.f48416, str);
            }
            return this.f51870.m30627(c16484, c19160, c17502);
        }
        String strM39569 = m39569(m39528(abstractC17043M39546, c12196));
        String strM45682 = C20186.m45682(strM39569);
        C20243 c20243M39529 = m39529(abstractC17043M39546, c12196, strM45682);
        if (c20243M39529 != null) {
            return c20243M39529.f62580;
        }
        m39429(c16484, abstractC17043M39546, c12196, strM39569);
        C20243 c20243M395210 = m39529(abstractC17043M39546, c12196, strM45682);
        if (c20243M395210 == null) {
            throw m39456(c16484, str, m39510(c16484, str));
        }
        return c20243M395210.f62580;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized C17147 m39598(C16484 c16484, String str, String str2, C17502 c17502) {
        if (m39567(str)) {
            return this.f51870.m30628(c16484, str2, true, c17502);
        }
        AbstractC17043 abstractC17043M39546 = m39546(c16484, str);
        C12196 c12196 = (C12196) m39446(abstractC17043M39546, c17502).get(str2);
        if (c12196 == null) {
            if (m39527(abstractC17043M39546, str2) != null) {
                throw C19553.m44405(c16484.f48416, str);
            }
            return this.f51870.m30628(c16484, str2, true, c17502);
        }
        String strM39569 = m39569(m39528(abstractC17043M39546, c12196));
        C9952 c9952M39585 = m39585(c16484, str, new C19160(c12196.f34102, -1, -1, c12196.f34100), c17502);
        return new C17147(strM39569, C10685.m24618(c9952M39585), C10685.m24609(c9952M39585));
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized C19167 m39599(C16484 c16484, String str, String str2) {
        if (!m39567(str)) {
            AbstractC17043 abstractC17043M39546 = m39546(c16484, str);
            if (m39545(abstractC17043M39546).contains(str2)) {
                throw m39522();
            }
            C14207 c14207 = (C14207) m39557(abstractC17043M39546).get(str2);
            if (c14207 != null) {
                if ("axml".equals(c14207.f40482)) {
                    throw C19553.m44415(c16484.f48416, str, str2);
                }
                try {
                    InputStream inputStreamMo29987 = m39540(abstractC17043M39546).m38684(C20186.m45682(str2)).m38684("data.bin").mo29987();
                    try {
                        byte[] bArrM39503 = m39503(inputStreamMo29987, 10485776);
                        C19167 c19167M39469 = m39469(c16484, str, str2, bArrM39503, bArrM39503.length > 10485760);
                        if (inputStreamMo29987 != null) {
                            inputStreamMo29987.close();
                        }
                        return c19167M39469;
                    } catch (Throwable th) {
                        if (inputStreamMo29987 != null) {
                            try {
                                inputStreamMo29987.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw m39450(e);
                }
            }
        }
        return m39541(c16484, str, str2);
    }

    /* JADX INFO: renamed from: ܳ */
    public final synchronized ArrayList m39600(C16484 c16484, String str) {
        if (m39567(str)) {
            return new ArrayList();
        }
        return m39521(c16484, m39546(c16484, str));
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized ArrayList m39601(C16484 c16484, String str) {
        if (m39567(str)) {
            return c16484.f48428;
        }
        AbstractC17043 abstractC17043M39546 = m39546(c16484, str);
        HashSet hashSet = new HashSet(m39545(abstractC17043M39546));
        HashMap mapM39557 = m39557(abstractC17043M39546);
        boolean zIsEmpty = m39521(c16484, abstractC17043M39546).isEmpty();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        for (C15554 c15554 : c16484.f48428) {
            hashSet2.add(c15554.f44436);
            if (!hashSet.contains(c15554.f44436)) {
                C14207 c14207 = (C14207) mapM39557.get(c15554.f44436);
                if (c14207 != null) {
                    arrayList.add(C15554.m35354(c15554.f44436, m39437(abstractC17043M39546, c14207)));
                } else if (zIsEmpty || !"resources.arsc".equals(c15554.f44436)) {
                    arrayList.add(c15554);
                } else {
                    arrayList.add(C15554.m35354(c15554.f44436, null));
                }
            }
        }
        ArrayList<C14207> arrayList2 = new ArrayList();
        for (C14207 c14208 : mapM39557.values()) {
            if (!hashSet2.contains(c14208.f40480) && !hashSet.contains(c14208.f40480)) {
                arrayList2.add(c14208);
            }
        }
        C8150.sort(arrayList2, C10162.comparing(new C19572()));
        for (C14207 c14209 : arrayList2) {
            arrayList.add(C15554.m35354(c14209.f40480, m39437(abstractC17043M39546, c14209)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized C6831 m39602(C16484 c16484, String str, String str2) {
        try {
            if (m39567(str)) {
                return null;
            }
            AbstractC17043 abstractC17043M39546 = m39546(c16484, str);
            if (m39545(abstractC17043M39546).contains(str2)) {
                throw m39522();
            }
            C14207 c14207 = (C14207) m39557(abstractC17043M39546).get(str2);
            if (c14207 == null) {
                return null;
            }
            if ("zip_entry".equals(c14207.f40482)) {
                try {
                    return new C6831(m39540(abstractC17043M39546).m38684(C20186.m45682(str2)).m38684("data.bin").m38664());
                } catch (IOException e) {
                    throw m39450(e);
                }
            }
            String strM39569 = m39569(m39540(abstractC17043M39546).m38684(C20186.m45682(str2)).m38684("text.xml"));
            String strM45682 = C20186.m45682(strM39569);
            C6161 c6161M39550 = m39550(abstractC17043M39546, str2, strM45682);
            if (c6161M39550 != null) {
                return new C6831(c6161M39550.f15469);
            }
            C2807 c2807M39447 = m39447(c16484, abstractC17043M39546.getName(), str2, strM39569, strM45682);
            C2600 c2600 = c2807M39447.f4801;
            if (c2600 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(c2600);
                throw m39457(c16484, str, true, "EDIT_TEXT_PREPARE_FAILED_IN_SESSION", "AXML encode failed for saved edit session overlay.", m39435(arrayList), (String) null, (String) null);
            }
            try {
                m39485(abstractC17043M39546, str2, c2807M39447.f4800);
                return new C6831(c2807M39447.f4800.f68056);
            } catch (IOException e2) {
                throw m39450(e2);
            }
            throw th;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final synchronized C6831 m39603(C16484 c16484, String str) {
        if (m39567(str)) {
            return null;
        }
        AbstractC17043 abstractC17043M39546 = m39546(c16484, str);
        ArrayList arrayListM39521 = m39521(c16484, abstractC17043M39546);
        if (arrayListM39521.isEmpty()) {
            return null;
        }
        return new C6831(m39506(c16484, abstractC17043M39546, arrayListM39521));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized HashMap m39604(C16484 c16484, String str) {
        HashMap map = new HashMap();
        if (m39567(str)) {
            return map;
        }
        for (C14207 c14207 : m39557(m39546(c16484, str)).values()) {
            map.put(c14207.f40480, c14207.f40482);
        }
        return map;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized C5490 m39605(C16484 c16484, String str, String str2) {
        if (m39567(str)) {
            return null;
        }
        AbstractC17043 abstractC17043M39546 = m39546(c16484, str);
        if (m39545(abstractC17043M39546).contains(str2)) {
            throw m39522();
        }
        C14207 c14207 = (C14207) m39557(abstractC17043M39546).get(str2);
        if (c14207 != null && "zip_entry".equals(c14207.f40482)) {
            AbstractC17043 abstractC17043M38684 = m39540(abstractC17043M39546).m38684(C20186.m45682(str2)).m38684("data.bin");
            if (!abstractC17043M38684.mo25093()) {
                throw m39450(new IOException("ZIP entry overlay data is missing"));
            }
            return new C5490(abstractC17043M38684);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۜ */
    public final synchronized void m39594(C16484 c16484, String str) {
        if (m39567(str)) {
            return;
        }
        try {
            AbstractC17043 abstractC17043M39546 = m39546(c16484, str);
            C22925 c22925M39568 = m39568(abstractC17043M39546);
            int i = c22925M39568.f72140;
            m39537(abstractC17043M39546.m38684("state.json"), JSON.object().add("revision", i).add("createdAt", c22925M39568.f72139).add("lastAccessedAt", System.currentTimeMillis()).toString().getBytes(StandardCharsets.UTF_8), ".state");
        } catch (IOException | RuntimeException | C5276 e) {
            C21306.m48192("MT MCP edit session build touch failed, workspaceId=" + c16484.f48416 + ", editSessionId=" + str, e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C4336 m39581(C16484 c16484, C14473 c14473) {
        C17666 c17666;
        C17666 c17667;
        C6268 c6268M14232;
        try {
            AbstractC17043 abstractC17043M39546 = m39546(c16484, c14473.f41342);
            C16995 c16995M35557 = C15654.m35557(this.f51871.m28001(c16484, this, c14473.f41342), m39443(c14473));
            C17666 c17668 = c16995M35557.f50254;
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap map = new HashMap();
                for (C6268 c6268 : m39600(c16484, c14473.f41342)) {
                    map.put(c6268.f15852, c6268);
                }
                Iterator it = c16995M35557.f50255.iterator();
                int i = 0;
                int i2 = 0;
                while (it.hasNext()) {
                    C5597 c5597 = (C5597) it.next();
                    boolean zEquals = c5597.f13565.equals(c5597.f13564);
                    Iterator it2 = it;
                    c17667 = c17668;
                    try {
                        arrayList.add(new C9306(c5597.f13563, c5597.f13562, c5597.f13566, c5597.f13565, !zEquals));
                        if (zEquals) {
                            i2++;
                        } else {
                            i++;
                            int i3 = (int) Long.parseLong(c5597.f13562.substring(2), 16);
                            if (c5597.f13565.equals(c5597.f13560)) {
                                arrayList2.add(new C15547(C16111.m36665(C6268.m14228(i3, c5597.f13566)), null));
                            } else {
                                C6268 c6269 = (C6268) map.get(C16111.m36665(C6268.m14228(i3, c5597.f13566)));
                                if (c6269 == null) {
                                    c6268M14232 = C6268.m14230(i3, c5597.f13566, c5597.f13564, c5597.f13565, c5597.f13561);
                                } else {
                                    c6268M14232 = c6269.m14232(c5597.f13564, c5597.f13561, c5597.f13565);
                                }
                                arrayList2.add(new C15547(C16111.m36665(c6268M14232.f15860), c6268M14232));
                            }
                        }
                        it = it2;
                        c17668 = c17667;
                    } catch (C5276 e) {
                        e = e;
                        c17666 = c17667;
                        m39477(e, c16484.f48416, c14473, c17666);
                        throw e;
                    }
                }
                if (i == 0) {
                    return new C4336(c16484.f48416, c14473.f41342, false, 0, i2, arrayList);
                }
                try {
                    this.f51871.m28000(c16484.f48416, c14473.f41342);
                    m39486(abstractC17043M39546, arrayList2);
                    C4216.m8561(abstractC17043M39546);
                    return new C4336(c16484.f48416, c14473.f41342, true, i, i2, arrayList);
                } catch (IOException e2) {
                    throw m39450(e2);
                }
            } catch (C5276 e3) {
                e = e3;
                c17667 = c17668;
            }
        } catch (C5276 e4) {
            e = e4;
            c17666 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c5 A[Catch: all -> 0x024c, TryCatch #8 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:147:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01ca A[Catch: all -> 0x024c, TryCatch #8 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:147:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01d2 A[Catch: all -> 0x024c, TryCatch #8 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:147:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0204 A[Catch: all -> 0x024c, TryCatch #8 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:147:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0208 A[Catch: all -> 0x024c, TryCatch #8 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:147:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0215  */
    /* JADX WARN: Code duplicated, block: B:123:0x021b A[Catch: all -> 0x024c, TryCatch #8 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:147:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0196 A[Catch: all -> 0x024c, TryCatch #8 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:147:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:93:0x019f A[Catch: all -> 0x024c, TryCatch #8 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:147:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01be A[Catch: all -> 0x024c, TryCatch #8 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:147:0x000d }] */
    /* JADX INFO: renamed from: ֫ */
    public final synchronized C11042 m39587(C16484 c16484, C22048 c22048, InterfaceC20509 interfaceC20509) throws Throwable {
        int i;
        boolean z;
        long jM39434;
        boolean z2;
        int iM39431;
        IOException iOException;
        C5276 c5276;
        try {
            try {
                String str = c22048.f69370;
                m39572(str);
                AbstractC17043 abstractC17043M39546 = m39546(c16484, c22048.f69369);
                m39575(c16484, c22048.f69369, str);
                C4820 c4820M39558 = m39558(c16484, c22048.f69369, str);
                String str2 = c22048.f69369;
                if (c4820M39558.f10955) {
                    throw m39455(c16484, str2, str, "directory");
                }
                if (!c4820M39558.f10954) {
                    boolean zContains = m39545(abstractC17043M39546).contains(str);
                    C14207 c14207 = (C14207) m39557(abstractC17043M39546).get(str);
                    if (c14207 != null) {
                        String str3 = c22048.f69369;
                        AbstractC17043 abstractC17043M38684 = m39540(abstractC17043M39546).m38684(C20186.m45682(str)).m38684("data.bin");
                        if ("axml".equals(c14207.f40482) || m39499(abstractC17043M38684, m39428(abstractC17043M38684))) {
                            throw m39455(c16484, str3, str, "axml_entry");
                        }
                    }
                    if (!zContains && ((c14207 != null || c4820M39558.f10956) && !c22048.f69371)) {
                        String str4 = c22048.f69369;
                        C5276 c5276M11403 = C5276.m11403(null, "FILE_ALREADY_EXISTS", "Workspace ZIP entry already exists.", "warning");
                        m39478(c5276M11403, c16484, str4, str);
                        throw c5276M11403;
                    }
                    C10184 c10184 = new C10184(Entry.DEFAULT_NAME, str, null, c14207 != null);
                    int i2 = m39568(abstractC17043M39546).f72140;
                    try {
                        try {
                            AbstractC17043 abstractC17043M39467 = m39467(abstractC17043M39546);
                            AbstractC17043 abstractC17043M38685 = abstractC17043M39467.m38684("overlay.next");
                            abstractC17043M38685.m38666();
                            i = i2;
                            try {
                                abstractC17043M38685.m38684("meta.json").m38660(JSON.object().add("targetType", "zip_entry").add("entryName", str).add("encoding", C16412.f48248).add("lineEnding", "lf").toString().getBytes(StandardCharsets.UTF_8));
                                jM39434 = m39434(abstractC17043M38685.m38684("data.bin"), interfaceC20509, c16484, c22048.f69369, str);
                                try {
                                    try {
                                        try {
                                            if (m39499(abstractC17043M38685.m38684("data.bin"), jM39434)) {
                                                throw m39455(c16484, c22048.f69369, str, "axml_entry");
                                            }
                                            interfaceC20509.mo46274(jM39434);
                                            m39488(abstractC17043M39546, c10184, abstractC17043M39467);
                                            AbstractC17043 abstractC17043M39563 = m39563(abstractC17043M39546, str);
                                            abstractC17043M39563.mo37342();
                                            if (abstractC17043M39563.mo25094() || !abstractC17043M38685.mo25502(abstractC17043M39563)) {
                                                throw new IOException("Unable to publish ZIP entry overlay");
                                            }
                                            AbstractC17043 abstractC17043M39552 = m39552(abstractC17043M39546, str);
                                            if (abstractC17043M39552.mo25094()) {
                                                abstractC17043M39552.mo25503();
                                            }
                                            ArrayList arrayListM39545 = m39545(abstractC17043M39546);
                                            arrayListM39545.remove(str);
                                            m39565(abstractC17043M39546, arrayListM39545);
                                            m39542(abstractC17043M39546, str);
                                            iM39431 = m39431(abstractC17043M39546, m39568(abstractC17043M39546));
                                            try {
                                                m39536(abstractC17043M39546, c10184);
                                            } catch (IOException e) {
                                                e = e;
                                                z2 = true;
                                                if (z2) {
                                                    C21306.m48192("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c22048.f69369, e);
                                                }
                                                if (!m39500(abstractC17043M39546, e)) {
                                                    throw m39513(c16484, c22048.f69369, str);
                                                }
                                                if (e instanceof C5276) {
                                                    c5276 = (C5276) e;
                                                    if (!"EDIT_SESSION_STORAGE_FAILED".equals(c5276.f12413)) {
                                                        throw c5276;
                                                    }
                                                }
                                                throw m39548(e);
                                            } catch (RuntimeException e2) {
                                                e = e2;
                                                z = true;
                                                if (!m39538(e)) {
                                                    throw e;
                                                }
                                                iOException = new IOException("Edit session storage backend failed", e);
                                                if (z) {
                                                    C21306.m48192("MT MCP workspace entry copy commit completed after backend error, editSessionId=" + c22048.f69369, e);
                                                }
                                                if (!m39500(abstractC17043M39546, iOException)) {
                                                    throw m39513(c16484, c22048.f69369, str);
                                                }
                                                throw m39548(e);
                                            } catch (C5276 e3) {
                                                e = e3;
                                                z2 = true;
                                                if (z2) {
                                                    C21306.m48192("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c22048.f69369, e);
                                                }
                                                if (!m39500(abstractC17043M39546, e)) {
                                                    throw m39513(c16484, c22048.f69369, str);
                                                }
                                                if (e instanceof C5276) {
                                                    c5276 = (C5276) e;
                                                    if (!"EDIT_SESSION_STORAGE_FAILED".equals(c5276.f12413)) {
                                                        throw c5276;
                                                    }
                                                }
                                                throw m39548(e);
                                            }
                                            m39514(abstractC17043M39546);
                                            return new C11042(c16484.f48416, c22048.f69369, str, jM39434, Integer.valueOf(iM39431));
                                        } catch (C8668 e4) {
                                            e = e4;
                                            if (!m39500(abstractC17043M39546, e)) {
                                                throw m39513(c16484, c22048.f69369, str);
                                            }
                                            throw e.f23275;
                                        }
                                    } catch (IOException e5) {
                                        e = e5;
                                        z2 = false;
                                        iM39431 = i;
                                    } catch (RuntimeException e6) {
                                        e = e6;
                                        z = false;
                                        iM39431 = i;
                                        if (!m39538(e)) {
                                            throw e;
                                        }
                                        iOException = new IOException("Edit session storage backend failed", e);
                                        if (z && m39501(abstractC17043M39546, c10184, iOException)) {
                                            C21306.m48192("MT MCP workspace entry copy commit completed after backend error, editSessionId=" + c22048.f69369, e);
                                            m39514(abstractC17043M39546);
                                            return new C11042(c16484.f48416, c22048.f69369, str, jM39434, Integer.valueOf(iM39431));
                                        }
                                        if (!m39500(abstractC17043M39546, iOException)) {
                                            throw m39513(c16484, c22048.f69369, str);
                                        }
                                        throw m39548(e);
                                    } catch (C5276 e7) {
                                        e = e7;
                                        z2 = false;
                                        iM39431 = i;
                                    }
                                } catch (IOException e8) {
                                    e = e8;
                                } catch (RuntimeException e9) {
                                    e = e9;
                                } catch (C5276 e10) {
                                    e = e10;
                                }
                                z2 = false;
                            } catch (IOException e11) {
                                e = e11;
                                z2 = false;
                                jM39434 = 0;
                            } catch (RuntimeException e12) {
                                e = e12;
                                z = false;
                                jM39434 = 0;
                                iM39431 = i;
                                if (!m39538(e)) {
                                    throw e;
                                }
                                iOException = new IOException("Edit session storage backend failed", e);
                                if (z) {
                                    C21306.m48192("MT MCP workspace entry copy commit completed after backend error, editSessionId=" + c22048.f69369, e);
                                    m39514(abstractC17043M39546);
                                    return new C11042(c16484.f48416, c22048.f69369, str, jM39434, Integer.valueOf(iM39431));
                                }
                                if (!m39500(abstractC17043M39546, iOException)) {
                                    throw m39513(c16484, c22048.f69369, str);
                                }
                                throw m39548(e);
                            } catch (C5276 e13) {
                                e = e13;
                                z2 = false;
                                jM39434 = 0;
                            }
                        } catch (C8668 e14) {
                            e = e14;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        i = i2;
                        z2 = false;
                        jM39434 = 0;
                        iM39431 = i;
                        if (z2) {
                            C21306.m48192("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c22048.f69369, e);
                            m39514(abstractC17043M39546);
                            return new C11042(c16484.f48416, c22048.f69369, str, jM39434, Integer.valueOf(iM39431));
                        }
                        if (!m39500(abstractC17043M39546, e)) {
                            throw m39513(c16484, c22048.f69369, str);
                        }
                        if (e instanceof C5276) {
                            c5276 = (C5276) e;
                            if (!"EDIT_SESSION_STORAGE_FAILED".equals(c5276.f12413)) {
                                throw c5276;
                            }
                        }
                        throw m39548(e);
                    } catch (RuntimeException e16) {
                        e = e16;
                        i = i2;
                    } catch (C5276 e17) {
                        e = e17;
                        i = i2;
                        z2 = false;
                        jM39434 = 0;
                        iM39431 = i;
                        if (z2) {
                            C21306.m48192("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c22048.f69369, e);
                            m39514(abstractC17043M39546);
                            return new C11042(c16484.f48416, c22048.f69369, str, jM39434, Integer.valueOf(iM39431));
                        }
                        if (!m39500(abstractC17043M39546, e)) {
                            throw m39513(c16484, c22048.f69369, str);
                        }
                        if (e instanceof C5276) {
                            c5276 = (C5276) e;
                            if (!"EDIT_SESSION_STORAGE_FAILED".equals(c5276.f12413)) {
                                throw c5276;
                            }
                        }
                        throw m39548(e);
                    }
                    iM39431 = i;
                    if (z2 && m39501(abstractC17043M39546, c10184, e)) {
                        C21306.m48192("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c22048.f69369, e);
                        m39514(abstractC17043M39546);
                        return new C11042(c16484.f48416, c22048.f69369, str, jM39434, Integer.valueOf(iM39431));
                    }
                    if (!m39500(abstractC17043M39546, e)) {
                        throw m39513(c16484, c22048.f69369, str);
                    }
                    if (e instanceof C5276) {
                        c5276 = (C5276) e;
                        if (!"EDIT_SESSION_STORAGE_FAILED".equals(c5276.f12413)) {
                            throw c5276;
                        }
                    }
                    throw m39548(e);
                }
                throw m39455(c16484, str2, str, "axml_entry");
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static {
        ApplicationC14266.m56479(119);
        f82247 = new short[]{1355, -3613, -3608, -3679, -3606, -3601, -3590, -3601, -3679, -3605, -3606, -3609, -3590, -3631, -3587, -3605, -3587, -3587, -3609, -3615, -3616, -3587, -3637, -3638, -3641, -3622, -3631, -3619, -3637, -3619, -3619, -3641, -3647, -3648, -3631, -3635, -3620, -3637, -3633, -3622, -3637, -3631, -3640, -3633, -3641, -3646, -3637, -3638, -3621, -3616, -3601, -3604, -3614, -3605, -3666, -3590, -3615, -3666, -3601, -3614, -3614, -3615, -3603, -3601, -3590, -3605, -3666, -3605, -3606, -3609, -3590, -3666, -3587, -3605, -3587, -3587, -3609, -3615, -3616, -3666, -3609, -3606, -3645, -3622, -3666, -3645, -3635, -3618, -3666, -3605, -3606, -3609, -3590, -3666, -3587, -3605, -3587, -3587, -3609, -3615, -3616, -3666, -3588, -3615, -3614, -3614, -3604, -3601, -3603, -3611, -3666, -3606, -3605, -3614, -3605, -3590, -3605, -3666, -3608, -3601, -3609, -3614, -3605, -3606, -3678, -3666, -3605, -3606, -3609, -3590, -3619, -3605, -3587, -3587, -3609, -3615, -3616, -3641, -3606, -3661, -3645, -3622, -3666, -3645, -3635, -3618, -3666, -3605, -3606, -3609, -3590, -3666, -3587, -3605, -3587, -3587, -3609, -3615, -3616, -3666, -3588, -3615, -3614, -3614, -3604, -3601, -3603, -3611, -3666, -3606, -3605, -3614, -3605, -3590, -3605, -3666, -3608, -3601, -3609, -3614, -3605, -3606, -3678, -3666, -3605, -3606, -3609, -3590, -3619, -3605, -3587, -3587, -3609, -3615, -3616, -3641, -3606, -3661};
        f51869 = new RuntimeException();
    }

    public C17384(C13480 c13480, C12107 c12107, C11792 c11792) {
        this.f51870 = c13480;
        this.f51871 = c12107;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m39567(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m39573(AbstractC17043 abstractC17043) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        abstractC17043.m38666();
        abstractC17043.m38684("overlay").m38684("dex").m38666();
        m39540(abstractC17043).m38666();
        abstractC17043.m38684("overlay").m38684("resource_value").m38666();
        abstractC17043.m38684("cache").m38684("dex").m38666();
        abstractC17043.m38684("cache").m38684(Entry.DEFAULT_NAME).m38666();
        abstractC17043.m38684("cache").m38684("dex_build").m38666();
        abstractC17043.m38684("deleted").m38666();
        abstractC17043.m38684("failures").m38666();
        m39556(abstractC17043, new ArrayList());
        m39565(abstractC17043, new ArrayList());
        m39543(abstractC17043, new ArrayList());
        m39560(abstractC17043, new ArrayList());
        m39537(abstractC17043.m38684("state.json"), JSON.object().add("revision", 0).add("createdAt", jCurrentTimeMillis).add("lastAccessedAt", jCurrentTimeMillis).toString().getBytes(StandardCharsets.UTF_8), ".state");
    }

    /* JADX INFO: renamed from: ᩳ */
    public static ArrayList m39562(AbstractC17043 abstractC17043) {
        ArrayList arrayList = new ArrayList();
        if (abstractC17043.mo25087()) {
            for (AbstractC17043 abstractC17044 : abstractC17043.mo25500(true)) {
                if (abstractC17044.mo25087() && !abstractC17044.m38691() && m39577(abstractC17044.getName())) {
                    arrayList.add(new C23595(m39511(abstractC17044), abstractC17044, abstractC17044.getName()));
                }
            }
        }
        C8150.sort(arrayList, C16866.thenComparing(C10162.comparingLong(new C24936()), new C8843()));
        int size = arrayList.size() - 9;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((C23595) arrayList.get(i)).f75115);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39480(C16484 c16484, ArrayList arrayList) throws IOException {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC17043 abstractC17043 = (AbstractC17043) it.next();
            this.f51871.m28000(c16484.f48416, abstractC17043.getName());
            if (abstractC17043.mo25094()) {
                m39555(abstractC17043);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m39555(AbstractC17043 abstractC17043) throws IOException {
        if (abstractC17043.mo25094()) {
            if (abstractC17043.mo25087() && !abstractC17043.m38691()) {
                Iterator it = abstractC17043.mo25500(true).iterator();
                while (it.hasNext()) {
                    m39555((AbstractC17043) it.next());
                }
            }
            if (abstractC17043.mo25094() && !abstractC17043.mo25503()) {
                throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Unable to delete ")));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m39443(C14473 c14473) {
        ArrayList arrayList = c14473.f41343;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            C15143 c15143 = (C15143) arrayList.get(i);
            arrayList2.add(new C6938(i, c15143.f43232, c15143.f43235, c15143.f43233, c15143.f43234));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m39531(ArrayList arrayList) throws C5276 {
        Iterator it = arrayList.iterator();
        C15813 c15813 = null;
        while (it.hasNext()) {
            C15813 c15814 = (C15813) it.next();
            if (c15813 != null && c15813.m35890() > c15814.f45783) {
                long j = c15813.f45783;
                throw C5276.m11407("PATCH_OVERLAP", "Patch ranges must not overlap.", "warning", JSON.array(), JSON.object().add("firstRange", JSON.object().add("byteOffset", j).add("endByteOffset", c15813.m35890())).add("secondRange", JSON.object().add("byteOffset", c15814.f45783).add("endByteOffset", c15814.m35890())));
            }
            c15813 = c15814;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39481(C16484 c16484, AbstractC17043 abstractC17043, C14207 c14207, String str) throws C5276 {
        if ("resources.arsc".equals(str)) {
            throw m39451(str, "resources_arsc");
        }
        if (c16484.f48423.contains(str) || str.toLowerCase(Locale.ROOT).endsWith(".dex")) {
            throw m39451(str, "dex_entry");
        }
        if (c14207 != null && "axml".equals(c14207.f40482)) {
            throw m39451(str, "axml_entry");
        }
        if (c14207 != null && !"zip_entry".equals(c14207.f40482)) {
            throw m39451(str, "not_raw_zip_entry");
        }
        if (c14207 != null && !m39540(abstractC17043).m38684(C20186.m45682(str)).m38684("data.bin").mo25093()) {
            throw m39451(str, "not_raw_zip_entry");
        }
        try {
            C19561 c19561 = new C19561(c16484.m37409());
            try {
                C5738 entry = c19561.getEntry(str);
                if (entry == null) {
                    if (c14207 == null) {
                        throw m39522();
                    }
                } else {
                    if (entry.isDirectory()) {
                        throw m39451(str, "directory");
                    }
                    if (m39498(c16484, c19561, entry, str)) {
                        throw m39451(str, "axml_entry");
                    }
                }
                c19561.close();
            } catch (Throwable th) {
                try {
                    c19561.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C5276 e) {
            throw e;
        } catch (Exception e2) {
            throw m39450(new IOException("Failed to inspect ZIP entry for patch.", e2));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C14000 m39466(AbstractC17043 abstractC17043, C9779 c9779, ArrayList arrayList) throws C5276 {
        String str = c9779.f27010;
        AbstractC17043 abstractC17043M38684 = m39540(abstractC17043).m38684(C20186.m45682(str)).m38684("data.bin");
        long jMo25101 = abstractC17043M38684.mo25101();
        m39475(arrayList, jMo25101);
        ArrayList arrayList2 = new ArrayList();
        try {
            C24618 c24618M38671 = abstractC17043M38684.m38671("rw");
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C15813 c15813 = (C15813) it.next();
                    byte[] bArr = c15813.f45784;
                    int i = c15813.f45783;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    c24618M38671.seek(i);
                    c24618M38671.m54256(bArr2, 0, length);
                    if (!Arrays.equals(bArr2, c15813.f45784)) {
                        throw m39453(c9779, c15813, bArr2);
                    }
                    arrayList2.add(new C13537(i, bArr2, c15813.f45785));
                    throw e;
                }
                c24618M38671.close();
                try {
                    m39576(abstractC17043M38684, arrayList2);
                    AbstractC17043 abstractC17043M39552 = m39552(abstractC17043, str);
                    if (abstractC17043M39552.mo25094()) {
                        abstractC17043M39552.mo25503();
                    }
                    m39542(abstractC17043, str);
                    ArrayList arrayListM39545 = m39545(abstractC17043);
                    arrayListM39545.remove(str);
                    m39565(abstractC17043, arrayListM39545);
                    m39431(abstractC17043, m39568(abstractC17043));
                    return m39464(c9779, jMo25101, arrayList2, m39568(abstractC17043).f72140);
                } catch (Exception e) {
                    IOException iOException = new IOException("Failed to patch ZIP entry overlay.", e);
                    try {
                        m39535(abstractC17043M38684, arrayList2);
                    } catch (IOException e2) {
                        iOException.addSuppressed(e2);
                    }
                    throw m39450(iOException);
                }
            } catch (Throwable th) {
                try {
                    c24618M38671.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C5276 e3) {
            throw e3;
        } catch (Exception e4) {
            throw m39450(new IOException("Failed to read ZIP entry overlay for patch.", e4));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C14000 m39465(C16484 c16484, AbstractC17043 abstractC17043, C9779 c9779, ArrayList arrayList) throws C5276 {
        C10680 c10680;
        String str = c9779.f27010;
        try {
            c10680 = m39551(c16484, abstractC17043, str);
        } catch (C5276 e) {
            String str2 = e.f12413;
            if (!"NOT_TEXT_ENTRY".equals(str2) && !"ENTRY_TEXT_TOO_LARGE".equals(str2)) {
                throw e;
            }
            c10680 = new C10680(C16412.f48248, "lf");
        }
        AbstractC17043 abstractC17043M38693 = abstractC17043.m38693(".patch_bytes");
        try {
            try {
                try {
                    C19561 c19561 = new C19561(c16484.m37409());
                    try {
                        C5738 entry = c19561.getEntry(str);
                        if (entry == null) {
                            throw m39522();
                        }
                        long size = entry.getSize();
                        if (size >= 0) {
                            m39475(arrayList, size);
                        }
                        abstractC17043M38693.mo37342();
                        InputStream inputStreamM44448 = c19561.m44448(entry);
                        try {
                            OutputStream outputStreamMo25506 = abstractC17043M38693.mo25506(false);
                            try {
                                C8172 c8172M39461 = m39461(inputStreamM44448, outputStreamMo25506, c9779, arrayList);
                                ArrayList arrayList2 = c8172M39461.f21579;
                                long j = c8172M39461.f21578;
                                if (outputStreamMo25506 != null) {
                                    outputStreamMo25506.close();
                                }
                                inputStreamM44448.close();
                                if (size < 0) {
                                    m39475(arrayList, j);
                                }
                                m39484(abstractC17043, str, abstractC17043M38693, c10680);
                                c19561.close();
                                m39534(abstractC17043M38693);
                                return m39464(c9779, j, arrayList2, m39568(abstractC17043).f72140);
                            } catch (Throwable th) {
                                if (outputStreamMo25506 != null) {
                                    try {
                                        outputStreamMo25506.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                inputStreamM44448.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            c19561.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    m39534(abstractC17043M38693);
                    throw th7;
                }
            } catch (C5276 e2) {
                m39534(abstractC17043M38693);
                throw e2;
            }
        } catch (Exception e3) {
            m39534(abstractC17043M38693);
            throw m39450(new IOException("Failed to patch ZIP entry.", e3));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39475(ArrayList arrayList, long j) throws C5276 {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C15813 c15813 = (C15813) it.next();
            long jM35890 = c15813.m35890();
            long j2 = c15813.f45783;
            if (jM35890 < j2 || jM35890 > j) {
                throw m39449(j2, jM35890, j);
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m39576(AbstractC17043 abstractC17043, ArrayList arrayList) throws IOException {
        C24618 c24618M38671 = abstractC17043.m38671("rw");
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C13537 c13537 = (C13537) it.next();
                c24618M38671.seek(c13537.f38078);
                c24618M38671.write(c13537.f38076);
            }
            c24618M38671.m54258();
            c24618M38671.close();
        } catch (Throwable th) {
            try {
                c24618M38671.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m39535(AbstractC17043 abstractC17043, ArrayList arrayList) throws IOException {
        C24618 c24618M38671 = abstractC17043.m38671("rw");
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C13537 c13537 = (C13537) it.next();
                c24618M38671.seek(c13537.f38078);
                byte[] bArr = c13537.f38077;
                c24618M38671.write(bArr, 0, bArr.length);
            }
            c24618M38671.m54258();
            c24618M38671.close();
        } catch (Throwable th) {
            try {
                c24618M38671.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8172 m39461(InputStream inputStream, OutputStream outputStream, C9779 c9779, ArrayList arrayList) throws C5276, IOException {
        int i = 8192;
        byte[] bArr = new byte[8192];
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            C15813 c15813 = (C15813) it.next();
            int i2 = c15813.f45783;
            byte[] bArr2 = c15813.f45785;
            byte[] bArr3 = c15813.f45784;
            long j2 = i2;
            long j3 = j;
            while (j3 < j2) {
                long j4 = i;
                int i3 = i2;
                int i4 = inputStream.read(bArr, 0, (int) Math.min(j4, j2 - j3));
                if (i4 < 0) {
                    throw m39449(i3, c15813.m35890(), j3);
                }
                outputStream.write(bArr, 0, i4);
                j3 += (long) i4;
                i2 = i3;
                i = 8192;
            }
            int i5 = i2;
            int length = bArr3.length;
            byte[] bArr4 = new byte[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = inputStream.read(bArr4, i6, length - i6);
                if (i7 < 0) {
                    throw m39449(i5, c15813.m35890(), j3 + ((long) i6));
                }
                i6 += i7;
            }
            long j5 = j3 + ((long) length);
            if (!Arrays.equals(bArr4, bArr3)) {
                throw m39453(c9779, c15813, bArr4);
            }
            outputStream.write(bArr2);
            arrayList2.add(new C13537(i5, bArr4, bArr2));
            i = 8192;
            j = j5;
        }
        while (true) {
            int i8 = inputStream.read(bArr);
            if (i8 < 0) {
                return new C8172(arrayList2, j);
            }
            outputStream.write(bArr, 0, i8);
            j += (long) i8;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14000 m39464(C9779 c9779, long j, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        int length = 0;
        while (it.hasNext()) {
            C13537 c13537 = (C13537) it.next();
            byte[] bArr = c13537.f38076;
            length += bArr.length;
            arrayList2.add(new C14670(c13537.f38078, c13537.f38077, bArr));
        }
        return new C14000(c9779.f27012, c9779.f27009, c9779.f27010, j, length, i, arrayList2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m39451(String str, String str2) {
        return C5276.m11407("PATCH_UNSUPPORTED_ENTRY", "ZIP entry cannot be patched as raw bytes.", "fatal", JSON.array(), C9417.m21913("entryName", str, "reason", str2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m39449(long j, long j2, long j3) {
        return C5276.m11407("PATCH_RANGE_OUT_OF_ENTRY", "Patch range is outside the ZIP entry.", "warning", JSON.array(), JSON.object().add("byteOffset", j).add("endByteOffset", j2).add("entrySize", j3));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m39453(C9779 c9779, C15813 c15813, byte[] bArr) {
        JSONArray jSONArrayArray = JSON.array();
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c9779.f27012).add("editSessionId", c9779.f27009).add("locator", C14884.m34021("zip_entry", c9779.f27010, (String) null, (String) null, (String) null, (String) null));
        int i = c15813.f45783;
        return C5276.m11407("PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedHex.", "warning", jSONArrayArray.add(C11982.m27418(jSONObjectAdd.add("byteOffset", i).add("maxBytes", bArr.length), "mt_apk_read_bytes", "retry", "Read actual bytes at the mismatched patch window before retrying mt_apk_patch_bytes.")), JSON.object().add("byteOffset", i).add("expectedHex", m39442(c15813.f45784)).add("actualHex", m39442(bArr)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m39442(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format(Locale.ROOT, "%02X", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m39506(C16484 c16484, AbstractC17043 abstractC17043, ArrayList arrayList) throws C5276 {
        if (!c16484.f48417) {
            throw C5276.m11410("RESOURCE_TABLE_UNAVAILABLE", "Resource table is unavailable.");
        }
        C21021 c21021 = c16484.f48407;
        if (c21021 == null) {
            String str = c16484.f48411;
            if (str == null) {
                str = "Failed to parse resources.arsc";
            }
            throw C5276.m11410("RESOURCE_TABLE_PARSE_FAILED", str);
        }
        byte[] bArrM14229 = C6268.m14229(arrayList, c21021.m47385());
        try {
            byte[] bArrM8563 = C4216.m8563(abstractC17043, bArrM14229);
            if (bArrM8563 != null) {
                return bArrM8563;
            }
            C10949 c10949M25220 = C10949.m25220(c21021.m47386(), EnumC11620.CREATE);
            Iterator it = C6268.m14223(arrayList).iterator();
            while (it.hasNext()) {
                C25003.m54911(c10949M25220, (C6268) it.next());
            }
            c10949M25220.m25229();
            C11996 c11996 = new C11996((int) Math.min(2147483647L, c21021.m47387() + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS));
            c10949M25220.m25227(c11996, (C20689) null);
            byte[] bArrM27464 = c11996.m27464();
            try {
                C4216.m8562(abstractC17043, bArrM14229, bArrM27464);
            } catch (IOException unused) {
            }
            return bArrM27464;
        } catch (C5276 e) {
            throw e;
        } catch (Exception e2) {
            throw C5276.m11410("RESOURCE_COMPILE_FAILED", e2.getMessage() == null ? "Failed to materialize resources.arsc" : e2.getMessage());
        } catch (OutOfMemoryError unused2) {
            throw C19553.m44411();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m39537(AbstractC17043 abstractC17043, byte[] bArr, String str) {
        abstractC17043.mo37342();
        AbstractC17043 abstractC17043M38678 = abstractC17043.m38678(str);
        try {
            abstractC17043M38678.m38660(bArr);
            abstractC17043M38678.m38659(abstractC17043, false, true, null);
        } finally {
            m39534(abstractC17043M38678);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m39505(C10184 c10184, String str) {
        JSONObject jSONObjectAdd = JSON.object().add("schemaVersion", 1).add("phase", str).add("targetKind", c10184.f28250).add("target", c10184.f28246);
        String str2 = c10184.f28245;
        return jSONObjectAdd.add("dexEntryName", str2 == null ? JSON.NULL : JSON.value(str2)).add("overlayExisted", c10184.f28249).add("deletedExisted", c10184.f28244).add("failuresExisted", c10184.f28247).add("stateExisted", c10184.f28248).toString().getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39494(AbstractC17043 abstractC17043, byte[] bArr, String str) {
        abstractC17043.mo37342();
        AbstractC17043 abstractC17043M38678 = abstractC17043.m38678(str);
        try {
            abstractC17043M38678.mo25509().mo10735();
            abstractC17043M38678.m38660(bArr);
            abstractC17043M38678.mo25509().mo10730(abstractC17043);
        } finally {
            m39534(abstractC17043M38678);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39492(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, AbstractC17043 abstractC17045) throws IOException {
        for (C14362 c14362 : abstractC17043.mo25509().mo10734()) {
            String name = c14362.m32959().getName();
            if (!"transaction.json".equals(name) && !"committed".equals(name)) {
                m39555(c14362.m32959());
            }
        }
        m39555(abstractC17044);
        m39555(abstractC17045);
        if (abstractC17043.mo25094() && !abstractC17043.mo25503()) {
            throw new IOException("Unable to delete committed transaction directory");
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static C10184 m39559(AbstractC17043 abstractC17043, String str) throws IOException {
        JSONObject jSONObjectAsObject = JSON.parse(m39569(abstractC17043)).asObject();
        if (jSONObjectAsObject.getInt("schemaVersion", -1) != 1) {
            throw new IOException("Unsupported delete transaction schema");
        }
        String string = jSONObjectAsObject.getString("phase", null);
        String string2 = jSONObjectAsObject.getString("targetKind", null);
        String string3 = jSONObjectAsObject.getString("target", null);
        String string4 = jSONObjectAsObject.getString("dexEntryName", null);
        if (!str.equals(string) || ((!"dex".equals(string2) && !Entry.DEFAULT_NAME.equals(string2)) || string3 == null || string3.isEmpty() || ("dex".equals(string2) && (string4 == null || string4.isEmpty())))) {
            throw new IOException("Invalid delete transaction journal");
        }
        C10184 c10184 = new C10184(string2, string3, string4, m39495(jSONObjectAsObject, "overlayExisted"));
        c10184.f28244 = m39495(jSONObjectAsObject, "deletedExisted");
        c10184.f28247 = m39495(jSONObjectAsObject, "failuresExisted");
        c10184.f28248 = m39495(jSONObjectAsObject, "stateExisted");
        return c10184;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m39495(JSONObject jSONObject, String str) throws IOException {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw new IOException("Invalid delete transaction boolean field: ".concat(str));
        }
        return jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m39566(AbstractC17043 abstractC17043, C10184 c10184) throws IOException {
        AbstractC17043 abstractC17043M39553 = m39553(abstractC17043, c10184);
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(".delete_transaction").m38684("overlay.backup");
        if (c10184.f28249) {
            if (!abstractC17043M38684.mo25094()) {
                if (!abstractC17043M39553.mo25094()) {
                    throw new IOException("Delete transaction overlay backup is missing");
                }
                return;
            }
            if (abstractC17043M39553.mo25094()) {
                m39555(abstractC17043M39553);
            }
            abstractC17043M39553.mo37342();
            if (!abstractC17043M38684.mo25502(abstractC17043M39553)) {
                throw new IOException("Unable to restore delete transaction overlay");
            }
            return;
        }
        if (abstractC17043M39553.mo25094()) {
            m39555(abstractC17043M39553);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39493(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, boolean z) throws IOException {
        if (z) {
            if (!abstractC17044.mo25093()) {
                throw new IOException("Delete transaction backup is missing");
            }
            m39537(abstractC17043, abstractC17044.m38664(), ".delete_restore");
        } else if (abstractC17043.mo25094() && !abstractC17043.mo25503()) {
            throw new IOException("Unable to remove delete transaction file");
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public static void m39427(AbstractC17043 abstractC17043) throws C5276 {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(".delete_transaction");
        if (abstractC17043M38684.mo25094()) {
            AbstractC17043 abstractC17043M38685 = abstractC17043.m38684(".delete_transaction").m38684("transaction.json");
            AbstractC17043 abstractC17043M38686 = abstractC17043.m38684(".delete_transaction").m38684("committed");
            if (!abstractC17043M38686.mo25094()) {
                if (!abstractC17043M38685.mo25093()) {
                    try {
                        m39555(abstractC17043M38684);
                        return;
                    } catch (IOException e) {
                        C21306.m48192("MT MCP stale delete transaction directory cleanup failed, editSessionId=" + abstractC17043.getName(), e);
                        return;
                    }
                }
                try {
                    C10184 c10184M39559 = m39559(abstractC17043M38685, "prepared");
                    String str = c10184M39559.f28250;
                    m39566(abstractC17043, c10184M39559);
                    m39493(abstractC17043.m38684("deleted").m38684("dex".equals(str) ? "dex.json" : "entry.json"), abstractC17043M38684.m38684("deleted.backup"), c10184M39559.f28244);
                    m39493(abstractC17043.m38684("failures").m38684("dex".equals(str) ? "dex.json" : "entry.json"), abstractC17043M38684.m38684("failures.backup"), c10184M39559.f28247);
                    m39493(abstractC17043.m38684("state.json"), abstractC17043M38684.m38684("state.backup"), c10184M39559.f28248);
                    m39487(abstractC17043, c10184M39559);
                    m39555(abstractC17043M38685);
                    m39555(abstractC17043M38684);
                    return;
                } catch (C5276 e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw m39450(e3);
                }
            }
            C10184 c10184M395510 = null;
            try {
                try {
                    if (abstractC17043M38686.mo25093()) {
                        c10184M395510 = m39559(abstractC17043M38686, "committed");
                    }
                } catch (Exception e4) {
                    C21306.m48192("MT MCP committed delete marker is unreadable, editSessionId=" + abstractC17043.getName(), e4);
                }
                if (c10184M395510 == null && abstractC17043M38685.mo25093()) {
                    try {
                        c10184M395510 = m39559(abstractC17043M38685, "prepared");
                    } catch (Exception e5) {
                        C21306.m48192("MT MCP prepared delete journal is unreadable after commit, editSessionId=" + abstractC17043.getName(), e5);
                    }
                }
                if (c10184M395510 == null) {
                    m39555(abstractC17043.m38684("cache"));
                } else {
                    m39487(abstractC17043, c10184M395510);
                }
                m39492(abstractC17043M38684, abstractC17043M38685, abstractC17043M38686);
            } catch (Exception e6) {
                C21306.m48192("MT MCP committed delete transaction cleanup failed, editSessionId=" + abstractC17043.getName(), e6);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m39467(AbstractC17043 abstractC17043) throws C5276, IOException {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(".delete_transaction");
        if (abstractC17043M38684.mo25094()) {
            m39427(abstractC17043);
            if (abstractC17043M38684.mo25094()) {
                throw new IOException("Previous delete transaction cleanup is incomplete");
            }
        }
        abstractC17043M38684.m38666();
        return abstractC17043M38684;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m39501(AbstractC17043 abstractC17043, C10184 c10184, Exception exc) {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(".delete_transaction").m38684("committed");
        if (!abstractC17043M38684.mo25094()) {
            return false;
        }
        try {
            C10184 c10184M39559 = m39559(abstractC17043M38684, "committed");
            String str = c10184M39559.f28245;
            if (c10184.f28250.equals(c10184M39559.f28250) && c10184.f28246.equals(c10184M39559.f28246)) {
                String str2 = c10184.f28245;
                if (str2 == null) {
                    if (str == null) {
                        return true;
                    }
                } else if (str2.equals(str)) {
                    return true;
                }
            }
            exc.addSuppressed(new IOException("Committed delete marker target mismatch"));
            return true;
        } catch (Exception e) {
            exc.addSuppressed(e);
            return true;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m39536(AbstractC17043 abstractC17043, C10184 c10184) {
        m39494(abstractC17043.m38684(".delete_transaction").m38684("committed"), m39505(c10184, "committed"), ".delete_commit");
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC17043 m39553(AbstractC17043 abstractC17043, C10184 c10184) {
        String str = c10184.f28250;
        String str2 = c10184.f28246;
        if ("dex".equals(str)) {
            String str3 = c10184.f28245;
            C16477.m37400(str2);
            return abstractC17043.m38684("overlay").m38684("dex").m38684(str3).m38684(C20186.m45682(str2).concat(".smali"));
        }
        return m39540(abstractC17043).m38684(C20186.m45682(str2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39487(AbstractC17043 abstractC17043, C10184 c10184) throws IOException {
        String str = c10184.f28250;
        String str2 = c10184.f28246;
        if ("dex".equals(str)) {
            String str3 = c10184.f28245;
            C16477.m37400(str2);
            m39555(abstractC17043.m38684("cache").m38684("dex").m38684(str3).m38684(C20186.m45682(str2).concat(".bin")));
            return;
        }
        m39555(m39552(abstractC17043, str2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m39500(AbstractC17043 abstractC17043, Exception exc) {
        try {
            m39427(abstractC17043);
            return true;
        } catch (C5276 e) {
            exc.addSuppressed(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public static void m39514(AbstractC17043 abstractC17043) {
        try {
            m39427(abstractC17043);
        } catch (IOException e) {
            e = e;
            C21306.m48192("MT MCP delete transaction cleanup failed, editSessionId=" + abstractC17043.getName(), e);
        } catch (RuntimeException e2) {
            if (!m39538(e2)) {
                throw e2;
            }
            C21306.m48192("MT MCP delete transaction cleanup failed, editSessionId=" + abstractC17043.getName(), e2);
        } catch (C5276 e3) {
            e = e3;
            C21306.m48192("MT MCP delete transaction cleanup failed, editSessionId=" + abstractC17043.getName(), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39477(C5276 c5276, String str, C14473 c14473, C17666 c17666) {
        JSONValue jSONValueValue;
        String str2 = c14473.f41342;
        ArrayList arrayList = c14473.f41343;
        JSONObject jSONObject = c5276.f12412;
        JSONArray jSONArray = c5276.f12407;
        int i = jSONObject.getInt("failedEditIndex", -1);
        boolean z = jSONObject.getBoolean("_suppressResourceRetry", false);
        jSONObject.remove("_suppressResourceRetry");
        C15143 c15143 = (i < 0 || i >= arrayList.size()) ? null : (C15143) arrayList.get(i);
        String string = jSONObject.getString("resourceId", c15143 == null ? null : c15143.f43232);
        String string2 = jSONObject.getString("variant", c15143 != null ? c15143.f43235 : null);
        JSONObject jSONObjectPut = jSONObject.put("workspaceId", str).put("editSessionId", str2).put("failedEditIndex", i >= 0 ? JSON.value(i) : JSON.NULL);
        if (string == null) {
            jSONValueValue = JSON.NULL;
        } else {
            jSONValueValue = JSON.value(C14884.m34021("resource", (String) null, (String) null, (String) null, (String) null, string));
        }
        jSONObjectPut.put("locator", jSONValueValue).put("variant", string2 == null ? JSON.NULL : JSON.value(string2));
        if (jSONObject.get("resourceNamePolicy") == null || jSONObject.get("resourceNamePolicy").isNull()) {
            jSONObject.put("resourceNamePolicy", c17666 == null ? JSON.NULL : c17666.m40176());
        }
        if (z || jSONArray.size() != 0) {
            return;
        }
        String str3 = c5276.f12413;
        if ((!"STALE_TARGET_VERSION".equals(str3) && !"INVALID_VALUE_XML".equals(str3) && !"UNSUPPORTED_VALUE_XML".equals(str3) && !"UNSUPPORTED_STYLED_TEXT_XML".equals(str3) && !"APP_NAME_REFERENCES_NOT_ACCEPTED".equals(str3) && !"RESOURCE_VARIANT_NOT_FOUND".equals(str3)) || string == null || string2 == null) {
            return;
        }
        jSONArray.add(C11982.m27418(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("reads", JSON.array().add(JSON.object().add("locator", C14884.m34021("resource", (String) null, (String) null, (String) null, (String) null, string)).add("variant", string2))).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 2000).add("resolveDepth", 0), "mt_apk_resource_read", "retry", "Re-read the resource value for the latest valueXml/targetVersion or available variants"));
    }

    /* JADX INFO: renamed from: ֫ */
    private C22718 m39474(C16484 c16484, AbstractC17043 abstractC17043, C8438 c8438, C17502 c17502) throws C5276 {
        String strM39440;
        ArrayList arrayList = c8438.f22624;
        String str = c8438.f22623;
        String str2 = c8438.f22628;
        if (!"smali_class".equals(str2)) {
            throw C5276.m11406("Invalid targetType", "targetType", JSON.value(str2), JSON.array("smali_class"), JSON.object().add("targetType", "smali_class"));
        }
        String strM39512 = m39512(c8438.f22626);
        m39533(c16484, c8438, str, c8438.f22628, strM39512, (m39527(abstractC17043, strM39512) == null && !(((C12196) m39446(abstractC17043, c17502).get(strM39512)) == null && m39517(c16484, strM39512) == 0)) ? m39518(C10127.m23607(m39578(c16484, abstractC17043.getName(), strM39512, c17502))) : "missing");
        C12462 c12462 = (C12462) arrayList.get(0);
        String str3 = c12462.f34871;
        if ("write_target".equals(str3)) {
            strM39440 = C10127.m23607(c12462.f34872);
        } else {
            if (!m39561(str3)) {
                throw C5276.m11406("Invalid mode", "edits[0].mode", JSON.value(str3), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), JSON.object().add("mode", "replace_match"));
            }
            if (m39527(abstractC17043, strM39512) != null) {
                throw C19553.m44405(c16484.f48416, abstractC17043.getName());
            }
            strM39440 = m39440(c16484, c8438, abstractC17043.getName(), c8438.f22628, strM39512, C10127.m23607(m39578(c16484, abstractC17043.getName(), strM39512, c17502)));
        }
        String str4 = strM39440;
        String strM39518 = m39518(str4);
        String str5 = c8438.f22628;
        arrayList.size();
        return m39472(c16484, abstractC17043, strM39512, str4, str, str5, strM39512, strM39518);
    }

    /* JADX INFO: renamed from: ۧ */
    private C22718 m39530(C16484 c16484, AbstractC17043 abstractC17043, C8438 c8438, C17502 c17502) throws C5276 {
        String strM39440;
        String str = c16484.f48416;
        String str2 = c8438.f22626;
        ArrayList arrayList = c8438.f22624;
        String str3 = c8438.f22623;
        String strM34042 = C14884.m34042(str2);
        String strM34088 = C14884.m34088(str2);
        if (m39527(abstractC17043, strM34042) != null) {
            throw C19553.m44405(str, str3);
        }
        String strM23607 = C10127.m23607(m39578(c16484, str3, strM34042, c17502));
        C21843 c21843M12803 = C5749.m12802(strM34042, strM23607).m12803(strM34088);
        if (c21843M12803 == null) {
            throw C19553.m44413(str, str3, strM34042);
        }
        int i = c21843M12803.f68735;
        String strM23606 = C10127.m23606(i, c21843M12803.f68738, strM23607);
        m39533(c16484, c8438, str3, c8438.f22628, c8438.f22626, m39518(strM23606));
        C12462 c12462 = (C12462) arrayList.get(0);
        if ("write_target".equals(c12462.f34871)) {
            String strM23608 = C10127.m23607(c12462.f34872);
            if (strM23608.endsWith("\n")) {
                strM23608 = C17073.m38720(1, 0, strM23608);
            }
            if (strM23608.isEmpty() || strM23608.endsWith("\n")) {
                throw m39458(c16484, c8438, "Smali text must contain one complete .method block.");
            }
            String[] strArrSplit = strM23608.split("\n", -1);
            String strTrim = C5749.m12801(strArrSplit[0]).trim();
            String strTrim2 = C5749.m12801(strArrSplit[strArrSplit.length - 1]).trim();
            if (!m39544(strTrim) || !".end method".equals(strTrim2)) {
                throw m39458(c16484, c8438, "Smali text must contain one complete .method block.");
            }
            int length = strArrSplit.length;
            String str4 = strM23608;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                String[] strArr = strArrSplit;
                String strTrim3 = C5749.m12801(strArrSplit[i2]).trim();
                if (m39544(strTrim3)) {
                    i3++;
                } else if (".end method".equals(strTrim3)) {
                    i4++;
                }
                i2++;
                strArrSplit = strArr;
            }
            if (i3 != 1 || i4 != 1) {
                throw m39458(c16484, c8438, "Smali text must contain one complete .method block.");
            }
            String str5 = C21843.m49273(1, strTrim).f68741;
            if (str5.indexOf(40) < 0 || !strM34088.equals(str5)) {
                throw m39458(c16484, c8438, "Smali .method signature does not match locator target.");
            }
            strM39440 = str4;
        } else {
            strM39440 = m39440(c16484, c8438, str3, c8438.f22628, c8438.f22626, strM23606);
        }
        String strM39439 = m39439(strM23607, Math.max(0, i - 1), Math.max(Math.max(0, i - 1), c21843M12803.f68738), strM39440);
        String strM39518 = strM39440.isEmpty() ? "missing" : m39518(strM39440);
        String str6 = c8438.f22628;
        String str7 = c8438.f22626;
        arrayList.size();
        return m39472(c16484, abstractC17043, strM34042, strM39439, str3, str6, str7, strM39518);
    }

    /* JADX INFO: renamed from: ֫ */
    private C22718 m39473(C16484 c16484, AbstractC17043 abstractC17043, C8438 c8438) throws C5276 {
        String strM39518;
        String strM39440;
        String strReplace;
        String str;
        C17502 c17502;
        String str2;
        C21584 c21584;
        String str3 = c16484.f48416;
        String str4 = c8438.f22626;
        String str5 = c8438.f22623;
        ArrayList arrayList = c8438.f22624;
        String str6 = c8438.f22628;
        if (str4 == null || str4.isEmpty() || str4.indexOf(0) >= 0 || str4.endsWith("/")) {
            throw C5276.m11406("Invalid target", "target", str4 != null ? JSON.value(str4) : null, JSON.array(), JSON.object().add("target", "res/layout/activity_main.xml"));
        }
        if ("resources.arsc".equals(str4)) {
            throw C5276.m11405("RESOURCE_TABLE_TEXT_EDIT_UNSUPPORTED", "resources.arsc must be edited with mt_apk_resource_edit.");
        }
        C14877 c14877M39526 = m39526(c16484, abstractC17043, str4);
        boolean z = c14877M39526.f42412;
        String str7 = c14877M39526.f42413;
        if (!((z || "missing".equals(str7)) ? true : str6.equals(str7))) {
            if (!"zip_entry".equals(str6)) {
                throw C5276.m11405("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
            }
            if ("axml".equals(str7)) {
                throw C19553.m44415(str3, str5, str4);
            }
            if ("too_large".equals(str7)) {
                throw C5276.m11405("ENTRY_TEXT_TOO_LARGE", "ZIP entry text is too large to edit.");
            }
            throw C19553.m44414(str3, str5, str4);
        }
        if (z || "missing".equals(str7)) {
            strM39518 = "missing";
        } else {
            strM39518 = m39518(C10127.m23607(("axml".equals(str6) ? m39589(c16484, abstractC17043.getName(), str4) : m39599(c16484, abstractC17043.getName(), str4)).f57266));
        }
        m39533(c16484, c8438, str5, c8438.f22628, str4, strM39518);
        String str8 = c8438.f22628;
        C12462 c12462 = (C12462) arrayList.get(0);
        String str9 = c12462.f34871;
        if ("write_target".equals(str9)) {
            strM39440 = C10127.m23607(c12462.f34872);
        } else {
            if (!m39561(str9)) {
                throw C5276.m11406("Invalid mode", "edits[0].mode", JSON.value(str9), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), JSON.object().add("mode", "replace_match"));
            }
            if (m39545(abstractC17043).contains(str4)) {
                throw m39522();
            }
            strM39440 = m39440(c16484, c8438, abstractC17043.getName(), str8, str4, C10127.m23607("axml".equals(str8) ? m39589(c16484, abstractC17043.getName(), str4).f57266 : m39599(c16484, abstractC17043.getName(), str4).f57266));
        }
        String str10 = strM39440;
        String strM39519 = m39518(str10);
        if ("axml".equals(str6)) {
            Charset charset = StandardCharsets.UTF_8;
            if (str10.getBytes(charset).length > 2097152) {
                throw C5276.m11405("AXML_SOURCE_TOO_LARGE", "AXML source is too large to edit.");
            }
            String strM45682 = C20186.m45682(str10);
            C6161 c6161M39550 = m39550(abstractC17043, str4, strM45682);
            if (c6161M39550 != null) {
                c21584 = new C21584(strM45682, c6161M39550.f15469);
            } else {
                C2807 c2807M39447 = m39447(c16484, str5, str4, str10, strM45682);
                C2600 c2600 = c2807M39447.f4801;
                if (c2600 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(c2600);
                    throw m39457(c16484, str5, false, "EDIT_TEXT_PREPARE_FAILED_IN_SESSION", "AXML encode failed; edit_text candidate was not saved.", m39435(arrayList2), (String) null, (String) null);
                }
                c21584 = c2807M39447.f4800;
            }
            C21584 c21585 = c21584;
            m39489(abstractC17043, new C10184(Entry.DEFAULT_NAME, str4, null, m39540(abstractC17043).m38684(C20186.m45682(str4)).mo25094()), str10.getBytes(charset), c8438.f22628, new C10680(C16412.f48248, "lf"));
            try {
                m39485(abstractC17043, str4, c21585);
            } catch (Exception e) {
                C21306.m48192("MT MCP AXML edit cache publish failed, editSessionId=".concat(str5), e);
            }
            str = c8438.f22628;
            arrayList.size();
            c17502 = null;
            str2 = strM39519;
        } else {
            C10680 c10680M39551 = m39551(c16484, abstractC17043, str4);
            int i = c10680M39551.f29575;
            try {
                C2864 c2864 = new C2864();
                m39476(c2864, i);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(c2864, C16412.m37298(i));
                try {
                    String str11 = c10680M39551.f29576;
                    if ("lf".equals(str11)) {
                        strReplace = str10;
                    } else {
                        strReplace = str10.replace("\n", "crlf".equals(str11) ? "\r\n" : "\r");
                    }
                    outputStreamWriter.write(strReplace);
                    outputStreamWriter.close();
                    byte[] bArrCopyOf = c2864.f4949;
                    int length = bArrCopyOf.length;
                    int i2 = c2864.f4950;
                    if (length != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
                    }
                    byte[] bArr = bArrCopyOf;
                    if (bArr.length > 10485760) {
                        throw C5276.m11405("ENTRY_TEXT_TOO_LARGE", "ZIP entry text is too large to edit.");
                    }
                    String strM395110 = m39518(m39469(c16484, str5, str4, bArr, false).f57266);
                    m39489(abstractC17043, new C10184(Entry.DEFAULT_NAME, str4, null, m39540(abstractC17043).m38684(C20186.m45682(str4)).mo25094()), bArr, c8438.f22628, c10680M39551);
                    str = c8438.f22628;
                    arrayList.size();
                    c17502 = null;
                    str2 = strM395110;
                } catch (Throwable th) {
                    try {
                        outputStreamWriter.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                throw m39450(e2);
            }
        }
        return m39471(c16484, str5, str, str4, str2, c17502);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final synchronized C22718 m39606(C16484 c16484, String str) {
        m39546(c16484, str);
        return m39510(c16484, str);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m39554(C16484 c16484, String str, C17502 c17502) throws C5276 {
        if (m39567(str)) {
            return;
        }
        m39430(c16484, m39546(c16484, str), c17502);
        C22718 c22718M39471 = m39471(c16484, str, (String) null, (String) null, (String) null, c17502);
        if (c22718M39471.f71658 > 0) {
            throw m39456(c16484, str, c22718M39471);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized ArrayList m39579(C16484 c16484, String str, C17502 c17502) {
        if (m39567(str)) {
            return c16484.f48424;
        }
        m39554(c16484, str, c17502);
        return m39444(c16484, m39462(c16484, str, m39546(c16484, str), c17502));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m39497(C3974 c3974, C19160 c19160, C23948 c23948, char[] cArr) throws C5276 {
        AbstractC17043 abstractC17043M7922 = c3974.m7922(c19160.f57226);
        if (abstractC17043M7922 == null) {
            return false;
        }
        c23948.m53044();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(abstractC17043M7922.mo29987(), StandardCharsets.UTF_8);
            while (true) {
                try {
                    int i = inputStreamReader.read(cArr);
                    if (i != -1) {
                        c23948.write(cArr, 0, i);
                    } else {
                        inputStreamReader.close();
                        return true;
                    }
                } catch (Throwable th) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                throw m39450(e);
            }
        } catch (IOException e) {
            throw m39450(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m39444(C16484 c16484, C9513 c9513) throws C5276 {
        HashSet hashSet = new HashSet(c16484.f48423);
        HashMap map = new HashMap();
        HashMap map2 = c9513.f26044;
        HashSet hashSet2 = c9513.f26042;
        int i = 0;
        int i2 = 0;
        for (C12196 c12196 : map2.values()) {
            String str = c12196.f34102;
            String str2 = c12196.f34100;
            if (!hashSet.contains(str)) {
                throw m39448();
            }
            if (!hashSet2.contains(str2) && !c16484.f48418.containsKey(str2)) {
                ArrayList arrayList = (ArrayList) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(str, arrayList);
                }
                arrayList.add(c12196);
                i2++;
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            C8150.sort((ArrayList) it.next(), C10162.comparing(new C22255()));
        }
        ArrayList arrayList2 = new ArrayList(c16484.f48424.size() + i2);
        for (String str3 : c16484.f48423) {
            while (i < c16484.f48424.size() && str3.equals(((C19160) c16484.f48424.get(i)).f57227)) {
                int i3 = i + 1;
                C19160 c19160 = (C19160) c16484.f48424.get(i);
                if (!hashSet2.contains(c19160.f57226)) {
                    C12196 c12197 = (C12196) c9513.f26046.get(c19160.f57226);
                    if (c12197 != null) {
                        arrayList2.add(new C19160(c12197.f34102, -1, -1, c12197.f34100));
                    } else {
                        arrayList2.add(c19160);
                    }
                }
                i = i3;
            }
            ArrayList<C12196> arrayList3 = (ArrayList) map.get(str3);
            if (arrayList3 != null) {
                for (C12196 c12198 : arrayList3) {
                    arrayList2.add(new C19160(c12198.f34102, -1, -1, c12198.f34100));
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C9952 m39584(C16484 c16484, String str, C19160 c19160) {
        return m39585(c16484, str, c19160, (C17502) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C9952 m39585(C16484 c16484, String str, C19160 c19160, C17502 c17502) {
        if (m39567(str)) {
            return C13480.m30624(c16484, c19160);
        }
        AbstractC17043 abstractC17043M39546 = m39546(c16484, str);
        C9513 c9513M39462 = m39462(c16484, str, abstractC17043M39546, c17502);
        C12196 c12196 = (C12196) c9513M39462.f26046.get(c19160.f57226);
        if (c12196 != null) {
            String strM39569 = m39569(m39528(abstractC17043M39546, c12196));
            String strM45682 = C20186.m45682(strM39569);
            C20243 c20243M39529 = m39529(abstractC17043M39546, c12196, strM45682);
            if (c20243M39529 != null) {
                return c20243M39529.f62580;
            }
            m39429(c16484, abstractC17043M39546, c12196, strM39569);
            C20243 c20243M395210 = m39529(abstractC17043M39546, c12196, strM45682);
            if (c20243M395210 == null) {
                throw m39456(c16484, str, m39510(c16484, str));
            }
            return c20243M395210.f62580;
        }
        if (c9513M39462.f26042.contains(c19160.f57226)) {
            throw C19553.m44405(c16484.f48416, str);
        }
        return C13480.m30624(c16484, c19160);
    }

    /* JADX INFO: renamed from: ۘ */
    public static C22718 m39510(C16484 c16484, String str) {
        return m39471(c16484, str, (String) null, (String) null, (String) null, (C17502) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22718 m39471(C16484 c16484, String str, String str2, String str3, String str4, C17502 c17502) throws C5276 {
        AbstractC17043 abstractC17043M39546 = m39546(c16484, str);
        HashMap mapM39446 = m39446(abstractC17043M39546, c17502);
        ArrayList arrayList = new ArrayList();
        for (C2600 c2600 : m39509(abstractC17043M39546)) {
            C12196 c12196 = (C12196) mapM39446.get(c2600.f4299);
            if (c12196 != null && c12196.f34102.equals(c2600.f4303)) {
                if (c2600.f4306.equals(C20186.m45682(m39569(m39528(abstractC17043M39546, c12196))))) {
                    arrayList.add(c2600);
                }
            }
        }
        HashMap mapM39557 = m39557(abstractC17043M39546);
        for (C2600 c2601 : m39507(abstractC17043M39546)) {
            C14207 c14207 = (C14207) mapM39557.get(c2601.f4307);
            if (c14207 != null && "axml".equals(c14207.f40482)) {
                String strM39569 = m39569(m39540(abstractC17043M39546).m38684(C20186.m45682(c14207.f40480)).m38684("text.xml"));
                String str5 = c2601.f4306;
                if (str5 != null && str5.equals(C20186.m45682(strM39569))) {
                    arrayList.add(c2601);
                }
            }
        }
        int i = 0;
        for (C12196 c12197 : m39446(abstractC17043M39546, c17502).values()) {
            String strM45682 = C20186.m45682(m39569(m39528(abstractC17043M39546, c12197)));
            if (m39529(abstractC17043M39546, c12197, strM45682) == null && !m39502(abstractC17043M39546, c12197, strM45682)) {
                i++;
            }
        }
        int i2 = i;
        for (C14207 c14208 : m39557(abstractC17043M39546).values()) {
            String str6 = c14208.f40482;
            String str7 = c14208.f40480;
            if ("axml".equals(str6)) {
                String strM45683 = C20186.m45682(m39569(m39540(abstractC17043M39546).m38684(C20186.m45682(str7)).m38684("text.xml")));
                if (m39550(abstractC17043M39546, str7, strM45683) == null && !m39539(abstractC17043M39546, str7, strM45683)) {
                    i2++;
                }
            }
        }
        return new C22718(c16484.f48416, str, str2, str3, str4, i2, arrayList.size(), arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m39430(C16484 c16484, AbstractC17043 abstractC17043, C17502 c17502) throws C5276 {
        int i;
        int iM39429 = 0;
        for (C12196 c12196 : m39446(abstractC17043, c17502).values()) {
            String strM39569 = m39569(m39528(abstractC17043, c12196));
            String strM45682 = C20186.m45682(strM39569);
            if (m39529(abstractC17043, c12196, strM45682) == null && !m39502(abstractC17043, c12196, strM45682)) {
                iM39429 += m39429(c16484, abstractC17043, c12196, strM39569);
            }
        }
        for (C14207 c14207 : m39557(abstractC17043).values()) {
            String str = c14207.f40482;
            final String str2 = c14207.f40480;
            if ("axml".equals(str)) {
                String strM395610 = m39569(m39540(abstractC17043).m38684(C20186.m45682(str2)).m38684("text.xml"));
                String strM45683 = C20186.m45682(strM395610);
                if (m39550(abstractC17043, str2, strM45683) == null && !m39539(abstractC17043, str2, strM45683)) {
                    final String strM45684 = C20186.m45682(strM395610);
                    if (m39550(abstractC17043, str2, strM45684) != null || m39539(abstractC17043, str2, strM45684)) {
                        i = 0;
                    } else {
                        C2807 c2807M39447 = m39447(c16484, abstractC17043.getName(), str2, strM395610, strM45684);
                        final C2600 c2600 = c2807M39447.f4801;
                        if (c2600 == null) {
                            try {
                                m39485(abstractC17043, str2, c2807M39447.f4800);
                                try {
                                    ArrayList arrayListM39507 = m39507(abstractC17043);
                                    C7480.removeIf(arrayListM39507, new Predicate() { // from class: l.ۢܰ᩻
                                        @Override // java.util.function.Predicate
                                        public /* synthetic */ Predicate and(Predicate predicate) {
                                            return C20697.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* JADX INFO: renamed from: negate */
                                        public /* synthetic */ Predicate mo55838negate() {
                                            return C20697.$default$negate(this);
                                        }

                                        /* JADX INFO: renamed from: or */
                                        public /* synthetic */ Predicate m26565or(Predicate predicate) {
                                            return C20697.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj) {
                                            C2600 c2601 = (C2600) obj;
                                            if (str2.equals(c2601.f4307)) {
                                                return strM45684.equals(c2601.f4306);
                                            }
                                            return false;
                                        }
                                    });
                                    m39560(abstractC17043, arrayListM39507);
                                    i = 1;
                                } catch (IOException e) {
                                    throw m39450(e);
                                }
                            } catch (IOException e2) {
                                throw m39450(e2);
                            }
                        } else {
                            try {
                                ArrayList arrayListM39508 = m39507(abstractC17043);
                                C7480.removeIf(arrayListM39508, new Predicate() { // from class: l.ܽܰ᩻
                                    @Override // java.util.function.Predicate
                                    public /* synthetic */ Predicate and(Predicate predicate) {
                                        return C20697.$default$and(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    /* JADX INFO: renamed from: negate */
                                    public /* synthetic */ Predicate mo55838negate() {
                                        return C20697.$default$negate(this);
                                    }

                                    /* JADX INFO: renamed from: or */
                                    public /* synthetic */ Predicate m41461or(Predicate predicate) {
                                        return C20697.$default$or(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    public final boolean test(Object obj) {
                                        String str3;
                                        C2600 c2601 = (C2600) obj;
                                        C2600 c2602 = c2600;
                                        String str4 = c2602.f4307;
                                        return str4 != null && str4.equals(c2601.f4307) && (str3 = c2602.f4306) != null && str3.equals(c2601.f4306);
                                    }
                                });
                                arrayListM39508.add(c2600);
                                m39560(abstractC17043, arrayListM39508);
                                i = 0;
                            } catch (IOException e3) {
                                throw m39450(e3);
                            }
                        }
                    }
                    iM39429 += i;
                }
            }
        }
        return iM39429;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20914 m39470(C16484 c16484, C12196 c12196, String str, String str2) throws C5276 {
        try {
            C20960 c20960M39508 = m39508(c16484, c12196.f34102);
            C20765 c20765M47281 = c20960M39508.m47281();
            try {
                C2993 c2993M26641 = C11572.m26641(str, c20765M47281, c20960M39508);
                if (c2993M26641 == null || !c12196.f34101.equals(c2993M26641.getType())) {
                    String str3 = c12196.f34101;
                    return new C20914(null, new C2600("smali_class", str3, str3, c12196.f34102, str2, "SMALI_COMPILE_FAILED_IN_SESSION", "Smali compile did not produce target class.", null, null));
                }
                try {
                    C22776 c22776 = new C22776();
                    c20765M47281.m50870(c22776);
                    return new C20914(new C3478(str2, c22776.m50961()), null);
                } catch (IOException e) {
                    throw m39450(e);
                }
            } catch (C16299 e2) {
                String message = e2.getMessage() == null ? "Smali compile failed." : e2.getMessage();
                int i = e2.f47904;
                Integer numValueOf = i > 0 ? Integer.valueOf(i - 1) : null;
                int i2 = e2.f47908;
                Integer numValueOf2 = i2 >= 0 ? Integer.valueOf(i2) : null;
                String str4 = c12196.f34101;
                return new C20914(null, new C2600("smali_class", str4, str4, c12196.f34102, str2, "SMALI_COMPILE_FAILED_IN_SESSION", message, numValueOf, numValueOf2));
            }
        } catch (OutOfMemoryError unused) {
            throw C19553.m44411();
        }
        throw C19553.m44411();
    }

    /* JADX INFO: renamed from: ۧ */
    public static C20243 m39529(AbstractC17043 abstractC17043, C12196 c12196, String str) {
        AbstractC17043 abstractC17043M39468 = m39468(abstractC17043, c12196);
        if (!abstractC17043M39468.mo25093()) {
            return null;
        }
        try {
            C14677 c14677 = new C14677(abstractC17043M39468.m38664());
            if (c14677.readInt() == 1296388931 && c14677.readInt() == 1 && str.equals(c14677.m33591())) {
                byte[] bArrM33583 = c14677.m33583();
                if (c14677.available() == 0) {
                    for (C9952 c9952 : (AbstractC20050) C14645.m33466((InputStream) new ByteArrayInputStream(bArrM33583)).mo29500()) {
                        if (c12196.f34101.equals(c9952.getType())) {
                            return new C20243(c9952, bArrM33583);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        AbstractC17043 abstractC17043M39469 = m39468(abstractC17043, c12196);
        if (!abstractC17043M39469.mo25094()) {
            return null;
        }
        abstractC17043M39469.mo25503();
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39490(AbstractC17043 abstractC17043, C12196 c12196, C3478 c3478) {
        C11996 c11996 = new C11996(c3478.f6982.length + 96);
        c11996.writeInt(1296388931);
        c11996.writeInt(1);
        c11996.m27443((CharSequence) c3478.f6983);
        c11996.m27454(c3478.f6982);
        AbstractC17043 abstractC17043M39468 = m39468(abstractC17043, c12196);
        abstractC17043M39468.mo37342();
        abstractC17043M39468.m38654(c11996);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m39533(C16484 c16484, C8438 c8438, String str, String str2, String str3, String str4) throws C5276 {
        JSONArray jSONArrayM39520;
        String str5 = c16484.f48416;
        if (str4.equals(c8438.f22627)) {
            return;
        }
        JSONObject jSONObjectAdd = m39436(str5, str, str2, str3).add("currentTargetVersion", str4);
        if ("missing".equals(str4)) {
            jSONArrayM39520 = JSON.array();
        } else {
            jSONArrayM39520 = m39520(str5, str, str2, str3);
        }
        throw C5276.m11407("TARGET_VERSION_MISMATCH", "targetVersion does not match current target text. Re-read the target and retry with data.targetVersion.", "warning", jSONArrayM39520, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ۢ */
    public static String m39518(String str) {
        return C16111.m36665(C16111.m36666().digest(str.getBytes(StandardCharsets.UTF_8))).substring(0, 16);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3  */
    /* JADX INFO: renamed from: ۧ */
    private C7295 m39525(C16484 c16484, AbstractC17043 abstractC17043, C21850 c21850) throws C5276 {
        String str = c16484.f48416;
        String str2 = c21850.f68748;
        String str3 = c21850.f68747;
        String strM39512 = m39512(str2);
        if (m39527(abstractC17043, strM39512) != null) {
            throw C19553.m44405(str, str3);
        }
        C12196 c12196 = (C12196) m39519(abstractC17043).get(strM39512);
        int iM39517 = m39517(c16484, strM39512);
        boolean z = true;
        if (c12196 == null && iM39517 > 1) {
            throw C5276.m11405("AMBIGUOUS_CLASS_IN_DEX", "Class exists in multiple dex files.");
        }
        boolean z2 = iM39517 > 0;
        if (c12196 == null && !z2) {
            throw C19553.m44405(str, str3);
        }
        String str4 = (c12196 != null ? c12196 : new C12196(m39571(c16484, strM39512).f57227, strM39512)).f34102;
        C10184 c10184 = new C10184("dex", strM39512, str4, c12196 != null);
        m39568(abstractC17043);
        try {
            m39488(abstractC17043, c10184, m39467(abstractC17043));
            if (z2) {
                m39564(abstractC17043, strM39512, str4);
            } else {
                ArrayList arrayListM39515 = m39515(abstractC17043);
                C7480.removeIf(arrayListM39515, new C13796(strM39512));
                m39556(abstractC17043, arrayListM39515);
            }
            ArrayList arrayListM39509 = m39509(abstractC17043);
            C7480.removeIf(arrayListM39509, new C14788(1, strM39512));
            m39543(abstractC17043, arrayListM39509);
            m39431(abstractC17043, m39568(abstractC17043));
            try {
                m39536(abstractC17043, c10184);
            } catch (IOException e) {
                e = e;
                if (z || !m39501(abstractC17043, c10184, e)) {
                    m39500(abstractC17043, e);
                    if (e instanceof C5276) {
                        throw ((C5276) e);
                    }
                    throw m39450(e);
                }
                C21306.m48192("MT MCP delete commit completed after storage error, editSessionId=".concat(str3), e);
            } catch (C5276 e2) {
                e = e2;
                if (z) {
                }
                m39500(abstractC17043, e);
                if (e instanceof C5276) {
                    throw ((C5276) e);
                }
                throw m39450(e);
            }
        } catch (IOException | C5276 e3) {
            e = e3;
            z = false;
        }
        m39514(abstractC17043);
        return new C7295(c21850.f68750, str3, c21850.f68749, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    private C7295 m39460(C16484 c16484, AbstractC17043 abstractC17043, C21850 c21850, C17502 c17502) throws C5276 {
        C3478 c3478;
        String str = c16484.f48416;
        String str2 = c21850.f68748;
        String str3 = c21850.f68747;
        String strM34042 = C14884.m34042(str2);
        String strM34088 = C14884.m34088(str2);
        if (m39527(abstractC17043, strM34042) != null) {
            throw C19553.m44405(str, str3);
        }
        String strM23607 = C10127.m23607(m39578(c16484, str3, strM34042, c17502));
        C21843 c21843M12803 = C5749.m12802(strM34042, strM23607).m12803(strM34088);
        if (c21843M12803 != null) {
            int i = c21843M12803.f68735;
            boolean z = false;
            String strM39439 = m39439(strM23607, Math.max(0, i - 1), Math.max(Math.max(0, i - 1), c21843M12803.f68738), "");
            String strM39441 = m39441(c16484, abstractC17043, strM34042);
            C12196 c12196 = new C12196(strM39441, strM34042);
            String strM45682 = C20186.m45682(strM39439);
            if (m39529(abstractC17043, c12196, strM45682) == null) {
                C20914 c20914M39470 = m39470(c16484, c12196, strM39439, strM45682);
                C2600 c2600 = c20914M39470.f65677;
                if (c2600 == null) {
                    c3478 = c20914M39470.f65676;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c2600);
                    throw m39457(c16484, str3, false, "SMALI_COMPILE_FAILED_IN_SESSION", "Smali compile failed; delete candidate was not saved.", m39435(arrayList), c21850.f68749, c21850.f68748);
                }
            } else {
                c3478 = null;
            }
            C10184 c10184 = new C10184("dex", strM34042, strM39441, m39528(abstractC17043, c12196).mo25093());
            m39568(abstractC17043);
            try {
                m39488(abstractC17043, c10184, m39467(abstractC17043));
                AbstractC17043 abstractC17043M39528 = m39528(abstractC17043, c12196);
                abstractC17043M39528.mo37342();
                abstractC17043M39528.m38660(strM39439.getBytes(StandardCharsets.UTF_8));
                ArrayList arrayListM39515 = m39515(abstractC17043);
                C7480.removeIf(arrayListM39515, new C13796(strM34042));
                m39556(abstractC17043, arrayListM39515);
                ArrayList arrayListM39509 = m39509(abstractC17043);
                C7480.removeIf(arrayListM39509, new C14788(1, strM34042));
                m39543(abstractC17043, arrayListM39509);
                m39431(abstractC17043, m39568(abstractC17043));
                try {
                    m39536(abstractC17043, c10184);
                } catch (IOException | C5276 e) {
                    e = e;
                    z = true;
                    if (!z || !m39501(abstractC17043, c10184, e)) {
                        m39500(abstractC17043, e);
                        if (e instanceof C5276) {
                            throw ((C5276) e);
                        }
                        throw m39450(e);
                    }
                    C21306.m48192("MT MCP method delete commit completed after storage error, editSessionId=".concat(str3), e);
                }
            } catch (IOException e2) {
                e = e2;
            } catch (C5276 e3) {
                e = e3;
            }
            m39514(abstractC17043);
            if (c3478 != null) {
                try {
                    m39490(abstractC17043, c12196, c3478);
                } catch (Exception e4) {
                    try {
                        AbstractC17043 abstractC17043M39468 = m39468(abstractC17043, c12196);
                        if (abstractC17043M39468.mo25094()) {
                            abstractC17043M39468.mo25503();
                        }
                    } catch (RuntimeException e5) {
                        e4.addSuppressed(e5);
                    }
                    C21306.m48192("MT MCP delete cache publish failed, editSessionId=".concat(str3), e4);
                }
            }
            return new C7295(c21850.f68750, str3, c21850.f68749, str2);
        }
        throw C19553.m44413(str, str3, strM34042);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m39440(C16484 c16484, C8438 c8438, String str, String str2, String str3, String str4) throws C5276 {
        ArrayList arrayList = c8438.f22624;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            C12462 c12462 = (C12462) arrayList.get(i);
            String str5 = c12462.f34871;
            if (!m39561(str5)) {
                throw C5276.m11406("Invalid mode", C19768.m44906(i, "edits[", "].mode"), JSON.value(str5), JSON.array("replace_match", "insert_before_match", "insert_after_match"), JSON.object());
            }
            arrayList2.add(new C23941(str5, c12462.f34870, c12462.f34872));
        }
        try {
            return C10127.m23607(C17944.m40803(str4, arrayList2));
        } catch (C15223 e) {
            int i2 = e.f43414;
            String strM44906 = C19768.m44906(i2, "edits[", "]");
            int i3 = C10855.f30085[e.f43412.ordinal()];
            if (i3 == 1) {
                throw m39452("TEXT_MATCH_NOT_FOUND", C17588.m40053(strM44906, ".matchText was not found in current text. Re-read the target and retry with current text."), c16484.f48416, str, str2, str3, e.f43414);
            }
            if (i3 == 2) {
                throw m39452("TEXT_MATCH_AMBIGUOUS", C17588.m40053(strM44906, ".matchText appears multiple times in current text; provide a longer matchText with surrounding context that appears only once."), c16484.f48416, str, str2, str3, e.f43414);
            }
            if (i3 == 3) {
                throw m39452("TEXT_MATCH_OVERLAP", C5410.m11876(e.f43413, "]; match ranges must not overlap.", C9179.m21133(strM44906, " overlaps edits[")), c16484.f48416, str, str2, str3, e.f43414);
            }
            if (i3 == 4) {
                throw C5276.m11406("Invalid mode", C17588.m40053(strM44906, ".mode"), JSON.value(((C12462) arrayList.get(i2)).f34871), JSON.array("replace_match", "insert_before_match", "insert_after_match"), JSON.object());
            }
            throw new IncompatibleClassChangeError();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m39452(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        return C5276.m11407(str, str2, "warning", m39520(str3, str4, str5, str6), m39436(str3, str4, str5, str6).add("failedEditIndex", i));
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m39561(String str) {
        return "replace_match".equals(str) || "insert_before_match".equals(str) || "insert_after_match".equals(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m39436(String str, String str2, String str3, String str4) {
        return C9417.m21913("workspaceId", str, "editSessionId", str2).add("targetType", str3).add("target", str4).add("locator", C14884.m34020(str3, str4)).add("failures", JSON.array());
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONArray m39520(String str, String str2, String str3, String str4) {
        return JSON.array().add(C11982.m27418(C9417.m21913("workspaceId", str, "editSessionId", str2).add("locator", C14884.m34020(str3, str4)).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_apk_read_text", "retry", "Read current target text and targetVersion"));
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m39544(String str) {
        return str.startsWith(".method") && str.length() > 7 && Character.isWhitespace(str.charAt(7));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m39438(String str) throws C5276 {
        int iIndexOf = str.indexOf(35);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        String strTrim = str.trim();
        if (!strTrim.startsWith(".class")) {
            return null;
        }
        if (strTrim.length() > 6 && !Character.isWhitespace(strTrim.charAt(6))) {
            return null;
        }
        String[] strArrSplit = strTrim.split("\\s+");
        if (strArrSplit.length < 2) {
            throw C5276.m11405("SMALI_CLASS_MISMATCH", "Smali .class directive is invalid.");
        }
        return m39512(strArrSplit[strArrSplit.length - 1]);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m39458(C16484 c16484, C8438 c8438, String str) {
        return C5276.m11407("DEX_METHOD_MISMATCH", str, "fatal", JSON.array(), JSON.object().add("workspaceId", c16484.f48416).add("editSessionId", c8438.f22623).add("locator", C14884.m34020(c8438.f22628, c8438.f22626)).add("failures", JSON.array()));
    }

    /* JADX INFO: renamed from: ۖ */
    public static C20960 m39508(C16484 c16484, String str) throws C5276 {
        int i;
        C14645 c14645;
        C20960 c20960 = new C20960();
        synchronized (c16484.f48419) {
            Reference reference = (Reference) c16484.f48419.get(str);
            if (reference == null || (c14645 = (C14645) reference.get()) == null) {
                try {
                    BufferedInputStream bufferedInputStreamM38676 = c16484.m37406(str).m38676();
                    try {
                        C9873 c9873M23152 = C9873.m23152(C12461.m28690(bufferedInputStreamM38676));
                        bufferedInputStreamM38676.close();
                        i = c9873M23152.f27379;
                    } catch (Throwable th) {
                        try {
                            bufferedInputStreamM38676.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                    throw C19553.m44408(c16484.f48427, c16484.f48412);
                }
            } else {
                i = c14645.mo29499().f27379;
            }
        }
        c20960.f65851 = i;
        return c20960;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static C19160 m39571(C16484 c16484, String str) throws C5276 {
        C19160 c19160 = null;
        for (C19160 c19161 : c16484.f48430) {
            if (str.equals(C16477.m37402(c19161.f57226))) {
                c19160 = c19161;
            }
        }
        if (c19160 != null) {
            return c19160;
        }
        throw C19553.m44405(c16484.f48416, "");
    }

    /* JADX INFO: renamed from: ۢ */
    public static int m39517(C16484 c16484, String str) {
        return ((Integer) C15525.getOrDefault(c16484.f48422, C16477.m37400(str), 0)).intValue();
    }

    /* JADX INFO: renamed from: ܺ */
    public static AbstractC17043 m39546(C16484 c16484, String str) throws C5276 {
        if (m39567(str)) {
            throw C5276.m11405("EDIT_SESSION_REQUIRED", "editSessionId is required for edit session tools.");
        }
        if (m39577(str)) {
            AbstractC17043 abstractC17043M38684 = c16484.f48414.m38684("edit_sessions").m38684(str);
            if (!abstractC17043M38684.mo25087()) {
                throw C5276.m11405("EDIT_SESSION_NOT_FOUND", "Edit session was not found.");
            }
            m39427(abstractC17043M38684);
            return abstractC17043M38684;
        }
        throw C5276.m11406("Invalid editSessionId", "editSessionId", JSON.value(str), JSON.array(), JSON.object().add("editSessionId", "ab12cd34"));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39486(AbstractC17043 abstractC17043, ArrayList arrayList) throws IOException {
        byte[] bArrM38664;
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("overlay").m38684("resource_value");
        ArrayList<C24265> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            bArrM38664 = null;
            if (!it.hasNext()) {
                break;
            }
            String str = ((C15547) it.next()).f44426;
            AbstractC17043 abstractC17043M14225 = C6268.m14225(abstractC17043M38684, str);
            boolean zMo25093 = abstractC17043M14225.mo25093();
            if (abstractC17043M14225.mo25093()) {
                bArrM38664 = abstractC17043M14225.m38664();
            }
            arrayList2.add(new C24265(str, zMo25093, bArrM38664));
        }
        AbstractC17043 abstractC17043M38685 = abstractC17043.m38684("state.json");
        boolean zMo25094 = abstractC17043M38685.mo25093();
        bArrM38664 = abstractC17043M38685.mo25093() ? abstractC17043M38685.m38664() : null;
        try {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C15547 c15547 = (C15547) it2.next();
                C6268 c6268 = c15547.f44425;
                if (c6268 != null) {
                    c6268.m14233(abstractC17043M38684);
                } else {
                    AbstractC17043 abstractC17043M14226 = C6268.m14225(abstractC17043M38684, c15547.f44426);
                    if (abstractC17043M14226.mo25094() && !abstractC17043M14226.mo25503()) {
                        throw new IOException("Unable to delete resource patch");
                    }
                }
            }
            m39431(abstractC17043, m39568(abstractC17043));
        } catch (IOException | C5276 e) {
            try {
                for (C24265 c24265 : arrayList2) {
                    AbstractC17043 abstractC17043M14227 = C6268.m14225(abstractC17043M38684, c24265.f76885);
                    if (c24265.f76884) {
                        m39537(abstractC17043M14227, c24265.f76883, ".resource_patch_restore");
                    } else {
                        AbstractC17043 abstractC17043M14228 = C6268.m14225(abstractC17043M38684, c24265.f76885);
                        if (abstractC17043M14228.mo25094() && !abstractC17043M14228.mo25503()) {
                            throw new IOException("Unable to delete resource patch");
                        }
                    }
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            try {
                if (zMo25094) {
                    m39537(abstractC17043M38685, bArrM38664, ".state_restore");
                    throw e;
                }
                if (!abstractC17043M38685.mo25094()) {
                    throw e;
                }
                if (abstractC17043M38685.mo25503()) {
                    throw e;
                }
                throw new IOException("Unable to restore edit session state");
            } catch (IOException e3) {
                e.addSuppressed(e3);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC17043 m39528(AbstractC17043 abstractC17043, C12196 c12196) {
        return abstractC17043.m38684("overlay").m38684("dex").m38684(c12196.f34102).m38684(C20186.m45682(c12196.f34101).concat(".smali"));
    }

    /* JADX INFO: renamed from: ܳ */
    public static AbstractC17043 m39540(AbstractC17043 abstractC17043) {
        return abstractC17043.m38684("overlay").m38684(Entry.DEFAULT_NAME);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m39468(AbstractC17043 abstractC17043, C12196 c12196) {
        return abstractC17043.m38684("cache").m38684("dex").m38684(c12196.f34102).m38684(C20186.m45682(c12196.f34101).concat(".bin"));
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC17043 m39552(AbstractC17043 abstractC17043, String str) {
        return abstractC17043.m38684("cache").m38684(Entry.DEFAULT_NAME).m38684(C20186.m45682(str).concat(".bin"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39488(AbstractC17043 abstractC17043, C10184 c10184, AbstractC17043 abstractC17044) throws IOException {
        boolean z;
        boolean z2;
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("deleted");
        String str = c10184.f28250;
        AbstractC17043 abstractC17043M38685 = abstractC17043M38684.m38684("dex".equals(str) ? "dex.json" : "entry.json");
        AbstractC17043 abstractC17043M38686 = abstractC17044.m38684("deleted.backup");
        boolean z3 = true;
        if (abstractC17043M38685.mo25093()) {
            abstractC17043M38686.m38660(abstractC17043M38685.m38664());
            z = true;
        } else {
            z = false;
        }
        c10184.f28244 = z;
        AbstractC17043 abstractC17043M38687 = abstractC17043.m38684("failures").m38684("dex".equals(str) ? "dex.json" : "entry.json");
        AbstractC17043 abstractC17043M38688 = abstractC17044.m38684("failures.backup");
        if (abstractC17043M38687.mo25093()) {
            abstractC17043M38688.m38660(abstractC17043M38687.m38664());
            z2 = true;
        } else {
            z2 = false;
        }
        c10184.f28247 = z2;
        AbstractC17043 abstractC17043M38689 = abstractC17043.m38684("state.json");
        AbstractC17043 abstractC17043M386810 = abstractC17044.m38684("state.backup");
        if (abstractC17043M38689.mo25093()) {
            abstractC17043M386810.m38660(abstractC17043M38689.m38664());
        } else {
            z3 = false;
        }
        c10184.f28248 = z3;
        m39494(abstractC17043.m38684(".delete_transaction").m38684("transaction.json"), m39505(c10184, "prepared"), ".delete_txn");
        if (c10184.f28249) {
            AbstractC17043 abstractC17043M39553 = m39553(abstractC17043, c10184);
            AbstractC17043 abstractC17043M386811 = abstractC17044.m38684("overlay.backup");
            if (!abstractC17043M39553.mo25094() || abstractC17043M386811.mo25094() || !abstractC17043M39553.mo25502(abstractC17043M386811)) {
                throw new IOException("Unable to stage delete transaction overlay");
            }
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public static ArrayList m39515(AbstractC17043 abstractC17043) throws C5276 {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("deleted").m38684("dex.json");
        ArrayList arrayList = new ArrayList();
        if (abstractC17043M38684.mo25093()) {
            try {
                JSONValue jSONValue = JSON.parse(m39569(abstractC17043M38684));
                if (jSONValue.isArray()) {
                    Iterator it = jSONValue.asArray().iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                        arrayList.add(new C16888(jSONObjectAsObject.getString("className", null), jSONObjectAsObject.getString("dexEntryName", null)));
                    }
                }
            } catch (Exception e) {
                throw m39450(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܺ */
    public static ArrayList m39545(AbstractC17043 abstractC17043) throws C5276 {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("deleted").m38684("entry.json");
        ArrayList arrayList = new ArrayList();
        if (abstractC17043M38684.mo25093()) {
            try {
                JSONValue jSONValue = JSON.parse(m39569(abstractC17043M38684));
                if (jSONValue.isArray()) {
                    Iterator it = jSONValue.asArray().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((JSONValue) it.next()).asObject().getString("entryName", null));
                    }
                    C7480.removeIf(arrayList, new C2430(3));
                    return arrayList;
                }
            } catch (Exception e) {
                throw m39450(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۖ */
    public static ArrayList m39507(AbstractC17043 abstractC17043) throws C5276 {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("failures").m38684("entry.json");
        ArrayList arrayList = new ArrayList();
        if (abstractC17043M38684.mo25093()) {
            try {
                JSONValue jSONValue = JSON.parse(m39569(abstractC17043M38684));
                if (jSONValue.isArray()) {
                    Iterator it = jSONValue.asArray().iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                        arrayList.add(new C2600(jSONObjectAsObject.getString("targetType", null), jSONObjectAsObject.getString("target", null), null, null, jSONObjectAsObject.getString("textHash", null), jSONObjectAsObject.getString("errorCode", null), jSONObjectAsObject.getString("message", null), (jSONObjectAsObject.get("line") == null || jSONObjectAsObject.get("line").isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("line", -1)), (jSONObjectAsObject.get("column") == null || jSONObjectAsObject.get("column").isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("column", -1))));
                    }
                }
            } catch (Exception e) {
                throw m39450(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۘ */
    public static ArrayList m39509(AbstractC17043 abstractC17043) throws C5276 {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("failures").m38684("dex.json");
        ArrayList arrayList = new ArrayList();
        if (abstractC17043M38684.mo25093()) {
            try {
                JSONValue jSONValue = JSON.parse(m39569(abstractC17043M38684));
                if (jSONValue.isArray()) {
                    Iterator it = jSONValue.asArray().iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                        arrayList.add(new C2600(jSONObjectAsObject.getString("targetType", "smali_class"), jSONObjectAsObject.getString("target", jSONObjectAsObject.getString("className", null)), jSONObjectAsObject.getString("className", null), jSONObjectAsObject.getString("dexEntryName", null), jSONObjectAsObject.getString("textHash", null), jSONObjectAsObject.getString("errorCode", "SMALI_COMPILE_FAILED_IN_SESSION"), jSONObjectAsObject.getString("message", "Smali compile failed."), (jSONObjectAsObject.get("line") == null || jSONObjectAsObject.get("line").isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("line", -1)), (jSONObjectAsObject.get("column") == null || jSONObjectAsObject.get("column").isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("column", -1))));
                    }
                }
            } catch (Exception e) {
                throw m39450(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۚ */
    public static long m39511(AbstractC17043 abstractC17043) {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("state.json");
        if (abstractC17043M38684.mo25093()) {
            try {
                long j = JSON.parse(m39569(abstractC17043M38684)).asObject().getLong("lastAccessedAt", -1L);
                if (j >= 0) {
                    return j;
                }
            } catch (Exception unused) {
            }
            return abstractC17043M38684.mo25091();
        }
        return abstractC17043.mo25091();
    }

    /* JADX INFO: renamed from: ᩴ */
    public static C22925 m39568(AbstractC17043 abstractC17043) throws C5276 {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("state.json");
        if (!abstractC17043M38684.mo25093()) {
            throw m39450(new IOException("Edit session state is missing."));
        }
        try {
            JSONObject jSONObjectAsObject = JSON.parse(m39569(abstractC17043M38684)).asObject();
            int i = jSONObjectAsObject.getInt("revision", -1);
            if (i < 0) {
                throw new NumberFormatException("negative revision");
            }
            long jMo25091 = jSONObjectAsObject.getLong("createdAt", -1L);
            if (jMo25091 < 0) {
                jMo25091 = abstractC17043.mo25091();
            }
            long jM39511 = jSONObjectAsObject.getLong("lastAccessedAt", -1L);
            if (jM39511 < 0) {
                jM39511 = m39511(abstractC17043);
            }
            return new C22925(jMo25091, i, jM39511);
        } catch (Exception e) {
            throw m39450(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private ArrayList m39521(C16484 c16484, AbstractC17043 abstractC17043) {
        int i = m39568(abstractC17043).f72140;
        String str = c16484.f48416;
        String name = abstractC17043.getName();
        C12107 c12107 = this.f51871;
        ArrayList arrayListM27996 = c12107.m27996(i, str, name);
        if (arrayListM27996 != null) {
            return arrayListM27996;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("overlay").m38684("resource_value");
        if (abstractC17043M38684.mo25087()) {
            for (AbstractC17043 abstractC17044 : abstractC17043M38684.mo25500(true)) {
                if (abstractC17044.mo25093() && C6268.m14227(abstractC17044.getName())) {
                    arrayList.add(C6268.m14231(abstractC17044));
                }
            }
        }
        return c12107.m27997(i, c16484.f48416, abstractC17043.getName(), C6268.m14223(arrayList));
    }

    /* JADX INFO: renamed from: ֫ */
    private int m39431(AbstractC17043 abstractC17043, C22925 c22925) throws C5276 {
        int i = c22925.f72140;
        if (i == Integer.MAX_VALUE) {
            throw m39450(new IOException("Edit session revision overflow."));
        }
        int i2 = i + 1;
        long j = c22925.f72139;
        m39537(abstractC17043.m38684("state.json"), JSON.object().add("revision", i2).add("createdAt", j).add("lastAccessedAt", System.currentTimeMillis()).toString().getBytes(StandardCharsets.UTF_8), ".state");
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9513 m39462(C16484 c16484, String str, AbstractC17043 abstractC17043, C17502 c17502) throws C5276 {
        if (c17502 == null) {
            return m39463(abstractC17043, c16484.f48416, str);
        }
        Object objM39867 = c17502.m39867("apk.edit.sessionClassView");
        if (objM39867 instanceof C9513) {
            C9513 c9513 = (C9513) objM39867;
            if (c9513.f26045.equals(c16484.f48416) && c9513.f26043.equals(str)) {
                return c9513;
            }
        }
        C9513 c9513M39463 = m39463(abstractC17043, c16484.f48416, str);
        c17502.m39870(c9513M39463, "apk.edit.sessionClassView");
        return c9513M39463;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9513 m39463(AbstractC17043 abstractC17043, String str, String str2) throws C5276 {
        HashMap mapM39519 = m39519(abstractC17043);
        HashMap map = new HashMap();
        for (C12196 c12196 : mapM39519.values()) {
            map.put(c12196.f34100, c12196);
        }
        HashSet hashSet = new HashSet();
        Iterator it = m39515(abstractC17043).iterator();
        while (it.hasNext()) {
            hashSet.add(C16477.m37400(((C16888) it.next()).f49998));
        }
        return new C9513(str, str2, mapM39519, map, hashSet);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m39441(C16484 c16484, AbstractC17043 abstractC17043, String str) throws C5276 {
        C12196 c12196 = (C12196) m39519(abstractC17043).get(str);
        if (c12196 != null) {
            return c12196.f34102;
        }
        C16888 c16888M39527 = m39527(abstractC17043, str);
        if (c16888M39527 != null) {
            return c16888M39527.f49999;
        }
        int iM39517 = m39517(c16484, str);
        ArrayList arrayList = c16484.f48423;
        if (iM39517 > 1) {
            throw C5276.m11405("AMBIGUOUS_CLASS_IN_DEX", "Class exists in multiple dex files.");
        }
        if (iM39517 == 1) {
            return m39571(c16484, str).f57227;
        }
        if (arrayList.isEmpty()) {
            throw C5276.m11405("NO_DEX_IN_WORKSPACE", "Workspace has no dex file for new Smali.");
        }
        return (String) C7480.stream(arrayList).max(C19831.m45077()).orElse((String) C20013.m45383(arrayList, 1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static HashMap m39446(AbstractC17043 abstractC17043, C17502 c17502) throws C5276 {
        if (c17502 == null) {
            return m39519(abstractC17043);
        }
        String strM14442 = C6316.m14442(abstractC17043, new StringBuilder("apk.edit.overlayRefs:"));
        Object objM39867 = c17502.m39867(strM14442);
        if (objM39867 != null) {
            return (HashMap) objM39867;
        }
        HashMap mapM39519 = m39519(abstractC17043);
        c17502.m39870(mapM39519, strM14442);
        return mapM39519;
    }

    /* JADX INFO: renamed from: ۢ */
    public static HashMap m39519(AbstractC17043 abstractC17043) throws C5276 {
        HashMap map = new HashMap();
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("overlay").m38684("dex");
        if (abstractC17043M38684.mo25087()) {
            for (AbstractC17043 abstractC17044 : abstractC17043M38684.mo25500(true)) {
                if (abstractC17044.mo25087()) {
                    String name = abstractC17044.getName();
                    for (AbstractC17043 abstractC17045 : abstractC17044.mo25500(true)) {
                        if (!abstractC17045.mo25087() && abstractC17045.getName().endsWith(".smali")) {
                            try {
                                String strM39574 = m39574(abstractC17045);
                                if (!abstractC17045.getName().equals(C20186.m45682(strM39574).concat(".smali"))) {
                                    throw m39448();
                                }
                                map.put(strM39574, new C12196(name, strM39574));
                            } catch (IOException | C5276 unused) {
                                throw m39448();
                            }
                        }
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static String m39574(AbstractC17043 abstractC17043) throws C5276, IOException {
        String strM39438;
        BufferedReader bufferedReaderM38679 = abstractC17043.m38679();
        do {
            try {
                String line = bufferedReaderM38679.readLine();
                if (line != null) {
                    strM39438 = m39438(line);
                } else {
                    bufferedReaderM38679.close();
                    throw C5276.m11405("SMALI_CLASS_MISMATCH", "Smali text must contain a .class directive.");
                }
            } catch (Throwable th) {
                try {
                    bufferedReaderM38679.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } while (strM39438 == null);
        bufferedReaderM38679.close();
        return strM39438;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m39556(AbstractC17043 abstractC17043, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C16888 c16888 = (C16888) it.next();
            jSONArrayArray.add(JSON.object().add("className", c16888.f49998).add("dexEntryName", c16888.f49999));
        }
        abstractC17043.m38684("deleted").m38684("dex.json").m38660(jSONArrayArray.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C16888 m39527(AbstractC17043 abstractC17043, String str) {
        for (C16888 c16888 : m39515(abstractC17043)) {
            if (str.equals(c16888.f49998)) {
                return c16888;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m39564(AbstractC17043 abstractC17043, final String str, String str2) throws C5276 {
        ArrayList arrayListM39515 = m39515(abstractC17043);
        C7480.removeIf(arrayListM39515, new Predicate() { // from class: l.᩺᩺᩻
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m54096or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C16888) obj).f49998);
            }
        });
        arrayListM39515.add(new C16888(str, str2));
        m39556(abstractC17043, arrayListM39515);
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m39543(AbstractC17043 abstractC17043, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2600 c2600 = (C2600) it.next();
            JSONObject jSONObjectAdd = JSON.object().add("targetType", c2600.f4300).add("target", c2600.f4307).add("className", c2600.f4299).add("dexEntryName", c2600.f4303).add("textHash", c2600.f4306).add("errorCode", c2600.f4305).add("message", c2600.f4302);
            Integer num = c2600.f4304;
            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c2600.f4301;
            jSONArrayArray.add(jSONObjectAdd2.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        abstractC17043.m38684("failures").m38684("dex.json").m38660(jSONArrayArray.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m39502(AbstractC17043 abstractC17043, C12196 c12196, String str) {
        for (C2600 c2600 : m39509(abstractC17043)) {
            if (c12196.f34101.equals(c2600.f4299) && c12196.f34102.equals(c2600.f4303) && str.equals(c2600.f4306)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private C2807 m39447(C16484 c16484, String str, String str2, String str3, String str4) throws C5276 {
        Integer num;
        Integer numValueOf;
        try {
            try {
                C11996 c11996 = new C11996();
                C4397 c4397 = new C4397(this.f51871.m27998(c16484, this, str));
                c4397.m9153(true);
                c4397.m9150(str3);
                c4397.m9152(c11996);
                int size = c11996.size();
                if (size > 2097152) {
                    return new C2807(null, new C2600("axml", str2, null, null, str4, "AXML_ENCODED_TOO_LARGE", "Encoded AXML is too large.", null, null));
                }
                try {
                    return new C2807(new C21584(str4, Arrays.copyOf(c11996.m27458(), size)), null);
                } catch (C3870 e) {
                    e = e;
                    if (e.m7629() != null) {
                        int iM40851 = e.m7629().m40851();
                        int iM40842 = e.m7629().m40842();
                        Integer numValueOf2 = iM40851 > 0 ? Integer.valueOf(iM40851 - 1) : null;
                        numValueOf = iM40842 > 0 ? Integer.valueOf(iM40842 - 1) : null;
                        num = numValueOf2;
                    } else {
                        num = null;
                        numValueOf = null;
                    }
                    return new C2807(null, new C2600("axml", str2, null, null, str4, "AXML_ENCODE_FAILED", e.getMessage() != null ? e.getMessage() : "AXML encode failed.", num, numValueOf));
                } catch (Exception e2) {
                    e = e2;
                    return new C2807(null, new C2600("axml", str2, null, null, str4, "AXML_ENCODE_FAILED", e.getMessage() != null ? e.getMessage() : "AXML encode failed.", null, null));
                }
            } catch (OutOfMemoryError unused) {
                throw C19553.m44411();
            }
        } catch (C3870 e3) {
            e = e3;
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static C6161 m39550(AbstractC17043 abstractC17043, String str, String str2) {
        AbstractC17043 abstractC17043M39552 = m39552(abstractC17043, str);
        if (!abstractC17043M39552.mo25093()) {
            return null;
        }
        try {
            C14677 c14677 = new C14677(abstractC17043M39552.m38664());
            if (c14677.readInt() == 1296384323 && c14677.readInt() == 1 && str.equals(c14677.m33591()) && str2.equals(c14677.m33591())) {
                byte[] bArrM33583 = c14677.m33583();
                if (c14677.available() == 0) {
                    return new C6161(bArrM33583);
                }
            }
        } catch (Exception unused) {
        }
        AbstractC17043 abstractC17043M39553 = m39552(abstractC17043, str);
        if (!abstractC17043M39553.mo25094()) {
            return null;
        }
        abstractC17043M39553.mo25503();
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39485(AbstractC17043 abstractC17043, String str, C21584 c21584) {
        C11996 c11996 = new C11996(c21584.f68056.length + 128);
        c11996.writeInt(1296384323);
        c11996.writeInt(1);
        c11996.m27443((CharSequence) str);
        c11996.m27443((CharSequence) c21584.f68057);
        c11996.m27454(c21584.f68056);
        AbstractC17043 abstractC17043M39552 = m39552(abstractC17043, str);
        abstractC17043M39552.mo37342();
        abstractC17043M39552.m38654(c11996);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
    /* JADX INFO: renamed from: ֫ */
    private void m39489(AbstractC17043 abstractC17043, C10184 c10184, byte[] bArr, String str, C10680 c10680) throws C5276 {
        C22925 c22925M39568 = m39568(abstractC17043);
        try {
            AbstractC17043 abstractC17043M39467 = m39467(abstractC17043);
            AbstractC17043 abstractC17043M38684 = abstractC17043M39467.m38684("overlay.next");
            String str2 = c10184.f28250;
            String str3 = c10184.f28246;
            boolean zEquals = "dex".equals(str2);
            if (zEquals) {
                abstractC17043M38684.m38660(bArr);
            } else {
                abstractC17043M38684.m38666();
                m39483(abstractC17043M38684.m38684("meta.json"), str3, str, c10680);
                abstractC17043M38684.m38684("axml".equals(str) ? "text.xml" : "data.bin").m38660(bArr);
            }
            m39488(abstractC17043, c10184, abstractC17043M39467);
            AbstractC17043 abstractC17043M39553 = m39553(abstractC17043, c10184);
            abstractC17043M39553.mo37342();
            if (abstractC17043M39553.mo25094() || !abstractC17043M38684.mo25502(abstractC17043M39553)) {
                throw new IOException("Unable to publish text overlay");
            }
            if (zEquals) {
                ArrayList arrayListM39515 = m39515(abstractC17043);
                C7480.removeIf(arrayListM39515, new C13796(str3));
                m39556(abstractC17043, arrayListM39515);
                ArrayList arrayListM39509 = m39509(abstractC17043);
                C7480.removeIf(arrayListM39509, new C14788(1, str3));
                m39543(abstractC17043, arrayListM39509);
            } else {
                ArrayList arrayListM39545 = m39545(abstractC17043);
                arrayListM39545.remove(str3);
                m39565(abstractC17043, arrayListM39545);
                m39542(abstractC17043, str3);
            }
            m39431(abstractC17043, c22925M39568);
            m39536(abstractC17043, c10184);
            m39514(abstractC17043);
        } catch (IOException e) {
            e = e;
            if (0 != 0 || !m39501(abstractC17043, c10184, e)) {
                m39500(abstractC17043, e);
                if (e instanceof C5276) {
                    throw ((C5276) e);
                }
                throw m39450(e);
            }
            C21306.m48192("MT MCP text edit commit completed after storage error, editSessionId=" + abstractC17043.getName(), e);
        } catch (RuntimeException e2) {
            if (!m39538(e2)) {
                throw e2;
            }
            IOException iOException = new IOException("Edit session storage backend failed", e2);
            if (0 == 0 || !m39501(abstractC17043, c10184, iOException)) {
                m39500(abstractC17043, iOException);
                throw m39450(iOException);
            }
            C21306.m48192("MT MCP text edit commit completed after backend error, editSessionId=" + abstractC17043.getName(), e2);
        } catch (C5276 e3) {
            e = e3;
            if (0 != 0) {
            }
            m39500(abstractC17043, e);
            if (e instanceof C5276) {
                throw ((C5276) e);
            }
            throw m39450(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39483(AbstractC17043 abstractC17043, String str, String str2, C10680 c10680) {
        abstractC17043.m38660(C9417.m21913("targetType", str2, "entryName", str).add("encoding", c10680.f29575).add("lineEnding", c10680.f29576).toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ܿ */
    public static HashMap m39557(AbstractC17043 abstractC17043) throws C5276 {
        HashMap map = new HashMap();
        AbstractC17043 abstractC17043M39540 = m39540(abstractC17043);
        if (abstractC17043M39540.mo25087()) {
            for (AbstractC17043 abstractC17044 : abstractC17043M39540.mo25500(true)) {
                if (abstractC17044.mo25087()) {
                    try {
                        JSONObject jSONObjectAsObject = JSON.parse(m39569(abstractC17044.m38684("meta.json"))).asObject();
                        String string = jSONObjectAsObject.getString("targetType", null);
                        String string2 = jSONObjectAsObject.getString("entryName", null);
                        int i = jSONObjectAsObject.getInt("encoding", C16412.f48248);
                        String string3 = jSONObjectAsObject.getString("lineEnding", "lf");
                        if (string2 == null || string == null) {
                            throw new IOException("Missing entry overlay metadata");
                        }
                        if (!"axml".equals(string) && !"zip_entry".equals(string)) {
                            throw new IOException("Invalid entry overlay target type");
                        }
                        if (!"lf".equals(string3) && !"crlf".equals(string3) && !"cr".equals(string3)) {
                            throw new IOException("Invalid entry overlay line ending");
                        }
                        C14207 c14207 = new C14207(string2, i, string, string3);
                        if (!C20186.m45682(string2).equals(abstractC17044.getName())) {
                            throw m39448();
                        }
                        map.put(string2, c14207);
                    } catch (Exception unused) {
                        throw m39448();
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Long m39437(AbstractC17043 abstractC17043, C14207 c14207) {
        String str = c14207.f40482;
        String str2 = c14207.f40480;
        if ("zip_entry".equals(str)) {
            return Long.valueOf(m39540(abstractC17043).m38684(C20186.m45682(str2)).m38684("data.bin").mo25101());
        }
        C6161 c6161M39550 = m39550(abstractC17043, str2, C20186.m45682(m39569(m39540(abstractC17043).m38684(C20186.m45682(str2)).m38684("text.xml"))));
        if (c6161M39550 == null) {
            return null;
        }
        return Long.valueOf(c6161M39550.f15469.length);
    }

    /* JADX INFO: renamed from: ֫ */
    private ArrayList m39445(C16484 c16484, AbstractC17043 abstractC17043) throws C5276 {
        ArrayList<C14207> arrayList = new ArrayList(m39557(abstractC17043).values());
        C8150.sort(arrayList, C10162.comparing(new C12867()));
        ArrayList arrayList2 = new ArrayList();
        for (C14207 c14207 : arrayList) {
            String str = c14207.f40482;
            String str2 = c14207.f40480;
            if ("zip_entry".equals(str)) {
                AbstractC17043 abstractC17043M38684 = m39540(abstractC17043).m38684(C20186.m45682(str2)).m38684("data.bin");
                arrayList2.add(new C17352(m39428(abstractC17043M38684), abstractC17043M38684, str2, m39516(c16484, str2)));
            } else {
                C6161 c6161M39550 = m39550(abstractC17043, str2, C20186.m45682(m39569(m39540(abstractC17043).m38684(C20186.m45682(str2)).m38684("text.xml"))));
                if (c6161M39550 == null) {
                    throw m39450(new IOException("Missing valid AXML cache for build."));
                }
                arrayList2.add(new C17352(str2, m39516(c16484, str2), c6161M39550.f15469));
            }
        }
        ArrayList arrayListM39521 = m39521(c16484, abstractC17043);
        if (!arrayListM39521.isEmpty()) {
            arrayList2.add(new C17352("resources.arsc", m39516(c16484, "resources.arsc"), m39506(c16484, abstractC17043, arrayListM39521)));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֨ */
    public static long m39428(AbstractC17043 abstractC17043) throws C5276 {
        try {
            if (!abstractC17043.mo25093()) {
                throw new IOException("ZIP entry overlay data is missing");
            }
            long jMo25101 = abstractC17043.mo25101();
            if (jMo25101 < 0 || jMo25101 > 9007199254740991L) {
                throw new IOException("ZIP entry overlay size is unavailable or unsupported");
            }
            return jMo25101;
        } catch (IOException e) {
            throw m39548(e);
        } catch (RuntimeException e2) {
            if (!m39538(e2)) {
                throw e2;
            }
            throw m39548(e2);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static C19167 m39541(C16484 c16484, String str, String str2) throws C5276 {
        try {
            C19561 c19561 = new C19561(c16484.m37409());
            try {
                C5738 entry = c19561.getEntry(str2);
                if (entry == null) {
                    throw m39522();
                }
                if (!entry.isDirectory()) {
                    if (m39498(c16484, c19561, entry, str2)) {
                        throw C19553.m44415(c16484.f48416, str, str2);
                    }
                    InputStream inputStreamM44448 = c19561.m44448(entry);
                    try {
                        byte[] bArrM39503 = m39503(inputStreamM44448, 10485776);
                        inputStreamM44448.close();
                        C19167 c19167M39469 = m39469(c16484, str, str2, bArrM39503, bArrM39503.length > 10485760 || (entry.getSize() >= 0 && entry.getSize() > 10485760));
                        c19561.close();
                        return c19167M39469;
                    } catch (Throwable th) {
                        try {
                            inputStreamM44448.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                throw C5276.m11410("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
            } catch (Throwable th3) {
                try {
                    c19561.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (C5276 e) {
            throw e;
        } catch (Exception e2) {
            throw C5276.m11410("ENTRY_READ_FAILED", e2.getMessage() == null ? "Failed to read entry" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m39532(C16484 c16484, String str, String str2, C13220 c13220) throws C5276 {
        try {
            C19561 c19561 = new C19561(c16484.m37409());
            try {
                C5738 entry = c19561.getEntry(str2);
                if (entry == null) {
                    throw m39522();
                }
                if (entry.isDirectory()) {
                    throw C5276.m11410("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
                }
                if (entry.getSize() > 2097152) {
                    throw C5276.m11410("AXML_TOO_LARGE", "AXML entry is too large to decode");
                }
                m39479(c16484, str, c19561, entry, str2, c13220);
                c19561.close();
            } catch (Throwable th) {
                try {
                    c19561.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C5276 e) {
            throw e;
        } catch (Exception e2) {
            throw C5276.m11410("AXML_DECODE_FAILED", e2.getMessage() == null ? "Failed to decode AXML" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m39498(C16484 c16484, C19561 c19561, C5738 c5738, String str) {
        C23538 c23538M37407 = c16484.m37407();
        int iM52331 = c23538M37407.m52331(str);
        if (iM52331 == 2) {
            return true;
        }
        if (iM52331 == 1) {
            return false;
        }
        try {
            InputStream inputStreamM44448 = c19561.m44448(c5738);
            try {
                boolean zM38136 = C16820.m38136(c5738.getSize(), inputStreamM44448);
                c23538M37407.m52333(str, zM38136);
                inputStreamM44448.close();
                c23538M37407.m52332();
                return zM38136;
            } catch (Throwable th) {
                try {
                    inputStreamM44448.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c23538M37407.m52332();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39479(C16484 c16484, String str, C19561 c19561, C5738 c5738, String str2, C13220 c13220) throws IOException {
        C23538 c23538M37407 = c16484.m37407();
        int iM52331 = c23538M37407.m52331(str2);
        if (iM52331 == 1) {
            throw new IOException("Not a binary AXML file");
        }
        C12107 c12107 = this.f51871;
        if (iM52331 == 2) {
            C14150.m32629(c19561, c5738, c12107.m27998(c16484, this, str), c13220);
            return;
        }
        C22868 c22868M52334 = c23538M37407.m52334();
        c22868M52334.m51073(str2);
        try {
            if (!C14150.m32626(c19561, c5738, c12107.m27998(c16484, this, str), c13220, c22868M52334)) {
                throw new IOException("Not a binary AXML file");
            }
            c23538M37407.m52332();
        } catch (Throwable th) {
            c23538M37407.m52332();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m39504(C5738 c5738, C19561 c19561) throws IOException {
        if (c5738.getSize() >= 0 && c5738.getSize() > 10485760) {
            return new byte[10485761];
        }
        InputStream inputStreamM44448 = c19561.m44448(c5738);
        try {
            byte[] bArrM39503 = m39503(inputStreamM44448, 10485761);
            inputStreamM44448.close();
            return bArrM39503;
        } catch (Throwable th) {
            try {
                inputStreamM44448.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static C10680 m39551(C16484 c16484, AbstractC17043 abstractC17043, String str) throws C5276 {
        C10680 c10680;
        C14207 c14207 = (C14207) m39557(abstractC17043).get(str);
        if (c14207 != null && "zip_entry".equals(c14207.f40482)) {
            return new C10680(c14207.f40479, c14207.f40481);
        }
        try {
            C19561 c19561 = new C19561(c16484.m37409());
            try {
                C5738 entry = c19561.getEntry(str);
                String str2 = "lf";
                if (entry == null || m39545(abstractC17043).contains(str)) {
                    c10680 = new C10680(C16412.f48248, "lf");
                } else {
                    byte[] bArrM39504 = m39504(entry, c19561);
                    if (bArrM39504.length > 10485760) {
                        throw C5276.m11405("ENTRY_TEXT_TOO_LARGE", "ZIP entry text is too large to edit.");
                    }
                    if (bArrM39504.length == 0) {
                        c10680 = new C10680(C16412.f48248, "lf");
                    } else {
                        int iM37299 = C16412.m37299(bArrM39504.length, bArrM39504);
                        if (iM37299 < 0) {
                            iM37299 = C16412.f48248;
                        }
                        String strM34731 = C15268.m34731(bArrM39504, false);
                        if (strM34731 == null) {
                            throw C5276.m11405("NOT_TEXT_ENTRY", "ZIP entry is not text.");
                        }
                        int length = strM34731.length();
                        for (int i = 0; i < length; i++) {
                            char cCharAt = strM34731.charAt(i);
                            if (cCharAt == '\r') {
                                int i2 = i + 1;
                                if (i2 < length && strM34731.charAt(i2) == '\n') {
                                    str2 = "crlf";
                                    break;
                                }
                                str2 = "cr";
                                break;
                            }
                            if (cCharAt == '\n') {
                                break;
                            }
                        }
                        C10680 c10681 = new C10680(iM37299, str2);
                        c19561.close();
                        return c10681;
                    }
                }
                c19561.close();
                return c10680;
            } catch (Throwable th) {
                try {
                    c19561.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C5276 e) {
            throw e;
        } catch (Exception e2) {
            throw C5276.m11410("ENTRY_READ_FAILED", e2.getMessage() == null ? "Failed to read entry" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39476(C2864 c2864, int i) {
        if (i == C16412.f48234) {
            c2864.write(new byte[]{-17, -69, -65}, 0, 3);
            return;
        }
        if (i == C16412.f48243) {
            c2864.write(new byte[]{-2, -1}, 0, 2);
            return;
        }
        if (i == C16412.f48236) {
            c2864.write(new byte[]{-1, -2}, 0, 2);
        } else if (i == C16412.f48237) {
            c2864.write(new byte[]{0, 0, -2, -1}, 0, 4);
        } else if (i == C16412.f48247) {
            c2864.write(new byte[]{-1, -2, 0, 0}, 0, 4);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19167 m39469(C16484 c16484, String str, String str2, byte[] bArr, boolean z) throws C5276 {
        String strM34731 = C15268.m34731(bArr, z);
        if (strM34731 != null) {
            return new C19167(C10127.m23607(strM34731), z ? "entry_prefix" : "full_source", z, z ? "entry_text_byte_cap" : null, null);
        }
        throw C19553.m44414(c16484.f48416, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX INFO: renamed from: ֫ */
    private C7295 m39459(C16484 c16484, AbstractC17043 abstractC17043, C21850 c21850) throws C5276 {
        boolean z;
        String str = c21850.f68747;
        String str2 = c21850.f68748;
        String str3 = c21850.f68749;
        if ("resources.arsc".equals(str2)) {
            throw C5276.m11405("RESOURCE_TABLE_DELETE_UNSUPPORTED", "resources.arsc cannot be deleted.");
        }
        if (C19831.m45076(str2) > 0) {
            throw C5276.m11405("DEX_ENTRY_RESERVED", "Standard dex entries cannot be deleted as ZIP entries.");
        }
        if (m39545(abstractC17043).contains(str2)) {
            throw m39522();
        }
        C14207 c14207 = (C14207) m39557(abstractC17043).get(str2);
        if (c14207 != null && "axml".equals(str3) && !"axml".equals(c14207.f40482)) {
            throw C5276.m11405("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
        }
        try {
            C19561 c19561 = new C19561(c16484.m37409());
            try {
                C5738 entry = c19561.getEntry(str2);
                boolean z2 = true;
                if (entry != null) {
                    if (entry.isDirectory()) {
                        throw C5276.m11410("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
                    }
                    if (c14207 == null && "axml".equals(str3) && !m39498(c16484, c19561, entry, str2)) {
                        throw C5276.m11405("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
                    }
                    c19561.close();
                    z = true;
                } else {
                    c19561.close();
                    z = false;
                }
                if (c14207 == null && !z) {
                    throw m39522();
                }
                C10184 c10184 = new C10184(Entry.DEFAULT_NAME, str2, null, c14207 != null);
                m39568(abstractC17043);
                try {
                    m39488(abstractC17043, c10184, m39467(abstractC17043));
                    if (z) {
                        ArrayList arrayListM39545 = m39545(abstractC17043);
                        arrayListM39545.remove(str2);
                        arrayListM39545.add(str2);
                        m39565(abstractC17043, arrayListM39545);
                    } else {
                        ArrayList arrayListM39546 = m39545(abstractC17043);
                        arrayListM39546.remove(str2);
                        m39565(abstractC17043, arrayListM39546);
                    }
                    m39542(abstractC17043, str2);
                    m39431(abstractC17043, m39568(abstractC17043));
                    try {
                        m39536(abstractC17043, c10184);
                    } catch (IOException e) {
                        e = e;
                        if (z2 || !m39501(abstractC17043, c10184, e)) {
                            m39500(abstractC17043, e);
                            if (e instanceof C5276) {
                                throw ((C5276) e);
                            }
                            throw m39450(e);
                        }
                        C21306.m48192("MT MCP entry delete commit completed after storage error, editSessionId=".concat(str), e);
                    } catch (C5276 e2) {
                        e = e2;
                        if (z2) {
                        }
                        m39500(abstractC17043, e);
                        if (e instanceof C5276) {
                            throw ((C5276) e);
                        }
                        throw m39450(e);
                    }
                } catch (IOException | C5276 e3) {
                    e = e3;
                    z2 = false;
                }
                m39514(abstractC17043);
                return new C7295(c21850.f68750, str, str3, str2);
            } catch (Throwable th) {
                try {
                    c19561.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C5276 e4) {
            throw e4;
        } catch (Exception e5) {
            throw C5276.m11410("ENTRY_READ_FAILED", e5.getMessage() == null ? "Failed to read entry" : e5.getMessage());
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m39565(AbstractC17043 abstractC17043, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add(JSON.object().add("entryName", (String) it.next()));
        }
        abstractC17043.m38684("deleted").m38684("entry.json").m38660(jSONArrayArray.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C14877 m39526(C16484 c16484, AbstractC17043 abstractC17043, String str) throws C5276 {
        C14877 c14877;
        if (m39545(abstractC17043).contains(str)) {
            return new C14877("missing", true);
        }
        C14207 c14207 = (C14207) m39557(abstractC17043).get(str);
        if (c14207 != null) {
            String str2 = c14207.f40482;
            return (!"zip_entry".equals(str2) || m39540(abstractC17043).m38684(C20186.m45682(str)).m38684("data.bin").mo25101() <= 10485760) ? new C14877(str2, false) : new C14877("too_large", false);
        }
        abstractC17043.getName();
        try {
            C19561 c19561 = new C19561(c16484.m37409());
            try {
                C5738 entry = c19561.getEntry(str);
                if (entry == null) {
                    c14877 = new C14877("missing", false);
                } else if (entry.isDirectory()) {
                    c14877 = new C14877("directory", false);
                } else {
                    if (m39498(c16484, c19561, entry, str)) {
                        C14877 c14878 = new C14877("axml", false);
                        c19561.close();
                        return c14878;
                    }
                    byte[] bArrM39504 = m39504(entry, c19561);
                    if (bArrM39504.length > 10485760) {
                        c14877 = new C14877("too_large", false);
                    } else {
                        c14877 = (bArrM39504.length != 0 && C15268.m34731(bArrM39504, false) == null) ? new C14877("binary", false) : new C14877("zip_entry", false);
                    }
                }
                c19561.close();
                return c14877;
            } catch (Throwable th) {
                try {
                    c19561.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            throw C5276.m11410("ENTRY_READ_FAILED", e.getMessage() == null ? "Failed to read entry" : e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m39560(AbstractC17043 abstractC17043, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2600 c2600 = (C2600) it.next();
            JSONObject jSONObjectAdd = JSON.object().add("targetType", c2600.f4300).add("target", c2600.f4307).add("textHash", c2600.f4306).add("errorCode", c2600.f4305).add("message", c2600.f4302);
            Integer num = c2600.f4304;
            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c2600.f4301;
            jSONArrayArray.add(jSONObjectAdd2.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        abstractC17043.m38684("failures").m38684("entry.json").m38660(jSONArrayArray.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m39539(AbstractC17043 abstractC17043, String str, String str2) {
        for (C2600 c2600 : m39507(abstractC17043)) {
            if (str.equals(c2600.f4307) && str2.equals(c2600.f4306)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m39542(AbstractC17043 abstractC17043, final String str) throws C5276 {
        ArrayList arrayListM39507 = m39507(abstractC17043);
        C7480.removeIf(arrayListM39507, new Predicate() { // from class: l.ܰ᩺᩻
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m35881or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C2600) obj).f4307);
            }
        });
        m39560(abstractC17043, arrayListM39507);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39482(AbstractC17043 abstractC17043, String str) throws IOException {
        AbstractC17043 abstractC17043M38684 = m39540(abstractC17043).m38684(C20186.m45682(str)).m38684("meta.json");
        AbstractC17043 abstractC17043M38685 = m39540(abstractC17043).m38684(C20186.m45682(str)).m38684("text.xml");
        AbstractC17043 abstractC17043M38686 = m39540(abstractC17043).m38684(C20186.m45682(str)).m38684("data.bin");
        if (abstractC17043M38684.mo25094() && !abstractC17043M38684.mo25503()) {
            throw new IOException("Unable to delete entry overlay metadata");
        }
        if (abstractC17043M38685.mo25094() && !abstractC17043M38685.mo25503()) {
            throw new IOException("Unable to delete AXML source overlay");
        }
        if (abstractC17043M38686.mo25094() && !abstractC17043M38686.mo25503()) {
            throw new IOException("Unable to delete ZIP entry data overlay");
        }
        AbstractC17043 abstractC17043M38687 = m39540(abstractC17043).m38684(C20186.m45682(str));
        if (abstractC17043M38687.mo25094() && !abstractC17043M38687.mo25503()) {
            throw new IOException("Unable to delete entry overlay directory");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39484(AbstractC17043 abstractC17043, String str, AbstractC17043 abstractC17044, C10680 c10680) throws C5276 {
        boolean z = false;
        try {
            m39540(abstractC17043).m38684(C20186.m45682(str)).m38666();
            abstractC17044.m38659(m39540(abstractC17043).m38684(C20186.m45682(str)).m38684("data.bin"), false, true, null);
            try {
                m39483(m39540(abstractC17043).m38684(C20186.m45682(str)).m38684("meta.json"), str, "zip_entry", c10680);
                AbstractC17043 abstractC17043M38684 = m39540(abstractC17043).m38684(C20186.m45682(str)).m38684("text.xml");
                if (abstractC17043M38684.mo25094() && !abstractC17043M38684.mo25503()) {
                    throw new IOException("Unable to remove stale AXML source overlay");
                }
                AbstractC17043 abstractC17043M39552 = m39552(abstractC17043, str);
                if (abstractC17043M39552.mo25094()) {
                    abstractC17043M39552.mo25503();
                }
                m39542(abstractC17043, str);
                ArrayList arrayListM39545 = m39545(abstractC17043);
                arrayListM39545.remove(str);
                m39565(abstractC17043, arrayListM39545);
                m39431(abstractC17043, m39568(abstractC17043));
            } catch (Exception e) {
                e = e;
                z = true;
                if (z) {
                    try {
                        m39482(abstractC17043, str);
                    } catch (IOException e2) {
                        e.addSuppressed(e2);
                    }
                }
                throw m39450(new IOException("Failed to publish patched ZIP entry overlay.", e));
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static AbstractC17043 m39563(AbstractC17043 abstractC17043, String str) {
        return m39540(abstractC17043).m38684(C20186.m45682(str));
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m39572(String str) throws C5276 {
        if (str == null || str.isEmpty() || str.indexOf(0) >= 0) {
            throw C5276.m11406("Invalid entryName", "entryName", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("entryName", "assets/data.bin"));
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m39575(C16484 c16484, String str, String str2) throws C5276 {
        if (str2.endsWith("/")) {
            throw m39455(c16484, str, str2, "directory");
        }
        if ("resources.arsc".equals(str2)) {
            throw m39455(c16484, str, str2, "resources_arsc");
        }
        if (c16484.f48423.contains(str2) || C19831.m45076(str2) > 0) {
            throw m39455(c16484, str, str2, "dex_entry");
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static C4820 m39558(C16484 c16484, String str, String str2) throws C5276 {
        C4820 c4820;
        try {
            C19561 c19561 = new C19561(c16484.m37409());
            try {
                C5738 entry = c19561.getEntry(str2);
                if (entry != null) {
                    if (!entry.isDirectory()) {
                        InputStream inputStreamM44448 = c19561.m44448(entry);
                        try {
                            long size = entry.getSize();
                            if (size < 0) {
                                throw new IOException("Workspace entry size is unavailable");
                            }
                            C17559 c17559 = new C17559(inputStreamM44448);
                            boolean zM38136 = C16820.m38136(size, c17559);
                            C17559.m39971(c17559);
                            c4820 = new C4820(true, false, zM38136);
                            inputStreamM44448.close();
                        } catch (Throwable th) {
                            try {
                                inputStreamM44448.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        c4820 = new C4820(true, true, false);
                    }
                } else {
                    c4820 = new C4820(false, false, false);
                }
                c19561.close();
                return c4820;
            } catch (Throwable th3) {
                try {
                    c19561.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception e) {
            throw m39454(c16484, str, str2, e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m39499(AbstractC17043 abstractC17043, long j) throws C5276 {
        try {
            InputStream inputStreamMo29987 = abstractC17043.mo29987();
            try {
                if (j < 0) {
                    throw new IOException("Workspace entry size is unavailable");
                }
                C17559 c17559 = new C17559(inputStreamMo29987);
                boolean zM38136 = C16820.m38136(j, c17559);
                C17559.m39971(c17559);
                if (inputStreamMo29987 != null) {
                    inputStreamMo29987.close();
                }
                return zM38136;
            } catch (Throwable th) {
                if (inputStreamMo29987 != null) {
                    try {
                        inputStreamMo29987.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw m39548(e);
        } catch (RuntimeException e2) {
            if (!m39538(e2)) {
                throw e2;
            }
            throw m39548(e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m39434(AbstractC17043 abstractC17043, InterfaceC20509 interfaceC20509, C16484 c16484, String str, String str2) throws C5276 {
        try {
            try {
                C7502 c7502 = new C7502(abstractC17043.mo25506(false));
                try {
                    try {
                        try {
                            long jMo46273 = interfaceC20509.mo46273(c7502);
                            c7502.close();
                            long j = c7502.f19652;
                            if (jMo46273 == j) {
                                if (m39428(abstractC17043) == j) {
                                    return j;
                                }
                                throw m39450(new IOException("ZIP entry candidate size does not match bytes written"));
                            }
                            C5276 c5276M11410 = C5276.m11410("WORKSPACE_ENTRY_SOURCE_INVALID", "Source byte count does not match bytes written.");
                            m39478(c5276M11410, c16484, str, str2);
                            throw c5276M11410;
                        } catch (IOException e) {
                            throw new C8668(e);
                        }
                    } catch (C22080 e2) {
                        throw m39523(e2.f69452);
                    } catch (C24761 unused) {
                        throw m39570(c16484, str, str2);
                    }
                } catch (Throwable th) {
                    try {
                        c7502.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e3) {
                throw m39523(e3);
            } catch (RuntimeException e4) {
                if (!m39538(e4)) {
                    throw e4;
                }
                throw m39523((Exception) e4);
            }
        } catch (C11351 e5) {
            throw m39523((Exception) e5.f31605);
        } catch (C22080 e6) {
            throw m39523(e6.f69452);
        } catch (C24761 unused2) {
            throw m39570(c16484, str, str2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m39433(C16484 c16484, String str, String str2, OutputStream outputStream) throws C5276 {
        try {
            C19561 c19561 = new C19561(c16484.m37409());
            Throwable th = null;
            try {
                try {
                    try {
                        C5738 entry = c19561.getEntry(str2);
                        if (entry == null) {
                            C5276 c5276M11405 = C5276.m11405("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
                            m39478(c5276M11405, c16484, str, str2);
                            throw c5276M11405;
                        }
                        if (entry.getSize() > 9007199254740991L) {
                            throw m39570(c16484, str, str2);
                        }
                        try {
                            long jM39432 = m39432(c16484, str, str2, c19561.m44448(entry), outputStream);
                            try {
                                c19561.close();
                                return jM39432;
                            } catch (Exception e) {
                                throw m39454(c16484, str, str2, e);
                            }
                        } catch (IOException e2) {
                            throw m39454(c16484, str, str2, e2);
                        } catch (RuntimeException e3) {
                            if (!m39538(e3)) {
                                throw e3;
                            }
                            throw m39454(c16484, str, str2, e3);
                        }
                    } catch (Throwable th2) {
                        try {
                            c19561.close();
                        } catch (Exception e4) {
                            if (0 != 0) {
                                th.addSuppressed(e4);
                            } else {
                                throw m39454(c16484, str, str2, e4);
                            }
                        }
                        throw th2;
                    }
                } catch (IOException e5) {
                    e = e5;
                    throw e;
                } catch (RuntimeException e6) {
                    e = e6;
                    throw e;
                }
            } catch (Error e7) {
                e = e7;
                throw e;
            } catch (C5276 e8) {
                e = e8;
                throw e;
            }
        } catch (Exception e9) {
            throw m39454(c16484, str, str2, e9);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m39432(C16484 c16484, String str, String str2, InputStream inputStream, OutputStream outputStream) throws C5276 {
        try {
            C19397 c19397 = new C19397(inputStream);
            try {
                byte[] bArr = new byte[65536];
                long j = 0;
                while (true) {
                    int i = c19397.read(bArr);
                    if (i < 0) {
                        break;
                    }
                    if (i == 0) {
                        int i2 = c19397.read();
                        if (i2 < 0) {
                            break;
                        }
                        if (j == 9007199254740991L) {
                            throw m39570(c16484, str, str2);
                        }
                        outputStream.write(i2);
                        j++;
                    } else {
                        long j2 = i;
                        if (j > 9007199254740991L - j2) {
                            throw m39570(c16484, str, str2);
                        }
                        outputStream.write(bArr, 0, i);
                        j += j2;
                    }
                }
                c19397.close();
                return j;
            } catch (Throwable th) {
                try {
                    c19397.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C16043 e) {
            throw m39454(c16484, str, str2, e.f46445);
        } catch (C18726 e2) {
            throw m39454(c16484, str, str2, e2.f55973);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m39538(RuntimeException runtimeException) {
        return (runtimeException instanceof SecurityException) || (runtimeException instanceof IllegalArgumentException) || (runtimeException instanceof IllegalStateException) || (runtimeException instanceof UnsupportedOperationException);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C5276 m39548(Exception exc) {
        C5276 c5276M11410 = C5276.m11410("EDIT_SESSION_STORAGE_FAILED", "Edit session storage failed.");
        c5276M11410.f12412.put("backendReason", exc.getClass().getSimpleName());
        return c5276M11410;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m39523(Exception exc) {
        C5276 c5276M11410 = C5276.m11410("EDIT_SESSION_STORAGE_FAILED", "Edit session storage backend failed");
        c5276M11410.f12412.put("backendReason", exc.getClass().getSimpleName());
        return c5276M11410;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m39455(C16484 c16484, String str, String str2, String str3) {
        C5276 c5276M11405 = C5276.m11405("WORKSPACE_ENTRY_UNSUPPORTED", "Workspace ZIP entry is not supported by this copy operation.");
        m39478(c5276M11405, c16484, str, str2);
        c5276M11405.f12412.put("backendReason", str3);
        return c5276M11405;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static C5276 m39570(C16484 c16484, String str, String str2) {
        C5276 c5276M11410 = C5276.m11410("WORKSPACE_ENTRY_TOO_LARGE", "Workspace ZIP entry exceeds the supported JSON integer range.");
        m39478(c5276M11410, c16484, str, str2);
        return c5276M11410;
    }

    /* JADX INFO: renamed from: ۜ */
    public static C5276 m39513(C16484 c16484, String str, String str2) {
        C5276 c5276M11405 = C5276.m11405("FILE_OPERATION_STATE_UNKNOWN", "The workspace entry copy may have changed the edit session, but its final state is unknown.");
        m39478(c5276M11405, c16484, str, str2);
        c5276M11405.f12412.put("backendReason", "rollback_failed").put("changed", true).put("operationMode", "atomic").put("stateKnown", false);
        return c5276M11405;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m39454(C16484 c16484, String str, String str2, Exception exc) {
        C5276 c5276M11410 = C5276.m11410("WORKSPACE_ENTRY_READ_FAILED", "Failed to read workspace ZIP entry.");
        m39478(c5276M11410, c16484, str, str2);
        c5276M11410.f12412.put("backendReason", exc.getClass().getSimpleName());
        return c5276M11410;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39478(C5276 c5276, C16484 c16484, String str, String str2) {
        c5276.f12412.put("workspaceId", c16484.f48416).put("editSessionId", str == null ? JSON.NULL : JSON.value(str)).put("entryName", str2);
    }

    /* JADX INFO: renamed from: ۡ */
    public static boolean m39516(C16484 c16484, String str) {
        Iterator it = c16484.f48428.iterator();
        while (it.hasNext()) {
            if (str.equals(((C15554) it.next()).f44436)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m39503(InputStream inputStream, int i) throws IOException {
        C2864 c2864 = new C2864(Math.min(i, 8192));
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int i2 = inputStream.read(bArr, 0, Math.min(8192, i));
            if (i2 == -1) {
                break;
            }
            c2864.write(bArr, 0, i2);
            i -= i2;
        }
        byte[] bArr2 = c2864.f4949;
        int length = bArr2.length;
        int i3 = c2864.f4950;
        return length == i3 ? bArr2 : Arrays.copyOf(bArr2, i3);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m39522() {
        return C5276.m11405("ENTRY_NOT_FOUND", "ZIP entry not found");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m39456(C16484 c16484, String str, C22718 c22718) {
        boolean z;
        ArrayList arrayList = c22718.f71660;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if ("axml".equals(((C2600) it.next()).f4300)) {
                z = true;
                break;
            }
        }
        return m39457(c16484, str, true, z ? "EDIT_TEXT_PREPARE_FAILED_IN_SESSION" : "SMALI_COMPILE_FAILED_IN_SESSION", z ? "Saved edit session has AXML encode failures." : "Smali compile failed in saved edit session.", m39435(arrayList), (String) null, (String) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m39457(C16484 c16484, String str, boolean z, String str2, String str3, JSONArray jSONArray, String str4, String str5) {
        JSONValue jSONValue;
        JSONObject jSONObjectObject = JSON.object();
        if (c16484 != null) {
            jSONObjectObject.add("workspaceId", c16484.f48416);
        }
        if (str != null) {
            jSONObjectObject.add("editSessionId", str);
        }
        if (str4 != null && str5 != null) {
            jSONObjectObject.add("locator", C14884.m34020(str4, str5));
        }
        if (jSONArray != null) {
            jSONObjectObject.add("overlaySaved", z).add("failures", jSONArray);
            if (str4 == null && jSONArray.size() > 0 && (jSONValue = jSONArray.get(0).asObject().get("locator")) != null && !jSONValue.isNull()) {
                jSONObjectObject.add("locator", jSONValue);
            }
        }
        return C5276.m11407(str2, str3, "fatal", JSON.array(), jSONObjectObject);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m39435(ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2600 c2600 = (C2600) it.next();
            JSONObject jSONObjectAdd = JSON.object().add("locator", C14884.m34055(c2600.f4300, c2600.f4307)).add("className", c2600.f4299).add("dexEntryName", c2600.f4303).add("textHash", c2600.f4306).add("errorCode", c2600.f4305).add("message", c2600.f4302);
            Integer num = c2600.f4304;
            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c2600.f4301;
            jSONArrayArray.add(jSONObjectAdd2.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m39429(C16484 c16484, AbstractC17043 abstractC17043, final C12196 c12196, String str) throws C5276 {
        final String strM45682 = C20186.m45682(str);
        if (m39529(abstractC17043, c12196, strM45682) != null || m39502(abstractC17043, c12196, strM45682)) {
            return 0;
        }
        C20914 c20914M39470 = m39470(c16484, c12196, str, strM45682);
        C2600 c2600 = c20914M39470.f65677;
        if (c2600 != null) {
            String str2 = c2600.f4302;
            Integer num = c2600.f4304;
            Integer num2 = c2600.f4301;
            try {
                ArrayList arrayListM39509 = m39509(abstractC17043);
                C7480.removeIf(arrayListM39509, new Predicate() { // from class: l.ܿܰ᩻
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C20697.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo55838negate() {
                        return C20697.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public /* synthetic */ Predicate m43003or(Predicate predicate) {
                        return C20697.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C2600 c2601 = (C2600) obj;
                        C12196 c12197 = c12196;
                        if (c12197.f34101.equals(c2601.f4299) && c12197.f34102.equals(c2601.f4303)) {
                            return strM45682.equals(c2601.f4306);
                        }
                        return false;
                    }
                });
                String str3 = c12196.f34101;
                arrayListM39509.add(new C2600("smali_class", str3, str3, c12196.f34102, strM45682, "SMALI_COMPILE_FAILED_IN_SESSION", str2, num, num2));
                m39543(abstractC17043, arrayListM39509);
                return 0;
            } catch (IOException e) {
                throw m39450(e);
            }
        }
        try {
            m39490(abstractC17043, c12196, c20914M39470.f65676);
            try {
                ArrayList arrayListM395010 = m39509(abstractC17043);
                C7480.removeIf(arrayListM395010, new Predicate() { // from class: l.ܳܰ᩻
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C20697.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo55838negate() {
                        return C20697.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public /* synthetic */ Predicate m36973or(Predicate predicate) {
                        return C20697.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C2600 c2601 = (C2600) obj;
                        C12196 c12197 = c12196;
                        if (c12197.f34101.equals(c2601.f4299) && c12197.f34102.equals(c2601.f4303)) {
                            return strM45682.equals(c2601.f4306);
                        }
                        return false;
                    }
                });
                m39543(abstractC17043, arrayListM395010);
                return 1;
            } catch (IOException e2) {
                throw m39450(e2);
            }
        } catch (IOException e3) {
            throw m39450(e3);
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public static String m39569(AbstractC17043 abstractC17043) throws C5276 {
        try {
            return new String(abstractC17043.m38664(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw m39450(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39491(AbstractC17043 abstractC17043, C13220 c13220) throws C5276 {
        C16831 c16831 = new C16831();
        c16831.m38173(c13220);
        char[] cArr = new char[8192];
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(abstractC17043.mo29987(), StandardCharsets.UTF_8);
            while (true) {
                try {
                    int i = inputStreamReader.read(cArr);
                    if (i == -1) {
                        c16831.m38170();
                        inputStreamReader.close();
                        return;
                    } else {
                        for (int i2 = 0; i2 < i; i2++) {
                            c16831.m38171(cArr[i2]);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                throw m39450(e);
            }
        } catch (IOException e) {
            throw m39450(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m39534(AbstractC17043 abstractC17043) {
        if (abstractC17043.mo25094()) {
            abstractC17043.mo25503();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C22718 m39472(C16484 c16484, AbstractC17043 abstractC17043, String str, String str2, String str3, String str4, String str5, String str6) throws C5276 {
        C3478 c3478;
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str2.split("\\n", -1);
        int length = strArrSplit.length;
        if (length > 0 && strArrSplit[length - 1].isEmpty()) {
            length--;
        }
        for (int i = 0; i < length; i++) {
            String strM38720 = strArrSplit[i];
            if (strM38720.endsWith("\r")) {
                strM38720 = C17073.m38720(1, 0, strM38720);
            }
            arrayList.add(strM38720);
        }
        Iterator it = arrayList.iterator();
        String str7 = null;
        while (it.hasNext()) {
            String strM39438 = m39438((String) it.next());
            if (strM39438 != null) {
                if (str7 != null) {
                    throw C5276.m11405("SMALI_CLASS_MISMATCH", "Smali text must contain only one .class directive.");
                }
                str7 = strM39438;
            }
        }
        if (str7 == null) {
            throw C5276.m11405("SMALI_CLASS_MISMATCH", "Smali text must contain a .class directive.");
        }
        if (!str.equals(str7)) {
            throw C5276.m11405("SMALI_CLASS_MISMATCH", "Smali .class descriptor does not match target class.");
        }
        String strM39441 = m39441(c16484, abstractC17043, str);
        C12196 c12196 = new C12196(strM39441, str);
        String strM45682 = C20186.m45682(str2);
        C20243 c20243M39529 = m39529(abstractC17043, c12196, strM45682);
        if (c20243M39529 == null) {
            C20914 c20914M39470 = m39470(c16484, c12196, str2, strM45682);
            C2600 c2600 = c20914M39470.f65677;
            if (c2600 != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c2600);
                throw m39457(c16484, str3, false, "SMALI_COMPILE_FAILED_IN_SESSION", "Smali compile failed; edit_text candidate was not saved.", m39435(arrayList2), str4, str5);
            }
            c3478 = c20914M39470.f65676;
        } else {
            c3478 = new C3478(strM45682, c20243M39529.f62581);
        }
        m39489(abstractC17043, new C10184("dex", str, strM39441, m39528(abstractC17043, c12196).mo25093()), str2.getBytes(StandardCharsets.UTF_8), (String) null, (C10680) null);
        try {
            m39490(abstractC17043, c12196, c3478);
        } catch (Exception e) {
            C21306.m48192("MT MCP text edit cache publish failed, editSessionId=".concat(str3), e);
        }
        return m39471(c16484, str3, str4, str5, str6, (C17502) null);
    }

    /* JADX INFO: renamed from: ۜ */
    public static String m39512(String str) throws C5276 {
        if (str == null || str.isEmpty()) {
            throw m39524(str);
        }
        String strM45079 = C19831.m45079(str);
        if (!strM45079.startsWith("L") || !strM45079.endsWith(C0249l.f1196b) || strM45079.length() <= 3 || strM45079.indexOf(92) >= 0 || strM45079.indexOf("..") >= 0 || strM45079.indexOf("//") >= 0 || strM45079.indexOf(91) >= 0 || strM45079.indexOf(40) >= 0 || strM45079.indexOf(41) >= 0 || strM45079.indexOf(59) != strM45079.length() - 1) {
            throw m39524(str);
        }
        String strM38720 = C17073.m38720(1, 1, strM45079);
        if (strM38720.startsWith("/") || strM38720.endsWith("/")) {
            throw m39524(str);
        }
        return strM45079;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m39524(String str) {
        return C5276.m11407("INVALID_SMALI_CLASS_DESCRIPTOR", "Invalid Smali class descriptor.", "fatal", JSON.array(), JSON.object().add("badValue", str == null ? JSON.NULL : JSON.value(str)));
    }

    /* JADX INFO: renamed from: ܽ */
    public static C5276 m39549(String str) {
        return C5276.m11406("Invalid targetType", "targetType", JSON.value(str), JSON.array("smali_class", "smali_method", "axml", "zip_entry"), JSON.object().add("targetType", "zip_entry"));
    }

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m39577(String str) {
        if (str != null && str.length() == 8) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m39448() {
        return C5276.m11410("EDIT_SESSION_STORAGE_FAILED", "Edit session overlay is corrupt.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m39450(Exception exc) {
        return C5276.m11410("EDIT_SESSION_STORAGE_FAILED", exc.getMessage() == null ? "Edit session storage failed." : exc.getMessage());
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m39547() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 8).toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m39439(String str, int i, int i2, String str2) {
        C18055 c18055;
        if (str.isEmpty()) {
            c18055 = new C18055(new C12692[]{new C12692(str, 0, 0)});
        } else {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (int i4 = 0; i4 < str.length(); i4++) {
                if (str.charAt(i4) == '\n') {
                    arrayList.add(new C12692(str, i3, i4));
                    i3 = i4 + 1;
                }
            }
            if (i3 < str.length()) {
                arrayList.add(new C12692(str, i3, str.length()));
            }
            c18055 = new C18055((C12692[]) arrayList.toArray(new C12692[0]));
        }
        int iM41098 = c18055.m41098();
        int iMax = Math.max(0, Math.min(i, iM41098));
        int iMax2 = Math.max(iMax, Math.min(i2, iM41098));
        if (iMax >= iMax2) {
            return C10127.m23607(str);
        }
        int length = iMax == iM41098 ? str.length() : c18055.m41099(iMax).f35607;
        int i5 = c18055.m41099(iMax2 - 1).f35606;
        if (i5 < str.length() && str.charAt(i5) == '\n') {
            i5++;
        }
        String strM23607 = C10127.m23607(str2);
        StringBuilder sb = new StringBuilder(strM23607.length() + (str.length() - (i5 - length)) + 1);
        sb.append((CharSequence) str, 0, length);
        if (!strM23607.isEmpty()) {
            sb.append(strM23607);
            if (i5 < str.length() && !strM23607.endsWith("\n")) {
                sb.append('\n');
            }
        }
        sb.append((CharSequence) str, i5, str.length());
        return C10127.m23607(sb.toString());
    }
}
