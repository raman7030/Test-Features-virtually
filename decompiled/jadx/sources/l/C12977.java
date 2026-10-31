package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۬۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S76D */
/* JADX INFO: loaded from: classes3.dex */
public final class C12977 {
    /* JADX WARN: Code duplicated, block: B:195:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x019f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m31541(C22241 c22241, C7333 c7333, C18623 c18623, C3100 c3100) throws C3059 {
        C4043 c4043M37906;
        String str;
        long j;
        C12800 c12800M31103;
        int iMin;
        int i;
        long j2;
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        C0514 c0514M37905;
        String str2;
        boolean z;
        C12800 c12800M31104;
        JSONValue jSONValueValue;
        JSONValue jSONValueValue2;
        JSONValue jSONValueValue3;
        String str3 = c7333.f22530;
        long j3 = c7333.f22534;
        C11567 c11567M28457 = C11567.m28457(str3);
        String strM44217 = C19151.m44217(c11567M28457, c18623);
        boolean z2 = c18623.f57754;
        long j4 = c18623.f57751;
        String str4 = c18623.f57757;
        boolean zEquals = "virtual".equals(str4);
        if (zEquals && "thumb".equals(strM44217)) {
            j4 &= -2;
        }
        String str5 = c7333.f22530;
        boolean z3 = c18623.f57754;
        C4043 c4043M9450 = c3100.m9450(str5, j4, zEquals, z3);
        if (c4043M9450 != null) {
            c4043M37906 = c4043M9450;
        } else {
            try {
                c22241.getClass();
                c4043M37906 = C16036.m37906(str5, j4, zEquals, z3);
            } catch (RuntimeException unused) {
                throw C3059.m9368("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
            }
        }
        long j5 = c4043M37906.f12818;
        long j6 = j4;
        long j7 = c4043M37906.f12827;
        long j8 = c4043M37906.f12822;
        C12095.m29507(c4043M37906);
        if (!c4043M37906.f12820) {
            throw C3059.m9363("NATIVE_ADDRESS_NOT_MAPPED", "Native address is not mapped in the ELF file.");
        }
        if (!c4043M37906.f12824) {
            throw C3059.m9363("NATIVE_ADDRESS_NOT_EXECUTABLE", "Native address is not executable. Use mt_apk_native_map_address to inspect mapping.isLoaded and mapping.isExecutable.");
        }
        long j9 = c4043M37906.f12817;
        long j10 = !zEquals ? j8 : j6;
        if (z2) {
            C12095.m29503(c4043M37906);
            C2632 c2632 = c4043M37906.f12816;
            boolean z4 = c2632.f8303;
            str = strM44217;
            j = j8;
            long j11 = c2632.f8302;
            if (z4) {
                long jM31540 = m31540(j11, c2632.f8306);
                long jM31541 = m31540(j11, c2632.f8304);
                if (jM31540 != j10 || j10 >= jM31541) {
                    throw C12095.m29491();
                }
                c12800M31103 = C12800.m31103(c2632, jM31541, false);
            } else {
                c12800M31103 = C12800.m31104(true);
            }
        } else {
            str = strM44217;
            j = j8;
            c12800M31103 = C12800.m31104(false);
        }
        long j12 = c12800M31103.f38425;
        boolean z5 = c12800M31103.f38419;
        if (j9 < 0 || j7 < 0 || j5 < 0 || j7 > j5 || j9 > j3 || j < 0 || j10 < 0) {
            throw C12095.m29508();
        }
        long j13 = j10;
        c3100.m9451(str3, c4043M37906, z2);
        long jMin = Math.min(j5 - j7, j3 - j9);
        if (jMin <= 0) {
            if (z5) {
                throw C12095.m29491();
            }
            String strM28459 = c11567M28457.m28459();
            int i2 = c11567M28457.f34508;
            String str6 = str;
            String strM28460 = c11567M28457.m28460(str6);
            String strM28461 = c11567M28457.m28461(str6);
            List list = Collections.EMPTY_LIST;
            JSONValue jSONValue = JSON.NULL;
            return C12095.m29483(c18623, str6, j13, c4043M37906, strM28459, i2, strM28460, strM28461, 0, 0, false, list, c12800M31103, false, jSONValue, jSONValue, jSONValue);
        }
        C4043 c4043 = c4043M37906;
        String str7 = str;
        C12800 c12800 = c12800M31103;
        if (z5) {
            long j14 = j12 - j13;
            if (j14 <= 0) {
                throw C12095.m29491();
            }
            jMin = Math.min(jMin, j14);
        }
        int iMin2 = (int) Math.min(c18623.f57752, jMin);
        if (z5 && iMin2 == 0) {
            throw C12095.m29491();
        }
        String strM284510 = c11567M28457.m28459();
        int iM28458 = c11567M28457.m28458(str7);
        if (!"x86".equals(strM284510)) {
            if ("arm".equals(strM284510) && iM28458 == 16) {
                i = 2;
            } else {
                iMin = iMin2;
            }
            j2 = C13132.FOREVER_NS - j13;
            if (j2 >= iMin) {
                throw C12095.m29508();
            }
            bArr = new byte[iMin];
            try {
                randomAccessFile = new RandomAccessFile(new File(str3), "r");
                try {
                    randomAccessFile.seek(j9);
                    randomAccessFile.readFully(bArr);
                    randomAccessFile.close();
                    int i3 = c18623.f57760;
                    try {
                        c22241.getClass();
                        c0514M37905 = C16036.m37905(strM284510, iM28458, j13, bArr, i3);
                        str2 = strM284510;
                        if (str2.equals(c0514M37905.f2160) || iM28458 != c0514M37905.f2161) {
                            throw C12095.m29491();
                        }
                        int i4 = c0514M37905.f2162;
                        if (i4 < 0 || i4 > iMin) {
                            throw C12095.m29491();
                        }
                        boolean z6 = c0514M37905.f2164;
                        if (z6 && i4 >= iMin) {
                            throw C12095.m29491();
                        }
                        int i5 = c18623.f57760;
                        List list2 = c0514M37905.f2163;
                        if (list2.size() > i5) {
                            throw C12095.m29491();
                        }
                        ArrayList arrayList = new ArrayList(list2.size());
                        Iterator it = list2.iterator();
                        int i6 = 0;
                        while (it.hasNext()) {
                            Iterator it2 = it;
                            C19566 c19566 = (C19566) it.next();
                            String str8 = str2;
                            int i7 = c19566.f63241;
                            if (i7 <= 0 || i6 > i4 - i7) {
                                throw C12095.m29491();
                            }
                            long j15 = jMin;
                            long j16 = i6;
                            if (j16 < 0 || j10 < 0 || j2 < j16) {
                                throw C12095.m29508();
                            }
                            long j17 = j13 + j16;
                            if (i6 < 0 || i7 < 0 || i6 > iMin - i7) {
                                throw C12095.m29491();
                            }
                            char[] cArr = new char[i7 * 2];
                            int i8 = 0;
                            while (i8 < i7) {
                                byte b = bArr[i6 + i8];
                                int i9 = i8 * 2;
                                char[] cArr2 = C14460.f44310;
                                cArr[i9] = cArr2[(b & 255) >>> 4];
                                cArr[i9 + 1] = cArr2[b & 15];
                                i8++;
                                bArr = bArr;
                            }
                            byte[] bArr2 = bArr;
                            String str9 = new String(cArr);
                            String str10 = c19566.f63242;
                            arrayList.add(new C19857(str9, i7, j17, str10 == null ? "" : str10.replace('\r', ' ').replace('\n', ' ')));
                            i6 += c19566.f63241;
                            it = it2;
                            jMin = j15;
                            bArr = bArr2;
                            iMin = iMin;
                            str2 = str8;
                        }
                        long j18 = jMin;
                        String str11 = str2;
                        if (i6 != i4) {
                            throw C12095.m29491();
                        }
                        ArrayList arrayList2 = new ArrayList();
                        boolean z7 = z6 && i4 < iMin2;
                        Iterator it3 = arrayList.iterator();
                        int i10 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                C19857 c19857 = (C19857) it3.next();
                                if (i10 < iMin2) {
                                    if (c19857.f64137 > iMin2 - i10) {
                                        z = true;
                                        break;
                                    }
                                    arrayList2.add(c19857);
                                    i10 += c19857.f64137;
                                }
                            }
                            z = z7;
                            break;
                        }
                        if (z5) {
                            c12800M31104 = C12800.m31103(C2632.m8289(c12800.f38424, c12800.f38421, "", c12800.f38426, -1L, c12800.f38422, c12800.f38420), j12, m31540(j13, (long) i10) == j12);
                        } else {
                            c12800M31104 = c12800;
                        }
                        boolean z8 = !z && i10 > 0 && ((long) i10) < j18;
                        JSONValue jSONValue2 = JSON.NULL;
                        if (z8) {
                            long j19 = zEquals ? j13 : j9;
                            long j20 = i10;
                            if (j20 < 0 || j19 < 0 || C13132.FOREVER_NS - j19 < j20) {
                                throw C12095.m29508();
                            }
                            jSONValueValue = JSON.value(str4);
                            jSONValueValue2 = JSON.value(C4511.m13257(j19 + j20));
                            jSONValueValue3 = JSON.value(str7);
                        } else {
                            jSONValueValue = jSONValue2;
                            jSONValueValue2 = jSONValueValue;
                            jSONValueValue3 = jSONValueValue2;
                        }
                        return C12095.m29483(c18623, str7, j13, c4043, str11, c11567M28457.f34508, c11567M28457.m28460(str7), c11567M28457.m28461(str7), iMin2, i10, z, arrayList2, c12800M31104, z8, jSONValueValue, jSONValueValue2, jSONValueValue3);
                    } catch (RuntimeException unused2) {
                        throw C3059.m9368("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
                    }
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException | RuntimeException unused3) {
                throw C3059.m9368("ENTRY_READ_FAILED", "Failed to read native byte window.");
            }
        }
        i = 14;
        iMin = (int) Math.min(jMin, ((long) iMin2) + ((long) i));
        j2 = C13132.FOREVER_NS - j13;
        if (j2 >= iMin) {
            throw C12095.m29508();
        }
        bArr = new byte[iMin];
        randomAccessFile = new RandomAccessFile(new File(str3), "r");
        randomAccessFile.seek(j9);
        randomAccessFile.readFully(bArr);
        randomAccessFile.close();
        int i11 = c18623.f57760;
        c22241.getClass();
        c0514M37905 = C16036.m37905(strM284510, iM28458, j13, bArr, i11);
        str2 = strM284510;
        if (str2.equals(c0514M37905.f2160)) {
        }
        throw C12095.m29491();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m31540(long j, long j2) throws C3059 {
        if (j2 < 0 || j < 0 || C13132.FOREVER_NS - j < j2) {
            throw C12095.m29491();
        }
        return j + j2;
    }
}
