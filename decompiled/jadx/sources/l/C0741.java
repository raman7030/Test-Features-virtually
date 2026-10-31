package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
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
public final class C0741 {

    /* JADX INFO: renamed from: ᩷ۗ᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f2789 = {5974, 11294, 11285, 11279, 11273, 11266, 11300, 11279, 11294, 11267, 11279, 11290, 11267, 11286, 11287, 11295, 11294, 11267, 11300, 11288, 11287, 11290, 11272, 11272, 11300, 11272, 11286, 11290, 11287, 11282, 11295, 11294, 11267, 11300, 11286, 11294, 11279, 11283, 11284, 11295, 11300, 11272, 11286, 11290, 11287, 11282, 11288, 11287, 11290, 11272, 11272, 11300, 11272, 11286, 11290, 11287, 11282, 11295, 11294, 11267, 11300, 11293, 11282, 11294, 11287, 11295, 11300, 11272, 11286, 11290, 11287, 11282, 11310, 11285, 11272, 11278, 11275, 11275, 11284, 11273, 11279, 11294, 11295, 11355, 11273, 11294, 11290, 11295, 11355, 11280, 11282, 11285, 11295, 11288, 11287, 11290, 11272, 11272, 11300, 11272, 11286, 11290, 11287, 11282, 11293, 11282, 11294, 11287, 11295, 11288, 11287, 11290, 11272, 11272, 11300, 11272, 11286, 11290, 11287, 11282};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15799 f2790;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10247 f2791;

    public C0741(C15799 c15799, C10247 c10247) {
        this.f2790 = c15799;
        this.f2791 = c10247;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11243 m2857(C14852 c14852, C1656 c1656) throws C3059 {
        String str = c1656.f5782;
        C17884 c17884 = c1656.f5784;
        C9042 c9042M25979 = this.f2791.m25979(c14852, this.f2790, str);
        String str2 = c14852.f45300;
        try {
            if (c9042M25979.m23336(c17884.f54613, m2851(c14852, str)) == null) {
                throw C18081.m42153(str2, str);
            }
            c9042M25979.m23338();
            return new C11243(1);
        } catch (C3059 e) {
            if (C15799.m37396(str)) {
                C10247.m25972(c14852, e);
            }
            if (!"INVALID_ARGUMENT".equals(e.f9610)) {
                throw e;
            }
            JSONObject jSONObject = e.f9609;
            if (!"variant".equals(jSONObject.getString("argument", null)) || jSONObject.getJSONArray("availableVariants") == null) {
                throw e;
            }
            JSONObject jSONObjectAdd = C7416.m19939("workspaceId", str2, "editSessionId", str).add("reads", JSON.array().add(JSON.object().add("locator", C13169.m31925("resource", (String) null, (String) null, (String) null, (String) null, c17884.f54613)).add("variant", "default"))).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 50).add("resolveDepth", 0);
            JSONArray jSONArray = new JSONArray(e.f9604);
            jSONArray.add(C10115.m25398(jSONObjectAdd, "mt_apk_resource_read", "retry", "Retry reading the same resource with batch resource_read arguments"));
            throw e.m9370(jSONArray);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13649 m2855(C14852 c14852, C16472 c16472) throws C3059 {
        String str;
        C16472 c16473 = c16472;
        String str2 = c16473.f50627;
        C9042 c9042M25979 = this.f2791.m25979(c14852, this.f2790, str2);
        HashSet hashSetM2851 = m2851(c14852, str2);
        ArrayList arrayList = c16473.f50632;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (i < arrayList.size()) {
            try {
                C10829 c10829 = (C10829) arrayList.get(i);
                String str3 = c10829.f32572;
                String str4 = c10829.f32572;
                int i2 = i;
                ArrayList arrayList3 = arrayList;
                str = str2;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                try {
                    C23110 c23110M23335 = c9042M25979.m23335(str3, c10829.f32573, c16473.f50629, c16473.f50630, c16473.f50628, c16473.f50631, hashSetM2851);
                    if (c23110M23335 != null) {
                        ArrayList arrayList4 = c23110M23335.f74347;
                        if (!linkedHashMap2.containsKey(str3)) {
                            linkedHashMap2.put(str3, new C16886(str3, c23110M23335.f74345));
                        }
                        if (arrayList4.isEmpty()) {
                            arrayList2.add(new C22822(i2, str4, c10829.f32573, "RESOURCE_VARIANT_NOT_FOUND", "Resource variant not found.", c23110M23335.f74346, null));
                        } else {
                            C11159 c11159 = (C11159) arrayList4.get(0);
                            arrayList2.add(new C22822(i2, str4, c11159.f33488, null, null, c23110M23335.f74346, c11159));
                        }
                    } else {
                        arrayList2.add(new C22822(i2, str4, c10829.f32573, "RESOURCE_NOT_FOUND", "Resource not found.", null, null));
                    }
                    i = i2 + 1;
                    c16473 = c16472;
                    linkedHashMap = linkedHashMap2;
                    arrayList = arrayList3;
                    str2 = str;
                } catch (C3059 e) {
                    e = e;
                    if (C15799.m37396(str)) {
                        C10247.m25972(c14852, e);
                    }
                    throw e;
                }
            } catch (C3059 e2) {
                e = e2;
                str = str2;
            }
        }
        return new C13649(c14852.f45300, c9042M25979.m23338(), new ArrayList(linkedHashMap.values()), arrayList2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private HashSet m2851(C14852 c14852, String str) {
        HashSet hashSet = new HashSet();
        Iterator it = this.f2790.m37430(c14852, str).iterator();
        while (it.hasNext()) {
            hashSet.add(((C13874) it.next()).f41355);
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9832 m2854(C14852 c14852, C1656 c1656, C15923 c15923) throws C3059 {
        String str = c1656.f5782;
        String str2 = c1656.f5790;
        C17884 c17884 = c1656.f5784;
        C17675 c17675M2852 = m2852(c14852, str, c17884, c15923);
        try {
            return new C9832(c14852.f45300, c17884, c17675M2852.f54072, C15799.m37347(c17675M2852.f54073), C8163.m21639(c17675M2852.f54073, c1656.f5783, c1656.f5791, c1656.f5793, c1656.f5785), c17675M2852.f54075, c17675M2852.f54074, c1656.f5793, c1656.f5785, c17675M2852.f54071);
        } catch (C3059 e) {
            if (!"INVALID_ARGUMENT".equals(e.f9610) || !"lineCharOffset".equals(e.f9609.getString("argument", null))) {
                throw e;
            }
            JSONValue jSONValue = c1656.f5787;
            if (str2 == null) {
                throw e;
            }
            if ("startColumn".equals(str2)) {
                throw C3059.m9364("Invalid startColumn", "startColumn", jSONValue, JSON.array(0, Integer.MAX_VALUE), JSON.object().add("startColumn", 0));
            }
            if ("nextCursor".equals(str2)) {
                throw C3059.m9364("Invalid cursor", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22117 m2856(C14852 c14852, C1656 c1656) throws Throwable {
        C18090 c18090;
        Throwable th;
        InputStream inputStream;
        Throwable th2;
        C4695 c4695M37432;
        String str = c14852.f45300;
        C17884 c17884 = c1656.f5784;
        int i = c1656.f5789;
        String str2 = c1656.f5782;
        String str3 = c17884.f54612;
        int i2 = c1656.f5792;
        if (!"entry_text".equals(c17884.f54616)) {
            throw C3059.m9364("Byte reads are valid only for zip_entry locators", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        boolean zEquals = "resources.arsc".equals(str3);
        C15799 c15799 = this.f2790;
        if (zEquals && (c4695M37432 = c15799.m37432(c14852, str2)) != null) {
            return m2853(str, c1656, c4695M37432.f14917);
        }
        C3284 c3284M37434 = c15799.m37434(c14852, str2, str3);
        boolean z = false;
        if (c3284M37434 != null) {
            String str4 = c14852.f45300;
            AbstractC15440 abstractC15440 = c3284M37434.f10327;
            long jMo23127 = abstractC15440.mo23127();
            int i3 = c1656.f5789;
            long j = i3;
            if (j >= jMo23127) {
                return new C22117(str4, c17884, new byte[0], i3, c1656.f5792, jMo23127, i3, false);
            }
            int iMin = (int) Math.min(i2, jMo23127 - j);
            byte[] bArr = new byte[iMin];
            try {
                C23411 c23411M36513 = abstractC15440.m36513("r");
                try {
                    c23411M36513.seek(i);
                    c23411M36513.m51858(bArr, 0, iMin);
                    c23411M36513.close();
                    int i4 = c1656.f5789;
                    long j2 = ((long) i4) + ((long) iMin);
                    if (j2 < jMo23127 && j2 <= 2147483647L) {
                        z = true;
                    }
                    return new C22117(str4, c17884, bArr, i4, c1656.f5792, jMo23127, (int) Math.min(j2, 2147483647L), z);
                } catch (Throwable th3) {
                    try {
                        c23411M36513.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (IOException | RuntimeException unused) {
                throw C3059.m9368("ENTRY_READ_FAILED", "Failed to read entry overlay.");
            }
        }
        C4695 c4695M37431 = c15799.m37431(c14852, str2, str3);
        if (c4695M37431 != null) {
            return m2853(str, c1656, c4695M37431.f14917);
        }
        try {
            C18090 c18091 = new C18090(c14852.m35253());
            try {
                C3545 entry = c18091.getEntry(str3);
                try {
                    if (entry == null) {
                        throw C3059.m9363("ENTRY_NOT_FOUND", "ZIP entry not found");
                    }
                    if (!entry.isDirectory()) {
                        long size = entry.getSize();
                        if (size >= 0) {
                            try {
                                int i5 = c1656.f5789;
                                if (i5 >= size) {
                                    C22117 c22117 = new C22117(c14852.f45300, c17884, new byte[0], i5, c1656.f5792, size, i5, false);
                                    c18091.close();
                                    return c22117;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c18090 = c18091;
                                try {
                                    c18090.close();
                                    throw th;
                                } catch (Throwable th6) {
                                    th.addSuppressed(th6);
                                    throw th;
                                }
                            }
                        }
                        int i6 = size >= 0 ? i2 : i2 + 1;
                        InputStream inputStreamM42189 = c18091.m42189(entry);
                        try {
                            try {
                                C22194.m49856(i, inputStreamM42189);
                                int i7 = 8192;
                                C0521 c0521 = new C0521(Math.min(i6, 8192));
                                byte[] bArr2 = new byte[8192];
                                while (i6 > 0) {
                                    int i8 = inputStreamM42189.read(bArr2, 0, Math.min(i7, i6));
                                    if (i8 == -1) {
                                        break;
                                    }
                                    c0521.write(bArr2, 0, i8);
                                    i6 -= i8;
                                    i7 = 8192;
                                }
                                byte[] bArrCopyOf = c0521.f2176;
                                int length = bArrCopyOf.length;
                                int i9 = c0521.f2177;
                                if (length != i9) {
                                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i9);
                                }
                                inputStreamM42189.close();
                                boolean z2 = size < 0 && bArrCopyOf.length > i2;
                                if (z2) {
                                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
                                }
                                byte[] bArr3 = bArrCopyOf;
                                int i10 = c1656.f5789;
                                long length2 = ((long) i10) + ((long) bArr3.length);
                                if (size >= 0) {
                                    z2 = length2 < size;
                                }
                                C22117 c22118 = new C22117(c14852.f45300, c17884, bArr3, i10, c1656.f5792, size, (int) Math.min(length2, 2147483647L), (!z2 || length2 <= 2147483647L) ? z2 : false);
                                c18091.close();
                                return c22118;
                            } catch (Throwable th7) {
                                c18090 = c18091;
                                th2 = th7;
                                inputStream = inputStreamM42189;
                                try {
                                    inputStream.close();
                                    throw th2;
                                } catch (Throwable th8) {
                                    th2.addSuppressed(th8);
                                    throw th2;
                                }
                            }
                        } catch (EOFException unused2) {
                            c18090 = c18091;
                            try {
                                String str5 = c14852.f45300;
                                byte[] bArr4 = new byte[0];
                                int i11 = c1656.f5789;
                                inputStream = inputStreamM42189;
                                try {
                                    C22117 c22119 = new C22117(str5, c17884, bArr4, i11, c1656.f5792, size, i11, false);
                                    inputStream.close();
                                    c18090.close();
                                    return c22119;
                                } catch (Throwable th9) {
                                    th = th9;
                                    th2 = th;
                                    inputStream.close();
                                    throw th2;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                inputStream = inputStreamM42189;
                            }
                        }
                    } else {
                        throw C3059.m9368("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
                    }
                } catch (Throwable th11) {
                    th = th11;
                    th = th;
                    c18090.close();
                    throw th;
                }
            } catch (Throwable th12) {
                th = th12;
                c18090 = c18091;
            }
        } catch (C3059 e) {
            throw e;
        } catch (Exception e2) {
            throw C3059.m9368("ENTRY_READ_FAILED", e2.getMessage() == null ? "Failed to read entry" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22117 m2853(String str, C1656 c1656, byte[] bArr) {
        C17884 c17884 = c1656.f5784;
        int i = c1656.f5789;
        if (i >= bArr.length) {
            return new C22117(str, c17884, new byte[0], i, c1656.f5792, bArr.length, i, false);
        }
        int iMin = Math.min(c1656.f5792, bArr.length - i);
        int i2 = c1656.f5789;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i2 + iMin);
        int i3 = c1656.f5789;
        int i4 = i3 + iMin;
        return new C22117(str, c17884, bArrCopyOfRange, i3, c1656.f5792, bArr.length, i4, i4 < bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d7, code lost:
    
        if (l.C11340.f33930 < 0) goto L18;
     */
    /* JADX WARN: Type inference failed for: r2v62, types: [bin.mt.json.JSONArray, bin.mt.json.JSONObject, bin.mt.json.JSONValue, java.lang.String] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C17675 m2852(C14852 c14852, String str, C17884 c17884, C15923 c15923) throws C3059 {
        String str2;
        C20490 c20490;
        String str3;
        String str4;
        String str5;
        String str6;
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int iM2568;
        int i5;
        int i6;
        String str7;
        Iterator it;
        int iM6981;
        int i7;
        int iM6982;
        int i8;
        int i9;
        int i10;
        C20490 c20491;
        C14852 c14853 = c14852;
        int i11 = 1010127802;
        int i12 = C3432.f10845;
        int i13 = C2520.f8000;
        int iM6983 = C2105.m6981("ܺ֨") ^ i12;
        int i14 = ((iM6983 ^ i13) * (-20653)) ^ 202929631;
        int i15 = iM6983 ^ 925310815;
        C20490 c20492 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i16 = 0;
        char c = 0;
        short s = 0;
        int i17 = 0;
        String str8 = null;
        int i18 = 0;
        String str9 = null;
        C15799 c15799 = null;
        int i19 = 0;
        String str10 = null;
        C20490 c20493 = null;
        C20490 c20494 = null;
        Iterator it2 = null;
        String str11 = null;
        String str12 = null;
        C20490 c20490M10823 = null;
        String strM21638 = null;
        short[] sArr3 = null;
        while (true) {
            i11 = i15 ^ ((((i11 ^ i13) * 24425) >> 31) & i14);
            switch (i11) {
                case -2133439706:
                case 1626900782:
                    C4263.m12819();
                    break;
                case -2110545447:
                case -206192624:
                    i16 = i16;
                    c20493 = c20493;
                    str11 = str11;
                    str9 = str9;
                    str8 = str8;
                    sArr2 = sArr2;
                    str10 = str10;
                    i18 = i18;
                    if (C2126.f7087) {
                        iM6982 = (C2105.m6981("ۛ᩵") ^ i12) * (-117);
                        i8 = ((iM6982 ^ i13) * (-7767)) ^ 54338589;
                        i9 = -162521792;
                    } else {
                        iM6982 = (C2105.m6981("ᩳۖ") ^ i12) * 85;
                        i8 = ((iM6982 ^ i13) * 32757) ^ (-235809186);
                        i9 = -889845316;
                    }
                    int i20 = iM6982 ^ i9;
                    str8 = str8;
                    sArr2 = sArr2;
                    i18 = i18;
                    str10 = str10;
                    str11 = str11;
                    c20493 = c20493;
                    i15 = i20;
                    str9 = str9;
                    i14 = i8;
                    i16 = i16;
                    c14853 = c14852;
                    break;
                case -1944077186:
                case 658202328:
                    i16 = i16;
                    String str13 = str11;
                    c20492 = c20492;
                    strM21638 = C8163.m21638(c15799.m37407(c14853, str, str10, c15923));
                    c20490M10823 = C3556.m10822(str10, strM21638).m10823(c17884.f54615);
                    if (c20490M10823 != null) {
                        int iM2569 = C0630.m2566("᩷ۛ") ^ i12;
                        i15 = iM2569 ^ (-1591131644);
                        i14 = ((iM2569 ^ i13) * 14469) ^ 916341110;
                    } else {
                        int iM25610 = C0630.m2566("᩻۬") ^ i12;
                        i14 = ((iM25610 ^ i13) * (-1863)) ^ (-883765391);
                        i15 = iM25610 ^ (-1517582971);
                    }
                    str11 = str13;
                    i16 = i16;
                    break;
                case -1915484175:
                case -148529424:
                    return c15799.m37428(c14853, str, str9);
                case -1811732202:
                case 85137699:
                    String strM21639 = C8163.m21638(c15799.m37407(c14853, str, str10, c15923));
                    C3556 c3556M10822 = C3556.m10822(str10, strM21639);
                    str7 = c17884.f54614;
                    Iterator itM9029 = C2958.m9029(c3556M10822.f11293);
                    str12 = strM21639;
                    it = itM9029;
                    int iM25611 = (i13 - C0630.m2566("ۤۜ")) * (-47);
                    i16 = i16;
                    i15 = iM25611 ^ 791340227;
                    str11 = str7;
                    it2 = it;
                    i14 = ((iM25611 ^ i12) * (-26023)) ^ 1568841876;
                    i16 = i16;
                    break;
                case -1804914186:
                case -225334218:
                    throw C18081.m42147(c14853.f45300, str, str10);
                case -1661986333:
                case 467696579:
                    i16 = i16;
                    C20490 c20495 = c20493;
                    String str14 = str11;
                    String str15 = str8;
                    if (C1294.m4369(C0798.m3005(f2789, 30, 16, i19), str15)) {
                        iM2567 = (i12 - C2105.m6981("ۤۙ")) * (-95);
                        i3 = ((iM2567 ^ i13) * 27605) ^ 497460021;
                        i4 = -352803509;
                    } else {
                        iM2567 = C0630.m2566("ۚ۬") ^ i13;
                        i3 = ((iM2567 ^ i12) * 1779) ^ (-2027279770);
                        i4 = 1803258488;
                    }
                    int i21 = iM2567 ^ i4;
                    str8 = str15;
                    str11 = str14;
                    c20493 = c20495;
                    i15 = i21;
                    i14 = i3;
                    i16 = i16;
                    break;
                case -1513702187:
                case -1434345716:
                    int i22 = c20494.f66056;
                    str2 = str11;
                    String strM21637 = C8163.m21637(i22, c20494.f66059, str12);
                    if (C3245.f10203 <= 0) {
                        iM6981 = C0630.m2566("᩷ۘ") ^ i12;
                        i14 = ((iM6981 ^ i13) * 20281) ^ (-2033874275);
                        i7 = 901851983;
                        i15 = iM6981 ^ i7;
                        str11 = str2;
                    } else {
                        Integer numM9931 = C3245.m9931(i22 - 1);
                        if (C7811.f24123 < 0) {
                            return new C17675(strM21637, C0630.m2575(f2789, 109, 11, i19), false, null, numM9931);
                        }
                        iM2568 = (C2105.m6981("۟֫") ^ i12) * 5;
                        i5 = ((iM2568 ^ i13) * (-17987)) ^ 537405891;
                        i6 = 1937724256;
                        int i23 = iM2568 ^ i6;
                        str8 = str8;
                        i14 = i5;
                        str11 = str2;
                        c20493 = c20493;
                        i15 = i23;
                        i16 = i16;
                    }
                    break;
                case -1409344439:
                case 930070947:
                    int i24 = i16;
                    C20490 c20496 = c20493;
                    String str16 = str11;
                    String str17 = str9;
                    String str18 = str8;
                    String str19 = str10;
                    short[] sArr4 = sArr2;
                    int i25 = i18;
                    boolean zM6437 = ViewOnClickListenerC1958.m6437(C0714.m2816(sArr4, i25, 10, i19), str18);
                    C15799 c157910 = this.f2790;
                    if (zM6437) {
                        int iM6984 = (C2105.m6981("ۢᩳ") ^ i12) * (-49);
                        sArr2 = sArr4;
                        i18 = i25;
                        str10 = str19;
                        c15799 = c157910;
                        str11 = str16;
                        c20493 = c20496;
                        str9 = str17;
                        i15 = iM6984 ^ (-1607679321);
                        str8 = str18;
                        i16 = i24;
                        i14 = ((iM6984 ^ i13) * (-14035)) ^ 88589958;
                        c14853 = c14852;
                    } else {
                        int iM6985 = (C2105.m6981("ۜ᩶") + i12) * (-71);
                        int i26 = ((iM6985 ^ i13) * (-20891)) ^ (-1825942256);
                        sArr2 = sArr4;
                        i18 = i25;
                        str10 = str19;
                        c15799 = c157910;
                        str11 = str16;
                        c20493 = c20496;
                        i15 = iM6985 ^ 1964581560;
                        str9 = str17;
                        str8 = str18;
                        i16 = i24;
                        c14853 = c14852;
                        i14 = i26;
                    }
                    break;
                case -1323679716:
                case 838439739:
                    RunnableC1937.m6387();
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        str2 = str11;
                        iM2568 = (C2105.m6981("۟֫") ^ i12) * 5;
                        i5 = ((iM2568 ^ i13) * (-17987)) ^ 537405891;
                        i6 = 1937724256;
                        int i27 = iM2568 ^ i6;
                        str8 = str8;
                        i14 = i5;
                        str11 = str2;
                        c20493 = c20493;
                        i15 = i27;
                        i16 = i16;
                    } else {
                        i16 = i16;
                        c20493 = c20493;
                        str11 = str11;
                        str9 = str9;
                        str8 = str8;
                        sArr2 = sArr2;
                        str10 = str10;
                        i18 = i18;
                        iM6982 = (C2105.m6981("ۛ᩵") ^ i12) * (-117);
                        i8 = ((iM6982 ^ i13) * (-7767)) ^ 54338589;
                        i9 = -162521792;
                        int i28 = iM6982 ^ i9;
                        str8 = str8;
                        sArr2 = sArr2;
                        i18 = i18;
                        str10 = str10;
                        str11 = str11;
                        c20493 = c20493;
                        i15 = i28;
                        str9 = str9;
                        i14 = i8;
                        i16 = i16;
                        c14853 = c14852;
                    }
                    break;
                case -1256886556:
                case -396157087:
                    i16 = i16;
                    c20493 = c20493;
                    str11 = str11;
                    str9 = str9;
                    str8 = str8;
                    sArr2 = sArr2;
                    str10 = str10;
                    i18 = i18;
                    if (i17 - (39998 * s) < 0) {
                        iM6982 = C2105.m6981("ܽۧ") ^ i12;
                        i8 = ((iM6982 ^ i13) * 18483) ^ 1644648488;
                        i9 = 153865654;
                    } else {
                        iM6982 = (i13 - C0630.m2566("ۗۖ")) * (-117);
                        i8 = ((iM6982 ^ i12) * 20861) ^ 334513209;
                        i9 = 1171436028;
                    }
                    int i29 = iM6982 ^ i9;
                    str8 = str8;
                    sArr2 = sArr2;
                    i18 = i18;
                    str10 = str10;
                    str11 = str11;
                    c20493 = c20493;
                    i15 = i29;
                    str9 = str9;
                    i14 = i8;
                    i16 = i16;
                    c14853 = c14852;
                    break;
                case -1204971657:
                case -1195152091:
                    if (ServiceConnectionC3453.m10564() > 0) {
                        str2 = str11;
                        iM6981 = C0630.m2566("᩷ۘ") ^ i12;
                        i14 = ((iM6981 ^ i13) * 20281) ^ (-2033874275);
                        i7 = 901851983;
                        i15 = iM6981 ^ i7;
                        str11 = str2;
                    }
                    str2 = str11;
                    iM6981 = C0630.m2566("᩷ܳ") ^ i13;
                    i14 = ((iM6981 ^ i12) * 29739) ^ (-891261174);
                    i7 = -520454117;
                    i15 = iM6981 ^ i7;
                    str11 = str2;
                    break;
                case -1136692780:
                case -1007780034:
                    i19 = 19559;
                    iM6982 = C0630.m2566("ۘ֨") ^ i13;
                    i8 = ((iM6982 ^ i12) * 26595) ^ (-1739151806);
                    i9 = 1510708670;
                    int i210 = iM6982 ^ i9;
                    str8 = str8;
                    sArr2 = sArr2;
                    i18 = i18;
                    str10 = str10;
                    str11 = str11;
                    c20493 = c20493;
                    i15 = i210;
                    str9 = str9;
                    i14 = i8;
                    i16 = i16;
                    c14853 = c14852;
                    break;
                case -1116387729:
                case 818935205:
                    i16 = i16;
                    c20493 = c20493;
                    str11 = str11;
                    str9 = str9;
                    str8 = str8;
                    sArr2 = sArr2;
                    str10 = str10;
                    i18 = i18;
                    s = sArr[c];
                    i17 = (s * s) + 399960001;
                    if (RunnableC1108.f4040) {
                        iM6982 = C0630.m2566("֫᩷") ^ i12;
                        i8 = ((iM6982 ^ i13) * (-27573)) ^ (-1433789451);
                        i9 = 1568116325;
                    } else {
                        iM6982 = C2105.m6981("ۜ᩺") ^ i13;
                        i8 = ((iM6982 ^ i12) * (-19309)) ^ (-1953739390);
                        i9 = -1240411924;
                    }
                    int i211 = iM6982 ^ i9;
                    str8 = str8;
                    sArr2 = sArr2;
                    i18 = i18;
                    str10 = str10;
                    str11 = str11;
                    c20493 = c20493;
                    i15 = i211;
                    str9 = str9;
                    i14 = i8;
                    i16 = i16;
                    c14853 = c14852;
                    break;
                case -1078009048:
                case 1419410066:
                    str2 = str11;
                    if (!ViewOnClickListenerC1958.m6437(C1711.m5726(sArr3, i16, 5, i19), c20493.f66061)) {
                        it = it2;
                        str7 = str2;
                        int iM25612 = (i13 - C0630.m2566("ۤۜ")) * (-47);
                        i16 = i16;
                        i15 = iM25612 ^ 791340227;
                        str11 = str7;
                        it2 = it;
                        i14 = ((iM25612 ^ i12) * (-26023)) ^ 1568841876;
                        i16 = i16;
                    } else {
                        iM6981 = C2105.m6981("ܰۨ") ^ i13;
                        i14 = ((iM6981 ^ i12) * (-6263)) ^ 1474981498;
                        i7 = -118173314;
                        i15 = iM6981 ^ i7;
                        str11 = str2;
                    }
                    break;
                case -1036205519:
                case 1808189563:
                    i19 = 11387;
                    iM6982 = C0630.m2566("ۘ֨") ^ i13;
                    i8 = ((iM6982 ^ i12) * 26595) ^ (-1739151806);
                    i9 = 1510708670;
                    int i212 = iM6982 ^ i9;
                    str8 = str8;
                    sArr2 = sArr2;
                    i18 = i18;
                    str10 = str10;
                    str11 = str11;
                    c20493 = c20493;
                    i15 = i212;
                    str9 = str9;
                    i14 = i8;
                    i16 = i16;
                    c14853 = c14852;
                    break;
                case -1031617018:
                case 339616360:
                    str2 = str11;
                    int i30 = c20490M10823.f66056;
                    String strM216310 = C8163.m21637(i30, c20490M10823.f66059, strM21638);
                    if (C0237.f1507 == 0) {
                        Integer numM9932 = C3245.m9931(i30 - 1);
                        if (C0714.f2697 < 0) {
                            return new C17675(strM216310, C2126.m7036(f2789, 93, 11, i19), false, null, numM9932);
                        }
                        iM6981 = C0630.m2566("᩷ܳ") ^ i13;
                        i14 = ((iM6981 ^ i12) * 29739) ^ (-891261174);
                        i7 = -520454117;
                        i15 = iM6981 ^ i7;
                        str11 = str2;
                    } else {
                        i10 = i16;
                        c20491 = c20493;
                        int iM6986 = (C2105.m6981("ۧۧ") ^ i13) * 57;
                        i14 = ((iM6986 ^ i12) * 8863) ^ 1362519395;
                        str11 = str2;
                        i16 = i10;
                        c20493 = c20491;
                        i15 = iM6986 ^ 644943663;
                        c14853 = c14852;
                    }
                    break;
                case -990894926:
                case -522217090:
                    i16 = i16;
                    str2 = str11;
                    c20493 = c20493;
                    str8 = str8;
                    c20492 = null;
                    if (C1294.m4369(C0050.m948(f2789, 57, 15, i19), str8)) {
                        iM2568 = C2105.m6981("᩷ᩴ") ^ i13;
                        i5 = ((iM2568 ^ i12) * (-5889)) ^ 158505834;
                        i6 = 530886559;
                    } else {
                        iM2568 = (i13 - C0630.m2566("ۨۨ")) * (-75);
                        i5 = ((iM2568 ^ i12) * 20677) ^ 1276209752;
                        i6 = -978637513;
                    }
                    int i213 = iM2568 ^ i6;
                    str8 = str8;
                    i14 = i5;
                    str11 = str2;
                    c20493 = c20493;
                    i15 = i213;
                    i16 = i16;
                    break;
                case -874972602:
                case 563450233:
                    C0382.m1848();
                    RunnableC0588.m2441();
                    return null;
                case -874253062:
                case 61064346:
                    if (C1005.f3721) {
                        i10 = i16;
                        c20491 = c20493;
                        str2 = str11;
                        int iM6987 = (C2105.m6981("ۧۧ") ^ i13) * 57;
                        i14 = ((iM6987 ^ i12) * 8863) ^ 1362519395;
                        str11 = str2;
                        i16 = i10;
                        c20493 = c20491;
                        i15 = iM6987 ^ 644943663;
                        c14853 = c14852;
                    } else {
                        int iM25613 = C0630.m2566("۬᩸") ^ i13;
                        i14 = ((iM25613 ^ i12) * 7689) ^ (-548245598);
                        i15 = iM25613 ^ 864661039;
                    }
                    break;
                case -844871428:
                case -777026502:
                    i10 = i16;
                    c20491 = c20493;
                    str2 = str11;
                    String str20 = c17884.f54616;
                    String str21 = c17884.f54612;
                    str10 = c17884.f54611;
                    sArr2 = f2789;
                    i18 = 1;
                    if (C4263.f13799 <= 0) {
                        str8 = str20;
                        str9 = str21;
                        int iM6988 = (C2105.m6981("ۧۧ") ^ i13) * 57;
                        i14 = ((iM6988 ^ i12) * 8863) ^ 1362519395;
                        str11 = str2;
                        i16 = i10;
                        c20493 = c20491;
                        i15 = iM6988 ^ 644943663;
                        c14853 = c14852;
                    } else {
                        int iM25614 = C0630.m2566("ۧܽ") ^ i13;
                        i14 = ((iM25614 ^ i12) * 15369) ^ 438093168;
                        str8 = str20;
                        str9 = str21;
                        str11 = str2;
                        i16 = i10;
                        c20493 = c20491;
                        c14853 = c14852;
                        i15 = iM25614 ^ (-1127492415);
                    }
                    break;
                case -749657261:
                case 1045375607:
                    ?? r2 = c20492;
                    throw C3059.m9364(C3911.m11919(f2789, 72, 21, i19), (String) r2, (JSONValue) r2, (JSONArray) r2, (JSONObject) r2);
                case -741955683:
                case -423058568:
                    i16 = i16;
                    c20490 = c20493;
                    str3 = str11;
                    str4 = str9;
                    str5 = str8;
                    str6 = str10;
                    if (ViewOnClickListenerC1958.m6437(C4117.m12355(f2789, 15, 15, i19), str5)) {
                        iM2566 = (C2105.m6981("۟ۖ") + i12) * (-83);
                        i = ((iM2566 ^ i13) * 5553) ^ 120568214;
                        i2 = 619539946;
                    } else {
                        iM2566 = (C0630.m2566("ᩴ᩻") + i13) * 89;
                        i = ((iM2566 ^ i12) * 13115) ^ 540886185;
                        i2 = 295693248;
                    }
                    int i31 = iM2566 ^ i2;
                    str8 = str5;
                    i14 = i;
                    str10 = str6;
                    str11 = str3;
                    c20493 = c20490;
                    str9 = str4;
                    i15 = i31;
                    i16 = i16;
                    break;
                case -641643748:
                case 16178058:
                    str2 = str11;
                    c20493 = (C20490) C2272.m7513(it2);
                    sArr3 = f2789;
                    i16 = IShizukuService.Stub.TRANSACTION_isHidden;
                    if (C3911.f12484 >= 0) {
                        iM6981 = C0630.m2566("᩷ۘ") ^ i12;
                        i14 = ((iM6981 ^ i13) * 20281) ^ (-2033874275);
                        i7 = 901851983;
                    } else {
                        iM6981 = (i13 - C0630.m2566("ۘ᩺")) * 101;
                        i14 = ((iM6981 ^ i12) * (-22123)) ^ 1231658432;
                        i7 = 1128176040;
                    }
                    i15 = iM6981 ^ i7;
                    str11 = str2;
                    break;
                case -365589829:
                case 1409097610:
                    i16 = i16;
                    c20493 = c20493;
                    str11 = str11;
                    str9 = str9;
                    str8 = str8;
                    sArr2 = sArr2;
                    str10 = str10;
                    i18 = i18;
                    sArr = f2789;
                    c = 0;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6982 = C0630.m2566("ᩴܺ") ^ i12;
                        i8 = ((iM6982 ^ i13) * 6701) ^ (-1930803630);
                        i9 = -1229675276;
                    } else {
                        iM6982 = C0630.m2566("᩻ۙ") ^ i13;
                        i8 = ((iM6982 ^ i12) * (-29181)) ^ 927868300;
                        i9 = 919778693;
                    }
                    int i214 = iM6982 ^ i9;
                    str8 = str8;
                    sArr2 = sArr2;
                    i18 = i18;
                    str10 = str10;
                    str11 = str11;
                    c20493 = c20493;
                    i15 = i214;
                    str9 = str9;
                    i14 = i8;
                    i16 = i16;
                    c14853 = c14852;
                    break;
                case -143549705:
                case -128988956:
                    return c15799.m37418(c14853, str, str9);
                case -98970380:
                case -12100105:
                    if (ServiceConnectionC3453.f10921 < 0) {
                        i16 = i16;
                        c20493 = c20493;
                        str11 = str11;
                        str9 = str9;
                        str8 = str8;
                        sArr2 = sArr2;
                        str10 = str10;
                        i18 = i18;
                        iM6982 = C2105.m6981("ۜ᩺") ^ i13;
                        i8 = ((iM6982 ^ i12) * (-19309)) ^ (-1953739390);
                        i9 = -1240411924;
                        int i215 = iM6982 ^ i9;
                        str8 = str8;
                        sArr2 = sArr2;
                        i18 = i18;
                        str10 = str10;
                        str11 = str11;
                        c20493 = c20493;
                        i15 = i215;
                        str9 = str9;
                        i14 = i8;
                        i16 = i16;
                        c14853 = c14852;
                    }
                    i16 = i16;
                    c20493 = c20493;
                    str11 = str11;
                    str9 = str9;
                    str8 = str8;
                    sArr2 = sArr2;
                    str10 = str10;
                    i18 = i18;
                    iM6982 = (C2105.m6981("ۛ᩵") ^ i12) * (-117);
                    i8 = ((iM6982 ^ i13) * (-7767)) ^ 54338589;
                    i9 = -162521792;
                    int i216 = iM6982 ^ i9;
                    str8 = str8;
                    sArr2 = sArr2;
                    i18 = i18;
                    str10 = str10;
                    str11 = str11;
                    c20493 = c20493;
                    i15 = i216;
                    str9 = str9;
                    i14 = i8;
                    i16 = i16;
                    c14853 = c14852;
                    break;
                case 148992351:
                case 1942836831:
                    str2 = str11;
                    if (C0483.m2123(it2)) {
                        iM6981 = C0630.m2566("ۢܽ") ^ i12;
                        i14 = ((iM6981 ^ i13) * 26785) ^ (-730887983);
                        i7 = -1243456455;
                    } else {
                        c20494 = c20492;
                        iM6981 = (i13 - C0630.m2566("᩶ܽ")) * 69;
                        i14 = ((iM6981 ^ i12) * (-6519)) ^ (-1752810734);
                        i7 = -53331524;
                    }
                    i15 = iM6981 ^ i7;
                    str11 = str2;
                    break;
                case 278717820:
                case 1765889800:
                    throw C18081.m42154(c14853.f45300, str, str10);
                case 743632482:
                case 1035270054:
                    if (C0483.f2088 < 0) {
                        str2 = str11;
                        iM6981 = C0630.m2566("᩷ܳ") ^ i13;
                        i14 = ((iM6981 ^ i12) * 29739) ^ (-891261174);
                        i7 = -520454117;
                        i15 = iM6981 ^ i7;
                        str11 = str2;
                    } else {
                        i16 = i16;
                        c20493 = c20493;
                        str11 = str11;
                        str9 = str9;
                        str8 = str8;
                        sArr2 = sArr2;
                        str10 = str10;
                        i18 = i18;
                        iM6982 = (C2105.m6981("ۛ᩵") ^ i12) * (-117);
                        i8 = ((iM6982 ^ i13) * (-7767)) ^ 54338589;
                        i9 = -162521792;
                        int i217 = iM6982 ^ i9;
                        str8 = str8;
                        sArr2 = sArr2;
                        i18 = i18;
                        str10 = str10;
                        str11 = str11;
                        c20493 = c20493;
                        i15 = i217;
                        str9 = str9;
                        i14 = i8;
                        i16 = i16;
                        c14853 = c14852;
                    }
                    break;
                case 895120888:
                case 1861371577:
                    str2 = str11;
                    String strM216311 = C8163.m21638(c15799.m37407(c14853, str, str10, c15923));
                    short[] sArr5 = f2789;
                    if (!C3663.f11553) {
                        return new C17675(strM216311, C1294.m4373(sArr5, 46, 11, i19), false, null, null);
                    }
                    iM2568 = (C2105.m6981("۟֫") ^ i12) * 5;
                    i5 = ((iM2568 ^ i13) * (-17987)) ^ 537405891;
                    i6 = 1937724256;
                    int i218 = iM2568 ^ i6;
                    str8 = str8;
                    i14 = i5;
                    str11 = str2;
                    c20493 = c20493;
                    i15 = i218;
                    i16 = i16;
                    break;
                case 1326680030:
                case 1582877437:
                    str2 = str11;
                    if (c20494 != null) {
                        iM6981 = C0630.m2566("ܽ֨") ^ i12;
                        i14 = ((iM6981 ^ i13) * 1585) ^ 767583774;
                        i7 = 529867311;
                    } else {
                        iM6981 = (i12 - C2105.m6981("ۚ᩶")) * (-11);
                        i14 = ((iM6981 ^ i13) * 14185) ^ 543283944;
                        i7 = -1404999350;
                    }
                    i15 = iM6981 ^ i7;
                    str11 = str2;
                    break;
                case 1359987065:
                case 1801286611:
                    C3911.m11924();
                    C3245.m9925();
                    i16 = i16;
                    c20493 = c20493;
                    str11 = str11;
                    str9 = str9;
                    str8 = str8;
                    sArr2 = sArr2;
                    str10 = str10;
                    i18 = i18;
                    iM6982 = (C2105.m6981("ۛ᩵") ^ i12) * (-117);
                    i8 = ((iM6982 ^ i13) * (-7767)) ^ 54338589;
                    i9 = -162521792;
                    int i219 = iM6982 ^ i9;
                    str8 = str8;
                    sArr2 = sArr2;
                    i18 = i18;
                    str10 = str10;
                    str11 = str11;
                    c20493 = c20493;
                    i15 = i219;
                    str9 = str9;
                    i14 = i8;
                    i16 = i16;
                    c14853 = c14852;
                    break;
                case 1934687378:
                case 1953298444:
                    if (!ViewOnClickListenerC1958.m6437(str11, c20493.f66062)) {
                        it = it2;
                        str7 = str11;
                        int iM25615 = (i13 - C0630.m2566("ۤۜ")) * (-47);
                        i16 = i16;
                        i15 = iM25615 ^ 791340227;
                        str11 = str7;
                        it2 = it;
                        i14 = ((iM25615 ^ i12) * (-26023)) ^ 1568841876;
                        i16 = i16;
                    } else {
                        c20494 = c20493;
                        str2 = str11;
                        iM6981 = (i13 - C0630.m2566("᩶ܽ")) * 69;
                        i14 = ((iM6981 ^ i12) * (-6519)) ^ (-1752810734);
                        i7 = -53331524;
                        i15 = iM6981 ^ i7;
                        str11 = str2;
                    }
                    break;
                default:
                    i16 = i16;
                    c20490 = c20493;
                    str3 = str11;
                    str4 = str9;
                    str5 = str8;
                    str6 = str10;
                    if (C1294.m4369(C2520.m8030(f2789, 11, 4, i19), str5)) {
                        iM2566 = C0630.m2566("ܶ᩷") ^ i12;
                        i = ((iM2566 ^ i13) * (-22529)) ^ 305319056;
                        i2 = 1113930718;
                    } else {
                        iM2566 = (i13 - C0630.m2566("ۤܽ")) * (-15);
                        i = ((iM2566 ^ i12) * 17759) ^ (-497737768);
                        i2 = 44274774;
                    }
                    int i32 = iM2566 ^ i2;
                    str8 = str5;
                    i14 = i;
                    str10 = str6;
                    str11 = str3;
                    c20493 = c20490;
                    str9 = str4;
                    i15 = i32;
                    i16 = i16;
                    break;
            }
        }
    }
}
