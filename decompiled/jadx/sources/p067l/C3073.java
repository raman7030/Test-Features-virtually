package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֡᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W78J */
/* JADX INFO: loaded from: classes2.dex */
public final class C3073 {

    /* JADX INFO: renamed from: ᩷ۗ᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f81844 = {5974, 11294, 11285, 11279, 11273, 11266, 11300, 11279, 11294, 11267, 11279, 11290, 11267, 11286, 11287, 11295, 11294, 11267, 11300, 11288, 11287, 11290, 11272, 11272, 11300, 11272, 11286, 11290, 11287, 11282, 11295, 11294, 11267, 11300, 11286, 11294, 11279, 11283, 11284, 11295, 11300, 11272, 11286, 11290, 11287, 11282, 11288, 11287, 11290, 11272, 11272, 11300, 11272, 11286, 11290, 11287, 11282, 11295, 11294, 11267, 11300, 11293, 11282, 11294, 11287, 11295, 11300, 11272, 11286, 11290, 11287, 11282, 11310, 11285, 11272, 11278, 11275, 11275, 11284, 11273, 11279, 11294, 11295, 11355, 11273, 11294, 11290, 11295, 11355, 11280, 11282, 11285, 11295, 11288, 11287, 11290, 11272, 11272, 11300, 11272, 11286, 11290, 11287, 11282, 11293, 11282, 11294, 11287, 11295, 11288, 11287, 11290, 11272, 11272, 11300, 11272, 11286, 11290, 11287, 11282};

    /* JADX INFO: renamed from: ֫ */
    public final C17384 f5563;

    /* JADX INFO: renamed from: ۧ */
    public final C12107 f5564;

