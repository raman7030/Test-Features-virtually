package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
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
public final class C14702 {
    /* JADX WARN: Code duplicated, block: B:195:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x019f  */
    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m33626(C23506 c23506, C9338 c9338, C20068 c20068, C5315 c5315) throws C5276 {
        C6211 c6211M40093;
        String str;
        long j;
        C14533 c14533M33188;
        int iMin;
        int i;
        long j2;
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        C2857 c2857M40092;
        String str2;
        boolean z;
        C14533 c14533M33189;
        JSONValue jSONValueValue;
        JSONValue jSONValueValue2;
        JSONValue jSONValueValue3;
        String str3 = c9338.f25443;
        long j3 = c9338.f25447;
        C13362 c13362M30503 = C13362.m30503(str3);
        String strM46511 = C20569.m46511(c13362M30503, c20068);
        boolean z2 = c20068.f60977;
        long j4 = c20068.f60974;
        String str4 = c20068.f60980;
        boolean zEquals = "virtual".equals(str4);
        if (zEquals && "thumb".equals(strM46511)) {
            j4 &= -2;
        }
        String str5 = c9338.f25443;
        boolean z3 = c20068.f60977;
        C6211 c6211M11493 = c5315.m11493(str5, j4, zEquals, z3);
        if (c6211M11493 != null) {
            c6211M40093 = c6211M11493;
        } else {
            try {
                c23506.getClass();
                c6211M40093 = C17609.m40093(str5, j4, zEquals, z3);
            } catch (RuntimeException unused) {
                throw C5276.m11410("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
            }
        }
        long j5 = c6211M40093.f15633;
        long j6 = j4;
        long j7 = c6211M40093.f15642;
        long j8 = c6211M40093.f15637;
        C13863.m31570(c6211M40093);
        if (!c6211M40093.f15635) {
            throw C5276.m11405("NATIVE_ADDRESS_NOT_MAPPED", "Native address is not mapped in the ELF file.");
        }
        if (!c6211M40093.f15639) {
            throw C5276.m11405("NATIVE_ADDRESS_NOT_EXECUTABLE", "Native address is not executable. Use mt_apk_native_map_address to inspect mapping.isLoaded and mapping.isExecutable.");
        }
        long j9 = c6211M40093.f15632;
        long j10 = !zEquals ? j8 : j6;
        if (z2) {
            C13863.m31566(c6211M40093);
            C4870 c4870 = c6211M40093.f15631;
            boolean z4 = c4870.f11098;
            str = strM46511;
            j = j8;
            long j11 = c4870.f11097;
            if (z4) {
                long jM33625 = m33625(j11, c4870.f11101);
                long jM33626 = m33625(j11, c4870.f11099);
                if (jM33625 != j10 || j10 >= jM33626) {
                    throw C13863.m31554();
                }
                c14533M33188 = C14533.m33188(c4870, jM33626, false);
            } else {
                c14533M33188 = C14533.m33189(true);
            }
        } else {
            str = strM46511;
            j = j8;
            c14533M33188 = C14533.m33189(false);
        }
        long j12 = c14533M33188.f41467;
        boolean z5 = c14533M33188.f41461;
        if (j9 < 0 || j7 < 0 || j5 < 0 || j7 > j5 || j9 > j3 || j < 0 || j10 < 0) {
            throw C13863.m31571();
        }
        long j13 = j10;
        c5315.m11494(str3, c6211M40093, z2);
        long jMin = Math.min(j5 - j7, j3 - j9);
        if (jMin <= 0) {
            if (z5) {
                throw C13863.m31554();
            }
            String strM30505 = c13362M30503.m30505();
            int i2 = c13362M30503.f37507;
            String str6 = str;
            String strM30506 = c13362M30503.m30506(str6);
            String strM30507 = c13362M30503.m30507(str6);
            List list = Collections.EMPTY_LIST;
            JSONValue jSONValue = JSON.NULL;
            return C13863.m31546(c20068, str6, j13, c6211M40093, strM30505, i2, strM30506, strM30507, 0, 0, false, list, c14533M33188, false, jSONValue, jSONValue, jSONValue);
        }
        C6211 c6211 = c6211M40093;
        String str7 = str;
        C14533 c14533 = c14533M33188;
        if (z5) {
            long j14 = j12 - j13;
            if (j14 <= 0) {
                throw C13863.m31554();
            }
            jMin = Math.min(jMin, j14);
        }
        int iMin2 = (int) Math.min(c20068.f60975, jMin);
        if (z5 && iMin2 == 0) {
            throw C13863.m31554();
        }
        String strM30508 = c13362M30503.m30505();
        int iM30504 = c13362M30503.m30504(str7);
        if (!"x86".equals(strM30508)) {
            if ("arm".equals(strM30508) && iM30504 == 16) {
                i = 2;
            } else {
                iMin = iMin2;
            }
            j2 = C14849.FOREVER_NS - j13;
            if (j2 >= iMin) {
                throw C13863.m31571();
            }
            bArr = new byte[iMin];
            try {
                randomAccessFile = new RandomAccessFile(new File(str3), "r");
                try {
                    randomAccessFile.seek(j9);
                    randomAccessFile.readFully(bArr);
                    randomAccessFile.close();
                    int i3 = c20068.f60983;
                    try {
                        c23506.getClass();
                        c2857M40092 = C17609.m40092(strM30508, iM30504, j13, bArr, i3);
                        str2 = strM30508;
                        if (str2.equals(c2857M40092.f4933) || iM30504 != c2857M40092.f4934) {
                            throw C13863.m31554();
                        }
                        int i4 = c2857M40092.f4935;
                        if (i4 < 0 || i4 > iMin) {
                            throw C13863.m31554();
                        }
                        boolean z6 = c2857M40092.f4937;
                        if (z6 && i4 >= iMin) {
                            throw C13863.m31554();
                        }
                        int i5 = c20068.f60983;
                        List list2 = c2857M40092.f4936;
                        if (list2.size() > i5) {
                            throw C13863.m31554();
                        }
                        ArrayList arrayList = new ArrayList(list2.size());
                        Iterator it = list2.iterator();
                        int i6 = 0;
                        while (it.hasNext()) {
                            Iterator it2 = it;
                            C20964 c20964 = (C20964) it.next();
                            String str8 = str2;
                            int i7 = c20964.f65860;
                            if (i7 <= 0 || i6 > i4 - i7) {
                                throw C13863.m31554();
                            }
                            long j15 = jMin;
                            long j16 = i6;
                            if (j16 < 0 || j10 < 0 || j2 < j16) {
                                throw C13863.m31571();
                            }
                            long j17 = j13 + j16;
                            if (i6 < 0 || i7 < 0 || i6 > iMin - i7) {
                                throw C13863.m31554();
                            }
                            char[] cArr = new char[i7 * 2];
                            int i8 = 0;
                            while (i8 < i7) {
                                byte b = bArr[i6 + i8];
                                int i9 = i8 * 2;
                                char[] cArr2 = C16111.f47404;
                                cArr[i9] = cArr2[(b & 255) >>> 4];
                                cArr[i9 + 1] = cArr2[b & 15];
                                i8++;
                                bArr = bArr;
                            }
                            byte[] bArr2 = bArr;
                            String str9 = new String(cArr);
                            String str10 = c20964.f65861;
                            arrayList.add(new C21240(str9, i7, j17, str10 == null ? "" : str10.replace('\r', ' ').replace('\n', ' ')));
                            i6 += c20964.f65860;
                            it = it2;
                            jMin = j15;
                            bArr = bArr2;
                            iMin = iMin;
                            str2 = str8;
                        }
                        long j18 = jMin;
                        String str11 = str2;
                        if (i6 != i4) {
                            throw C13863.m31554();
                        }
                        ArrayList arrayList2 = new ArrayList();
                        boolean z7 = z6 && i4 < iMin2;
                        Iterator it3 = arrayList.iterator();
                        int i10 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                C21240 c21240 = (C21240) it3.next();
                                if (i10 < iMin2) {
                                    if (c21240.f66774 > iMin2 - i10) {
                                        z = true;
                                        break;
                                    }
                                    arrayList2.add(c21240);
                                    i10 += c21240.f66774;
                                }
                            }
                            z = z7;
                            break;
                        }
                        if (z5) {
                            c14533M33189 = C14533.m33188(C4870.m10333(c14533.f41466, c14533.f41463, "", c14533.f41468, -1L, c14533.f41464, c14533.f41462), j12, m33625(j13, (long) i10) == j12);
                        } else {
                            c14533M33189 = c14533;
                        }
                        boolean z8 = !z && i10 > 0 && ((long) i10) < j18;
                        JSONValue jSONValue2 = JSON.NULL;
                        if (z8) {
                            long j19 = zEquals ? j13 : j9;
                            long j20 = i10;
                            if (j20 < 0 || j19 < 0 || C14849.FOREVER_NS - j19 < j20) {
                                throw C13863.m31571();
                            }
                            jSONValueValue = JSON.value(str4);
                            jSONValueValue2 = JSON.value(C6656.m15140(j19 + j20));
                            jSONValueValue3 = JSON.value(str7);
                        } else {
                            jSONValueValue = jSONValue2;
                            jSONValueValue2 = jSONValueValue;
                            jSONValueValue3 = jSONValueValue2;
                        }
                        return C13863.m31546(c20068, str7, j13, c6211, str11, c13362M30503.f37507, c13362M30503.m30506(str7), c13362M30503.m30507(str7), iMin2, i10, z, arrayList2, c14533M33189, z8, jSONValueValue, jSONValueValue2, jSONValueValue3);
                    } catch (RuntimeException unused2) {
                        throw C5276.m11410("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
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
                throw C5276.m11410("ENTRY_READ_FAILED", "Failed to read native byte window.");
            }
        }
        i = 14;
        iMin = (int) Math.min(jMin, ((long) iMin2) + ((long) i));
        j2 = C14849.FOREVER_NS - j13;
        if (j2 >= iMin) {
            throw C13863.m31571();
        }
        bArr = new byte[iMin];
        randomAccessFile = new RandomAccessFile(new File(str3), "r");
        randomAccessFile.seek(j9);
        randomAccessFile.readFully(bArr);
        randomAccessFile.close();
        int i11 = c20068.f60983;
        c23506.getClass();
        c2857M40092 = C17609.m40092(strM30508, iM30504, j13, bArr, i11);
        str2 = strM30508;
        if (str2.equals(c2857M40092.f4933)) {
        }
        throw C13863.m31554();
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m33625(long j, long j2) throws C5276 {
        if (j2 < 0 || j < 0 || C14849.FOREVER_NS - j < j2) {
            throw C13863.m31554();
        }
        return j + j2;
    }
}
