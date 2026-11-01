package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤ֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W77C */
/* JADX INFO: loaded from: classes3.dex */
public final class C11852 {

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f33050 = m27161("1F2003D5");

    /* JADX INFO: renamed from: ۧ */
    public static final byte[] f33051 = m27161("00F020E3");

    /* JADX INFO: renamed from: ܽ */
    public static final byte[] f33052 = m27161("00BF");

    /* JADX INFO: renamed from: ᩳ */
    public static final byte[] f33053 = m27161("90");

    /* JADX WARN: Code duplicated, block: B:110:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:96:0x017b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0183 A[LOOP:0: B:97:0x0180->B:99:0x0183, LOOP_END] */
    /* JADX INFO: renamed from: ֫ */
    public static C6487 m27160(C16484 c16484, C17384 c17384, C23506 c23506, C9338 c9338, C10009 c10009) throws C5276 {
        C13362 c13362;
        String str;
        String str2;
        int i;
        String str3;
        byte[] bArr;
        byte[] bArrCopyOf;
        int length;
        String str4 = c9338.f25443;
        C13362 c13362M30503 = C13362.m30503(str4);
        String strM46510 = C20569.m46510(c13362M30503, c10009);
        String str5 = c10009.f27698;
        long j = c10009.f27695;
        byte[] bArr2 = c10009.f27700;
        boolean zEquals = "virtual".equals(c10009.f27702);
        if (zEquals && "thumb".equals(strM46510)) {
            j &= -2;
        }
        try {
            c23506.getClass();
            C6211 c6211M40093 = C17609.m40093(str4, j, zEquals, false);
            C13863.m31570(c6211M40093);
            if (!c6211M40093.f15635) {
                throw C5276.m11405("NATIVE_ADDRESS_NOT_MAPPED", "Native address is not mapped in the ELF file.");
            }
            if (!c6211M40093.f15639) {
                throw C5276.m11405("NATIVE_ADDRESS_NOT_EXECUTABLE", "Native address is not executable. Use mt_apk_native_map_address to inspect mapping.isLoaded and mapping.isExecutable.");
            }
            if (!zEquals) {
                j = c6211M40093.f15637;
            }
            long j2 = j;
            long j3 = c6211M40093.f15632;
            long j4 = c9338.f25447;
            int length2 = bArr2.length;
            if (j3 >= 0) {
                long j5 = c6211M40093.f15642;
                if (j5 >= 0) {
                    long j6 = c6211M40093.f15633;
                    if (j6 >= 0 && j5 <= j6 && j3 <= j4) {
                        long j7 = length2;
                        if (C14849.FOREVER_NS - j5 >= j7 && j5 + j7 <= j6 && C14849.FOREVER_NS - j3 >= j7 && j7 + j3 <= j4) {
                            if (j2 < 0 || j3 > 2147483647L) {
                                throw C13863.m31571();
                            }
                            String str6 = c10009.f27699;
                            if ("arm".equals(c13362M30503.m30505())) {
                                if (c13362.f37508 == 40) {
                                    str2 = "thumb";
                                    if (str2.equals(str)) {
                                        c13362 = c13362M30503;
                                        str = strM46510;
                                        i = 2;
                                    }
                                } else {
                                    c13362 = c13362M30503;
                                    str = strM46510;
                                    str2 = "thumb";
                                }
                                c13362 = c13362M30503;
                                str = strM46510;
                                i = 4;
                            } else {
                                str = strM46510;
                                c13362 = c13362M30503;
                                str2 = "thumb";
                                i = 1;
                            }
                            if (((((long) i) - 1) & j2) != 0) {
                                throw C5276.m11406("address must map to an aligned instruction address", "address", JSON.value(str6), JSON.array(i + "-byte aligned effective virtual address"), (JSONObject) null);
                            }
                            byte[] bArr3 = new byte[bArr2.length];
                            try {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str4), "r");
                                try {
                                    randomAccessFile.seek(j3);
                                    randomAccessFile.readFully(bArr3);
                                    randomAccessFile.close();
                                    if (!Arrays.equals(bArr3, bArr2)) {
                                        throw m27159(c10009, j3, C6656.m15143(bArr3));
                                    }
                                    String strM30505 = c13362.m30505();
                                    int iM30504 = c13362.m30504(str);
                                    String str7 = c10009.f27697;
                                    String str8 = c9338.f25443;
                                    try {
                                        c23506.getClass();
                                        C20293 c20293M40098 = C17609.m40098(strM30505, iM30504, j2, str7);
                                        try {
                                            byte[] bArrM45827 = c20293M40098.m45827();
                                            if (!strM30505.equals(c20293M40098.f62694) || iM30504 != c20293M40098.f62695 || j2 != c20293M40098.f62693 || bArrM45827.length == 0 || c20293M40098.f62696 != bArrM45827.length) {
                                                throw C13863.m31554();
                                            }
                                            if (bArrM45827.length > 256) {
                                                throw C5276.m11407("NATIVE_PATCH_TOO_LARGE", "Native instruction patch window is too large.", "warning", JSON.array(), JSON.object().add("expectedBytes", bArr2.length).add("assembledBytes", bArrM45827.length).add("paddingMode", str5));
                                            }
                                            int length3 = bArr2.length;
                                            if (bArrM45827.length > length3) {
                                                throw m27157(length3, bArrM45827.length, str5);
                                            }
                                            if ("none".equals(str5)) {
                                                if (bArrM45827.length != length3) {
                                                    throw m27157(length3, bArrM45827.length, str5);
                                                }
                                                bArrCopyOf = (byte[]) bArrM45827.clone();
                                            } else {
                                                int length4 = length3 - bArrM45827.length;
                                                String strM30506 = c13362.m30505();
                                                if ("arm".equals(strM30506)) {
                                                    str3 = "warning";
                                                    if (c13362.f37507 == 64) {
                                                        bArr = f33050;
                                                    }
                                                    if (length4 % bArr.length == 0) {
                                                        throw C5276.m11407("NATIVE_PATCH_NOP_UNAVAILABLE", "Remaining patch window cannot be filled with NOP instructions.", str3, JSON.array(), JSON.object().add("remainingBytes", length4).add("instructionSet", c13362.m30506(str)).add("instructionWidth", c13362.m30507(str)));
                                                    }
                                                    bArrCopyOf = Arrays.copyOf(bArrM45827, length3);
                                                    for (length = bArrM45827.length; length < bArrCopyOf.length; length += bArr.length) {
                                                        System.arraycopy(bArr, 0, bArrCopyOf, length, bArr.length);
                                                    }
                                                } else {
                                                    str3 = "warning";
                                                }
                                                if ("arm".equals(strM30506) && str2.equals(str)) {
                                                    bArr = f33052;
                                                } else if ("arm".equals(strM30506)) {
                                                    bArr = f33051;
                                                } else {
                                                    bArr = f33053;
                                                }
                                                if (length4 % bArr.length == 0) {
                                                    throw C5276.m11407("NATIVE_PATCH_NOP_UNAVAILABLE", "Remaining patch window cannot be filled with NOP instructions.", str3, JSON.array(), JSON.object().add("remainingBytes", length4).add("instructionSet", c13362.m30506(str)).add("instructionWidth", c13362.m30507(str)));
                                                }
                                                bArrCopyOf = Arrays.copyOf(bArrM45827, length3);
                                                while (length < bArrCopyOf.length) {
                                                    System.arraycopy(bArr, 0, bArrCopyOf, length, bArr.length);
                                                }
                                            }
                                            byte[] bArr4 = bArrCopyOf;
                                            ArrayList arrayList = new ArrayList(1);
                                            arrayList.add(new C15813((int) j3, bArr2, bArr4));
                                            try {
                                                c17384.m39588(c16484, new C9779(c10009.f27701, c10009.f27704, c10009.f27703, arrayList));
                                                return new C6487(c10009, str, j2, c6211M40093, strM30505, c13362.f37507, c13362.m30506(str), c13362.m30507(str), j3, bArrM45827, bArr4);
                                            } catch (C5276 e) {
                                                if ("PATCH_EXPECTED_MISMATCH".equals(e.f12413)) {
                                                    throw m27159(c10009, j3, e.f12412.getString("actualHex", ""));
                                                }
                                                throw e;
                                            }
                                        } catch (RuntimeException unused) {
                                            throw C13863.m31554();
                                        }
                                    } catch (C24315 e2) {
                                        throw m27158(strM30505, iM30504, j2, str, e2, str8);
                                    } catch (RuntimeException e3) {
                                        throw m27158(strM30505, iM30504, j2, str, e3, str8);
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
                            } catch (IOException | RuntimeException unused2) {
                                throw C5276.m11410("ENTRY_READ_FAILED", "Failed to read native byte window.");
                            }
                        }
                    }
                }
            }
            throw C13863.m31571();
        } catch (RuntimeException unused3) {
            throw C5276.m11410("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m27159(C10009 c10009, long j, String str) {
        return C5276.m11407("PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedHex.", "warning", JSON.array(), JSON.object().add("workspaceId", c10009.f27701).add("editSessionId", c10009.f27704).add("locator", c10009.f27705).add("patchedFileOffset", C6656.m15140(j)).add("byteOffset", j).add("expectedHex", c10009.f27706).add("actualHex", str));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m27158(String str, int i, long j, String str2, RuntimeException runtimeException, String str3) {
        String message = runtimeException.getMessage();
        if (message == null) {
            message = runtimeException.getClass().getSimpleName();
        }
        String strReplace = message.replace(str3, "<path>");
        if (strReplace.length() > 512) {
            strReplace = strReplace.substring(0, 512);
        }
        return C5276.m11407("NATIVE_ASSEMBLY_FAILED", "Native instruction assembly failed.", "warning", JSON.array(), JSON.object().add("arch", str).add("bits", i).add("address", C6656.m15140(j)).add("instructionMode", str2).add("message", strReplace));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m27157(int i, int i2, String str) {
        return C5276.m11407("NATIVE_PATCH_LENGTH_MISMATCH", "Assembled bytes do not fit the expected patch window.", "warning", JSON.array(), JSON.object().add("expectedBytes", i).add("assembledBytes", i2).add("paddingMode", str));
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m27161(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Character.digit(str.charAt(i2 + 1), 16) | (Character.digit(str.charAt(i2), 16) << 4));
        }
        return bArr;
    }
}