    public C3073(C17384 c17384, C12107 c12107) {
        this.f5563 = c17384;
        this.f5564 = c12107;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C13054 m5186(C16484 c16484, C3942 c3942) throws C5276 {
        String str = c3942.f8562;
        C19365 c19365 = c3942.f8564;
        C10962 c10962M28001 = this.f5564.m28001(c16484, this.f5563, str);
        String str2 = c16484.f48416;
        try {
            if (c10962M28001.m25281(c19365.f57810, m5180(c16484, str)) == null) {
                throw C19553.m44412(str2, str);
            }
            c10962M28001.m25283();
            return new C13054(1);
        } catch (C5276 e) {
            if (C17384.m39567(str)) {
                C12107.m27994(c16484, e);
            }
            if (!"INVALID_ARGUMENT".equals(e.f12413)) {
                throw e;
            }
            JSONObject jSONObject = e.f12412;
            if (!"variant".equals(jSONObject.getString("argument", null)) || jSONObject.getJSONArray("availableVariants") == null) {
                throw e;
            }
            JSONObject jSONObjectAdd = C9417.m21913("workspaceId", str2, "editSessionId", str).add("reads", JSON.array().add(JSON.object().add("locator", C14884.m34021("resource", (String) null, (String) null, (String) null, (String) null, c19365.f57810)).add("variant", "default"))).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 50).add("resolveDepth", 0);
            JSONArray jSONArray = new JSONArray(e.f12407);
            jSONArray.add(C11982.m27418(jSONObjectAdd, "mt_apk_resource_read", "retry", "Retry reading the same resource with batch resource_read arguments"));
            throw e.m11412(jSONArray);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15340 m5184(C16484 c16484, C18023 c18023) throws C5276 {
        String str;
        C18023 c18024 = c18023;
        String str2 = c18024.f53805;
        C10962 c10962M28001 = this.f5564.m28001(c16484, this.f5563, str2);
        HashSet hashSetM5180 = m5180(c16484, str2);
        ArrayList arrayList = c18024.f53810;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (i < arrayList.size()) {
            try {
                C12660 c12660 = (C12660) arrayList.get(i);
                String str3 = c12660.f35548;
                String str4 = c12660.f35548;
                int i2 = i;
                ArrayList arrayList3 = arrayList;
                str = str2;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                try {
                    C24332 c24332M25280 = c10962M28001.m25280(str3, c12660.f35549, c18024.f53807, c18024.f53808, c18024.f53806, c18024.f53809, hashSetM5180);
                    if (c24332M25280 != null) {
                        ArrayList arrayList4 = c24332M25280.f77092;
                        if (!linkedHashMap2.containsKey(str3)) {
                            linkedHashMap2.put(str3, new C18417(str3, c24332M25280.f77090));
                        }
                        if (arrayList4.isEmpty()) {
                            arrayList2.add(new C24058(i2, str4, c12660.f35549, "RESOURCE_VARIANT_NOT_FOUND", "Resource variant not found.", c24332M25280.f77091, null));
                        } else {
                            C12974 c12974 = (C12974) arrayList4.get(0);
                            arrayList2.add(new C24058(i2, str4, c12974.f36488, null, null, c24332M25280.f77091, c12974));
                        }
                    } else {
                        arrayList2.add(new C24058(i2, str4, c12660.f35549, "RESOURCE_NOT_FOUND", "Resource not found.", null, null));
                    }
                    i = i2 + 1;
                    c18024 = c18023;
                    linkedHashMap = linkedHashMap2;
                    arrayList = arrayList3;
                    str2 = str;
                } catch (C5276 e) {
                    e = e;
                    if (C17384.m39567(str)) {
                        C12107.m27994(c16484, e);
                    }
                    throw e;
                }
            } catch (C5276 e2) {
                e = e2;
                str = str2;
            }
        }
        return new C15340(c16484.f48416, c10962M28001.m25283(), new ArrayList(linkedHashMap.values()), arrayList2);
    }

    /* JADX INFO: renamed from: ֫ */
    private HashSet m5180(C16484 c16484, String str) {
        HashSet hashSet = new HashSet();
        Iterator it = this.f5563.m39601(c16484, str).iterator();
        while (it.hasNext()) {
            hashSet.add(((C15554) it.next()).f44436);
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11713 m5183(C16484 c16484, C3942 c3942, C17502 c17502) throws C5276 {
        String str = c3942.f8562;
        String str2 = c3942.f8570;
        C19365 c19365 = c3942.f8564;
        C19167 c19167M5181 = m5181(c16484, str, c19365, c17502);
        try {
            return new C11713(c16484.f48416, c19365, c19167M5181.f57265, C17384.m39518(c19167M5181.f57266), C10127.m23608(c19167M5181.f57266, c3942.f8563, c3942.f8571, c3942.f8573, c3942.f8565), c19167M5181.f57268, c19167M5181.f57267, c3942.f8573, c3942.f8565, c19167M5181.f57264);
        } catch (C5276 e) {
            if (!"INVALID_ARGUMENT".equals(e.f12413) || !"lineCharOffset".equals(e.f12412.getString("argument", null))) {
                throw e;
            }
            JSONValue jSONValue = c3942.f8567;
            if (str2 == null) {
                throw e;
            }
            if ("startColumn".equals(str2)) {
                throw C5276.m11406("Invalid startColumn", "startColumn", jSONValue, JSON.array(0, Integer.MAX_VALUE), JSON.object().add("startColumn", 0));
            }
            if ("nextCursor".equals(str2)) {
                throw C5276.m11406("Invalid cursor", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23388 m5185(C16484 c16484, C3942 c3942) throws Throwable {
        C19561 c19561;
        Throwable th;
        InputStream inputStream;
        Throwable th2;
        C6831 c6831M39603;
        String str = c16484.f48416;
        C19365 c19365 = c3942.f8564;
        int i = c3942.f8569;
        String str2 = c3942.f8562;
        String str3 = c19365.f57809;
        int i2 = c3942.f8572;
        if (!"entry_text".equals(c19365.f57813)) {
            throw C5276.m11406("Byte reads are valid only for zip_entry locators", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        boolean zEquals = "resources.arsc".equals(str3);
        C17384 c17384 = this.f5563;
        if (zEquals && (c6831M39603 = c17384.m39603(c16484, str2)) != null) {
            return m5182(str, c3942, c6831M39603.f17747);
        }
        C5490 c5490M39605 = c17384.m39605(c16484, str2, str3);
        boolean z = false;
        if (c5490M39605 != null) {
            String str4 = c16484.f48416;
            AbstractC17043 abstractC17043 = c5490M39605.f13135;
            long jMo25101 = abstractC17043.mo25101();
            int i3 = c3942.f8569;
            long j = i3;
            if (j >= jMo25101) {
                return new C23388(str4, c19365, new byte[0], i3, c3942.f8572, jMo25101, i3, false);
            }
            int iMin = (int) Math.min(i2, jMo25101 - j);
            byte[] bArr = new byte[iMin];
            try {
                C24618 c24618M38671 = abstractC17043.m38671("r");
                try {
                    c24618M38671.seek(i);
                    c24618M38671.m54256(bArr, 0, iMin);
                    c24618M38671.close();
                    int i4 = c3942.f8569;
                    long j2 = ((long) i4) + ((long) iMin);
                    if (j2 < jMo25101 && j2 <= 2147483647L) {
                        z = true;
                    }
                    return new C23388(str4, c19365, bArr, i4, c3942.f8572, jMo25101, (int) Math.min(j2, 2147483647L), z);
                } catch (Throwable th3) {
                    try {
                        c24618M38671.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (IOException | RuntimeException unused) {
                throw C5276.m11410("ENTRY_READ_FAILED", "Failed to read entry overlay.");
            }
        }
        C6831 c6831M39602 = c17384.m39602(c16484, str2, str3);
        if (c6831M39602 != null) {
            return m5182(str, c3942, c6831M39602.f17747);
        }
        try {
            C19561 c19562 = new C19561(c16484.m37409());
            try {
                C5738 entry = c19562.getEntry(str3);
                try {
                    if (entry == null) {
                        throw C5276.m11405("ENTRY_NOT_FOUND", "ZIP entry not found");
                    }
                    if (!entry.isDirectory()) {
                        long size = entry.getSize();
                        if (size >= 0) {
                            try {
                                int i5 = c3942.f8569;
                                if (i5 >= size) {
                                    C23388 c23388 = new C23388(c16484.f48416, c19365, new byte[0], i5, c3942.f8572, size, i5, false);
                                    c19562.close();
                                    return c23388;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c19561 = c19562;
                                try {
                                    c19561.close();
                                    throw th;
                                } catch (Throwable th6) {
                                    th.addSuppressed(th6);
                                    throw th;
                                }
                            }
                        }
                        int i6 = size >= 0 ? i2 : i2 + 1;
                        InputStream inputStreamM44448 = c19562.m44448(entry);
                        try {
                            try {
                                C23461.m52183(i, inputStreamM44448);
                                int i7 = 8192;
                                C2864 c2864 = new C2864(Math.min(i6, 8192));
                                byte[] bArr2 = new byte[8192];
                                while (i6 > 0) {
                                    int i8 = inputStreamM44448.read(bArr2, 0, Math.min(i7, i6));
                                    if (i8 == -1) {
                                        break;
                                    }
                                    c2864.write(bArr2, 0, i8);
                                    i6 -= i8;
                                    i7 = 8192;
                                }
                                byte[] bArrCopyOf = c2864.f4949;
                                int length = bArrCopyOf.length;
                                int i9 = c2864.f4950;
                                if (length != i9) {
                                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i9);
                                }
                                inputStreamM44448.close();
                                boolean z2 = size < 0 && bArrCopyOf.length > i2;
                                if (z2) {
                                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
                                }
                                byte[] bArr3 = bArrCopyOf;
                                int i10 = c3942.f8569;
                                long length2 = ((long) i10) + ((long) bArr3.length);
                                if (size >= 0) {
                                    z2 = length2 < size;
                                }
                                C23388 c23389 = new C23388(c16484.f48416, c19365, bArr3, i10, c3942.f8572, size, (int) Math.min(length2, 2147483647L), (!z2 || length2 <= 2147483647L) ? z2 : false);
                                c19562.close();
                                return c23389;
                            } catch (Throwable th7) {
                                c19561 = c19562;
                                th2 = th7;
                                inputStream = inputStreamM44448;
                                try {
                                    inputStream.close();
                                    throw th2;
                                } catch (Throwable th8) {
                                    th2.addSuppressed(th8);
                                    throw th2;
                                }
                            }
                        } catch (EOFException unused2) {
                            c19561 = c19562;
                            try {
                                String str5 = c16484.f48416;
                                byte[] bArr4 = new byte[0];
                                int i11 = c3942.f8569;
                                inputStream = inputStreamM44448;
                                try {
                                    C23388 c233810 = new C23388(str5, c19365, bArr4, i11, c3942.f8572, size, i11, false);
                                    inputStream.close();
                                    c19561.close();
                                    return c233810;
                                } catch (Throwable th9) {
                                    th = th9;
                                    th2 = th;
                                    inputStream.close();
                                    throw th2;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                inputStream = inputStreamM44448;
                            }
                        }
                    } else {
                        throw C5276.m11410("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
                    }
                } catch (Throwable th11) {
                    th = th11;
                    th = th;
                    c19561.close();
                    throw th;
                }
            } catch (Throwable th12) {
                th = th12;
                c19561 = c19562;
            }
        } catch (C5276 e) {
            throw e;
        } catch (Exception e2) {
            throw C5276.m11410("ENTRY_READ_FAILED", e2.getMessage() == null ? "Failed to read entry" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23388 m5182(String str, C3942 c3942, byte[] bArr) {
        C19365 c19365 = c3942.f8564;
        int i = c3942.f8569;
        if (i >= bArr.length) {
            return new C23388(str, c19365, new byte[0], i, c3942.f8572, bArr.length, i, false);
        }
        int iMin = Math.min(c3942.f8572, bArr.length - i);
        int i2 = c3942.f8569;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i2 + iMin);
        int i3 = c3942.f8569;
        int i4 = i3 + iMin;
        return new C23388(str, c19365, bArrCopyOfRange, i3, c3942.f8572, bArr.length, i4, i4 < bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d7, code lost:
    
        if (p067l.C1404.f82149 < 0) goto L18;
     */
    /* JADX WARN: Type inference failed for: r2v62, types: [bin.mt.json.JSONArray, bin.mt.json.JSONObject, bin.mt.json.JSONValue, java.lang.String] */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C19167 m5181(C16484 c16484, String str, C19365 c19365, C17502 c17502) throws C5276 {
        String str2;
        C21843 c21843;
        String str3;
        String str4;
        String str5;
        String str6;
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        int iM55682;
        int i5;
        int i6;
        String str7;
        Iterator it;
        int iM55979;
        int i7;
        int iM559710;
        int i8;
        int i9;
        int i10;
        C21843 c21844;
        C16484 c16485 = c16484;
        int i11 = 1010127802;
        int i12 = C1012.f81938;
        int i13 = C0967.f81910;
        int iM559711 = C0946.m55979("ܺ֨") ^ i12;
        int i14 = ((iM559711 ^ i13) * (-20653)) ^ 202929631;
        int i15 = iM559711 ^ 925310815;
        C21843 c21845 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i16 = 0;
        char c = 0;
        short s = 0;
        int i17 = 0;
        String str8 = null;
        int i18 = 0;
        String str9 = null;
        C17384 c17384 = null;
        int i19 = 0;
        String str10 = null;
        C21843 c21846 = null;
        C21843 c21847 = null;
        Iterator it2 = null;
        String str11 = null;
        String str12 = null;
        C21843 c21843M12803 = null;
        String strM23607 = null;
        short[] sArr3 = null;
        while (true) {
            i11 = i15 ^ ((((i11 ^ i13) * 24425) >> 31) & i14);
            switch (i11) {
                case -2133439706:
                case 1626900782:
                    C1053.m56327();
                    break;
                case -2110545447:
                case -206192624:
                    i16 = i16;
                    c21846 = c21846;
                    str11 = str11;
                    str9 = str9;
                    str8 = str8;
                    sArr2 = sArr2;
                    str10 = str10;
                    i18 = i18;
                    if (C0947.f81895) {
                        iM559710 = (C0946.m55979("ۛ᩵") ^ i12) * (-117);
                        i8 = ((iM559710 ^ i13) * (-7767)) ^ 54338589;
                        i9 = -162521792;
                    } else {
                        iM559710 = (C0946.m55979("ᩳۖ") ^ i12) * 85;
                        i8 = ((iM559710 ^ i13) * 32757) ^ (-235809186);
                        i9 = -889845316;
                    }
                    int i20 = iM559710 ^ i9;
                    str8 = str8;
                    sArr2 = sArr2;
                    i18 = i18;
                    str10 = str10;
                    str11 = str11;
                    c21846 = c21846;
                    i15 = i20;
                    str9 = str9;
                    i14 = i8;
                    i16 = i16;
                    c16485 = c16484;
                    break;
                case -1944077186:
                case 658202328:
                    i16 = i16;
                    String str13 = str11;
                    c21845 = c21845;
                    strM23607 = C10127.m23607(c17384.m39578(c16485, str, str10, c17502));
                    c21843M12803 = C5749.m12802(str10, strM23607).m12803(c19365.f57812);
                    if (c21843M12803 != null) {
                        int iM55683 = C0873.m55680("᩷ۛ") ^ i12;
                        i15 = iM55683 ^ (-1591131644);
                        i14 = ((iM55683 ^ i13) * 14469) ^ 916341110;
                    } else {
                        int iM55684 = C0873.m55680("᩻۬") ^ i12;
                        i14 = ((iM55684 ^ i13) * (-1863)) ^ (-883765391);
                        i15 = iM55684 ^ (-1517582971);
                    }
                    str11 = str13;
                    i16 = i16;
                    break;
                case -1915484175:
                case -148529424:
                    return c17384.m39599(c16485, str, str9);
                case -1811732202:
                case 85137699:
                    String strM23608 = C10127.m23607(c17384.m39578(c16485, str, str10, c17502));
                    C5749 c5749M12802 = C5749.m12802(str10, strM23608);
                    str7 = c19365.f57811;
                    Iterator itM56090 = C0989.m56090(c5749M12802.f14099);
                    str12 = strM23608;
                    it = itM56090;
                    int iM55685 = (i13 - C0873.m55680("ۤۜ")) * (-47);
                    i16 = i16;
                    i15 = iM55685 ^ 791340227;
                    str11 = str7;
                    it2 = it;
                    i14 = ((iM55685 ^ i12) * (-26023)) ^ 1568841876;
                    i16 = i16;
                    break;
                case -1804914186:
                case -225334218:
                    throw C19553.m44406(c16485.f48416, str, str10);
                case -1661986333:
                case 467696579:
                    i16 = i16;
                    C21843 c21848 = c21846;
                    String str14 = str11;
                    String str15 = str8;
                    if (C0906.m55806(C0882.m55717(f81844, 30, 16, i19), str15)) {
                        iM55681 = (i12 - C0946.m55979("ۤۙ")) * (-95);
                        i3 = ((iM55681 ^ i13) * 27605) ^ 497460021;
                        i4 = -352803509;
                    } else {
                        iM55681 = C0873.m55680("ۚ۬") ^ i13;
                        i3 = ((iM55681 ^ i12) * 1779) ^ (-2027279770);
                        i4 = 1803258488;
                    }
                    int i21 = iM55681 ^ i4;
                    str8 = str15;
                    str11 = str14;
                    c21846 = c21848;
                    i15 = i21;
                    i14 = i3;
                    i16 = i16;
                    break;
                case -1513702187:
                case -1434345716:
                    int i22 = c21847.f68735;
                    str2 = str11;
                    String strM23606 = C10127.m23606(i22, c21847.f68738, str12);
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0873.m55680("᩷ۘ") ^ i12;
                        i14 = ((iM55979 ^ i13) * 20281) ^ (-2033874275);
                        i7 = 901851983;
                        i15 = iM55979 ^ i7;
                        str11 = str2;
                    } else {
                        Integer numM56129 = C1003.m56129(i22 - 1);
                        if (C1229.f82066 < 0) {
                            return new C19167(strM23606, C0873.m55689(f81844, 109, 11, i19), false, null, numM56129);
                        }
                        iM55682 = (C0946.m55979("۟֫") ^ i12) * 5;
                        i5 = ((iM55682 ^ i13) * (-17987)) ^ 537405891;
                        i6 = 1937724256;
                        int i23 = iM55682 ^ i6;
                        str8 = str8;
                        i14 = i5;
                        str11 = str2;
                        c21846 = c21846;
                        i15 = i23;
                        i16 = i16;
                    }
                    break;
                case -1409344439:
                case 930070947:
                    int i24 = i16;
                    C21843 c21849 = c21846;
                    String str16 = str11;
                    String str17 = str9;
                    String str18 = str8;
                    String str19 = str10;
                    short[] sArr4 = sArr2;
                    int i25 = i18;
                    boolean zM55949 = ViewOnClickListenerC0939.m55949(C0877.m55707(sArr4, i25, 10, i19), str18);
                    C17384 c17385 = this.f5563;
                    if (zM55949) {
                        int iM559712 = (C0946.m55979("ۢᩳ") ^ i12) * (-49);
                        sArr2 = sArr4;
                        i18 = i25;
                        str10 = str19;
                        c17384 = c17385;
                        str11 = str16;
                        c21846 = c21849;
                        str9 = str17;
                        i15 = iM559712 ^ (-1607679321);
                        str8 = str18;
                        i16 = i24;
                        i14 = ((iM559712 ^ i13) * (-14035)) ^ 88589958;
                        c16485 = c16484;
                    } else {
                        int iM559713 = (C0946.m55979("ۜ᩶") + i12) * (-71);
                        int i26 = ((iM559713 ^ i13) * (-20891)) ^ (-1825942256);
                        sArr2 = sArr4;
                        i18 = i25;
                        str10 = str19;
                        c17384 = c17385;
                        str11 = str16;
                        c21846 = c21849;
                        i15 = iM559713 ^ 1964581560;
                        str9 = str17;
                        str8 = str18;
                        i16 = i24;
                        c16485 = c16484;
                        i14 = i26;
                    }
                    break;
                case -1323679716:
                case 838439739:
                    RunnableC0938.m55938();
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        str2 = str11;
                        iM55682 = (C0946.m55979("۟֫") ^ i12) * 5;
                        i5 = ((iM55682 ^ i13) * (-17987)) ^ 537405891;
                        i6 = 1937724256;
                        int i27 = iM55682 ^ i6;
                        str8 = str8;
                        i14 = i5;
                        str11 = str2;
                        c21846 = c21846;
                        i15 = i27;
                        i16 = i16;
                    } else {
                        i16 = i16;
                        c21846 = c21846;
                        str11 = str11;
                        str9 = str9;
                        str8 = str8;
                        sArr2 = sArr2;
                        str10 = str10;
                        i18 = i18;
                        iM559710 = (C0946.m55979("ۛ᩵") ^ i12) * (-117);
                        i8 = ((iM559710 ^ i13) * (-7767)) ^ 54338589;
                        i9 = -162521792;
                        int i28 = iM559710 ^ i9;
                        str8 = str8;
                        sArr2 = sArr2;
                        i18 = i18;
                        str10 = str10;
                        str11 = str11;
                        c21846 = c21846;
                        i15 = i28;
                        str9 = str9;
                        i14 = i8;
                        i16 = i16;
                        c16485 = c16484;
                    }
                    break;
                case -1256886556:
                case -396157087:
                    i16 = i16;
                    c21846 = c21846;
                    str11 = str11;
                    str9 = str9;
                    str8 = str8;
                    sArr2 = sArr2;
                    str10 = str10;
                    i18 = i18;
                    if (i17 - (39998 * s) < 0) {
                        iM559710 = C0946.m55979("ܽۧ") ^ i12;
                        i8 = ((iM559710 ^ i13) * 18483) ^ 1644648488;
                        i9 = 153865654;
                    } else {
                        iM559710 = (i13 - C0873.m55680("ۗۖ")) * (-117);
                        i8 = ((iM559710 ^ i12) * 20861) ^ 334513209;
                        i9 = 1171436028;
                    }
                    int i29 = iM559710 ^ i9;
                    str8 = str8;
                    sArr2 = sArr2;
                    i18 = i18;
                    str10 = str10;
                    str11 = str11;
                    c21846 = c21846;
                    i15 = i29;
                    str9 = str9;
                    i14 = i8;
                    i16 = i16;
                    c16485 = c16484;
                    break;
                case -1204971657:
                case -1195152091:
                    if (ServiceConnectionC1013.m56157() > 0) {
                        str2 = str11;
                        iM55979 = C0873.m55680("᩷ۘ") ^ i12;
                        i14 = ((iM55979 ^ i13) * 20281) ^ (-2033874275);
                        i7 = 901851983;
                        i15 = iM55979 ^ i7;
                        str11 = str2;
                    }
                    str2 = str11;
                    iM55979 = C0873.m55680("᩷ܳ") ^ i13;
                    i14 = ((iM55979 ^ i12) * 29739) ^ (-891261174);
                    i7 = -520454117;
                    i15 = iM55979 ^ i7;
                    str11 = str2;
                    break;
                case -1136692780:
                case -1007780034:
                    i19 = 19559;
                    iM559710 = C0873.m55680("ۘ֨") ^ i13;
                    i8 = ((iM559710 ^ i12) * 26595) ^ (-1739151806);
                    i9 = 1510708670;
                    int i210 = iM559710 ^ i9;
                    str8 = str8;
                    sArr2 = sArr2;
                    i18 = i18;
                    str10 = str10;
                    str11 = str11;
                    c21846 = c21846;
                    i15 = i210;
                    str9 = str9;
                    i14 = i8;
                    i16 = i16;
                    c16485 = c16484;
                    break;
                case -1116387729:
                case 818935205:
                    i16 = i16;
                    c21846 = c21846;
                    str11 = str11;
                    str9 = str9;
                    str8 = str8;
                    sArr2 = sArr2;
                    str10 = str10;
                    i18 = i18;
                    s = sArr[c];
                    i17 = (s * s) + 399960001;
                    if (RunnableC0897.f81856) {
                        iM559710 = C0873.m55680("֫᩷") ^ i12;
                        i8 = ((iM559710 ^ i13) * (-27573)) ^ (-1433789451);
                        i9 = 1568116325;
                    } else {
                        iM559710 = C0946.m55979("ۜ᩺") ^ i13;
                        i8 = ((iM559710 ^ i12) * (-19309)) ^ (-1953739390);
                        i9 = -1240411924;
                    }
                    int i211 = iM559710 ^ i9;
                    str8 = str8;
                    sArr2 = sArr2;
                    i18 = i18;
                    str10 = str10;
                    str11 = str11;
                    c21846 = c21846;
                    i15 = i211;
                    str9 = str9;
                    i14 = i8;
                    i16 = i16;
                    c16485 = c16484;
                    break;
                case -1078009048:
                case 1419410066:
                    str2 = str11;
                    if (!ViewOnClickListenerC0939.m55949(C0927.m55863(sArr3, i16, 5, i19), c21846.f68740)) {
                        it = it2;
                        str7 = str2;
                        int iM55686 = (i13 - C0873.m55680("ۤۜ")) * (-47);
                        i16 = i16;
                        i15 = iM55686 ^ 791340227;
                        str11 = str7;
                        it2 = it;
                        i14 = ((iM55686 ^ i12) * (-26023)) ^ 1568841876;
                        i16 = i16;
                    } else {
                        iM55979 = C0946.m55979("ܰۨ") ^ i13;
                        i14 = ((iM55979 ^ i12) * (-6263)) ^ 1474981498;
                        i7 = -118173314;
                        i15 = iM55979 ^ i7;
                        str11 = str2;
                    }
                    break;
                case -1036205519:
                case 1808189563:
                    i19 = 11387;
                    iM559710 = C0873.m55680("ۘ֨") ^ i13;
                    i8 = ((iM559710 ^ i12) * 26595) ^ (-1739151806);
                    i9 = 1510708670;
                    int i212 = iM559710 ^ i9;
                    str8 = str8;
                    sArr2 = sArr2;
                    i18 = i18;
                    str10 = str10;
                    str11 = str11;
                    c21846 = c21846;
                    i15 = i212;
                    str9 = str9;
                    i14 = i8;
                    i16 = i16;
                    c16485 = c16484;
                    break;
                case -1031617018:
                case 339616360:
                    str2 = str11;
                    int i30 = c21843M12803.f68735;
                    String strM23609 = C10127.m23606(i30, c21843M12803.f68738, strM23607);
                    if (C0854.f81826 == 0) {
                        Integer numM561210 = C1003.m56129(i30 - 1);
                        if (C0877.f81843 < 0) {
                            return new C19167(strM23609, C0947.m55993(f81844, 93, 11, i19), false, null, numM561210);
                        }
                        iM55979 = C0873.m55680("᩷ܳ") ^ i13;
                        i14 = ((iM55979 ^ i12) * 29739) ^ (-891261174);
                        i7 = -520454117;
                        i15 = iM55979 ^ i7;
                        str11 = str2;
                    } else {
                        i10 = i16;
                        c21844 = c21846;
                        int iM559714 = (C0946.m55979("ۧۧ") ^ i13) * 57;
                        i14 = ((iM559714 ^ i12) * 8863) ^ 1362519395;
                        str11 = str2;
                        i16 = i10;
                        c21846 = c21844;
                        i15 = iM559714 ^ 644943663;
                        c16485 = c16484;
                    }
                    break;
                case -990894926:
                case -522217090:
                    i16 = i16;
                    str2 = str11;
                    c21846 = c21846;
                    str8 = str8;
                    c21845 = null;
                    if (C0906.m55806(C0845.m55592(f81844, 57, 15, i19), str8)) {
                        iM55682 = C0946.m55979("᩷ᩴ") ^ i13;
                        i5 = ((iM55682 ^ i12) * (-5889)) ^ 158505834;
                        i6 = 530886559;
                    } else {
                        iM55682 = (i13 - C0873.m55680("ۨۨ")) * (-75);
                        i5 = ((iM55682 ^ i12) * 20677) ^ 1276209752;
                        i6 = -978637513;
                    }
                    int i213 = iM55682 ^ i6;
                    str8 = str8;
                    i14 = i5;
                    str11 = str2;
                    c21846 = c21846;
                    i15 = i213;
                    i16 = i16;
                    break;
                case -874972602:
                case 563450233:
                    C0861.m55626();
                    RunnableC0871.m55672();
                    return null;
                case -874253062:
                case 61064346:
                    if (C0892.f81851) {
                        i10 = i16;
                        c21844 = c21846;
                        str2 = str11;
                        int iM559715 = (C0946.m55979("ۧۧ") ^ i13) * 57;
                        i14 = ((iM559715 ^ i12) * 8863) ^ 1362519395;
                        str11 = str2;
                        i16 = i10;
                        c21846 = c21844;
                        i15 = iM559715 ^ 644943663;
                        c16485 = c16484;
                    } else {
                        int iM55687 = C0873.m55680("۬᩸") ^ i13;
                        i14 = ((iM55687 ^ i12) * 7689) ^ (-548245598);
                        i15 = iM55687 ^ 864661039;
                    }
                    break;
                case -844871428:
                case -777026502:
                    i10 = i16;
                    c21844 = c21846;
                    str2 = str11;
                    String str20 = c19365.f57813;
                    String str21 = c19365.f57809;
                    str10 = c19365.f57808;
                    sArr2 = f81844;
                    i18 = 1;
                    if (C1053.f81965 <= 0) {
                        str8 = str20;
                        str9 = str21;
                        int iM559716 = (C0946.m55979("ۧۧ") ^ i13) * 57;
                        i14 = ((iM559716 ^ i12) * 8863) ^ 1362519395;
                        str11 = str2;
                        i16 = i10;
                        c21846 = c21844;
                        i15 = iM559716 ^ 644943663;
                        c16485 = c16484;
                    } else {
                        int iM55688 = C0873.m55680("ۧܽ") ^ i13;
                        i14 = ((iM55688 ^ i12) * 15369) ^ 438093168;
                        str8 = str20;
                        str9 = str21;
                        str11 = str2;
                        i16 = i10;
                        c21846 = c21844;
                        c16485 = c16484;
                        i15 = iM55688 ^ (-1127492415);
                    }
                    break;
                case -749657261:
                case 1045375607:
                    ?? r2 = c21845;
                    throw C5276.m11406(C1036.m56252(f81844, 72, 21, i19), (String) r2, (JSONValue) r2, (JSONArray) r2, (JSONObject) r2);
                case -741955683:
                case -423058568:
                    i16 = i16;
                    c21843 = c21846;
                    str3 = str11;
                    str4 = str9;
                    str5 = str8;
                    str6 = str10;
                    if (ViewOnClickListenerC0939.m55949(C1046.m56293(f81844, 15, 15, i19), str5)) {
                        iM55680 = (C0946.m55979("۟ۖ") + i12) * (-83);
                        i = ((iM55680 ^ i13) * 5553) ^ 120568214;
                        i2 = 619539946;
                    } else {
                        iM55680 = (C0873.m55680("ᩴ᩻") + i13) * 89;
                        i = ((iM55680 ^ i12) * 13115) ^ 540886185;
                        i2 = 295693248;
                    }
                    int i31 = iM55680 ^ i2;
                    str8 = str5;
                    i14 = i;
                    str10 = str6;
                    str11 = str3;
                    c21846 = c21843;
                    str9 = str4;
                    i15 = i31;
                    i16 = i16;
                    break;
                case -641643748:
                case 16178058:
                    str2 = str11;
                    c21846 = (C21843) C0955.m56035(it2);
                    sArr3 = f81844;
                    i16 = IShizukuService.Stub.TRANSACTION_isHidden;
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0873.m55680("᩷ۘ") ^ i12;
                        i14 = ((iM55979 ^ i13) * 20281) ^ (-2033874275);
                        i7 = 901851983;
                    } else {
                        iM55979 = (i13 - C0873.m55680("ۘ᩺")) * 101;
                        i14 = ((iM55979 ^ i12) * (-22123)) ^ 1231658432;
                        i7 = 1128176040;
                    }
                    i15 = iM55979 ^ i7;
                    str11 = str2;
                    break;
                case -365589829:
                case 1409097610:
                    i16 = i16;
                    c21846 = c21846;
                    str11 = str11;
                    str9 = str9;
                    str8 = str8;
                    sArr2 = sArr2;
                    str10 = str10;
                    i18 = i18;
                    sArr = f81844;
                    c = 0;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM559710 = C0873.m55680("ᩴܺ") ^ i12;
                        i8 = ((iM559710 ^ i13) * 6701) ^ (-1930803630);
                        i9 = -1229675276;
                    } else {
                        iM559710 = C0873.m55680("᩻ۙ") ^ i13;
                        i8 = ((iM559710 ^ i12) * (-29181)) ^ 927868300;
                        i9 = 919778693;
                    }
                    int i214 = iM559710 ^ i9;
                    str8 = str8;
                    sArr2 = sArr2;
                    i18 = i18;
                    str10 = str10;
                    str11 = str11;
                    c21846 = c21846;
                    i15 = i214;
                    str9 = str9;
                    i14 = i8;
                    i16 = i16;
                    c16485 = c16484;
                    break;
                case -143549705:
                case -128988956:
                    return c17384.m39589(c16485, str, str9);
                case -98970380:
                case -12100105:
                    if (ServiceConnectionC1013.f81940 < 0) {
                        i16 = i16;
                        c21846 = c21846;
                        str11 = str11;
                        str9 = str9;
                        str8 = str8;
                        sArr2 = sArr2;
                        str10 = str10;
                        i18 = i18;
                        iM559710 = C0946.m55979("ۜ᩺") ^ i13;
                        i8 = ((iM559710 ^ i12) * (-19309)) ^ (-1953739390);
                        i9 = -1240411924;
                        int i215 = iM559710 ^ i9;
                        str8 = str8;
                        sArr2 = sArr2;
                        i18 = i18;
                        str10 = str10;
                        str11 = str11;
                        c21846 = c21846;
                        i15 = i215;
                        str9 = str9;
                        i14 = i8;
                        i16 = i16;
                        c16485 = c16484;
                    }
                    i16 = i16;
                    c21846 = c21846;
                    str11 = str11;
                    str9 = str9;
                    str8 = str8;
                    sArr2 = sArr2;
                    str10 = str10;
                    i18 = i18;
                    iM559710 = (C0946.m55979("ۛ᩵") ^ i12) * (-117);
                    i8 = ((iM559710 ^ i13) * (-7767)) ^ 54338589;
                    i9 = -162521792;
                    int i216 = iM559710 ^ i9;
                    str8 = str8;
                    sArr2 = sArr2;
                    i18 = i18;
                    str10 = str10;
                    str11 = str11;
                    c21846 = c21846;
                    i15 = i216;
                    str9 = str9;
                    i14 = i8;
                    i16 = i16;
                    c16485 = c16484;
                    break;
                case 148992351:
                case 1942836831:
                    str2 = str11;
                    if (C0866.m55647(it2)) {
                        iM55979 = C0873.m55680("ۢܽ") ^ i12;
                        i14 = ((iM55979 ^ i13) * 26785) ^ (-730887983);
                        i7 = -1243456455;
                    } else {
                        c21847 = c21845;
                        iM55979 = (i13 - C0873.m55680("᩶ܽ")) * 69;
                        i14 = ((iM55979 ^ i12) * (-6519)) ^ (-1752810734);
                        i7 = -53331524;
                    }
                    i15 = iM55979 ^ i7;
                    str11 = str2;
                    break;
                case 278717820:
                case 1765889800:
                    throw C19553.m44413(c16485.f48416, str, str10);
                case 743632482:
                case 1035270054:
                    if (C0866.f81837 < 0) {
                        str2 = str11;
                        iM55979 = C0873.m55680("᩷ܳ") ^ i13;
                        i14 = ((iM55979 ^ i12) * 29739) ^ (-891261174);
                        i7 = -520454117;
                        i15 = iM55979 ^ i7;
                        str11 = str2;
                    } else {
                        i16 = i16;
                        c21846 = c21846;
                        str11 = str11;
                        str9 = str9;
                        str8 = str8;
                        sArr2 = sArr2;
                        str10 = str10;
                        i18 = i18;
                        iM559710 = (C0946.m55979("ۛ᩵") ^ i12) * (-117);
                        i8 = ((iM559710 ^ i13) * (-7767)) ^ 54338589;
                        i9 = -162521792;
                        int i217 = iM559710 ^ i9;
                        str8 = str8;
                        sArr2 = sArr2;
                        i18 = i18;
                        str10 = str10;
                        str11 = str11;
                        c21846 = c21846;
                        i15 = i217;
                        str9 = str9;
                        i14 = i8;
                        i16 = i16;
                        c16485 = c16484;
                    }
                    break;
                case 895120888:
                case 1861371577:
                    str2 = str11;
                    String strM236010 = C10127.m23607(c17384.m39578(c16485, str, str10, c17502));
                    short[] sArr5 = f81844;
                    if (!C1024.f81946) {
                        return new C19167(strM236010, C0906.m55810(sArr5, 46, 11, i19), false, null, null);
                    }
                    iM55682 = (C0946.m55979("۟֫") ^ i12) * 5;
                    i5 = ((iM55682 ^ i13) * (-17987)) ^ 537405891;
                    i6 = 1937724256;
                    int i218 = iM55682 ^ i6;
                    str8 = str8;
                    i14 = i5;
                    str11 = str2;
                    c21846 = c21846;
                    i15 = i218;
                    i16 = i16;
                    break;
                case 1326680030:
                case 1582877437:
                    str2 = str11;
                    if (c21847 != null) {
                        iM55979 = C0873.m55680("ܽ֨") ^ i12;
                        i14 = ((iM55979 ^ i13) * 1585) ^ 767583774;
                        i7 = 529867311;
                    } else {
                        iM55979 = (i12 - C0946.m55979("ۚ᩶")) * (-11);
                        i14 = ((iM55979 ^ i13) * 14185) ^ 543283944;
                        i7 = -1404999350;
                    }
                    i15 = iM55979 ^ i7;
                    str11 = str2;
                    break;
                case 1359987065:
                case 1801286611:
                    C1036.m56257();
                    C1003.m56123();
                    i16 = i16;
                    c21846 = c21846;
                    str11 = str11;
                    str9 = str9;
                    str8 = str8;
                    sArr2 = sArr2;
                    str10 = str10;
                    i18 = i18;
                    iM559710 = (C0946.m55979("ۛ᩵") ^ i12) * (-117);
                    i8 = ((iM559710 ^ i13) * (-7767)) ^ 54338589;
                    i9 = -162521792;
                    int i219 = iM559710 ^ i9;
                    str8 = str8;
                    sArr2 = sArr2;
                    i18 = i18;
                    str10 = str10;
                    str11 = str11;
                    c21846 = c21846;
                    i15 = i219;
                    str9 = str9;
                    i14 = i8;
                    i16 = i16;
                    c16485 = c16484;
                    break;
                case 1934687378:
                case 1953298444:
                    if (!ViewOnClickListenerC0939.m55949(str11, c21846.f68741)) {
                        it = it2;
                        str7 = str11;
                        int iM55689 = (i13 - C0873.m55680("ۤۜ")) * (-47);
                        i16 = i16;
                        i15 = iM55689 ^ 791340227;
                        str11 = str7;
                        it2 = it;
                        i14 = ((iM55689 ^ i12) * (-26023)) ^ 1568841876;
                        i16 = i16;
                    } else {
                        c21847 = c21846;
                        str2 = str11;
                        iM55979 = (i13 - C0873.m55680("᩶ܽ")) * 69;
                        i14 = ((iM55979 ^ i12) * (-6519)) ^ (-1752810734);
                        i7 = -53331524;
                        i15 = iM55979 ^ i7;
                        str11 = str2;
                    }
                    break;
                default:
                    i16 = i16;
                    c21843 = c21846;
                    str3 = str11;
                    str4 = str9;
                    str5 = str8;
                    str6 = str10;
                    if (C0906.m55806(C0967.m56077(f81844, 11, 4, i19), str5)) {
                        iM55680 = C0873.m55680("ܶ᩷") ^ i12;
                        i = ((iM55680 ^ i13) * (-22529)) ^ 305319056;
                        i2 = 1113930718;
                    } else {
                        iM55680 = (i13 - C0873.m55680("ۤܽ")) * (-15);
                        i = ((iM55680 ^ i12) * 17759) ^ (-497737768);
                        i2 = 44274774;
                    }
                    int i32 = iM55680 ^ i2;
                    str8 = str5;
                    i14 = i;
                    str10 = str6;
                    str11 = str3;
                    c21846 = c21843;
                    str9 = str4;
                    i15 = i32;
                    i16 = i16;
                    break;
            }
        }
    }
}
