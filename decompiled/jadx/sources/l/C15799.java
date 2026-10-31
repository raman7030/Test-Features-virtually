package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.y.l;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
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
public final class C15799 {

    /* JADX INFO: renamed from: ۜۡܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f48730;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final RuntimeException f48731;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11691 f48732;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10247 f48733;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized String m37407(C14852 c14852, String str, String str2, C15923 c15923) {
        if (m37396(str)) {
            return this.f48732.m28580(c14852, str2, false, c15923).f47942;
        }
        AbstractC15440 abstractC15440M37375 = m37375(c14852, str);
        C10340 c10340 = (C10340) m37275(abstractC15440M37375, c15923).get(str2);
        if (c10340 != null) {
            return m37398(m37357(abstractC15440M37375, c10340));
        }
        if (m37356(abstractC15440M37375, str2) != null) {
            throw C18081.m42146(c14852.f45300, str);
        }
        return this.f48732.m28580(c14852, str2, false, c15923).f47942;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m37409(C14852 c14852, String str, boolean z, C15923 c15923) {
        if (m37396(str)) {
            return c14852.f45314;
        }
        if (!z) {
            m37383(c14852, str, c15923);
        }
        C7517 c7517M37291 = m37291(c14852, str, m37375(c14852, str), c15923);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (C17667 c17667 : c14852.f45314) {
            if (!c7517M37291.f23129.contains(c17667.f54033) && !c7517M37291.f23133.containsKey(c17667.f54033)) {
                arrayList.add(c17667);
                hashSet.add(c17667.f54033);
            }
        }
        for (C10340 c10340 : c7517M37291.f23131.values()) {
            if (!c7517M37291.f23129.contains(c10340.f31138) && hashSet.add(c10340.f31138)) {
                arrayList.add(new C17667(c10340.f31140, -1, -1, c10340.f31138));
            }
        }
        C6083.sort(arrayList, C8200.comparing(new C19694(3)));
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C5184 m37411(C14852 c14852, C20498 c20498, C15923 c15923) {
        AbstractC15440 abstractC15440M37375 = m37375(c14852, c20498.f66068);
        if ("smali_class".equals(c20498.f66070)) {
            return m37354(c14852, abstractC15440M37375, c20498);
        }
        if ("smali_method".equals(c20498.f66070)) {
            return m37289(c14852, abstractC15440M37375, c20498, c15923);
        }
        if (!"axml".equals(c20498.f66070) && !"zip_entry".equals(c20498.f66070)) {
            throw m37378(c20498.f66070);
        }
        return m37288(c14852, abstractC15440M37375, c20498);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C5889 m37412(C14852 c14852, C15557 c15557) {
        C22946 c22946M19953;
        try {
            AbstractC15440 abstractC15440M37375 = m37375(c14852, c15557.f47956);
            c22946M19953 = C7424.m19953(this.f48733.m25979(c14852, this, c15557.f47956), c15557);
            ArrayList arrayList = new ArrayList();
            for (C4103 c4103 : c22946M19953.f73926) {
                arrayList.add(new C13866(C14460.m34531(c4103.f13046), c4103));
            }
            this.f48733.m25978(c14852.f45300, c15557.f47956);
            try {
                m37315(abstractC15440M37375, arrayList);
                C1944.m6404(abstractC15440M37375);
            } catch (IOException e) {
                throw m37279(e);
            }
        } catch (C3059 e2) {
            e2.f9609.put("workspaceId", c14852.f45300).put("editSessionId", c15557.f47956);
            throw e2;
        }
        return new C5889(c14852.f45300, c15557.f47956, c22946M19953.f73927);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C9126 m37415(C14852 c14852, C6595 c6595, OutputStream outputStream) {
        long jM37262;
        String str = c6595.f20312;
        m37401(str);
        m37404(c14852, c6595.f20311, str);
        C2579 c2579M37387 = m37387(c14852, c6595.f20311, str);
        String str2 = c6595.f20311;
        if (c2579M37387.f8163) {
            throw m37284(c14852, str2, str, "directory");
        }
        if (c2579M37387.f8162) {
            throw m37284(c14852, str2, str, "axml_entry");
        }
        if (m37396(str2)) {
            if (c2579M37387.f8164) {
                long jM37263 = m37262(c14852, c6595.f20311, str, outputStream);
                return new C9126(c14852.f45300, c6595.f20311, str, jM37263, null);
            }
            String str3 = c6595.f20311;
            C3059 c3059M9363 = C3059.m9363("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
            m37307(c3059M9363, c14852, str3, str);
            throw c3059M9363;
        }
        AbstractC15440 abstractC15440M37375 = m37375(c14852, c6595.f20311);
        if (m37374(abstractC15440M37375).contains(str)) {
            String str4 = c6595.f20311;
            C3059 c3059M9364 = C3059.m9363("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
            m37307(c3059M9364, c14852, str4, str);
            throw c3059M9364;
        }
        C12456 c12456 = (C12456) m37386(abstractC15440M37375).get(str);
        int i = m37397(abstractC15440M37375).f69437;
        if (c12456 != null) {
            String str5 = c6595.f20311;
            AbstractC15440 abstractC15440M36526 = m37369(abstractC15440M37375).m36526(C18747.m43415(str)).m36526("data.bin");
            if ("axml".equals(c12456.f37462) || m37328(abstractC15440M36526, m37257(abstractC15440M36526))) {
                throw m37284(c14852, str5, str, "axml_entry");
            }
            String str6 = c6595.f20311;
            AbstractC15440 abstractC15440M36527 = m37369(abstractC15440M37375).m36526(C18747.m43415(str)).m36526("data.bin");
            m37257(abstractC15440M36527);
            try {
                try {
                    jM37262 = m37261(c14852, str6, str, abstractC15440M36527.mo27926(), outputStream);
                } catch (RuntimeException e) {
                    if (m37367(e)) {
                        throw m37283(c14852, str6, str, e);
                    }
                    throw e;
                }
            } catch (IOException e2) {
                throw m37283(c14852, str6, str, e2);
            }
        } else {
            if (!c2579M37387.f8164) {
                String str7 = c6595.f20311;
                C3059 c3059M9365 = C3059.m9363("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
                m37307(c3059M9365, c14852, str7, str);
                throw c3059M9365;
            }
            jM37262 = m37262(c14852, c6595.f20311, str, outputStream);
        }
        String str8 = c6595.f20311;
        Integer numValueOf = Integer.valueOf(i);
        return new C9126(c14852.f45300, str8, str, jM37262, numValueOf);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C12239 m37417(C14852 c14852, C7797 c7797) {
        AbstractC15440 abstractC15440M37375 = m37375(c14852, c7797.f24092);
        if (m37374(abstractC15440M37375).contains(c7797.f24093)) {
            throw m37351();
        }
        C12456 c12456 = (C12456) m37386(abstractC15440M37375).get(c7797.f24093);
        ArrayList arrayList = new ArrayList(c7797.f24094);
        C6083.sort(arrayList, C8200.comparingInt(new C6378()));
        m37360(arrayList);
        m37310(c14852, abstractC15440M37375, c12456, c7797.f24093);
        if (c12456 == null || !"zip_entry".equals(c12456.f37462)) {
            return m37294(c14852, abstractC15440M37375, c7797, arrayList);
        }
        return m37295(abstractC15440M37375, c7797, arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C17675 m37418(C14852 c14852, String str, String str2) {
        C11418 c11418;
        c11418 = new C11418();
        m37422(c14852, str, str2, c11418);
        return new C17675(c11418.toString(), "full_source", false, null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C18590 m37419(C14852 c14852, String str) {
        AbstractC15440 abstractC15440M37375;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList<C15766> arrayListM37274;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayListM37374;
        String str2;
        abstractC15440M37375 = m37375(c14852, str);
        m37259(c14852, abstractC15440M37375, (C15923) null);
        C21412 c21412M37339 = m37339(c14852, str);
        if (c21412M37339.f68960 > 0) {
            throw m37285(c14852, str, c21412M37339);
        }
        ArrayList<C10340> arrayList6 = new ArrayList(m37348(abstractC15440M37375).values());
        C6083.sort(arrayList6, C15254.thenComparing(C8200.comparing(new C7789()), new C1873()));
        arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (C10340 c10340 : arrayList6) {
            String strM43415 = C18747.m43415(m37398(m37357(abstractC15440M37375, c10340)));
            C18807 c18807M37358 = m37358(abstractC15440M37375, c10340, strM43415);
            if (c18807M37358 == null) {
                throw m37285(c14852, str, m37339(c14852, str));
            }
            arrayList.add(new C2362(c10340.f31139, c10340.f31140, c18807M37358.f59353, strM43415));
            hashSet.add(c10340.f31140);
        }
        arrayList2 = new ArrayList();
        for (C15277 c15277 : m37344(abstractC15440M37375)) {
            String str3 = c15277.f46871;
            if (str3 == null || (str2 = c15277.f46872) == null) {
                throw m37277();
            }
            arrayList2.add(new C8712(str3, str2));
            hashSet.add(c15277.f46872);
        }
        C6083.sort(arrayList2, C15254.thenComparing(C8200.comparing(new C4563(3)), new C7680(3)));
        arrayList3 = new ArrayList(hashSet);
        C6083.sort(arrayList3, C18373.m42805());
        arrayListM37274 = m37274(c14852, abstractC15440M37375);
        arrayList4 = new ArrayList();
        arrayList5 = new ArrayList();
        for (C15766 c15766 : arrayListM37274) {
            if (c15766.f48604) {
                arrayList5.add(c15766.f48603);
            } else {
                arrayList4.add(c15766.f48603);
            }
        }
        arrayListM37374 = m37374(abstractC15440M37375);
        C6083.sort(arrayList4, new C14970());
        C6083.sort(arrayList5, new C14970());
        C6083.sort(arrayListM37374, new C14970());
        return new C18590(str, m37397(abstractC15440M37375).f69437, abstractC15440M37375.m36526("cache").m36526("dex_build"), arrayList, arrayList2, arrayList3, arrayListM37274, arrayList4, arrayList5, arrayListM37374);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public native synchronized C21412 m37420(C14852 c14852);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C21412 m37421(C14852 c14852, C6386 c6386, C15923 c15923) {
        AbstractC15440 abstractC15440M37375 = m37375(c14852, c6386.f19750);
        if ("smali_class".equals(c6386.f19755)) {
            return m37303(c14852, abstractC15440M37375, c6386, c15923);
        }
        if ("smali_method".equals(c6386.f19755)) {
            return m37359(c14852, abstractC15440M37375, c6386, c15923);
        }
        if (!"axml".equals(c6386.f19755) && !"zip_entry".equals(c6386.f19755)) {
            throw m37378(c6386.f19755);
        }
        return m37302(c14852, abstractC15440M37375, c6386);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m37422(C14852 c14852, String str, String str2, C11418 c11418) {
        c11418.m28185(0);
        if (!m37396(str)) {
            AbstractC15440 abstractC15440M37375 = m37375(c14852, str);
            C13161 c13161M37355 = m37355(c14852, abstractC15440M37375, str2);
            if (c13161M37355.f39350 || "missing".equals(c13161M37355.f39351)) {
                throw m37351();
            }
            if (!"axml".equals(c13161M37355.f39351)) {
                throw C3059.m9363("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
            }
            if (((C12456) m37386(abstractC15440M37375).get(str2)) != null) {
                m37320(m37369(abstractC15440M37375).m36526(C18747.m43415(str2)).m36526("text.xml"), c11418);
                return;
            }
        }
        m37361(c14852, str, str2, c11418);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized int m37424(C14852 c14852, String str) {
        if (m37396(str)) {
            return 0;
        }
        return m37397(m37375(c14852, str)).f69437;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C1689 m37425(C14852 c14852, String str, C15923 c15923) {
        if (m37396(str)) {
            return new C1689(new ArrayList(c14852.f45308), new HashMap(), new HashSet());
        }
        AbstractC15440 abstractC15440M37375 = m37375(c14852, str);
        C7517 c7517M37291 = m37291(c14852, str, abstractC15440M37375, c15923);
        ArrayList arrayListM37273 = m37273(c14852, c7517M37291);
        HashMap map = new HashMap();
        for (C10340 c10340 : c7517M37291.f23133.values()) {
            map.put(c10340.f31138, m37357(abstractC15440M37375, c10340));
        }
        return new C1689(arrayListM37273, map, new HashSet(c7517M37291.f23129));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C7980 m37426(C14852 c14852, String str, C17667 c17667, C15923 c15923) {
        if (m37396(str)) {
            return this.f48732.m28579(c14852, c17667, c15923);
        }
        AbstractC15440 abstractC15440M37375 = m37375(c14852, str);
        C7517 c7517M37291 = m37291(c14852, str, abstractC15440M37375, c15923);
        C10340 c10340 = (C10340) c7517M37291.f23133.get(c17667.f54033);
        if (c10340 == null) {
            if (c7517M37291.f23129.contains(c17667.f54033)) {
                throw C18081.m42146(c14852.f45300, str);
            }
            return this.f48732.m28579(c14852, c17667, c15923);
        }
        String strM37398 = m37398(m37357(abstractC15440M37375, c10340));
        String strM43415 = C18747.m43415(strM37398);
        C18807 c18807M37358 = m37358(abstractC15440M37375, c10340, strM43415);
        if (c18807M37358 != null) {
            return c18807M37358.f59353;
        }
        m37258(c14852, abstractC15440M37375, c10340, strM37398);
        C18807 c18807M37359 = m37358(abstractC15440M37375, c10340, strM43415);
        if (c18807M37359 == null) {
            throw m37285(c14852, str, m37339(c14852, str));
        }
        return c18807M37359.f59353;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C15549 m37427(C14852 c14852, String str, String str2, C15923 c15923) {
        if (m37396(str)) {
            return this.f48732.m28580(c14852, str2, true, c15923);
        }
        AbstractC15440 abstractC15440M37375 = m37375(c14852, str);
        C10340 c10340 = (C10340) m37275(abstractC15440M37375, c15923).get(str2);
        if (c10340 == null) {
            if (m37356(abstractC15440M37375, str2) != null) {
                throw C18081.m42146(c14852.f45300, str);
            }
            return this.f48732.m28580(c14852, str2, true, c15923);
        }
        String strM37398 = m37398(m37357(abstractC15440M37375, c10340));
        C7980 c7980M37414 = m37414(c14852, str, new C17667(c10340.f31140, -1, -1, c10340.f31138), c15923);
        return new C15549(strM37398, C8751.m22648(c7980M37414), C8751.m22639(c7980M37414));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C17675 m37428(C14852 c14852, String str, String str2) {
        if (!m37396(str)) {
            AbstractC15440 abstractC15440M37375 = m37375(c14852, str);
            if (m37374(abstractC15440M37375).contains(str2)) {
                throw m37351();
            }
            C12456 c12456 = (C12456) m37386(abstractC15440M37375).get(str2);
            if (c12456 != null) {
                if ("axml".equals(c12456.f37462)) {
                    throw C18081.m42156(c14852.f45300, str, str2);
                }
                try {
                    InputStream inputStreamMo27926 = m37369(abstractC15440M37375).m36526(C18747.m43415(str2)).m36526("data.bin").mo27926();
                    try {
                        byte[] bArrM37332 = m37332(inputStreamMo27926, 10485776);
                        C17675 c17675M37298 = m37298(c14852, str, str2, bArrM37332, bArrM37332.length > 10485760);
                        if (inputStreamMo27926 != null) {
                            inputStreamMo27926.close();
                        }
                        return c17675M37298;
                    } catch (Throwable th) {
                        if (inputStreamMo27926 != null) {
                            try {
                                inputStreamMo27926.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw m37279(e);
                }
            }
        }
        return m37370(c14852, str, str2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m37429(C14852 c14852, String str) {
        if (m37396(str)) {
            return new ArrayList();
        }
        return m37350(c14852, m37375(c14852, str));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m37430(C14852 c14852, String str) {
        if (m37396(str)) {
            return c14852.f45312;
        }
        AbstractC15440 abstractC15440M37375 = m37375(c14852, str);
        HashSet hashSet = new HashSet(m37374(abstractC15440M37375));
        HashMap mapM37386 = m37386(abstractC15440M37375);
        boolean zIsEmpty = m37350(c14852, abstractC15440M37375).isEmpty();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        for (C13874 c13874 : c14852.f45312) {
            hashSet2.add(c13874.f41355);
            if (!hashSet.contains(c13874.f41355)) {
                C12456 c12456 = (C12456) mapM37386.get(c13874.f41355);
                if (c12456 != null) {
                    arrayList.add(C13874.m33235(c13874.f41355, m37266(abstractC15440M37375, c12456)));
                } else if (zIsEmpty || !"resources.arsc".equals(c13874.f41355)) {
                    arrayList.add(c13874);
                } else {
                    arrayList.add(C13874.m33235(c13874.f41355, null));
                }
            }
        }
        ArrayList<C12456> arrayList2 = new ArrayList();
        for (C12456 c12457 : mapM37386.values()) {
            if (!hashSet2.contains(c12457.f37460) && !hashSet.contains(c12457.f37460)) {
                arrayList2.add(c12457);
            }
        }
        C6083.sort(arrayList2, C8200.comparing(new C18101()));
        for (C12456 c12458 : arrayList2) {
            arrayList.add(C13874.m33235(c12458.f37460, m37266(abstractC15440M37375, c12458)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized C4695 m37431(C14852 c14852, String str, String str2) {
        try {
            if (m37396(str)) {
                return null;
            }
            AbstractC15440 abstractC15440M37375 = m37375(c14852, str);
            if (m37374(abstractC15440M37375).contains(str2)) {
                throw m37351();
            }
            C12456 c12456 = (C12456) m37386(abstractC15440M37375).get(str2);
            if (c12456 == null) {
                return null;
            }
            if ("zip_entry".equals(c12456.f37462)) {
                try {
                    return new C4695(m37369(abstractC15440M37375).m36526(C18747.m43415(str2)).m36526("data.bin").m36506());
                } catch (IOException e) {
                    throw m37279(e);
                }
            }
            String strM37398 = m37398(m37369(abstractC15440M37375).m36526(C18747.m43415(str2)).m36526("text.xml"));
            String strM43415 = C18747.m43415(strM37398);
            C3990 c3990M37379 = m37379(abstractC15440M37375, str2, strM43415);
            if (c3990M37379 != null) {
                return new C4695(c3990M37379.f12653);
            }
            C0461 c0461M37276 = m37276(c14852, abstractC15440M37375.getName(), str2, strM37398, strM43415);
            C0244 c0244 = c0461M37276.f2026;
            if (c0244 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(c0244);
                throw m37286(c14852, str, true, "EDIT_TEXT_PREPARE_FAILED_IN_SESSION", "AXML encode failed for saved edit session overlay.", m37264(arrayList), (String) null, (String) null);
            }
            try {
                m37314(abstractC15440M37375, str2, c0461M37276.f2025);
                return new C4695(c0461M37276.f2025.f65408);
            } catch (IOException e2) {
                throw m37279(e2);
            }
            throw th;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized C4695 m37432(C14852 c14852, String str) {
        if (m37396(str)) {
            return null;
        }
        AbstractC15440 abstractC15440M37375 = m37375(c14852, str);
        ArrayList arrayListM37350 = m37350(c14852, abstractC15440M37375);
        if (arrayListM37350.isEmpty()) {
            return null;
        }
        return new C4695(m37335(c14852, abstractC15440M37375, arrayListM37350));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized HashMap m37433(C14852 c14852, String str) {
        HashMap map = new HashMap();
        if (m37396(str)) {
            return map;
        }
        for (C12456 c12456 : m37386(m37375(c14852, str)).values()) {
            map.put(c12456.f37460, c12456.f37462);
        }
        return map;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized C3284 m37434(C14852 c14852, String str, String str2) {
        if (m37396(str)) {
            return null;
        }
        AbstractC15440 abstractC15440M37375 = m37375(c14852, str);
        if (m37374(abstractC15440M37375).contains(str2)) {
            throw m37351();
        }
        C12456 c12456 = (C12456) m37386(abstractC15440M37375).get(str2);
        if (c12456 != null && "zip_entry".equals(c12456.f37462)) {
            AbstractC15440 abstractC15440M36526 = m37369(abstractC15440M37375).m36526(C18747.m43415(str2)).m36526("data.bin");
            if (!abstractC15440M36526.mo23119()) {
                throw m37279(new IOException("ZIP entry overlay data is missing"));
            }
            return new C3284(abstractC15440M36526);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final synchronized void m37423(C14852 c14852, String str) {
        if (m37396(str)) {
            return;
        }
        try {
            AbstractC15440 abstractC15440M37375 = m37375(c14852, str);
            C21629 c21629M37397 = m37397(abstractC15440M37375);
            int i = c21629M37397.f69437;
            m37366(abstractC15440M37375.m36526("state.json"), JSON.object().add("revision", i).add("createdAt", c21629M37397.f69436).add("lastAccessedAt", System.currentTimeMillis()).toString().getBytes(StandardCharsets.UTF_8), ".state");
        } catch (IOException | RuntimeException | C3059 e) {
            C19926.m45879("MT MCP edit session build touch failed, workspaceId=" + c14852.f45300 + ", editSessionId=" + str, e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C2070 m37410(C14852 c14852, C12736 c12736) {
        C16096 c16096;
        C16096 c16097;
        C4103 c4103M12327;
        try {
            AbstractC15440 abstractC15440M37375 = m37375(c14852, c12736.f38302);
            C15390 c15390M33437 = C13979.m33437(this.f48733.m25979(c14852, this, c12736.f38302), m37272(c12736));
            C16096 c16098 = c15390M33437.f47124;
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap map = new HashMap();
                for (C4103 c4103 : m37429(c14852, c12736.f38302)) {
                    map.put(c4103.f13038, c4103);
                }
                Iterator it = c15390M33437.f47125.iterator();
                int i = 0;
                int i2 = 0;
                while (it.hasNext()) {
                    C3397 c3397 = (C3397) it.next();
                    boolean zEquals = c3397.f10758.equals(c3397.f10757);
                    Iterator it2 = it;
                    c16097 = c16098;
                    try {
                        arrayList.add(new C7300(c3397.f10756, c3397.f10755, c3397.f10759, c3397.f10758, !zEquals));
                        if (zEquals) {
                            i2++;
                        } else {
                            i++;
                            int i3 = (int) Long.parseLong(c3397.f10755.substring(2), 16);
                            if (c3397.f10758.equals(c3397.f10753)) {
                                arrayList2.add(new C13866(C14460.m34531(C4103.m12323(i3, c3397.f10759)), null));
                            } else {
                                C4103 c4104 = (C4103) map.get(C14460.m34531(C4103.m12323(i3, c3397.f10759)));
                                if (c4104 == null) {
                                    c4103M12327 = C4103.m12325(i3, c3397.f10759, c3397.f10757, c3397.f10758, c3397.f10754);
                                } else {
                                    c4103M12327 = c4104.m12327(c3397.f10757, c3397.f10754, c3397.f10758);
                                }
                                arrayList2.add(new C13866(C14460.m34531(c4103M12327.f13046), c4103M12327));
                            }
                        }
                        it = it2;
                        c16098 = c16097;
                    } catch (C3059 e) {
                        e = e;
                        c16096 = c16097;
                        m37306(e, c14852.f45300, c12736, c16096);
                        throw e;
                    }
                }
                if (i == 0) {
                    return new C2070(c14852.f45300, c12736.f38302, false, 0, i2, arrayList);
                }
                try {
                    this.f48733.m25978(c14852.f45300, c12736.f38302);
                    m37315(abstractC15440M37375, arrayList2);
                    C1944.m6404(abstractC15440M37375);
                    return new C2070(c14852.f45300, c12736.f38302, true, i, i2, arrayList);
                } catch (IOException e2) {
                    throw m37279(e2);
                }
            } catch (C3059 e3) {
                e = e3;
                c16097 = c16098;
            }
        } catch (C3059 e4) {
            e = e4;
            c16096 = null;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C9126 m37416(C14852 c14852, C20707 c20707, InterfaceC19087 interfaceC19087) throws Throwable {
        int i;
        boolean z;
        long jM37263;
        boolean z2;
        int iM37260;
        IOException iOException;
        C3059 c3059;
        try {
            try {
                String str = c20707.f66689;
                m37401(str);
                AbstractC15440 abstractC15440M37375 = m37375(c14852, c20707.f66688);
                m37404(c14852, c20707.f66688, str);
                C2579 c2579M37387 = m37387(c14852, c20707.f66688, str);
                String str2 = c20707.f66688;
                if (c2579M37387.f8163) {
                    throw m37284(c14852, str2, str, "directory");
                }
                if (!c2579M37387.f8162) {
                    boolean zContains = m37374(abstractC15440M37375).contains(str);
                    C12456 c12456 = (C12456) m37386(abstractC15440M37375).get(str);
                    if (c12456 != null) {
                        String str3 = c20707.f66688;
                        AbstractC15440 abstractC15440M36526 = m37369(abstractC15440M37375).m36526(C18747.m43415(str)).m36526("data.bin");
                        if ("axml".equals(c12456.f37462) || m37328(abstractC15440M36526, m37257(abstractC15440M36526))) {
                            throw m37284(c14852, str3, str, "axml_entry");
                        }
                    }
                    if (!zContains && ((c12456 != null || c2579M37387.f8164) && !c20707.f66690)) {
                        String str4 = c20707.f66688;
                        C3059 c3059M9361 = C3059.m9361(null, "FILE_ALREADY_EXISTS", "Workspace ZIP entry already exists.", "warning");
                        m37307(c3059M9361, c14852, str4, str);
                        throw c3059M9361;
                    }
                    C8223 c8223 = new C8223(Entry.DEFAULT_NAME, str, null, c12456 != null);
                    int i2 = m37397(abstractC15440M37375).f69437;
                    try {
                        try {
                            AbstractC15440 abstractC15440M37296 = m37296(abstractC15440M37375);
                            AbstractC15440 abstractC15440M36527 = abstractC15440M37296.m36526("overlay.next");
                            abstractC15440M36527.m36508();
                            i = i2;
                            try {
                                abstractC15440M36527.m36526("meta.json").m36502(JSON.object().add("targetType", "zip_entry").add("entryName", str).add("encoding", C14776.f45134).add("lineEnding", "lf").toString().getBytes(StandardCharsets.UTF_8));
                                jM37263 = m37263(abstractC15440M36527.m36526("data.bin"), interfaceC19087, c14852, c20707.f66688, str);
                                try {
                                    try {
                                        try {
                                            if (m37328(abstractC15440M36527.m36526("data.bin"), jM37263)) {
                                                throw m37284(c14852, c20707.f66688, str, "axml_entry");
                                            }
                                            interfaceC19087.mo43980(jM37263);
                                            m37317(abstractC15440M37375, c8223, abstractC15440M37296);
                                            AbstractC15440 abstractC15440M37392 = m37392(abstractC15440M37375, str);
                                            abstractC15440M37392.mo35195();
                                            if (abstractC15440M37392.mo23120() || !abstractC15440M36527.mo23551(abstractC15440M37392)) {
                                                throw new IOException("Unable to publish ZIP entry overlay");
                                            }
                                            AbstractC15440 abstractC15440M37381 = m37381(abstractC15440M37375, str);
                                            if (abstractC15440M37381.mo23120()) {
                                                abstractC15440M37381.mo23552();
                                            }
                                            ArrayList arrayListM37374 = m37374(abstractC15440M37375);
                                            arrayListM37374.remove(str);
                                            m37394(abstractC15440M37375, arrayListM37374);
                                            m37371(abstractC15440M37375, str);
                                            iM37260 = m37260(abstractC15440M37375, m37397(abstractC15440M37375));
                                            try {
                                                m37365(abstractC15440M37375, c8223);
                                            } catch (IOException e) {
                                                e = e;
                                                z2 = true;
                                                if (z2) {
                                                    C19926.m45879("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c20707.f66688, e);
                                                }
                                                if (!m37329(abstractC15440M37375, e)) {
                                                    throw m37342(c14852, c20707.f66688, str);
                                                }
                                                if (e instanceof C3059) {
                                                    c3059 = (C3059) e;
                                                    if (!"EDIT_SESSION_STORAGE_FAILED".equals(c3059.f9610)) {
                                                        throw c3059;
                                                    }
                                                }
                                                throw m37377(e);
                                            } catch (RuntimeException e2) {
                                                e = e2;
                                                z = true;
                                                if (!m37367(e)) {
                                                    throw e;
                                                }
                                                iOException = new IOException("Edit session storage backend failed", e);
                                                if (z) {
                                                    C19926.m45879("MT MCP workspace entry copy commit completed after backend error, editSessionId=" + c20707.f66688, e);
                                                }
                                                if (!m37329(abstractC15440M37375, iOException)) {
                                                    throw m37342(c14852, c20707.f66688, str);
                                                }
                                                throw m37377(e);
                                            } catch (C3059 e3) {
                                                e = e3;
                                                z2 = true;
                                                if (z2) {
                                                    C19926.m45879("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c20707.f66688, e);
                                                }
                                                if (!m37329(abstractC15440M37375, e)) {
                                                    throw m37342(c14852, c20707.f66688, str);
                                                }
                                                if (e instanceof C3059) {
                                                    c3059 = (C3059) e;
                                                    if (!"EDIT_SESSION_STORAGE_FAILED".equals(c3059.f9610)) {
                                                        throw c3059;
                                                    }
                                                }
                                                throw m37377(e);
                                            }
                                            m37343(abstractC15440M37375);
                                            return new C9126(c14852.f45300, c20707.f66688, str, jM37263, Integer.valueOf(iM37260));
                                        } catch (C6628 e4) {
                                            e = e4;
                                            if (!m37329(abstractC15440M37375, e)) {
                                                throw m37342(c14852, c20707.f66688, str);
                                            }
                                            throw e.f20399;
                                        }
                                    } catch (IOException e5) {
                                        e = e5;
                                        z2 = false;
                                        iM37260 = i;
                                    } catch (RuntimeException e6) {
                                        e = e6;
                                        z = false;
                                        iM37260 = i;
                                        if (!m37367(e)) {
                                            throw e;
                                        }
                                        iOException = new IOException("Edit session storage backend failed", e);
                                        if (z && m37330(abstractC15440M37375, c8223, iOException)) {
                                            C19926.m45879("MT MCP workspace entry copy commit completed after backend error, editSessionId=" + c20707.f66688, e);
                                            m37343(abstractC15440M37375);
                                            return new C9126(c14852.f45300, c20707.f66688, str, jM37263, Integer.valueOf(iM37260));
                                        }
                                        if (!m37329(abstractC15440M37375, iOException)) {
                                            throw m37342(c14852, c20707.f66688, str);
                                        }
                                        throw m37377(e);
                                    } catch (C3059 e7) {
                                        e = e7;
                                        z2 = false;
                                        iM37260 = i;
                                    }
                                } catch (IOException e8) {
                                    e = e8;
                                } catch (RuntimeException e9) {
                                    e = e9;
                                } catch (C3059 e10) {
                                    e = e10;
                                }
                                z2 = false;
                            } catch (IOException e11) {
                                e = e11;
                                z2 = false;
                                jM37263 = 0;
                            } catch (RuntimeException e12) {
                                e = e12;
                                z = false;
                                jM37263 = 0;
                                iM37260 = i;
                                if (!m37367(e)) {
                                    throw e;
                                }
                                iOException = new IOException("Edit session storage backend failed", e);
                                if (z) {
                                    C19926.m45879("MT MCP workspace entry copy commit completed after backend error, editSessionId=" + c20707.f66688, e);
                                    m37343(abstractC15440M37375);
                                    return new C9126(c14852.f45300, c20707.f66688, str, jM37263, Integer.valueOf(iM37260));
                                }
                                if (!m37329(abstractC15440M37375, iOException)) {
                                    throw m37342(c14852, c20707.f66688, str);
                                }
                                throw m37377(e);
                            } catch (C3059 e13) {
                                e = e13;
                                z2 = false;
                                jM37263 = 0;
                            }
                        } catch (C6628 e14) {
                            e = e14;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        i = i2;
                        z2 = false;
                        jM37263 = 0;
                        iM37260 = i;
                        if (z2) {
                            C19926.m45879("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c20707.f66688, e);
                            m37343(abstractC15440M37375);
                            return new C9126(c14852.f45300, c20707.f66688, str, jM37263, Integer.valueOf(iM37260));
                        }
                        if (!m37329(abstractC15440M37375, e)) {
                            throw m37342(c14852, c20707.f66688, str);
                        }
                        if (e instanceof C3059) {
                            c3059 = (C3059) e;
                            if (!"EDIT_SESSION_STORAGE_FAILED".equals(c3059.f9610)) {
                                throw c3059;
                            }
                        }
                        throw m37377(e);
                    } catch (RuntimeException e16) {
                        e = e16;
                        i = i2;
                    } catch (C3059 e17) {
                        e = e17;
                        i = i2;
                        z2 = false;
                        jM37263 = 0;
                        iM37260 = i;
                        if (z2) {
                            C19926.m45879("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c20707.f66688, e);
                            m37343(abstractC15440M37375);
                            return new C9126(c14852.f45300, c20707.f66688, str, jM37263, Integer.valueOf(iM37260));
                        }
                        if (!m37329(abstractC15440M37375, e)) {
                            throw m37342(c14852, c20707.f66688, str);
                        }
                        if (e instanceof C3059) {
                            c3059 = (C3059) e;
                            if (!"EDIT_SESSION_STORAGE_FAILED".equals(c3059.f9610)) {
                                throw c3059;
                            }
                        }
                        throw m37377(e);
                    }
                    iM37260 = i;
                    if (z2 && m37330(abstractC15440M37375, c8223, e)) {
                        C19926.m45879("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c20707.f66688, e);
                        m37343(abstractC15440M37375);
                        return new C9126(c14852.f45300, c20707.f66688, str, jM37263, Integer.valueOf(iM37260));
                    }
                    if (!m37329(abstractC15440M37375, e)) {
                        throw m37342(c14852, c20707.f66688, str);
                    }
                    if (e instanceof C3059) {
                        c3059 = (C3059) e;
                        if (!"EDIT_SESSION_STORAGE_FAILED".equals(c3059.f9610)) {
                            throw c3059;
                        }
                    }
                    throw m37377(e);
                }
                throw m37284(c14852, str2, str, "axml_entry");
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static {
        ApplicationC12518.m30701(119);
        f48730 = new short[]{1355, -3613, -3608, -3679, -3606, -3601, -3590, -3601, -3679, -3605, -3606, -3609, -3590, -3631, -3587, -3605, -3587, -3587, -3609, -3615, -3616, -3587, -3637, -3638, -3641, -3622, -3631, -3619, -3637, -3619, -3619, -3641, -3647, -3648, -3631, -3635, -3620, -3637, -3633, -3622, -3637, -3631, -3640, -3633, -3641, -3646, -3637, -3638, -3621, -3616, -3601, -3604, -3614, -3605, -3666, -3590, -3615, -3666, -3601, -3614, -3614, -3615, -3603, -3601, -3590, -3605, -3666, -3605, -3606, -3609, -3590, -3666, -3587, -3605, -3587, -3587, -3609, -3615, -3616, -3666, -3609, -3606, -3645, -3622, -3666, -3645, -3635, -3618, -3666, -3605, -3606, -3609, -3590, -3666, -3587, -3605, -3587, -3587, -3609, -3615, -3616, -3666, -3588, -3615, -3614, -3614, -3604, -3601, -3603, -3611, -3666, -3606, -3605, -3614, -3605, -3590, -3605, -3666, -3608, -3601, -3609, -3614, -3605, -3606, -3678, -3666, -3605, -3606, -3609, -3590, -3619, -3605, -3587, -3587, -3609, -3615, -3616, -3641, -3606, -3661, -3645, -3622, -3666, -3645, -3635, -3618, -3666, -3605, -3606, -3609, -3590, -3666, -3587, -3605, -3587, -3587, -3609, -3615, -3616, -3666, -3588, -3615, -3614, -3614, -3604, -3601, -3603, -3611, -3666, -3606, -3605, -3614, -3605, -3590, -3605, -3666, -3608, -3601, -3609, -3614, -3605, -3606, -3678, -3666, -3605, -3606, -3609, -3590, -3619, -3605, -3587, -3587, -3609, -3615, -3616, -3641, -3606, -3661};
        f48731 = new RuntimeException();
    }

    public C15799(C11691 c11691, C10247 c10247, C9915 c9915) {
        this.f48732 = c11691;
        this.f48733 = c10247;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m37396(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m37402(AbstractC15440 abstractC15440) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        abstractC15440.m36508();
        abstractC15440.m36526("overlay").m36526("dex").m36508();
        m37369(abstractC15440).m36508();
        abstractC15440.m36526("overlay").m36526("resource_value").m36508();
        abstractC15440.m36526("cache").m36526("dex").m36508();
        abstractC15440.m36526("cache").m36526(Entry.DEFAULT_NAME).m36508();
        abstractC15440.m36526("cache").m36526("dex_build").m36508();
        abstractC15440.m36526("deleted").m36508();
        abstractC15440.m36526("failures").m36508();
        m37385(abstractC15440, new ArrayList());
        m37394(abstractC15440, new ArrayList());
        m37372(abstractC15440, new ArrayList());
        m37389(abstractC15440, new ArrayList());
        m37366(abstractC15440.m36526("state.json"), JSON.object().add("revision", 0).add("createdAt", jCurrentTimeMillis).add("lastAccessedAt", jCurrentTimeMillis).toString().getBytes(StandardCharsets.UTF_8), ".state");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m37391(AbstractC15440 abstractC15440) {
        ArrayList arrayList = new ArrayList();
        if (abstractC15440.mo23113()) {
            for (AbstractC15440 abstractC15441 : abstractC15440.mo23549(true)) {
                if (abstractC15441.mo23113() && !abstractC15441.m36533() && m37406(abstractC15441.getName())) {
                    arrayList.add(new C22334(m37340(abstractC15441), abstractC15441, abstractC15441.getName()));
                }
            }
        }
        C6083.sort(arrayList, C15254.thenComparing(C8200.comparingLong(new C23745()), new C6812()));
        int size = arrayList.size() - 9;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((C22334) arrayList.get(i)).f72389);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37309(C14852 c14852, ArrayList arrayList) throws IOException {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC15440 abstractC15440 = (AbstractC15440) it.next();
            this.f48733.m25978(c14852.f45300, abstractC15440.getName());
            if (abstractC15440.mo23120()) {
                m37384(abstractC15440);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m37384(AbstractC15440 abstractC15440) throws IOException {
        if (abstractC15440.mo23120()) {
            if (abstractC15440.mo23113() && !abstractC15440.m36533()) {
                Iterator it = abstractC15440.mo23549(true).iterator();
                while (it.hasNext()) {
                    m37384((AbstractC15440) it.next());
                }
            }
            if (abstractC15440.mo23120() && !abstractC15440.mo23552()) {
                throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to delete ")));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m37272(C12736 c12736) {
        ArrayList arrayList = c12736.f38303;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            C13441 c13441 = (C13441) arrayList.get(i);
            arrayList2.add(new C4808(i, c13441.f40161, c13441.f40164, c13441.f40162, c13441.f40163));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37360(ArrayList arrayList) throws C3059 {
        Iterator it = arrayList.iterator();
        C14146 c14146 = null;
        while (it.hasNext()) {
            C14146 c14147 = (C14146) it.next();
            if (c14146 != null && c14146.m33757() > c14147.f42694) {
                long j = c14146.f42694;
                throw C3059.m9365("PATCH_OVERLAP", "Patch ranges must not overlap.", "warning", JSON.array(), JSON.object().add("firstRange", JSON.object().add("byteOffset", j).add("endByteOffset", c14146.m33757())).add("secondRange", JSON.object().add("byteOffset", c14147.f42694).add("endByteOffset", c14147.m33757())));
            }
            c14146 = c14147;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37310(C14852 c14852, AbstractC15440 abstractC15440, C12456 c12456, String str) throws C3059 {
        if ("resources.arsc".equals(str)) {
            throw m37280(str, "resources_arsc");
        }
        if (c14852.f45307.contains(str) || str.toLowerCase(Locale.ROOT).endsWith(".dex")) {
            throw m37280(str, "dex_entry");
        }
        if (c12456 != null && "axml".equals(c12456.f37462)) {
            throw m37280(str, "axml_entry");
        }
        if (c12456 != null && !"zip_entry".equals(c12456.f37462)) {
            throw m37280(str, "not_raw_zip_entry");
        }
        if (c12456 != null && !m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("data.bin").mo23119()) {
            throw m37280(str, "not_raw_zip_entry");
        }
        try {
            C18090 c18090 = new C18090(c14852.m35253());
            try {
                C3545 entry = c18090.getEntry(str);
                if (entry == null) {
                    if (c12456 == null) {
                        throw m37351();
                    }
                } else {
                    if (entry.isDirectory()) {
                        throw m37280(str, "directory");
                    }
                    if (m37327(c14852, c18090, entry, str)) {
                        throw m37280(str, "axml_entry");
                    }
                }
                c18090.close();
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C3059 e) {
            throw e;
        } catch (Exception e2) {
            throw m37279(new IOException("Failed to inspect ZIP entry for patch.", e2));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12239 m37295(AbstractC15440 abstractC15440, C7797 c7797, ArrayList arrayList) throws C3059 {
        String str = c7797.f24093;
        AbstractC15440 abstractC15440M36526 = m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("data.bin");
        long jMo23127 = abstractC15440M36526.mo23127();
        m37304(arrayList, jMo23127);
        ArrayList arrayList2 = new ArrayList();
        try {
            C23411 c23411M36513 = abstractC15440M36526.m36513("rw");
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C14146 c14146 = (C14146) it.next();
                    byte[] bArr = c14146.f42695;
                    int i = c14146.f42694;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    c23411M36513.seek(i);
                    c23411M36513.m51858(bArr2, 0, length);
                    if (!Arrays.equals(bArr2, c14146.f42695)) {
                        throw m37282(c7797, c14146, bArr2);
                    }
                    arrayList2.add(new C11751(i, bArr2, c14146.f42696));
                    throw e;
                }
                c23411M36513.close();
                try {
                    m37405(abstractC15440M36526, arrayList2);
                    AbstractC15440 abstractC15440M37381 = m37381(abstractC15440, str);
                    if (abstractC15440M37381.mo23120()) {
                        abstractC15440M37381.mo23552();
                    }
                    m37371(abstractC15440, str);
                    ArrayList arrayListM37374 = m37374(abstractC15440);
                    arrayListM37374.remove(str);
                    m37394(abstractC15440, arrayListM37374);
                    m37260(abstractC15440, m37397(abstractC15440));
                    return m37293(c7797, jMo23127, arrayList2, m37397(abstractC15440).f69437);
                } catch (Exception e) {
                    IOException iOException = new IOException("Failed to patch ZIP entry overlay.", e);
                    try {
                        m37364(abstractC15440M36526, arrayList2);
                    } catch (IOException e2) {
                        iOException.addSuppressed(e2);
                    }
                    throw m37279(iOException);
                }
            } catch (Throwable th) {
                try {
                    c23411M36513.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C3059 e3) {
            throw e3;
        } catch (Exception e4) {
            throw m37279(new IOException("Failed to read ZIP entry overlay for patch.", e4));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12239 m37294(C14852 c14852, AbstractC15440 abstractC15440, C7797 c7797, ArrayList arrayList) throws C3059 {
        C8745 c8745;
        String str = c7797.f24093;
        try {
            c8745 = m37380(c14852, abstractC15440, str);
        } catch (C3059 e) {
            String str2 = e.f9610;
            if (!"NOT_TEXT_ENTRY".equals(str2) && !"ENTRY_TEXT_TOO_LARGE".equals(str2)) {
                throw e;
            }
            c8745 = new C8745(C14776.f45134, "lf");
        }
        AbstractC15440 abstractC15440M36535 = abstractC15440.m36535(".patch_bytes");
        try {
            try {
                try {
                    C18090 c18090 = new C18090(c14852.m35253());
                    try {
                        C3545 entry = c18090.getEntry(str);
                        if (entry == null) {
                            throw m37351();
                        }
                        long size = entry.getSize();
                        if (size >= 0) {
                            m37304(arrayList, size);
                        }
                        abstractC15440M36535.mo35195();
                        InputStream inputStreamM42189 = c18090.m42189(entry);
                        try {
                            OutputStream outputStreamMo23555 = abstractC15440M36535.mo23555(false);
                            try {
                                C6106 c6106M37290 = m37290(inputStreamM42189, outputStreamMo23555, c7797, arrayList);
                                ArrayList arrayList2 = c6106M37290.f18724;
                                long j = c6106M37290.f18723;
                                if (outputStreamMo23555 != null) {
                                    outputStreamMo23555.close();
                                }
                                inputStreamM42189.close();
                                if (size < 0) {
                                    m37304(arrayList, j);
                                }
                                m37313(abstractC15440, str, abstractC15440M36535, c8745);
                                c18090.close();
                                m37363(abstractC15440M36535);
                                return m37293(c7797, j, arrayList2, m37397(abstractC15440).f69437);
                            } catch (Throwable th) {
                                if (outputStreamMo23555 != null) {
                                    try {
                                        outputStreamMo23555.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                inputStreamM42189.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            c18090.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    m37363(abstractC15440M36535);
                    throw th7;
                }
            } catch (C3059 e2) {
                m37363(abstractC15440M36535);
                throw e2;
            }
        } catch (Exception e3) {
            m37363(abstractC15440M36535);
            throw m37279(new IOException("Failed to patch ZIP entry.", e3));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37304(ArrayList arrayList, long j) throws C3059 {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14146 c14146 = (C14146) it.next();
            long jM33757 = c14146.m33757();
            long j2 = c14146.f42694;
            if (jM33757 < j2 || jM33757 > j) {
                throw m37278(j2, jM33757, j);
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m37405(AbstractC15440 abstractC15440, ArrayList arrayList) throws IOException {
        C23411 c23411M36513 = abstractC15440.m36513("rw");
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C11751 c11751 = (C11751) it.next();
                c23411M36513.seek(c11751.f35079);
                c23411M36513.write(c11751.f35077);
            }
            c23411M36513.m51860();
            c23411M36513.close();
        } catch (Throwable th) {
            try {
                c23411M36513.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37364(AbstractC15440 abstractC15440, ArrayList arrayList) throws IOException {
        C23411 c23411M36513 = abstractC15440.m36513("rw");
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C11751 c11751 = (C11751) it.next();
                c23411M36513.seek(c11751.f35079);
                byte[] bArr = c11751.f35078;
                c23411M36513.write(bArr, 0, bArr.length);
            }
            c23411M36513.m51860();
            c23411M36513.close();
        } catch (Throwable th) {
            try {
                c23411M36513.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6106 m37290(InputStream inputStream, OutputStream outputStream, C7797 c7797, ArrayList arrayList) throws C3059, IOException {
        int i = 8192;
        byte[] bArr = new byte[8192];
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            C14146 c14146 = (C14146) it.next();
            int i2 = c14146.f42694;
            byte[] bArr2 = c14146.f42696;
            byte[] bArr3 = c14146.f42695;
            long j2 = i2;
            long j3 = j;
            while (j3 < j2) {
                long j4 = i;
                int i3 = i2;
                int i4 = inputStream.read(bArr, 0, (int) Math.min(j4, j2 - j3));
                if (i4 < 0) {
                    throw m37278(i3, c14146.m33757(), j3);
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
                    throw m37278(i5, c14146.m33757(), j3 + ((long) i6));
                }
                i6 += i7;
            }
            long j5 = j3 + ((long) length);
            if (!Arrays.equals(bArr4, bArr3)) {
                throw m37282(c7797, c14146, bArr4);
            }
            outputStream.write(bArr2);
            arrayList2.add(new C11751(i5, bArr4, bArr2));
            i = 8192;
            j = j5;
        }
        while (true) {
            int i8 = inputStream.read(bArr);
            if (i8 < 0) {
                return new C6106(arrayList2, j);
            }
            outputStream.write(bArr, 0, i8);
            j += (long) i8;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12239 m37293(C7797 c7797, long j, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        int length = 0;
        while (it.hasNext()) {
            C11751 c11751 = (C11751) it.next();
            byte[] bArr = c11751.f35077;
            length += bArr.length;
            arrayList2.add(new C12944(c11751.f35079, c11751.f35078, bArr));
        }
        return new C12239(c7797.f24095, c7797.f24092, c7797.f24093, j, length, i, arrayList2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37280(String str, String str2) {
        return C3059.m9365("PATCH_UNSUPPORTED_ENTRY", "ZIP entry cannot be patched as raw bytes.", "fatal", JSON.array(), C7416.m19939("entryName", str, "reason", str2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37278(long j, long j2, long j3) {
        return C3059.m9365("PATCH_RANGE_OUT_OF_ENTRY", "Patch range is outside the ZIP entry.", "warning", JSON.array(), JSON.object().add("byteOffset", j).add("endByteOffset", j2).add("entrySize", j3));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37282(C7797 c7797, C14146 c14146, byte[] bArr) {
        JSONArray jSONArrayArray = JSON.array();
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c7797.f24095).add("editSessionId", c7797.f24092).add("locator", C13169.m31925("zip_entry", c7797.f24093, (String) null, (String) null, (String) null, (String) null));
        int i = c14146.f42694;
        return C3059.m9365("PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedHex.", "warning", jSONArrayArray.add(C10115.m25398(jSONObjectAdd.add("byteOffset", i).add("maxBytes", bArr.length), "mt_apk_read_bytes", "retry", "Read actual bytes at the mismatched patch window before retrying mt_apk_patch_bytes.")), JSON.object().add("byteOffset", i).add("expectedHex", m37271(c14146.f42695)).add("actualHex", m37271(bArr)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37271(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format(Locale.ROOT, "%02X", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m37335(C14852 c14852, AbstractC15440 abstractC15440, ArrayList arrayList) throws C3059 {
        if (!c14852.f45301) {
            throw C3059.m9368("RESOURCE_TABLE_UNAVAILABLE", "Resource table is unavailable.");
        }
        C19626 c19626 = c14852.f45291;
        if (c19626 == null) {
            String str = c14852.f45295;
            if (str == null) {
                str = "Failed to parse resources.arsc";
            }
            throw C3059.m9368("RESOURCE_TABLE_PARSE_FAILED", str);
        }
        byte[] bArrM12324 = C4103.m12324(arrayList, c19626.m45089());
        try {
            byte[] bArrM6406 = C1944.m6406(abstractC15440, bArrM12324);
            if (bArrM6406 != null) {
                return bArrM6406;
            }
            C9028 c9028M23276 = C9028.m23276(c19626.m45090(), EnumC9734.CREATE);
            Iterator it = C4103.m12318(arrayList).iterator();
            while (it.hasNext()) {
                C23816.m52502(c9028M23276, (C4103) it.next());
            }
            c9028M23276.m23285();
            C10130 c10130 = new C10130((int) Math.min(2147483647L, c19626.m45091() + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS));
            c9028M23276.m23283(c10130, (C19277) null);
            byte[] bArrM25444 = c10130.m25444();
            try {
                C1944.m6405(abstractC15440, bArrM12324, bArrM25444);
            } catch (IOException unused) {
            }
            return bArrM25444;
        } catch (C3059 e) {
            throw e;
        } catch (Exception e2) {
            throw C3059.m9368("RESOURCE_COMPILE_FAILED", e2.getMessage() == null ? "Failed to materialize resources.arsc" : e2.getMessage());
        } catch (OutOfMemoryError unused2) {
            throw C18081.m42152();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37366(AbstractC15440 abstractC15440, byte[] bArr, String str) {
        abstractC15440.mo35195();
        AbstractC15440 abstractC15440M36520 = abstractC15440.m36520(str);
        try {
            abstractC15440M36520.m36502(bArr);
            abstractC15440M36520.m36501(abstractC15440, false, true, null);
        } finally {
            m37363(abstractC15440M36520);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m37334(C8223 c8223, String str) {
        JSONObject jSONObjectAdd = JSON.object().add("schemaVersion", 1).add("phase", str).add("targetKind", c8223.f25340).add("target", c8223.f25336);
        String str2 = c8223.f25335;
        return jSONObjectAdd.add("dexEntryName", str2 == null ? JSON.NULL : JSON.value(str2)).add("overlayExisted", c8223.f25339).add("deletedExisted", c8223.f25334).add("failuresExisted", c8223.f25337).add("stateExisted", c8223.f25338).toString().getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37323(AbstractC15440 abstractC15440, byte[] bArr, String str) {
        abstractC15440.mo35195();
        AbstractC15440 abstractC15440M36520 = abstractC15440.m36520(str);
        try {
            abstractC15440M36520.mo23558().mo8675();
            abstractC15440M36520.m36502(bArr);
            abstractC15440M36520.mo23558().mo8670(abstractC15440);
        } finally {
            m37363(abstractC15440M36520);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37321(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, AbstractC15440 abstractC15442) throws IOException {
        for (C12619 c12619 : abstractC15440.mo23558().mo8674()) {
            String name = c12619.m30882().getName();
            if (!"transaction.json".equals(name) && !"committed".equals(name)) {
                m37384(c12619.m30882());
            }
        }
        m37384(abstractC15441);
        m37384(abstractC15442);
        if (abstractC15440.mo23120() && !abstractC15440.mo23552()) {
            throw new IOException("Unable to delete committed transaction directory");
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C8223 m37388(AbstractC15440 abstractC15440, String str) throws IOException {
        JSONObject jSONObjectAsObject = JSON.parse(m37398(abstractC15440)).asObject();
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
        C8223 c8223 = new C8223(string2, string3, string4, m37324(jSONObjectAsObject, "overlayExisted"));
        c8223.f25334 = m37324(jSONObjectAsObject, "deletedExisted");
        c8223.f25337 = m37324(jSONObjectAsObject, "failuresExisted");
        c8223.f25338 = m37324(jSONObjectAsObject, "stateExisted");
        return c8223;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37324(JSONObject jSONObject, String str) throws IOException {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw new IOException("Invalid delete transaction boolean field: ".concat(str));
        }
        return jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m37395(AbstractC15440 abstractC15440, C8223 c8223) throws IOException {
        AbstractC15440 abstractC15440M37382 = m37382(abstractC15440, c8223);
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(".delete_transaction").m36526("overlay.backup");
        if (c8223.f25339) {
            if (!abstractC15440M36526.mo23120()) {
                if (!abstractC15440M37382.mo23120()) {
                    throw new IOException("Delete transaction overlay backup is missing");
                }
                return;
            }
            if (abstractC15440M37382.mo23120()) {
                m37384(abstractC15440M37382);
            }
            abstractC15440M37382.mo35195();
            if (!abstractC15440M36526.mo23551(abstractC15440M37382)) {
                throw new IOException("Unable to restore delete transaction overlay");
            }
            return;
        }
        if (abstractC15440M37382.mo23120()) {
            m37384(abstractC15440M37382);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37322(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, boolean z) throws IOException {
        if (z) {
            if (!abstractC15441.mo23119()) {
                throw new IOException("Delete transaction backup is missing");
            }
            m37366(abstractC15440, abstractC15441.m36506(), ".delete_restore");
        } else if (abstractC15440.mo23120() && !abstractC15440.mo23552()) {
            throw new IOException("Unable to remove delete transaction file");
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static void m37256(AbstractC15440 abstractC15440) throws C3059 {
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(".delete_transaction");
        if (abstractC15440M36526.mo23120()) {
            AbstractC15440 abstractC15440M36527 = abstractC15440.m36526(".delete_transaction").m36526("transaction.json");
            AbstractC15440 abstractC15440M36528 = abstractC15440.m36526(".delete_transaction").m36526("committed");
            if (!abstractC15440M36528.mo23120()) {
                if (!abstractC15440M36527.mo23119()) {
                    try {
                        m37384(abstractC15440M36526);
                        return;
                    } catch (IOException e) {
                        C19926.m45879("MT MCP stale delete transaction directory cleanup failed, editSessionId=" + abstractC15440.getName(), e);
                        return;
                    }
                }
                try {
                    C8223 c8223M37388 = m37388(abstractC15440M36527, "prepared");
                    String str = c8223M37388.f25340;
                    m37395(abstractC15440, c8223M37388);
                    m37322(abstractC15440.m36526("deleted").m36526("dex".equals(str) ? "dex.json" : "entry.json"), abstractC15440M36526.m36526("deleted.backup"), c8223M37388.f25334);
                    m37322(abstractC15440.m36526("failures").m36526("dex".equals(str) ? "dex.json" : "entry.json"), abstractC15440M36526.m36526("failures.backup"), c8223M37388.f25337);
                    m37322(abstractC15440.m36526("state.json"), abstractC15440M36526.m36526("state.backup"), c8223M37388.f25338);
                    m37316(abstractC15440, c8223M37388);
                    m37384(abstractC15440M36527);
                    m37384(abstractC15440M36526);
                    return;
                } catch (C3059 e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw m37279(e3);
                }
            }
            C8223 c8223M37389 = null;
            try {
                try {
                    if (abstractC15440M36528.mo23119()) {
                        c8223M37389 = m37388(abstractC15440M36528, "committed");
                    }
                } catch (Exception e4) {
                    C19926.m45879("MT MCP committed delete marker is unreadable, editSessionId=" + abstractC15440.getName(), e4);
                }
                if (c8223M37389 == null && abstractC15440M36527.mo23119()) {
                    try {
                        c8223M37389 = m37388(abstractC15440M36527, "prepared");
                    } catch (Exception e5) {
                        C19926.m45879("MT MCP prepared delete journal is unreadable after commit, editSessionId=" + abstractC15440.getName(), e5);
                    }
                }
                if (c8223M37389 == null) {
                    m37384(abstractC15440.m36526("cache"));
                } else {
                    m37316(abstractC15440, c8223M37389);
                }
                m37321(abstractC15440M36526, abstractC15440M36527, abstractC15440M36528);
            } catch (Exception e6) {
                C19926.m45879("MT MCP committed delete transaction cleanup failed, editSessionId=" + abstractC15440.getName(), e6);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m37296(AbstractC15440 abstractC15440) throws C3059, IOException {
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(".delete_transaction");
        if (abstractC15440M36526.mo23120()) {
            m37256(abstractC15440);
            if (abstractC15440M36526.mo23120()) {
                throw new IOException("Previous delete transaction cleanup is incomplete");
            }
        }
        abstractC15440M36526.m36508();
        return abstractC15440M36526;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37330(AbstractC15440 abstractC15440, C8223 c8223, Exception exc) {
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(".delete_transaction").m36526("committed");
        if (!abstractC15440M36526.mo23120()) {
            return false;
        }
        try {
            C8223 c8223M37388 = m37388(abstractC15440M36526, "committed");
            String str = c8223M37388.f25335;
            if (c8223.f25340.equals(c8223M37388.f25340) && c8223.f25336.equals(c8223M37388.f25336)) {
                String str2 = c8223.f25335;
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37365(AbstractC15440 abstractC15440, C8223 c8223) {
        m37323(abstractC15440.m36526(".delete_transaction").m36526("committed"), m37334(c8223, "committed"), ".delete_commit");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m37382(AbstractC15440 abstractC15440, C8223 c8223) {
        String str = c8223.f25340;
        String str2 = c8223.f25336;
        if ("dex".equals(str)) {
            String str3 = c8223.f25335;
            C14844.m35244(str2);
            return abstractC15440.m36526("overlay").m36526("dex").m36526(str3).m36526(C18747.m43415(str2).concat(".smali"));
        }
        return m37369(abstractC15440).m36526(C18747.m43415(str2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37316(AbstractC15440 abstractC15440, C8223 c8223) throws IOException {
        String str = c8223.f25340;
        String str2 = c8223.f25336;
        if ("dex".equals(str)) {
            String str3 = c8223.f25335;
            C14844.m35244(str2);
            m37384(abstractC15440.m36526("cache").m36526("dex").m36526(str3).m36526(C18747.m43415(str2).concat(".bin")));
            return;
        }
        m37384(m37381(abstractC15440, str2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37329(AbstractC15440 abstractC15440, Exception exc) {
        try {
            m37256(abstractC15440);
            return true;
        } catch (C3059 e) {
            exc.addSuppressed(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m37343(AbstractC15440 abstractC15440) {
        try {
            m37256(abstractC15440);
        } catch (IOException e) {
            e = e;
            C19926.m45879("MT MCP delete transaction cleanup failed, editSessionId=" + abstractC15440.getName(), e);
        } catch (RuntimeException e2) {
            if (!m37367(e2)) {
                throw e2;
            }
            C19926.m45879("MT MCP delete transaction cleanup failed, editSessionId=" + abstractC15440.getName(), e2);
        } catch (C3059 e3) {
            e = e3;
            C19926.m45879("MT MCP delete transaction cleanup failed, editSessionId=" + abstractC15440.getName(), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37306(C3059 c3059, String str, C12736 c12736, C16096 c16096) {
        JSONValue jSONValueValue;
        String str2 = c12736.f38302;
        ArrayList arrayList = c12736.f38303;
        JSONObject jSONObject = c3059.f9609;
        JSONArray jSONArray = c3059.f9604;
        int i = jSONObject.getInt("failedEditIndex", -1);
        boolean z = jSONObject.getBoolean("_suppressResourceRetry", false);
        jSONObject.remove("_suppressResourceRetry");
        C13441 c13441 = (i < 0 || i >= arrayList.size()) ? null : (C13441) arrayList.get(i);
        String string = jSONObject.getString("resourceId", c13441 == null ? null : c13441.f40161);
        String string2 = jSONObject.getString("variant", c13441 != null ? c13441.f40164 : null);
        JSONObject jSONObjectPut = jSONObject.put("workspaceId", str).put("editSessionId", str2).put("failedEditIndex", i >= 0 ? JSON.value(i) : JSON.NULL);
        if (string == null) {
            jSONValueValue = JSON.NULL;
        } else {
            jSONValueValue = JSON.value(C13169.m31925("resource", (String) null, (String) null, (String) null, (String) null, string));
        }
        jSONObjectPut.put("locator", jSONValueValue).put("variant", string2 == null ? JSON.NULL : JSON.value(string2));
        if (jSONObject.get("resourceNamePolicy") == null || jSONObject.get("resourceNamePolicy").isNull()) {
            jSONObject.put("resourceNamePolicy", c16096 == null ? JSON.NULL : c16096.m37986());
        }
        if (z || jSONArray.size() != 0) {
            return;
        }
        String str3 = c3059.f9610;
        if ((!"STALE_TARGET_VERSION".equals(str3) && !"INVALID_VALUE_XML".equals(str3) && !"UNSUPPORTED_VALUE_XML".equals(str3) && !"UNSUPPORTED_STYLED_TEXT_XML".equals(str3) && !"APP_NAME_REFERENCES_NOT_ACCEPTED".equals(str3) && !"RESOURCE_VARIANT_NOT_FOUND".equals(str3)) || string == null || string2 == null) {
            return;
        }
        jSONArray.add(C10115.m25398(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("reads", JSON.array().add(JSON.object().add("locator", C13169.m31925("resource", (String) null, (String) null, (String) null, (String) null, string)).add("variant", string2))).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 2000).add("resolveDepth", 0), "mt_apk_resource_read", "retry", "Re-read the resource value for the latest valueXml/targetVersion or available variants"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21412 m37303(C14852 c14852, AbstractC15440 abstractC15440, C6386 c6386, C15923 c15923) throws C3059 {
        String strM37269;
        ArrayList arrayList = c6386.f19751;
        String str = c6386.f19750;
        String str2 = c6386.f19755;
        if (!"smali_class".equals(str2)) {
            throw C3059.m9364("Invalid targetType", "targetType", JSON.value(str2), JSON.array("smali_class"), JSON.object().add("targetType", "smali_class"));
        }
        String strM37341 = m37341(c6386.f19753);
        m37362(c14852, c6386, str, c6386.f19755, strM37341, (m37356(abstractC15440, strM37341) == null && !(((C10340) m37275(abstractC15440, c15923).get(strM37341)) == null && m37346(c14852, strM37341) == 0)) ? m37347(C8163.m21638(m37407(c14852, abstractC15440.getName(), strM37341, c15923))) : "missing");
        C10620 c10620 = (C10620) arrayList.get(0);
        String str3 = c10620.f31899;
        if ("write_target".equals(str3)) {
            strM37269 = C8163.m21638(c10620.f31900);
        } else {
            if (!m37390(str3)) {
                throw C3059.m9364("Invalid mode", "edits[0].mode", JSON.value(str3), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), JSON.object().add("mode", "replace_match"));
            }
            if (m37356(abstractC15440, strM37341) != null) {
                throw C18081.m42146(c14852.f45300, abstractC15440.getName());
            }
            strM37269 = m37269(c14852, c6386, abstractC15440.getName(), c6386.f19755, strM37341, C8163.m21638(m37407(c14852, abstractC15440.getName(), strM37341, c15923)));
        }
        String str4 = strM37269;
        String strM37347 = m37347(str4);
        String str5 = c6386.f19755;
        arrayList.size();
        return m37301(c14852, abstractC15440, strM37341, str4, str, str5, strM37341, strM37347);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C21412 m37359(C14852 c14852, AbstractC15440 abstractC15440, C6386 c6386, C15923 c15923) throws C3059 {
        String strM37269;
        String str = c14852.f45300;
        String str2 = c6386.f19753;
        ArrayList arrayList = c6386.f19751;
        String str3 = c6386.f19750;
        String strM31946 = C13169.m31946(str2);
        String strM31992 = C13169.m31992(str2);
        if (m37356(abstractC15440, strM31946) != null) {
            throw C18081.m42146(str, str3);
        }
        String strM21638 = C8163.m21638(m37407(c14852, str3, strM31946, c15923));
        C20490 c20490M10823 = C3556.m10822(strM31946, strM21638).m10823(strM31992);
        if (c20490M10823 == null) {
            throw C18081.m42154(str, str3, strM31946);
        }
        int i = c20490M10823.f66056;
        String strM21637 = C8163.m21637(i, c20490M10823.f66059, strM21638);
        m37362(c14852, c6386, str3, c6386.f19755, c6386.f19753, m37347(strM21637));
        C10620 c10620 = (C10620) arrayList.get(0);
        if ("write_target".equals(c10620.f31899)) {
            String strM21639 = C8163.m21638(c10620.f31900);
            if (strM21639.endsWith("\n")) {
                strM21639 = C15472.m36561(1, 0, strM21639);
            }
            if (strM21639.isEmpty() || strM21639.endsWith("\n")) {
                throw m37287(c14852, c6386, "Smali text must contain one complete .method block.");
            }
            String[] strArrSplit = strM21639.split("\n", -1);
            String strTrim = C3556.m10821(strArrSplit[0]).trim();
            String strTrim2 = C3556.m10821(strArrSplit[strArrSplit.length - 1]).trim();
            if (!m37373(strTrim) || !".end method".equals(strTrim2)) {
                throw m37287(c14852, c6386, "Smali text must contain one complete .method block.");
            }
            int length = strArrSplit.length;
            String str4 = strM21639;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                String[] strArr = strArrSplit;
                String strTrim3 = C3556.m10821(strArrSplit[i2]).trim();
                if (m37373(strTrim3)) {
                    i3++;
                } else if (".end method".equals(strTrim3)) {
                    i4++;
                }
                i2++;
                strArrSplit = strArr;
            }
            if (i3 != 1 || i4 != 1) {
                throw m37287(c14852, c6386, "Smali text must contain one complete .method block.");
            }
            String str5 = C20490.m46950(1, strTrim).f66062;
            if (str5.indexOf(40) < 0 || !strM31992.equals(str5)) {
                throw m37287(c14852, c6386, "Smali .method signature does not match locator target.");
            }
            strM37269 = str4;
        } else {
            strM37269 = m37269(c14852, c6386, str3, c6386.f19755, c6386.f19753, strM21637);
        }
        String strM37268 = m37268(strM21638, Math.max(0, i - 1), Math.max(Math.max(0, i - 1), c20490M10823.f66059), strM37269);
        String strM37347 = strM37269.isEmpty() ? "missing" : m37347(strM37269);
        String str6 = c6386.f19755;
        String str7 = c6386.f19753;
        arrayList.size();
        return m37301(c14852, abstractC15440, strM31946, strM37268, str3, str6, str7, strM37347);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21412 m37302(C14852 c14852, AbstractC15440 abstractC15440, C6386 c6386) throws C3059 {
        String strM37347;
        String strM37269;
        String strReplace;
        String str;
        C15923 c15923;
        String str2;
        C20218 c20218;
        String str3 = c14852.f45300;
        String str4 = c6386.f19753;
        String str5 = c6386.f19750;
        ArrayList arrayList = c6386.f19751;
        String str6 = c6386.f19755;
        if (str4 == null || str4.isEmpty() || str4.indexOf(0) >= 0 || str4.endsWith("/")) {
            throw C3059.m9364("Invalid target", "target", str4 != null ? JSON.value(str4) : null, JSON.array(), JSON.object().add("target", "res/layout/activity_main.xml"));
        }
        if ("resources.arsc".equals(str4)) {
            throw C3059.m9363("RESOURCE_TABLE_TEXT_EDIT_UNSUPPORTED", "resources.arsc must be edited with mt_apk_resource_edit.");
        }
        C13161 c13161M37355 = m37355(c14852, abstractC15440, str4);
        boolean z = c13161M37355.f39350;
        String str7 = c13161M37355.f39351;
        if (!((z || "missing".equals(str7)) ? true : str6.equals(str7))) {
            if (!"zip_entry".equals(str6)) {
                throw C3059.m9363("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
            }
            if ("axml".equals(str7)) {
                throw C18081.m42156(str3, str5, str4);
            }
            if ("too_large".equals(str7)) {
                throw C3059.m9363("ENTRY_TEXT_TOO_LARGE", "ZIP entry text is too large to edit.");
            }
            throw C18081.m42155(str3, str5, str4);
        }
        if (z || "missing".equals(str7)) {
            strM37347 = "missing";
        } else {
            strM37347 = m37347(C8163.m21638(("axml".equals(str6) ? m37418(c14852, abstractC15440.getName(), str4) : m37428(c14852, abstractC15440.getName(), str4)).f54073));
        }
        m37362(c14852, c6386, str5, c6386.f19755, str4, strM37347);
        String str8 = c6386.f19755;
        C10620 c10620 = (C10620) arrayList.get(0);
        String str9 = c10620.f31899;
        if ("write_target".equals(str9)) {
            strM37269 = C8163.m21638(c10620.f31900);
        } else {
            if (!m37390(str9)) {
                throw C3059.m9364("Invalid mode", "edits[0].mode", JSON.value(str9), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), JSON.object().add("mode", "replace_match"));
            }
            if (m37374(abstractC15440).contains(str4)) {
                throw m37351();
            }
            strM37269 = m37269(c14852, c6386, abstractC15440.getName(), str8, str4, C8163.m21638("axml".equals(str8) ? m37418(c14852, abstractC15440.getName(), str4).f54073 : m37428(c14852, abstractC15440.getName(), str4).f54073));
        }
        String str10 = strM37269;
        String strM37348 = m37347(str10);
        if ("axml".equals(str6)) {
            Charset charset = StandardCharsets.UTF_8;
            if (str10.getBytes(charset).length > 2097152) {
                throw C3059.m9363("AXML_SOURCE_TOO_LARGE", "AXML source is too large to edit.");
            }
            String strM43415 = C18747.m43415(str10);
            C3990 c3990M37379 = m37379(abstractC15440, str4, strM43415);
            if (c3990M37379 != null) {
                c20218 = new C20218(strM43415, c3990M37379.f12653);
            } else {
                C0461 c0461M37276 = m37276(c14852, str5, str4, str10, strM43415);
                C0244 c0244 = c0461M37276.f2026;
                if (c0244 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(c0244);
                    throw m37286(c14852, str5, false, "EDIT_TEXT_PREPARE_FAILED_IN_SESSION", "AXML encode failed; edit_text candidate was not saved.", m37264(arrayList2), (String) null, (String) null);
                }
                c20218 = c0461M37276.f2025;
            }
            C20218 c20219 = c20218;
            m37318(abstractC15440, new C8223(Entry.DEFAULT_NAME, str4, null, m37369(abstractC15440).m36526(C18747.m43415(str4)).mo23120()), str10.getBytes(charset), c6386.f19755, new C8745(C14776.f45134, "lf"));
            try {
                m37314(abstractC15440, str4, c20219);
            } catch (Exception e) {
                C19926.m45879("MT MCP AXML edit cache publish failed, editSessionId=".concat(str5), e);
            }
            str = c6386.f19755;
            arrayList.size();
            c15923 = null;
            str2 = strM37348;
        } else {
            C8745 c8745M37380 = m37380(c14852, abstractC15440, str4);
            int i = c8745M37380.f26649;
            try {
                C0521 c0521 = new C0521();
                m37305(c0521, i);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(c0521, C14776.m35151(i));
                try {
                    String str11 = c8745M37380.f26650;
                    if ("lf".equals(str11)) {
                        strReplace = str10;
                    } else {
                        strReplace = str10.replace("\n", "crlf".equals(str11) ? "\r\n" : "\r");
                    }
                    outputStreamWriter.write(strReplace);
                    outputStreamWriter.close();
                    byte[] bArrCopyOf = c0521.f2176;
                    int length = bArrCopyOf.length;
                    int i2 = c0521.f2177;
                    if (length != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
                    }
                    byte[] bArr = bArrCopyOf;
                    if (bArr.length > 10485760) {
                        throw C3059.m9363("ENTRY_TEXT_TOO_LARGE", "ZIP entry text is too large to edit.");
                    }
                    String strM37349 = m37347(m37298(c14852, str5, str4, bArr, false).f54073);
                    m37318(abstractC15440, new C8223(Entry.DEFAULT_NAME, str4, null, m37369(abstractC15440).m36526(C18747.m43415(str4)).mo23120()), bArr, c6386.f19755, c8745M37380);
                    str = c6386.f19755;
                    arrayList.size();
                    c15923 = null;
                    str2 = strM37349;
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
                throw m37279(e2);
            }
        }
        return m37300(c14852, str5, str, str4, str2, c15923);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized C21412 m37435(C14852 c14852, String str) {
        m37375(c14852, str);
        return m37339(c14852, str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m37383(C14852 c14852, String str, C15923 c15923) throws C3059 {
        if (m37396(str)) {
            return;
        }
        m37259(c14852, m37375(c14852, str), c15923);
        C21412 c21412M37300 = m37300(c14852, str, (String) null, (String) null, (String) null, c15923);
        if (c21412M37300.f68960 > 0) {
            throw m37285(c14852, str, c21412M37300);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m37408(C14852 c14852, String str, C15923 c15923) {
        if (m37396(str)) {
            return c14852.f45308;
        }
        m37383(c14852, str, c15923);
        return m37273(c14852, m37291(c14852, str, m37375(c14852, str), c15923));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37326(C1689 c1689, C17667 c17667, C22706 c22706, char[] cArr) throws C3059 {
        AbstractC15440 abstractC15440M5689 = c1689.m5689(c17667.f54033);
        if (abstractC15440M5689 == null) {
            return false;
        }
        c22706.m50718();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(abstractC15440M5689.mo27926(), StandardCharsets.UTF_8);
            while (true) {
                try {
                    int i = inputStreamReader.read(cArr);
                    if (i != -1) {
                        c22706.write(cArr, 0, i);
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
                throw m37279(e);
            }
        } catch (IOException e) {
            throw m37279(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m37273(C14852 c14852, C7517 c7517) throws C3059 {
        HashSet hashSet = new HashSet(c14852.f45307);
        HashMap map = new HashMap();
        HashMap map2 = c7517.f23131;
        HashSet hashSet2 = c7517.f23129;
        int i = 0;
        int i2 = 0;
        for (C10340 c10340 : map2.values()) {
            String str = c10340.f31140;
            String str2 = c10340.f31138;
            if (!hashSet.contains(str)) {
                throw m37277();
            }
            if (!hashSet2.contains(str2) && !c14852.f45302.containsKey(str2)) {
                ArrayList arrayList = (ArrayList) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(str, arrayList);
                }
                arrayList.add(c10340);
                i2++;
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            C6083.sort((ArrayList) it.next(), C8200.comparing(new C20924()));
        }
        ArrayList arrayList2 = new ArrayList(c14852.f45308.size() + i2);
        for (String str3 : c14852.f45307) {
            while (i < c14852.f45308.size() && str3.equals(((C17667) c14852.f45308.get(i)).f54034)) {
                int i3 = i + 1;
                C17667 c17667 = (C17667) c14852.f45308.get(i);
                if (!hashSet2.contains(c17667.f54033)) {
                    C10340 c10341 = (C10340) c7517.f23133.get(c17667.f54033);
                    if (c10341 != null) {
                        arrayList2.add(new C17667(c10341.f31140, -1, -1, c10341.f31138));
                    } else {
                        arrayList2.add(c17667);
                    }
                }
                i = i3;
            }
            ArrayList<C10340> arrayList3 = (ArrayList) map.get(str3);
            if (arrayList3 != null) {
                for (C10340 c10342 : arrayList3) {
                    arrayList2.add(new C17667(c10342.f31140, -1, -1, c10342.f31138));
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C7980 m37413(C14852 c14852, String str, C17667 c17667) {
        return m37414(c14852, str, c17667, (C15923) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C7980 m37414(C14852 c14852, String str, C17667 c17667, C15923 c15923) {
        if (m37396(str)) {
            return C11691.m28576(c14852, c17667);
        }
        AbstractC15440 abstractC15440M37375 = m37375(c14852, str);
        C7517 c7517M37291 = m37291(c14852, str, abstractC15440M37375, c15923);
        C10340 c10340 = (C10340) c7517M37291.f23133.get(c17667.f54033);
        if (c10340 != null) {
            String strM37398 = m37398(m37357(abstractC15440M37375, c10340));
            String strM43415 = C18747.m43415(strM37398);
            C18807 c18807M37358 = m37358(abstractC15440M37375, c10340, strM43415);
            if (c18807M37358 != null) {
                return c18807M37358.f59353;
            }
            m37258(c14852, abstractC15440M37375, c10340, strM37398);
            C18807 c18807M37359 = m37358(abstractC15440M37375, c10340, strM43415);
            if (c18807M37359 == null) {
                throw m37285(c14852, str, m37339(c14852, str));
            }
            return c18807M37359.f59353;
        }
        if (c7517M37291.f23129.contains(c17667.f54033)) {
            throw C18081.m42146(c14852.f45300, str);
        }
        return C11691.m28576(c14852, c17667);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C21412 m37339(C14852 c14852, String str) {
        return m37300(c14852, str, (String) null, (String) null, (String) null, (C15923) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21412 m37300(C14852 c14852, String str, String str2, String str3, String str4, C15923 c15923) throws C3059 {
        AbstractC15440 abstractC15440M37375 = m37375(c14852, str);
        HashMap mapM37275 = m37275(abstractC15440M37375, c15923);
        ArrayList arrayList = new ArrayList();
        for (C0244 c0244 : m37338(abstractC15440M37375)) {
            C10340 c10340 = (C10340) mapM37275.get(c0244.f1521);
            if (c10340 != null && c10340.f31140.equals(c0244.f1525)) {
                if (c0244.f1528.equals(C18747.m43415(m37398(m37357(abstractC15440M37375, c10340))))) {
                    arrayList.add(c0244);
                }
            }
        }
        HashMap mapM37386 = m37386(abstractC15440M37375);
        for (C0244 c0245 : m37336(abstractC15440M37375)) {
            C12456 c12456 = (C12456) mapM37386.get(c0245.f1529);
            if (c12456 != null && "axml".equals(c12456.f37462)) {
                String strM37398 = m37398(m37369(abstractC15440M37375).m36526(C18747.m43415(c12456.f37460)).m36526("text.xml"));
                String str5 = c0245.f1528;
                if (str5 != null && str5.equals(C18747.m43415(strM37398))) {
                    arrayList.add(c0245);
                }
            }
        }
        int i = 0;
        for (C10340 c10341 : m37275(abstractC15440M37375, c15923).values()) {
            String strM43415 = C18747.m43415(m37398(m37357(abstractC15440M37375, c10341)));
            if (m37358(abstractC15440M37375, c10341, strM43415) == null && !m37331(abstractC15440M37375, c10341, strM43415)) {
                i++;
            }
        }
        int i2 = i;
        for (C12456 c12457 : m37386(abstractC15440M37375).values()) {
            String str6 = c12457.f37462;
            String str7 = c12457.f37460;
            if ("axml".equals(str6)) {
                String strM43416 = C18747.m43415(m37398(m37369(abstractC15440M37375).m36526(C18747.m43415(str7)).m36526("text.xml")));
                if (m37379(abstractC15440M37375, str7, strM43416) == null && !m37368(abstractC15440M37375, str7, strM43416)) {
                    i2++;
                }
            }
        }
        return new C21412(c14852.f45300, str, str2, str3, str4, i2, arrayList.size(), arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m37259(C14852 c14852, AbstractC15440 abstractC15440, C15923 c15923) throws C3059 {
        int i;
        int iM37258 = 0;
        for (C10340 c10340 : m37275(abstractC15440, c15923).values()) {
            String strM37398 = m37398(m37357(abstractC15440, c10340));
            String strM43415 = C18747.m43415(strM37398);
            if (m37358(abstractC15440, c10340, strM43415) == null && !m37331(abstractC15440, c10340, strM43415)) {
                iM37258 += m37258(c14852, abstractC15440, c10340, strM37398);
            }
        }
        for (C12456 c12456 : m37386(abstractC15440).values()) {
            String str = c12456.f37462;
            final String str2 = c12456.f37460;
            if ("axml".equals(str)) {
                String strM37399 = m37398(m37369(abstractC15440).m36526(C18747.m43415(str2)).m36526("text.xml"));
                String strM43416 = C18747.m43415(strM37399);
                if (m37379(abstractC15440, str2, strM43416) == null && !m37368(abstractC15440, str2, strM43416)) {
                    final String strM43417 = C18747.m43415(strM37399);
                    if (m37379(abstractC15440, str2, strM43417) != null || m37368(abstractC15440, str2, strM43417)) {
                        i = 0;
                    } else {
                        C0461 c0461M37276 = m37276(c14852, abstractC15440.getName(), str2, strM37399, strM43417);
                        final C0244 c0244 = c0461M37276.f2026;
                        if (c0244 == null) {
                            try {
                                m37314(abstractC15440, str2, c0461M37276.f2025);
                                try {
                                    ArrayList arrayListM37336 = m37336(abstractC15440);
                                    C5378.removeIf(arrayListM37336, new Predicate() { // from class: l.ۢܰ᩻
                                        @Override // java.util.function.Predicate
                                        public /* synthetic */ Predicate and(Predicate predicate) {
                                            return C19285.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* JADX INFO: renamed from: negate */
                                        public /* synthetic */ Predicate mo4928negate() {
                                            return C19285.$default$negate(this);
                                        }

                                        public /* synthetic */ Predicate or(Predicate predicate) {
                                            return C19285.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj) {
                                            C0244 c0245 = (C0244) obj;
                                            if (str2.equals(c0245.f1529)) {
                                                return strM43417.equals(c0245.f1528);
                                            }
                                            return false;
                                        }
                                    });
                                    m37389(abstractC15440, arrayListM37336);
                                    i = 1;
                                } catch (IOException e) {
                                    throw m37279(e);
                                }
                            } catch (IOException e2) {
                                throw m37279(e2);
                            }
                        } else {
                            try {
                                ArrayList arrayListM37337 = m37336(abstractC15440);
                                C5378.removeIf(arrayListM37337, new Predicate() { // from class: l.ܽܰ᩻
                                    @Override // java.util.function.Predicate
                                    public /* synthetic */ Predicate and(Predicate predicate) {
                                        return C19285.$default$and(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    /* JADX INFO: renamed from: negate */
                                    public /* synthetic */ Predicate mo4928negate() {
                                        return C19285.$default$negate(this);
                                    }

                                    public /* synthetic */ Predicate or(Predicate predicate) {
                                        return C19285.$default$or(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    public final boolean test(Object obj) {
                                        String str3;
                                        C0244 c0245 = (C0244) obj;
                                        C0244 c0246 = c0244;
                                        String str4 = c0246.f1529;
                                        return str4 != null && str4.equals(c0245.f1529) && (str3 = c0246.f1528) != null && str3.equals(c0245.f1528);
                                    }
                                });
                                arrayListM37337.add(c0244);
                                m37389(abstractC15440, arrayListM37337);
                                i = 0;
                            } catch (IOException e3) {
                                throw m37279(e3);
                            }
                        }
                    }
                    iM37258 += i;
                }
            }
        }
        return iM37258;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19513 m37299(C14852 c14852, C10340 c10340, String str, String str2) throws C3059 {
        try {
            C19562 c19562M37337 = m37337(c14852, c10340.f31140);
            C19357 c19357M44986 = c19562M37337.m44986();
            try {
                C0657 c0657M24627 = C9684.m24627(str, c19357M44986, c19562M37337);
                if (c0657M24627 == null || !c10340.f31139.equals(c0657M24627.getType())) {
                    String str3 = c10340.f31139;
                    return new C19513(null, new C0244("smali_class", str3, str3, c10340.f31140, str2, "SMALI_COMPILE_FAILED_IN_SESSION", "Smali compile did not produce target class.", null, null));
                }
                try {
                    C21473 c21473 = new C21473();
                    c19357M44986.m48534(c21473);
                    return new C19513(new C1167(str2, c21473.m48624()), null);
                } catch (IOException e) {
                    throw m37279(e);
                }
            } catch (C14658 e2) {
                String message = e2.getMessage() == null ? "Smali compile failed." : e2.getMessage();
                int i = e2.f44794;
                Integer numValueOf = i > 0 ? Integer.valueOf(i - 1) : null;
                int i2 = e2.f44798;
                Integer numValueOf2 = i2 >= 0 ? Integer.valueOf(i2) : null;
                String str4 = c10340.f31139;
                return new C19513(null, new C0244("smali_class", str4, str4, c10340.f31140, str2, "SMALI_COMPILE_FAILED_IN_SESSION", message, numValueOf, numValueOf2));
            }
        } catch (OutOfMemoryError unused) {
            throw C18081.m42152();
        }
        throw C18081.m42152();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C18807 m37358(AbstractC15440 abstractC15440, C10340 c10340, String str) {
        AbstractC15440 abstractC15440M37297 = m37297(abstractC15440, c10340);
        if (!abstractC15440M37297.mo23119()) {
            return null;
        }
        try {
            C12951 c12951 = new C12951(abstractC15440M37297.m36506());
            if (c12951.readInt() == 1296388931 && c12951.readInt() == 1 && str.equals(c12951.m31504())) {
                byte[] bArrM31496 = c12951.m31496();
                if (c12951.available() == 0) {
                    for (C7980 c7980 : (AbstractC18605) C12918.m31380((InputStream) new ByteArrayInputStream(bArrM31496)).mo27438()) {
                        if (c10340.f31139.equals(c7980.getType())) {
                            return new C18807(c7980, bArrM31496);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        AbstractC15440 abstractC15440M37298 = m37297(abstractC15440, c10340);
        if (!abstractC15440M37298.mo23120()) {
            return null;
        }
        abstractC15440M37298.mo23552();
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37319(AbstractC15440 abstractC15440, C10340 c10340, C1167 c1167) {
        C10130 c10130 = new C10130(c1167.f4213.length + 96);
        c10130.writeInt(1296388931);
        c10130.writeInt(1);
        c10130.m25423((CharSequence) c1167.f4214);
        c10130.m25434(c1167.f4213);
        AbstractC15440 abstractC15440M37297 = m37297(abstractC15440, c10340);
        abstractC15440M37297.mo35195();
        abstractC15440M37297.m36496(c10130);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37362(C14852 c14852, C6386 c6386, String str, String str2, String str3, String str4) throws C3059 {
        JSONArray jSONArrayM37349;
        String str5 = c14852.f45300;
        if (str4.equals(c6386.f19754)) {
            return;
        }
        JSONObject jSONObjectAdd = m37265(str5, str, str2, str3).add("currentTargetVersion", str4);
        if ("missing".equals(str4)) {
            jSONArrayM37349 = JSON.array();
        } else {
            jSONArrayM37349 = m37349(str5, str, str2, str3);
        }
        throw C3059.m9365("TARGET_VERSION_MISMATCH", "targetVersion does not match current target text. Re-read the target and retry with data.targetVersion.", "warning", jSONArrayM37349, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static String m37347(String str) {
        return C14460.m34531(C14460.m34532().digest(str.getBytes(StandardCharsets.UTF_8))).substring(0, 16);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C5184 m37354(C14852 c14852, AbstractC15440 abstractC15440, C20498 c20498) throws C3059 {
        String str = c14852.f45300;
        String str2 = c20498.f66069;
        String str3 = c20498.f66068;
        String strM37341 = m37341(str2);
        if (m37356(abstractC15440, strM37341) != null) {
            throw C18081.m42146(str, str3);
        }
        C10340 c10340 = (C10340) m37348(abstractC15440).get(strM37341);
        int iM37346 = m37346(c14852, strM37341);
        boolean z = true;
        if (c10340 == null && iM37346 > 1) {
            throw C3059.m9363("AMBIGUOUS_CLASS_IN_DEX", "Class exists in multiple dex files.");
        }
        boolean z2 = iM37346 > 0;
        if (c10340 == null && !z2) {
            throw C18081.m42146(str, str3);
        }
        String str4 = (c10340 != null ? c10340 : new C10340(m37400(c14852, strM37341).f54034, strM37341)).f31140;
        C8223 c8223 = new C8223("dex", strM37341, str4, c10340 != null);
        m37397(abstractC15440);
        try {
            m37317(abstractC15440, c8223, m37296(abstractC15440));
            if (z2) {
                m37393(abstractC15440, strM37341, str4);
            } else {
                ArrayList arrayListM37344 = m37344(abstractC15440);
                C5378.removeIf(arrayListM37344, new C12023(strM37341));
                m37385(abstractC15440, arrayListM37344);
            }
            ArrayList arrayListM37338 = m37338(abstractC15440);
            C5378.removeIf(arrayListM37338, new C13068(1, strM37341));
            m37372(abstractC15440, arrayListM37338);
            m37260(abstractC15440, m37397(abstractC15440));
            try {
                m37365(abstractC15440, c8223);
            } catch (IOException e) {
                e = e;
                if (z || !m37330(abstractC15440, c8223, e)) {
                    m37329(abstractC15440, e);
                    if (e instanceof C3059) {
                        throw ((C3059) e);
                    }
                    throw m37279(e);
                }
                C19926.m45879("MT MCP delete commit completed after storage error, editSessionId=".concat(str3), e);
            } catch (C3059 e2) {
                e = e2;
                if (z) {
                }
                m37329(abstractC15440, e);
                if (e instanceof C3059) {
                    throw ((C3059) e);
                }
                throw m37279(e);
            }
        } catch (IOException | C3059 e3) {
            e = e3;
            z = false;
        }
        m37343(abstractC15440);
        return new C5184(c20498.f66071, str3, c20498.f66070, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C5184 m37289(C14852 c14852, AbstractC15440 abstractC15440, C20498 c20498, C15923 c15923) throws C3059 {
        C1167 c1167;
        String str = c14852.f45300;
        String str2 = c20498.f66069;
        String str3 = c20498.f66068;
        String strM31946 = C13169.m31946(str2);
        String strM31992 = C13169.m31992(str2);
        if (m37356(abstractC15440, strM31946) != null) {
            throw C18081.m42146(str, str3);
        }
        String strM21638 = C8163.m21638(m37407(c14852, str3, strM31946, c15923));
        C20490 c20490M10823 = C3556.m10822(strM31946, strM21638).m10823(strM31992);
        if (c20490M10823 != null) {
            int i = c20490M10823.f66056;
            boolean z = false;
            String strM37268 = m37268(strM21638, Math.max(0, i - 1), Math.max(Math.max(0, i - 1), c20490M10823.f66059), "");
            String strM37270 = m37270(c14852, abstractC15440, strM31946);
            C10340 c10340 = new C10340(strM37270, strM31946);
            String strM43415 = C18747.m43415(strM37268);
            if (m37358(abstractC15440, c10340, strM43415) == null) {
                C19513 c19513M37299 = m37299(c14852, c10340, strM37268, strM43415);
                C0244 c0244 = c19513M37299.f63057;
                if (c0244 == null) {
                    c1167 = c19513M37299.f63056;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c0244);
                    throw m37286(c14852, str3, false, "SMALI_COMPILE_FAILED_IN_SESSION", "Smali compile failed; delete candidate was not saved.", m37264(arrayList), c20498.f66070, c20498.f66069);
                }
            } else {
                c1167 = null;
            }
            C8223 c8223 = new C8223("dex", strM31946, strM37270, m37357(abstractC15440, c10340).mo23119());
            m37397(abstractC15440);
            try {
                m37317(abstractC15440, c8223, m37296(abstractC15440));
                AbstractC15440 abstractC15440M37357 = m37357(abstractC15440, c10340);
                abstractC15440M37357.mo35195();
                abstractC15440M37357.m36502(strM37268.getBytes(StandardCharsets.UTF_8));
                ArrayList arrayListM37344 = m37344(abstractC15440);
                C5378.removeIf(arrayListM37344, new C12023(strM31946));
                m37385(abstractC15440, arrayListM37344);
                ArrayList arrayListM37338 = m37338(abstractC15440);
                C5378.removeIf(arrayListM37338, new C13068(1, strM31946));
                m37372(abstractC15440, arrayListM37338);
                m37260(abstractC15440, m37397(abstractC15440));
                try {
                    m37365(abstractC15440, c8223);
                } catch (IOException | C3059 e) {
                    e = e;
                    z = true;
                    if (!z || !m37330(abstractC15440, c8223, e)) {
                        m37329(abstractC15440, e);
                        if (e instanceof C3059) {
                            throw ((C3059) e);
                        }
                        throw m37279(e);
                    }
                    C19926.m45879("MT MCP method delete commit completed after storage error, editSessionId=".concat(str3), e);
                }
            } catch (IOException e2) {
                e = e2;
            } catch (C3059 e3) {
                e = e3;
            }
            m37343(abstractC15440);
            if (c1167 != null) {
                try {
                    m37319(abstractC15440, c10340, c1167);
                } catch (Exception e4) {
                    try {
                        AbstractC15440 abstractC15440M37297 = m37297(abstractC15440, c10340);
                        if (abstractC15440M37297.mo23120()) {
                            abstractC15440M37297.mo23552();
                        }
                    } catch (RuntimeException e5) {
                        e4.addSuppressed(e5);
                    }
                    C19926.m45879("MT MCP delete cache publish failed, editSessionId=".concat(str3), e4);
                }
            }
            return new C5184(c20498.f66071, str3, c20498.f66070, str2);
        }
        throw C18081.m42154(str, str3, strM31946);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37269(C14852 c14852, C6386 c6386, String str, String str2, String str3, String str4) throws C3059 {
        ArrayList arrayList = c6386.f19751;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            C10620 c10620 = (C10620) arrayList.get(i);
            String str5 = c10620.f31899;
            if (!m37390(str5)) {
                throw C3059.m9364("Invalid mode", C18307.m42645(i, "edits[", "].mode"), JSON.value(str5), JSON.array("replace_match", "insert_before_match", "insert_after_match"), JSON.object());
            }
            arrayList2.add(new C22699(str5, c10620.f31898, c10620.f31900));
        }
        try {
            return C8163.m21638(C16389.m38586(str4, arrayList2));
        } catch (C13526 e) {
            int i2 = e.f40344;
            String strM42645 = C18307.m42645(i2, "edits[", "]");
            int i3 = C8929.f27150[e.f40342.ordinal()];
            if (i3 == 1) {
                throw m37281("TEXT_MATCH_NOT_FOUND", C16014.m37867(strM42645, ".matchText was not found in current text. Re-read the target and retry with current text."), c14852.f45300, str, str2, str3, e.f40344);
            }
            if (i3 == 2) {
                throw m37281("TEXT_MATCH_AMBIGUOUS", C16014.m37867(strM42645, ".matchText appears multiple times in current text; provide a longer matchText with surrounding context that appears only once."), c14852.f45300, str, str2, str3, e.f40344);
            }
            if (i3 == 3) {
                throw m37281("TEXT_MATCH_OVERLAP", C3200.m9831(e.f40343, "]; match ranges must not overlap.", C7166.m19190(strM42645, " overlaps edits[")), c14852.f45300, str, str2, str3, e.f40344);
            }
            if (i3 == 4) {
                throw C3059.m9364("Invalid mode", C16014.m37867(strM42645, ".mode"), JSON.value(((C10620) arrayList.get(i2)).f31899), JSON.array("replace_match", "insert_before_match", "insert_after_match"), JSON.object());
            }
            throw new IncompatibleClassChangeError();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37281(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        return C3059.m9365(str, str2, "warning", m37349(str3, str4, str5, str6), m37265(str3, str4, str5, str6).add("failedEditIndex", i));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m37390(String str) {
        return "replace_match".equals(str) || "insert_before_match".equals(str) || "insert_after_match".equals(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m37265(String str, String str2, String str3, String str4) {
        return C7416.m19939("workspaceId", str, "editSessionId", str2).add("targetType", str3).add("target", str4).add("locator", C13169.m31924(str3, str4)).add("failures", JSON.array());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONArray m37349(String str, String str2, String str3, String str4) {
        return JSON.array().add(C10115.m25398(C7416.m19939("workspaceId", str, "editSessionId", str2).add("locator", C13169.m31924(str3, str4)).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_apk_read_text", "retry", "Read current target text and targetVersion"));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m37373(String str) {
        return str.startsWith(".method") && str.length() > 7 && Character.isWhitespace(str.charAt(7));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37267(String str) throws C3059 {
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
            throw C3059.m9363("SMALI_CLASS_MISMATCH", "Smali .class directive is invalid.");
        }
        return m37341(strArrSplit[strArrSplit.length - 1]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37287(C14852 c14852, C6386 c6386, String str) {
        return C3059.m9365("DEX_METHOD_MISMATCH", str, "fatal", JSON.array(), JSON.object().add("workspaceId", c14852.f45300).add("editSessionId", c6386.f19750).add("locator", C13169.m31924(c6386.f19755, c6386.f19753)).add("failures", JSON.array()));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C19562 m37337(C14852 c14852, String str) throws C3059 {
        int i;
        C12918 c12918;
        C19562 c19562 = new C19562();
        synchronized (c14852.f45303) {
            Reference reference = (Reference) c14852.f45303.get(str);
            if (reference == null || (c12918 = (C12918) reference.get()) == null) {
                try {
                    BufferedInputStream bufferedInputStreamM36518 = c14852.m35250(str).m36518();
                    try {
                        C7897 c7897M21186 = C7897.m21186(C10619.m26650(bufferedInputStreamM36518));
                        bufferedInputStreamM36518.close();
                        i = c7897M21186.f24463;
                    } catch (Throwable th) {
                        try {
                            bufferedInputStreamM36518.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                    throw C18081.m42149(c14852.f45311, c14852.f45296);
                }
            } else {
                i = c12918.mo27437().f24463;
            }
        }
        c19562.f63232 = i;
        return c19562;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C17667 m37400(C14852 c14852, String str) throws C3059 {
        C17667 c17667 = null;
        for (C17667 c17668 : c14852.f45314) {
            if (str.equals(C14844.m35246(c17668.f54033))) {
                c17667 = c17668;
            }
        }
        if (c17667 != null) {
            return c17667;
        }
        throw C18081.m42146(c14852.f45300, "");
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static int m37346(C14852 c14852, String str) {
        return ((Integer) C13843.getOrDefault(c14852.f45306, C14844.m35244(str), 0)).intValue();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m37375(C14852 c14852, String str) throws C3059 {
        if (m37396(str)) {
            throw C3059.m9363("EDIT_SESSION_REQUIRED", "editSessionId is required for edit session tools.");
        }
        if (m37406(str)) {
            AbstractC15440 abstractC15440M36526 = c14852.f45298.m36526("edit_sessions").m36526(str);
            if (!abstractC15440M36526.mo23113()) {
                throw C3059.m9363("EDIT_SESSION_NOT_FOUND", "Edit session was not found.");
            }
            m37256(abstractC15440M36526);
            return abstractC15440M36526;
        }
        throw C3059.m9364("Invalid editSessionId", "editSessionId", JSON.value(str), JSON.array(), JSON.object().add("editSessionId", "ab12cd34"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37315(AbstractC15440 abstractC15440, ArrayList arrayList) throws IOException {
        byte[] bArrM36506;
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("overlay").m36526("resource_value");
        ArrayList<C23039> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            bArrM36506 = null;
            if (!it.hasNext()) {
                break;
            }
            String str = ((C13866) it.next()).f41345;
            AbstractC15440 abstractC15440M12320 = C4103.m12320(abstractC15440M36526, str);
            boolean zMo23119 = abstractC15440M12320.mo23119();
            if (abstractC15440M12320.mo23119()) {
                bArrM36506 = abstractC15440M12320.m36506();
            }
            arrayList2.add(new C23039(str, zMo23119, bArrM36506));
        }
        AbstractC15440 abstractC15440M36527 = abstractC15440.m36526("state.json");
        boolean zMo231110 = abstractC15440M36527.mo23119();
        bArrM36506 = abstractC15440M36527.mo23119() ? abstractC15440M36527.m36506() : null;
        try {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C13866 c13866 = (C13866) it2.next();
                C4103 c4103 = c13866.f41344;
                if (c4103 != null) {
                    c4103.m12328(abstractC15440M36526);
                } else {
                    AbstractC15440 abstractC15440M12321 = C4103.m12320(abstractC15440M36526, c13866.f41345);
                    if (abstractC15440M12321.mo23120() && !abstractC15440M12321.mo23552()) {
                        throw new IOException("Unable to delete resource patch");
                    }
                }
            }
            m37260(abstractC15440, m37397(abstractC15440));
        } catch (IOException | C3059 e) {
            try {
                for (C23039 c23039 : arrayList2) {
                    AbstractC15440 abstractC15440M12322 = C4103.m12320(abstractC15440M36526, c23039.f74143);
                    if (c23039.f74142) {
                        m37366(abstractC15440M12322, c23039.f74141, ".resource_patch_restore");
                    } else {
                        AbstractC15440 abstractC15440M12323 = C4103.m12320(abstractC15440M36526, c23039.f74143);
                        if (abstractC15440M12323.mo23120() && !abstractC15440M12323.mo23552()) {
                            throw new IOException("Unable to delete resource patch");
                        }
                    }
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            try {
                if (zMo231110) {
                    m37366(abstractC15440M36527, bArrM36506, ".state_restore");
                    throw e;
                }
                if (!abstractC15440M36527.mo23120()) {
                    throw e;
                }
                if (abstractC15440M36527.mo23552()) {
                    throw e;
                }
                throw new IOException("Unable to restore edit session state");
            } catch (IOException e3) {
                e.addSuppressed(e3);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m37357(AbstractC15440 abstractC15440, C10340 c10340) {
        return abstractC15440.m36526("overlay").m36526("dex").m36526(c10340.f31140).m36526(C18747.m43415(c10340.f31139).concat(".smali"));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m37369(AbstractC15440 abstractC15440) {
        return abstractC15440.m36526("overlay").m36526(Entry.DEFAULT_NAME);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m37297(AbstractC15440 abstractC15440, C10340 c10340) {
        return abstractC15440.m36526("cache").m36526("dex").m36526(c10340.f31140).m36526(C18747.m43415(c10340.f31139).concat(".bin"));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m37381(AbstractC15440 abstractC15440, String str) {
        return abstractC15440.m36526("cache").m36526(Entry.DEFAULT_NAME).m36526(C18747.m43415(str).concat(".bin"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37317(AbstractC15440 abstractC15440, C8223 c8223, AbstractC15440 abstractC15441) throws IOException {
        boolean z;
        boolean z2;
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("deleted");
        String str = c8223.f25340;
        AbstractC15440 abstractC15440M36527 = abstractC15440M36526.m36526("dex".equals(str) ? "dex.json" : "entry.json");
        AbstractC15440 abstractC15440M36528 = abstractC15441.m36526("deleted.backup");
        boolean z3 = true;
        if (abstractC15440M36527.mo23119()) {
            abstractC15440M36528.m36502(abstractC15440M36527.m36506());
            z = true;
        } else {
            z = false;
        }
        c8223.f25334 = z;
        AbstractC15440 abstractC15440M36529 = abstractC15440.m36526("failures").m36526("dex".equals(str) ? "dex.json" : "entry.json");
        AbstractC15440 abstractC15440M365210 = abstractC15441.m36526("failures.backup");
        if (abstractC15440M36529.mo23119()) {
            abstractC15440M365210.m36502(abstractC15440M36529.m36506());
            z2 = true;
        } else {
            z2 = false;
        }
        c8223.f25337 = z2;
        AbstractC15440 abstractC15440M365211 = abstractC15440.m36526("state.json");
        AbstractC15440 abstractC15440M365212 = abstractC15441.m36526("state.backup");
        if (abstractC15440M365211.mo23119()) {
            abstractC15440M365212.m36502(abstractC15440M365211.m36506());
        } else {
            z3 = false;
        }
        c8223.f25338 = z3;
        m37323(abstractC15440.m36526(".delete_transaction").m36526("transaction.json"), m37334(c8223, "prepared"), ".delete_txn");
        if (c8223.f25339) {
            AbstractC15440 abstractC15440M37382 = m37382(abstractC15440, c8223);
            AbstractC15440 abstractC15440M365213 = abstractC15441.m36526("overlay.backup");
            if (!abstractC15440M37382.mo23120() || abstractC15440M365213.mo23120() || !abstractC15440M37382.mo23551(abstractC15440M365213)) {
                throw new IOException("Unable to stage delete transaction overlay");
            }
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m37344(AbstractC15440 abstractC15440) throws C3059 {
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("deleted").m36526("dex.json");
        ArrayList arrayList = new ArrayList();
        if (abstractC15440M36526.mo23119()) {
            try {
                JSONValue jSONValue = JSON.parse(m37398(abstractC15440M36526));
                if (jSONValue.isArray()) {
                    Iterator it = jSONValue.asArray().iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                        arrayList.add(new C15277(jSONObjectAsObject.getString("className", null), jSONObjectAsObject.getString("dexEntryName", null)));
                    }
                }
            } catch (Exception e) {
                throw m37279(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static ArrayList m37374(AbstractC15440 abstractC15440) throws C3059 {
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("deleted").m36526("entry.json");
        ArrayList arrayList = new ArrayList();
        if (abstractC15440M36526.mo23119()) {
            try {
                JSONValue jSONValue = JSON.parse(m37398(abstractC15440M36526));
                if (jSONValue.isArray()) {
                    Iterator it = jSONValue.asArray().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((JSONValue) it.next()).asObject().getString("entryName", null));
                    }
                    C5378.removeIf(arrayList, new C0065(3));
                    return arrayList;
                }
            } catch (Exception e) {
                throw m37279(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static ArrayList m37336(AbstractC15440 abstractC15440) throws C3059 {
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("failures").m36526("entry.json");
        ArrayList arrayList = new ArrayList();
        if (abstractC15440M36526.mo23119()) {
            try {
                JSONValue jSONValue = JSON.parse(m37398(abstractC15440M36526));
                if (jSONValue.isArray()) {
                    Iterator it = jSONValue.asArray().iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                        arrayList.add(new C0244(jSONObjectAsObject.getString("targetType", null), jSONObjectAsObject.getString("target", null), null, null, jSONObjectAsObject.getString("textHash", null), jSONObjectAsObject.getString("errorCode", null), jSONObjectAsObject.getString("message", null), (jSONObjectAsObject.get("line") == null || jSONObjectAsObject.get("line").isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("line", -1)), (jSONObjectAsObject.get("column") == null || jSONObjectAsObject.get("column").isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("column", -1))));
                    }
                }
            } catch (Exception e) {
                throw m37279(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static ArrayList m37338(AbstractC15440 abstractC15440) throws C3059 {
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("failures").m36526("dex.json");
        ArrayList arrayList = new ArrayList();
        if (abstractC15440M36526.mo23119()) {
            try {
                JSONValue jSONValue = JSON.parse(m37398(abstractC15440M36526));
                if (jSONValue.isArray()) {
                    Iterator it = jSONValue.asArray().iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                        arrayList.add(new C0244(jSONObjectAsObject.getString("targetType", "smali_class"), jSONObjectAsObject.getString("target", jSONObjectAsObject.getString("className", null)), jSONObjectAsObject.getString("className", null), jSONObjectAsObject.getString("dexEntryName", null), jSONObjectAsObject.getString("textHash", null), jSONObjectAsObject.getString("errorCode", "SMALI_COMPILE_FAILED_IN_SESSION"), jSONObjectAsObject.getString("message", "Smali compile failed."), (jSONObjectAsObject.get("line") == null || jSONObjectAsObject.get("line").isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("line", -1)), (jSONObjectAsObject.get("column") == null || jSONObjectAsObject.get("column").isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("column", -1))));
                    }
                }
            } catch (Exception e) {
                throw m37279(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static long m37340(AbstractC15440 abstractC15440) {
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("state.json");
        if (abstractC15440M36526.mo23119()) {
            try {
                long j = JSON.parse(m37398(abstractC15440M36526)).asObject().getLong("lastAccessedAt", -1L);
                if (j >= 0) {
                    return j;
                }
            } catch (Exception unused) {
            }
            return abstractC15440M36526.mo23117();
        }
        return abstractC15440.mo23117();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C21629 m37397(AbstractC15440 abstractC15440) throws C3059 {
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("state.json");
        if (!abstractC15440M36526.mo23119()) {
            throw m37279(new IOException("Edit session state is missing."));
        }
        try {
            JSONObject jSONObjectAsObject = JSON.parse(m37398(abstractC15440M36526)).asObject();
            int i = jSONObjectAsObject.getInt("revision", -1);
            if (i < 0) {
                throw new NumberFormatException("negative revision");
            }
            long jMo23117 = jSONObjectAsObject.getLong("createdAt", -1L);
            if (jMo23117 < 0) {
                jMo23117 = abstractC15440.mo23117();
            }
            long jM37340 = jSONObjectAsObject.getLong("lastAccessedAt", -1L);
            if (jM37340 < 0) {
                jM37340 = m37340(abstractC15440);
            }
            return new C21629(jMo23117, i, jM37340);
        } catch (Exception e) {
            throw m37279(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private ArrayList m37350(C14852 c14852, AbstractC15440 abstractC15440) {
        int i = m37397(abstractC15440).f69437;
        String str = c14852.f45300;
        String name = abstractC15440.getName();
        C10247 c10247 = this.f48733;
        ArrayList arrayListM25974 = c10247.m25974(i, str, name);
        if (arrayListM25974 != null) {
            return arrayListM25974;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("overlay").m36526("resource_value");
        if (abstractC15440M36526.mo23113()) {
            for (AbstractC15440 abstractC15441 : abstractC15440M36526.mo23549(true)) {
                if (abstractC15441.mo23119() && C4103.m12322(abstractC15441.getName())) {
                    arrayList.add(C4103.m12326(abstractC15441));
                }
            }
        }
        return c10247.m25975(i, c14852.f45300, abstractC15440.getName(), C4103.m12318(arrayList));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m37260(AbstractC15440 abstractC15440, C21629 c21629) throws C3059 {
        int i = c21629.f69437;
        if (i == Integer.MAX_VALUE) {
            throw m37279(new IOException("Edit session revision overflow."));
        }
        int i2 = i + 1;
        long j = c21629.f69436;
        m37366(abstractC15440.m36526("state.json"), JSON.object().add("revision", i2).add("createdAt", j).add("lastAccessedAt", System.currentTimeMillis()).toString().getBytes(StandardCharsets.UTF_8), ".state");
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7517 m37291(C14852 c14852, String str, AbstractC15440 abstractC15440, C15923 c15923) throws C3059 {
        if (c15923 == null) {
            return m37292(abstractC15440, c14852.f45300, str);
        }
        Object objM37692 = c15923.m37692("apk.edit.sessionClassView");
        if (objM37692 instanceof C7517) {
            C7517 c7517 = (C7517) objM37692;
            if (c7517.f23132.equals(c14852.f45300) && c7517.f23130.equals(str)) {
                return c7517;
            }
        }
        C7517 c7517M37292 = m37292(abstractC15440, c14852.f45300, str);
        c15923.m37695(c7517M37292, "apk.edit.sessionClassView");
        return c7517M37292;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7517 m37292(AbstractC15440 abstractC15440, String str, String str2) throws C3059 {
        HashMap mapM37348 = m37348(abstractC15440);
        HashMap map = new HashMap();
        for (C10340 c10340 : mapM37348.values()) {
            map.put(c10340.f31138, c10340);
        }
        HashSet hashSet = new HashSet();
        Iterator it = m37344(abstractC15440).iterator();
        while (it.hasNext()) {
            hashSet.add(C14844.m35244(((C15277) it.next()).f46871));
        }
        return new C7517(str, str2, mapM37348, map, hashSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37270(C14852 c14852, AbstractC15440 abstractC15440, String str) throws C3059 {
        C10340 c10340 = (C10340) m37348(abstractC15440).get(str);
        if (c10340 != null) {
            return c10340.f31140;
        }
        C15277 c15277M37356 = m37356(abstractC15440, str);
        if (c15277M37356 != null) {
            return c15277M37356.f46872;
        }
        int iM37346 = m37346(c14852, str);
        ArrayList arrayList = c14852.f45307;
        if (iM37346 > 1) {
            throw C3059.m9363("AMBIGUOUS_CLASS_IN_DEX", "Class exists in multiple dex files.");
        }
        if (iM37346 == 1) {
            return m37400(c14852, str).f54034;
        }
        if (arrayList.isEmpty()) {
            throw C3059.m9363("NO_DEX_IN_WORKSPACE", "Workspace has no dex file for new Smali.");
        }
        return (String) C5378.stream(arrayList).max(C18373.m42805()).orElse((String) C18566.m43105(arrayList, 1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m37275(AbstractC15440 abstractC15440, C15923 c15923) throws C3059 {
        if (c15923 == null) {
            return m37348(abstractC15440);
        }
        String strM12552 = C4153.m12552(abstractC15440, new StringBuilder("apk.edit.overlayRefs:"));
        Object objM37692 = c15923.m37692(strM12552);
        if (objM37692 != null) {
            return (HashMap) objM37692;
        }
        HashMap mapM37348 = m37348(abstractC15440);
        c15923.m37695(mapM37348, strM12552);
        return mapM37348;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static HashMap m37348(AbstractC15440 abstractC15440) throws C3059 {
        HashMap map = new HashMap();
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("overlay").m36526("dex");
        if (abstractC15440M36526.mo23113()) {
            for (AbstractC15440 abstractC15441 : abstractC15440M36526.mo23549(true)) {
                if (abstractC15441.mo23113()) {
                    String name = abstractC15441.getName();
                    for (AbstractC15440 abstractC15442 : abstractC15441.mo23549(true)) {
                        if (!abstractC15442.mo23113() && abstractC15442.getName().endsWith(".smali")) {
                            try {
                                String strM37403 = m37403(abstractC15442);
                                if (!abstractC15442.getName().equals(C18747.m43415(strM37403).concat(".smali"))) {
                                    throw m37277();
                                }
                                map.put(strM37403, new C10340(name, strM37403));
                            } catch (IOException | C3059 unused) {
                                throw m37277();
                            }
                        }
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m37403(AbstractC15440 abstractC15440) throws C3059, IOException {
        String strM37267;
        BufferedReader bufferedReaderM36521 = abstractC15440.m36521();
        do {
            try {
                String line = bufferedReaderM36521.readLine();
                if (line != null) {
                    strM37267 = m37267(line);
                } else {
                    bufferedReaderM36521.close();
                    throw C3059.m9363("SMALI_CLASS_MISMATCH", "Smali text must contain a .class directive.");
                }
            } catch (Throwable th) {
                try {
                    bufferedReaderM36521.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } while (strM37267 == null);
        bufferedReaderM36521.close();
        return strM37267;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m37385(AbstractC15440 abstractC15440, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C15277 c15277 = (C15277) it.next();
            jSONArrayArray.add(JSON.object().add("className", c15277.f46871).add("dexEntryName", c15277.f46872));
        }
        abstractC15440.m36526("deleted").m36526("dex.json").m36502(jSONArrayArray.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C15277 m37356(AbstractC15440 abstractC15440, String str) {
        for (C15277 c15277 : m37344(abstractC15440)) {
            if (str.equals(c15277.f46871)) {
                return c15277;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m37393(AbstractC15440 abstractC15440, final String str, String str2) throws C3059 {
        ArrayList arrayListM37344 = m37344(abstractC15440);
        C5378.removeIf(arrayListM37344, new Predicate() { // from class: l.᩺᩺᩻
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C15277) obj).f46871);
            }
        });
        arrayListM37344.add(new C15277(str, str2));
        m37385(abstractC15440, arrayListM37344);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m37372(AbstractC15440 abstractC15440, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0244 c0244 = (C0244) it.next();
            JSONObject jSONObjectAdd = JSON.object().add("targetType", c0244.f1522).add("target", c0244.f1529).add("className", c0244.f1521).add("dexEntryName", c0244.f1525).add("textHash", c0244.f1528).add("errorCode", c0244.f1527).add("message", c0244.f1524);
            Integer num = c0244.f1526;
            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c0244.f1523;
            jSONArrayArray.add(jSONObjectAdd2.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        abstractC15440.m36526("failures").m36526("dex.json").m36502(jSONArrayArray.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37331(AbstractC15440 abstractC15440, C10340 c10340, String str) {
        for (C0244 c0244 : m37338(abstractC15440)) {
            if (c10340.f31139.equals(c0244.f1521) && c10340.f31140.equals(c0244.f1525) && str.equals(c0244.f1528)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C0461 m37276(C14852 c14852, String str, String str2, String str3, String str4) throws C3059 {
        Integer num;
        Integer numValueOf;
        try {
            try {
                C10130 c10130 = new C10130();
                C2134 c2134 = new C2134(this.f48733.m25976(c14852, this, str));
                c2134.m7058(true);
                c2134.m7055(str3);
                c2134.m7057(c10130);
                int size = c10130.size();
                if (size > 2097152) {
                    return new C0461(null, new C0244("axml", str2, null, null, str4, "AXML_ENCODED_TOO_LARGE", "Encoded AXML is too large.", null, null));
                }
                try {
                    return new C0461(new C20218(str4, Arrays.copyOf(c10130.m25438(), size)), null);
                } catch (C1580 e) {
                    e = e;
                    if (e.m5400() != null) {
                        int iM38634 = e.m5400().m38634();
                        int iM38625 = e.m5400().m38625();
                        Integer numValueOf2 = iM38634 > 0 ? Integer.valueOf(iM38634 - 1) : null;
                        numValueOf = iM38625 > 0 ? Integer.valueOf(iM38625 - 1) : null;
                        num = numValueOf2;
                    } else {
                        num = null;
                        numValueOf = null;
                    }
                    return new C0461(null, new C0244("axml", str2, null, null, str4, "AXML_ENCODE_FAILED", e.getMessage() != null ? e.getMessage() : "AXML encode failed.", num, numValueOf));
                } catch (Exception e2) {
                    e = e2;
                    return new C0461(null, new C0244("axml", str2, null, null, str4, "AXML_ENCODE_FAILED", e.getMessage() != null ? e.getMessage() : "AXML encode failed.", null, null));
                }
            } catch (OutOfMemoryError unused) {
                throw C18081.m42152();
            }
        } catch (C1580 e3) {
            e = e3;
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C3990 m37379(AbstractC15440 abstractC15440, String str, String str2) {
        AbstractC15440 abstractC15440M37381 = m37381(abstractC15440, str);
        if (!abstractC15440M37381.mo23119()) {
            return null;
        }
        try {
            C12951 c12951 = new C12951(abstractC15440M37381.m36506());
            if (c12951.readInt() == 1296384323 && c12951.readInt() == 1 && str.equals(c12951.m31504()) && str2.equals(c12951.m31504())) {
                byte[] bArrM31496 = c12951.m31496();
                if (c12951.available() == 0) {
                    return new C3990(bArrM31496);
                }
            }
        } catch (Exception unused) {
        }
        AbstractC15440 abstractC15440M37382 = m37381(abstractC15440, str);
        if (!abstractC15440M37382.mo23120()) {
            return null;
        }
        abstractC15440M37382.mo23552();
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37314(AbstractC15440 abstractC15440, String str, C20218 c20218) {
        C10130 c10130 = new C10130(c20218.f65408.length + 128);
        c10130.writeInt(1296384323);
        c10130.writeInt(1);
        c10130.m25423((CharSequence) str);
        c10130.m25423((CharSequence) c20218.f65409);
        c10130.m25434(c20218.f65408);
        AbstractC15440 abstractC15440M37381 = m37381(abstractC15440, str);
        abstractC15440M37381.mo35195();
        abstractC15440M37381.m36496(c10130);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37318(AbstractC15440 abstractC15440, C8223 c8223, byte[] bArr, String str, C8745 c8745) throws C3059 {
        C21629 c21629M37397 = m37397(abstractC15440);
        try {
            AbstractC15440 abstractC15440M37296 = m37296(abstractC15440);
            AbstractC15440 abstractC15440M36526 = abstractC15440M37296.m36526("overlay.next");
            String str2 = c8223.f25340;
            String str3 = c8223.f25336;
            boolean zEquals = "dex".equals(str2);
            if (zEquals) {
                abstractC15440M36526.m36502(bArr);
            } else {
                abstractC15440M36526.m36508();
                m37312(abstractC15440M36526.m36526("meta.json"), str3, str, c8745);
                abstractC15440M36526.m36526("axml".equals(str) ? "text.xml" : "data.bin").m36502(bArr);
            }
            m37317(abstractC15440, c8223, abstractC15440M37296);
            AbstractC15440 abstractC15440M37382 = m37382(abstractC15440, c8223);
            abstractC15440M37382.mo35195();
            if (abstractC15440M37382.mo23120() || !abstractC15440M36526.mo23551(abstractC15440M37382)) {
                throw new IOException("Unable to publish text overlay");
            }
            if (zEquals) {
                ArrayList arrayListM37344 = m37344(abstractC15440);
                C5378.removeIf(arrayListM37344, new C12023(str3));
                m37385(abstractC15440, arrayListM37344);
                ArrayList arrayListM37338 = m37338(abstractC15440);
                C5378.removeIf(arrayListM37338, new C13068(1, str3));
                m37372(abstractC15440, arrayListM37338);
            } else {
                ArrayList arrayListM37374 = m37374(abstractC15440);
                arrayListM37374.remove(str3);
                m37394(abstractC15440, arrayListM37374);
                m37371(abstractC15440, str3);
            }
            m37260(abstractC15440, c21629M37397);
            m37365(abstractC15440, c8223);
            m37343(abstractC15440);
        } catch (IOException e) {
            e = e;
            if (0 != 0 || !m37330(abstractC15440, c8223, e)) {
                m37329(abstractC15440, e);
                if (e instanceof C3059) {
                    throw ((C3059) e);
                }
                throw m37279(e);
            }
            C19926.m45879("MT MCP text edit commit completed after storage error, editSessionId=" + abstractC15440.getName(), e);
        } catch (RuntimeException e2) {
            if (!m37367(e2)) {
                throw e2;
            }
            IOException iOException = new IOException("Edit session storage backend failed", e2);
            if (0 == 0 || !m37330(abstractC15440, c8223, iOException)) {
                m37329(abstractC15440, iOException);
                throw m37279(iOException);
            }
            C19926.m45879("MT MCP text edit commit completed after backend error, editSessionId=" + abstractC15440.getName(), e2);
        } catch (C3059 e3) {
            e = e3;
            if (0 != 0) {
            }
            m37329(abstractC15440, e);
            if (e instanceof C3059) {
                throw ((C3059) e);
            }
            throw m37279(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37312(AbstractC15440 abstractC15440, String str, String str2, C8745 c8745) {
        abstractC15440.m36502(C7416.m19939("targetType", str2, "entryName", str).add("encoding", c8745.f26649).add("lineEnding", c8745.f26650).toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static HashMap m37386(AbstractC15440 abstractC15440) throws C3059 {
        HashMap map = new HashMap();
        AbstractC15440 abstractC15440M37369 = m37369(abstractC15440);
        if (abstractC15440M37369.mo23113()) {
            for (AbstractC15440 abstractC15441 : abstractC15440M37369.mo23549(true)) {
                if (abstractC15441.mo23113()) {
                    try {
                        JSONObject jSONObjectAsObject = JSON.parse(m37398(abstractC15441.m36526("meta.json"))).asObject();
                        String string = jSONObjectAsObject.getString("targetType", null);
                        String string2 = jSONObjectAsObject.getString("entryName", null);
                        int i = jSONObjectAsObject.getInt("encoding", C14776.f45134);
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
                        C12456 c12456 = new C12456(string2, i, string, string3);
                        if (!C18747.m43415(string2).equals(abstractC15441.getName())) {
                            throw m37277();
                        }
                        map.put(string2, c12456);
                    } catch (Exception unused) {
                        throw m37277();
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Long m37266(AbstractC15440 abstractC15440, C12456 c12456) {
        String str = c12456.f37462;
        String str2 = c12456.f37460;
        if ("zip_entry".equals(str)) {
            return Long.valueOf(m37369(abstractC15440).m36526(C18747.m43415(str2)).m36526("data.bin").mo23127());
        }
        C3990 c3990M37379 = m37379(abstractC15440, str2, C18747.m43415(m37398(m37369(abstractC15440).m36526(C18747.m43415(str2)).m36526("text.xml"))));
        if (c3990M37379 == null) {
            return null;
        }
        return Long.valueOf(c3990M37379.f12653.length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m37274(C14852 c14852, AbstractC15440 abstractC15440) throws C3059 {
        ArrayList<C12456> arrayList = new ArrayList(m37386(abstractC15440).values());
        C6083.sort(arrayList, C8200.comparing(new C11046()));
        ArrayList arrayList2 = new ArrayList();
        for (C12456 c12456 : arrayList) {
            String str = c12456.f37462;
            String str2 = c12456.f37460;
            if ("zip_entry".equals(str)) {
                AbstractC15440 abstractC15440M36526 = m37369(abstractC15440).m36526(C18747.m43415(str2)).m36526("data.bin");
                arrayList2.add(new C15766(m37257(abstractC15440M36526), abstractC15440M36526, str2, m37345(c14852, str2)));
            } else {
                C3990 c3990M37379 = m37379(abstractC15440, str2, C18747.m43415(m37398(m37369(abstractC15440).m36526(C18747.m43415(str2)).m36526("text.xml"))));
                if (c3990M37379 == null) {
                    throw m37279(new IOException("Missing valid AXML cache for build."));
                }
                arrayList2.add(new C15766(str2, m37345(c14852, str2), c3990M37379.f12653));
            }
        }
        ArrayList arrayListM37350 = m37350(c14852, abstractC15440);
        if (!arrayListM37350.isEmpty()) {
            arrayList2.add(new C15766("resources.arsc", m37345(c14852, "resources.arsc"), m37335(c14852, abstractC15440, arrayListM37350)));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static long m37257(AbstractC15440 abstractC15440) throws C3059 {
        try {
            if (!abstractC15440.mo23119()) {
                throw new IOException("ZIP entry overlay data is missing");
            }
            long jMo23127 = abstractC15440.mo23127();
            if (jMo23127 < 0 || jMo23127 > 9007199254740991L) {
                throw new IOException("ZIP entry overlay size is unavailable or unsupported");
            }
            return jMo23127;
        } catch (IOException e) {
            throw m37377(e);
        } catch (RuntimeException e2) {
            if (!m37367(e2)) {
                throw e2;
            }
            throw m37377(e2);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C17675 m37370(C14852 c14852, String str, String str2) throws C3059 {
        try {
            C18090 c18090 = new C18090(c14852.m35253());
            try {
                C3545 entry = c18090.getEntry(str2);
                if (entry == null) {
                    throw m37351();
                }
                if (!entry.isDirectory()) {
                    if (m37327(c14852, c18090, entry, str2)) {
                        throw C18081.m42156(c14852.f45300, str, str2);
                    }
                    InputStream inputStreamM42189 = c18090.m42189(entry);
                    try {
                        byte[] bArrM37332 = m37332(inputStreamM42189, 10485776);
                        inputStreamM42189.close();
                        C17675 c17675M37298 = m37298(c14852, str, str2, bArrM37332, bArrM37332.length > 10485760 || (entry.getSize() >= 0 && entry.getSize() > 10485760));
                        c18090.close();
                        return c17675M37298;
                    } catch (Throwable th) {
                        try {
                            inputStreamM42189.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                throw C3059.m9368("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
            } catch (Throwable th3) {
                try {
                    c18090.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (C3059 e) {
            throw e;
        } catch (Exception e2) {
            throw C3059.m9368("ENTRY_READ_FAILED", e2.getMessage() == null ? "Failed to read entry" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m37361(C14852 c14852, String str, String str2, C11418 c11418) throws C3059 {
        try {
            C18090 c18090 = new C18090(c14852.m35253());
            try {
                C3545 entry = c18090.getEntry(str2);
                if (entry == null) {
                    throw m37351();
                }
                if (entry.isDirectory()) {
                    throw C3059.m9368("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
                }
                if (entry.getSize() > 2097152) {
                    throw C3059.m9368("AXML_TOO_LARGE", "AXML entry is too large to decode");
                }
                m37308(c14852, str, c18090, entry, str2, c11418);
                c18090.close();
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C3059 e) {
            throw e;
        } catch (Exception e2) {
            throw C3059.m9368("AXML_DECODE_FAILED", e2.getMessage() == null ? "Failed to decode AXML" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37327(C14852 c14852, C18090 c18090, C3545 c3545, String str) {
        C22274 c22274M35251 = c14852.m35251();
        int iM50003 = c22274M35251.m50003(str);
        if (iM50003 == 2) {
            return true;
        }
        if (iM50003 == 1) {
            return false;
        }
        try {
            InputStream inputStreamM42189 = c18090.m42189(c3545);
            try {
                boolean zM35976 = C15206.m35976(c3545.getSize(), inputStreamM42189);
                c22274M35251.m50005(str, zM35976);
                inputStreamM42189.close();
                c22274M35251.m50004();
                return zM35976;
            } catch (Throwable th) {
                try {
                    inputStreamM42189.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c22274M35251.m50004();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37308(C14852 c14852, String str, C18090 c18090, C3545 c3545, String str2, C11418 c11418) throws IOException {
        C22274 c22274M35251 = c14852.m35251();
        int iM50003 = c22274M35251.m50003(str2);
        if (iM50003 == 1) {
            throw new IOException("Not a binary AXML file");
        }
        C10247 c10247 = this.f48733;
        if (iM50003 == 2) {
            C12396.m30565(c18090, c3545, c10247.m25976(c14852, this, str), c11418);
            return;
        }
        C21569 c21569M50006 = c22274M35251.m50006();
        c21569M50006.m48727(str2);
        try {
            if (!C12396.m30562(c18090, c3545, c10247.m25976(c14852, this, str), c11418, c21569M50006)) {
                throw new IOException("Not a binary AXML file");
            }
            c22274M35251.m50004();
        } catch (Throwable th) {
            c22274M35251.m50004();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m37333(C3545 c3545, C18090 c18090) throws IOException {
        if (c3545.getSize() >= 0 && c3545.getSize() > 10485760) {
            return new byte[10485761];
        }
        InputStream inputStreamM42189 = c18090.m42189(c3545);
        try {
            byte[] bArrM37332 = m37332(inputStreamM42189, 10485761);
            inputStreamM42189.close();
            return bArrM37332;
        } catch (Throwable th) {
            try {
                inputStreamM42189.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C8745 m37380(C14852 c14852, AbstractC15440 abstractC15440, String str) throws C3059 {
        C8745 c8745;
        C12456 c12456 = (C12456) m37386(abstractC15440).get(str);
        if (c12456 != null && "zip_entry".equals(c12456.f37462)) {
            return new C8745(c12456.f37459, c12456.f37461);
        }
        try {
            C18090 c18090 = new C18090(c14852.m35253());
            try {
                C3545 entry = c18090.getEntry(str);
                String str2 = "lf";
                if (entry == null || m37374(abstractC15440).contains(str)) {
                    c8745 = new C8745(C14776.f45134, "lf");
                } else {
                    byte[] bArrM37333 = m37333(entry, c18090);
                    if (bArrM37333.length > 10485760) {
                        throw C3059.m9363("ENTRY_TEXT_TOO_LARGE", "ZIP entry text is too large to edit.");
                    }
                    if (bArrM37333.length == 0) {
                        c8745 = new C8745(C14776.f45134, "lf");
                    } else {
                        int iM35152 = C14776.m35152(bArrM37333.length, bArrM37333);
                        if (iM35152 < 0) {
                            iM35152 = C14776.f45134;
                        }
                        String strM32619 = C13573.m32619(bArrM37333, false);
                        if (strM32619 == null) {
                            throw C3059.m9363("NOT_TEXT_ENTRY", "ZIP entry is not text.");
                        }
                        int length = strM32619.length();
                        for (int i = 0; i < length; i++) {
                            char cCharAt = strM32619.charAt(i);
                            if (cCharAt == '\r') {
                                int i2 = i + 1;
                                if (i2 < length && strM32619.charAt(i2) == '\n') {
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
                        C8745 c8746 = new C8745(iM35152, str2);
                        c18090.close();
                        return c8746;
                    }
                }
                c18090.close();
                return c8745;
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C3059 e) {
            throw e;
        } catch (Exception e2) {
            throw C3059.m9368("ENTRY_READ_FAILED", e2.getMessage() == null ? "Failed to read entry" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37305(C0521 c0521, int i) {
        if (i == C14776.f45120) {
            c0521.write(new byte[]{-17, -69, -65}, 0, 3);
            return;
        }
        if (i == C14776.f45129) {
            c0521.write(new byte[]{-2, -1}, 0, 2);
            return;
        }
        if (i == C14776.f45122) {
            c0521.write(new byte[]{-1, -2}, 0, 2);
        } else if (i == C14776.f45123) {
            c0521.write(new byte[]{0, 0, -2, -1}, 0, 4);
        } else if (i == C14776.f45133) {
            c0521.write(new byte[]{-1, -2, 0, 0}, 0, 4);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17675 m37298(C14852 c14852, String str, String str2, byte[] bArr, boolean z) throws C3059 {
        String strM32619 = C13573.m32619(bArr, z);
        if (strM32619 != null) {
            return new C17675(C8163.m21638(strM32619), z ? "entry_prefix" : "full_source", z, z ? "entry_text_byte_cap" : null, null);
        }
        throw C18081.m42155(c14852.f45300, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C5184 m37288(C14852 c14852, AbstractC15440 abstractC15440, C20498 c20498) throws C3059 {
        boolean z;
        String str = c20498.f66068;
        String str2 = c20498.f66069;
        String str3 = c20498.f66070;
        if ("resources.arsc".equals(str2)) {
            throw C3059.m9363("RESOURCE_TABLE_DELETE_UNSUPPORTED", "resources.arsc cannot be deleted.");
        }
        if (C18373.m42804(str2) > 0) {
            throw C3059.m9363("DEX_ENTRY_RESERVED", "Standard dex entries cannot be deleted as ZIP entries.");
        }
        if (m37374(abstractC15440).contains(str2)) {
            throw m37351();
        }
        C12456 c12456 = (C12456) m37386(abstractC15440).get(str2);
        if (c12456 != null && "axml".equals(str3) && !"axml".equals(c12456.f37462)) {
            throw C3059.m9363("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
        }
        try {
            C18090 c18090 = new C18090(c14852.m35253());
            try {
                C3545 entry = c18090.getEntry(str2);
                boolean z2 = true;
                if (entry != null) {
                    if (entry.isDirectory()) {
                        throw C3059.m9368("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
                    }
                    if (c12456 == null && "axml".equals(str3) && !m37327(c14852, c18090, entry, str2)) {
                        throw C3059.m9363("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
                    }
                    c18090.close();
                    z = true;
                } else {
                    c18090.close();
                    z = false;
                }
                if (c12456 == null && !z) {
                    throw m37351();
                }
                C8223 c8223 = new C8223(Entry.DEFAULT_NAME, str2, null, c12456 != null);
                m37397(abstractC15440);
                try {
                    m37317(abstractC15440, c8223, m37296(abstractC15440));
                    if (z) {
                        ArrayList arrayListM37374 = m37374(abstractC15440);
                        arrayListM37374.remove(str2);
                        arrayListM37374.add(str2);
                        m37394(abstractC15440, arrayListM37374);
                    } else {
                        ArrayList arrayListM37375 = m37374(abstractC15440);
                        arrayListM37375.remove(str2);
                        m37394(abstractC15440, arrayListM37375);
                    }
                    m37371(abstractC15440, str2);
                    m37260(abstractC15440, m37397(abstractC15440));
                    try {
                        m37365(abstractC15440, c8223);
                    } catch (IOException e) {
                        e = e;
                        if (z2 || !m37330(abstractC15440, c8223, e)) {
                            m37329(abstractC15440, e);
                            if (e instanceof C3059) {
                                throw ((C3059) e);
                            }
                            throw m37279(e);
                        }
                        C19926.m45879("MT MCP entry delete commit completed after storage error, editSessionId=".concat(str), e);
                    } catch (C3059 e2) {
                        e = e2;
                        if (z2) {
                        }
                        m37329(abstractC15440, e);
                        if (e instanceof C3059) {
                            throw ((C3059) e);
                        }
                        throw m37279(e);
                    }
                } catch (IOException | C3059 e3) {
                    e = e3;
                    z2 = false;
                }
                m37343(abstractC15440);
                return new C5184(c20498.f66071, str, str3, str2);
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C3059 e4) {
            throw e4;
        } catch (Exception e5) {
            throw C3059.m9368("ENTRY_READ_FAILED", e5.getMessage() == null ? "Failed to read entry" : e5.getMessage());
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m37394(AbstractC15440 abstractC15440, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add(JSON.object().add("entryName", (String) it.next()));
        }
        abstractC15440.m36526("deleted").m36526("entry.json").m36502(jSONArrayArray.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13161 m37355(C14852 c14852, AbstractC15440 abstractC15440, String str) throws C3059 {
        C13161 c13161;
        if (m37374(abstractC15440).contains(str)) {
            return new C13161("missing", true);
        }
        C12456 c12456 = (C12456) m37386(abstractC15440).get(str);
        if (c12456 != null) {
            String str2 = c12456.f37462;
            return (!"zip_entry".equals(str2) || m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("data.bin").mo23127() <= 10485760) ? new C13161(str2, false) : new C13161("too_large", false);
        }
        abstractC15440.getName();
        try {
            C18090 c18090 = new C18090(c14852.m35253());
            try {
                C3545 entry = c18090.getEntry(str);
                if (entry == null) {
                    c13161 = new C13161("missing", false);
                } else if (entry.isDirectory()) {
                    c13161 = new C13161("directory", false);
                } else {
                    if (m37327(c14852, c18090, entry, str)) {
                        C13161 c13162 = new C13161("axml", false);
                        c18090.close();
                        return c13162;
                    }
                    byte[] bArrM37333 = m37333(entry, c18090);
                    if (bArrM37333.length > 10485760) {
                        c13161 = new C13161("too_large", false);
                    } else {
                        c13161 = (bArrM37333.length != 0 && C13573.m32619(bArrM37333, false) == null) ? new C13161("binary", false) : new C13161("zip_entry", false);
                    }
                }
                c18090.close();
                return c13161;
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            throw C3059.m9368("ENTRY_READ_FAILED", e.getMessage() == null ? "Failed to read entry" : e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m37389(AbstractC15440 abstractC15440, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0244 c0244 = (C0244) it.next();
            JSONObject jSONObjectAdd = JSON.object().add("targetType", c0244.f1522).add("target", c0244.f1529).add("textHash", c0244.f1528).add("errorCode", c0244.f1527).add("message", c0244.f1524);
            Integer num = c0244.f1526;
            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c0244.f1523;
            jSONArrayArray.add(jSONObjectAdd2.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        abstractC15440.m36526("failures").m36526("entry.json").m36502(jSONArrayArray.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m37368(AbstractC15440 abstractC15440, String str, String str2) {
        for (C0244 c0244 : m37336(abstractC15440)) {
            if (str.equals(c0244.f1529) && str2.equals(c0244.f1528)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m37371(AbstractC15440 abstractC15440, final String str) throws C3059 {
        ArrayList arrayListM37336 = m37336(abstractC15440);
        C5378.removeIf(arrayListM37336, new Predicate() { // from class: l.ܰ᩺᩻
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C0244) obj).f1529);
            }
        });
        m37389(abstractC15440, arrayListM37336);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37311(AbstractC15440 abstractC15440, String str) throws IOException {
        AbstractC15440 abstractC15440M36526 = m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("meta.json");
        AbstractC15440 abstractC15440M36527 = m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("text.xml");
        AbstractC15440 abstractC15440M36528 = m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("data.bin");
        if (abstractC15440M36526.mo23120() && !abstractC15440M36526.mo23552()) {
            throw new IOException("Unable to delete entry overlay metadata");
        }
        if (abstractC15440M36527.mo23120() && !abstractC15440M36527.mo23552()) {
            throw new IOException("Unable to delete AXML source overlay");
        }
        if (abstractC15440M36528.mo23120() && !abstractC15440M36528.mo23552()) {
            throw new IOException("Unable to delete ZIP entry data overlay");
        }
        AbstractC15440 abstractC15440M36529 = m37369(abstractC15440).m36526(C18747.m43415(str));
        if (abstractC15440M36529.mo23120() && !abstractC15440M36529.mo23552()) {
            throw new IOException("Unable to delete entry overlay directory");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37313(AbstractC15440 abstractC15440, String str, AbstractC15440 abstractC15441, C8745 c8745) throws C3059 {
        boolean z = false;
        try {
            m37369(abstractC15440).m36526(C18747.m43415(str)).m36508();
            abstractC15441.m36501(m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("data.bin"), false, true, null);
            try {
                m37312(m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("meta.json"), str, "zip_entry", c8745);
                AbstractC15440 abstractC15440M36526 = m37369(abstractC15440).m36526(C18747.m43415(str)).m36526("text.xml");
                if (abstractC15440M36526.mo23120() && !abstractC15440M36526.mo23552()) {
                    throw new IOException("Unable to remove stale AXML source overlay");
                }
                AbstractC15440 abstractC15440M37381 = m37381(abstractC15440, str);
                if (abstractC15440M37381.mo23120()) {
                    abstractC15440M37381.mo23552();
                }
                m37371(abstractC15440, str);
                ArrayList arrayListM37374 = m37374(abstractC15440);
                arrayListM37374.remove(str);
                m37394(abstractC15440, arrayListM37374);
                m37260(abstractC15440, m37397(abstractC15440));
            } catch (Exception e) {
                e = e;
                z = true;
                if (z) {
                    try {
                        m37311(abstractC15440, str);
                    } catch (IOException e2) {
                        e.addSuppressed(e2);
                    }
                }
                throw m37279(new IOException("Failed to publish patched ZIP entry overlay.", e));
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m37392(AbstractC15440 abstractC15440, String str) {
        return m37369(abstractC15440).m36526(C18747.m43415(str));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m37401(String str) throws C3059 {
        if (str == null || str.isEmpty() || str.indexOf(0) >= 0) {
            throw C3059.m9364("Invalid entryName", "entryName", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("entryName", "assets/data.bin"));
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m37404(C14852 c14852, String str, String str2) throws C3059 {
        if (str2.endsWith("/")) {
            throw m37284(c14852, str, str2, "directory");
        }
        if ("resources.arsc".equals(str2)) {
            throw m37284(c14852, str, str2, "resources_arsc");
        }
        if (c14852.f45307.contains(str2) || C18373.m42804(str2) > 0) {
            throw m37284(c14852, str, str2, "dex_entry");
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C2579 m37387(C14852 c14852, String str, String str2) throws C3059 {
        C2579 c2579;
        try {
            C18090 c18090 = new C18090(c14852.m35253());
            try {
                C3545 entry = c18090.getEntry(str2);
                if (entry != null) {
                    if (!entry.isDirectory()) {
                        InputStream inputStreamM42189 = c18090.m42189(entry);
                        try {
                            long size = entry.getSize();
                            if (size < 0) {
                                throw new IOException("Workspace entry size is unavailable");
                            }
                            C15983 c15983 = new C15983(inputStreamM42189);
                            boolean zM35976 = C15206.m35976(size, c15983);
                            C15983.m37786(c15983);
                            c2579 = new C2579(true, false, zM35976);
                            inputStreamM42189.close();
                        } catch (Throwable th) {
                            try {
                                inputStreamM42189.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        c2579 = new C2579(true, true, false);
                    }
                } else {
                    c2579 = new C2579(false, false, false);
                }
                c18090.close();
                return c2579;
            } catch (Throwable th3) {
                try {
                    c18090.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception e) {
            throw m37283(c14852, str, str2, e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37328(AbstractC15440 abstractC15440, long j) throws C3059 {
        try {
            InputStream inputStreamMo27926 = abstractC15440.mo27926();
            try {
                if (j < 0) {
                    throw new IOException("Workspace entry size is unavailable");
                }
                C15983 c15983 = new C15983(inputStreamMo27926);
                boolean zM35976 = C15206.m35976(j, c15983);
                C15983.m37786(c15983);
                if (inputStreamMo27926 != null) {
                    inputStreamMo27926.close();
                }
                return zM35976;
            } catch (Throwable th) {
                if (inputStreamMo27926 != null) {
                    try {
                        inputStreamMo27926.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw m37377(e);
        } catch (RuntimeException e2) {
            if (!m37367(e2)) {
                throw e2;
            }
            throw m37377(e2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m37263(AbstractC15440 abstractC15440, InterfaceC19087 interfaceC19087, C14852 c14852, String str, String str2) throws C3059 {
        try {
            try {
                C5401 c5401 = new C5401(abstractC15440.mo23555(false));
                try {
                    try {
                        try {
                            long jMo43979 = interfaceC19087.mo43979(c5401);
                            c5401.close();
                            long j = c5401.f16814;
                            if (jMo43979 == j) {
                                if (m37257(abstractC15440) == j) {
                                    return j;
                                }
                                throw m37279(new IOException("ZIP entry candidate size does not match bytes written"));
                            }
                            C3059 c3059M9368 = C3059.m9368("WORKSPACE_ENTRY_SOURCE_INVALID", "Source byte count does not match bytes written.");
                            m37307(c3059M9368, c14852, str, str2);
                            throw c3059M9368;
                        } catch (IOException e) {
                            throw new C6628(e);
                        }
                    } catch (C20740 e2) {
                        throw m37352(e2.f66768);
                    } catch (C23561 unused) {
                        throw m37399(c14852, str, str2);
                    }
                } catch (Throwable th) {
                    try {
                        c5401.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e3) {
                throw m37352(e3);
            } catch (RuntimeException e4) {
                if (!m37367(e4)) {
                    throw e4;
                }
                throw m37352((Exception) e4);
            }
        } catch (C9451 e5) {
            throw m37352((Exception) e5.f28656);
        } catch (C20740 e6) {
            throw m37352(e6.f66768);
        } catch (C23561 unused2) {
            throw m37399(c14852, str, str2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m37262(C14852 c14852, String str, String str2, OutputStream outputStream) throws C3059 {
        try {
            C18090 c18090 = new C18090(c14852.m35253());
            Throwable th = null;
            try {
                try {
                    try {
                        C3545 entry = c18090.getEntry(str2);
                        if (entry == null) {
                            C3059 c3059M9363 = C3059.m9363("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
                            m37307(c3059M9363, c14852, str, str2);
                            throw c3059M9363;
                        }
                        if (entry.getSize() > 9007199254740991L) {
                            throw m37399(c14852, str, str2);
                        }
                        try {
                            long jM37261 = m37261(c14852, str, str2, c18090.m42189(entry), outputStream);
                            try {
                                c18090.close();
                                return jM37261;
                            } catch (Exception e) {
                                throw m37283(c14852, str, str2, e);
                            }
                        } catch (IOException e2) {
                            throw m37283(c14852, str, str2, e2);
                        } catch (RuntimeException e3) {
                            if (!m37367(e3)) {
                                throw e3;
                            }
                            throw m37283(c14852, str, str2, e3);
                        }
                    } catch (Throwable th2) {
                        try {
                            c18090.close();
                        } catch (Exception e4) {
                            if (0 != 0) {
                                th.addSuppressed(e4);
                            } else {
                                throw m37283(c14852, str, str2, e4);
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
            } catch (C3059 e8) {
                e = e8;
                throw e;
            }
        } catch (Exception e9) {
            throw m37283(c14852, str, str2, e9);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m37261(C14852 c14852, String str, String str2, InputStream inputStream, OutputStream outputStream) throws C3059 {
        try {
            C17917 c17917 = new C17917(inputStream);
            try {
                byte[] bArr = new byte[65536];
                long j = 0;
                while (true) {
                    int i = c17917.read(bArr);
                    if (i < 0) {
                        break;
                    }
                    if (i == 0) {
                        int i2 = c17917.read();
                        if (i2 < 0) {
                            break;
                        }
                        if (j == 9007199254740991L) {
                            throw m37399(c14852, str, str2);
                        }
                        outputStream.write(i2);
                        j++;
                    } else {
                        long j2 = i;
                        if (j > 9007199254740991L - j2) {
                            throw m37399(c14852, str, str2);
                        }
                        outputStream.write(bArr, 0, i);
                        j += j2;
                    }
                }
                c17917.close();
                return j;
            } catch (Throwable th) {
                try {
                    c17917.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C14388 e) {
            throw m37283(c14852, str, str2, e.f43352);
        } catch (C17211 e2) {
            throw m37283(c14852, str, str2, e2.f52791);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m37367(RuntimeException runtimeException) {
        return (runtimeException instanceof SecurityException) || (runtimeException instanceof IllegalArgumentException) || (runtimeException instanceof IllegalStateException) || (runtimeException instanceof UnsupportedOperationException);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C3059 m37377(Exception exc) {
        C3059 c3059M9368 = C3059.m9368("EDIT_SESSION_STORAGE_FAILED", "Edit session storage failed.");
        c3059M9368.f9609.put("backendReason", exc.getClass().getSimpleName());
        return c3059M9368;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m37352(Exception exc) {
        C3059 c3059M9368 = C3059.m9368("EDIT_SESSION_STORAGE_FAILED", "Edit session storage backend failed");
        c3059M9368.f9609.put("backendReason", exc.getClass().getSimpleName());
        return c3059M9368;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37284(C14852 c14852, String str, String str2, String str3) {
        C3059 c3059M9363 = C3059.m9363("WORKSPACE_ENTRY_UNSUPPORTED", "Workspace ZIP entry is not supported by this copy operation.");
        m37307(c3059M9363, c14852, str, str2);
        c3059M9363.f9609.put("backendReason", str3);
        return c3059M9363;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3059 m37399(C14852 c14852, String str, String str2) {
        C3059 c3059M9368 = C3059.m9368("WORKSPACE_ENTRY_TOO_LARGE", "Workspace ZIP entry exceeds the supported JSON integer range.");
        m37307(c3059M9368, c14852, str, str2);
        return c3059M9368;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C3059 m37342(C14852 c14852, String str, String str2) {
        C3059 c3059M9363 = C3059.m9363("FILE_OPERATION_STATE_UNKNOWN", "The workspace entry copy may have changed the edit session, but its final state is unknown.");
        m37307(c3059M9363, c14852, str, str2);
        c3059M9363.f9609.put("backendReason", "rollback_failed").put("changed", true).put("operationMode", "atomic").put("stateKnown", false);
        return c3059M9363;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37283(C14852 c14852, String str, String str2, Exception exc) {
        C3059 c3059M9368 = C3059.m9368("WORKSPACE_ENTRY_READ_FAILED", "Failed to read workspace ZIP entry.");
        m37307(c3059M9368, c14852, str, str2);
        c3059M9368.f9609.put("backendReason", exc.getClass().getSimpleName());
        return c3059M9368;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37307(C3059 c3059, C14852 c14852, String str, String str2) {
        c3059.f9609.put("workspaceId", c14852.f45300).put("editSessionId", str == null ? JSON.NULL : JSON.value(str)).put("entryName", str2);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m37345(C14852 c14852, String str) {
        Iterator it = c14852.f45312.iterator();
        while (it.hasNext()) {
            if (str.equals(((C13874) it.next()).f41355)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m37332(InputStream inputStream, int i) throws IOException {
        C0521 c0521 = new C0521(Math.min(i, 8192));
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int i2 = inputStream.read(bArr, 0, Math.min(8192, i));
            if (i2 == -1) {
                break;
            }
            c0521.write(bArr, 0, i2);
            i -= i2;
        }
        byte[] bArr2 = c0521.f2176;
        int length = bArr2.length;
        int i3 = c0521.f2177;
        return length == i3 ? bArr2 : Arrays.copyOf(bArr2, i3);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m37351() {
        return C3059.m9363("ENTRY_NOT_FOUND", "ZIP entry not found");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37285(C14852 c14852, String str, C21412 c21412) {
        boolean z;
        ArrayList arrayList = c21412.f68962;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if ("axml".equals(((C0244) it.next()).f1522)) {
                z = true;
                break;
            }
        }
        return m37286(c14852, str, true, z ? "EDIT_TEXT_PREPARE_FAILED_IN_SESSION" : "SMALI_COMPILE_FAILED_IN_SESSION", z ? "Saved edit session has AXML encode failures." : "Smali compile failed in saved edit session.", m37264(arrayList), (String) null, (String) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37286(C14852 c14852, String str, boolean z, String str2, String str3, JSONArray jSONArray, String str4, String str5) {
        JSONValue jSONValue;
        JSONObject jSONObjectObject = JSON.object();
        if (c14852 != null) {
            jSONObjectObject.add("workspaceId", c14852.f45300);
        }
        if (str != null) {
            jSONObjectObject.add("editSessionId", str);
        }
        if (str4 != null && str5 != null) {
            jSONObjectObject.add("locator", C13169.m31924(str4, str5));
        }
        if (jSONArray != null) {
            jSONObjectObject.add("overlaySaved", z).add("failures", jSONArray);
            if (str4 == null && jSONArray.size() > 0 && (jSONValue = jSONArray.get(0).asObject().get("locator")) != null && !jSONValue.isNull()) {
                jSONObjectObject.add("locator", jSONValue);
            }
        }
        return C3059.m9365(str2, str3, "fatal", JSON.array(), jSONObjectObject);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m37264(ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0244 c0244 = (C0244) it.next();
            JSONObject jSONObjectAdd = JSON.object().add("locator", C13169.m31959(c0244.f1522, c0244.f1529)).add("className", c0244.f1521).add("dexEntryName", c0244.f1525).add("textHash", c0244.f1528).add("errorCode", c0244.f1527).add("message", c0244.f1524);
            Integer num = c0244.f1526;
            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c0244.f1523;
            jSONArrayArray.add(jSONObjectAdd2.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m37258(C14852 c14852, AbstractC15440 abstractC15440, final C10340 c10340, String str) throws C3059 {
        final String strM43415 = C18747.m43415(str);
        if (m37358(abstractC15440, c10340, strM43415) != null || m37331(abstractC15440, c10340, strM43415)) {
            return 0;
        }
        C19513 c19513M37299 = m37299(c14852, c10340, str, strM43415);
        C0244 c0244 = c19513M37299.f63057;
        if (c0244 != null) {
            String str2 = c0244.f1524;
            Integer num = c0244.f1526;
            Integer num2 = c0244.f1523;
            try {
                ArrayList arrayListM37338 = m37338(abstractC15440);
                C5378.removeIf(arrayListM37338, new Predicate() { // from class: l.ܿܰ᩻
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19285.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo4928negate() {
                        return C19285.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19285.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C0244 c0245 = (C0244) obj;
                        C10340 c10341 = c10340;
                        if (c10341.f31139.equals(c0245.f1521) && c10341.f31140.equals(c0245.f1525)) {
                            return strM43415.equals(c0245.f1528);
                        }
                        return false;
                    }
                });
                String str3 = c10340.f31139;
                arrayListM37338.add(new C0244("smali_class", str3, str3, c10340.f31140, strM43415, "SMALI_COMPILE_FAILED_IN_SESSION", str2, num, num2));
                m37372(abstractC15440, arrayListM37338);
                return 0;
            } catch (IOException e) {
                throw m37279(e);
            }
        }
        try {
            m37319(abstractC15440, c10340, c19513M37299.f63056);
            try {
                ArrayList arrayListM37339 = m37338(abstractC15440);
                C5378.removeIf(arrayListM37339, new Predicate() { // from class: l.ܳܰ᩻
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19285.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo4928negate() {
                        return C19285.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19285.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C0244 c0245 = (C0244) obj;
                        C10340 c10341 = c10340;
                        if (c10341.f31139.equals(c0245.f1521) && c10341.f31140.equals(c0245.f1525)) {
                            return strM43415.equals(c0245.f1528);
                        }
                        return false;
                    }
                });
                m37372(abstractC15440, arrayListM37339);
                return 1;
            } catch (IOException e2) {
                throw m37279(e2);
            }
        } catch (IOException e3) {
            throw m37279(e3);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static String m37398(AbstractC15440 abstractC15440) throws C3059 {
        try {
            return new String(abstractC15440.m36506(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw m37279(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37320(AbstractC15440 abstractC15440, C11418 c11418) throws C3059 {
        C15217 c15217 = new C15217();
        c15217.m36012(c11418);
        char[] cArr = new char[8192];
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(abstractC15440.mo27926(), StandardCharsets.UTF_8);
            while (true) {
                try {
                    int i = inputStreamReader.read(cArr);
                    if (i == -1) {
                        c15217.m36009();
                        inputStreamReader.close();
                        return;
                    } else {
                        for (int i2 = 0; i2 < i; i2++) {
                            c15217.m36010(cArr[i2]);
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
                throw m37279(e);
            }
        } catch (IOException e) {
            throw m37279(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37363(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo23120()) {
            abstractC15440.mo23552();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21412 m37301(C14852 c14852, AbstractC15440 abstractC15440, String str, String str2, String str3, String str4, String str5, String str6) throws C3059 {
        C1167 c1167;
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str2.split("\\n", -1);
        int length = strArrSplit.length;
        if (length > 0 && strArrSplit[length - 1].isEmpty()) {
            length--;
        }
        for (int i = 0; i < length; i++) {
            String strM36561 = strArrSplit[i];
            if (strM36561.endsWith("\r")) {
                strM36561 = C15472.m36561(1, 0, strM36561);
            }
            arrayList.add(strM36561);
        }
        Iterator it = arrayList.iterator();
        String str7 = null;
        while (it.hasNext()) {
            String strM37267 = m37267((String) it.next());
            if (strM37267 != null) {
                if (str7 != null) {
                    throw C3059.m9363("SMALI_CLASS_MISMATCH", "Smali text must contain only one .class directive.");
                }
                str7 = strM37267;
            }
        }
        if (str7 == null) {
            throw C3059.m9363("SMALI_CLASS_MISMATCH", "Smali text must contain a .class directive.");
        }
        if (!str.equals(str7)) {
            throw C3059.m9363("SMALI_CLASS_MISMATCH", "Smali .class descriptor does not match target class.");
        }
        String strM37270 = m37270(c14852, abstractC15440, str);
        C10340 c10340 = new C10340(strM37270, str);
        String strM43415 = C18747.m43415(str2);
        C18807 c18807M37358 = m37358(abstractC15440, c10340, strM43415);
        if (c18807M37358 == null) {
            C19513 c19513M37299 = m37299(c14852, c10340, str2, strM43415);
            C0244 c0244 = c19513M37299.f63057;
            if (c0244 != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c0244);
                throw m37286(c14852, str3, false, "SMALI_COMPILE_FAILED_IN_SESSION", "Smali compile failed; edit_text candidate was not saved.", m37264(arrayList2), str4, str5);
            }
            c1167 = c19513M37299.f63056;
        } else {
            c1167 = new C1167(strM43415, c18807M37358.f59354);
        }
        m37318(abstractC15440, new C8223("dex", str, strM37270, m37357(abstractC15440, c10340).mo23119()), str2.getBytes(StandardCharsets.UTF_8), (String) null, (C8745) null);
        try {
            m37319(abstractC15440, c10340, c1167);
        } catch (Exception e) {
            C19926.m45879("MT MCP text edit cache publish failed, editSessionId=".concat(str3), e);
        }
        return m37300(c14852, str3, str4, str5, str6, (C15923) null);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m37341(String str) throws C3059 {
        if (str == null || str.isEmpty()) {
            throw m37353(str);
        }
        String strM42807 = C18373.m42807(str);
        if (!strM42807.startsWith("L") || !strM42807.endsWith(l.b) || strM42807.length() <= 3 || strM42807.indexOf(92) >= 0 || strM42807.indexOf("..") >= 0 || strM42807.indexOf("//") >= 0 || strM42807.indexOf(91) >= 0 || strM42807.indexOf(40) >= 0 || strM42807.indexOf(41) >= 0 || strM42807.indexOf(59) != strM42807.length() - 1) {
            throw m37353(str);
        }
        String strM36561 = C15472.m36561(1, 1, strM42807);
        if (strM36561.startsWith("/") || strM36561.endsWith("/")) {
            throw m37353(str);
        }
        return strM42807;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m37353(String str) {
        return C3059.m9365("INVALID_SMALI_CLASS_DESCRIPTOR", "Invalid Smali class descriptor.", "fatal", JSON.array(), JSON.object().add("badValue", str == null ? JSON.NULL : JSON.value(str)));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C3059 m37378(String str) {
        return C3059.m9364("Invalid targetType", "targetType", JSON.value(str), JSON.array("smali_class", "smali_method", "axml", "zip_entry"), JSON.object().add("targetType", "zip_entry"));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m37406(String str) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37277() {
        return C3059.m9368("EDIT_SESSION_STORAGE_FAILED", "Edit session overlay is corrupt.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m37279(Exception exc) {
        return C3059.m9368("EDIT_SESSION_STORAGE_FAILED", exc.getMessage() == null ? "Edit session storage failed." : exc.getMessage());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m37376() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 8).toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37268(String str, int i, int i2, String str2) {
        C16505 c16505;
        if (str.isEmpty()) {
            c16505 = new C16505(new C10862[]{new C10862(str, 0, 0)});
        } else {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (int i4 = 0; i4 < str.length(); i4++) {
                if (str.charAt(i4) == '\n') {
                    arrayList.add(new C10862(str, i3, i4));
                    i3 = i4 + 1;
                }
            }
            if (i3 < str.length()) {
                arrayList.add(new C10862(str, i3, str.length()));
            }
            c16505 = new C16505((C10862[]) arrayList.toArray(new C10862[0]));
        }
        int iM38872 = c16505.m38872();
        int iMax = Math.max(0, Math.min(i, iM38872));
        int iMax2 = Math.max(iMax, Math.min(i2, iM38872));
        if (iMax >= iMax2) {
            return C8163.m21638(str);
        }
        int length = iMax == iM38872 ? str.length() : c16505.m38873(iMax).f32630;
        int i5 = c16505.m38873(iMax2 - 1).f32629;
        if (i5 < str.length() && str.charAt(i5) == '\n') {
            i5++;
        }
        String strM21638 = C8163.m21638(str2);
        StringBuilder sb = new StringBuilder(strM21638.length() + (str.length() - (i5 - length)) + 1);
        sb.append((CharSequence) str, 0, length);
        if (!strM21638.isEmpty()) {
            sb.append(strM21638);
            if (i5 < str.length() && !strM21638.endsWith("\n")) {
                sb.append('\n');
            }
        }
        sb.append((CharSequence) str, i5, str.length());
        return C8163.m21638(sb.toString());
    }
}
